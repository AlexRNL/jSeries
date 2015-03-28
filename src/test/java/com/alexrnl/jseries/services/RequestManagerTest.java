package com.alexrnl.jseries.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.alexrnl.commons.io.EditableInputStream;
import com.alexrnl.jseries.request.Request;
import com.alexrnl.jseries.request.Verb;
import com.alexrnl.jseries.services.Configuration.ConfigurationBuilder;

/**
 * Test suite for the {@link RequestManager} class.
 * @author Alex
 */
public class RequestManagerTest {
	/** The request manager to test */
	private RequestManager			requestManager;
	/** The mocked HTTP connection provider */
	@Mock
	private HttpConnectionProvider	httpConnectionProvider;
	/** The mocked URL connection */
	@Mock
	private HttpURLConnection		urlConnection;
	/** The response of the mocked connection */
	private EditableInputStream		response;
	
	/**
	 * Set up test attributes.
	 * @throws IOException
	 *         if there is an I/O error.
	 */
	@Before
	public void setUp () throws IOException {
		initMocks(this);
		requestManager = new RequestManager(new ConfigurationBuilder("key").setUserAgent("unit-test").create(), httpConnectionProvider);
		response = new EditableInputStream("OK", StandardCharsets.UTF_8);
		when(httpConnectionProvider.getHttpConnection(anyString())).thenReturn(urlConnection);
		when(urlConnection.getInputStream()).thenReturn(response);
		when(urlConnection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_OK);
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)} with a <code>null</code> request.
	 * @throws IOException
	 *         if the request could not be processed.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteNullRequest () throws IOException {
		requestManager.execute(null);
	}
	
	/**
	 * Test method for {@link RequestManager#execute(Request)}.
	 * @throws IOException
	 *         if the request could not be processed.
	 */
	@Test
	public void testExecuteGetRequestNoParameters () throws IOException {
		assertEquals("OK", requestManager.execute(new Request(Verb.GET, "/api/unit-test")));
		
		verify(httpConnectionProvider).getHttpConnection(eq("https://api.betaseries.com/api/unit-test?v=2.4"));
		verify(urlConnection).setDoOutput(false);
		verify(urlConnection).setDoInput(true);
		verify(urlConnection).setRequestMethod("GET");
		verify(urlConnection).addRequestProperty(eq("Accept-Charset"), eq("UTF-8"));
		verify(urlConnection).addRequestProperty(eq("User-Agent"), eq("unit-test"));
		verify(urlConnection).addRequestProperty(eq("Accept"), eq("application/json"));
		verify(urlConnection).addRequestProperty(eq("X-BetaSeries-Key"), eq("key"));
		verify(urlConnection, never()).addRequestProperty(eq("X-BetaSeries-Token"), anyString());
		verify(urlConnection, never()).addRequestProperty(eq("Content-Length"), anyString());
		verify(urlConnection, never()).getOutputStream();
	}
	
}

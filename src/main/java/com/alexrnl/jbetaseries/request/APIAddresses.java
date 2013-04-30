package com.alexrnl.jbetaseries.request;

/**
 * Class with the string constant defining the addresses of the API methods.<br />
 * @author Alex
 */
public final class APIAddresses {
	
	/**
	 * Constructor #1.<br />
	 * Default private constructor.
	 */
	private APIAddresses () {
		super();
	}
	
	// Main address of the API
	/** The host of the API */
	public static final String	HOST			= "api.betaseries.com";
	/** The HTTP prefix, for a standard use of the API */
	public static final String	HTTP			= "http://";
	/** The HTTPS prefix, for a secure usage of the API */
	public static final String	HTTPS			= "https://";
	
	// Methods of the API
	/** Address for archiving or unarchiving shows. */
	public static final String	SHOWS_ARCHIVE	= "/shows/archive";
	/** Address for displaying shows */
	public static final String	SHOWS_DISPLAY	= "/shows/display";
	/** Address for retrieving episodes of shows */
	public static final String	SHOWS_EPISODES	= "/shows/episodes";
}
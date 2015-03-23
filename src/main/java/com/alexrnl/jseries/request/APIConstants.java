package com.alexrnl.jseries.request;

/**
 * Class defining the constants used by the API.<br />
 * @author Alex
 */
public final class APIConstants {
	
	/** The name for the API key parameter */
	public static final String	KEY_PARAMETER						= "X-BetaSeries-Key";
	/** The name for the API token parameter */
	public static final String	TOKEN_PARAMETER						= "X-BetaSeries-Token";
	/** The separator for parameters which can hold several values */
	public static final String	PARAMETER_VALUES_SEPARATOR			= ",";
	/** The minimum note allowed by the API */
	public static final int		NOTE_MIN							= 1;
	/** The maximum note allowed by the API */
	public static final int		NOTE_MAX							= 5;
	/** The maximum number of events per page */
	public static final int		MAXIMUM_NUMBER_OF_EVENTS_PER_PAGE	= 100;
	
	/**
	 * Constructor #1.<br />
	 * Default private constructor.
	 */
	private APIConstants () {
		super();
		throw new InstantiationError("Instantiation of class " + APIConstants.class + " is forbidden");
	}
}

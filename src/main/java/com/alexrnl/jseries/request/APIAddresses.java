package com.alexrnl.jseries.request;


/**
 * Class with the string constant defining the addresses of the API methods.<br />
 * @author Alex
 */
public final class APIAddresses {
	
	// Main address of the API
	/** The host of the API */
	public static final String	HOST					= "api.betaseries.com";
	/** The HTTP prefix, for a standard use of the API */
	public static final String	HTTP					= "http://";
	/** The HTTPS prefix, for a secure usage of the API */
	public static final String	HTTPS					= "https://";
	
	// Methods of the API
	// Methods for episodes
	/** Address for displaying episode(s) information */
	public static final String	EPISODES_DISPLAY		= "/episodes/display";
	/** Address for marking an episode as downloaded */
	public static final String	EPISODES_DOWNLOADED		= "/episodes/downloaded";
	/** Address for requesting the list of episodes */
	public static final String	EPISODES_LIST			= "/episodes/list";
	/** Address for requesting the latest aired episodes */
	public static final String	EPISODES_LATEST			= "/episodes/latest";
	/** Address for requesting the next airing episodes */
	public static final String	EPISODES_NEXT			= "/episodes/next";
	/** Address for grading episodes */
	public static final String	EPISODES_GRADE			= "/episodes/note";
	/** Address for scraping a file to an episode */
	public static final String	EPISODES_SCRAPE			= "/episodes/scraper";
	/** Address for searching an episode */
	public static final String	EPISODES_SEARCH			= "/episodes/search";
	/** Adddress for marking episodes as seen */
	public static final String	EPISODES_WATCHED		= "/episodes/watched";
	// Methods for members
	/** Address for authenticating a member */
	public static final String	MEMBERS_AUTH			= "/members/auth";
	/** Address for getting the badges */
	public static final String	MEMBERS_BADGES			= "/members/badges";
	/** Address for destroying the active token */
	public static final String	MEMBERS_DESTROY			= "/members/destroy";
	/** Address for getting information on the members */
	public static final String	MEMBERS_INFOS			= "/members/infos";
	/** Address for checking the token validity */
	public static final String	MEMBERS_IS_ACTIVE		= "/members/is_active";
	/** Address for resetting the password of the member's account */
	public static final String	MEMBERS_LOST			= "/members/lost";
	/** Address for getting the notifications of the member */
	public static final String	MEMBERS_NOTIFICATIONS	= "/members/notifications";
	/** Address for OAuth authentication */
	public static final String	MEMBERS_OAUTH			= "/members/oauth";
	/** Address for changing options */
	public static final String	MEMBERS_OPTION			= "/members/option";
	/** Address for getting the options */
	public static final String	MEMBERS_OPTIONS			= "/members/options";
	/** Address for searching members */
	public static final String	MEMBERS_SEARCH			= "/members/search";
	/** Address for signing-up for a new account */
	public static final String	MEMBERS_SIGN_UP			= "/members/signup";
	/** Address for looking for friends in BetaSeries' API */
	public static final String	MEMBERS_SYNC			= "/members/sync";
	// Methods for messages
	/** Address for getting a conversation */
	public static final String	MESSAGES_DISCUSSION		= "/messages/discussion";
	/** Address for getting the inbox of the member */
	public static final String	MESSAGES_INBOX			= "/messages/inbox";
	/** Address for actions on specific messages */
	public static final String	MESSAGES_MESSAGE		= "/messages/message";
	/** Address for marking a message as read */
	public static final String	MESSAGES_READ			= "/messages/read";
	// Methods for shows
	/** Address for archiving or unarchiving shows */
	public static final String	SHOWS_ARCHIVE			= "/shows/archive";
	/** Address for getting the characters of the shows */
	public static final String	SHOWS_CHARACTERS		= "/shows/characters";
	/** Address for displaying shows */
	public static final String	SHOWS_DISPLAY			= "/shows/display";
	/** Address for retrieving episodes of shows */
	public static final String	SHOWS_EPISODES			= "/shows/episodes";
	/** Address for favorite or unfavorite */
	public static final String	SHOWS_FAVORITE			= "/shows/favorite";
	/** Address for retrieving favorites */
	public static final String	SHOWS_FAVORITES			= "/shows/favorites";
	/** Address for retrieving the shows */
	public static final String	SHOWS_LIST				= "/shows/list";
	/** Address for noting a show */
	public static final String	SHOWS_GRADE				= "/shows/note";
	/** Address for retrieving the shows' picture */
	public static final String	SHOWS_PICTURES			= "/shows/pictures";
	/** Address for getting a random show */
	public static final String	SHOWS_RANDOM			= "/shows/random";
	/** Address for recommending shows */
	public static final String	SHOWS_RECOMMENDATION	= "/shows/recommendation";
	/** Address for getting recommendations */
	public static final String	SHOWS_RECOMMENDATIONS	= "/shows/recommendations";
	/** Address for searching for shows */
	public static final String	SHOWS_SEARCH			= "/shows/search";
	/** Address for adding and removing the show */
	public static final String	SHOWS_SHOW				= "/shows/show";
	/** Address for getting similar shows */
	public static final String	SHOWS_SIMILARS			= "/shows/similars";
	/** Address for getting shows videos */
	public static final String	SHOWS_VIDEOS			= "/shows/videos";
	// Methods for timeline
	/** Address for getting the friend timeline */
	public static final String	TIMELINE_FRIENDS		= "/timeline/friends";
	/** Address for getting the home timeline */
	public static final String	TIMELINE_HOME			= "/timeline/home";
	/** Address for getting the member timeline */
	public static final String	TIMELINE_MEMBER			= "/timeline/member";
	
	/**
	 * Constructor #1.<br />
	 * Default private constructor.
	 */
	private APIAddresses () {
		super();
		throw new InstantiationError("Instantiation of class " + APIAddresses.class + " is forbidden");
	}
}

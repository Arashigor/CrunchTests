package common;

public class DataStore {
    public static final String EMAIL_BASE = "crunchIosTest";
    public static final String EMAIL_HOST = "@ellation.com";

    public static final String BASIC_PASSWORD = "123anime456";

    public static final String REGISTERED_USER_EMAIL = "dbalutel3@ellation.com";
    public static final String REGISTERED_USER_PASSWORD = "123123";

    public static final String BLANK_EMAIL = "";
    public static final String BLANK_PASSWORD = "";

    public static final String WRONG_EMAIL = "dbalutelellation.com";
    public static final String WRONG_PASSWORD = "...321312..!@@#$!@";

    public static final String ANIME_NAV = "Anime";
    public static final String HOME_NAV = "Home";
    public static final String NEW_NAV = "New";
    public static final String DRAMA_NAV = "Drama";
    public static final String ACCOUNT_NAV = "Account";

    public static final String DIRECTION_DOWN = "down";
    public static final String DIRECTION_UP = "up";

    public static String randomEmail() {
        return EMAIL_BASE + (int) System.currentTimeMillis() + EMAIL_HOST;
    }
}

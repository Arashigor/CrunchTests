package common;

public class DataStore {
    public static final String EMAIL_BASE = "crunchIosTest";
    public static final String EMAIL_HOST = "@ellation.com";

    public static final String BASIC_PASSWORD = "123anime456";

    public static final String REGISTERED_USER_EMAIL = "dbalutel@ellation.com";
    public static final String REGISTERED_USER_PASSWORD = "123anime456";

    public static final String BLANK_EMAIL = "";
    public static final String BLANK_PASSWORD = "";

    public static final String WRONG_EMAIL = "dbalutelellation.com";
    public static final String WRONG_PASSWORD = "...321312..!@@#$!@";

    public static String randomEmail() {
        return EMAIL_BASE + (int) System.currentTimeMillis() + EMAIL_HOST;
    }
}

package common;

public class DataStore {
    public static final String EMAIL_BASE = "crunchIosTest";
    public static final String EMAIL_HOST = "@ellation.com";

    public static final String BASIC_PASSWORD = "123anime456";

    public static final String REGISTRED_USER_EMAIL = "dbalutel@ellation.com";
    public static final String REGISTRED_USER_PASSWORD = "123anime456";

    public static String randomEmail() {
        return EMAIL_BASE + (int) System.currentTimeMillis() + EMAIL_HOST;
    }
}

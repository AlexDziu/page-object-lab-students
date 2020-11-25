package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomEmails {
    public static String generateEmail() {
        return RandomStringUtils.random(5, true, true) + "@gmail.com";
    }
}

package com.constants;

public class PathConstants {

    private PathConstants() {
    }

    private static final String ROOT_PROJECT_DIR = System.getProperty("user.dir");
    public static final String ANDROID_APK_PATH = ROOT_PROJECT_DIR + "/src/test/resources/app/SauceLabs.apk";
    public static final String PROPERTIES_FILE_PATH = "file:${user.dir}/src/test/resources/configs/config.properties";
    public static final String REPORT_PATH = ROOT_PROJECT_DIR + "/index.html";

}

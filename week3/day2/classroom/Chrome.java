package org.testleaf.week3.day2.classroom;

public class Chrome extends Browser {
public void openIncognito() {
        System.out.println("Chrome Incognito Mode Opened");
    }
    public void clearCache() {
        System.out.println("Chrome Cache Cleared");
    }
    public static void main(String[] args) {
        Chrome obj = new Chrome();
        System.out.println(obj.browserName);
        System.out.println(obj.browserVersion);
        obj.openURL();
        obj.closeBrowser();
        obj.navigateBack();
        obj.openIncognito();
        obj.clearCache();
    }
}

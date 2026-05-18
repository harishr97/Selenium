package org.testleaf.week3.day2.classroom;

public class Safari extends Browser {
    public void readerMode() {
        System.out.println("Reader Mode Enabled");
    }
    public void fullScreenMode() {
        System.out.println("Full Screen Mode Enabled");
    }
    public static void main(String[] args) {
        Safari obj = new Safari();
        System.out.println(obj.browserName);
        System.out.println(obj.browserVersion);
        obj.openURL();
        obj.closeBrowser();
        obj.navigateBack();
        obj.readerMode();
        obj.fullScreenMode();
    }
}
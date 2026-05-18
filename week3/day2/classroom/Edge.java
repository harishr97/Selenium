package org.testleaf.week3.day2.classroom;

public class Edge extends Browser {
    public void takeSnap() {
        System.out.println("Snapshot Taken");
    }
    public void clearCookies() {
        System.out.println("Cookies Cleared");
    }
    public static void main(String[] args) {
        Edge obj = new Edge();
        System.out.println(obj.browserName);
        System.out.println(obj.browserVersion);
        obj.openURL();
        obj.closeBrowser();
        obj.navigateBack();
        obj.takeSnap();
        obj.clearCookies();
    }
}
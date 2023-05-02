package com.mod2.fblibs;

import java.util.LinkedList;

public final class FacebookEvents {
    private static LinkedList authListeners = new LinkedList();
    private static LinkedList logoutListeners = new LinkedList();
    private static LinkedList postListeners = new LinkedList();

    public static void addAuthListener(AuthListener authListener) {
        synchronized (authListeners) {
        }
        authListeners.add(authListener);
    }

    public static void addLogoutListener(LogoutListener logoutListener) {
        synchronized (logoutListeners) {
        }
        logoutListeners.add(logoutListener);
    }

    public static void addPostListener(PostListener postListener) {
        synchronized (postListeners) {
        }
        postListeners.add(postListener);
    }

    static void onLoginError(String str) {
    }

    static void onLoginSuccess() {
    }

    static void onLogoutComplete() {
    }

    static void onPostPublished() {
    }

    static void onPostPublishingFailed() {
    }

    public static void removeAuthListener(AuthListener authListener) {
        synchronized (authListeners) {
        }
        authListeners.remove(authListener);
    }

    public static void removeLogoutListener(LogoutListener logoutListener) {
        synchronized (logoutListeners) {
        }
        logoutListeners.remove(logoutListener);
    }

    public static void removePostListener(PostListener postListener) {
        synchronized (postListeners) {
        }
        postListeners.remove(postListener);
    }
}

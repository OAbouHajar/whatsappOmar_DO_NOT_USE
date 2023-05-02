package com.mod2.fblibs;

import android.content.Context;
import android.content.SharedPreferences;

final class FacebookSessionStore {
    FacebookSessionStore() {
    }

    public static void clear(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("facebook-session", 0).edit();
        edit.clear();
        edit.commit();
    }

    public static boolean restore(Facebook facebook, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("facebook-session", 0);
        facebook.setAccessToken(sharedPreferences.getString(Facebook.TOKEN, (String) null));
        facebook.setAccessExpires(sharedPreferences.getLong(Facebook.EXPIRES, 0));
        return facebook.isSessionValid();
    }

    public static boolean save(Facebook facebook, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("facebook-session", 0).edit();
        edit.putString(Facebook.TOKEN, facebook.getAccessToken());
        edit.putLong(Facebook.EXPIRES, facebook.getAccessExpires());
        return edit.commit();
    }
}

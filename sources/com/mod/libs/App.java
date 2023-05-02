package com.mod.libs;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.widget.Toast;
import com.bbm.Alaska;
import java.io.ByteArrayOutputStream;

public class App {
    public static Bitmap ArrayToBitmap(byte[] bArr) {
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static byte[] BitmapToArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean BlockRead() {
        return GetSharedBool(Const.BlockReadSts, false);
    }

    public static void ClearSharedContains(String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).edit();
        edit.remove(str);
        edit.commit();
    }

    public static void DoPostEvent(String str) {
        Alaska.ctx.sendBroadcast(new Intent().setAction(str));
    }

    public static boolean FreshSharedVar(String str) {
        return !GetSharedContains(str);
    }

    public static String GetGalleryFileName(Intent intent) {
        return TTR.GetGalleryFileName(Alaska.ctx, intent);
    }

    public static int GetID(String str) {
        return Alaska.ctx.getResources().getIdentifier(str, "id", Alaska.ctx.getPackageName());
    }

    public static String GetResString(String str) {
        return Alaska.ctx.getResources().getString(Alaska.ctx.getResources().getIdentifier(str, "string", Alaska.ctx.getPackageName()));
    }

    public static Bitmap GetSharedBitmap(String str) {
        return ArrayToBitmap(GetSharedData(str));
    }

    public static boolean GetSharedBool(String str) {
        return PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).getBoolean(str, false);
    }

    public static boolean GetSharedBool(String str, boolean z2) {
        return PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).getBoolean(str, z2);
    }

    public static boolean GetSharedContains(String str) {
        return PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).contains(str);
    }

    public static byte[] GetSharedData(String str) {
        return Base64.decode(PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).getString(str, ""), 0);
    }

    public static int GetSharedInteger(String str) {
        return PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).getInt(str, 0);
    }

    public static int GetSharedInteger(String str, int i2) {
        return PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).getInt(str, i2);
    }

    public static Intent GetSharedIntent(String str) {
        try {
            return Intent.parseUri(PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).getString(str, ""), 0);
        } catch (Exception e2) {
            return null;
        }
    }

    public static long GetSharedLong(String str, long j2) {
        return PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).getLong(str, j2);
    }

    public static String GetSharedString(String str) {
        return PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).getString(str, "");
    }

    public static String GetTempPicFile() {
        return String.valueOf(TTR.GetPicFolder(Alaska.ctx)) + "temp.jpg";
    }

    public static void SetProperty(String str, int i2) {
        SetSharedInteger(str, i2);
        DoPostEvent(str);
    }

    public static void SetProperty(String str, Intent intent) {
        SetSharedIntent(str, intent);
        DoPostEvent(str);
    }

    public static void SetProperty(String str, Bitmap bitmap) {
        SetSharedBitmap(str, bitmap);
        DoPostEvent(str);
    }

    public static void SetProperty(String str, Boolean bool) {
        SetSharedBool(str, bool);
        DoPostEvent(str);
    }

    public static void SetProperty(String str, String str2) {
        SetSharedString(str, str2);
        DoPostEvent(str);
    }

    public static void SetProperty(String str, byte[] bArr) {
        SetSharedData(str, bArr);
        DoPostEvent(str);
    }

    public static void SetSharedBitmap(String str, Bitmap bitmap) {
        SetSharedData(str, BitmapToArray(bitmap));
    }

    public static void SetSharedBool(String str, Boolean bool) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).edit();
        edit.putBoolean(str, bool.booleanValue());
        edit.commit();
    }

    public static void SetSharedData(String str, byte[] bArr) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).edit();
        edit.putString(str, Base64.encodeToString(bArr, 0));
        edit.commit();
    }

    public static void SetSharedInteger(String str, int i2) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).edit();
        edit.putInt(str, i2);
        edit.commit();
    }

    public static void SetSharedIntent(String str, Intent intent) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).edit();
        edit.putString(str, intent.toURI());
        edit.commit();
    }

    public static void SetSharedLong(String str, long j2) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).edit();
        edit.putLong(str, j2);
        edit.commit();
    }

    public static void SetSharedString(String str, String str2) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static void Splash(String str) {
        Toast.makeText(Alaska.ctx, str, 0).show();
    }
}

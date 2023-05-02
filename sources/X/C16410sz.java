package X;

import android.net.Uri;

/* renamed from: X.0sz  reason: invalid class name and case insensitive filesystem */
public class C16410sz {
    public static final Uri A00;
    public static final Uri A01;
    public static final Uri A02;
    public static final String A03;

    static {
        StringBuilder sb = new StringBuilder("com.obwhatsapp");
        sb.append(".provider.migrate.ios");
        String obj = sb.toString();
        A03 = obj;
        Uri build = new Uri.Builder().scheme("content").authority(obj).build();
        A00 = build;
        A02 = Uri.withAppendedPath(build, "files");
        A01 = Uri.withAppendedPath(build, "file");
    }
}

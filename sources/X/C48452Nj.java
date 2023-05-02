package X;

import android.net.Uri;

/* renamed from: X.2Nj  reason: invalid class name and case insensitive filesystem */
public interface C48452Nj {
    public static final Uri A00;
    public static final Uri A01;

    static {
        Uri build = new Uri.Builder().scheme("content").authority("com.obwhatsapp.provider.instrumentation").build();
        A01 = build;
        A00 = build.buildUpon().appendPath("contacts").build();
    }
}

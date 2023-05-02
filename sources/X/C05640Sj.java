package X;

import android.view.ContentInfo;
import android.view.View;

/* renamed from: X.0Sj  reason: invalid class name and case insensitive filesystem */
public final class C05640Sj {
    public static C06130Uj A00(View view, C06130Uj r3) {
        ContentInfo A01 = r3.A01();
        ContentInfo performReceiveContent = view.performReceiveContent(A01);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == A01 ? r3 : C06130Uj.A00(performReceiveContent);
    }

    public static String[] A01(View view) {
        return view.getReceiveContentMimeTypes();
    }
}

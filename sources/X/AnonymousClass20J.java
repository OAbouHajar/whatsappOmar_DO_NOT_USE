package X;

import android.content.SharedPreferences;
import java.io.File;

/* renamed from: X.20J  reason: invalid class name */
public class AnonymousClass20J {
    public static File A00;

    public static synchronized File A00(C16180sb r9, C17020u3 r10, AnonymousClass1XK r11, String str, int i2) {
        File file;
        synchronized (AnonymousClass20J.class) {
            A00 = C17970vw.A0C(r9, r10, r11, str, 0, i2);
            SharedPreferences.Editor edit = r10.A00(AnonymousClass01S.A07).edit();
            edit.putString("external_file_image", A00.getAbsolutePath());
            edit.apply();
            file = A00;
        }
        return file;
    }

    public static synchronized File A01(C17020u3 r4) {
        File file;
        String string;
        synchronized (AnonymousClass20J.class) {
            if (A00 == null && (string = r4.A00(AnonymousClass01S.A07).getString("external_file_image", (String) null)) != null) {
                A00 = new File(string);
            }
            file = A00;
        }
        return file;
    }
}

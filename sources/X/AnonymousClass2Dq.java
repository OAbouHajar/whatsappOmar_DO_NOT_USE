package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.2Dq  reason: invalid class name */
public class AnonymousClass2Dq {
    public File A00;
    public File A01;
    public final String A02;

    public AnonymousClass2Dq(String str) {
        this.A02 = str;
    }

    public File A00(Context context) {
        File file;
        File file2 = this.A01;
        if (file2 == null || !file2.exists() || (file = this.A00) == null || !file.exists()) {
            return null;
        }
        return C434920f.A09(context) ? this.A00 : this.A01;
    }
}

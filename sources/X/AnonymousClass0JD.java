package X;

import android.util.Log;
import java.io.Writer;

/* renamed from: X.0JD  reason: invalid class name */
public final class AnonymousClass0JD extends Writer {
    public StringBuilder A00 = new StringBuilder(128);
    public final String A01 = "FragmentManager";

    public final void A00() {
        StringBuilder sb = this.A00;
        if (sb.length() > 0) {
            Log.d(this.A01, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        A00();
    }

    public void flush() {
        A00();
    }

    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == 10) {
                A00();
            } else {
                this.A00.append(c2);
            }
        }
    }
}

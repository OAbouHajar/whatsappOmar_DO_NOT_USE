package X;

import android.os.Looper;

/* renamed from: X.4Zh  reason: invalid class name and case insensitive filesystem */
public class C87944Zh {
    public static final C87944Zh A02;
    public final Looper A00;
    public final C107775Lj A01;

    static {
        C85824Qc r1 = new C85824Qc();
        if (r1.A01 == null) {
            r1.A01 = new C97964qs();
        }
        Looper looper = r1.A00;
        if (looper == null) {
            looper = Looper.getMainLooper();
            r1.A00 = looper;
        }
        A02 = new C87944Zh(looper, r1.A01);
    }

    public /* synthetic */ C87944Zh(Looper looper, C107775Lj r2) {
        this.A01 = r2;
        this.A00 = looper;
    }
}

package X;

import android.graphics.BitmapFactory;

/* renamed from: X.4RD  reason: invalid class name */
public class AnonymousClass4RD {
    public int A00 = 1;
    public BitmapFactory.Options A01;
    public boolean A02;

    public String toString() {
        String str = this.A00 == 0 ? "Cancel" : "Allow";
        StringBuilder A0r = AnonymousClass000.A0r("thread state = ");
        A0r.append(str);
        A0r.append(", options = ");
        return AnonymousClass000.A0f(this.A01, A0r);
    }
}

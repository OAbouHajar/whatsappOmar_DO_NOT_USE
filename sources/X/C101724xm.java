package X;

import java.text.Format;
import java.text.SimpleDateFormat;

/* renamed from: X.4xm  reason: invalid class name and case insensitive filesystem */
public class C101724xm implements AnonymousClass1V7 {
    public Format ACN(AnonymousClass013 r4) {
        try {
            return new SimpleDateFormat("LLLL yyyy", C13690nt.A0m(r4));
        } catch (IllegalArgumentException unused) {
            return new SimpleDateFormat("MMMM yyyy", C13690nt.A0m(r4));
        }
    }
}

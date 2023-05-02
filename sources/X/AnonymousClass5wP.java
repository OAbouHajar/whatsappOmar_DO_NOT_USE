package X;

import java.util.Locale;

/* renamed from: X.5wP  reason: invalid class name */
public class AnonymousClass5wP {
    public final AnonymousClass2HJ A00;
    public final Integer A01;

    public AnonymousClass5wP(int i2) {
        this.A00 = null;
        this.A01 = Integer.valueOf(i2);
    }

    public AnonymousClass5wP(AnonymousClass2HJ r2) {
        this.A00 = r2;
        this.A01 = null;
    }

    public String toString() {
        String str;
        int intValue;
        AnonymousClass2HJ r0 = this.A00;
        if (r0 != null) {
            str = "NETWORK";
            intValue = r0.A00;
        } else {
            str = "CLIENT";
            Integer num = this.A01;
            AnonymousClass00B.A06(num);
            intValue = num.intValue();
        }
        Locale locale = Locale.US;
        Object[] A1a = C110105dW.A1a(str);
        AnonymousClass000.A1M(A1a, intValue, 1);
        return String.format(locale, "[type=%s, code=%d]", A1a);
    }
}

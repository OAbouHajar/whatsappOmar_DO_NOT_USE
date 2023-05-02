package X;

import java.util.regex.Matcher;

/* renamed from: X.4MC  reason: invalid class name */
public class AnonymousClass4MC {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass4MC(String str, boolean z2) {
        Matcher matcher = C39751t0.A0B.matcher(str);
        matcher.find();
        this.A00 = matcher.group();
        boolean z3 = false;
        if (z2) {
            int indexOf = str.indexOf(164);
            this.A01 = str.substring(0, indexOf);
            this.A02 = str.substring(indexOf + 1);
            if (matcher.start() > indexOf) {
                z3 = true;
            }
        } else {
            this.A02 = "";
            this.A01 = "";
        }
        this.A03 = z3;
    }
}

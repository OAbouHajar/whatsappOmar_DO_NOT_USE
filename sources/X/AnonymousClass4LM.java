package X;

import java.util.HashSet;

/* renamed from: X.4LM  reason: invalid class name */
public class AnonymousClass4LM {
    public int A00;
    public AnonymousClass5NZ A01;
    public HashSet A02;
    public String[] A03;

    public AnonymousClass4LM(String[] strArr, int i2) {
        String str;
        int length = strArr.length;
        if (length < 3) {
            str = "Annotation conditions should have at least 3 elements";
        } else if (i2 >= 0) {
            String str2 = strArr[1];
            if (str2.equals("any")) {
                this.A01 = new C95764nF();
            } else if (str2.equals("all")) {
                this.A01 = new C95754nE();
            } else {
                StringBuilder A0r = AnonymousClass000.A0r("'");
                A0r.append(str2);
                str = AnonymousClass000.A0h("' is not a valid operation", A0r);
            }
            int i3 = length - 2;
            String[] strArr2 = new String[i3];
            this.A03 = strArr2;
            for (int i4 = 0; i4 < i3; i4++) {
                strArr2[i4] = strArr[i4 + 2];
            }
            this.A02 = C13680ns.A0o();
            this.A00 = i2;
            return;
        } else {
            str = C13680ns.A0c(i2, "Fallback sampling rate < 0: ");
        }
        throw AnonymousClass000.A0T(str);
    }
}

package X;

import java.util.regex.Pattern;

/* renamed from: X.50b  reason: invalid class name and case insensitive filesystem */
public final class C1030950b implements C109735Tj {
    public static final C1033050w A02 = new C1033050w();
    public final String A00;
    public final String A01;

    public C1030950b(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean A8i(AnonymousClass4QM r3) {
        C18450wi.A0H(r3, 0);
        String str = (String) r3.A00(this.A01);
        if (str != null) {
            return Pattern.compile(this.A00).matcher(str).find();
        }
        throw AnonymousClass3K4.A0T("Input string is null");
    }
}

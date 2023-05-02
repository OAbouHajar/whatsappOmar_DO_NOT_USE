package X;

/* 'enum' modifier removed */
/* renamed from: X.2sv  reason: invalid class name and case insensitive filesystem */
public final class C58122sv extends C801442s {
    public C58122sv() {
        super("VALID", 1);
    }

    public boolean A00(C26071Mf r6, AnonymousClass3HS r7, String str) {
        AnonymousClass54V A0D;
        AnonymousClass54U A0B;
        if (!r6.A0L(r7)) {
            return false;
        }
        int i2 = 0;
        while (i2 < str.length() - 1) {
            char charAt = str.charAt(i2);
            if (charAt == 'x' || charAt == 'X') {
                int i3 = i2 + 1;
                char charAt2 = str.charAt(i3);
                if (charAt2 == 'x' || charAt2 == 'X') {
                    if (r6.A09(r7, str.substring(i3)) != C795840k.NSN_MATCH) {
                        return false;
                    }
                    i2 = i3;
                } else if (!C26071Mf.A03(str.substring(i2)).equals(r7.extension_)) {
                    return false;
                }
            }
            i2++;
        }
        if (r7.countryCodeSource_ != C798041j.FROM_DEFAULT_COUNTRY || (A0D = r6.A0D(r6.A0F(r7.countryCode_))) == null || (A0B = r6.A0B(C26071Mf.A01(r7), A0D.numberFormat_)) == null) {
            return true;
        }
        String str2 = A0B.nationalPrefixFormattingRule_;
        if (str2.length() <= 0 || A0B.nationalPrefixOptionalWhenFormatting_ || C26071Mf.A03(str2.substring(0, str2.indexOf("$1"))).length() == 0) {
            return true;
        }
        return r6.A0J(A0D, AnonymousClass000.A0r(C26071Mf.A03(r7.rawInput_)), (StringBuilder) null);
    }
}

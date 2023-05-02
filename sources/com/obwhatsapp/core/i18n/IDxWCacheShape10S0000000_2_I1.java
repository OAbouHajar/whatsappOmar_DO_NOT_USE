package com.obwhatsapp.core.i18n;

import X.AnonymousClass0T6;
import X.AnonymousClass28f;
import X.C88944bL;

public class IDxWCacheShape10S0000000_2_I1 extends C88944bL {
    public final int A00;

    public IDxWCacheShape10S0000000_2_I1(int i2) {
        this.A00 = i2;
    }

    public boolean A01(String str) {
        switch (this.A00) {
            case 0:
                Object obj = AnonymousClass28f.A02.get(str);
                if (obj == null) {
                    return true;
                }
                return AnonymousClass0T6.A00(this.A00, obj.toString());
            case 1:
                return AnonymousClass0T6.A00(this.A00, str);
            default:
                int i2 = 0;
                while (i2 < str.length()) {
                    int codePointAt = str.codePointAt(i2);
                    if (codePointAt > 255) {
                        if (!AnonymousClass0T6.A00(this.A00, codePointAt <= 65535 ? Character.toString((char) codePointAt) : new String(Character.toChars(codePointAt)))) {
                            return false;
                        }
                    }
                    i2 += Character.charCount(codePointAt);
                }
                return true;
        }
    }
}

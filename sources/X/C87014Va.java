package X;

import java.util.List;

/* renamed from: X.4Va  reason: invalid class name and case insensitive filesystem */
public final class C87014Va {
    public final String A00;
    public final List A01;

    public C87014Va(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87014Va) {
                C87014Va r5 = (C87014Va) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A01, AnonymousClass3K4.A07(this.A00));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AdditionalBusinessData(jid=");
        A0r.append(this.A00);
        A0r.append(", catalogProductImageUrls=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}

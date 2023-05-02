package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.4bt  reason: invalid class name and case insensitive filesystem */
public final class C89284bt {
    public final C16050sL A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final Map A04;

    public C89284bt(C16050sL r2, List list, Map map) {
        this.A00 = r2;
        this.A03 = list;
        this.A04 = map;
        this.A01 = null;
        this.A02 = null;
    }

    public C89284bt(String str, String str2) {
        C440222l r2 = C440222l.A00;
        AnonymousClass1Z8 r1 = AnonymousClass1Z8.A00;
        this.A00 = null;
        this.A03 = r2;
        this.A04 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89284bt) {
                C89284bt r5 = (C89284bt) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A04, r5.A04) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0E = (AnonymousClass000.A0E(this.A04, AnonymousClass000.A0E(this.A03, AnonymousClass000.A0C(this.A00) * 31)) + AnonymousClass000.A0G(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A0E + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("RemoveCommunityParticipantsResponse(from=");
        A0r.append(this.A00);
        A0r.append(", successList=");
        A0r.append(this.A03);
        A0r.append(", failTable=");
        A0r.append(this.A04);
        A0r.append(", errorCode=");
        A0r.append(this.A01);
        A0r.append(", errorText=");
        return AnonymousClass3K2.A0k(this.A02, A0r);
    }
}

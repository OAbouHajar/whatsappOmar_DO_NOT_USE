package X;

import java.util.List;

/* renamed from: X.4WK  reason: invalid class name */
public final class AnonymousClass4WK {
    public final C16050sL A00;
    public final String A01;
    public final List A02;
    public final C15220qW A03 = C32521gW.A00(new AnonymousClass5ED(this));

    public AnonymousClass4WK(C16050sL r2, String str, List list) {
        this.A01 = str;
        this.A00 = r2;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WK) {
                AnonymousClass4WK r5 = (AnonymousClass4WK) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A02, AnonymousClass000.A0E(this.A00, AnonymousClass3K4.A07(this.A01)));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("RemoveCommunityParticipantsRequest(iqId=");
        A0r.append(this.A01);
        A0r.append(", parentGroupJid=");
        A0r.append(this.A00);
        A0r.append(", listOfUsers=");
        return AnonymousClass3K2.A0k(this.A02, A0r);
    }
}

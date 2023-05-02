package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3oA  reason: invalid class name and case insensitive filesystem */
public final class C73463oA extends AnonymousClass46N {
    public final UserJid A00;
    public final AnonymousClass1DU A01;
    public final AnonymousClass22J A02;

    public C73463oA(UserJid userJid, AnonymousClass1DU r3, AnonymousClass22J r4) {
        C18450wi.A0H(userJid, 1);
        this.A00 = userJid;
        this.A02 = r4;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73463oA) {
                C73463oA r5 = (C73463oA) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A01, AnonymousClass000.A0E(this.A02, AnonymousClass3K3.A0H(this.A00)));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("OnRequestFailedErrorWithRetry(userJid=");
        A0r.append(this.A00);
        A0r.append(", onRetryRequested=");
        A0r.append(this.A02);
        A0r.append(", onErrorDismissed=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}

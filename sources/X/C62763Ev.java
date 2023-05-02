package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ev  reason: invalid class name and case insensitive filesystem */
public class C62763Ev implements AnonymousClass1yY {
    public final /* synthetic */ C32131fh A00;

    public C62763Ev(C32131fh r1) {
        this.A00 = r1;
    }

    public void AR2(UserJid userJid, int i2) {
        C32131fh r2 = this.A00;
        if (C34901l3.A00(userJid, r2.A0K)) {
            C57242qY r1 = r2.A0G;
            r1.A01 = true;
            r1.A00 = Integer.valueOf(i2);
            if (!r2.A0C.A00) {
                r2.A0F.A0N(i2);
                r2.A0L.A05("catalog_collections_view_tag", false);
            }
        }
    }

    public void AR3(UserJid userJid, boolean z2, boolean z3) {
        C32131fh r3 = this.A00;
        if (C34901l3.A00(userJid, r3.A0K)) {
            if (!z2 && z3) {
                r3.A0G.A01 = true;
            }
            r3.A0G.A00 = null;
            if (!r3.A0C.A00) {
                r3.A0P = true;
                r3.invalidateOptionsMenu();
                C32151fj r0 = r3.A0F;
                r0.A0P(userJid);
                r0.A0L();
                r0.A01();
                C57242qY r1 = r3.A0G;
                if (r1.A01 && r1.A02) {
                    r3.A0L.A05("catalog_collections_view_tag", true);
                }
            }
        }
    }
}

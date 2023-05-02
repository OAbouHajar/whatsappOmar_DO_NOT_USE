package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ew  reason: invalid class name and case insensitive filesystem */
public class C62773Ew implements AnonymousClass1yY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass1WD A02;
    public final /* synthetic */ AnonymousClass1KZ A03;
    public final /* synthetic */ UserJid A04;

    public C62773Ew(Context context, AnonymousClass1WD r2, AnonymousClass1KZ r3, UserJid userJid, int i2) {
        this.A03 = r3;
        this.A04 = userJid;
        this.A01 = context;
        this.A00 = i2;
        this.A02 = r2;
    }

    public void AR2(UserJid userJid, int i2) {
        if (C34901l3.A00(this.A04, userJid)) {
            AnonymousClass1KZ r2 = this.A03;
            C14870pt.A00(r2.A01, this, 23);
            this.A02.A02(Boolean.FALSE);
            r2.A05.A05("catalog_collections_view_tag", false);
        }
    }

    public void AR3(UserJid userJid, boolean z2, boolean z3) {
        UserJid userJid2 = this.A04;
        if (C34901l3.A00(userJid2, userJid)) {
            AnonymousClass1KZ r4 = this.A03;
            C14870pt.A00(r4.A01, this, 22);
            r4.A02.A0I(userJid2);
            Context context = this.A01;
            Intent A0T = C14750ph.A0T(context, userJid2, Integer.valueOf(this.A00), 11);
            A0T.putExtra("is_prefetched_catalog", true);
            r4.A00.A06(context, A0T);
            this.A02.A02(Boolean.TRUE);
        }
    }
}

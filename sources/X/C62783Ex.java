package X;

import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.3Ex  reason: invalid class name and case insensitive filesystem */
public class C62783Ex implements AnonymousClass5RU {
    public final /* synthetic */ AnonymousClass1KE A00;
    public final /* synthetic */ UserJid A01;

    public C62783Ex(AnonymousClass1KE r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public void AR8(AnonymousClass26O r6, int i2) {
        AnonymousClass1KE r2 = this.A00;
        r2.A00 = false;
        if (i2 == 406 || i2 == 404) {
            r2.A05.A0D(this.A01);
        }
        AnonymousClass1K9 r0 = r2.A04;
        UserJid userJid = this.A01;
        Iterator A002 = C16590tJ.A00(r0);
        while (A002.hasNext()) {
            AnonymousClass3F1 r1 = (AnonymousClass3F1) A002.next();
            CatalogMediaCard catalogMediaCard = r1.A06;
            if (C34901l3.A00(catalogMediaCard.A0G, userJid)) {
                AnonymousClass1KE r02 = r1.A05;
                if (!r02.A05.A0J(catalogMediaCard.A0G)) {
                    int i3 = R.string.str03c8;
                    if (i2 != -1) {
                        i3 = R.string.str03c7;
                        if (i2 != 404) {
                            i3 = R.string.str03eb;
                        }
                    }
                    catalogMediaCard.setError(i3);
                }
            }
        }
    }

    public void AR9(AnonymousClass2GI r5, AnonymousClass26O r6) {
        AnonymousClass1KE r3 = this.A00;
        r3.A00 = false;
        if (r6.A06 == null) {
            C18640x1 r0 = r3.A05;
            UserJid userJid = this.A01;
            r0.A0B(r5, userJid, false);
            r3.A04.A04(userJid);
        }
    }
}

package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.3Ey  reason: invalid class name and case insensitive filesystem */
public class C62793Ey implements AnonymousClass5RU {
    public final /* synthetic */ AnonymousClass1KA A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C62793Ey(AnonymousClass1KA r1, UserJid userJid, String str, boolean z2) {
        this.A00 = r1;
        this.A03 = z2;
        this.A02 = str;
        this.A01 = userJid;
    }

    public void AR8(AnonymousClass26O r6, int i2) {
        AnonymousClass1KA r4 = this.A00;
        r4.A01 = false;
        boolean z2 = this.A03;
        if (z2) {
            r4.A04.A09(Boolean.FALSE);
        }
        if (i2 == 406 || i2 == 404) {
            r4.A0B.A0D(this.A01);
        }
        AnonymousClass1KY r0 = r4.A0A;
        UserJid userJid = this.A01;
        Iterator A002 = C16590tJ.A00(r0);
        while (A002.hasNext()) {
            ((AnonymousClass1yY) A002.next()).AR2(userJid, i2);
        }
        if (z2) {
            r4.A02.A09(new C71433kN(userJid, "catalog_products_all_items_collection_id", i2));
        }
    }

    public void AR9(AnonymousClass2GI r10, AnonymousClass26O r11) {
        AnonymousClass1KA r8 = this.A00;
        r8.A01 = false;
        boolean z2 = this.A03;
        if (z2) {
            r8.A04.A09(Boolean.FALSE);
        }
        String str = r11.A06;
        if (str == null || str.equals(this.A02)) {
            boolean z3 = true;
            boolean A1V = AnonymousClass000.A1V(str);
            C18640x1 r0 = r8.A0B;
            UserJid userJid = this.A01;
            r0.A0B(r10, userJid, A1V);
            AnonymousClass1KY r02 = r8.A0A;
            String str2 = this.A02;
            boolean A1W = AnonymousClass000.A1W(str2);
            Iterator A002 = C16590tJ.A00(r02);
            while (A002.hasNext()) {
                ((AnonymousClass1yY) A002.next()).AR3(userJid, false, A1W);
            }
            if (z2) {
                AnonymousClass027 r2 = r8.A02;
                if (str2 != null) {
                    z3 = false;
                }
                r2.A09(new C71443kO(userJid, "catalog_products_all_items_collection_id", false, z3));
            }
        }
    }
}

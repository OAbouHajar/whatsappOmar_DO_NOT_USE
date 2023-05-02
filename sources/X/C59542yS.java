package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2yS  reason: invalid class name and case insensitive filesystem */
public class C59542yS extends C59562yU {
    public final C16300so A00;
    public final AnonymousClass5RX A01;
    public final C61713Aa A02;
    public final C18260wP A03;
    public final AnonymousClass26O A04;
    public final C18720x9 A05;
    public final C17190ug A06;
    public final C18630x0 A07;

    public C59542yS(C16300so r2, C17150uc r3, AnonymousClass5RX r4, C61713Aa r5, C18260wP r6, AnonymousClass26O r7, C18720x9 r8, C17190ug r9, C18630x0 r10) {
        super(r3, r7.A05);
        this.A02 = r5;
        this.A00 = r2;
        this.A07 = r10;
        this.A06 = r9;
        this.A04 = r7;
        this.A03 = r6;
        this.A01 = r4;
        this.A05 = r8;
    }

    public final void A06() {
        C31081dR r1;
        if (this.A04.A06 == null && (r1 = (C31081dR) this.A07.A02.get("catalog_collections_view_tag")) != null) {
            r1.A07("datasource_catalog");
        }
    }

    public boolean A07() {
        if (!this.A03.A0A()) {
            StringBuilder A0q = AnonymousClass000.A0q("app/sendGetBizProductCatalog jid=");
            A0q.append(this.A04.A05);
            Log.i(AnonymousClass000.A0h(" failed", A0q));
            return false;
        }
        if (this.A01.A09()) {
            A02();
        } else {
            A03();
        }
        StringBuilder A0q2 = AnonymousClass000.A0q("app/sendGetBizProductCatalog jid=");
        A0q2.append(this.A04.A05);
        Log.i(AnonymousClass000.A0h(" success", A0q2));
        return true;
    }

    public void APb(String str) {
        A06();
        Log.e("sendGetBizProductCatalog/delivery-error");
        this.A01.AQt(this.A04, -1);
    }

    public void AYG(C28371Vv r6, String str) {
        A06();
        AnonymousClass26O r4 = this.A04;
        UserJid userJid = r4.A05;
        C61713Aa r2 = this.A02;
        AnonymousClass2GI A012 = r2.A01(r6);
        r2.A03(this.A01, userJid, r6);
        if (A012 != null) {
            this.A01.AYH(A012, r4);
            return;
        }
        this.A01.AQt(r4, 0);
        this.A00.AcB("RequestBizProductCatalogProtocolHelper/get product catalog error", "error_code=0", true);
    }
}

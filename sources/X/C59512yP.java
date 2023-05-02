package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2yP  reason: invalid class name and case insensitive filesystem */
public class C59512yP extends C59562yU {
    public final C16300so A00;
    public final C17150uc A01;
    public final AnonymousClass39J A02;
    public final C61713Aa A03;
    public final C18720x9 A04;
    public final C17190ug A05;
    public final C18630x0 A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public C59512yP(C16300so r3, C17150uc r4, AnonymousClass39J r5, C61713Aa r6, UserJid userJid, C18720x9 r8, C17190ug r9, C18700x7 r10, String str, String str2, List list) {
        super(r4, userJid);
        this.A02 = r5;
        this.A06 = (C18630x0) ((C16150sX) ((AnonymousClass01F) C004501y.A00(AnonymousClass01F.class, r10.A00.A00))).A1m.get();
        this.A05 = r9;
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = r3;
        this.A08 = str;
        this.A07 = str2;
        this.A09 = list;
        this.A04 = r8;
    }

    public void APb(String str) {
        this.A06.A01("plm_details_view_tag");
        Log.e("RequestBizProductListProtocolHelper/onDeliveryFailure");
        this.A02.A01(new C49822Vz(3));
    }

    public void AYG(C28371Vv r5, String str) {
        this.A06.A01("plm_details_view_tag");
        UserJid userJid = this.A00;
        C61713Aa r2 = this.A03;
        AnonymousClass2GI A012 = r2.A01(r5);
        r2.A03(this.A01, userJid, r5);
        if (A012 == null) {
            this.A02.A01(new C49822Vz(4));
            this.A00.AcB("RequestBizProductListProtocolHelper/get product catalog error", "error_code=0", true);
            return;
        }
        List list = A012.A01;
        AnonymousClass39J r22 = this.A02;
        C49822Vz r0 = new C49822Vz(1);
        r0.A01 = list;
        r22.A01(r0);
    }
}

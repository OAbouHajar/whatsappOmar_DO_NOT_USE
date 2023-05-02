package X;

import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2yQ  reason: invalid class name and case insensitive filesystem */
public class C59522yQ extends C59562yU {
    public final C18640x1 A00;
    public final AnonymousClass4Q4 A01;
    public final C61713Aa A02;
    public final C18260wP A03;
    public final AnonymousClass26S A04;
    public final C18720x9 A05;
    public final C17190ug A06;
    public final C18630x0 A07;

    public C59522yQ(C17150uc r2, C18640x1 r3, AnonymousClass4Q4 r4, C61713Aa r5, C18260wP r6, AnonymousClass26S r7, C18720x9 r8, C17190ug r9, C18630x0 r10) {
        super(r2, r7.A00);
        this.A02 = r5;
        this.A06 = r9;
        this.A07 = r10;
        this.A04 = r7;
        this.A00 = r3;
        this.A03 = r6;
        this.A05 = r8;
        this.A01 = r4;
    }

    public void APb(String str) {
        Log.e("ProductRequestProtocolHelper/onDeliveryFailure");
        this.A07.A01("view_product_tag");
        this.A01.A00(this.A04, 0);
    }

    public void AYG(C28371Vv r7, String str) {
        this.A07.A01("view_product_tag");
        C61713Aa r2 = this.A02;
        AnonymousClass2GI A012 = r2.A01(r7);
        AnonymousClass26S r5 = this.A04;
        UserJid userJid = r5.A00;
        r2.A03(this.A01, userJid, r7);
        if (A012 != null) {
            List list = A012.A01;
            if (!list.isEmpty()) {
                this.A00.A0C((C35701mM) list.get(0), userJid);
                AnonymousClass4Q4 r4 = this.A01;
                r4.A00.A06.A0K(new RunnableRunnableShape1S1200000_I1(r4, ((C35701mM) list.get(0)).A0D, r5, 4));
                return;
            }
        }
        Log.e("ProductRequestProtocolHelper/onSuccess/error: empty response");
    }
}

package X;

import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2RU  reason: invalid class name */
public class AnonymousClass2RU extends AnonymousClass26X {
    public C84704Lo A00;
    public AnonymousClass26Y A01;
    public final C14870pt A02;
    public final AnonymousClass4K4 A03;
    public final C18720x9 A04;
    public final C17190ug A05;
    public final C18630x0 A06;
    public final C18750xC A07;

    public AnonymousClass2RU(C14870pt r1, C17150uc r2, AnonymousClass4K4 r3, C18720x9 r4, C17190ug r5, C18630x0 r6, C18750xC r7) {
        super(r2);
        this.A02 = r1;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = r4;
        this.A07 = r7;
    }

    public void A02(C84704Lo r14, AnonymousClass26Y r15) {
        this.A01 = r15;
        String A022 = this.A05.A02();
        this.A06.A02("cart_view_tag");
        C18750xC r0 = this.A07;
        UserJid userJid = r14.A02;
        r0.A00(userJid, A022, 253);
        C18720x9 r5 = this.A04;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C28371Vv("width", Integer.toString(r14.A01), (C35081lL[]) null));
        arrayList.add(new C28371Vv("height", Integer.toString(r14.A00), (C35081lL[]) null));
        C28371Vv r02 = new C28371Vv("image_dimensions", (C35081lL[]) null, (C28371Vv[]) arrayList.toArray(new C28371Vv[0]));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(r02);
        for (String r2 : r14.A03) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new C28371Vv("id", r2, (C35081lL[]) null));
            arrayList2.add(new C28371Vv("product", (C35081lL[]) null, (C28371Vv[]) arrayList3.toArray(new C28371Vv[0])));
        }
        String A012 = this.A01.A07.A01(userJid);
        if (A012 != null) {
            this.A00 = r14;
            arrayList2.add(new C28371Vv("direct_connection_encrypted_info", A012, (C35081lL[]) null));
        }
        r5.A01(this, new C28371Vv(new C28371Vv("cart", new C35081lL[]{new C35081lL("op", "refresh"), new C35081lL("biz_jid", userJid.getRawString())}, (C28371Vv[]) arrayList2.toArray(new C28371Vv[0])), "iq", new C35081lL[]{new C35081lL("smax_id", "11"), new C35081lL("id", A022), new C35081lL("xmlns", "fb:thrift_iq"), new C35081lL("type", "get"), new C35081lL((Jid) C34791ks.A00, "to")}), A022, 253);
        StringBuilder sb = new StringBuilder("RefreshCartProtocol/sendRefreshCartRequest/biz_jid=");
        sb.append(userJid);
        Log.i(sb.toString());
    }

    public void APb(String str) {
        this.A06.A01("cart_view_tag");
        this.A07.A01(str);
        this.A01.AQT(new Pair(2, "delivery failed"));
        Log.i("RefreshCartProtocol/onDeliveryFailure");
        this.A00 = null;
    }

    public void APn(UserJid userJid) {
        StringBuilder sb = new StringBuilder("RefreshCartProtocol/onDirectConnectionError/jid=");
        sb.append(userJid.getRawString());
        Log.e(sb.toString());
        if (this.A01 != null) {
            this.A02.A0K(new RunnableRunnableShape3S0100000_I0_2(this, 42));
        }
        this.A00 = null;
    }

    public void APo(UserJid userJid) {
        if (this.A00 == null) {
            Log.e("RefreshCartProtocol/onDirectConnectionSucceeded/directConnectionRequestToRetry is null");
            return;
        }
        StringBuilder sb = new StringBuilder("RefreshCartProtocol/onDirectConnectionSucceeded/jid=");
        sb.append(userJid.getRawString());
        Log.i(sb.toString());
        A02(this.A00, this.A01);
    }

    public void AQe(C28371Vv r5, String str) {
        this.A06.A01("cart_view_tag");
        this.A07.A01(str);
        Pair A012 = C34451kH.A01(r5);
        C84704Lo r0 = this.A00;
        if (r0 == null || A012 == null || !A01(r0.A02, ((Number) A012.first).intValue())) {
            this.A00 = null;
            this.A02.A0K(new RunnableRunnableShape3S0200000_I0_1(this, 12, A012));
        }
    }

    public void AYG(C28371Vv r27, String str) {
        C83504Gy r4;
        this.A06.A01("cart_view_tag");
        this.A07.A02(str);
        AnonymousClass4K4 r3 = this.A03;
        C28371Vv A0J = r27.A0J("cart");
        if (A0J != null) {
            List<C28371Vv> A0O = A0J.A0O("product");
            ArrayList arrayList = new ArrayList();
            for (C28371Vv r6 : A0O) {
                C35701mM A022 = r3.A01.A02(r6);
                if (A022 == null) {
                    C28371Vv A0J2 = r6.A0J("id");
                    C28371Vv A0J3 = r6.A0J("status");
                    String A0L = A0J2 == null ? null : A0J2.A0L();
                    C35681mK r10 = A0J3 == null ? null : new C35681mK((String) null, (String) null, (List) null, 3, false);
                    if (A0L != null) {
                        A022 = new C35701mM((C93584jR) null, r10, (C93694jc) null, (C39651sq) null, A0L, "", (String) null, (String) null, (String) null, (String) null, (BigDecimal) null, new ArrayList(), 0, 99, true, false);
                    }
                }
                arrayList.add(A022);
            }
            r4 = new C83504Gy(r3.A02.A00(A0J.A0J("price")), arrayList);
        } else {
            r4 = null;
        }
        this.A00 = null;
        this.A02.A0K(new RunnableRunnableShape3S0200000_I0_1(this, 13, r4));
    }
}

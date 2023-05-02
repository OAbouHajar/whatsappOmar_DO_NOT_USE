package X;

import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: X.26W  reason: invalid class name */
public class AnonymousClass26W extends AnonymousClass26X {
    public C449526j A00;
    public AnonymousClass26Y A01;
    public final C14870pt A02;
    public final AnonymousClass2RQ A03;
    public final AnonymousClass4DB A04;
    public final C15860rz A05;
    public final C18720x9 A06;
    public final C17190ug A07;
    public final C18630x0 A08;
    public final C18750xC A09;
    public final C16320sq A0A;

    public AnonymousClass26W(C14870pt r1, C17150uc r2, AnonymousClass2RQ r3, AnonymousClass4DB r4, C15860rz r5, C18720x9 r6, C17190ug r7, C18630x0 r8, C18750xC r9, C16320sq r10) {
        super(r2);
        this.A04 = r4;
        this.A02 = r1;
        this.A08 = r8;
        this.A07 = r7;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r3;
        this.A0A = r10;
        this.A09 = r9;
    }

    public final void A02(C449526j r15) {
        String A022 = this.A07.A02();
        C18750xC r0 = this.A09;
        UserJid userJid = r15.A00;
        r0.A00(userJid, A022, 252);
        C18720x9 r4 = this.A06;
        ArrayList arrayList = new ArrayList();
        for (C50102Xy r12 : r15.A01) {
            ArrayList arrayList2 = new ArrayList();
            C35701mM r9 = r12.A01;
            arrayList2.add(new C28371Vv("id", r9.A0D, (C35081lL[]) null));
            arrayList2.add(new C28371Vv(FacebookFacade.RequestParameter.NAME, r9.A04, (C35081lL[]) null));
            arrayList2.add(new C28371Vv("quantity", Long.toString(r12.A00), (C35081lL[]) null));
            BigDecimal bigDecimal = r9.A05;
            C93694jc r1 = r9.A02;
            Date date = r15.A02;
            if (bigDecimal != null && (r1 == null || !r1.A00(date) || (bigDecimal = r1.A01) != null)) {
                arrayList2.add(new C28371Vv("price", Long.toString(bigDecimal.multiply(C39641sp.A00).longValue()), (C35081lL[]) null));
            }
            C39651sq r02 = r9.A03;
            if (r02 != null) {
                arrayList2.add(new C28371Vv("currency", r02.A00, (C35081lL[]) null));
            }
            arrayList.add(new C28371Vv("product", (C35081lL[]) null, (C28371Vv[]) arrayList2.toArray(new C28371Vv[0])));
        }
        String A012 = this.A01.A07.A01(userJid);
        if (A012 != null) {
            this.A00 = r15;
            arrayList.add(new C28371Vv("direct_connection_encrypted_info", A012, (C35081lL[]) null));
        }
        r4.A01(this, new C28371Vv(new C28371Vv("order", new C35081lL[]{new C35081lL("op", "create"), new C35081lL("biz_jid", userJid.getRawString())}, (C28371Vv[]) arrayList.toArray(new C28371Vv[0])), "iq", new C35081lL[]{new C35081lL("smax_id", "10"), new C35081lL("id", A022), new C35081lL("xmlns", "fb:thrift_iq"), new C35081lL("type", "set"), new C35081lL((Jid) C34791ks.A00, "to")}), A022, 252);
        StringBuilder sb = new StringBuilder("CreateOrderProtocol/doSendCreateOrderRequest/biz_jid=");
        sb.append(userJid);
        Log.i(sb.toString());
    }

    public void APb(String str) {
        this.A08.A01("order_creates_tag");
        this.A09.A01(str);
        this.A02.A0K(new RunnableRunnableShape4S0100000_I0_3(this, 9));
    }

    public void APn(UserJid userJid) {
        this.A02.A0K(new RunnableRunnableShape4S0100000_I0_3(this, 11));
    }

    public void APo(UserJid userJid) {
        this.A02.A0K(new RunnableRunnableShape4S0100000_I0_3(this, 10));
    }

    public void AQe(C28371Vv r5, String str) {
        int intValue;
        this.A08.A01("order_creates_tag");
        this.A09.A01(str);
        Pair A012 = C34451kH.A01(r5);
        C449526j r2 = this.A00;
        if (r2 == null || A012 == null || (intValue = ((Number) A012.first).intValue()) != 421) {
            this.A00 = null;
            this.A02.A0K(new RunnableRunnableShape3S0200000_I0_1(this, 18, A012));
            return;
        }
        A01(r2.A00, intValue);
    }

    public void AYG(C28371Vv r7, String str) {
        AnonymousClass4K8 r3;
        this.A08.A01("order_creates_tag");
        this.A09.A02(str);
        AnonymousClass4DB r5 = this.A04;
        C28371Vv A0J = r7.A0J("order");
        if (A0J != null) {
            String A0N = A0J.A0N("id", (String) null);
            String A0N2 = A0J.A0N("token", (String) null);
            AnonymousClass4K9 A002 = r5.A00.A00(A0J.A0J("price"));
            if (A0N != null) {
                r3 = new AnonymousClass4K8(A002, A0N, A0N2);
                this.A02.A0K(new RunnableRunnableShape3S0200000_I0_1(this, 19, r3));
            }
        }
        r3 = null;
        this.A02.A0K(new RunnableRunnableShape3S0200000_I0_1(this, 19, r3));
    }
}

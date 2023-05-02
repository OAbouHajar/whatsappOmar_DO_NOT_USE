package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2yN  reason: invalid class name and case insensitive filesystem */
public class C59492yN extends AnonymousClass26X {
    public final AnonymousClass4N5 A00;
    public final AnonymousClass4DC A01;
    public final C18720x9 A02;
    public final C17190ug A03;
    public final C18630x0 A04;
    public final C34421kE A05 = new C34421kE();

    public C59492yN(C17150uc r2, AnonymousClass4N5 r3, AnonymousClass4DC r4, C18720x9 r5, C17190ug r6, C18630x0 r7) {
        super(r2);
        this.A04 = r7;
        this.A03 = r6;
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
    }

    public final C28371Vv A02(String str) {
        ArrayList A0u = AnonymousClass000.A0u();
        AnonymousClass4N5 r4 = this.A00;
        AnonymousClass26X.A00("width", Integer.toString(r4.A01), A0u);
        AnonymousClass26X.A00("height", Integer.toString(r4.A00), A0u);
        C28371Vv r5 = new C28371Vv("image_dimensions", (C35081lL[]) null, (C28371Vv[]) A0u.toArray(new C28371Vv[0]));
        C28371Vv r0 = new C28371Vv("token", r4.A04, (C35081lL[]) null);
        ArrayList A0u2 = AnonymousClass000.A0u();
        A0u2.add(r5);
        A0u2.add(r0);
        C17150uc r02 = this.A01;
        String A012 = r02.A07.A01(r4.A02);
        if (A012 != null) {
            AnonymousClass26X.A00("direct_connection_encrypted_info", A012, A0u2);
        }
        C35081lL[] r2 = new C35081lL[2];
        C35081lL.A02("op", "get", r2, 0);
        r2[1] = new C35081lL("id", r4.A03);
        C28371Vv r3 = new C28371Vv("order", r2, (C28371Vv[]) A0u2.toArray(new C28371Vv[0]));
        C35081lL[] r22 = new C35081lL[5];
        C35081lL.A02("smax_id", "5", r22, 0);
        C35081lL.A02("id", str, r22, 1);
        C35081lL.A02("xmlns", "fb:thrift_iq", r22, 2);
        C35081lL.A02("type", "get", r22, 3);
        return C28371Vv.A03(C34791ks.A00, r3, r22, 4);
    }

    public void APb(String str) {
        this.A04.A01("order_view_tag");
        StringBuilder A0r = AnonymousClass000.A0r("GetOrderProtocol/delivery-error with iqId ");
        A0r.append(str);
        Log.w(AnonymousClass000.A0h(">", A0r));
        this.A05.A01(new C802543d(str));
    }

    public void APn(UserJid userJid) {
        C34421kE.A00(C13690nt.A0I(421, "Failed to generate direct connection info"), this.A05, (Object) null);
        Log.i(AnonymousClass000.A0g("GetOrderProtocol/onDirectConnectionError/jid= ", userJid));
    }

    public void APo(UserJid userJid) {
        String A022 = this.A03.A02();
        this.A02.A02(this, A02(A022), A022, 248);
        Log.i(AnonymousClass000.A0g("GetOrderProtocol/onDirectConnectionSucceeded/Retrying with jid= ", userJid));
    }

    public void AQe(C28371Vv r5, String str) {
        this.A04.A01("order_view_tag");
        Pair A012 = C34451kH.A01(r5);
        if (A012 == null) {
            C34421kE.A00(C13690nt.A0I(C13680ns.A0Y(), "error code is null"), this.A05, (Object) null);
        } else if (!A01(this.A00.A02, AnonymousClass000.A0D(A012.first))) {
            C34421kE.A00(A012, this.A05, (Object) null);
            StringBuilder A0r = AnonymousClass000.A0r("GetOrderProtocol/response-error with iqId <");
            A0r.append(str);
            Log.w(AnonymousClass000.A0e(A012, "> and error ", A0r));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r29, java.lang.String r30) {
        /*
            r28 = this;
            r2 = r28
            X.0x0 r1 = r2.A04
            java.lang.String r0 = "order_view_tag"
            r1.A01(r0)
            X.4DC r5 = r2.A01
            java.lang.String r0 = "order"
            r1 = r29
            X.1Vv r4 = r1.A0J(r0)
            if (r4 == 0) goto L_0x0120
            java.lang.String r7 = "id"
            r1 = 0
            java.lang.String r24 = r4.A0N(r7, r1)
            java.lang.String r0 = "creation_ts"
            java.lang.String r15 = r4.A0N(r0, r1)
            java.lang.String r0 = "product"
            java.util.List r0 = r4.A0O(r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            java.util.Iterator r14 = r0.iterator()
        L_0x0030:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00fc
            X.1Vv r8 = X.C13690nt.A0S(r14)
            X.1Vv r13 = r8.A0J(r7)
            java.lang.String r0 = "name"
            X.1Vv r11 = r8.A0J(r0)
            java.lang.String r0 = "price"
            X.1Vv r12 = r8.A0J(r0)
            java.lang.String r0 = "currency"
            X.1Vv r6 = r8.A0J(r0)
            java.lang.String r0 = "image"
            X.1Vv r9 = r8.A0J(r0)
            java.lang.String r0 = "quantity"
            X.1Vv r1 = r8.A0J(r0)
            java.lang.String r0 = "status"
            X.1Vv r10 = r8.A0J(r0)
            r8 = 0
            if (r13 != 0) goto L_0x00f6
            r19 = r8
        L_0x0068:
            if (r11 != 0) goto L_0x00f0
            r20 = r8
        L_0x006c:
            if (r1 != 0) goto L_0x00eb
            r11 = r8
        L_0x006f:
            if (r6 == 0) goto L_0x00e9
            java.lang.String r0 = r6.A0L()
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = r6.A0L()
            X.1sq r6 = new X.1sq
            r6.<init>(r0)
        L_0x0084:
            r21 = 0
            if (r12 == 0) goto L_0x0098
            java.lang.String r0 = r12.A0L()
            if (r0 == 0) goto L_0x0098
            if (r6 == 0) goto L_0x0098
            long r0 = java.lang.Long.parseLong(r0)
            java.math.BigDecimal r21 = X.C39641sp.A00(r6, r0)
        L_0x0098:
            if (r10 != 0) goto L_0x00e4
            r1 = 0
        L_0x009b:
            java.lang.String r0 = "deleted"
            boolean r0 = r0.equalsIgnoreCase(r1)
            boolean r23 = X.AnonymousClass000.A1O(r0)
            r1 = 0
            if (r9 == 0) goto L_0x00c5
            X.1Vv r10 = r9.A0J(r7)
            java.lang.String r0 = "url"
            X.1Vv r9 = r9.A0J(r0)
            if (r10 != 0) goto L_0x00df
            r0 = r8
        L_0x00b6:
            if (r9 == 0) goto L_0x00bc
            java.lang.String r8 = r9.A0L()
        L_0x00bc:
            if (r0 == 0) goto L_0x00c5
            if (r8 == 0) goto L_0x00c5
            X.4jP r1 = new X.4jP
            r1.<init>(r0, r8)
        L_0x00c5:
            if (r19 == 0) goto L_0x0030
            if (r20 == 0) goto L_0x0030
            if (r11 == 0) goto L_0x0030
            int r22 = java.lang.Integer.parseInt(r11)
            X.1mJ r0 = new X.1mJ
            r17 = r1
            r18 = r6
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r3.add(r0)
            goto L_0x0030
        L_0x00df:
            java.lang.String r0 = r10.A0L()
            goto L_0x00b6
        L_0x00e4:
            java.lang.String r1 = r10.A0L()
            goto L_0x009b
        L_0x00e9:
            r6 = 0
            goto L_0x0084
        L_0x00eb:
            java.lang.String r11 = r1.A0L()
            goto L_0x006f
        L_0x00f0:
            java.lang.String r20 = r11.A0L()
            goto L_0x006c
        L_0x00f6:
            java.lang.String r19 = r13.A0L()
            goto L_0x0068
        L_0x00fc:
            r26 = 0
            boolean r0 = X.AnonymousClass1ZW.A0E(r15)
            if (r0 != 0) goto L_0x0108
            long r26 = java.lang.Long.parseLong(r15)
        L_0x0108:
            X.4PS r1 = r5.A00
            java.lang.String r0 = "price"
            X.1Vv r0 = r4.A0J(r0)
            X.4K9 r23 = r1.A00(r0)
            if (r24 == 0) goto L_0x0120
            X.4Lt r1 = new X.4Lt
            r25 = r3
            r22 = r1
            r22.<init>(r23, r24, r25, r26)
            goto L_0x0121
        L_0x0120:
            r1 = 0
        L_0x0121:
            r3 = 0
            if (r1 == 0) goto L_0x012a
            X.1kE r0 = r2.A05
            X.C34421kE.A00(r3, r0, r1)
            return
        L_0x012a:
            X.1kE r2 = r2.A05
            java.lang.Integer r1 = X.C13680ns.A0Y()
            java.lang.String r0 = "order is null"
            android.util.Pair r0 = X.C13690nt.A0I(r1, r0)
            X.C34421kE.A00(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59492yN.AYG(X.1Vv, java.lang.String):void");
    }
}

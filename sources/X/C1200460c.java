package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.60c  reason: invalid class name and case insensitive filesystem */
public class C1200460c implements C227619e {
    public final AnonymousClass160 A00;
    public final C119315wt A01;
    public final C116045qj A02;
    public final C118335uW A03;

    public C1200460c(AnonymousClass160 r1, C119315wt r2, C116045qj r3, C118335uW r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public C35081lL A9Q(String str) {
        C39901tF r2;
        C35391lr r0 = (C35391lr) this.A00.A08(str);
        if (!(r0 == null || (r2 = r0.A08) == null)) {
            C111815hS r22 = (C111815hS) r2;
            String A002 = this.A03.A00(r0.A01);
            if ("VISA".equals(r22.A03)) {
                C119315wt r6 = this.A01;
                String str2 = r22.A06;
                try {
                    JSONObject A0J = C13700nu.A0J();
                    A0J.put("alg", "PS256");
                    A0J.put("typ", "JOSE");
                    A0J.put("kid", A002);
                    A0J.put("iat", C110105dW.A03(r6.A00));
                    String A06 = r6.A06(A0J.toString(), C119315wt.A00(A002, (String) null, str2));
                    if (A06 != null) {
                        return new C35081lL("trusted-device-info", A06);
                    }
                } catch (JSONException e2) {
                    Log.w("PAY: generateTrustedDeviceInfoJwsToken threw creating json string: ", e2);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r2 != 20923) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String AGg(android.content.res.Resources r5, X.AnonymousClass1Vt r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r1 = r6.A0J
            r3 = 0
            if (r1 == 0) goto L_0x0071
            r0 = -1
            int r2 = X.C29501aj.A00(r1, r0)
            int r1 = r6.A02
            r0 = 406(0x196, float:5.69E-43)
            if (r1 == r0) goto L_0x001c
            r0 = 407(0x197, float:5.7E-43)
            if (r1 == r0) goto L_0x001c
            r0 = 13
            if (r1 == r0) goto L_0x001c
            r0 = 14
            if (r1 != r0) goto L_0x0071
        L_0x001c:
            X.5qj r1 = r4.A02
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r2 == r0) goto L_0x004d
            r0 = 4002(0xfa2, float:5.608E-42)
            if (r2 == r0) goto L_0x0047
            r0 = 10242(0x2802, float:1.4352E-41)
            if (r2 == r0) goto L_0x0053
            r0 = 20884(0x5194, float:2.9265E-41)
            if (r2 == r0) goto L_0x0041
            r1 = 20923(0x51bb, float:2.932E-41)
            r0 = 2131890008(0x7f120f58, float:1.9414696E38)
            if (r2 == r1) goto L_0x003c
        L_0x0035:
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r2 != r0) goto L_0x005f
            r0 = 2131890007(0x7f120f57, float:1.9414694E38)
        L_0x003c:
            java.lang.String r0 = r5.getString(r0)
            return r0
        L_0x0041:
            X.0tz r1 = r1.A00
            r0 = 2131887025(0x7f1203b1, float:1.9408645E38)
            goto L_0x0058
        L_0x0047:
            X.0tz r1 = r1.A00
            r0 = 2131886193(0x7f120071, float:1.9406958E38)
            goto L_0x0058
        L_0x004d:
            X.0tz r1 = r1.A00
            r0 = 2131889044(0x7f120b94, float:1.941274E38)
            goto L_0x0058
        L_0x0053:
            X.0tz r1 = r1.A00
            r0 = 2131889691(0x7f120e1b, float:1.9414053E38)
        L_0x0058:
            java.lang.String r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0035
            return r0
        L_0x005f:
            java.lang.String r0 = "BrazilTransactionHelper/getTransactionStatusDetail : unhandled error code ("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0071:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1200460c.AGg(android.content.res.Resources, X.1Vt, java.lang.String):java.lang.String");
    }

    public boolean AJk() {
        return true;
    }
}

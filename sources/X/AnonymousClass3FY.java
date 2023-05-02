package X;

import com.mod2.fblibs.Facebook;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3FY  reason: invalid class name */
public class AnonymousClass3FY implements AnonymousClass5SY {
    public final AnonymousClass2HW A00;
    public final AnonymousClass144 A01;
    public final AnonymousClass01D A02;

    public AnonymousClass3FY(AnonymousClass2HW r1, AnonymousClass144 r2, AnonymousClass01D r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void APY() {
        Log.e("FBUserEntityManagement : Network failed while sending the payload");
        this.A00.APY();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r2 instanceof java.security.cert.CertificateExpiredException) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AQa(java.lang.Exception r2) {
        /*
            r1 = this;
            java.lang.String r0 = "FBUserEntityManagement : On error response while sending the payload"
            com.whatsapp.util.Log.e(r0, r2)
            boolean r0 = r2 instanceof X.C48802Pe
            if (r0 == 0) goto L_0x0022
            r0 = r2
            X.2Pe r0 = (X.C48802Pe) r0
            X.1Vv r0 = r0.node
            int r0 = X.C34451kH.A00(r0)
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "no code present"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0019:
            X.AnonymousClass00B.A0E(r2)
        L_0x001c:
            X.2HW r0 = r1.A00
            r0.AQa(r2)
            return
        L_0x0022:
            boolean r0 = r2 instanceof java.security.cert.CertificateExpiredException
            if (r0 == 0) goto L_0x0019
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FY.AQa(java.lang.Exception):void");
    }

    public final void AY5(AnonymousClass28T r8) {
        boolean z2;
        AnonymousClass14K r3 = (AnonymousClass14K) this.A02.get();
        if (r8 != null) {
            Map A03 = r3.A03();
            try {
                String str = r8.A01.A00;
                JSONObject A0J = C13700nu.A0J();
                Object obj = r8.A03.A00;
                AnonymousClass00B.A06(obj);
                JSONObject put = A0J.put("fbid", C13700nu.A01(obj));
                Object obj2 = r8.A04.A00;
                AnonymousClass00B.A06(obj2);
                JSONObject put2 = put.put("password", obj2);
                Object obj3 = r8.A02.A00;
                AnonymousClass00B.A06(obj3);
                A03.put(str, put2.put(Facebook.TOKEN, obj3).put("timestamp", r8.A00).put("ttl", r8.A05).put("analytics_claim", r8.A06).put("usertype", str).toString());
                ((AnonymousClass14B) r3.A05.get()).A01(r3.A01(AnonymousClass14K.A00(A03).toString()));
            } catch (JSONException e2) {
                AnonymousClass00B.A0E(e2);
                z2 = false;
            }
        } else {
            r3.A04(this.A01);
        }
        z2 = true;
        AnonymousClass2HW r1 = this.A00;
        if (z2) {
            r1.AY5(r8);
        } else {
            r1.AQa(AnonymousClass000.A0V("Unable to perform operation."));
        }
    }
}

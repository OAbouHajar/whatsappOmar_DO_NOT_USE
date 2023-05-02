package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3GS  reason: invalid class name */
public class AnonymousClass3GS implements C19550yc {
    public final UserJid A00;
    public final C17190ug A01;
    public final C34421kE A02 = new C34421kE();

    public AnonymousClass3GS(UserJid userJid, C17190ug r3) {
        this.A01 = r3;
        this.A00 = userJid;
    }

    public void APb(String str) {
        StringBuilder A0r = AnonymousClass000.A0r("GetBusinessComplianceDetailProtocol/delivery-error with iqId ");
        A0r.append(str);
        Log.w(AnonymousClass000.A0h(">", A0r));
        this.A02.A01(new C802543d(str));
    }

    public void AQe(C28371Vv r5, String str) {
        Pair A012 = C34451kH.A01(r5);
        if (A012 != null) {
            C34421kE.A00(A012, this.A02, (Object) null);
            StringBuilder A0r = AnonymousClass000.A0r("GetBusinessComplianceDetailProtocol/response-error with iqId <");
            A0r.append(str);
            Log.w(AnonymousClass000.A0e(A012, "> and error ", A0r));
            return;
        }
        C34421kE.A00(C13690nt.A0I(C13680ns.A0Y(), "error code is null"), this.A02, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4jZ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "merchant_info"
            X.1Vv r3 = r14.A0J(r0)
            r12 = 0
            if (r3 == 0) goto L_0x00b2
            java.lang.String r0 = "entity_name"
            X.1Vv r2 = r3.A0J(r0)
            java.lang.String r0 = "entity_type"
            X.1Vv r1 = r3.A0J(r0)
            java.lang.String r0 = "entity_type_custom"
            X.1Vv r0 = r3.A0J(r0)
            if (r2 == 0) goto L_0x00ca
            java.lang.String r10 = r2.A0L()
        L_0x0021:
            if (r1 == 0) goto L_0x00c7
            java.lang.String r11 = r1.A0L()
        L_0x0027:
            if (r0 == 0) goto L_0x002d
            java.lang.String r12 = r0.A0L()
        L_0x002d:
            java.lang.String r0 = "is_registered"
            r7 = 0
            java.lang.String r0 = r3.A0N(r0, r7)
            boolean r6 = java.lang.Boolean.parseBoolean(r0)
            java.lang.String r0 = "customer_care_details"
            X.1Vv r2 = r3.A0J(r0)
            java.lang.String r0 = "grievance_officer_details"
            X.1Vv r3 = r3.A0J(r0)
            r5 = 0
            if (r2 == 0) goto L_0x0070
            java.lang.String r0 = "email"
            X.1Vv r1 = r2.A0J(r0)
            java.lang.String r0 = "landline_number"
            X.1Vv r4 = r2.A0J(r0)
            java.lang.String r0 = "mobile_number"
            X.1Vv r2 = r2.A0J(r0)
            if (r1 == 0) goto L_0x00c5
            java.lang.String r1 = r1.A0L()
        L_0x005f:
            if (r4 == 0) goto L_0x00c3
            java.lang.String r0 = r4.A0L()
        L_0x0065:
            if (r2 == 0) goto L_0x006b
            java.lang.String r5 = r2.A0L()
        L_0x006b:
            X.4jS r7 = new X.4jS
            r7.<init>(r1, r0, r5)
        L_0x0070:
            r5 = 0
            if (r3 == 0) goto L_0x00c1
            java.lang.String r0 = "name"
            X.1Vv r2 = r3.A0J(r0)
            java.lang.String r0 = "email"
            X.1Vv r1 = r3.A0J(r0)
            java.lang.String r0 = "landline_number"
            X.1Vv r4 = r3.A0J(r0)
            java.lang.String r0 = "mobile_number"
            X.1Vv r3 = r3.A0J(r0)
            if (r2 == 0) goto L_0x00bf
            java.lang.String r2 = r2.A0L()
        L_0x0091:
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = r1.A0L()
        L_0x0097:
            if (r4 == 0) goto L_0x00bb
            java.lang.String r0 = r4.A0L()
        L_0x009d:
            if (r3 == 0) goto L_0x00a3
            java.lang.String r5 = r3.A0L()
        L_0x00a3:
            X.4jU r8 = new X.4jU
            r8.<init>(r2, r1, r0, r5)
        L_0x00a8:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            X.4jZ r6 = new X.4jZ
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r12 = r6
        L_0x00b2:
            r3 = 0
            if (r12 == 0) goto L_0x00cd
            X.1kE r0 = r13.A02
            X.C34421kE.A00(r3, r0, r12)
            return
        L_0x00bb:
            r0 = r5
            goto L_0x009d
        L_0x00bd:
            r1 = r5
            goto L_0x0097
        L_0x00bf:
            r2 = r5
            goto L_0x0091
        L_0x00c1:
            r8 = r5
            goto L_0x00a8
        L_0x00c3:
            r0 = r7
            goto L_0x0065
        L_0x00c5:
            r1 = r7
            goto L_0x005f
        L_0x00c7:
            r11 = r12
            goto L_0x0027
        L_0x00ca:
            r10 = r12
            goto L_0x0021
        L_0x00cd:
            X.1kE r2 = r13.A02
            java.lang.Integer r1 = X.C13680ns.A0Y()
            java.lang.String r0 = "Merchant Info is Null"
            android.util.Pair r0 = X.C13690nt.A0I(r1, r0)
            X.C34421kE.A00(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GS.AYG(X.1Vv, java.lang.String):void");
    }
}

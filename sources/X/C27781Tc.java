package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Tc  reason: invalid class name and case insensitive filesystem */
public class C27781Tc {
    public final C17190ug A00;

    public C27781Tc(C17190ug r1) {
        this.A00 = r1;
    }

    public void A00(String str, int i2) {
        StringBuilder sb = new StringBuilder("sendmethods/sendSafetyNetVerifyAppsResult appsListSize=");
        sb.append("null");
        sb.append(" errorCode=");
        sb.append(i2);
        sb.append(" errorMessage=");
        sb.append(str);
        Log.i(sb.toString());
        C28371Vv r2 = new C28371Vv("error", str, new C35081lL[]{new C35081lL("code", Integer.toString(i2))});
        C32461gQ r0 = new C32461gQ("verify_apps");
        r0.A03(r2);
        C28371Vv A01 = r0.A01();
        C32461gQ r02 = new C32461gQ("ib");
        r02.A03(A01);
        this.A00.A0D(r02.A01(), 273);
    }

    public void A01(String str, String str2, int i2) {
        C28371Vv r2;
        StringBuilder sb = new StringBuilder("sendmethods/sendAttestationResult jws=");
        sb.append(str);
        sb.append(" errorCode=");
        sb.append(i2);
        sb.append(" errorMessage=");
        sb.append(str2);
        Log.i(sb.toString());
        if (str == null) {
            r2 = new C28371Vv("error", str2, new C35081lL[]{new C35081lL("code", Integer.toString(i2))});
        } else {
            r2 = new C28371Vv("jws", str, (C35081lL[]) null);
        }
        this.A00.A0D(new C28371Vv(new C28371Vv(r2, "attestation", (C35081lL[]) null), "ib", (C35081lL[]) null), 194);
    }
}

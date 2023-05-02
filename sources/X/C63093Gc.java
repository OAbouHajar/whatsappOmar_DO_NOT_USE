package X;

import com.facebook.redex.RunnableRunnableShape0S0300100_I0;
import com.whatsapp.util.Log;

/* renamed from: X.3Gc  reason: invalid class name and case insensitive filesystem */
public class C63093Gc implements C19550yc {
    public C16530tD A00;
    public final C17190ug A01;

    public C63093Gc(C17190ug r1) {
        this.A01 = r1;
    }

    public String A00(byte[] bArr, String str) {
        String str2;
        if (this.A00 == null) {
            str2 = "ACSSender/requestToSign need to set iq response listener first";
        } else {
            C17190ug r9 = this.A01;
            String A02 = r9.A02();
            C28371Vv r8 = new C28371Vv("blinded_credential", bArr, (C35081lL[]) null);
            C28371Vv r4 = new C28371Vv("project_name", str, (C35081lL[]) null);
            C35081lL[] r3 = new C35081lL[1];
            int A03 = C35081lL.A03("version", "2", r3);
            C28371Vv[] r1 = new C28371Vv[2];
            r1[A03] = r8;
            r1[1] = r4;
            C28371Vv r42 = new C28371Vv("sign_credential", r3, r1);
            C35081lL[] r32 = new C35081lL[4];
            C35081lL.A02("xmlns", "privatestats", r32, A03);
            C35081lL.A02("id", A02, r32, 1);
            C35081lL.A02("type", "get", r32, 2);
            if (r9.A0G(this, C28371Vv.A03(C34791ks.A00, r42, r32, 3), A02, 278, 32000)) {
                return A02;
            }
            str2 = "ACSSender/requestToSign failed to send iq request";
        }
        Log.e(str2);
        return null;
    }

    public void APb(String str) {
        Log.e(C13680ns.A0h("ACSSender/onDeliveryFailure iqId = ", str));
        C16530tD r2 = this.A00;
        if (r2 == null) {
            return;
        }
        if (!str.equalsIgnoreCase(r2.A0E)) {
            Log.e("ACSToken/onSendFailure mismatched iq id, reset");
            r2.A05.A01(12);
            r2.A00();
            return;
        }
        r2.A01(5);
    }

    public void AQe(C28371Vv r5, String str) {
        Log.e(C13680ns.A0h("ACSSender/onError iqId = ", str));
        C28371Vv A0K = r5.A0K("error");
        int A002 = C28371Vv.A00(A0K, "code");
        A0K.A0N("text", "");
        C16530tD r2 = this.A00;
        if (r2 == null) {
            return;
        }
        if (!str.equalsIgnoreCase(r2.A0E)) {
            Log.e("ACSToken/onIqResponseError mismatched iq id, reset");
            r2.A00();
        } else if (A002 == 500) {
            r2.A01(3);
        } else {
            Log.e("ACSToken/onIqResponseError iq errors, stop attempting to send iq");
            r2.A05.A01(11);
            r2.A02(false);
        }
    }

    public void AYG(C28371Vv r9, String str) {
        C28371Vv A0K = r9.A0K("sign_credential");
        long A0E = A0K.A0E(A0K.A0M("t"), "t");
        byte[] bArr = A0K.A0K("signed_credential").A01;
        byte[] bArr2 = A0K.A0K("acs_public_key").A01;
        C28371Vv A0J = A0K.A0J("dleq_proof");
        if (A0J != null) {
            A0J.A0K("c");
            A0J.A0K("s");
        }
        C16530tD r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                if (!str.equalsIgnoreCase(r2.A0E)) {
                    Log.e("ACSToken/onReceiveSignedToken iq requests messed up, reset");
                    r2.A00();
                } else if (bArr2 == null || bArr == null) {
                    r2.A05.A01(10);
                    r2.A02(false);
                } else {
                    r2.A09.execute(new RunnableRunnableShape0S0300100_I0(r2, bArr2, bArr, 1, A0E));
                }
            }
        }
    }
}

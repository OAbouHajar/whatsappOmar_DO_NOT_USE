package X;

import android.util.Base64;
import com.facebook.redex.RunnableRunnableShape0S0300100_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1Hc  reason: invalid class name and case insensitive filesystem */
public class C24741Hc implements C19550yc {
    public C16420t0 A00;
    public final C17190ug A01;

    public C24741Hc(C17190ug r1) {
        this.A01 = r1;
    }

    public String A00(byte[] bArr) {
        String str;
        if (this.A00 == null) {
            str = "PrivateStatsSender/requestToSign need to set iq response listener first";
        } else {
            C17190ug r8 = this.A01;
            String A02 = r8.A02();
            if (r8.A0G(this, new C28371Vv(new C28371Vv(new C28371Vv("blinded_credential", bArr, (C35081lL[]) null), "sign_credential", new C35081lL[]{new C35081lL("version", "1")}), "iq", new C35081lL[]{new C35081lL("id", A02), new C35081lL("xmlns", "privatestats"), new C35081lL("type", "get"), new C35081lL((Jid) C34791ks.A00, "to")}), A02, 239, 32000)) {
                return A02;
            }
            str = "PrivateStatsSender/requestToSign failed to send iq request";
        }
        Log.e(str);
        return null;
    }

    public void APb(String str) {
        StringBuilder sb = new StringBuilder("PrivateStatsSender/onDeliveryFailure iqId = ");
        sb.append(str);
        Log.e(sb.toString());
        C16420t0 r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                if (!str.equalsIgnoreCase(r2.A0C)) {
                    Log.e("PrivateStats/onSendFailure mismatched iq id, reset");
                    r2.A05.A03(12);
                    r2.A02();
                } else {
                    r2.A03(5);
                }
            }
        }
    }

    public void AQe(C28371Vv r5, String str) {
        StringBuilder sb = new StringBuilder("PrivateStatsSender/onError iqId = ");
        sb.append(str);
        Log.e(sb.toString());
        C28371Vv A0K = r5.A0K("error");
        int A0B = A0K.A0B(A0K.A0M("code"), "code");
        A0K.A0N("text", "");
        C16420t0 r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                if (!str.equalsIgnoreCase(r2.A0C)) {
                    Log.e("PrivateStats/onIqResponseError mismatched iq id, reset");
                    r2.A02();
                } else if (A0B == 500) {
                    r2.A03(3);
                } else {
                    Log.e("PrivateStats/onIqResponseError iq errors, stop attempting to send iq");
                    r2.A05.A03(11);
                    r2.A06(false, 2);
                }
            }
        }
    }

    public void AYG(C28371Vv r12, String str) {
        C28371Vv A0K = r12.A0K("sign_credential");
        long A0E = A0K.A0E(A0K.A0M("t"), "t");
        byte[] bArr = A0K.A0K("signed_credential").A01;
        byte[] bArr2 = A0K.A0K("acs_public_key").A01;
        C28371Vv A0J = A0K.A0J("dleq_proof");
        if (A0J != null) {
            C28371Vv A0K2 = A0J.A0K("c");
            C28371Vv A0K3 = A0J.A0K("s");
            C16420t0 r5 = this.A00;
            if (r5 != null) {
                byte[] bArr3 = A0K2.A01;
                byte[] bArr4 = A0K3.A01;
                synchronized (r5) {
                    if (bArr3 != null) {
                        r5.A05.A05("dleq_proof_c", Base64.encodeToString(bArr3, 10));
                    }
                    if (bArr4 != null) {
                        r5.A05.A05("dleq_proof_s", Base64.encodeToString(bArr4, 10));
                    }
                }
            }
        }
        C16420t0 r52 = this.A00;
        if (r52 != null) {
            synchronized (r52) {
                if (!str.equalsIgnoreCase(r52.A0C)) {
                    Log.e("PrivateStatsToken/onReceiveSignedToken iq requests messed up, reset");
                    r52.A02();
                } else if (bArr2 == null || bArr == null) {
                    r52.A05.A03(10);
                    r52.A06(false, 3);
                } else {
                    r52.A07.Acl(new RunnableRunnableShape0S0300100_I0(r52, bArr2, bArr, 2, A0E));
                }
            }
        }
    }
}

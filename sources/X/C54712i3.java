package X;

import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2i3  reason: invalid class name and case insensitive filesystem */
public class C54712i3 implements C19550yc {
    public final C14870pt A00;
    public final C17190ug A01;
    public final AnonymousClass2RO A02;

    public C54712i3(C14870pt r1, C17190ug r2, AnonymousClass2RO r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A00(int i2) {
        this.A00.Acq(new RunnableRunnableShape10S0200000_I0_8(this, 10, new AnonymousClass2RN((UserJid) null, (String) null, (String) null, -1, i2)));
    }

    public void APb(String str) {
        Log.e("sendScanContactQr/delivery-error");
        A00(408);
    }

    public void AQe(C28371Vv r2, String str) {
        Log.e("sendScanContactQr/response-error");
        A00(C34451kH.A00(r2));
    }

    public void AYG(C28371Vv r10, String str) {
        String str2;
        int i2;
        C28371Vv A0J = r10.A0J("qr");
        if (A0J != null) {
            String A0N = A0J.A0N("jid", (String) null);
            String A0N2 = A0J.A0N("notify", (String) null);
            UserJid nullable = UserJid.getNullable(A0N);
            if (nullable == null) {
                str2 = "sendScanContactQr/error: invalid jid";
            } else {
                String A0N3 = A0J.A0N("type", (String) null);
                String str3 = null;
                if ("contact".equals(A0N3)) {
                    i2 = 0;
                } else if ("subscribe".equals(A0N3)) {
                    i2 = 1;
                } else if ("message".equals(A0N3)) {
                    C28371Vv A0J2 = A0J.A0J("message");
                    if (A0J2 != null) {
                        str3 = A0J2.A0L();
                    }
                    i2 = 2;
                } else {
                    StringBuilder sb = new StringBuilder("sendScanContactQr/error: invalid type ");
                    sb.append(A0N3);
                    str2 = sb.toString();
                }
                Log.e("sendScanContactQr/success");
                this.A00.Acq(new RunnableRunnableShape10S0200000_I0_8(this, 10, new AnonymousClass2RN(nullable, A0N2, str3, i2, 0)));
                return;
            }
        } else {
            str2 = "sendScanContactQr/error: missing node";
        }
        Log.e(str2);
        A00(0);
    }
}

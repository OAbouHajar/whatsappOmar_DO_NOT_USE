package X;

import com.facebook.redex.RunnableRunnableShape1S1101000_I1;
import com.whatsapp.util.Log;

/* renamed from: X.51F  reason: invalid class name */
public class AnonymousClass51F implements C19550yc {
    public final C14870pt A00;
    public final C17190ug A01;
    public final AnonymousClass4L2 A02;

    public AnonymousClass51F(C14870pt r1, C17190ug r2, AnonymousClass4L2 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void APb(String str) {
        Log.e("sendGetContactQrCode/delivery-error");
        this.A00.Acq(new RunnableRunnableShape1S1101000_I1(this, (String) null, 0, 3));
    }

    public void AQe(C28371Vv r6, String str) {
        Log.e("sendGetContactQrCode/response-error");
        this.A00.Acq(new RunnableRunnableShape1S1101000_I1(this, (String) null, C34451kH.A00(r6), 3));
    }

    public void AYG(C28371Vv r6, String str) {
        String str2;
        String str3;
        C28371Vv A0J = r6.A0J("qr");
        if (A0J == null || !"contact".equals(A0J.A0N("type", (String) null))) {
            str2 = null;
            str3 = "sendGetContactQrCode/error: invalid response";
        } else {
            str2 = A0J.A0N("code", (String) null);
            if (str2 != null) {
                str3 = "sendGetContactQrCode/success";
            }
            str3 = "sendGetContactQrCode/error: invalid response";
        }
        Log.e(str3);
        this.A00.Acq(new RunnableRunnableShape1S1101000_I1(this, str2, 0, 3));
    }
}

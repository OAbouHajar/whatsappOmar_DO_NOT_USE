package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.obwhatsapp.registration.VerifyPhoneNumber;
import java.lang.ref.WeakReference;

/* renamed from: X.3Ly  reason: invalid class name and case insensitive filesystem */
public class C63903Ly extends Handler {
    public final C47062Hi A00;
    public final AnonymousClass130 A01;
    public final String A02;
    public final String A03;
    public final WeakReference A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63903Ly(Looper looper, VerifyPhoneNumber verifyPhoneNumber, C47062Hi r4, AnonymousClass130 r5, String str, String str2) {
        super(looper);
        AnonymousClass00B.A06(looper);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r5;
        this.A00 = r4;
        this.A04 = C13690nt.A0h(verifyPhoneNumber);
    }

    public void handleMessage(Message message) {
        VerifyPhoneNumber verifyPhoneNumber;
        if (message.what == 1 && (verifyPhoneNumber = (VerifyPhoneNumber) this.A04.get()) != null) {
            String str = this.A02;
            String str2 = this.A03;
            AnonymousClass00B.A06(str2);
            verifyPhoneNumber.A3d(C47052Hh.RETRIED, this.A00, (String) message.obj, str, str2, "sms", (String) null);
        }
    }
}

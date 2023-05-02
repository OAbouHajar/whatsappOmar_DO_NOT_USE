package X;

import android.os.CountDownTimer;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;

/* renamed from: X.3Le  reason: invalid class name and case insensitive filesystem */
public class C63703Le extends CountDownTimer {
    public final /* synthetic */ VerifyPhoneNumber A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63703Le(VerifyPhoneNumber verifyPhoneNumber, long j2) {
        super(j2, 1000);
        this.A00 = verifyPhoneNumber;
    }

    public void onFinish() {
        Log.i("verifyphonenumber/primary-flash-call-timer-finish");
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        verifyPhoneNumber.A0G = null;
        verifyPhoneNumber.A3J();
        if (verifyPhoneNumber.A09.A00() == 8) {
            verifyPhoneNumber.A3a(verifyPhoneNumber.A15.A00(), verifyPhoneNumber.A15.A01());
        }
    }

    public void onTick(long j2) {
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        if (verifyPhoneNumber.A09 == AnonymousClass1NO.A0L) {
            verifyPhoneNumber.A3J();
            verifyPhoneNumber.A3U(R.string.str198e);
        }
        verifyPhoneNumber.A09 -= 1000;
    }
}

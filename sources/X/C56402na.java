package X;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;

/* renamed from: X.2na  reason: invalid class name and case insensitive filesystem */
public class C56402na extends CountDownTimer {
    public final /* synthetic */ long A00;
    public final /* synthetic */ VerifyPhoneNumber A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56402na(VerifyPhoneNumber verifyPhoneNumber, long j2, long j3) {
        super(j2, 1000);
        this.A01 = verifyPhoneNumber;
        this.A00 = j3;
    }

    public void onFinish() {
        VerifyPhoneNumber verifyPhoneNumber = this.A01;
        verifyPhoneNumber.A0F = null;
        if (verifyPhoneNumber.A0u.A04()) {
            verifyPhoneNumber.A0u.A03(true);
        } else {
            verifyPhoneNumber.A0V.setEnabled(true);
        }
        verifyPhoneNumber.A0R.setProgress(100);
        if (verifyPhoneNumber.A0u.A04()) {
            verifyPhoneNumber.A0R.setVisibility(8);
        }
        verifyPhoneNumber.A0T.setText(C13680ns.A0d(verifyPhoneNumber, Integer.valueOf(VerifyPhoneNumber.A1T), new Object[1], 0, R.string.str198a));
        verifyPhoneNumber.A1G = false;
        verifyPhoneNumber.A15.A03();
        String A02 = verifyPhoneNumber.A15.A02(verifyPhoneNumber.A1C, verifyPhoneNumber.A1D);
        if (A02 != null) {
            Log.i("verifyphonenumber/countdowntimer/done/try-savedcode");
            verifyPhoneNumber.A01 = 0;
            String str = verifyPhoneNumber.A1C;
            String str2 = verifyPhoneNumber.A1D;
            AnonymousClass00B.A06(str2);
            verifyPhoneNumber.A3d(C47052Hh.TAPPED_LINK, verifyPhoneNumber.A16, A02, str, str2, "sms", (String) null);
        }
    }

    public void onTick(long j2) {
        ProgressBar progressBar = this.A01.A0R;
        long j3 = this.A00;
        progressBar.setProgress((int) ((((double) (j3 - j2)) * 100.0d) / ((double) j3)));
    }
}

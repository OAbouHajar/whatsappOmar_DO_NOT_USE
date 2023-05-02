package X;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.VerifyTwoFactorAuth;

/* renamed from: X.3Lg  reason: invalid class name and case insensitive filesystem */
public class C63723Lg extends CountDownTimer {
    public final /* synthetic */ long A00;
    public final /* synthetic */ VerifyTwoFactorAuth A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63723Lg(VerifyTwoFactorAuth verifyTwoFactorAuth, long j2, long j3) {
        super(j2, 1000);
        this.A01 = verifyTwoFactorAuth;
        this.A00 = j3;
    }

    public void onFinish() {
        VerifyTwoFactorAuth verifyTwoFactorAuth = this.A01;
        CountDownTimer countDownTimer = verifyTwoFactorAuth.A06;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            verifyTwoFactorAuth.A06 = null;
        }
        verifyTwoFactorAuth.A0A.setEnabled(true);
        verifyTwoFactorAuth.A07.setProgress(100);
        verifyTwoFactorAuth.A08.setVisibility(4);
        verifyTwoFactorAuth.A08.setText(C13680ns.A0d(verifyTwoFactorAuth, 6, new Object[1], 0, R.string.str1848));
        verifyTwoFactorAuth.getPreferences(0).edit().remove("code_retry_time").apply();
    }

    public void onTick(long j2) {
        ProgressBar progressBar = this.A01.A07;
        long j3 = this.A00;
        progressBar.setProgress((int) ((((double) (j3 - j2)) * 100.0d) / ((double) j3)));
    }
}

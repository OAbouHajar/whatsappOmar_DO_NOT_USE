package X;

import android.os.CountDownTimer;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.spamwarning.SpamWarningActivity;

/* renamed from: X.3Lh  reason: invalid class name and case insensitive filesystem */
public class C63733Lh extends CountDownTimer {
    public final /* synthetic */ CircularProgressBar A00;
    public final /* synthetic */ SpamWarningActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63733Lh(CircularProgressBar circularProgressBar, SpamWarningActivity spamWarningActivity, long j2) {
        super(j2, 10);
        this.A01 = spamWarningActivity;
        this.A00 = circularProgressBar;
    }

    public void onFinish() {
        this.A01.finish();
    }

    public void onTick(long j2) {
        int i2 = (int) j2;
        SpamWarningActivity spamWarningActivity = this.A01;
        CircularProgressBar circularProgressBar = this.A00;
        circularProgressBar.setCenterText(C28961Zl.A04(spamWarningActivity.A01, (long) (i2 / 1000)));
        circularProgressBar.setProgress(i2);
    }
}

package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;

/* renamed from: X.3Lm  reason: invalid class name and case insensitive filesystem */
public class C63783Lm extends Handler {
    public final /* synthetic */ VerifyTwoFactorAuthCodeDialogFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63783Lm(Looper looper, VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment) {
        super(looper);
        this.A00 = verifyTwoFactorAuthCodeDialogFragment;
    }

    public void handleMessage(Message message) {
        if (message.what == 0) {
            VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = this.A00;
            if (verifyTwoFactorAuthCodeDialogFragment.A00 == 0) {
                verifyTwoFactorAuthCodeDialogFragment.A07.Aco(new RunnableRunnableShape0S1100000_I0(4, (String) message.obj, verifyTwoFactorAuthCodeDialogFragment));
            }
        }
    }
}

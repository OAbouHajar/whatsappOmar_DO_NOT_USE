package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.obwhatsapp.R;
import com.obwhatsapp.account.delete.DeleteAccountFeedback;
import com.obwhatsapp.phonematching.ConnectionUnavailableDialogFragment;
import com.obwhatsapp.phonematching.MatchPhoneNumberFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2ng  reason: invalid class name and case insensitive filesystem */
public final class C56462ng extends Handler {
    public final C108135Mu A00;
    public final WeakReference A01;

    public C56462ng(C14530pL r2, C108135Mu r3) {
        super(Looper.getMainLooper());
        this.A01 = C13690nt.A0h(r2);
        this.A00 = r3;
    }

    public void handleMessage(Message message) {
        C14530pL r4 = (C14530pL) this.A01.get();
        if (r4 == null) {
            Log.w(AnonymousClass000.A0g("MatchPhoneNumberFragment was garbage collected with active messages still enqueued: ", message));
        }
        int i2 = message.what;
        if (i2 == 1) {
            Log.i("MatchPhoneNumberFragment/check-number/match");
            removeMessages(4);
            if (r4 != null) {
                MatchPhoneNumberFragment.A01(r4);
                C14550pN r2 = (C14550pN) this.A00;
                r2.A2X(new Intent(r2, DeleteAccountFeedback.class), true);
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                Log.e("MatchPhoneNumberFragment/error");
            } else if (i2 == 4) {
                Log.w("MatchPhoneNumberFragment/timeout");
                removeMessages(4);
            } else {
                return;
            }
            if (r4 != null) {
                MatchPhoneNumberFragment.A01(r4);
                Bundle A0D = C13690nt.A0D();
                ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment = new ConnectionUnavailableDialogFragment();
                connectionUnavailableDialogFragment.A0T(A0D);
                connectionUnavailableDialogFragment.A1G(r4.AGM(), "CONNECTION ERROR");
            }
        } else {
            Log.w("MatchPhoneNumberFragment/check-number/mismatch");
            removeMessages(4);
            if (r4 != null) {
                MatchPhoneNumberFragment.A01(r4);
                ((C14550pN) this.A00).Afg(R.string.str067a);
            }
        }
    }
}

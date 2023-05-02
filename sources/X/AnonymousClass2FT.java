package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.EditText;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.ChangeNumber;
import com.whatsapp.util.Log;

/* renamed from: X.2FT  reason: invalid class name */
public class AnonymousClass2FT extends Handler {
    public final /* synthetic */ ChangeNumber A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2FT(Looper looper, ChangeNumber changeNumber) {
        super(looper);
        this.A00 = changeNumber;
    }

    public void handleMessage(Message message) {
        EditText editText;
        int i2 = message.what;
        if (i2 == 1) {
            Log.w("changenumber/check-number/match");
            ChangeNumber changeNumber = this.A00;
            changeNumber.A0J.removeMessages(4);
            changeNumber.A05.Acl(new RunnableRunnableShape13S0100000_I0_12((Object) this, 12));
            if (!ChangeNumber.A0N.equals(AnonymousClass2F3.A0V)) {
                AnonymousClass29T.A00(changeNumber, 1);
                AnonymousClass29T.A01(changeNumber, 2);
                AnonymousClass4OJ r0 = changeNumber.A0G;
                if (r0 != null) {
                    editText = r0.A02;
                } else {
                    return;
                }
            } else {
                changeNumber.A39();
                return;
            }
        } else if (i2 == 2) {
            Log.w("changenumber/check-number/mismatch");
            ChangeNumber changeNumber2 = this.A00;
            changeNumber2.A0J.removeMessages(4);
            AnonymousClass29T.A00(changeNumber2, 1);
            changeNumber2.Afg(R.string.str067a);
            AnonymousClass4OJ r02 = changeNumber2.A0G;
            if (r02 != null) {
                editText = r02.A03;
            } else {
                return;
            }
        } else if (i2 == 3) {
            Log.e("changenumber/error");
            ChangeNumber changeNumber3 = this.A00;
            AnonymousClass29T.A00(changeNumber3, 1);
            AnonymousClass29T.A01(changeNumber3, 109);
            return;
        } else if (i2 == 4) {
            Log.e("changenumber/timeout");
            ChangeNumber changeNumber4 = this.A00;
            changeNumber4.A0J.removeMessages(4);
            AnonymousClass29T.A00(changeNumber4, 1);
            AnonymousClass29T.A01(changeNumber4, 109);
            return;
        } else {
            return;
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }
}

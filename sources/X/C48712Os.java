package X;

import android.telephony.PhoneStateListener;
import com.whatsapp.util.Log;

/* renamed from: X.2Os  reason: invalid class name and case insensitive filesystem */
public class C48712Os extends PhoneStateListener {
    public final /* synthetic */ C19610yi A00;

    public C48712Os(C19610yi r1) {
        this.A00 = r1;
    }

    public void onCallStateChanged(int i2, String str) {
        String str2;
        if (i2 == 0) {
            str2 = "phone/state idle";
        } else if (i2 == 1) {
            Log.i("phone/state ringing");
            this.A00.A04();
            return;
        } else if (i2 == 2) {
            str2 = "phone/state offhook";
        } else {
            return;
        }
        Log.i(str2);
    }
}

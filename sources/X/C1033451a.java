package X;

import android.os.Handler;
import com.obwhatsapp.registration.ChangeNumber;

/* renamed from: X.51a  reason: invalid class name and case insensitive filesystem */
public class C1033451a implements C53912gV {
    public final /* synthetic */ ChangeNumber A00;

    public C1033451a(ChangeNumber changeNumber) {
        this.A00 = changeNumber;
    }

    public void AU3(int i2) {
        this.A00.A0J.sendEmptyMessage(3);
    }

    public void AU4(String str) {
        Handler handler;
        int i2;
        ChangeNumber changeNumber = this.A00;
        String A06 = changeNumber.A01.A06();
        if (A06 == null || !A06.equals(str)) {
            handler = changeNumber.A0J;
            i2 = 2;
        } else {
            handler = changeNumber.A0J;
            i2 = 1;
        }
        handler.sendEmptyMessage(i2);
    }
}

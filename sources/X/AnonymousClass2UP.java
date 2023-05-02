package X;

import com.whatsapp.util.Log;

/* renamed from: X.2UP  reason: invalid class name */
public class AnonymousClass2UP {
    public final /* synthetic */ AnonymousClass2Ui A00;

    public AnonymousClass2UP(AnonymousClass2Ui r1) {
        this.A00 = r1;
    }

    public void A00(int i2) {
        StringBuilder sb = new StringBuilder("CompanionDeviceQrHandler/onError code=");
        sb.append(i2);
        Log.i(sb.toString());
        AnonymousClass2Ui r3 = this.A00;
        AnonymousClass2UO r1 = r3.A01;
        if (r1 != null) {
            r1.A02 = false;
        }
        C19410yO r2 = r3.A0E;
        synchronized (r2.A0O) {
            r2.A01 = null;
        }
        r3.A00 = null;
        r3.A0G.AQR(i2);
    }
}

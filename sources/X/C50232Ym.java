package X;

import android.content.Context;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

/* renamed from: X.2Ym  reason: invalid class name and case insensitive filesystem */
public final class C50232Ym implements AnonymousClass01J {
    public final int A00;
    public final AnonymousClass2YU A01;
    public final C16150sX A02;

    public C50232Ym(AnonymousClass2YU r1, C16150sX r2, int i2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i2;
    }

    public Object get() {
        int i2 = this.A00;
        if (i2 == 0) {
            return new C50242Yo();
        }
        if (i2 != 1) {
            C16150sX r1 = this.A02;
            C23431By r2 = (C23431By) r1.AQ2.get();
            C16340ss.A01(r2);
            return new C448926b(r2, (C16440t3) r1.AP2.get(), (C16260sj) r1.AQe.get(), (C16320sq) r1.ARB.get(), (VoipCameraManager) r1.APz.get());
        }
        C16150sX r22 = this.A02;
        Context context = r22.AS2.A00;
        C16340ss.A01(context);
        r22.A05.get();
        return new AnonymousClass2Yn(context);
    }
}

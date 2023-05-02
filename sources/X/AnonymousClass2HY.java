package X;

import com.whatsapp.util.Log;

/* renamed from: X.2HY  reason: invalid class name */
public abstract class AnonymousClass2HY implements AnonymousClass2HZ {
    public final AnonymousClass2HW A00;

    public AnonymousClass2HY(AnonymousClass2HW r1) {
        this.A00 = r1;
    }

    public final void APa(Exception exc) {
        Log.e("FBUserEntityManagement : Network failed  while sending the payload");
        this.A00.APY();
    }

    public final void AQa(Exception exc) {
        Log.e("FBUserEntityManagement : On error response while sending the payload");
        this.A00.AQa(exc);
    }
}

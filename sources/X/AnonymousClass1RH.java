package X;

import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.whatsapp.util.Log;

/* renamed from: X.1RH  reason: invalid class name */
public class AnonymousClass1RH implements C18330wW {
    public final C16980tz A00;
    public final C16320sq A01;

    public AnonymousClass1RH(C16980tz r1, C16320sq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void ATC(boolean z2) {
        if (z2) {
            Log.i("BackupLoginObserver/onLoginChanged delete backup key");
            this.A01.Acl(new RunnableRunnableShape2S0100000_I0_1(this, 44));
        }
    }
}

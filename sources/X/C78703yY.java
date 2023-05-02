package X;

import com.obwhatsapp.registration.EULA;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3yY  reason: invalid class name and case insensitive filesystem */
public class C78703yY extends C16690tT {
    public final /* synthetic */ EULA A00;

    public C78703yY(EULA eula) {
        this.A00 = eula;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            return this.A00.A0T.A01(TimeUnit.SECONDS, 10);
        } catch (Exception e2) {
            Log.w("exception while waiting on task killers thread to finish during onCreate ", e2);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        int i2;
        C47412Iw r3 = (C47412Iw) obj;
        EULA eula = this.A00;
        eula.A0S = r3;
        if (r3 != null && r3.A00 != null) {
            i2 = 6;
        } else if (C004101u.A0A()) {
            i2 = 8;
        } else {
            return;
        }
        AnonymousClass29T.A01(eula, i2);
    }
}

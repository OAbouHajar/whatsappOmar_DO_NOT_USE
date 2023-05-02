package X;

import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2RM  reason: invalid class name */
public class AnonymousClass2RM implements C19550yc {
    public final C14870pt A00;
    public final C17120uZ A01;
    public final C14710pd A02;
    public final C17190ug A03;
    public final AnonymousClass2RO A04;

    public AnonymousClass2RM(C14870pt r1, C17120uZ r2, C14710pd r3, C17190ug r4, AnonymousClass2RO r5) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
    }

    public final void A00(int i2) {
        this.A00.Acq(new RunnableRunnableShape3S0200000_I0_1(this, 17, new AnonymousClass2RN((UserJid) null, (String) null, (String) null, -1, i2)));
    }

    public void APb(String str) {
        Log.e("GetUserByCustomUrlProtocol/onDeliveryFailure");
        A00(408);
    }

    public void AQe(C28371Vv r2, String str) {
        Log.e("GetUserByCustomUrlProtocol/onError");
        A00(C34451kH.A00(r2));
    }

    public void AYG(C28371Vv r10, String str) {
        UserJid nullable;
        Log.e("GetUserByCustomUrlProtocol/onSuccess");
        C28371Vv A0J = r10.A0J("user");
        if (A0J == null || (nullable = UserJid.getNullable(A0J.A0N("jid", (String) null))) == null) {
            A00(0);
            return;
        }
        int i2 = 2;
        if (this.A02.A0E(C16620tM.A02, 1849)) {
            i2 = 3;
        }
        this.A00.Acq(new RunnableRunnableShape3S0200000_I0_1(this, 17, new AnonymousClass2RN(nullable, (String) null, (String) null, i2, 0)));
    }
}

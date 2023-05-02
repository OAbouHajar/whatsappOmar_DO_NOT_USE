package X;

import android.os.RemoteException;

/* renamed from: X.4r6  reason: invalid class name and case insensitive filesystem */
public final class C98104r6 implements AnonymousClass5RE {
    public final /* synthetic */ AnonymousClass39K A00;

    public C98104r6(AnonymousClass39K r1) {
        this.A00 = r1;
    }

    public final int AiM() {
        return 5;
    }

    public final void AiR(C107835Lp r4) {
        try {
            C31361e1 r2 = (C31361e1) ((C98084r4) this.A00.A01).A02;
            r2.A03(3, r2.A01());
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }
}

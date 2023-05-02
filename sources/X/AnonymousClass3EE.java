package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3EE  reason: invalid class name */
public final class AnonymousClass3EE implements AnonymousClass5RE {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AnonymousClass39K A01;

    public AnonymousClass3EE(Bundle bundle, AnonymousClass39K r2) {
        this.A01 = r2;
        this.A00 = bundle;
    }

    public final int AiM() {
        return 1;
    }

    public final void AiR(C107835Lp r7) {
        C107835Lp r5 = this.A01.A01;
        Bundle bundle = this.A00;
        C98084r4 r52 = (C98084r4) r5;
        try {
            Bundle A0D = C13690nt.A0D();
            C90234dn.A01(bundle, A0D);
            C31361e1 r2 = (C31361e1) r52.A02;
            Parcel A012 = r2.A01();
            C90334dy.A01(A012, A0D);
            r2.A03(2, A012);
            C90234dn.A01(A0D, bundle);
            r52.A00 = (View) C58032sR.A01(C31361e1.A00(r2.A01(), r2, 8));
            ViewGroup viewGroup = r52.A01;
            viewGroup.removeAllViews();
            viewGroup.addView(r52.A00);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }
}

package X;

import android.app.Dialog;
import android.os.Handler;

/* renamed from: X.4PL  reason: invalid class name */
public abstract class AnonymousClass4PL {
    public void A00() {
        if (this instanceof C65733Wj) {
            C65733Wj r3 = (C65733Wj) this;
            C57922sC r2 = (C57922sC) r3.A01.A00;
            r2.A04.set((Object) null);
            Handler handler = r2.A03.A06;
            handler.sendMessage(handler.obtainMessage(3));
            Dialog dialog = r3.A00;
            if (dialog.isShowing()) {
                dialog.dismiss();
                return;
            }
            return;
        }
        C57912sB r0 = (C57912sB) ((C65723Wi) this).A00.get();
        if (r0 != null) {
            C57912sB.A00(r0);
        }
    }
}

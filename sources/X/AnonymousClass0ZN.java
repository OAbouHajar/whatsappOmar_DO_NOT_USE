package X;

import android.view.Window;

/* renamed from: X.0ZN  reason: invalid class name */
public final class AnonymousClass0ZN implements C12940lD {
    public final /* synthetic */ AnonymousClass06G A00;

    public AnonymousClass0ZN(AnonymousClass06G r1) {
        this.A00 = r1;
    }

    public void AOk(C016607w r2, boolean z2) {
        this.A00.A0U(r2);
    }

    public boolean AUB(C016607w r3) {
        Window.Callback callback = this.A00.A08.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(AnonymousClass2EA.A03, r3);
        return true;
    }
}

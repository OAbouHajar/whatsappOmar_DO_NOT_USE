package X;

import android.view.Window;

/* renamed from: X.0ZQ  reason: invalid class name */
public final class AnonymousClass0ZQ implements C12940lD {
    public boolean A00;
    public final /* synthetic */ AnonymousClass09B A01;

    public AnonymousClass0ZQ(AnonymousClass09B r1) {
        this.A01 = r1;
    }

    public void AOk(C016607w r3, boolean z2) {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass09B r1 = this.A01;
            r1.A01.A85();
            Window.Callback callback = r1.A00;
            if (callback != null) {
                callback.onPanelClosed(AnonymousClass2EA.A03, r3);
            }
            this.A00 = false;
        }
    }

    public boolean AUB(C016607w r3) {
        Window.Callback callback = this.A01.A00;
        if (callback == null) {
            return false;
        }
        callback.onMenuOpened(AnonymousClass2EA.A03, r3);
        return true;
    }
}

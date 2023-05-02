package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.5yO  reason: invalid class name */
public class AnonymousClass5yO implements DisplayManager.DisplayListener {
    public final /* synthetic */ DisplayManager A00;
    public final /* synthetic */ AnonymousClass5x9 A01;

    public AnonymousClass5yO(DisplayManager displayManager, AnonymousClass5x9 r2) {
        this.A01 = r2;
        this.A00 = displayManager;
    }

    public void onDisplayAdded(int i2) {
        AnonymousClass5x9 r2 = this.A01;
        if (r2.A03()) {
            C1220868f r0 = r2.A01;
            if (r0 != null) {
                r0.AWi();
            }
            this.A00.unregisterDisplayListener(r2.A00);
        }
    }

    public void onDisplayChanged(int i2) {
    }

    public void onDisplayRemoved(int i2) {
    }
}

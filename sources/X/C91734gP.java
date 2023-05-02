package X;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.4gP  reason: invalid class name and case insensitive filesystem */
public final class C91734gP implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C89444cB A01;

    public C91734gP(DisplayManager displayManager, C89444cB r2) {
        this.A01 = r2;
        this.A00 = displayManager;
    }

    public void A00() {
        DisplayManager displayManager = this.A00;
        Looper myLooper = Looper.myLooper();
        C90524eJ.A01(myLooper);
        displayManager.registerDisplayListener(this, new Handler(myLooper, (Handler.Callback) null));
    }

    public void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    public void onDisplayAdded(int i2) {
    }

    public void onDisplayChanged(int i2) {
        if (i2 == 0) {
            this.A01.A04();
        }
    }

    public void onDisplayRemoved(int i2) {
    }
}

package X;

import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.0gS  reason: invalid class name and case insensitive filesystem */
public class C10020gS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SystemForegroundService A01;

    public C10020gS(SystemForegroundService systemForegroundService, int i2) {
        this.A01 = systemForegroundService;
        this.A00 = i2;
    }

    public void run() {
        this.A01.A00.cancel(this.A00);
    }
}

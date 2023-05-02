package X;

import android.app.Activity;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsBlockScreenShareActivity;

/* renamed from: X.5x9  reason: invalid class name */
public class AnonymousClass5x9 {
    public DisplayManager.DisplayListener A00;
    public C1220868f A01;
    public final C16980tz A02;
    public final C14710pd A03;

    public AnonymousClass5x9(C16980tz r1, C14710pd r2) {
        this.A03 = r2;
        this.A02 = r1;
    }

    public static void A01(Activity activity) {
        if (activity != null && Build.VERSION.SDK_INT >= 17) {
            Intent A04 = C110105dW.A04(activity, IndiaUpiPaymentsBlockScreenShareActivity.class);
            A04.addFlags(536870912);
            activity.finish();
            activity.startActivity(A04);
        }
    }

    public void A02(C1220868f r5) {
        if (this.A03.A0C(1734) && Build.VERSION.SDK_INT >= 17) {
            if (A03()) {
                r5.AWi();
                return;
            }
            this.A01 = r5;
            DisplayManager displayManager = (DisplayManager) this.A02.A00.getSystemService("display");
            DisplayManager.DisplayListener displayListener = this.A00;
            if (displayListener == null && Build.VERSION.SDK_INT >= 17) {
                displayListener = new AnonymousClass5yO(displayManager, this);
                this.A00 = displayListener;
            }
            displayManager.registerDisplayListener(displayListener, (Handler) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = ((android.hardware.display.DisplayManager) r5.A02.A00.getSystemService("display")).getDisplays();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r5 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 < r0) goto L_0x002b
            X.0tz r0 = r5.A02
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "display"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display[] r4 = r0.getDisplays()
            int r3 = r4.length
            r2 = 1
            if (r3 <= r2) goto L_0x002b
            r1 = 1
        L_0x001b:
            r0 = r4[r1]
            int r0 = r0.getFlags()
            r0 = r0 & 2
            if (r0 <= 0) goto L_0x0026
            return r2
        L_0x0026:
            int r1 = r1 + 1
            if (r1 >= r3) goto L_0x002b
            goto L_0x001b
        L_0x002b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5x9.A03():boolean");
    }
}

package X;

import android.os.Build;
import android.os.PowerManager;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.4Sr  reason: invalid class name and case insensitive filesystem */
public class C86434Sr {
    public float A00 = -1.0f;

    public void A00(Window window) {
        window.clearFlags(128);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = this.A00;
        window.setAttributes(attributes);
    }

    public void A01(Window window, AnonymousClass01V r6) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.A00 = attributes.screenBrightness;
        PowerManager A0I = r6.A0I();
        if (Build.VERSION.SDK_INT >= 21 && A0I != null && !A0I.isPowerSaveMode()) {
            window.addFlags(128);
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
        }
    }
}

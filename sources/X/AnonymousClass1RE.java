package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.obwhatsapp.companionmode.CompanionStateHolder$CompanionKillswitchStateReceiver;
import com.obwhatsapp.companionmode.CompanionStateHolder$CompanionPreferenceStateReceiver;

/* renamed from: X.1RE  reason: invalid class name */
public class AnonymousClass1RE {
    public ComponentName A00;
    public ComponentName A01;
    public ComponentName A02;
    public final C16980tz A03;

    public AnonymousClass1RE(C16980tz r1) {
        this.A03 = r1;
    }

    public void A00(int i2) {
        Context context = this.A03.A00;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = this.A02;
        if (componentName == null) {
            componentName = new ComponentName(context, CompanionStateHolder$CompanionPreferenceStateReceiver.class);
            this.A02 = componentName;
        }
        packageManager.setComponentEnabledSetting(componentName, i2, 1);
    }

    public boolean A01() {
        Context context = this.A03.A00;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = this.A00;
        if (componentName == null) {
            componentName = new ComponentName(context, CompanionStateHolder$CompanionKillswitchStateReceiver.class);
            this.A00 = componentName;
        }
        return packageManager.getComponentEnabledSetting(componentName) == 1;
    }
}

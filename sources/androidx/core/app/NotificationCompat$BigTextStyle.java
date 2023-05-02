package androidx.core.app;

import X.C007503l;
import X.C007603n;
import X.C07280au;
import X.C11840jQ;
import android.app.Notification;
import android.os.Build;
import android.os.Bundle;

public class NotificationCompat$BigTextStyle extends C007603n {
    public CharSequence A00;

    public String A05() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    public void A06(Bundle bundle) {
        super.A06(bundle);
        if (Build.VERSION.SDK_INT < 21) {
            bundle.putCharSequence("android.bigText", this.A00);
        }
    }

    public void A08(C11840jQ r3) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((C07280au) r3).A02).setBigContentTitle((CharSequence) null).bigText(this.A00);
        if (this.A02) {
            bigText.setSummaryText(this.A01);
        }
    }

    public void A09(CharSequence charSequence) {
        this.A00 = C007503l.A00(charSequence);
    }
}

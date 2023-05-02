package androidx.core.app;

import X.AnonymousClass0SV;
import X.C007603n;
import X.C07280au;
import X.C11840jQ;
import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;

public class NotificationCompat$BigPictureStyle extends C007603n {
    public Bitmap A00;
    public boolean A01;

    public String A05() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public void A08(C11840jQ r4) {
        int i2 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(((C07280au) r4).A02).setBigContentTitle((CharSequence) null).bigPicture(this.A00);
        if (this.A01) {
            bigPicture.bigLargeIcon((Bitmap) null);
        }
        if (this.A02) {
            bigPicture.setSummaryText(this.A01);
        }
        if (i2 >= 31) {
            AnonymousClass0SV.A01(bigPicture);
            AnonymousClass0SV.A00(bigPicture);
        }
    }
}

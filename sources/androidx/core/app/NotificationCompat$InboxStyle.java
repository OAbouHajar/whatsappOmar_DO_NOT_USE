package androidx.core.app;

import X.AnonymousClass000;
import X.C007603n;
import X.C07280au;
import X.C11840jQ;
import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCompat$InboxStyle extends C007603n {
    public ArrayList A00 = AnonymousClass000.A0u();

    public String A05() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    public void A08(C11840jQ r4) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((C07280au) r4).A02).setBigContentTitle((CharSequence) null);
        if (this.A02) {
            bigContentTitle.setSummaryText(this.A01);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine((CharSequence) it.next());
        }
    }
}

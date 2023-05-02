package androidx.core.app;

import X.AnonymousClass000;
import X.AnonymousClass04E;
import X.C007603n;
import X.C07280au;
import X.C11840jQ;
import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCompat$DecoratedCustomViewStyle extends C007603n {
    public RemoteViews A03(C11840jQ r4) {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.A00.A0E) == null) {
            return null;
        }
        return A09(remoteViews, true);
    }

    public RemoteViews A04(C11840jQ r4) {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.A00.A0E) == null) {
            return null;
        }
        return A09(remoteViews, false);
    }

    public String A05() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    public void A08(C11840jQ r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((C07280au) r3).A02.setStyle(new Notification.DecoratedCustomViewStyle());
        }
    }

    public final RemoteViews A09(RemoteViews remoteViews, boolean z2) {
        int min;
        int i2 = 0;
        RemoteViews A02 = A02();
        A02.removeAllViews(R.id.actions);
        ArrayList arrayList = this.A00.A0N;
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0u.add(it.next());
        }
        if (!z2 || (min = Math.min(A0u.size(), 3)) <= 0) {
            i2 = 8;
        } else {
            int i3 = 0;
            do {
                AnonymousClass04E r10 = (AnonymousClass04E) A0u.get(i3);
                PendingIntent pendingIntent = r10.A01;
                boolean A1W = AnonymousClass000.A1W(pendingIntent);
                String packageName = this.A00.A0B.getPackageName();
                int i4 = R.layout.layout040c;
                if (A1W) {
                    i4 = R.layout.layout040d;
                }
                RemoteViews remoteViews2 = new RemoteViews(packageName, i4);
                IconCompat A00 = r10.A00();
                if (A00 != null) {
                    remoteViews2.setImageViewBitmap(R.id.action_image, A01(A00, this.A00.A0B.getResources().getColor(R.color.color058d), 0));
                }
                CharSequence charSequence = r10.A03;
                remoteViews2.setTextViewText(R.id.action_text, charSequence);
                if (!A1W) {
                    remoteViews2.setOnClickPendingIntent(R.id.action_container, pendingIntent);
                }
                remoteViews2.setContentDescription(R.id.action_container, charSequence);
                A02.addView(R.id.actions, remoteViews2);
                i3++;
            } while (i3 < min);
        }
        A02.setViewVisibility(R.id.actions, i2);
        A02.setViewVisibility(R.id.action_divider, i2);
        A07(A02, remoteViews);
        return A02;
    }
}

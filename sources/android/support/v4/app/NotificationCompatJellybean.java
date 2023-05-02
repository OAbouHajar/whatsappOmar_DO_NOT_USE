package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

class NotificationCompatJellybean {

    /* renamed from: b  reason: collision with root package name */
    private Notification.Builder f2859b;

    public NotificationCompatJellybean(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i2, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i3, int i4, boolean z2, boolean z3, int i5, CharSequence charSequence4) {
        this.f2859b = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i2).setUsesChronometer(z3).setPriority(i5).setProgress(i3, i4, z2);
    }

    public void addAction(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f2859b.addAction(i2, charSequence, pendingIntent);
    }

    public void addBigPictureStyle(CharSequence charSequence, boolean z2, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z3) {
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(this.f2859b).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z3) {
            bigPicture.bigLargeIcon(bitmap2);
        }
        if (z2) {
            bigPicture.setSummaryText(charSequence2);
        }
    }

    public void addBigTextStyle(CharSequence charSequence, boolean z2, CharSequence charSequence2, CharSequence charSequence3) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(this.f2859b).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z2) {
            bigText.setSummaryText(charSequence2);
        }
    }

    public void addInboxStyle(CharSequence charSequence, boolean z2, CharSequence charSequence2, ArrayList<CharSequence> arrayList) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(this.f2859b).setBigContentTitle(charSequence);
        if (z2) {
            bigContentTitle.setSummaryText(charSequence2);
        }
        Iterator<CharSequence> it = arrayList.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

    public Notification build() {
        return this.f2859b.build();
    }
}

package X;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1v8  reason: invalid class name and case insensitive filesystem */
public class C41041v8 {
    public static boolean A00;
    public static final Set A01 = new HashSet();

    public static synchronized void A00(Context context, AnonymousClass01V r14) {
        synchronized (C41041v8.class) {
            if (!A00) {
                NotificationManager A08 = r14.A08();
                AnonymousClass00B.A06(A08);
                A08.createNotificationChannelGroup(new NotificationChannelGroup("channel_group_chats", context.getString(R.string.str0447)));
                NotificationChannel notificationChannel = new NotificationChannel("critical_app_alerts@1", context.getString(R.string.str03f3), yo.Pop_Heds_O("critical_app_alerts@1", 4));
                notificationChannel.setLockscreenVisibility(0);
                notificationChannel.setShowBadge(true);
                A08.createNotificationChannel(notificationChannel);
                NotificationChannel notificationChannel2 = new NotificationChannel("chat_history_backup@1", context.getString(R.string.str03f2), yo.Pop_Heds_O("chat_history_backup@1", 2));
                notificationChannel2.setLockscreenVisibility(0);
                notificationChannel2.setShowBadge(false);
                A08.createNotificationChannel(notificationChannel2);
                NotificationChannel notificationChannel3 = new NotificationChannel("failure_notifications@1", context.getString(R.string.str03f4), yo.Pop_Heds_O("failure_notifications@1", 3));
                notificationChannel3.setLockscreenVisibility(0);
                notificationChannel3.setShowBadge(true);
                A08.createNotificationChannel(notificationChannel3);
                String string = context.getString(R.string.str03f5);
                int Pop_Heds_O = yo.Pop_Heds_O("media_playback@1", 2);
                NotificationChannel notificationChannel4 = new NotificationChannel("media_playback@1", string, Pop_Heds_O);
                notificationChannel4.setLockscreenVisibility(0);
                notificationChannel4.setShowBadge(false);
                A08.createNotificationChannel(notificationChannel4);
                String string2 = context.getString(R.string.str03f6);
                int Pop_Heds_O2 = yo.Pop_Heds_O("other_notifications@1", Pop_Heds_O);
                NotificationChannel notificationChannel5 = new NotificationChannel("other_notifications@1", string2, Pop_Heds_O2);
                notificationChannel5.setLockscreenVisibility(0);
                notificationChannel5.setShowBadge(false);
                A08.createNotificationChannel(notificationChannel5);
                NotificationChannel notificationChannel6 = new NotificationChannel("sending_media@1", context.getString(R.string.str03f7), yo.Pop_Heds_O("sending_media@1", Pop_Heds_O2));
                notificationChannel6.setLockscreenVisibility(0);
                notificationChannel6.setShowBadge(false);
                A08.createNotificationChannel(notificationChannel6);
                Set set = A01;
                set.add("critical_app_alerts@1");
                set.add("chat_history_backup@1");
                set.add("failure_notifications@1");
                set.add("media_playback@1");
                set.add("other_notifications@1");
                set.add("sending_media@1");
                A00 = true;
            }
        }
    }
}

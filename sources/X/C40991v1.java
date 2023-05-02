package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.ViewCompat;
import com.facebook.redex.IDxCallbackShape187S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1v1  reason: invalid class name and case insensitive filesystem */
public class C40991v1 {
    public static final long A0L = TimeUnit.DAYS.toMillis(60);
    public static final AnonymousClass1v5 A0M = new AnonymousClass1v5();
    public NotificationManager A00;
    public Handler A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public final C14870pt A04;
    public final C15900s5 A05;
    public final C33481ie A06;
    public final C17140ub A07;
    public final C16080sP A08;
    public final AnonymousClass01V A09;
    public final C16440t3 A0A;
    public final C16980tz A0B;
    public final C16260sj A0C;
    public final C15860rz A0D;
    public final C15810rt A0E;
    public final C216114t A0F;
    public final C33501ig A0G;
    public final AnonymousClass11A A0H;
    public final AnonymousClass1VD A0I;
    public final AnonymousClass18R A0J;
    public final C18060w5 A0K;

    public C40991v1(C14870pt r5, C15900s5 r6, C17140ub r7, C16080sP r8, AnonymousClass01V r9, C16440t3 r10, C16980tz r11, C16260sj r12, C15860rz r13, C15810rt r14, C216114t r15, AnonymousClass11A r16, AnonymousClass18R r17, C18060w5 r18) {
        boolean z2 = C40981v0.A00;
        IDxCObserverShape72S0100000_2_I0 iDxCObserverShape72S0100000_2_I0 = null;
        this.A06 = z2 ? new IDxCObserverShape68S0100000_2_I0(this, 31) : null;
        this.A0I = z2 ? new IDxPObserverShape81S0100000_2_I0(this, 24) : null;
        this.A0G = z2 ? new IDxCObserverShape72S0100000_2_I0(this, 16) : iDxCObserverShape72S0100000_2_I0;
        this.A0A = r10;
        this.A04 = r5;
        this.A0B = r11;
        this.A0E = r14;
        this.A05 = r6;
        this.A09 = r9;
        this.A08 = r8;
        this.A07 = r7;
        this.A0C = r12;
        this.A0D = r13;
        this.A0H = r16;
        this.A0K = r18;
        this.A0F = r15;
        this.A0J = r17;
    }

    public static int A00(boolean z2) {
        return z2 ? 3 : 4;
    }

    public static String A01(String str) {
        Pair A002 = C41031v7.A00(str);
        if (A002 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C16030sJ.A04((String) A002.first));
        sb.append("_");
        sb.append(A002.second);
        return sb.toString();
    }

    public static final void A02(NotificationChannel notificationChannel, C15830rv r4) {
        String rawString = r4.getRawString();
        String A002 = A0M.A00(C16030sJ.A0L(r4) ? "group_chat_defaults" : "individual_chat_defaults");
        if (A002 != null) {
            notificationChannel.setConversationId(A002, rawString);
            A01(A002);
        }
    }

    public NotificationChannel A03(String str) {
        AnonymousClass1v5 r2 = A0M;
        if (r2.A04(str)) {
            return AnonymousClass1v6.A00(A04(), r2.A00(str));
        }
        return null;
    }

    public synchronized NotificationManager A04() {
        NotificationManager notificationManager;
        notificationManager = this.A00;
        if (notificationManager == null) {
            notificationManager = this.A09.A08();
            this.A00 = notificationManager;
        }
        return notificationManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.ContentValues A05(android.app.NotificationChannel r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            r6 = this;
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.Integer r1 = X.C218415q.A04(r8)
            java.lang.String r5 = "message_light"
            boolean r0 = r7.shouldShowLights()
            if (r1 == 0) goto L_0x00c0
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "000000"
        L_0x0015:
            r4.put(r5, r0)
        L_0x0018:
            long[] r2 = X.C218415q.A0A(r9)
            java.lang.String r1 = "message_vibrate"
            boolean r0 = r7.shouldVibrate()
            if (r2 == 0) goto L_0x0080
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "0"
        L_0x0028:
            r4.put(r1, r0)
        L_0x002b:
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r1 = "message_tone"
            android.net.Uri r0 = r7.getSound()
            if (r2 != 0) goto L_0x005a
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = ""
        L_0x003b:
            r4.put(r1, r0)
        L_0x003e:
            r0 = 4
            if (r11 == 0) goto L_0x0042
            r0 = 3
        L_0x0042:
            int r2 = r7.getImportance()
            if (r2 == r0) goto L_0x0059
            r0 = 3
            if (r2 < r0) goto L_0x0059
            r1 = 3
            r0 = 0
            if (r2 != r1) goto L_0x0050
            r0 = 1
        L_0x0050:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "low_pri_notifications"
            r4.put(r0, r1)
        L_0x0059:
            return r4
        L_0x005a:
            if (r0 == 0) goto L_0x003e
            android.net.Uri r0 = r7.getSound()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            goto L_0x0075
        L_0x0069:
            android.net.Uri r0 = r7.getSound()
            java.lang.String r0 = r0.toString()
            boolean r0 = r10.equals(r0)
        L_0x0075:
            if (r0 != 0) goto L_0x003e
            android.net.Uri r0 = r7.getSound()
            java.lang.String r0 = r0.toString()
            goto L_0x003b
        L_0x0080:
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "1"
            goto L_0x0028
        L_0x0085:
            int r0 = r7.getLightColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0018
            int r1 = r7.getLightColor()
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            java.lang.String r3 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r1 = r3.length()
            java.lang.String r0 = "000000"
            java.lang.String r0 = r0.substring(r1)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            goto L_0x0015
        L_0x00c0:
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "FFFFFF"
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40991v1.A05(android.app.NotificationChannel, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.ContentValues");
    }

    public CharSequence A06(String str) {
        Context context;
        int i2;
        if ("individual_chat_defaults".equals(str)) {
            context = this.A0B.A00;
            i2 = R.string.str1d99;
        } else if ("group_chat_defaults".equals(str)) {
            context = this.A0B.A00;
            i2 = R.string.str1587;
        } else if ("silent_notifications".equals(str)) {
            context = this.A0B.A00;
            i2 = R.string.str03f8;
        } else if ("voip_notification".equals(str)) {
            context = this.A0B.A00;
            i2 = R.string.str03f9;
        } else {
            C15830rv A022 = C15830rv.A02(str);
            if (A022 == null) {
                return null;
            }
            return this.A08.A08(this.A0F.A01(A022));
        }
        return context.getString(i2);
    }

    public synchronized String A07(Uri uri, CharSequence charSequence, String str, String str2, String str3, String str4, int i2) {
        AnonymousClass1v5 r4 = A0M;
        if (r4.A04(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("chat-settings-store/addNotificationChannel channel already exists for settingsId:");
            sb.append(C16030sJ.A04(str));
            Log.e(sb.toString());
            return r4.A00(str);
        }
        C15860rz r6 = this.A0D;
        int i3 = ((SharedPreferences) r6.A01.get()).getInt("num_notification_channels_created", 0) + 1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(i3);
        String obj = sb2.toString();
        int Pop_Heds_O = yo.Pop_Heds_O(obj, i2);
        NotificationChannel notificationChannel = new NotificationChannel(obj, charSequence, Pop_Heds_O);
        String str5 = str4;
        if (!TextUtils.isEmpty(str5)) {
            notificationChannel.setGroup(str5);
        }
        Integer A042 = C218415q.A04(str2);
        if (A042 != null) {
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(A042.intValue());
        } else {
            notificationChannel.enableLights(false);
        }
        long[] A0A2 = C218415q.A0A(str3);
        if (A0A2 != null) {
            notificationChannel.setVibrationPattern(A0A2);
            notificationChannel.enableVibration(true);
        } else {
            notificationChannel.enableVibration(false);
        }
        notificationChannel.setSound(uri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        notificationChannel.setLockscreenVisibility(0);
        if (!"group_chat_defaults".equals(str) && !"individual_chat_defaults".equals(str)) {
            C15830rv A022 = C15830rv.A02(str);
            if (Build.VERSION.SDK_INT >= 30 && A022 != null) {
                A02(notificationChannel, A022);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("chat-settings-store/addNotificationChannel adding channel with id:");
        sb3.append(A01(obj));
        sb3.append(" importance:");
        sb3.append(Pop_Heds_O);
        sb3.append(" lights:");
        sb3.append(notificationChannel.shouldShowLights());
        sb3.append(" color:");
        String hexString = Integer.toHexString(notificationChannel.getLightColor() & ViewCompat.MEASURED_SIZE_MASK);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("000000".substring(hexString.length()));
        sb4.append(hexString);
        sb3.append(sb4.toString());
        sb3.append(" vibrate:");
        sb3.append(notificationChannel.shouldVibrate());
        sb3.append(" sounduri:");
        sb3.append(notificationChannel.getSound());
        Log.i(sb3.toString());
        AnonymousClass1v6.A02(notificationChannel, A04());
        r6.A0K().putInt("num_notification_channels_created", i3).apply();
        r4.A02(str, obj);
        return obj;
    }

    public String A08(String str) {
        String A012 = A0M.A01(str);
        if (!"silent_notifications".equals(A012)) {
            return str;
        }
        if (AnonymousClass1v6.A00(A04(), str).getImportance() <= 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder("chat-settings-store/repairSilentNotificationChannel repairing channel:");
        sb.append(C16030sJ.A04(A012));
        Log.i(sb.toString());
        A0K(A012);
        return A07((Uri) null, A06(A012), A012, (String) null, (String) null, (String) null, 2);
    }

    public String A09(String str) {
        String A012 = A0M.A01(str);
        if ("voip_notification".equals(A012)) {
            if (AnonymousClass1v6.A00(A04(), str).getImportance() < 4) {
                StringBuilder sb = new StringBuilder("chat-settings-store/repairVoIPNotificationChannel repairing channel:");
                sb.append(C16030sJ.A04(A012));
                Log.i(sb.toString());
                try {
                    A0K(A012);
                    return A07((Uri) null, A06("voip_notification"), "voip_notification", (String) null, (String) null, (String) null, 4);
                } catch (SecurityException unused) {
                    Log.w("chat-settings-store/repairVoIPNotificationChannel SecurityException in deleteNotificationChannel");
                }
            }
        }
        return str;
    }

    public String A0A(String str, String str2, String str3, String str4, int i2) {
        String A012 = A0M.A01(str);
        if (!"group_chat_defaults".equals(A012) && !"individual_chat_defaults".equals(A012)) {
            return str;
        }
        if (AnonymousClass1v6.A00(A04(), str).getImportance() >= 3) {
            return str;
        }
        StringBuilder sb = new StringBuilder("chat-settings-store/repairDefaultChannelIfNeeded repairing channel:");
        sb.append(C16030sJ.A04(A012));
        Log.i(sb.toString());
        A0K(A012);
        return A07(str4 == null ? Settings.System.DEFAULT_NOTIFICATION_URI : Uri.parse(str4), A06(A012), A012, str2, str3, "channel_group_chats", i2);
    }

    public void A0B() {
        NotificationManager A042 = A04();
        AnonymousClass00B.A06(A042);
        for (NotificationChannel notificationChannel : AnonymousClass1v6.A01(A042)) {
            if (!C41041v8.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId())) {
                StringBuilder sb = new StringBuilder("chat-settings-store/deleteAllNotificationChannels/Deleting notification channel: ");
                sb.append(notificationChannel.getId());
                Log.i(sb.toString());
                AnonymousClass1v6.A03(A042, notificationChannel.getId());
            }
        }
        AnonymousClass1v5 r1 = A0M;
        synchronized (r1) {
            r1.A01.clear();
            r1.A00.clear();
        }
    }

    public void A0C() {
        if (Build.VERSION.SDK_INT >= 26) {
            Log.i("chat-settings-store/deleteDatabaseFiles success");
            A0B();
        }
    }

    public synchronized void A0D() {
        synchronized (this) {
            if (Build.VERSION.SDK_INT >= 26 && this.A01 == null) {
                this.A01 = new Handler(this.A0K.A00(), new IDxCallbackShape187S0100000_2_I0(this, 6));
            }
            Handler handler = this.A01;
            AnonymousClass00B.A06(handler);
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessageDelayed(1, 3000);
            }
        }
    }

    public synchronized void A0E() {
        String str;
        if (this.A02) {
            for (NotificationChannel notificationChannel : AnonymousClass1v6.A01(A04())) {
                if (!C41041v8.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId()) && "channel_group_chats".equals(notificationChannel.getGroup())) {
                    Pair A002 = C41031v7.A00(notificationChannel.getId());
                    if (A002 == null || (str = (String) A002.first) == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("chat-settings-store/updateChannelNames ignoring channel:");
                        sb.append(notificationChannel.getId());
                        Log.i(sb.toString());
                    } else {
                        CharSequence name = notificationChannel.getName();
                        CharSequence A062 = A06(str);
                        if (!TextUtils.equals(name, A062)) {
                            notificationChannel.getId();
                            NotificationManager A042 = A04();
                            String id = notificationChannel.getId();
                            AnonymousClass1v6.A02(new NotificationChannel(id, A062, yo.Pop_Heds_O(id, notificationChannel.getImportance())), A042);
                        }
                    }
                }
            }
        }
    }

    public synchronized void A0F(NotificationChannel notificationChannel, String str, int i2) {
        C15860rz r6 = this.A0D;
        int i3 = ((SharedPreferences) r6.A01.get()).getInt("num_notification_channels_created", 0) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i3);
        String obj = sb.toString();
        NotificationChannel notificationChannel2 = new NotificationChannel(obj, A06(str), yo.Pop_Heds_O(obj, i2));
        notificationChannel2.setGroup("channel_group_chats");
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setLightColor(notificationChannel.getLightColor());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.setVibrationPattern(notificationChannel.getVibrationPattern());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        notificationChannel2.setShowBadge(notificationChannel.canShowBadge());
        notificationChannel2.setBypassDnd(notificationChannel.canBypassDnd());
        AnonymousClass1v5 r2 = A0M;
        r2.A03(str, notificationChannel.getId());
        AnonymousClass1v6.A03(A04(), notificationChannel.getId());
        AnonymousClass1v6.A02(notificationChannel2, A04());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("chat-settings-store/unMuteChannelBySettingsId creating new channel:");
        sb2.append(notificationChannel2);
        Log.i(sb2.toString());
        r2.A02(str, obj);
        r6.A0K().putInt("num_notification_channels_created", i3).apply();
    }

    public void A0G(Uri uri, CharSequence charSequence, String str, String str2, String str3, boolean z2, boolean z3) {
        int i2;
        String str4 = str;
        C16030sJ.A04(str4);
        String A002 = A0M.A00(str4);
        if (!C41041v8.A01.contains(A002)) {
            Uri uri2 = uri;
            String str5 = str2;
            String str6 = str3;
            if (A002 != null) {
                NotificationChannel A003 = AnonymousClass1v6.A00(A04(), A002);
                boolean z4 = false;
                Integer A042 = C218415q.A04(str5);
                boolean shouldShowLights = A003.shouldShowLights();
                if (A042 == null ? shouldShowLights : !(shouldShowLights && A042.equals(Integer.valueOf(A003.getLightColor())))) {
                    z4 = true;
                }
                long[] A0A2 = C218415q.A0A(str6);
                boolean shouldVibrate = A003.shouldVibrate();
                if (A0A2 == null ? shouldVibrate : !shouldVibrate) {
                    z4 = true;
                }
                if (!AnonymousClass09S.A00(uri, A003.getSound())) {
                    z4 = true;
                }
                i2 = A003.getImportance();
                int i3 = 4;
                if (z2) {
                    i3 = 3;
                }
                if (i2 == i3) {
                    i2 = i3;
                } else if (i2 >= 3 || (!this.A05.A05(C15910s6.A0f) && ("group_chat_defaults".equals(str4) || "individual_chat_defaults".equals(str4)))) {
                    i2 = i3;
                    z4 = true;
                } else {
                    C16030sJ.A04(str4);
                }
                if ((Build.VERSION.SDK_INT < 30 || !z3 || !TextUtils.isEmpty(A003.getConversationId())) && !z4) {
                    C16030sJ.A04(str4);
                    return;
                }
                A0K(str4);
            } else {
                i2 = 4;
                if (z2) {
                    i2 = 3;
                }
            }
            A07(uri2, charSequence, str4, str5, str6, "channel_group_chats", i2);
        }
    }

    public synchronized void A0H(C16800tf r2) {
        A0J(r2.A02);
    }

    public void A0I(C16810tg r3) {
        if (Build.VERSION.SDK_INT >= 26) {
            Log.i("chat-settings-store/onOpen targeting api 26");
            A0J(r3);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x01d8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0J(X.C16810tg r26) {
        /*
            r25 = this;
            r0 = r25
            monitor-enter(r0)
            X.1v5 r1 = A0M     // Catch:{ all -> 0x0248 }
            monitor-enter(r1)     // Catch:{ all -> 0x0248 }
            java.util.Map r2 = r1.A01     // Catch:{ all -> 0x0245 }
            r2.clear()     // Catch:{ all -> 0x0245 }
            java.util.Map r2 = r1.A00     // Catch:{ all -> 0x0245 }
            r2.clear()     // Catch:{ all -> 0x0245 }
            monitor-exit(r1)     // Catch:{ all -> 0x0248 }
            r2 = 0
            r0.A02 = r2     // Catch:{ all -> 0x0248 }
            X.0tz r2 = r0.A0B     // Catch:{ all -> 0x0248 }
            android.content.Context r2 = r2.A00     // Catch:{ all -> 0x0248 }
            X.01V r8 = r0.A09     // Catch:{ all -> 0x0248 }
            X.C41041v8.A00(r2, r8)     // Catch:{ all -> 0x0248 }
            android.app.NotificationManager r2 = r0.A04()     // Catch:{ all -> 0x0248 }
            java.util.List r12 = X.AnonymousClass1v6.A01(r2)     // Catch:{ all -> 0x0248 }
            X.0rz r2 = r0.A0D     // Catch:{ all -> 0x0248 }
            r24 = r2
            X.01D r5 = r2.A01     // Catch:{ all -> 0x0248 }
            java.lang.Object r2 = r5.get()     // Catch:{ all -> 0x0248 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0248 }
            java.lang.String r15 = "notification_channels_schema_version"
            r3 = 0
            r2.getInt(r15, r3)     // Catch:{ all -> 0x0248 }
            r14 = 2
            java.lang.Object r2 = r5.get()     // Catch:{ all -> 0x0248 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0248 }
            int r3 = r2.getInt(r15, r3)     // Catch:{ all -> 0x0248 }
            r2 = 1
            if (r3 < r14) goto L_0x00f2
            java.util.Iterator r11 = r12.iterator()     // Catch:{ all -> 0x0248 }
            r10 = 0
            r9 = 0
            r7 = 0
        L_0x004c:
            boolean r3 = r11.hasNext()     // Catch:{ all -> 0x0248 }
            if (r3 == 0) goto L_0x0093
            java.lang.Object r6 = r11.next()     // Catch:{ all -> 0x0248 }
            android.app.NotificationChannel r6 = (android.app.NotificationChannel) r6     // Catch:{ all -> 0x0248 }
            java.util.Set r4 = X.C41041v8.A01     // Catch:{ all -> 0x0248 }
            java.lang.String r3 = r6.getId()     // Catch:{ all -> 0x0248 }
            boolean r3 = r4.contains(r3)     // Catch:{ all -> 0x0248 }
            if (r3 != 0) goto L_0x004c
            java.lang.String r3 = r6.getId()     // Catch:{ all -> 0x0248 }
            android.util.Pair r3 = X.C41031v7.A00(r3)     // Catch:{ all -> 0x0248 }
            if (r3 == 0) goto L_0x0091
            java.lang.Object r4 = r3.first     // Catch:{ all -> 0x0248 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0248 }
        L_0x0072:
            java.lang.String r3 = "individual_chat_defaults"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0248 }
            if (r3 == 0) goto L_0x007c
            r10 = 1
            goto L_0x004c
        L_0x007c:
            java.lang.String r3 = "group_chat_defaults"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0248 }
            if (r3 == 0) goto L_0x0086
            r9 = 1
            goto L_0x004c
        L_0x0086:
            java.lang.String r3 = "silent_notifications"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0248 }
            if (r3 == 0) goto L_0x004c
            r7 = 1
            goto L_0x004c
        L_0x0091:
            r4 = 0
            goto L_0x0072
        L_0x0093:
            if (r10 == 0) goto L_0x00f2
            if (r9 == 0) goto L_0x00f2
            if (r7 == 0) goto L_0x00f2
            r12.size()     // Catch:{ all -> 0x0248 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0248 }
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5     // Catch:{ all -> 0x0248 }
            java.lang.String r4 = "num_notification_channels_created"
            r3 = 0
            r5.getInt(r4, r3)     // Catch:{ all -> 0x0248 }
            android.app.NotificationManager r3 = r0.A04()     // Catch:{ all -> 0x0248 }
            r3.getNotificationChannelGroups()     // Catch:{ all -> 0x0248 }
            java.util.Iterator r6 = r12.iterator()     // Catch:{ all -> 0x0248 }
        L_0x00b3:
            boolean r3 = r6.hasNext()     // Catch:{ all -> 0x0248 }
            if (r3 == 0) goto L_0x0235
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0248 }
            android.app.NotificationChannel r5 = (android.app.NotificationChannel) r5     // Catch:{ all -> 0x0248 }
            java.util.Set r4 = X.C41041v8.A01     // Catch:{ all -> 0x0248 }
            java.lang.String r3 = r5.getId()     // Catch:{ all -> 0x0248 }
            boolean r3 = r4.contains(r3)     // Catch:{ all -> 0x0248 }
            if (r3 != 0) goto L_0x00b3
            java.lang.String r4 = "miscellaneous"
            java.lang.String r3 = r5.getId()     // Catch:{ all -> 0x0248 }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x0248 }
            if (r3 != 0) goto L_0x00b3
            java.lang.String r3 = r5.getId()     // Catch:{ all -> 0x0248 }
            android.util.Pair r3 = X.C41031v7.A00(r3)     // Catch:{ all -> 0x0248 }
            if (r3 == 0) goto L_0x00b3
            java.lang.Object r4 = r3.first     // Catch:{ all -> 0x0248 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0248 }
            if (r4 == 0) goto L_0x00b3
            X.C16030sJ.A04(r4)     // Catch:{ all -> 0x0248 }
            java.lang.String r3 = r5.getId()     // Catch:{ all -> 0x0248 }
            r1.A02(r4, r3)     // Catch:{ all -> 0x0248 }
            goto L_0x00b3
        L_0x00f2:
            r0.A0B()     // Catch:{ all -> 0x0248 }
            android.app.NotificationManager r3 = r0.A04()     // Catch:{ all -> 0x0248 }
            r3.getNotificationChannelGroups()     // Catch:{ all -> 0x0248 }
            java.lang.String r4 = "low_pri_notifications"
            java.lang.String r5 = "use_custom_notifications"
            java.lang.String r6 = "message_tone"
            java.lang.String r7 = "message_vibrate"
            java.lang.String r9 = "message_light"
            java.lang.String r11 = "jid"
            java.lang.String r17 = "settings"
            r3 = 6
            java.lang.String[] r10 = new java.lang.String[r3]     // Catch:{ Exception -> 0x01d9 }
            r3 = 0
            r10[r3] = r11     // Catch:{ Exception -> 0x01d9 }
            r10[r2] = r9     // Catch:{ Exception -> 0x01d9 }
            r10[r14] = r7     // Catch:{ Exception -> 0x01d9 }
            r3 = 3
            r10[r3] = r6     // Catch:{ Exception -> 0x01d9 }
            r3 = 4
            r10[r3] = r5     // Catch:{ Exception -> 0x01d9 }
            r3 = 5
            r10[r3] = r4     // Catch:{ Exception -> 0x01d9 }
            r19 = 0
            r21 = r19
            r22 = r19
            r23 = r19
            r16 = r26
            r18 = r10
            r20 = r19
            android.database.Cursor r10 = r16.A09(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x01d9 }
            if (r10 == 0) goto L_0x01df
            int r13 = r10.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x01d4 }
            int r12 = r10.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x01d4 }
            int r9 = r10.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x01d4 }
            int r7 = r10.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x01d4 }
            int r6 = r10.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x01d4 }
            int r5 = r10.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x01d4 }
        L_0x014b:
            boolean r3 = r10.moveToNext()     // Catch:{ all -> 0x01d4 }
            if (r3 == 0) goto L_0x01d0
            java.lang.String r4 = r10.getString(r13)     // Catch:{ all -> 0x01d4 }
            int r3 = r10.getInt(r6)     // Catch:{ all -> 0x01d4 }
            r11 = 0
            if (r3 != r2) goto L_0x015d
            r11 = 1
        L_0x015d:
            java.lang.String r3 = "individual_chat_defaults"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x01d4 }
            if (r3 != 0) goto L_0x018d
            java.lang.String r3 = "group_chat_defaults"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x01d4 }
            if (r3 != 0) goto L_0x018d
            if (r11 == 0) goto L_0x014b
            X.0rv r11 = X.C15830rv.A02(r4)     // Catch:{ all -> 0x01d4 }
            if (r11 == 0) goto L_0x014b
            X.0rt r3 = r0.A0E     // Catch:{ all -> 0x01d4 }
            boolean r16 = r3.A0F(r11)     // Catch:{ all -> 0x01d4 }
            if (r16 == 0) goto L_0x014b
            long r20 = r3.A05(r11)     // Catch:{ all -> 0x01d4 }
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01d4 }
            long r16 = A0L     // Catch:{ all -> 0x01d4 }
            long r18 = r18 - r16
            int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x014b
        L_0x018d:
            int r11 = r10.getInt(r5)     // Catch:{ all -> 0x01d4 }
            r3 = 0
            if (r11 != r2) goto L_0x0195
            r3 = 1
        L_0x0195:
            java.lang.CharSequence r18 = r0.A06(r4)     // Catch:{ all -> 0x01d4 }
            r23 = 4
            if (r3 == 0) goto L_0x019f
            r23 = 3
        L_0x019f:
            java.lang.String r20 = r10.getString(r12)     // Catch:{ all -> 0x01d4 }
            java.lang.String r21 = r10.getString(r9)     // Catch:{ all -> 0x01d4 }
            java.lang.String r11 = r10.getString(r7)     // Catch:{ all -> 0x01d4 }
            if (r11 != 0) goto L_0x01cb
            android.net.Uri r3 = android.net.Uri.EMPTY     // Catch:{ all -> 0x01d4 }
        L_0x01af:
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x01d4 }
            if (r11 != 0) goto L_0x01bf
            X.0sj r11 = r0.A0C     // Catch:{ all -> 0x01d4 }
            boolean r11 = X.AnonymousClass1XI.A0J(r3, r8, r11, r2)     // Catch:{ all -> 0x01d4 }
            if (r11 != 0) goto L_0x01bf
            android.net.Uri r3 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI     // Catch:{ all -> 0x01d4 }
        L_0x01bf:
            java.lang.String r22 = "channel_group_chats"
            r16 = r0
            r17 = r3
            r19 = r4
            r16.A07(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01d4 }
            goto L_0x014b
        L_0x01cb:
            android.net.Uri r3 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x01d4 }
            goto L_0x01af
        L_0x01d0:
            r10.close()     // Catch:{ Exception -> 0x01d9 }
            goto L_0x01df
        L_0x01d4:
            r3 = move-exception
            r10.close()     // Catch:{ all -> 0x01d8 }
        L_0x01d8:
            throw r3     // Catch:{ Exception -> 0x01d9 }
        L_0x01d9:
            r4 = move-exception
            java.lang.String r3 = "chat-settings-store/syncNotificationChannels"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x0248 }
        L_0x01df:
            java.lang.String r6 = "individual_chat_defaults"
            boolean r3 = r1.A04(r6)     // Catch:{ all -> 0x0248 }
            if (r3 != 0) goto L_0x01f8
            java.lang.CharSequence r5 = r0.A06(r6)     // Catch:{ all -> 0x0248 }
            r10 = 4
            java.lang.String r7 = "FFFFFF"
            java.lang.String r8 = "1"
            android.net.Uri r4 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI     // Catch:{ all -> 0x0248 }
            java.lang.String r9 = "channel_group_chats"
            r3 = r0
            r3.A07(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0248 }
        L_0x01f8:
            java.lang.String r6 = "group_chat_defaults"
            boolean r3 = r1.A04(r6)     // Catch:{ all -> 0x0248 }
            if (r3 != 0) goto L_0x0211
            java.lang.CharSequence r5 = r0.A06(r6)     // Catch:{ all -> 0x0248 }
            r10 = 4
            java.lang.String r7 = "FFFFFF"
            java.lang.String r8 = "1"
            android.net.Uri r4 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI     // Catch:{ all -> 0x0248 }
            java.lang.String r9 = "channel_group_chats"
            r3 = r0
            r3.A07(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0248 }
        L_0x0211:
            java.lang.String r6 = "silent_notifications"
            boolean r1 = r1.A04(r6)     // Catch:{ all -> 0x0248 }
            if (r1 != 0) goto L_0x0227
            java.lang.CharSequence r5 = r0.A06(r6)     // Catch:{ all -> 0x0248 }
            r4 = 0
            r3 = r0
            r8 = r4
            r9 = r4
            r10 = 2
            r7 = r4
            r3.A07(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0248 }
        L_0x0227:
            r0.A02 = r2     // Catch:{ all -> 0x0248 }
            android.content.SharedPreferences$Editor r1 = r24.A0K()     // Catch:{ all -> 0x0248 }
            android.content.SharedPreferences$Editor r1 = r1.putInt(r15, r14)     // Catch:{ all -> 0x0248 }
            r1.apply()     // Catch:{ all -> 0x0248 }
            goto L_0x0237
        L_0x0235:
            r0.A02 = r2     // Catch:{ all -> 0x0248 }
        L_0x0237:
            X.0pt r3 = r0.A04     // Catch:{ all -> 0x0248 }
            r2 = 40
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r1 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13     // Catch:{ all -> 0x0248 }
            r1.<init>((java.lang.Object) r0, (int) r2)     // Catch:{ all -> 0x0248 }
            r3.Acq(r1)     // Catch:{ all -> 0x0248 }
            monitor-exit(r0)
            return
        L_0x0245:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0248 }
            throw r2     // Catch:{ all -> 0x0248 }
        L_0x0248:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40991v1.A0J(X.0tg):void");
    }

    public void A0K(String str) {
        AnonymousClass1v5 r1 = A0M;
        String A002 = r1.A00(str);
        if (A002 != null && !C41041v8.A01.contains(A002)) {
            AnonymousClass1v6.A03(A04(), A002);
            r1.A03(str, A002);
            StringBuilder sb = new StringBuilder("chat-settings-store/deleteNotificationChannel/deleting channelId:");
            sb.append(A01(A002));
            sb.append(" for settingsId:");
            sb.append(C16030sJ.A04(str));
            Log.i(sb.toString());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x01aa */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x01aa=Splitter:B:56:0x01aa, B:46:0x019b=Splitter:B:46:0x019b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(android.app.NotificationChannel r26, X.C16800tf r27) {
        /*
            r25 = this;
            java.lang.String r5 = "low_pri_notifications"
            java.lang.String r4 = "message_tone"
            java.lang.String r6 = "message_vibrate"
            java.lang.String r7 = "message_light"
            r18 = r26
            java.lang.String r3 = r18.getId()
            android.util.Pair r0 = X.C41031v7.A00(r3)
            if (r0 == 0) goto L_0x0162
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
        L_0x0018:
            r24 = 0
            if (r1 != 0) goto L_0x0032
            java.lang.String r0 = "chat-settings-store/updateStoreFromNotificationChannel invalid channel id: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = A01(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0031:
            return r24
        L_0x0032:
            java.lang.String r0 = "chat-settings-store/updateStoreFromNotificationChannel for id:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = A01(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r27
            X.0tg r10 = r0.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
            java.lang.String r11 = "settings"
            r0 = 4
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
            r12[r24] = r7     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
            r0 = 1
            r12[r0] = r6     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
            r2 = 2
            r12[r2] = r4     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
            r2 = 3
            r12[r2] = r5     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
            java.lang.String r13 = "jid = ?"
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
            r14[r24] = r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
            r15 = 0
            r17 = r15
            r16 = r15
            android.database.Cursor r2 = r10.A09(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
            r17 = r25
            if (r2 == 0) goto L_0x009e
            boolean r8 = r2.moveToNext()     // Catch:{ all -> 0x01a4 }
            if (r8 == 0) goto L_0x009e
            X.C16030sJ.A04(r1)     // Catch:{ all -> 0x01a4 }
            int r3 = r2.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x01a4 }
            java.lang.String r19 = r2.getString(r3)     // Catch:{ all -> 0x01a4 }
            int r3 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x01a4 }
            java.lang.String r20 = r2.getString(r3)     // Catch:{ all -> 0x01a4 }
            int r3 = r2.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x01a4 }
            java.lang.String r21 = r2.getString(r3)     // Catch:{ all -> 0x01a4 }
            int r3 = r2.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x01a4 }
            int r3 = r2.getInt(r3)     // Catch:{ all -> 0x01a4 }
            r22 = 0
            if (r3 != r0) goto L_0x0167
            goto L_0x0165
        L_0x009e:
            X.C16030sJ.A04(r1)     // Catch:{ all -> 0x01a4 }
            java.lang.String r5 = "individual_chat_defaults"
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x01a4 }
            if (r5 != 0) goto L_0x00e8
            java.lang.String r5 = "group_chat_defaults"
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x01a4 }
            if (r5 != 0) goto L_0x00e8
            java.lang.String r0 = "silent_notifications"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x015f
            java.lang.String r0 = "voip_notification"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x015f
            android.app.NotificationManager r0 = r17.A04()     // Catch:{ all -> 0x01a4 }
            X.AnonymousClass1v6.A03(r0, r3)     // Catch:{ all -> 0x01a4 }
            X.1v5 r0 = A0M     // Catch:{ all -> 0x01a4 }
            r0.A03(r1, r3)     // Catch:{ all -> 0x01a4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r1.<init>()     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = "chat-settings-store/updateStoreFromNotificationChannel deleting channel: "
            r1.append(r0)     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = A01(r3)     // Catch:{ all -> 0x01a4 }
            r1.append(r0)     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01a4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01a4 }
            goto L_0x015f
        L_0x00e8:
            java.lang.String r9 = "FFFFFF"
            java.lang.String r8 = "1"
            android.net.Uri r3 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI     // Catch:{ all -> 0x01a4 }
            java.lang.String r23 = r3.toString()     // Catch:{ all -> 0x01a4 }
            r19 = r17
            r20 = r18
            r21 = r9
            r22 = r8
            android.content.ContentValues r5 = r19.A05(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x01a4 }
            int r3 = r5.size()     // Catch:{ all -> 0x01a4 }
            if (r3 <= 0) goto L_0x015f
            java.lang.String r3 = "jid"
            r5.put(r3, r1)     // Catch:{ all -> 0x01a4 }
            boolean r3 = r5.containsKey(r7)     // Catch:{ all -> 0x01a4 }
            if (r3 != 0) goto L_0x0112
            r5.put(r7, r9)     // Catch:{ all -> 0x01a4 }
        L_0x0112:
            boolean r3 = r5.containsKey(r6)     // Catch:{ all -> 0x01a4 }
            if (r3 != 0) goto L_0x011b
            r5.put(r6, r8)     // Catch:{ all -> 0x01a4 }
        L_0x011b:
            boolean r3 = r5.containsKey(r4)     // Catch:{ all -> 0x01a4 }
            if (r3 != 0) goto L_0x012a
            android.net.Uri r3 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI     // Catch:{ all -> 0x01a4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01a4 }
            r5.put(r4, r3)     // Catch:{ all -> 0x01a4 }
        L_0x012a:
            java.lang.String r4 = "message_popup"
            java.lang.String r3 = java.lang.Integer.toString(r24)     // Catch:{ all -> 0x01a4 }
            r5.put(r4, r3)     // Catch:{ all -> 0x01a4 }
            java.lang.String r4 = "call_tone"
            android.net.Uri r3 = android.provider.Settings.System.DEFAULT_RINGTONE_URI     // Catch:{ all -> 0x01a4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01a4 }
            r5.put(r4, r3)     // Catch:{ all -> 0x01a4 }
            java.lang.String r3 = "call_vibrate"
            r5.put(r3, r8)     // Catch:{ all -> 0x01a4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r4.<init>()     // Catch:{ all -> 0x01a4 }
            java.lang.String r3 = "chat-settings-store/updateStoreFromNotificationChannel adding row for settingsId: "
            r4.append(r3)     // Catch:{ all -> 0x01a4 }
            java.lang.String r1 = X.C16030sJ.A04(r1)     // Catch:{ all -> 0x01a4 }
            r4.append(r1)     // Catch:{ all -> 0x01a4 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x01a4 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x01a4 }
            r10.A02(r5, r11)     // Catch:{ all -> 0x01a4 }
            goto L_0x0199
        L_0x015f:
            if (r2 == 0) goto L_0x0031
            goto L_0x01a0
        L_0x0162:
            r1 = 0
            goto L_0x0018
        L_0x0165:
            r22 = 1
        L_0x0167:
            android.content.ContentValues r5 = r17.A05(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01a4 }
            int r3 = r5.size()     // Catch:{ all -> 0x01a4 }
            if (r3 <= 0) goto L_0x01a0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r4.<init>()     // Catch:{ all -> 0x01a4 }
            java.lang.String r3 = "chat-settings-store/updateStoreFromNotificationChannel updating row for settingsId: "
            r4.append(r3)     // Catch:{ all -> 0x01a4 }
            java.lang.String r3 = X.C16030sJ.A04(r1)     // Catch:{ all -> 0x01a4 }
            r4.append(r3)     // Catch:{ all -> 0x01a4 }
            java.lang.String r3 = " with values:"
            r4.append(r3)     // Catch:{ all -> 0x01a4 }
            r4.append(r5)     // Catch:{ all -> 0x01a4 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x01a4 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x01a4 }
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x01a4 }
            r3[r24] = r1     // Catch:{ all -> 0x01a4 }
            r10.A00(r11, r5, r13, r3)     // Catch:{ all -> 0x01a4 }
            goto L_0x019b
        L_0x0199:
            if (r2 == 0) goto L_0x019f
        L_0x019b:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
            return r0
        L_0x019f:
            return r0
        L_0x01a0:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
            return r24
        L_0x01a4:
            r0 = move-exception
            if (r2 == 0) goto L_0x01aa
            r2.close()     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ab }
        L_0x01ab:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/updateStoreFromNotificationChannel"
            com.whatsapp.util.Log.i(r0, r1)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40991v1.A0L(android.app.NotificationChannel, X.0tf):boolean");
    }
}

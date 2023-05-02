package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.obwhatsapp.yo.yo;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Bf  reason: invalid class name and case insensitive filesystem */
public final class C61993Bf {
    public static final AtomicInteger A00 = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static PendingIntent A00(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, A00.incrementAndGet(), C13700nu.A02("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0463, code lost:
        if (r2 == 0) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x022e, code lost:
        if (r3 != 0) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0234, code lost:
        if (A03(r7, r3) == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0236, code lost:
        r3 = 17301651;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0279  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C83274Ga A01(android.content.Context r12, X.C61793Ai r13) {
        /*
            android.content.pm.PackageManager r2 = r12.getPackageManager()
            java.lang.String r1 = r12.getPackageName()
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r0 == 0) goto L_0x0032
            android.os.Bundle r9 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r9 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0015:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = r2.length()
            int r0 = r0 + 35
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Couldn't get own application info: "
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.w(r0, r1)
        L_0x0032:
            android.os.Bundle r9 = android.os.Bundle.EMPTY
        L_0x0034:
            java.lang.String r8 = r12.getPackageName()
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r0 = r13.A06(r0)
            java.lang.String r0 = A02(r12, r9, r0)
            android.content.res.Resources r7 = r12.getResources()
            android.content.pm.PackageManager r6 = r12.getPackageManager()
            X.03l r5 = new X.03l
            r5.<init>(r12, r0)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r1 = r13.A05(r7, r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0084
            r0 = 0
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo(r8, r0)     // Catch:{ NameNotFoundException -> 0x0065 }
            java.lang.CharSequence r1 = r0.loadLabel(r6)     // Catch:{ NameNotFoundException -> 0x0065 }
            goto L_0x0084
        L_0x0065:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = r2.length()
            int r0 = r0 + 35
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Couldn't get own application info: "
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.e(r0, r1)
            java.lang.String r1 = ""
        L_0x0084:
            r5.A0A(r1)
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r1 = r13.A05(r7, r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00a1
            r5.A09(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A09(r1)
            r5.A08(r0)
        L_0x00a1:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r4 = r13.A06(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r2 = "FirebaseMessaging"
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "drawable"
            int r3 = r7.getIdentifier(r4, r0, r8)
            if (r3 == 0) goto L_0x01d2
            boolean r0 = A03(r7, r3)
            if (r0 == 0) goto L_0x01d2
        L_0x00bd:
            android.app.Notification r4 = r5.A07
            r4.icon = r3
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r11 = r13.A06(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r11 = r13.A06(r0)
        L_0x00d3:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r3 = 2
            r10 = 0
            if (r0 != 0) goto L_0x010f
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x01cc
            java.lang.String r0 = "raw"
            int r0 = r7.getIdentifier(r11, r0, r8)
            if (r0 == 0) goto L_0x01cc
            int r0 = X.C13680ns.A06(r8)
            int r0 = r0 + 24
            java.lang.StringBuilder r1 = X.C13680ns.A0l(r11, r0)
            java.lang.String r0 = "android.resource://"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "/raw/"
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r11, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L_0x010a:
            if (r0 == 0) goto L_0x010f
            r5.A07(r0)
        L_0x010f:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r1 = r13.A06(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0193
            android.content.Intent r7 = X.C13700nu.A02(r1)
            r7.setPackage(r8)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r7.setFlags(r0)
        L_0x0127:
            java.lang.String r6 = "google.c.a.e"
            if (r7 == 0) goto L_0x0161
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r7.addFlags(r0)
            android.os.Bundle r0 = r13.A02()
            r7.putExtras(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = A00
            int r1 = r0.incrementAndGet()
            r0 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r10 = android.app.PendingIntent.getActivity(r12, r1, r7, r0)
            boolean r0 = r13.A08(r6)
            if (r0 == 0) goto L_0x0161
            java.lang.String r0 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            android.content.Intent r1 = X.C13700nu.A02(r0)
            android.os.Bundle r0 = r13.A03()
            android.content.Intent r1 = r1.putExtras(r0)
            java.lang.String r0 = "pending_intent"
            android.content.Intent r0 = r1.putExtra(r0, r10)
            android.app.PendingIntent r10 = A00(r12, r0)
        L_0x0161:
            r5.A09 = r10
            boolean r0 = r13.A08(r6)
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            android.content.Intent r1 = X.C13700nu.A02(r0)
            android.os.Bundle r0 = r13.A03()
            android.content.Intent r0 = r1.putExtras(r0)
            android.app.PendingIntent r0 = A00(r12, r0)
            if (r0 == 0) goto L_0x017f
            r4.deleteIntent = r0
        L_0x017f:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r6 = r13.A06(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x027f
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x025f
            goto L_0x023b
        L_0x0193:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r1 = r13.A06(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01a5
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r1 = r13.A06(r0)
        L_0x01a5:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01bf
            android.net.Uri r1 = android.net.Uri.parse(r1)
            if (r1 == 0) goto L_0x01bf
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r7 = X.C13700nu.A02(r0)
            r7.setPackage(r8)
            r7.setData(r1)
            goto L_0x0127
        L_0x01bf:
            android.content.Intent r7 = r6.getLaunchIntentForPackage(r8)
            if (r7 != 0) goto L_0x0127
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r2, r0)
            goto L_0x0127
        L_0x01cc:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r3)
            goto L_0x010a
        L_0x01d2:
            java.lang.String r0 = "mipmap"
            int r3 = r7.getIdentifier(r4, r0, r8)
            if (r3 == 0) goto L_0x01e2
            boolean r0 = A03(r7, r3)
            if (r0 == 0) goto L_0x01e2
            goto L_0x00bd
        L_0x01e2:
            int r0 = X.C13680ns.A06(r4)
            int r0 = r0 + 61
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Icon resource "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " not found. Notification will use default icon."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.util.Log.w(r2, r0)
        L_0x01fd:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            r1 = 0
            int r3 = r9.getInt(r0, r1)
            if (r3 == 0) goto L_0x020c
            boolean r0 = A03(r7, r3)
            if (r0 != 0) goto L_0x0230
        L_0x020c:
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo(r8, r1)     // Catch:{ NameNotFoundException -> 0x0213 }
            int r3 = r0.icon     // Catch:{ NameNotFoundException -> 0x0213 }
            goto L_0x022e
        L_0x0213:
            r0 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r0 = r4.length()
            int r0 = r0 + 35
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Couldn't get own application info: "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r1)
            android.util.Log.w(r2, r0)
        L_0x022e:
            if (r3 == 0) goto L_0x0236
        L_0x0230:
            boolean r0 = A03(r7, r3)
            if (r0 != 0) goto L_0x00bd
        L_0x0236:
            r3 = 17301651(0x1080093, float:2.4979667E-38)
            goto L_0x00bd
        L_0x023b:
            int r0 = android.graphics.Color.parseColor(r6)     // Catch:{ IllegalArgumentException -> 0x0244 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0244 }
            goto L_0x0277
        L_0x0244:
            int r0 = X.C13680ns.A06(r6)
            int r0 = r0 + 56
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Color is invalid: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ". Notification will use default color."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.util.Log.w(r2, r0)
        L_0x025f:
            r1 = 0
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r9.getInt(r0, r1)
            if (r0 == 0) goto L_0x027f
            int r0 = X.AnonymousClass00T.A00(r12, r0)     // Catch:{ NotFoundException -> 0x0271 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x0271 }
            goto L_0x0277
        L_0x0271:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r2, r0)
            goto L_0x027f
        L_0x0277:
            if (r0 == 0) goto L_0x027f
            int r0 = r0.intValue()
            r5.A00 = r0
        L_0x027f:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r13.A08(r0)
            r6 = 1
            r0 = r0 ^ 1
            r5.A0D(r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r13.A08(r0)
            r5.A0T = r0
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r13.A06(r0)
            if (r0 == 0) goto L_0x029e
            r5.A0B(r0)
        L_0x029e:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r7 = r13.A04(r0)
            if (r7 == 0) goto L_0x02b1
            int r1 = r7.intValue()
            r0 = -2
            if (r1 < r0) goto L_0x0324
            if (r1 > r3) goto L_0x0324
            r5.A03 = r1
        L_0x02b1:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r7 = r13.A04(r0)
            if (r7 == 0) goto L_0x02c4
            int r1 = r7.intValue()
            r0 = -1
            if (r1 < r0) goto L_0x0301
            if (r1 > r6) goto L_0x0301
            r5.A06 = r1
        L_0x02c4:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r1 = r13.A04(r0)
            if (r1 == 0) goto L_0x02f1
            int r0 = r1.intValue()
            if (r0 >= 0) goto L_0x02fe
            java.lang.String r7 = java.lang.String.valueOf(r1)
            int r0 = r7.length()
            int r0 = r0 + 67
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "notificationCount is invalid: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ". Skipping setting notificationCount."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.util.Log.w(r2, r0)
        L_0x02f1:
            java.lang.String r7 = "gcm.n.event_time"
            java.lang.String r2 = r13.A06(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0385
            goto L_0x0345
        L_0x02fe:
            r5.A02 = r0
            goto L_0x02f1
        L_0x0301:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r0 = r7.length()
            int r0 = r0 + 53
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "visibility is invalid: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ". Skipping setting visibility."
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r1)
            goto L_0x02c4
        L_0x0324:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r0 = r7.length()
            int r0 = r0 + 72
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "notificationPriority is invalid "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ". Skipping setting notificationPriority."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.util.Log.w(r2, r0)
            goto L_0x02b1
        L_0x0345:
            long r0 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0353 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0353 }
            if (r2 == 0) goto L_0x0385
            r5.A05(r0)
            goto L_0x0385
        L_0x0353:
            java.lang.String r0 = "gcm.n."
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x0360
            r0 = 6
            java.lang.String r7 = r7.substring(r0)
        L_0x0360:
            int r0 = X.C13680ns.A06(r7)
            int r0 = r0 + 38
            java.lang.StringBuilder r1 = X.C13680ns.A0l(r2, r0)
            java.lang.String r0 = "Couldn't parse value of "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") into a long"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r1)
        L_0x0385:
            java.lang.String r0 = "gcm.n.vibrate_timings"
            org.json.JSONArray r9 = r13.A07(r0)
            if (r9 == 0) goto L_0x03d2
            int r0 = r9.length()     // Catch:{ NumberFormatException | JSONException -> 0x03ae }
            if (r0 <= r6) goto L_0x03a5
            int r8 = r9.length()     // Catch:{ NumberFormatException | JSONException -> 0x03ae }
            long[] r7 = new long[r8]     // Catch:{ NumberFormatException | JSONException -> 0x03ae }
            r2 = 0
        L_0x039a:
            if (r2 >= r8) goto L_0x03d0
            long r0 = r9.optLong(r2)     // Catch:{ NumberFormatException | JSONException -> 0x03ae }
            r7[r2] = r0     // Catch:{ NumberFormatException | JSONException -> 0x03ae }
            int r2 = r2 + 1
            goto L_0x039a
        L_0x03a5:
            java.lang.String r1 = "vibrateTimings have invalid length"
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x03ae }
            r0.<init>(r1)     // Catch:{ NumberFormatException | JSONException -> 0x03ae }
            throw r0     // Catch:{ NumberFormatException | JSONException -> 0x03ae }
        L_0x03ae:
            java.lang.String r2 = java.lang.String.valueOf(r9)
            int r0 = r2.length()
            int r0 = r0 + 74
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "User defined vibrateTimings is invalid: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ". Skipping setting vibrateTimings."
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r1)
            goto L_0x03d2
        L_0x03d0:
            r4.vibrate = r7
        L_0x03d2:
            java.lang.String r8 = ". Skipping setting LightSettings"
            java.lang.String r9 = "LightSettings is invalid: "
            java.lang.String r7 = "NotificationParams"
            java.lang.String r0 = "gcm.n.light_settings"
            org.json.JSONArray r10 = r13.A07(r0)
            if (r10 == 0) goto L_0x046d
            r1 = 3
            int[] r11 = new int[r1]
            int r0 = r10.length()     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
            if (r0 != r1) goto L_0x040c
            r12 = 0
            java.lang.String r0 = r10.optString(r12)     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
            int r1 = android.graphics.Color.parseColor(r0)     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == r0) goto L_0x0405
            r11[r12] = r1     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
            int r0 = r10.optInt(r6)     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
            r11[r6] = r0     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
            int r2 = r10.optInt(r3)     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
            r11[r3] = r2     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
            goto L_0x0456
        L_0x0405:
            java.lang.String r0 = "Transparent color is invalid"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
            throw r0     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
        L_0x040c:
            java.lang.String r1 = "lightSettings don't have all three fields"
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
            throw r0     // Catch:{ JSONException -> 0x043a, IllegalArgumentException -> 0x0414 }
        L_0x0414:
            r0 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r10)
            java.lang.String r2 = r0.getMessage()
            int r0 = r3.length()
            int r0 = r0 + 60
            java.lang.StringBuilder r1 = X.C13680ns.A0l(r2, r0)
            r1.append(r9)
            r1.append(r3)
            java.lang.String r0 = ". "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.AnonymousClass000.A0h(r8, r1)
            goto L_0x0452
        L_0x043a:
            java.lang.String r1 = java.lang.String.valueOf(r10)
            int r0 = r1.length()
            int r0 = r0 + 58
            java.lang.StringBuilder r0 = X.C13690nt.A0g(r0)
            r0.append(r9)
            r0.append(r1)
            java.lang.String r0 = X.AnonymousClass000.A0h(r8, r0)
        L_0x0452:
            android.util.Log.w(r7, r0)
            goto L_0x046d
        L_0x0456:
            r1 = r11[r12]
            r0 = r11[r6]
            r4.ledARGB = r1
            r4.ledOnMS = r0
            r4.ledOffMS = r2
            if (r0 == 0) goto L_0x0465
            r1 = 1
            if (r2 != 0) goto L_0x0466
        L_0x0465:
            r1 = 0
        L_0x0466:
            int r0 = r4.flags
            r0 = r0 & -2
            r1 = r1 | r0
            r4.flags = r1
        L_0x046d:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r1 = r13.A08(r0)
            java.lang.String r0 = "gcm.n.default_vibrate_timings"
            boolean r0 = r13.A08(r0)
            if (r0 == 0) goto L_0x047d
            r1 = r1 | 2
        L_0x047d:
            java.lang.String r0 = "gcm.n.default_light_settings"
            boolean r0 = r13.A08(r0)
            if (r0 == 0) goto L_0x0487
            r1 = r1 | 4
        L_0x0487:
            r5.A02(r1)
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r1 = r13.A06(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x04a9
            long r2 = android.os.SystemClock.uptimeMillis()
            r0 = 37
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "FCM-Notification:"
            r1.append(r0)
            java.lang.String r1 = X.C13680ns.A0j(r1, r2)
        L_0x04a9:
            X.4Ga r0 = new X.4Ga
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61993Bf.A01(android.content.Context, X.3Ai):X.4Ga");
    }

    public static String A02(Context context, Bundle bundle, String str) {
        String str2;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(str)) {
                        if (notificationManager.getNotificationChannel(str) == null) {
                            StringBuilder A0g = C13690nt.A0g(C13680ns.A06(str) + 122);
                            A0g.append("Notification Channel requested (");
                            A0g.append(str);
                            Log.w("FirebaseMessaging", AnonymousClass000.A0h(") has not been created by the app. Manifest configuration, or default, value will be used.", A0g));
                        }
                        return str;
                    }
                    str = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(str)) {
                        if (notificationManager.getNotificationChannel(str) == null) {
                            str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
                        }
                        return str;
                    }
                    str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
                    Log.w("FirebaseMessaging", str2);
                    str = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel(str) == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str, context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), yo.Pop_Heds_O(str, 3)));
                    }
                    return str;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean A03(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                if (resources.getDrawable(i2, (Resources.Theme) null) instanceof AdaptiveIconDrawable) {
                    Log.e("FirebaseMessaging", C13680ns.A0i("Adaptive icons cannot be used in notifications. Ignoring icon id: ", C13690nt.A0g(77), i2));
                    return false;
                }
            } catch (Resources.NotFoundException unused) {
                StringBuilder A0g = C13690nt.A0g(66);
                A0g.append("Couldn't find resource ");
                A0g.append(i2);
                Log.e("FirebaseMessaging", AnonymousClass000.A0h(", treating it as an invalid icon", A0g));
                return false;
            }
        }
        return true;
    }
}

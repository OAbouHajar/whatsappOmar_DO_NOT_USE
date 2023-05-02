package X;

import java.util.HashMap;

/* renamed from: X.00c  reason: invalid class name */
public final class AnonymousClass00c {
    public static final HashMap A00;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0181, code lost:
        if (r1 >= 17) goto L_0x0084;
     */
    static {
        /*
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            A00 = r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x0173
            java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
            java.lang.String r0 = "telephony_subscription_service"
            r2.put(r1, r0)
            java.lang.Class<android.app.usage.UsageStatsManager> r1 = android.app.usage.UsageStatsManager.class
            java.lang.String r0 = "usagestats"
            r2.put(r1, r0)
        L_0x001b:
            java.lang.Class<android.appwidget.AppWidgetManager> r1 = android.appwidget.AppWidgetManager.class
            java.lang.String r0 = "appwidget"
            r2.put(r1, r0)
            java.lang.Class<android.os.BatteryManager> r1 = android.os.BatteryManager.class
            java.lang.String r0 = "batterymanager"
            r2.put(r1, r0)
            java.lang.Class<android.hardware.camera2.CameraManager> r1 = android.hardware.camera2.CameraManager.class
            java.lang.String r0 = "camera"
            r2.put(r1, r0)
            java.lang.Class<android.app.job.JobScheduler> r1 = android.app.job.JobScheduler.class
            java.lang.String r0 = "jobscheduler"
            r2.put(r1, r0)
            java.lang.Class<android.content.pm.LauncherApps> r1 = android.content.pm.LauncherApps.class
            java.lang.String r0 = "launcherapps"
            r2.put(r1, r0)
            java.lang.Class<android.media.projection.MediaProjectionManager> r1 = android.media.projection.MediaProjectionManager.class
            java.lang.String r0 = "media_projection"
            r2.put(r1, r0)
            java.lang.Class<android.media.session.MediaSessionManager> r1 = android.media.session.MediaSessionManager.class
            java.lang.String r0 = "media_session"
            r2.put(r1, r0)
            java.lang.Class<android.content.RestrictionsManager> r1 = android.content.RestrictionsManager.class
            java.lang.String r0 = "restrictions"
            r2.put(r1, r0)
            java.lang.Class<android.telecom.TelecomManager> r1 = android.telecom.TelecomManager.class
            java.lang.String r0 = "telecom"
            r2.put(r1, r0)
            java.lang.Class<android.media.tv.TvInputManager> r1 = android.media.tv.TvInputManager.class
            java.lang.String r0 = "tv_input"
            r2.put(r1, r0)
        L_0x0061:
            java.lang.Class<android.app.AppOpsManager> r1 = android.app.AppOpsManager.class
            java.lang.String r0 = "appops"
            r2.put(r1, r0)
            java.lang.Class<android.view.accessibility.CaptioningManager> r1 = android.view.accessibility.CaptioningManager.class
            java.lang.String r0 = "captioning"
            r2.put(r1, r0)
            java.lang.Class<android.hardware.ConsumerIrManager> r1 = android.hardware.ConsumerIrManager.class
            java.lang.String r0 = "consumer_ir"
            r2.put(r1, r0)
            java.lang.Class<android.print.PrintManager> r1 = android.print.PrintManager.class
            java.lang.String r0 = "print"
            r2.put(r1, r0)
        L_0x007d:
            java.lang.Class<android.bluetooth.BluetoothManager> r1 = android.bluetooth.BluetoothManager.class
            java.lang.String r0 = "bluetooth"
            r2.put(r1, r0)
        L_0x0084:
            java.lang.Class<android.hardware.display.DisplayManager> r1 = android.hardware.display.DisplayManager.class
            java.lang.String r0 = "display"
            r2.put(r1, r0)
            java.lang.Class<android.os.UserManager> r1 = android.os.UserManager.class
            java.lang.String r0 = "user"
            r2.put(r1, r0)
        L_0x0092:
            java.lang.Class<android.hardware.input.InputManager> r1 = android.hardware.input.InputManager.class
            java.lang.String r0 = "input"
            r2.put(r1, r0)
            java.lang.Class<android.media.MediaRouter> r1 = android.media.MediaRouter.class
            java.lang.String r0 = "media_router"
            r2.put(r1, r0)
            java.lang.Class<android.net.nsd.NsdManager> r1 = android.net.nsd.NsdManager.class
            java.lang.String r0 = "servicediscovery"
            r2.put(r1, r0)
            java.lang.Class<android.view.accessibility.AccessibilityManager> r1 = android.view.accessibility.AccessibilityManager.class
            java.lang.String r0 = "accessibility"
            r2.put(r1, r0)
            java.lang.Class<android.accounts.AccountManager> r1 = android.accounts.AccountManager.class
            java.lang.String r0 = "account"
            r2.put(r1, r0)
            java.lang.Class<android.app.ActivityManager> r1 = android.app.ActivityManager.class
            java.lang.String r0 = "activity"
            r2.put(r1, r0)
            java.lang.Class<android.app.AlarmManager> r1 = android.app.AlarmManager.class
            java.lang.String r0 = "alarm"
            r2.put(r1, r0)
            java.lang.Class<android.media.AudioManager> r1 = android.media.AudioManager.class
            java.lang.String r0 = "audio"
            r2.put(r1, r0)
            java.lang.Class<android.content.ClipboardManager> r1 = android.content.ClipboardManager.class
            java.lang.String r0 = "clipboard"
            r2.put(r1, r0)
            java.lang.Class<android.net.ConnectivityManager> r1 = android.net.ConnectivityManager.class
            java.lang.String r0 = "connectivity"
            r2.put(r1, r0)
            java.lang.Class<android.app.admin.DevicePolicyManager> r1 = android.app.admin.DevicePolicyManager.class
            java.lang.String r0 = "device_policy"
            r2.put(r1, r0)
            java.lang.Class<android.app.DownloadManager> r1 = android.app.DownloadManager.class
            java.lang.String r0 = "download"
            r2.put(r1, r0)
            java.lang.Class<android.os.DropBoxManager> r1 = android.os.DropBoxManager.class
            java.lang.String r0 = "dropbox"
            r2.put(r1, r0)
            java.lang.Class<android.view.inputmethod.InputMethodManager> r1 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "input_method"
            r2.put(r1, r0)
            java.lang.Class<android.app.KeyguardManager> r1 = android.app.KeyguardManager.class
            java.lang.String r0 = "keyguard"
            r2.put(r1, r0)
            java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
            java.lang.String r0 = "layout_inflater"
            r2.put(r1, r0)
            java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
            java.lang.String r0 = "location"
            r2.put(r1, r0)
            java.lang.Class<android.nfc.NfcManager> r1 = android.nfc.NfcManager.class
            java.lang.String r0 = "nfc"
            r2.put(r1, r0)
            java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
            java.lang.String r0 = "notification"
            r2.put(r1, r0)
            java.lang.Class<android.os.PowerManager> r1 = android.os.PowerManager.class
            java.lang.String r0 = "power"
            r2.put(r1, r0)
            java.lang.Class<android.app.SearchManager> r1 = android.app.SearchManager.class
            java.lang.String r0 = "search"
            r2.put(r1, r0)
            java.lang.Class<android.hardware.SensorManager> r1 = android.hardware.SensorManager.class
            java.lang.String r0 = "sensor"
            r2.put(r1, r0)
            java.lang.Class<android.os.storage.StorageManager> r1 = android.os.storage.StorageManager.class
            java.lang.String r0 = "storage"
            r2.put(r1, r0)
            java.lang.Class<android.telephony.TelephonyManager> r1 = android.telephony.TelephonyManager.class
            java.lang.String r0 = "phone"
            r2.put(r1, r0)
            java.lang.Class<android.view.textservice.TextServicesManager> r1 = android.view.textservice.TextServicesManager.class
            java.lang.String r0 = "textservices"
            r2.put(r1, r0)
            java.lang.Class<android.app.UiModeManager> r1 = android.app.UiModeManager.class
            java.lang.String r0 = "uimode"
            r2.put(r1, r0)
            java.lang.Class<android.hardware.usb.UsbManager> r1 = android.hardware.usb.UsbManager.class
            java.lang.String r0 = "usb"
            r2.put(r1, r0)
            java.lang.Class<android.os.Vibrator> r1 = android.os.Vibrator.class
            java.lang.String r0 = "vibrator"
            r2.put(r1, r0)
            java.lang.Class<android.app.WallpaperManager> r1 = android.app.WallpaperManager.class
            java.lang.String r0 = "wallpaper"
            r2.put(r1, r0)
            java.lang.Class<android.net.wifi.p2p.WifiP2pManager> r1 = android.net.wifi.p2p.WifiP2pManager.class
            java.lang.String r0 = "wifip2p"
            r2.put(r1, r0)
            java.lang.Class<android.net.wifi.WifiManager> r1 = android.net.wifi.WifiManager.class
            java.lang.String r0 = "wifi"
            r2.put(r1, r0)
            java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
            java.lang.String r0 = "window"
            r2.put(r1, r0)
            return
        L_0x0173:
            r0 = 21
            if (r1 >= r0) goto L_0x001b
            r0 = 19
            if (r1 >= r0) goto L_0x0061
            r0 = 18
            if (r1 >= r0) goto L_0x007d
            r0 = 17
            if (r1 < r0) goto L_0x0092
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00c.<clinit>():void");
    }
}

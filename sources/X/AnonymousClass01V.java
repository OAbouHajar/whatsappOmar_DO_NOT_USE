package X;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.Vibrator;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import com.obwhatsapp.yo.yo;

/* renamed from: X.01V  reason: invalid class name */
public class AnonymousClass01V {
    public static boolean A0P;
    public ActivityManager A00;
    public AppOpsManager A01;
    public KeyguardManager A02;
    public NotificationManager A03;
    public AnonymousClass02M A04;
    public JobScheduler A05;
    public UsageStatsManager A06;
    public ClipboardManager A07;
    public ContentResolver A08;
    public SensorManager A09;
    public CameraManager A0A;
    public LocationManager A0B;
    public AudioManager A0C;
    public ConnectivityManager A0D;
    public WifiManager A0E;
    public PowerManager A0F;
    public UserManager A0G;
    public Vibrator A0H;
    public TelecomManager A0I;
    public SubscriptionManager A0J;
    public TelephonyManager A0K;
    public WindowManager A0L;
    public AccessibilityManager A0M;
    public InputMethodManager A0N;
    public final C16980tz A0O;

    public AnonymousClass01V(C16980tz r1) {
        this.A0O = r1;
    }

    public static PrintManager A00(Context context) {
        AnonymousClass00B.A0B("Application context should not be used here", !(context instanceof Application));
        return (PrintManager) context.getSystemService("print");
    }

    public static LayoutInflater A01(Context context) {
        AnonymousClass00B.A0B("Application context should not be used here", !(context instanceof Application));
        return (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public static WindowManager A02(Context context) {
        AnonymousClass00B.A0B("Application context should not be used here", !(context instanceof Application));
        Object systemService = context.getSystemService("window");
        AnonymousClass00B.A06(systemService);
        return (WindowManager) systemService;
    }

    public static AnonymousClass01V A21() {
        return (AnonymousClass01V) yo.mSingletonC.AOi.get();
    }

    public ActivityManager A03() {
        ActivityManager activityManager = this.A00;
        if (activityManager != null) {
            return activityManager;
        }
        boolean z2 = A0P;
        ActivityManager activityManager2 = (ActivityManager) A0S("activity", false);
        this.A00 = activityManager2;
        return activityManager2;
    }

    public AlarmManager A04() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 && i2 < 26) {
            return A05();
        }
        boolean z2 = A0P;
        return (AlarmManager) A0S("alarm", false);
    }

    public final AlarmManager A05() {
        AnonymousClass02M r1 = this.A04;
        if (r1 != null) {
            return r1;
        }
        boolean z2 = A0P;
        AnonymousClass02M r12 = new AnonymousClass02M((AlarmManager) A0S("alarm", false));
        this.A04 = r12;
        return r12;
    }

    public AppOpsManager A06() {
        AppOpsManager appOpsManager = this.A01;
        if (appOpsManager != null) {
            return appOpsManager;
        }
        AppOpsManager appOpsManager2 = (AppOpsManager) A0R("appops");
        this.A01 = appOpsManager2;
        return appOpsManager2;
    }

    public KeyguardManager A07() {
        KeyguardManager keyguardManager = this.A02;
        if (keyguardManager != null) {
            return keyguardManager;
        }
        KeyguardManager keyguardManager2 = (KeyguardManager) A0R("keyguard");
        this.A02 = keyguardManager2;
        return keyguardManager2;
    }

    public NotificationManager A08() {
        NotificationManager notificationManager = this.A03;
        if (notificationManager != null) {
            return notificationManager;
        }
        NotificationManager notificationManager2 = (NotificationManager) A0R("notification");
        this.A03 = notificationManager2;
        return notificationManager2;
    }

    public JobScheduler A09() {
        JobScheduler jobScheduler = this.A05;
        if (jobScheduler != null) {
            return jobScheduler;
        }
        JobScheduler jobScheduler2 = (JobScheduler) A0R("jobscheduler");
        this.A05 = jobScheduler2;
        return jobScheduler2;
    }

    public UsageStatsManager A0A() {
        UsageStatsManager usageStatsManager = this.A06;
        if (usageStatsManager != null) {
            return usageStatsManager;
        }
        UsageStatsManager usageStatsManager2 = (UsageStatsManager) A0R("usagestats");
        this.A06 = usageStatsManager2;
        return usageStatsManager2;
    }

    public ClipboardManager A0B() {
        ClipboardManager clipboardManager = this.A07;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) A0R("clipboard");
        this.A07 = clipboardManager2;
        return clipboardManager2;
    }

    public ContentResolver A0C() {
        ContentResolver contentResolver = this.A08;
        if (contentResolver != null) {
            return contentResolver;
        }
        ContentResolver contentResolver2 = this.A0O.A01().getContentResolver();
        this.A08 = contentResolver2;
        return contentResolver2;
    }

    public SensorManager A0D() {
        SensorManager sensorManager = this.A09;
        if (sensorManager != null) {
            return sensorManager;
        }
        SensorManager sensorManager2 = (SensorManager) A0R("sensor");
        this.A09 = sensorManager2;
        return sensorManager2;
    }

    public CameraManager A0E() {
        CameraManager cameraManager = this.A0A;
        if (cameraManager != null) {
            return cameraManager;
        }
        CameraManager cameraManager2 = (CameraManager) A0R("camera");
        this.A0A = cameraManager2;
        return cameraManager2;
    }

    public LocationManager A0F() {
        LocationManager locationManager = this.A0B;
        if (locationManager != null) {
            return locationManager;
        }
        LocationManager locationManager2 = (LocationManager) A0R("location");
        this.A0B = locationManager2;
        return locationManager2;
    }

    public AudioManager A0G() {
        AudioManager audioManager = this.A0C;
        if (audioManager != null) {
            return audioManager;
        }
        boolean z2 = A0P;
        AudioManager audioManager2 = (AudioManager) A0S("audio", false);
        this.A0C = audioManager2;
        return audioManager2;
    }

    public ConnectivityManager A0H() {
        ConnectivityManager connectivityManager = this.A0D;
        if (connectivityManager != null) {
            return connectivityManager;
        }
        ConnectivityManager connectivityManager2 = (ConnectivityManager) A0R("connectivity");
        this.A0D = connectivityManager2;
        return connectivityManager2;
    }

    public PowerManager A0I() {
        PowerManager powerManager = this.A0F;
        if (powerManager != null) {
            return powerManager;
        }
        boolean z2 = A0P;
        PowerManager powerManager2 = (PowerManager) A0S("power", false);
        this.A0F = powerManager2;
        return powerManager2;
    }

    public UserManager A0J() {
        UserManager userManager = this.A0G;
        if (userManager != null) {
            return userManager;
        }
        UserManager userManager2 = (UserManager) A0R("user");
        this.A0G = userManager2;
        return userManager2;
    }

    public Vibrator A0K() {
        Vibrator vibrator = this.A0H;
        if (vibrator != null) {
            return vibrator;
        }
        boolean z2 = A0P;
        Vibrator vibrator2 = (Vibrator) A0S("vibrator", false);
        this.A0H = vibrator2;
        return vibrator2;
    }

    public TelecomManager A0L() {
        TelecomManager telecomManager = this.A0I;
        if (telecomManager != null) {
            return telecomManager;
        }
        TelecomManager telecomManager2 = (TelecomManager) A0R("telecom");
        this.A0I = telecomManager2;
        return telecomManager2;
    }

    public SubscriptionManager A0M() {
        SubscriptionManager subscriptionManager = this.A0J;
        if (subscriptionManager != null) {
            return subscriptionManager;
        }
        SubscriptionManager subscriptionManager2 = (SubscriptionManager) A0R("telephony_subscription_service");
        this.A0J = subscriptionManager2;
        return subscriptionManager2;
    }

    public TelephonyManager A0N() {
        TelephonyManager telephonyManager = this.A0K;
        if (telephonyManager != null) {
            return telephonyManager;
        }
        boolean z2 = A0P;
        TelephonyManager telephonyManager2 = (TelephonyManager) A0S("phone", false);
        this.A0K = telephonyManager2;
        return telephonyManager2;
    }

    @Deprecated
    public WindowManager A0O() {
        WindowManager windowManager = this.A0L;
        if (windowManager == null) {
            windowManager = (WindowManager) A0R("window");
            this.A0L = windowManager;
        }
        AnonymousClass00B.A06(windowManager);
        return windowManager;
    }

    public AccessibilityManager A0P() {
        AccessibilityManager accessibilityManager = this.A0M;
        if (accessibilityManager != null) {
            return accessibilityManager;
        }
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) A0R("accessibility");
        this.A0M = accessibilityManager2;
        return accessibilityManager2;
    }

    public InputMethodManager A0Q() {
        InputMethodManager inputMethodManager = this.A0N;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManager2 = (InputMethodManager) A0R("input_method");
        this.A0N = inputMethodManager2;
        return inputMethodManager2;
    }

    public final Object A0R(String str) {
        boolean z2 = A0P;
        return A0S(str, true);
    }

    public final Object A0S(String str, boolean z2) {
        Context A012 = this.A0O.A01();
        if (!z2) {
            A012 = ((ContextWrapper) A012).getBaseContext();
        }
        return A012.getSystemService(str);
    }

    public boolean A0T(String str) {
        return this.A0O.A01().getPackageManager().hasSystemFeature(str);
    }
}

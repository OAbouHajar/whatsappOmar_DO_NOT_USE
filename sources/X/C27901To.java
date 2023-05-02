package X;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.squareup.picasso.BuildConfig;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.1To  reason: invalid class name and case insensitive filesystem */
public final class C27901To implements C27881Tm {
    public final C16040sK A00;
    public final AnonymousClass01V A01;
    public final C16440t3 A02;
    public final C16980tz A03;
    public final C16260sj A04;
    public final C15860rz A05;
    public final AnonymousClass01J A06;

    public C27901To(C16040sK r2, AnonymousClass01V r3, C16440t3 r4, C16980tz r5, C16260sj r6, C15860rz r7, AnonymousClass01J r8) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r5, 2);
        C18450wi.A0H(r2, 3);
        C18450wi.A0H(r3, 4);
        C18450wi.A0H(r7, 5);
        C18450wi.A0H(r6, 6);
        C18450wi.A0H(r8, 7);
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A06 = r8;
    }

    public static final String A00(Context context) {
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            Log.e("findmissingpermissions/no-package-manager");
        } else {
            try {
                obj = packageManager.getPackageInfo("com.obwhatsapp", 4096);
            } catch (Throwable th) {
                obj = new C41211vQ(th);
            }
            Throwable A002 = C41201vP.A00(obj);
            if (A002 == null) {
                C18450wi.A0E(obj);
                PackageInfo packageInfo = (PackageInfo) obj;
                String[] strArr = packageInfo.requestedPermissions;
                if (strArr != null) {
                    StringBuilder sb = new StringBuilder();
                    int[] iArr = packageInfo.requestedPermissionsFlags;
                    C18450wi.A0A(iArr);
                    int length = iArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        int i4 = iArr[i2];
                        i2++;
                        int i5 = i3 + 1;
                        if ((i4 & 2) == 0) {
                            boolean z2 = false;
                            if (sb.length() > 0) {
                                z2 = true;
                            }
                            if (z2) {
                                sb.append(", ");
                            }
                            sb.append(strArr[i3]);
                        }
                        i3 = i5;
                    }
                    String obj2 = sb.toString();
                    C18450wi.A0B(obj2);
                    return obj2;
                }
            } else {
                Log.e(A002);
                return "";
            }
        }
        return "";
    }

    public final void A01(String str) {
        String str2;
        UsageStatsManager A0A = this.A01.A0A();
        if (A0A != null) {
            long currentTimeMillis = System.currentTimeMillis();
            UsageEvents queryEventsForSelf = A0A.queryEventsForSelf(currentTimeMillis - TimeUnit.HOURS.toMillis(12), currentTimeMillis);
            C18450wi.A0B(queryEventsForSelf);
            UsageEvents.Event event = new UsageEvents.Event();
            while (queryEventsForSelf.getNextEvent(event)) {
                if (event.getEventType() == 11) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("/app-standby bucket:");
                    sb.append(event.getAppStandbyBucket());
                    sb.append(" time:");
                    sb.append(event.getTimeStamp());
                    Log.i(sb.toString());
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("/current app-standby bucket:");
            sb2.append(A0A.getAppStandbyBucket());
            str2 = sb2.toString();
        } else {
            str2 = C18450wi.A06(str, "/usage-stats-manager null");
        }
        Log.i(str2);
    }

    public void AKL(String str) {
        NotificationManager A08;
        PowerManager A0I;
        C18450wi.A0H(str, 0);
        AnonymousClass01E.A00();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/settings/notifications-enabled: ");
        Context context = this.A03.A00;
        sb.append(new AnonymousClass03S(context).A03());
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/google-play-services: ");
        sb2.append(C437421i.A01(context));
        Log.i(sb2.toString());
        if (C15450qv.A03() && (A0I = this.A01.A0I()) != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("/power-save-mode:");
            sb3.append(A0I.isPowerSaveMode());
            Log.i(sb3.toString());
        }
        if (C15450qv.A08() && (A08 = this.A01.A08()) != null) {
            int currentInterruptionFilter = A08.getCurrentInterruptionFilter();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("/do-not-disturb:");
            boolean z2 = true;
            if (currentInterruptionFilter == 1 || currentInterruptionFilter == 0) {
                z2 = false;
            }
            sb4.append(z2);
            Log.i(sb4.toString());
        }
        if (C15450qv.A08()) {
            ActivityManager A032 = this.A01.A03();
            if (A032 != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append("/background-restricted:");
                sb5.append(A032.isBackgroundRestricted());
                Log.i(sb5.toString());
            }
            A01(str);
        }
    }

    public void AKN(AnonymousClass2JM r15) {
        String str;
        String str2;
        String obj;
        String str3;
        C18450wi.A0H(r15, 0);
        Context context = r15.A00;
        Locale locale = context.getResources().getConfiguration().locale;
        C15860rz r4 = this.A05;
        String A0O = r4.A0O();
        C18450wi.A0B(A0O);
        String A0Q = r4.A0Q();
        C18450wi.A0B(A0Q);
        AnonymousClass01V r5 = this.A01;
        TelephonyManager A0N = r5.A0N();
        String str4 = "N/A (no telephony manager)";
        if (A0N != null) {
            str4 = C47032Hf.A01(A0N.getNetworkOperator(), "N/A");
            C18450wi.A0B(str4);
            str2 = C47032Hf.A01(A0N.getSimOperator(), "N/A");
            C18450wi.A0B(str2);
            str = A0N.getNetworkOperatorName();
            C18450wi.A0B(str);
        } else {
            str = "UNKNOWN (no telephony manager)";
            str2 = str4;
        }
        Integer valueOf = Integer.valueOf(this.A00.A00());
        Map map = r15.A01;
        map.put("Device ID", valueOf);
        map.put("Description", "2.23.1.76");
        map.put("Version", C18450wi.A06("2.23.1.76", ""));
        map.put("App", "com.whatsapp");
        String str5 = "zz";
        map.put("LC", locale != null ? locale.getCountry() : str5);
        if (locale != null) {
            str5 = locale.getLanguage();
        }
        map.put("LG", str5);
        map.put("Carrier", str);
        map.put("Manufacturer", Build.MANUFACTURER);
        map.put("Model", Build.MODEL);
        map.put("CPU ABI", AnonymousClass1U8.A02());
        map.put("OS", Build.VERSION.RELEASE);
        map.put("Radio MCC-MNC", str4);
        map.put("SIM MCC-MNC", str2);
        if (r15.A02) {
            obj = C18450wi.A06("", A0O);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(A0O);
            sb.append(' ');
            sb.append(A0Q);
            obj = sb.toString();
        }
        map.put("CCode", obj);
        TelephonyManager A0N2 = r5.A0N();
        String str6 = "UNKNOWN (no telephony manager)";
        if (A0N2 != null) {
            int phoneType = A0N2.getPhoneType();
            str6 = phoneType != 0 ? phoneType != 1 ? phoneType != 2 ? phoneType != 3 ? "UNKNOWN" : "SIP" : "CDMA" : "GSM" : "NONE";
            switch (AnonymousClass1U8.A01(A0N2, this.A04)) {
                case 1:
                    str3 = "GPRS";
                    break;
                case 2:
                    str3 = "EDGE";
                    break;
                case 3:
                    str3 = "UMTS";
                    break;
                case 4:
                    str3 = "CDMA";
                    break;
                case 5:
                    str3 = "CDMA - EvDo rev. 0";
                    break;
                case 6:
                    str3 = "CDMA - EvDo rev. A";
                    break;
                case 7:
                    str3 = "CDMA - 1xRTT";
                    break;
                case 8:
                    str3 = "HSDPA";
                    break;
                case 9:
                    str3 = "HSUPA";
                    break;
                case 10:
                    str3 = "HSPA";
                    break;
                case 11:
                    str3 = "iDEN";
                    break;
                case 12:
                    str3 = "CDMA - EvDo rev. B";
                    break;
                case 13:
                    str3 = "LTE";
                    break;
                case 14:
                    str3 = "CDMA - eHRPD";
                    break;
                case 15:
                    str3 = "HSPA+";
                    break;
                default:
                    str3 = "UNKNOWN";
                    break;
            }
        } else {
            str3 = str6;
        }
        map.put("Target", BuildConfig.BUILD_TYPE);
        map.put("Product", Build.PRODUCT);
        map.put("Device", Build.DEVICE);
        map.put("Build", Build.DISPLAY);
        map.put("Board", Build.BOARD);
        map.put("Kernel", C004101u.A00());
        map.put("Device ISO8601", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US).format(new Date()));
        int length = str6.length();
        StringBuilder sb2 = new StringBuilder(length << 1);
        int i2 = 0;
        while (i2 < length) {
            char charAt = str6.charAt(i2);
            i2++;
            sb2.append(charAt);
            sb2.append(FilenameUtils.EXTENSION_SEPARATOR);
        }
        map.put("Phone Type", sb2.toString());
        int length2 = str3.length();
        StringBuilder sb3 = new StringBuilder(length2 << 1);
        int i3 = 0;
        while (i3 < length2) {
            char charAt2 = str3.charAt(i3);
            i3++;
            sb3.append(charAt2);
            sb3.append(FilenameUtils.EXTENSION_SEPARATOR);
        }
        map.put("Network Type", sb3.toString());
        if (C15450qv.A04()) {
            map.put("Missing Permissions", A00(context));
        }
        map.put("Architecture", System.getProperty("os.arch"));
        if (C15450qv.A08()) {
            AnonymousClass01D r52 = r4.A01;
            if (((SharedPreferences) r52.get()).getString("pref_primary_flash_call_status", (String) null) != null) {
                map.put("Primary flash call status", ((SharedPreferences) r52.get()).getString("pref_primary_flash_call_status", (String) null));
            }
        }
        if (C15450qv.A04()) {
            AnonymousClass01D r53 = r4.A01;
            if (((SharedPreferences) r53.get()).getString("pref_secondary_flash_call_status", (String) null) != null) {
                map.put("Secondary flash call status", ((SharedPreferences) r53.get()).getString("pref_secondary_flash_call_status", (String) null));
            }
        }
        AnonymousClass01D r54 = r4.A01;
        map.put("AutoConf status", ((SharedPreferences) r54.get()).getString("pref_autoconf_status", (String) null));
        if (((SharedPreferences) r54.get()).getString("pref_wa_old_status", (String) null) != null) {
            map.put("WA old status", ((SharedPreferences) r54.get()).getString("pref_wa_old_status", (String) null));
        }
        map.put("Is Tablet", this.A06.get());
        map.put("Is Foldable", Boolean.valueOf(r4.A1e()));
    }

    public /* synthetic */ void AKY(String str) {
    }
}

package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import com.AssemMods.translator.Language;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.03p  reason: invalid class name and case insensitive filesystem */
public class C007803p {
    public static long A00;
    public static BroadcastReceiver A01;
    public static Context A02;
    public static String A03;
    public static String A04;
    public static String A05;
    public static boolean A06;
    public static final AnonymousClass0P6 A07;
    public static final AnonymousClass0P6 A08 = new AnonymousClass0P6("https://maps.instagram.com/maps/tile/?", "https://maps.instagram.com/maps/static/?", (Rect[]) null, (String[]) null, (C05150Pm[][]) null, Integer.MAX_VALUE);
    public static final AnonymousClass0P6 A09 = new AnonymousClass0P6("https://expresswifi.com/maps/tile/?", "https://expresswifi.com/maps/static/?", (Rect[]) null, (String[]) null, (C05150Pm[][]) null, Integer.MAX_VALUE);
    public static final List A0A = new LinkedList();
    public static final Semaphore A0B = new Semaphore(1);
    public static volatile AnonymousClass0P6 A0C;
    public static volatile String A0D;
    public static volatile String A0E = "https://graph.facebook.com/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";

    static {
        AnonymousClass0P6 r0 = new AnonymousClass0P6("https://www.facebook.com/maps/tile/?", "https://www.facebook.com/maps/static/?", (Rect[]) null, (String[]) null, (C05150Pm[][]) null, Integer.MAX_VALUE);
        A07 = r0;
        A0C = r0;
        A00();
    }

    public static void A00() {
        String str;
        String str2;
        String language = Locale.getDefault().getLanguage();
        if (language.length() == 2) {
            String country = Locale.getDefault().getCountry();
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            if (country.length() == 2) {
                StringBuilder sb2 = new StringBuilder("_");
                sb2.append(country);
                str2 = sb2.toString();
            } else {
                str2 = "";
            }
            sb.append(str2);
            str = sb.toString();
        } else {
            str = Language.ENGLISH;
        }
        A04 = str;
        A05 = str.toLowerCase(Locale.US);
        try {
            Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r2, java.lang.String r3) {
        /*
            A0D = r3
            android.content.Context r0 = r2.getApplicationContext()
            A02 = r0
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.instagram.android"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "https://graph.instagram.com/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token="
            A0E = r0
            X.0P6 r0 = A08
        L_0x001a:
            A0C = r0
        L_0x001c:
            android.content.BroadcastReceiver r0 = A01
            if (r0 != 0) goto L_0x0033
            X.0AC r3 = new X.0AC
            r3.<init>()
            A01 = r3
            android.content.Context r2 = A02
            java.lang.String r1 = "android.intent.action.LOCALE_CHANGED"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r2.registerReceiver(r3, r0)
        L_0x0033:
            return
        L_0x0034:
            java.lang.String r0 = "com.whatsapp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "com.whatsapp.w4b"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "com.expresswifi.customer"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001c
            X.0P6 r0 = A09
            goto L_0x001a
        L_0x004f:
            java.lang.String r0 = "https://graph.whatsapp.net/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token="
            A0E = r0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007803p.A01(android.content.Context, java.lang.String):void");
    }

    public static void A02(boolean z2) {
        if (A0D != null && A02 != null) {
            Semaphore semaphore = A0B;
            if (semaphore.tryAcquire()) {
                long j2 = A00;
                if (j2 == 0 || SystemClock.uptimeMillis() - j2 >= 3600000) {
                    A06 = z2;
                    C03420Il r4 = new C03420Il(A02);
                    int i2 = AnonymousClass0X2.A00;
                    AnonymousClass0X2.A00 = i2 - 1;
                    r4.A00 = ((long) i2) << 32;
                    r4.A02 = "MapConfigUpdateDispatchable";
                    r4.A01 = 0;
                    AnonymousClass0X2.A00().A00.add(r4);
                    return;
                }
                semaphore.release();
            } else if (z2) {
                try {
                    if (semaphore.tryAcquire(10, TimeUnit.SECONDS)) {
                        semaphore.release();
                    }
                } catch (InterruptedException unused) {
                    AnonymousClass0V3.A07.A02();
                }
            }
        }
    }
}

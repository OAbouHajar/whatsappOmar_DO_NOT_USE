package X;

import com.obwhatsapp.R;
import java.util.Locale;

/* renamed from: X.46P  reason: invalid class name */
public class AnonymousClass46P {
    public static int A00(AnonymousClass1WN r3) {
        C37421p8 r2 = r3.A07;
        String str = r3.A08;
        String lowerCase = str != null ? str.toLowerCase(Locale.US) : null;
        switch (r2.ordinal()) {
            case 1:
                return R.drawable.device_list_ic_chrome;
            case 2:
                return R.drawable.device_list_ic_firefox;
            case 3:
                return R.drawable.device_list_ic_ie;
            case 4:
                return R.drawable.device_list_ic_opera;
            case 5:
                return R.drawable.device_list_ic_safari;
            case 6:
                return R.drawable.device_list_ic_edge;
            case 7:
                return "windows".equals(lowerCase) ? R.drawable.device_list_ic_windows : "mac os".equals(lowerCase) ? R.drawable.device_list_ic_mac : R.drawable.device_list_ic_desktop_fallback;
            case 8:
                return R.drawable.device_list_ic_unknown_device;
            case 9:
                return R.drawable.device_list_ic_android_tablet;
            case 10:
            case 11:
            case 12:
            case 13:
                return R.drawable.device_list_ic_portal;
            default:
                return R.drawable.device_list_ic_unknown_browser;
        }
    }
}

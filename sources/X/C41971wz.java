package X;

import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1wz  reason: invalid class name and case insensitive filesystem */
public class C41971wz {
    public static void A00(View view, Window window, AnonymousClass01V r5) {
        if (Build.MANUFACTURER.equals("OnePlus")) {
            String str = Build.MODEL;
            if ((str.equals("ONEPLUS A6000") || str.equals("ONEPLUS A6003")) && (window.getAttributes().flags & 1024) != 0 && r5.A0T("com.oneplus.screen.cameranotch")) {
                view.setPadding(0, (int) TypedValue.applyDimension(5, 5.0f, view.getContext().getResources().getDisplayMetrics()), 0, 0);
            }
        }
    }

    public static boolean A01() {
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 != 26 && i2 != 27) || !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
            return false;
        }
        String str = Build.MODEL;
        return str.startsWith("SM-G570") || str.startsWith("SM-J260") || str.startsWith("SM-G935") || str.startsWith("SM-G930") || str.startsWith("SM-A520") || str.startsWith("SM-A720") || str.startsWith("SM-A260") || str.startsWith("SM-J400") || str.startsWith("SM-J600") || str.startsWith("SM-G950");
    }

    public static boolean A02() {
        String str = Build.MANUFACTURER;
        if (str.equalsIgnoreCase("vestel") && Build.MODEL.equalsIgnoreCase("vsp250s")) {
            return true;
        }
        if (str.equalsIgnoreCase("asus")) {
            String str2 = Build.MODEL;
            if (str2.equalsIgnoreCase("ASUS_Z00AD") || str2.equalsIgnoreCase("asus_x00ada") || str2.equalsIgnoreCase("asus_x00adc") || str2.equalsIgnoreCase("asus_t00j") || str2.equalsIgnoreCase("asus_x00ad") || str2.equalsIgnoreCase("asus_x014d") || str2.equalsIgnoreCase("asus_z008d") || str2.equalsIgnoreCase("asus_z00ldd") || str2.equalsIgnoreCase("zb500kl")) {
                return true;
            }
        }
        return str.equalsIgnoreCase("realme") && Build.MODEL.equalsIgnoreCase("RMX3231");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r0 == false) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03() {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "samsung"
            r4 = 1
            r0 = 16
            if (r1 != r0) goto L_0x0085
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "GT-P3100"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-P3110"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-P3113"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-P5100"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-P5110"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-P5113"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-I9100G"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-I8550"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-I8552"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-I8262"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-I8260"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-S6310"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-S6312"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-S6313"
        L_0x007e:
            boolean r0 = r1.startsWith(r0)
        L_0x0082:
            if (r0 == 0) goto L_0x00bb
        L_0x0084:
            return r4
        L_0x0085:
            r0 = 19
            if (r1 != r0) goto L_0x0092
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "alps"
            boolean r0 = r1.equals(r0)
            goto L_0x0082
        L_0x0092:
            r0 = 17
            if (r1 != r0) goto L_0x00bb
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "GT-S7270"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-S7272"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-S7273"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "GT-S7275"
            goto L_0x007e
        L_0x00bb:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "bq"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "bq_Aquaris5"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00d0
            return r4
        L_0x00d0:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "SM-G386F"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e1
            return r4
        L_0x00e1:
            java.lang.String r0 = "Fly"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00f2
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "FS504"
            boolean r0 = r1.equals(r0)
            return r0
        L_0x00f2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41971wz.A03():boolean");
    }

    public static boolean A04() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean A05() {
        return Build.VERSION.SDK_INT == 23;
    }

    public static boolean A06() {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT <= 23) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        if (str3.equalsIgnoreCase("oppo")) {
            str = Build.MODEL;
            str2 = "A53";
        } else if (!str3.equalsIgnoreCase("GiONEE")) {
            return false;
        } else {
            str = Build.MODEL;
            str2 = "GN5001S";
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean A07() {
        return Build.MODEL.equals("Nokia 3.1 Plus") && Build.VERSION.SDK_INT == 28;
    }

    public static boolean A08() {
        String str = Build.MANUFACTURER;
        if (str.equals("Huawei") && Build.MODEL.equals("Nexus 6P")) {
            return true;
        }
        if (str.equals("Google")) {
            String str2 = Build.MODEL;
            if (str2.equals("Pixel 2") || str2.equals("Pixel 2 XL")) {
                return true;
            }
        }
        return str.equals("Xiaomi") && Build.VERSION.SDK_INT == 27;
    }

    public static boolean A09() {
        return Build.VERSION.SDK_INT < 20;
    }

    public static boolean A0A() {
        return Build.VERSION.SDK_INT == 22 && Build.MANUFACTURER.equalsIgnoreCase("LAVA");
    }

    public static boolean A0B(String str) {
        if (str == null) {
            return A02();
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(Build.MANUFACTURER);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (Build.MODEL.equalsIgnoreCase(jSONArray.getString(i2))) {
                    return true;
                }
            }
            return false;
        } catch (JSONException unused) {
            return A02();
        }
    }

    public static boolean A0C(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            AnonymousClass00B.A08("permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier");
        }
        return str.contains("android.permission.UPDATE_APP_OPS_STATS");
    }

    public static boolean A0D(String str, boolean z2) {
        String obj;
        if ((!z2 && str.equals("OMX.google.h264.encoder")) || str.equals("OMX.ST.VFM.H264Enc") || str.equals("OMX.Exynos.avc.enc") || ((str.equals("OMX.MARVELL.VIDEO.HW.CODA7542ENCODER") && Build.VERSION.SDK_INT < 21) || str.equals("OMX.MARVELL.VIDEO.H264ENCODER"))) {
            return false;
        }
        if (str.equals("OMX.MTK.VIDEO.ENCODER.AVC") && "QMobile".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT < 23) {
            obj = "videotranscoder/ OMX.MTK.VIDEO.ENCODER.AVC on QMobile is not supported";
        } else if (!str.equals("OMX.allwinner.video.encoder.avc") && !str.equals("AVCEncoder")) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder("videotranscoder/ ");
            sb.append(str);
            sb.append(" not supported");
            obj = sb.toString();
        }
        Log.i(obj);
        return false;
    }
}

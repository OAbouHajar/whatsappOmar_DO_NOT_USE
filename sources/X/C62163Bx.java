package X;

import android.graphics.Color;
import android.support.v4.view.GravityCompat;
import android.widget.ImageView;
import com.AssemMods.translator.Language;
import java.text.NumberFormat;
import java.text.ParseException;

/* renamed from: X.3Bx  reason: invalid class name and case insensitive filesystem */
public final class C62163Bx {
    public static final ThreadLocal A00 = new AnonymousClass5B4("#dp");
    public static final ThreadLocal A01 = new AnonymousClass5B4("#%");
    public static final ThreadLocal A02 = new AnonymousClass5B4("#px");
    public static final ThreadLocal A03 = new AnonymousClass5B4("#sp");

    public static float A00(String str) {
        try {
            return A04(str, A01) * 100.0f;
        } catch (ParseException e2) {
            throw new AnonymousClass40K(C13680ns.A0h("can't parse pixel value: ", str), e2);
        }
    }

    public static float A01(String str) {
        try {
            return str.endsWith("px") ? A04(str, A02) : str.endsWith("sp") ? (float) Math.round(A04(str, A03) * AnonymousClass000.A0M(C90154da.A00().A00).scaledDensity) : str.endsWith("%") ? A00(str) : (float) Math.round(A04(str, A00) * (((float) AnonymousClass000.A0M(C90154da.A00().A00).densityDpi) / 160.0f));
        } catch (ParseException e2) {
            throw new AnonymousClass40K(C13680ns.A0h("can't parse pixel value: ", str), e2);
        }
    }

    public static float A02(String str) {
        try {
            return A04(str, A03);
        } catch (ParseException e2) {
            throw new AnonymousClass40K(C13680ns.A0h("can't parse scaled pixel value: ", str), e2);
        }
    }

    public static float A03(String str, float f2) {
        return str == null ? f2 : A01(str);
    }

    public static float A04(String str, ThreadLocal threadLocal) {
        return ((NumberFormat) threadLocal.get()).parse(str).floatValue();
    }

    public static int A05(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e2) {
            throw new AnonymousClass40K(C13680ns.A0h("can't parse color value: ", str), e2);
        }
    }

    public static int A06(String str) {
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals("medium")) {
                    return 2;
                }
                break;
            case 3154575:
                if (str.equals("full")) {
                    return 0;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    return 1;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    return 3;
                }
                break;
        }
        throw new AnonymousClass40K(C13680ns.A0h("Can't parse unknown datetime format: ", str));
    }

    public static int A07(String str) {
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    return 1;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    return GravityCompat.END;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    return GravityCompat.START;
                }
                break;
        }
        throw new AnonymousClass40K(C13680ns.A0h("can't parse unknown textAlign: ", str));
    }

    public static int A08(String str) {
        switch (str.hashCode()) {
            case -2141169668:
                if (str.equals("cap_words")) {
                    return 139265;
                }
                break;
            case -2066832464:
                if (str.equals("text_no_suggestion")) {
                    return 655361;
                }
                break;
            case -1831299680:
                if (str.equals("cap_letters")) {
                    return 135169;
                }
                break;
            case -1413853096:
                if (str.equals("amount")) {
                    return 12290;
                }
                break;
            case -1034364087:
                if (str.equals("number")) {
                    return 2;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    return 20;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    return 131073;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    return 33;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    return 3;
                }
                break;
            case 260133443:
                if (str.equals("cap_sentences")) {
                    return 180225;
                }
                break;
            case 1216389502:
                if (str.equals("passcode")) {
                    return 18;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    return 129;
                }
                break;
        }
        throw new AnonymousClass40K(C13680ns.A0h("can't parse unknown inputType: ", str));
    }

    public static int A09(String str) {
        switch (str.hashCode()) {
            case -1178781136:
                if (str.equals("italic")) {
                    return 2;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    return 0;
                }
                break;
            case 3029637:
                if (str.equals("bold")) {
                    return 1;
                }
                break;
            case 1223860979:
                if (str.equals("semibold")) {
                    C29691b2.A00("text_style_ignored", "semibold is not supported, defaulting to bold");
                    return 1;
                }
                break;
            case 1734741290:
                if (str.equals("bold_italic")) {
                    return 3;
                }
                break;
        }
        throw new AnonymousClass40K(C13680ns.A0h("can't parse unknown typeface: ", str));
    }

    public static ImageView.ScaleType A0A(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    return ImageView.ScaleType.FIT_XY;
                }
                break;
            case 94852023:
                if (str.equals("cover")) {
                    return ImageView.ScaleType.CENTER_CROP;
                }
                break;
            case 951526612:
                if (str.equals("contain")) {
                    return ImageView.ScaleType.FIT_CENTER;
                }
                break;
        }
        throw new AnonymousClass40K(C13680ns.A0h("can't parse unknown scaleType: ", str));
    }

    public static C88664at A0B(String str) {
        float A012;
        AnonymousClass41V r0;
        if (Language.AUTO_DETECT.equalsIgnoreCase(str)) {
            return C88664at.A02;
        }
        if (str.endsWith("%")) {
            A012 = Float.parseFloat(str.substring(0, str.length() - 1));
            r0 = AnonymousClass41V.PERCENT;
        } else {
            A012 = A01(str);
            r0 = AnonymousClass41V.PIXEL;
        }
        return new C88664at(r0, A012);
    }
}

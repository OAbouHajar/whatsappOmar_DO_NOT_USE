package X;

import android.graphics.Color;
import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4ZA  reason: invalid class name */
public final class AnonymousClass4ZA {
    public static final Map A00;
    public static final Pattern A01 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final Pattern A02 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern A03 = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A00 = A0x;
        A0x.put("aliceblue", -984833);
        A0x.put("antiquewhite", -332841);
        A0x.put("aqua", -16711681);
        A0x.put("aquamarine", -8388652);
        A0x.put("azure", -983041);
        A0x.put("beige", -657956);
        A0x.put("bisque", -6972);
        A0x.put("black", -16777216);
        A0x.put("blanchedalmond", -5171);
        A0x.put("blue", -16776961);
        A0x.put("blueviolet", -7722014);
        A0x.put("brown", -5952982);
        A0x.put("burlywood", -2180985);
        A0x.put("cadetblue", -10510688);
        A0x.put("chartreuse", -8388864);
        A0x.put("chocolate", -2987746);
        A0x.put("coral", -32944);
        A0x.put("cornflowerblue", -10185235);
        A0x.put("cornsilk", -1828);
        A0x.put("crimson", -2354116);
        A0x.put("cyan", -16711681);
        A0x.put("darkblue", -16777077);
        A0x.put("darkcyan", -16741493);
        A0x.put("darkgoldenrod", -4684277);
        A0x.put("darkgray", -5658199);
        A0x.put("darkgreen", -16751616);
        A0x.put("darkgrey", -5658199);
        A0x.put("darkkhaki", -4343957);
        A0x.put("darkmagenta", -7667573);
        A0x.put("darkolivegreen", -11179217);
        A0x.put("darkorange", -29696);
        A0x.put("darkorchid", -6737204);
        A0x.put("darkred", -7667712);
        A0x.put("darksalmon", -1468806);
        A0x.put("darkseagreen", -7357297);
        A0x.put("darkslateblue", -12042869);
        A0x.put("darkslategray", -13676721);
        A0x.put("darkslategrey", -13676721);
        A0x.put("darkturquoise", -16724271);
        A0x.put("darkviolet", -7077677);
        A0x.put("deeppink", -60269);
        A0x.put("deepskyblue", -16728065);
        A0x.put("dimgray", -9868951);
        A0x.put("dimgrey", -9868951);
        A0x.put("dodgerblue", -14774017);
        A0x.put("firebrick", -5103070);
        A0x.put("floralwhite", -1296);
        A0x.put("forestgreen", -14513374);
        A0x.put("fuchsia", -65281);
        A0x.put("gainsboro", -2302756);
        A0x.put("ghostwhite", -460545);
        A0x.put("gold", -10496);
        A0x.put("goldenrod", -2448096);
        A0x.put("gray", -8355712);
        A0x.put("green", -16744448);
        A0x.put("greenyellow", -5374161);
        A0x.put("grey", -8355712);
        A0x.put("honeydew", -983056);
        A0x.put("hotpink", -38476);
        A0x.put("indianred", -3318692);
        A0x.put("indigo", -11861886);
        A0x.put("ivory", -16);
        A0x.put("khaki", -989556);
        A0x.put("lavender", -1644806);
        A0x.put("lavenderblush", -3851);
        A0x.put("lawngreen", -8586240);
        A0x.put("lemonchiffon", -1331);
        A0x.put("lightblue", -5383962);
        A0x.put("lightcoral", -1015680);
        A0x.put("lightcyan", -2031617);
        A0x.put("lightgoldenrodyellow", -329006);
        A0x.put("lightgray", -2894893);
        A0x.put("lightgreen", -7278960);
        A0x.put("lightgrey", -2894893);
        A0x.put("lightpink", -18751);
        A0x.put("lightsalmon", -24454);
        A0x.put("lightseagreen", -14634326);
        A0x.put("lightskyblue", -7876870);
        A0x.put("lightslategray", -8943463);
        A0x.put("lightslategrey", -8943463);
        A0x.put("lightsteelblue", -5192482);
        A0x.put("lightyellow", -32);
        A0x.put("lime", -16711936);
        A0x.put("limegreen", -13447886);
        A0x.put("linen", -331546);
        A0x.put("magenta", -65281);
        A0x.put("maroon", -8388608);
        A0x.put("mediumaquamarine", -10039894);
        A0x.put("mediumblue", -16777011);
        A0x.put("mediumorchid", -4565549);
        A0x.put("mediumpurple", -7114533);
        A0x.put("mediumseagreen", -12799119);
        A0x.put("mediumslateblue", -8689426);
        A0x.put("mediumspringgreen", -16713062);
        A0x.put("mediumturquoise", -12004916);
        A0x.put("mediumvioletred", -3730043);
        A0x.put("midnightblue", -15132304);
        A0x.put("mintcream", -655366);
        A0x.put("mistyrose", -6943);
        A0x.put("moccasin", -6987);
        A0x.put("navajowhite", -8531);
        A0x.put("navy", -16777088);
        A0x.put("oldlace", -133658);
        A0x.put("olive", -8355840);
        A0x.put("olivedrab", -9728477);
        A0x.put("orange", -23296);
        A0x.put("orangered", -47872);
        A0x.put("orchid", -2461482);
        A0x.put("palegoldenrod", -1120086);
        A0x.put("palegreen", -6751336);
        A0x.put("paleturquoise", -5247250);
        A0x.put("palevioletred", -2396013);
        A0x.put("papayawhip", -4139);
        A0x.put("peachpuff", -9543);
        A0x.put("peru", -3308225);
        A0x.put("pink", -16181);
        A0x.put("plum", -2252579);
        A0x.put("powderblue", -5185306);
        A0x.put("purple", -8388480);
        A0x.put("rebeccapurple", -10079335);
        A0x.put("red", -65536);
        A0x.put("rosybrown", -4419697);
        A0x.put("royalblue", -12490271);
        A0x.put("saddlebrown", -7650029);
        A0x.put("salmon", -360334);
        A0x.put("sandybrown", -744352);
        A0x.put("seagreen", -13726889);
        A0x.put("seashell", -2578);
        A0x.put("sienna", -6270419);
        A0x.put("silver", -4144960);
        A0x.put("skyblue", -7876885);
        A0x.put("slateblue", -9807155);
        A0x.put("slategray", -9404272);
        A0x.put("slategrey", -9404272);
        A0x.put("snow", -1286);
        A0x.put("springgreen", -16711809);
        A0x.put("steelblue", -12156236);
        A0x.put("tan", -2968436);
        A0x.put("teal", -16744320);
        A0x.put("thistle", -2572328);
        A0x.put("tomato", -40121);
        A0x.put("transparent", C13680ns.A0X());
        A0x.put("turquoise", -12525360);
        A0x.put("violet", -1146130);
        A0x.put("wheat", -663885);
        A0x.put("white", -1);
        A0x.put("whitesmoke", -657931);
        A0x.put("yellow", -256);
        A0x.put("yellowgreen", -6632142);
    }

    public static int A00(String str, boolean z2) {
        C90524eJ.A03(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            int length = replace.length();
            int i2 = -16777216;
            if (length != 7) {
                if (length == 9) {
                    i2 = (parseLong & MotionEventCompat.ACTION_MASK) << 24;
                    parseLong >>>= 8;
                }
            }
            return i2 | parseLong;
        } else if (replace.startsWith("rgba")) {
            Matcher matcher = (z2 ? A01 : A02).matcher(replace);
            if (matcher.matches()) {
                return Color.argb(z2 ? (int) (Float.parseFloat(matcher.group(4)) * 255.0f) : Integer.parseInt(matcher.group(4), 10), Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = A03.matcher(replace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Number number = (Number) A00.get(replace.toLowerCase(Locale.US));
            if (number != null) {
                return number.intValue();
            }
        }
        throw AnonymousClass3K3.A0f();
    }
}

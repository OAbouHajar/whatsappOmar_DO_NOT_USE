package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4eu  reason: invalid class name and case insensitive filesystem */
public final class C90834eu {
    public static final ArrayList A00 = AnonymousClass000.A0u();
    public static final Pattern A01 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static int A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (A03(str)) {
            return 1;
        }
        if (A05(str)) {
            return 2;
        }
        if (A04(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = A00;
        if (0 >= arrayList.size()) {
            return -1;
        }
        arrayList.get(0);
        throw AnonymousClass000.A0W("mimeType");
    }

    public static AnonymousClass4GR A01(String str) {
        Matcher matcher = A01.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        int i2 = 0;
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i2 = Integer.parseInt(group2);
            }
            return new AnonymousClass4GR(parseInt, i2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String A02(int i2) {
        if (i2 == 32) {
            return "video/mp4v-es";
        }
        if (i2 == 33) {
            return "video/avc";
        }
        if (i2 == 35) {
            return "video/hevc";
        }
        if (i2 == 64) {
            return "audio/mp4a-latm";
        }
        if (i2 == 163) {
            return "video/wvc1";
        }
        if (i2 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i2 == 165) {
            return "audio/ac3";
        }
        if (i2 == 166) {
            return "audio/eac3";
        }
        switch (i2) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i2) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static boolean A03(String str) {
        int indexOf;
        String str2 = null;
        if (!(str == null || (indexOf = str.indexOf(47)) == -1)) {
            str2 = str.substring(0, indexOf);
        }
        return "audio".equals(str2);
    }

    public static boolean A04(String str) {
        int indexOf;
        String str2 = null;
        if (!(str == null || (indexOf = str.indexOf(47)) == -1)) {
            str2 = str.substring(0, indexOf);
        }
        return "text".equals(str2) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean A05(String str) {
        int indexOf;
        String str2 = null;
        if (!(str == null || (indexOf = str.indexOf(47)) == -1)) {
            str2 = str.substring(0, indexOf);
        }
        return "video".equals(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r1 = X.C89734co.A00((r0 = A01(r4)).A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x000b
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -2123537834: goto L_0x000c;
                case -432837260: goto L_0x000f;
                case -432837259: goto L_0x0012;
                case -53558318: goto L_0x0015;
                case 187078296: goto L_0x0033;
                case 187094639: goto L_0x0036;
                case 1504578661: goto L_0x0039;
                case 1504619009: goto L_0x003c;
                case 1504831518: goto L_0x003f;
                case 1903231877: goto L_0x0042;
                case 1903589369: goto L_0x0045;
                default: goto L_0x000b;
            }
        L_0x000b:
            return r2
        L_0x000c:
            java.lang.String r0 = "audio/eac3-joc"
            goto L_0x0047
        L_0x000f:
            java.lang.String r0 = "audio/mpeg-L1"
            goto L_0x0047
        L_0x0012:
            java.lang.String r0 = "audio/mpeg-L2"
            goto L_0x0047
        L_0x0015:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            if (r4 == 0) goto L_0x000b
            X.4GR r0 = A01(r4)
            if (r0 == 0) goto L_0x000b
            int r0 = r0.A00
            int r1 = X.C89734co.A00(r0)
            if (r1 == 0) goto L_0x000b
            r0 = 16
            if (r1 == r0) goto L_0x000b
            r2 = 1
            return r2
        L_0x0033:
            java.lang.String r0 = "audio/ac3"
            goto L_0x0047
        L_0x0036:
            java.lang.String r0 = "audio/raw"
            goto L_0x0047
        L_0x0039:
            java.lang.String r0 = "audio/eac3"
            goto L_0x0047
        L_0x003c:
            java.lang.String r0 = "audio/flac"
            goto L_0x0047
        L_0x003f:
            java.lang.String r0 = "audio/mpeg"
            goto L_0x0047
        L_0x0042:
            java.lang.String r0 = "audio/g711-alaw"
            goto L_0x0047
        L_0x0045:
            java.lang.String r0 = "audio/g711-mlaw"
        L_0x0047:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90834eu.A06(java.lang.String, java.lang.String):boolean");
    }
}

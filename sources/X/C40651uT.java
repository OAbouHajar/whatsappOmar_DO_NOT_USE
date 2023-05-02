package X;

import com.obwhatsapp.emoji.EmojiDescriptor;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1uT  reason: invalid class name and case insensitive filesystem */
public abstract class C40651uT {
    public static int A00(CharSequence charSequence) {
        C435020g r8 = new C435020g(charSequence);
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            r8.A00 = i2;
            long A00 = EmojiDescriptor.A00(r8, false);
            if (A00 != -1) {
                i2 += r8.A02(i2, A00);
                i3++;
                if (i3 > 3) {
                }
            }
            return 0;
        }
        return i3;
    }

    public static CharSequence A01(CharSequence charSequence, int i2, int i3, int i4) {
        int length = charSequence.length();
        if (i2 < 0 || i3 > length || i2 > i3) {
            throw new IndexOutOfBoundsException();
        }
        C435020g r4 = new C435020g(charSequence);
        int i5 = 0;
        int i6 = i2;
        while (i6 < i3) {
            r4.A00 = i6;
            i6 += r4.A01(i6, EmojiDescriptor.A00(r4, false));
            i5++;
            if (i5 >= i4) {
                return charSequence.subSequence(i2, i6);
            }
        }
        return null;
    }

    public static String A02(int i2, String str) {
        C435020g r8 = new C435020g(str);
        int i3 = 0;
        int i4 = 0;
        while (i3 < str.length() && i4 < i2) {
            r8.A00 = i3;
            long A00 = EmojiDescriptor.A00(r8, false);
            if (A00 != -1) {
                i4++;
            }
            i3 += r8.A01(i3, A00);
        }
        return str.substring(0, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        r5.append(java.lang.Character.toChars(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 19) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 23) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(java.lang.CharSequence r10) {
        /*
            if (r10 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            X.20g r4 = new X.20g
            r4.<init>(r10)
            int r3 = r10.length()
            r2 = 0
        L_0x0013:
            if (r2 >= r3) goto L_0x0081
            r4.A00 = r2
            r0 = 0
            long r0 = com.obwhatsapp.emoji.EmojiDescriptor.A00(r4, r0)
            int r9 = r4.A01(r2, r0)
            r7 = -1
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0071
            r6 = 15
            long r0 = r0 & r6
            int r6 = (int) r0
            r0 = 1
            if (r6 != r0) goto L_0x006b
            r4.A00 = r2
        L_0x002f:
            int r6 = r4.A00()
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r6 == r0) goto L_0x002f
            r0 = 9748(0x2614, float:1.366E-41)
            if (r6 == r0) goto L_0x0064
            r0 = 9749(0x2615, float:1.3661E-41)
            if (r6 == r0) goto L_0x0064
            switch(r6) {
                case 9745: goto L_0x0064;
                case 9757: goto L_0x0064;
                case 57872: goto L_0x0064;
                case 60417: goto L_0x0064;
                case 60418: goto L_0x0064;
                case 60419: goto L_0x0064;
                case 60420: goto L_0x0064;
                case 60421: goto L_0x0064;
                case 60422: goto L_0x0064;
                case 60423: goto L_0x0064;
                case 60424: goto L_0x0064;
                case 60425: goto L_0x0064;
                case 60426: goto L_0x0064;
                case 60427: goto L_0x0064;
                case 60428: goto L_0x0064;
                case 60429: goto L_0x0064;
                case 60430: goto L_0x0064;
                case 60431: goto L_0x0064;
                case 60432: goto L_0x0064;
                case 60433: goto L_0x0064;
                case 60434: goto L_0x0064;
                case 60435: goto L_0x0064;
                case 60436: goto L_0x0064;
                case 60437: goto L_0x0064;
                case 60438: goto L_0x0064;
                case 60439: goto L_0x0064;
                case 127760: goto L_0x0064;
                case 127762: goto L_0x0064;
                case 127770: goto L_0x0064;
                case 127819: goto L_0x0064;
                case 127824: goto L_0x0064;
                case 127868: goto L_0x0064;
                case 127943: goto L_0x0064;
                case 127945: goto L_0x0064;
                case 127972: goto L_0x0064;
                case 128019: goto L_0x0064;
                case 128021: goto L_0x0064;
                case 128022: goto L_0x0064;
                case 128042: goto L_0x0064;
                case 128101: goto L_0x0064;
                case 128108: goto L_0x0064;
                case 128109: goto L_0x0064;
                case 128113: goto L_0x0064;
                case 128114: goto L_0x0064;
                case 128115: goto L_0x0064;
                case 128173: goto L_0x0064;
                case 128182: goto L_0x0064;
                case 128183: goto L_0x0064;
                case 128236: goto L_0x0064;
                case 128237: goto L_0x0064;
                case 128239: goto L_0x0064;
                case 128245: goto L_0x0064;
                case 128256: goto L_0x0064;
                case 128257: goto L_0x0064;
                case 128258: goto L_0x0064;
                case 128260: goto L_0x0064;
                case 128261: goto L_0x0064;
                case 128262: goto L_0x0064;
                case 128263: goto L_0x0064;
                case 128264: goto L_0x0064;
                case 128265: goto L_0x0064;
                case 128277: goto L_0x0064;
                case 128300: goto L_0x0064;
                case 128301: goto L_0x0064;
                case 128348: goto L_0x0064;
                case 128349: goto L_0x0064;
                case 128350: goto L_0x0064;
                case 128351: goto L_0x0064;
                case 128353: goto L_0x0064;
                case 128354: goto L_0x0064;
                case 128355: goto L_0x0064;
                case 128356: goto L_0x0064;
                case 128357: goto L_0x0064;
                case 128358: goto L_0x0064;
                case 128359: goto L_0x0064;
                case 128512: goto L_0x0064;
                case 128519: goto L_0x0064;
                case 128520: goto L_0x0064;
                case 128526: goto L_0x0064;
                case 128528: goto L_0x0064;
                case 128529: goto L_0x0064;
                case 128533: goto L_0x0064;
                case 128535: goto L_0x0064;
                case 128537: goto L_0x0064;
                case 128539: goto L_0x0064;
                case 128543: goto L_0x0064;
                case 128550: goto L_0x0064;
                case 128551: goto L_0x0064;
                case 128556: goto L_0x0064;
                case 128558: goto L_0x0064;
                case 128559: goto L_0x0064;
                case 128564: goto L_0x0064;
                case 128566: goto L_0x0064;
                case 128641: goto L_0x0064;
                case 128642: goto L_0x0064;
                case 128646: goto L_0x0064;
                case 128648: goto L_0x0064;
                case 128650: goto L_0x0064;
                case 128651: goto L_0x0064;
                case 128653: goto L_0x0064;
                case 128654: goto L_0x0064;
                case 128656: goto L_0x0064;
                case 128660: goto L_0x0064;
                case 128662: goto L_0x0064;
                case 128664: goto L_0x0064;
                case 128667: goto L_0x0064;
                case 128668: goto L_0x0064;
                case 128669: goto L_0x0064;
                case 128670: goto L_0x0064;
                case 128671: goto L_0x0064;
                case 128672: goto L_0x0064;
                case 128673: goto L_0x0064;
                case 128675: goto L_0x0064;
                case 128678: goto L_0x0064;
                case 128686: goto L_0x0064;
                case 128687: goto L_0x0064;
                case 128688: goto L_0x0064;
                case 128689: goto L_0x0064;
                case 128691: goto L_0x0064;
                case 128692: goto L_0x0064;
                case 128693: goto L_0x0064;
                case 128695: goto L_0x0064;
                case 128696: goto L_0x0064;
                case 128703: goto L_0x0064;
                case 128705: goto L_0x0064;
                case 128706: goto L_0x0064;
                case 128707: goto L_0x0064;
                case 128708: goto L_0x0064;
                case 128709: goto L_0x0064;
                default: goto L_0x0043;
            }
        L_0x0043:
            switch(r6) {
                case 57884: goto L_0x0064;
                case 57885: goto L_0x0064;
                case 57886: goto L_0x0064;
                case 57887: goto L_0x0064;
                case 57888: goto L_0x0064;
                case 57889: goto L_0x0064;
                case 57890: goto L_0x0064;
                case 57891: goto L_0x0064;
                case 57892: goto L_0x0064;
                case 57893: goto L_0x0064;
                default: goto L_0x0046;
            }
        L_0x0046:
            switch(r6) {
                case 58634: goto L_0x0064;
                case 58635: goto L_0x0064;
                case 58636: goto L_0x0064;
                case 58637: goto L_0x0064;
                case 58638: goto L_0x0064;
                case 58639: goto L_0x0064;
                case 58640: goto L_0x0064;
                case 58641: goto L_0x0064;
                case 58642: goto L_0x0064;
                case 58643: goto L_0x0064;
                case 58644: goto L_0x0064;
                default: goto L_0x0049;
            }
        L_0x0049:
            switch(r6) {
                case 127757: goto L_0x0064;
                case 127758: goto L_0x0064;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r6) {
                case 127766: goto L_0x0064;
                case 127767: goto L_0x0064;
                case 127768: goto L_0x0064;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r6) {
                case 127772: goto L_0x0064;
                case 127773: goto L_0x0064;
                case 127774: goto L_0x0064;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r6) {
                case 127794: goto L_0x0064;
                case 127795: goto L_0x0064;
                default: goto L_0x0055;
            }
        L_0x0055:
            switch(r6) {
                case 128000: goto L_0x0064;
                case 128001: goto L_0x0064;
                case 128002: goto L_0x0064;
                case 128003: goto L_0x0064;
                case 128004: goto L_0x0064;
                case 128005: goto L_0x0064;
                case 128006: goto L_0x0064;
                case 128007: goto L_0x0064;
                case 128008: goto L_0x0064;
                case 128009: goto L_0x0064;
                case 128010: goto L_0x0064;
                case 128011: goto L_0x0064;
                default: goto L_0x0058;
            }
        L_0x0058:
            switch(r6) {
                case 128015: goto L_0x0064;
                case 128016: goto L_0x0064;
                default: goto L_0x005b;
            }
        L_0x005b:
            char[] r0 = java.lang.Character.toChars(r6)
            r5.append(r0)
        L_0x0062:
            int r2 = r2 + r9
            goto L_0x0013
        L_0x0064:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x007b
            goto L_0x005b
        L_0x006b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x007b
        L_0x0071:
            int r0 = r2 + r9
            java.lang.CharSequence r0 = r10.subSequence(r2, r0)
            r5.append(r0)
            goto L_0x0062
        L_0x007b:
            r0 = 9633(0x25a1, float:1.3499E-41)
            r5.append(r0)
            goto L_0x0062
        L_0x0081:
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40651uT.A03(java.lang.CharSequence):java.lang.String");
    }

    public static String A04(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        C435020g r10 = new C435020g(charSequence);
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            r10.A00 = i2;
            long A00 = EmojiDescriptor.A00(r10, false);
            int A01 = r10.A01(i2, A00);
            if (A00 != -1) {
                for (int i3 = 0; i3 < ((int) (A00 & 15)); i3++) {
                    sb.append(' ');
                }
            } else {
                sb.append(charSequence.subSequence(i2, i2 + A01));
            }
            i2 += A01;
        }
        return sb.toString();
    }

    public static String A05(String str) {
        if (!C434520b.A00) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            char c2 = charAt | IOUtils.DIR_SEPARATOR;
            if (c2 < 61444 || c2 > 64248) {
                sb.append(charAt);
            } else {
                sb.append(Character.toChars(c2));
            }
        }
        return sb.toString();
    }
}

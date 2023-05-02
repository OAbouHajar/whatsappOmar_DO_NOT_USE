package X;

import android.media.MediaCodecInfo;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import com.facebook.redex.IDxComparatorShape184S0100000_2_I1;
import com.facebook.redex.IDxSProviderShape50S0000000_2_I1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.4f0  reason: invalid class name and case insensitive filesystem */
public final class C90884f0 {
    public static int A00 = -1;
    public static final HashMap A01 = AnonymousClass000.A0x();
    public static final Pattern A02 = Pattern.compile("^\\D?(\\d+)$");

    public static int A00() {
        C90714eg r0;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i2;
        int i3 = A00;
        if (i3 == -1) {
            i3 = 0;
            List A03 = A03("video/avc", false, false);
            if (!A03.isEmpty() && (r0 = (C90714eg) A03.get(0)) != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = r0.A00;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = codecProfileLevelArr[i3].level;
                    if (i5 != 1 && i5 != 2) {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED /*65536*/:
                                i2 = 9437184;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                int i6 = 172800;
                if (AnonymousClass3C1.A01 >= 21) {
                    i6 = 345600;
                }
                i3 = Math.max(i4, i6);
            }
            A00 = i3;
        }
        return i3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01e2, code lost:
        r1 = r8.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0255, code lost:
        if (r1.equals(r0) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0257, code lost:
        r10 = r2.length;
        r3 = "MediaCodecUtil";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x025d, code lost:
        if (r10 >= 2) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x025f, code lost:
        r1 = X.AnonymousClass000.A0q("Ignoring malformed AVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r6 = r2[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x026d, code lost:
        if (r6.length() != 6) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x026f, code lost:
        r6 = java.lang.Integer.parseInt(r6.substring(0, 2), 16);
        r2 = java.lang.Integer.parseInt(r2[1].substring(4), 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0287, code lost:
        if (r10 < 3) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0289, code lost:
        r6 = java.lang.Integer.parseInt(r6);
        r2 = java.lang.Integer.parseInt(r2[2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0295, code lost:
        if (r6 == 66) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0299, code lost:
        if (r6 == 77) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x029d, code lost:
        if (r6 == 88) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02a1, code lost:
        if (r6 == 100) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02a5, code lost:
        if (r6 == 110) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02a9, code lost:
        if (r6 == 122) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02ab, code lost:
        r1 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02af, code lost:
        if (r6 == 244) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02b1, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02b3, code lost:
        if (r1 != -1) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02b5, code lost:
        r0 = X.AnonymousClass000.A0r("Unknown AVC profile: ");
        r0.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02c0, code lost:
        r1 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02c3, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02c6, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02c9, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02cb, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02cd, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02cf, code lost:
        switch(r2) {
            case 10: goto L_0x0311;
            case 11: goto L_0x0313;
            case 12: goto L_0x0315;
            case 13: goto L_0x0318;
            default: goto L_0x02d2;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02d2, code lost:
        switch(r2) {
            case 20: goto L_0x0308;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_singleLine :int: goto L_0x030b;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_ellipsize :int: goto L_0x030e;
            default: goto L_0x02d5;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02d5, code lost:
        switch(r2) {
            case 30: goto L_0x02ff;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_colorNormal :int: goto L_0x0302;
            case 32: goto L_0x0305;
            default: goto L_0x02d8;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02d8, code lost:
        switch(r2) {
            case 40: goto L_0x02f6;
            case 41: goto L_0x02f9;
            case 42: goto L_0x02fc;
            default: goto L_0x02db;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x02db, code lost:
        switch(r2) {
            case com.google.android.search.verification.client.SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS :int: goto L_0x02ec;
            case 51: goto L_0x02ef;
            case 52: goto L_0x02f3;
            default: goto L_0x02de;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02de, code lost:
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02df, code lost:
        if (r6 != -1) goto L_0x05df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02e1, code lost:
        r0 = "Unknown AVC level: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02e3, code lost:
        r1 = X.AnonymousClass000.A0r(r0);
        r1.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x02ec, code lost:
        r6 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x02ef, code lost:
        r6 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x02f3, code lost:
        r6 = android.support.v4.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x02f6, code lost:
        r6 = 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x02f9, code lost:
        r6 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x02fc, code lost:
        r6 = 8192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x02ff, code lost:
        r6 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0302, code lost:
        r6 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0305, code lost:
        r6 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0308, code lost:
        r6 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x030b, code lost:
        r6 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x030e, code lost:
        r6 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0311, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0313, code lost:
        r6 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0315, code lost:
        r6 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0318, code lost:
        r6 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        android.util.Log.w(r3, X.AnonymousClass000.A0h(r5, X.AnonymousClass000.A0q("Ignoring malformed AVC codec string: ")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0328, code lost:
        r0 = X.AnonymousClass000.A0q("Ignoring malformed AVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x039c, code lost:
        if (r1.equals(r0) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x039e, code lost:
        r1 = "MediaCodecUtil";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x03a4, code lost:
        if (r2.length < 4) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x03a6, code lost:
        r3 = 1;
        r6 = A02.matcher(r2[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x03b3, code lost:
        if (r6.matches() == false) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x03b5, code lost:
        r5 = r6.group(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x03bf, code lost:
        if ("1".equals(r5) != false) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x03c7, code lost:
        if ("2".equals(r5) == false) goto L_0x052e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x03c9, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x03ca, code lost:
        r5 = r2[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x03cd, code lost:
        if (r5 == null) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x03da, code lost:
        switch(r5.hashCode()) {
            case 70821: goto L_0x03e8;
            case 70914: goto L_0x03f6;
            case 70917: goto L_0x0404;
            case 71007: goto L_0x0410;
            case 71010: goto L_0x041c;
            case 74665: goto L_0x0428;
            case 74758: goto L_0x0436;
            case 74761: goto L_0x0444;
            case 74851: goto L_0x0452;
            case 74854: goto L_0x045e;
            case 2193639: goto L_0x046a;
            case 2193642: goto L_0x0476;
            case 2193732: goto L_0x0482;
            case 2193735: goto L_0x048f;
            case 2193738: goto L_0x049b;
            case 2193825: goto L_0x04a6;
            case 2193828: goto L_0x04b1;
            case 2193831: goto L_0x04bc;
            case 2312803: goto L_0x04c7;
            case 2312806: goto L_0x04d2;
            case 2312896: goto L_0x04dd;
            case 2312899: goto L_0x04e8;
            case 2312902: goto L_0x04f3;
            case 2312989: goto L_0x04fe;
            case 2312992: goto L_0x0509;
            case 2312995: goto L_0x0514;
            default: goto L_0x03dd;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x03dd, code lost:
        r2 = X.AnonymousClass000.A0o();
        r0 = "Unknown HEVC level string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x03e3, code lost:
        r2.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x03ee, code lost:
        if (r5.equals("H30") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x03f0, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x03fc, code lost:
        if (r5.equals("H60") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x03fe, code lost:
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x040a, code lost:
        if (r5.equals("H63") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x040c, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0416, code lost:
        if (r5.equals("H90") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0418, code lost:
        r0 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0422, code lost:
        if (r5.equals("H93") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0424, code lost:
        r0 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x042e, code lost:
        if (r5.equals("L30") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0430, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x043c, code lost:
        if (r5.equals("L60") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x043e, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x044a, code lost:
        if (r5.equals("L63") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x044c, code lost:
        r2 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0458, code lost:
        if (r5.equals("L90") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x045a, code lost:
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0464, code lost:
        if (r5.equals("L93") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0466, code lost:
        r0 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0470, code lost:
        if (r5.equals("H120") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0472, code lost:
        r0 = 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x047c, code lost:
        if (r5.equals("H123") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x047e, code lost:
        r0 = 8192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0488, code lost:
        if (r5.equals("H150") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x048a, code lost:
        r0 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0495, code lost:
        if (r5.equals("H153") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0497, code lost:
        r0 = 131072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x04a1, code lost:
        if (r5.equals("H156") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x04a3, code lost:
        r0 = android.support.v4.view.accessibility.AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x04ac, code lost:
        if (r5.equals("H180") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x04ae, code lost:
        r0 = android.support.v4.view.accessibility.AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x04b7, code lost:
        if (r5.equals("H183") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x04b9, code lost:
        r0 = android.support.v4.view.GravityCompat.RELATIVE_LAYOUT_DIRECTION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x04c2, code lost:
        if (r5.equals("H186") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x04c4, code lost:
        r0 = 33554432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x04cd, code lost:
        if (r5.equals("L120") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x04cf, code lost:
        r0 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x04d8, code lost:
        if (r5.equals("L123") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x04da, code lost:
        r0 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x04e3, code lost:
        if (r5.equals("L150") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x04e5, code lost:
        r0 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x04ee, code lost:
        if (r5.equals("L153") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x04f0, code lost:
        r0 = android.support.v4.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x04f9, code lost:
        if (r5.equals("L156") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x04fb, code lost:
        r0 = android.support.v4.view.accessibility.AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0504, code lost:
        if (r5.equals("L180") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0506, code lost:
        r0 = android.support.v4.view.accessibility.AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x050f, code lost:
        if (r5.equals("L183") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0511, code lost:
        r0 = 4194304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x051a, code lost:
        if (r5.equals("L186") == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x051c, code lost:
        r0 = 16777216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x051e, code lost:
        r2 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0522, code lost:
        if (r2 == null) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x052d, code lost:
        return new android.util.Pair(java.lang.Integer.valueOf(r3), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x052e, code lost:
        r2 = X.AnonymousClass000.A0o();
        r0 = "Unknown HEVC profile string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0536, code lost:
        r2 = X.AnonymousClass000.A0q("Ignoring malformed HEVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x054f, code lost:
        r2.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0552, code lost:
        r0 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0556, code lost:
        android.util.Log.w(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0559, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x05df, code lost:
        r7 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x05e4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0603, code lost:
        r0 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x060c, code lost:
        return new android.util.Pair(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        r7 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ca, code lost:
        if (r7 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cc, code lost:
        r5 = r2[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ce, code lost:
        if (r5 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d4, code lost:
        switch(r5.hashCode()) {
            case 1537: goto L_0x00df;
            case 1538: goto L_0x00ed;
            case 1539: goto L_0x00fb;
            case 1540: goto L_0x0108;
            case 1541: goto L_0x0115;
            case 1542: goto L_0x0120;
            case 1543: goto L_0x012b;
            case 1544: goto L_0x0136;
            case 1545: goto L_0x0141;
            case 1567: goto L_0x014c;
            case 1568: goto L_0x0157;
            case 1569: goto L_0x0162;
            case 1570: goto L_0x016d;
            default: goto L_0x00d7;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d7, code lost:
        r1 = X.AnonymousClass000.A0o();
        r0 = "Unknown Dolby Vision level string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e5, code lost:
        if (r5.equals("01") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e7, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f3, code lost:
        if (r5.equals("02") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f5, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0101, code lost:
        if (r5.equals("03") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0103, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010e, code lost:
        if (r5.equals("04") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0110, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        if (r5.equals("05") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011d, code lost:
        r0 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0126, code lost:
        if (r5.equals("06") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0128, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0131, code lost:
        if (r5.equals("07") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0133, code lost:
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013c, code lost:
        if (r5.equals("08") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013e, code lost:
        r0 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0147, code lost:
        if (r5.equals("09") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0149, code lost:
        r0 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0152, code lost:
        if (r5.equals("10") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0154, code lost:
        r0 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015d, code lost:
        if (r5.equals("11") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015f, code lost:
        r0 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0168, code lost:
        if (r5.equals("12") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016a, code lost:
        r0 = 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0173, code lost:
        if (r5.equals("13") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0175, code lost:
        r0 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0177, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x017b, code lost:
        if (r0 != null) goto L_0x0607;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(X.C32491gT r10) {
        /*
            java.lang.String r5 = r10.A0O
            r4 = 0
            if (r5 == 0) goto L_0x0050
            java.lang.String r0 = "\\."
            java.lang.String[] r2 = r5.split(r0)
            java.lang.String r1 = r10.A0T
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0185
            int r1 = r2.length
            java.lang.String r7 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r3 = "MediaCodecUtil"
            r0 = 3
            if (r1 < r0) goto L_0x017f
            java.util.regex.Pattern r6 = A02
            r1 = 1
            r0 = r2[r1]
            java.util.regex.Matcher r6 = r6.matcher(r0)
            boolean r0 = r6.matches()
            if (r0 == 0) goto L_0x017f
            java.lang.String r5 = r6.group(r1)
            if (r5 == 0) goto L_0x003d
            int r0 = r5.hashCode()
            r9 = 8
            r8 = 4
            r6 = 2
            switch(r0) {
                case 1536: goto L_0x0051;
                case 1537: goto L_0x005e;
                case 1538: goto L_0x006b;
                case 1539: goto L_0x0078;
                case 1540: goto L_0x0085;
                case 1541: goto L_0x0090;
                case 1542: goto L_0x009b;
                case 1543: goto L_0x00a6;
                case 1544: goto L_0x00b1;
                case 1545: goto L_0x00bc;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "Unknown Dolby Vision profile string: "
        L_0x0043:
            r1.append(r0)
        L_0x0046:
            r1.append(r5)
        L_0x0049:
            java.lang.String r0 = r1.toString()
        L_0x004d:
            android.util.Log.w(r3, r0)
        L_0x0050:
            return r4
        L_0x0051:
            java.lang.String r0 = "00"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            goto L_0x00ca
        L_0x005e:
            java.lang.String r0 = "01"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            goto L_0x00ca
        L_0x006b:
            java.lang.String r0 = "02"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            goto L_0x00ca
        L_0x0078:
            java.lang.String r0 = "03"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            goto L_0x00ca
        L_0x0085:
            java.lang.String r0 = "04"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 16
            goto L_0x00c6
        L_0x0090:
            java.lang.String r0 = "05"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 32
            goto L_0x00c6
        L_0x009b:
            java.lang.String r0 = "06"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 64
            goto L_0x00c6
        L_0x00a6:
            java.lang.String r0 = "07"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x00c6
        L_0x00b1:
            java.lang.String r0 = "08"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x00c6
        L_0x00bc:
            java.lang.String r0 = "09"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 512(0x200, float:7.175E-43)
        L_0x00c6:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x00ca:
            if (r7 == 0) goto L_0x003d
            r5 = r2[r6]
            if (r5 == 0) goto L_0x00d7
            int r0 = r5.hashCode()
            switch(r0) {
                case 1537: goto L_0x00df;
                case 1538: goto L_0x00ed;
                case 1539: goto L_0x00fb;
                case 1540: goto L_0x0108;
                case 1541: goto L_0x0115;
                case 1542: goto L_0x0120;
                case 1543: goto L_0x012b;
                case 1544: goto L_0x0136;
                case 1545: goto L_0x0141;
                case 1567: goto L_0x014c;
                case 1568: goto L_0x0157;
                case 1569: goto L_0x0162;
                case 1570: goto L_0x016d;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "Unknown Dolby Vision level string: "
            goto L_0x0043
        L_0x00df:
            java.lang.String r0 = "01"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x017b
        L_0x00ed:
            java.lang.String r0 = "02"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x017b
        L_0x00fb:
            java.lang.String r0 = "03"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x017b
        L_0x0108:
            java.lang.String r0 = "04"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x017b
        L_0x0115:
            java.lang.String r0 = "05"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 16
            goto L_0x0177
        L_0x0120:
            java.lang.String r0 = "06"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 32
            goto L_0x0177
        L_0x012b:
            java.lang.String r0 = "07"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 64
            goto L_0x0177
        L_0x0136:
            java.lang.String r0 = "08"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x0177
        L_0x0141:
            java.lang.String r0 = "09"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0177
        L_0x014c:
            java.lang.String r0 = "10"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0177
        L_0x0157:
            java.lang.String r0 = "11"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0177
        L_0x0162:
            java.lang.String r0 = "12"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0177
        L_0x016d:
            java.lang.String r0 = "13"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 4096(0x1000, float:5.74E-42)
        L_0x0177:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x017b:
            if (r0 != 0) goto L_0x0607
            goto L_0x00d7
        L_0x017f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r7)
            goto L_0x0046
        L_0x0185:
            r6 = 0
            r1 = r2[r6]
            int r0 = r1.hashCode()
            switch(r0) {
                case 3004662: goto L_0x0190;
                case 3006243: goto L_0x024c;
                case 3006244: goto L_0x024f;
                case 3199032: goto L_0x0393;
                case 3214780: goto L_0x0396;
                case 3356560: goto L_0x032d;
                case 3624515: goto L_0x053b;
                default: goto L_0x018f;
            }
        L_0x018f:
            return r4
        L_0x0190:
            java.lang.String r0 = "av01"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.4jd r8 = r10.A0M
            int r1 = r2.length
            java.lang.String r10 = "Ignoring malformed AV1 codec string: "
            java.lang.String r3 = "MediaCodecUtil"
            r0 = 4
            if (r1 >= r0) goto L_0x01a8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r10)
            goto L_0x0046
        L_0x01a8:
            r9 = 1
            r0 = r2[r9]     // Catch:{ NumberFormatException -> 0x0246 }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0246 }
            r1 = 2
            r0 = r2[r1]     // Catch:{ NumberFormatException -> 0x0246 }
            java.lang.String r0 = r0.substring(r6, r1)     // Catch:{ NumberFormatException -> 0x0246 }
            int r6 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0246 }
            r0 = 3
            r0 = r2[r0]     // Catch:{ NumberFormatException -> 0x0246 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0246 }
            if (r7 == 0) goto L_0x01ce
            java.lang.String r0 = "Unknown AV1 profile: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            goto L_0x0049
        L_0x01ce:
            r1 = 8
            if (r2 == r1) goto L_0x01da
            r0 = 10
            if (r2 == r0) goto L_0x01da
            java.lang.String r0 = "Unknown AV1 bit depth: "
            goto L_0x02e3
        L_0x01da:
            if (r2 == r1) goto L_0x01ec
            if (r8 == 0) goto L_0x0244
            byte[] r0 = r8.A04
            if (r0 != 0) goto L_0x01ea
            int r1 = r8.A03
            r0 = 7
            if (r1 == r0) goto L_0x01ea
            r0 = 6
            if (r1 != r0) goto L_0x0244
        L_0x01ea:
            r9 = 4096(0x1000, float:5.74E-42)
        L_0x01ec:
            switch(r6) {
                case 0: goto L_0x01fe;
                case 1: goto L_0x0200;
                case 2: goto L_0x0202;
                case 3: goto L_0x0204;
                case 4: goto L_0x0207;
                case 5: goto L_0x020a;
                case 6: goto L_0x020d;
                case 7: goto L_0x0210;
                case 8: goto L_0x0213;
                case 9: goto L_0x0216;
                case 10: goto L_0x0219;
                case 11: goto L_0x021c;
                case 12: goto L_0x021f;
                case 13: goto L_0x0222;
                case 14: goto L_0x0225;
                case 15: goto L_0x0228;
                case 16: goto L_0x022c;
                case 17: goto L_0x022f;
                case 18: goto L_0x0232;
                case 19: goto L_0x0235;
                case 20: goto L_0x0238;
                case 21: goto L_0x023b;
                case 22: goto L_0x023e;
                case 23: goto L_0x0241;
                default: goto L_0x01ef;
            }
        L_0x01ef:
            r1 = -1
        L_0x01f0:
            r0 = -1
            if (r1 != r0) goto L_0x05d6
            java.lang.String r0 = "Unknown AV1 level: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r6)
            goto L_0x0049
        L_0x01fe:
            r1 = 1
            goto L_0x01f0
        L_0x0200:
            r1 = 2
            goto L_0x01f0
        L_0x0202:
            r1 = 4
            goto L_0x01f0
        L_0x0204:
            r1 = 8
            goto L_0x01f0
        L_0x0207:
            r1 = 16
            goto L_0x01f0
        L_0x020a:
            r1 = 32
            goto L_0x01f0
        L_0x020d:
            r1 = 64
            goto L_0x01f0
        L_0x0210:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x01f0
        L_0x0213:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x01f0
        L_0x0216:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x01f0
        L_0x0219:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x01f0
        L_0x021c:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x01f0
        L_0x021f:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x01f0
        L_0x0222:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x01f0
        L_0x0225:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01f0
        L_0x0228:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x01f0
        L_0x022c:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x01f0
        L_0x022f:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f0
        L_0x0232:
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L_0x01f0
        L_0x0235:
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x01f0
        L_0x0238:
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01f0
        L_0x023b:
            r1 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x01f0
        L_0x023e:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x01f0
        L_0x0241:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x01f0
        L_0x0244:
            r9 = 2
            goto L_0x01ec
        L_0x0246:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r10)
            goto L_0x0341
        L_0x024c:
            java.lang.String r0 = "avc1"
            goto L_0x0251
        L_0x024f:
            java.lang.String r0 = "avc2"
        L_0x0251:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            int r10 = r2.length
            java.lang.String r9 = "Ignoring malformed AVC codec string: "
            r7 = 2
            java.lang.String r3 = "MediaCodecUtil"
            if (r10 >= r7) goto L_0x0265
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r9)
            goto L_0x0046
        L_0x0265:
            r8 = 1
            r6 = r2[r8]     // Catch:{ NumberFormatException -> 0x0328 }
            int r1 = r6.length()     // Catch:{ NumberFormatException -> 0x0328 }
            r0 = 6
            if (r1 != r0) goto L_0x0286
            r0 = 0
            java.lang.String r0 = r6.substring(r0, r7)     // Catch:{ NumberFormatException -> 0x0328 }
            r7 = 16
            int r6 = java.lang.Integer.parseInt(r0, r7)     // Catch:{ NumberFormatException -> 0x0328 }
            r1 = r2[r8]     // Catch:{ NumberFormatException -> 0x0328 }
            r0 = 4
            java.lang.String r0 = r1.substring(r0)     // Catch:{ NumberFormatException -> 0x0328 }
            int r2 = java.lang.Integer.parseInt(r0, r7)     // Catch:{ NumberFormatException -> 0x0328 }
            goto L_0x0293
        L_0x0286:
            r0 = 3
            if (r10 < r0) goto L_0x031b
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0328 }
            r0 = r2[r7]     // Catch:{ NumberFormatException -> 0x0328 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0328 }
        L_0x0293:
            r0 = 66
            if (r6 == r0) goto L_0x02cd
            r0 = 77
            if (r6 == r0) goto L_0x02cb
            r0 = 88
            if (r6 == r0) goto L_0x02c9
            r0 = 100
            if (r6 == r0) goto L_0x02c6
            r0 = 110(0x6e, float:1.54E-43)
            if (r6 == r0) goto L_0x02c3
            r0 = 122(0x7a, float:1.71E-43)
            if (r6 == r0) goto L_0x02c0
            r0 = 244(0xf4, float:3.42E-43)
            r1 = 64
            if (r6 == r0) goto L_0x02b2
            r1 = -1
        L_0x02b2:
            r0 = -1
            if (r1 != r0) goto L_0x02cf
            java.lang.String r0 = "Unknown AVC profile: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r6)
            goto L_0x0344
        L_0x02c0:
            r1 = 32
            goto L_0x02b2
        L_0x02c3:
            r1 = 16
            goto L_0x02b2
        L_0x02c6:
            r1 = 8
            goto L_0x02b2
        L_0x02c9:
            r1 = 4
            goto L_0x02b2
        L_0x02cb:
            r1 = 2
            goto L_0x02b2
        L_0x02cd:
            r1 = 1
            goto L_0x02b2
        L_0x02cf:
            switch(r2) {
                case 10: goto L_0x0311;
                case 11: goto L_0x0313;
                case 12: goto L_0x0315;
                case 13: goto L_0x0318;
                default: goto L_0x02d2;
            }
        L_0x02d2:
            switch(r2) {
                case 20: goto L_0x0308;
                case 21: goto L_0x030b;
                case 22: goto L_0x030e;
                default: goto L_0x02d5;
            }
        L_0x02d5:
            switch(r2) {
                case 30: goto L_0x02ff;
                case 31: goto L_0x0302;
                case 32: goto L_0x0305;
                default: goto L_0x02d8;
            }
        L_0x02d8:
            switch(r2) {
                case 40: goto L_0x02f6;
                case 41: goto L_0x02f9;
                case 42: goto L_0x02fc;
                default: goto L_0x02db;
            }
        L_0x02db:
            switch(r2) {
                case 50: goto L_0x02ec;
                case 51: goto L_0x02ef;
                case 52: goto L_0x02f3;
                default: goto L_0x02de;
            }
        L_0x02de:
            r6 = -1
        L_0x02df:
            if (r6 != r0) goto L_0x05df
            java.lang.String r0 = "Unknown AVC level: "
        L_0x02e3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            goto L_0x0049
        L_0x02ec:
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x02df
        L_0x02ef:
            r6 = 32768(0x8000, float:4.5918E-41)
            goto L_0x02df
        L_0x02f3:
            r6 = 65536(0x10000, float:9.18355E-41)
            goto L_0x02df
        L_0x02f6:
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x02df
        L_0x02f9:
            r6 = 4096(0x1000, float:5.74E-42)
            goto L_0x02df
        L_0x02fc:
            r6 = 8192(0x2000, float:1.14794E-41)
            goto L_0x02df
        L_0x02ff:
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x02df
        L_0x0302:
            r6 = 512(0x200, float:7.175E-43)
            goto L_0x02df
        L_0x0305:
            r6 = 1024(0x400, float:1.435E-42)
            goto L_0x02df
        L_0x0308:
            r6 = 32
            goto L_0x02df
        L_0x030b:
            r6 = 64
            goto L_0x02df
        L_0x030e:
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x02df
        L_0x0311:
            r6 = 1
            goto L_0x02df
        L_0x0313:
            r6 = 4
            goto L_0x02df
        L_0x0315:
            r6 = 8
            goto L_0x02df
        L_0x0318:
            r6 = 16
            goto L_0x02df
        L_0x031b:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r9)     // Catch:{ NumberFormatException -> 0x0328 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r0)     // Catch:{ NumberFormatException -> 0x0328 }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x0328 }
            goto L_0x05e4
        L_0x0328:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r9)
            goto L_0x0341
        L_0x032d:
            java.lang.String r0 = "mp4a"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            int r1 = r2.length
            java.lang.String r6 = "Ignoring malformed MP4A codec string: "
            java.lang.String r3 = "MediaCodecUtil"
            r0 = 3
            if (r1 == r0) goto L_0x034a
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r6)
        L_0x0341:
            r0.append(r5)
        L_0x0344:
            java.lang.String r0 = r0.toString()
            goto L_0x004d
        L_0x034a:
            r0 = 1
            r1 = r2[r0]     // Catch:{ NumberFormatException -> 0x05f3 }
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r1, r0)     // Catch:{ NumberFormatException -> 0x05f3 }
            java.lang.String r1 = X.C90834eu.A02(r0)     // Catch:{ NumberFormatException -> 0x05f3 }
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)     // Catch:{ NumberFormatException -> 0x05f3 }
            if (r0 == 0) goto L_0x0050
            r0 = 2
            r0 = r2[r0]     // Catch:{ NumberFormatException -> 0x05f3 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x05f3 }
            r1 = 17
            if (r0 == r1) goto L_0x0382
            r1 = 20
            if (r0 == r1) goto L_0x0382
            r1 = 23
            if (r0 == r1) goto L_0x0382
            r1 = 29
            if (r0 == r1) goto L_0x0382
            r1 = 39
            if (r0 == r1) goto L_0x0382
            r1 = 42
            if (r0 == r1) goto L_0x0382
            switch(r0) {
                case 1: goto L_0x0387;
                case 2: goto L_0x0389;
                case 3: goto L_0x038b;
                case 4: goto L_0x038d;
                case 5: goto L_0x038f;
                case 6: goto L_0x0391;
                default: goto L_0x0381;
            }     // Catch:{ NumberFormatException -> 0x05f3 }
        L_0x0381:
            r1 = -1
        L_0x0382:
            r0 = -1
            if (r1 == r0) goto L_0x0050
            goto L_0x05e5
        L_0x0387:
            r1 = 1
            goto L_0x0382
        L_0x0389:
            r1 = 2
            goto L_0x0382
        L_0x038b:
            r1 = 3
            goto L_0x0382
        L_0x038d:
            r1 = 4
            goto L_0x0382
        L_0x038f:
            r1 = 5
            goto L_0x0382
        L_0x0391:
            r1 = 6
            goto L_0x0382
        L_0x0393:
            java.lang.String r0 = "hev1"
            goto L_0x0398
        L_0x0396:
            java.lang.String r0 = "hvc1"
        L_0x0398:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            int r3 = r2.length
            java.lang.String r7 = "Ignoring malformed HEVC codec string: "
            java.lang.String r1 = "MediaCodecUtil"
            r0 = 4
            if (r3 < r0) goto L_0x0536
            java.util.regex.Pattern r6 = A02
            r3 = 1
            r0 = r2[r3]
            java.util.regex.Matcher r6 = r6.matcher(r0)
            boolean r0 = r6.matches()
            if (r0 == 0) goto L_0x0536
            java.lang.String r5 = r6.group(r3)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x03ca
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x052e
            r3 = 2
        L_0x03ca:
            r0 = 3
            r5 = r2[r0]
            if (r5 == 0) goto L_0x03dd
            int r0 = r5.hashCode()
            r9 = 16
            r8 = 8
            r7 = 4
            r6 = 2
            r2 = 1
            switch(r0) {
                case 70821: goto L_0x03e8;
                case 70914: goto L_0x03f6;
                case 70917: goto L_0x0404;
                case 71007: goto L_0x0410;
                case 71010: goto L_0x041c;
                case 74665: goto L_0x0428;
                case 74758: goto L_0x0436;
                case 74761: goto L_0x0444;
                case 74851: goto L_0x0452;
                case 74854: goto L_0x045e;
                case 2193639: goto L_0x046a;
                case 2193642: goto L_0x0476;
                case 2193732: goto L_0x0482;
                case 2193735: goto L_0x048f;
                case 2193738: goto L_0x049b;
                case 2193825: goto L_0x04a6;
                case 2193828: goto L_0x04b1;
                case 2193831: goto L_0x04bc;
                case 2312803: goto L_0x04c7;
                case 2312806: goto L_0x04d2;
                case 2312896: goto L_0x04dd;
                case 2312899: goto L_0x04e8;
                case 2312902: goto L_0x04f3;
                case 2312989: goto L_0x04fe;
                case 2312992: goto L_0x0509;
                case 2312995: goto L_0x0514;
                default: goto L_0x03dd;
            }
        L_0x03dd:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "Unknown HEVC level string: "
        L_0x03e3:
            r2.append(r0)
            goto L_0x054f
        L_0x03e8:
            java.lang.String r0 = "H30"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x0522
        L_0x03f6:
            java.lang.String r0 = "H60"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x0522
        L_0x0404:
            java.lang.String r0 = "H63"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 32
            goto L_0x051e
        L_0x0410:
            java.lang.String r0 = "H90"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x051e
        L_0x041c:
            java.lang.String r0 = "H93"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x051e
        L_0x0428:
            java.lang.String r0 = "L30"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0522
        L_0x0436:
            java.lang.String r0 = "L60"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0522
        L_0x0444:
            java.lang.String r0 = "L63"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x0522
        L_0x0452:
            java.lang.String r0 = "L90"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 64
            goto L_0x051e
        L_0x045e:
            java.lang.String r0 = "L93"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x051e
        L_0x046a:
            java.lang.String r0 = "H120"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x051e
        L_0x0476:
            java.lang.String r0 = "H123"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 8192(0x2000, float:1.14794E-41)
            goto L_0x051e
        L_0x0482:
            java.lang.String r0 = "H150"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x051e
        L_0x048f:
            java.lang.String r0 = "H153"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x051e
        L_0x049b:
            java.lang.String r0 = "H156"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 524288(0x80000, float:7.34684E-40)
            goto L_0x051e
        L_0x04a6:
            java.lang.String r0 = "H180"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x051e
        L_0x04b1:
            java.lang.String r0 = "H183"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x051e
        L_0x04bc:
            java.lang.String r0 = "H186"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x051e
        L_0x04c7:
            java.lang.String r0 = "L120"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x051e
        L_0x04d2:
            java.lang.String r0 = "L123"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x051e
        L_0x04dd:
            java.lang.String r0 = "L150"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x051e
        L_0x04e8:
            java.lang.String r0 = "L153"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x051e
        L_0x04f3:
            java.lang.String r0 = "L156"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L_0x051e
        L_0x04fe:
            java.lang.String r0 = "L180"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x051e
        L_0x0509:
            java.lang.String r0 = "L183"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x051e
        L_0x0514:
            java.lang.String r0 = "L186"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 16777216(0x1000000, float:2.3509887E-38)
        L_0x051e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0522:
            if (r2 == 0) goto L_0x03dd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r0, r2)
            return r4
        L_0x052e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "Unknown HEVC profile string: "
            goto L_0x03e3
        L_0x0536:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r7)
            goto L_0x054f
        L_0x053b:
            java.lang.String r0 = "vp09"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            int r6 = r2.length
            java.lang.String r3 = "Ignoring malformed VP9 codec string: "
            java.lang.String r1 = "MediaCodecUtil"
            r0 = 3
            if (r6 >= r0) goto L_0x055a
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r3)
        L_0x054f:
            r2.append(r5)
        L_0x0552:
            java.lang.String r0 = r2.toString()
        L_0x0556:
            android.util.Log.w(r1, r0)
            return r4
        L_0x055a:
            r0 = 1
            r0 = r2[r0]     // Catch:{ NumberFormatException -> 0x060d }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x060d }
            r6 = 2
            r0 = r2[r6]     // Catch:{ NumberFormatException -> 0x060d }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x060d }
            r0 = 1
            r5 = 1
            if (r7 == 0) goto L_0x0577
            r5 = 2
            if (r7 == r0) goto L_0x0577
            if (r7 == r6) goto L_0x0581
            r0 = 3
            r5 = 8
            if (r7 == r0) goto L_0x0577
            r5 = -1
        L_0x0577:
            r2 = -1
            if (r5 != r2) goto L_0x0583
            java.lang.String r0 = "Unknown VP9 profile: "
            java.lang.String r0 = X.C13680ns.A0c(r7, r0)
            goto L_0x0556
        L_0x0581:
            r5 = 4
            goto L_0x0577
        L_0x0583:
            r0 = 10
            r6 = 1
            if (r3 == r0) goto L_0x05be
            r0 = 11
            r6 = 2
            if (r3 == r0) goto L_0x05be
            r0 = 20
            r6 = 4
            if (r3 == r0) goto L_0x05be
            r0 = 21
            r6 = 8
            if (r3 == r0) goto L_0x05be
            r0 = 30
            r6 = 16
            if (r3 == r0) goto L_0x05be
            r0 = 31
            r6 = 32
            if (r3 == r0) goto L_0x05be
            r0 = 40
            r6 = 64
            if (r3 == r0) goto L_0x05be
            r0 = 41
            r6 = 128(0x80, float:1.794E-43)
            if (r3 == r0) goto L_0x05be
            r0 = 50
            r6 = 256(0x100, float:3.59E-43)
            if (r3 == r0) goto L_0x05be
            r0 = 51
            if (r3 == r0) goto L_0x05d3
            switch(r3) {
                case 60: goto L_0x05ca;
                case 61: goto L_0x05cd;
                case 62: goto L_0x05d0;
                default: goto L_0x05bd;
            }
        L_0x05bd:
            r6 = -1
        L_0x05be:
            if (r6 != r2) goto L_0x05ff
            java.lang.String r0 = "Unknown VP9 level: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r2.append(r3)
            goto L_0x0552
        L_0x05ca:
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x05be
        L_0x05cd:
            r6 = 4096(0x1000, float:5.74E-42)
            goto L_0x05be
        L_0x05d0:
            r6 = 8192(0x2000, float:1.14794E-41)
            goto L_0x05be
        L_0x05d3:
            r6 = 512(0x200, float:7.175E-43)
            goto L_0x05be
        L_0x05d6:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0607
        L_0x05df:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            goto L_0x0603
        L_0x05e4:
            return r4
        L_0x05e5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x05f3 }
            java.lang.Integer r1 = X.C13680ns.A0X()     // Catch:{ NumberFormatException -> 0x05f3 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x05f3 }
            r0.<init>(r2, r1)     // Catch:{ NumberFormatException -> 0x05f3 }
            return r0
        L_0x05f3:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r6)
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r0)
            android.util.Log.w(r3, r0)
            return r4
        L_0x05ff:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
        L_0x0603:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L_0x0607:
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r7, r0)
            return r4
        L_0x060d:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r3)
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r0)
            android.util.Log.w(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90884f0.A01(X.1gT):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (A04(r15) == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0202 A[Catch:{ Exception -> 0x02f3, Exception -> 0x0337 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x027a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A02(X.AnonymousClass4UC r15, X.C109605Su r16) {
        /*
            java.lang.String r9 = "secure-playback"
            java.lang.String r8 = "tunneled-playback"
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0337 }
            r11 = r15
            java.lang.String r6 = r15.A00     // Catch:{ Exception -> 0x0337 }
            r10 = r16
            int r5 = r10.AAg()     // Catch:{ Exception -> 0x0337 }
            boolean r16 = r10.AdA()     // Catch:{ Exception -> 0x0337 }
            r4 = 0
        L_0x0016:
            if (r4 >= r5) goto L_0x0336
            android.media.MediaCodecInfo r15 = r10.AAh(r4)     // Catch:{ Exception -> 0x0337 }
            int r1 = X.AnonymousClass3C1.A01     // Catch:{ Exception -> 0x0337 }
            r0 = 29
            if (r1 < r0) goto L_0x0029
            boolean r2 = A04(r15)     // Catch:{ Exception -> 0x0337 }
            r0 = 1
            if (r2 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != 0) goto L_0x027a
            java.lang.String r3 = r15.getName()     // Catch:{ Exception -> 0x0337 }
            boolean r0 = r15.isEncoder()     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            if (r16 != 0) goto L_0x0042
            java.lang.String r0 = ".secure"
            boolean r0 = r3.endsWith(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0042
            goto L_0x01fd
        L_0x0042:
            r0 = 21
            if (r1 >= r0) goto L_0x013c
            java.lang.String r0 = "CIPAACDecoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "CIPMP3Decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "CIPVorbisDecoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "CIPAMRNBDecoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "AACDecoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "MP3Decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            r0 = 18
            if (r1 >= r0) goto L_0x013c
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r12 = X.AnonymousClass3C1.A02     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "a70"
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r2 = X.AnonymousClass3C1.A04     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = "HM"
            boolean r0 = r12.startsWith(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x00a0
            goto L_0x01fd
        L_0x00a0:
            r0 = 16
            if (r1 != r0) goto L_0x013c
            java.lang.String r0 = "OMX.qcom.audio.decoder.mp3"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0110
            java.lang.String r2 = X.AnonymousClass3C1.A02     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "dlxu"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "protou"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "ville"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "villeplus"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "villec2"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "gee"
            boolean r0 = r2.startsWith(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "C6602"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "C6603"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "C6606"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "C6616"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "L36h"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "SO-02E"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0110
            goto L_0x01fd
        L_0x0110:
            java.lang.String r0 = "OMX.qcom.audio.decoder.aac"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x013c
            java.lang.String r2 = X.AnonymousClass3C1.A02     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "C1504"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "C1505"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "C1604"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "C1605"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x013c
            goto L_0x01fd
        L_0x013c:
            r0 = 24
            java.lang.String r12 = "samsung"
            if (r1 >= r0) goto L_0x019d
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "OMX.Exynos.AAC.Decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x019d
        L_0x0152:
            java.lang.String r0 = X.AnonymousClass3C1.A04     // Catch:{ Exception -> 0x0337 }
            boolean r0 = r12.equals(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x019d
            java.lang.String r2 = X.AnonymousClass3C1.A02     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "zeroflte"
            boolean r0 = r2.startsWith(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "zerolte"
            boolean r0 = r2.startsWith(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "zenlte"
            boolean r0 = r2.startsWith(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "SC-05G"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "marinelteatt"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "404SC"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "SC-04G"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "SCV31"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x019d
            goto L_0x01fd
        L_0x019d:
            java.lang.String r2 = "jflte"
            r0 = 19
            if (r1 > r0) goto L_0x01ed
            java.lang.String r0 = "OMX.SEC.vp8.dec"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x01dc
            java.lang.String r0 = X.AnonymousClass3C1.A04     // Catch:{ Exception -> 0x0337 }
            boolean r0 = r12.equals(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x01dc
            java.lang.String r12 = X.AnonymousClass3C1.A02     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "d2"
            boolean r0 = r12.startsWith(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "serrano"
            boolean r0 = r12.startsWith(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            boolean r0 = r12.startsWith(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "santos"
            boolean r0 = r12.startsWith(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "t0"
            boolean r0 = r12.startsWith(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x01dc
            goto L_0x01fd
        L_0x01dc:
            java.lang.String r0 = X.AnonymousClass3C1.A02     // Catch:{ Exception -> 0x0337 }
            boolean r0 = r0.startsWith(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x01ed
            goto L_0x01fd
        L_0x01ed:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x01ff
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x01ff
        L_0x01fd:
            r0 = 0
            goto L_0x0200
        L_0x01ff:
            r0 = 1
        L_0x0200:
            if (r0 == 0) goto L_0x027a
            java.lang.String[] r14 = r15.getSupportedTypes()     // Catch:{ Exception -> 0x0337 }
            int r13 = r14.length     // Catch:{ Exception -> 0x0337 }
            r2 = 0
        L_0x0208:
            if (r2 >= r13) goto L_0x0215
            r12 = r14[r2]     // Catch:{ Exception -> 0x0337 }
            boolean r0 = r12.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x0262
            int r2 = r2 + 1
            goto L_0x0208
        L_0x0215:
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x023b
            java.lang.String r0 = "OMX.MS.HEVCDV.Decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0228
            java.lang.String r12 = "video/hevcdv"
            goto L_0x0262
        L_0x0228:
            java.lang.String r0 = "OMX.RTK.video.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x0238
            java.lang.String r0 = "OMX.realtek.video.decoder.tunneled"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0261
        L_0x0238:
            java.lang.String r12 = "video/dv_hevc"
            goto L_0x0262
        L_0x023b:
            java.lang.String r0 = "audio/alac"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x024e
            java.lang.String r0 = "OMX.lge.alac.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x024e
            java.lang.String r12 = "audio/x-lg-alac"
            goto L_0x0262
        L_0x024e:
            java.lang.String r0 = "audio/flac"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0261
            java.lang.String r0 = "OMX.lge.flac.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0261
            java.lang.String r12 = "audio/x-lg-flac"
            goto L_0x0262
        L_0x0261:
            r12 = 0
        L_0x0262:
            if (r12 == 0) goto L_0x027a
            android.media.MediaCodecInfo$CodecCapabilities r13 = r15.getCapabilitiesForType(r12)     // Catch:{ Exception -> 0x02f3 }
            boolean r14 = r10.AIo(r13, r8, r12)     // Catch:{ Exception -> 0x02f3 }
            boolean r2 = r10.AIn(r13, r8, r12)     // Catch:{ Exception -> 0x02f3 }
            boolean r0 = r11.A02     // Catch:{ Exception -> 0x02f3 }
            if (r0 != 0) goto L_0x0276
            if (r2 != 0) goto L_0x027a
        L_0x0276:
            if (r0 == 0) goto L_0x027e
            if (r14 != 0) goto L_0x027e
        L_0x027a:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x027e:
            boolean r14 = r10.AIo(r13, r9, r12)     // Catch:{ Exception -> 0x02f3 }
            boolean r0 = r10.AIn(r13, r9, r12)     // Catch:{ Exception -> 0x02f3 }
            boolean r2 = r11.A01     // Catch:{ Exception -> 0x02f3 }
            if (r2 != 0) goto L_0x028c
            if (r0 != 0) goto L_0x027a
        L_0x028c:
            if (r2 == 0) goto L_0x0291
            if (r14 != 0) goto L_0x0291
            goto L_0x027a
        L_0x0291:
            r0 = 29
            if (r1 < r0) goto L_0x0296
            goto L_0x029a
        L_0x0296:
            A06(r15)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x029d
        L_0x029a:
            A05(r15)     // Catch:{ Exception -> 0x02f3 }
        L_0x029d:
            A06(r15)     // Catch:{ Exception -> 0x02f3 }
            r0 = 29
            if (r1 < r0) goto L_0x02a8
            A08(r15)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x02ca
        L_0x02a8:
            java.lang.String r15 = r15.getName()     // Catch:{ Exception -> 0x02f3 }
            if (r15 == 0) goto L_0x02b4
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r15 = r15.toLowerCase(r0)     // Catch:{ Exception -> 0x02f3 }
        L_0x02b4:
            java.lang.String r0 = "omx.google."
            boolean r0 = r15.startsWith(r0)     // Catch:{ Exception -> 0x02f3 }
            if (r0 != 0) goto L_0x02ca
            java.lang.String r0 = "c2.android."
            boolean r0 = r15.startsWith(r0)     // Catch:{ Exception -> 0x02f3 }
            if (r0 != 0) goto L_0x02ca
            java.lang.String r0 = "c2.google."
            boolean r0 = r15.startsWith(r0)     // Catch:{ Exception -> 0x02f3 }
        L_0x02ca:
            if (r16 == 0) goto L_0x02ce
            if (r2 == r14) goto L_0x02ea
        L_0x02ce:
            if (r16 != 0) goto L_0x02d3
            if (r2 != 0) goto L_0x02d3
            goto L_0x02ea
        L_0x02d3:
            if (r16 != 0) goto L_0x027a
            if (r14 == 0) goto L_0x027a
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r3)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r0 = ".secure"
            java.lang.String r2 = X.AnonymousClass000.A0h(r0, r2)     // Catch:{ Exception -> 0x02f3 }
            r0 = 1
            X.4eg r0 = X.C90714eg.A00(r13, r2, r6, r12, r0)     // Catch:{ Exception -> 0x02f3 }
            r7.add(r0)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x0317
        L_0x02ea:
            r0 = 0
            X.4eg r0 = X.C90714eg.A00(r13, r3, r6, r12, r0)     // Catch:{ Exception -> 0x02f3 }
            r7.add(r0)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x027a
        L_0x02f3:
            r13 = move-exception
            r0 = 23
            java.lang.String r2 = "MediaCodecUtil"
            if (r1 > r0) goto L_0x0318
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x0318
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "Skipping codec "
            r1.append(r0)     // Catch:{ Exception -> 0x0337 }
            r1.append(r3)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = " (failed to query capabilities)"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ Exception -> 0x0337 }
            android.util.Log.e(r2, r0)     // Catch:{ Exception -> 0x0337 }
            goto L_0x027a
        L_0x0317:
            return r7
        L_0x0318:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "Failed to query codec "
            r1.append(r0)     // Catch:{ Exception -> 0x0337 }
            r1.append(r3)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ Exception -> 0x0337 }
            r1.append(r12)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ Exception -> 0x0337 }
            android.util.Log.e(r2, r0)     // Catch:{ Exception -> 0x0337 }
            throw r13     // Catch:{ Exception -> 0x0337 }
        L_0x0336:
            return r7
        L_0x0337:
            r1 = move-exception
            X.43N r0 = new X.43N
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90884f0.A02(X.4UC, X.5Su):java.util.ArrayList");
    }

    public static synchronized List A03(String str, boolean z2, boolean z3) {
        List list;
        synchronized (C90884f0.class) {
            AnonymousClass4UC r3 = new AnonymousClass4UC(str, z2, z3);
            HashMap hashMap = A01;
            list = (List) hashMap.get(r3);
            if (list == null) {
                int i2 = AnonymousClass3C1.A01;
                ArrayList A022 = A02(r3, i2 >= 21 ? new C97124pR(z2, z3) : new C97114pQ());
                if (z2 && A022.isEmpty() && 21 <= i2 && i2 <= 23) {
                    A022 = A02(r3, new C97114pQ());
                    if (!A022.isEmpty()) {
                        StringBuilder A0o = AnonymousClass000.A0o();
                        A0o.append("MediaCodecList API didn't list secure decoder for: ");
                        A0o.append(str);
                        A0o.append(". Assuming: ");
                        Log.w("MediaCodecUtil", AnonymousClass000.A0h(((C90714eg) A022.get(0)).A03, A0o));
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (i2 < 26 && AnonymousClass3C1.A02.equals("R9") && A022.size() == 1 && ((C90714eg) A022.get(0)).A03.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        A022.add(new C90714eg((MediaCodecInfo.CodecCapabilities) null, "OMX.google.raw.decoder", "audio/raw", "audio/raw", false, false));
                    }
                    Collections.sort(A022, new IDxComparatorShape184S0100000_2_I1(new IDxSProviderShape50S0000000_2_I1(0), 1));
                }
                if (i2 >= 21) {
                    if (i2 < 30) {
                    }
                    list = Collections.unmodifiableList(A022);
                    hashMap.put(r3, list);
                } else if (A022.size() > 1) {
                    String str2 = ((C90714eg) A022.get(0)).A03;
                    if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                        Collections.sort(A022, new IDxComparatorShape184S0100000_2_I1(new IDxSProviderShape50S0000000_2_I1(1), 1));
                    }
                }
                if (A022.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C90714eg) A022.get(0)).A03)) {
                    A022.add(A022.remove(0));
                }
                list = Collections.unmodifiableList(A022);
                hashMap.put(r3, list);
            }
        }
        return list;
    }

    public static boolean A04(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean A05(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean A06(MediaCodecInfo mediaCodecInfo) {
        if (AnonymousClass3C1.A01 >= 29) {
            return A07(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        if (name != null) {
            name = name.toLowerCase(Locale.US);
        }
        if (!name.startsWith("arc.")) {
            return name.startsWith("omx.google.") || name.startsWith("omx.ffmpeg.") || (name.startsWith("omx.sec.") && name.contains(".sw.")) || name.equals("omx.qcom.video.decoder.hevcswvdec") || name.startsWith("c2.android.") || name.startsWith("c2.google.") || (!name.startsWith("omx.") && !name.startsWith("c2."));
        }
        return false;
    }

    public static boolean A07(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean A08(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}

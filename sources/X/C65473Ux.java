package X;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.facebook.redex.IDxComparatorShape184S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape0S0101100_I1;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Ux  reason: invalid class name and case insensitive filesystem */
public class C65473Ux extends AnonymousClass3UH {
    public static boolean A0b;
    public static boolean A0c;
    public static final int[] A0d = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public Surface A0K;
    public Surface A0L;
    public C84094Jf A0M;
    public C92014gr A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final int A0V = 50;
    public final long A0W = 5000;
    public final Context A0X;
    public final C89444cB A0Y;
    public final AnonymousClass4GS A0Z;
    public final boolean A0a;

    public C65473Ux(Context context, Handler handler, AnonymousClass5TR r9, C109725Ti r10, AnonymousClass5TJ r11) {
        super(r9, r10, 30.0f, 2);
        Context applicationContext = context.getApplicationContext();
        this.A0X = applicationContext;
        this.A0Y = new C89444cB(applicationContext);
        this.A0Z = new AnonymousClass4GS(handler, r11);
        this.A0a = "NVIDIA".equals(AnonymousClass3C1.A04);
        this.A0G = -9223372036854775807L;
        this.A06 = -1;
        this.A04 = -1;
        this.A00 = -1.0f;
        this.A0B = 1;
        this.A0C = 0;
        this.A0A = -1;
        this.A08 = -1;
        this.A01 = -1.0f;
        this.A09 = -1;
    }

    public static int A00(C32491gT r6, C90714eg r7) {
        int i2 = r6.A0A;
        if (i2 == -1) {
            return A02(r7, r6.A0T, r6.A0I, r6.A09);
        }
        List list = r6.A0U;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((byte[]) list.get(i4)).length;
        }
        return i2 + i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r5.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r2 = X.AnonymousClass3C1.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if ("BRAVIA 4K 2015".equals(r2) != false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if ("Amazon".equals(X.AnonymousClass3C1.A04) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if ("KFSOWI".equals(r2) != false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ("AFTS".equals(r2) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r4.A06 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        r6 = (((((r6 + 16) - 1) / 16) * (((r7 + 16) - 1) / 16)) << 4) << 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r5.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        r6 = r6 * r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        if (r5.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        r6 = r6 * r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0076, code lost:
        return (r6 * 3) / (r2 << 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.C90714eg r4, java.lang.String r5, int r6, int r7) {
        /*
            r3 = -1
            if (r6 == r3) goto L_0x000d
            if (r7 == r3) goto L_0x000d
            int r0 = r5.hashCode()
            r2 = 4
            switch(r0) {
                case -1851077871: goto L_0x0011;
                case -1664118616: goto L_0x000e;
                case -1662541442: goto L_0x0014;
                case 1187890754: goto L_0x0017;
                case 1331836730: goto L_0x001a;
                case 1599127256: goto L_0x005d;
                case 1599127257: goto L_0x0068;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r3
        L_0x000e:
            java.lang.String r0 = "video/3gpp"
            goto L_0x005f
        L_0x0011:
            java.lang.String r0 = "video/dolby-vision"
            goto L_0x001c
        L_0x0014:
            java.lang.String r0 = "video/hevc"
            goto L_0x006a
        L_0x0017:
            java.lang.String r0 = "video/mp4v-es"
            goto L_0x005f
        L_0x001a:
            java.lang.String r0 = "video/avc"
        L_0x001c:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r2 = X.AnonymousClass3C1.A05
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x000d
            java.lang.String r1 = X.AnonymousClass3C1.A04
            java.lang.String r0 = "Amazon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "AFTS"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x004b
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x004b
            return r3
        L_0x004b:
            r2 = 16
            int r0 = r6 + 16
            int r1 = r0 + -1
            int r1 = r1 / r2
            int r0 = r7 + 16
            int r0 = r0 + -1
            int r0 = r0 / r2
            int r1 = r1 * r0
            int r0 = r1 << 4
            int r6 = r0 << 4
            goto L_0x0066
        L_0x005d:
            java.lang.String r0 = "video/x-vnd.on2.vp8"
        L_0x005f:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            int r6 = r6 * r7
        L_0x0066:
            r2 = 2
            goto L_0x0071
        L_0x0068:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
        L_0x006a:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            int r6 = r6 * r7
        L_0x0071:
            int r1 = r6 * 3
            int r0 = r2 << 1
            int r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65473Ux.A02(X.4eg, java.lang.String, int, int):int");
    }

    public static MediaFormat A03(C32491gT r5, C84094Jf r6, String str, float f2, int i2, boolean z2) {
        Pair A012;
        int A0D2;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", r5.A0I);
        mediaFormat.setInteger("height", r5.A09);
        List list = r5.A0U;
        for (int i3 = 0; i3 < list.size(); i3++) {
            mediaFormat.setByteBuffer(C13680ns.A0c(i3, "csd-"), ByteBuffer.wrap((byte[]) list.get(i3)));
        }
        float f3 = r5.A01;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        int i4 = r5.A0E;
        if (i4 != -1) {
            mediaFormat.setInteger("rotation-degrees", i4);
        }
        C93704jd r4 = r5.A0M;
        if (r4 != null) {
            int i5 = r4.A03;
            if (i5 != -1) {
                mediaFormat.setInteger("color-transfer", i5);
            }
            int i6 = r4.A02;
            if (i6 != -1) {
                mediaFormat.setInteger("color-standard", i6);
            }
            int i7 = r4.A01;
            if (i7 != -1) {
                mediaFormat.setInteger("color-range", i7);
            }
            byte[] bArr = r4.A04;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if (!(!"video/dolby-vision".equals(r5.A0T) || (A012 = C90884f0.A01(r5)) == null || (A0D2 = AnonymousClass000.A0D(A012.first)) == -1)) {
            mediaFormat.setInteger("profile", A0D2);
        }
        mediaFormat.setInteger("max-width", r6.A02);
        mediaFormat.setInteger("max-height", r6.A00);
        int i8 = r6.A01;
        if (i8 != -1) {
            mediaFormat.setInteger("max-input-size", i8);
        }
        if (AnonymousClass3C1.A01 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z2) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i2 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i2);
        }
        return mediaFormat;
    }

    public static List A04(C32491gT r5, C109725Ti r6, boolean z2, boolean z3) {
        Pair A012;
        String str;
        String str2 = r5.A0T;
        if (str2 == null) {
            return Collections.emptyList();
        }
        ArrayList A0n = C13680ns.A0n(r6.ABf(str2, z2, z3));
        Collections.sort(A0n, new IDxComparatorShape184S0100000_2_I1(new C97134pS(r5), 1));
        if ("video/dolby-vision".equals(str2) && (A012 = C90884f0.A01(r5)) != null) {
            int A0D2 = AnonymousClass000.A0D(A012.first);
            if (A0D2 == 16 || A0D2 == 256) {
                str = "video/hevc";
            } else if (A0D2 == 512) {
                str = "video/avc";
            }
            A0n.addAll(r6.ABf(str, z2, z3));
        }
        return Collections.unmodifiableList(A0n);
    }

    public static void A05(Surface surface, AnonymousClass5T3 r1) {
        r1.AeG(surface);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0168, code lost:
        r0 = "F04J";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x016c, code lost:
        r0 = "P681";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0170, code lost:
        r0 = "Q350";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0174, code lost:
        r0 = "Q427";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0178, code lost:
        r0 = "XE2X";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x017c, code lost:
        r0 = "fugu";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0180, code lost:
        r0 = "kate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0184, code lost:
        r0 = "mido";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0188, code lost:
        r0 = "p212";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x018c, code lost:
        r0 = "MEIZU_M5";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0190, code lost:
        r0 = "601LV";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0194, code lost:
        r0 = "602LV";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0198, code lost:
        r0 = "Aura_Note_2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x019c, code lost:
        r0 = "A1601";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01a0, code lost:
        r0 = "E5643";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01a4, code lost:
        r0 = "F3111";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01a8, code lost:
        r0 = "F3113";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ac, code lost:
        r0 = "F3116";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b0, code lost:
        r0 = "F3211";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01b4, code lost:
        r0 = "F3213";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b8, code lost:
        r0 = "F3215";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01bc, code lost:
        r0 = "F3311";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01c0, code lost:
        r0 = "PRO7S";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01c4, code lost:
        r0 = "Q4260";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01c8, code lost:
        r0 = "Q4310";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01cc, code lost:
        r0 = "V23GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01d0, code lost:
        r0 = "X3_HK";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01d4, code lost:
        r0 = "i9031";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01d7, code lost:
        r0 = "l5460";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01da, code lost:
        r0 = "le_x6";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01dd, code lost:
        r0 = "A2016a40";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01e0, code lost:
        r0 = "CPY83_I00";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01e3, code lost:
        r0 = "marino_f";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01e6, code lost:
        r0 = "griffin";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01e9, code lost:
        r0 = "A7010a48";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01ec, code lost:
        r0 = "A7020a48";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01ef, code lost:
        r0 = "TB3-730F";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01f2, code lost:
        r0 = "TB3-730X";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f5, code lost:
        r0 = "TB3-850F";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01f8, code lost:
        r0 = "TB3-850M";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01fb, code lost:
        r0 = "Pixi5-10_4G";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01fe, code lost:
        r0 = "QM16XE_U";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0201, code lost:
        r0 = "GIONEE_WBL5708";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0204, code lost:
        r0 = "GIONEE_WBL7365";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0207, code lost:
        r0 = "GIONEE_WBL7519";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x020a, code lost:
        r0 = "manning";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x020d, code lost:
        r0 = "A7000plus";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0210, code lost:
        r0 = "j2xlteins";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0213, code lost:
        r0 = "panell_d";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0216, code lost:
        r0 = "LS-5017";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0219, code lost:
        r0 = "itel_S41";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x021c, code lost:
        r0 = "hwALE-H";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x021f, code lost:
        r0 = "EverStar_S";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0222, code lost:
        r0 = "htc_e56ml_dtul";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0225, code lost:
        r0 = "woods_f";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0228, code lost:
        r0 = "CPH1609";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x022b, code lost:
        r0 = "CPH1715";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x022e, code lost:
        r0 = "iball8735_9806";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0231, code lost:
        r0 = "santoni";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0234, code lost:
        r0 = "PB2-670M";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0237, code lost:
        r0 = "Infinix-X572";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x023a, code lost:
        r0 = "BRAVIA_ATV3_4K";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x023d, code lost:
        r0 = "DM-01K";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0240, code lost:
        r0 = "HWBLN-H";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0243, code lost:
        r0 = "HWCAM-H";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0246, code lost:
        r0 = "ASUS_X00AD_2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0249, code lost:
        r0 = "ELUGA_Note";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x024c, code lost:
        r0 = "ELUGA_Prim";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x024f, code lost:
        r0 = "HWVNS-H";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0252, code lost:
        r0 = "HWWAS-H";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0258, code lost:
        if (r2.equals(r0) != false) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x025a, code lost:
        r1 = X.AnonymousClass3C1.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0260, code lost:
        switch(r1.hashCode()) {
            case -594534941: goto L_0x0264;
            case 2006354: goto L_0x0267;
            case 2006367: goto L_0x026a;
            default: goto L_0x0263;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0264, code lost:
        r0 = "JSN-L21";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0267, code lost:
        r0 = "AFTA";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x026a, code lost:
        r0 = "AFTN";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0270, code lost:
        if (r1.equals(r0) != false) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0273, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r2.equals(r0) != false) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        if (r3 > 27) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        if ("HWEML".equals(r2) != false) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (r3 > 26) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        switch(r1) {
            case -2144781245: goto L_0x0050;
            case -2144781185: goto L_0x0054;
            case -2144781160: goto L_0x0058;
            case -2097309513: goto L_0x005c;
            case -2022874474: goto L_0x0060;
            case -1978993182: goto L_0x0064;
            case -1978990237: goto L_0x0068;
            case -1936688988: goto L_0x006c;
            case -1936688066: goto L_0x0070;
            case -1936688065: goto L_0x0074;
            case -1931988508: goto L_0x0078;
            case -1885099851: goto L_0x007c;
            case -1696512866: goto L_0x0080;
            case -1680025915: goto L_0x0084;
            case -1615810839: goto L_0x0088;
            case -1600724499: goto L_0x008c;
            case -1554255044: goto L_0x0090;
            case -1481772737: goto L_0x0094;
            case -1481772730: goto L_0x0098;
            case -1481772729: goto L_0x009c;
            case -1320080169: goto L_0x00a0;
            case -1217592143: goto L_0x00a4;
            case -1180384755: goto L_0x00a8;
            case -1139198265: goto L_0x00ac;
            case -1052835013: goto L_0x00b0;
            case -993250464: goto L_0x00b4;
            case -993250458: goto L_0x00b8;
            case -965403638: goto L_0x00bc;
            case -958336948: goto L_0x00c0;
            case -879245230: goto L_0x00c4;
            case -842500323: goto L_0x00c8;
            case -821392978: goto L_0x00cc;
            case -797483286: goto L_0x00d0;
            case -794946968: goto L_0x00d4;
            case -788334647: goto L_0x00d8;
            case -782144577: goto L_0x00dc;
            case -575125681: goto L_0x00e0;
            case -521118391: goto L_0x00e4;
            case -430914369: goto L_0x00e8;
            case -290434366: goto L_0x00ec;
            case -282781963: goto L_0x00f0;
            case -277133239: goto L_0x00f4;
            case -173639913: goto L_0x00f8;
            case -56598463: goto L_0x00fc;
            case 2126: goto L_0x0100;
            case 2564: goto L_0x0104;
            case 2715: goto L_0x0108;
            case 2719: goto L_0x010c;
            case 3091: goto L_0x0110;
            case 3483: goto L_0x0114;
            case 73405: goto L_0x0118;
            case 75537: goto L_0x011c;
            case 75739: goto L_0x0120;
            case 76779: goto L_0x0124;
            case 78669: goto L_0x0128;
            case 79305: goto L_0x012c;
            case 80618: goto L_0x0130;
            case 88274: goto L_0x0134;
            case 98846: goto L_0x0138;
            case 98848: goto L_0x013c;
            case 99329: goto L_0x0140;
            case 101481: goto L_0x0144;
            case 1513190: goto L_0x0148;
            case 1514184: goto L_0x014c;
            case 1514185: goto L_0x0150;
            case 2133089: goto L_0x0154;
            case 2133091: goto L_0x0158;
            case 2133120: goto L_0x015c;
            case 2133151: goto L_0x0160;
            case 2133182: goto L_0x0164;
            case 2133184: goto L_0x0168;
            case 2436959: goto L_0x016c;
            case 2463773: goto L_0x0170;
            case 2464648: goto L_0x0174;
            case 2689555: goto L_0x0178;
            case 3154429: goto L_0x017c;
            case 3284551: goto L_0x0180;
            case 3351335: goto L_0x0184;
            case 3386211: goto L_0x0188;
            case 41325051: goto L_0x018c;
            case 51349633: goto L_0x0190;
            case 51350594: goto L_0x0194;
            case 55178625: goto L_0x0198;
            case 61542055: goto L_0x019c;
            case 65355429: goto L_0x01a0;
            case 66214468: goto L_0x01a4;
            case 66214470: goto L_0x01a8;
            case 66214473: goto L_0x01ac;
            case 66215429: goto L_0x01b0;
            case 66215431: goto L_0x01b4;
            case 66215433: goto L_0x01b8;
            case 66216390: goto L_0x01bc;
            case 76402249: goto L_0x01c0;
            case 76404105: goto L_0x01c4;
            case 76404911: goto L_0x01c8;
            case 80963634: goto L_0x01cc;
            case 82882791: goto L_0x01d0;
            case 98715550: goto L_0x01d4;
            case 101370885: goto L_0x01d7;
            case 102844228: goto L_0x01da;
            case 165221241: goto L_0x01dd;
            case 182191441: goto L_0x01e0;
            case 245388979: goto L_0x01e3;
            case 287431619: goto L_0x01e6;
            case 307593612: goto L_0x01e9;
            case 308517133: goto L_0x01ec;
            case 316215098: goto L_0x01ef;
            case 316215116: goto L_0x01f2;
            case 316246811: goto L_0x01f5;
            case 316246818: goto L_0x01f8;
            case 407160593: goto L_0x01fb;
            case 507412548: goto L_0x01fe;
            case 793982701: goto L_0x0201;
            case 794038622: goto L_0x0204;
            case 794040393: goto L_0x0207;
            case 835649806: goto L_0x020a;
            case 917340916: goto L_0x020d;
            case 958008161: goto L_0x0210;
            case 1060579533: goto L_0x0213;
            case 1150207623: goto L_0x0216;
            case 1176899427: goto L_0x0219;
            case 1280332038: goto L_0x021c;
            case 1306947716: goto L_0x021f;
            case 1349174697: goto L_0x0222;
            case 1522194893: goto L_0x0225;
            case 1691543273: goto L_0x0228;
            case 1691544261: goto L_0x022b;
            case 1709443163: goto L_0x022e;
            case 1865889110: goto L_0x0231;
            case 1906253259: goto L_0x0234;
            case 1977196784: goto L_0x0237;
            case 2006372676: goto L_0x023a;
            case 2019281702: goto L_0x023d;
            case 2029784656: goto L_0x0240;
            case 2030379515: goto L_0x0243;
            case 2033393791: goto L_0x0246;
            case 2047190025: goto L_0x0249;
            case 2047252157: goto L_0x024c;
            case 2048319463: goto L_0x024f;
            case 2048855701: goto L_0x0252;
            default: goto L_0x004e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        r0 = "GIONEE_SWW1609";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        r0 = "GIONEE_SWW1627";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
        r0 = "GIONEE_SWW1631";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        r0 = "K50a40";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        r0 = "CP8676_I02";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        r0 = "NX541J";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        r0 = "NX573J";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006c, code lost:
        r0 = "PGN528";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        r0 = "PGN610";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        r0 = "PGN611";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        r0 = "AquaPowerM";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007c, code lost:
        r0 = "RAIJIN";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        r0 = "XT1663";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        r0 = "ComioS1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0088, code lost:
        r0 = "Phantom6";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008c, code lost:
        r0 = "pacificrim";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        r0 = "vernee_M5";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0094, code lost:
        r0 = "panell_dl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0098, code lost:
        r0 = "panell_ds";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009c, code lost:
        r0 = "panell_dt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a0, code lost:
        r0 = "GiONEE_GBL7319";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a4, code lost:
        r0 = "BRAVIA_ATV2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
        r0 = "iris60";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ac, code lost:
        r0 = "Slate_Pro";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b0, code lost:
        r0 = "namath";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b4, code lost:
        r0 = "A10-70F";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b8, code lost:
        r0 = "A10-70L";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bc, code lost:
        r0 = "s905x018";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c0, code lost:
        r0 = "ELUGA_Ray_X";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c4, code lost:
        r0 = "tcl_eu";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c8, code lost:
        r0 = "nicklaus_f";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cc, code lost:
        r0 = "A7000-a";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d0, code lost:
        r0 = "SVP-DTV15";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d4, code lost:
        r0 = "watson";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d8, code lost:
        r0 = "whyred";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dc, code lost:
        r0 = "OnePlus5T";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e0, code lost:
        r0 = "GiONEE_CBL7513";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e4, code lost:
        r0 = "GIONEE_GBL7360";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e8, code lost:
        r0 = "Pixi4-7_3G";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ec, code lost:
        r0 = "taido_row";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f0, code lost:
        r0 = "BLACK-1X";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f4, code lost:
        r0 = "Z12_PRO";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f8, code lost:
        r0 = "ELUGA_A3_Pro";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fc, code lost:
        r0 = "woods_fn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0100, code lost:
        r0 = "C1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0104, code lost:
        r0 = "Q5";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0108, code lost:
        r0 = "V1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x010c, code lost:
        r0 = "V5";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0110, code lost:
        r0 = "b5";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0114, code lost:
        r0 = "mh";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0118, code lost:
        r0 = "JGZ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x011c, code lost:
        r0 = "M04";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0120, code lost:
        r0 = "M5c";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0124, code lost:
        r0 = "MX6";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0128, code lost:
        r0 = "P85";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012c, code lost:
        r0 = "PLE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0130, code lost:
        r0 = "QX1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0134, code lost:
        r0 = "Z80";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0138, code lost:
        r0 = "cv1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x013c, code lost:
        r0 = "cv3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0140, code lost:
        r0 = "deb";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0144, code lost:
        r0 = "flo";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0148, code lost:
        r0 = "1601";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x014c, code lost:
        r0 = "1713";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0150, code lost:
        r0 = "1714";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0154, code lost:
        r0 = "F01H";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0158, code lost:
        r0 = "F01J";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x015c, code lost:
        r0 = "F02H";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0160, code lost:
        r0 = "F03H";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0164, code lost:
        r0 = "F04H";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(java.lang.String r4) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            java.lang.Class<X.3Ux> r4 = X.C65473Ux.class
            monitor-enter(r4)
            boolean r0 = A0c     // Catch:{ all -> 0x027f }
            if (r0 != 0) goto L_0x027b
            int r3 = X.AnonymousClass3C1.A01     // Catch:{ all -> 0x027f }
            r0 = 28
            if (r3 > r0) goto L_0x0275
            java.lang.String r2 = X.AnonymousClass3C1.A02     // Catch:{ all -> 0x027f }
            int r1 = r2.hashCode()     // Catch:{ all -> 0x027f }
            switch(r1) {
                case -1339091551: goto L_0x0021;
                case -1220081023: goto L_0x0024;
                case -1220066608: goto L_0x0027;
                case -1012436106: goto L_0x002a;
                case -64886864: goto L_0x002d;
                case 3415681: goto L_0x0030;
                case 825323514: goto L_0x0033;
                default: goto L_0x0020;
            }     // Catch:{ all -> 0x027f }
        L_0x0020:
            goto L_0x003b
        L_0x0021:
            java.lang.String r0 = "dangal"
            goto L_0x0035
        L_0x0024:
            java.lang.String r0 = "dangalFHD"
            goto L_0x0035
        L_0x0027:
            java.lang.String r0 = "dangalUHD"
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "oneday"
            goto L_0x0035
        L_0x002d:
            java.lang.String r0 = "magnolia"
            goto L_0x0035
        L_0x0030:
            java.lang.String r0 = "once"
            goto L_0x0035
        L_0x0033:
            java.lang.String r0 = "machuca"
        L_0x0035:
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x027f }
            if (r0 != 0) goto L_0x0273
        L_0x003b:
            r0 = 27
            if (r3 > r0) goto L_0x0275
            java.lang.String r0 = "HWEML"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x027f }
            if (r0 != 0) goto L_0x0273
            r0 = 26
            if (r3 > r0) goto L_0x0275
            switch(r1) {
                case -2144781245: goto L_0x0050;
                case -2144781185: goto L_0x0054;
                case -2144781160: goto L_0x0058;
                case -2097309513: goto L_0x005c;
                case -2022874474: goto L_0x0060;
                case -1978993182: goto L_0x0064;
                case -1978990237: goto L_0x0068;
                case -1936688988: goto L_0x006c;
                case -1936688066: goto L_0x0070;
                case -1936688065: goto L_0x0074;
                case -1931988508: goto L_0x0078;
                case -1885099851: goto L_0x007c;
                case -1696512866: goto L_0x0080;
                case -1680025915: goto L_0x0084;
                case -1615810839: goto L_0x0088;
                case -1600724499: goto L_0x008c;
                case -1554255044: goto L_0x0090;
                case -1481772737: goto L_0x0094;
                case -1481772730: goto L_0x0098;
                case -1481772729: goto L_0x009c;
                case -1320080169: goto L_0x00a0;
                case -1217592143: goto L_0x00a4;
                case -1180384755: goto L_0x00a8;
                case -1139198265: goto L_0x00ac;
                case -1052835013: goto L_0x00b0;
                case -993250464: goto L_0x00b4;
                case -993250458: goto L_0x00b8;
                case -965403638: goto L_0x00bc;
                case -958336948: goto L_0x00c0;
                case -879245230: goto L_0x00c4;
                case -842500323: goto L_0x00c8;
                case -821392978: goto L_0x00cc;
                case -797483286: goto L_0x00d0;
                case -794946968: goto L_0x00d4;
                case -788334647: goto L_0x00d8;
                case -782144577: goto L_0x00dc;
                case -575125681: goto L_0x00e0;
                case -521118391: goto L_0x00e4;
                case -430914369: goto L_0x00e8;
                case -290434366: goto L_0x00ec;
                case -282781963: goto L_0x00f0;
                case -277133239: goto L_0x00f4;
                case -173639913: goto L_0x00f8;
                case -56598463: goto L_0x00fc;
                case 2126: goto L_0x0100;
                case 2564: goto L_0x0104;
                case 2715: goto L_0x0108;
                case 2719: goto L_0x010c;
                case 3091: goto L_0x0110;
                case 3483: goto L_0x0114;
                case 73405: goto L_0x0118;
                case 75537: goto L_0x011c;
                case 75739: goto L_0x0120;
                case 76779: goto L_0x0124;
                case 78669: goto L_0x0128;
                case 79305: goto L_0x012c;
                case 80618: goto L_0x0130;
                case 88274: goto L_0x0134;
                case 98846: goto L_0x0138;
                case 98848: goto L_0x013c;
                case 99329: goto L_0x0140;
                case 101481: goto L_0x0144;
                case 1513190: goto L_0x0148;
                case 1514184: goto L_0x014c;
                case 1514185: goto L_0x0150;
                case 2133089: goto L_0x0154;
                case 2133091: goto L_0x0158;
                case 2133120: goto L_0x015c;
                case 2133151: goto L_0x0160;
                case 2133182: goto L_0x0164;
                case 2133184: goto L_0x0168;
                case 2436959: goto L_0x016c;
                case 2463773: goto L_0x0170;
                case 2464648: goto L_0x0174;
                case 2689555: goto L_0x0178;
                case 3154429: goto L_0x017c;
                case 3284551: goto L_0x0180;
                case 3351335: goto L_0x0184;
                case 3386211: goto L_0x0188;
                case 41325051: goto L_0x018c;
                case 51349633: goto L_0x0190;
                case 51350594: goto L_0x0194;
                case 55178625: goto L_0x0198;
                case 61542055: goto L_0x019c;
                case 65355429: goto L_0x01a0;
                case 66214468: goto L_0x01a4;
                case 66214470: goto L_0x01a8;
                case 66214473: goto L_0x01ac;
                case 66215429: goto L_0x01b0;
                case 66215431: goto L_0x01b4;
                case 66215433: goto L_0x01b8;
                case 66216390: goto L_0x01bc;
                case 76402249: goto L_0x01c0;
                case 76404105: goto L_0x01c4;
                case 76404911: goto L_0x01c8;
                case 80963634: goto L_0x01cc;
                case 82882791: goto L_0x01d0;
                case 98715550: goto L_0x01d4;
                case 101370885: goto L_0x01d7;
                case 102844228: goto L_0x01da;
                case 165221241: goto L_0x01dd;
                case 182191441: goto L_0x01e0;
                case 245388979: goto L_0x01e3;
                case 287431619: goto L_0x01e6;
                case 307593612: goto L_0x01e9;
                case 308517133: goto L_0x01ec;
                case 316215098: goto L_0x01ef;
                case 316215116: goto L_0x01f2;
                case 316246811: goto L_0x01f5;
                case 316246818: goto L_0x01f8;
                case 407160593: goto L_0x01fb;
                case 507412548: goto L_0x01fe;
                case 793982701: goto L_0x0201;
                case 794038622: goto L_0x0204;
                case 794040393: goto L_0x0207;
                case 835649806: goto L_0x020a;
                case 917340916: goto L_0x020d;
                case 958008161: goto L_0x0210;
                case 1060579533: goto L_0x0213;
                case 1150207623: goto L_0x0216;
                case 1176899427: goto L_0x0219;
                case 1280332038: goto L_0x021c;
                case 1306947716: goto L_0x021f;
                case 1349174697: goto L_0x0222;
                case 1522194893: goto L_0x0225;
                case 1691543273: goto L_0x0228;
                case 1691544261: goto L_0x022b;
                case 1709443163: goto L_0x022e;
                case 1865889110: goto L_0x0231;
                case 1906253259: goto L_0x0234;
                case 1977196784: goto L_0x0237;
                case 2006372676: goto L_0x023a;
                case 2019281702: goto L_0x023d;
                case 2029784656: goto L_0x0240;
                case 2030379515: goto L_0x0243;
                case 2033393791: goto L_0x0246;
                case 2047190025: goto L_0x0249;
                case 2047252157: goto L_0x024c;
                case 2048319463: goto L_0x024f;
                case 2048855701: goto L_0x0252;
                default: goto L_0x004e;
            }     // Catch:{ all -> 0x027f }
        L_0x004e:
            goto L_0x025a
        L_0x0050:
            java.lang.String r0 = "GIONEE_SWW1609"
            goto L_0x0254
        L_0x0054:
            java.lang.String r0 = "GIONEE_SWW1627"
            goto L_0x0254
        L_0x0058:
            java.lang.String r0 = "GIONEE_SWW1631"
            goto L_0x0254
        L_0x005c:
            java.lang.String r0 = "K50a40"
            goto L_0x0254
        L_0x0060:
            java.lang.String r0 = "CP8676_I02"
            goto L_0x0254
        L_0x0064:
            java.lang.String r0 = "NX541J"
            goto L_0x0254
        L_0x0068:
            java.lang.String r0 = "NX573J"
            goto L_0x0254
        L_0x006c:
            java.lang.String r0 = "PGN528"
            goto L_0x0254
        L_0x0070:
            java.lang.String r0 = "PGN610"
            goto L_0x0254
        L_0x0074:
            java.lang.String r0 = "PGN611"
            goto L_0x0254
        L_0x0078:
            java.lang.String r0 = "AquaPowerM"
            goto L_0x0254
        L_0x007c:
            java.lang.String r0 = "RAIJIN"
            goto L_0x0254
        L_0x0080:
            java.lang.String r0 = "XT1663"
            goto L_0x0254
        L_0x0084:
            java.lang.String r0 = "ComioS1"
            goto L_0x0254
        L_0x0088:
            java.lang.String r0 = "Phantom6"
            goto L_0x0254
        L_0x008c:
            java.lang.String r0 = "pacificrim"
            goto L_0x0254
        L_0x0090:
            java.lang.String r0 = "vernee_M5"
            goto L_0x0254
        L_0x0094:
            java.lang.String r0 = "panell_dl"
            goto L_0x0254
        L_0x0098:
            java.lang.String r0 = "panell_ds"
            goto L_0x0254
        L_0x009c:
            java.lang.String r0 = "panell_dt"
            goto L_0x0254
        L_0x00a0:
            java.lang.String r0 = "GiONEE_GBL7319"
            goto L_0x0254
        L_0x00a4:
            java.lang.String r0 = "BRAVIA_ATV2"
            goto L_0x0254
        L_0x00a8:
            java.lang.String r0 = "iris60"
            goto L_0x0254
        L_0x00ac:
            java.lang.String r0 = "Slate_Pro"
            goto L_0x0254
        L_0x00b0:
            java.lang.String r0 = "namath"
            goto L_0x0254
        L_0x00b4:
            java.lang.String r0 = "A10-70F"
            goto L_0x0254
        L_0x00b8:
            java.lang.String r0 = "A10-70L"
            goto L_0x0254
        L_0x00bc:
            java.lang.String r0 = "s905x018"
            goto L_0x0254
        L_0x00c0:
            java.lang.String r0 = "ELUGA_Ray_X"
            goto L_0x0254
        L_0x00c4:
            java.lang.String r0 = "tcl_eu"
            goto L_0x0254
        L_0x00c8:
            java.lang.String r0 = "nicklaus_f"
            goto L_0x0254
        L_0x00cc:
            java.lang.String r0 = "A7000-a"
            goto L_0x0254
        L_0x00d0:
            java.lang.String r0 = "SVP-DTV15"
            goto L_0x0254
        L_0x00d4:
            java.lang.String r0 = "watson"
            goto L_0x0254
        L_0x00d8:
            java.lang.String r0 = "whyred"
            goto L_0x0254
        L_0x00dc:
            java.lang.String r0 = "OnePlus5T"
            goto L_0x0254
        L_0x00e0:
            java.lang.String r0 = "GiONEE_CBL7513"
            goto L_0x0254
        L_0x00e4:
            java.lang.String r0 = "GIONEE_GBL7360"
            goto L_0x0254
        L_0x00e8:
            java.lang.String r0 = "Pixi4-7_3G"
            goto L_0x0254
        L_0x00ec:
            java.lang.String r0 = "taido_row"
            goto L_0x0254
        L_0x00f0:
            java.lang.String r0 = "BLACK-1X"
            goto L_0x0254
        L_0x00f4:
            java.lang.String r0 = "Z12_PRO"
            goto L_0x0254
        L_0x00f8:
            java.lang.String r0 = "ELUGA_A3_Pro"
            goto L_0x0254
        L_0x00fc:
            java.lang.String r0 = "woods_fn"
            goto L_0x0254
        L_0x0100:
            java.lang.String r0 = "C1"
            goto L_0x0254
        L_0x0104:
            java.lang.String r0 = "Q5"
            goto L_0x0254
        L_0x0108:
            java.lang.String r0 = "V1"
            goto L_0x0254
        L_0x010c:
            java.lang.String r0 = "V5"
            goto L_0x0254
        L_0x0110:
            java.lang.String r0 = "b5"
            goto L_0x0254
        L_0x0114:
            java.lang.String r0 = "mh"
            goto L_0x0254
        L_0x0118:
            java.lang.String r0 = "JGZ"
            goto L_0x0254
        L_0x011c:
            java.lang.String r0 = "M04"
            goto L_0x0254
        L_0x0120:
            java.lang.String r0 = "M5c"
            goto L_0x0254
        L_0x0124:
            java.lang.String r0 = "MX6"
            goto L_0x0254
        L_0x0128:
            java.lang.String r0 = "P85"
            goto L_0x0254
        L_0x012c:
            java.lang.String r0 = "PLE"
            goto L_0x0254
        L_0x0130:
            java.lang.String r0 = "QX1"
            goto L_0x0254
        L_0x0134:
            java.lang.String r0 = "Z80"
            goto L_0x0254
        L_0x0138:
            java.lang.String r0 = "cv1"
            goto L_0x0254
        L_0x013c:
            java.lang.String r0 = "cv3"
            goto L_0x0254
        L_0x0140:
            java.lang.String r0 = "deb"
            goto L_0x0254
        L_0x0144:
            java.lang.String r0 = "flo"
            goto L_0x0254
        L_0x0148:
            java.lang.String r0 = "1601"
            goto L_0x0254
        L_0x014c:
            java.lang.String r0 = "1713"
            goto L_0x0254
        L_0x0150:
            java.lang.String r0 = "1714"
            goto L_0x0254
        L_0x0154:
            java.lang.String r0 = "F01H"
            goto L_0x0254
        L_0x0158:
            java.lang.String r0 = "F01J"
            goto L_0x0254
        L_0x015c:
            java.lang.String r0 = "F02H"
            goto L_0x0254
        L_0x0160:
            java.lang.String r0 = "F03H"
            goto L_0x0254
        L_0x0164:
            java.lang.String r0 = "F04H"
            goto L_0x0254
        L_0x0168:
            java.lang.String r0 = "F04J"
            goto L_0x0254
        L_0x016c:
            java.lang.String r0 = "P681"
            goto L_0x0254
        L_0x0170:
            java.lang.String r0 = "Q350"
            goto L_0x0254
        L_0x0174:
            java.lang.String r0 = "Q427"
            goto L_0x0254
        L_0x0178:
            java.lang.String r0 = "XE2X"
            goto L_0x0254
        L_0x017c:
            java.lang.String r0 = "fugu"
            goto L_0x0254
        L_0x0180:
            java.lang.String r0 = "kate"
            goto L_0x0254
        L_0x0184:
            java.lang.String r0 = "mido"
            goto L_0x0254
        L_0x0188:
            java.lang.String r0 = "p212"
            goto L_0x0254
        L_0x018c:
            java.lang.String r0 = "MEIZU_M5"
            goto L_0x0254
        L_0x0190:
            java.lang.String r0 = "601LV"
            goto L_0x0254
        L_0x0194:
            java.lang.String r0 = "602LV"
            goto L_0x0254
        L_0x0198:
            java.lang.String r0 = "Aura_Note_2"
            goto L_0x0254
        L_0x019c:
            java.lang.String r0 = "A1601"
            goto L_0x0254
        L_0x01a0:
            java.lang.String r0 = "E5643"
            goto L_0x0254
        L_0x01a4:
            java.lang.String r0 = "F3111"
            goto L_0x0254
        L_0x01a8:
            java.lang.String r0 = "F3113"
            goto L_0x0254
        L_0x01ac:
            java.lang.String r0 = "F3116"
            goto L_0x0254
        L_0x01b0:
            java.lang.String r0 = "F3211"
            goto L_0x0254
        L_0x01b4:
            java.lang.String r0 = "F3213"
            goto L_0x0254
        L_0x01b8:
            java.lang.String r0 = "F3215"
            goto L_0x0254
        L_0x01bc:
            java.lang.String r0 = "F3311"
            goto L_0x0254
        L_0x01c0:
            java.lang.String r0 = "PRO7S"
            goto L_0x0254
        L_0x01c4:
            java.lang.String r0 = "Q4260"
            goto L_0x0254
        L_0x01c8:
            java.lang.String r0 = "Q4310"
            goto L_0x0254
        L_0x01cc:
            java.lang.String r0 = "V23GB"
            goto L_0x0254
        L_0x01d0:
            java.lang.String r0 = "X3_HK"
            goto L_0x0254
        L_0x01d4:
            java.lang.String r0 = "i9031"
            goto L_0x0254
        L_0x01d7:
            java.lang.String r0 = "l5460"
            goto L_0x0254
        L_0x01da:
            java.lang.String r0 = "le_x6"
            goto L_0x0254
        L_0x01dd:
            java.lang.String r0 = "A2016a40"
            goto L_0x0254
        L_0x01e0:
            java.lang.String r0 = "CPY83_I00"
            goto L_0x0254
        L_0x01e3:
            java.lang.String r0 = "marino_f"
            goto L_0x0254
        L_0x01e6:
            java.lang.String r0 = "griffin"
            goto L_0x0254
        L_0x01e9:
            java.lang.String r0 = "A7010a48"
            goto L_0x0254
        L_0x01ec:
            java.lang.String r0 = "A7020a48"
            goto L_0x0254
        L_0x01ef:
            java.lang.String r0 = "TB3-730F"
            goto L_0x0254
        L_0x01f2:
            java.lang.String r0 = "TB3-730X"
            goto L_0x0254
        L_0x01f5:
            java.lang.String r0 = "TB3-850F"
            goto L_0x0254
        L_0x01f8:
            java.lang.String r0 = "TB3-850M"
            goto L_0x0254
        L_0x01fb:
            java.lang.String r0 = "Pixi5-10_4G"
            goto L_0x0254
        L_0x01fe:
            java.lang.String r0 = "QM16XE_U"
            goto L_0x0254
        L_0x0201:
            java.lang.String r0 = "GIONEE_WBL5708"
            goto L_0x0254
        L_0x0204:
            java.lang.String r0 = "GIONEE_WBL7365"
            goto L_0x0254
        L_0x0207:
            java.lang.String r0 = "GIONEE_WBL7519"
            goto L_0x0254
        L_0x020a:
            java.lang.String r0 = "manning"
            goto L_0x0254
        L_0x020d:
            java.lang.String r0 = "A7000plus"
            goto L_0x0254
        L_0x0210:
            java.lang.String r0 = "j2xlteins"
            goto L_0x0254
        L_0x0213:
            java.lang.String r0 = "panell_d"
            goto L_0x0254
        L_0x0216:
            java.lang.String r0 = "LS-5017"
            goto L_0x0254
        L_0x0219:
            java.lang.String r0 = "itel_S41"
            goto L_0x0254
        L_0x021c:
            java.lang.String r0 = "hwALE-H"
            goto L_0x0254
        L_0x021f:
            java.lang.String r0 = "EverStar_S"
            goto L_0x0254
        L_0x0222:
            java.lang.String r0 = "htc_e56ml_dtul"
            goto L_0x0254
        L_0x0225:
            java.lang.String r0 = "woods_f"
            goto L_0x0254
        L_0x0228:
            java.lang.String r0 = "CPH1609"
            goto L_0x0254
        L_0x022b:
            java.lang.String r0 = "CPH1715"
            goto L_0x0254
        L_0x022e:
            java.lang.String r0 = "iball8735_9806"
            goto L_0x0254
        L_0x0231:
            java.lang.String r0 = "santoni"
            goto L_0x0254
        L_0x0234:
            java.lang.String r0 = "PB2-670M"
            goto L_0x0254
        L_0x0237:
            java.lang.String r0 = "Infinix-X572"
            goto L_0x0254
        L_0x023a:
            java.lang.String r0 = "BRAVIA_ATV3_4K"
            goto L_0x0254
        L_0x023d:
            java.lang.String r0 = "DM-01K"
            goto L_0x0254
        L_0x0240:
            java.lang.String r0 = "HWBLN-H"
            goto L_0x0254
        L_0x0243:
            java.lang.String r0 = "HWCAM-H"
            goto L_0x0254
        L_0x0246:
            java.lang.String r0 = "ASUS_X00AD_2"
            goto L_0x0254
        L_0x0249:
            java.lang.String r0 = "ELUGA_Note"
            goto L_0x0254
        L_0x024c:
            java.lang.String r0 = "ELUGA_Prim"
            goto L_0x0254
        L_0x024f:
            java.lang.String r0 = "HWVNS-H"
            goto L_0x0254
        L_0x0252:
            java.lang.String r0 = "HWWAS-H"
        L_0x0254:
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x027f }
            if (r0 != 0) goto L_0x0273
        L_0x025a:
            java.lang.String r1 = X.AnonymousClass3C1.A05     // Catch:{ all -> 0x027f }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x027f }
            switch(r0) {
                case -594534941: goto L_0x0264;
                case 2006354: goto L_0x0267;
                case 2006367: goto L_0x026a;
                default: goto L_0x0263;
            }     // Catch:{ all -> 0x027f }
        L_0x0263:
            goto L_0x0275
        L_0x0264:
            java.lang.String r0 = "JSN-L21"
            goto L_0x026c
        L_0x0267:
            java.lang.String r0 = "AFTA"
            goto L_0x026c
        L_0x026a:
            java.lang.String r0 = "AFTN"
        L_0x026c:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x027f }
            if (r0 != 0) goto L_0x0273
            goto L_0x0275
        L_0x0273:
            r0 = 1
            goto L_0x0276
        L_0x0275:
            r0 = 0
        L_0x0276:
            A0b = r0     // Catch:{ all -> 0x027f }
            r0 = 1
            A0c = r0     // Catch:{ all -> 0x027f }
        L_0x027b:
            monitor-exit(r4)     // Catch:{ all -> 0x027f }
            boolean r0 = A0b
            return r0
        L_0x027f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x027f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65473Ux.A06(java.lang.String):boolean");
    }

    public void A07() {
        try {
            super.A07();
        } finally {
            Surface surface = this.A0K;
            if (surface != null) {
                if (this.A0L == surface) {
                    this.A0L = null;
                }
                surface.release();
                this.A0K = null;
            }
        }
    }

    public void A08() {
        this.A0A = -1;
        this.A08 = -1;
        this.A01 = -1.0f;
        this.A09 = -1;
        A0X();
        this.A0Q = false;
        this.A0Y.A02();
        this.A0N = null;
        try {
            super.A08();
            AnonymousClass4GS r3 = this.A0Z;
            C85484Oq r2 = this.A0K;
            synchronized (r2) {
            }
            C13700nu.A0O(r3.A00, r3, r2, 12);
        } catch (Throwable th) {
            AnonymousClass4GS r32 = this.A0Z;
            C85484Oq r22 = this.A0K;
            synchronized (r22) {
                C13700nu.A0O(r32.A00, r32, r22, 12);
                throw th;
            }
        }
    }

    public void A09(long j2, boolean z2) {
        super.A09(j2, z2);
        A0X();
        C89444cB r2 = this.A0Y;
        r2.A04 = 0;
        r2.A05 = -1;
        r2.A07 = -1;
        this.A0H = -9223372036854775807L;
        this.A0F = -9223372036854775807L;
        this.A03 = 0;
        if (z2) {
            long j3 = this.A0W;
            this.A0G = j3 > 0 ? SystemClock.elapsedRealtime() + j3 : -9223372036854775807L;
            return;
        }
        this.A0G = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r5.A0C != 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(boolean r6, boolean r7) {
        /*
            r5 = this;
            super.A0A(r6, r7)
            X.4bE r0 = r5.A04
            boolean r2 = r0.A00
            r4 = 0
            if (r2 == 0) goto L_0x000f
            int r1 = r5.A0C
            r0 = 0
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            X.C90524eJ.A04(r0)
            boolean r0 = r5.A0U
            if (r0 == r2) goto L_0x001c
            r5.A0U = r2
            r5.A0E()
        L_0x001c:
            X.4GS r3 = r5.A0Z
            X.4Oq r2 = r5.A0K
            android.os.Handler r1 = r3.A00
            r0 = 13
            X.C13700nu.A0O(r1, r3, r2, r0)
            X.4cB r0 = r5.A0Y
            r0.A03()
            r5.A0R = r7
            r5.A0S = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65473Ux.A0A(boolean, boolean):void");
    }

    public C86944Ut A0C(AnonymousClass4G5 r7) {
        C86944Ut A0C2 = super.A0C(r7);
        AnonymousClass4GS r4 = this.A0Z;
        r4.A00.post(new RunnableRunnableShape3S0300000_I1(r4, r7.A00, A0C2, 2));
        return A0C2;
    }

    public void A0G() {
        super.A0G();
        this.A02 = 0;
    }

    public void A0N(long j2) {
        super.A0N(j2);
        if (!this.A0U) {
            this.A02--;
        }
    }

    public void A0Q(AnonymousClass3UX r9) {
        if (this.A0O) {
            ByteBuffer byteBuffer = r9.A02;
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s2 = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s2 == 60 && s3 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    AnonymousClass5T3 r2 = this.A0O;
                    Bundle A0D2 = C13690nt.A0D();
                    A0D2.putByteArray("hdr10-plus-info", bArr);
                    r2.AeH(A0D2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r9.A00 != 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0248, code lost:
        if (r4 < 50000) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if (r10.A07[(int) ((r0 - 1) % 15)] != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013c, code lost:
        if (r9 > 100000) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0146, code lost:
        if (X.AnonymousClass3C1.A01 >= 21) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0165, code lost:
        if (r11 != false) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0U(X.C32491gT r24, X.AnonymousClass5T3 r25, java.nio.ByteBuffer r26, int r27, int r28, int r29, long r30, long r32, long r34, boolean r36, boolean r37) {
        /*
            r23 = this;
            r14 = r25
            r12 = r30
            r4 = r34
            r6 = r23
            long r0 = r6.A0F
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x0015
            r6.A0F = r12
        L_0x0015:
            long r0 = r6.A0H
            int r2 = (r34 > r0 ? 1 : (r34 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0081
            X.4cB r7 = r6.A0Y
            long r0 = r7.A07
            r8 = -1
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x002b
            r7.A05 = r0
            long r0 = r7.A08
            r7.A06 = r0
        L_0x002b:
            long r0 = r7.A04
            r2 = 1
            long r0 = r0 + r2
            r7.A04 = r0
            X.4Rg r8 = r7.A0E
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r34 * r0
            X.4V5 r9 = r8.A03
            r9.A01(r2)
            long r0 = r9.A03
            r15 = 15
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x004a
            int r0 = r9.A00
            r1 = 1
            if (r0 == 0) goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            r9 = 0
            if (r1 == 0) goto L_0x0094
            r8.A04 = r9
        L_0x0050:
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x006a
            X.4V5 r0 = r8.A02
            long r10 = r0.A03
            r15 = 15
            int r1 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x006a
            int r1 = r0.A00
            if (r1 != 0) goto L_0x006a
            X.4V5 r1 = r8.A03
            r8.A03 = r0
            r8.A02 = r1
            r8.A04 = r9
        L_0x006a:
            r8.A01 = r2
            X.4V5 r2 = r8.A03
            long r0 = r2.A03
            r10 = 15
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x008f
            int r0 = r2.A00
            if (r0 != 0) goto L_0x008f
        L_0x007a:
            r8.A00 = r9
            r7.A05()
            r6.A0H = r4
        L_0x0081:
            long r7 = r6.A0D
            r16 = 1
            r15 = r27
            if (r36 == 0) goto L_0x00ca
            if (r37 != 0) goto L_0x00ca
            r6.A0c(r14, r15)
            return r16
        L_0x008f:
            int r0 = r8.A00
            int r9 = r0 + 1
            goto L_0x007a
        L_0x0094:
            long r0 = r8.A01
            int r10 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r10 == 0) goto L_0x0050
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x00b7
            X.4V5 r10 = r8.A02
            long r0 = r10.A03
            r15 = 0
            int r11 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x00c3
            boolean[] r15 = r10.A07
            r16 = 1
            long r0 = r0 - r16
            r16 = 15
            long r0 = r0 % r16
            int r11 = (int) r0
            boolean r0 = r15[r11]
            if (r0 == 0) goto L_0x00c3
        L_0x00b7:
            X.4V5 r0 = r8.A02
            r0.A00()
            X.4V5 r10 = r8.A02
            long r0 = r8.A01
            r10.A01(r0)
        L_0x00c3:
            r0 = 1
            r8.A04 = r0
            r10.A01(r2)
            goto L_0x0050
        L_0x00ca:
            float r0 = r6.A01
            double r2 = (double) r0
            int r1 = r6.A01
            r0 = 2
            r22 = 0
            boolean r11 = X.AnonymousClass000.A1R(r1, r0)
            long r9 = android.os.SystemClock.elapsedRealtime()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r20
            long r4 = r34 - r30
            double r0 = (double) r4
            double r0 = r0 / r2
            long r4 = (long) r0
            if (r11 == 0) goto L_0x00e8
            long r0 = r9 - r32
            long r4 = r4 - r0
        L_0x00e8:
            android.view.Surface r1 = r6.A0L
            android.view.Surface r0 = r6.A0K
            if (r1 != r0) goto L_0x0110
            r1 = -30000(0xffffffffffff8ad0, double:NaN)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0229
            r6.A0c(r14, r15)
            X.4Oq r2 = r6.A0K
            long r0 = r2.A0A
            long r0 = r0 + r4
            r2.A0A = r0
            int r0 = r2.A09
            int r0 = r0 + 1
            r2.A09 = r0
            long r0 = r6.A0J
            long r0 = r0 + r4
            r6.A0J = r0
            int r0 = r6.A0D
            int r0 = r0 + 1
            r6.A0D = r0
            return r16
        L_0x0110:
            long r0 = r6.A0I
            long r9 = r9 - r0
            boolean r0 = r6.A0S
            if (r0 != 0) goto L_0x02a7
            if (r11 != 0) goto L_0x011d
            boolean r0 = r6.A0R
            if (r0 == 0) goto L_0x02ad
        L_0x011d:
            r3 = 1
        L_0x011e:
            long r0 = r6.A0G
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x0165
            int r0 = (r30 > r7 ? 1 : (r30 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0165
            if (r3 != 0) goto L_0x013e
            if (r11 == 0) goto L_0x0229
            r1 = -30000(0xffffffffffff8ad0, double:NaN)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0167
            r1 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0167
        L_0x013e:
            r1 = 21
            long r2 = java.lang.System.nanoTime()
            int r0 = X.AnonymousClass3C1.A01
            if (r0 < r1) goto L_0x027c
        L_0x0148:
            r6.A0d(r14, r15, r2)
        L_0x014b:
            X.4Oq r2 = r6.A0K
            long r0 = r2.A0A
            long r0 = r0 + r4
            r2.A0A = r0
            int r0 = r2.A09
            int r0 = r0 + 1
            r2.A09 = r0
            long r0 = r6.A0J
            long r0 = r0 + r4
            r6.A0J = r0
            int r0 = r6.A0D
            int r0 = r0 + 1
            r6.A0D = r0
            r0 = 1
            return r0
        L_0x0165:
            if (r11 == 0) goto L_0x0229
        L_0x0167:
            long r0 = r6.A0F
            int r2 = (r30 > r0 ? 1 : (r30 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0229
            long r16 = java.lang.System.nanoTime()
            long r4 = r4 * r20
            long r4 = r4 + r16
            X.4cB r11 = r6.A0Y
            long r9 = r11.A05
            r1 = -1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01bd
            X.4Rg r0 = r11.A0E
            X.4V5 r2 = r0.A03
            long r0 = r2.A03
            r7 = 15
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x01bd
            int r0 = r2.A00
            if (r0 != 0) goto L_0x01bd
            long r0 = r2.A05
            r7 = 0
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x019a
            long r7 = r2.A06
            long r7 = r7 / r0
        L_0x019a:
            long r2 = r11.A06
            long r0 = r11.A04
            long r0 = r0 - r9
            long r7 = r7 * r0
            float r1 = (float) r7
            float r0 = r11.A01
            float r1 = r1 / r0
            long r0 = (long) r1
            long r2 = r2 + r0
            long r0 = r4 - r2
            long r9 = java.lang.Math.abs(r0)
            r7 = 20000000(0x1312d00, double:9.881313E-317)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x01be
            r0 = 0
            r11.A04 = r0
            r0 = -1
            r11.A05 = r0
            r11.A07 = r0
        L_0x01bd:
            r2 = r4
        L_0x01be:
            long r0 = r11.A04
            r11.A07 = r0
            r11.A08 = r2
            X.4gq r5 = r11.A0G
            if (r5 == 0) goto L_0x01ed
            long r0 = r11.A09
            int r4 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r4 == 0) goto L_0x01ed
            long r4 = r5.A04
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x01ed
            long r0 = r11.A09
            long r7 = r2 - r4
            long r7 = r7 / r0
            long r7 = r7 * r0
            long r4 = r4 + r7
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x025d
            long r9 = r4 - r0
        L_0x01e1:
            long r7 = r4 - r2
            long r2 = r2 - r9
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x01e9
            r4 = r9
        L_0x01e9:
            long r0 = r11.A0A
            long r4 = r4 - r0
            r2 = r4
        L_0x01ed:
            long r4 = r2 - r16
            long r4 = r4 / r20
            long r0 = r6.A0G
            int r7 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            boolean r9 = X.AnonymousClass000.A1O(r7)
            r7 = -500000(0xfffffffffff85ee0, double:NaN)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x022e
            if (r37 != 0) goto L_0x022e
            X.5Sm r7 = r6.A05
            long r0 = r6.A03
            long r12 = r30 - r0
            int r7 = r7.Afw(r12)
            if (r7 == 0) goto L_0x022e
            X.4Oq r2 = r6.A0K
            int r0 = r2.A03
            int r0 = r0 + 1
            r2.A03 = r0
            int r1 = r6.A02
            int r1 = r1 + r7
            if (r9 == 0) goto L_0x022a
            int r0 = r2.A08
            int r0 = r0 + r1
            r2.A08 = r0
        L_0x0220:
            boolean r0 = r6.A0R()
            if (r0 == 0) goto L_0x0229
            r6.A0L()
        L_0x0229:
            return r22
        L_0x022a:
            r6.A0b(r1)
            goto L_0x0220
        L_0x022e:
            r7 = -30000(0xffffffffffff8ad0, double:NaN)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x023d
            if (r37 != 0) goto L_0x023d
            if (r9 == 0) goto L_0x0261
            r6.A0c(r14, r15)
            goto L_0x014b
        L_0x023d:
            int r1 = X.AnonymousClass3C1.A01
            r0 = 21
            if (r1 < r0) goto L_0x024c
            r7 = 50000(0xc350, double:2.47033E-319)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0229
            goto L_0x0148
        L_0x024c:
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0229
            r1 = 11000(0x2af8, double:5.4347E-320)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x027c
            r2 = 10000(0x2710, double:4.9407E-320)
            long r0 = r4 - r2
            goto L_0x0277
        L_0x025d:
            long r0 = r0 + r4
            r9 = r4
            r4 = r0
            goto L_0x01e1
        L_0x0261:
            java.lang.String r0 = "dropVideoBuffer"
            X.C90224dm.A02(r0)
            X.4pN r14 = (X.C97084pN) r14
            android.media.MediaCodec r1 = r14.A02
            r0 = 0
            r1.releaseOutputBuffer(r15, r0)
            X.C90224dm.A00()
            r0 = 1
            r6.A0b(r0)
            goto L_0x014b
        L_0x0277:
            long r0 = r0 / r20
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x02b0 }
        L_0x027c:
            r6.A0Z()
            java.lang.String r0 = "releaseOutputBuffer"
            X.C90224dm.A02(r0)
            r1 = 1
            X.4pN r14 = (X.C97084pN) r14
            android.media.MediaCodec r0 = r14.A02
            r0.releaseOutputBuffer(r15, r1)
            X.C90224dm.A00()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 * r20
            r6.A0I = r0
            X.4Oq r1 = r6.A0K
            int r0 = r1.A06
            int r0 = r0 + 1
            r1.A06 = r0
            r0 = 0
            r6.A03 = r0
            r6.A0W()
            goto L_0x014b
        L_0x02a7:
            boolean r0 = r6.A0T
            if (r0 != 0) goto L_0x02ad
            goto L_0x011d
        L_0x02ad:
            r3 = 0
            goto L_0x011e
        L_0x02b0:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65473Ux.A0U(X.1gT, X.5T3, java.nio.ByteBuffer, int, int, int, long, long, long, boolean, boolean):boolean");
    }

    public void A0W() {
        this.A0S = true;
        if (!this.A0T) {
            this.A0T = true;
            AnonymousClass4GS r3 = this.A0Z;
            C13700nu.A0O(r3.A00, r3, this.A0L, 11);
            this.A0Q = true;
        }
    }

    public final void A0X() {
        AnonymousClass5T3 r1;
        this.A0T = false;
        if (AnonymousClass3C1.A01 >= 23 && this.A0U && (r1 = this.A0O) != null) {
            this.A0N = new C92014gr(r1, this);
        }
    }

    public final void A0Y() {
        int i2 = this.A07;
        if (i2 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.A0E;
            AnonymousClass4GS r4 = this.A0Z;
            r4.A00.post(new RunnableRunnableShape0S0101100_I1(r4, i2, 0, j2));
            this.A07 = 0;
            this.A0E = elapsedRealtime;
        }
    }

    public final void A0Z() {
        int i2 = this.A06;
        if (i2 != -1 || this.A04 != -1) {
            if (this.A0A != i2 || this.A08 != this.A04 || this.A09 != this.A05 || this.A01 != this.A00) {
                AnonymousClass4GS r2 = this.A0Z;
                int i3 = this.A04;
                int i4 = this.A05;
                r2.A00.post(new AnonymousClass562(r2, this.A00, i2, i3, i4));
                this.A0A = this.A06;
                this.A08 = this.A04;
                this.A09 = this.A05;
                this.A01 = this.A00;
            }
        }
    }

    public final void A0a() {
        int i2 = this.A0A;
        if (i2 != -1 || this.A08 != -1) {
            AnonymousClass4GS r2 = this.A0Z;
            int i3 = this.A08;
            int i4 = this.A09;
            r2.A00.post(new AnonymousClass562(r2, this.A01, i2, i3, i4));
        }
    }

    public void A0b(int i2) {
        C85484Oq r3 = this.A0K;
        r3.A02 += i2;
        int i3 = this.A07 + i2;
        this.A07 = i3;
        int i4 = this.A03 + i2;
        this.A03 = i4;
        r3.A05 = Math.max(i4, r3.A05);
        int i5 = this.A0V;
        if (i5 > 0 && i3 >= i5) {
            A0Y();
        }
    }

    public void A0c(AnonymousClass5T3 r3, int i2) {
        C90224dm.A02("skipVideoBuffer");
        ((C97084pN) r3).A02.releaseOutputBuffer(i2, false);
        C90224dm.A00();
        this.A0K.A08++;
    }

    public void A0d(AnonymousClass5T3 r5, int i2, long j2) {
        A0Z();
        C90224dm.A02("releaseOutputBuffer");
        r5.Abj(i2, j2);
        C90224dm.A00();
        this.A0I = SystemClock.elapsedRealtime() * 1000;
        this.A0K.A06++;
        this.A03 = 0;
        A0W();
    }

    public final boolean A0e(C90714eg r3) {
        if (AnonymousClass3C1.A01 < 23 || this.A0U || A06(r3.A03)) {
            return false;
        }
        return !r3.A06 || C63973Mg.A01(this.A0X);
    }

    public boolean AJY() {
        Surface surface;
        if (!super.AJY() || (!this.A0T && (((surface = this.A0K) == null || this.A0L != surface) && this.A0O != null && !this.A0U))) {
            long j2 = this.A0G;
            if (j2 != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() >= j2) {
                    this.A0G = -9223372036854775807L;
                }
            }
            return false;
        }
        this.A0G = -9223372036854775807L;
        return true;
    }

    public void AeM(float f2, float f3) {
        super.AeM(f2, f3);
        C89444cB r2 = this.A0Y;
        r2.A01 = f2;
        r2.A04 = 0;
        r2.A05 = -1;
        r2.A07 = -1;
        r2.A06(false);
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }
}

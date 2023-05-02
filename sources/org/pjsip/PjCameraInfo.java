package org.pjsip;

import X.AnonymousClass03H;
import X.C17380uz;
import X.C18390wc;
import X.C37841pp;
import android.os.Build;
import android.util.Pair;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class PjCameraInfo {
    public static final Comparator CAMERA_SIZE_COMPARATOR = new IDxComparatorShape19S0000000_2_I0(43);
    public static final Pair PAIR_1280_720 = new Pair(1280, 720);
    public static final C17380uz ZOOMING_OPPO_MODELS;
    public static final C17380uz ZOOMING_VIVO_MODELS;
    public final int facing;
    public final int orient;
    public final int[] supportedFormat;
    public final int[] supportedSize;

    static {
        C18390wc r1 = new C18390wc();
        r1.add((Object) "CPH2023");
        r1.add((Object) "CPH2025");
        r1.add((Object) "CPH2363");
        ZOOMING_OPPO_MODELS = r1.build();
        C18390wc r12 = new C18390wc();
        r12.add((Object) "V2027");
        r12.add((Object) "V2029");
        r12.add((Object) "V2130");
        ZOOMING_VIVO_MODELS = r12.build();
    }

    public PjCameraInfo(int i2, int i3, int[] iArr, int[] iArr2) {
        this.facing = i2;
        this.orient = i3;
        this.supportedSize = iArr;
        this.supportedFormat = iArr2;
    }

    public static int[] SizeListToIntArray(List list) {
        int[] iArr = new int[(list.size() << 1)];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C37841pp r2 = (C37841pp) it.next();
            int i3 = i2 + 1;
            iArr[i2] = r2.A01;
            i2 = i3 + 1;
            iArr[i3] = r2.A00;
        }
        return iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X.1pp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.1pp} */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018c, code lost:
        if (r12 >= 0) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018e, code lost:
        r5.addAll(r6);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.pjsip.PjCameraInfo createFromRawInfo(X.C51962ca r13, X.AnonymousClass1OL r14) {
        /*
            int[] r1 = r13.A05
            int r0 = r1.length
            int[] r9 = java.util.Arrays.copyOf(r1, r0)
            int[] r4 = getEncoderSupportedColorFormats(r14)
            r8 = 0
            r3 = 0
            r5 = 0
        L_0x000e:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x004d
            if (r5 != 0) goto L_0x004d
            r2 = r4[r3]
            r1 = 0
        L_0x0016:
            int r0 = r9.length
            if (r1 >= r0) goto L_0x0047
            r0 = r9[r1]
            if (r0 != r2) goto L_0x004a
            r0 = r9[r8]
            r9[r1] = r0
            r9[r8] = r2
            java.lang.String r0 = "voip/video/PJCameraInfo preferred formats "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = java.util.Arrays.toString(r4)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " is available ."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = 1
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x004a:
            int r1 = r1 + 1
            goto L_0x0016
        L_0x004d:
            boolean r7 = r13.A04
            java.util.List r0 = r13.A03
            if (r0 == 0) goto L_0x0192
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0192
            r11 = 640(0x280, float:8.97E-43)
            r5 = 480(0x1e0, float:6.73E-43)
            boolean r0 = X.AnonymousClass49O.A00
            if (r0 == 0) goto L_0x006a
            r11 = 320(0x140, float:4.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
        L_0x006a:
            android.content.SharedPreferences r1 = r14.A01()
            java.lang.String r0 = "disable_device_specific_camera_size"
            boolean r0 = r1.getBoolean(r0, r8)
            if (r0 == 0) goto L_0x00fd
            r10 = 0
        L_0x0077:
            android.content.SharedPreferences r0 = r14.A01()
            if (r7 == 0) goto L_0x00d7
            java.lang.String r2 = "video_call_front_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0093
            android.content.SharedPreferences r1 = r14.A01()
            java.lang.String r0 = "video_call_front_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00a6
        L_0x0093:
            android.content.SharedPreferences r0 = r14.A01()
            int r11 = r0.getInt(r2, r11)
            android.content.SharedPreferences r1 = r14.A01()
            java.lang.String r0 = "video_call_front_camera_height"
        L_0x00a2:
            int r5 = r1.getInt(r0, r5)
        L_0x00a6:
            X.1pp r4 = r13.A02
            if (r4 == 0) goto L_0x00b8
            int r1 = r4.A00
            int r0 = r4.A01
            int r1 = r1 * r0
            r0 = 307200(0x4b000, float:4.30479E-40)
            if (r1 > r0) goto L_0x00b8
            java.lang.Object r4 = r6.get(r8)
        L_0x00b8:
            java.util.Comparator r0 = CAMERA_SIZE_COMPARATOR
            java.util.Collections.sort(r6, r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x00c1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r2.next()
            X.1pp r0 = (X.C37841pp) r0
            int r1 = r0.A01
            r0 = 720(0x2d0, float:1.009E-42)
            if (r1 != r0) goto L_0x00c1
            r2.remove()
            goto L_0x00c1
        L_0x00d7:
            java.lang.String r2 = "video_call_back_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x00ed
            android.content.SharedPreferences r1 = r14.A01()
            java.lang.String r0 = "video_call_back_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00a6
        L_0x00ed:
            android.content.SharedPreferences r0 = r14.A01()
            int r11 = r0.getInt(r2, r11)
            android.content.SharedPreferences r1 = r14.A01()
            java.lang.String r0 = "video_call_back_camera_height"
            goto L_0x00a2
        L_0x00fd:
            android.util.Pair r10 = deviceSpecificSize(r7)
            if (r10 == 0) goto L_0x0077
            java.lang.Object r0 = r10.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            java.lang.Object r0 = r10.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            goto L_0x0077
        L_0x0115:
            r3 = -1
            r12 = -1
            r2 = 0
        L_0x0118:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x014b
            java.lang.Object r1 = r6.get(r2)
            X.1pp r1 = (X.C37841pp) r1
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x012b
            r12 = r2
        L_0x012b:
            int r0 = r1.A01
            if (r0 != r11) goto L_0x0148
            if (r3 < 0) goto L_0x0147
            int r0 = r1.A00
            int r0 = r0 - r5
            int r1 = java.lang.Math.abs(r0)
            java.lang.Object r0 = r6.get(r3)
            X.1pp r0 = (X.C37841pp) r0
            int r0 = r0.A00
            int r0 = r0 - r5
            int r0 = java.lang.Math.abs(r0)
            if (r1 >= r0) goto L_0x0148
        L_0x0147:
            r3 = r2
        L_0x0148:
            int r2 = r2 + 1
            goto L_0x0118
        L_0x014b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r3 < 0) goto L_0x018c
            java.lang.Object r4 = r6.get(r3)
        L_0x0156:
            r5.add(r4)
        L_0x0159:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x019f
            if (r10 != 0) goto L_0x019f
            r4 = 0
        L_0x0162:
            int r0 = r6.size()
            if (r4 >= r0) goto L_0x019f
            java.lang.Object r3 = r6.get(r4)
            X.1pp r3 = (X.C37841pp) r3
            int r2 = r3.A01
            java.lang.Object r0 = r5.get(r8)
            X.1pp r0 = (X.C37841pp) r0
            int r0 = r0.A00
            int r2 = r2 * r0
            int r1 = r3.A00
            java.lang.Object r0 = r5.get(r8)
            X.1pp r0 = (X.C37841pp) r0
            int r0 = r0.A01
            int r1 = r1 * r0
            if (r2 != r1) goto L_0x0189
            r5.add(r3)
        L_0x0189:
            int r4 = r4 + 1
            goto L_0x0162
        L_0x018c:
            if (r12 >= 0) goto L_0x0156
            r5.addAll(r6)
            goto L_0x0159
        L_0x0192:
            java.lang.String r0 = "voip/video/PJCameraInfo previewSizes is null, use 640x480 by default."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {640, 480} // fill-array
            goto L_0x01a3
        L_0x019f:
            int[] r2 = SizeListToIntArray(r5)
        L_0x01a3:
            int r1 = r13.A01
            org.pjsip.PjCameraInfo r0 = new org.pjsip.PjCameraInfo
            r0.<init>(r7, r1, r2, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCameraInfo.createFromRawInfo(X.2ca, X.1OL):org.pjsip.PjCameraInfo");
    }

    public static Pair deviceSpecificSize(boolean z2) {
        String str = Build.MANUFACTURER;
        if (!"asus".equalsIgnoreCase(str)) {
            if (!"samsung".equalsIgnoreCase(str)) {
                if (!z2) {
                    return null;
                }
                String str2 = Build.MODEL;
                if (!"Pixel 6".equals(str2) && !"Pixel 6 Pro".equals(str2) && ((!"OPPO".equals(str) || !ZOOMING_OPPO_MODELS.contains(str2)) && (!"vivo".equals(str) || !ZOOMING_VIVO_MODELS.contains(str2)))) {
                    return null;
                }
            }
            return PAIR_1280_720;
        } else if (!z2 || Build.VERSION.SDK_INT != 19) {
            return null;
        } else {
            return new Pair(1024, 768);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r1.startsWith("hwG") != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r1.equalsIgnoreCase("ks01lte") == false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] getEncoderSupportedColorFormats(X.AnonymousClass1OL r3) {
        /*
            android.content.SharedPreferences r2 = r3.A01()
            java.lang.String r1 = "video_encoder_frame_convertor_color_id"
            r0 = -1
            int r3 = r2.getInt(r1, r0)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = android.os.Build.BOARD
            java.lang.String r0 = "MSM8960"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "universal7580"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x003d
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "xcover3lte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "ks01lte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0047
        L_0x003d:
            r2 = 1
        L_0x003e:
            r1 = 3
            if (r2 == 0) goto L_0x0065
            int[] r0 = new int[r1]
            r0 = {17, 35, 842094169} // fill-array
            return r0
        L_0x0047:
            java.lang.String r1 = android.os.Build.BOARD
            java.lang.String r0 = "7x27"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x003d
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "hwY"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "hwG"
            boolean r0 = r1.startsWith(r0)
            r2 = 0
            if (r0 == 0) goto L_0x003e
            goto L_0x003d
        L_0x0065:
            r0 = 1
            if (r3 != r0) goto L_0x006e
            int[] r0 = new int[r1]
            r0 = {35, 842094169, 17} // fill-array
            return r0
        L_0x006e:
            r0 = 2
            if (r3 != r0) goto L_0x0077
            int[] r0 = new int[r1]
            r0 = {842094169, 35, 17} // fill-array
            return r0
        L_0x0077:
            if (r3 == r1) goto L_0x0082
            r0 = 4
            if (r3 == r0) goto L_0x0082
            int[] r0 = new int[r1]
            r0 = {35, 842094169, 17} // fill-array
            return r0
        L_0x0082:
            int[] r0 = new int[r1]
            r0 = {17, 35, 842094169} // fill-array
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCameraInfo.getEncoderSupportedColorFormats(X.1OL):int[]");
    }

    public static /* synthetic */ int lambda$static$0(C37841pp r2, C37841pp r3) {
        int i2 = r2.A01;
        int i3 = r3.A01;
        if (i2 > i3) {
            return -1;
        }
        if (i2 == i3) {
            return AnonymousClass03H.A00(r3.A00, r2.A00);
        }
        return 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("facing ");
        sb.append(this.facing == 0 ? "back" : "front");
        sb.append(", orientation: ");
        sb.append(this.orient);
        sb.append(", returned preview formats: ");
        sb.append(Arrays.toString(this.supportedFormat));
        sb.append(", returned preview size: ");
        sb.append(Arrays.toString(this.supportedSize));
        return sb.toString();
    }
}

package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;

/* renamed from: X.5wz  reason: invalid class name and case insensitive filesystem */
public class C119375wz {
    public static int A00(CameraManager cameraManager, CaptureRequest.Builder builder, C111185fT r7, AnonymousClass5wJ r8, String str, int i2) {
        CaptureRequest.Key key;
        if (r7 == null || r8 == null) {
            throw AnonymousClass000.A0V("Trying to update builder after camera closed.");
        }
        int i3 = 0;
        if (i2 != 0) {
            int A02 = AnonymousClass5wI.A02(AnonymousClass5wI.A0t, r7);
            if (A02 == -1) {
                return A02;
            }
            if (A02 == 1 && AnonymousClass5wJ.A02(AnonymousClass5wJ.A0A, r8)) {
                i3 = 1;
            }
            key = CaptureRequest.CONTROL_AWB_MODE;
        } else {
            int A022 = AnonymousClass5wI.A02(AnonymousClass5wI.A0C, r7);
            if (A022 == 4) {
                if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A08, r8)) {
                    i3 = 4;
                }
            } else if (A022 == 3) {
                if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A09, r8)) {
                    i3 = 3;
                }
            } else if (A022 == 1) {
                if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A07, r8)) {
                    i3 = 1;
                }
            } else if (A022 == 0 && AnonymousClass5wJ.A02(AnonymousClass5wJ.A0I, r8)) {
                Number number = (Number) r7.A05(AnonymousClass5wI.A0a);
                if (number.floatValue() >= AnonymousClass5x4.A00(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE, cameraManager, str)) {
                    builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, number);
                }
            }
            key = CaptureRequest.CONTROL_AF_MODE;
        }
        builder.set(key, Integer.valueOf(i3));
        return i3;
    }

    public static void A01(CaptureRequest.Builder builder) {
        if (Build.VERSION.SDK_INT >= 21) {
            builder.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        r8.set(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0245, code lost:
        r0 = X.AnonymousClass000.A1X(r9.A05(r0));
        r1 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x024f, code lost:
        if (r0 == false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0251, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0255, code lost:
        r8.set(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0258, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0264, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0281, code lost:
        if (X.AnonymousClass5wI.A02(r1, r9) != 3) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a0, code lost:
        r8.set(r1, r9.A05(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r1 != 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0207, code lost:
        if (X.AnonymousClass5wI.A02(r1, r9) != 3) goto L_0x0209;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.hardware.camera2.CaptureRequest.Builder r8, X.C111185fT r9, X.AnonymousClass5wJ r10, int r11) {
        /*
            if (r9 == 0) goto L_0x02b8
            if (r10 == 0) goto L_0x02b8
            r5 = 2
            r6 = 3
            r3 = 1
            r7 = 0
            switch(r11) {
                case 0: goto L_0x00c9;
                case 1: goto L_0x0294;
                case 2: goto L_0x0269;
                case 3: goto L_0x0048;
                case 4: goto L_0x023b;
                case 5: goto L_0x0230;
                case 6: goto L_0x021b;
                case 7: goto L_0x01ef;
                case 8: goto L_0x01d9;
                case 9: goto L_0x0135;
                case 10: goto L_0x01bc;
                case 11: goto L_0x0193;
                case 12: goto L_0x0185;
                case 13: goto L_0x0164;
                case 14: goto L_0x0143;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.5qO r0 = X.AnonymousClass5wI.A0j
            java.lang.Object r2 = r9.A05(r0)
            int[] r2 = (int[]) r2
            X.5qN r0 = X.AnonymousClass5wJ.A0p
            java.util.List r0 = X.AnonymousClass5wJ.A01(r0, r10)
            boolean r0 = X.AnonymousClass5xW.A02(r0, r2)
            if (r0 == 0) goto L_0x0040
            X.5qN r0 = X.AnonymousClass5wJ.A0d
            boolean r1 = X.AnonymousClass5wJ.A02(r0, r10)
            r0 = r2[r7]
            if (r1 == 0) goto L_0x0041
            int r0 = r0 / 1000
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r2[r3]
            int r0 = r0 / 1000
        L_0x0033:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Range r3 = android.util.Range.create(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
        L_0x003d:
            r8.set(r0, r3)
        L_0x0040:
            return
        L_0x0041:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r2[r3]
            goto L_0x0033
        L_0x0048:
            java.util.HashSet r0 = X.AnonymousClass5w3.A01
            boolean r0 = X.AnonymousClass5x0.A02(r0)
            r4 = 22
            if (r0 != 0) goto L_0x00a2
            X.5qO r0 = X.AnonymousClass5wI.A0o
            java.lang.Object r2 = r9.A05(r0)
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            r0 = 17
            if (r1 != r0) goto L_0x0084
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0086
            X.5qO r0 = X.AnonymousClass5wI.A0T
            java.lang.Object r0 = r9.A05(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0086
            X.5qN r0 = X.AnonymousClass5wJ.A0G
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0086
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            r0 = 18
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0255
        L_0x0084:
            if (r1 == 0) goto L_0x009e
        L_0x0086:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x009e
            X.5qN r0 = X.AnonymousClass5wJ.A0t
            java.util.List r0 = X.AnonymousClass5wJ.A01(r0, r10)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x009e
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            r8.set(r0, r2)
            return
        L_0x009e:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            goto L_0x0251
        L_0x00a2:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0259
            X.5qO r2 = X.AnonymousClass5wI.A0o
            int r0 = X.AnonymousClass5wI.A02(r2, r9)
            if (r0 == 0) goto L_0x0259
            X.5qN r0 = X.AnonymousClass5wJ.A0G
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0259
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r8.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Object r0 = r9.A05(r2)
            r8.set(r1, r0)
            return
        L_0x00c9:
            X.5qO r0 = X.AnonymousClass5wI.A0L
            java.lang.Object r0 = r9.A05(r0)
            boolean r4 = X.AnonymousClass000.A1X(r0)
            X.5qO r0 = X.AnonymousClass5wI.A0A
            java.lang.Object r2 = r9.A05(r0)
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            X.5qN r0 = X.AnonymousClass5wJ.A0j
            java.util.List r0 = X.AnonymousClass5wJ.A01(r0, r10)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x00fc
            if (r1 == 0) goto L_0x012e
            if (r1 == r3) goto L_0x0116
            if (r1 == r5) goto L_0x0108
            if (r1 != r6) goto L_0x00fc
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x00f9:
            r8.set(r1, r0)
        L_0x00fc:
            r6 = r4
        L_0x00fd:
            if (r4 != 0) goto L_0x0121
            X.5qN r0 = X.AnonymousClass5wJ.A00
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 != 0) goto L_0x0121
            return
        L_0x0108:
            if (r4 != 0) goto L_0x010b
            r5 = 0
        L_0x010b:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r8.set(r1, r0)
            r6 = r5
            goto L_0x00fd
        L_0x0116:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            if (r4 == 0) goto L_0x0129
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r8.set(r1, r0)
        L_0x0121:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x0255
        L_0x0129:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x00f9
        L_0x012e:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x00f9
        L_0x0135:
            java.util.HashSet r0 = X.AnonymousClass5w3.A01
            boolean r0 = X.AnonymousClass5x0.A02(r0)
            if (r0 != 0) goto L_0x0040
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            X.5qO r0 = X.AnonymousClass5wI.A07
            goto L_0x02a0
        L_0x0143:
            X.5qN r0 = X.AnonymousClass5wJ.A02
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0156
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            X.5qO r0 = X.AnonymousClass5wI.A0M
            java.lang.Object r0 = r9.A05(r0)
            r8.set(r1, r0)
        L_0x0156:
            X.5qN r0 = X.AnonymousClass5wJ.A05
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0040
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_LOCK
            X.5qO r0 = X.AnonymousClass5wI.A0O
            goto L_0x02a0
        L_0x0164:
            X.5qN r0 = X.AnonymousClass5wJ.A06
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0040
            X.5qO r0 = X.AnonymousClass5wI.A04
            int r0 = X.AnonymousClass5wI.A02(r0, r9)
            if (r0 != 0) goto L_0x0040
            X.5qO r0 = X.AnonymousClass5wI.A05
            java.lang.Object r0 = r9.A05(r0)
            int[] r0 = (int[]) r0
            android.hardware.camera2.params.ColorSpaceTransform r3 = new android.hardware.camera2.params.ColorSpaceTransform
            r3.<init>(r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_TRANSFORM
            goto L_0x003d
        L_0x0185:
            X.5qN r0 = X.AnonymousClass5wJ.A06
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0040
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_MODE
            X.5qO r0 = X.AnonymousClass5wI.A04
            goto L_0x02a0
        L_0x0193:
            X.5qN r0 = X.AnonymousClass5wJ.A06
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0040
            X.5qO r0 = X.AnonymousClass5wI.A04
            int r0 = X.AnonymousClass5wI.A02(r0, r9)
            if (r0 != 0) goto L_0x0040
            X.5qO r0 = X.AnonymousClass5wI.A03
            java.lang.Object r0 = r9.A05(r0)
            float[] r0 = (float[]) r0
            r4 = r0[r7]
            r2 = r0[r3]
            r1 = r0[r5]
            r0 = r0[r6]
            android.hardware.camera2.params.RggbChannelVector r3 = new android.hardware.camera2.params.RggbChannelVector
            r3.<init>(r4, r2, r1, r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_GAINS
            goto L_0x003d
        L_0x01bc:
            X.5qN r0 = X.AnonymousClass5wJ.A01
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0040
            X.5qO r1 = X.AnonymousClass5wI.A07
            int r0 = X.AnonymousClass5wI.A02(r1, r9)
            if (r0 == 0) goto L_0x01d3
            int r0 = X.AnonymousClass5wI.A02(r1, r9)
            if (r0 == r6) goto L_0x01d3
            return
        L_0x01d3:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.LENS_APERTURE
            X.5qO r0 = X.AnonymousClass5wI.A01
            goto L_0x02a0
        L_0x01d9:
            X.5qO r0 = X.AnonymousClass5wI.A00
            java.lang.Object r3 = r9.A05(r0)
            X.5qN r0 = X.AnonymousClass5wJ.A0e
            java.util.List r0 = X.AnonymousClass5wJ.A01(r0, r10)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0040
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_ANTIBANDING_MODE
            goto L_0x003d
        L_0x01ef:
            X.5qO r0 = X.AnonymousClass5wI.A0L
            java.lang.Object r0 = r9.A05(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0219
            X.5qO r1 = X.AnonymousClass5wI.A07
            int r0 = X.AnonymousClass5wI.A02(r1, r9)
            if (r0 == 0) goto L_0x0219
            int r0 = X.AnonymousClass5wI.A02(r1, r9)
            if (r0 == r6) goto L_0x0219
        L_0x0209:
            X.5qN r0 = X.AnonymousClass5wJ.A0H
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x02a8
            if (r3 != 0) goto L_0x02a8
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.SENSOR_SENSITIVITY
            X.5qO r0 = X.AnonymousClass5wI.A0I
            goto L_0x02a0
        L_0x0219:
            r3 = 0
            goto L_0x0209
        L_0x021b:
            X.5qN r0 = X.AnonymousClass5wJ.A0L
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0040
            X.5qO r0 = X.AnonymousClass5wI.A0U
            java.lang.Object r0 = r9.A05(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            goto L_0x024f
        L_0x0230:
            X.5qN r0 = X.AnonymousClass5wJ.A0M
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0040
            X.5qO r0 = X.AnonymousClass5wI.A0V
            goto L_0x0245
        L_0x023b:
            X.5qN r0 = X.AnonymousClass5wJ.A0T
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0040
            X.5qO r0 = X.AnonymousClass5wI.A0W
        L_0x0245:
            java.lang.Object r0 = r9.A05(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
        L_0x024f:
            if (r0 == 0) goto L_0x0264
        L_0x0251:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x0255:
            r8.set(r1, r0)
            return
        L_0x0259:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r8.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
        L_0x0264:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x0255
        L_0x0269:
            X.5qO r0 = X.AnonymousClass5wI.A0L
            java.lang.Object r0 = r9.A05(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0292
            X.5qO r1 = X.AnonymousClass5wI.A07
            int r0 = X.AnonymousClass5wI.A02(r1, r9)
            if (r0 == 0) goto L_0x0292
            int r0 = X.AnonymousClass5wI.A02(r1, r9)
            if (r0 == r6) goto L_0x0292
        L_0x0283:
            X.5qN r0 = X.AnonymousClass5wJ.A0D
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x02b0
            if (r3 != 0) goto L_0x02b0
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.SENSOR_EXPOSURE_TIME
            X.5qO r0 = X.AnonymousClass5wI.A09
            goto L_0x02a0
        L_0x0292:
            r3 = 0
            goto L_0x0283
        L_0x0294:
            X.5qN r0 = X.AnonymousClass5wJ.A0C
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0040
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            X.5qO r0 = X.AnonymousClass5wI.A08
        L_0x02a0:
            java.lang.Object r0 = r9.A05(r0)
            r8.set(r1, r0)
            return
        L_0x02a8:
            java.lang.String r1 = "CaptureRequestHelper"
            java.lang.String r0 = "ISO_RANGE not supported or AE on"
            X.AnonymousClass5xH.A02(r1, r0)
            return
        L_0x02b0:
            java.lang.String r1 = "CaptureRequestHelper"
            java.lang.String r0 = "EXPOSURE_TIME not supported or AE on"
            X.AnonymousClass5xH.A02(r1, r0)
            return
        L_0x02b8:
            java.lang.String r0 = "Trying to update builder after camera closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119375wz.A02(android.hardware.camera2.CaptureRequest$Builder, X.5fT, X.5wJ, int):void");
    }
}

package X;

/* renamed from: X.5v3  reason: invalid class name and case insensitive filesystem */
public class C118665v3 {
    public int A00;
    public final C119155wd[] A01 = new C119155wd[3];

    public C119155wd A00(long j2) {
        int i2 = 0;
        do {
            C119155wd r3 = this.A01[i2];
            if (r3 != null) {
                C115855qQ r1 = C119155wd.A0P;
                if (r3.A00(r1) != null && C13700nu.A01(r3.A00(r1)) == j2) {
                    return r3;
                }
            }
            i2++;
        } while (i2 < 3);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c2, code lost:
        if (r4.intValue() != 3) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C118625uz r7) {
        /*
            r6 = this;
            X.5wd[] r1 = r6.A01
            int r0 = r6.A00
            r5 = r1[r0]
            if (r5 != 0) goto L_0x000f
            X.5wd r5 = new X.5wd
            r5.<init>()
            r1[r0] = r5
        L_0x000f:
            X.5qQ r1 = X.C119155wd.A0Q
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r3 = 0
            if (r2 < r0) goto L_0x00d9
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_INTRINSIC_CALIBRATION
            java.lang.Object r0 = r7.A00(r0)
        L_0x001e:
            r5.A01(r1, r0)
            X.5qQ r1 = X.C119155wd.A0N
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_FOCUS_RANGE
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.5qQ r1 = X.C119155wd.A0O
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.5qQ r1 = X.C119155wd.A0M
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_FOCAL_LENGTH
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.5qQ r1 = X.C119155wd.A0K
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.5qQ r1 = X.C119155wd.A0P
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            r0 = 24
            if (r2 < r0) goto L_0x0064
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST
            java.lang.Object r3 = r7.A00(r0)
            java.lang.Number r3 = (java.lang.Number) r3
        L_0x0064:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY
            java.lang.Object r0 = r7.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0084
            X.5qQ r2 = X.C119155wd.A0R
            if (r3 == 0) goto L_0x0081
            int r1 = r0.intValue()
            int r0 = r3.intValue()
            int r1 = r1 * r0
            int r0 = r1 / 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0081:
            r5.A01(r2, r0)
        L_0x0084:
            X.5qQ r1 = X.C119155wd.A0F
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_APERTURE
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.5qQ r1 = X.C119155wd.A0G
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.5qQ r1 = X.C119155wd.A0T
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.JPEG_ORIENTATION
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.5qQ r1 = X.C119155wd.A0S
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_FOCUS_DISTANCE
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.FLASH_STATE
            java.lang.Object r4 = r7.A00(r0)
            java.lang.Number r4 = (java.lang.Number) r4
            X.5qQ r3 = X.C119155wd.A0J
            r2 = 3
            if (r4 == 0) goto L_0x00c4
            int r1 = r4.intValue()
            r0 = 1
            if (r1 == r2) goto L_0x00c5
        L_0x00c4:
            r0 = 0
        L_0x00c5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A01(r3, r0)
            X.5qQ r0 = X.C119155wd.A0L
            r5.A01(r0, r4)
            int r0 = r6.A00
            int r0 = r0 + 1
            int r0 = r0 % r2
            r6.A00 = r0
            return
        L_0x00d9:
            r0 = r3
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118665v3.A01(X.5uz):void");
    }
}

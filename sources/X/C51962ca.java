package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2ca  reason: invalid class name and case insensitive filesystem */
public final class C51962ca {
    public final int A00;
    public final int A01;
    public final C37841pp A02;
    public final List A03;
    public final boolean A04;
    public final int[] A05;

    public C51962ca(C37841pp r1, List list, int[] iArr, int i2, int i3, boolean z2) {
        this.A00 = i2;
        this.A04 = z2;
        this.A01 = i3;
        this.A05 = iArr;
        this.A02 = r1;
        this.A03 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r0.intValue() == 0) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C51962ca A00(X.AnonymousClass01V r13, int r14) {
        /*
            android.hardware.camera2.CameraManager r1 = r13.A0E()
            r9 = 0
            if (r1 != 0) goto L_0x000e
            java.lang.String r0 = "voip/RawCameraInfo camera2 CameraManager is null"
        L_0x000a:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r9
        L_0x000e:
            java.lang.String r0 = java.lang.Integer.toString(r14)     // Catch:{ Exception -> 0x010d }
            android.hardware.camera2.CameraCharacteristics r1 = r1.getCameraCharacteristics(r0)     // Catch:{ Exception -> 0x010d }
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ IllegalArgumentException -> 0x0108 }
            java.lang.Object r5 = r1.get(r0)     // Catch:{ IllegalArgumentException -> 0x0108 }
            android.hardware.camera2.params.StreamConfigurationMap r5 = (android.hardware.camera2.params.StreamConfigurationMap) r5     // Catch:{ IllegalArgumentException -> 0x0108 }
            if (r5 != 0) goto L_0x003b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0108 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0108 }
            java.lang.String r0 = "voip/RawCameraInfo camera2 Camera "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0108 }
            r1.append(r14)     // Catch:{ IllegalArgumentException -> 0x0108 }
            java.lang.String r0 = " has no available stream configs"
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0108 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0108 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x0108 }
            goto L_0x00b6
        L_0x003b:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch:{ IllegalArgumentException -> 0x0108 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ IllegalArgumentException -> 0x0108 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalArgumentException -> 0x0108 }
            r8 = 0
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "voip/RawCameraInfo camera2 orientation was null! defaulting to 0"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x0108 }
            r12 = 0
            goto L_0x0052
        L_0x004e:
            int r12 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0108 }
        L_0x0052:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ IllegalArgumentException -> 0x0108 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ IllegalArgumentException -> 0x0108 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalArgumentException -> 0x0108 }
            r3 = 1
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "voip/RawCameraInfo camera2 lens facing is null! defaulting to lens facing back"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x0108 }
            goto L_0x006b
        L_0x0064:
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0108 }
            r13 = 0
            if (r0 != 0) goto L_0x006c
        L_0x006b:
            r13 = 1
        L_0x006c:
            int[] r6 = r5.getOutputFormats()
            int r4 = r6.length
            r1 = 0
        L_0x0072:
            r2 = 35
            if (r1 >= r4) goto L_0x00b4
            r0 = r6[r1]
            if (r0 != r2) goto L_0x00b1
            r0 = 1
        L_0x007b:
            java.lang.String r7 = "voip/RawCameraInfo camera2 "
            if (r0 != 0) goto L_0x009d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r14)
            java.lang.String r0 = " no supported output formats: "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r6)
        L_0x0094:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x000a
        L_0x009d:
            android.util.Size[] r5 = r5.getOutputSizes(r2)
            if (r5 != 0) goto L_0x00b7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r14)
            java.lang.String r0 = " no supported output format/size combinations"
            goto L_0x0094
        L_0x00b1:
            int r1 = r1 + 1
            goto L_0x0072
        L_0x00b4:
            r0 = 0
            goto L_0x007b
        L_0x00b6:
            return r9
        L_0x00b7:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r4 = r5.length
            r1 = 0
        L_0x00be:
            if (r1 >= r4) goto L_0x00cc
            r0 = r5[r1]
            X.1pp r0 = X.C37841pp.A00(r0)
            r9.add(r0)
            int r1 = r1 + 1
            goto L_0x00be
        L_0x00cc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r14)
            java.lang.String r0 = " params, supported color formats "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r6)
            r1.append(r0)
            java.lang.String r0 = ", supported preview sizes: {"
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r5)
            r1.append(r0)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11 = 2
            int[] r10 = new int[r3]
            r10[r8] = r2
            r8 = 0
            X.2ca r7 = new X.2ca
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0108:
            r1 = move-exception
            java.lang.String r0 = "voip/RawCameraInfo camera2 Illegal Argument while accessing camera characteristics"
            goto L_0x0111
        L_0x010d:
            r1 = move-exception
            java.lang.String r0 = "voip/RawCameraInfo camera2 unable to acquire camera info"
        L_0x0111:
            com.whatsapp.util.Log.e(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51962ca.A00(X.01V, int):X.2ca");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("json version: 1, api version: ");
        sb.append(this.A00);
        sb.append(", front camera: ");
        sb.append(this.A04);
        sb.append(", orientation: ");
        sb.append(this.A01);
        sb.append(", formats: ");
        sb.append(Arrays.toString(this.A05));
        sb.append(", preferred size: ");
        sb.append(this.A02);
        sb.append(", sizes: ");
        List list = this.A03;
        sb.append(list != null ? TextUtils.join(", ", list) : "null");
        return sb.toString();
    }
}

package X;

/* renamed from: X.5q8  reason: invalid class name and case insensitive filesystem */
public final class C115675q8 {
    public static int A00 = -1;
    public static int A01 = -1;
    public static Boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c1, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d1, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e1, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.content.Context r7) {
        /*
            java.lang.Boolean r0 = A02
            if (r0 != 0) goto L_0x0079
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0075
            java.lang.String r0 = "camera"
            java.lang.Object r7 = r7.getSystemService(r0)     // Catch:{ AssertionError | Exception -> 0x0054 }
            android.hardware.camera2.CameraManager r7 = (android.hardware.camera2.CameraManager) r7     // Catch:{ AssertionError | Exception -> 0x0054 }
            java.lang.String[] r6 = r7.getCameraIdList()     // Catch:{ AssertionError | Exception -> 0x0054 }
            int r5 = r6.length     // Catch:{ AssertionError | Exception -> 0x0054 }
            r4 = 0
        L_0x0018:
            if (r4 >= r5) goto L_0x0059
            r0 = r6[r4]     // Catch:{ AssertionError | Exception -> 0x0054 }
            android.hardware.camera2.CameraCharacteristics r1 = r7.getCameraCharacteristics(r0)     // Catch:{ AssertionError | Exception -> 0x0054 }
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ AssertionError | Exception -> 0x0054 }
            java.lang.Object r3 = r1.get(r0)     // Catch:{ AssertionError | Exception -> 0x0054 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ AssertionError | Exception -> 0x0054 }
            if (r3 == 0) goto L_0x0051
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ AssertionError | Exception -> 0x0054 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ AssertionError | Exception -> 0x0054 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ AssertionError | Exception -> 0x0054 }
            int r2 = r0.intValue()     // Catch:{ AssertionError | Exception -> 0x0054 }
            int r0 = A01     // Catch:{ AssertionError | Exception -> 0x0054 }
            r1 = -1
            if (r0 != r1) goto L_0x0044
            int r0 = r3.intValue()     // Catch:{ AssertionError | Exception -> 0x0054 }
            if (r0 != 0) goto L_0x0044
            A01 = r2     // Catch:{ AssertionError | Exception -> 0x0054 }
            goto L_0x0051
        L_0x0044:
            int r0 = A00     // Catch:{ AssertionError | Exception -> 0x0054 }
            if (r0 != r1) goto L_0x0051
            int r1 = r3.intValue()     // Catch:{ AssertionError | Exception -> 0x0054 }
            r0 = 1
            if (r1 != r0) goto L_0x0051
            A00 = r2     // Catch:{ AssertionError | Exception -> 0x0054 }
        L_0x0051:
            int r4 = r4 + 1
            goto L_0x0018
        L_0x0054:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            A02 = r0
            goto L_0x0079
        L_0x0059:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r2 = "SAMSUNG"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = r0.toUpperCase()
            java.lang.String r0 = "SM-G93"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x007e
        L_0x0075:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0077:
            A02 = r0
        L_0x0079:
            boolean r0 = r0.booleanValue()
            return r0
        L_0x007e:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = r0.toUpperCase()
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = r0.toUpperCase()
            java.lang.String r0 = "SM-G95"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0099
            goto L_0x0075
        L_0x0099:
            int r3 = A01
            r0 = 2
            if (r3 == r0) goto L_0x00ac
            r0 = 1
            if (r3 < r0) goto L_0x00ac
            int r1 = A00
            r0 = 2
            if (r1 == r0) goto L_0x00ac
            r0 = 1
            if (r1 < r0) goto L_0x00ac
        L_0x00a9:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x00ac:
            int r4 = A00
            r2 = 0
            r0 = 2
            if (r4 == r0) goto L_0x00b6
            r0 = 1
            if (r4 < r0) goto L_0x00b6
            r2 = 1
        L_0x00b6:
            r1 = 26
            if (r2 == 0) goto L_0x00c4
            r0 = 2
            if (r3 == r0) goto L_0x0075
            if (r3 < 0) goto L_0x0075
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x00c4
            goto L_0x00a9
        L_0x00c4:
            r0 = 2
            if (r3 == r0) goto L_0x0075
            r0 = 1
            if (r3 < r0) goto L_0x00d4
            r0 = 2
            if (r4 == r0) goto L_0x00d4
            if (r4 < 0) goto L_0x00d4
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x00d4
            goto L_0x00a9
        L_0x00d4:
            r0 = 2
            if (r3 == r0) goto L_0x0075
            if (r3 < 0) goto L_0x0075
            if (r4 == r0) goto L_0x0075
            if (r4 < 0) goto L_0x0075
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0075
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115675q8.A00(android.content.Context):boolean");
    }
}

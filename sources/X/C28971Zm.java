package X;

/* renamed from: X.1Zm  reason: invalid class name and case insensitive filesystem */
public final class C28971Zm {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r6.getApplicationInfo().targetSdkVersion < 33) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String[] A00(android.content.Context r6, boolean r7, boolean r8) {
        /*
            r5 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            r1 = 33
            if (r3 < r1) goto L_0x0025
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            r4.add(r0)
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            r4.add(r0)
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            r4.add(r0)
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            if (r0 >= r1) goto L_0x0028
        L_0x0025:
            r4.add(r2)
        L_0x0028:
            if (r7 == 0) goto L_0x002f
            java.lang.String r0 = "android.permission.CAMERA"
            r4.add(r0)
        L_0x002f:
            if (r8 == 0) goto L_0x0038
            if (r3 >= r1) goto L_0x0038
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r4.add(r0)
        L_0x0038:
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r4.toArray(r0)
            if (r0 == 0) goto L_0x0043
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x0043:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28971Zm.A00(android.content.Context, boolean, boolean):java.lang.String[]");
    }
}

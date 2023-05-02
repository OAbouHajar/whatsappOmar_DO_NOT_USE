package X;

import android.net.Uri;

/* renamed from: X.1vM  reason: invalid class name and case insensitive filesystem */
public class C41181vM extends C41091vD {
    public static final Uri A00 = Uri.parse("content://com.transsion.hilauncher.unreadprovider");
    public static final Uri A01 = Uri.parse("content://com.transsion.XOSLauncher.unreadprovider");

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0060
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            r6 = 0
            if (r2 == 0) goto L_0x004a
            java.lang.String r0 = "android.intent.action.MAIN"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            java.lang.String r0 = "android.intent.category.HOME"
            r1.addCategory(r0)
            android.content.pm.ResolveInfo r0 = r2.resolveActivity(r1, r6)     // Catch:{ NameNotFoundException -> 0x0048 }
            if (r0 == 0) goto L_0x004a
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ NameNotFoundException -> 0x0048 }
            java.lang.String r1 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0048 }
            r0 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0048 }
            android.content.pm.PermissionInfo[] r5 = r0.permissions     // Catch:{ NameNotFoundException -> 0x0048 }
            int r4 = r5.length     // Catch:{ NameNotFoundException -> 0x0048 }
            r3 = 0
        L_0x002d:
            if (r3 >= r4) goto L_0x004c
            r2 = r5[r3]     // Catch:{ NameNotFoundException -> 0x0048 }
            java.lang.String r1 = "com.transsion.hilauncher.permission.CHANGE_BADGE"
            java.lang.String r0 = r2.name     // Catch:{ NameNotFoundException -> 0x0048 }
            boolean r0 = r1.equals(r0)     // Catch:{ NameNotFoundException -> 0x0048 }
            if (r0 != 0) goto L_0x004a
            java.lang.String r1 = "com.transsion.XOSLauncher.permission.CHANGE_BADGE"
            java.lang.String r0 = r2.name     // Catch:{ NameNotFoundException -> 0x0048 }
            boolean r0 = r1.equals(r0)     // Catch:{ NameNotFoundException -> 0x0048 }
            if (r0 != 0) goto L_0x004a
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0048:
            r0 = 0
            goto L_0x004d
        L_0x004a:
            r0 = 0
            goto L_0x004d
        L_0x004c:
            r0 = 1
        L_0x004d:
            if (r0 == 0) goto L_0x0060
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = "com.transsion.XOSLauncher"
            r2[r6] = r0
            r1 = 1
            java.lang.String r0 = "com.transsion.hilauncher"
            r2[r1] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            return r0
        L_0x0060:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41181vM.A00(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[SYNTHETIC, Splitter:B:15:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[Catch:{ Exception -> 0x006a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.content.Context r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "android.intent.action.MAIN"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r0 = "android.intent.category.HOME"
            r2.addCategory(r0)
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ RuntimeException -> 0x001f }
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)     // Catch:{ RuntimeException -> 0x001f }
            if (r0 == 0) goto L_0x0025
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ RuntimeException -> 0x001f }
            if (r0 == 0) goto L_0x0025
            java.lang.String r5 = r0.packageName     // Catch:{ RuntimeException -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r1 = move-exception
            java.lang.String r0 = "Exception while getting launcher name"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0025:
            java.lang.String r5 = ""
        L_0x0027:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "package"
            r4.putString(r0, r1)
            java.lang.String r1 = com.obwhatsapp.yo.yo.bIc()
            java.lang.String r0 = "class"
            r4.putString(r0, r1)
            java.lang.String r0 = "badgenumber"
            r4.putInt(r0, r8)
            java.lang.String r0 = "com.transsion.XOSLauncher"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x006a }
            r3 = 0
            java.lang.String r2 = "change_badge"
            if (r0 == 0) goto L_0x0058
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ Exception -> 0x006a }
            android.net.Uri r0 = A01     // Catch:{ Exception -> 0x006a }
            r1.call(r0, r2, r3, r4)     // Catch:{ Exception -> 0x006a }
            return
        L_0x0058:
            java.lang.String r0 = "com.transsion.hilauncher"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x006a }
            if (r0 == 0) goto L_0x0080
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ Exception -> 0x006a }
            android.net.Uri r0 = A00     // Catch:{ Exception -> 0x006a }
            r1.call(r0, r2, r3, r4)     // Catch:{ Exception -> 0x006a }
            return
        L_0x006a:
            r2 = move-exception
            java.lang.String r0 = "badger/getbadger "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41181vM.A02(android.content.Context, int):void");
    }
}

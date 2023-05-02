package com.whatsapp.stickers.storage;

import X.C15870s2;
import X.C16170sZ;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.net.Uri;

public class WhitelistPackQueryContentProvider extends C15870s2 {
    public UriMatcher A00;
    public C16170sZ A01;

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri) {
        A00();
        StringBuilder sb = new StringBuilder("vnd.android.cursor.item/vnd.");
        sb.append("com.obwhatsapp.provider.sticker_whitelist_check");
        sb.append(".");
        sb.append("is_whitelisted");
        return sb.toString();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        com.whatsapp.util.Log.e("Exception when querying whitelist packs", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b8, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r9, java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13) {
        /*
            r8 = this;
            r8.A00()
            r7 = 0
            r4 = r8
            monitor-enter(r4)     // Catch:{ Exception -> 0x00b2 }
            android.content.UriMatcher r0 = r8.A00     // Catch:{ all -> 0x00af }
            if (r0 != 0) goto L_0x001a
            r0 = -1
            android.content.UriMatcher r3 = new android.content.UriMatcher     // Catch:{ all -> 0x00af }
            r3.<init>(r0)     // Catch:{ all -> 0x00af }
            r8.A00 = r3     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "com.obwhatsapp.provider.sticker_whitelist_check"
            java.lang.String r1 = "is_whitelisted"
            r0 = 1
            r3.addURI(r2, r1, r0)     // Catch:{ all -> 0x00af }
        L_0x001a:
            android.content.UriMatcher r0 = r8.A00     // Catch:{ all -> 0x00af }
            monitor-exit(r4)     // Catch:{ Exception -> 0x00b2 }
            int r0 = r0.match(r9)     // Catch:{ Exception -> 0x00b2 }
            r5 = 1
            if (r0 != r5) goto L_0x00ae
            android.content.Context r0 = r8.getContext()     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x00ae
            android.content.Context r0 = r8.getContext()     // Catch:{ Exception -> 0x00b2 }
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r0 = "authority"
            java.lang.String r4 = r9.getQueryParameter(r0)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r0 = "identifier"
            java.lang.String r6 = r9.getQueryParameter(r0)     // Catch:{ Exception -> 0x00b2 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00b2 }
            if (r0 != 0) goto L_0x00ae
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00b2 }
            if (r0 != 0) goto L_0x00ae
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r3 = r2.resolveContentProvider(r4, r0)     // Catch:{ Exception -> 0x00b2 }
            if (r3 == 0) goto L_0x00ae
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b2 }
            r0 = 19
            if (r1 < r0) goto L_0x005d
            java.lang.String r2 = r8.getCallingPackage()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0065
        L_0x005d:
            int r0 = android.os.Binder.getCallingUid()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r2 = r2.getNameForUid(r0)     // Catch:{ Exception -> 0x00b2 }
        L_0x0065:
            if (r2 == 0) goto L_0x0091
            java.lang.String r0 = r3.packageName     // Catch:{ Exception -> 0x00b2 }
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0091
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r1 = "result"
            r0 = 0
            r3[r0] = r1     // Catch:{ Exception -> 0x00b2 }
            android.database.MatrixCursor r2 = new android.database.MatrixCursor     // Catch:{ Exception -> 0x00b2 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b2 }
            android.database.MatrixCursor$RowBuilder r1 = r2.newRow()     // Catch:{ Exception -> 0x00b2 }
            X.0sZ r0 = r8.A01     // Catch:{ Exception -> 0x00b2 }
            boolean r0 = r0.A02(r4, r6)     // Catch:{ Exception -> 0x00b2 }
            if (r0 != 0) goto L_0x0089
            r5 = 0
        L_0x0089:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00b2 }
            r1.add(r0)     // Catch:{ Exception -> 0x00b2 }
            return r2
        L_0x0091:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2 }
            r1.<init>()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r0 = "the calling package "
            r1.append(r0)     // Catch:{ Exception -> 0x00b2 }
            r1.append(r2)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r0 = " does not own the queried authority: "
            r1.append(r0)     // Catch:{ Exception -> 0x00b2 }
            r1.append(r4)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00b2 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x00b2 }
        L_0x00ae:
            return r7
        L_0x00af:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x00b2 }
            throw r0     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            java.lang.String r0 = "Exception when querying whitelist packs"
            com.whatsapp.util.Log.e(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.storage.WhitelistPackQueryContentProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}

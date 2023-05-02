package com.obwhatsapp.contentprovider;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.C14710pd;
import X.C15800rs;
import X.C15870s2;
import X.C16000sG;
import X.C16080sP;
import X.C16180sb;
import X.C16440t3;
import X.C16460t6;
import X.C16480t8;
import X.C16500tA;
import X.C16510tB;
import X.C16730tY;
import X.C16750ta;
import X.C16760tb;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;

public class MediaProvider extends C15870s2 {
    public static UriMatcher A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String A0E;
    public static final String[] A0F = {"_display_name", "_size"};
    public C16180sb A00;
    public C16000sG A01;
    public C16080sP A02;
    public C15800rs A03;
    public C16440t3 A04;
    public AnonymousClass013 A05;
    public C16460t6 A06;
    public C16480t8 A07;
    public C16500tA A08;
    public C14710pd A09;
    public C16510tB A0A;

    static {
        StringBuilder sb = new StringBuilder("com.obwhatsapp");
        sb.append(".provider.media");
        A0C = sb.toString();
        StringBuilder sb2 = new StringBuilder("vnd.android.cursor.dir/vnd.");
        sb2.append("com.obwhatsapp");
        sb2.append(".provider.media.buckets");
        A0D = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("vnd.android.cursor.dir/vnd.");
        sb3.append("com.obwhatsapp");
        sb3.append(".provider.media.items");
        A0E = sb3.toString();
    }

    public static int A00(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        StringBuilder sb = new StringBuilder("Invalid mode: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static synchronized UriMatcher A01() {
        UriMatcher uriMatcher;
        synchronized (MediaProvider.class) {
            if (A0B == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0B = uriMatcher2;
                String str = A0C;
                uriMatcher2.addURI(str, "buckets", 1);
                A0B.addURI(str, "items", 2);
                A0B.addURI(str, "item/*", 3);
                A0B.addURI(str, "gdpr_report", 4);
                A0B.addURI(str, "personal_dyi_report", 6);
                A0B.addURI(str, "business_dyi_report", 11);
                A0B.addURI(str, "business_activity_report", 7);
                A0B.addURI(str, "export_chat/*/*", 5);
                A0B.addURI(str, "thumbnail/*", 8);
                A0B.addURI(str, "export/*", 9);
                A0B.addURI(str, "devdebuginfo/*", 12);
                A0B.addURI(str, "support", 10);
            }
            uriMatcher = A0B;
        }
        return uriMatcher;
    }

    public static Uri A02(C16500tA r4, C16730tY r5) {
        int i2 = Build.VERSION.SDK_INT;
        C16750ta r0 = r5.A02;
        AnonymousClass00B.A06(r0);
        if (i2 < 21) {
            return Uri.fromFile(r0.A0F);
        }
        File file = r0.A0F;
        AnonymousClass00B.A06(file);
        String obj = UUID.randomUUID().toString();
        r4.A01(obj, file.getAbsolutePath(), C16760tb.A00(r5), file.getName());
        return new Uri.Builder().scheme("content").authority(A0C).appendPath("item").appendEncodedPath(obj).build();
    }

    public static Uri A03(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(A0C).appendPath(str).appendQueryParameter("id", str2).build();
    }

    public static final String A04(Uri uri) {
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter != null) {
            return queryParameter;
        }
        StringBuilder sb = new StringBuilder("Unknown URI ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Cursor A05(Uri uri, File file, String str, String[] strArr) {
        int i2;
        try {
            A06(uri, file);
            if (strArr == null) {
                strArr = A0F;
            }
            String[] strArr2 = new String[r7];
            Object[] objArr = new Object[r7];
            int i3 = 0;
            for (String str2 : strArr) {
                if ("_display_name".equals(str2)) {
                    strArr2[i3] = "_display_name";
                    i2 = i3 + 1;
                    objArr[i3] = str;
                } else if ("_size".equals(str2)) {
                    strArr2[i3] = "_size";
                    i2 = i3 + 1;
                    objArr[i3] = Long.valueOf(file.length());
                }
                i3 = i2;
            }
            String[] strArr3 = new String[i3];
            System.arraycopy(strArr2, 0, strArr3, 0, i3);
            Object[] objArr2 = new Object[i3];
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            MatrixCursor matrixCursor = new MatrixCursor(strArr3, 1);
            matrixCursor.addRow(objArr2);
            return matrixCursor;
        } catch (FileNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final void A06(Uri uri, File file) {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("File not found for uri: ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        } else if (file.lastModified() < this.A04.A00() - 3600000) {
            file.delete();
            StringBuilder sb2 = new StringBuilder("File expired for uri: ");
            sb2.append(uri);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A00();
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0070 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0070=Splitter:B:24:0x0070, B:14:0x005c=Splitter:B:14:0x005c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r8) {
        /*
            r7 = this;
            r7.A00()
            android.content.UriMatcher r0 = A01()
            int r0 = r0.match(r8)
            switch(r0) {
                case 1: goto L_0x0067;
                case 2: goto L_0x0022;
                case 3: goto L_0x0025;
                case 4: goto L_0x0076;
                case 5: goto L_0x0079;
                case 6: goto L_0x0076;
                case 7: goto L_0x0076;
                case 8: goto L_0x007d;
                case 9: goto L_0x0076;
                case 10: goto L_0x0076;
                case 11: goto L_0x0076;
                case 12: goto L_0x0079;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.String r1 = "Unknown URI "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0022:
            java.lang.String r0 = A0E
            return r0
        L_0x0025:
            X.0tA r0 = r7.A08
            java.lang.String r1 = r8.getLastPathSegment()
            X.0tc r0 = r0.A00
            X.0tf r5 = r0.get()
            X.0tg r6 = r5.A02     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "SELECT mime_type FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?"
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0071 }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x0071 }
            r2 = 1
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0071 }
            r3[r2] = r0     // Catch:{ all -> 0x0071 }
            android.database.Cursor r1 = r6.A08(r4, r3)     // Catch:{ all -> 0x0071 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0052
            r0 = 0
            goto L_0x005c
        L_0x0052:
            java.lang.String r0 = "mime_type"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x006a }
        L_0x005c:
            r1.close()     // Catch:{ all -> 0x0071 }
            r5.close()
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "application/octet-stream"
            return r0
        L_0x0067:
            java.lang.String r0 = A0D
        L_0x0069:
            return r0
        L_0x006a:
            r0 = move-exception
            if (r1 == 0) goto L_0x0070
            r1.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0075 }
        L_0x0075:
            throw r0
        L_0x0076:
            java.lang.String r0 = "application/zip"
            return r0
        L_0x0079:
            java.lang.String r0 = "text/plain"
            return r0
        L_0x007d:
            java.lang.String r0 = "image/jpeg"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contentprovider.MediaProvider.getType(android.net.Uri):java.lang.String");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A00();
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.ParcelFileDescriptor openFile(android.net.Uri r8, java.lang.String r9) {
        /*
            r7 = this;
            r7.A00()
            android.content.UriMatcher r0 = A01()
            int r0 = r0.match(r8)
            switch(r0) {
                case 3: goto L_0x0049;
                case 4: goto L_0x00bc;
                case 5: goto L_0x00e0;
                case 6: goto L_0x0014;
                case 7: goto L_0x0102;
                case 8: goto L_0x0126;
                case 9: goto L_0x0017;
                case 10: goto L_0x0263;
                case 11: goto L_0x001d;
                case 12: goto L_0x0043;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x0014:
            java.lang.String r2 = "personal"
            goto L_0x001f
        L_0x0017:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x001d:
            java.lang.String r2 = "business"
        L_0x001f:
            java.lang.String r0 = "id"
            java.lang.String r1 = r8.getQueryParameter(r0)
            if (r1 == 0) goto L_0x002f
            X.0sb r0 = r7.A00
            java.io.File r1 = r0.A0O(r1, r2)
            goto L_0x0271
        L_0x002f:
            java.lang.String r1 = "File not found for uri: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = r0.toString()
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        L_0x0043:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x0049:
            r7.A00()
            int r2 = A00(r9)
            X.0tA r1 = r7.A08
            java.lang.String r0 = r8.getLastPathSegment()
            java.lang.String r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0064
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
        L_0x0061:
            if (r1 == 0) goto L_0x00a5
            goto L_0x0066
        L_0x0064:
            r1 = 0
            goto L_0x0061
        L_0x0066:
            X.0tB r0 = r7.A0A     // Catch:{ IOException -> 0x008d }
            r0.A04(r1)     // Catch:{ IOException -> 0x008d }
            android.os.ParcelFileDescriptor r1 = android.os.ParcelFileDescriptor.open(r1, r2)
            X.0tB r0 = r7.A0A     // Catch:{ IOException -> 0x0075 }
            r0.A02(r1)     // Catch:{ IOException -> 0x0075 }
            return r1
        L_0x0075:
            r2 = move-exception
            java.lang.String r1 = "mediaprovider/ parcel file descriptor is not external for uri: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x008d:
            r2 = move-exception
            java.lang.String r1 = "mediaprovider/ file is not external for uri: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x00a5:
            java.lang.String r1 = "mediaprovider/openMessageFile no file found for uri: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x00bc:
            java.lang.String r0 = "id"
            java.lang.String r1 = r8.getQueryParameter(r0)
            if (r1 == 0) goto L_0x00cc
            X.0sb r0 = r7.A00
            java.io.File r1 = r0.A0L(r1)
            goto L_0x0271
        L_0x00cc:
            java.lang.String r1 = "File not found for uri: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = r0.toString()
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        L_0x00e0:
            java.lang.String r1 = r8.getLastPathSegment()
            if (r1 == 0) goto L_0x00ee
            X.0sb r0 = r7.A00
            java.io.File r1 = r0.A0I(r1)
            goto L_0x0271
        L_0x00ee:
            java.lang.String r1 = "File not found for uri: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = r0.toString()
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        L_0x0102:
            java.lang.String r0 = "id"
            java.lang.String r1 = r8.getQueryParameter(r0)
            if (r1 == 0) goto L_0x0112
            X.0sb r0 = r7.A00
            java.io.File r1 = r0.A0J(r1)
            goto L_0x0271
        L_0x0112:
            java.lang.String r1 = "File not found for uri: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = r0.toString()
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        L_0x0126:
            r7.A00()
            java.lang.String r0 = "r"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0258
            java.lang.String r3 = r8.getLastPathSegment()
            if (r3 == 0) goto L_0x0241
            X.0tA r0 = r7.A08
            java.lang.String r2 = r0.A00(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x022a
            long r1 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0213 }
            X.0t6 r0 = r7.A06
            X.0th r0 = r0.A0K
            X.0tZ r6 = r0.A00(r1)
            if (r6 == 0) goto L_0x01fc
            boolean r0 = r6 instanceof X.C16830ti
            if (r0 == 0) goto L_0x01f1
            X.0tm r1 = r6.A0F()
            if (r1 == 0) goto L_0x01e6
            byte[] r0 = r1.A06()
            if (r0 == 0) goto L_0x0168
            byte[] r1 = r1.A06()
        L_0x0165:
            if (r1 == 0) goto L_0x01db
            goto L_0x0173
        L_0x0168:
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x01db
            byte[] r1 = r1.A07()
            goto L_0x0165
        L_0x0173:
            android.os.ParcelFileDescriptor[] r5 = android.os.ParcelFileDescriptor.createPipe()     // Catch:{ IOException -> 0x01cf }
            r4 = 0
            r0 = 1
            r0 = r5[r0]     // Catch:{ Exception -> 0x01c2 }
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r3 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ Exception -> 0x01c2 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x01c2 }
            int r0 = r1.length     // Catch:{ all -> 0x01bd }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r1, r4, r0)     // Catch:{ all -> 0x01bd }
            if (r2 == 0) goto L_0x01b2
            boolean r0 = r6 instanceof X.C16840tj     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x019f
            X.AnonymousClass00B.A06(r6)     // Catch:{ all -> 0x01bd }
            X.0tj r6 = (X.C16840tj) r6     // Catch:{ all -> 0x01bd }
            X.0tn r0 = r6.AAt()     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x019f
            int r0 = r0.A00     // Catch:{ all -> 0x01bd }
            r1 = 2
            if (r0 != r1) goto L_0x019f
            r0 = 5
            com.whatsapp.filter.FilterUtils.blurNative(r2, r0, r1)     // Catch:{ all -> 0x01bd }
        L_0x019f:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x01bd }
            r0 = 100
            r2.compress(r1, r0, r3)     // Catch:{ all -> 0x01bd }
            r2.recycle()     // Catch:{ all -> 0x01bd }
            r3.flush()     // Catch:{ all -> 0x01bd }
            r3.close()     // Catch:{ Exception -> 0x01c2 }
            r1 = r5[r4]
            return r1
        L_0x01b2:
            java.lang.String r0 = "Can't decode thumbnail bytes"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01bd }
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x01bd }
            r0.<init>()     // Catch:{ all -> 0x01bd }
            throw r0     // Catch:{ all -> 0x01bd }
        L_0x01bd:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            throw r0     // Catch:{ Exception -> 0x01c2 }
        L_0x01c2:
            r0 = r5[r4]
            if (r0 == 0) goto L_0x01c9
            r0.close()     // Catch:{ IOException -> 0x01c9 }
        L_0x01c9:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x01cf:
            r1 = move-exception
            java.lang.String r0 = "Failed to create parcel file descriptor pipe"
            com.whatsapp.util.Log.e(r0, r1)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x01db:
            java.lang.String r0 = "Message thumbnail has empty bytes"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x01e6:
            java.lang.String r0 = "Message has null thumbnail"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x01f1:
            java.lang.String r0 = "Message is not allowed type for getting thumbnail"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x01fc:
            java.lang.String r1 = "Failed to get message for uri - "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x0213:
            java.lang.String r1 = "Invalid message id format - "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x022a:
            java.lang.String r1 = "Invalid record for uuid "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x0241:
            java.lang.String r1 = "Failed to get uuid for uri - "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x0258:
            java.lang.String r0 = "Invalid access mode for openMessageThumbnail - only read allowed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x0263:
            java.lang.String r0 = "id"
            java.lang.String r1 = r8.getQueryParameter(r0)
            if (r1 == 0) goto L_0x027d
            X.0sb r0 = r7.A00
            java.io.File r1 = r0.A0M(r1)
        L_0x0271:
            r7.A06(r8, r1)
            int r0 = A00(r9)
            android.os.ParcelFileDescriptor r1 = android.os.ParcelFileDescriptor.open(r1, r0)
            return r1
        L_0x027d:
            java.lang.String r1 = "File not found for uri: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = r0.toString()
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contentprovider.MediaProvider.openFile(android.net.Uri, java.lang.String):android.os.ParcelFileDescriptor");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0317, code lost:
        r8 = r4.A00.A0O(A04(r3), r2);
        r7 = new java.lang.StringBuilder();
        r6 = r4.A05;
        r0 = "personal".equals(r2);
        r1 = com.obwhatsapp.R.string.str0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0331, code lost:
        if (r0 == false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0333, code lost:
        r1 = com.obwhatsapp.R.string.str074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0336, code lost:
        r7.append(r6.A09(r1));
        r7.append(".zip");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x034a, code lost:
        return A05(r3, r8, r7.toString(), r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x01d6 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007c A[Catch:{ all -> 0x0129, all -> 0x01dc }, LOOP:0: B:13:0x007a->B:14:0x007c, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r19, java.lang.String[] r20, java.lang.String r21, java.lang.String[] r22, java.lang.String r23) {
        /*
            r18 = this;
            r5 = r20
            r4 = r18
            r4.A00()
            android.content.UriMatcher r0 = A01()
            r3 = r19
            int r0 = r0.match(r3)
            switch(r0) {
                case 1: goto L_0x0028;
                case 2: goto L_0x0034;
                case 3: goto L_0x012f;
                case 4: goto L_0x01f6;
                case 5: goto L_0x020c;
                case 6: goto L_0x01f2;
                case 7: goto L_0x02ef;
                case 8: goto L_0x0014;
                case 9: goto L_0x0014;
                case 10: goto L_0x0304;
                case 11: goto L_0x0315;
                case 12: goto L_0x034b;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.String r1 = "Unknown URI "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0028:
            X.0sG r3 = r4.A01
            X.0sP r2 = r4.A02
            X.0rs r1 = r4.A03
            X.0tp r0 = new X.0tp
            r0.<init>(r3, r2, r1)
            return r0
        L_0x0034:
            java.lang.String r0 = "bucketId"
            java.lang.String r0 = r3.getQueryParameter(r0)
            X.0rv r5 = X.C15830rv.A02(r0)
            X.AnonymousClass00B.A06(r5)
            java.lang.String r0 = "include"
            java.lang.String r6 = r3.getQueryParameter(r0)
            r1 = 13
            java.lang.Byte r9 = java.lang.Byte.valueOf(r1)
            r8 = 2
            r12 = 0
            r10 = 3
            java.lang.Byte r7 = java.lang.Byte.valueOf(r10)
            r2 = 1
            java.lang.Byte r3 = java.lang.Byte.valueOf(r2)
            if (r6 == 0) goto L_0x0062
            int r0 = r6.hashCode()
            switch(r0) {
                case -1185250696: goto L_0x0112;
                case 102340: goto L_0x00fb;
                case 112202875: goto L_0x00e9;
                default: goto L_0x0062;
            }
        L_0x0062:
            X.0t6 r6 = r4.A06
            X.0t8 r1 = r4.A07
            java.lang.Byte[] r11 = new java.lang.Byte[r10]
            r11[r12] = r3
            r11[r2] = r7
            r11[r8] = r9
            X.0tq r0 = r1.A0B
            X.0tf r7 = r0.get()
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0129 }
            r4.<init>(r10)     // Catch:{ all -> 0x0129 }
            r9 = 0
        L_0x007a:
            if (r9 >= r10) goto L_0x0095
            r8 = r11[r9]     // Catch:{ all -> 0x0129 }
            java.lang.String r3 = "'"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r0.<init>(r3)     // Catch:{ all -> 0x0129 }
            r0.append(r8)     // Catch:{ all -> 0x0129 }
            r0.append(r3)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0129 }
            r4.add(r0)     // Catch:{ all -> 0x0129 }
            int r9 = r9 + 1
            goto L_0x007a
        L_0x0095:
            java.lang.String r0 = "SELECT "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r3.<init>(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = X.C16910tr.A00     // Catch:{ all -> 0x0129 }
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = " FROM "
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "available_message_view"
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = " WHERE message_type IN ("
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x0129 }
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = " AND "
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "chat_row_id  = ?"
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = " ORDER BY _id DESC"
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x0129 }
            X.0tg r3 = r7.A02     // Catch:{ all -> 0x0129 }
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0129 }
            X.0ts r0 = r1.A05     // Catch:{ all -> 0x0129 }
            long r0 = r0.A02(r5)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0129 }
            r2[r12] = r0     // Catch:{ all -> 0x0129 }
            android.database.Cursor r1 = r3.A08(r4, r2)     // Catch:{ all -> 0x0129 }
            r7.close()
            goto L_0x0122
        L_0x00e9:
            java.lang.String r0 = "video"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.0t6 r6 = r4.A06
            X.0t8 r0 = r4.A07
            android.database.Cursor r1 = r0.A02(r5, r10)
            goto L_0x0122
        L_0x00fb:
            java.lang.String r0 = "gif"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.0t6 r2 = r4.A06
            X.0t8 r0 = r4.A07
            android.database.Cursor r1 = r0.A02(r5, r1)
            r0 = 0
            X.0tt r3 = new X.0tt
            r3.<init>(r1, r2, r0, r5)
            return r3
        L_0x0112:
            java.lang.String r0 = "images"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.0t6 r6 = r4.A06
            X.0t8 r0 = r4.A07
            android.database.Cursor r1 = r0.A02(r5, r2)
        L_0x0122:
            r0 = 0
            X.0tt r3 = new X.0tt
            r3.<init>(r1, r6, r0, r5)
            return r3
        L_0x0129:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x01dc }
            goto L_0x01dc
        L_0x012f:
            if (r20 != 0) goto L_0x0133
            java.lang.String[] r5 = A0F
        L_0x0133:
            long r1 = android.content.ContentUris.parseId(r3)     // Catch:{ NumberFormatException -> 0x013f }
            X.0t6 r0 = r4.A06     // Catch:{ NumberFormatException -> 0x013f }
            X.0th r0 = r0.A0K     // Catch:{ NumberFormatException -> 0x013f }
            r0.A00(r1)     // Catch:{ NumberFormatException -> 0x013f }
            goto L_0x0145
        L_0x013f:
            r1 = move-exception
            java.lang.String r0 = "mediaprovider/getmediamessage"
            com.whatsapp.util.Log.i(r0, r1)
        L_0x0145:
            X.0tA r1 = r4.A08
            java.lang.String r0 = r3.getLastPathSegment()
            java.lang.String r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x01ce
            java.io.File r10 = new java.io.File
            r10.<init>(r0)
        L_0x0156:
            int r9 = r5.length
            java.lang.String[] r8 = new java.lang.String[r9]
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r2 = 0
            r6 = 0
        L_0x015d:
            if (r2 >= r9) goto L_0x01dd
            r11 = r5[r2]
            java.lang.String r1 = "_display_name"
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x01ae
            r8[r6] = r1
            int r17 = r6 + 1
            X.0tA r0 = r4.A08
            java.lang.String r11 = r3.getLastPathSegment()
            X.0tc r0 = r0.A00
            X.0tf r1 = r0.get()
            X.0tg r15 = r1.A02     // Catch:{ all -> 0x01d7 }
            java.lang.String r14 = "SELECT display_name FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x01d7 }
            r0 = 0
            r13[r0] = r11     // Catch:{ all -> 0x01d7 }
            r16 = 1
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01d7 }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01d7 }
            r13[r16] = r0     // Catch:{ all -> 0x01d7 }
            android.database.Cursor r11 = r15.A08(r14, r13)     // Catch:{ all -> 0x01d7 }
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x01d0 }
            if (r0 != 0) goto L_0x019b
            r0 = 0
            goto L_0x01a5
        L_0x019b:
            java.lang.String r0 = "display_name"
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d0 }
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01d0 }
        L_0x01a5:
            r11.close()     // Catch:{ all -> 0x01d7 }
            r1.close()
            r7[r6] = r0
            goto L_0x01c4
        L_0x01ae:
            java.lang.String r1 = "_size"
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x01c6
            r8[r6] = r1
            int r17 = r6 + 1
            if (r10 != 0) goto L_0x01c9
            r0 = 0
        L_0x01be:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7[r6] = r0
        L_0x01c4:
            r6 = r17
        L_0x01c6:
            int r2 = r2 + 1
            goto L_0x015d
        L_0x01c9:
            long r0 = r10.length()
            goto L_0x01be
        L_0x01ce:
            r10 = 0
            goto L_0x0156
        L_0x01d0:
            r0 = move-exception
            if (r11 == 0) goto L_0x01d6
            r11.close()     // Catch:{ all -> 0x01d6 }
        L_0x01d6:
            throw r0     // Catch:{ all -> 0x01d7 }
        L_0x01d7:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x01dc }
            throw r0
        L_0x01dc:
            throw r0
        L_0x01dd:
            java.lang.String[] r2 = new java.lang.String[r6]
            r0 = 0
            java.lang.System.arraycopy(r8, r0, r2, r0, r6)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.System.arraycopy(r7, r0, r1, r0, r6)
            r0 = 1
            android.database.MatrixCursor r3 = new android.database.MatrixCursor
            r3.<init>(r2, r0)
            r3.addRow(r1)
            return r3
        L_0x01f2:
            java.lang.String r2 = "personal"
            goto L_0x0317
        L_0x01f6:
            X.0sb r1 = r4.A00
            java.lang.String r0 = A04(r3)
            java.io.File r8 = r1.A0L(r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            X.013 r6 = r4.A05
            r1 = 2131888452(0x7f120944, float:1.941154E38)
            goto L_0x0336
        L_0x020c:
            java.util.List r2 = r3.getPathSegments()
            int r0 = r2.size()
            r1 = 2
            if (r0 < r1) goto L_0x02db
            int r0 = r2.size()
            int r0 = r0 - r1
            java.lang.Object r1 = r2.get(r0)
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r9 = android.util.Pair.create(r1, r0)
            if (r9 == 0) goto L_0x02db
            if (r20 != 0) goto L_0x0234
            java.lang.String[] r5 = A0F
        L_0x0234:
            int r10 = r5.length
            java.lang.String[] r8 = new java.lang.String[r10]
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r6 = 0
            r3 = 0
        L_0x023b:
            r15 = 1
            if (r6 >= r10) goto L_0x02c7
            r2 = r5[r6]
            java.lang.String r1 = "_display_name"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x02a5
            r8[r3] = r1
            java.lang.Object r0 = r9.first
            java.lang.String r0 = (java.lang.String) r0
            X.0rv r0 = X.C15830rv.A02(r0)
            java.lang.String r12 = ".txt"
            if (r0 == 0) goto L_0x0288
            int r16 = r3 + 1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            X.013 r14 = r4.A05
            r11 = 2131887986(0x7f120772, float:1.9410595E38)
            java.lang.Object[] r2 = new java.lang.Object[r15]
            X.0sP r1 = r4.A02
            X.0sG r15 = r4.A01
            X.0sH r0 = r15.A0A(r0)
            java.lang.String r1 = r1.A08(r0)
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = r14.A0C(r11, r2)
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = r13.toString()
            r7[r3] = r0
            r3 = r16
        L_0x0285:
            int r6 = r6 + 1
            goto L_0x023b
        L_0x0288:
            int r11 = r3 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            X.013 r1 = r4.A05
            r0 = 2131887987(0x7f120773, float:1.9410597E38)
            java.lang.String r0 = r1.A09(r0)
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            r7[r3] = r0
            goto L_0x02c5
        L_0x02a5:
            java.lang.String r1 = "_size"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0285
            r8[r3] = r1
            int r11 = r3 + 1
            X.0sb r1 = r4.A00
            java.lang.Object r0 = r9.second
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r0 = r1.A0I(r0)
            long r0 = r0.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7[r3] = r0
        L_0x02c5:
            r3 = r11
            goto L_0x0285
        L_0x02c7:
            java.lang.String[] r2 = new java.lang.String[r3]
            r1 = 0
            java.lang.System.arraycopy(r8, r1, r2, r1, r3)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.System.arraycopy(r7, r1, r0, r1, r3)
            android.database.MatrixCursor r3 = new android.database.MatrixCursor
            r3.<init>(r2, r15)
            r3.addRow(r0)
            return r3
        L_0x02db:
            java.lang.String r1 = "Unknown URI "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02ef:
            X.0sb r1 = r4.A00
            java.lang.String r0 = A04(r3)
            java.io.File r8 = r1.A0J(r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            X.013 r6 = r4.A05
            r1 = 2131889898(0x7f120eea, float:1.9414473E38)
            goto L_0x0336
        L_0x0304:
            X.0sb r1 = r4.A00
            java.lang.String r0 = A04(r3)
            java.io.File r1 = r1.A0M(r0)
            java.lang.String r0 = "logs.zip"
            android.database.Cursor r3 = r4.A05(r3, r1, r0, r5)
            return r3
        L_0x0315:
            java.lang.String r2 = "business"
        L_0x0317:
            X.0sb r1 = r4.A00
            java.lang.String r0 = A04(r3)
            java.io.File r8 = r1.A0O(r0, r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            X.013 r6 = r4.A05
            java.lang.String r0 = "personal"
            boolean r0 = r0.equals(r2)
            r1 = 2131887939(0x7f120743, float:1.94105E38)
            if (r0 == 0) goto L_0x0336
            r1 = 2131887950(0x7f12074e, float:1.9410522E38)
        L_0x0336:
            java.lang.String r0 = r6.A09(r1)
            r7.append(r0)
            java.lang.String r0 = ".zip"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.database.Cursor r3 = r4.A05(r3, r8, r0, r5)
            return r3
        L_0x034b:
            java.lang.String r1 = "Developer debug info asked in non debug build: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contentprovider.MediaProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A00();
        throw new UnsupportedOperationException();
    }
}

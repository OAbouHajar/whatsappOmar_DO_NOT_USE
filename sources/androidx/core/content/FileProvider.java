package androidx.core.content;

import X.AnonymousClass01N;
import X.AnonymousClass01O;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class FileProvider extends ContentProvider {
    public static final File A01 = new File("/");
    public static final HashMap A02 = new HashMap();
    public static final String[] A03 = {"_display_name", "_size"};
    public AnonymousClass01O A00;

    public static Uri A00(Context context, File file, String str) {
        AnonymousClass01N r4 = (AnonymousClass01N) A01(context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : r4.A01.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                String substring = canonicalPath.substring(length);
                StringBuilder sb = new StringBuilder();
                sb.append(Uri.encode((String) entry.getKey()));
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append(Uri.encode(substring, "/"));
                return new Uri.Builder().scheme("content").authority(r4.A00).encodedPath(sb.toString()).build();
            }
            StringBuilder sb2 = new StringBuilder("Failed to find configured root that contains ");
            sb2.append(canonicalPath);
            throw new IllegalArgumentException(sb2.toString());
        } catch (IOException unused) {
            StringBuilder sb3 = new StringBuilder("Failed to resolve canonical path for ");
            sb3.append(file);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        r0 = new java.lang.StringBuilder("Failed to resolve canonical path for ");
        r0.append(r7);
        r1 = new java.lang.IllegalArgumentException(r0.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0105, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0110, code lost:
        r2 = new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0105 A[ExcHandler: XmlPullParserException (r1v1 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:5:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass01O A01(android.content.Context r10, java.lang.String r11) {
        /*
            java.util.HashMap r3 = A02
            monitor-enter(r3)
            java.lang.Object r5 = r3.get(r11)     // Catch:{ all -> 0x011d }
            X.01O r5 = (X.AnonymousClass01O) r5     // Catch:{ all -> 0x011d }
            if (r5 != 0) goto L_0x011b
            X.01N r5 = new X.01N     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r5.<init>(r11)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r2 = r1.resolveContentProvider(r11, r0)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            if (r2 == 0) goto L_0x00f0
            java.lang.String r1 = "android.support.FILE_PROVIDER_PATHS"
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            android.content.res.XmlResourceParser r4 = r2.loadXmlMetaData(r0, r1)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            if (r4 != 0) goto L_0x0030
            java.lang.String r0 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
        L_0x002f:
            throw r1     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
        L_0x0030:
            int r1 = r4.next()     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r6 = 1
            if (r1 == r6) goto L_0x0118
            r0 = 2
            if (r1 != r0) goto L_0x0030
            java.lang.String r7 = r4.getName()     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r1 = 0
            java.lang.String r0 = "name"
            java.lang.String r2 = r4.getAttributeValue(r1, r0)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            java.lang.String r0 = "path"
            java.lang.String r9 = r4.getAttributeValue(r1, r0)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            java.lang.String r0 = "root-path"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r8 = 0
            if (r0 == 0) goto L_0x0057
            java.io.File r7 = A01     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            goto L_0x00b0
        L_0x0057:
            java.lang.String r0 = "files-path"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            if (r0 == 0) goto L_0x0064
            java.io.File r7 = r10.getFilesDir()     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            goto L_0x00b0
        L_0x0064:
            java.lang.String r0 = "cache-path"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            if (r0 == 0) goto L_0x0071
            java.io.File r7 = r10.getCacheDir()     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            goto L_0x00b0
        L_0x0071:
            java.lang.String r0 = "external-path"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            if (r0 == 0) goto L_0x007e
            java.io.File r7 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            goto L_0x00b0
        L_0x007e:
            java.lang.String r0 = "external-files-path"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            if (r0 == 0) goto L_0x0090
            java.io.File[] r1 = X.AnonymousClass00T.A0K(r10)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
        L_0x008a:
            int r0 = r1.length     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            if (r0 <= 0) goto L_0x0030
            r7 = r1[r8]     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            goto L_0x00b0
        L_0x0090:
            java.lang.String r0 = "external-cache-path"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            if (r0 == 0) goto L_0x009d
            java.io.File[] r1 = X.AnonymousClass00T.A0J(r10)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            goto L_0x008a
        L_0x009d:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r0 = 21
            if (r1 < r0) goto L_0x0030
            java.lang.String r0 = "external-media-path"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            if (r0 == 0) goto L_0x0030
            java.io.File[] r1 = X.AnonymousClass0LP.A00(r10)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            goto L_0x008a
        L_0x00b0:
            if (r7 == 0) goto L_0x0030
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r0[r8] = r9     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r1 = r0[r8]     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            if (r1 == 0) goto L_0x00c0
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r0.<init>(r7, r1)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r7 = r0
        L_0x00c0:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            if (r0 != 0) goto L_0x00e7
            java.io.File r1 = r7.getCanonicalFile()     // Catch:{ IOException -> 0x00d1, XmlPullParserException -> 0x0105 }
            java.util.HashMap r0 = r5.A01     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r0.put(r2, r1)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            goto L_0x0030
        L_0x00d1:
            r2 = move-exception
            java.lang.String r1 = "Failed to resolve canonical path for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r0.append(r7)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            goto L_0x002f
        L_0x00e7:
            java.lang.String r0 = "Name must not be empty"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            goto L_0x002f
        L_0x00f0:
            java.lang.String r1 = "Couldn't find meta-data for provider with authority "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r0.append(r11)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0107, XmlPullParserException -> 0x0105 }
            goto L_0x002f
        L_0x0105:
            r1 = move-exception
            goto L_0x0110
        L_0x0107:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x011d }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x011d }
            goto L_0x0117
        L_0x0110:
            java.lang.String r0 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x011d }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x011d }
        L_0x0117:
            throw r2     // Catch:{ all -> 0x011d }
        L_0x0118:
            r3.put(r11, r5)     // Catch:{ all -> 0x011d }
        L_0x011b:
            monitor-exit(r3)     // Catch:{ all -> 0x011d }
            return r5
        L_0x011d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x011d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.A01(android.content.Context, java.lang.String):X.01O");
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            HashMap hashMap = A02;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
            this.A00 = A01(context, str);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.A00.ACF(uri).delete() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r2.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r4) {
        /*
            r3 = this;
            X.01O r0 = r3.A00
            java.io.File r2 = r0.ACF(r4)
            java.lang.String r1 = r2.getName()
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto L_0x0027
            java.lang.String r1 = r2.getName()
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = r0.getMimeTypeFromExtension(r1)
            if (r0 == 0) goto L_0x0027
            return r0
        L_0x0027:
            java.lang.String r0 = "application/octet-stream"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.getType(android.net.Uri):java.lang.String");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i2;
        File ACF = this.A00.ACF(uri);
        if ("r".equals(str)) {
            i2 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i2 = 738197504;
        } else if ("wa".equals(str)) {
            i2 = 704643072;
        } else if ("rw".equals(str)) {
            i2 = 939524096;
        } else if ("rwt".equals(str)) {
            i2 = 1006632960;
        } else {
            StringBuilder sb = new StringBuilder("Invalid mode: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        return ParcelFileDescriptor.open(ACF, i2);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        File ACF = this.A00.ACF(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = A03;
        }
        String[] strArr3 = new String[r7];
        Object[] objArr = new Object[r7];
        int i3 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i2 = i3 + 1;
                objArr[i3] = queryParameter == null ? ACF.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i2 = i3 + 1;
                objArr[i3] = Long.valueOf(ACF.length());
            }
            i3 = i2;
        }
        String[] strArr4 = new String[i3];
        System.arraycopy(strArr3, 0, strArr4, 0, i3);
        Object[] objArr2 = new Object[i3];
        System.arraycopy(objArr, 0, objArr2, 0, i3);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}

package X;

import android.graphics.Bitmap;
import com.facebook.redex.IDxNConsumerShape9S0400000_2_I0;
import com.obwhatsapp.R;
import com.whatsapp.util.DocumentWarningDialogFragment;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0xJ  reason: invalid class name and case insensitive filesystem */
public class C18820xJ {
    public static final AnonymousClass00F A03 = new AnonymousClass00F(1, 1);
    public static final Object A04 = new Object();
    public static final Set A05 = new HashSet(Arrays.asList(new String[]{"wmv", "aif", "cda", "mpa", "opus", "ogg", "wlp", "amr", "mp3", "m4a", "aac", "wav", "wma"}));
    public static final Set A06 = new HashSet(Arrays.asList(new String[]{"7z", "arj", "deb", "pkg", "rar", "rpm", "gz", "z", "zip"}));
    public static final Set A07 = new HashSet(Arrays.asList(new String[]{"pdf", "doc", "docx", "ppt", "pptx", "xls", "xlsx", "txt", "rtf", "tex", "csv", "wpd"}));
    public static final Set A08 = new HashSet(Arrays.asList(new String[]{"apk", "bat", "bin", "cgi", "pl", "com", "exe", "gadget", "jar", "msi", "py", "wsf"}));
    public static final Set A09 = new HashSet(Arrays.asList(new String[]{"ai", "ico", "jpeg", "jpg", "png", "ps", "psd", "svg", "tif", "tiff"}));
    public static final Set A0A = new HashSet(Arrays.asList(new String[]{"3g2", "3gp", "avi", "flv", "h264", "m4v", "mkv", "mov", "mp4", "mpg", "mpeg", "rm", "vob"}));
    public final C16980tz A00;
    public final C14710pd A01;
    public final C18830xK A02;

    public C18820xJ(C16980tz r1, C14710pd r2, C18830xK r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0151, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0152, code lost:
        com.whatsapp.util.Log.i("documentutils/getpagecount ", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x015a, code lost:
        throw new X.C41941wu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        com.whatsapp.util.Log.i("documentutils/sheetcount ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ee, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x013d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        com.whatsapp.util.Log.i("documentutils/slidecount ", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0142, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0143, code lost:
        com.whatsapp.util.Log.i("documentutils/slidecount ", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0085 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00e7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x013c */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0151 A[ExcHandler: 1wv | ZipException (r0v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x0085=Splitter:B:36:0x0085, B:27:0x005f=Splitter:B:27:0x005f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x0085=Splitter:B:36:0x0085, B:84:0x0116=Splitter:B:84:0x0116, B:61:0x00e7=Splitter:B:61:0x00e7, B:93:0x013c=Splitter:B:93:0x013c, B:27:0x005f=Splitter:B:27:0x005f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:84:0x0116=Splitter:B:84:0x0116, B:93:0x013c=Splitter:B:93:0x013c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.io.File r8, java.lang.String r9) {
        /*
            java.lang.String r2 = "documentutils/getpagecount "
            r7 = 0
            java.lang.String r0 = "application/pdf"
            boolean r0 = r0.equals(r9)     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
            if (r0 == 0) goto L_0x0016
            X.1wt r0 = new X.1wt     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
            r0.<init>(r8)     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
            r0.A04()     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
            int r5 = r0.A00     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
            return r5
        L_0x0016:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            boolean r0 = r0.equals(r9)     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
            if (r0 == 0) goto L_0x0086
            java.lang.String r3 = "documentutils/slidecount "
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x0142, 1wv | ZipException -> 0x0151 }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0142, 1wv | ZipException -> 0x0151 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0142, 1wv | ZipException -> 0x0151 }
            java.lang.String r0 = "[Content_Types].xml"
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0063
            r5 = 0
            java.lang.String r0 = "Slides"
            int r5 = A01(r0, r4)     // Catch:{ IOException -> 0x003b }
            if (r5 != 0) goto L_0x005f
            goto L_0x003f
        L_0x003b:
            r0 = move-exception
            com.whatsapp.util.Log.i(r3, r0)     // Catch:{ all -> 0x0081 }
        L_0x003f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r6.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "ppt/slides/slide"
            r6.append(r0)     // Catch:{ all -> 0x0081 }
            int r1 = r5 + 1
            r6.append(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = ".xml"
            r6.append(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0081 }
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x005f
            r5 = r1
            goto L_0x003f
        L_0x005f:
            r4.close()     // Catch:{ IOException -> 0x0142, 1wv | ZipException -> 0x0151 }
            return r5
        L_0x0063:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r1.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "documentutils/no content types in "
            r1.append(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x0081 }
            r1.append(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0081 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0081 }
            X.1wu r0 = new X.1wu     // Catch:{ all -> 0x0081 }
            r0.<init>()     // Catch:{ all -> 0x0081 }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0085 }
        L_0x0085:
            throw r0     // Catch:{ IOException -> 0x0142, 1wv | ZipException -> 0x0151 }
        L_0x0086:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            boolean r0 = r0.equals(r9)     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x00e8, 1wv | ZipException -> 0x0151 }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00e8, 1wv | ZipException -> 0x0151 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00e8, 1wv | ZipException -> 0x0151 }
            java.lang.String r0 = "[Content_Types].xml"
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x00c5
            r5 = 0
        L_0x00a0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r3.<init>()     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "xl/worksheets/sheet"
            r3.append(r0)     // Catch:{ all -> 0x00e3 }
            int r1 = r5 + 1
            r3.append(r1)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = ".xml"
            r3.append(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00e3 }
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x00c1
            r5 = r1
            goto L_0x00a0
        L_0x00c1:
            r4.close()     // Catch:{ IOException -> 0x00e8, 1wv | ZipException -> 0x0151 }
            return r5
        L_0x00c5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r1.<init>()     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "documentutils/no content types in "
            r1.append(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x00e3 }
            r1.append(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e3 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00e3 }
            X.1wu r0 = new X.1wu     // Catch:{ all -> 0x00e3 }
            r0.<init>()     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            throw r0     // Catch:{ IOException -> 0x00e8, 1wv | ZipException -> 0x0151 }
        L_0x00e8:
            r1 = move-exception
            java.lang.String r0 = "documentutils/sheetcount "
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
            throw r1     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
        L_0x00ef:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r0.equals(r9)     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
            if (r0 == 0) goto L_0x014b
            java.lang.String r4 = "documentutils/slidecount "
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x013d, 1wv | ZipException -> 0x0151 }
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x013d, 1wv | ZipException -> 0x0151 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x013d, 1wv | ZipException -> 0x0151 }
            java.lang.String r0 = "[Content_Types].xml"
            java.util.zip.ZipEntry r0 = r3.getEntry(r0)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x011a
            r5 = 0
            java.lang.String r0 = "Pages"
            int r5 = A01(r0, r3)     // Catch:{ IOException -> 0x0112 }
            goto L_0x0116
        L_0x0112:
            r0 = move-exception
            com.whatsapp.util.Log.i(r4, r0)     // Catch:{ all -> 0x0138 }
        L_0x0116:
            r3.close()     // Catch:{ IOException -> 0x013d, 1wv | ZipException -> 0x0151 }
            return r5
        L_0x011a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r1.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "documentutils/no content types in "
            r1.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x0138 }
            r1.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0138 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0138 }
            X.1wu r0 = new X.1wu     // Catch:{ all -> 0x0138 }
            r0.<init>()     // Catch:{ all -> 0x0138 }
            throw r0     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x013c }
        L_0x013c:
            throw r0     // Catch:{ IOException -> 0x013d, 1wv | ZipException -> 0x0151 }
        L_0x013d:
            r0 = move-exception
            com.whatsapp.util.Log.i(r4, r0)     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
            goto L_0x0146
        L_0x0142:
            r0 = move-exception
            com.whatsapp.util.Log.i(r3, r0)     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
        L_0x0146:
            throw r0     // Catch:{ 1wv | ZipException -> 0x0151, 1wu -> 0x014c, Exception -> 0x0147 }
        L_0x0147:
            r0 = move-exception
            com.whatsapp.util.Log.i(r2, r0)
        L_0x014b:
            return r7
        L_0x014c:
            r0 = move-exception
            com.whatsapp.util.Log.i(r2, r0)
            throw r0
        L_0x0151:
            r0 = move-exception
            com.whatsapp.util.Log.i(r2, r0)
            X.1wu r0 = new X.1wu
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18820xJ.A00(java.io.File, java.lang.String):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0076 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.lang.String r7, java.util.zip.ZipFile r8) {
        /*
            java.lang.String r0 = "docProps/app.xml"
            java.util.zip.ZipEntry r2 = r8.getEntry(r0)
            r4 = 0
            if (r2 == 0) goto L_0x0083
            java.lang.String r0 = "<"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = "[^>]*>(.*)</"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ">"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 34
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r1, r0)
            java.io.InputStream r3 = r8.getInputStream(r2)
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x0077 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x0077 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0077 }
            java.io.StringWriter r5 = new java.io.StringWriter     // Catch:{ all -> 0x0072 }
            r5.<init>()     // Catch:{ all -> 0x0072 }
            r0 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r0]     // Catch:{ all -> 0x0072 }
        L_0x003e:
            int r1 = r6.read(r2)     // Catch:{ all -> 0x0072 }
            r0 = -1
            if (r1 == r0) goto L_0x0049
            r5.write(r2, r4, r1)     // Catch:{ all -> 0x0072 }
            goto L_0x003e
        L_0x0049:
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0072 }
            r6.close()     // Catch:{ all -> 0x0077 }
            java.util.regex.Matcher r1 = r7.matcher(r0)     // Catch:{ all -> 0x0077 }
            boolean r0 = r1.find()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x007e
            r0 = 1
            java.lang.String r0 = r1.group(r0)     // Catch:{ all -> 0x0077 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x0077 }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x006b }
            goto L_0x007e
        L_0x006b:
            r1 = move-exception
            java.lang.String r0 = "documentutils/count "
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0077 }
            goto L_0x007e
        L_0x0072:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0076 }
        L_0x0076:
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            if (r3 == 0) goto L_0x007d
            r3.close()     // Catch:{ all -> 0x007d }
        L_0x007d:
            throw r0
        L_0x007e:
            if (r3 == 0) goto L_0x0083
            r3.close()
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18820xJ.A01(java.lang.String, java.util.zip.ZipFile):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A02(X.AnonymousClass01V r12, java.util.List r13) {
        /*
            r0 = 0
            r5 = 0
        L_0x0003:
            int r2 = r13.size()
            if (r5 >= r2) goto L_0x0068
            java.lang.Object r7 = r13.get(r5)
            android.net.Uri r7 = (android.net.Uri) r7
            java.io.File r2 = X.AnonymousClass1XI.A03(r7)
            if (r2 == 0) goto L_0x0020
            long r6 = r2.length()
        L_0x0019:
            float r3 = (float) r6
            float r2 = (float) r0
            float r2 = r2 + r3
            long r0 = (long) r2
            int r5 = r5 + 1
            goto L_0x0003
        L_0x0020:
            r2 = 2
            java.lang.String[] r8 = new java.lang.String[r2]
            r3 = 0
            java.lang.String r2 = "_display_name"
            r8[r3] = r2
            r3 = 1
            java.lang.String r2 = "_size"
            r8[r3] = r2
            android.content.ContentResolver r6 = r12.A0C()
            if (r6 != 0) goto L_0x003b
            java.lang.String r2 = "document-utils/get-document-size cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x0038:
            r6 = 0
            goto L_0x0019
        L_0x003b:
            r9 = 0
            r11 = r9
            r10 = r9
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0061 }
            if (r4 == 0) goto L_0x0038
            int r3 = r4.getColumnIndex(r2)     // Catch:{ all -> 0x005c }
            if (r3 < 0) goto L_0x0058
            boolean r2 = r4.moveToFirst()     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0058
            long r6 = r4.getLong(r3)     // Catch:{ all -> 0x005c }
            r4.close()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0061 }
            goto L_0x0019
        L_0x0058:
            r4.close()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0061 }
            goto L_0x0038
        L_0x005c:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r2     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0061 }
        L_0x0061:
            r3 = move-exception
            java.lang.String r2 = "document-utils/get-document-size/unexpected exception"
            com.whatsapp.util.Log.w(r2, r3)
            goto L_0x0038
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18820xJ.A02(X.01V, java.util.List):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:(2:11|12)|(3:17|(7:19|(3:22|23|(1:25)(1:27))|26|(2:29|31)(1:30)|32|33|34)|41)|42|43|44|45|46|51) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A03(java.lang.String r10, int r11, int r12, int r13, boolean r14) {
        /*
            java.lang.Object r9 = A04
            monitor-enter(r9)
            r6 = 0
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0010 }
            r1.<init>(r10)     // Catch:{ FileNotFoundException -> 0x0010 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r7 = android.os.ParcelFileDescriptor.open(r1, r0)     // Catch:{ FileNotFoundException -> 0x0010 }
            goto L_0x0015
        L_0x0010:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x0085 }
            r7 = r6
        L_0x0015:
            if (r7 != 0) goto L_0x0019
            monitor-exit(r9)     // Catch:{ all -> 0x0085 }
            return r6
        L_0x0019:
            android.graphics.pdf.PdfRenderer r5 = new android.graphics.pdf.PdfRenderer     // Catch:{ IOException | SecurityException -> 0x001f }
            r5.<init>(r7)     // Catch:{ IOException | SecurityException -> 0x001f }
            goto L_0x0024
        L_0x001f:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x0085 }
            r5 = r6
        L_0x0024:
            if (r5 == 0) goto L_0x0080
            int r0 = r5.getPageCount()     // Catch:{ all -> 0x0085 }
            if (r0 <= 0) goto L_0x007d
            r0 = 0
            android.graphics.pdf.PdfRenderer$Page r4 = r5.openPage(r0)     // Catch:{ all -> 0x0085 }
            if (r11 <= 0) goto L_0x0035
            if (r12 > 0) goto L_0x0042
        L_0x0035:
            int r11 = r4.getWidth()     // Catch:{ all -> 0x0076 }
            int r12 = r4.getHeight()     // Catch:{ all -> 0x0076 }
            if (r11 <= r12) goto L_0x0052
            int r12 = r12 * r13
            int r12 = r12 / r11
            r11 = r13
        L_0x0042:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0076 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r11, r12, r0)     // Catch:{ all -> 0x0076 }
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch:{ all -> 0x0076 }
            r1.<init>(r8)     // Catch:{ all -> 0x0076 }
            r0 = -1
            r1.drawColor(r0)     // Catch:{ all -> 0x0076 }
            goto L_0x0056
        L_0x0052:
            int r11 = r11 * r13
            int r11 = r11 / r12
            r12 = r13
            goto L_0x0042
        L_0x0056:
            if (r14 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = r6
            goto L_0x006d
        L_0x005b:
            int r2 = r4.getWidth()     // Catch:{ all -> 0x0076 }
            android.graphics.Matrix r3 = new android.graphics.Matrix     // Catch:{ all -> 0x0076 }
            r3.<init>()     // Catch:{ all -> 0x0076 }
            float r1 = (float) r11     // Catch:{ all -> 0x0076 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            float r0 = (float) r2     // Catch:{ all -> 0x0076 }
            float r1 = r1 / r0
            r3.setScale(r1, r1)     // Catch:{ all -> 0x0076 }
        L_0x006d:
            r0 = 1
            r4.render(r8, r6, r3, r0)     // Catch:{ all -> 0x0076 }
            r4.close()     // Catch:{ all -> 0x0085 }
            r6 = r8
            goto L_0x007d
        L_0x0076:
            r0 = move-exception
            if (r4 == 0) goto L_0x007c
            r4.close()     // Catch:{ all -> 0x007c }
        L_0x007c:
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x007d:
            r5.close()     // Catch:{ all -> 0x0085 }
        L_0x0080:
            r7.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            monitor-exit(r9)     // Catch:{ all -> 0x0085 }
            goto L_0x0088
        L_0x0085:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0085 }
            throw r0
        L_0x0088:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18820xJ.A03(java.lang.String, int, int, int, boolean):android.graphics.Bitmap");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(android.net.Uri r8, X.AnonymousClass01V r9) {
        /*
            r5 = r8
            java.io.File r0 = X.AnonymousClass1XI.A03(r8)
            if (r0 == 0) goto L_0x000c
            java.lang.String r7 = r0.getName()
        L_0x000b:
            return r7
        L_0x000c:
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r3 = "_display_name"
            r6[r0] = r3
            r1 = 1
            java.lang.String r0 = "_size"
            r6[r1] = r0
            android.content.ContentResolver r4 = r9.A0C()
            r7 = 0
            if (r4 != 0) goto L_0x0026
            java.lang.String r0 = "document-utils/get-document-title cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x0026:
            r9 = r7
            r8 = r7
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x004b }
            if (r2 == 0) goto L_0x000b
            int r1 = r2.getColumnIndex(r3)     // Catch:{ all -> 0x0046 }
            if (r1 < 0) goto L_0x0042
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x0046 }
            r2.close()     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x004b }
            return r0
        L_0x0042:
            r2.close()     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x004b }
            return r7
        L_0x0046:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x004b }
        L_0x004b:
            r1 = move-exception
            java.lang.String r0 = "document-utils/get-document-title/unexpected exception"
            com.whatsapp.util.Log.w(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18820xJ.A04(android.net.Uri, X.01V):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r7.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r4 = com.obwhatsapp.R.plurals.plurals00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r7.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        r4 = com.obwhatsapp.R.plurals.plurals00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r7.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r4 = com.obwhatsapp.R.plurals.plurals00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return r6.A0J(new java.lang.Object[]{java.lang.Integer.valueOf(r8)}, r4, (long) r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A05(X.AnonymousClass013 r6, java.lang.String r7, int r8) {
        /*
            java.lang.String r2 = ""
            if (r7 == 0) goto L_0x000f
            if (r8 == 0) goto L_0x000f
            int r0 = r7.hashCode()
            r1 = 1
            r5 = 0
            switch(r0) {
                case -1248334925: goto L_0x0010;
                case -1073633483: goto L_0x0013;
                case -1071817359: goto L_0x0016;
                case -1050893613: goto L_0x0022;
                case -366307023: goto L_0x0025;
                case 904647503: goto L_0x0028;
                case 1993842850: goto L_0x0034;
                default: goto L_0x000f;
            }
        L_0x000f:
            return r2
        L_0x0010:
            java.lang.String r0 = "application/pdf"
            goto L_0x002a
        L_0x0013:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            goto L_0x0018
        L_0x0016:
            java.lang.String r0 = "application/vnd.ms-powerpoint"
        L_0x0018:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x000f
            r4 = 2131755252(0x7f1000f4, float:1.9141378E38)
            goto L_0x003f
        L_0x0022:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            goto L_0x002a
        L_0x0025:
            java.lang.String r0 = "application/vnd.ms-excel"
            goto L_0x0036
        L_0x0028:
            java.lang.String r0 = "application/msword"
        L_0x002a:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x000f
            r4 = 2131755249(0x7f1000f1, float:1.9141372E38)
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        L_0x0036:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x000f
            r4 = 2131755251(0x7f1000f3, float:1.9141376E38)
        L_0x003f:
            long r2 = (long) r8
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r5] = r0
            java.lang.String r0 = r6.A0J(r1, r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18820xJ.A05(X.013, java.lang.String, int):java.lang.String");
    }

    public static void A06(C19980zJ r8, C16300so r9, C14550pN r10, C14870pt r11, C16500tA r12, C38631rA r13, AnonymousClass1PD r14, C16320sq r15) {
        long j2;
        int i2;
        C38631rA r5 = r13;
        C16750ta r2 = r13.A02;
        AnonymousClass00B.A06(r2);
        File file = r2.A0F;
        if (file == null || !file.exists()) {
            r14.A01(r10);
            return;
        }
        if (!r13.A11.A02 && "apk".equalsIgnoreCase(AnonymousClass1XI.A08(r2.A0F.getAbsolutePath()))) {
            j2 = r13.A13;
            i2 = R.string.str1b75;
        } else if (r2.A07 == 3) {
            j2 = r13.A13;
            i2 = R.string.str1b76;
        } else {
            WeakReference weakReference = new WeakReference(r10);
            r11.A08(0, R.string.str0c8c);
            IDxNConsumerShape9S0400000_2_I0 iDxNConsumerShape9S0400000_2_I0 = new IDxNConsumerShape9S0400000_2_I0(r8, r11, r5, weakReference, 1);
            C41961wy r1 = new C41961wy(r9, r12, r13);
            r1.A01(iDxNConsumerShape9S0400000_2_I0, r11.A06);
            r15.Acl(r1);
            return;
        }
        DocumentWarningDialogFragment.A01(i2, j2).A1G(r10.AGM(), (String) null);
    }

    public static boolean A07(String str) {
        return "image/jpeg".equals(str) || "image/jpg".equals(str) || "image/gif".equals(str) || "image/png".equals(str) || "image/webp".equals(str);
    }

    public static byte[] A08(Bitmap bitmap) {
        byte[] byteArray;
        int i2 = 80;
        do {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            StringBuilder sb = new StringBuilder("documentutils/docthumb ");
            int length = byteArray.length;
            sb.append(length);
            sb.append(" ");
            sb.append(i2);
            Log.i(sb.toString());
            i2 -= 5;
            if (length <= 20480) {
                break;
            }
        } while (i2 > 0);
        return byteArray;
    }

    public boolean A09(String str) {
        if (str == null) {
            return false;
        }
        if ("application/pdf".equals(str) || "application/vnd.openxmlformats-officedocument.presentationml.presentation".equals(str) || "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".equals(str) || "application/vnd.openxmlformats-officedocument.wordprocessingml.document".equals(str)) {
            return true;
        }
        if (this.A01.A0E(C16620tM.A02, 1258)) {
            return A07(str) || AnonymousClass1A9.A0T(str);
        }
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0110 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0119 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:75:0x0111=Splitter:B:75:0x0111, B:81:0x0119=Splitter:B:81:0x0119} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A0A(java.io.File r16, java.lang.String r17, float r18) {
        /*
            r15 = this;
            r7 = 0
            r4 = r16
            if (r16 == 0) goto L_0x0127
            r2 = r17
            boolean r0 = r15.A09(r2)
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = "application/pdf"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0121 }
            r1 = 1139802112(0x43f00000, float:480.0)
            if (r0 == 0) goto L_0x0037
            float r18 = r18 * r1
            int r3 = java.lang.Math.round(r18)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r2 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0121 }
            r1 = 0
            boolean r0 = X.C41971wz.A06()     // Catch:{ Exception -> 0x0121 }
            if (r0 != 0) goto L_0x0036
            android.graphics.Bitmap r0 = A03(r2, r1, r1, r3, r1)     // Catch:{ Exception -> 0x0121 }
            if (r0 == 0) goto L_0x0036
            byte[] r6 = A08(r0)     // Catch:{ Exception -> 0x0121 }
            r0.recycle()     // Catch:{ Exception -> 0x0121 }
            return r6
        L_0x0036:
            return r7
        L_0x0037:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0121 }
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0121 }
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0121 }
            if (r0 != 0) goto L_0x0096
            r0 = 1120403456(0x42c80000, float:100.0)
            float r18 = r18 * r0
            int r3 = java.lang.Math.round(r18)     // Catch:{ Exception -> 0x0121 }
            boolean r0 = A07(r2)     // Catch:{ Exception -> 0x0121 }
            if (r0 == 0) goto L_0x0068
            X.0xK r1 = r15.A02     // Catch:{ Exception -> 0x0121 }
            android.net.Uri r0 = android.net.Uri.fromFile(r4)     // Catch:{ Exception -> 0x0121 }
            byte[] r6 = r1.A04(r0, r3, r3)     // Catch:{ Exception -> 0x0121 }
            return r6
        L_0x0068:
            boolean r0 = X.AnonymousClass1A9.A0T(r2)     // Catch:{ Exception -> 0x0121 }
            if (r0 == 0) goto L_0x0127
            r2 = 0
            X.C41911wr.A04(r4)     // Catch:{ IOException -> 0x0074 }
            r0 = 1
            goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            if (r0 == 0) goto L_0x0080
            android.graphics.Bitmap r2 = X.C41911wr.A00(r4)     // Catch:{ IOException | IllegalArgumentException -> 0x007c, Exception -> 0x008b }
            goto L_0x0091
        L_0x007c:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
            goto L_0x008e
        L_0x0080:
            r1 = 0
            X.1wp r0 = new X.1wp     // Catch:{ Exception -> 0x0121 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0121 }
            android.graphics.Bitmap r2 = X.C18830xK.A00(r0, r3, r1)     // Catch:{ Exception -> 0x0121 }
            goto L_0x0091
        L_0x008b:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
        L_0x008e:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0121 }
        L_0x0091:
            byte[] r6 = X.C18830xK.A03(r2, r3)     // Catch:{ Exception -> 0x0121 }
            return r6
        L_0x0096:
            float r18 = r18 * r1
            int r5 = java.lang.Math.round(r18)     // Catch:{ Exception -> 0x0121 }
            r6 = 0
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x011a }
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x011a }
            r3.<init>(r0)     // Catch:{ IOException -> 0x011a }
            java.lang.String r0 = "docProps/thumbnail.jpeg"
            java.util.zip.ZipEntry r0 = r3.getEntry(r0)     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x0111
            java.io.InputStream r4 = r3.getInputStream(r0)     // Catch:{ all -> 0x0115 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x010a }
            r1.<init>()     // Catch:{ all -> 0x010a }
            r0 = 1
            r1.inDither = r0     // Catch:{ all -> 0x010a }
            android.graphics.Bitmap r8 = X.C37741pe.A02(r1, r4)     // Catch:{ all -> 0x010a }
            if (r8 == 0) goto L_0x0104
            int r0 = r8.getWidth()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0104
            int r0 = r8.getHeight()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0104
            int r1 = r8.getWidth()     // Catch:{ all -> 0x010a }
            int r0 = r8.getHeight()     // Catch:{ all -> 0x010a }
            int r2 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x010a }
            if (r2 <= r5) goto L_0x00fd
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r5     // Catch:{ all -> 0x010a }
            float r1 = r1 * r0
            float r0 = (float) r2     // Catch:{ all -> 0x010a }
            float r1 = r1 / r0
            android.graphics.Matrix r13 = new android.graphics.Matrix     // Catch:{ all -> 0x010a }
            r13.<init>()     // Catch:{ all -> 0x010a }
            r13.setScale(r1, r1)     // Catch:{ all -> 0x010a }
            r9 = 0
            int r11 = r8.getWidth()     // Catch:{ all -> 0x010a }
            int r12 = r8.getHeight()     // Catch:{ all -> 0x010a }
            r14 = 1
            r10 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x010a }
            if (r0 == r8) goto L_0x00fd
            r8.recycle()     // Catch:{ all -> 0x010a }
            r8 = r0
        L_0x00fd:
            byte[] r6 = A08(r8)     // Catch:{ all -> 0x010a }
            r8.recycle()     // Catch:{ all -> 0x010a }
        L_0x0104:
            if (r4 == 0) goto L_0x0111
            r4.close()     // Catch:{ all -> 0x0115 }
            goto L_0x0111
        L_0x010a:
            r0 = move-exception
            if (r4 == 0) goto L_0x0110
            r4.close()     // Catch:{ all -> 0x0110 }
        L_0x0110:
            throw r0     // Catch:{ all -> 0x0115 }
        L_0x0111:
            r3.close()     // Catch:{ IOException -> 0x011a }
            return r6
        L_0x0115:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0119 }
        L_0x0119:
            throw r0     // Catch:{ IOException -> 0x011a }
        L_0x011a:
            r1 = move-exception
            java.lang.String r0 = "documentutils/openxmlthumb "
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ Exception -> 0x0121 }
            return r6
        L_0x0121:
            r1 = move-exception
            java.lang.String r0 = "documentutils/getthumbnail "
            com.whatsapp.util.Log.i(r0, r1)
        L_0x0127:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18820xJ.A0A(java.io.File, java.lang.String, float):byte[]");
    }
}

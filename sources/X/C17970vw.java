package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.0vw  reason: invalid class name and case insensitive filesystem */
public class C17970vw {
    public static int A00 = -1;
    public static String A01;
    public static final BitmapFactory.Options A02;
    public static final DecimalFormat A03 = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.US));
    public static final byte[] A04 = {-1, -39};

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A02 = options;
        options.inDither = true;
        options.inInputShareable = true;
        options.inPurgeable = true;
    }

    public static byte A00(String str) {
        if (str == null) {
            return -1;
        }
        if (str.startsWith("audio")) {
            return 2;
        }
        if (str.startsWith("video")) {
            return 3;
        }
        if (str.startsWith("image")) {
            return 1;
        }
        if (str.startsWith("text/x-vcard") || str.startsWith("text/vcard")) {
            return 4;
        }
        return str.startsWith("text") ? (byte) 0 : 9;
    }

    public static int A01(ContentResolver contentResolver, Uri uri) {
        File A032 = AnonymousClass1XI.A03(uri);
        int i2 = 0;
        if (A032 != null) {
            i2 = new C007703o(A032.getPath()).A07(1);
        } else if ("content".equals(uri.getScheme())) {
            String[] strArr = {"_data", "orientation"};
            Uri build = uri.buildUpon().query((String) null).build();
            ContentResolver contentResolver2 = contentResolver;
            if (contentResolver != null) {
                try {
                    Cursor query = contentResolver2.query(build, strArr, (String) null, (String[]) null, (String) null);
                    if (query != null) {
                        try {
                            if (!query.moveToFirst()) {
                                Log.e("sample_rotate_image/cursor_is_empty");
                            } else if (query.getColumnCount() == 2) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (string != null) {
                                    i2 = new C007703o(string).A07(1);
                                } else {
                                    int i3 = query.getInt(query.getColumnIndexOrThrow("orientation"));
                                    if (i3 == 90) {
                                        i2 = 6;
                                    } else if (i3 == 180) {
                                        i2 = 3;
                                    } else if (i3 == 270) {
                                        i2 = 8;
                                    }
                                }
                            } else {
                                Log.e("sample_rotate_image/no_orientation_info");
                            }
                        } finally {
                            query.close();
                        }
                    }
                } catch (Exception e2) {
                    Log.w("sample_rotate_image/query_orientation_info", e2);
                }
            } else {
                Log.w("media-file-utils/get-exiff-orientation cr=null");
            }
        }
        StringBuilder sb = new StringBuilder("sample_rotate_image/orientation ");
        sb.append(i2);
        Log.i(sb.toString());
        return i2;
    }

    public static int A02(C16180sb r8, AnonymousClass1XK r9, String str, int i2, int i3) {
        File A0C = r8.A0C(r9.A00, i2, i3);
        int i4 = 0;
        int i5 = -1;
        if (A0C.exists()) {
            File[] listFiles = A0C.listFiles();
            if (listFiles != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(r9.A01);
                sb.append("-");
                sb.append(str);
                sb.append("-WA");
                String obj = sb.toString();
                int length = listFiles.length;
                while (i4 < length) {
                    String name = listFiles[i4].getName();
                    if (name.startsWith(obj) && name.length() > 19) {
                        try {
                            int parseInt = Integer.parseInt(name.substring(15, 19));
                            if (parseInt > i5) {
                                i5 = parseInt;
                            }
                        } catch (NumberFormatException e2) {
                            StringBuilder sb2 = new StringBuilder("mediafileutils/findlargestfileindex/nfe:");
                            sb2.append(name);
                            Log.i(sb2.toString(), e2);
                        }
                    }
                    i4++;
                }
                i4 = length;
            } else {
                StringBuilder sb3 = new StringBuilder("mediafileutils/findlargestfileindex/no files for mmsType:");
                sb3.append(r9);
                Log.i(sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder("mediafileutils/findlargestfileindex mmsType:");
        sb4.append(r9);
        sb4.append(" fileIndex:");
        sb4.append(i5);
        sb4.append(" total:");
        sb4.append(i4);
        Log.i(sb4.toString());
        return i5;
    }

    public static int A03(File file) {
        long A042 = A04(file);
        int i2 = (int) (A042 / 1000);
        if (i2 != 0 || A042 == 0) {
            return i2;
        }
        return 1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:13|14|15|16|17|18|19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        com.whatsapp.util.Log.e("getmediadurationseconds", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r1 == null) goto L_0x005c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A04(java.io.File r5) {
        /*
            r2 = 0
            if (r5 == 0) goto L_0x005c
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x005c
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = ".opus"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x002c
            r1 = 0
            r0 = 3
            X.1bx r1 = X.C30211bx.A00(r1, r1, r5, r0)     // Catch:{ IOException -> 0x0057, all -> 0x0025 }
            r1.A05()     // Catch:{ IOException -> 0x0057, all -> 0x0025 }
            int r0 = r1.A03()     // Catch:{ IOException -> 0x0057, all -> 0x0025 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0057, all -> 0x0025 }
            goto L_0x0059
        L_0x0025:
            r0 = move-exception
            if (r1 == 0) goto L_0x002b
            r1.A06()
        L_0x002b:
            throw r0
        L_0x002c:
            X.C41911wr.A04(r5)     // Catch:{ IOException -> 0x0030 }
            goto L_0x0056
        L_0x0030:
            X.1wq r4 = new X.1wq     // Catch:{ Exception -> 0x004f }
            r4.<init>()     // Catch:{ Exception -> 0x004f }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x004a }
            r4.setDataSource(r0)     // Catch:{ all -> 0x004a }
            r0 = 9
            java.lang.String r0 = r4.extractMetadata(r0)     // Catch:{ all -> 0x004a }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x004a }
            r4.close()     // Catch:{ Exception -> 0x004f }
            return r0
        L_0x004a:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            r1 = move-exception
            java.lang.String r0 = "getmediadurationseconds"
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        L_0x0056:
            return r2
        L_0x0057:
            if (r1 == 0) goto L_0x005c
        L_0x0059:
            r1.A06()
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17970vw.A04(java.io.File):long");
    }

    public static Bitmap A05(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 21) {
            return bitmap;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, A02);
    }

    public static Bitmap A06(Bitmap bitmap, float f2, int i2) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f3 = (float) i2;
        RectF rectF = new RectF(0.0f, 0.0f, f3, f3);
        int width = (bitmap.getWidth() - bitmap.getHeight()) >> 1;
        Rect rect = width > 0 ? new Rect(width, 0, bitmap.getWidth() - width, bitmap.getHeight()) : new Rect(0, -width, bitmap.getWidth(), bitmap.getHeight() + width);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        if (f2 >= 0.0f) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        } else {
            canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        return createBitmap;
    }

    public static Bitmap A07(Bitmap bitmap, Matrix matrix, int i2, int i3) {
        String str;
        Matrix matrix2 = matrix;
        Bitmap bitmap2 = bitmap;
        if (matrix != null) {
            Log.i("sample_rotate_image/rotate");
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                if (bitmap2 != createBitmap) {
                    bitmap2.recycle();
                }
                bitmap2 = createBitmap;
            } catch (OutOfMemoryError e2) {
                e = e2;
                str = "sample_rotate_image/rotate/out-of-memory";
                Log.e(str);
                bitmap2.recycle();
                throw e;
            }
        }
        if (i3 <= 0 || (bitmap2.getWidth() <= i3 && bitmap2.getHeight() <= i3)) {
            return bitmap2;
        }
        StringBuilder sb = new StringBuilder("sample_rotate_image/scale/");
        sb.append(bitmap2.getWidth());
        sb.append(" | ");
        sb.append(bitmap2.getHeight());
        Log.i(sb.toString());
        float f2 = (float) i2;
        float max = Math.max(((float) bitmap2.getWidth()) / f2, ((float) bitmap2.getHeight()) / f2);
        Rect rect = new Rect(0, 0, (int) (((float) bitmap2.getWidth()) / max), (int) (((float) bitmap2.getHeight()) / max));
        rect.right = Math.max(rect.right, 1);
        rect.bottom = Math.max(rect.bottom, 1);
        Rect rect2 = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        Bitmap.Config config = bitmap2.getConfig();
        try {
            int width = rect.width();
            int height = rect.height();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(createBitmap2);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            canvas.drawBitmap(bitmap2, rect2, rect, paint);
            bitmap2.recycle();
            return createBitmap2;
        } catch (OutOfMemoryError e3) {
            e = e3;
            str = "sample_rotate_image/scale/out-of-memory";
            Log.e(str);
            bitmap2.recycle();
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        r1.setRotate(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        r1.setValues(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Matrix A08(int r1) {
        /*
            r0 = 9
            switch(r1) {
                case 2: goto L_0x0007;
                case 3: goto L_0x0012;
                case 4: goto L_0x001a;
                case 5: goto L_0x0025;
                case 6: goto L_0x0030;
                case 7: goto L_0x0038;
                case 8: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 0
            return r1
        L_0x0007:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            float[] r0 = new float[r0]
            r0 = {-1082130432, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            goto L_0x0042
        L_0x0012:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0 = 1127481344(0x43340000, float:180.0)
            goto L_0x004d
        L_0x001a:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            float[] r0 = new float[r0]
            r0 = {1065353216, 0, 0, 0, -1082130432, 0, 0, 0, 1065353216} // fill-array
            goto L_0x0042
        L_0x0025:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            float[] r0 = new float[r0]
            r0 = {0, 1065353216, 0, 1065353216, 0, 0, 0, 0, 1065353216} // fill-array
            goto L_0x0042
        L_0x0030:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0 = 1119092736(0x42b40000, float:90.0)
            goto L_0x004d
        L_0x0038:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            float[] r0 = new float[r0]
            r0 = {0, -1082130432, 0, -1082130432, 0, 0, 0, 0, 1065353216} // fill-array
        L_0x0042:
            r1.setValues(r0)
            return r1
        L_0x0046:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0 = 1132920832(0x43870000, float:270.0)
        L_0x004d:
            r1.setRotate(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17970vw.A08(int):android.graphics.Matrix");
    }

    public static Matrix A09(ContentResolver contentResolver, Uri uri) {
        int parseInt;
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            StringBuilder sb = new StringBuilder("No file ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        }
        Matrix A08 = A08(A01(contentResolver, uri));
        if (uri.getQueryParameter("flip-h") != null) {
            Matrix matrix = new Matrix();
            matrix.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            if (A08 == null) {
                A08 = matrix;
            } else {
                A08.postConcat(matrix);
            }
        }
        if (uri.getQueryParameter("flip-v") != null) {
            Matrix matrix2 = new Matrix();
            matrix2.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            if (A08 == null) {
                A08 = matrix2;
            } else {
                A08.postConcat(matrix2);
            }
        }
        String queryParameter = uri.getQueryParameter("rotation");
        if (!(queryParameter == null || (parseInt = Integer.parseInt(queryParameter)) == 0)) {
            if (A08 == null) {
                A08 = new Matrix();
            }
            A08.postRotate((float) parseInt);
        }
        return A08;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A0A(java.io.File r4) {
        /*
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options
            r3.<init>()
            r0 = 1
            r3.inJustDecodeBounds = r0
            java.lang.String r0 = r4.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r0, r3)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x0024 }
            X.03o r1 = new X.03o     // Catch:{ IOException -> 0x0024 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0024 }
            r0 = 1
            int r1 = r1.A07(r0)     // Catch:{ IOException -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            r1 = move-exception
            java.lang.String r0 = "failure retrieving exif, io exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x002a:
            r1 = 0
        L_0x002b:
            r0 = 6
            if (r1 == r0) goto L_0x0044
            r0 = 8
            if (r1 == r0) goto L_0x0044
            int r0 = r3.outWidth
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r3.outHeight
        L_0x003a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x0044:
            int r0 = r3.outHeight
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r3.outWidth
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17970vw.A0A(java.io.File):android.util.Pair");
    }

    public static File A0B(C16180sb r6, C17020u3 r7, AnonymousClass1XK r8, File file, int i2) {
        StringBuilder sb = new StringBuilder(".");
        sb.append(AnonymousClass1XI.A08(file.getAbsolutePath()));
        return A0C(r6, r7, r8, sb.toString(), i2, 3);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static java.io.File A0C(X.C16180sb r8, X.C17020u3 r9, X.AnonymousClass1XK r10, java.lang.String r11, int r12, int r13) {
        /*
            r3 = 0
        L_0x0001:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<X.0vw> r7 = X.C17970vw.class
            monitor-enter(r7)
            A0L(r8, r9)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = X.AnonymousClass01S.A07     // Catch:{ all -> 0x00ab }
            android.content.SharedPreferences r0 = r9.A00(r0)     // Catch:{ all -> 0x00ab }
            android.content.SharedPreferences$Editor r5 = r0.edit()     // Catch:{ all -> 0x00ab }
            java.util.Date r6 = new java.util.Date     // Catch:{ all -> 0x00ab }
            r6.<init>()     // Catch:{ all -> 0x00ab }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = "yyyyMMdd"
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x00ab }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = r0.format(r6)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = A01     // Catch:{ all -> 0x00ab }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x003b
            r0 = 0
            A00 = r0     // Catch:{ all -> 0x00ab }
            A01 = r1     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "file_date"
            r5.putString(r0, r1)     // Catch:{ all -> 0x00ab }
        L_0x003b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r6.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x00ab }
            r6.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "-"
            r6.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = A01     // Catch:{ all -> 0x00ab }
            r6.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "-WA"
            r6.append(r0)     // Catch:{ all -> 0x00ab }
            java.text.DecimalFormat r4 = A03     // Catch:{ all -> 0x00ab }
            int r0 = A00     // Catch:{ all -> 0x00ab }
            long r0 = (long) r0     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r4.format(r0)     // Catch:{ all -> 0x00ab }
            r6.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00ab }
            int r0 = A00     // Catch:{ all -> 0x00ab }
            int r1 = r0 + 1
            A00 = r1     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "file_index"
            r5.putInt(r0, r1)     // Catch:{ all -> 0x00ab }
            r5.apply()     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "mediafileutils/readablefilename/"
            r1.append(r0)     // Catch:{ all -> 0x00ab }
            r1.append(r4)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ab }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ab }
            monitor-exit(r7)
            r2.append(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            byte r0 = r10.A00
            java.io.File r0 = r8.A0C(r0, r12, r13)
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00aa
            int r3 = r3 + 1
            r0 = 100
            if (r3 >= r0) goto L_0x00aa
            goto L_0x0001
        L_0x00aa:
            return r1
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17970vw.A0C(X.0sb, X.0u3, X.1XK, java.lang.String, int, int):java.io.File");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        if (r12 == X.AnonymousClass1XK.A0P) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A0D(X.C16180sb r10, X.C17020u3 r11, X.AnonymousClass1XK r12, java.lang.String r13, java.lang.String r14, int r15, int r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r2 = r14
            r3 = r13
            java.lang.String r1 = "."
            r5 = r10
            if (r17 == 0) goto L_0x002c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = A0H()
            r3.append(r0)
            r3.append(r1)
            r3.append(r14)
            java.lang.String r2 = r3.toString()
            X.1jH r0 = r10.A05()
            java.io.File r1 = r0.A0M
            r0 = 0
            X.C16180sb.A04(r1, r0)
            java.io.File r2 = X.C16180sb.A00(r1, r2)
        L_0x002b:
            return r2
        L_0x002c:
            if (r18 == 0) goto L_0x003e
            X.0tz r0 = r10.A03
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "gdpr.zip"
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r0)
            return r2
        L_0x003e:
            if (r19 == 0) goto L_0x0045
            java.io.File r2 = r10.A06()
            return r2
        L_0x0045:
            X.1XK r0 = X.AnonymousClass1XK.A0K
            r7 = r12
            if (r12 != r0) goto L_0x0081
            X.0tz r0 = r10.A03
            android.content.Context r0 = r0.A00
            java.io.File r3 = r0.getFilesDir()
            java.lang.String r0 = X.C16180sb.A07
            java.io.File r4 = new java.io.File
            r4.<init>(r3, r0)
            r0 = 0
            X.C16180sb.A04(r4, r0)
            java.lang.String r0 = "HIST_SYNC"
            java.lang.String r3 = X.C16180sb.A02(r4, r0)
        L_0x0063:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x007b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            r0.append(r14)
            java.lang.String r3 = r0.toString()
        L_0x007b:
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r3)
            return r2
        L_0x0081:
            if (r20 == 0) goto L_0x0095
            X.1jH r0 = r10.A05()
            java.io.File r4 = r0.A08
            java.lang.String r3 = r12.A01
            java.lang.String r0 = "View Once media must have a filePrefix in its MmsType"
            X.AnonymousClass00B.A07(r3, r0)
            java.lang.String r3 = X.C16180sb.A02(r4, r3)
            goto L_0x0063
        L_0x0095:
            boolean r0 = X.C221516v.A01(r12)
            java.lang.String r8 = ""
            r6 = r8
            r4 = 0
            if (r0 == 0) goto L_0x00e2
            if (r13 == 0) goto L_0x00e0
            java.lang.String r0 = "[?:\\\\/*\"<>|]"
            java.lang.String r0 = r13.replaceAll(r0, r8)
            java.lang.String r3 = X.AnonymousClass1XI.A09(r0)
            java.lang.String r2 = X.AnonymousClass1XI.A08(r0)
        L_0x00af:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x00e6
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00e6
            r2 = r8
        L_0x00bc:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00d1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r8 = r0.toString()
        L_0x00d1:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r9 = r15
            r10 = r16
            if (r0 == 0) goto L_0x00e8
            r6 = r11
            java.io.File r2 = A0C(r5, r6, r7, r8, r9, r10)
            return r2
        L_0x00e0:
            r3 = r4
            goto L_0x00af
        L_0x00e2:
            X.1XK r0 = X.AnonymousClass1XK.A0P
            if (r12 != r0) goto L_0x00bc
        L_0x00e6:
            r4 = r3
            goto L_0x00bc
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            if (r3 != 0) goto L_0x0116
            r0 = r6
        L_0x00f4:
            r2.append(r0)
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            byte r0 = r12.A00
            java.io.File r0 = r5.A0C(r0, r15, r10)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x002b
            int r3 = r3 + 1
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 >= r0) goto L_0x002b
            goto L_0x00e9
        L_0x0116:
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17970vw.A0D(X.0sb, X.0u3, X.1XK, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean, boolean):java.io.File");
    }

    public static File A0E(C16180sb r2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".doodle");
        return r2.A0N(sb.toString());
    }

    public static File A0F(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return file2;
        }
        for (int i2 = 1; i2 <= 100; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            sb.append(i2);
            File file3 = new File(file, sb.toString());
            if (!file3.exists()) {
                return file3;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(UUID.randomUUID().toString());
        return new File(file, sb2.toString());
    }

    public static FileInputStream A0G(File file) {
        boolean z2 = false;
        while (true) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException e2) {
                if (!e2.getMessage().contains("Permission denied") || z2) {
                    throw e2;
                }
                z2 = true;
            }
        }
        throw e2;
    }

    public static String A0H() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r3.lastIndexOf(46);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0I(android.net.Uri r3) {
        /*
            java.lang.String r3 = r3.getLastPathSegment()
            java.lang.String r2 = ""
            if (r3 == 0) goto L_0x0018
            r0 = 46
            int r1 = r3.lastIndexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0018
            int r0 = r1 + 1
            java.lang.String r0 = r3.substring(r0)
            return r0
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17970vw.A0I(android.net.Uri):java.lang.String");
    }

    public static String A0J(String str) {
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        switch (lowerCase.hashCode()) {
            case 96323:
                if (lowerCase.equals("aac")) {
                    return "audio/aac";
                }
                break;
            case 96710:
                if (lowerCase.equals("amr")) {
                    return "audio/amr";
                }
                break;
            case 98822:
                if (lowerCase.equals("csv")) {
                    return "text/csv";
                }
                break;
            case 99640:
                if (lowerCase.equals("doc")) {
                    return "application/msword";
                }
                break;
            case 106458:
                if (lowerCase.equals("m4a")) {
                    return "audio/mp4";
                }
                break;
            case 108272:
                if (lowerCase.equals("mp3")) {
                    return "audio/mpeg";
                }
                break;
            case 108273:
                if (lowerCase.equals("mp4")) {
                    return "video/mp4";
                }
                break;
            case 110834:
                if (lowerCase.equals("pdf")) {
                    return "application/pdf";
                }
                break;
            case 111220:
                if (lowerCase.equals("ppt")) {
                    return "application/vnd.ms-powerpoint";
                }
                break;
            case 113252:
                if (lowerCase.equals("rtf")) {
                    return "application/rtf";
                }
                break;
            case 115312:
                if (lowerCase.equals("txt")) {
                    return "text/plain";
                }
                break;
            case 117484:
                if (lowerCase.equals("wav")) {
                    return "audio/x-wav";
                }
                break;
            case 117835:
                if (lowerCase.equals("wma")) {
                    return "audio/x-ms-wma";
                }
                break;
            case 118783:
                if (lowerCase.equals("xls")) {
                    return "application/vnd.ms-excel";
                }
                break;
            case 3088960:
                if (lowerCase.equals("docx")) {
                    return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
                }
                break;
            case 3418175:
                if (lowerCase.equals("opus")) {
                    return "audio/ogg; codecs=opus";
                }
                break;
            case 3447940:
                if (lowerCase.equals("pptx")) {
                    return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
                }
                break;
            case 3682393:
                if (lowerCase.equals("xlsx")) {
                    return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
                }
                break;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.toLowerCase(locale));
        return mimeTypeFromExtension == null ? "application/octet-stream" : mimeTypeFromExtension;
    }

    public static void A0K(Context context, Uri uri) {
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE").setData(uri));
    }

    public static synchronized void A0L(C16180sb r13, C17020u3 r14) {
        synchronized (C17970vw.class) {
            if (A00 < 0) {
                SharedPreferences A002 = r14.A00(AnonymousClass01S.A07);
                A00 = A002.getInt("file_index", -1);
                String string = A002.getString("file_date", (String) null);
                A01 = string;
                if (A00 < 0 || TextUtils.isEmpty(string)) {
                    String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date());
                    A01 = format;
                    long currentTimeMillis = System.currentTimeMillis();
                    A00 = -1;
                    AnonymousClass1XK r2 = AnonymousClass1XK.A05;
                    int max = Math.max(-1, A02(r13, r2, format, 0, 1));
                    A00 = max;
                    int max2 = Math.max(max, A02(r13, r2, A01, 0, 2));
                    A00 = max2;
                    int max3 = Math.max(max2, A02(r13, r2, A01, 0, 3));
                    A00 = max3;
                    String str = A01;
                    AnonymousClass1XK r22 = AnonymousClass1XK.A0I;
                    int max4 = Math.max(max3, A02(r13, r22, str, 1, 1));
                    A00 = max4;
                    int max5 = Math.max(max4, A02(r13, r22, A01, 1, 2));
                    A00 = max5;
                    int max6 = Math.max(max5, A02(r13, r22, A01, 1, 3));
                    A00 = max6;
                    String str2 = A01;
                    AnonymousClass1XK r23 = AnonymousClass1XK.A0X;
                    int max7 = Math.max(max6, A02(r13, r23, str2, 0, 1));
                    A00 = max7;
                    int max8 = Math.max(max7, A02(r13, r23, A01, 0, 2));
                    A00 = max8;
                    int max9 = Math.max(max8, A02(r13, r23, A01, 0, 3));
                    A00 = max9;
                    String str3 = A01;
                    AnonymousClass1XK r24 = AnonymousClass1XK.A0B;
                    int max10 = Math.max(max9, A02(r13, r24, str3, 0, 1));
                    A00 = max10;
                    int max11 = Math.max(max10, A02(r13, r24, A01, 0, 2));
                    A00 = max11;
                    int max12 = Math.max(max11, A02(r13, r24, A01, 0, 3));
                    A00 = max12;
                    String str4 = A01;
                    AnonymousClass1XK r25 = AnonymousClass1XK.A08;
                    int max13 = Math.max(max12, A02(r13, r25, str4, 0, 1));
                    A00 = max13;
                    int max14 = Math.max(max13, A02(r13, r25, A01, 0, 2));
                    A00 = max14;
                    int max15 = Math.max(max14, A02(r13, r25, A01, 0, 3));
                    A00 = max15;
                    A00 = max15 + 1;
                    SharedPreferences.Editor edit = A002.edit();
                    edit.putInt("file_index", A00);
                    edit.putString("file_date", A01);
                    edit.apply();
                    StringBuilder sb = new StringBuilder();
                    sb.append("mediafileutils/initfilecounter file_index:");
                    sb.append(A00);
                    sb.append(" | file_date:");
                    sb.append(A01);
                    sb.append(" |  time:");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    Log.i(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mediafileutils/initfilecounter file_index:");
                    sb2.append(A00);
                    sb2.append(" | file_date:");
                    sb2.append(A01);
                    Log.i(sb2.toString());
                }
            }
        }
    }

    public static void A0M(C16750ta r2, File file) {
        Pair A0A = A0A(file);
        r2.A08 = ((Number) A0A.first).intValue();
        r2.A06 = ((Number) A0A.second).intValue();
    }

    public static boolean A0N(AnonymousClass12W r3, File file, File file2) {
        String str;
        StringBuilder sb;
        String str2;
        File A012 = r3.A01(file);
        if (file2.renameTo(A012)) {
            if (!file.renameTo(file2)) {
                boolean renameTo = A012.renameTo(file2);
                boolean delete = file.delete();
                if (!renameTo) {
                    if (!delete) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("failed to delete ");
                        sb2.append(file.getAbsolutePath());
                        Log.e(sb2.toString());
                    }
                    if (!A012.delete()) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("failed to delete ");
                        sb3.append(A012.getAbsolutePath());
                        Log.e(sb3.toString());
                    }
                    str = "restore input file failed";
                    Log.e(str);
                    return false;
                } else if (delete) {
                    return false;
                } else {
                    sb = new StringBuilder();
                    sb.append("failed to delete ");
                    str2 = file.getAbsolutePath();
                }
            } else if (A012.delete()) {
                return true;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("failed to delete ");
                sb4.append(A012.getAbsolutePath());
                Log.e(sb4.toString());
                return true;
            }
        } else if (A012.delete()) {
            return false;
        } else {
            sb = new StringBuilder();
            sb.append("failed to delete ");
            str2 = A012.getAbsolutePath();
        }
        sb.append(str2);
        str = sb.toString();
        Log.e(str);
        return false;
    }
}

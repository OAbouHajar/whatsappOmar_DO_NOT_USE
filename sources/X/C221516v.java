package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.16v  reason: invalid class name and case insensitive filesystem */
public class C221516v {
    public AnonymousClass1WA A00;
    public final C16180sb A01;
    public final AnonymousClass01V A02;
    public final C16510tB A03;
    public final C16320sq A04;

    public C221516v(C16180sb r1, AnonymousClass01V r2, C16510tB r3, C16320sq r4) {
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
    }

    public static String A00(String str) {
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1487394660:
                    if (str.equals("image/jpeg")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1487018032:
                    if (str.equals("image/webp")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1248334925:
                    if (str.equals("application/pdf")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1248332507:
                    if (str.equals("application/rtf")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1073633483:
                    if (str.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1071817359:
                    if (str.equals("application/vnd.ms-powerpoint")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1050893613:
                    if (str.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -1004747228:
                    if (str.equals("text/csv")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -1004732798:
                    if (str.equals("text/rtf")) {
                        c2 = 8;
                        break;
                    }
                    break;
                case -879258763:
                    if (str.equals("image/png")) {
                        c2 = 9;
                        break;
                    }
                    break;
                case -366307023:
                    if (str.equals("application/vnd.ms-excel")) {
                        c2 = 10;
                        break;
                    }
                    break;
                case 817335912:
                    if (str.equals("text/plain")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 904647503:
                    if (str.equals("application/msword")) {
                        c2 = 12;
                        break;
                    }
                    break;
                case 1993842850:
                    if (str.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                        c2 = 13;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return "jpg";
                case 1:
                    return "webp";
                case 2:
                    return "pdf";
                case 3:
                case 8:
                    return "rtf";
                case 4:
                    return "pptx";
                case 5:
                    return "ppt";
                case 6:
                    return "docx";
                case 7:
                    return "csv";
                case 9:
                    return "png";
                case 10:
                    return "xls";
                case 11:
                    return "txt";
                case 12:
                    return "doc";
                case 13:
                    return "xlsx";
                default:
                    String A07 = AnonymousClass1QS.A07(str, false);
                    if (TextUtils.isEmpty(A07)) {
                        A07 = null;
                        if (!TextUtils.isEmpty(str)) {
                            if ("video/mp4".equals(str)) {
                                A07 = "mp4";
                            } else if ("video/3gpp".equals(str)) {
                                A07 = "3gp";
                            }
                        }
                        if (TextUtils.isEmpty(A07)) {
                            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
                            if (extensionFromMimeType != null) {
                                return extensionFromMimeType;
                            }
                        }
                    }
                    return A07;
            }
        }
        return "";
    }

    public static boolean A01(AnonymousClass1XK r2) {
        return r2 == AnonymousClass1XK.A08 || r2 == AnonymousClass1XK.A0T;
    }

    public Bitmap A02(BitmapFactory.Options options, Matrix matrix, Uri uri, int i2, int i3, boolean z2) {
        InputStream A042 = A04(uri, z2);
        try {
            Bitmap A022 = C37741pe.A02(options, A042);
            if (A022 == null || A022.getWidth() == 0 || A022.getHeight() == 0) {
                throw new C37731pd();
            }
            A042.close();
            return C17970vw.A07(A022, matrix, i2, i3);
        } catch (Throwable unused) {
        }
        throw th;
    }

    public Bitmap A03(Uri uri, int i2, int i3, boolean z2, boolean z3) {
        int i4;
        int i5;
        Bitmap bitmap;
        Uri uri2 = uri;
        if (!TextUtils.isEmpty(uri.toString())) {
            Matrix A09 = C17970vw.A09(this.A02.A0C(), uri);
            if (!TextUtils.isEmpty(uri.toString())) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                boolean z4 = z2;
                InputStream A042 = A04(uri, z4);
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(A042, (Rect) null, options);
                    A042.close();
                    int i6 = options.outWidth;
                    if (i6 <= 0 || (i4 = options.outHeight) <= 0) {
                        throw new C37731pd();
                    }
                    options.inSampleSize = 1;
                    int i7 = 1;
                    int max = Math.max(i6, i4);
                    while (true) {
                        max >>= 1;
                        i5 = i2;
                        if (max <= (i2 << 3) / 10) {
                            break;
                        }
                        i7 <<= 1;
                        options.inSampleSize = i7;
                    }
                    options.inDither = true;
                    options.inJustDecodeBounds = false;
                    options.inScaled = false;
                    options.inPurgeable = true;
                    options.inInputShareable = true;
                    StringBuilder sb = new StringBuilder("sample_rotate_image/width=");
                    sb.append(i6);
                    sb.append(" | height=");
                    sb.append(i4);
                    sb.append(" | sample_size=");
                    sb.append(i7);
                    Log.i(sb.toString());
                    options.inPreferQualityOverSpeed = true;
                    options.inMutable = z3;
                    int i8 = i3;
                    try {
                        bitmap = A02(options, A09, uri2, i5, i8, z4);
                    } catch (OutOfMemoryError e2) {
                        int i9 = options.inSampleSize << 1;
                        options.inSampleSize = i9;
                        StringBuilder sb2 = new StringBuilder("sample_rotate_image/oom ");
                        sb2.append(i9);
                        Log.i(sb2.toString(), e2);
                        bitmap = A02(options, A09, uri2, i5, i8, z4);
                    }
                    bitmap.isMutable();
                    StringBuilder sb3 = new StringBuilder("sample_rotate_image/final_size:");
                    sb3.append(bitmap.getWidth());
                    sb3.append(" | ");
                    sb3.append(bitmap.getHeight());
                    Log.i(sb3.toString());
                    return bitmap;
                } catch (Throwable unused) {
                }
            } else {
                StringBuilder sb4 = new StringBuilder("No file ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder("No file ");
            sb5.append(uri);
            throw new FileNotFoundException(sb5.toString());
        }
        throw th;
    }

    public InputStream A04(Uri uri, boolean z2) {
        InputStream openInputStream;
        Uri build = uri.buildUpon().query((String) null).build();
        File A032 = AnonymousClass1XI.A03(build);
        if (A032 != null) {
            openInputStream = new FileInputStream(A032);
        } else {
            ContentResolver A0C = this.A02.A0C();
            if (A0C != null) {
                openInputStream = A0C.openInputStream(build);
                if (openInputStream == null) {
                    StringBuilder sb = new StringBuilder("Unable to open stream for uri=");
                    sb.append(build);
                    throw new IOException(sb.toString());
                }
            } else {
                throw new IOException("Could not get content resolver");
            }
        }
        if ((openInputStream instanceof FileInputStream) && z2) {
            this.A03.A05((FileInputStream) openInputStream);
        }
        return openInputStream;
    }

    public void A05(File file, byte b2) {
        AnonymousClass1XI.A0N(file);
        A06(file, b2);
    }

    public void A06(File file, byte b2) {
        AnonymousClass1WA r2;
        Uri uri = b2 != 1 ? b2 != 2 ? (b2 == 3 || b2 == 13) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : null : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        synchronized (this) {
            r2 = this.A00;
            if (r2 == null) {
                r2 = new AnonymousClass1WA(this.A04, false);
                this.A00 = r2;
            }
        }
        r2.execute(new RunnableRunnableShape1S0300000_I0_1(this, uri, file, 21));
    }
}

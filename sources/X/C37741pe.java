package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1pe  reason: invalid class name and case insensitive filesystem */
public class C37741pe {
    public static int A00(int i2, int i3, int i4, int i5, int i6) {
        int i7 = ((i2 - 1) / i6) + 1;
        int i8 = ((i3 - 1) / i6) + 1;
        while (((i7 - 1) / 2) + 1 >= i4 && ((i8 - 1) / 2) + 1 >= i5) {
            i7 = ((i7 - 1) / 2) + 1;
            i8 = ((i8 - 1) / 2) + 1;
            i6 <<= 1;
        }
        return i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        if (r13 < 0) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(X.C446825c r11, int r12, int r13) {
        /*
            r3 = 1
            if (r12 < 0) goto L_0x0006
            r2 = 1
            if (r13 >= 0) goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            java.lang.String r0 = "bitmaputils/wrong raw image/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = ","
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0B(r0, r2)
            if (r2 != 0) goto L_0x0023
            return r3
        L_0x0023:
            android.graphics.BitmapFactory$Options r0 = r11.A02
            int r8 = r0.inSampleSize
            java.lang.Long r7 = r11.A03
            r6 = r12
            r5 = r13
            r4 = 1
            if (r7 != 0) goto L_0x0044
        L_0x002e:
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0037
            int r12 = java.lang.Math.max(r12, r13)
            r13 = r12
        L_0x0037:
            int r2 = java.lang.Math.max(r8, r4)
            int r1 = r11.A01
            int r0 = r11.A00
            int r0 = A00(r12, r13, r1, r0, r2)
            return r0
        L_0x0044:
            long r2 = (long) r6
            long r0 = (long) r5
            long r2 = r2 * r0
            long r9 = r7.longValue()
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
            r1 = 2
            int r0 = r6 + -1
            int r0 = r0 / r1
            int r6 = r0 + 1
            int r0 = r5 + -1
            int r0 = r0 / r1
            int r5 = r0 + 1
            int r4 = r4 << 1
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37741pe.A01(X.25c, int, int):int");
    }

    public static Bitmap A02(BitmapFactory.Options options, InputStream inputStream) {
        return Build.VERSION.SDK_INT >= 21 ? BitmapFactory.decodeStream(inputStream, (Rect) null, options) : A04((C43231zf) null, new C446825c(options, (Long) null, Integer.MAX_VALUE, Integer.MAX_VALUE, false), inputStream, false).A02;
    }

    public static Path A03(RectF rectF) {
        RectF rectF2 = new RectF(rectF);
        float min = Math.min(rectF2.width(), rectF2.height());
        rectF2.right = rectF2.left + min;
        rectF2.bottom = rectF2.top + min;
        Path path = new Path();
        path.moveTo(rectF2.centerX(), rectF2.top);
        float f2 = rectF2.left;
        float f3 = rectF2.top;
        float f4 = f2;
        float f5 = f3;
        path.cubicTo(f2, f3, f4, f5, f2, rectF2.centerY());
        float f6 = rectF2.left;
        float f7 = rectF2.bottom;
        path.cubicTo(f6, f7, f6, f7, rectF2.centerX(), rectF2.bottom);
        float f8 = rectF2.right;
        float f9 = rectF2.bottom;
        float f10 = f8;
        float f11 = f9;
        path.cubicTo(f8, f9, f10, f11, f8, rectF2.centerY());
        float f12 = rectF2.right;
        float f13 = rectF2.top;
        path.cubicTo(f12, f13, f12, f13, rectF2.centerX(), rectF2.top);
        path.close();
        return path;
    }

    public static C446925d A04(C43231zf r1, C446825c r2, InputStream inputStream, boolean z2) {
        try {
            return A05(r1, r2, C30311c8.A08(new AnonymousClass4D0(inputStream).A00), z2);
        } catch (IOException e2) {
            Log.e("bitmaputils/decoder failed", e2);
            return new C446925d(0, 0, (Bitmap) null);
        }
    }

    public static C446925d A05(C43231zf r10, C446825c r11, byte[] bArr, boolean z2) {
        Bitmap bitmap;
        Bitmap bitmap2;
        C25401Jq A01;
        BitmapFactory.Options options = r11.A02;
        if (!options.inJustDecodeBounds) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = null;
        if (i2 <= 0 || i3 <= 0) {
            Log.e("bitmaputils/decode bad image");
            return new C446925d(i2, i3, (Bitmap) null);
        }
        int A012 = A01(r11, i2, i3);
        options.inSampleSize = A012;
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        if (!z2) {
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            AnonymousClass00B.A06(r10);
            options.inMutable = true;
            bitmap = null;
            if ((Build.VERSION.SDK_INT >= 19 || A012 == 1) && (A01 = r10.A01(options.outWidth, options.outHeight)) != null) {
                bitmap2 = (Bitmap) A01.first;
                str = (String) A01.second;
                if (bitmap2 != null) {
                    options.inBitmap = bitmap2;
                }
            } else {
                bitmap2 = null;
            }
            try {
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            } catch (IllegalArgumentException unused) {
                Log.e("bitmaputils/decode failed with bitmap pool");
                if (!(bitmap2 == null || str == null)) {
                    AnonymousClass03L r2 = r10.A00;
                    synchronized (r2) {
                        r2.A06(str, bitmap2);
                        r10.A03(bitmap2.getWidth(), str, bitmap2.getHeight());
                    }
                }
            }
        }
        return new C446925d(i2, i3, bitmap);
    }

    public static C446925d A06(C446825c r5, File file) {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT >= 21) {
            BitmapFactory.Options options = r5.A02;
            if (!options.inJustDecodeBounds) {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            }
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            if (i2 <= 0 || i3 <= 0) {
                Log.e("bitmapcache/decode bad image");
            } else {
                options.inSampleSize = A01(r5, i2, i3);
                options.inJustDecodeBounds = false;
                try {
                    bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                } catch (Throwable th) {
                    Log.w("bitmaputils/error-on-decode-api21+", th);
                }
            }
            return new C446925d(i2, i3, bitmap);
        }
        try {
            return A05((C43231zf) null, r5, C29301aP.A00(new C82484Cz(file).A00), false);
        } catch (IOException e2) {
            Log.e("bitmaputils/decoder failed", e2);
            return new C446925d(0, 0, (Bitmap) null);
        } catch (Throwable th2) {
            Log.w("bitmaputils/error-on-decode", th2);
            return new C446925d(r5.A01, r5.A00, (Bitmap) null);
        }
    }

    public static String A07(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        C30311c8.A04(byteArrayOutputStream);
        return encodeToString;
    }
}

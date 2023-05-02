package com.facebook.webpsupport;

import X.AnonymousClass0Vx;
import X.AnonymousClass4YF;
import X.C006703b;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WebpBitmapFactoryImpl implements C006703b {
    public static Bitmap createBitmap(int i2, int i3, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            return options.inBitmap;
        }
        throw new NullPointerException("createNakedBitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.inTempStorage;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getInTempStorageFromOptions(android.graphics.BitmapFactory.Options r0) {
        /*
            if (r0 == 0) goto L_0x0007
            byte[] r0 = r0.inTempStorage
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.getInTempStorageFromOptions(android.graphics.BitmapFactory$Options):byte[]");
    }

    public static float getScaleFromOptions(BitmapFactory.Options options) {
        float f2 = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i2 = options.inSampleSize;
        if (i2 > 1) {
            f2 = 1.0f / ((float) i2);
        }
        if (!options.inScaled) {
            return f2;
        }
        int i3 = options.inDensity;
        int i4 = options.inTargetDensity;
        return (i3 == 0 || i4 == 0 || i3 == options.inScreenDensity) ? f2 : ((float) i4) / ((float) i3);
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i2, int i3) {
        return hookDecodeByteArray(bArr, i2, i3, (BitmapFactory.Options) null);
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i2, int i3, BitmapFactory.Options options) {
        AnonymousClass4YF.A00();
        byte[] bArr2 = bArr;
        int i4 = i2;
        int i5 = i3;
        BitmapFactory.Options options2 = options;
        if (!AnonymousClass0Vx.A00 || !AnonymousClass0Vx.A00(bArr2, i4, i3)) {
            return BitmapFactory.decodeByteArray(bArr2, i4, i3, options);
        }
        Bitmap nativeDecodeByteArray = nativeDecodeByteArray(bArr2, i4, i5, options2, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        setWebpBitmapOptions(nativeDecodeByteArray, options2);
        return nativeDecodeByteArray;
    }

    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, (BitmapFactory.Options) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeFile(java.lang.String r3, android.graphics.BitmapFactory.Options r4) {
        /*
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0015 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0015 }
            android.graphics.Bitmap r2 = hookDecodeStream(r1, r2, r4)     // Catch:{ all -> 0x000e }
            r1.close()     // Catch:{ Exception -> 0x0015 }
            return r2
        L_0x000e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0014 }
        L_0x0014:
            throw r0     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, (Rect) null, (BitmapFactory.Options) null);
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        byte[] bArr;
        Bitmap bitmap;
        AnonymousClass4YF.A00();
        long nativeSeek = nativeSeek(fileDescriptor, 0, false);
        if (nativeSeek != -1) {
            InputStream fileInputStream = new FileInputStream(fileDescriptor);
            if (!fileInputStream.markSupported()) {
                fileInputStream = new BufferedInputStream(fileInputStream, 20);
            }
            try {
                fileInputStream.mark(20);
                if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
                    bArr = new byte[20];
                }
                try {
                    fileInputStream.read(bArr, 0, 20);
                    fileInputStream.reset();
                } catch (IOException unused) {
                    bArr = null;
                }
                if (!AnonymousClass0Vx.A00 || !AnonymousClass0Vx.A00(bArr, 0, 20)) {
                    nativeSeek(fileDescriptor, nativeSeek, true);
                    bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
                } else {
                    bitmap = nativeDecodeStream(fileInputStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                    setPaddingDefaultValues(rect);
                    setWebpBitmapOptions(bitmap, options);
                }
                try {
                    fileInputStream.close();
                    return bitmap;
                } catch (Throwable unused2) {
                    return bitmap;
                }
            } catch (Throwable unused3) {
            }
        } else {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
        throw th;
    }

    public static Bitmap hookDecodeResource(Resources resources, int i2) {
        return hookDecodeResource(resources, i2, (BitmapFactory.Options) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeResource(android.content.res.Resources r3, int r4, android.graphics.BitmapFactory.Options r5) {
        /*
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r2 = 0
            java.io.InputStream r1 = r3.openRawResource(r4, r0)     // Catch:{ Exception -> 0x001d }
            android.graphics.Bitmap r2 = hookDecodeResourceStream(r3, r0, r1, r2, r5)     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x001d
            r1.close()     // Catch:{ Exception -> 0x001d }
            goto L_0x001d
        L_0x0014:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r0 = move-exception
            if (r1 == 0) goto L_0x001c
            r1.close()     // Catch:{ all -> 0x001c }
        L_0x001c:
            throw r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            if (r2 != 0) goto L_0x002d
            if (r5 == 0) goto L_0x002d
            android.graphics.Bitmap r0 = r5.inBitmap
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = "Problem decoding into existing bitmap"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeResource(android.content.res.Resources, int, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r1 != 65535) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeResourceStream(android.content.res.Resources r2, android.util.TypedValue r3, java.io.InputStream r4, android.graphics.Rect r5, android.graphics.BitmapFactory.Options r6) {
        /*
            if (r6 != 0) goto L_0x0007
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options
            r6.<init>()
        L_0x0007:
            int r0 = r6.inDensity
            if (r0 != 0) goto L_0x0015
            if (r3 == 0) goto L_0x0015
            int r1 = r3.density
            if (r1 != 0) goto L_0x0028
            r1 = 160(0xa0, float:2.24E-43)
        L_0x0013:
            r6.inDensity = r1
        L_0x0015:
            int r0 = r6.inTargetDensity
            if (r0 != 0) goto L_0x0023
            if (r2 == 0) goto L_0x0023
            android.util.DisplayMetrics r0 = r2.getDisplayMetrics()
            int r0 = r0.densityDpi
            r6.inTargetDensity = r0
        L_0x0023:
            android.graphics.Bitmap r0 = hookDecodeStream(r4, r5, r6)
            return r0
        L_0x0028:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 == r0) goto L_0x0015
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeResourceStream(android.content.res.Resources, android.util.TypedValue, java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, (Rect) null, (BitmapFactory.Options) null);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        byte[] bArr;
        AnonymousClass4YF.A00();
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 20);
        }
        inputStream.mark(20);
        if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
            bArr = new byte[20];
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
        } catch (IOException unused) {
            bArr = null;
        }
        if (!AnonymousClass0Vx.A00 || !AnonymousClass0Vx.A00(bArr, 0, 20)) {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        }
        Bitmap nativeDecodeStream = nativeDecodeStream(inputStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        setWebpBitmapOptions(nativeDecodeStream, options);
        setPaddingDefaultValues(rect);
        return nativeDecodeStream;
    }

    public static native Bitmap nativeDecodeByteArray(byte[] bArr, int i2, int i3, BitmapFactory.Options options, float f2, byte[] bArr2);

    public static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f2, byte[] bArr);

    public static native long nativeSeek(FileDescriptor fileDescriptor, long j2, boolean z2);

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i2, int i3) {
        return BitmapFactory.decodeByteArray(bArr, i2, i3);
    }

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i2, int i3, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i2, i3, options);
    }

    public static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i2) {
        return BitmapFactory.decodeResource(resources, i2);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i2, options);
    }

    public static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    public static void setBitmapSize(BitmapFactory.Options options, int i2, int i3) {
        if (options != null) {
            options.outWidth = i2;
            options.outHeight = i3;
        }
    }

    public static boolean setOutDimensions(BitmapFactory.Options options, int i2, int i3) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i2;
        options.outHeight = i3;
        return true;
    }

    public static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    public static void setWebpBitmapOptions(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null) {
            if (options != null) {
                int i2 = options.inDensity;
                if (i2 != 0) {
                    bitmap.setDensity(i2);
                    int i3 = options.inTargetDensity;
                    if (!(i3 == 0 || i2 == i3 || i2 == options.inScreenDensity || !options.inScaled)) {
                        bitmap.setDensity(i3);
                    }
                } else if (options.inBitmap != null) {
                    bitmap.setDensity(160);
                }
            } else {
                return;
            }
        } else if (options == null) {
            return;
        }
        options.outMimeType = "image/webp";
    }

    public static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT < 19 || options == null) {
            return true;
        }
        return options.inPremultiplied;
    }
}

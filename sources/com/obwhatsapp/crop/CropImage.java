package com.obwhatsapp.crop;

import X.AnonymousClass01V;
import X.AnonymousClass1A9;
import X.AnonymousClass1H9;
import X.AnonymousClass1MF;
import X.AnonymousClass2QO;
import X.C13680ns;
import X.C14570pP;
import X.C14730pf;
import X.C14870pt;
import X.C16150sX;
import X.C17090uW;
import X.C17250um;
import X.C26051Md;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class CropImage extends C14570pP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Bitmap.CompressFormat A0A;
    public Bitmap A0B;
    public Matrix A0C;
    public Matrix A0D;
    public Rect A0E;
    public Uri A0F;
    public C14870pt A0G;
    public C17090uW A0H;
    public AnonymousClass01V A0I;
    public AnonymousClass1H9 A0J;
    public C14730pf A0K;
    public CropImageView A0L;
    public AnonymousClass2QO A0M;
    public C26051Md A0N;
    public C17250um A0O;
    public AnonymousClass1MF A0P;
    public AnonymousClass1A9 A0Q;
    public String A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;

    public CropImage() {
        this(0);
        this.A0A = Bitmap.CompressFormat.JPEG;
        this.A0Z = true;
        this.A09 = 1;
    }

    public CropImage(int i2) {
        this.A0V = false;
        C13680ns.A1G(this, 61);
    }

    public static final Intent A02() {
        Log.e("profileinfo/activityres/fail/load-image");
        return C13680ns.A09().putExtra("io-error", true).putExtra("error_message_id", R.string.str0848);
    }

    public void A1q() {
        if (!this.A0V) {
            this.A0V = true;
            C16150sX r1 = C14570pP.A1T(this).A1s;
            this.A05 = C16150sX.A1B(r1);
            this.A0G = C16150sX.A02(r1);
            this.A0O = C16150sX.A0i(r1);
            this.A0H = C16150sX.A03(r1);
            this.A0K = (C14730pf) r1.ANy.get();
            this.A0N = (C26051Md) r1.AAb.get();
            this.A0Q = (AnonymousClass1A9) r1.AE7.get();
            this.A0I = C16150sX.A0T(r1);
            this.A0J = (AnonymousClass1H9) r1.AOj.get();
            this.A0P = (AnonymousClass1MF) r1.ANa.get();
        }
    }

    public final void A2B(Rect rect) {
        int i2 = rect.left;
        int i3 = this.A09;
        rect.left = i2 * i3;
        rect.right *= i3;
        rect.top *= i3;
        rect.bottom *= i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x03e7, code lost:
        if (r5.A01 == 0) goto L_0x03e9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x05ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:174:0x063d */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x04d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            java.lang.String r9 = "x"
            r2 = 1
            r5 = r19
            r5.requestWindowFeature(r2)
            r7 = r20
            super.onCreate(r7)
            X.0sq r3 = r5.A05
            X.1H9 r1 = r5.A0J
            r4 = 1
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r0.<init>(r1, r2)
            r3.Acl(r0)
            android.view.Window r1 = r5.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r1.addFlags(r0)
            android.view.LayoutInflater r1 = r5.getLayoutInflater()
            r0 = 2131558914(0x7f0d0202, float:1.8743157E38)
            r10 = 0
            android.view.View r0 = r1.inflate(r0, r10)
            r5.setContentView((android.view.View) r0)
            X.01V r3 = r5.A0I
            android.view.Window r1 = r5.getWindow()
            r0 = 2131365864(0x7f0a0fe8, float:1.8351605E38)
            android.view.View r0 = r5.findViewById(r0)
            X.C41971wz.A00(r0, r1, r3)
            r0 = 2131364083(0x7f0a08f3, float:1.8347993E38)
            android.view.View r0 = r5.findViewById(r0)
            com.obwhatsapp.crop.CropImageView r0 = (com.obwhatsapp.crop.CropImageView) r0
            r5.A0L = r0
            android.content.Intent r6 = r5.getIntent()
            android.os.Bundle r8 = r6.getExtras()
            java.lang.String r1 = "initialRect"
            r3 = 0
            if (r8 == 0) goto L_0x01b9
            java.lang.String r0 = "circleCrop"
            java.lang.String r0 = r8.getString(r0)
            if (r0 == 0) goto L_0x0069
            r5.A0S = r2
            r5.A00 = r2
            r5.A01 = r2
        L_0x0069:
            java.lang.String r0 = "output"
            android.os.Parcelable r0 = r8.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r5.A0F = r0
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "outputFormat"
            java.lang.String r0 = r8.getString(r0)
            if (r0 == 0) goto L_0x0083
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.valueOf(r0)
            r5.A0A = r0
        L_0x0083:
            java.lang.String r0 = "aspectX"
            int r0 = r8.getInt(r0)
            r5.A00 = r0
            java.lang.String r0 = "aspectY"
            int r0 = r8.getInt(r0)
            r5.A01 = r0
            java.lang.String r0 = "outputX"
            int r0 = r8.getInt(r0)
            r5.A06 = r0
            java.lang.String r0 = "outputY"
            int r0 = r8.getInt(r0)
            r5.A07 = r0
            java.lang.String r0 = "minCrop"
            int r0 = r8.getInt(r0)
            r5.A05 = r0
            java.lang.String r0 = "maxCrop"
            int r0 = r8.getInt(r0)
            r5.A03 = r0
            android.os.Parcelable r0 = r8.getParcelable(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r5.A0E = r0
            java.lang.String r0 = "cropByOutputSize"
            boolean r0 = r8.getBoolean(r0, r2)
            r5.A0T = r0
            java.lang.String r0 = "scale"
            boolean r0 = r8.getBoolean(r0, r2)
            r5.A0Y = r0
            java.lang.String r0 = "scaleUpIfNeeded"
            boolean r0 = r8.getBoolean(r0, r2)
            r5.A0Z = r0
            java.lang.String r0 = "maxFileSize"
            int r0 = r8.getInt(r0)
            r5.A04 = r0
            java.lang.String r0 = "flattenRotation"
            boolean r0 = r8.getBoolean(r0, r2)
            r5.A0U = r0
            java.lang.String r0 = "webImageSource"
            java.lang.String r0 = r8.getString(r0)
            r5.A0R = r0
            java.lang.String r0 = "rotateAspect"
            boolean r0 = r8.getBoolean(r0, r3)
            r5.A0W = r0
        L_0x00f7:
            if (r20 == 0) goto L_0x010a
            java.lang.String r0 = "rotate"
            int r0 = r7.getInt(r0)
            r5.A08 = r0
            android.os.Parcelable r0 = r7.getParcelable(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r5.A0E = r0
        L_0x010a:
            java.lang.String r0 = "crop/oncreate/ bitmap:"
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0r(r0)
            android.graphics.Bitmap r0 = r5.A0B
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r11.append(r0)
            java.lang.String r0 = " aspectX:"
            r11.append(r0)
            int r0 = r5.A00
            r11.append(r0)
            java.lang.String r0 = " aspectY:"
            r11.append(r0)
            int r0 = r5.A01
            r11.append(r0)
            java.lang.String r0 = " outputX:"
            r11.append(r0)
            int r0 = r5.A06
            r11.append(r0)
            java.lang.String r0 = " outputY:"
            r11.append(r0)
            int r0 = r5.A07
            r11.append(r0)
            java.lang.String r0 = " minCrop:"
            r11.append(r0)
            int r0 = r5.A05
            r11.append(r0)
            java.lang.String r0 = " maxCrop:"
            r11.append(r0)
            int r0 = r5.A03
            r11.append(r0)
            java.lang.String r0 = " cropByOutputSize:"
            r11.append(r0)
            boolean r0 = r5.A0T
            r11.append(r0)
            java.lang.String r0 = " initialRect:"
            r11.append(r0)
            android.graphics.Rect r12 = r5.A0E
            java.lang.String r1 = "null"
            if (r12 != 0) goto L_0x0194
            r0 = r1
        L_0x016b:
            r11.append(r0)
            java.lang.String r0 = " scale:"
            r11.append(r0)
            boolean r0 = r5.A0Y
            r11.append(r0)
            java.lang.String r0 = " scaleUp:"
            r11.append(r0)
            boolean r0 = r5.A0Z
            r11.append(r0)
            java.lang.String r0 = " flattenRotation:"
            r11.append(r0)
            boolean r0 = r5.A0U
            r11.append(r0)
            X.C13680ns.A1V(r11)
            android.net.Uri r8 = r6.getData()
            goto L_0x01c0
        L_0x0194:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0o()
            int r0 = r12.left
            r8.append(r0)
            java.lang.String r7 = ","
            r8.append(r7)
            int r0 = r12.top
            r8.append(r0)
            r8.append(r7)
            int r0 = r12.right
            r8.append(r0)
            r8.append(r7)
            int r0 = r12.bottom
            java.lang.String r0 = X.AnonymousClass000.A0l(r8, r0)
            goto L_0x016b
        L_0x01b9:
            java.lang.String r0 = "crop/oncreate/no-extras"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00f7
        L_0x01c0:
            X.01V r0 = r5.A0I     // Catch:{ IOException -> 0x063e }
            android.content.ContentResolver r0 = r0.A0C()     // Catch:{ IOException -> 0x063e }
            int r0 = X.C17970vw.A01(r0, r8)     // Catch:{ IOException -> 0x063e }
            r5.A02 = r0     // Catch:{ IOException -> 0x063e }
            android.graphics.Matrix r12 = X.C17970vw.A08(r0)     // Catch:{ IOException -> 0x063e }
            r5.A0D = r12     // Catch:{ IOException -> 0x063e }
            boolean r0 = r5.A0W     // Catch:{ IOException -> 0x063e }
            r11 = 8
            if (r0 == 0) goto L_0x01e7
            int r7 = r5.A02     // Catch:{ IOException -> 0x063e }
            r0 = 6
            if (r7 == r0) goto L_0x01df
            if (r7 != r11) goto L_0x01e7
        L_0x01df:
            int r7 = r5.A00     // Catch:{ IOException -> 0x063e }
            int r0 = r5.A01     // Catch:{ IOException -> 0x063e }
            r5.A00 = r0     // Catch:{ IOException -> 0x063e }
            r5.A01 = r7     // Catch:{ IOException -> 0x063e }
        L_0x01e7:
            if (r12 != 0) goto L_0x01ef
            android.graphics.Matrix r0 = X.AnonymousClass000.A0H()     // Catch:{ IOException -> 0x063e }
            r5.A0D = r0     // Catch:{ IOException -> 0x063e }
        L_0x01ef:
            android.graphics.BitmapFactory$Options r14 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x063e }
            r14.<init>()     // Catch:{ IOException -> 0x063e }
            X.1A9 r0 = r5.A0Q     // Catch:{ IOException -> 0x063e }
            java.io.InputStream r7 = r0.A0b(r8, r2)     // Catch:{ IOException -> 0x063e }
            r14.inJustDecodeBounds = r2     // Catch:{ all -> 0x0639 }
            android.graphics.BitmapFactory.decodeStream(r7, r10, r14)     // Catch:{ all -> 0x0639 }
            int r0 = r14.outWidth     // Catch:{ all -> 0x0639 }
            java.lang.String r12 = "cropimage/not-a-image"
            if (r0 <= 0) goto L_0x0614
            int r0 = r14.outHeight     // Catch:{ all -> 0x0639 }
            if (r0 <= 0) goto L_0x0614
            r7.close()     // Catch:{ IOException -> 0x063e }
            X.1A9 r0 = r5.A0Q     // Catch:{ OutOfMemoryError -> 0x05ef }
            java.io.InputStream r7 = r0.A0b(r8, r2)     // Catch:{ OutOfMemoryError -> 0x05ef }
            android.graphics.Point r0 = new android.graphics.Point     // Catch:{ all -> 0x05ea }
            r0.<init>()     // Catch:{ all -> 0x05ea }
            X.C13680ns.A0s(r5, r0)     // Catch:{ all -> 0x05ea }
            r14.inDither = r2     // Catch:{ all -> 0x05ea }
            r14.inScaled = r3     // Catch:{ all -> 0x05ea }
            int r10 = r0.x     // Catch:{ all -> 0x05ea }
            int r0 = r0.y     // Catch:{ all -> 0x05ea }
            r15 = 0
            r18 = 0
            X.25c r13 = new X.25c     // Catch:{ all -> 0x05ea }
            r17 = r0
            r16 = r10
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x05ea }
            X.25d r0 = X.C37741pe.A04(r15, r13, r7, r3)     // Catch:{ all -> 0x05ea }
            android.graphics.Bitmap r0 = r0.A02     // Catch:{ all -> 0x05ea }
            r5.A0B = r0     // Catch:{ all -> 0x05ea }
            int r11 = r14.inSampleSize     // Catch:{ all -> 0x05ea }
            r5.A09 = r11     // Catch:{ all -> 0x05ea }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x05ea }
            java.lang.String r0 = "crop/oncreate/bitmap orientation:"
            r10.append(r0)     // Catch:{ all -> 0x05ea }
            int r0 = r5.A02     // Catch:{ all -> 0x05ea }
            r10.append(r0)     // Catch:{ all -> 0x05ea }
            java.lang.String r0 = " "
            r10.append(r0)     // Catch:{ all -> 0x05ea }
            int r0 = r14.outWidth     // Catch:{ all -> 0x05ea }
            r10.append(r0)     // Catch:{ all -> 0x05ea }
            r10.append(r9)     // Catch:{ all -> 0x05ea }
            int r0 = r14.outHeight     // Catch:{ all -> 0x05ea }
            r10.append(r0)     // Catch:{ all -> 0x05ea }
            java.lang.String r0 = " sample:"
            r10.append(r0)     // Catch:{ all -> 0x05ea }
            r10.append(r11)     // Catch:{ all -> 0x05ea }
            java.lang.String r0 = " uri:"
            r10.append(r0)     // Catch:{ all -> 0x05ea }
            r10.append(r8)     // Catch:{ all -> 0x05ea }
            X.C13680ns.A1V(r10)     // Catch:{ all -> 0x05ea }
            android.graphics.Rect r10 = r5.A0E     // Catch:{ all -> 0x05ea }
            if (r10 == 0) goto L_0x0287
            int r0 = r10.left     // Catch:{ all -> 0x05ea }
            int r8 = r5.A09     // Catch:{ all -> 0x05ea }
            int r0 = r0 / r8
            r10.left = r0     // Catch:{ all -> 0x05ea }
            int r0 = r10.top     // Catch:{ all -> 0x05ea }
            int r0 = r0 / r8
            r10.top = r0     // Catch:{ all -> 0x05ea }
            int r0 = r10.right     // Catch:{ all -> 0x05ea }
            int r0 = r0 / r8
            r10.right = r0     // Catch:{ all -> 0x05ea }
            int r0 = r10.bottom     // Catch:{ all -> 0x05ea }
            int r0 = r0 / r8
            r10.bottom = r0     // Catch:{ all -> 0x05ea }
        L_0x0287:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x05ea }
            java.lang.String r0 = "crop/oncreate/bitmap:"
            r8.append(r0)     // Catch:{ all -> 0x05ea }
            android.graphics.Bitmap r0 = r5.A0B     // Catch:{ all -> 0x05ea }
            if (r0 == 0) goto L_0x02ac
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x05ea }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x05ea }
            r1.append(r0)     // Catch:{ all -> 0x05ea }
            r1.append(r9)     // Catch:{ all -> 0x05ea }
            android.graphics.Bitmap r0 = r5.A0B     // Catch:{ all -> 0x05ea }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x05ea }
            java.lang.String r1 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ all -> 0x05ea }
        L_0x02ac:
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r8)     // Catch:{ all -> 0x05ea }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05ea }
            r7.close()     // Catch:{ OutOfMemoryError -> 0x05ef }
            android.graphics.Bitmap r0 = r5.A0B
            if (r0 == 0) goto L_0x05ca
            int r0 = r0.getWidth()
            if (r0 == 0) goto L_0x05ca
            android.graphics.Bitmap r0 = r5.A0B
            int r0 = r0.getHeight()
            if (r0 == 0) goto L_0x05ca
            java.lang.String r0 = "rotation"
            int r8 = r6.getIntExtra(r0, r3)
            java.lang.String r0 = "flipH"
            boolean r10 = r6.getBooleanExtra(r0, r3)
            java.lang.String r0 = "flipV"
            boolean r9 = r6.getBooleanExtra(r0, r3)
            java.lang.String r0 = "crop/oncreate/bitmap add-rotation:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r8)
            java.lang.String r0 = " flip-h:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " flip-v:"
            r1.append(r0)
            r1.append(r9)
            X.C13680ns.A1V(r1)
            android.graphics.Matrix r0 = X.AnonymousClass000.A0H()
            r5.A0C = r0
            r7 = 9
            if (r10 == 0) goto L_0x0312
            android.graphics.Matrix r1 = X.AnonymousClass000.A0H()
            float[] r0 = new float[r7]
            r0 = {-1082130432, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            r1.setValues(r0)
            android.graphics.Matrix r0 = r5.A0C
            r0.postConcat(r1)
        L_0x0312:
            if (r9 == 0) goto L_0x0325
            android.graphics.Matrix r1 = X.AnonymousClass000.A0H()
            float[] r0 = new float[r7]
            r0 = {1065353216, 0, 0, 0, -1082130432, 0, 0, 0, 1065353216} // fill-array
            r1.setValues(r0)
            android.graphics.Matrix r0 = r5.A0C
            r0.postConcat(r1)
        L_0x0325:
            if (r8 == 0) goto L_0x032d
            android.graphics.Matrix r1 = r5.A0C
            float r0 = (float) r8
            r1.postRotate(r0)
        L_0x032d:
            android.graphics.Matrix r1 = r5.A0C
            int r0 = r5.A08
            float r0 = (float) r0
            r1.postRotate(r0)
            android.graphics.Bitmap r0 = r5.A0B
            X.2TL r8 = new X.2TL
            r8.<init>(r0)
            android.graphics.Matrix r1 = X.AnonymousClass000.A0H()
            android.graphics.Matrix r0 = r5.A0D
            r1.set(r0)
            android.graphics.Matrix r0 = r5.A0C
            r1.postConcat(r0)
            r8.A01 = r1
            java.lang.String r0 = "filter"
            int r7 = r6.getIntExtra(r0, r3)
            if (r7 == 0) goto L_0x0360
            android.graphics.Bitmap r1 = r5.A0B
            X.1Md r0 = r5.A0N
            android.graphics.Bitmap r0 = com.whatsapp.filter.FilterUtils.A00(r1, r0, r7, r3)
            r5.A0B = r0
            r8.A00 = r0
        L_0x0360:
            java.lang.String r0 = "doodle"
            java.lang.String r7 = r6.getStringExtra(r0)
            if (r7 == 0) goto L_0x03b2
            X.0um r6 = r5.A0O
            X.013 r1 = r5.A01
            X.1MF r0 = r5.A0P
            X.3Bj r7 = X.C62033Bj.A03(r5, r1, r6, r0, r7)
            if (r7 == 0) goto L_0x03b2
            android.graphics.Bitmap r0 = r5.A0B
            boolean r0 = r0.isMutable()
            if (r0 != 0) goto L_0x0388
            android.graphics.Bitmap r1 = r5.A0B
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = r1.copy(r0, r2)
            r5.A0B = r0
            r8.A00 = r0
        L_0x0388:
            android.graphics.Bitmap r6 = r5.A0B
            int r11 = r7.A02
            android.graphics.Matrix r1 = r8.A01
            r14 = 0
            if (r1 == 0) goto L_0x03a9
            r0 = 2
            float[] r13 = new float[r0]
            r13 = {0, 1065353216} // fill-array
            r1.mapVectors(r13)
            r12 = r13[r3]
            r1 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x05c0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r14 = 270(0x10e, float:3.78E-43)
            if (r0 <= 0) goto L_0x03a9
            r14 = 90
        L_0x03a9:
            int r11 = r11 + r14
            int r0 = r5.A08
            int r11 = r11 + r0
            int r0 = r11 % 360
            r7.A07(r6, r0, r10, r9)
        L_0x03b2:
            com.obwhatsapp.crop.CropImageView r0 = r5.A0L
            r0.A04(r8, r2)
            android.graphics.Bitmap r0 = r5.A0B
            int r10 = r0.getWidth()
            android.graphics.Bitmap r0 = r5.A0B
            int r7 = r0.getHeight()
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r3, r3, r10, r7)
            android.graphics.Rect r0 = r5.A0E
            if (r0 == 0) goto L_0x0552
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r0)
        L_0x03d1:
            com.obwhatsapp.crop.CropImageView r0 = r5.A0L
            X.2QO r2 = new X.2QO
            r2.<init>(r0)
            com.obwhatsapp.crop.CropImageView r0 = r5.A0L
            android.graphics.Matrix r12 = r0.getImageMatrix()
            boolean r11 = r5.A0S
            int r0 = r5.A00
            if (r0 == 0) goto L_0x03e9
            int r0 = r5.A01
            r9 = 1
            if (r0 != 0) goto L_0x03ea
        L_0x03e9:
            r9 = 0
        L_0x03ea:
            boolean r7 = r5.A0T
            int r6 = r5.A05
            int r0 = r5.A09
            int r6 = r6 / r0
            r1 = 1
            if (r11 == 0) goto L_0x03f5
            r9 = 1
        L_0x03f5:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r12)
            r2.A03 = r0
            r2.A05 = r10
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r8)
            r2.A06 = r0
            if (r9 != 0) goto L_0x040a
            if (r7 != 0) goto L_0x040a
            r1 = 0
        L_0x040a:
            r2.A0A = r1
            r2.A08 = r11
            r2.A01 = r6
            android.graphics.RectF r0 = r2.A05
            float r1 = r0.width()
            android.graphics.RectF r0 = r2.A05
            float r0 = r0.height()
            float r1 = r1 / r0
            r2.A00 = r1
            android.graphics.Rect r0 = r2.A02()
            r2.A04 = r0
            android.graphics.Paint r0 = r2.A0B
            r1 = 128(0x80, float:1.794E-43)
            r0.setARGB(r1, r3, r3, r3)
            android.graphics.Paint r0 = r2.A0C
            r0.setARGB(r1, r3, r3, r3)
            android.graphics.Paint r0 = r2.A0D
            X.C13690nt.A0y(r0)
            r0.setAntiAlias(r3)
            r2.A02 = r3
            com.obwhatsapp.crop.CropImageView r1 = r5.A0L
            java.util.ArrayList r0 = r1.A06
            r0.add(r2)
            r1.invalidate()
            r5.A0M = r2
            r0 = 2131362570(0x7f0a030a, float:1.8344924E38)
            android.view.View r1 = r5.findViewById(r0)
            r0 = 38
            X.C13680ns.A17(r1, r5, r0)
            r0 = 2131364898(0x7f0a0c22, float:1.8349646E38)
            android.view.View r1 = r5.findViewById(r0)
            r0 = 37
            X.C13680ns.A17(r1, r5, r0)
            r0 = 2131365865(0x7f0a0fe9, float:1.8351607E38)
            android.view.View r1 = r5.findViewById(r0)
            r0 = 39
            X.C13680ns.A17(r1, r5, r0)
            boolean r0 = r5.A0T
            if (r0 == 0) goto L_0x0474
            r0 = 8
            r1.setVisibility(r0)
        L_0x0474:
            java.lang.String r0 = r5.A0R
            if (r0 == 0) goto L_0x0524
            X.0pt r10 = r5.A0G
            X.01V r8 = r5.A0I
            X.0uW r7 = r5.A0H
            r0 = 2131887643(0x7f12061b, float:1.9409899E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r16 = "https://www.whatsapp.com/legal/"
            java.lang.String r12 = "terms-and-privacy-policy"
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r0)
            int r1 = r9.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r11 = 0
            java.lang.Object[] r2 = r9.getSpans(r3, r1, r0)
            android.text.style.URLSpan[] r2 = (android.text.style.URLSpan[]) r2
            if (r2 == 0) goto L_0x054f
            int r1 = r2.length
        L_0x04a3:
            if (r11 >= r1) goto L_0x054f
            r6 = r2[r11]
            java.lang.String r0 = r6.getURL()
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x054b
            int r2 = r9.getSpanStart(r6)
            int r1 = r9.getSpanEnd(r6)
            int r0 = r9.getSpanFlags(r6)
            r9.removeSpan(r6)
            X.2uk r11 = new X.2uk
            r12 = r5
            r13 = r7
            r14 = r10
            r15 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            r9.setSpan(r11, r2, r1, r0)
        L_0x04cc:
            r8 = -10066330(0xffffffffff666666, float:-3.0625412E38)
            r7 = 0
            r6 = 1069547520(0x3fc00000, float:1.5)
            if (r9 == 0) goto L_0x04e8
            r0 = 2131366703(0x7f0a132f, float:1.8353307E38)
            android.view.View r1 = r5.findViewById(r0)
            com.obwhatsapp.TextEmojiLabel r1 = (com.obwhatsapp.TextEmojiLabel) r1
            r1.setVisibility(r3)
            X.01V r0 = r5.A0I
            X.C30531cW.A04(r1, r0, r9)
            r1.setShadowLayer(r6, r7, r6, r8)
        L_0x04e8:
            X.0pt r9 = r5.A0G
            X.01V r2 = r5.A0I
            X.0uW r1 = r5.A0H
            java.lang.String r0 = r5.A0R
            X.2uk r10 = new X.2uk
            r11 = r5
            r12 = r1
            r13 = r9
            r14 = r2
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.String r0 = r5.A0R
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r0 = r0.getHost()
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            int r0 = r2.length()
            r2.setSpan(r10, r3, r0, r3)
            r0 = 2131364093(0x7f0a08fd, float:1.8348013E38)
            android.view.View r1 = r5.findViewById(r0)
            com.obwhatsapp.TextEmojiLabel r1 = (com.obwhatsapp.TextEmojiLabel) r1
            r1.setVisibility(r3)
            X.01V r0 = r5.A0I
            X.C30531cW.A04(r1, r0, r2)
            r1.setShadowLayer(r6, r7, r6, r8)
        L_0x0524:
            r0 = 2131364086(0x7f0a08f6, float:1.8348E38)
            android.view.View r3 = r5.findViewById(r0)
            android.graphics.Rect r2 = X.AnonymousClass000.A0J()
            com.obwhatsapp.crop.CropImageView r1 = r5.A0L
            X.3Mj r0 = new X.3Mj
            r0.<init>(r2, r1, r5)
            r3.setTouchDelegate(r0)
            java.lang.String r0 = "crop/oncreate/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sq r2 = r5.A05
            X.1H9 r1 = r5.A0J
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r0.<init>(r1, r4)
            r2.Acl(r0)
            return
        L_0x054b:
            int r11 = r11 + 1
            goto L_0x04a3
        L_0x054f:
            r9 = 0
            goto L_0x04cc
        L_0x0552:
            boolean r0 = r5.A0T
            if (r0 == 0) goto L_0x05bd
            int r0 = r5.A06
            if (r0 >= r10) goto L_0x05ba
            int r1 = r5.A07
            if (r1 >= r10) goto L_0x05ba
            float r2 = (float) r10
            float r1 = (float) r1
            float r2 = r2 * r1
            float r0 = (float) r0
            float r2 = r2 / r0
            int r9 = (int) r2
            r0 = r10
        L_0x0565:
            int r6 = r5.A00
            if (r6 == 0) goto L_0x0572
            int r1 = r5.A01
            if (r1 == 0) goto L_0x0572
            if (r6 <= r1) goto L_0x05b6
            int r1 = r1 * r0
            int r9 = r1 / r6
        L_0x0572:
            if (r9 <= r7) goto L_0x057b
            float r2 = (float) r9
            float r1 = (float) r7
            float r2 = r2 / r1
            float r0 = (float) r0
            float r0 = r0 / r2
            int r0 = (int) r0
            r9 = r7
        L_0x057b:
            if (r0 <= r10) goto L_0x0584
            float r1 = (float) r0
            float r0 = (float) r10
            float r1 = r1 / r0
            float r0 = (float) r9
            float r0 = r0 / r1
            int r9 = (int) r0
            r0 = r10
        L_0x0584:
            int r2 = r5.A05
            if (r2 <= 0) goto L_0x05a3
            int r1 = r5.A09
            int r2 = r2 / r1
            if (r0 >= r2) goto L_0x0597
            r0 = r2
            if (r6 == 0) goto L_0x0597
            int r1 = r5.A01
            if (r1 == 0) goto L_0x0597
            int r1 = r1 * r2
            int r9 = r1 / r6
        L_0x0597:
            if (r9 >= r2) goto L_0x05a3
            r9 = r2
            if (r6 == 0) goto L_0x05a3
            int r1 = r5.A01
            if (r1 == 0) goto L_0x05a3
            int r6 = r6 * r2
            int r0 = r6 / r1
        L_0x05a3:
            int r10 = r10 - r0
            int r1 = r10 >> 1
            int r7 = r7 - r9
            int r7 = r7 >> 1
            float r6 = (float) r1
            float r2 = (float) r7
            int r1 = r1 + r0
            float r1 = (float) r1
            int r7 = r7 + r9
            float r0 = (float) r7
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r6, r2, r1, r0)
            goto L_0x03d1
        L_0x05b6:
            int r0 = r9 * r6
            int r0 = r0 / r1
            goto L_0x0572
        L_0x05ba:
            int r9 = r5.A07
            goto L_0x0565
        L_0x05bd:
            r0 = r10
            r9 = r7
            goto L_0x0565
        L_0x05c0:
            r0 = r13[r2]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x03a9
            r14 = 180(0xb4, float:2.52E-43)
            goto L_0x03a9
        L_0x05ca:
            com.whatsapp.util.Log.e((java.lang.String) r12)
            java.lang.String r0 = "profileinfo/activityres/fail/not-a-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r1 = X.C13680ns.A09()
            java.lang.String r0 = "not-a-image"
            android.content.Intent r2 = r1.putExtra(r0, r2)
            r1 = 2131888192(0x7f120840, float:1.9411012E38)
            java.lang.String r0 = "error_message_id"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            r5.setResult(r3, r0)
            goto L_0x066b
        L_0x05ea:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x05ee }
        L_0x05ee:
            throw r0     // Catch:{ OutOfMemoryError -> 0x05ef }
        L_0x05ef:
            r1 = move-exception
            java.lang.String r0 = "cropimage/oom"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x063e }
            java.lang.String r0 = "profileinfo/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x063e }
            android.content.Intent r1 = X.C13680ns.A09()     // Catch:{ IOException -> 0x063e }
            java.lang.String r0 = "error-oom"
            android.content.Intent r2 = r1.putExtra(r0, r2)     // Catch:{ IOException -> 0x063e }
            r1 = 2131888213(0x7f120855, float:1.9411055E38)
            java.lang.String r0 = "error_message_id"
            android.content.Intent r0 = r2.putExtra(r0, r1)     // Catch:{ IOException -> 0x063e }
            r5.setResult(r3, r0)     // Catch:{ IOException -> 0x063e }
            r5.finish()     // Catch:{ IOException -> 0x063e }
            return
        L_0x0614:
            com.whatsapp.util.Log.e((java.lang.String) r12)     // Catch:{ all -> 0x0639 }
            java.lang.String r0 = "profileinfo/activityres/fail/not-a-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0639 }
            android.content.Intent r1 = X.C13680ns.A09()     // Catch:{ all -> 0x0639 }
            java.lang.String r0 = "not-a-image"
            android.content.Intent r2 = r1.putExtra(r0, r2)     // Catch:{ all -> 0x0639 }
            r1 = 2131888192(0x7f120840, float:1.9411012E38)
            java.lang.String r0 = "error_message_id"
            android.content.Intent r0 = r2.putExtra(r0, r1)     // Catch:{ all -> 0x0639 }
            r5.setResult(r3, r0)     // Catch:{ all -> 0x0639 }
            r5.finish()     // Catch:{ all -> 0x0639 }
            r7.close()     // Catch:{ IOException -> 0x063e }
            return
        L_0x0639:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x063d }
        L_0x063d:
            throw r0     // Catch:{ IOException -> 0x063e }
        L_0x063e:
            r6 = move-exception
            java.lang.String r0 = r6.getMessage()
            if (r0 == 0) goto L_0x066f
            boolean r0 = X.C13690nt.A1T(r6)
            if (r0 == 0) goto L_0x066f
            java.lang.String r0 = "profileinfo/activityres/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r1 = X.C13680ns.A09()
            java.lang.String r0 = "no-space"
            android.content.Intent r2 = r1.putExtra(r0, r4)
            r1 = 2131888210(0x7f120852, float:1.9411049E38)
            java.lang.String r0 = "error_message_id"
            android.content.Intent r0 = r2.putExtra(r0, r1)
        L_0x0663:
            r5.setResult(r3, r0)
            java.lang.String r0 = "cropimage"
            com.whatsapp.util.Log.e(r0, r6)
        L_0x066b:
            r5.finish()
            return
        L_0x066f:
            android.content.Intent r0 = A02()
            goto L_0x0663
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.crop.CropImage.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        Log.i("crop/ondestroy");
        super.onDestroy();
        Bitmap bitmap = this.A0B;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.A0L.A05 = true;
            this.A0B.recycle();
            this.A0B = null;
        }
        this.A05.Acl(new RunnableRunnableShape8S0100000_I0_7(this.A0J, 1));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("rotate", this.A08);
        Rect A012 = this.A0M.A01();
        A2B(A012);
        bundle.putParcelable("initialRect", A012);
    }
}

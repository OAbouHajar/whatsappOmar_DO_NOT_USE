package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import com.facebook.redex.RunnableRunnableShape0S0210000_I0;

/* renamed from: X.2QM  reason: invalid class name */
public abstract class AnonymousClass2QM extends AnonymousClass2QN {
    public float A00 = 3.0f;
    public float A01;
    public int A02 = -1;
    public int A03 = -1;
    public C107975Me A04;
    public Runnable A05;
    public final Matrix A06 = new Matrix();
    public final Matrix A07 = new Matrix();
    public final Matrix A08 = new Matrix();
    public final Handler A09 = new Handler(Looper.getMainLooper());
    public final AnonymousClass2TL A0A = new AnonymousClass2TL((Bitmap) null);
    public final float[] A0B = new float[9];

    public AnonymousClass2QM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r1 < r2) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r8 = this;
            X.2TL r3 = r8.A0A
            android.graphics.Bitmap r0 = r3.A00
            if (r0 == 0) goto L_0x0052
            android.graphics.Matrix r2 = r8.getImageViewMatrix()
            android.graphics.Bitmap r0 = r3.A00
            int r0 = r0.getWidth()
            float r1 = (float) r0
            android.graphics.Bitmap r0 = r3.A00
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r3 = 0
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r3, r3, r1, r0)
            r2.mapRect(r5)
            float r1 = r5.height()
            float r7 = r5.width()
            r6 = 1073741824(0x40000000, float:2.0)
            int r0 = r8.getHeight()
            float r4 = (float) r0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0062
            float r4 = r4 - r1
            float r4 = r4 / r6
            float r0 = r5.top
        L_0x0038:
            float r4 = r4 - r0
        L_0x0039:
            int r0 = r8.getWidth()
            float r2 = (float) r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0053
            float r2 = r2 - r7
            float r2 = r2 / r6
            float r1 = r5.left
        L_0x0046:
            float r3 = r2 - r1
        L_0x0048:
            r8.A01(r3, r4)
            android.graphics.Matrix r0 = r8.getImageViewMatrix()
            r8.setImageMatrix(r0)
        L_0x0052:
            return
        L_0x0053:
            float r1 = r5.left
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x005b
            float r3 = -r1
            goto L_0x0048
        L_0x005b:
            float r1 = r5.right
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0048
            goto L_0x0046
        L_0x0062:
            float r1 = r5.top
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
            float r4 = -r1
            goto L_0x0039
        L_0x006a:
            float r0 = r5.bottom
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0078
            int r0 = r8.getHeight()
            float r4 = (float) r0
            float r0 = r5.bottom
            goto L_0x0038
        L_0x0078:
            r4 = 0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2QM.A00():void");
    }

    public void A01(float f2, float f3) {
        this.A08.postTranslate(f2, f3);
    }

    public void A02(float f2, float f3, float f4) {
        float f5 = this.A01;
        if (f2 > f5) {
            f2 = f5;
        }
        float scale = f2 / getScale();
        this.A08.postScale(scale, scale, f3, f4);
        setImageMatrix(getImageViewMatrix());
        A00();
    }

    public final void A03(Matrix matrix, AnonymousClass2TL r11) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        boolean A002 = r11.A00();
        Bitmap bitmap = r11.A00;
        float height2 = (float) (A002 ? bitmap.getHeight() : bitmap.getWidth());
        boolean A003 = r11.A00();
        Bitmap bitmap2 = r11.A00;
        float width2 = (float) (A003 ? bitmap2.getWidth() : bitmap2.getHeight());
        matrix.reset();
        float f2 = this.A00;
        float min = Math.min(Math.min(width / height2, f2), Math.min(height / width2, f2));
        Matrix matrix2 = new Matrix();
        if (r11.A01 != null) {
            matrix2.preTranslate((float) (-(r11.A00.getWidth() >> 1)), (float) (-(r11.A00.getHeight() >> 1)));
            matrix2.postConcat(r11.A01);
            boolean A004 = r11.A00();
            Bitmap bitmap3 = r11.A00;
            float height3 = (float) ((A004 ? bitmap3.getHeight() : bitmap3.getWidth()) >> 1);
            boolean A005 = r11.A00();
            Bitmap bitmap4 = r11.A00;
            matrix2.postTranslate(height3, (float) ((A005 ? bitmap4.getWidth() : bitmap4.getHeight()) >> 1));
        }
        matrix.postConcat(matrix2);
        matrix.postScale(min, min);
        matrix.postTranslate((width - (height2 * min)) / 2.0f, (height - (width2 * min)) / 2.0f);
    }

    public void A04(AnonymousClass2TL r6, boolean z2) {
        float max;
        if (getWidth() <= 0) {
            this.A05 = new RunnableRunnableShape0S0210000_I0(this, r6, 6, z2);
            return;
        }
        Bitmap bitmap = r6.A00;
        Matrix matrix = this.A06;
        if (bitmap != null) {
            A03(matrix, r6);
            setImageBitmap(r6.A00, r6.A01);
        } else {
            matrix.reset();
            super.setImageBitmap((Bitmap) null);
        }
        if (z2) {
            this.A08.reset();
        }
        setImageMatrix(getImageViewMatrix());
        AnonymousClass2TL r4 = this.A0A;
        if (r4.A00 == null) {
            max = 1.0f;
        } else {
            boolean A002 = r4.A00();
            Bitmap bitmap2 = r4.A00;
            float height = ((float) (A002 ? bitmap2.getHeight() : bitmap2.getWidth())) / ((float) this.A03);
            boolean A003 = r4.A00();
            Bitmap bitmap3 = r4.A00;
            max = Math.max(1.0f, Math.max(height, ((float) (A003 ? bitmap3.getWidth() : bitmap3.getHeight())) / ((float) this.A02)) * 4.0f);
        }
        this.A01 = max;
    }

    public Matrix getImageViewMatrix() {
        Matrix matrix = this.A07;
        matrix.set(this.A06);
        matrix.postConcat(this.A08);
        return matrix;
    }

    public float getScale() {
        Matrix matrix = this.A08;
        float[] fArr = this.A0B;
        matrix.getValues(fArr);
        return fArr[0];
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || getScale() <= 1.0f) {
            return super.onKeyDown(i2, keyEvent);
        }
        A02(1.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        return true;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.A03 = i4 - i2;
        this.A02 = i5 - i3;
        Runnable runnable = this.A05;
        if (runnable != null) {
            this.A05 = null;
            runnable.run();
        }
        AnonymousClass2TL r1 = this.A0A;
        if (r1.A00 != null) {
            A03(this.A06, r1);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
        } else {
            A04(new AnonymousClass2TL(bitmap), true);
        }
    }

    public final void setImageBitmap(Bitmap bitmap, Matrix matrix) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
            drawable.setFilterBitmap(true);
        }
        AnonymousClass2TL r0 = this.A0A;
        r0.A00 = bitmap;
        r0.A01 = matrix;
    }

    public void setMaxProperScale(float f2) {
        this.A00 = f2;
    }

    public void setRecycler(C107975Me r1) {
        this.A04 = r1;
    }
}

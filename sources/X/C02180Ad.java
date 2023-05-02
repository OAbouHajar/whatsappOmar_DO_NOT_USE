package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.0Ad  reason: invalid class name and case insensitive filesystem */
public class C02180Ad extends Drawable {
    public static final float[] A07 = {0.0f, 0.15428571f, 0.46666667f, 0.6027778f, 0.69166666f, 1.0f};
    public static final int[] A08;
    public static final int[] A09;
    public static final int[] A0A;
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final Paint A04;
    public final RectF A05 = AnonymousClass000.A0K();
    public final boolean A06;

    static {
        int A002 = AnonymousClass0MU.A00(-6278145, 0.1f);
        A09 = new int[]{A002, AnonymousClass0MU.A00(-15173646, 0.1f), AnonymousClass0MU.A00(-14298266, 0.1f), AnonymousClass0MU.A00(-668109, 0.1f), AnonymousClass0MU.A00(-37796, 0.1f), A002};
        int[] iArr = new int[6];
        int A003 = AnonymousClass0MU.A00(-7982634, 0.2f);
        iArr[0] = A003;
        AnonymousClass0MU.A01(iArr, 0.2f, -15111988, 1);
        AnonymousClass0MU.A01(iArr, 0.2f, -14438052, 2);
        AnonymousClass0MU.A01(iArr, 0.2f, -3494861, 3);
        AnonymousClass0MU.A01(iArr, 0.2f, -2990252, 4);
        iArr[5] = A003;
        A08 = iArr;
        int[] iArr2 = new int[5];
        iArr2[0] = 16777215;
        iArr2[1] = 16777215;
        AnonymousClass0MU.A01(iArr2, 0.3f, -16777216, 2);
        AnonymousClass0MU.A01(iArr2, 0.2f, -16777216, 3);
        iArr2[4] = 16777215;
        A0A = iArr2;
    }

    public C02180Ad(Context context, C14990q7 r4) {
        Paint paint = new Paint();
        this.A04 = paint;
        paint.setAntiAlias(false);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.A03 = AnonymousClass0MV.A00(context, 12.0f);
        this.A06 = r4.A04();
    }

    public final void A00(Rect rect) {
        ComposeShader composeShader;
        SweepGradient sweepGradient = new SweepGradient(this.A00, this.A01, this.A06 ? A08 : A09, A07);
        float f2 = this.A02;
        if (f2 > 0.0f) {
            float f3 = this.A03 / f2;
            float f4 = 1.0f - f3;
            float f5 = (f3 * 0.25f) + f4;
            if (f5 > 1.0f) {
                StringBuilder A0r = AnonymousClass000.A0r("Gradient quarter fraction cannot be greater than 1, value is: ");
                A0r.append(f5);
                C29691b2.A00("CDSCircularShadowDrawable", A0r.toString());
                return;
            }
            float f6 = this.A00;
            float f7 = this.A01;
            int[] iArr = A0A;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            RadialGradient radialGradient = new RadialGradient(f6, f7, f2, iArr, new float[]{0.0f, f4, f4, f5, 1.0f}, tileMode);
            if (Build.VERSION.SDK_INT < 28) {
                Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                float f8 = this.A00;
                float f9 = this.A01;
                float f10 = this.A02;
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setDither(true);
                paint.setShader(radialGradient);
                new Canvas(createBitmap).drawCircle(f8, f9, f10, paint);
                composeShader = new ComposeShader(new BitmapShader(createBitmap, tileMode, tileMode), sweepGradient, PorterDuff.Mode.SRC_IN);
            } else {
                composeShader = new ComposeShader(radialGradient, sweepGradient, PorterDuff.Mode.SRC_IN);
            }
            this.A04.setShader(composeShader);
        }
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(94.0f, this.A00, this.A01);
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A04);
        canvas.restoreToCount(save);
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A05;
        float f2 = this.A03;
        rectF.set(((float) rect.left) + f2, ((float) rect.top) + f2, ((float) rect.right) - f2, ((float) rect.bottom) - f2);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        this.A02 = ((float) rect.width()) / 2.0f;
        A00(rect);
    }

    public void setAlpha(int i2) {
        this.A04.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }
}

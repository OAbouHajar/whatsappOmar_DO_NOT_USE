package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.text.TextPaint;
import android.text.TextUtils;
import com.obwhatsapp.R;

/* renamed from: X.2nT  reason: invalid class name and case insensitive filesystem */
public class C56332nT extends Drawable {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Bitmap A06;
    public Bitmap A07;
    public BitmapShader A08;
    public String A09;
    public boolean A0A;
    public boolean A0B = true;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final Context A0F;
    public final Bitmap A0G;
    public final Matrix A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final Paint A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final Path A0Q;
    public final RectF A0R = AnonymousClass000.A0K();
    public final RectF A0S;
    public final RectF A0T;
    public final TextPaint A0U;

    public C56332nT(Context context, Bitmap bitmap, int i2) {
        this.A04 = i2;
        this.A0F = context;
        this.A0C = 1.0f;
        this.A0G = bitmap;
        TextPaint textPaint = new TextPaint();
        this.A0U = textPaint;
        textPaint.setARGB(MotionEventCompat.ACTION_MASK, 0, 0, 0);
        Paint.Align align = Paint.Align.LEFT;
        textPaint.setTextAlign(align);
        textPaint.setTextSize(32.0f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        Paint A052 = C13700nu.A05();
        this.A0P = A052;
        A052.setARGB(MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK);
        A052.setTextAlign(align);
        A052.setTextSize(32.0f);
        C13690nt.A0y(A052);
        A052.setStrokeWidth(8.0f);
        Paint A062 = C13700nu.A06(1);
        this.A0I = A062;
        C13690nt.A0n(-1, A062);
        A062.setShadowLayer((float) C87594Xo.A00(context, 4.0f), 0.0f, 0.0f, context.getResources().getColor(R.color.color0092));
        Paint A063 = C13700nu.A06(1);
        this.A0L = A063;
        A063.setStyle(Paint.Style.FILL);
        Paint A053 = C13700nu.A05();
        this.A0M = A053;
        A053.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0S = AnonymousClass000.A0K();
        this.A0T = AnonymousClass000.A0K();
        this.A0H = AnonymousClass000.A0H();
        float A002 = (float) C87594Xo.A00(context, 2.0f);
        this.A0D = A002;
        float A003 = (float) C87594Xo.A00(context, 8.0f);
        this.A0E = A003;
        this.A02 = Math.round((float) C87594Xo.A00(context, 6.0f));
        float f2 = (float) i2;
        float f3 = A003 * 2.0f;
        this.A01 = f3 + f2 + A02() + ((float) C87594Xo.A00(this.A0F, 18.0f)) + ((float) C87594Xo.A00(context, 2.0f));
        float f4 = A002 * 2.0f;
        this.A00 = ((f2 - f4) / 1.0f) + ((float) this.A02) + f4 + f3;
        Path A0I2 = AnonymousClass000.A0I();
        this.A0Q = A0I2;
        A0I2.setFillType(Path.FillType.WINDING);
        Paint A064 = C13700nu.A06(3);
        this.A0N = A064;
        A064.setStyle(Paint.Style.FILL);
        C13690nt.A0r(context, A064, R.color.color0092);
        Paint A065 = C13700nu.A06(1);
        this.A0J = A065;
        Paint.Style style = Paint.Style.FILL;
        A065.setStyle(style);
        Paint A066 = C13700nu.A06(3);
        this.A0K = A066;
        A066.setStrokeWidth(A002);
        C13690nt.A0r(context, A066, R.color.color090b);
        C13690nt.A0y(A066);
        int A004 = AnonymousClass00T.A00(context, R.color.color0099);
        Paint A067 = C13700nu.A06(1);
        this.A0O = A067;
        A067.setColor(A004);
        A067.setStyle(style);
        A067.setShadowLayer(A003, 0.0f, 0.0f, A004);
    }

    public static float A00(Context context, float f2) {
        return f2 + ((float) C87594Xo.A00(context, 18.0f)) + ((float) C87594Xo.A00(context, 4.0f));
    }

    public float A01() {
        return (this.A0T.width() + (this.A0E * 2.0f)) / 2.0f;
    }

    public float A02() {
        Rect A0J2 = AnonymousClass000.A0J();
        Rect A0J3 = AnonymousClass000.A0J();
        String str = this.A09;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        Paint paint = this.A0P;
        paint.getTextBounds(str, 0, str.length(), A0J2);
        int i2 = this.A03;
        Context context = this.A0F;
        String A012 = C61853Aq.A01(context, i2);
        if (A012 != null) {
            str2 = A012;
        }
        paint.getTextBounds(str2, 0, str2.length(), A0J3);
        return (float) Math.min(Math.max(A0J2.width(), A0J3.width()), C87594Xo.A00(context, 120.0f));
    }

    public void A03() {
        float f2 = this.A0E * 2.0f;
        Context context = this.A0F;
        float A002 = A00(context, ((float) this.A04) + f2 + A02());
        this.A01 = A002;
        int round = Math.round((float) C87594Xo.A00(context, 6.0f));
        this.A02 = round;
        float f3 = this.A0D * 2.0f;
        float A022 = ((((((A002 - A02()) - ((float) C87594Xo.A00(context, 18.0f))) - ((float) C87594Xo.A00(context, 4.0f))) - f2) - f3) / this.A0C) + ((float) round) + f3 + f2;
        this.A00 = A022;
        setBounds(0, 0, Math.round(this.A01), Math.round(A022));
    }

    public void A04(Bitmap bitmap) {
        this.A06 = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.A08 = bitmapShader;
        this.A0N.setShader(bitmapShader);
    }

    public void draw(Canvas canvas) {
        if (this.A06 != null) {
            Paint paint = this.A0J;
            paint.setColor(-1);
            Paint paint2 = this.A0K;
            paint2.setColor(-1);
            Paint paint3 = this.A0N;
            paint3.setColor(-1);
            Rect bounds = getBounds();
            RectF rectF = this.A0T;
            float width = rectF.width();
            float height = rectF.height();
            float max = Math.max(width / ((float) this.A06.getWidth()), height / ((float) this.A06.getHeight()));
            Matrix matrix = this.A0H;
            matrix.setScale(max, max);
            matrix.postTranslate((width - (((float) this.A06.getWidth()) * max)) / 2.0f, (height - (((float) this.A06.getHeight()) * max)) / 2.0f);
            this.A08.setLocalMatrix(matrix);
            Rect bounds2 = getBounds();
            if (this.A07 == null) {
                Bitmap createBitmap = Bitmap.createBitmap(bounds2.width(), bounds2.height(), Bitmap.Config.ARGB_4444);
                this.A07 = createBitmap;
                new Canvas(createBitmap).drawPath(this.A0Q, this.A0O);
            }
            float f2 = this.A0E;
            float f3 = f2 * 2.0f;
            float width2 = (((float) bounds.width()) - f3) / (((float) this.A07.getWidth()) - f3);
            Canvas canvas2 = canvas;
            canvas2.save();
            canvas2.scale(width2, width2, rectF.left, rectF.top);
            if (this.A0A) {
                canvas2.drawBitmap(this.A07, 0.0f, 0.0f, paint);
            }
            canvas2.restore();
            canvas2.drawPath(this.A0Q, paint);
            canvas2.save();
            float f4 = rectF.left;
            float f5 = rectF.top;
            rectF.offsetTo(0.0f, 0.0f);
            canvas2.translate(f4, f5);
            canvas2.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint2);
            if (this.A0B) {
                canvas2.drawCircle(rectF.centerX(), rectF.bottom + ((float) (this.A02 >> 1)), (float) C87594Xo.A00(this.A0F, 2.5f), this.A0I);
            }
            canvas2.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - this.A0D, paint3);
            TextPaint textPaint = this.A0U;
            textPaint.setARGB(MotionEventCompat.ACTION_MASK, 0, 0, 0);
            if (!TextUtils.isEmpty(this.A09)) {
                Context context = this.A0F;
                float A002 = (float) C87594Xo.A00(context, 120.0f);
                CharSequence ellipsize = A02() >= A002 ? TextUtils.ellipsize(this.A09, textPaint, A002, TextUtils.TruncateAt.END) : this.A09;
                Rect A0J2 = AnonymousClass000.A0J();
                String str = this.A09;
                if (str == null) {
                    str = "";
                }
                Paint paint4 = this.A0P;
                paint4.getTextBounds(str, 0, str.length(), A0J2);
                float height2 = (float) A0J2.height();
                float A003 = A00(context, rectF.right + f2);
                float centerY = rectF.centerY() - ((((float) C87594Xo.A00(context, 18.0f)) - height2) / 2.0f);
                CharSequence charSequence = ellipsize;
                canvas2.drawText(charSequence, 0, ellipsize.length(), A003, centerY, paint4);
                canvas2.drawText(charSequence, 0, ellipsize.length(), A003, centerY, textPaint);
                RectF rectF2 = new RectF(rectF.right + f2, rectF.centerY() - ((float) C87594Xo.A00(context, 18.0f)), rectF.right + f2 + ((float) C87594Xo.A00(context, 18.0f)), rectF.centerY());
                canvas2.save();
                canvas2.clipRect(rectF2);
                canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, this.A0L);
                Rect clipBounds = canvas2.getClipBounds();
                int A004 = C87594Xo.A00(context, 4.0f);
                clipBounds.left += A004;
                clipBounds.right -= A004;
                clipBounds.bottom -= A004;
                clipBounds.top += A004;
                Bitmap bitmap = this.A05;
                if (bitmap != null) {
                    canvas2.drawBitmap(bitmap, (Rect) null, clipBounds, this.A0M);
                }
                canvas2.restore();
                String A012 = C61853Aq.A01(context, this.A03);
                if (A012 != null) {
                    int i2 = this.A03;
                    int i3 = R.color.color00d3;
                    if (i2 != 0) {
                        i3 = R.color.color00d4;
                        if (i2 != 1) {
                            i3 = R.color.color0505;
                        }
                    }
                    C13690nt.A0r(context, textPaint, i3);
                    float f6 = rectF.right + f2;
                    float centerY2 = rectF.centerY() + height2;
                    canvas2.drawText(A012, f6, centerY2, paint4);
                    canvas2.drawText(A012, f6, centerY2, textPaint);
                }
            }
            rectF.offsetTo(f4, f5);
            canvas2.restore();
        }
    }

    public int getIntrinsicHeight() {
        return Math.round(this.A00);
    }

    public int getIntrinsicWidth() {
        return Math.round(this.A01);
    }

    public int getOpacity() {
        return -1;
    }

    public void onBoundsChange(Rect rect) {
        RectF rectF = this.A0S;
        rectF.set(rect);
        float f2 = this.A0E;
        rectF.inset(f2, f2);
        RectF rectF2 = this.A0T;
        rectF2.set(rectF);
        rectF2.right -= A00(this.A0F, A02());
        rectF2.set(rectF2);
        float f3 = (float) this.A02;
        float width = (rectF2.width() / 2.0f) - (f3 / 2.0f);
        float height = rectF2.height();
        this.A0R.set(width, height, f3 + width, ((float) this.A02) + height);
        Path path = this.A0Q;
        path.reset();
        path.addCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, Path.Direction.CW);
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A0N.setColorFilter(colorFilter);
        this.A0J.setColorFilter(colorFilter);
    }
}

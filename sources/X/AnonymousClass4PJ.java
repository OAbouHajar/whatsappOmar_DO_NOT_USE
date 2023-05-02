package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

/* renamed from: X.4PJ  reason: invalid class name */
public final class AnonymousClass4PJ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public Bitmap A0M;
    public Rect A0N;
    public Layout.Alignment A0O;
    public StaticLayout A0P;
    public StaticLayout A0Q;
    public CharSequence A0R;
    public final float A0S;
    public final float A0T;
    public final float A0U;
    public final float A0V;
    public final float A0W;
    public final Paint A0X;
    public final Paint A0Y;
    public final TextPaint A0Z;

    public AnonymousClass4PJ(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.A0V = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A0W = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.A0S = round;
        this.A0U = round;
        this.A0T = round;
        TextPaint textPaint = new TextPaint();
        this.A0Z = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.A0Y = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.A0X = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }
}

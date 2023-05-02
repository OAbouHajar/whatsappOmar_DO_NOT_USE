package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.obwhatsapp.R;
import org.json.JSONObject;

/* renamed from: X.29l  reason: invalid class name and case insensitive filesystem */
public abstract class C455829l {
    public static float A03 = 12.0f;
    public static float A04 = 24.0f;
    public static float A05 = 24.0f;
    public static float A06 = 32.0f;
    public static float A07 = 96.0f;
    public static float A08 = 96.0f;
    public float A00;
    public final Paint A01;
    public final RectF A02 = new RectF();

    public C455829l() {
        Paint paint = new Paint(1);
        this.A01 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void A00(C455829l r6, float f2) {
        RectF rectF = r6.A02;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        rectF.set(centerX - ((centerX - rectF.left) * f2), centerY - ((centerY - rectF.top) * f2), centerX - ((centerX - rectF.right) * f2), centerY - (f2 * (centerY - rectF.bottom)));
        r6.A04();
    }

    public static void A01(C455829l r5, float f2, float f3, float f4, float f5) {
        float f6 = f2 - f3;
        float f7 = f4 - f5;
        float min = Math.min(f6, f7);
        RectF rectF = r5.A02;
        float f8 = (f6 - min) / 2.0f;
        float f9 = (f7 - min) / 2.0f;
        rectF.set(f3 + f8, f5 + f9, f2 - f8, f4 - f9);
        rectF.sort();
    }

    public float A02() {
        float strokeWidth;
        float f2;
        if (this instanceof C605432y) {
            strokeWidth = this.A01.getStrokeWidth() * 5.0f;
            f2 = 3.0f;
        } else if (!(this instanceof AnonymousClass32w) && !(this instanceof AnonymousClass32v)) {
            return this.A01.getStrokeWidth();
        } else {
            strokeWidth = this.A01.getStrokeWidth() * 3.0f;
            f2 = 2.0f;
        }
        return strokeWidth / f2;
    }

    public AnonymousClass4MV A03() {
        if (this instanceof AnonymousClass32z) {
            AnonymousClass32z r1 = (AnonymousClass32z) this;
            RectF rectF = r1.A02;
            float f2 = r1.A00;
            int color = r1.A01.getColor();
            return new C76873up(rectF, r1.A06, f2, r1.A02(), color, r1.A03);
        }
        return new AnonymousClass4MV(this.A02, this.A00, A02(), this.A01.getColor());
    }

    public void A04() {
        RectF rectF = this.A02;
        if (rectF.width() < A03) {
            rectF.set(rectF.centerX() - (A03 / 2.0f), rectF.top, rectF.centerX() + (A03 / 2.0f), rectF.bottom);
        }
        if (rectF.height() < A03) {
            rectF.set(rectF.left, rectF.centerY() - (A03 / 2.0f), rectF.right, rectF.centerY() + (A03 / 2.0f));
        }
    }

    public void A05() {
    }

    public void A06(float f2) {
        RectF rectF = this.A02;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        rectF.set(centerX - ((centerX - rectF.left) * f2), centerY - ((centerY - rectF.top) * f2), centerX - ((centerX - rectF.right) * f2), centerY - (f2 * (centerY - rectF.bottom)));
        A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r9 == 2) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(float r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass32w
            if (r0 != 0) goto L_0x0010
            boolean r0 = r7 instanceof X.AnonymousClass32u
            if (r0 != 0) goto L_0x0010
            boolean r0 = r7 instanceof X.AnonymousClass32t
            if (r0 != 0) goto L_0x0010
            r7.A06(r8)
            return
        L_0x0010:
            android.graphics.RectF r5 = r7.A02
            float r4 = r5.centerX()
            float r3 = r5.centerY()
            r1 = 2
            if (r9 == 0) goto L_0x0021
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r9 != r1) goto L_0x0022
        L_0x0021:
            r6 = r8
        L_0x0022:
            r0 = 1
            if (r9 == r0) goto L_0x0029
            if (r9 == r1) goto L_0x0029
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0029:
            float r0 = r5.left
            float r0 = r4 - r0
            float r0 = r0 * r6
            float r2 = r4 - r0
            float r0 = r5.top
            float r0 = r3 - r0
            float r0 = r0 * r8
            float r1 = r3 - r0
            float r0 = r5.right
            float r0 = r4 - r0
            float r6 = r6 * r0
            float r4 = r4 - r6
            float r0 = r5.bottom
            float r0 = r3 - r0
            float r8 = r8 * r0
            float r3 = r3 - r8
            r5.set(r2, r1, r4, r3)
            r7.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455829l.A07(float, int):void");
    }

    public void A08(float f2, int i2) {
        A07(f2, 2);
    }

    public void A09(int i2) {
        this.A01.setColor(i2);
    }

    public void A0A(JSONObject jSONObject) {
        RectF rectF = this.A02;
        rectF.left = ((float) jSONObject.getInt("l")) / 100.0f;
        rectF.top = ((float) jSONObject.getInt("t")) / 100.0f;
        rectF.right = ((float) jSONObject.getInt("r")) / 100.0f;
        rectF.bottom = ((float) jSONObject.getInt("b")) / 100.0f;
        this.A00 = ((float) jSONObject.optInt("rotate", 0)) / 100.0f;
        A09(jSONObject.getInt("color"));
        A0O(((float) jSONObject.getInt("stroke")) / 100.0f);
    }

    public boolean A0B() {
        return false;
    }

    public boolean A0C() {
        return false;
    }

    public boolean A0D() {
        return false;
    }

    public boolean A0E() {
        return false;
    }

    public Drawable A0F() {
        return null;
    }

    public String A0G() {
        return this instanceof C605432y ? "thinking-bubble" : this instanceof AnonymousClass32z ? "text" : this instanceof AnonymousClass32w ? "speech-bubble-rect" : this instanceof AnonymousClass32v ? "speech-bubble-oval" : this instanceof AnonymousClass32u ? "rect" : this instanceof AnonymousClass32x ? "pen" : this instanceof AnonymousClass32t ? "oval" : "arrow";
    }

    public String A0H(Context context) {
        int i2;
        if (this instanceof C605432y) {
            i2 = R.string.str073c;
        } else if (this instanceof AnonymousClass32z) {
            return ((AnonymousClass32z) this).A06;
        } else {
            if (this instanceof AnonymousClass32w) {
                i2 = R.string.str073b;
            } else if (this instanceof AnonymousClass32v) {
                i2 = R.string.str0739;
            } else if (this instanceof AnonymousClass32u) {
                i2 = R.string.str073a;
            } else if (this instanceof AnonymousClass32x) {
                return "";
            } else {
                i2 = this instanceof AnonymousClass32t ? R.string.str0738 : R.string.str0735;
            }
        }
        return context.getString(i2);
    }

    public void A0I(Canvas canvas) {
        if (!(this instanceof C605432y) && !(this instanceof AnonymousClass32z) && !(this instanceof AnonymousClass32w) && !(this instanceof AnonymousClass32v)) {
            boolean z2 = this instanceof AnonymousClass32u;
        }
        A0P(canvas);
    }

    public boolean A0J() {
        return !(this instanceof AnonymousClass32z) && !(this instanceof AnonymousClass32x);
    }

    public boolean A0K() {
        return !(this instanceof AnonymousClass32z) && !(this instanceof AnonymousClass32x);
    }

    public boolean A0L() {
        return false;
    }

    public void A0M(AnonymousClass4MV r3) {
        this.A02.set(r3.A03);
        this.A00 = r3.A00;
        A09(r3.A02);
        A0O(r3.A01);
    }

    public void A0N(JSONObject jSONObject) {
        jSONObject.put("type", A0G());
        RectF rectF = this.A02;
        jSONObject.put("l", (int) (rectF.left * 100.0f));
        jSONObject.put("t", (int) (rectF.top * 100.0f));
        jSONObject.put("r", (int) (rectF.right * 100.0f));
        jSONObject.put("b", (int) (rectF.bottom * 100.0f));
        float f2 = this.A00;
        if (f2 != 0.0f) {
            jSONObject.put("rotate", (int) (f2 * 100.0f));
        }
        jSONObject.put("color", this.A01.getColor());
        jSONObject.put("stroke", (int) (A02() * 100.0f));
    }

    public void A0O(float f2) {
        this.A01.setStrokeWidth(f2);
    }

    public void A0P(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this instanceof C605432y) {
            C605432y r4 = (C605432y) this;
            RectF rectF = r4.A02;
            rectF.sort();
            canvas2.save();
            Matrix matrix = r4.A00;
            RectF rectF2 = r4.A05;
            matrix.setRectToRect(new RectF(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom), rectF, Matrix.ScaleToFit.CENTER);
            Path path = r4.A04;
            path.reset();
            path.setFillType(Path.FillType.WINDING);
            r4.A02.transform(matrix, path);
            Paint paint = r4.A01;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-31);
            path.close();
            canvas2.drawPath(path, paint);
            path.reset();
            path.setFillType(Path.FillType.WINDING);
            r4.A03.transform(matrix, path);
            Paint paint2 = r4.A01;
            paint2.setStyle(Paint.Style.STROKE);
            canvas2.drawPath(path, paint2);
            canvas2.restore();
            r4.A0R(canvas2, 1.3f, 1.0f);
            r4.A0R(canvas2, 1.7f, 0.5f);
            return;
        }
        if (this instanceof AnonymousClass32z) {
            AnonymousClass32z r42 = (AnonymousClass32z) this;
            if (!TextUtils.isEmpty(r42.A06)) {
                RectF rectF3 = r42.A02;
                rectF3.sort();
                canvas2.save();
                float f2 = r42.A00;
                if (Math.abs(f2) < 3.0f) {
                    f2 = 0.0f;
                }
                canvas2.rotate(f2, rectF3.centerX(), rectF3.centerY());
                float width = rectF3.width() / r42.A00;
                canvas2.translate((rectF3.left + (rectF3.width() / 2.0f)) - ((((float) r42.A04.getWidth()) * width) / 2.0f), rectF3.top);
                canvas2.scale(width, width, 0.0f, 0.0f);
                if (r42.A03 == 3) {
                    TextPaint textPaint = r42.A08;
                    textPaint.setStrokeWidth(textPaint.getTextSize() / 12.0f);
                    textPaint.setStyle(Paint.Style.STROKE);
                    textPaint.setColor(-16777216);
                    r42.A04.draw(canvas2);
                    textPaint.setStrokeWidth(0.0f);
                    textPaint.setStyle(Paint.Style.FILL);
                }
                r42.A08.setColor(r42.A01.getColor());
                r42.A04.draw(canvas2);
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass32v) {
            AnonymousClass32v r43 = (AnonymousClass32v) this;
            RectF rectF4 = r43.A02;
            rectF4.sort();
            Paint paint3 = r43.A01;
            paint3.setStyle(Paint.Style.STROKE);
            Matrix matrix2 = r43.A00;
            matrix2.reset();
            matrix2.setRotate(r43.A00, 0.0f, 0.0f);
            matrix2.postScale(rectF4.width() / 2000.0f, rectF4.height() / 2000.0f);
            matrix2.postTranslate(rectF4.centerX(), rectF4.centerY());
            Path path2 = r43.A03;
            path2.reset();
            path2.setFillType(Path.FillType.WINDING);
            Path path3 = r43.A02;
            path3.transform(matrix2, path2);
            Paint paint4 = r43.A01;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setColor(-31);
            path2.close();
            canvas2.drawPath(path2, paint4);
            path2.reset();
            path2.setFillType(Path.FillType.WINDING);
            path3.transform(matrix2, path2);
            canvas2.drawPath(path2, paint3);
            return;
        } else if (this instanceof AnonymousClass32u) {
            RectF rectF5 = this.A02;
            rectF5.sort();
            canvas2.save();
            canvas2.rotate(this.A00, rectF5.centerX(), rectF5.centerY());
            canvas2.drawRect(rectF5, this.A01);
        } else if (this instanceof AnonymousClass32x) {
            AnonymousClass32x r44 = (AnonymousClass32x) this;
            if (r44.A05) {
                r44.A03.A02(canvas2);
                return;
            }
            return;
        } else if (this instanceof AnonymousClass32t) {
            RectF rectF6 = this.A02;
            rectF6.sort();
            canvas2.save();
            canvas2.rotate(this.A00, rectF6.centerX(), rectF6.centerY());
            canvas2.drawOval(rectF6, this.A01);
        } else {
            canvas2.save();
            float f3 = this.A00;
            RectF rectF7 = this.A02;
            canvas2.rotate(f3, rectF7.centerX(), rectF7.centerY());
            float f4 = rectF7.left;
            float f5 = rectF7.bottom;
            float f6 = rectF7.right;
            float f7 = rectF7.top;
            Paint paint5 = this.A01;
            canvas2.drawLine(f4, f5, f6, f7, paint5);
            float degrees = f6 == f4 ? 90.0f : (float) Math.toDegrees(Math.atan((double) ((f7 - f5) / (f6 - f4))));
            canvas2.save();
            canvas2.translate(f6, f7);
            int i2 = 150;
            if (f4 > f6) {
                i2 = 30;
            }
            canvas2.rotate(degrees + ((float) i2));
            Canvas canvas3 = canvas2;
            Paint paint6 = paint5;
            canvas3.drawLine(0.0f, 0.0f, paint5.getStrokeWidth() * 5.0f, 0.0f, paint6);
            int i3 = 60;
            if (f4 > f6) {
                i3 = -60;
            }
            canvas2.rotate((float) i3);
            canvas3.drawLine(0.0f, 0.0f, paint5.getStrokeWidth() * 5.0f, 0.0f, paint6);
            canvas2.restore();
        }
        canvas2.restore();
    }

    public void A0Q(RectF rectF, float f2, float f3, float f4, float f5) {
        if (f2 == f4) {
            f4 += 1.0f;
        }
        if (f3 == f5) {
            f5 += 1.0f;
        }
        RectF rectF2 = this.A02;
        rectF2.set(f2, f3, f4, f5);
        rectF2.sort();
        A04();
    }
}

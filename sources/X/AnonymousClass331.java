package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.doodle.shapes.IDxAListenerShape88S0100000_2_I1;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.331  reason: invalid class name */
public class AnonymousClass331 extends C76863uo {
    public double A00;
    public double A01;
    public float A02;
    public Picture A03;
    public Picture A04;
    public String A05;
    public String A06;
    public boolean A07;
    public AnonymousClass4MU[] A08;
    public AnonymousClass4MU[] A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final TextPaint A0D;
    public final AnonymousClass4TY A0E;
    public final AnonymousClass4PW A0F;
    public final AnonymousClass39B A0G;
    public final boolean A0H;

    public AnonymousClass331(Context context, AnonymousClass013 r7, String str, boolean z2) {
        super(context);
        this.A0B = C13700nu.A06(1);
        this.A0C = C13700nu.A06(1);
        this.A0A = C13700nu.A06(1);
        TextPaint textPaint = new TextPaint(1);
        this.A0D = textPaint;
        int i2 = 0;
        this.A07 = false;
        this.A0E = new IDxAListenerShape88S0100000_2_I1(this, 2);
        this.A0H = z2;
        Context context2 = this.A00;
        Picture A022 = C76863uo.A02(context2, "ic_content_sticker_location_emerald.svg");
        AnonymousClass00B.A06(A022);
        this.A03 = A022;
        Picture A023 = C76863uo.A02(context2, "ic_content_sticker_location.svg");
        AnonymousClass00B.A06(A023);
        this.A04 = A023;
        AnonymousClass00B.A0G(AnonymousClass000.A1R(this.A03.getWidth(), this.A04.getWidth()));
        TextPaint textPaint2 = this.A0D;
        textPaint2.setTextSize(46.0f);
        textPaint2.setTextAlign(Paint.Align.CENTER);
        Typeface A032 = AnonymousClass1UP.A03(context2);
        this.A06 = str;
        Picture picture = this.A04;
        this.A05 = TextUtils.ellipsize(str, textPaint, ((1000.0f - ((float) (picture != null ? picture.getWidth() : i2))) - 75.0f) - 26.0f, TextUtils.TruncateAt.END).toString();
        A0S();
        this.A0G = new AnonymousClass39B(context, r7);
        this.A0F = new AnonymousClass4PW();
    }

    public AnonymousClass331(Context context, AnonymousClass013 r7, JSONObject jSONObject) {
        this(context, r7, context.getString(R.string.str0118), false);
        super.A0A(jSONObject);
        this.A00 = jSONObject.getDouble("latitude");
        this.A01 = jSONObject.getDouble("longitude");
        this.A06 = jSONObject.getString("Location");
        this.A05 = jSONObject.getString("displayLocation");
        this.A07 = jSONObject.getBoolean("theme");
        A0S();
        RectF rectF = this.A02;
        float width = rectF.width();
        float height = rectF.height();
        float f2 = rectF.left;
        float f3 = rectF.top;
        rectF.set(f2, f3, width + f2, height + f3);
        rectF.sort();
    }

    public void A04() {
        RectF rectF = this.A02;
        if (rectF.height() < C455829l.A03) {
            float width = rectF.width() / rectF.height();
            rectF.set(rectF.centerX() - ((C455829l.A03 * width) / 2.0f), rectF.centerY() - (C455829l.A03 / 2.0f), rectF.centerX() + ((C455829l.A03 * width) / 2.0f), rectF.centerY() + (C455829l.A03 / 2.0f));
        }
    }

    public void A05() {
        this.A0G.A00 = false;
    }

    public void A06(float f2) {
        C455829l.A00(this, f2);
    }

    public void A08(float f2, int i2) {
        A07(f2, 2);
        this.A0G.A00(f2);
    }

    public void A09(int i2) {
    }

    public boolean A0C() {
        return this.A0E.A01;
    }

    public boolean A0E() {
        this.A0F.A00(this.A0E);
        return true;
    }

    public String A0G() {
        return "location";
    }

    public String A0H(Context context) {
        return context.getString(R.string.str0737);
    }

    public void A0I(Canvas canvas) {
        A0P(canvas);
    }

    public boolean A0J() {
        return false;
    }

    public void A0N(JSONObject jSONObject) {
        super.A0N(jSONObject);
        jSONObject.put("latitude", this.A00);
        jSONObject.put("longitude", this.A01);
        jSONObject.put("Location", this.A06);
        jSONObject.put("displayLocation", this.A05);
        jSONObject.put("theme", this.A07);
    }

    public void A0P(Canvas canvas) {
        Picture picture;
        TextPaint textPaint;
        int i2;
        float width;
        AnonymousClass4TY r1 = this.A0E;
        float A002 = r1.A00();
        boolean z2 = this.A07;
        if (r1.A01 && r1.A00 >= 0.0f) {
            z2 = !z2;
        }
        canvas.save();
        RectF rectF = this.A02;
        rectF.sort();
        C13690nt.A0x(canvas, rectF, this.A00);
        canvas.scale(rectF.width() / this.A02, rectF.height() / 105.0f, rectF.left, rectF.top);
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(A002, A002, this.A02 / 2.0f, 52.5f);
        for (AnonymousClass4MU r0 : z2 ? this.A08 : this.A09) {
            canvas.drawRoundRect(r0.A03, r0.A00, r0.A01, r0.A02);
        }
        if (z2) {
            picture = this.A04;
            textPaint = this.A0D;
            i2 = -1;
        } else {
            picture = this.A03;
            textPaint = this.A0D;
            i2 = -16777216;
        }
        textPaint.setColor(i2);
        float f2 = 0.0f;
        if (picture == null) {
            width = 0.0f;
        } else {
            width = (float) picture.getWidth();
            f2 = (float) picture.getHeight();
        }
        float f3 = ((26.0f + width) + this.A02) / 2.0f;
        float descent = 52.5f - ((textPaint.descent() + textPaint.ascent()) / 2.0f);
        boolean z3 = this.A0H;
        if (!z3) {
            canvas.drawText(this.A05, f3, descent, textPaint);
        }
        float f4 = 52.5f - ((1.0f * f2) / 2.0f);
        if (picture != null) {
            canvas.save();
            canvas.translate(37.5f, f4);
            canvas.scale(1.0f, 1.0f);
            canvas.drawPicture(picture);
            canvas.restore();
        }
        if (z3) {
            Paint paint = this.A0B;
            C13690nt.A0r(this.A00, paint, R.color.color088b);
            float f5 = Resources.getSystem().getDisplayMetrics().density * 8.0f;
            float f6 = 37.5f + width + 26.0f;
            canvas.drawRoundRect(new RectF(f6, 37.5f, f6 + 170.0f, 67.5f), f5, f5, paint);
        }
        canvas.restore();
        if (!z3) {
            this.A0G.A01(canvas, rectF, this.A00);
        }
    }

    public void A0Q(RectF rectF, float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        boolean z2 = this.A0H;
        float f8 = z2 ? f6 : this.A02;
        float f9 = 105.0f;
        if (z2) {
            f9 = Math.min(f6 / 3.0f, (105.0f * f6) / this.A02);
        }
        float f10 = (f6 / 2.0f) + f2;
        if (!z2) {
            f2 = f10 - (f8 / 2.0f);
        }
        float f11 = f3 + ((f7 / 2.0f) - (f9 / 2.0f));
        RectF rectF2 = this.A02;
        rectF2.set(f2, f11, f2 + f8, f9 + f11);
        float f12 = f6 * 2.0f;
        if (!z2 && f8 > f12) {
            A06(f12 / (f8 + 75.0f));
        }
        rectF2.sort();
        this.A0G.A00(rectF.width() / 1020.0f);
    }

    public final void A0S() {
        float f2;
        Picture picture;
        float f3 = 0.0f;
        if (this.A03 == null || (picture = this.A04) == null) {
            Log.w("Location/initThemes/Error when loading pin");
            f2 = 0.0f;
        } else {
            f2 = ((float) picture.getWidth()) + 26.0f;
        }
        if (!this.A0H) {
            f3 = this.A0D.measureText(this.A05);
        }
        this.A02 = Math.max(300.0f, f2 + 75.0f + f3);
        float f4 = Resources.getSystem().getDisplayMetrics().density * 8.0f;
        Paint paint = this.A0C;
        paint.setColor(-1);
        float f5 = f4;
        this.A09 = new AnonymousClass4MU[]{new AnonymousClass4MU(paint, 0.0f, 0.0f, this.A02, 105.0f, f4, f5)};
        Paint paint2 = this.A0A;
        C13690nt.A0r(this.A00, paint2, R.color.color0899);
        this.A08 = new AnonymousClass4MU[]{new AnonymousClass4MU(paint2, 0.0f, 0.0f, this.A02, 105.0f, f4, f5)};
    }
}

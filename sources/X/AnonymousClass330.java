package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.doodle.shapes.IDxAListenerShape88S0100000_2_I1;
import java.util.Calendar;
import org.json.JSONObject;

/* renamed from: X.330  reason: invalid class name */
public class AnonymousClass330 extends C76863uo {
    public int A00;
    public int A01;
    public Paint A02;
    public Paint A03;
    public Picture A04;
    public Picture A05;
    public AnonymousClass4MU A06;
    public AnonymousClass4MU A07;
    public AnonymousClass4MU A08;
    public AnonymousClass4MU A09;
    public Boolean A0A;
    public final RectF A0B;
    public final AnonymousClass013 A0C;
    public final AnonymousClass4TY A0D;
    public final AnonymousClass4PW A0E;
    public final AnonymousClass39B A0F;
    public final boolean A0G;

    public AnonymousClass330(Context context, AnonymousClass013 r3, JSONObject jSONObject) {
        this(context, r3, false);
        this.A00 = jSONObject.getInt("hour");
        this.A01 = jSONObject.getInt("minute");
        this.A0A = Boolean.valueOf(jSONObject.getBoolean("theme"));
        super.A0A(jSONObject);
    }

    public AnonymousClass330(Context context, AnonymousClass013 r11, boolean z2) {
        super(context);
        this.A0B = AnonymousClass000.A0K();
        this.A02 = C13700nu.A06(1);
        this.A03 = C13700nu.A06(1);
        this.A0D = new IDxAListenerShape88S0100000_2_I1(this, 0);
        this.A0C = r11;
        this.A0G = z2;
        this.A0A = Boolean.FALSE;
        Calendar instance = Calendar.getInstance(C13690nt.A0m(r11));
        this.A00 = instance.get(10);
        this.A01 = instance.get(12);
        Context context2 = this.A00;
        this.A04 = C76863uo.A02(context2, "clockDarkTheme.svg");
        Paint paint = this.A02;
        paint.setColor(Color.parseColor("#ECB439"));
        this.A06 = new AnonymousClass4MU(paint, 190.0f, 249.0f, 398.0f, 263.0f, 7.0f, 7.0f);
        this.A07 = new AnonymousClass4MU(paint, 185.0f, 251.0f, 479.0f, 261.0f, 5.0f, 5.0f);
        this.A05 = C76863uo.A02(context2, "clockLightTheme.svg");
        Paint paint2 = this.A03;
        paint2.setColor(Color.parseColor("#DC5842"));
        this.A08 = new AnonymousClass4MU(paint2, 201.0f, 248.0f, 370.0f, 264.0f, 8.0f, 8.0f);
        this.A09 = new AnonymousClass4MU(paint2, 185.0f, 251.0f, 479.0f, 262.0f, 5.5f, 5.5f);
        this.A0F = new AnonymousClass39B(context, r11);
        this.A0E = new AnonymousClass4PW();
    }

    public void A05() {
        this.A0F.A00 = false;
    }

    public void A08(float f2, int i2) {
        A07(f2, 2);
        this.A0F.A00(f2);
    }

    public boolean A0B() {
        return true;
    }

    public boolean A0C() {
        return this.A0D.A01;
    }

    public boolean A0D() {
        int i2 = this.A01;
        int i3 = this.A00;
        Calendar instance = Calendar.getInstance(C13690nt.A0m(this.A0C));
        this.A00 = instance.get(10);
        int i4 = instance.get(12);
        this.A01 = i4;
        return (i2 == i4 && i3 == this.A00) ? false : true;
    }

    public boolean A0E() {
        this.A0E.A00(this.A0D);
        return true;
    }

    public String A0G() {
        return "analog-clock";
    }

    public String A0H(Context context) {
        return context.getString(R.string.str0734);
    }

    public void A0I(Canvas canvas) {
        A0P(canvas);
    }

    public boolean A0J() {
        return false;
    }

    public void A0N(JSONObject jSONObject) {
        super.A0N(jSONObject);
        jSONObject.put("hour", this.A00);
        jSONObject.put("minute", this.A01);
        jSONObject.put("theme", this.A0A);
    }

    public void A0P(Canvas canvas) {
        boolean z2 = this.A0G;
        Canvas canvas2 = canvas;
        if (!z2) {
            canvas2.save();
            RectF rectF = this.A02;
            canvas2.scale(0.67f, 0.67f, rectF.centerX(), rectF.centerY());
        }
        AnonymousClass4TY r1 = this.A0D;
        float A002 = r1.A00();
        boolean booleanValue = this.A0A.booleanValue();
        if (r1.A01 && r1.A00 >= 0.0f) {
            booleanValue = !booleanValue;
        }
        Picture picture = booleanValue ? this.A04 : this.A05;
        RectF rectF2 = this.A02;
        rectF2.sort();
        canvas2.save();
        C13690nt.A0x(canvas2, rectF2, this.A00);
        canvas2.scale(rectF2.width() / ((float) picture.getHeight()), rectF2.height() / ((float) picture.getWidth()), rectF2.left, rectF2.top);
        canvas2.translate(rectF2.left, rectF2.top);
        canvas2.scale(A002, A002, (float) (picture.getWidth() >> 1), (float) (picture.getHeight() >> 1));
        canvas2.save();
        canvas2.drawPicture(picture);
        canvas2.restore();
        canvas2.drawCircle((float) (picture.getWidth() >> 1), (float) (picture.getHeight() >> 1), 26.0f, booleanValue ? this.A02 : this.A03);
        canvas2.save();
        AnonymousClass4MU r11 = booleanValue ? this.A06 : this.A08;
        double d2 = (((((double) (this.A00 + 9)) % 12.0d) / 12.0d) * 360.0d) + (((double) (this.A01 * 30)) / 60.0d);
        RectF rectF3 = this.A0B;
        rectF3.set(r11.A03);
        canvas2.rotate((float) ((int) d2), (float) (picture.getWidth() >> 1), (float) (picture.getHeight() >> 1));
        canvas2.drawRoundRect(rectF3, r11.A00, r11.A01, r11.A02);
        canvas2.restore();
        canvas2.save();
        AnonymousClass4MU r3 = booleanValue ? this.A07 : this.A09;
        rectF3.set(r3.A03);
        canvas2.rotate((float) ((int) (((((double) (this.A01 + 45)) % 60.0d) / 60.0d) * 360.0d)), (float) (picture.getWidth() >> 1), (float) (picture.getHeight() >> 1));
        canvas2.drawRoundRect(rectF3, r3.A00, r3.A01, r3.A02);
        canvas2.restore();
        canvas2.restore();
        if (!z2) {
            canvas2.restore();
            float width = (rectF2.width() * 0.67f) / 2.0f;
            this.A0F.A01(canvas2, new RectF(rectF2.centerX() - width, rectF2.centerY() - width, rectF2.centerX() + width, rectF2.centerY() + width), this.A00);
        }
    }

    public void A0Q(RectF rectF, float f2, float f3, float f4, float f5) {
        super.A0Q(rectF, f2, f3, f4, f5);
        this.A0F.A00(rectF.width() / 1020.0f);
    }

    public float A0R() {
        Picture picture = this.A04;
        if ((picture == null && (picture = this.A05) == null) || picture.getHeight() == 0) {
            return 0.0f;
        }
        return ((float) picture.getWidth()) / ((float) picture.getHeight());
    }
}

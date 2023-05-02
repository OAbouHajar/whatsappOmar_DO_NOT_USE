package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.32z  reason: invalid class name */
public class AnonymousClass32z extends C455829l {
    public static Typeface A0B;
    public static Typeface A0C;
    public static Typeface A0D;
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public StaticLayout A04;
    public C14710pd A05;
    public String A06;
    public final Context A07;
    public final TextPaint A08;
    public final AnonymousClass013 A09;
    public final C17250um A0A;

    public AnonymousClass32z(Context context, AnonymousClass013 r4, C17250um r5) {
        this.A08 = new TextPaint(1);
        this.A03 = 0;
        this.A07 = context;
        this.A0A = r5;
        this.A09 = r4;
        this.A01.setStyle(Paint.Style.FILL);
    }

    public AnonymousClass32z(Context context, AnonymousClass013 r10, C17250um r11, JSONObject jSONObject) {
        this(context, r10, r11);
        this.A02 = ((float) jSONObject.getInt("orig-w")) / 100.0f;
        this.A01 = ((float) jSONObject.getInt("orig-h")) / 100.0f;
        this.A00 = 0.0f;
        A0T(jSONObject.getString("text"), jSONObject.getInt("style"));
        String str = this.A06;
        this.A08.setTextSize(((float) jSONObject.getInt("text-size")) / 100.0f);
        this.A04 = new StaticLayout(AnonymousClass1ZW.A02(AnonymousClass2Sy.A03(context, this.A08, r11, str)), this.A08, ((int) this.A02) + 1, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.A00 = 0.0f;
        int i2 = 0;
        while (true) {
            int lineCount = this.A04.getLineCount();
            StaticLayout staticLayout = this.A04;
            if (i2 < lineCount) {
                float lineWidth = staticLayout.getLineWidth(i2);
                if (lineWidth > this.A00) {
                    this.A00 = lineWidth;
                }
                i2++;
            } else {
                staticLayout.getHeight();
                super.A0A(jSONObject);
                return;
            }
        }
    }

    public static Typeface A02(Context context) {
        Typeface typeface = A0C;
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Oswald-Heavy.ttf");
        A0C = createFromAsset;
        return createFromAsset;
    }

    public static Typeface A03(Context context) {
        Typeface typeface = A0D;
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Norican-Regular.ttf");
        A0D = createFromAsset;
        return createFromAsset;
    }

    public static void A04(AnonymousClass32z r8, int i2) {
        if (i2 != 0) {
            RectF rectF = r8.A02;
            float width = rectF.width() / r8.A00;
            rectF.set(rectF.centerX() - (r8.A02 / 2.0f), rectF.centerY() - (r8.A01 / 2.0f), rectF.centerX() + (r8.A02 / 2.0f), rectF.centerY() + (r8.A01 / 2.0f));
            r8.A0R();
            rectF.set(rectF.centerX() - ((rectF.width() * width) / 2.0f), rectF.centerY() - ((rectF.height() * width) / 2.0f), rectF.centerX() + ((rectF.width() * width) / 2.0f), rectF.centerY() + ((width * rectF.height()) / 2.0f));
        }
    }

    public void A0M(AnonymousClass4MV r3) {
        super.A0M(r3);
        C76873up r32 = (C76873up) r3;
        A0T(r32.A01, r32.A00);
    }

    public void A0N(JSONObject jSONObject) {
        super.A0N(jSONObject);
        jSONObject.put("orig-w", (int) (this.A02 * 100.0f));
        jSONObject.put("orig-h", (int) (this.A01 * 100.0f));
        jSONObject.put("text", this.A06);
        jSONObject.put("text-size", (int) (this.A08.getTextSize() * 100.0f));
        jSONObject.put("style", this.A03);
    }

    public void A0Q(RectF rectF, float f2, float f3, float f4, float f5) {
        this.A02 = Math.abs(f4 - f2);
        this.A01 = Math.abs(f5 - f3);
        RectF rectF2 = this.A02;
        rectF2.set(f2, f3, f4, f5);
        rectF2.sort();
        A0R();
    }

    public final void A0R() {
        TextPaint textPaint;
        float f2;
        if (!TextUtils.isEmpty(this.A06)) {
            String str = this.A06;
            C14710pd r3 = this.A05;
            if (r3 == null || !r3.A0E(C16620tM.A02, 2819)) {
                String str2 = this.A06;
                float f3 = C455829l.A05 + 1.0f;
                textPaint = this.A08;
                while (true) {
                    textPaint.setTextSize(f3);
                    float desiredWidth = Layout.getDesiredWidth(str2, textPaint);
                    if (f3 >= C455829l.A08 || desiredWidth >= this.A02.width()) {
                        f2 = f3 - 1.0f;
                    } else {
                        f3 += 1.0f;
                    }
                }
                f2 = f3 - 1.0f;
            } else {
                String str3 = this.A06;
                f2 = C455829l.A05;
                textPaint = this.A08;
                textPaint.setTextSize(f2);
                float desiredWidth2 = Layout.getDesiredWidth(str3, textPaint);
                float width = this.A02.width();
                int i2 = 1;
                for (int i3 = (int) (C455829l.A08 - f2); i3 > 0 && ((f2 < C455829l.A08 && desiredWidth2 < width) || (f2 > C455829l.A05 && desiredWidth2 > width)); i3 >>= 1) {
                    f2 += (float) (i2 * i3);
                    textPaint.setTextSize(f2);
                    desiredWidth2 = Layout.getDesiredWidth(str3, textPaint);
                    i2 = 1;
                    if (desiredWidth2 > width) {
                        i2 = -1;
                    }
                }
                if (desiredWidth2 > width && f2 > C455829l.A05) {
                    f2 -= 1.0f;
                }
            }
            textPaint.setTextSize(f2);
            textPaint.setColor(this.A01.getColor());
            CharSequence A022 = AnonymousClass1ZW.A02(AnonymousClass2Sy.A03(this.A07, textPaint, this.A0A, str));
            RectF rectF = this.A02;
            this.A04 = new StaticLayout(A022, textPaint, ((int) rectF.width()) + 1, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.A00 = 0.0f;
            int i4 = 0;
            while (true) {
                int lineCount = this.A04.getLineCount();
                StaticLayout staticLayout = this.A04;
                if (i4 < lineCount) {
                    float lineWidth = staticLayout.getLineWidth(i4);
                    if (lineWidth > this.A00) {
                        this.A00 = lineWidth;
                    }
                    i4++;
                } else {
                    float height = (float) staticLayout.getHeight();
                    float f4 = rectF.left;
                    float f5 = rectF.top;
                    float f6 = rectF.right;
                    float f7 = rectF.bottom;
                    float f8 = f4 + f6;
                    float f9 = this.A00;
                    float f10 = f5 + f7;
                    rectF.set((f8 - f9) / 2.0f, (f10 - height) / 2.0f, (f8 + f9) / 2.0f, (f10 + height) / 2.0f);
                    rectF.sort();
                    return;
                }
            }
        }
    }

    public void A0S(int i2) {
        TextPaint textPaint;
        if (this.A03 != i2) {
            this.A03 = i2;
            if (i2 == 3) {
                textPaint = this.A08;
                Typeface A022 = A02(this.A07);
            } else {
                textPaint = this.A08;
                if (i2 == 2) {
                    Typeface A032 = A03(this.A07);
                } else {
                    Typeface typeface = Typeface.DEFAULT;
                }
            }
            textPaint.setFakeBoldText(C13690nt.A1R(i2));
            A04(this, (this.A00 > 0.0f ? 1 : (this.A00 == 0.0f ? 0 : -1)));
        }
    }

    public void A0T(String str, int i2) {
        TextPaint textPaint;
        if (!str.equals(this.A06) || this.A03 != i2) {
            this.A06 = str;
            this.A03 = i2;
            if (i2 == 3) {
                textPaint = this.A08;
                Typeface A022 = A02(this.A07);
            } else {
                textPaint = this.A08;
                if (i2 == 2) {
                    Typeface A032 = A03(this.A07);
                } else {
                    Typeface typeface = Typeface.DEFAULT;
                }
            }
            textPaint.setFakeBoldText(C13690nt.A1R(i2));
            A04(this, (this.A00 > 0.0f ? 1 : (this.A00 == 0.0f ? 0 : -1)));
        }
    }
}

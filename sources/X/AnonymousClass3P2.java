package X;

import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: X.3P2  reason: invalid class name */
public class AnonymousClass3P2 extends C017508g {
    public final /* synthetic */ TextPaint A00;
    public final /* synthetic */ C017508g A01;
    public final /* synthetic */ C615239g A02;

    public AnonymousClass3P2(TextPaint textPaint, C017508g r2, C615239g r3) {
        this.A02 = r3;
        this.A00 = textPaint;
        this.A01 = r2;
    }

    public void A01(int i2) {
        C615239g r1 = this.A02;
        r1.A00();
        r1.A01 = true;
        this.A01.A01(i2);
    }

    public void A02(Typeface typeface) {
        C615239g r1 = this.A02;
        r1.A00 = Typeface.create(typeface, r1.A07);
        r1.A03(typeface, this.A00);
        r1.A01 = true;
        this.A01.A02(typeface);
    }
}

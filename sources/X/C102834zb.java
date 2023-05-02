package X;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.TextPaint;

/* renamed from: X.4zb  reason: invalid class name and case insensitive filesystem */
public class C102834zb implements C53762gF {
    public C53762gF A00;
    public final ValueAnimator A01 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
    public final AnonymousClass2Ra A02;
    public final C55602k1 A03;
    public final AnonymousClass4MW A04;
    public final int[] A05;

    public C102834zb(AnonymousClass2Ra r2, C55602k1 r3, AnonymousClass4MW r4, int[] iArr) {
        this.A05 = iArr;
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = r2;
    }

    public void A00(int i2) {
        AnonymousClass4MW r0 = this.A04;
        int i3 = r0.A02;
        if (i3 != i2) {
            r0.A02 = i2;
            this.A03.A01(i3, i2, r0.A01);
            AnonymousClass2Ra r02 = this.A02;
            r02.A00 = i2;
            r02.A0Q.A0H.setFont(i2);
        }
    }

    public void A01(TextPaint textPaint, CharSequence charSequence, int i2) {
        int i3 = 25;
        int i4 = 50;
        while (true) {
            int i5 = i4 - i3;
            if (i5 > 1) {
                AnonymousClass4MW r2 = this.A04;
                float f2 = (float) ((i5 >> 1) + i3);
                r2.A00 = f2;
                this.A03.setEntryTextSize(f2);
                int i6 = (Layout.getDesiredWidth(charSequence, textPaint) > ((float) i2) ? 1 : (Layout.getDesiredWidth(charSequence, textPaint) == ((float) i2) ? 0 : -1));
                float f3 = r2.A00;
                if (i6 >= 0) {
                    i4 = (int) f3;
                } else {
                    i3 = (int) f3;
                }
            } else {
                AnonymousClass4MW r0 = this.A04;
                float f4 = r0.A00 - 1.0f;
                r0.A00 = f4;
                this.A03.setEntryTextSize(f4 - 1.0f);
                return;
            }
        }
    }

    public void dismiss() {
        this.A00.dismiss();
    }
}

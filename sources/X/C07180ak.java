package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.CardView;
import com.facebook.redex.IDxRHelperShape395S0100000_I1;

/* renamed from: X.0ak  reason: invalid class name and case insensitive filesystem */
public class C07180ak implements C13420m0 {
    public final RectF A00 = AnonymousClass000.A0K();

    public void A00(C12310kB r9) {
        Rect A0J = AnonymousClass000.A0J();
        C07160ai r5 = (C07160ai) r9;
        ((C02200Af) r5.A00).getPadding(A0J);
        int ceil = (int) Math.ceil((double) ADo(r9));
        int ceil2 = (int) Math.ceil((double) ADm(r9));
        CardView cardView = r5.A01;
        if (ceil > cardView.A01) {
            C07180ak.super.setMinimumWidth(ceil);
        }
        if (ceil2 > cardView.A00) {
            C07180ak.super.setMinimumHeight(ceil2);
        }
        int i2 = A0J.left;
        int i3 = A0J.top;
        int i4 = A0J.right;
        int i5 = A0J.bottom;
        cardView.A05.set(i2, i3, i4, i5);
        Rect rect = cardView.A04;
        C07180ak.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
    }

    public ColorStateList AA1(C12310kB r2) {
        return ((C02200Af) ((C07160ai) r2).A00).A04;
    }

    public float ABv(C12310kB r2) {
        return ((C02200Af) ((C07160ai) r2).A00).A02;
    }

    public float ADN(C12310kB r2) {
        return ((C02200Af) ((C07160ai) r2).A00).A01;
    }

    public float ADm(C12310kB r7) {
        C02200Af r0 = (C02200Af) ((C07160ai) r7).A00;
        float f2 = r0.A01;
        float f3 = r0.A00;
        float f4 = (float) r0.A0C;
        float f5 = f2 * 1.5f;
        return (Math.max(f2, f3 + f4 + (f5 / 2.0f)) * 2.0f) + ((f5 + f4) * 2.0f);
    }

    public float ADo(C12310kB r6) {
        C02200Af r0 = (C02200Af) ((C07160ai) r6).A00;
        float f2 = r0.A01;
        float f3 = r0.A00;
        float f4 = (float) r0.A0C;
        return (Math.max(f2, f3 + f4 + (f2 / 2.0f)) * 2.0f) + ((f2 + f4) * 2.0f);
    }

    public float AFL(C12310kB r2) {
        return ((C02200Af) ((C07160ai) r2).A00).A00;
    }

    public void AIF() {
        C02200Af.A0G = new IDxRHelperShape395S0100000_I1(this, 1);
    }

    public void AIK(Context context, ColorStateList colorStateList, C12310kB r12, float f2, float f3, float f4) {
        C02200Af r3 = new C02200Af(colorStateList, context.getResources(), f2, f3, f4);
        C07160ai r2 = (C07160ai) r12;
        CardView cardView = r2.A01;
        r3.A09 = cardView.A03;
        r3.invalidateSelf();
        r2.A00 = r3;
        cardView.setBackgroundDrawable(r3);
        A00(r12);
    }

    public void AOp(C12310kB r1) {
    }

    public void AVE(C12310kB r3) {
        C07160ai r0 = (C07160ai) r3;
        C02200Af r1 = (C02200Af) r0.A00;
        r1.A09 = r0.A01.A03;
        r1.invalidateSelf();
        A00(r3);
    }

    public void Ada(ColorStateList colorStateList, C12310kB r6) {
        C02200Af r3 = (C02200Af) ((C07160ai) r6).A00;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        r3.A04 = colorStateList;
        r3.A07.setColor(colorStateList.getColorForState(r3.getState(), r3.A04.getDefaultColor()));
        r3.invalidateSelf();
    }

    public void Ads(C12310kB r3, float f2) {
        C02200Af r1 = (C02200Af) ((C07160ai) r3).A00;
        r1.A00(f2, r1.A01);
    }

    public void Ae8(C12310kB r3, float f2) {
        C02200Af r1 = (C02200Af) ((C07160ai) r3).A00;
        r1.A00(r1.A02, f2);
        A00(r3);
    }

    public void AeU(C12310kB r4, float f2) {
        C02200Af r2 = (C02200Af) ((C07160ai) r4).A00;
        if (f2 >= 0.0f) {
            float f3 = (float) ((int) (f2 + 0.5f));
            if (r2.A00 != f3) {
                r2.A00 = f3;
                r2.A0A = true;
                r2.invalidateSelf();
            }
            A00(r4);
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Invalid radius ");
        A0r.append(f2);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(". Must be >= 0", A0r));
    }
}

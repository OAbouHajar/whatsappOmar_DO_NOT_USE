package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import androidx.cardview.widget.CardView;

/* renamed from: X.0aj  reason: invalid class name and case insensitive filesystem */
public class C07170aj implements C13420m0 {
    public ColorStateList AA1(C12310kB r2) {
        return ((AnonymousClass0Ab) ((C07160ai) r2).A00).A02;
    }

    public float ABv(C12310kB r2) {
        return ((C07160ai) r2).A01.getElevation();
    }

    public float ADN(C12310kB r2) {
        return ((AnonymousClass0Ab) ((C07160ai) r2).A00).A00;
    }

    public float ADm(C12310kB r3) {
        return AFL(r3) * 2.0f;
    }

    public float ADo(C12310kB r3) {
        return AFL(r3) * 2.0f;
    }

    public float AFL(C12310kB r2) {
        return ((AnonymousClass0Ab) ((C07160ai) r2).A00).A01;
    }

    public void AIF() {
    }

    public void AIK(Context context, ColorStateList colorStateList, C12310kB r6, float f2, float f3, float f4) {
        AnonymousClass0Ab r2 = new AnonymousClass0Ab(colorStateList, f2);
        C07160ai r0 = (C07160ai) r6;
        r0.A00 = r2;
        CardView cardView = r0.A01;
        cardView.setBackgroundDrawable(r2);
        cardView.setClipToOutline(true);
        cardView.setElevation(f3);
        Ae8(r6, f4);
    }

    public void AOp(C12310kB r2) {
        Ae8(r2, ADN(r2));
    }

    public void AVE(C12310kB r2) {
        Ae8(r2, ADN(r2));
    }

    public void Ada(ColorStateList colorStateList, C12310kB r6) {
        AnonymousClass0Ab r3 = (AnonymousClass0Ab) ((C07160ai) r6).A00;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        r3.A02 = colorStateList;
        r3.A08.setColor(colorStateList.getColorForState(r3.getState(), r3.A02.getDefaultColor()));
        r3.invalidateSelf();
    }

    public void Ads(C12310kB r2, float f2) {
        ((C07160ai) r2).A01.setElevation(f2);
    }

    public void Ae8(C12310kB r8, float f2) {
        C07160ai r0 = (C07160ai) r8;
        AnonymousClass0Ab r3 = (AnonymousClass0Ab) r0.A00;
        CardView cardView = r0.A01;
        boolean z2 = cardView.A02;
        boolean z3 = cardView.A03;
        if (!(f2 == r3.A00 && r3.A06 == z2 && r3.A07 == z3)) {
            r3.A00 = f2;
            r3.A06 = z2;
            r3.A07 = z3;
            r3.A00((Rect) null);
            r3.invalidateSelf();
        }
        if (!cardView.A02) {
            cardView.A05.set(0, 0, 0, 0);
            Rect rect = cardView.A04;
            C07170aj.super.setPadding(0 + rect.left, 0 + rect.top, 0 + rect.right, 0 + rect.bottom);
            return;
        }
        float ADN = ADN(r8);
        float AFL = AFL(r8);
        boolean z4 = cardView.A03;
        float f3 = ADN;
        if (z4) {
            f3 = AnonymousClass000.A00(ADN, AFL);
        }
        int ceil = (int) Math.ceil((double) f3);
        float f4 = ADN * 1.5f;
        if (z4) {
            f4 = AnonymousClass000.A00(f4, AFL);
        }
        int ceil2 = (int) Math.ceil((double) f4);
        cardView.A05.set(ceil, ceil2, ceil, ceil2);
        Rect rect2 = cardView.A04;
        C07170aj.super.setPadding(ceil + rect2.left, ceil2 + rect2.top, ceil + rect2.right, ceil2 + rect2.bottom);
    }

    public void AeU(C12310kB r3, float f2) {
        AnonymousClass0Ab r1 = (AnonymousClass0Ab) ((C07160ai) r3).A00;
        if (f2 != r1.A01) {
            r1.A01 = f2;
            r1.A00((Rect) null);
            r1.invalidateSelf();
        }
    }
}

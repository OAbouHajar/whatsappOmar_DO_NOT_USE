package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.view.MotionEventCompat;

/* renamed from: X.0Qb  reason: invalid class name and case insensitive filesystem */
public class C05290Qb {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public Paint A04 = new Paint(2);
    public AnonymousClass0WN A05 = null;
    public AnonymousClass0WN A06 = null;
    public AnonymousClass0WN[] A07 = new AnonymousClass0WN[4];
    public final Rect A08 = AnonymousClass000.A0J();
    public final RectF A09 = AnonymousClass000.A0K();

    public void A00(Canvas canvas, float f2, float f3) {
        Bitmap A012;
        AnonymousClass0WN r0 = this.A06;
        Bitmap A013 = r0 != null ? r0.A01() : null;
        Bitmap bitmap = AnonymousClass0WN.A0F;
        if (A013 != bitmap) {
            float f4 = f2;
            float f5 = f3;
            Canvas canvas2 = canvas;
            if (AnonymousClass000.A1V(A013)) {
                Paint paint = this.A04;
                paint.setAlpha(MotionEventCompat.ACTION_MASK);
                canvas2.drawBitmap(A013, f4, f5, paint);
                return;
            }
            Paint paint2 = this.A04;
            paint2.setAlpha(MotionEventCompat.ACTION_MASK);
            AnonymousClass0WN[] r5 = this.A07;
            int i2 = 0;
            int i3 = 0;
            do {
                if (!(r5[i2] == null || r5[i2].A04 != this.A02 + 1 || r5[i2].A01() == null)) {
                    i3++;
                }
                i2++;
            } while (i2 < 4);
            AnonymousClass0WN r02 = this.A05;
            Bitmap A014 = r02 != null ? r02.A01() : null;
            if (i3 != 4) {
                if (!(A014 == null || A014 == bitmap)) {
                    int i4 = this.A02;
                    AnonymousClass0WN r1 = this.A05;
                    int i5 = i4 - r1.A04;
                    int i6 = r1.A00 >> i5;
                    int i7 = (1 << i5) - 1;
                    int i8 = (this.A00 & i7) * i6;
                    int i9 = (i7 & this.A01) * i6;
                    Rect rect = this.A08;
                    rect.set(i8, i9, i8 + i6, i6 + i9);
                    RectF rectF = this.A09;
                    AnonymousClass0WN r2 = this.A05;
                    rectF.set(f4, f5, ((float) r2.A01) + f2, ((float) r2.A00) + f3);
                    canvas2.drawBitmap(A014, rect, rectF, paint2);
                }
                if (i3 <= 0) {
                    return;
                }
            }
            int i10 = 0;
            do {
                int i11 = 0;
                do {
                    AnonymousClass0WN r15 = r5[(i10 << 1) + i11];
                    if (!(r15 == null || r15.A04 != this.A02 + 1 || (A012 = r15.A01()) == null || A012 == bitmap)) {
                        int i12 = r15.A00;
                        int i13 = i12 >> 1;
                        float f6 = ((float) (i13 * i10)) + f2;
                        float f7 = ((float) (i13 * i11)) + f3;
                        Rect rect2 = this.A08;
                        rect2.set(0, 0, r15.A01, i12);
                        RectF rectF2 = this.A09;
                        float f8 = (float) i13;
                        rectF2.set(f6, f7, f6 + f8, f8 + f7);
                        canvas2.drawBitmap(A012, rect2, rectF2, paint2);
                    }
                    i11++;
                } while (i11 < 2);
                i10++;
            } while (i10 < 2);
        }
    }

    public String toString() {
        StringBuilder A0p = AnonymousClass000.A0p(this);
        A0p.append("{tile=");
        Object obj = this.A06;
        Object obj2 = "{x}";
        if (obj == null) {
            obj = obj2;
        }
        A0p.append(obj);
        A0p.append(", mParentTile=");
        Object obj3 = this.A05;
        if (obj3 != null) {
            obj2 = obj3;
        }
        A0p.append(obj2);
        A0p.append(", status=");
        A0p.append(this.A03);
        return AnonymousClass000.A0h("}", A0p);
    }
}

package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v4.view.MotionEventCompat;
import java.util.List;

/* renamed from: X.0dT  reason: invalid class name and case insensitive filesystem */
public class C08340dT implements C12650kk, C13530mX, C13540mY {
    public AnonymousClass0SI A00;
    public final Paint A01 = new AnonymousClass0AR(1);
    public final Path A02;
    public final AnonymousClass0Ak A03;
    public final AnonymousClass0SI A04;
    public final AnonymousClass0SI A05;
    public final C08360dV A06;
    public final String A07;
    public final List A08 = AnonymousClass000.A0u();
    public final boolean A09;

    public C08340dT(AnonymousClass0Ak r5, C08530dn r6, C08360dV r7) {
        Path A0I = AnonymousClass000.A0I();
        this.A02 = A0I;
        this.A06 = r7;
        this.A07 = r6.A03;
        this.A09 = r6.A05;
        this.A03 = r5;
        AnonymousClass0HO r1 = r6.A01;
        if (r1 != null) {
            AnonymousClass0HU r2 = r6.A02;
            A0I.setFillType(r6.A00);
            AnonymousClass0HK r0 = new AnonymousClass0HK(r1.A00);
            this.A04 = r0;
            AnonymousClass0SI.A04(r0, this);
            r7.A09(r0);
            AnonymousClass0HL r02 = new AnonymousClass0HL(r2.A00);
            this.A05 = r02;
            AnonymousClass0SI.A04(r02, this);
            r7.A09(r02);
            return;
        }
        this.A04 = null;
        this.A05 = null;
    }

    public void A4l(AnonymousClass0UV r3, Object obj) {
        AnonymousClass0SI r0;
        if (obj == C13480m6.A0R) {
            r0 = this.A04;
        } else if (obj == C13480m6.A0S) {
            r0 = this.A05;
        } else if (obj == C13480m6.A00) {
            AnonymousClass0SI r1 = this.A00;
            if (r1 != null) {
                this.A06.A0O.remove(r1);
            }
            if (r3 == null) {
                this.A00 = null;
                return;
            }
            AnonymousClass0HF r02 = new AnonymousClass0HF(r3, (Object) null);
            this.A00 = r02;
            AnonymousClass0SI.A04(r02, this);
            this.A06.A09(this.A00);
            return;
        } else {
            return;
        }
        r0.A0D(r3);
    }

    public void A8F(Canvas canvas, Matrix matrix, int i2) {
        if (!this.A09) {
            Paint paint = this.A01;
            AnonymousClass0HK r2 = (AnonymousClass0HK) this.A04;
            paint.setColor(r2.A0E(AnonymousClass0NI.A00(r2), r2.A06()));
            int i3 = 0;
            paint.setAlpha(Math.max(0, Math.min(MotionEventCompat.ACTION_MASK, (int) ((((((float) i2) / 255.0f) * ((float) AnonymousClass000.A0D(this.A05.A08()))) / 100.0f) * 255.0f))));
            AnonymousClass000.A13(paint, this.A00);
            Path path = this.A02;
            path.reset();
            while (true) {
                List list = this.A08;
                if (i3 < list.size()) {
                    AnonymousClass000.A12(matrix, path, list, i3);
                    i3++;
                } else {
                    canvas.drawPath(path, paint);
                    AnonymousClass0NI.A01();
                    return;
                }
            }
        }
    }

    public void AAB(Matrix matrix, RectF rectF, boolean z2) {
        Path path = this.A02;
        path.reset();
        int i2 = 0;
        while (true) {
            List list = this.A08;
            if (i2 < list.size()) {
                AnonymousClass000.A12(matrix, path, list, i2);
                i2++;
            } else {
                path.computeBounds(rectF, false);
                AnonymousClass000.A14(rectF);
                return;
            }
        }
    }

    public void AZV() {
        this.A03.invalidateSelf();
    }

    public void AcW(AnonymousClass0WM r1, AnonymousClass0WM r2, List list, int i2) {
        C06560Ws.A01(this, r1, r2, list, i2);
    }

    public void Adk(List list, List list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Object obj = list2.get(i2);
            if (obj instanceof C13520mW) {
                this.A08.add(obj);
            }
        }
    }

    public String getName() {
        return this.A07;
    }
}

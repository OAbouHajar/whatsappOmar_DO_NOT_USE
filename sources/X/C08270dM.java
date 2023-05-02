package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.0dM  reason: invalid class name and case insensitive filesystem */
public class C08270dM implements C13520mW, C12650kk, C13530mX, C12640kj, C13540mY {
    public C08310dQ A00;
    public final Matrix A01 = AnonymousClass000.A0H();
    public final Path A02 = AnonymousClass000.A0I();
    public final AnonymousClass0Ak A03;
    public final AnonymousClass0SI A04;
    public final AnonymousClass0SI A05;
    public final AnonymousClass0S6 A06;
    public final C08360dV A07;
    public final String A08;
    public final boolean A09;

    public C08270dM(AnonymousClass0Ak r3, C08430dd r4, C08360dV r5) {
        this.A03 = r3;
        this.A07 = r5;
        this.A08 = r4.A03;
        this.A09 = r4.A04;
        AnonymousClass0HM A002 = AnonymousClass0HC.A00(r4.A00);
        this.A04 = A002;
        r5.A09(A002);
        AnonymousClass0SI.A04(A002, this);
        AnonymousClass0HM A003 = AnonymousClass0HC.A00(r4.A01);
        this.A05 = A003;
        r5.A09(A003);
        AnonymousClass0SI.A04(A003, this);
        AnonymousClass0S6 r0 = new AnonymousClass0S6(r4.A02);
        this.A06 = r0;
        r0.A03(r5);
        r0.A02(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4J(java.util.ListIterator r8) {
        /*
            r7 = this;
            X.0dQ r0 = r7.A00
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r8.previous()
            if (r0 == r7) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
        L_0x0016:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r8.previous()
            r5.add(r0)
            r8.remove()
            goto L_0x0016
        L_0x0027:
            java.util.Collections.reverse(r5)
            X.0Ak r1 = r7.A03
            X.0dV r3 = r7.A07
            boolean r6 = r7.A09
            r2 = 0
            java.lang.String r4 = "Repeater"
            X.0dQ r0 = new X.0dQ
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08270dM.A4J(java.util.ListIterator):void");
    }

    public void A4l(AnonymousClass0UV r2, Object obj) {
        AnonymousClass0SI r0;
        if (!this.A06.A04(r2, obj)) {
            if (obj == C13480m6.A0E) {
                r0 = this.A04;
            } else if (obj == C13480m6.A0F) {
                r0 = this.A05;
            } else {
                return;
            }
            r0.A0D(r2);
        }
    }

    public void A8F(Canvas canvas, Matrix matrix, int i2) {
        float A022 = AnonymousClass0SI.A02(this.A04);
        float A023 = AnonymousClass0SI.A02(this.A05);
        AnonymousClass0S6 r7 = this.A06;
        float A024 = AnonymousClass0SI.A02(r7.A06) / 100.0f;
        float A025 = AnonymousClass0SI.A02(r7.A01) / 100.0f;
        int i3 = (int) A022;
        while (true) {
            i3--;
            if (i3 >= 0) {
                Matrix matrix2 = this.A01;
                matrix2.set(matrix);
                float f2 = (float) i3;
                matrix2.preConcat(r7.A01(f2 + A023));
                this.A00.A8F(canvas, matrix2, (int) (((float) i2) * AnonymousClass000.A01(A025, A024, f2 / A022)));
            } else {
                return;
            }
        }
    }

    public void AAB(Matrix matrix, RectF rectF, boolean z2) {
        this.A00.AAB(matrix, rectF, z2);
    }

    public Path AEK() {
        Path AEK = this.A00.AEK();
        Path path = this.A02;
        path.reset();
        float A022 = AnonymousClass0SI.A02(this.A04);
        float A023 = AnonymousClass0SI.A02(this.A05);
        int i2 = (int) A022;
        while (true) {
            i2--;
            if (i2 < 0) {
                return path;
            }
            Matrix matrix = this.A01;
            matrix.set(this.A06.A01(((float) i2) + A023));
            path.addPath(AEK, matrix);
        }
    }

    public void AZV() {
        this.A03.invalidateSelf();
    }

    public void AcW(AnonymousClass0WM r1, AnonymousClass0WM r2, List list, int i2) {
        C06560Ws.A01(this, r1, r2, list, i2);
    }

    public void Adk(List list, List list2) {
        this.A00.Adk(list, list2);
    }

    public String getName() {
        return this.A08;
    }
}

package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* renamed from: X.0HA  reason: invalid class name */
public class AnonymousClass0HA extends C08330dS {
    public AnonymousClass0SI A00;
    public final AnonymousClass0SI A01;
    public final C08360dV A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0HA(X.AnonymousClass0Ak r13, X.C08470dh r14, X.C08360dV r15) {
        /*
            r12 = this;
            X.0JM r0 = r14.A05
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0040;
                case 1: goto L_0x003d;
                default: goto L_0x0009;
            }
        L_0x0009:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        L_0x000b:
            X.0KT r0 = r14.A06
            android.graphics.Paint$Join r4 = r0.A00()
            float r11 = r14.A00
            X.0HU r8 = r14.A04
            X.0HT r6 = r14.A03
            java.util.List r10 = r14.A08
            X.0HT r7 = r14.A02
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A02 = r15
            java.lang.String r0 = r14.A07
            r12.A03 = r0
            boolean r0 = r14.A09
            r12.A04 = r0
            X.0HO r0 = r14.A01
            java.util.List r1 = r0.A00
            X.0HK r0 = new X.0HK
            r0.<init>(r1)
            r12.A01 = r0
            X.AnonymousClass0SI.A04(r0, r12)
            r15.A09(r0)
            return
        L_0x003d:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x000b
        L_0x0040:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HA.<init>(X.0Ak, X.0dh, X.0dV):void");
    }

    public void A4l(AnonymousClass0UV r3, Object obj) {
        super.A4l(r3, obj);
        if (obj == C13480m6.A0T) {
            this.A01.A0D(r3);
        } else if (obj == C13480m6.A00) {
            AnonymousClass0SI r1 = this.A00;
            if (r1 != null) {
                this.A02.A0O.remove(r1);
            }
            if (r3 == null) {
                this.A00 = null;
                return;
            }
            AnonymousClass0HF r0 = new AnonymousClass0HF(r3, (Object) null);
            this.A00 = r0;
            AnonymousClass0SI.A04(r0, this);
            this.A02.A09(this.A01);
        }
    }

    public void A8F(Canvas canvas, Matrix matrix, int i2) {
        if (!this.A04) {
            Paint paint = this.A01;
            AnonymousClass0HK r2 = (AnonymousClass0HK) this.A01;
            paint.setColor(r2.A0E(AnonymousClass0NI.A00(r2), r2.A06()));
            AnonymousClass000.A13(paint, this.A00);
            super.A8F(canvas, matrix, i2);
        }
    }

    public String getName() {
        return this.A03;
    }
}

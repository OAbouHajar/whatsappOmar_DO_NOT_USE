package X;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.0dO  reason: invalid class name and case insensitive filesystem */
public class C08290dO implements C13520mW, C12650kk, C13540mY {
    public AnonymousClass0PM A00 = new AnonymousClass0PM();
    public boolean A01;
    public final Path A02 = AnonymousClass000.A0I();
    public final RectF A03 = AnonymousClass000.A0K();
    public final AnonymousClass0Ak A04;
    public final AnonymousClass0SI A05;
    public final AnonymousClass0SI A06;
    public final AnonymousClass0SI A07;
    public final String A08;
    public final boolean A09;

    public C08290dO(AnonymousClass0Ak r4, C08520dm r5, C08360dV r6) {
        this.A08 = r5.A03;
        this.A09 = r5.A04;
        this.A04 = r4;
        AnonymousClass0SI A7E = r5.A01.A7E();
        this.A06 = A7E;
        AnonymousClass0SI A7E2 = r5.A02.A7E();
        this.A07 = A7E2;
        AnonymousClass0HM A002 = AnonymousClass0HC.A00(r5.A00);
        this.A05 = A002;
        r6.A09(A7E);
        r6.A09(A7E2);
        r6.A09(A002);
        AnonymousClass0SI.A04(A7E, this);
        AnonymousClass0SI.A04(A7E2, this);
        AnonymousClass0SI.A04(A002, this);
    }

    public void A4l(AnonymousClass0UV r2, Object obj) {
        AnonymousClass0SI r0;
        if (obj == C13480m6.A03) {
            r0 = this.A07;
        } else if (obj == C13480m6.A02) {
            r0 = this.A06;
        } else if (obj == C13480m6.A07) {
            r0 = this.A05;
        } else {
            return;
        }
        r0.A0D(r2);
    }

    public Path AEK() {
        boolean z2 = this.A01;
        Path path = this.A02;
        if (!z2) {
            path.reset();
            if (!this.A09) {
                PointF A032 = AnonymousClass0SI.A03(this.A07);
                float f2 = A032.x / 2.0f;
                float f3 = A032.y / 2.0f;
                AnonymousClass0SI r0 = this.A05;
                float A0E = r0 == null ? 0.0f : ((AnonymousClass0HM) r0).A0E();
                float min = Math.min(f2, f3);
                if (A0E > min) {
                    A0E = min;
                }
                PointF A033 = AnonymousClass0SI.A03(this.A06);
                path.moveTo(A033.x + f2, (A033.y - f3) + A0E);
                path.lineTo(A033.x + f2, (A033.y + f3) - A0E);
                if (A0E > 0.0f) {
                    RectF rectF = this.A03;
                    float f4 = A033.x + f2;
                    float f5 = A0E * 2.0f;
                    float f6 = A033.y + f3;
                    rectF.set(f4 - f5, f6 - f5, f4, f6);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
                path.lineTo((A033.x - f2) + A0E, A033.y + f3);
                if (A0E > 0.0f) {
                    RectF rectF2 = this.A03;
                    float f7 = A033.x - f2;
                    float f8 = A033.y + f3;
                    float f9 = A0E * 2.0f;
                    rectF2.set(f7, f8 - f9, f9 + f7, f8);
                    path.arcTo(rectF2, 90.0f, 90.0f, false);
                }
                path.lineTo(A033.x - f2, (A033.y - f3) + A0E);
                if (A0E > 0.0f) {
                    RectF rectF3 = this.A03;
                    float f10 = A033.x - f2;
                    float f11 = A033.y - f3;
                    float f12 = A0E * 2.0f;
                    rectF3.set(f10, f11, f10 + f12, f12 + f11);
                    path.arcTo(rectF3, 180.0f, 90.0f, false);
                }
                path.lineTo((A033.x + f2) - A0E, A033.y - f3);
                if (A0E > 0.0f) {
                    RectF rectF4 = this.A03;
                    float f13 = A033.x + f2;
                    float f14 = A0E * 2.0f;
                    float f15 = A033.y - f3;
                    rectF4.set(f13 - f14, f15, f13, f15 + f14);
                    path.arcTo(rectF4, 270.0f, 90.0f, false);
                }
                path.close();
                this.A00.A00(path);
            }
            this.A01 = true;
        }
        return path;
    }

    public void AZV() {
        this.A01 = false;
        this.A04.invalidateSelf();
    }

    public void AcW(AnonymousClass0WM r1, AnonymousClass0WM r2, List list, int i2) {
        C06560Ws.A01(this, r1, r2, list, i2);
    }

    public void Adk(List list, List list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            C13150lY r2 = (C13150lY) list.get(i2);
            if (r2 instanceof C08240dJ) {
                C08240dJ r22 = (C08240dJ) r2;
                if (r22.A03 == AnonymousClass0JW.SIMULTANEOUSLY) {
                    this.A00.A00.add(r22);
                    r22.A05.add(this);
                }
            }
        }
    }

    public String getName() {
        return this.A08;
    }
}

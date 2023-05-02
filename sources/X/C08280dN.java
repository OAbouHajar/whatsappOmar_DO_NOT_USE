package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.0dN  reason: invalid class name and case insensitive filesystem */
public class C08280dN implements C13520mW, C12650kk, C13540mY {
    public AnonymousClass0PM A00 = new AnonymousClass0PM();
    public boolean A01;
    public final Path A02 = AnonymousClass000.A0I();
    public final AnonymousClass0Ak A03;
    public final AnonymousClass0SI A04;
    public final AnonymousClass0SI A05;
    public final C08420dc A06;
    public final String A07;

    public C08280dN(AnonymousClass0Ak r3, C08420dc r4, C08360dV r5) {
        this.A07 = r4.A02;
        this.A03 = r3;
        AnonymousClass0HN r1 = new AnonymousClass0HN(r4.A00.A00);
        this.A05 = r1;
        AnonymousClass0SI A7E = r4.A01.A7E();
        this.A04 = A7E;
        this.A06 = r4;
        r5.A09(r1);
        r5.A09(A7E);
        AnonymousClass0SI.A04(r1, this);
        AnonymousClass0SI.A04(A7E, this);
    }

    public void A4l(AnonymousClass0UV r2, Object obj) {
        AnonymousClass0SI r0;
        if (obj == C13480m6.A01) {
            r0 = this.A05;
        } else if (obj == C13480m6.A02) {
            r0 = this.A04;
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
            C08420dc r5 = this.A06;
            if (!r5.A03) {
                PointF A032 = AnonymousClass0SI.A03(this.A05);
                float f2 = A032.x / 2.0f;
                float f3 = A032.y / 2.0f;
                float f4 = f2 * 0.55228f;
                float f5 = 0.55228f * f3;
                path.reset();
                if (r5.A04) {
                    float f6 = -f3;
                    path.moveTo(0.0f, f6);
                    float f7 = 0.0f - f4;
                    float f8 = -f2;
                    float f9 = 0.0f - f5;
                    path.cubicTo(f7, f6, f8, f9, f8, 0.0f);
                    float f10 = f5 + 0.0f;
                    path.cubicTo(f8, f10, f7, f3, 0.0f, f3);
                    float f11 = f4 + 0.0f;
                    path.cubicTo(f11, f3, f2, f10, f2, 0.0f);
                    path.cubicTo(f2, f9, f11, f6, 0.0f, f6);
                } else {
                    float f12 = -f3;
                    path.moveTo(0.0f, f12);
                    float f13 = f4 + 0.0f;
                    float f14 = 0.0f - f5;
                    path.cubicTo(f13, f12, f2, f14, f2, 0.0f);
                    float f15 = f5 + 0.0f;
                    path.cubicTo(f2, f15, f13, f3, 0.0f, f3);
                    float f16 = 0.0f - f4;
                    float f17 = -f2;
                    path.cubicTo(f16, f3, f17, f15, f17, 0.0f);
                    path.cubicTo(f17, f14, f16, f12, 0.0f, f12);
                }
                PointF A033 = AnonymousClass0SI.A03(this.A04);
                path.offset(A033.x, A033.y);
                path.close();
                this.A00.A00(path);
            }
            this.A01 = true;
        }
        return path;
    }

    public void AZV() {
        this.A01 = false;
        this.A03.invalidateSelf();
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
        return this.A07;
    }
}

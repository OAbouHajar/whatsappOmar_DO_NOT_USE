package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.0dL  reason: invalid class name and case insensitive filesystem */
public class C08260dL implements C13520mW, C12650kk {
    public AnonymousClass0PM A00 = new AnonymousClass0PM();
    public boolean A01;
    public final Path A02 = AnonymousClass000.A0I();
    public final AnonymousClass0Ak A03;
    public final AnonymousClass0SI A04;
    public final String A05;
    public final boolean A06;

    public C08260dL(AnonymousClass0Ak r3, C08510dl r4, C08360dV r5) {
        this.A05 = r4.A02;
        this.A06 = r4.A03;
        this.A03 = r3;
        AnonymousClass0HD r0 = new AnonymousClass0HD(r4.A01.A00);
        this.A04 = r0;
        r5.A09(r0);
        AnonymousClass0SI.A04(r0, this);
    }

    public Path AEK() {
        boolean z2 = this.A01;
        Path path = this.A02;
        if (!z2) {
            path.reset();
            if (!this.A06) {
                path.set((Path) this.A04.A08());
                path.setFillType(Path.FillType.EVEN_ODD);
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
        return this.A05;
    }
}

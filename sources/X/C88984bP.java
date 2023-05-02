package X;

import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.4bP  reason: invalid class name and case insensitive filesystem */
public class C88984bP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass01J A04;

    public C88984bP() {
        this.A02 = 0;
        this.A04 = null;
        this.A00 = R.id.emoji_recent_btn;
        this.A01 = R.id.emoji_recent_marker;
        this.A03 = R.string.str0782;
    }

    public C88984bP(AnonymousClass2HU r2, int i2) {
        this.A02 = i2;
        this.A04 = r2.A03;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        this.A03 = r2.A02;
    }

    public int A00() {
        if (this instanceof C70433gg) {
            return ((C70433gg) this).A00.A00();
        }
        AnonymousClass01J r0 = this.A04;
        if (r0 == null) {
            return 0;
        }
        return ((List) r0.get()).size();
    }

    public int[] A01(C17020u3 r3, int i2) {
        if (this instanceof C70433gg) {
            return (int[]) ((C70433gg) this).A00.A01(i2);
        }
        AnonymousClass01J r0 = this.A04;
        if (r0 == null) {
            return new int[0];
        }
        int[] iArr = ((C37781pj) ((List) r0.get()).get(i2)).A00;
        return C62153Bw.A02(iArr) ? C61953Bb.A03(r3, iArr) : C62153Bw.A03(iArr) ? C61953Bb.A04(r3, iArr) : iArr;
    }
}

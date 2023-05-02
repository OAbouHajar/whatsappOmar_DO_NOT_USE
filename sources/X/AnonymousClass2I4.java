package X;

import java.util.Arrays;

/* renamed from: X.2I4  reason: invalid class name */
public class AnonymousClass2I4 implements AnonymousClass2I3 {
    public final AnonymousClass2I3 A00;
    public final AnonymousClass2I3 A01;

    public AnonymousClass2I4(AnonymousClass2I3 r1, AnonymousClass2I3 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean AIk(C24721Ha r4) {
        AnonymousClass2I3 r1 = this.A01;
        AnonymousClass00B.A06(r1);
        return this.A00.AIk(r4) && r1.AIk(r4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2I4)) {
            return false;
        }
        AnonymousClass2I4 r4 = (AnonymousClass2I4) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{0, this.A00, this.A01});
    }
}

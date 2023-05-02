package X;

import com.facebook.redex.IDxCFactoryShape403S0100000_2_I0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0o2  reason: invalid class name and case insensitive filesystem */
public final class C13760o2 {
    public final int A00;
    public final int A01;
    public final C13810o7 A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public C13760o2(C13810o7 r2, Set set, Set set2, Set set3, int i2, int i3) {
        this.A04 = Collections.unmodifiableSet(set);
        this.A03 = Collections.unmodifiableSet(set2);
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = r2;
        this.A05 = Collections.unmodifiableSet(set3);
    }

    public static C13760o2 A00(Class cls, Object obj, Class... clsArr) {
        C13940oL r1 = new C13940oL(cls, clsArr);
        r1.A00 = new IDxCFactoryShape403S0100000_2_I0(obj, 0);
        return new C13760o2(r1.A00, new HashSet(r1.A03), new HashSet(r1.A02), r1.A01, 0, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.A04.toArray()));
        sb.append(">{");
        sb.append(this.A00);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.A03.toArray()));
        sb.append("}");
        return sb.toString();
    }
}

package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.4q7  reason: invalid class name and case insensitive filesystem */
public final class C97514q7 implements C109535Sn {
    public static final C97514q7 A01 = new C97514q7();
    public final List A00;

    public C97514q7() {
        this.A00 = Collections.emptyList();
    }

    public C97514q7(C88444aV r2) {
        this.A00 = Collections.singletonList(r2);
    }

    public List ABD(long j2) {
        return j2 >= 0 ? this.A00 : Collections.emptyList();
    }

    public long AC3(int i2) {
        C90524eJ.A03(AnonymousClass000.A1P(i2));
        return 0;
    }

    public int AC4() {
        return 1;
    }

    public int ADu(long j2) {
        return j2 < 0 ? 0 : -1;
    }
}

package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.4q2  reason: invalid class name and case insensitive filesystem */
public final class C97464q2 implements C109535Sn {
    public final List A00;

    public C97464q2(List list) {
        this.A00 = Collections.unmodifiableList(list);
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

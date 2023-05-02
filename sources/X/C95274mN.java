package X;

import android.os.Bundle;
import java.util.Set;

/* renamed from: X.4mN  reason: invalid class name and case insensitive filesystem */
public final class C95274mN implements AnonymousClass04o {
    public final C016307t A00;
    public final AnonymousClass04o A01;
    public final Set A02;

    public C95274mN(Bundle bundle, AnonymousClass04o r3, C001600r r4, AnonymousClass2Z5 r5, Set set) {
        this.A02 = set;
        this.A01 = r3;
        this.A00 = new C57202qR(bundle, r4, r5, this);
    }

    public C003401n A6s(Class cls) {
        return this.A02.contains(cls.getName()) ? this.A00.A6s(cls) : this.A01.A6s(cls);
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}

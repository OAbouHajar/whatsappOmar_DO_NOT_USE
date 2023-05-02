package X;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: X.0i2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11000i2 implements Predicate {
    public final /* synthetic */ AnonymousClass0XM A00;
    public final /* synthetic */ Set A01;

    public /* synthetic */ C11000i2(AnonymousClass0XM r1, Set set) {
        this.A00 = r1;
        this.A01 = set;
    }

    public final boolean test(Object obj) {
        return AnonymousClass0XM.A07((Pair) obj, this.A01);
    }
}

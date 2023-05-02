package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.575  reason: invalid class name */
public class AnonymousClass575 implements Comparator {
    public final Collator A00;

    public AnonymousClass575(AnonymousClass013 r3) {
        Collator instance = Collator.getInstance(C13690nt.A0m(r3));
        this.A00 = instance;
        instance.setDecomposition(1);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.A00.compare(((C39701sv) obj).A02(), ((C39701sv) obj2).A02());
    }
}

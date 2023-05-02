package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.572  reason: invalid class name */
public class AnonymousClass572 implements Comparator {
    public final Collator A00;

    public AnonymousClass572(AnonymousClass013 r3) {
        Collator instance = Collator.getInstance(C13690nt.A0m(r3));
        this.A00 = instance;
        instance.setDecomposition(1);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = ((C55902kd) obj).A06;
        String str2 = ((C55902kd) obj2).A06;
        if (str == null) {
            return str2 == null ? 0 : 1;
        }
        if (str2 == null) {
            return -1;
        }
        return this.A00.compare(str, str2);
    }
}

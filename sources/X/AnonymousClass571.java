package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.571  reason: invalid class name */
public class AnonymousClass571 implements Comparator {
    public final Collator A00;

    public AnonymousClass571(AnonymousClass013 r3) {
        Collator instance = Collator.getInstance(C13690nt.A0m(r3));
        this.A00 = instance;
        instance.setDecomposition(1);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Integer A01 = C87614Xr.A01(str, str2);
        return A01 == null ? this.A00.compare(str, str2) : A01.intValue();
    }
}

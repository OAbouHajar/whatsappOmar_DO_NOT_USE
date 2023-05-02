package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.2ko  reason: invalid class name and case insensitive filesystem */
public class C56012ko implements Comparator {
    public final Collator A00;

    public C56012ko(AnonymousClass013 r3) {
        Collator instance = Collator.getInstance(AnonymousClass013.A00(r3.A00));
        this.A00 = instance;
        instance.setDecomposition(1);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.A00.compare(((C56002kn) obj).A00, ((C56002kn) obj2).A00);
    }
}

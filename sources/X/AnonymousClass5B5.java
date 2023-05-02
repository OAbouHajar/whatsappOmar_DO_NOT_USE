package X;

import java.text.Collator;
import java.util.Locale;

/* renamed from: X.5B5  reason: invalid class name */
public class AnonymousClass5B5 extends ThreadLocal {
    public final /* synthetic */ Locale A00;

    public AnonymousClass5B5(Locale locale) {
        this.A00 = locale;
    }

    public /* bridge */ /* synthetic */ Object initialValue() {
        Collator instance = Collator.getInstance(this.A00);
        instance.setDecomposition(1);
        instance.setStrength(0);
        return instance;
    }
}

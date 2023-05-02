package X;

import java.text.Collator;

/* renamed from: X.58Z  reason: invalid class name */
public final /* synthetic */ class AnonymousClass58Z implements AnonymousClass01J {
    public final /* synthetic */ AnonymousClass570 A00;
    public final /* synthetic */ AnonymousClass013 A01;

    public /* synthetic */ AnonymousClass58Z(AnonymousClass570 r1, AnonymousClass013 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final Object get() {
        Collator instance = Collator.getInstance(C13690nt.A0m(this.A01));
        instance.setDecomposition(1);
        return instance;
    }
}

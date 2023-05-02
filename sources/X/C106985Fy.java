package X;

/* renamed from: X.5Fy  reason: invalid class name and case insensitive filesystem */
public final class C106985Fy extends AnonymousClass1DR implements AnonymousClass1UJ {
    public final /* synthetic */ AnonymousClass1UM[] $elements;
    public final /* synthetic */ C1041354b $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106985Fy(C1041354b r2, AnonymousClass1UM[] r3) {
        super(2);
        this.$elements = r3;
        this.$index = r2;
    }

    public /* bridge */ /* synthetic */ Object AIV(Object obj, Object obj2) {
        C18450wi.A0H(obj2, 1);
        AnonymousClass1UM[] r3 = this.$elements;
        C1041354b r2 = this.$index;
        int i2 = r2.element;
        r2.element = i2 + 1;
        r3[i2] = obj2;
        return AnonymousClass22M.A00;
    }
}

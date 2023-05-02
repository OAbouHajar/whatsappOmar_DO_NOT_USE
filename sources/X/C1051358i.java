package X;

/* renamed from: X.58i  reason: invalid class name and case insensitive filesystem */
public abstract class C1051358i implements AnonymousClass1UL {
    public final AnonymousClass5NJ key;

    public C1051358i(AnonymousClass5NJ r2) {
        C18450wi.A0H(r2, 1);
        this.key = r2;
    }

    public Object fold(Object obj, AnonymousClass1UJ r3) {
        C18450wi.A0H(r3, 2);
        return r3.AIV(obj, this);
    }

    public AnonymousClass1UL get(AnonymousClass5NJ r2) {
        return C90274ds.A01(this, r2);
    }

    public AnonymousClass5NJ getKey() {
        return this.key;
    }

    public AnonymousClass1UM minusKey(AnonymousClass5NJ r2) {
        return C90274ds.A02(this, r2);
    }

    public AnonymousClass1UM plus(AnonymousClass1UM r2) {
        return C90274ds.A03(this, r2);
    }
}

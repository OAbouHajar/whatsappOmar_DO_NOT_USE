package X;

/* renamed from: X.3cL  reason: invalid class name and case insensitive filesystem */
public final class C67763cL extends C18400wd {
    public C67763cL() {
        this(4);
    }

    public C67763cL(int i2) {
        super(4);
    }

    public C67763cL add(Object obj) {
        super.add(obj);
        return this;
    }

    public C34641kb build() {
        this.forceCopy = true;
        return C34641kb.asImmutableList(this.contents, this.size);
    }
}

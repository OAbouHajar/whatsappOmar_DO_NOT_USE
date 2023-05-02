package X;

/* renamed from: X.1Wr  reason: invalid class name and case insensitive filesystem */
public abstract class C28581Wr extends C28591Ws {
    public C28541Wm A00;
    public boolean A01 = false;
    public final C28541Wm A02;

    public C28581Wr(C28541Wm r3) {
        this.A02 = r3;
        this.A00 = (C28541Wm) r3.A0b(AnonymousClass2L5.NEW_MUTABLE_INSTANCE, (Object) null, (Object) null);
    }

    public static C28541Wm A00(C28581Wr r0) {
        r0.A03();
        return r0.A00;
    }

    public C28541Wm A01() {
        if (!this.A01) {
            this.A00.A0W();
            this.A01 = true;
        }
        return this.A00;
    }

    public final C28541Wm A02() {
        C28541Wm A012 = A01();
        if (A012.A0Z()) {
            return A012;
        }
        throw new AnonymousClass2L1();
    }

    public void A03() {
        if (this.A01) {
            C28541Wm r2 = (C28541Wm) this.A00.A0b(AnonymousClass2L5.NEW_MUTABLE_INSTANCE, (Object) null, (Object) null);
            r2.A0Y(AnonymousClass2L7.A00, this.A00);
            this.A00 = r2;
            this.A01 = false;
        }
    }

    public void A04(C28541Wm r3) {
        A03();
        this.A00.A0Y(AnonymousClass2L7.A00, r3);
    }

    public /* bridge */ /* synthetic */ AnonymousClass1Wo ABi() {
        return this.A02;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        C28581Wr r1 = (C28581Wr) this.A02.A0b(AnonymousClass2L5.NEW_BUILDER, (Object) null, (Object) null);
        r1.A04(A01());
        return r1;
    }
}

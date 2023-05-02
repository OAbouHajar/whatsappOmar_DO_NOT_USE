package X;

/* renamed from: X.52s  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1037852s implements AnonymousClass1WE {
    public final /* synthetic */ AnonymousClass1CB A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C1037852s(AnonymousClass1CB r1, String str, boolean z2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z2;
    }

    public final void accept(Object obj) {
        AnonymousClass1CB r4 = this.A00;
        String str = this.A01;
        boolean z2 = this.A02;
        if (str == null) {
            str = "user_initiated";
        }
        AnonymousClass254 r1 = new AnonymousClass254(new C101244wx(r4, z2), r4.A0Z);
        C16040sK r0 = r4.A0D;
        r0.A0B();
        r1.A00(r0.A04, str);
    }
}

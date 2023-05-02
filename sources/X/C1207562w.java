package X;

/* renamed from: X.62w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1207562w implements AnonymousClass1WE {
    public final /* synthetic */ AnonymousClass1XP A00;
    public final /* synthetic */ C118505un A01;
    public final /* synthetic */ C117475t3 A02;

    public /* synthetic */ C1207562w(AnonymousClass1XP r1, C118505un r2, C117475t3 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void accept(Object obj) {
        C118505un r4 = this.A01;
        AnonymousClass1XP r2 = this.A00;
        C117475t3 r3 = this.A02;
        AnonymousClass21L r1 = (AnonymousClass21L) r2.A08.A00();
        if (r1 != null && !r1.A02.get()) {
            r1.A01.delete();
        }
        AnonymousClass21B r22 = (AnonymousClass21B) r2.A0H.A00();
        if (r22 == null || r22.A00 != 0) {
            r4.A02.A06.execute(new C1209063l(r3));
        } else {
            r4.A02.A06.execute(new AnonymousClass65E(r22, r3));
        }
    }
}

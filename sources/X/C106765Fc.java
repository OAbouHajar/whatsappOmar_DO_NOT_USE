package X;

/* renamed from: X.5Fc  reason: invalid class name and case insensitive filesystem */
public final class C106765Fc extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass22J $onError;
    public final /* synthetic */ AnonymousClass4NS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106765Fc(AnonymousClass4NS r2, AnonymousClass22J r3) {
        super(1);
        this.this$0 = r2;
        this.$onError = r3;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        Object r3;
        AnonymousClass47J r5 = (AnonymousClass47J) obj;
        C18450wi.A0H(r5, 0);
        if (r5 instanceof C77843wg) {
            r3 = ((C77843wg) r5).A00;
        } else if (r5 instanceof C77833wf) {
            r3 = new C77953wr(((C77833wf) r5).A00);
        } else if (r5 instanceof C77863wi) {
            r3 = new C77953wr(((C77863wi) r5).A00);
        } else if (r5 instanceof C77853wh) {
            r3 = new C77963ws(((C77853wh) r5).A00);
        } else if (r5 instanceof C77823we) {
            r3 = new C77973wt(0);
        } else {
            throw new AnonymousClass2Xe();
        }
        C14870pt.A03(this.this$0.A00, this.$onError, r3, 46);
        return AnonymousClass22M.A00;
    }
}

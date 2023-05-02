package X;

/* renamed from: X.5D3  reason: invalid class name */
public final class AnonymousClass5D3 extends AnonymousClass5D4 {
    public final /* synthetic */ AnonymousClass1UG $completion;
    public final /* synthetic */ Object $receiver$inlined;
    public final /* synthetic */ AnonymousClass1UJ $this_createCoroutineUnintercepted$inlined;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5D3(Object obj, AnonymousClass1UG r2, AnonymousClass1UJ r3) {
        super(r2);
        this.$completion = r2;
        this.$this_createCoroutineUnintercepted$inlined = r3;
        this.$receiver$inlined = obj;
    }

    public Object A04(Object obj) {
        int i2 = this.label;
        if (i2 == 0) {
            this.label = 1;
            C813747x.A00(obj);
            AnonymousClass1UJ r1 = this.$this_createCoroutineUnintercepted$inlined;
            C90284dt.A01(r1, 2);
            return r1.AIV(this.$receiver$inlined, this);
        } else if (i2 == 1) {
            this.label = 2;
            C813747x.A00(obj);
            return obj;
        } else {
            throw AnonymousClass000.A0V("This coroutine had already completed");
        }
    }
}

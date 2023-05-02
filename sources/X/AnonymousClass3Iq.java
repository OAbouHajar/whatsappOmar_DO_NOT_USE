package X;

import java.util.List;

/* renamed from: X.3Iq  reason: invalid class name */
public final class AnonymousClass3Iq extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ C73553oL $category;
    public final /* synthetic */ List $items;
    public final /* synthetic */ C84774Lv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Iq(C73553oL r2, C84774Lv r3, List list) {
        super(1);
        this.this$0 = r3;
        this.$category = r2;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        this.this$0.A01.A09(this.$category);
        C25501Ka r7 = this.this$0.A02;
        long indexOf = ((long) this.$items.indexOf(this.$category)) + 1;
        String str = this.$category.A01;
        C75883ss r5 = new C75883ss();
        r5.A01 = 6;
        r5.A03 = C13680ns.A0X();
        if (r7.A03.A0E(C16620tM.A02, 2828)) {
            r5.A0B = str;
            r5.A05 = Long.valueOf(indexOf);
        }
        r7.A01(r5);
        return AnonymousClass22M.A00;
    }
}

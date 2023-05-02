package X;

import java.util.List;

/* renamed from: X.5FV  reason: invalid class name */
public final class AnonymousClass5FV extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass22J $handler;
    public final /* synthetic */ String $parentCategoryId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FV(String str, AnonymousClass22J r3) {
        super(1);
        this.$parentCategoryId = str;
        this.$handler = r3;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C82574Di r5 = (C82574Di) obj;
        C18450wi.A0H(r5, 0);
        if (r5.A00) {
            C73073nG r52 = (C73073nG) r5;
            this.$handler.AIU(new C73063nF((List) C25411Jr.A00(r52.A01, this.$parentCategoryId), r52.A00));
        } else {
            this.$handler.AIU(r5);
        }
        return AnonymousClass22M.A00;
    }
}

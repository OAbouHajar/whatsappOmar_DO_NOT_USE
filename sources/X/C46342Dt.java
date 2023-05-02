package X;

import java.util.LinkedHashMap;

/* renamed from: X.2Dt  reason: invalid class name and case insensitive filesystem */
public final class C46342Dt extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ AnonymousClass13J this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46342Dt(AnonymousClass13J r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C34171jo r1 : this.this$0.A03.A02()) {
            linkedHashMap.put(Integer.valueOf(r1.A00), r1);
        }
        return linkedHashMap;
    }
}

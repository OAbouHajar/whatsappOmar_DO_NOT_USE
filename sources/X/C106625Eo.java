package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5Eo  reason: invalid class name and case insensitive filesystem */
public final class C106625Eo extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ C20310zq[] $delegateRepositories;
    public final /* synthetic */ C20310zq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106625Eo(C20310zq r2, C20310zq[] r3) {
        super(0);
        this.$delegateRepositories = r3;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C20310zq[] r4 = this.$delegateRepositories;
        C20310zq r3 = this.this$0;
        int length = r4.length;
        int i2 = 0;
        while (i2 < length) {
            C20310zq r0 = r4[i2];
            i2++;
            linkedHashMap.putAll((Map) r0.A00.getValue());
        }
        linkedHashMap.putAll(r3.A01());
        Integer[] A02 = r3.A02();
        C18450wi.A0H(A02, 1);
        int length2 = A02.length;
        int i3 = 0;
        while (i3 < length2) {
            Integer num = A02[i3];
            i3++;
            linkedHashMap.remove(num);
        }
        return linkedHashMap;
    }
}

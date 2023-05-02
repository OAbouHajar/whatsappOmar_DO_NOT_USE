package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.5Eg  reason: invalid class name and case insensitive filesystem */
public final class C106545Eg extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ C88804b7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106545Eg(C88804b7 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        AnonymousClass42X[] values = AnonymousClass42X.values();
        int length = values.length;
        ArrayList A0i = C13690nt.A0i(length);
        int i2 = 0;
        while (i2 < length) {
            AnonymousClass42X r0 = values[i2];
            i2++;
            C13690nt.A1O(A0i, r0.statusColor);
        }
        C88804b7 r5 = this.this$0;
        int A07 = C25421Js.A07(AnonymousClass1J9.A0M(A0i, 10));
        if (A07 < 16) {
            A07 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A07);
        Iterator it = A0i.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C13680ns.A1X(next, linkedHashMap, AnonymousClass00T.A00(r5.A08, AnonymousClass000.A0D(next)));
        }
        return linkedHashMap;
    }
}

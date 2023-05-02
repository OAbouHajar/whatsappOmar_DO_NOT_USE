package X;

import java.util.LinkedHashMap;
import java.util.PriorityQueue;

/* renamed from: X.2Dv  reason: invalid class name */
public final class AnonymousClass2Dv extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ AnonymousClass13J this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Dv(AnonymousClass13J r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C34171jo r3 : this.this$0.A03.A02()) {
            String str = r3.A06;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new PriorityQueue(1);
            }
            PriorityQueue priorityQueue = (PriorityQueue) obj;
            priorityQueue.offer(Integer.valueOf(r3.A00));
            linkedHashMap.put(str, priorityQueue);
        }
        return linkedHashMap;
    }
}

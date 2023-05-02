package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.2TF  reason: invalid class name */
public class AnonymousClass2TF {
    public final long A00;
    public final List A01;
    public final Map A02;
    public final CountDownLatch A03 = new CountDownLatch(1);
    public volatile boolean A04 = false;

    public AnonymousClass2TF(List list, Map map, long j2) {
        this.A00 = j2;
        this.A01 = list;
        this.A02 = map;
    }
}

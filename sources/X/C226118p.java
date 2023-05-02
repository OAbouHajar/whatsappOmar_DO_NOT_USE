package X;

import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.18p  reason: invalid class name and case insensitive filesystem */
public class C226118p {
    public static final AtomicInteger A09 = new AtomicInteger(0);
    public final RunnableRunnableShape0S0400000_I0 A00;
    public final C225118f A01;
    public final C17420v3 A02;
    public final C226018o A03;
    public final C225818m A04;
    public final C16320sq A05;
    public final AnonymousClass01D A06;
    public final ArrayBlockingQueue A07;
    public final ConcurrentHashMap A08;

    public C226118p(C225118f r7, C17420v3 r8, C226018o r9, C225818m r10, C16320sq r11, AnonymousClass01D r12) {
        this.A06 = r12;
        this.A05 = r11;
        this.A02 = r8;
        this.A01 = r7;
        this.A03 = r9;
        this.A04 = r10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(100);
        this.A07 = arrayBlockingQueue;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A08 = concurrentHashMap;
        this.A00 = new RunnableRunnableShape0S0400000_I0(arrayBlockingQueue, concurrentHashMap, r12, r8, 33);
    }

    public final void A00(int i2) {
        ConcurrentHashMap concurrentHashMap = this.A08;
        Integer valueOf = Integer.valueOf(i2);
        AtomicInteger atomicInteger = (AtomicInteger) concurrentHashMap.get(valueOf);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            AtomicInteger atomicInteger2 = (AtomicInteger) concurrentHashMap.putIfAbsent(valueOf, atomicInteger);
            if (atomicInteger2 != null) {
                atomicInteger = atomicInteger2;
            }
        }
        atomicInteger.incrementAndGet();
    }

    public final void A01(C30191bu r8, int i2) {
        C31041dN r6 = r8.A05;
        if (r6 != C31041dN.A02) {
            for (C30181bt r1 : r6.A00) {
                if (i2 != 1) {
                    r1.AQM(r8);
                } else {
                    r1.AXS(r8);
                }
            }
            for (C30181bt r2 : r6.A01) {
                if (this.A07.offer(new C30171bs(r2, r8, i2))) {
                    A00(r8.A01);
                } else {
                    this.A02.A5I();
                }
            }
            this.A05.Acm(this.A00, "qpl_bg_listeners");
        }
    }
}

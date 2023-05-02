package X;

import android.util.Pair;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1bu  reason: invalid class name and case insensitive filesystem */
public class C30191bu {
    public static final AtomicInteger A0I = new AtomicInteger(0);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C17420v3 A04;
    public final C31041dN A05;
    public final C226118p A06;
    public final Integer A07;
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final ConcurrentHashMap A09 = new ConcurrentHashMap();
    public final ConcurrentHashMap A0A = new ConcurrentHashMap();
    public final ConcurrentHashMap A0B = new ConcurrentHashMap();
    public final AtomicInteger A0C = new AtomicInteger(0);
    public final AtomicInteger A0D = new AtomicInteger(-1);
    public final AtomicInteger A0E = new AtomicInteger(0);
    public final AtomicLong A0F = new AtomicLong(-1);
    public final boolean A0G;
    public final boolean A0H;

    public C30191bu(C17420v3 r4, C31041dN r5, C226118p r6, Integer num, int i2, long j2, long j3, boolean z2, boolean z3) {
        this.A04 = r4;
        this.A06 = r6;
        this.A00 = i2;
        this.A05 = r5;
        this.A07 = num;
        this.A03 = j3;
        this.A02 = j2;
        this.A0H = z2;
        this.A01 = A0I.incrementAndGet();
        this.A0G = z3;
    }

    public void A00(int i2, String str, Object obj) {
        if (str.length() > 50) {
            this.A04.A4u(this.A00, str);
            return;
        }
        AtomicInteger atomicInteger = this.A0C;
        if (atomicInteger.get() + i2 >= 1000) {
            this.A04.A4w(this.A00, str, i2);
            return;
        }
        atomicInteger.addAndGet(i2);
        if (this.A08.putIfAbsent(str, obj) != null) {
            atomicInteger.addAndGet(-i2);
        }
    }

    public void A01(long j2, short s2) {
        if (this.A0F.compareAndSet(-1, j2)) {
            this.A0D.set(s2);
            this.A06.A01(this, 2);
        }
    }

    public void A02(Serializable serializable, String str, String str2) {
        this.A0A.put(new Pair(str, str2), serializable);
    }

    public void A03(String str, String str2, long j2) {
        AtomicInteger atomicInteger = this.A0E;
        if (atomicInteger.get() >= 1000) {
            this.A04.ALR(this.A00);
        } else if (str.length() > 50) {
            this.A04.Aab(this.A00, str);
        } else if (str2 == null || str2.length() <= 1000) {
            int andIncrement = atomicInteger.getAndIncrement();
            this.A0B.put(Integer.valueOf(andIncrement), new C31101dT(str, str2, j2));
        } else {
            this.A04.Aaa(this.A00, str2);
        }
    }

    public boolean A04(String str) {
        AtomicInteger atomicInteger = this.A0E;
        int i2 = atomicInteger.get() - 1;
        while (i2 >= 0) {
            ConcurrentHashMap concurrentHashMap = this.A0B;
            C31101dT r1 = (C31101dT) concurrentHashMap.get(Integer.valueOf(i2));
            if (r1 == null || !r1.A02.equals(str)) {
                i2--;
            } else {
                long j2 = r1.A00;
                this.A0F.set(j2);
                for (int i3 = atomicInteger.get() - 1; i3 >= 0; i3--) {
                    C31101dT r0 = (C31101dT) concurrentHashMap.get(Integer.valueOf(i3));
                    if (r0 != null && r0.A00 > j2) {
                        concurrentHashMap.remove(Integer.valueOf(i3));
                    }
                }
                return true;
            }
        }
        return false;
    }
}

package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0xT  reason: invalid class name and case insensitive filesystem */
public class C18920xT {
    public C19460yT A00;
    public final C16300so A01;
    public final C16040sK A02;
    public final Object A03 = new Object();
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final boolean A06;

    public C18920xT(C16300so r3, C16040sK r4, C14710pd r5) {
        boolean A0E = r5.A0E(C16620tM.A02, 1885);
        this.A06 = A0E;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static void A00(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((Lock) it.next()).unlock();
        }
    }

    public Lock A01() {
        C16040sK r0 = this.A02;
        r0.A0B();
        C28871Za r02 = r0.A04;
        return A02(r02 != null ? C28851Ya.A02(r02) : new C28861Yb(0, "", 0));
    }

    public Lock A02(C28861Yb r4) {
        ConcurrentHashMap concurrentHashMap = this.A04;
        StringBuilder sb = new StringBuilder();
        sb.append(r4.A02);
        sb.append(".");
        sb.append(r4.A01);
        return A05(sb.toString(), concurrentHashMap, 512);
    }

    public Lock A03(C30981dH r4) {
        return A05(r4.A01, this.A05, 32);
    }

    public Lock A04(DeviceJid deviceJid) {
        return A02(C28851Ya.A02(deviceJid.getUserJid().getPrimaryDevice()));
    }

    public final Lock A05(String str, ConcurrentHashMap concurrentHashMap, int i2) {
        if (!this.A06) {
            return null;
        }
        Integer valueOf = Integer.valueOf(Math.abs(str.hashCode()) % i2);
        if (!concurrentHashMap.containsKey(valueOf)) {
            C35901mg r0 = new C35901mg(this);
            concurrentHashMap.putIfAbsent(valueOf, r0);
            return r0;
        }
        Object obj = concurrentHashMap.get(valueOf);
        AnonymousClass00B.A06(obj);
        return (C35901mg) obj;
    }

    public void A06(Set set) {
        synchronized (this.A03) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((Lock) it.next()).lock();
            }
        }
    }
}

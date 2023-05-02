package X;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.1bZ  reason: invalid class name and case insensitive filesystem */
public class C29991bZ {
    public static final Set A04;
    public final int A00;
    public final C30001ba A01;
    public final C16320sq A02;
    public final ConcurrentMap A03 = new ConcurrentHashMap();

    static {
        HashSet hashSet = new HashSet();
        A04 = hashSet;
        hashSet.add((byte) 7);
        hashSet.add((byte) 0);
    }

    public C29991bZ(C30001ba r3, C14710pd r4, C16320sq r5) {
        this.A02 = r5;
        this.A01 = r3;
        this.A00 = r4.A03(C16620tM.A02, 546);
    }
}

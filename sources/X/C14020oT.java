package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0oT  reason: invalid class name and case insensitive filesystem */
public final class C14020oT extends C13830o9 {
    public final C13830o9 A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public C14020oT(C13830o9 r10, C13760o2 r11) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C13790o5 r3 : r11.A03) {
            boolean z2 = r3.A00 == 2;
            Class cls = r3.A01;
            if (z2) {
                hashSet3.add(cls);
            } else {
                hashSet.add(cls);
            }
        }
        Set set = r11.A05;
        if (!set.isEmpty()) {
            hashSet.add(C13920oI.class);
        }
        this.A01 = Collections.unmodifiableSet(hashSet);
        this.A02 = Collections.unmodifiableSet(hashSet2);
        this.A04 = Collections.unmodifiableSet(hashSet3);
        this.A05 = Collections.unmodifiableSet(hashSet4);
        this.A03 = set;
        this.A00 = r10;
    }
}

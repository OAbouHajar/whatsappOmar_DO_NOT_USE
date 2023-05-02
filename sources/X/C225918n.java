package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* renamed from: X.18n  reason: invalid class name and case insensitive filesystem */
public class C225918n implements C226018o {
    public final int A00;
    public final C225118f A01;
    public final C225018e A02;
    public final Random A03 = new Random();
    public final Set A04;

    public C225918n(C225118f r6, C225018e r7) {
        this.A01 = r6;
        this.A02 = r7;
        HashSet hashSet = new HashSet();
        for (int valueOf : C226018o.A00) {
            hashSet.add(Integer.valueOf(valueOf));
        }
        this.A04 = Collections.unmodifiableSet(hashSet);
        this.A00 = this.A03.nextInt(901) + 100;
    }

    public final boolean A00(int i2) {
        C225118f r10 = this.A01;
        long j2 = r10.A01(i2).A01;
        return j2 != 0 && (j2 == 1 || Math.abs((this.A02.A00() ^ ((long) r10.A00.A03(C16620tM.A02, 225))) ^ ((long) i2)) % j2 == 0) && (!this.A04.contains(Integer.valueOf(i2)) || this.A03.nextInt(this.A00) == 0);
    }

    public boolean AJd(int i2) {
        long nextLong;
        C225118f r1 = this.A01;
        if (r1.A01(i2).A02) {
            return A00(i2);
        }
        long j2 = r1.A01(i2).A01;
        if (j2 == 0) {
            return false;
        }
        if (this.A04.contains(Integer.valueOf(i2))) {
            nextLong = this.A03.nextLong();
            j2 = Math.max(j2, (long) this.A00);
        } else if (j2 == 1) {
            return true;
        } else {
            nextLong = this.A03.nextLong();
        }
        return nextLong % j2 == 0;
    }
}

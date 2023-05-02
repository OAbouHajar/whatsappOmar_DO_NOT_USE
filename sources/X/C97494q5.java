package X;

import com.facebook.redex.IDxComparatorShape20S0000000_2_I1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4q5  reason: invalid class name and case insensitive filesystem */
public final class C97494q5 implements C109535Sn {
    public final List A00;
    public final long[] A01;
    public final long[] A02;

    public C97494q5(List list) {
        this.A00 = Collections.unmodifiableList(C13680ns.A0n(list));
        this.A01 = new long[(list.size() << 1)];
        for (int i2 = 0; i2 < list.size(); i2++) {
            C34241jw r4 = (C34241jw) list.get(i2);
            int i3 = i2 << 1;
            long[] jArr = this.A01;
            jArr[i3] = r4.A01;
            jArr[i3 + 1] = r4.A00;
        }
        long[] jArr2 = this.A01;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.A02 = copyOf;
        Arrays.sort(copyOf);
    }

    public List ABD(long j2) {
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        int i2 = 0;
        while (true) {
            List list = this.A00;
            if (i2 >= list.size()) {
                break;
            }
            long[] jArr = this.A01;
            int i3 = i2 << 1;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                C34241jw r6 = (C34241jw) list.get(i2);
                C88444aV r2 = r6.A02;
                if (r2.A01 == -3.4028235E38f) {
                    A0u2.add(r6);
                } else {
                    A0u.add(r2);
                }
            }
            i2++;
        }
        Collections.sort(A0u2, new IDxComparatorShape20S0000000_2_I1(2));
        for (int i4 = 0; i4 < A0u2.size(); i4++) {
            C88794b6 r22 = new C88794b6(((C34241jw) A0u2.get(i4)).A02);
            r22.A01 = (float) (-1 - i4);
            r22.A07 = 1;
            A0u.add(r22.A00());
        }
        return A0u;
    }

    public long AC3(int i2) {
        boolean z2 = true;
        C90524eJ.A03(C13700nu.A0f(i2));
        long[] jArr = this.A02;
        if (i2 >= jArr.length) {
            z2 = false;
        }
        C90524eJ.A03(z2);
        return jArr[i2];
    }

    public int AC4() {
        return this.A02.length;
    }

    public int ADu(long j2) {
        long[] jArr = this.A02;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] != j2);
        }
        if (binarySearch >= jArr.length) {
            return -1;
        }
        return binarySearch;
    }
}

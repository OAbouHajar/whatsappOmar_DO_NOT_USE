package X;

import java.util.Arrays;

/* renamed from: X.4q4  reason: invalid class name and case insensitive filesystem */
public final class C97484q4 implements C109535Sn {
    public final long[] A00;
    public final C88444aV[] A01;

    public C97484q4(long[] jArr, C88444aV[] r2) {
        this.A01 = r2;
        this.A00 = jArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r2.A01[r1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List ABD(long r3) {
        /*
            r2 = this;
            long[] r1 = r2.A00
            r0 = 0
            int r1 = X.AnonymousClass3C1.A04(r1, r3, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0017
            X.4aV[] r0 = r2.A01
            r1 = r0[r1]
            X.4aV r0 = X.C88444aV.A0G
            if (r1 == r0) goto L_0x0017
            java.util.List r0 = java.util.Collections.singletonList(r1)
            return r0
        L_0x0017:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97484q4.ABD(long):java.util.List");
    }

    public long AC3(int i2) {
        boolean z2 = true;
        C90524eJ.A03(C13700nu.A0f(i2));
        long[] jArr = this.A00;
        if (i2 >= jArr.length) {
            z2 = false;
        }
        C90524eJ.A03(z2);
        return jArr[i2];
    }

    public int AC4() {
        return this.A00.length;
    }

    public int ADu(long j2) {
        long[] jArr = this.A00;
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

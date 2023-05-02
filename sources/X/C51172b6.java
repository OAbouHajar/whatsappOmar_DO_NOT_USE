package X;

import android.database.ContentObserver;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: X.2b6  reason: invalid class name and case insensitive filesystem */
public class C51172b6 implements AnonymousClass2BC {
    public int A00;
    public int A01;
    public int[] A02;
    public long[] A03;
    public final PriorityQueue A04;
    public final AnonymousClass2BC[] A05;

    public C51172b6(AnonymousClass2BC[] r6, int i2) {
        AnonymousClass2BC[] r4 = (AnonymousClass2BC[]) r6.clone();
        this.A05 = r4;
        PriorityQueue priorityQueue = new PriorityQueue(4, i2 == 1 ? new C1047856x() : new C1047956y());
        this.A04 = priorityQueue;
        this.A03 = new long[16];
        this.A01 = 0;
        int length = r4.length;
        this.A02 = new int[length];
        this.A00 = -1;
        priorityQueue.clear();
        for (int i3 = 0; i3 < length; i3++) {
            C86164Rl r1 = new C86164Rl(this.A05[i3], i3);
            if (r1.A00()) {
                this.A04.add(r1);
            }
        }
    }

    public HashMap AAC() {
        HashMap hashMap = new HashMap();
        for (AnonymousClass2BC AAC : this.A05) {
            hashMap.putAll(AAC.AAC());
        }
        return hashMap;
    }

    public AnonymousClass2BF ADR(int i2) {
        if (i2 < 0 || i2 > getCount()) {
            StringBuilder sb = new StringBuilder("index ");
            sb.append(i2);
            sb.append(" out of range max is ");
            sb.append(getCount());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int[] iArr = this.A02;
        int i3 = 0;
        Arrays.fill(iArr, 0);
        int i4 = this.A01;
        int i5 = 0;
        while (i3 < i4) {
            long j2 = this.A03[i3];
            int i6 = (int) (-1 & j2);
            int i7 = (int) (j2 >> 32);
            int i8 = i5 + i6;
            if (i8 > i2) {
                return this.A05[i7].ADR(iArr[i7] + (i2 - i5));
            }
            iArr[i7] = iArr[i7] + i6;
            i3++;
            i5 = i8;
        }
        while (true) {
            PriorityQueue priorityQueue = this.A04;
            C86164Rl r5 = (C86164Rl) priorityQueue.poll();
            if (r5 == null) {
                return null;
            }
            int i9 = r5.A03;
            if (i9 == this.A00) {
                int i10 = this.A01 - 1;
                long[] jArr = this.A03;
                jArr[i10] = jArr[i10] + 1;
            } else {
                this.A00 = i9;
                long[] jArr2 = this.A03;
                int length = jArr2.length;
                int i11 = this.A01;
                if (length == i11) {
                    long[] jArr3 = new long[(i11 << 1)];
                    System.arraycopy(jArr2, 0, jArr3, 0, i11);
                    this.A03 = jArr3;
                    jArr2 = jArr3;
                }
                int i12 = this.A01;
                this.A01 = i12 + 1;
                jArr2[i12] = 1 | (((long) this.A00) << 32);
            }
            if (i5 == i2) {
                AnonymousClass2BF r1 = r5.A02;
                if (!r5.A00()) {
                    return r1;
                }
                priorityQueue.add(r5);
                return r1;
            }
            if (r5.A00()) {
                priorityQueue.add(r5);
            }
            i5++;
        }
    }

    public void AcE() {
        for (AnonymousClass2BC AcE : this.A05) {
            AcE.AcE();
        }
    }

    public void close() {
        for (AnonymousClass2BC close : this.A05) {
            close.close();
        }
    }

    public int getCount() {
        int i2 = 0;
        for (AnonymousClass2BC count : this.A05) {
            i2 += count.getCount();
        }
        return i2;
    }

    public boolean isEmpty() {
        for (AnonymousClass2BC isEmpty : this.A05) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        for (AnonymousClass2BC registerContentObserver : this.A05) {
            registerContentObserver.registerContentObserver(contentObserver);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        for (AnonymousClass2BC unregisterContentObserver : this.A05) {
            unregisterContentObserver.unregisterContentObserver(contentObserver);
        }
    }
}

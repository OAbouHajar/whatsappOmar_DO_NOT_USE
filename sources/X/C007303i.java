package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.03i  reason: invalid class name and case insensitive filesystem */
public final class C007303i {
    public static final AnonymousClass025 A0K = new AnonymousClass0ZZ();
    public static final String A0L;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public AnonymousClass04P A09;
    public AnonymousClass042 A0A;
    public C007203h A0B;
    public C007203h A0C;
    public C007403j A0D;
    public AnonymousClass0KV A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public final int A0I;
    public final String A0J;

    static {
        String A012 = C06530Wm.A01("WorkSpec");
        C18450wi.A0B(A012);
        A0L = A012;
    }

    public C007303i(AnonymousClass04P r3, AnonymousClass042 r4, C007203h r5, C007203h r6, C007403j r7, AnonymousClass0KV r8, String str, String str2, String str3, int i2, int i3, int i4, long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z2) {
        C18450wi.A0H(str, 1);
        C18450wi.A0H(r8, 2);
        C18450wi.A0H(str2, 3);
        C18450wi.A0H(r3, 12);
        C18450wi.A0H(r7, 18);
        this.A0J = str;
        this.A0E = r8;
        this.A0G = str2;
        this.A0F = str3;
        this.A0B = r5;
        this.A0C = r6;
        this.A04 = j2;
        this.A05 = j3;
        this.A03 = j4;
        this.A0A = r4;
        this.A01 = i2;
        this.A09 = r3;
        this.A02 = j5;
        this.A06 = j6;
        this.A07 = j7;
        this.A08 = j8;
        this.A0H = z2;
        this.A0D = r7;
        this.A00 = i3;
        this.A0I = i4;
    }

    public static final C007303i A00(AnonymousClass04P r1, AnonymousClass042 r2, C007203h r3, C007203h r4, C007403j r5, AnonymousClass0KV r6, String str, String str2, String str3, int i2, int i3, int i4, long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z2) {
        C18450wi.A0H(r6, 1);
        C18450wi.A0H(r2, 9);
        C18450wi.A0H(r1, 11);
        C18450wi.A0H(r5, 17);
        return new C007303i(r1, r2, r3, r4, r5, r6, str, str2, str3, i2, i3, i4, j2, j3, j4, j5, j6, j7, j8, z2);
    }

    public static final List A01(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C05420Re r2 = (C05420Re) it.next();
            List list2 = r2.A04;
            C007203h r7 = list2.isEmpty() ^ true ? (C007203h) list2.get(0) : C007203h.A01;
            arrayList.add(new AnonymousClass0Rc(r2.A01, r7, r2.A02, r2.A05, UUID.fromString(r2.A03), r2.A00));
        }
        return arrayList;
    }

    public final long A02() {
        long j2;
        long j3;
        int i2;
        if (this.A0E != AnonymousClass0KV.ENQUEUED || (i2 = this.A01) <= 0) {
            long j4 = this.A05;
            if (j4 != 0) {
                long j5 = 0;
                int i3 = this.A00;
                long j6 = this.A06;
                if (i3 == 0) {
                    j6 += this.A04;
                }
                long j7 = this.A03;
                if (j7 != j4) {
                    if (i3 == 0) {
                        j5 = ((long) -1) * j7;
                    }
                    j6 += j4;
                } else if (i3 != 0) {
                    j5 = j4;
                }
                return j6 + j5;
            }
            long j8 = this.A06;
            if (j8 == 0) {
                j8 = System.currentTimeMillis();
            }
            j3 = this.A04;
        } else {
            AnonymousClass04P r1 = this.A09;
            AnonymousClass04P r0 = AnonymousClass04P.LINEAR;
            long j9 = this.A02;
            j2 = r1 == r0 ? j9 * ((long) i2) : (long) Math.scalb((float) j9, i2 - 1);
            j3 = this.A06;
            if (j2 > 18000000) {
                j2 = 18000000;
            }
        }
        return j3 + j2;
    }

    public final boolean A03() {
        return !C18450wi.A0R(AnonymousClass042.A08, this.A0A);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C007303i) {
                C007303i r8 = (C007303i) obj;
                if (!(C18450wi.A0R(this.A0J, r8.A0J) && this.A0E == r8.A0E && C18450wi.A0R(this.A0G, r8.A0G) && C18450wi.A0R(this.A0F, r8.A0F) && C18450wi.A0R(this.A0B, r8.A0B) && C18450wi.A0R(this.A0C, r8.A0C) && this.A04 == r8.A04 && this.A05 == r8.A05 && this.A03 == r8.A03 && C18450wi.A0R(this.A0A, r8.A0A) && this.A01 == r8.A01 && this.A09 == r8.A09 && this.A02 == r8.A02 && this.A06 == r8.A06 && this.A07 == r8.A07 && this.A08 == r8.A08 && this.A0H == r8.A0H && this.A0D == r8.A0D && this.A00 == r8.A00 && this.A0I == r8.A0I)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((((this.A0J.hashCode() * 31) + this.A0E.hashCode()) * 31) + this.A0G.hashCode()) * 31;
        String str = this.A0F;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.A04;
        long j3 = this.A05;
        long j4 = this.A03;
        long j5 = this.A02;
        long j6 = this.A06;
        long j7 = this.A07;
        long j8 = this.A08;
        int hashCode3 = (((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.A0B.hashCode()) * 31) + this.A0C.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.A0A.hashCode()) * 31) + this.A01) * 31) + this.A09.hashCode()) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        boolean z2 = this.A0H;
        if (z2) {
            z2 = true;
        }
        return ((((((hashCode3 + (z2 ? 1 : 0)) * 31) + this.A0D.hashCode()) * 31) + this.A00) * 31) + this.A0I;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{WorkSpec: ");
        sb.append(this.A0J);
        sb.append('}');
        return sb.toString();
    }
}

package X;

import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: X.0cR  reason: invalid class name and case insensitive filesystem */
public final class C07770cR implements C13610mf, C13040lN {
    public static final TreeMap A08 = new TreeMap();
    public int A00;
    public final int A01;
    public final double[] A02;
    public final int[] A03;
    public final long[] A04;
    public final String[] A05;
    public final byte[][] A06;
    public volatile String A07;

    public C07770cR(int i2) {
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A03 = new int[i3];
        this.A04 = new long[i3];
        this.A02 = new double[i3];
        this.A05 = new String[i3];
        this.A06 = new byte[i3][];
    }

    public static final void A00() {
        TreeMap treeMap = A08;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            C18450wi.A0B(it);
            while (true) {
                int i2 = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i2;
                } else {
                    return;
                }
            }
        }
    }

    public final void A01() {
        TreeMap treeMap = A08;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.A01), this);
            A00();
        }
    }

    public void A5N(int i2, byte[] bArr) {
        C18450wi.A0H(bArr, 1);
        this.A03[i2] = 5;
        this.A06[i2] = bArr;
    }

    public void A5P(int i2, double d2) {
        this.A03[i2] = 3;
        this.A02[i2] = d2;
    }

    public void A5Q(int i2, long j2) {
        this.A03[i2] = 2;
        this.A04[i2] = j2;
    }

    public void A5R(int i2) {
        this.A03[i2] = 1;
    }

    public void A5S(int i2, String str) {
        C18450wi.A0H(str, 1);
        this.A03[i2] = 4;
        this.A05[i2] = str;
    }

    public void A5T(C13610mf r7) {
        int i2 = this.A00;
        if (1 <= i2) {
            int i3 = 1;
            while (true) {
                int i4 = this.A03[i3];
                if (i4 == 1) {
                    r7.A5R(i3);
                } else if (i4 == 2) {
                    r7.A5Q(i3, this.A04[i3]);
                } else if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 == 5) {
                            byte[] bArr = this.A06[i3];
                            if (bArr == null) {
                                break;
                            }
                            r7.A5N(i3, bArr);
                        }
                    } else {
                        String str = this.A05[i3];
                        if (str == null) {
                            break;
                        }
                        r7.A5S(i3, str);
                    }
                } else {
                    r7.A5P(i3, this.A02[i3]);
                }
                if (i3 != i2) {
                    i3++;
                } else {
                    return;
                }
            }
            throw AnonymousClass000.A0T("Required value was null.");
        }
    }

    public String AGC() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        throw AnonymousClass000.A0V("Required value was null.");
    }

    public void close() {
    }
}

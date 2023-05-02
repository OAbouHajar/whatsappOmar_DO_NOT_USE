package X;

import android.util.SparseArray;

/* renamed from: X.1aD  reason: invalid class name and case insensitive filesystem */
public class C29201aD {
    public final SparseArray A00;

    public C29201aD() {
        this.A00 = new SparseArray();
    }

    public C29201aD(int i2) {
        this.A00 = new SparseArray(i2);
    }

    public static final int A00(String str) {
        char charAt;
        char charAt2;
        if (str == null || str.length() != 2 || 'A' > (charAt = str.charAt(0)) || charAt > 'Z' || 'A' > (charAt2 = str.charAt(1)) || charAt2 > 'Z') {
            return -1;
        }
        return ((charAt - 'A') * 26) + (charAt2 - 'A');
    }

    public Object A01(String str) {
        int A002 = A00(str);
        if (A002 != -1) {
            return this.A00.get(A002);
        }
        StringBuilder sb = new StringBuilder("Invalid country code \"");
        sb.append(str);
        sb.append("\".");
        throw new IllegalArgumentException(sb.toString());
    }

    public void A02(String str, Object obj) {
        int A002 = A00(str);
        if (A002 != -1) {
            this.A00.append(A002, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid country code \"");
        sb.append(str);
        sb.append("\".");
        throw new IllegalArgumentException(sb.toString());
    }

    public void A03(String str, Object obj) {
        int A002 = A00(str);
        if (A002 != -1) {
            this.A00.put(A002, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid country code \"");
        sb.append(str);
        sb.append("\".");
        throw new IllegalArgumentException(sb.toString());
    }
}

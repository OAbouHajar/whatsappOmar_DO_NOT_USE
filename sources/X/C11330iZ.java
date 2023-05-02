package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0iZ  reason: invalid class name and case insensitive filesystem */
public class C11330iZ extends AnonymousClass080 {
    public static final String A01(Object[] objArr) {
        StringBuilder A0o = AnonymousClass000.A0o();
        A08(A0o, objArr);
        String obj = A0o.toString();
        C18450wi.A0B(obj);
        return obj;
    }

    public static final List A03(Object[] objArr) {
        int length = objArr.length - 2;
        if (length < 0) {
            length = 0;
        }
        return A07(objArr, length);
    }

    public static final List A04(Object[] objArr) {
        ArrayList A0u = AnonymousClass000.A0u();
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            if (obj != null) {
                A0u.add(obj);
            }
        }
        return A0u;
    }

    public static final List A05(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? A06(objArr) : AnonymousClass1JB.A0V(objArr[0]) : AnonymousClass1JA.A0P();
    }

    public static final List A06(Object[] objArr) {
        return new ArrayList(AnonymousClass1JA.A0O(objArr));
    }

    public static final List A07(Object[] objArr, int i2) {
        if (i2 < 0) {
            StringBuilder A0r = AnonymousClass000.A0r("Requested element count ");
            A0r.append(i2);
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(" is less than zero.", A0r));
        } else if (i2 == 0) {
            return AnonymousClass1JA.A0P();
        } else {
            int length = objArr.length;
            if (i2 >= length) {
                return A05(objArr);
            }
            if (i2 == 1) {
                return AnonymousClass1JB.A0V(objArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(objArr[i3]);
            }
            return arrayList;
        }
    }

    public static final void A08(Appendable appendable, Object[] objArr) {
        appendable.append("");
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            i3++;
            if (i3 > 1) {
                appendable.append(", ");
            }
            AnonymousClass233.A0S(appendable, obj);
        }
        appendable.append("");
    }
}

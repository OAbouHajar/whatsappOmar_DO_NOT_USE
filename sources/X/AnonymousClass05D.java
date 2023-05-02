package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.05D  reason: invalid class name */
public abstract class AnonymousClass05D {
    public C10760he A00;
    public AnonymousClass05E A01;
    public C10680hW A02;

    public static boolean A00(Collection collection, Map map) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract int A01();

    public abstract int A02(Object obj);

    public abstract Object A03(int i2, int i3);

    public abstract Object A04(int i2, Object obj);

    public abstract Map A05();

    public abstract void A06();

    public abstract void A07(int i2);

    public Object[] A08(Object[] objArr, int i2) {
        int A012 = A01();
        if (objArr.length < A012) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), A012);
        }
        for (int i3 = 0; i3 < A012; i3++) {
            objArr[i3] = A03(i3, i2);
        }
        if (objArr.length > A012) {
            objArr[A012] = null;
        }
        return objArr;
    }
}

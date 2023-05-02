package X;

import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.1uR  reason: invalid class name and case insensitive filesystem */
public class C40631uR {
    public static String A00(AnonymousClass013 r9, List list, boolean z2) {
        int i2;
        Object[] objArr;
        Object obj;
        int i3;
        Object[] objArr2;
        Object obj2;
        int size = list.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return r9.A0G((String) list.get(0));
        }
        if (size != 2) {
            String A0B = r9.A0B(235, r9.A0G((String) list.get(0)), r9.A0G((String) list.get(1)));
            for (int i4 = 2; i4 < list.size() - 1; i4++) {
                A0B = r9.A0B(234, A0B, r9.A0G((String) list.get(i4)));
            }
            if (z2) {
                i3 = 233;
                objArr2 = new Object[2];
                objArr2[0] = A0B;
                obj2 = list.get(size - 1);
            } else {
                i2 = R.string.str0c5f;
                objArr = new Object[2];
                objArr[0] = A0B;
                obj = list.get(size - 1);
                objArr[1] = r9.A0G((String) obj);
                return r9.A0C(i2, objArr);
            }
        } else if (z2) {
            i3 = 236;
            objArr2 = new Object[2];
            objArr2[0] = r9.A0G((String) list.get(0));
            obj2 = list.get(1);
        } else {
            i2 = R.string.str0c63;
            objArr = new Object[2];
            objArr[0] = r9.A0G((String) list.get(0));
            obj = list.get(1);
            objArr[1] = r9.A0G((String) obj);
            return r9.A0C(i2, objArr);
        }
        objArr2[1] = r9.A0G((String) obj2);
        return r9.A0B(i3, objArr2);
    }
}

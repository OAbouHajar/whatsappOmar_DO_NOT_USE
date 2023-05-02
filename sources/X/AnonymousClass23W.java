package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.23W  reason: invalid class name */
public class AnonymousClass23W {
    public static HashMap A00(Cursor cursor, byte b2) {
        String[] strArr;
        HashMap hashMap = new HashMap();
        C33931jQ.A03(cursor, hashMap, C81944Ak.A01);
        if (b2 == 56) {
            strArr = C81934Aj.A01;
        } else if (b2 == 67) {
            strArr = C81924Ai.A01;
        } else if (b2 == 68) {
            strArr = C81914Ah.A01;
        } else {
            throw new IllegalArgumentException("MessageAddOnUtils/getColIndexesForMessageAddOnStatements messageAddOnType not supported");
        }
        C33931jQ.A03(cursor, hashMap, strArr);
        return hashMap;
    }

    public static boolean A01(int i2) {
        return i2 == 1 || i2 == 4 || i2 == 2 || i2 == 3;
    }

    public static boolean A02(C33211iD r3) {
        if (r3 == null) {
            return false;
        }
        if (C41061vA.A0G(r3)) {
            return true;
        }
        int i2 = r3.A01;
        if ((i2 & 256) == 256) {
            return true;
        }
        if ((i2 & 128) != 128) {
            return false;
        }
        C53082ex r0 = r3.A0Z;
        if (r0 == null) {
            r0 = C53082ex.A05;
        }
        return (r0.A00 & 2) == 2;
    }
}

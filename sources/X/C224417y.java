package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.17y  reason: invalid class name and case insensitive filesystem */
public class C224417y {
    public final C16920ts A00;

    public C224417y(C16920ts r1) {
        this.A00 = r1;
    }

    public static String A00(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("message_type");
        sb.append(" NOT IN (");
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < length; i2++) {
            sb.append(",");
            sb.append(iArr[i2]);
        }
        sb.append(")");
        return sb.toString();
    }

    public static void A01(StringBuilder sb, boolean z2) {
        String str;
        if (z2) {
            sb.append(" AND sort_id < ?");
            str = " ORDER BY sort_id DESC";
        } else {
            sb.append(" AND sort_id > ?");
            str = " ORDER BY sort_id ASC";
        }
        sb.append(str);
    }

    public static void A02(StringBuilder sb, boolean z2) {
        String str;
        if (z2) {
            sb.append(" AND message_type != '");
            sb.append(8);
            str = "' ";
        } else {
            str = " ";
        }
        sb.append(str);
    }

    public AnonymousClass01Q A03(C16740tZ r11) {
        String str;
        ArrayList arrayList = new ArrayList();
        List<C15830rv> A0Q = r11.A0Q();
        if (A0Q == null || A0Q.size() < r11.A0A) {
            arrayList.add(String.valueOf(r11.A0I));
            arrayList.add(r11.A11.A01);
            arrayList.add(String.valueOf(r11.A13));
            str = " WHERE timestamp = ? AND from_me = 1 AND key_id = ? AND _id!=?";
        } else {
            arrayList.add(r11.A11.A01);
            C16920ts r9 = this.A00;
            HashMap hashMap = new HashMap();
            for (C15830rv r1 : A0Q) {
                long A02 = r9.A02(r1);
                if (A02 != -1) {
                    hashMap.put(r1, Long.valueOf(A02));
                }
            }
            StringBuilder sb = new StringBuilder(" WHERE from_me=1 AND key_id=? AND chat_row_id IN ");
            sb.append(C34111ji.A00(hashMap.size()));
            str = sb.toString();
            for (Object obj : hashMap.values()) {
                arrayList.add(obj.toString());
            }
        }
        return new AnonymousClass01Q(str, arrayList);
    }
}

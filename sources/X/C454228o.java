package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.28o  reason: invalid class name and case insensitive filesystem */
public class C454228o {
    public static final C35081lL[] A00 = new C35081lL[0];

    public static C28371Vv A00(C30821d1 r5, int i2) {
        int i3 = r5.A01;
        String A02 = A02(r5.A00);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35081lL("v", Integer.toString(i3)));
        arrayList.add(new C35081lL("type", A02));
        if (i2 != 0) {
            arrayList.add(new C35081lL("count", String.valueOf(i2)));
        }
        return new C28371Vv("enc", r5.A02, (C35081lL[]) arrayList.toArray(A00));
    }

    public static C28371Vv A01(C30821d1 r8, Integer num, String str, String str2, int i2, boolean z2, boolean z3) {
        int i3 = r8.A01;
        String A02 = A02(r8.A00);
        return new C28371Vv("enc", r8.A02, (C35081lL[]) A03(num, A02, str, str2, i3, i2, z2, z3).toArray(A00));
    }

    public static String A02(int i2) {
        if (i2 == 0) {
            return "msg";
        }
        if (i2 == 1) {
            return "pkmsg";
        }
        if (i2 == 2) {
            return "skmsg";
        }
        if (i2 == 3) {
            return "frskmsg";
        }
        StringBuilder sb = new StringBuilder("Unsupported ciphertext type ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static List A03(Integer num, String str, String str2, String str3, int i2, int i3, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35081lL("v", Integer.toString(i2)));
        arrayList.add(new C35081lL("type", str));
        if (i3 != 0) {
            arrayList.add(new C35081lL("count", String.valueOf(i3)));
        }
        if (str2 != null) {
            arrayList.add(new C35081lL("mediatype", str2));
        }
        if (str3 != null) {
            arrayList.add(new C35081lL("native_flow_name", str3));
        }
        if (num != null && num.intValue() > 0) {
            arrayList.add(new C35081lL("duration", String.valueOf(num)));
        }
        if (z2) {
            arrayList.add(new C35081lL("decrypt-fail", "hide"));
        }
        if (z3) {
            arrayList.add(new C35081lL("sticker_type", "avatar"));
        }
        return arrayList;
    }
}

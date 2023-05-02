package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4Xq  reason: invalid class name and case insensitive filesystem */
public class C87604Xq {
    public static int A00(String str) {
        if (!(str == null || str.length() == 0)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e2) {
                Log.d("Whatsapp", AnonymousClass000.A0h(str, AnonymousClass000.A0r("NumberUtil/Invalid int value:")), e2);
            }
        }
        return -1;
    }

    public static Map A01(Map map) {
        HashMap A0x = AnonymousClass000.A0x();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            A0x.put(A0z.getKey(), A0z.getValue());
        }
        return A0x;
    }
}

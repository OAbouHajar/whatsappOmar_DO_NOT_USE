package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3BT  reason: invalid class name */
public class AnonymousClass3BT {
    public static void A00(C16300so r10, AnonymousClass4MJ r11, C28371Vv r12, String str) {
        int i2;
        Pair pair;
        C28371Vv A0J = r12.A0J(str);
        AnonymousClass00B.A06(A0J);
        List A0O = A0J.A0O("participant");
        ArrayList A0u = AnonymousClass000.A0u();
        Class<UserJid> cls = UserJid.class;
        Iterator it = A0J.A0O("participant").iterator();
        while (it.hasNext()) {
            A0u.add(C13690nt.A0S(it).A0F(r10, cls, "jid"));
        }
        ArrayList A0u2 = AnonymousClass000.A0u();
        A02(A0J, "type", A0u2);
        ArrayList A0u3 = AnonymousClass000.A0u();
        A02(A0J, "error", A0u3);
        ArrayList A0u4 = AnonymousClass000.A0u();
        Iterator it2 = A0O.iterator();
        while (it2.hasNext()) {
            C28371Vv A0J2 = C13690nt.A0S(it2).A0J("add_request");
            A0u4.add(A0J2 == null ? null : C13690nt.A0I(A0J2.A0N("code", (String) null), A0J2.A0N("expiration", (String) null)));
        }
        for (int i3 = 0; i3 < A0u.size(); i3++) {
            Object obj = A0u.get(i3);
            String str2 = (String) A0u3.get(i3);
            if (str2 != null) {
                try {
                    i2 = Integer.valueOf(str2).intValue();
                } catch (Exception unused) {
                    i2 = 499;
                }
                r11.A01.put(obj, Integer.valueOf(i2));
                if (i2 == 403 && (pair = (Pair) A0u4.get(i3)) != null) {
                    try {
                        r11.A02.put(obj, new AnonymousClass4I1((String) pair.first, Long.valueOf((String) pair.second).longValue()));
                    } catch (Exception unused2) {
                    }
                }
            } else {
                Object obj2 = A0u2.get(i3);
                if (obj2 == null) {
                    obj2 = "";
                }
                r11.A03.put(obj, obj2);
            }
        }
    }

    public static void A01(C16300so r4, C28371Vv r5, String str, Map map, Map map2) {
        int i2;
        Class<UserJid> cls = UserJid.class;
        C28371Vv A0J = r5.A0J(str);
        AnonymousClass00B.A06(A0J);
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = A0J.A0O("participant").iterator();
        while (it.hasNext()) {
            A0u.add(C13690nt.A0S(it).A0F(r4, cls, "jid"));
        }
        ArrayList A0u2 = AnonymousClass000.A0u();
        A02(A0J, "type", A0u2);
        ArrayList A0u3 = AnonymousClass000.A0u();
        A02(A0J, "error", A0u3);
        for (int i3 = 0; i3 < A0u.size(); i3++) {
            Object obj = A0u.get(i3);
            String str2 = (String) A0u3.get(i3);
            if (str2 != null) {
                try {
                    i2 = Integer.valueOf(str2);
                } catch (Exception unused) {
                    i2 = 499;
                }
                map2.put(obj, i2);
            } else {
                Object obj2 = A0u2.get(i3);
                if (obj2 == null) {
                    obj2 = "";
                }
                map.put(obj, obj2);
            }
        }
    }

    public static void A02(C28371Vv r1, String str, List list) {
        Iterator it = r1.A0O("participant").iterator();
        while (it.hasNext()) {
            list.add(C28371Vv.A05(C13690nt.A0S(it), str));
        }
    }
}

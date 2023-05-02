package X;

import android.content.Intent;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0sJ  reason: invalid class name and case insensitive filesystem */
public class C16030sJ {
    public static C15830rv A00(Jid jid) {
        return jid instanceof DeviceJid ? ((DeviceJid) jid).getUserJid() : C15830rv.A00(jid);
    }

    public static C16050sL A01(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        sb.append("g.us");
        String obj = sb.toString();
        Jid nullable = Jid.getNullable(obj);
        if (nullable instanceof C16050sL) {
            return (C16050sL) nullable;
        }
        throw new AnonymousClass1W4(obj);
    }

    public static UserJid A02(String str) {
        C34091jg r1 = C34091jg.A00;
        return ("".equals(str) || r1.getRawString().equals(str)) ? r1 : UserJid.getNullable(str);
    }

    public static String A03(Jid jid) {
        if (jid == null) {
            return null;
        }
        return jid.getRawString();
    }

    public static String A04(String str) {
        Class<Jid> cls = Jid.class;
        Jid nullable = Jid.getNullable(str);
        return (nullable == null || !cls.isAssignableFrom(nullable.getClass())) ? str : nullable.toString();
    }

    public static String A05(String[] strArr) {
        if (strArr == null) {
            return "null";
        }
        int length = strArr.length - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (true) {
            sb.append(A04(strArr[i2]));
            if (i2 == length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            i2++;
        }
    }

    public static ArrayList A06(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        A0E(collection, arrayList);
        return arrayList;
    }

    public static List A07(Intent intent, Class cls) {
        return A08(cls, intent.getStringArrayListExtra("jids"));
    }

    public static List A08(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Jid nullable = Jid.getNullable((String) it.next());
                if (cls.isInstance(nullable)) {
                    arrayList.add(cls.cast(nullable));
                }
            }
        }
        return arrayList;
    }

    public static List A09(String[] strArr) {
        Class<UserJid> cls = UserJid.class;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                Jid nullable = Jid.getNullable(str);
                if (cls.isInstance(nullable)) {
                    arrayList.add(cls.cast(nullable));
                }
            }
        }
        return arrayList;
    }

    public static Set A0A(C16300so r2, Set set) {
        HashSet hashSet = new HashSet(set.size());
        A0C(r2, set, hashSet);
        return hashSet;
    }

    public static void A0B(Intent intent, Jid jid) {
        intent.putExtra("chat_jid", A03(jid));
    }

    public static void A0C(C16300so r4, Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid == null) {
                r4.AcB("Jids/deviceJidsToUserJids/null-jid", (String) null, true);
            } else {
                collection.add(deviceJid.getUserJid());
            }
        }
    }

    public static void A0D(Class cls, Collection collection, Collection collection2) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Jid nullable = Jid.getNullable((String) it.next());
                if (cls.isInstance(nullable)) {
                    collection2.add(cls.cast(nullable));
                }
            }
        }
    }

    public static void A0E(Iterable iterable, Collection collection) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Jid jid = (Jid) it.next();
                if (jid != null) {
                    collection.add(jid.getRawString());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r2.getType();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0F(com.whatsapp.jid.Jid r2) {
        /*
            r0 = 1
            if (r2 == 0) goto L_0x001c
            int r1 = r2.getType()
            if (r1 == 0) goto L_0x0015
            if (r1 == r0) goto L_0x0015
            r0 = 18
            if (r1 == r0) goto L_0x0015
            r0 = 3
            if (r1 == r0) goto L_0x0015
            r0 = 7
            if (r1 != r0) goto L_0x001c
        L_0x0015:
            boolean r1 = A0P(r2)
            r0 = 1
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16030sJ.A0F(com.whatsapp.jid.Jid):boolean");
    }

    public static boolean A0G(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        return type == 3 || type == 6 || type == 5;
    }

    public static boolean A0H(Jid jid) {
        return jid != null && jid.getType() == 3;
    }

    public static boolean A0I(Jid jid) {
        return jid != null && "broadcast".equals(jid.getServer()) && !A0Q(jid);
    }

    public static boolean A0J(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        return type == 10 || type == 0 || type == 17 || type == 20;
    }

    public static boolean A0K(Jid jid) {
        return jid != null && jid.getType() == 9;
    }

    public static boolean A0L(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        return type == 1 || type == 2;
    }

    public static boolean A0M(Jid jid) {
        return (jid instanceof AnonymousClass1ZX) || (jid instanceof AnonymousClass1ZY);
    }

    public static boolean A0N(Jid jid) {
        return jid != null && jid.getType() == 1;
    }

    public static boolean A0O(Jid jid) {
        return jid != null && jid.getType() == 0;
    }

    public static boolean A0P(Jid jid) {
        return jid != null && jid.getType() == 7;
    }

    public static boolean A0Q(Jid jid) {
        return jid != null && jid.getType() == 5;
    }

    public static boolean A0R(Jid jid) {
        return jid != null && jid.getType() == 2;
    }

    public static boolean A0S(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (A0Q((Jid) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String[] A0T(Collection collection) {
        return (String[]) A06(collection).toArray(new String[0]);
    }
}

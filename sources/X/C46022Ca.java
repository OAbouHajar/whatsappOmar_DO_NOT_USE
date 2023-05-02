package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Ca  reason: invalid class name and case insensitive filesystem */
public class C46022Ca {
    public static final C35081lL[] A06 = new C35081lL[0];
    public final C16300so A00;
    public final C17130ua A01;
    public final AnonymousClass2CZ A02;
    public final AnonymousClass159 A03;
    public final C18290wS A04;
    public final AnonymousClass1S7 A05;

    public C46022Ca(C16300so r1, C17130ua r2, AnonymousClass2CZ r3, AnonymousClass159 r4, C18290wS r5, AnonymousClass1S7 r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r3;
    }

    public static C28371Vv A00(DeviceJid deviceJid, String str, C28371Vv... r7) {
        ArrayList arrayList = new ArrayList();
        for (C28371Vv r0 : r7) {
            if (r0 != null) {
                arrayList.add(r0);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C35081lL((Jid) deviceJid, "jid"));
        if (str != null) {
            arrayList2.add(new C35081lL("eph_setting", str));
        }
        return new C28371Vv("to", (C35081lL[]) arrayList2.toArray(A06), (C28371Vv[]) arrayList.toArray(new C28371Vv[arrayList.size()]));
    }

    public static C28371Vv A01(UserJid userJid, C51882cR r5, String str) {
        if ("url".equals(str) && r5 != null) {
            Map map = r5.A00;
            if (map.containsKey(userJid)) {
                return new C28371Vv("content_binding", (byte[]) map.get(userJid), (C35081lL[]) null);
            }
        }
        return null;
    }

    public static List A02(C51882cR r26, Integer num, String str, String str2, List list, Map map, Map map2, Map map3, int i2, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList = new ArrayList();
        String str3 = str;
        Map map4 = map;
        int i3 = i2;
        boolean z5 = z3;
        boolean z6 = z4;
        Integer num2 = num;
        String str4 = str2;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                DeviceJid deviceJid = (DeviceJid) entry.getKey();
                String str5 = (String) map4.get(DeviceJid.of(deviceJid.getUserJid()));
                C30821d1 r12 = (C30821d1) entry.getValue();
                C28371Vv[] r1 = new C28371Vv[1];
                String str6 = null;
                Integer num3 = null;
                String str7 = null;
                if (z2) {
                    str6 = str3;
                    num3 = num2;
                    str7 = str4;
                }
                r1[0] = C454228o.A01(r12, num3, str6, str7, i3, z5, z6);
                arrayList.add(A00(deviceJid, str5, r1));
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid2 = (DeviceJid) it.next();
                String str8 = (String) map4.get(DeviceJid.of(deviceJid2.getUserJid()));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C35081lL((Jid) deviceJid2, "jid"));
                if (str8 != null) {
                    arrayList2.add(new C35081lL("eph_setting", str8));
                }
                arrayList.add(new C28371Vv("to", (C35081lL[]) arrayList2.toArray(A06)));
            }
        }
        if (map3 != null) {
            for (Map.Entry entry2 : map3.entrySet()) {
                DeviceJid deviceJid3 = (DeviceJid) entry2.getKey();
                arrayList.add(A00(deviceJid3, (String) null, C454228o.A01((C30821d1) entry2.getValue(), num2, str3, str4, i3, z5, z6), A01(deviceJid3.getUserJid(), r26, str3)));
            }
        }
        return arrayList;
    }
}

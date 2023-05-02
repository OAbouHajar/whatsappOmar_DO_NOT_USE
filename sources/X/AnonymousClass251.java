package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.251  reason: invalid class name */
public class AnonymousClass251 {
    public static long A00(C28371Vv r3) {
        String A0N = r3.A0N("last", (String) null);
        if (A0N == null) {
            return System.currentTimeMillis();
        }
        if ("deny".equals(A0N) || "error".equals(A0N) || "none".equals(A0N)) {
            return 0;
        }
        return Long.parseLong(A0N) * 1000;
    }

    public static C17930vs A01(C16300so r9, C28371Vv r10) {
        AnonymousClass1C5 r7 = new AnonymousClass1C5();
        if (r10 != null) {
            for (C28371Vv r6 : r10.A0O("device")) {
                Class<DeviceJid> cls = DeviceJid.class;
                DeviceJid deviceJid = (DeviceJid) r6.A0G(r9, cls, "jid");
                r7.put(deviceJid, new AnonymousClass2TX(deviceJid, (DeviceJid) r6.A0F(r9, cls, "lid"), r6.A0D("key-index", 0)));
            }
        }
        return r7.build();
    }
}

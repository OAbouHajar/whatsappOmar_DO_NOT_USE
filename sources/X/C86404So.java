package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Map;

/* renamed from: X.4So  reason: invalid class name and case insensitive filesystem */
public class C86404So {
    public final Map A00;

    public C86404So(Map map) {
        this.A00 = map;
    }

    public synchronized int A00(DeviceJid deviceJid) {
        int A01;
        A01 = A01(deviceJid) + 1;
        this.A00.put(deviceJid.getRawString(), Integer.valueOf(A01));
        return A01;
    }

    public synchronized int A01(DeviceJid deviceJid) {
        String rawString;
        Map map;
        rawString = deviceJid.getRawString();
        map = this.A00;
        return map.containsKey(rawString) ? ((Integer) map.get(rawString)).intValue() : 0;
    }
}

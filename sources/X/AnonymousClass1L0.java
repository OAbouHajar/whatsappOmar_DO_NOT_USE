package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1L0  reason: invalid class name */
public class AnonymousClass1L0 {
    public final C208211s A00;
    public final C17640vP A01;
    public final C19810z2 A02;

    public AnonymousClass1L0(C208211s r1, C17640vP r2, C19810z2 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public Map A00(Iterable iterable) {
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            AnonymousClass1WL A0B = this.A00.A0B(C28851Ya.A02(deviceJid));
            if (A0B != null) {
                hashMap.put(deviceJid, A0B);
            }
        }
        return hashMap;
    }

    public void A01(UserJid userJid) {
        Set A0D = this.A02.A0D(userJid);
        Map A002 = A00(A0D);
        ArrayList arrayList = new ArrayList(A0D);
        arrayList.removeAll(A002.keySet());
        if (!arrayList.isEmpty()) {
            this.A01.A01(arrayList);
        }
    }
}

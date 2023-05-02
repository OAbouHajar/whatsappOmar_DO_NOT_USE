package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.21M  reason: invalid class name */
public class AnonymousClass21M {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public boolean A00(UserJid userJid, int i2, long j2) {
        long j3 = j2;
        if (j2 > 0) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            UserJid userJid2 = userJid;
            AnonymousClass21N r8 = (AnonymousClass21N) concurrentHashMap.get(userJid2);
            if (r8 == null) {
                r8 = AnonymousClass21N.A03;
            }
            int i3 = i2;
            if (i3 == 5) {
                long j4 = r8.A00;
                if (j4 > 0 && j4 <= j2) {
                    return false;
                }
                r8 = new AnonymousClass21N(j3, r8.A02, r8.A01);
            } else if (i3 == 8) {
                long j5 = r8.A01;
                if (j5 > 0 && j5 <= j2) {
                    return false;
                }
                r8 = new AnonymousClass21N(r8.A00, r8.A02, j3);
            } else if (i3 == 13) {
                long j6 = r8.A02;
                if (j6 <= 0 || j6 > j2) {
                    r8 = new AnonymousClass21N(r8.A00, j3, r8.A01);
                }
            }
            concurrentHashMap.put(userJid2, r8);
            return true;
        }
        return false;
    }
}

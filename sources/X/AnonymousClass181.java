package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.181  reason: invalid class name */
public class AnonymousClass181 {
    public final AnonymousClass182 A00;
    public final C216314v A01;
    public final C16900tq A02;

    public AnonymousClass181(AnonymousClass182 r1, C216314v r2, C16900tq r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public C16740tZ A00(UserJid userJid, C16740tZ r6, Map map, long j2) {
        C28381Vw r3 = r6.A11;
        C28381Vw r1 = new C28381Vw(userJid, r3.A01, true);
        AnonymousClass00B.A0G(r6 instanceof C16850tk);
        AnonymousClass00B.A0G(r6.A0t);
        C16740tZ A6M = ((C16850tk) r6).A6M(r1);
        A6M.A0m = null;
        A6M.A0b(r3.A00);
        map.put(DeviceJid.of(userJid), this.A00.A02(A6M, j2));
        return A6M;
    }
}

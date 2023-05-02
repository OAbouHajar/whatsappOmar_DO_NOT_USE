package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.4vS  reason: invalid class name and case insensitive filesystem */
public final class C100324vS implements AnonymousClass5RT {
    public final /* synthetic */ AnonymousClass39A A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Set A02;
    public final /* synthetic */ AnonymousClass22J A03;

    public C100324vS(AnonymousClass39A r1, UserJid userJid, Set set, AnonymousClass22J r4) {
        this.A00 = r1;
        this.A02 = set;
        this.A01 = userJid;
        this.A03 = r4;
    }

    public void AR4(C86124Rh r3, int i2) {
        this.A03.AIU(i2 == -1 ? new C73043nD() : new C73053nE());
    }

    public void AR5(C86124Rh r7, AnonymousClass4Q6 r8) {
        AnonymousClass39A r5 = this.A00;
        Set set = this.A02;
        UserJid userJid = this.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            linkedHashMap.put(A0m, r5.A03.A01(userJid, A0m));
        }
        this.A03.AIU(new C73073nG(linkedHashMap, false));
    }
}

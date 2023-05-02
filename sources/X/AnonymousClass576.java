package X;

import com.whatsapp.jid.UserJid;
import java.util.Comparator;
import java.util.Set;

/* renamed from: X.576  reason: invalid class name */
public class AnonymousClass576 implements Comparator {
    public Set A00;
    public final AnonymousClass2BZ A01;
    public final /* synthetic */ C55502ji A02;

    public AnonymousClass576(C16040sK r3, C16080sP r4, C55502ji r5) {
        this.A02 = r5;
        this.A01 = new AnonymousClass2BZ(r3, r4, true);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C16010sH r4 = (C16010sH) obj;
        C16010sH r5 = (C16010sH) obj2;
        Set set = this.A00;
        AnonymousClass00B.A06(set);
        Class<UserJid> cls = UserJid.class;
        if (!set.contains(r4.A08(cls)) || !this.A00.contains(r5.A08(cls))) {
            if (this.A00.contains(r4.A08(cls))) {
                return -1;
            }
            if (this.A00.contains(r5.A08(cls))) {
                return 1;
            }
        }
        return this.A01.compare(r4, r5);
    }
}

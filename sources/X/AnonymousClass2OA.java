package X;

import com.whatsapp.jid.UserJid;
import java.util.HashSet;

/* renamed from: X.2OA  reason: invalid class name */
public class AnonymousClass2OA extends AnonymousClass2BZ {
    public final /* synthetic */ AnonymousClass2O9 A00;
    public final /* synthetic */ HashSet A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2OA(C16040sK r2, C16080sP r3, AnonymousClass2O9 r4, HashSet hashSet) {
        super(r2, r3, false);
        this.A00 = r4;
        this.A01 = hashSet;
    }

    public int A00(C16010sH r5, C16010sH r6) {
        C16040sK r1 = this.A00.A00;
        if (!r1.A0I(r5.A0E) && !r1.A0I(r6.A0E)) {
            HashSet hashSet = this.A01;
            Class<UserJid> cls = UserJid.class;
            boolean contains = hashSet.contains(r5.A08(cls));
            boolean contains2 = hashSet.contains(r6.A08(cls));
            if (contains) {
                if (!contains2) {
                    return -1;
                }
            } else if (contains2) {
                return 1;
            }
        }
        return super.compare(r5, r6);
    }
}

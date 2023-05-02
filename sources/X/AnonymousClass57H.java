package X;

import com.whatsapp.jid.GroupJid;
import java.util.Comparator;

/* renamed from: X.57H  reason: invalid class name */
public class AnonymousClass57H implements Comparator {
    public final AnonymousClass57A A00;

    public AnonymousClass57H(C15810rt r2) {
        this.A00 = new AnonymousClass57A(r2);
    }

    public static final C39461sW A00(C15840rx r6) {
        if (r6 == null || GroupJid.of(r6.A05()) == null || r6.A06() == null) {
            return null;
        }
        return new C39461sW(GroupJid.of(r6.A05()), r6.A06(), r6.A01, 0);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C39461sW A002 = A00((C15840rx) obj);
        C39461sW A003 = A00((C15840rx) obj2);
        if (A002 == null) {
            return A003 == null ? 0 : -1;
        }
        if (A003 == null) {
            return 1;
        }
        return this.A00.compare(A002, A003);
    }
}

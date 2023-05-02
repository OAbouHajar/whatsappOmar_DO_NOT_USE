package X;

import com.whatsapp.jid.Jid;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.577  reason: invalid class name */
public class AnonymousClass577 implements Comparator {
    public final C16080sP A00;
    public final C15810rt A01;
    public final Collator A02;

    public AnonymousClass577(C16080sP r3, AnonymousClass013 r4, C15810rt r5) {
        this.A01 = r5;
        this.A00 = r3;
        Collator instance = Collator.getInstance(C13690nt.A0m(r4));
        this.A02 = instance;
        instance.setDecomposition(1);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C16010sH r8 = (C16010sH) obj;
        C16010sH r9 = (C16010sH) obj2;
        Class<C15830rv> cls = C15830rv.class;
        Jid A08 = r8.A08(cls);
        AnonymousClass00B.A06(A08);
        C15830rv r3 = (C15830rv) A08;
        Jid A082 = r9.A08(cls);
        AnonymousClass00B.A06(A082);
        C15830rv r2 = (C15830rv) A082;
        C15810rt r1 = this.A01;
        long A05 = r1.A0F(r3) ? r1.A05(r3) : 0;
        long A052 = r1.A0F(r2) ? r1.A05(r2) : 0;
        if (A05 == 0 && A052 == 0) {
            Collator collator = this.A02;
            C16080sP r0 = this.A00;
            return collator.compare(r0.A08(r8), r0.A08(r9));
        } else if (A05 == 0) {
            return 1;
        } else {
            if (A052 == 0) {
                return -1;
            }
            if (A05 != A052) {
                return A05 < A052 ? 1 : -1;
            }
            C16080sP r02 = this.A00;
            return r02.A08(r8).compareTo(r02.A08(r9));
        }
    }
}

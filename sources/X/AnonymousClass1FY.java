package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1FY  reason: invalid class name */
public final class AnonymousClass1FY implements C19400yN {
    public final C19410yO A00;
    public final C19020xd A01;

    public AnonymousClass1FY(C19410yO r2, C19020xd r3) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public String AGT() {
        return "LidCompanionFixer";
    }

    public void AMc() {
        List<AnonymousClass1WN> A06 = this.A00.A06();
        ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(A06, 10));
        for (AnonymousClass1WN r0 : A06) {
            arrayList.add(r0.A06);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (C16030sJ.A0M((Jid) next)) {
                arrayList2.add(next);
            }
        }
        Set A0F = C003101j.A0F(arrayList2);
        if (!A0F.isEmpty()) {
            this.A01.A04(C17380uz.copyOf((Collection) A0F));
        }
    }
}

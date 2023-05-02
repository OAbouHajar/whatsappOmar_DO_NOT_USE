package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1sX  reason: invalid class name and case insensitive filesystem */
public abstract class C39471sX extends C39291sE {
    public final List A00 = new ArrayList();

    public C39471sX(C28381Vw r8, int i2, long j2) {
        super(r8, (C30641ci) null, i2, j2);
    }

    public C39471sX(C28381Vw r2, C30641ci r3, int i2, long j2) {
        super(r2, r3, i2, j2);
    }

    public C39471sX(C30361cE r2, C30641ci r3, int i2, long j2) {
        super(r2, r3, i2, j2);
    }

    public GroupJid A14(int i2) {
        for (C39481sY r1 : this.A00) {
            if (r1.A00 == i2) {
                return r1.A01;
            }
        }
        return null;
    }

    public String A15(int i2) {
        for (C39481sY r1 : this.A00) {
            if (r1.A00 == i2) {
                return r1.A02;
            }
        }
        return null;
    }

    public List A16(int i2) {
        ArrayList arrayList = new ArrayList();
        for (C39481sY r1 : this.A00) {
            if (r1.A00 == i2) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public void A17(List list) {
        List list2 = this.A00;
        list2.clear();
        list2.addAll(list);
    }
}

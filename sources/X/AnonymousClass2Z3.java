package X;

import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Z3  reason: invalid class name */
public final class AnonymousClass2Z3 {
    public final C16070sO A00;
    public final C18600wx A01;
    public final C16490t9 A02;
    public final C18040w3 A03;

    public AnonymousClass2Z3(C16070sO r2, C18600wx r3, C16490t9 r4, C18040w3 r5) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r5, 2);
        C18450wi.A0H(r2, 3);
        C18450wi.A0H(r3, 4);
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(int i2, int i3) {
        C74643qs r1 = new C74643qs();
        r1.A01 = Integer.valueOf(i2);
        r1.A00 = Integer.valueOf(i3);
        this.A02.A06(r1);
    }

    public final void A01(List list, int i2, int i3, int i4, int i5, int i6) {
        C75523sI r2 = new C75523sI();
        int i7 = 1;
        if (i6 == 1) {
            i7 = 0;
        } else if (i6 != 6) {
            i7 = 2;
        }
        r2.A00 = Integer.valueOf(i7);
        r2.A01 = Integer.valueOf(i2);
        r2.A03 = Long.valueOf(i3 == -1 ? 0 : (long) i3);
        if (list != null) {
            r2.A02 = Long.valueOf((long) list.size());
            int i8 = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C16030sJ.A0N((Jid) it.next())) {
                    i8++;
                }
            }
            r2.A04 = Long.valueOf((long) i8);
            r2.A06 = Long.valueOf((long) i5);
            r2.A05 = Long.valueOf((long) i4);
        }
        this.A02.A06(r2);
    }
}

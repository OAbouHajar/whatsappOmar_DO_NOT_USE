package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.10I  reason: invalid class name */
public final class AnonymousClass10I extends AnonymousClass10E {
    public final C14870pt A00;
    public final C18930xU A01;
    public final AnonymousClass013 A02;
    public final AnonymousClass10G A03;
    public final C16320sq A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass10I(C14870pt r2, C18930xU r3, AnonymousClass013 r4, AnonymousClass10G r5, C14710pd r6, C16320sq r7) {
        super(r6);
        C18450wi.A0H(r6, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r7, 3);
        C18450wi.A0H(r3, 4);
        C18450wi.A0H(r4, 5);
        C18450wi.A0H(r5, 6);
        this.A00 = r2;
        this.A04 = r7;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public boolean A01(Map map) {
        C18450wi.A0H(map, 0);
        Collection values = map.values();
        C18450wi.A0H(values, 0);
        if (!values.isEmpty()) {
            Iterator it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C16740tZ) it.next()).A0x) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return !A02(map.values());
    }
}

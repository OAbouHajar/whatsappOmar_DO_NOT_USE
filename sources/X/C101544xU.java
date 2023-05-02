package X;

import java.util.Map;

/* renamed from: X.4xU  reason: invalid class name and case insensitive filesystem */
public abstract class C101544xU implements AnonymousClass5PO {
    public final AnonymousClass5PO[] A00;

    public C101544xU(AnonymousClass5PO... r1) {
        this.A00 = r1;
    }

    public boolean A8o(Map map, int i2) {
        C18450wi.A0H(map, 1);
        AnonymousClass5PO[] r4 = this.A00;
        int length = r4.length;
        int i3 = 0;
        while (i3 < length) {
            AnonymousClass5PO r0 = r4[i3];
            i3++;
            if (r0.A8o(map, i2)) {
                return true;
            }
        }
        return false;
    }
}

package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.10D  reason: invalid class name */
public final class AnonymousClass10D extends AnonymousClass10E {
    public final C16760tb A00;
    public final C18930xU A01;
    public final AnonymousClass10C A02;
    public final AnonymousClass10B A03;
    public final C18030w2 A04;
    public final C16490t9 A05;
    public final C16320sq A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass10D(C16760tb r2, C18930xU r3, AnonymousClass10C r4, AnonymousClass10B r5, C18030w2 r6, C14710pd r7, C16490t9 r8, C16320sq r9) {
        super(r7);
        C18450wi.A0H(r7, 1);
        C18450wi.A0H(r9, 2);
        C18450wi.A0H(r8, 3);
        C18450wi.A0H(r3, 4);
        C18450wi.A0H(r2, 5);
        C18450wi.A0H(r6, 6);
        C18450wi.A0H(r5, 7);
        C18450wi.A0H(r4, 8);
        this.A06 = r9;
        this.A05 = r8;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
    }

    public boolean A01(Map map) {
        C18450wi.A0H(map, 0);
        if (map.size() == 1) {
            C16740tZ r2 = (C16740tZ) C810246n.A00(map);
            AnonymousClass10B r1 = this.A03;
            if (r1.A02(r2) || r1.A03(r2)) {
                return false;
            }
        }
        Collection<C16740tZ> values = map.values();
        C18450wi.A0H(values, 0);
        if (values.isEmpty()) {
            return false;
        }
        for (C16740tZ r0 : values) {
            if (!r0.A0x) {
                return !A02(map.values());
            }
        }
        return false;
    }
}

package X;

import java.util.List;

/* renamed from: X.1TR  reason: invalid class name */
public class AnonymousClass1TR {
    public final AnonymousClass17O A00;
    public final C18300wT A01;
    public final C18310wU A02;
    public final C18290wS A03;
    public final C16320sq A04;

    public AnonymousClass1TR(AnonymousClass17O r1, C18300wT r2, C18310wU r3, C18290wS r4, C16320sq r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        r1.A0C();
    }

    public C49402Ta A00() {
        C35441lw r0;
        C18290wS r02 = this.A03;
        r02.A06();
        List A09 = r02.A09.A09();
        if (A09.isEmpty() || (r0 = (C35441lw) A09.get(0)) == null) {
            return null;
        }
        return new C49402Ta(r0);
    }
}

package X;

import java.util.Collection;
import java.util.EnumSet;

/* renamed from: X.4RU  reason: invalid class name */
public class AnonymousClass4RU {
    public C109755Tl A00;
    public C88534af A01;
    public Collection A02 = AnonymousClass000.A0u();
    public EnumSet A03 = EnumSet.noneOf(AnonymousClass420.class);

    public AnonymousClass4RV A00() {
        C88534af r3;
        C109755Tl r4 = this.A00;
        if (r4 == null || (r3 = this.A01) == null) {
            AnonymousClass4ZO r0 = AnonymousClass4ZO.A01;
            if (r4 == null) {
                r4 = new C99724uU();
                this.A00 = r4;
            }
            r3 = this.A01;
            if (r3 == null) {
                r3 = r0.A00;
                this.A01 = r3;
            }
        }
        return new AnonymousClass4RV(r4, r3, this.A02, this.A03);
    }
}

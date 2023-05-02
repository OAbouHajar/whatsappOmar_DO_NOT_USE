package X;

/* renamed from: X.10C  reason: invalid class name */
public class AnonymousClass10C {
    public final C31081dR A00;

    public AnonymousClass10C(C16440t3 r8, C16490t9 r9, AnonymousClass17S r10, C19500yX r11) {
        C31081dR r0 = new C31081dR(r8, r9, r10, r11, "StarMessagePerfTracker", 703933362);
        this.A00 = r0;
        r0.A06.A03 = true;
    }

    public void A00(int i2, int i3) {
        C31081dR r3 = this.A00;
        r3.A0D("StarMessagePerfTracker", -1);
        r3.A0A("origin", String.valueOf(i2), true);
        r3.A0A("num_messages", String.valueOf(i3), true);
    }
}

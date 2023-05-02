package X;

import java.nio.ByteBuffer;

/* renamed from: X.5wU  reason: invalid class name */
public class AnonymousClass5wU {
    public static final int[] A0A = {2, 3, 4, 6, 8};
    public ByteBuffer A00;
    public final C115975qc A01;
    public final C117205sc A02 = new C117205sc();
    public final AnonymousClass4V6 A03;
    public final AnonymousClass4KL A04 = new AnonymousClass4KL();
    public final AnonymousClass5PC A05;
    public final Object A06 = C13690nt.A0Y();
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;

    public AnonymousClass5wU(C115985qd r5) {
        AnonymousClass602 r3 = new AnonymousClass602(this);
        this.A05 = r3;
        this.A01 = new C115975qc(this);
        this.A03 = new AnonymousClass4V6(new AnonymousClass601(r5), r3, 3);
    }

    public void A00() {
        if (this.A08) {
            this.A08 = false;
            this.A03.A00();
        }
    }
}

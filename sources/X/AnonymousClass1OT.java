package X;

/* renamed from: X.1OT  reason: invalid class name */
public final class AnonymousClass1OT implements C23541Cj {
    public final C14710pd A00;
    public final C16490t9 A01;

    public AnonymousClass1OT(C14710pd r2, C16490t9 r3) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public void APJ() {
        C16490t9 r3 = this.A01;
        int A03 = this.A00.A03(C16620tM.A02, 305);
        synchronized (r3) {
            r3.A0N = A03;
        }
        r3.A04(new C74243qA());
        if (r3.A0Q) {
            C74963rO r2 = new C74963rO();
            r2.A00 = Boolean.TRUE;
            r2.A02 = "HelloPhase3";
            r2.A01 = 144L;
            r3.A04(r2);
            C74513qf r22 = new C74513qf();
            r22.A00 = 148L;
            r3.A04(r22);
        }
    }

    public /* synthetic */ void APK() {
    }
}

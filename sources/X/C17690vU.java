package X;

/* renamed from: X.0vU  reason: invalid class name and case insensitive filesystem */
public class C17690vU {
    public final C17130ua A00;
    public final C14710pd A01;
    public final C17680vT A02;
    public final C17670vS A03;
    public final C17660vR A04;

    public C17690vU(C17130ua r1, C14710pd r2, C17680vT r3, C17670vS r4, C17660vR r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public C29551ao A00(C29541an r11, String str, int i2) {
        C14710pd r1 = this.A01;
        C16620tM r2 = C16620tM.A02;
        boolean A0E = r1.A0E(r2, 1638);
        C17670vS r3 = this.A03;
        String A002 = this.A04.A00();
        C17680vT r12 = this.A02;
        return new C29551ao(this.A00, r11, r3, str, A002, i2, r12.A01(), !r12.A01() ? false : r12.A03.A0E(r2, 58), A0E);
    }
}

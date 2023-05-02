package X;

/* renamed from: X.1DE  reason: invalid class name */
public class AnonymousClass1DE implements AnonymousClass1D6 {
    public final C19760yx A00;
    public final C15960sC A01;

    public AnonymousClass1DE(C19760yx r1, C15960sC r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void AMX() {
        int A002 = this.A01.A00();
        if (!(A002 == 1 || A002 == 4 || A002 == 5 || A002 == 7 || A002 == 8 || A002 == 9)) {
            switch (A002) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    return;
            }
        }
        this.A00.A0A(0);
    }
}

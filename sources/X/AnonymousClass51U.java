package X;

/* renamed from: X.51U  reason: invalid class name */
public class AnonymousClass51U implements C31031dM {
    public final /* synthetic */ AnonymousClass39M A00;
    public final /* synthetic */ C15830rv A01;
    public final /* synthetic */ C16740tZ A02;

    public AnonymousClass51U(AnonymousClass39M r1, C15830rv r2, C16740tZ r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A8B(C30191bu r5) {
        String str;
        int A002 = this.A00.A05.A00(this.A01, this.A02.A14);
        if (A002 < 100) {
            int i2 = A002 / 25;
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(i2 * 25);
            A0o.append("-");
            str = AnonymousClass000.A0l(A0o, ((i2 + 1) * 25) - 1);
        } else {
            str = A002 < 1000 ? "100-999" : A002 < 10000 ? "1000-9999" : "10000+";
        }
        r5.A00(str.length(), "offset_from_end_of_chat", str);
    }

    public String ADD() {
        return "offset_from_end_of_chat";
    }
}

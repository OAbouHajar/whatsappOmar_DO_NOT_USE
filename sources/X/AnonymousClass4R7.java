package X;

/* renamed from: X.4R7  reason: invalid class name */
public class AnonymousClass4R7 {
    public final AnonymousClass41W A00;
    public final Integer A01;
    public final Integer A02;

    public AnonymousClass4R7(AnonymousClass41W r1, Integer num, Integer num2) {
        this.A01 = num;
        this.A02 = num2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        Integer num = this.A01;
        String str = "";
        A0r.append(num == null ? str : num.toString());
        A0r.append(":");
        Integer num2 = this.A02;
        if (num2 != null) {
            str = num2.toString();
        }
        A0r.append(str);
        return AnonymousClass000.A0h("]", A0r);
    }
}

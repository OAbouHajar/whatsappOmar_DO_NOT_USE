package X;

/* renamed from: X.4Rp  reason: invalid class name */
public final class AnonymousClass4Rp {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass4Rp(String str, String str2, String str3, String str4) {
        AnonymousClass00B.A06(str);
        this.A01 = str;
        this.A04 = str2;
        AnonymousClass00B.A06(str3);
        this.A00 = str3;
        AnonymousClass00B.A06(str4);
        this.A03 = str4;
        StringBuilder A0o = AnonymousClass000.A0o();
        for (int i2 = 0; i2 < str4.length(); i2++) {
            A0o.appendCodePoint((str4.charAt(i2) + 61926) - 65);
        }
        this.A02 = A0o.toString();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A01);
        A0o.append(" ");
        A0o.append(this.A00);
        A0o.append(" ");
        A0o.append(this.A04);
        A0o.append(" ");
        return AnonymousClass000.A0h(this.A02, A0o);
    }
}

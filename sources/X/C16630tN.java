package X;

/* renamed from: X.0tN  reason: invalid class name and case insensitive filesystem */
public final class C16630tN extends C16470t7 {
    public String A00;
    public String A01;

    public C16630tN() {
        super(3146, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAcsSigningCredential {");
        C16470t7.appendFieldToStringBuilder(sb, "acsCredential", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "acsPublicKey", this.A01);
        sb.append("}");
        return sb.toString();
    }
}

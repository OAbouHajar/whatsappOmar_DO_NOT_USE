package X;

/* renamed from: X.2bG  reason: invalid class name and case insensitive filesystem */
public final class C51252bG {
    public int A00 = -1;
    public C51232bE A01;
    public C801742v A02;
    public C90474eC A03;
    public AnonymousClass4R5 A04;

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.A02);
        sb.append("\n ecLevel: ");
        sb.append(this.A01);
        sb.append("\n version: ");
        sb.append(this.A03);
        sb.append("\n maskPattern: ");
        sb.append(this.A00);
        AnonymousClass4R5 r1 = this.A04;
        if (r1 == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(r1);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}

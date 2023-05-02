package X;

/* renamed from: X.1yo  reason: invalid class name and case insensitive filesystem */
public final class C42871yo {
    public static final C42871yo A05 = new C42871yo(false, false, false, false, false);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C42871yo(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A04 = z2;
        this.A00 = z3;
        this.A01 = z4;
        this.A02 = z5;
        this.A03 = z6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WriteResult{wasSuccess=");
        sb.append(this.A04);
        sb.append(", chatAdded=");
        sb.append(this.A00);
        sb.append(", chatUnarchived=");
        sb.append(this.A01);
        sb.append(", isDuplicate=");
        sb.append(this.A02);
        sb.append(", isExpired=");
        sb.append(this.A03);
        sb.append('}');
        return sb.toString();
    }
}

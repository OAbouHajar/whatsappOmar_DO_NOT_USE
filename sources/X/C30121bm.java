package X;

/* renamed from: X.1bm  reason: invalid class name and case insensitive filesystem */
public final class C30121bm extends C16470t7 {
    public Boolean A00;
    public Long A01;

    public C30121bm() {
        super(3938, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamFtsRestore {");
        C16470t7.appendFieldToStringBuilder(sb, "restoreFtsSuccess", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "restoreFtsTimeSec", this.A01);
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.2kq  reason: invalid class name and case insensitive filesystem */
public final class C56032kq extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public C56032kq() {
        super(3952, new AnonymousClass00F(1, 100, 5000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A00);
        r3.AdT(4, this.A02);
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamSearchLatency {");
        C16470t7.appendFieldToStringBuilder(sb, "isStarred", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "page", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "searchDuration", this.A03);
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "searchType", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}

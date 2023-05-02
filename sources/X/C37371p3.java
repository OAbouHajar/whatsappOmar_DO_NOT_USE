package X;

/* renamed from: X.1p3  reason: invalid class name and case insensitive filesystem */
public final class C37371p3 extends C16470t7 {
    public Integer A00;

    public C37371p3() {
        super(3016, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdSyncdDogfoodingFeatureUsage {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mdSyncdDogfoodingFeature", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}

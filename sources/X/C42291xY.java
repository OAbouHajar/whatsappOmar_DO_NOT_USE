package X;

import com.mod2.fblibs.FacebookFacade;

/* renamed from: X.1xY  reason: invalid class name and case insensitive filesystem */
public final class C42291xY extends C16470t7 {
    public Long A00;
    public Long A01;
    public String A02;

    public C42291xY() {
        super(3316, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamBadInteraction {");
        C16470t7.appendFieldToStringBuilder(sb, "actual", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, FacebookFacade.RequestParameter.NAME, this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "threshold", this.A01);
        sb.append("}");
        return sb.toString();
    }
}

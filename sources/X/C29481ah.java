package X;

import com.mod.bomfab.bomb.BuildConfig;
import com.mod2.fblibs.FacebookFacade;

/* renamed from: X.1ah  reason: invalid class name and case insensitive filesystem */
public final class C29481ah extends C16470t7 {
    public String A00;
    public String A01;
    public String A02;

    public C29481ah() {
        super(1684, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(1, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamCriticalEvent {");
        C16470t7.appendFieldToStringBuilder(sb, "context", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, BuildConfig.BUILD_TYPE, this.A01);
        C16470t7.appendFieldToStringBuilder(sb, FacebookFacade.RequestParameter.NAME, this.A02);
        sb.append("}");
        return sb.toString();
    }
}

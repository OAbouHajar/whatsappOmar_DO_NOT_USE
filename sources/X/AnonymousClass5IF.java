package X;

/* renamed from: X.5IF  reason: invalid class name */
public class AnonymousClass5IF extends C32061fa {
    public C32411gJ A00;
    public AnonymousClass5IN A01;
    public C107645Iz A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public AnonymousClass5IF(C32411gJ r5) {
        this.A00 = r5;
        for (int i2 = 0; i2 != r5.A0A(); i2++) {
            C107525In A012 = C107525In.A01(r5.A0C(i2));
            int i3 = A012.A00;
            if (i3 == 0) {
                C107525In A013 = C107525In.A01(C107525In.A00(A012));
                this.A01 = A013 != null ? new AnonymousClass5IN(A013) : null;
            } else if (i3 == 1) {
                this.A06 = AnonymousClass000.A1O(C33051hr.A01(A012).A00);
            } else if (i3 == 2) {
                this.A05 = AnonymousClass000.A1O(C33051hr.A01(A012).A00);
            } else if (i3 == 3) {
                this.A02 = new C107645Iz(AnonymousClass5HY.A01(A012));
            } else if (i3 == 4) {
                this.A03 = AnonymousClass000.A1O(C33051hr.A01(A012).A00);
            } else if (i3 == 5) {
                this.A04 = AnonymousClass000.A1O(C33051hr.A01(A012).A00);
            } else {
                throw AnonymousClass000.A0T("unknown tag in IssuingDistributionPoint");
            }
        }
    }

    public static AnonymousClass5IF A00(Object obj) {
        if (obj instanceof AnonymousClass5IF) {
            return (AnonymousClass5IF) obj;
        }
        if (obj != null) {
            return new AnonymousClass5IF(C32411gJ.A00(obj));
        }
        return null;
    }

    public C32051fZ Agm() {
        return this.A00;
    }

    public String toString() {
        String str = C32941ha.A00;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(str);
        AnonymousClass5IN r0 = this.A01;
        if (r0 != null) {
            AnonymousClass3K2.A1R("distributionPoint", str, r0.toString(), stringBuffer);
        }
        if (this.A06) {
            AnonymousClass3K2.A1R("onlyContainsUserCerts", str, "true", stringBuffer);
        }
        if (this.A05) {
            AnonymousClass3K2.A1R("onlyContainsCACerts", str, "true", stringBuffer);
        }
        C107645Iz r02 = this.A02;
        if (r02 != null) {
            AnonymousClass3K2.A1R("onlySomeReasons", str, r02.toString(), stringBuffer);
        }
        if (this.A04) {
            AnonymousClass3K2.A1R("onlyContainsAttributeCerts", str, "true", stringBuffer);
        }
        if (this.A03) {
            AnonymousClass3K2.A1R("indirectCRL", str, "true", stringBuffer);
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}

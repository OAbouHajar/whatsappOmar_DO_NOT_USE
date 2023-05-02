package X;

/* renamed from: X.5IE  reason: invalid class name */
public class AnonymousClass5IE extends C32061fa {
    public AnonymousClass5IN A00;
    public AnonymousClass5IG A01;
    public C107645Iz A02;

    public AnonymousClass5IE(C32411gJ r6) {
        for (int i2 = 0; i2 != r6.A0A(); i2++) {
            C107525In A012 = C107525In.A01(r6.A0C(i2));
            int i3 = A012.A00;
            if (i3 == 0) {
                C107525In A013 = C107525In.A01(C107525In.A00(A012));
                this.A00 = A013 != null ? new AnonymousClass5IN(A013) : null;
            } else if (i3 == 1) {
                this.A02 = new C107645Iz(AnonymousClass5HY.A01(A012));
            } else if (i3 == 2) {
                this.A01 = new AnonymousClass5IG(C32411gJ.A01(A012, false));
            } else {
                throw AnonymousClass000.A0T(AnonymousClass000.A0l(AnonymousClass000.A0r("Unknown tag encountered in structure: "), A012.A00));
            }
        }
    }

    public AnonymousClass5IE(AnonymousClass5IN r2) {
        this.A00 = r2;
        this.A02 = null;
        this.A01 = null;
    }

    public C32051fZ Agm() {
        C32391gH r3 = new C32391gH(3);
        AnonymousClass5IN r1 = this.A00;
        if (r1 != null) {
            r3.A02(new C107625Ix(r1));
        }
        C107645Iz r12 = this.A02;
        if (r12 != null) {
            C107525In.A03(r12, r3, 1, false);
        }
        AnonymousClass5IG r13 = this.A01;
        if (r13 != null) {
            C107525In.A03(r13, r3, 2, false);
        }
        return new C32401gI(r3);
    }

    public String toString() {
        String str = C32941ha.A00;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(str);
        AnonymousClass5IN r0 = this.A00;
        if (r0 != null) {
            AnonymousClass3K2.A1R("distributionPoint", str, r0.toString(), stringBuffer);
        }
        C107645Iz r02 = this.A02;
        if (r02 != null) {
            AnonymousClass3K2.A1R("reasons", str, r02.toString(), stringBuffer);
        }
        AnonymousClass5IG r03 = this.A01;
        if (r03 != null) {
            AnonymousClass3K2.A1R("cRLIssuer", str, r03.toString(), stringBuffer);
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}

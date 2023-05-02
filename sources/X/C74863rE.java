package X;

/* renamed from: X.3rE  reason: invalid class name and case insensitive filesystem */
public final class C74863rE extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;

    public C74863rE() {
        super(3102, C16470t7.DEFAULT_SAMPLING_RATE, 2, 113760892);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCtwaLoggingRefactorV2CustomerPerformance {");
        C16470t7.appendFieldToStringBuilder(A0r, "v1AndV2Match", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "v1DataAvailable", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "v2DataAvailable", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}

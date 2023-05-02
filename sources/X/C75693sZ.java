package X;

/* renamed from: X.3sZ  reason: invalid class name and case insensitive filesystem */
public final class C75693sZ extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C75693sZ() {
        super(2300, new AnonymousClass00F(1, 20, 1000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(11, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(12, this.A02);
        r3.AdT(9, this.A03);
        r3.AdT(1, this.A04);
        r3.AdT(7, this.A05);
        r3.AdT(8, this.A06);
        r3.AdT(5, this.A07);
        r3.AdT(10, this.A08);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMdAppStateSyncDaily {");
        C16470t7.appendFieldToStringBuilder(A0r, "crossIndexConflictCount", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "invalidActionCount", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "keyRotationRemoveCount", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "missingKeyCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "mutationCount", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "storedMutationCount", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "unsetActionCount", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "unsupportedActionCount", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "uploadConflictCount", this.A08);
        return AnonymousClass000.A0h("}", A0r);
    }
}

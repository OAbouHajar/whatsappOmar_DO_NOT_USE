package X;

/* renamed from: X.3rI  reason: invalid class name and case insensitive filesystem */
public final class C74903rI extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Long A02;

    public C74903rI() {
        super(978, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamLowFreeInternalStorageSpaceEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "freeSpaceRequired", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "skipAllowed", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "userAction", C13690nt.A0d(this.A01));
        return AnonymousClass000.A0h("}", A0r);
    }
}

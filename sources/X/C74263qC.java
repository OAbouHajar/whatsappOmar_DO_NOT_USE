package X;

/* renamed from: X.3qC  reason: invalid class name and case insensitive filesystem */
public final class C74263qC extends C16470t7 {
    public Long A00;

    public C74263qC() {
        super(1888, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAndroidReverseImageSearchCompleteEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "responseT", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}

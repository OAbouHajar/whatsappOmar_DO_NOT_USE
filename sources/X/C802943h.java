package X;

/* renamed from: X.43h  reason: invalid class name and case insensitive filesystem */
public final class C802943h extends Exception {
    public final int errorCode;
    public final C32491gT format;
    public final boolean isRecoverable;

    public C802943h(C32491gT r2, int i2, boolean z2) {
        super(C13680ns.A0c(i2, "AudioTrack write failed: "));
        this.isRecoverable = z2;
        this.errorCode = i2;
        this.format = r2;
    }
}

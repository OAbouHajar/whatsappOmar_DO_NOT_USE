package X;

/* renamed from: X.43W  reason: invalid class name */
public final class AnonymousClass43W extends Exception {
    public final int timeoutOperation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43W(int i2) {
        super(i2 != 1 ? i2 != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
        this.timeoutOperation = i2;
    }
}

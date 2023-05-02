package X;

/* renamed from: X.1xy  reason: invalid class name and case insensitive filesystem */
public abstract class C42541xy extends C16690tT {
    public final Runnable A00;

    public C42541xy(Runnable runnable) {
        this.A00 = runnable;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Runnable runnable;
        if (((Boolean) obj).booleanValue() && (runnable = this.A00) != null) {
            runnable.run();
        }
    }
}

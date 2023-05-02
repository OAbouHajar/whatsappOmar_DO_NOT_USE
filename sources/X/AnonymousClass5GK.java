package X;

/* renamed from: X.5GK  reason: invalid class name */
public final class AnonymousClass5GK extends C11340ia {
    public static final AnonymousClass5GK A00 = new AnonymousClass5GK();

    public C11340ia A02(int i2) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    public boolean A03(AnonymousClass1UM r2) {
        return false;
    }

    public void A05(Runnable runnable, AnonymousClass1UM r4) {
        if (r4.get(C106155Cs.A00) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}

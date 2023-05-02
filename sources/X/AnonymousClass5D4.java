package X;

/* renamed from: X.5D4  reason: invalid class name */
public abstract class AnonymousClass5D4 extends AnonymousClass1UF {
    public AnonymousClass5D4(AnonymousClass1UG r3) {
        super(r3);
        if (r3.AAx() != C1052258r.A00) {
            throw AnonymousClass000.A0T("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    public AnonymousClass1UM AAx() {
        return C1052258r.A00;
    }
}

package X;

/* renamed from: X.0gX  reason: invalid class name and case insensitive filesystem */
public final class C10070gX implements Runnable {
    public final C08990ej A00;
    public final C29981bY A01;

    public C10070gX(C08990ej r1, C29981bY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void run() {
        C08990ej r2 = this.A00;
        if (r2.value == this) {
            if (C08990ej.A00.A04(r2, this, C08990ej.A01(this.A01))) {
                C08990ej.A04(r2);
            }
        }
    }
}

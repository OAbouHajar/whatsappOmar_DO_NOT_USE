package X;

import java.util.concurrent.ExecutionException;

/* renamed from: X.0gw  reason: invalid class name and case insensitive filesystem */
public class C10320gw implements Runnable {
    public C12580kd A00;
    public C29981bY A01;
    public final AnonymousClass0R5 A02;

    public C10320gw(C12580kd r1, AnonymousClass0R5 r2, C29981bY r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public void run() {
        boolean z2;
        try {
            z2 = AnonymousClass000.A1X(this.A01.get());
        } catch (InterruptedException | ExecutionException unused) {
            z2 = true;
        }
        this.A00.AQm(this.A02, z2);
    }
}

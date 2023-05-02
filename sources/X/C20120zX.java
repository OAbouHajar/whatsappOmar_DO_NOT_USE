package X;

import android.content.Context;

/* renamed from: X.0zX  reason: invalid class name and case insensitive filesystem */
public class C20120zX {
    public AnonymousClass1GH A00;
    public final Context A01;
    public final AnonymousClass01J A02;

    public C20120zX(Context context, AnonymousClass01J r2) {
        this.A01 = context;
        this.A02 = r2;
    }

    public C16800tf A00() {
        AnonymousClass1GH r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                r0 = (AnonymousClass1GH) this.A02.get();
                this.A00 = r0;
            }
        }
        return r0.get();
    }
}

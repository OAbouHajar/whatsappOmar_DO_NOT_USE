package X;

import android.content.Context;

/* renamed from: X.1NS  reason: invalid class name */
public class AnonymousClass1NS {
    public AnonymousClass1NV A00;
    public final Context A01;
    public final AnonymousClass01J A02;

    public AnonymousClass1NS(Context context, AnonymousClass01J r2) {
        this.A01 = context;
        this.A02 = r2;
    }

    public C16800tf A00() {
        AnonymousClass1NV r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                r0 = (AnonymousClass1NV) this.A02.get();
                this.A00 = r0;
            }
        }
        return r0.get();
    }

    public C16800tf A01() {
        AnonymousClass1NV r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                r0 = (AnonymousClass1NV) this.A02.get();
                this.A00 = r0;
            }
        }
        return r0.A02();
    }
}

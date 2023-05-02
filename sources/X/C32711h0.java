package X;

import com.facebook.profilo.core.ProvidersRegistry;

/* renamed from: X.1h0  reason: invalid class name and case insensitive filesystem */
public final class C32711h0 extends C32721h1 {
    public static final int A00 = ProvidersRegistry.A00.A02("qpl");

    public C32711h0() {
        super((String) null);
    }

    public void disable() {
    }

    public void enable() {
    }

    public int getSupportedProviders() {
        return A00;
    }

    public int getTracingProviders() {
        C32841hK r0 = this.A01;
        if (r0 == null) {
            return 0;
        }
        return r0.A02 & A00;
    }
}

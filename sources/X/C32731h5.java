package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.provider.atrace.Atrace;

/* renamed from: X.1h5  reason: invalid class name and case insensitive filesystem */
public final class C32731h5 extends C32721h1 {
    public static final int A00 = ProvidersRegistry.A00.A02("atrace");

    public C32731h5() {
        super("profilo_atrace");
    }

    public void disable() {
        Atrace.restoreSystrace(A00());
    }

    public void enable() {
        Atrace.enableSystrace(A00());
    }

    public int getSupportedProviders() {
        return A00;
    }

    public int getTracingProviders() {
        if (Atrace.isEnabled()) {
            return A00;
        }
        return 0;
    }
}

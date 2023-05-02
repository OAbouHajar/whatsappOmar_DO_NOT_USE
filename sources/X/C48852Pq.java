package X;

import com.facebook.msys.mci.Execution;

/* renamed from: X.2Pq  reason: invalid class name and case insensitive filesystem */
public class C48852Pq extends ThreadLocal {
    public /* bridge */ /* synthetic */ Object initialValue() {
        Execution.assertInitialized("execution_initial_value");
        return Integer.valueOf(Execution.nativeGetExecutionContext());
    }
}

package X;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: X.56m  reason: invalid class name and case insensitive filesystem */
public final class C1046856m implements PrivilegedExceptionAction {
    public final /* synthetic */ AlgorithmParameterSpec A00;

    public C1046856m(AlgorithmParameterSpec algorithmParameterSpec) {
        this.A00 = algorithmParameterSpec;
    }

    public Object run() {
        Method method = C89784cu.A01;
        AlgorithmParameterSpec algorithmParameterSpec = this.A00;
        return new AnonymousClass5I8((byte[]) method.invoke(algorithmParameterSpec, new Object[0]), AnonymousClass000.A0D(C89784cu.A02.invoke(algorithmParameterSpec, new Object[0])) >> 3);
    }
}

package X;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: X.56n  reason: invalid class name and case insensitive filesystem */
public final class C1046956n implements PrivilegedExceptionAction {
    public final /* synthetic */ AlgorithmParameterSpec A00;
    public final /* synthetic */ C46922Gu A01;

    public C1046956n(AlgorithmParameterSpec algorithmParameterSpec, C46922Gu r2) {
        this.A01 = r2;
        this.A00 = algorithmParameterSpec;
    }

    public Object run() {
        C46922Gu r5 = this.A01;
        Method method = C89784cu.A02;
        AlgorithmParameterSpec algorithmParameterSpec = this.A00;
        return new C1053859h(r5, (byte[]) C89784cu.A01.invoke(algorithmParameterSpec, new Object[0]), (byte[]) null, AnonymousClass000.A0D(method.invoke(algorithmParameterSpec, new Object[0])));
    }
}

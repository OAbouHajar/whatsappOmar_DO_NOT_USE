package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* renamed from: X.4cu  reason: invalid class name and case insensitive filesystem */
public class C89784cu {
    public static final Class A00;
    public static final Method A01;
    public static final Method A02;

    static {
        Method method;
        Method method2;
        Class A002 = C32971hd.A00(C89784cu.class, "javax.crypto.spec.GCMParameterSpec");
        A00 = A002;
        if (A002 != null) {
            try {
                method2 = (Method) AccessController.doPrivileged(new C1046756l("getTLen"));
            } catch (PrivilegedActionException unused) {
                method2 = null;
            }
            A02 = method2;
            try {
                method = (Method) AccessController.doPrivileged(new C1046756l("getIV"));
            } catch (PrivilegedActionException unused2) {
                method = null;
            }
        } else {
            method = null;
        }
        A01 = method;
    }

    public static AlgorithmParameterSpec A00(C32051fZ r6) {
        AnonymousClass5I8 r62;
        if (r6 != null) {
            try {
                r62 = new AnonymousClass5I8(C32411gJ.A00(r6));
            } catch (NoSuchMethodException unused) {
                throw new InvalidParameterSpecException("No constructor found!");
            } catch (Exception e2) {
                throw new InvalidParameterSpecException(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Construction failed: ")));
            }
        } else {
            r62 = null;
        }
        Class cls = A00;
        Class[] clsArr = new Class[2];
        clsArr[0] = Integer.TYPE;
        Constructor A0c = AnonymousClass3K4.A0c(cls, byte[].class, clsArr, 1);
        Object[] objArr = new Object[2];
        AnonymousClass000.A1M(objArr, r62.A00 << 3, 0);
        return (AlgorithmParameterSpec) AnonymousClass3K4.A0W(C33111hx.A02(r62.A01), A0c, objArr, 1);
    }
}

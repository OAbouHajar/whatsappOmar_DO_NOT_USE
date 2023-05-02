package X;

import java.io.Serializable;

/* renamed from: X.1DR  reason: invalid class name */
public abstract class AnonymousClass1DR implements AnonymousClass1DS, Serializable {
    public final int arity;

    public AnonymousClass1DR(int i2) {
        this.arity = i2;
    }

    public int A9z() {
        return this.arity;
    }

    public String toString() {
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        C18450wi.A0B(obj);
        return obj;
    }
}

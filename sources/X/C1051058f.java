package X;

import java.io.Serializable;

/* renamed from: X.58f  reason: invalid class name and case insensitive filesystem */
public final class C1051058f implements C15220qW, Serializable {
    public Object _value = C40021tR.A00;
    public AnonymousClass1DU initializer;

    public C1051058f(AnonymousClass1DU r2) {
        this.initializer = r2;
    }

    private final Object writeReplace() {
        return new C1050958e(getValue());
    }

    public boolean AIw() {
        return C13680ns.A1a(this._value, C40021tR.A00);
    }

    public Object getValue() {
        Object obj = this._value;
        if (obj != C40021tR.A00) {
            return obj;
        }
        AnonymousClass1DU r0 = this.initializer;
        C18450wi.A0F(r0);
        Object AIT = r0.AIT();
        this._value = AIT;
        this.initializer = null;
        return AIT;
    }

    public String toString() {
        return AIw() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

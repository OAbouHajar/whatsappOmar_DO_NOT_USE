package X;

import java.io.Serializable;

/* renamed from: X.1DV  reason: invalid class name */
public final class AnonymousClass1DV implements C15220qW, Serializable {
    public volatile Object _value = C40021tR.A00;
    public AnonymousClass1DU initializer;
    public final Object lock = this;

    public /* synthetic */ AnonymousClass1DV(AnonymousClass1DU r2) {
        this.initializer = r2;
    }

    private final Object writeReplace() {
        return new C1050958e(getValue());
    }

    public boolean AIw() {
        return this._value != C40021tR.A00;
    }

    public Object getValue() {
        Object obj;
        Object obj2 = this._value;
        C40021tR r0 = C40021tR.A00;
        if (obj2 != r0) {
            return obj2;
        }
        synchronized (this.lock) {
            obj = this._value;
            if (obj == r0) {
                AnonymousClass1DU r02 = this.initializer;
                C18450wi.A0F(r02);
                obj = r02.AIT();
                this._value = obj;
                this.initializer = null;
            }
        }
        return obj;
    }

    public String toString() {
        return AIw() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package X;

import java.lang.reflect.Method;

@Deprecated
/* renamed from: X.0QJ  reason: invalid class name */
public final class AnonymousClass0QJ {
    public final int A00;
    public final Method A01;

    public AnonymousClass0QJ(Method method, int i2) {
        this.A00 = i2;
        this.A01 = method;
        method.setAccessible(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0QJ)) {
            return false;
        }
        AnonymousClass0QJ r4 = (AnonymousClass0QJ) obj;
        return this.A00 == r4.A00 && this.A01.getName().equals(r4.A01.getName());
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01.getName().hashCode();
    }
}

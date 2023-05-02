package X;

import java.util.Arrays;

/* renamed from: X.1Zr  reason: invalid class name and case insensitive filesystem */
public final class C29001Zr {
    public final Object A00;

    public C29001Zr(Object obj) {
        double doubleValue;
        if (obj == null) {
            obj = null;
        } else {
            if (obj instanceof Boolean) {
                doubleValue = ((Boolean) obj).booleanValue() ? 1.0d : 0.0d;
            } else if (obj instanceof Number) {
                doubleValue = ((Number) obj).doubleValue();
            } else if (!(obj instanceof String)) {
                throw new IllegalArgumentException("Attribute type must be Boolean, Number, or String");
            }
            obj = Double.valueOf(doubleValue);
        }
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this != obj) {
            if (obj == null || C29001Zr.class != obj.getClass()) {
                return false;
            }
            C29001Zr r5 = (C29001Zr) obj;
            Object obj3 = this.A00;
            return (obj3 == null || (obj2 = r5.A00) == null) ? obj3 == r5.A00 : obj3 == obj2 || obj3.equals(obj2);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }
}

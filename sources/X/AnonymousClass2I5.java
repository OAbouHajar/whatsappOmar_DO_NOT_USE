package X;

import java.util.Arrays;

/* renamed from: X.2I5  reason: invalid class name */
public class AnonymousClass2I5 implements Comparable {
    public final Class A00;
    public final Object A01;

    public AnonymousClass2I5(Object obj) {
        Class<String> cls = String.class;
        if (cls.isInstance(obj)) {
            this.A01 = obj;
            this.A00 = cls;
            return;
        }
        throw new IllegalArgumentException("Mismatched args: value is not an instance of type");
    }

    public int compareTo(Object obj) {
        if (obj instanceof AnonymousClass2I5) {
            AnonymousClass2I5 r4 = (AnonymousClass2I5) obj;
            Object obj2 = r4.A01;
            Class cls = r4.A00;
            Class<Float> cls2 = this.A00;
            if (!cls2.equals(cls)) {
                throw new IllegalArgumentException("compareTo objects have mismatched types");
            } else if (cls2 == Boolean.class) {
                throw new IllegalArgumentException("compareTo should not be called on boolean types");
            } else if (cls2 == String.class) {
                return ((String) this.A01).compareTo((String) obj2);
            } else {
                if (cls2 == Integer.class) {
                    return AnonymousClass03H.A00(((Number) this.A01).intValue(), ((Number) obj2).intValue());
                }
                if (cls2 == Float.class) {
                    return Float.compare(((Number) this.A01).floatValue(), ((Number) obj2).floatValue());
                }
                throw new IllegalStateException("Invalid type: must be one of {Boolean, Integer, Float, String}");
            }
        } else {
            throw new IllegalArgumentException("compareTo o should be an instance of ConfigPrimitive");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2I5)) {
            return false;
        }
        AnonymousClass2I5 r5 = (AnonymousClass2I5) obj;
        return this.A00.equals(r5.A00) && this.A01.equals(r5.A01);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public String toString() {
        return this.A01.toString();
    }
}

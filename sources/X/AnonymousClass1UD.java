package X;

/* renamed from: X.1UD  reason: invalid class name */
public abstract class AnonymousClass1UD extends AnonymousClass1UE implements AnonymousClass1DS, AnonymousClass1UI {
    public final int arity = 2;

    public AnonymousClass1UD(AnonymousClass1UG r2) {
        super(r2);
    }

    public int A9z() {
        return this.arity;
    }

    public String toString() {
        if (this.completion != null) {
            return super.toString();
        }
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        C18450wi.A0B(obj);
        return obj;
    }
}

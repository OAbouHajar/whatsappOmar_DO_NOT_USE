package X;

/* renamed from: X.44C  reason: invalid class name */
public final class AnonymousClass44C extends IndexOutOfBoundsException {
    public static final long serialVersionUID = 160715609518896765L;
    public final String className;
    public final int constantPoolCount;

    public AnonymousClass44C(String str, int i2) {
        super(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Class too large: ")));
        this.className = str;
        this.constantPoolCount = i2;
    }
}

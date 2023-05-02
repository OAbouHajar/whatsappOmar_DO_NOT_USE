package X;

/* renamed from: X.40p  reason: invalid class name and case insensitive filesystem */
public enum C796340p {
    X86(1),
    ARM(2),
    X86_64(3),
    AARCH64(4);
    
    public final String value;

    /* access modifiers changed from: public */
    static {
        new C796340p("NOT_SO", "not_so", 0);
        X86 = new C796340p("X86", "x86", 1);
        ARM = new C796340p("ARM", "armeabi-v7a", 2);
        X86_64 = new C796340p("X86_64", "x86_64", 3);
        AARCH64 = new C796340p("AARCH64", "arm64-v8a", 4);
        new C796340p("OTHERS", "others", 5);
    }

    /* access modifiers changed from: public */
    C796340p(int i2) {
        this.value = r2;
    }

    public String toString() {
        return this.value;
    }
}

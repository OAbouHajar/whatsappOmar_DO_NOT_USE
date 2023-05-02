package X;

/* renamed from: X.40o  reason: invalid class name and case insensitive filesystem */
public enum C796240o {
    TOP_LEFT(0.0f, 1.0f, 1.0f, 0),
    TOP_RIGHT(0.0f, 2.0f, 1.0f, 1),
    BOTTOM_LEFT(1.0f, 1.0f, 2.0f, 2),
    BOTTOM_RIGHT(1.0f, 2.0f, 2.0f, 3);
    
    public final float bottom;
    public final float left;
    public final float right;

    /* renamed from: top  reason: collision with root package name */
    public final float f153top;

    /* access modifiers changed from: public */
    static {
        TOP_LEFT = new C796240o("TOP_LEFT", 0.0f, 0.0f, 1.0f, 1.0f, 0);
        TOP_RIGHT = new C796240o("TOP_RIGHT", 1.0f, 0.0f, 2.0f, 1.0f, 1);
        BOTTOM_LEFT = new C796240o("BOTTOM_LEFT", 0.0f, 1.0f, 1.0f, 2.0f, 2);
        BOTTOM_RIGHT = new C796240o("BOTTOM_RIGHT", 1.0f, 1.0f, 2.0f, 2.0f, 3);
    }

    /* access modifiers changed from: public */
    C796240o(float f2, float f3, float f4, int i2) {
        this.left = r2;
        this.f153top = f2;
        this.right = f3;
        this.bottom = f4;
    }
}

package X;

/* renamed from: X.2e6  reason: invalid class name and case insensitive filesystem */
public enum C52592e6 {
    APPAREL_CLOTHING(0, 1),
    RESTAURANT(3, 1),
    GROCERY_STORE(4, 1),
    OTHERS(30, 1);
    
    public final String id;
    public final int rootCategoryVersion;

    /* access modifiers changed from: public */
    C52592e6(int i2, int i3) {
        this.id = r2;
        this.rootCategoryVersion = i3;
    }

    public static boolean A00(String str) {
        for (C52592e6 r1 : values()) {
            if (r1.id.equals(str) && r1.rootCategoryVersion == 2) {
                return true;
            }
        }
        return false;
    }
}

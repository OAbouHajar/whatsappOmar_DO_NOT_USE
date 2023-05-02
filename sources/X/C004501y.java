package X;

/* renamed from: X.01y  reason: invalid class name and case insensitive filesystem */
public final class C004501y {
    public static Object A00(Class cls, Object obj) {
        if (obj instanceof AnonymousClass01H) {
            return cls.cast(obj);
        }
        if (obj instanceof AnonymousClass007) {
            return A00(cls, ((AnonymousClass007) obj).generatedComponent());
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), AnonymousClass01H.class, AnonymousClass007.class}));
    }
}

package X;

/* renamed from: X.0GZ  reason: invalid class name */
public final class AnonymousClass0GZ extends AnonymousClass0Q6 {
    public final C12550ka A00;
    public final C03670Jk A01;
    public final C03910Kj A02;
    public final Object A03;
    public final String A04;

    public AnonymousClass0GZ(C12550ka r4, C03670Jk r5, Object obj, String str) {
        C18450wi.A0H(r5, 5);
        this.A03 = obj;
        this.A04 = str;
        this.A00 = r4;
        this.A01 = r5;
        C03910Kj r2 = new C03910Kj(AnonymousClass000.A0e(obj, " value: ", AnonymousClass000.A0q(str)));
        StackTraceElement[] stackTrace = r2.getStackTrace();
        C18450wi.A0B(stackTrace);
        Object[] array = C11330iZ.A03(stackTrace).toArray(new StackTraceElement[0]);
        if (array != null) {
            r2.setStackTrace((StackTraceElement[]) array);
            this.A02 = r2;
            return;
        }
        throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public AnonymousClass0Q6 A00(String str, AnonymousClass22J r2) {
        return this;
    }

    public Object A01() {
        switch (this.A01.ordinal()) {
            case 0:
                throw this.A02;
            case 1:
                this.A00.A7i("SidecarAdapter", AnonymousClass000.A0e(this.A03, " value: ", AnonymousClass000.A0q(this.A04)));
                return null;
            case 2:
                return null;
            default:
                throw new AnonymousClass2Xe();
        }
    }
}

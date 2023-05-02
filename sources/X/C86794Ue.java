package X;

import android.content.Context;

/* renamed from: X.4Ue  reason: invalid class name and case insensitive filesystem */
public class C86794Ue {
    public AnonymousClass4ZW A00;
    public final int A01;
    public final Context A02;
    public final Object A03;

    public C86794Ue(Context context, AnonymousClass4ZW r2, Object obj, int i2) {
        this.A02 = context;
        this.A01 = i2;
        this.A00 = r2;
        this.A03 = obj;
    }

    public AnonymousClass4ZW A00() {
        AnonymousClass4ZW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0V("Trying to access the LayoutCache from outside a layout call");
    }

    public Object A01() {
        return this.A03;
    }
}

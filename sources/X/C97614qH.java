package X;

import android.content.Context;

/* renamed from: X.4qH  reason: invalid class name and case insensitive filesystem */
public final class C97614qH implements C108355Nq {
    public final Context A00;
    public final C108355Nq A01;

    public C97614qH(Context context) {
        C97604qG r1 = new C97604qG();
        r1.A00 = null;
        this.A00 = context.getApplicationContext();
        this.A01 = r1;
    }

    public C97614qH(Context context, String str) {
        C97604qG r1 = new C97604qG();
        r1.A00 = str;
        this.A00 = context.getApplicationContext();
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ C48612Oe A7I() {
        return new AnonymousClass3E6(this.A00, this.A01.A7I());
    }
}

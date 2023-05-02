package X;

import android.content.Context;

/* renamed from: X.1Vb  reason: invalid class name and case insensitive filesystem */
public abstract class C28261Vb extends C28271Vc {
    public AnonymousClass2T5 A00;
    public AnonymousClass013 A01;

    public C28261Vb(String str) {
        super(str);
    }

    public void attachBaseContext(Context context) {
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
        this.A01 = r1.Ai9();
        AnonymousClass2T4 r2 = new AnonymousClass2T4((AnonymousClass013) ((C16150sX) r1).AR8.get());
        this.A00 = r2;
        super.attachBaseContext(new AnonymousClass2T6(context, r2, this.A01));
    }
}

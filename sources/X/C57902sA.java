package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.2sA  reason: invalid class name and case insensitive filesystem */
public final class C57902sA extends AnonymousClass2f2 implements AnonymousClass5UV {
    public static final AnonymousClass3WP A00;
    public static final AnonymousClass458 A01;
    public static final C437721l A02;

    static {
        AnonymousClass458 r3 = new AnonymousClass458();
        A01 = r3;
        AnonymousClass3WI r2 = new AnonymousClass3WI();
        A00 = r2;
        A02 = new C437721l(r2, r3, "ClientTelemetry.API");
    }

    public C57902sA(Context context, C97834qe r8) {
        super((Activity) null, context, r8, A02, C87944Zh.A02);
    }

    public final C14210on AKH(AnonymousClass3X5 r5) {
        C88714ay r3 = new C88714ay((AnonymousClass44J) null);
        r3.A03 = new AnonymousClass3Y2[]{AnonymousClass4AU.A00};
        r3.A02 = false;
        r3.A01 = new C97924qo(r5);
        return A01(r3.A00(), 2);
    }
}

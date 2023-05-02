package X;

import com.google.android.gms.common.api.Scope;

/* renamed from: X.4BG  reason: invalid class name */
public final class AnonymousClass4BG {
    public static final AnonymousClass3WP A00;
    public static final AnonymousClass3WP A01;
    public static final AnonymousClass458 A02;
    public static final AnonymousClass458 A03;
    public static final C437721l A04;
    public static final C437721l A05;

    static {
        AnonymousClass458 r6 = new AnonymousClass458();
        A02 = r6;
        AnonymousClass458 r5 = new AnonymousClass458();
        A03 = r5;
        AnonymousClass3WM r4 = new AnonymousClass3WM();
        A00 = r4;
        AnonymousClass3WN r3 = new AnonymousClass3WN();
        A01 = r3;
        new Scope(1, "profile");
        new Scope(1, "email");
        A04 = new C437721l(r4, r6, "SignIn.API");
        A05 = new C437721l(r3, r5, "SignIn.INTERNAL_API");
    }
}

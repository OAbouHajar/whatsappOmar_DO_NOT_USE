package X;

import android.text.TextUtils;

/* renamed from: X.0wl  reason: invalid class name and case insensitive filesystem */
public class C18480wl implements C18490wm {
    public final C15900s5 A00;
    public final C15860rz A01;
    public final AnonymousClass013 A02;
    public final C14710pd A03;

    public C18480wl(C15900s5 r1, C15860rz r2, AnonymousClass013 r3, C14710pd r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String AB5() {
        C15860rz r0 = this.A01;
        String A0O = r0.A0O();
        String A0Q = r0.A0Q();
        return (TextUtils.isEmpty(A0O) || TextUtils.isEmpty(A0Q)) ? this.A02.A05() : C18160wF.A01(A0O, A0Q);
    }
}

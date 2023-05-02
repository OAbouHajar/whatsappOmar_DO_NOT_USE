package X;

import com.facebook.redex.RunnableRunnableShape1S1201000_I1;
import java.lang.ref.WeakReference;

/* renamed from: X.3Gj  reason: invalid class name and case insensitive filesystem */
public class C63163Gj implements C19550yc {
    public final C14870pt A00;
    public final C17190ug A01;
    public final WeakReference A02;
    public final boolean A03;

    public C63163Gj(C14870pt r2, C45872Bl r3, C17190ug r4, boolean z2) {
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = C13690nt.A0h(r3);
        this.A03 = z2;
    }

    public void A00(C16050sL r14) {
        int i2;
        String str;
        C17190ug r6 = this.A01;
        String A022 = r6.A02();
        if (this.A03) {
            i2 = 105;
            str = "set";
        } else {
            i2 = 106;
            str = "get";
        }
        C28371Vv r4 = new C28371Vv("invite", (C35081lL[]) null);
        C35081lL[] r3 = new C35081lL[4];
        C35081lL.A02("id", A022, r3, 0);
        C35081lL.A02("xmlns", "w:g2", r3, 1);
        C35081lL.A02("type", str, r3, 2);
        r6.A0A(this, C28371Vv.A03(r14, r4, r3, 3), A022, i2, 32000);
    }

    public final void A01(String str, int i2) {
        Object obj = this.A02.get();
        if (obj != null) {
            this.A00.A0K(new RunnableRunnableShape1S1201000_I1(this, obj, str, i2, 2));
        }
    }

    public void APb(String str) {
        A01((String) null, 0);
    }

    public void AQe(C28371Vv r3, String str) {
        A01((String) null, C34451kH.A00(r3));
    }

    public void AYG(C28371Vv r4, String str) {
        C28371Vv A0I = r4.A0I(0);
        C28371Vv.A06(A0I, "invite");
        A01(C28371Vv.A05(A0I, "code"), 0);
    }
}

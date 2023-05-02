package X;

import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* renamed from: X.3ED  reason: invalid class name */
public final class AnonymousClass3ED implements C108415Nw, C15690rg {
    public IAccountAccessor A00 = null;
    public Set A01 = null;
    public boolean A02 = false;
    public final C15750rn A03;
    public final C86834Ui A04;
    public final /* synthetic */ AnonymousClass3CL A05;

    public AnonymousClass3ED(C15750rn r2, C86834Ui r3, AnonymousClass3CL r4) {
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
    }

    public final void AWA(C15700rh r3) {
        C13700nu.A0O(this.A05.A06, r3, this, 14);
    }

    public final void AiY(C15700rh r7) {
        C15730rl r5 = (C15730rl) this.A05.A09.get(this.A04);
        if (r5 != null) {
            C13710nw.A00(r5.A0C.A06);
            C15750rn r4 = r5.A04;
            String A0d = AnonymousClass000.A0d(r4);
            String valueOf = String.valueOf(r7);
            StringBuilder A0g = C13690nt.A0g(A0d.length() + 25 + valueOf.length());
            A0g.append("onSignInFailed for ");
            A0g.append(A0d);
            A0g.append(" with ");
            C15770rp r42 = (C15770rp) r4;
            r42.A0S = AnonymousClass000.A0h(valueOf, A0g);
            r42.A80();
            r5.A07(r7, (Exception) null);
        }
    }
}

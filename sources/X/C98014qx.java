package X;

import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.4qx  reason: invalid class name and case insensitive filesystem */
public class C98014qx implements C108415Nw {
    public final /* synthetic */ C15770rp A00;

    public C98014qx(C15770rp r1) {
        this.A00 = r1;
    }

    public final void AWA(C15700rh r4) {
        if (r4.A01 == 0) {
            C15770rp r2 = this.A00;
            r2.AFQ((IAccountAccessor) null, ((C57972sH) r2).A01);
            return;
        }
        C107795Ll r0 = this.A00.A0K;
        if (r0 != null) {
            ((C98004qw) r0).A00.onConnectionFailed(r4);
        }
    }
}

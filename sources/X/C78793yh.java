package X;

import com.facebook.redex.IDxCallbackShape373S0100000_2_I0;
import com.obwhatsapp.group.GroupCallButtonController;
import com.obwhatsapp.quickcontact.QuickContactActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.3yh  reason: invalid class name and case insensitive filesystem */
public class C78793yh extends C16690tT {
    public final long A00;
    public final AnonymousClass1D0 A01;
    public final WeakReference A02;

    public C78793yh(AnonymousClass5P8 r2, AnonymousClass1D0 r3, long j2) {
        this.A01 = r3;
        this.A02 = C13690nt.A0h(r2);
        this.A00 = j2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A01.A02(this.A00);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C37831po r3 = (C37831po) obj;
        AnonymousClass5P8 r0 = (AnonymousClass5P8) this.A02.get();
        if (r0 != null) {
            IDxCallbackShape373S0100000_2_I0 iDxCallbackShape373S0100000_2_I0 = (IDxCallbackShape373S0100000_2_I0) r0;
            int i2 = iDxCallbackShape373S0100000_2_I0.A01;
            Object obj2 = iDxCallbackShape373S0100000_2_I0.A00;
            switch (i2) {
                case 0:
                    ((C56052ks) obj2).A02 = r3;
                    return;
                case 1:
                    ((GroupCallButtonController) obj2).A06 = r3;
                    return;
                default:
                    ((QuickContactActivity) obj2).A0k = r3;
                    return;
            }
        }
    }
}

package X;

import com.facebook.redex.IDxCallbackShape428S0100000_2_I0;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.lang.ref.WeakReference;

/* renamed from: X.3yg  reason: invalid class name and case insensitive filesystem */
public class C78783yg extends C16690tT {
    public final AnonymousClass1SN A00;
    public final AnonymousClass1D0 A01;
    public final WeakReference A02;

    public C78783yg(AnonymousClass5P7 r2, AnonymousClass1SN r3, AnonymousClass1D0 r4) {
        this.A02 = C13690nt.A0h(r2);
        this.A01 = r4;
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C38571r0 A04;
        AnonymousClass1SN r1 = this.A00;
        String str = ((String[]) objArr)[0];
        long j2 = -1;
        if (!(str == null || (A04 = r1.A02.A04(C30341cC.A0B(str))) == null)) {
            j2 = A04.A00;
        }
        C37831po A022 = this.A01.A02(j2);
        if (C16690tT.A02(this)) {
            return null;
        }
        return A022;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C37831po r4 = (C37831po) obj;
        AnonymousClass5P7 r1 = (AnonymousClass5P7) this.A02.get();
        if (r1 != null) {
            IDxCallbackShape428S0100000_2_I0 iDxCallbackShape428S0100000_2_I0 = (IDxCallbackShape428S0100000_2_I0) r1;
            if (iDxCallbackShape428S0100000_2_I0.A01 != 0) {
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) iDxCallbackShape428S0100000_2_I0.A00;
                voipActivityV2.finish();
                if (r4 != null) {
                    voipActivityV2.A11.A06(voipActivityV2, r4, 4);
                }
                voipActivityV2.A0y = null;
                return;
            }
            AnonymousClass2QC.A0d((AnonymousClass2QC) iDxCallbackShape428S0100000_2_I0.A00, r4);
        }
    }
}

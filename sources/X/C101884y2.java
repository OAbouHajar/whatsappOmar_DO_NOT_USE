package X;

import com.facebook.redex.RunnableRunnableShape0S2100000_I0;
import java.util.List;

/* renamed from: X.4y2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101884y2 implements AnonymousClass2HF {
    public final /* synthetic */ AnonymousClass13O A00;
    public final /* synthetic */ C28371Vv A01;

    public /* synthetic */ C101884y2(AnonymousClass13O r1, C28371Vv r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void AMM(List list) {
        AnonymousClass13O r3 = this.A00;
        C28371Vv r2 = this.A01;
        if (list.size() == 1) {
            C30671cl r1 = (C30671cl) C13690nt.A0Z(list);
            AnonymousClass00B.A06(r1);
            String str = r1.A0A;
            r3.A09.A04(r1, r2);
            AnonymousClass2KG AEj = r3.A0F.A03().AEj();
            if (AEj != null) {
                String A012 = AEj.A01(r1, r2);
                if (A012 != null) {
                    AnonymousClass108 r32 = r3.A0A;
                    r32.A0A.Acl(new RunnableRunnableShape0S2100000_I0(r32, str, A012, 6));
                    return;
                }
                return;
            }
            r3.A0G.A05("onRecvPaymentMethodUpdate: storeOrUpdatePaymentMethod failed");
        }
    }
}

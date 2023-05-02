package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ip  reason: invalid class name */
public final class AnonymousClass3Ip extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass41I $requestType;
    public final /* synthetic */ AnonymousClass3B7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Ip(AnonymousClass41I r2, AnonymousClass3B7 r3) {
        super(1);
        this.this$0 = r3;
        this.$requestType = r2;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        AnonymousClass46I r7 = (AnonymousClass46I) obj;
        if (r7 instanceof C73273nc) {
            AnonymousClass3B7 r5 = this.this$0;
            AnonymousClass41I r4 = this.$requestType;
            C73273nc r72 = (C73273nc) r7;
            C18450wi.A0H(r72, 0);
            List<C35701mM> list = r72.A00.A01;
            ArrayList A0u = AnonymousClass000.A0u();
            for (C35701mM r1 : list) {
                C18450wi.A09(r1);
                A0u.add(new C73333ni(r1));
            }
            ((AnonymousClass028) r5.A03.getValue()).A0B(AnonymousClass3B7.A00(r4, new AnonymousClass2XY(A0u), new AnonymousClass2Xc(A0u)));
        } else if (r7 instanceof C73303nf) {
            AnonymousClass3B7 r42 = this.this$0;
            AnonymousClass41I r3 = this.$requestType;
            AnonymousClass2Y7 r2 = AnonymousClass2Y7.A00;
            ((AnonymousClass028) r42.A03.getValue()).A0B(AnonymousClass3B7.A00(r3, new AnonymousClass2Y8(r2), new AnonymousClass2Y4(r2)));
        } else if (C18450wi.A0R(r7, C73293ne.A00)) {
            AnonymousClass3B7 r43 = this.this$0;
            AnonymousClass41I r32 = this.$requestType;
            AnonymousClass2Y6 r22 = AnonymousClass2Y6.A00;
            ((AnonymousClass028) r43.A03.getValue()).A0B(AnonymousClass3B7.A00(r32, new AnonymousClass2Y8(r22), new AnonymousClass2Y4(r22)));
        } else {
            if (!C18450wi.A0R(r7, C73283nd.A00)) {
                if (!C18450wi.A0R(r7, C73313ng.A00)) {
                    C18450wi.A0R(r7, C73323nh.A00);
                } else if (this.$requestType == AnonymousClass41I.START) {
                    ((AnonymousClass028) this.this$0.A03.getValue()).A0B(AnonymousClass2YA.A00);
                }
            }
            ((AnonymousClass028) this.this$0.A03.getValue()).A0B(AnonymousClass2Y3.A00);
        }
        return AnonymousClass22M.A00;
    }
}

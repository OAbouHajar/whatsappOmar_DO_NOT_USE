package X;

import com.facebook.redex.IDxNFunctionShape43S0200000_2_I1;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* renamed from: X.51K  reason: invalid class name */
public class AnonymousClass51K implements C19550yc {
    public final /* synthetic */ AnonymousClass04N A00;
    public final /* synthetic */ AnonymousClass04N A01;
    public final /* synthetic */ AnonymousClass04N A02;
    public final /* synthetic */ AnonymousClass4NA A03;
    public final /* synthetic */ C83074Fg A04;
    public final /* synthetic */ Runnable A05;

    public AnonymousClass51K(AnonymousClass04N r1, AnonymousClass04N r2, AnonymousClass04N r3, AnonymousClass4NA r4, C83074Fg r5, Runnable runnable) {
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r1;
        this.A05 = runnable;
        this.A02 = r2;
        this.A00 = r3;
    }

    public void APb(String str) {
        this.A00.accept(C13680ns.A0X());
    }

    public void AQe(C28371Vv r6, String str) {
        try {
            C83074Fg r1 = this.A04;
            C16300so r4 = this.A03.A00;
            AnonymousClass3K3.A1G(r6);
            C32271fx.A03(r6, new IDxNFunctionShape43S0200000_2_I1(r4, r1.A00, 9), new String[0]);
            C32261fw[] r2 = new C32261fw[9];
            r2[0] = AnonymousClass3K3.A0X(r4, 101);
            r2[1] = AnonymousClass3K3.A0X(r4, 104);
            r2[2] = AnonymousClass3K3.A0X(r4, 100);
            r2[3] = AnonymousClass3K3.A0X(r4, 105);
            r2[4] = AnonymousClass3K3.A0X(r4, 98);
            r2[5] = AnonymousClass3K3.A0X(r4, 102);
            r2[6] = AnonymousClass3K3.A0X(r4, 99);
            r2[7] = AnonymousClass3K3.A0X(r4, 103);
            ((C109065Qo) C32271fx.A04(r6, "RateLimited|UnsupportedOperation|InvalidParticipantJID|MalformedStanza|GroupDoesNotExist|UserDoesNotHaveAdminPermission|UserIsNotAParticipant|GroupIsSuspended|FallbackClient", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r4, 106), r2, 8), new String[0])).A4Q(new AnonymousClass4QD(this));
        } catch (AnonymousClass1W9 unused) {
            this.A01.accept(C13680ns.A0Y());
        }
    }

    public void AYG(C28371Vv r15, String str) {
        try {
            C83074Fg r0 = this.A04;
            AnonymousClass4NA r2 = this.A03;
            C16300so r3 = r2.A00;
            C28371Vv r7 = r15;
            AnonymousClass3K3.A1G(r15);
            C32271fx.A03(r15, new IDxNFunctionShape43S0200000_2_I1(r3, r0.A00, 10), new String[0]);
            C32271fx.A07(r7, AnonymousClass3K3.A0X(r3, AnonymousClass2EA.A03), new String[]{"leave", "group"}, 0, FileUtils.ONE_KB);
            List<AnonymousClass4UW> A07 = C32271fx.A07(r7, AnonymousClass3K3.A0X(r3, 107), new String[]{"leave", "linked_groups"}, 0, FileUtils.ONE_KB);
            ArrayList A0u = AnonymousClass000.A0u();
            ArrayList A0u2 = AnonymousClass000.A0u();
            for (AnonymousClass4UW r1 : A07) {
                C16050sL r32 = r1.A02.A00;
                C109075Qp r12 = r1.A01;
                if (r12 == null) {
                    A0u2.add(r32);
                } else {
                    r12.A4R(new AnonymousClass4KO(this, r32, A0u));
                }
            }
            AnonymousClass4HY r4 = new AnonymousClass4HY(A0u2, A0u);
            List list = r4.A01;
            if (!list.isEmpty()) {
                r2.A01.A01(new RunnableRunnableShape13S0200000_I1_1(this, 43, list));
            }
            if (r4.A00.isEmpty()) {
                this.A05.run();
            } else {
                this.A02.accept(r4);
            }
        } catch (Exception e2) {
            this.A01.accept(C13680ns.A0Y());
            throw e2;
        }
    }
}

package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import org.apache.commons.io.FileUtils;

/* renamed from: X.2ec  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52892ec implements Runnable {
    public final /* synthetic */ C15830rv A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ AnonymousClass1HE A03;
    public final /* synthetic */ C16730tY A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C52892ec(C15830rv r1, Jid jid, UserJid userJid, AnonymousClass1HE r4, C16730tY r5, boolean z2, boolean z3) {
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = z2;
        this.A01 = jid;
        this.A00 = r1;
        this.A06 = z3;
        this.A02 = userJid;
    }

    public final void run() {
        AnonymousClass1HE r10 = this.A03;
        C16730tY r3 = this.A04;
        boolean z2 = this.A05;
        Jid jid = this.A01;
        C15830rv r11 = this.A00;
        boolean z3 = this.A06;
        UserJid userJid = this.A02;
        StringBuilder sb = new StringBuilder("app/mediajobmanager/enqueuemediaresendupload enqueuing message: ");
        sb.append(r3.A11);
        Log.i(sb.toString());
        C43241zg r9 = new C43241zg(Collections.singletonList(r3));
        AnonymousClass1XJ r12 = new AnonymousClass1XJ(false, r9.A04(), r9.A03());
        C215614o r5 = r10.A0H;
        C16040sK r2 = r10.A02;
        C16040sK r16 = r2;
        AnonymousClass1XL A012 = AnonymousClass1XL.A01(r16, r9, r10.A09, r5, r10.A0I, r12, false);
        C18220wL r52 = r10.A0D;
        AnonymousClass1XP A042 = r52.A04(A012, false);
        C43251zh r1 = A042.A0K;
        AnonymousClass00B.A06(r1);
        r1.A04(3);
        C31781f1 r14 = A042.A0J;
        AnonymousClass00B.A06(r14);
        C14710pd r13 = r10.A0B;
        C16620tM r122 = C16620tM.A02;
        if (r13.A0E(r122, 475)) {
            AnonymousClass1RN r22 = r10.A0G;
            if (System.currentTimeMillis() - r14.A05 < 1800000 || !r22.A00(r14)) {
                if (z2) {
                    r10.A04.A00();
                    return;
                }
                return;
            }
        }
        if (r3.A01 <= ((long) r13.A03(r122, 1098)) * FileUtils.ONE_MB) {
            r9.A01();
            r10.A02(r9, A042);
            A042.A0U = "mms";
            A042.A0A.A03(new C47532Jj(r9, r10, A042, false, false), r10.A0S);
            r52.A09(A042, new C76753ud(r11, jid, userJid, A042, A042.A00(), z3, z2));
        }
    }
}

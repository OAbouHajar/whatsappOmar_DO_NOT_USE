package X;

import com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.jid.Jid;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/* renamed from: X.3IX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3IX implements Callable {
    public final /* synthetic */ Jid A00;
    public final /* synthetic */ SendLiveLocationKeyJob A01;

    public /* synthetic */ AnonymousClass3IX(Jid jid, SendLiveLocationKeyJob sendLiveLocationKeyJob) {
        this.A01 = sendLiveLocationKeyJob;
        this.A00 = jid;
    }

    public final Object call() {
        SendLiveLocationKeyJob sendLiveLocationKeyJob = this.A01;
        Jid jid = this.A00;
        C16040sK r0 = sendLiveLocationKeyJob.A00;
        r0.A0B();
        C30981dH r2 = new C30981dH(C28851Ya.A02(r0.A04), jid.getRawString());
        C208211s r1 = sendLiveLocationKeyJob.A02;
        Lock A03 = r1.A0I.A03(r2);
        if (A03 == null) {
            r1.A0H.A00();
        } else {
            try {
                A03.lock();
            } catch (Throwable th) {
                if (A03 != null) {
                    A03.unlock();
                }
                throw th;
            }
        }
        C36101n0 r12 = new C36101n0(new C36391nT(r1.A00.A00.A01).A00(C31811f4.A02(r2)).A03, 0);
        if (A03 != null) {
            A03.unlock();
        }
        C28581Wr A0U = C33211iD.A0o.A0U();
        C58472tY r02 = ((C33211iD) A0U.A00).A0g;
        if (r02 == null) {
            r02 = C58472tY.A03;
        }
        C69623fL r3 = (C69623fL) r02.A0U();
        r3.A06(jid.getRawString());
        byte[] bArr = r12.A01;
        AnonymousClass00B.A06(bArr);
        r3.A05(C28631Ww.A01(bArr, 0, bArr.length));
        C33211iD r13 = (C33211iD) C28581Wr.A00(A0U);
        r13.A0g = (C58472tY) r3.A02();
        r13.A00 |= 16384;
        return A0U.A02();
    }
}

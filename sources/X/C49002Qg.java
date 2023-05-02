package X;

import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2Qg  reason: invalid class name and case insensitive filesystem */
public class C49002Qg extends AnonymousClass2Qh {
    public final /* synthetic */ RotateSignedPreKeyJob A00;
    public final /* synthetic */ AtomicInteger A01;
    public final /* synthetic */ AtomicReference A02;

    public C49002Qg(RotateSignedPreKeyJob rotateSignedPreKeyJob, AtomicInteger atomicInteger, AtomicReference atomicReference) {
        this.A00 = rotateSignedPreKeyJob;
        this.A01 = atomicInteger;
        this.A02 = atomicReference;
    }

    public void A02(C28371Vv r4) {
        AnonymousClass16P r2 = this.A00.A02;
        r2.A00.submit(new RunnableRunnableShape10S0100000_I0_9((Object) this, 12));
    }
}

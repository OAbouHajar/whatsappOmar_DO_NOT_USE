package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.67a  reason: invalid class name and case insensitive filesystem */
public class C1218367a extends FutureTask {
    public final ArrayList A00 = AnonymousClass000.A0u();
    public final UUID A01;
    public volatile boolean A02;
    public final /* synthetic */ C119355wx A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1218367a(C119355wx r2, String str, UUID uuid, Callable callable) {
        super(callable);
        this.A03 = r2;
        if (uuid != null) {
            this.A01 = uuid;
            return;
        }
        throw AnonymousClass000.A0W(AnonymousClass000.A0h(str, AnonymousClass000.A0r("SessionId is null! Attempting to schedule task: ")));
    }

    public synchronized void A00(C118595uw r13) {
        C1217066n r6;
        C119355wx r1;
        UUID uuid;
        synchronized (this) {
            C118595uw r3 = r13;
            if (isDone()) {
                try {
                    Object obj = get();
                    this.A03.A05(new C1217066n(r3, this, (Exception) null, obj, true), this.A01);
                } catch (CancellationException e2) {
                    r1 = this.A03;
                    uuid = this.A01;
                    r6 = new C1217066n(r13, this, e2, (Object) null, false);
                    r1.A05(r6, uuid);
                } catch (InterruptedException | ExecutionException e3) {
                    r1 = this.A03;
                    uuid = this.A01;
                    r6 = new C1217066n(r13, this, e3, (Object) null, false);
                    r1.A05(r6, uuid);
                }
            } else {
                this.A00.add(r13);
            }
        }
    }

    public void done() {
        C1217166o r7;
        C119355wx r1;
        UUID uuid;
        super.done();
        synchronized (this) {
            ArrayList arrayList = this.A00;
            ArrayList A0n = C13680ns.A0n(arrayList);
            arrayList.clear();
            try {
                Object obj = get();
                Iterator it = A0n.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                this.A03.A05(new C1217166o(this, (Exception) null, obj, A0n, true), this.A01);
            } catch (CancellationException e2) {
                r1 = this.A03;
                uuid = this.A01;
                r7 = new C1217166o(this, e2, (Object) null, A0n, false);
                r1.A05(r7, uuid);
            } catch (InterruptedException | ExecutionException e3) {
                if (!A0n.isEmpty()) {
                    Iterator it2 = A0n.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    r1 = this.A03;
                    uuid = this.A01;
                    r7 = new C1217166o(this, e3, (Object) null, A0n, false);
                    r1.A05(r7, uuid);
                } else if (this.A03.A04.getLooper().getThread() != Thread.currentThread()) {
                    AnonymousClass5xH.A00();
                }
            }
        }
        synchronized (this) {
        }
    }

    public void run() {
        synchronized (this) {
        }
        super.run();
    }

    public boolean runAndReset() {
        synchronized (this) {
        }
        return super.runAndReset();
    }
}

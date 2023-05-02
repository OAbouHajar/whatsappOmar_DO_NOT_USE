package com.google.android.gms.common.api.internal;

import X.AnonymousClass4C1;
import X.C105735Az;
import X.C108395Nu;
import X.C13710nw;
import X.C437121f;
import X.C438221r;
import X.C53212fE;
import X.C66323Yx;
import X.C97894ql;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult extends C438221r {
    public static final ThreadLocal zaa = new C105735Az();
    public final C66323Yx zab;
    public final WeakReference zac;
    public final Object zae;
    public final CountDownLatch zaf;
    public final ArrayList zag;
    public final AtomicReference zai;
    public C108395Nu zaj;
    public Status zak;
    public volatile boolean zal;
    public boolean zam;
    public boolean zan;
    public volatile C97894ql zap;
    public boolean zaq;

    @Deprecated
    public BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new C66323Yx(Looper.getMainLooper());
        this.zac = new WeakReference((Object) null);
    }

    public BasePendingResult(C437121f r3) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new C66323Yx(r3 != null ? r3.A01() : Looper.getMainLooper());
        this.zac = new WeakReference(r3);
    }

    private final C108395Nu zaa() {
        C108395Nu r2;
        synchronized (this.zae) {
            C13710nw.A04("Result has already been consumed.", !this.zal);
            boolean z2 = false;
            if (this.zaf.getCount() == 0) {
                z2 = true;
            }
            C13710nw.A04("Result is not ready.", z2);
            r2 = this.zaj;
            this.zaj = null;
            this.zal = true;
        }
        AnonymousClass4C1 r0 = (AnonymousClass4C1) this.zai.getAndSet((Object) null);
        if (r0 != null) {
            r0.A00.A01.remove(this);
        }
        C13710nw.A01(r2);
        return r2;
    }

    private final void zab(C108395Nu r6) {
        this.zaj = r6;
        this.zak = r6.AGH();
        this.zaf.countDown();
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C53212fE) arrayList.get(i2)).AOr(this.zak);
        }
        this.zag.clear();
    }

    public final void addStatusListener(C53212fE r7) {
        synchronized (this.zae) {
            if (this.zaf.getCount() == 0) {
                r7.AOr(this.zak);
            } else {
                this.zag.add(r7);
            }
        }
    }

    public final C108395Nu await() {
        C13710nw.A06("await must not be called on the UI thread");
        C13710nw.A04("Result has already been consumed", !this.zal);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.A08);
        }
        boolean z2 = false;
        if (this.zaf.getCount() == 0) {
            z2 = true;
        }
        C13710nw.A04("Result is not ready.", z2);
        return zaa();
    }

    public final C108395Nu await(long j2, TimeUnit timeUnit) {
        C13710nw.A04("Result has already been consumed.", !this.zal);
        try {
            if (!this.zaf.await(0, timeUnit)) {
                forceFailureUnlessReady(Status.A0A);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.A08);
        }
        boolean z2 = false;
        if (this.zaf.getCount() == 0) {
            z2 = true;
        }
        C13710nw.A04("Result is not ready.", z2);
        return zaa();
    }

    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                this.zam = true;
                zab(createFailedResult(Status.A05));
            }
        }
    }

    public abstract C108395Nu createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (this.zaf.getCount() != 0) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    public final void setResult(C108395Nu r8) {
        synchronized (this.zae) {
            if (!this.zan && !this.zam) {
                this.zaf.getCount();
                boolean z2 = false;
                if (this.zaf.getCount() == 0) {
                    z2 = true;
                }
                C13710nw.A04("Results have already been set", !z2);
                C13710nw.A04("Result has already been consumed", !this.zal);
                zab(r8);
            }
        }
    }

    public final void zak() {
        boolean z2 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z2 = false;
        }
        this.zaq = z2;
    }
}

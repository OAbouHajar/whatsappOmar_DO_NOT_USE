package com.obwhatsapp.companiondevice.sync;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass02O;
import X.AnonymousClass0RE;
import X.AnonymousClass1RS;
import X.AnonymousClass1WE;
import X.C16150sX;
import X.C16320sq;
import X.C23321Bn;
import X.C24931Hv;
import X.C29651ay;
import X.C29951bV;
import X.C29981bY;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.facebook.redex.IDxExecutorShape280S0100000_2_I0;
import com.facebook.redex.IDxNConsumerShape153S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class HistorySyncWorker extends AnonymousClass02O {
    public RunnableRunnableShape0S0400000_I0 A00;
    public AnonymousClass1WE A01;
    public Map A02 = Collections.emptyMap();
    public boolean A03 = false;
    public final C29951bV A04 = new C29951bV();
    public final C24931Hv A05;
    public final AnonymousClass1RS A06;
    public final C23321Bn A07;
    public final C16320sq A08;

    public HistorySyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
        this.A08 = r1.Ai4();
        C16150sX r12 = (C16150sX) r1;
        this.A07 = (C23321Bn) r12.ABl.get();
        this.A06 = (AnonymousClass1RS) r12.AF3.get();
        this.A05 = (C24931Hv) r12.ABk.get();
    }

    public C29981bY A00() {
        Log.i("HistorySyncWorker/getForegroundInfoAsync");
        C29951bV r3 = new C29951bV();
        this.A08.Acl(new RunnableRunnableShape4S0200000_I0_2(this, 20, r3));
        return r3;
    }

    public C29981bY A02() {
        Log.i("HistorySyncWorker/startWork");
        if (Build.VERSION.SDK_INT < 31 && this.A01 == null) {
            IDxNConsumerShape153S0100000_2_I0 iDxNConsumerShape153S0100000_2_I0 = new IDxNConsumerShape153S0100000_2_I0(this, 3);
            this.A01 = iDxNConsumerShape153S0100000_2_I0;
            this.A06.A05(iDxNConsumerShape153S0100000_2_I0, new IDxExecutorShape280S0100000_2_I0(this.A08, 2));
        }
        C23321Bn r3 = this.A07;
        this.A00 = new RunnableRunnableShape0S0400000_I0(new C29651ay(this), this.A06, r3);
        this.A08.Acl(new RunnableRunnableShape6S0100000_I0_5(this, 22));
        return this.A04;
    }

    public void A03() {
        Log.i("HistorySyncWorker/onStopped");
        AnonymousClass1WE r1 = this.A01;
        if (r1 != null) {
            this.A06.A00.A02(r1);
        }
        RunnableRunnableShape0S0400000_I0 runnableRunnableShape0S0400000_I0 = this.A00;
        if (runnableRunnableShape0S0400000_I0 != null) {
            ((AtomicBoolean) runnableRunnableShape0S0400000_I0.A01).set(true);
        }
    }

    public final void A04() {
        if (Build.VERSION.SDK_INT < 31 && !this.A03) {
            synchronized (this) {
                if (this.A03) {
                    Log.w("HistorySyncWorker/publishNotification skip setForegroundAsync");
                } else {
                    try {
                        C24931Hv r1 = this.A05;
                        AnonymousClass0RE r3 = new AnonymousClass0RE(230176025, r1.A00(r1.A01(this.A02)).A01(), 0);
                        WorkerParameters workerParameters = this.A01;
                        workerParameters.A02.Ady(this.A00, r3, workerParameters.A08);
                    } catch (IllegalStateException unused) {
                        Log.w("HistorySyncWorker/publishNotification cannot start foreground notification in background");
                    }
                }
            }
        }
    }
}

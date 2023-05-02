package com.obwhatsapp.service;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass02O;
import X.AnonymousClass02Q;
import X.AnonymousClass0H9;
import X.AnonymousClass1NO;
import X.C100004uw;
import X.C14870pt;
import X.C16150sX;
import X.C16600tK;
import X.C18260wP;
import X.C19090xk;
import X.C29981bY;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkerParameters;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

public class RestoreChatConnectionWorker extends AnonymousClass02O {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final AnonymousClass0H9 A01 = new AnonymousClass0H9();
    public final C14870pt A02;
    public final C16600tK A03;
    public final C18260wP A04;
    public final C19090xk A05;

    public RestoreChatConnectionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass01F r2 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
        C16150sX r1 = (C16150sX) r2;
        this.A02 = (C14870pt) r1.AB3.get();
        this.A05 = (C19090xk) r1.AF1.get();
        this.A03 = (C16600tK) r1.ARd.get();
        this.A04 = r2.A6a();
    }

    public C29981bY A02() {
        C16600tK r1 = this.A03;
        if (r1.A08()) {
            Log.i("RestoreChatConnectionWorker/doWork nothing to do");
            AnonymousClass0H9 r12 = this.A01;
            r12.A09(AnonymousClass02Q.A00());
            return r12;
        }
        C100004uw r2 = new C100004uw(this);
        r1.A02(r2);
        AnonymousClass0H9 r3 = this.A01;
        RunnableRunnableShape10S0200000_I0_8 runnableRunnableShape10S0200000_I0_8 = new RunnableRunnableShape10S0200000_I0_8(this, 27, r2);
        Executor executor = this.A02.A06;
        r3.A4b(runnableRunnableShape10S0200000_I0_8, executor);
        RunnableRunnableShape14S0100000_I0_13 runnableRunnableShape14S0100000_I0_13 = new RunnableRunnableShape14S0100000_I0_13((Object) this, 23);
        this.A00.postDelayed(runnableRunnableShape14S0100000_I0_13, AnonymousClass1NO.A0L);
        r3.A4b(new RunnableRunnableShape10S0200000_I0_8(this, 28, runnableRunnableShape14S0100000_I0_13), executor);
        this.A05.A0C((String) null, (String) null, 0, false, true, false, false, false, this.A04.A0B());
        return r3;
    }

    public void A03() {
        this.A01.cancel(true);
    }
}

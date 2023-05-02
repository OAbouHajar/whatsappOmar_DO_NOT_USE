package com.obwhatsapp.service;

import X.AnonymousClass006;
import X.AnonymousClass119;
import X.AnonymousClass1NO;
import X.AnonymousClass2SS;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.AnonymousClass55P;
import X.AnonymousClass55Q;
import X.AnonymousClass55R;
import X.C13690nt;
import X.C16320sq;
import X.C16900tq;
import X.C18940xV;
import X.C19090xk;
import X.C19150xq;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import com.whatsapp.util.Log;

public class UnsentMessagesNetworkAvailableJob extends JobService implements AnonymousClass006 {
    public JobParameters A00;
    public C19150xq A01;
    public C16900tq A02;
    public AnonymousClass119 A03;
    public C19090xk A04;
    public C16320sq A05;
    public boolean A06;
    public final Handler A07;
    public final C18940xV A08;
    public final Object A09;
    public final Runnable A0A;
    public volatile AnonymousClass54I A0B;

    public UnsentMessagesNetworkAvailableJob() {
        this(0);
        this.A07 = new Handler();
        this.A08 = new AnonymousClass2SS(this);
        this.A0A = new AnonymousClass55R(this);
    }

    public UnsentMessagesNetworkAvailableJob(int i2) {
        this.A09 = C13690nt.A0Y();
        this.A06 = false;
    }

    public static /* synthetic */ void A04(UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob) {
        C16900tq r0 = unsentMessagesNetworkAvailableJob.A02;
        r0.A04();
        if (!r0.A01 || !unsentMessagesNetworkAvailableJob.A03.A03()) {
            JobParameters jobParameters = unsentMessagesNetworkAvailableJob.A00;
            if (jobParameters != null) {
                unsentMessagesNetworkAvailableJob.jobFinished(jobParameters, false);
                unsentMessagesNetworkAvailableJob.A00 = null;
                return;
            }
            return;
        }
        Handler handler = unsentMessagesNetworkAvailableJob.A07;
        handler.post(new AnonymousClass55P(unsentMessagesNetworkAvailableJob));
        Log.i("Unsent messages found, scheduling timeout task");
        handler.postDelayed(unsentMessagesNetworkAvailableJob.A0A, AnonymousClass1NO.A0L);
        unsentMessagesNetworkAvailableJob.A04.A0C((String) null, (String) null, 0, false, true, false, false, false, false);
    }

    public static /* synthetic */ void A05(UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob) {
        unsentMessagesNetworkAvailableJob.A01.A03(unsentMessagesNetworkAvailableJob.A08);
        JobParameters jobParameters = unsentMessagesNetworkAvailableJob.A00;
        if (jobParameters != null) {
            unsentMessagesNetworkAvailableJob.jobFinished(jobParameters, false);
            unsentMessagesNetworkAvailableJob.A00 = null;
        }
    }

    public static /* synthetic */ void A06(UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob) {
        JobParameters jobParameters = unsentMessagesNetworkAvailableJob.A00;
        if (jobParameters != null) {
            unsentMessagesNetworkAvailableJob.jobFinished(jobParameters, false);
            unsentMessagesNetworkAvailableJob.A00 = null;
        }
    }

    public final Object generatedComponent() {
        if (this.A0B == null) {
            synchronized (this.A09) {
                if (this.A0B == null) {
                    this.A0B = new AnonymousClass54I(this);
                }
            }
        }
        return this.A0B.generatedComponent();
    }

    public void onCreate() {
        Log.i("UnsentMessagesNetworkAvailableJob/onCreate");
        if (!this.A06) {
            this.A06 = true;
            ((AnonymousClass54H) generatedComponent()).A01(this);
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("UnsentMessagesNetworkAvailableJob/onDestroy");
        super.onDestroy();
    }

    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters.getJobId() != 6 || this.A00 != null) {
            return false;
        }
        this.A00 = jobParameters;
        this.A05.Acl(new AnonymousClass55Q(this));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.A00 == null) {
            return true;
        }
        this.A01.A03(this.A08);
        this.A07.removeCallbacks(this.A0A);
        this.A00 = null;
        return true;
    }
}

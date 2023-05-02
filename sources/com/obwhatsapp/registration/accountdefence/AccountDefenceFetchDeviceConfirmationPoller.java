package com.obwhatsapp.registration.accountdefence;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass1KP;
import X.AnonymousClass1WA;
import X.AnonymousClass4L4;
import X.C003501o;
import X.C15860rz;
import X.C16320sq;
import X.C16440t3;
import X.C16980tz;
import X.C84844Mc;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public class AccountDefenceFetchDeviceConfirmationPoller implements C003501o {
    public long A00;
    public AnonymousClass1WA A01;
    public final AnonymousClass01V A02;
    public final C16440t3 A03;
    public final C16980tz A04;
    public final C15860rz A05;
    public final AnonymousClass1KP A06;
    public final C16320sq A07;
    public final AtomicBoolean A08 = new AtomicBoolean(true);

    public AccountDefenceFetchDeviceConfirmationPoller(AnonymousClass01V r3, C16440t3 r4, C16980tz r5, C15860rz r6, AnonymousClass1KP r7, C16320sq r8) {
        this.A03 = r4;
        this.A04 = r5;
        this.A07 = r8;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
    }

    public synchronized void A00() {
        Log.i("FetchDeviceConfirmationPoller/onRequestComplete/stopPolling");
        this.A08.set(true);
        AnonymousClass1WA r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public final synchronized void A01(C84844Mc r7, AnonymousClass4L4 r8) {
        int i2;
        if (this.A08.get()) {
            Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of app lifecycle");
        } else if (r7 == null || (i2 = r7.A00) == 1 || i2 == 13 || i2 == 11) {
            Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of terminal result");
        } else if (System.currentTimeMillis() - this.A00 > 900000) {
            Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of timeout");
        } else {
            AnonymousClass00B.A06(r7);
            int i3 = 5000;
            if (i2 == 12) {
                i3 = 8000;
            }
            double d2 = (double) i3;
            double d3 = 0.8d * d2;
            long random = (long) ((Math.random() * ((d2 * 1.2d) - d3)) + d3);
            StringBuilder sb = new StringBuilder("FetchDeviceConfirmationPoller/onRequestComplete/scheduleNextRequest nextDelay: ");
            sb.append(random);
            Log.i(sb.toString());
            this.A01.A00();
            this.A01.A02(new RunnableRunnableShape10S0200000_I0_8(this, 21, r8), random);
        }
        A00();
    }
}

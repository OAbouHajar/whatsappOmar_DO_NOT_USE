package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

/* renamed from: X.0xw  reason: invalid class name and case insensitive filesystem */
public class C19210xw {
    public final Handler A00;
    public final C16600tK A01;
    public final AnonymousClass01V A02;
    public final C16980tz A03;
    public final AnonymousClass2IC A04;
    public final C14850pr A05;
    public final AnonymousClass1HC A06;
    public final C19490yW A07;
    public final C16320sq A08;

    public C19210xw(C16600tK r11, AnonymousClass1HT r12, C210712r r13, AnonymousClass01V r14, C16440t3 r15, C16980tz r16, C14850pr r17, AnonymousClass1HC r18, C19490yW r19, C16320sq r20) {
        C16980tz r6 = r16;
        this.A03 = r6;
        this.A08 = r20;
        this.A02 = r14;
        C14850pr r8 = r17;
        this.A05 = r8;
        this.A01 = r11;
        AnonymousClass1HC r9 = r18;
        this.A06 = r9;
        C19490yW r0 = r19;
        this.A07 = r0;
        AnonymousClass1HT r2 = r12;
        C210712r r3 = r13;
        this.A04 = new AnonymousClass2IC(r2, r3, r14, r15, r6, this, r8, r9);
        this.A00 = new Handler(Looper.getMainLooper(), new AnonymousClass2ID(this, r0));
    }

    public void A00() {
        C14850pr r5 = this.A05;
        if (r5.A00 == 1) {
            r5.A00 = 2;
            AnonymousClass2IC r7 = this.A04;
            PendingIntent A012 = C42341xd.A01(r7.A04.A00, 0, new Intent("com.obwhatsapp.alarm.AVAILABLE_TIMEOUT").setPackage("com.obwhatsapp"), 134217728);
            if (!r7.A01.A02(A012, 2, SystemClock.elapsedRealtime() + 15000)) {
                Log.w("AvailabilityTimeoutAlarmBroadcastReceiver/startAvailableTimeoutAlarm AlarmManager is null");
            }
        }
        StringBuilder sb = new StringBuilder("presencestatemanager/startTransitionToUnavailable/new-state ");
        sb.append(r5);
        Log.i(sb.toString());
    }

    public final void A01(boolean z2) {
        if (yo.yoHideSeen()) {
            z2 = false;
        }
        Context context = this.A03.A00;
        C19490yW r3 = this.A07;
        AnonymousClass01V r1 = this.A02;
        AnonymousClass00B.A01();
        if (C33761j7.A04) {
            boolean z3 = !C33761j7.A00(r1);
            C33761j7.A04 = z3;
            StringBuilder sb = new StringBuilder("ScreenLockReceiver manual check; locked=");
            sb.append(z3);
            Log.i(sb.toString());
            r3.A04(C33761j7.A04);
        }
        C14850pr r5 = this.A05;
        int i2 = r5.A00;
        if (i2 != 1) {
            if (i2 == 2) {
                this.A04.A00();
                r5.A00 = 1;
            } else if (z2) {
                r5.A00 = 1;
                C16600tK r32 = this.A01;
                if (r32.A03 != 1) {
                    this.A06.A00();
                }
                if (!r32.A08()) {
                    this.A08.Ack(new AnonymousClass2IE(context, r32), new Void[0]);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("presencestatemanager/setAvailable/new-state: ");
        sb2.append(r5);
        sb2.append(" setIfUnavailable:");
        sb2.append(z2);
        Log.i(sb2.toString());
    }
}

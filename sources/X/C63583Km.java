package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: X.3Km  reason: invalid class name and case insensitive filesystem */
public final class C63583Km extends BroadcastReceiver implements Runnable {
    public final Handler A00;
    public final AnonymousClass5L2 A01;
    public final /* synthetic */ AnonymousClass4G4 A02;

    public C63583Km(Handler handler, AnonymousClass5L2 r2, AnonymousClass4G4 r3) {
        this.A02 = r3;
        this.A00 = handler;
        this.A01 = r2;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.A00.post(this);
        }
    }

    public void run() {
    }
}

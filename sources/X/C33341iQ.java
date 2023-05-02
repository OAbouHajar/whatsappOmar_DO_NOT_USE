package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.1iQ  reason: invalid class name and case insensitive filesystem */
public class C33341iQ extends BroadcastReceiver {
    public final /* synthetic */ C19510yY A00;

    public C33341iQ(C19510yY r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            for (C19610yi A04 : this.A00.A01) {
                A04.A04();
            }
        }
    }
}

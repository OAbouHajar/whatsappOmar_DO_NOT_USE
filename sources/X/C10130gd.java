package X;

import android.content.Intent;
import android.content.IntentSender;

/* renamed from: X.0gd  reason: invalid class name and case insensitive filesystem */
public class C10130gd implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IntentSender.SendIntentException A01;
    public final /* synthetic */ AnonymousClass05R A02;

    public C10130gd(IntentSender.SendIntentException sendIntentException, AnonymousClass05R r2, int i2) {
        this.A02 = r2;
        this.A00 = i2;
        this.A01 = sendIntentException;
    }

    public void run() {
        this.A02.A05(new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.A01), this.A00, 0);
    }
}

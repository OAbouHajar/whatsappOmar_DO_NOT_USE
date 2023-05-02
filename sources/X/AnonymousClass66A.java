package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.66A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66A implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ AnonymousClass66A(Activity activity, UserJid userJid) {
        this.A00 = activity;
        this.A01 = userJid;
    }

    public final void run() {
        Activity activity = this.A00;
        activity.startActivity(C14750ph.A0Z(activity, this.A01, (Integer) null, true));
    }
}

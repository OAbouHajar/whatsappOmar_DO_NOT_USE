package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.66m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1216966m implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C119965zu A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C1216966m(Activity activity, UserJid userJid, C119965zu r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = activity;
        this.A01 = userJid;
    }

    public final void run() {
        C119965zu r0 = this.A02;
        String str = this.A03;
        Activity activity = this.A00;
        UserJid userJid = this.A01;
        ((C23181Au) r0.A0D.get()).A00(C34861kz.A0D, str);
        AnonymousClass5xT.A00(new AnonymousClass66A(activity, userJid));
    }
}

package X;

import android.app.Activity;
import android.os.Looper;

/* renamed from: X.0yZ  reason: invalid class name and case insensitive filesystem */
public class C19520yZ extends C19530ya {
    public final AnonymousClass2KL A00;
    public final C19210xw A01;

    public C19520yZ(C19210xw r3, C19490yW r4) {
        this.A01 = r3;
        this.A00 = new AnonymousClass2KL(Looper.getMainLooper(), r3, r4);
    }

    public void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        AnonymousClass2KL r2 = this.A00;
        if (r2.hasMessages(0)) {
            r2.removeMessages(0);
        }
        this.A01.A00();
    }

    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        if (activity instanceof C14530pL ? ((C14530pL) activity).A0C : activity instanceof AnonymousClass2KM) {
            this.A00.sendEmptyMessageDelayed(0, 3000);
        }
    }
}

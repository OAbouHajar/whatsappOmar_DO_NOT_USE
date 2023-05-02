package X;

import android.app.Activity;

/* renamed from: X.4ui  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C99864ui implements AnonymousClass2Sv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C99864ui(Activity activity, String str, int i2) {
        this.A01 = activity;
        this.A02 = str;
        this.A00 = i2;
    }

    public final void AOW() {
        Activity activity = this.A01;
        activity.startActivity(C14750ph.A0g(activity.getApplicationContext(), this.A02, this.A00));
    }
}

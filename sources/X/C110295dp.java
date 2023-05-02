package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.5dp  reason: invalid class name and case insensitive filesystem */
public class C110295dp extends OrientationEventListener {
    public final /* synthetic */ C119575yh A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110295dp(Context context, C119575yh r2) {
        super(context);
        this.A00 = r2;
    }

    public void onOrientationChanged(int i2) {
        int i3 = ((((i2 + 45) + 360) / 90) % 4) * 90;
        C119575yh r2 = this.A00;
        int A02 = r2.A02();
        if (r2.A03 != i3 || r2.A04 != A02) {
            r2.A03 = i3;
            r2.A0N.AUH(i3);
            r2.A09(r2.A08);
        }
    }
}

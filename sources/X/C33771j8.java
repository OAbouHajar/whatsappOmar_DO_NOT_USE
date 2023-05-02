package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.1j8  reason: invalid class name and case insensitive filesystem */
public class C33771j8 extends BroadcastReceiver {
    public final C14770pj A00;
    public final Object A01 = new Object();
    public volatile boolean A02 = false;

    public C33771j8(C14770pj r2) {
        this.A00 = r2;
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    AnonymousClass2IF.A01(context);
                    this.A02 = true;
                }
            }
        }
        boolean booleanExtra = intent.getBooleanExtra("noPopup", true);
        boolean booleanExtra2 = intent.getBooleanExtra("isAndroidWearRefresh", false);
        this.A00.A0D(AnonymousClass1yL.A02(intent), booleanExtra, booleanExtra2);
    }
}

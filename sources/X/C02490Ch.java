package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: X.0Ch  reason: invalid class name and case insensitive filesystem */
public class C02490Ch extends C05510Rv {
    public final PowerManager A00;
    public final /* synthetic */ AnonymousClass06G A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C02490Ch(Context context, AnonymousClass06G r4) {
        super(r4);
        this.A01 = r4;
        this.A00 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public int A00() {
        return (Build.VERSION.SDK_INT < 21 || !AnonymousClass0L0.A00(this.A00)) ? 1 : 2;
    }

    public IntentFilter A01() {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    public void A04() {
        this.A01.A0V(true);
    }
}

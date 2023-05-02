package X;

import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;

/* renamed from: X.1HW  reason: invalid class name */
public class AnonymousClass1HW extends C16580tI {
    public final AnonymousClass01V A00;
    public volatile Boolean A01;

    public AnonymousClass1HW(AnonymousClass01V r1) {
        this.A00 = r1;
    }

    public void A04(boolean z2) {
        this.A01 = Boolean.valueOf(z2);
        Iterator it = A01().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onPowerSaveModeChange");
        }
    }

    public boolean A05() {
        Boolean bool;
        if (this.A01 == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                PowerManager A0I = this.A00.A0I();
                bool = A0I == null ? Boolean.TRUE : Boolean.valueOf(A0I.isPowerSaveMode());
            } else {
                bool = Boolean.FALSE;
            }
            this.A01 = bool;
        }
        return this.A01.booleanValue();
    }
}

package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.3ok  reason: invalid class name and case insensitive filesystem */
public class C73693ok extends C616339r {
    public C73693ok(C16980tz r1, AnonymousClass013 r2) {
        super(r1, r2);
    }

    public int A00(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.dimen00cc);
    }

    public int A01(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.dimen0770);
    }

    public int A02(Context context) {
        if (this instanceof C73673oi) {
            return (int) (Math.max(1.0f, context.getResources().getDisplayMetrics().density) * 24.0f);
        }
        return 0;
    }

    public int A03(Context context) {
        return 0;
    }

    public boolean A04() {
        return false;
    }

    public boolean A06() {
        return this.A02.A0T();
    }

    public boolean A07() {
        return true;
    }

    public boolean A08() {
        return true;
    }

    public boolean A09() {
        return C13680ns.A1Z(this.A02);
    }

    public boolean A0A() {
        return true;
    }
}

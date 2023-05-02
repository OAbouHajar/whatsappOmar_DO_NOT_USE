package X;

import android.content.Context;
import android.graphics.Paint;
import com.obwhatsapp.R;

/* renamed from: X.39r  reason: invalid class name and case insensitive filesystem */
public class C616339r {
    public final Paint A00;
    public final C16980tz A01;
    public final AnonymousClass013 A02;

    public C616339r(C16980tz r4, AnonymousClass013 r5) {
        Paint A05 = C13700nu.A05();
        this.A00 = A05;
        this.A01 = r4;
        this.A02 = r5;
        C13690nt.A0n(C16980tz.A00(r4).getColor(R.color.color018c), A05);
        A05.setAntiAlias(true);
    }

    public int A00(Context context) {
        return 0;
    }

    public int A01(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.dimen0583);
    }

    public int A02(Context context) {
        return Math.max(1, (int) (C13680ns.A01(context) / 2.0f));
    }

    public int A03(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.dimen06ea);
    }

    public boolean A04() {
        return true;
    }

    public boolean A05() {
        return false;
    }

    public boolean A06() {
        return C13680ns.A1Z(this.A02);
    }

    public boolean A07() {
        return false;
    }

    public boolean A08() {
        return false;
    }

    public boolean A09() {
        return this.A02.A0T();
    }

    public boolean A0A() {
        return false;
    }
}

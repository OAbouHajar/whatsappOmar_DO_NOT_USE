package X;

import android.view.View;

/* renamed from: X.4kW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94194kW implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C55552jq A01;

    public /* synthetic */ C94194kW(C55552jq r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public final boolean onLongClick(View view) {
        C55552jq r2 = this.A01;
        int i2 = this.A00;
        if (r2.A06 == null || r2.A0K(i2) || !((AnonymousClass4WQ) r2.A06.get(i2)).A01 || r2.A04.A04.isEmpty()) {
            return false;
        }
        return r2.A0J(i2);
    }
}

package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.4lb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94864lb implements TextView.OnEditorActionListener {
    public final /* synthetic */ C55602k1 A00;
    public final /* synthetic */ C102834zb A01;

    public /* synthetic */ C94864lb(C55602k1 r1, C102834zb r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        C55602k1 r3 = this.A00;
        C102834zb r2 = this.A01;
        if (i2 != 6) {
            return false;
        }
        r3.A04.A05(r3.A06);
        r2.A04.A03 = textView.getText().toString();
        r2.dismiss();
        return true;
    }
}

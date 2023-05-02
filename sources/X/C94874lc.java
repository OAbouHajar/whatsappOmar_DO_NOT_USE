package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.4lc  reason: invalid class name and case insensitive filesystem */
public class C94874lc implements TextView.OnEditorActionListener {
    public final /* synthetic */ C14990q7 A00;
    public final /* synthetic */ C59112uh A01;
    public final /* synthetic */ C31201dg A02;
    public final /* synthetic */ C14930q1 A03;

    public C94874lc(C14990q7 r1, C59112uh r2, C31201dg r3, C14930q1 r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
    }

    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        C14930q1 r5 = this.A03;
        if (r5 == null) {
            return false;
        }
        C14940q2 r0 = new C14940q2();
        C31201dg r2 = this.A02;
        r0.A03(r2, 0);
        C14990q7 r1 = this.A00;
        r0.A03(r1, 1);
        C29701b3.A01(r1, r2, r0.A01(), r5);
        return true;
    }
}

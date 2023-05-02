package X;

import android.widget.EditText;

/* renamed from: X.0hC  reason: invalid class name and case insensitive filesystem */
public class C10480hC implements Runnable {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C14990q7 A01;
    public final /* synthetic */ AnonymousClass38S A02;
    public final /* synthetic */ C31201dg A03;
    public final /* synthetic */ C14930q1 A04;

    public C10480hC(EditText editText, C14990q7 r2, AnonymousClass38S r3, C31201dg r4, C14930q1 r5) {
        this.A02 = r3;
        this.A00 = editText;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
    }

    public void run() {
        if (this.A02.A0P) {
            EditText editText = this.A00;
            C31201dg r4 = this.A03;
            C14930q1 r3 = this.A04;
            C14940q2 r2 = new C14940q2();
            r2.A03(editText.getText().toString(), 0);
            editText.setText((CharSequence) C29701b3.A01(this.A01, r4, r2.A01(), r3));
        }
    }
}

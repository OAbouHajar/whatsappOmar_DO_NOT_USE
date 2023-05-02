package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.4jk  reason: invalid class name and case insensitive filesystem */
public class C93774jk implements InputFilter {
    public final /* synthetic */ C14990q7 A00;
    public final /* synthetic */ C59112uh A01;
    public final /* synthetic */ C31201dg A02;
    public final /* synthetic */ C14930q1 A03;

    public C93774jk(C14990q7 r1, C59112uh r2, C31201dg r3, C14930q1 r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }

    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        String obj = spanned.toString();
        StringBuffer stringBuffer = new StringBuffer(obj);
        stringBuffer.replace(i4, i5, charSequence.toString());
        C14940q2 r2 = new C14940q2();
        r2.A03(obj, 0);
        r2.A03(stringBuffer.toString(), 1);
        C14950q3 A012 = r2.A01();
        if (C89554cQ.A02(C29701b3.A01(this.A00, this.A02, A012, this.A03))) {
            return null;
        }
        return spanned.subSequence(i4, i5);
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.3Tz  reason: invalid class name and case insensitive filesystem */
public class C65273Tz extends AnonymousClass3BJ implements C108195Na {
    public static AnonymousClass5SJ A0B = new C95854nO();
    public static AnonymousClass5SJ A0C = new C95864nP();
    public static AnonymousClass5SJ A0D = new C95874nQ();
    public static AnonymousClass5SJ A0E = new C95884nR();
    public int A00 = -1;
    public int A01 = 0;
    public int A02;
    public long A03;
    public Drawable A04;
    public Drawable A05;
    public View.OnClickListener A06;
    public C31201dg A07;
    public C83424Gp A08;
    public boolean A09 = true;
    public final C14990q7 A0A;

    public C65273Tz(C14990q7 r6, long j2, boolean z2) {
        super(AnonymousClass416.VIEW);
        this.A03 = j2;
        A06(new C88574aj(A0B, this), new C88574aj(A0C, this), new C88574aj(A0E, this), new C88574aj(A0D, this));
        this.A02 = 0;
        this.A08 = new C83424Gp();
        this.A0A = r6;
        A06(new C88574aj(new C96094nm(), this), new C88574aj(new C96014ne(), this));
        if (!z2) {
            A05(new C88574aj(new C96054ni(this), this));
        }
    }

    public long A03() {
        return this.A03;
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        return new C65233Tv(context);
    }
}

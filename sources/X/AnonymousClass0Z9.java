package X;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: X.0Z9  reason: invalid class name */
public class AnonymousClass0Z9 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C03540Ix A01;
    public final /* synthetic */ C14990q7 A02;
    public final /* synthetic */ C31201dg A03;
    public final /* synthetic */ C14930q1 A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public AnonymousClass0Z9(View view, C03540Ix r2, C14990q7 r3, C31201dg r4, C14930q1 r5, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A06 = z2;
        this.A00 = view;
        this.A05 = z3;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        if (this.A06) {
            C13330lr r1 = (C13330lr) this.A00;
            r1.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            r1.setChecked(this.A05);
            r1.setOnCheckedChangeListener(this);
        }
        C14930q1 r5 = this.A04;
        if (r5 != null) {
            C14990q7 r4 = this.A02;
            C90154da.A01(r4.A01().A01());
            C31201dg r3 = this.A03;
            C14940q2 r2 = new C14940q2();
            r2.A03(r3, 0);
            r2.A03(Boolean.valueOf(z2), 1);
            r2.A03(r4, 2);
            C29701b3.A01(r4, r3, r2.A01(), r5);
        }
    }
}

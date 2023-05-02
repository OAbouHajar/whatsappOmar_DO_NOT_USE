package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0hS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10640hS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DialogFragment A01;
    public final /* synthetic */ C001000l A02;
    public final /* synthetic */ C05280Qa A03;
    public final /* synthetic */ C14990q7 A04;
    public final /* synthetic */ AnonymousClass2Wa A05;
    public final /* synthetic */ C31201dg A06;
    public final /* synthetic */ C14930q1 A07;
    public final /* synthetic */ AnonymousClass4DF A08;
    public final /* synthetic */ String A09;

    public /* synthetic */ C10640hS(DialogFragment dialogFragment, C001000l r2, C05280Qa r3, C14990q7 r4, AnonymousClass2Wa r5, C31201dg r6, C14930q1 r7, AnonymousClass4DF r8, String str, int i2) {
        this.A02 = r2;
        this.A01 = dialogFragment;
        this.A09 = str;
        this.A03 = r3;
        this.A08 = r8;
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = r6;
        this.A00 = i2;
        this.A07 = r7;
    }

    public static C05070Pd A00(Context context, DialogFragment dialogFragment, C05280Qa r2, AnonymousClass2Wa r3, AnonymousClass4DF r4, String str) {
        return AnonymousClass0T0.A00(context, dialogFragment, r2, r3, r4, str);
    }

    public static /* synthetic */ void A02(DialogFragment dialogFragment, C001000l r7, C05280Qa r8, C14990q7 r9, AnonymousClass2Wa r10, C31201dg r11, C14930q1 r12, AnonymousClass4DF r13, String str, int i2) {
        DialogFragment dialogFragment2 = dialogFragment;
        ((C13550mZ) dialogFragment2).AZs(A00(r7, dialogFragment2, r8, r10, r13, str), r9, r11, r12, i2);
    }

    public final void run() {
        C001000l r1 = this.A02;
        DialogFragment dialogFragment = this.A01;
        String str = this.A09;
        C05280Qa r2 = this.A03;
        AnonymousClass4DF r7 = this.A08;
        AnonymousClass2Wa r4 = this.A05;
        A02(dialogFragment, r1, r2, this.A04, r4, this.A06, this.A07, r7, str, this.A00);
    }
}

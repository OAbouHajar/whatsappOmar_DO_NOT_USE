package X;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3FN  reason: invalid class name */
public class AnonymousClass3FN implements AnonymousClass5PK {
    public final View A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C16000sG A03;
    public final C16080sP A04;
    public final AnonymousClass2Ao A05;
    public final AnonymousClass1B5 A06;
    public final C19610yi A07;
    public final C15860rz A08;
    public final AnonymousClass013 A09;
    public final C14710pd A0A;
    public final C16320sq A0B;
    public final AnonymousClass01D A0C;
    public final WeakReference A0D;

    public AnonymousClass3FN(Activity activity, View view, C14870pt r4, C16040sK r5, C16000sG r6, C16080sP r7, AnonymousClass2Ao r8, AnonymousClass1B5 r9, C19610yi r10, C15860rz r11, AnonymousClass013 r12, C14710pd r13, C16320sq r14, AnonymousClass01D r15) {
        this.A0A = r13;
        this.A00 = view;
        this.A06 = r9;
        this.A07 = r10;
        this.A0C = r15;
        this.A01 = r4;
        this.A0D = C13690nt.A0h(activity);
        this.A09 = r12;
        this.A05 = r8;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A0B = r14;
        this.A08 = r11;
    }

    public void AUn(int i2) {
        C19610yi r0 = this.A07;
        C38701rH A012 = r0.A01();
        AnonymousClass2DT A002 = r0.A00();
        if (A002 != null && A012 != null) {
            this.A0B.Acl(new C63373Hr(this, A012, 0, i2, A002.A0T));
        }
    }
}

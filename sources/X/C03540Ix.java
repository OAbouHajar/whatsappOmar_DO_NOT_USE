package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;

/* renamed from: X.0Ix  reason: invalid class name and case insensitive filesystem */
public class C03540Ix extends C65253Tx {
    public C03540Ix(C14990q7 r1, C31201dg r2) {
        super(r1, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r15.A0P(58, false) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(android.view.View r20, X.C14990q7 r21, X.C31201dg r22, java.lang.Object r23) {
        /*
            r19 = this;
            r0 = 35
            r1 = 0
            r15 = r22
            boolean r3 = r15.A0P(r0, r1)
            r0 = 51
            boolean r0 = r15.A0P(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x001c
            r0 = 58
            boolean r0 = r15.A0P(r0, r1)
            r17 = 0
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r17 = 1
        L_0x001e:
            r0 = 36
            X.0q1 r16 = r15.A0H(r0)
            r12 = r20
            r1 = r12
            X.0lr r1 = (X.C13330lr) r1
            r1.setChecked(r3)
            r0 = 38
            boolean r0 = r15.A0P(r0, r2)
            r12.setEnabled(r0)
            r14 = r21
            if (r17 != 0) goto L_0x003b
            if (r16 == 0) goto L_0x0047
        L_0x003b:
            r13 = r19
            X.0Z9 r11 = new X.0Z9
            r18 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r1.setOnCheckedChangeListener(r11)
        L_0x0047:
            android.content.Context r4 = r14.A00()
            r0 = 40
            X.1dg r0 = r15.A0G(r0)
            r5 = 0
            if (r0 != 0) goto L_0x0126
            r3 = r5
        L_0x0055:
            r0 = 41
            X.1dg r0 = r15.A0G(r0)
            if (r0 != 0) goto L_0x011c
            r6 = r5
        L_0x005e:
            r0 = 43
            X.1dg r0 = r15.A0G(r0)
            if (r0 != 0) goto L_0x0112
            r7 = r5
        L_0x0067:
            r0 = 48
            X.1dg r0 = r15.A0G(r0)
            if (r0 != 0) goto L_0x0108
            r8 = r5
        L_0x0070:
            r0 = 42
            X.1dg r0 = r15.A0G(r0)
            if (r0 != 0) goto L_0x00fe
            r9 = r5
        L_0x0079:
            r0 = 46
            X.1dg r0 = r15.A0G(r0)
            if (r0 != 0) goto L_0x00f5
            r10 = r5
        L_0x0082:
            r0 = 45
            X.1dg r0 = r15.A0G(r0)
            if (r0 != 0) goto L_0x00ec
            r11 = r5
        L_0x008b:
            r0 = 50
            X.1dg r0 = r15.A0G(r0)
            if (r0 != 0) goto L_0x00e3
            r12 = r5
        L_0x0094:
            r0 = 44
            X.1dg r0 = r15.A0G(r0)
            if (r0 != 0) goto L_0x00da
            r13 = r5
        L_0x009d:
            r0 = 49
            X.1dg r0 = r15.A0G(r0)
            if (r0 == 0) goto L_0x00ad
            int r0 = X.C87564Xk.A00(r14, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x00ad:
            if (r7 != 0) goto L_0x00d5
            if (r9 != 0) goto L_0x00d5
            if (r8 != 0) goto L_0x00b4
            r8 = r3
        L_0x00b4:
            if (r10 != 0) goto L_0x00b7
            r10 = r6
        L_0x00b7:
            android.content.res.ColorStateList r0 = X.AnonymousClass0Vn.A00(r4, r3, r6, r8, r10)
        L_0x00bb:
            r1.setThumbTintList(r0)
            if (r11 != 0) goto L_0x00d0
            if (r13 != 0) goto L_0x00d0
            if (r12 != 0) goto L_0x00c5
            r12 = r3
        L_0x00c5:
            if (r5 != 0) goto L_0x00c8
            r5 = r6
        L_0x00c8:
            android.content.res.ColorStateList r0 = X.AnonymousClass0Vn.A01(r4, r3, r6, r12, r5)
        L_0x00cc:
            r1.Aet(r0, r2)
            return
        L_0x00d0:
            android.content.res.ColorStateList r0 = X.AnonymousClass0Vn.A01(r4, r11, r13, r12, r5)
            goto L_0x00cc
        L_0x00d5:
            android.content.res.ColorStateList r0 = X.AnonymousClass0Vn.A00(r4, r7, r9, r8, r10)
            goto L_0x00bb
        L_0x00da:
            int r0 = X.C87564Xk.A00(r14, r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            goto L_0x009d
        L_0x00e3:
            int r0 = X.C87564Xk.A00(r14, r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            goto L_0x0094
        L_0x00ec:
            int r0 = X.C87564Xk.A00(r14, r0)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            goto L_0x008b
        L_0x00f5:
            int r0 = X.C87564Xk.A00(r14, r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            goto L_0x0082
        L_0x00fe:
            int r0 = X.C87564Xk.A00(r14, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            goto L_0x0079
        L_0x0108:
            int r0 = X.C87564Xk.A00(r14, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L_0x0070
        L_0x0112:
            int r0 = X.C87564Xk.A00(r14, r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x0067
        L_0x011c:
            int r0 = X.C87564Xk.A00(r14, r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            goto L_0x005e
        L_0x0126:
            int r0 = X.C87564Xk.A00(r14, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03540Ix.A07(android.view.View, X.0q7, X.1dg, java.lang.Object):void");
    }

    public final void A09(View view, C14990q7 r3, C31201dg r4, Object obj) {
        ((C13330lr) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        return new AnonymousClass0CH(context);
    }
}

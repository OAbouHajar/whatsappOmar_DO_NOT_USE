package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.obwhatsapp.R;

/* renamed from: X.30C  reason: invalid class name */
public class AnonymousClass30C extends C30511cT {
    public final C51312bQ A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass30C(X.C000900k r29, X.C25731Kx r30, X.C14870pt r31, X.C16040sK r32, X.C54602hp r33, X.AnonymousClass13V r34, X.AnonymousClass127 r35, X.C17160ud r36, X.C17140ub r37, X.C16080sP r38, X.AnonymousClass152 r39, X.AnonymousClass013 r40, X.C15810rt r41, X.C216114t r42, X.C16010sH r43, X.C17250um r44, X.C14710pd r45, X.C17240ul r46, X.AnonymousClass18R r47, X.C34841kx r48, X.C25781Lc r49, X.C16320sq r50) {
        /*
            r28 = this;
            r17 = 0
            r16 = r40
            r15 = r39
            r14 = r38
            r13 = r37
            r12 = r36
            r11 = r35
            r10 = r34
            r9 = r33
            r8 = r32
            r7 = r31
            r2 = r50
            r26 = r49
            r3 = r48
            r24 = r47
            r23 = r46
            r22 = r45
            r21 = r44
            r20 = r43
            r6 = r30
            r19 = r42
            r5 = r29
            r18 = r41
            r4 = r28
            r25 = r3
            r27 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.4xF r1 = new X.4xF
            r1.<init>(r4)
            X.2bQ r0 = new X.2bQ
            r0.<init>(r14, r1, r3, r2)
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30C.<init>(X.00k, X.1Kx, X.0pt, X.0sK, X.2hp, X.13V, X.127, X.0ud, X.0ub, X.0sP, X.152, X.013, X.0rt, X.14t, X.0sH, X.0um, X.0pd, X.0ul, X.18R, X.1kx, X.1Lc, X.0sq):void");
    }

    public void A04() {
        super.A04();
        this.A00.A00();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        this.A09.setText(R.string.str1785);
        C13680ns.A1B(this.A04, this, activity, 44);
        AnonymousClass2JP.A03(this.A04, R.string.str0014);
    }

    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        C51312bQ r3 = this.A00;
        C51302bP r2 = r3.A00;
        if (r2 != null) {
            r2.A06(false);
            Handler handler = r2.A00;
            if (handler != null) {
                handler.removeCallbacks(r2.A01);
            }
            r2.A00 = null;
            r2.A01 = null;
            r3.A00 = null;
        }
    }
}

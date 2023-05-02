package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;

/* renamed from: X.0J0  reason: invalid class name */
public class AnonymousClass0J0 extends C65253Tx {
    public AnonymousClass0J0(C14990q7 r1, C31201dg r2) {
        super(r1, r2);
    }

    public static void A00(AnonymousClass0CJ r6, C14990q7 r7, C31201dg r8) {
        C31201dg A0G = r8.A0G(35);
        int i2 = 24;
        int i3 = -16777216;
        if (A0G != null) {
            try {
                i2 = (int) C62163Bx.A03(A0G.A0J(36), 24.0f);
            } catch (AnonymousClass40K unused) {
            }
            C31201dg A0G2 = A0G.A0G(35);
            if (A0G2 != null) {
                i3 = C87564Xk.A00(r7, A0G2);
            }
        }
        AnonymousClass0Ah r2 = new AnonymousClass0Ah(r7.A00(), i3, i2);
        AnonymousClass0Ah r0 = null;
        if (r2 instanceof Animatable) {
            r0 = r2;
        }
        r6.A00 = r0;
        r6.setImageDrawable(r2);
        Animatable animatable = r6.A00;
        if (animatable != null) {
            animatable.start();
        }
        r6.A01 = true;
    }

    public /* bridge */ /* synthetic */ void A07(View view, C14990q7 r2, C31201dg r3, Object obj) {
        A00((AnonymousClass0CJ) view, r2, r3);
    }

    public /* bridge */ /* synthetic */ void A09(View view, C14990q7 r3, C31201dg r4, Object obj) {
        AnonymousClass0CJ r2 = (AnonymousClass0CJ) view;
        Animatable animatable = r2.A00;
        if (animatable != null) {
            animatable.stop();
        }
        r2.A01 = false;
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        return new AnonymousClass0CJ(context);
    }
}

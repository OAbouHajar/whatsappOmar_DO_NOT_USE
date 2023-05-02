package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;

/* renamed from: X.0Iz  reason: invalid class name and case insensitive filesystem */
public class C03560Iz extends C65253Tx {
    public C03560Iz(C14990q7 r1, C31201dg r2) {
        super(r1, r2);
    }

    public static void A00(AnonymousClass0CJ r14, C14990q7 r15, C31201dg r16) {
        float f2;
        C31201dg r3 = r16;
        int A0A = r3.A0A(40, 0);
        C31201dg A0G = r3.A0G(35);
        String A0K = r3.A0K(36, "4.0dp");
        C31201dg A0G2 = r3.A0G(41);
        C31201dg A0G3 = r3.A0G(38);
        String A0K2 = r3.A0K(42, "rectangle");
        C14990q7 r10 = r15;
        int A00 = A0G != null ? C87564Xk.A00(r15, A0G) : -1;
        try {
            f2 = C62163Bx.A01(A0K);
        } catch (AnonymousClass40K e2) {
            C29691b2.A02("CDSGlimmerViewUtils", e2);
            f2 = AnonymousClass0MV.A00(r15.A00(), 4.0f);
        }
        AnonymousClass0Ai r5 = new AnonymousClass0Ai(r14.getContext(), A0G2 != null ? new AnonymousClass0OC(A0G2.A08(36, 0.3f), A0G2.A08(35, 0.5f)) : new AnonymousClass0OC(0.3f, 0.5f), A0G3 != null ? new AnonymousClass0OC(A0G3.A08(36, 0.066f), A0G3.A08(35, 0.11f)) : new AnonymousClass0OC(0.066f, 0.11f), "circle".equalsIgnoreCase(A0K2) ? AnonymousClass0JY.CIRCLE : AnonymousClass0JY.RECTANGLE, r10, f2, A0A, A00);
        AnonymousClass0Ai r0 = null;
        if (r5 instanceof Animatable) {
            r0 = r5;
        }
        r14.A00 = r0;
        r14.setImageDrawable(r5);
        Animatable animatable = r14.A00;
        if (animatable != null) {
            animatable.start();
        }
        r14.A01 = true;
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

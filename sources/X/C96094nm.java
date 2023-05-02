package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewOutlineProvider;
import java.io.IOException;

/* renamed from: X.4nm  reason: invalid class name and case insensitive filesystem */
public class C96094nm implements AnonymousClass5SJ {
    public static int A00(C14990q7 r3, C31201dg r4) {
        String A0J;
        C31201dg A0G = r4.A0G(45);
        String A0J2 = r4.A0J(44);
        int A05 = A0J2 != null ? C62163Bx.A05(A0J2) : 0;
        if (A0G == null) {
            return A05;
        }
        try {
            String A0J3 = A0G.A0J(35);
            if ((A0J3 == null || C62163Bx.A05(A0J3) == 0) && ((A0J = A0G.A0J(36)) == null || C62163Bx.A05(A0J) == 0)) {
                return A05;
            }
        } catch (AnonymousClass40K unused) {
            C29691b2.A00("ThemedColorUtils", "Error parsing themed color");
        }
        return C87564Xk.A01(r3, A0G, 0);
    }

    public static void A01(C31201dg r13, C65233Tv r14, C65273Tz r15) {
        C14990q7 r4 = r15.A0A;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            C83424Gp r1 = r15.A08;
            r1.A00 = r14.getOutlineAmbientShadowColor();
            r1.A01 = r14.getOutlineSpotShadowColor();
        }
        float A03 = C62163Bx.A03(r13.A0J(48), 0.0f);
        if (A03 != 0.0f) {
            r14.setElevation(A03);
            r14.setOutlineProvider(new AnonymousClass3N6(r13));
            if (i2 >= 28) {
                if (r13.A0G(68) != null) {
                    int i3 = r15.A08.A00;
                    C31201dg A0G = r13.A0G(68);
                    if (A0G != null) {
                        i3 = C87564Xk.A01(r4, A0G, i3);
                    }
                    r14.setOutlineAmbientShadowColor(i3);
                }
                if (r13.A0G(69) != null) {
                    int i4 = r15.A08.A01;
                    C31201dg A0G2 = r13.A0G(69);
                    if (A0G2 != null) {
                        i4 = C87564Xk.A01(r4, A0G2, i4);
                    }
                    r14.setOutlineSpotShadowColor(i4);
                }
            }
        }
        float A032 = C62163Bx.A03(r13.A0J(46), 0.0f);
        int i5 = (A032 > 0.0f ? 1 : (A032 == 0.0f ? 0 : -1));
        if (r13.A0P(43, false)) {
            if (i5 != 0) {
                r14.setOutlineProvider(new AnonymousClass3NC(r13, A032));
                float A033 = C62163Bx.A03(r13.A0J(40), 0.0f);
                int A00 = C89544cP.A00(r13.A0N(56), 0);
                if (A033 != 0.0f || !C89544cP.A02(A00)) {
                    AnonymousClass4SJ r5 = r14.A00;
                    r5.A04 = true;
                    r5.A0B.setLayerType(2, (Paint) null);
                    r5.A00(C61833Ao.A02(r13.A0N(62)), A033, A032, C62163Bx.A03(r13.A0J(63), 0.0f), A00(r4, r13), C61833Ao.A00(r4, r13), A00);
                    return;
                }
                r14.setClipToOutline(true);
            }
        } else if (i5 != 0) {
            r14.setOutlineProvider(new AnonymousClass3N7(r13));
        }
    }

    public static void A02(C65233Tv r2, C65273Tz r3) {
        r2.setElevation(0.0f);
        r2.setClipToOutline(false);
        r2.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        if (Build.VERSION.SDK_INT >= 28) {
            C83424Gp r1 = r3.A08;
            r2.setOutlineAmbientShadowColor(r1.A00);
            r2.setOutlineSpotShadowColor(r1.A01);
        }
    }

    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        C49832Wc r2 = (C49832Wc) obj;
        C65273Tz r3 = (C65273Tz) obj2;
        C31201dg r4 = r3.A07;
        if (r4 != null) {
            try {
                if (Build.VERSION.SDK_INT <= 20) {
                    C14990q7 r5 = r3.A0A;
                    C65233Tv r22 = (C65233Tv) r2;
                    if (r4.A0P(43, false)) {
                        AnonymousClass4SJ r6 = r22.A00;
                        r6.A04 = true;
                        r6.A0B.setLayerType(2, (Paint) null);
                        int A00 = A00(r5, r4);
                        int A002 = C61833Ao.A00(r5, r4);
                        r6.A00(C61833Ao.A02(r4.A0N(62)), (float) ((int) C62163Bx.A03(r4.A0J(40), 0.0f)), (float) ((int) C62163Bx.A03(r4.A0J(46), 0.0f)), C62163Bx.A03(r4.A0J(63), 0.0f), A00, A002, C89544cP.A00(r4.A0N(56), 0));
                    }
                } else {
                    A01(r4, (C65233Tv) r2, r3);
                }
                Drawable drawable = r3.A05;
                Drawable drawable2 = r3.A04;
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
                if (drawable2 instanceof Animatable) {
                    ((Animatable) drawable2).start();
                }
            } catch (IOException e2) {
                C29691b2.A01("HostWithDecoratorRenderUnit", "Parse exception while binding Box Decoration", e2);
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        C49832Wc r5 = (C49832Wc) obj;
        C65273Tz r6 = (C65273Tz) obj2;
        if (r6.A07 != null) {
            C65233Tv r52 = (C65233Tv) r5;
            AnonymousClass4SJ r0 = r52.A00;
            r0.A04 = false;
            r0.A0B.setLayerType(0, (Paint) null);
            if (Build.VERSION.SDK_INT >= 21) {
                A02(r52, r6);
            }
            Drawable drawable = r6.A05;
            Drawable drawable2 = r6.A04;
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).stop();
            }
        }
    }
}

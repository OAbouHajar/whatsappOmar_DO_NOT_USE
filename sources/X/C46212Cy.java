package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Cy  reason: invalid class name and case insensitive filesystem */
public class C46212Cy {
    public static String A00(StringBuilder sb, Formatter formatter, long j2) {
        Object[] objArr;
        String str;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        long j3 = (j2 + 500) / 1000;
        long j4 = j3 % 60;
        long j5 = (j3 / 60) % 60;
        long j6 = j3 / 3600;
        sb.setLength(0);
        if (j6 > 0) {
            objArr = new Object[]{Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4)};
            str = "%d:%02d:%02d";
        } else {
            objArr = new Object[]{Long.valueOf(j5), Long.valueOf(j4)};
            str = "%02d:%02d";
        }
        return formatter.format(str, objArr).toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r20, android.graphics.Rect r21, android.graphics.Rect r22, android.view.View r23, android.widget.FrameLayout r24, X.C606734v r25, X.C55322jK r26, X.AnonymousClass2Cx r27, boolean r28, boolean r29) {
        /*
            r3 = 0
            r7 = r23
            r7.setPivotX(r3)
            r7.setPivotY(r3)
            java.util.List r16 = r27.getFullscreenControls()
            java.util.List r17 = r27.getInlineControls()
            android.content.res.Resources r1 = r20.getResources()
            r0 = 2131101586(0x7f060792, float:1.7815586E38)
            int r18 = r1.getColor(r0)
            android.content.res.Resources r1 = r20.getResources()
            r0 = 2131101820(0x7f06087c, float:1.781606E38)
            int r19 = r1.getColor(r0)
            r14 = 1065353216(0x3f800000, float:1.0)
            r5 = r28
            if (r29 == 0) goto L_0x0245
            r0 = r26
            if (r26 == 0) goto L_0x0245
            if (r28 == 0) goto L_0x0245
            float r1 = r0.A00
        L_0x0035:
            android.content.ContentResolver r2 = r20.getContentResolver()
            java.lang.String r0 = "animator_duration_scale"
            float r0 = android.provider.Settings.Global.getFloat(r2, r0, r3)
            r2 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r9 = r21
            r8 = r22
            r15 = r24
            r6 = r25
            if (r0 != 0) goto L_0x0084
            if (r29 == 0) goto L_0x0070
            int r0 = r9.left
            float r0 = (float) r0
            r7.setX(r0)
            int r0 = r9.top
            float r0 = (float) r0
            r7.setY(r0)
        L_0x005a:
            r7.setScaleX(r1)
            r7.setScaleY(r1)
            r7.requestLayout()
            if (r29 != 0) goto L_0x006f
            if (r28 == 0) goto L_0x006f
            if (r25 == 0) goto L_0x006f
            r6.A0M(r2)
            r6.A0H(r2)
        L_0x006f:
            return
        L_0x0070:
            int r0 = r8.left
            float r0 = (float) r0
            r7.setX(r0)
            int r0 = r8.top
            float r0 = (float) r0
            r7.setY(r0)
            if (r24 == 0) goto L_0x005a
            r20 = r5
            A03(r15, r16, r17, r18, r19, r20)
            goto L_0x005a
        L_0x0084:
            r10 = 1073741824(0x40000000, float:2.0)
            int r0 = r8.width()
            float r4 = (float) r0
            int r0 = r8.height()
            float r0 = (float) r0
            float r4 = r4 / r0
            int r0 = r9.width()
            float r3 = (float) r0
            int r0 = r9.height()
            float r0 = (float) r0
            float r3 = r3 / r0
            if (r28 != 0) goto L_0x0185
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x018b
        L_0x00a2:
            int r0 = r9.height()
            float r4 = (float) r0
            int r0 = r8.height()
            float r0 = (float) r0
            float r4 = r4 / r0
            int r0 = r8.width()
            float r3 = (float) r0
            float r3 = r3 * r4
            int r0 = r9.width()
            float r0 = (float) r0
            float r3 = r3 - r0
            float r3 = r3 / r10
            int r0 = r9.left
            float r0 = (float) r0
            float r0 = r0 - r3
            int r0 = (int) r0
            r9.left = r0
            int r0 = r9.right
            float r0 = (float) r0
            float r0 = r0 + r3
            int r0 = (int) r0
            r9.right = r0
        L_0x00c8:
            boolean r0 = java.lang.Float.isNaN(r4)
            if (r0 != 0) goto L_0x00d4
            boolean r0 = java.lang.Float.isInfinite(r4)
            if (r0 == 0) goto L_0x00d6
        L_0x00d4:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x00d6:
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x00e3
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L_0x00e3
            r14 = r1
        L_0x00e3:
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            if (r29 != 0) goto L_0x01d7
            if (r24 == 0) goto L_0x01d7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10 = r28 ^ 1
            android.util.Property r11 = android.view.View.X
            r0 = 2
            float[] r0 = new float[r0]
            int r1 = r9.left
            float r1 = (float) r1
            r13 = 0
            r0[r13] = r1
            int r1 = r8.left
            float r1 = (float) r1
            r12 = 1
            r0[r12] = r1
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r11, r0)
            r2.add(r0)
            android.util.Property r11 = android.view.View.Y
            r1 = 2
            float[] r0 = new float[r1]
            int r9 = r9.top
            float r9 = (float) r9
            r0[r13] = r9
            int r8 = r8.top
            float r8 = (float) r8
            r0[r12] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r11, r0)
            r2.add(r0)
            android.util.Property r8 = android.view.View.SCALE_X
            float[] r0 = new float[r1]
            r0[r13] = r4
            r0[r12] = r14
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r8, r0)
            r2.add(r0)
            android.util.Property r8 = android.view.View.SCALE_Y
            float[] r0 = new float[r1]
            r0[r13] = r4
            r0[r12] = r14
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r8, r0)
            r2.add(r0)
            android.animation.ArgbEvaluator r7 = new android.animation.ArgbEvaluator
            r7.<init>()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r0 = r18
            if (r28 == 0) goto L_0x014c
            r0 = r19
        L_0x014c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r13] = r0
            if (r28 == 0) goto L_0x0156
            r19 = r18
        L_0x0156:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r4[r12] = r0
            java.lang.String r0 = "backgroundColor"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r15, r0, r7, r4)
            r2.add(r0)
            java.util.Iterator r9 = r16.iterator()
        L_0x0169:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01b3
            java.lang.Object r8 = r9.next()
            android.util.Property r7 = android.view.View.ALPHA
            float[] r4 = new float[r1]
            float r0 = (float) r5
            r4[r13] = r0
            float r0 = (float) r10
            r4[r12] = r0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r8, r7, r4)
            r2.add(r0)
            goto L_0x0169
        L_0x0185:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x018b
            goto L_0x00a2
        L_0x018b:
            int r0 = r9.width()
            float r4 = (float) r0
            int r0 = r8.width()
            float r0 = (float) r0
            float r4 = r4 / r0
            int r0 = r8.height()
            float r3 = (float) r0
            float r3 = r3 * r4
            int r0 = r9.height()
            float r0 = (float) r0
            float r3 = r3 - r0
            float r3 = r3 / r10
            int r0 = r9.top
            float r0 = (float) r0
            float r0 = r0 - r3
            int r0 = (int) r0
            r9.top = r0
            int r0 = r9.bottom
            float r0 = (float) r0
            float r0 = r0 + r3
            int r0 = (int) r0
            r9.bottom = r0
            goto L_0x00c8
        L_0x01b3:
            java.util.Iterator r9 = r17.iterator()
        L_0x01b7:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r8 = r9.next()
            android.util.Property r7 = android.view.View.ALPHA
            float[] r4 = new float[r1]
            float r0 = (float) r10
            r4[r13] = r0
            float r0 = (float) r5
            r4[r12] = r0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r8, r7, r4)
            r2.add(r0)
            goto L_0x01b7
        L_0x01d3:
            r3.playTogether(r2)
            goto L_0x0224
        L_0x01d7:
            android.util.Property r11 = android.view.View.X
            r10 = 2
            float[] r1 = new float[r10]
            int r0 = r9.left
            float r0 = (float) r0
            r1[r2] = r0
            int r0 = r8.left
            float r0 = (float) r0
            r13 = 1
            r1[r13] = r0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r11, r1)
            android.animation.AnimatorSet$Builder r11 = r3.play(r0)
            android.util.Property r12 = android.view.View.Y
            float[] r1 = new float[r10]
            int r0 = r9.top
            float r0 = (float) r0
            r1[r2] = r0
            int r0 = r8.top
            float r0 = (float) r0
            r1[r13] = r0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r12, r1)
            android.animation.AnimatorSet$Builder r8 = r11.with(r0)
            android.util.Property r1 = android.view.View.SCALE_X
            float[] r0 = new float[r10]
            r0[r2] = r4
            r0[r13] = r14
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r1, r0)
            android.animation.AnimatorSet$Builder r8 = r8.with(r0)
            android.util.Property r1 = android.view.View.SCALE_Y
            float[] r0 = new float[r10]
            r0[r2] = r4
            r0[r13] = r14
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r1, r0)
            r8.with(r0)
        L_0x0224:
            r0 = 250(0xfa, double:1.235E-321)
            r3.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r3.setInterpolator(r0)
            r3.start()
            if (r29 != 0) goto L_0x006f
            if (r28 == 0) goto L_0x006f
            if (r25 == 0) goto L_0x006f
            r1 = 27
            com.facebook.redex.IDxLAdapterShape3S0100000_2_I0 r0 = new com.facebook.redex.IDxLAdapterShape3S0100000_2_I0
            r0.<init>(r6, r1)
            r3.addListener(r0)
            return
        L_0x0245:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46212Cy.A01(android.content.Context, android.graphics.Rect, android.graphics.Rect, android.view.View, android.widget.FrameLayout, X.34v, X.2jK, X.2Cx, boolean, boolean):void");
    }

    public static void A02(Context context, C19980zJ r2, C85464Oo r3, AnonymousClass1ZP r4, Integer num, String str) {
        if (str != null) {
            r2.Act(context, Uri.parse(str));
        }
        if (r3 != null) {
            r3.A02 = true;
            r3.A00 = num;
        }
        if (r4 != null) {
            r4.A6N();
        }
    }

    public static void A03(FrameLayout frameLayout, List list, List list2, int i2, int i3, boolean z2) {
        if (!z2) {
            i2 = i3;
        }
        frameLayout.setBackgroundColor(i2);
        Iterator it = list.iterator();
        while (true) {
            int i4 = 8;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            if (!z2) {
                i4 = 0;
            }
            view.setVisibility(i4);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            int i5 = 8;
            if (z2) {
                i5 = 0;
            }
            view2.setVisibility(i5);
        }
    }

    public static void A04(C55842kV r4, int i2, boolean z2) {
        float f2;
        WebPagePreviewView webPagePreviewView;
        View view;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                if (!z2) {
                    f2 = 0.0f;
                    webPagePreviewView = (WebPagePreviewView) r4;
                    webPagePreviewView.A0G.setAlpha(0.0f);
                    webPagePreviewView.A05.setAlpha(1.0f);
                    webPagePreviewView.A0C.setAlpha(1.0f);
                }
            } else if (!z2) {
                f2 = 0.67f;
                WebPagePreviewView webPagePreviewView2 = (WebPagePreviewView) r4;
                webPagePreviewView2.A0G.setAlpha(0.0f);
                webPagePreviewView2.A05.setAlpha(1.0f);
                webPagePreviewView2.A0C.setAlpha(1.0f);
                webPagePreviewView2.A06.setAlpha(1.0f);
                view = webPagePreviewView2.A07;
                view.setAlpha(f2);
            }
            f2 = 1.0f;
            WebPagePreviewView webPagePreviewView3 = (WebPagePreviewView) r4;
            webPagePreviewView3.A0F.setAlpha(0.0f);
            view = webPagePreviewView3.A04;
            view.setAlpha(f2);
        }
        f2 = 0.0f;
        webPagePreviewView = (WebPagePreviewView) r4;
        if (z2) {
            webPagePreviewView.A0F.setAlpha(1.0f);
            view = webPagePreviewView.A04;
            view.setAlpha(f2);
        }
        webPagePreviewView.A0G.setAlpha(1.0f);
        webPagePreviewView.A05.setAlpha(0.0f);
        webPagePreviewView.A0C.setAlpha(0.0f);
        webPagePreviewView.A06.setAlpha(f2);
        view = webPagePreviewView.A07;
        view.setAlpha(f2);
    }

    public static void A05(C55842kV r4, C42171xL r5) {
        r4.AIB();
        WebPagePreviewView webPagePreviewView = (WebPagePreviewView) r4;
        webPagePreviewView.A0G.animate().cancel();
        webPagePreviewView.A05.animate().cancel();
        webPagePreviewView.A06.animate().cancel();
        webPagePreviewView.A0G.setAlpha(0.0f);
        webPagePreviewView.A05.setAlpha(1.0f);
        webPagePreviewView.A06.setAlpha(0.0f);
        webPagePreviewView.A07.setAlpha(0.0f);
        webPagePreviewView.A0C.setAlpha(0.0f);
        webPagePreviewView.AIB();
        r4.setVideoLargeLogo(r5.A01);
    }
}

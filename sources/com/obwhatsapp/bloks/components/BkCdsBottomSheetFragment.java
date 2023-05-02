package com.obwhatsapp.bloks.components;

import X.AnonymousClass000;
import X.AnonymousClass0C9;
import X.AnonymousClass0CA;
import X.AnonymousClass0KQ;
import X.AnonymousClass0KW;
import X.AnonymousClass0NZ;
import X.AnonymousClass0Q0;
import X.AnonymousClass0QZ;
import X.AnonymousClass0SF;
import X.AnonymousClass0T1;
import X.AnonymousClass0XG;
import X.AnonymousClass22A;
import X.C04560Na;
import X.C05070Pd;
import X.C06410Vr;
import X.C13550mZ;
import X.C13680ns;
import X.C13690nt;
import X.C14930q1;
import X.C14940q2;
import X.C14950q3;
import X.C14960q4;
import X.C14980q6;
import X.C14990q7;
import X.C31201dg;
import X.C57842s0;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.facebook.common.util.redex.OriginalClassName;
import java.util.Deque;

public class BkCdsBottomSheetFragment extends DialogFragment implements C13550mZ {
    public AnonymousClass0SF A00;
    public AnonymousClass0XG A01;
    public AnonymousClass22A A02;

    public static BkCdsBottomSheetFragment A01(AnonymousClass0XG r3, String str) {
        Bundle A0D = C13690nt.A0D();
        A0D.putString("request_data", str);
        A0D.putBundle("open_screen_config", r3.A06());
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment = new BkCdsBottomSheetFragment();
        bkCdsBottomSheetFragment.A0T(A0D);
        return bkCdsBottomSheetFragment;
    }

    public static void A02(Activity activity, int i2) {
        if (Build.VERSION.SDK_INT != 26 || activity.getApplicationInfo().targetSdkVersion <= 26 || (!A03(activity, 16842840) && !A03(activity, 16842839) && !A03(activity, 16843763))) {
            try {
                activity.setRequestedOrientation(i2);
            } catch (IllegalStateException e2) {
                if ("Only fullscreen activities can request orientation".equals(e2.getMessage())) {
                    Object[] A1b = C13680ns.A1b();
                    A1b[0] = OriginalClassName.getClassSimpleName(activity);
                    C06410Vr.A01(e2, A1b);
                    return;
                }
                throw e2;
            }
        }
    }

    public static boolean A03(Activity activity, int i2) {
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.type == 18 && typedValue.data != 0;
    }

    public void A0k() {
        super.A0k();
        if (this.A00 != null) {
            AnonymousClass0XG r0 = this.A01;
            C14960q4 r5 = r0.A05;
            C14930q1 r4 = r0.A07;
            C14990q7 r3 = r0.A04;
            C31201dg r2 = r0.A06;
            if (r4 == null) {
                return;
            }
            if (r2 != null && r3 != null) {
                C14940q2 r02 = new C14940q2();
                r02.A02(r3, 0);
                C14940q2.A00(r3, r2, r02, r4);
            } else if (r5 != null) {
                C14940q2 r03 = new C14940q2();
                r03.A02(r3, 0);
                C14980q6.A00(r5, new C14950q3(r03.A00), r4);
            }
        }
    }

    public void A0s(Bundle bundle) {
        AnonymousClass0XG r0 = this.A01;
        if (r0 != null) {
            bundle.putBundle("open_screen_config", r0.A06());
        }
        super.A0s(bundle);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass0SF A1J = A1J();
        Context A022 = A02();
        AnonymousClass0XG r14 = this.A01;
        C04560Na r5 = new C04560Na(A1J);
        AnonymousClass0NZ r10 = new AnonymousClass0NZ(A1J);
        AnonymousClass0KQ r6 = AnonymousClass0KQ.DEFAULT;
        C14990q7 r7 = r14.A04;
        A1J.A03 = new AnonymousClass0QZ(A022, r5, r6, r7, r14.A08);
        A1J.A02 = new AnonymousClass0Q0(A022, r10, r5, r6, r7);
        A1J.A04 = r14.A03;
        Activity A002 = AnonymousClass0T1.A00(A022);
        if (A002 != null) {
            A1J.A07 = Integer.valueOf(A002.getRequestedOrientation());
            A02(A002, 1);
        }
        AnonymousClass0C9 r13 = new AnonymousClass0C9(A022, A1J.A04);
        A1J.A00 = r13;
        A1J.A01 = new AnonymousClass0CA(A022, r13, r14, r6, r7);
        C05070Pd r52 = (C05070Pd) A1J.A0C.peek();
        if (r52 != null) {
            A1J.A00.A01.A03((View) r52.A00.A04(A022).first, AnonymousClass0KW.DEFAULT, false);
            C57842s0 r1 = r52.A01;
            AnonymousClass0C9 r0 = A1J.A00;
            if (r0 != null) {
                ViewGroup viewGroup2 = r0.A00;
                viewGroup2.removeAllViews();
                viewGroup2.addView(r1);
            }
        }
        return A1J.A01;
    }

    public void A12() {
        Activity A002;
        super.A12();
        AnonymousClass0SF r4 = this.A00;
        if (r4 != null) {
            Context A022 = A02();
            Deque<C05070Pd> deque = r4.A0C;
            for (C05070Pd r0 : deque) {
                r0.A00.A07();
            }
            deque.clear();
            r4.A0A.clear();
            r4.A0B.clear();
            r4.A09.clear();
            if (r4.A07 != null && (A002 = AnonymousClass0T1.A00(A022)) != null) {
                A02(A002, r4.A07.intValue());
                r4.A07 = null;
            }
        }
    }

    public void A13() {
        super.A13();
        AnonymousClass0SF r4 = this.A00;
        if (r4 != null) {
            for (C05070Pd r2 : r4.A0C) {
                r2.A00.A08();
                AnonymousClass0C9 r0 = r4.A00;
                if (r0 != null) {
                    r0.A00.removeView(r2.A01);
                }
            }
            AnonymousClass0QZ r02 = r4.A03;
            if (r02 != null) {
                r02.A00 = null;
                r4.A03 = null;
            }
            AnonymousClass0Q0 r03 = r4.A02;
            if (r03 != null) {
                r03.A00 = null;
                r4.A02 = null;
            }
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        if (bundle != null) {
            A1C();
        }
        this.A01 = AnonymousClass0XG.A03(bundle == null ? A04().getBundle("open_screen_config") : bundle.getBundle("open_screen_config"));
        this.A00 = new AnonymousClass0SF();
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0153 A[LOOP:0: B:63:0x0153->B:66:0x015d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1B(android.os.Bundle r16) {
        /*
            r15 = this;
            X.0SF r5 = r15.A1J()
            android.content.Context r4 = r15.A02()
            X.0XG r3 = r15.A01
            X.0Kf r0 = r3.A03
            r5.A04 = r0
            X.0Kf r9 = X.C03880Kf.FULL_SCREEN
            if (r0 == r9) goto L_0x018c
            r5.A04 = r0
            if (r0 == r9) goto L_0x0184
            X.0A2 r2 = new X.0A2
            r2.<init>(r4)
            X.0Kc r7 = r3.A01
            X.0Kc r0 = X.C03850Kc.AUTO
            boolean r0 = r7.equals(r0)
            r6 = 0
            r1 = 1
            if (r0 != 0) goto L_0x0032
            X.0Kc r0 = X.C03850Kc.ENABLED
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0057
            r2.setCanceledOnTouchOutside(r1)
        L_0x0032:
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = X.AnonymousClass0MV.A00(r4, r0)
            int r7 = (int) r0
            android.widget.FrameLayout r0 = r2.A05
            r0.setPadding(r7, r7, r7, r7)
            X.0Kf r8 = r3.A03
            X.0Kf r0 = X.C03880Kf.FLEXIBLE_SHEET
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0066
            int r0 = r8.ordinal()
            switch(r0) {
                case 0: goto L_0x0063;
                case 1: goto L_0x00a2;
                default: goto L_0x004f;
            }
        L_0x004f:
            java.lang.String r1 = "Encountered unsupported CDS bottom sheet style."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0057:
            X.0Kc r0 = X.C03850Kc.DISABLED
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0032
            r2.setCanceledOnTouchOutside(r6)
            goto L_0x0032
        L_0x0063:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a4
        L_0x0066:
            com.facebook.redex.IDxAnchorShape40S0000000_I1 r13 = new com.facebook.redex.IDxAnchorShape40S0000000_I1
            r13.<init>(r6)
            r2.A08 = r13
            X.0Bu r7 = r2.A09
            X.0kp r12 = r2.A07
            r10 = 2
            if (r12 != 0) goto L_0x008f
            X.0kp[] r11 = new X.C12700kp[r10]
            X.0kp r14 = X.AnonymousClass0A2.A0H
            r11[r6] = r14
            r11[r1] = r13
        L_0x007c:
            boolean r0 = r2.isShowing()
            r7.A03(r11, r0)
            r0 = 0
            r2.A07 = r0
            X.0kp r0 = r2.A08
            if (r0 != 0) goto L_0x009b
            X.0kp[] r13 = new X.C12700kp[r1]
            r13[r6] = r14
            goto L_0x00cd
        L_0x008f:
            r0 = 3
            X.0kp[] r11 = new X.C12700kp[r0]
            X.0kp r14 = X.AnonymousClass0A2.A0H
            r11[r6] = r14
            r11[r1] = r13
            r11[r10] = r12
            goto L_0x007c
        L_0x009b:
            X.0kp[] r13 = new X.C12700kp[r10]
            r13[r6] = r14
            r13[r1] = r0
            goto L_0x00cd
        L_0x00a2:
            r0 = 1061158912(0x3f400000, float:0.75)
        L_0x00a4:
            X.0dy r12 = new X.0dy
            r12.<init>(r0)
            r2.A08 = r12
            X.0Bu r7 = r2.A09
            X.0kp r13 = r2.A07
            r11 = 2
            if (r13 != 0) goto L_0x0170
            X.0kp[] r10 = new X.C12700kp[r11]
            X.0kp r14 = X.AnonymousClass0A2.A0H
            r10[r6] = r14
            r10[r1] = r12
        L_0x00ba:
            boolean r0 = r2.isShowing()
            r7.A03(r10, r0)
            r2.A07 = r12
            X.0kp r10 = r2.A08
            if (r10 != 0) goto L_0x0165
            X.0kp[] r13 = new X.C12700kp[r11]
            r13[r6] = r14
            r13[r1] = r12
        L_0x00cd:
            boolean r0 = r2.isShowing()
            r7.A03(r13, r0)
            boolean r0 = r2.A0E
            if (r0 == r6) goto L_0x00da
            r2.A0E = r6
        L_0x00da:
            boolean r0 = r2.A0A
            if (r0 == r1) goto L_0x00e5
            r2.A0A = r1
            float r0 = r2.A00
            r2.A02(r0)
        L_0x00e5:
            r7.A0B = r1
            X.0Kd r1 = r3.A02
            X.0Kd r0 = X.C03860Kd.AUTO
            if (r1 != r0) goto L_0x0160
            X.0Kf r0 = X.C03880Kf.FULL_SHEET
            if (r8 == r0) goto L_0x00f3
            if (r8 != r9) goto L_0x0100
        L_0x00f3:
            X.0MW r1 = new X.0MW
            r1.<init>()
            java.util.List r0 = java.util.Collections.singletonList(r14)
            r7.A08 = r0
            r7.A03 = r1
        L_0x0100:
            X.0q7 r1 = r3.A04
            X.0JF r0 = X.AnonymousClass0JF.OVERLAY_ON_SURFACE
            int r1 = X.C06290Vd.A00(r4, r0, r1)
            int r0 = r2.A02
            if (r0 == r1) goto L_0x0113
            r2.A02 = r1
            float r0 = r2.A00
            r2.A02(r0)
        L_0x0113:
            int r0 = android.graphics.Color.alpha(r1)
            float r1 = (float) r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r0
            float r0 = r2.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0128
            r2.A01 = r1
            float r0 = r2.A00
            r2.A02(r0)
        L_0x0128:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0134
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x0134
        L_0x0134:
            r5.A05 = r2
            X.0OT r0 = new X.0OT
            r0.<init>(r4, r5, r3)
            r2.A06 = r0
            android.app.Activity r0 = X.AnonymousClass0T1.A00(r4)
            if (r0 == 0) goto L_0x017d
            java.util.List r1 = X.AnonymousClass0T1.A01(r0)
            if (r1 == 0) goto L_0x015f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x015f
            java.util.Iterator r1 = r1.iterator()
        L_0x0153:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015f
            java.lang.Object r0 = r1.next()
            if (r0 != r15) goto L_0x0153
        L_0x015f:
            return r2
        L_0x0160:
            X.0Kd r0 = X.C03860Kd.DISABLED
            if (r1 != r0) goto L_0x0100
            goto L_0x00f3
        L_0x0165:
            r0 = 3
            X.0kp[] r13 = new X.C12700kp[r0]
            r13[r6] = r14
            r13[r1] = r10
            r13[r11] = r12
            goto L_0x00cd
        L_0x0170:
            r0 = 3
            X.0kp[] r10 = new X.C12700kp[r0]
            X.0kp r14 = X.AnonymousClass0A2.A0H
            r10[r6] = r14
            r10[r1] = r12
            r10[r11] = r13
            goto L_0x00ba
        L_0x017d:
            java.lang.String r0 = "Cannot show a fragment in a null activity"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0184:
            java.lang.String r1 = "onCreateDialog() is not supported for CDS full screen."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x018c:
            java.lang.String r1 = "onFragmentCreateDialog() is not supported for CDS full screen."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment.A1B(android.os.Bundle):android.app.Dialog");
    }

    public final AnonymousClass0SF A1J() {
        AnonymousClass0SF r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0V("Must initialize bottom sheet delegate!");
    }

    public AnonymousClass22A A7F(AnonymousClass22A r2, boolean z2) {
        return this.A02;
    }

    public void AW3(int i2) {
        A1J().A01(i2);
    }

    public void AZs(C05070Pd r9, C14990q7 r10, C31201dg r11, C14930q1 r12, int i2) {
        A1J().A06(A02(), r9, AnonymousClass0KW.DEFAULT, r10, r11, r12, i2);
    }
}

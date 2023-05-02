package com.google.android.material.bottomsheet;

import X.AnonymousClass29K;
import X.AnonymousClass2Tr;
import X.C30141bo;
import X.C54882iQ;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.views.VoipCallControlBottomSheetDragIndicator;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

public class IDxSCallbackShape44S0100000_1_I0 extends C54882iQ {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape44S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A01(View view, float f2) {
        int i2;
        View findViewById;
        if (this.A01 != 0) {
            C30141bo r4 = (C30141bo) this.A00;
            if (r4.A07() && r4.A0F) {
                A02(view, 1);
                r4.A0F = false;
            } else if (r4.A08() && r4.A0G) {
                A02(view, 1);
                r4.A0G = false;
            }
            AnonymousClass29K r0 = (AnonymousClass29K) r4.A0V.A01.A0C();
            if (r0 != null) {
                ((MediaComposerActivity) r0).A0o.A03.setAlpha(1.0f - f2);
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r4.A0Q.getLayoutManager();
            if (linearLayoutManager != null) {
                float f3 = (0.35f * f2) + 0.65f;
                float f4 = (0.45f * f2) + 0.55f;
                int A1B = linearLayoutManager.A1B();
                for (int A19 = linearLayoutManager.A19(); A19 <= A1B; A19++) {
                    View A0B = linearLayoutManager.A0B(A19);
                    if (A0B != null) {
                        A0B.setScaleX(f3);
                        A0B.setScaleY(f3);
                        if (A19 == r4.A01 && (findViewById = A0B.findViewById(R.id.selection_check)) != null) {
                            findViewById.setScaleX(f4);
                            findViewById.setScaleY(f4);
                        }
                    }
                }
            }
            float f5 = 1.0f - (f2 * r4.A00);
            View view2 = r4.A06;
            view2.setScaleX(f5);
            view2.setScaleY(f5);
            DoodleView doodleView = r4.A09.A0H;
            doodleView.setScaleX(f5);
            doodleView.setScaleY(f5);
            return;
        }
        AnonymousClass2Tr r2 = (AnonymousClass2Tr) this.A00;
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r2.A0G;
        voipCallControlBottomSheetV2.A1O(f2);
        VoipCallControlBottomSheetDragIndicator voipCallControlBottomSheetDragIndicator = voipCallControlBottomSheetV2.A0O;
        if (voipCallControlBottomSheetDragIndicator != null) {
            voipCallControlBottomSheetDragIndicator.setSlideOffset(f2);
        }
        if (f2 <= 0.0f) {
            if (r2.A01 > 0) {
                i2 = view.getTop() - r2.A01;
            } else {
                BottomSheetBehavior bottomSheetBehavior = r2.A0F;
                i2 = (int) (((float) (-(bottomSheetBehavior.A0M ? -1 : bottomSheetBehavior.A09))) * f2);
            }
            voipCallControlBottomSheetV2.A1R(i2, f2);
            r2.A01 = view.getTop();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0178, code lost:
        if (r4 != 5) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c6, code lost:
        if (r9.A0F.A0B != 4) goto L_0x01c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r16, int r17) {
        /*
            r15 = this;
            int r0 = r15.A01
            r4 = r17
            if (r0 == 0) goto L_0x0170
            r7 = 4
            r2 = 1
            r5 = 0
            if (r4 != r7) goto L_0x0094
            java.lang.Object r3 = r15.A00
            X.1bo r3 = (X.C30141bo) r3
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A08
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x0091
            r1 = -1
        L_0x0016:
            int r0 = r16.getTop()
            int r1 = r1 + r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r3.A0N
            int r0 = r0.getHeight()
            if (r1 != r0) goto L_0x0068
            X.29E r4 = r3.A0V
            com.obwhatsapp.mediacomposer.MediaComposerFragment r8 = r4.A01
            X.00l r9 = r8.A0C()
            X.29K r9 = (X.AnonymousClass29K) r9
            if (r9 == 0) goto L_0x0050
            com.obwhatsapp.mediacomposer.MediaComposerActivity r9 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r9
            r6 = 0
            X.29w r0 = r9.A0o
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r6
            com.obwhatsapp.mediacomposer.bottombar.BottomBarView r0 = r0.A03
            r0.setAlpha(r1)
            X.29w r0 = r9.A0o
            r0.A03(r2)
            boolean r0 = r9.A1D
            if (r0 != 0) goto L_0x008e
            X.29w r1 = r9.A0o
            X.29P r0 = r9.A0l
            boolean r0 = r0.A08()
            r1.A04(r0)
        L_0x0050:
            X.2Ra r0 = r8.A0D
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0H
            r0.setEnabled(r2)
            com.obwhatsapp.mediacomposer.ImageComposerFragment r0 = r4.A00
            com.obwhatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r0.A06
            X.2Kn r0 = r0.A05
            r0.A0M = r2
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0Q
            r0.setVisibility(r7)
            r3.A0F = r2
            r3.A0H = r5
        L_0x0068:
            java.lang.Object r1 = r15.A00
            X.1bo r1 = (X.C30141bo) r1
            boolean r0 = r1.A07()
            if (r0 != 0) goto L_0x0078
            boolean r0 = r1.A08()
            if (r0 == 0) goto L_0x0081
        L_0x0078:
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x0082
            r1.A01()
            r1.A0E = r5
        L_0x0081:
            return
        L_0x0082:
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0081
            boolean r0 = r1.A0D
            r1.A06(r0)
            r1.A0C = r5
            return
        L_0x008e:
            r9.A1D = r5
            goto L_0x0050
        L_0x0091:
            int r1 = r1.A09
            goto L_0x0016
        L_0x0094:
            r0 = 3
            if (r4 != r0) goto L_0x0134
            java.lang.Object r4 = r15.A00
            X.1bo r4 = (X.C30141bo) r4
            X.1bp r0 = r4.A0A
            if (r0 == 0) goto L_0x00a2
            r0.A0E(r2)
        L_0x00a2:
            int r1 = r16.getTop()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r4.A0N
            int r0 = r0.getTop()
            if (r1 != r0) goto L_0x0131
            X.29E r3 = r4.A0V
            com.obwhatsapp.mediacomposer.MediaComposerFragment r6 = r3.A01
            X.00l r2 = r6.A0C()
            X.29K r2 = (X.AnonymousClass29K) r2
            if (r2 == 0) goto L_0x00e2
            com.obwhatsapp.mediacomposer.MediaComposerActivity r2 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r2
            r1 = 1065353216(0x3f800000, float:1.0)
            X.29w r0 = r2.A0o
            float r1 = r1 - r1
            com.obwhatsapp.mediacomposer.bottombar.BottomBarView r0 = r0.A03
            r0.setAlpha(r1)
            X.29w r1 = r2.A0o
            X.29P r0 = r2.A0l
            boolean r2 = r0.A08()
            r1.A03(r5)
            com.obwhatsapp.mediacomposer.bottombar.BottomBarView r0 = r1.A03
            r0.setVisibility(r7)
            X.29n r0 = r1.A08
            r1 = 8
            if (r2 == 0) goto L_0x00dd
            r1 = 4
        L_0x00dd:
            androidx.recyclerview.widget.RecyclerView r0 = r0.A06
            r0.setVisibility(r1)
        L_0x00e2:
            X.2Ra r0 = r6.A0D
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0H
            r0.setEnabled(r5)
            com.obwhatsapp.mediacomposer.ImageComposerFragment r0 = r3.A00
            com.obwhatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r0.A06
            X.2Kn r2 = r0.A05
            r2.A0M = r5
            android.graphics.Matrix r1 = r2.A07
            android.graphics.Matrix r0 = r2.A08
            r1.set(r0)
            float r0 = r2.A04
            r2.A00 = r0
            X.2Km r0 = r2.A0G
            r0.A00(r1)
            X.0rz r3 = r4.A0S
            android.content.SharedPreferences r0 = X.C13680ns.A0B(r3)
            java.lang.String r2 = "filter_dismissal_amount"
            int r1 = r0.getInt(r2, r5)
            r0 = 5
            if (r1 > r0) goto L_0x0115
            int r0 = r1 + 1
            X.C13680ns.A1S(r3, r2, r0)
        L_0x0115:
            r4.A0G = r5
        L_0x0117:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0Q
            r0.setVisibility(r5)
            X.02W r1 = r0.getLayoutManager()
            if (r1 == 0) goto L_0x0068
            int r0 = r4.A01
            android.view.View r1 = r1.A0B(r0)
            if (r1 == 0) goto L_0x0068
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            goto L_0x0068
        L_0x0131:
            r4.A0G = r2
            goto L_0x0117
        L_0x0134:
            if (r4 != r2) goto L_0x0068
            java.lang.Object r3 = r15.A00
            X.1bo r3 = (X.C30141bo) r3
            androidx.recyclerview.widget.RecyclerView r2 = r3.A0Q
            r2.getVisibility()
            X.29E r0 = r3.A0V
            com.obwhatsapp.mediacomposer.MediaComposerFragment r0 = r0.A01
            X.00l r0 = r0.A0C()
            X.29K r0 = (X.AnonymousClass29K) r0
            if (r0 == 0) goto L_0x015b
            com.obwhatsapp.mediacomposer.MediaComposerActivity r0 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r0
            X.29w r1 = r0.A0o
            X.29P r0 = r0.A0l
            boolean r0 = r0.A08()
            r1.A03(r5)
            r1.A04(r0)
        L_0x015b:
            r3.A0H = r5
            X.1bp r0 = r3.A0A
            if (r0 != 0) goto L_0x016b
            android.os.Handler r1 = r3.A0K
            java.lang.Runnable r0 = r3.A0X
            r1.removeCallbacks(r0)
            r0.run()
        L_0x016b:
            r2.setVisibility(r5)
            goto L_0x0068
        L_0x0170:
            r3 = 5
            r12 = 0
            r5 = 4
            r6 = 3
            if (r4 == r6) goto L_0x01fc
            if (r4 == r5) goto L_0x017a
            if (r4 != r3) goto L_0x01e0
        L_0x017a:
            java.lang.Object r9 = r15.A00
            X.2Tr r9 = (X.AnonymousClass2Tr) r9
            boolean r0 = r9.A07
            if (r0 != 0) goto L_0x01f9
            if (r4 == r6) goto L_0x01f9
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r4 != r5) goto L_0x0189
            r6 = 0
        L_0x0189:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = r9.A0G
            int r1 = r16.getTop()
            int r0 = r9.A01
            int r1 = r1 - r0
            r2.A1R(r1, r6)
            int r0 = r16.getTop()
            r9.A01 = r0
        L_0x019b:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r9.A0G
            r0.A1O(r6)
            com.obwhatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r0.A0O
            if (r0 == 0) goto L_0x01a7
            r0.setSlideOffset(r6)
        L_0x01a7:
            r9.A00()
            r9.A01()
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x01e0
            android.view.View r2 = r9.A0C
            float r1 = r2.getTranslationY()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01e0
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x01c8
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r9.A0F
            int r0 = r0.A0B
            r11 = 500(0x1f4, float:7.0E-43)
            if (r0 == r5) goto L_0x01c9
        L_0x01c8:
            r11 = 0
        L_0x01c9:
            float r0 = r2.getTranslationY()
            int r13 = (int) r0
            r5 = 1056964608(0x3f000000, float:0.5)
            r2 = 1068289229(0x3faccccd, float:1.35)
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r10 = X.C04240Lt.A00(r5, r2, r1, r0)
            r14 = 0
            r9.A04(r10, r11, r12, r13, r14)
        L_0x01e0:
            java.lang.Object r0 = r15.A00
            X.2Tr r0 = (X.AnonymousClass2Tr) r0
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r0.A0G
            if (r4 == r3) goto L_0x01e9
            r12 = 1
        L_0x01e9:
            X.2PE r0 = r1.A0Z
            if (r0 == 0) goto L_0x01f0
            r0.A00(r12)
        L_0x01f0:
            r0 = 0
            if (r12 == 0) goto L_0x01f5
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x01f5:
            r1.A1P(r0)
            return
        L_0x01f9:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x019b
        L_0x01fc:
            java.lang.Object r0 = r15.A00
            X.2Tr r0 = (X.AnonymousClass2Tr) r0
            r0.A07 = r12
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r7 = r0.A0G
            com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel r9 = r7.A0L
            boolean r0 = r9.A03
            if (r0 != 0) goto L_0x0228
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0228
            int r1 = r9.A00
            r8 = 1
            if (r1 >= r3) goto L_0x0226
            X.1OL r0 = r9.A06
            int r2 = r1 + 1
            r9.A00 = r2
            android.content.SharedPreferences r0 = r0.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "inline_education"
            X.C13680ns.A0w(r1, r0, r2)
        L_0x0226:
            r9.A03 = r8
        L_0x0228:
            androidx.recyclerview.widget.RecyclerView r11 = r7.A0D
            if (r11 == 0) goto L_0x017a
            X.2Tw r0 = r7.A0I
            if (r0 == 0) goto L_0x017a
            com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel r8 = r7.A0L
            java.util.Set r0 = r8.A0A
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r0)
            r10 = 0
        L_0x023a:
            int r0 = r11.getChildCount()
            if (r10 >= r0) goto L_0x0261
            android.view.View r1 = r11.getChildAt(r10)
            if (r1 == 0) goto L_0x025e
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x025e
            java.lang.Object r2 = r1.getTag()
            X.AnonymousClass00B.A06(r2)
            boolean r0 = r9.contains(r2)
            if (r0 == 0) goto L_0x0270
            r9.remove(r2)
        L_0x025e:
            int r10 = r10 + 1
            goto L_0x023a
        L_0x0261:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x017a
            X.0so r2 = r8.A05
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "VoipCallControlBottomSheet/hasDuplicateParticipant/missing participants"
            goto L_0x0286
        L_0x0270:
            java.lang.String r0 = "VoipCallControlBottomSheet/hasDuplicateParticipant/duplicate participant = "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0so r2 = r8.A05
            r1 = 0
            java.lang.String r0 = "VoipCallControlBottomSheet/hasDuplicateParticipant/duplicate participant"
        L_0x0286:
            r2.AcB(r0, r1, r12)
            X.2Tw r0 = r7.A0I
            r0.A01()
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.IDxSCallbackShape44S0100000_1_I0.A02(android.view.View, int):void");
    }
}

package com.google.android.material.bottomsheet;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass291;
import X.C41811wh;
import X.C54882iQ;
import X.C55722kE;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.MessageReplyActivity;

public class IDxSCallbackShape45S0100000_2_I0 extends C54882iQ {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape45S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A01(View view, float f2) {
        AnonymousClass291 r2;
        float f3;
        float f4;
        switch (this.A01) {
            case 2:
                if (f2 >= 0.0f) {
                    int height = view.getHeight();
                    r2 = (AnonymousClass291) this.A00;
                    BottomSheetBehavior bottomSheetBehavior = r2.A0Z;
                    int i2 = bottomSheetBehavior.A0M ? -1 : bottomSheetBehavior.A09;
                    f4 = ((float) (height - i2)) * f2;
                    f3 = (float) i2;
                } else {
                    if (!Float.isNaN(f2)) {
                        r2 = (AnonymousClass291) this.A00;
                        BottomSheetBehavior bottomSheetBehavior2 = r2.A0Z;
                        f3 = (float) (bottomSheetBehavior2.A0M ? -1 : bottomSheetBehavior2.A09);
                        f4 = f3 * f2;
                    }
                    ((AnonymousClass291) this.A00).A0g.setOffset(f2);
                    return;
                }
                r2.A0L(f3 + f4, false);
                ((AnonymousClass291) this.A00).A0g.setOffset(f2);
                return;
            case 3:
                float height2 = ((float) view.getHeight()) * f2;
                AnonymousClass291 r22 = (AnonymousClass291) this.A00;
                BottomSheetBehavior bottomSheetBehavior3 = r22.A0a;
                AnonymousClass291.A02(r22, ((float) (bottomSheetBehavior3.A0M ? -1 : bottomSheetBehavior3.A09)) + height2, false);
                return;
            case 4:
                if (f2 < 0.5f) {
                    MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                    if (!messageReplyActivity.AIm()) {
                        messageReplyActivity.A37();
                        messageReplyActivity.A36();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                C41811wh r3 = (C41811wh) this.A00;
                C55722kE A0A = r3.A0A();
                A0A.A06.setVisibility(0);
                A0A.A06.setAlpha(f2);
                A0A.A0A.setAlpha(1.0f - ((float) Math.pow((double) f2, 4.0d)));
                if (r3.A0N()) {
                    int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                    boolean z2 = r3.A07;
                    if (i3 != 0) {
                        if (z2) {
                            r3.A07 = false;
                            r3.A0A().A0A.setBackground((Drawable) null);
                        }
                    } else if (!z2) {
                        r3.A07 = true;
                        ViewGroup viewGroup = r3.A0A().A0A;
                        View view2 = r3.A00;
                        AnonymousClass00B.A04(view2);
                        viewGroup.setBackground(AnonymousClass00T.A04(view2.getContext(), R.drawable.ic_center_shadow));
                    }
                }
                r3.A0G();
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r11 == 2) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0112;
                case 2: goto L_0x0030;
                case 3: goto L_0x00a3;
                case 4: goto L_0x00fb;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A00
            X.1wh r0 = (X.C41811wh) r0
            r0.A0I(r11)
        L_0x000c:
            return
        L_0x000d:
            r0 = 5
            java.lang.Object r2 = r9.A00
            com.obwhatsapp.avatar.home.AvatarHomeActivity r2 = (com.obwhatsapp.avatar.home.AvatarHomeActivity) r2
            if (r11 != r0) goto L_0x0018
            r2.A36()
            return
        L_0x0018:
            android.view.Window r1 = r2.getWindow()
            r0 = 0
            X.C434920f.A08(r1, r0)
            r0 = 2131101259(0x7f06064b, float:1.7814923E38)
            X.C434920f.A03(r2, r0)
            X.02i r0 = r2.AGK()
            if (r0 == 0) goto L_0x000c
            r0.A07()
            return
        L_0x0030:
            r8 = 5
            r4 = 4
            r7 = 3
            r3 = 0
            r2 = 1
            if (r11 != r7) goto L_0x0081
            java.lang.Object r6 = r9.A00
            X.291 r6 = (X.AnonymousClass291) r6
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r6.A0a
            int r0 = r0.A0B
            if (r0 != r7) goto L_0x0062
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r6.A0Z
        L_0x0043:
            r5.A0M(r8)
        L_0x0046:
            java.lang.Object r6 = r9.A00
            X.291 r6 = (X.AnonymousClass291) r6
            com.obwhatsapp.location.DragBottomSheetIndicator r5 = r6.A0g
            r1 = 2
            if (r11 == r2) goto L_0x0052
            r0 = 0
            if (r11 != r1) goto L_0x0053
        L_0x0052:
            r0 = 1
        L_0x0053:
            r5.setUpdating(r0)
            if (r11 == r1) goto L_0x005c
            if (r11 == r2) goto L_0x005c
            if (r11 != r4) goto L_0x000c
        L_0x005c:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A0X
            r0.A0Z(r3)
            return
        L_0x0062:
            int r5 = r10.getHeight()
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r6.A0Z
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x007e
            r0 = -1
        L_0x006d:
            int r5 = r5 - r0
            float r1 = (float) r5
            float r0 = (float) r0
            float r0 = r0 + r1
            r6.A0L(r0, r2)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r6.A0Z
            r0.A0J = r3
            com.obwhatsapp.location.DragBottomSheetIndicator r0 = r6.A0g
            r0.setExpanded(r2)
            goto L_0x0046
        L_0x007e:
            int r0 = r1.A09
            goto L_0x006d
        L_0x0081:
            if (r11 != r4) goto L_0x0046
            java.lang.Object r1 = r9.A00
            X.291 r1 = (X.AnonymousClass291) r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.A0a
            int r0 = r0.A0B
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r1.A0Z
            if (r0 == r7) goto L_0x0043
            r5.A0J = r3
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x00a0
            r0 = -1
        L_0x0096:
            float r0 = (float) r0
            r1.A0L(r0, r2)
            com.obwhatsapp.location.DragBottomSheetIndicator r0 = r1.A0g
            r0.setExpanded(r3)
            goto L_0x0046
        L_0x00a0:
            int r0 = r5.A09
            goto L_0x0096
        L_0x00a3:
            r6 = 0
            r5 = 0
            r3 = 1
            r4 = 5
            if (r11 != r4) goto L_0x00ce
            java.lang.Object r4 = r9.A00
            X.291 r4 = (X.AnonymousClass291) r4
            androidx.recyclerview.widget.RecyclerView r2 = r4.A0Y
            r1 = -1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r5)
            r2.setLayoutParams(r0)
            X.AnonymousClass291.A02(r4, r6, r3)
            r4.A0G()
        L_0x00be:
            java.lang.Object r1 = r9.A00
            X.291 r1 = (X.AnonymousClass291) r1
            java.util.List r0 = r1.A1S
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000c
            r1.A0G()
            return
        L_0x00ce:
            r0 = 3
            if (r11 != r0) goto L_0x00be
            java.lang.Object r2 = r9.A00
            X.291 r2 = (X.AnonymousClass291) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A0Z
            int r0 = r1.A0B
            if (r0 == r4) goto L_0x00f7
            r1.A0J = r3
            r1.A0M(r4)
        L_0x00e0:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A0a
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x00f4
            r1 = -1
        L_0x00e7:
            int r0 = r10.getHeight()
            int r1 = r1 + r0
            float r0 = (float) r1
            X.AnonymousClass291.A02(r2, r0, r3)
            r2.A0K()
            goto L_0x00be
        L_0x00f4:
            int r1 = r1.A09
            goto L_0x00e7
        L_0x00f7:
            r2.A0L(r6, r5)
            goto L_0x00e0
        L_0x00fb:
            r0 = 4
            if (r11 != r0) goto L_0x000c
            java.lang.Object r1 = r9.A00
            com.obwhatsapp.status.playback.MessageReplyActivity r1 = (com.obwhatsapp.status.playback.MessageReplyActivity) r1
            r1.A35()
            boolean r0 = r1.AIm()
            if (r0 != 0) goto L_0x000c
            r1.A37()
            r1.A36()
            return
        L_0x0112:
            r4 = 0
            X.C18450wi.A0H(r10, r4)
            r0 = 5
            if (r11 != r0) goto L_0x0143
            java.lang.Object r0 = r9.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.269 r3 = r0.A0M
            if (r3 != 0) goto L_0x0128
            java.lang.String r0 = "viewModel"
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x0128:
            X.2ry r1 = r3.A07
            r2 = 0
            if (r1 == 0) goto L_0x0136
            X.4je r0 = r1.A04
            r0.A01 = r4
            r1.A0E()
            r3.A07 = r2
        L_0x0136:
            X.2rx r1 = r3.A08
            if (r1 == 0) goto L_0x0143
            X.4je r0 = r1.A0C
            r0.A01 = r4
            r1.A02()
            r3.A08 = r2
        L_0x0143:
            java.lang.Object r0 = r9.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            r0.updateMapPadding(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.IDxSCallbackShape45S0100000_2_I0.A02(android.view.View, int):void");
    }
}

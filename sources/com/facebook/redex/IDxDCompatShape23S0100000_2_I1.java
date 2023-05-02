package com.facebook.redex;

import X.AnonymousClass031;
import X.AnonymousClass032;
import X.AnonymousClass05M;
import X.AnonymousClass3K3;
import X.C57012pj;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.obwhatsapp.R;

public class IDxDCompatShape23S0100000_2_I1 extends AnonymousClass05M {
    public Object A00;
    public final int A01;

    public IDxDCompatShape23S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(View view, int i2) {
        if (5 - this.A01 != 0 || i2 != 4) {
            super.A00(view, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r0 = (X.AnonymousClass35O) r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            int r0 = r2.A01
            switch(r0) {
                case 1: goto L_0x0022;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A01(r3, r4)
        L_0x0008:
            return
        L_0x0009:
            super.A01(r3, r4)
            int r1 = r4.getEventType()
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 != r0) goto L_0x0008
            java.lang.Object r0 = r2.A00
            X.35O r0 = (X.AnonymousClass35O) r0
            java.lang.Runnable r1 = r0.A01
            if (r1 == 0) goto L_0x0008
            android.widget.TextView r0 = r0.A05
            r0.removeCallbacks(r1)
            return
        L_0x0022:
            super.A01(r3, r4)
            java.lang.Object r0 = r2.A00
            com.google.android.material.internal.CheckableImageButton r0 = (com.google.android.material.internal.CheckableImageButton) r0
            boolean r0 = r0.isChecked()
            r4.setChecked(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxDCompatShape23S0100000_2_I1.A01(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    public boolean A03(View view, int i2, Bundle bundle) {
        if (this.A01 == 0 && i2 == 1048576) {
            C57012pj r1 = (C57012pj) this.A00;
            if (r1.A02) {
                r1.cancel();
                return true;
            }
        }
        return super.A03(view, i2, bundle);
    }

    public void A06(View view, AnonymousClass031 r6) {
        boolean z2;
        switch (this.A01) {
            case 0:
                super.A06(view, r6);
                if (((C57012pj) this.A00).A02) {
                    r6.A01.addAction(AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START);
                    z2 = true;
                } else {
                    z2 = false;
                }
                r6.A0K(z2);
                return;
            case 1:
                super.A06(view, r6);
                AccessibilityNodeInfo accessibilityNodeInfo = r6.A01;
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(((CheckableImageButton) this.A00).isChecked());
                return;
            case 2:
                super.A06(view, r6);
                r6.A01.setCheckable(((NavigationMenuItemView) this.A00).A06);
                return;
            case 3:
                super.A06(view, r6);
                AnonymousClass3K3.A18(r6, ((View) this.A00).getContext().getString(R.string.str0019));
                return;
            case 5:
                super.A06(view, r6);
                AccessibilityNodeInfo accessibilityNodeInfo2 = r6.A01;
                accessibilityNodeInfo2.setClickable(false);
                accessibilityNodeInfo2.setSelected(false);
                for (AnonymousClass032 r2 : r6.A03()) {
                    if (r2.A00() == 16 || r2.A00() == 4) {
                        r6.A0A(r2);
                    }
                }
                return;
            default:
                super.A06(view, r6);
                return;
        }
    }
}

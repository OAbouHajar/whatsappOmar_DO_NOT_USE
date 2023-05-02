package com.facebook.redex;

import X.AnonymousClass05M;
import X.AnonymousClass1yR;
import X.AnonymousClass2AN;
import X.AnonymousClass2JP;
import X.C13680ns;
import X.C13700nu;
import X.C15540rI;
import X.C28961Zl;
import X.C42821yj;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.obwhatsapp.R;

public class IDxDCompatShape22S0100000_2_I0 extends AnonymousClass05M {
    public Object A00;
    public final int A01;

    public IDxDCompatShape22S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(View view, int i2) {
        if (15 - this.A01 != 0 || i2 != 4) {
            super.A00(view, i2);
        }
    }

    public void A01(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.A01) {
            case 5:
                if (accessibilityEvent.getEventType() == 2048) {
                    return;
                }
                break;
            case 6:
                if (accessibilityEvent.getEventType() == 32768) {
                    AnonymousClass2AN r1 = (AnonymousClass2AN) this.A00;
                    if (r1.getContext() != null && view.getTag() != null) {
                        AnonymousClass2JP.A00(r1.getContext(), r1.A05, C13680ns.A0d(r1.getContext(), C28961Zl.A06(r1.A06, C13700nu.A01(view.getTag())), C13680ns.A1b(), 0, R.string.str0146));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.A01(view, accessibilityEvent);
                if (((AnonymousClass1yR) ((C42821yj) this.A00).A22).A00.A0J.A0B()) {
                    accessibilityEvent.setFromIndex(-1);
                    accessibilityEvent.setToIndex(-1);
                    accessibilityEvent.setItemCount(-1);
                    return;
                }
                return;
        }
        super.A01(view, accessibilityEvent);
    }

    public void A02(View view, AccessibilityEvent accessibilityEvent) {
        if (2 - this.A01 != 0) {
            super.A02(view, accessibilityEvent);
        } else {
            view.setLongClickable(false);
        }
    }

    public boolean A03(View view, int i2, Bundle bundle) {
        if (this.A01 != 0 || i2 != 1048576) {
            return super.A03(view, i2, bundle);
        }
        ((C15540rI) this.A00).A04(3);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e6, code lost:
        r2 = new X.AnonymousClass032(16, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010c, code lost:
        r2.setContentDescription(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0124, code lost:
        r9.A09(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0127, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0155, code lost:
        r9.A01.setContentDescription(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x018d, code lost:
        r0 = X.AnonymousClass032.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018f, code lost:
        r9.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0192, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r8, X.AnonymousClass031 r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x015b;
                case 1: goto L_0x0143;
                case 2: goto L_0x0005;
                case 3: goto L_0x012e;
                case 4: goto L_0x0071;
                case 5: goto L_0x0005;
                case 6: goto L_0x0128;
                case 7: goto L_0x017c;
                case 8: goto L_0x0110;
                case 9: goto L_0x016a;
                case 10: goto L_0x003c;
                case 11: goto L_0x00ee;
                case 12: goto L_0x0005;
                case 13: goto L_0x00d8;
                case 14: goto L_0x00b7;
                case 15: goto L_0x0009;
                case 16: goto L_0x00a6;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A06(r8, r9)
        L_0x0008:
            return
        L_0x0009:
            super.A06(r8, r9)
            r1 = 0
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.A01
            r0.setClickable(r1)
            r0.setSelected(r1)
            java.util.List r0 = r9.A03()
            java.util.Iterator r3 = r0.iterator()
        L_0x001d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0008
            java.lang.Object r2 = r3.next()
            X.032 r2 = (X.AnonymousClass032) r2
            int r1 = r2.A00()
            r0 = 16
            if (r1 == r0) goto L_0x0038
            int r1 = r2.A00()
            r0 = 4
            if (r1 != r0) goto L_0x001d
        L_0x0038:
            r9.A0A(r2)
            goto L_0x001d
        L_0x003c:
            super.A06(r8, r9)
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo r3 = r9.A01
            r3.setClickable(r0)
            boolean r0 = r3.isLongClickable()
            if (r0 == 0) goto L_0x0008
            r2 = 32
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131886109(0x7f12001d, float:1.9406788E38)
            java.lang.String r1 = r1.getString(r0)
            X.032 r0 = new X.032
            r0.<init>(r2, r1)
            r9.A09(r0)
            java.lang.Object r0 = r7.A00
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.hasOnClickListeners()
            r3.setClickable(r0)
            if (r0 != 0) goto L_0x0008
            X.032 r0 = X.AnonymousClass032.A05
            goto L_0x018f
        L_0x0071:
            super.A06(r8, r9)
            java.lang.Object r6 = r7.A00
            X.2hF[] r6 = (X.C54322hF[]) r6
            int r5 = r6.length
            r4 = 0
        L_0x007a:
            if (r4 >= r5) goto L_0x0008
            r3 = r6[r4]
            boolean r0 = r3 instanceof X.C54332hG
            if (r0 == 0) goto L_0x0096
            r0 = r3
            X.2hG r0 = (X.C54332hG) r0
            java.lang.String r2 = r0.A00
        L_0x0087:
            if (r2 == 0) goto L_0x0093
            int r1 = r3.A00
            X.032 r0 = new X.032
            r0.<init>(r1, r2)
            r9.A09(r0)
        L_0x0093:
            int r4 = r4 + 1
            goto L_0x007a
        L_0x0096:
            int r1 = r3.A01
            r0 = -1
            if (r1 == r0) goto L_0x0093
            android.content.Context r1 = r8.getContext()
            int r0 = r3.A01
            java.lang.String r2 = r1.getString(r0)
            goto L_0x0087
        L_0x00a6:
            super.A06(r8, r9)
            java.lang.Object r0 = r7.A00
            X.1ZK r0 = (X.AnonymousClass1ZK) r0
            X.00l r1 = r0.A0j
            r0 = 2131892831(0x7f121a5f, float:1.9420421E38)
            java.lang.String r1 = r1.getString(r0)
            goto L_0x00e6
        L_0x00b7:
            super.A06(r8, r9)
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo r2 = r9.A01
            r2.setClickable(r0)
            r2.setLongClickable(r0)
            X.032 r0 = X.AnonymousClass032.A05
            r9.A0A(r0)
            java.lang.Object r0 = r7.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131891853(0x7f12168d, float:1.9418438E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x010c
        L_0x00d8:
            super.A06(r8, r9)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131891430(0x7f1214e6, float:1.941758E38)
            java.lang.CharSequence r1 = r1.getText(r0)
        L_0x00e6:
            r0 = 16
            X.032 r2 = new X.032
            r2.<init>(r0, r1)
            goto L_0x0124
        L_0x00ee:
            super.A06(r8, r9)
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo r2 = r9.A01
            r2.setClickable(r0)
            r2.setLongClickable(r0)
            X.032 r0 = X.AnonymousClass032.A05
            r9.A0A(r0)
            java.lang.Object r0 = r7.A00
            X.1yj r0 = (X.C42821yj) r0
            X.1yV r1 = r0.A22
            r0 = 2131891034(0x7f12135a, float:1.9416777E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x010c:
            r2.setContentDescription(r0)
            return
        L_0x0110:
            super.A06(r8, r9)
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo r1 = r9.A01
            r1.setLongClickable(r0)
            X.032 r0 = X.AnonymousClass032.A0F
            r9.A0A(r0)
            r0 = 1
            r1.setClickable(r0)
            X.032 r2 = X.AnonymousClass032.A05
        L_0x0124:
            r9.A09(r2)
            return
        L_0x0128:
            super.A06(r8, r9)
            java.lang.String r1 = ""
            goto L_0x0155
        L_0x012e:
            super.A06(r8, r9)
            java.lang.Object r0 = r7.A00
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            java.util.ArrayList r0 = r0.A0c
            int r0 = r0.size()
            X.09M r0 = X.AnonymousClass09M.A00(r0)
            r9.A0I(r0)
            return
        L_0x0143:
            super.A06(r8, r9)
            java.lang.Object r0 = r7.A00
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131886410(0x7f12014a, float:1.9407398E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x0155:
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.A01
            r0.setContentDescription(r1)
            return
        L_0x015b:
            super.A06(r8, r9)
            r1 = 1048576(0x100000, float:1.469368E-39)
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.A01
            r0.addAction(r1)
            r0 = 1
            r9.A0K(r0)
            return
        L_0x016a:
            super.A06(r8, r9)
            r2 = 0
            android.view.accessibility.AccessibilityNodeInfo r1 = r9.A01
            r1.setClickable(r2)
            X.032 r0 = X.AnonymousClass032.A05
            r9.A0A(r0)
            r1.setLongClickable(r2)
            goto L_0x018d
        L_0x017c:
            super.A06(r8, r9)
            r1 = 0
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.A01
            r0.setClickable(r1)
            r0.setLongClickable(r1)
            X.032 r0 = X.AnonymousClass032.A05
            r9.A0A(r0)
        L_0x018d:
            X.032 r0 = X.AnonymousClass032.A0F
        L_0x018f:
            r9.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxDCompatShape22S0100000_2_I0.A06(android.view.View, X.031):void");
    }
}

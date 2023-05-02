package X;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.chip.Chip;
import java.util.List;

/* renamed from: X.2q7  reason: invalid class name and case insensitive filesystem */
public class C57092q7 extends AnonymousClass0EL {
    public final /* synthetic */ Chip A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57092q7(Chip chip, Chip chip2) {
        super(chip2);
        this.A00 = chip;
    }

    public int A07(float f2, float f3) {
        Chip chip = this.A00;
        C56352nV r0 = chip.A04;
        return (r0 == null || r0.A02() == null || !chip.getCloseIconTouchBounds().contains(f2, f3)) ? -1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.AnonymousClass031 r5) {
        /*
            r4 = this;
            com.google.android.material.chip.Chip r2 = r4.A00
            X.2nV r0 = r2.A04
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.A0g
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            android.view.accessibility.AccessibilityNodeInfo r3 = r5.A01
            r3.setCheckable(r0)
            java.lang.Class<com.google.android.material.chip.Chip> r0 = com.google.android.material.chip.Chip.class
            java.lang.String r0 = r0.getName()
            r3.setClassName(r0)
            java.lang.CharSequence r2 = r2.getText()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0028
            r3.setText(r2)
            return
        L_0x0028:
            r3.setContentDescription(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57092q7.A0C(X.031):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass031 r9, int r10) {
        /*
            r8 = this;
            com.google.android.material.chip.Chip r7 = r8.A00
            X.2nV r0 = r7.A04
            if (r0 == 0) goto L_0x000d
            android.graphics.drawable.Drawable r1 = r0.A02()
            r0 = 1
            if (r1 != 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0050
            java.lang.CharSequence r0 = r7.getCloseIconContentDescription()
            if (r0 != 0) goto L_0x0037
            java.lang.CharSequence r5 = r7.getText()
            android.content.Context r4 = r7.getContext()
            r3 = 2131893539(0x7f121d23, float:1.9421857E38)
            java.lang.Object[] r2 = X.C13680ns.A1b()
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x002f
            r6 = r5
        L_0x002f:
            java.lang.String r0 = X.C13680ns.A0d(r4, r6, r2, r1, r3)
            java.lang.String r0 = r0.trim()
        L_0x0037:
            android.view.accessibility.AccessibilityNodeInfo r1 = r9.A01
            r1.setContentDescription(r0)
            android.graphics.Rect r0 = r7.getCloseIconTouchBoundsInt()
            r1.setBoundsInParent(r0)
            X.032 r0 = X.AnonymousClass032.A05
            r9.A09(r0)
            boolean r0 = r7.isEnabled()
            r1.setEnabled(r0)
            return
        L_0x0050:
            android.view.accessibility.AccessibilityNodeInfo r1 = r9.A01
            r1.setContentDescription(r6)
            android.graphics.Rect r0 = com.google.android.material.chip.Chip.A0D
            r1.setBoundsInParent(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57092q7.A0D(X.031, int):void");
    }

    public void A0E(List list) {
        C56352nV r0 = this.A00.A04;
        if (r0 != null && r0.A02() != null) {
            list.add(C13680ns.A0X());
        }
    }

    public boolean A0H(int i2, int i3, Bundle bundle) {
        boolean z2;
        if (i3 != 16 || i2 != 0) {
            return false;
        }
        Chip chip = this.A00;
        chip.playSoundEffect(0);
        View.OnClickListener onClickListener = chip.A02;
        if (onClickListener != null) {
            onClickListener.onClick(chip);
            z2 = true;
        } else {
            z2 = false;
        }
        chip.A0C.A0B(0, 1);
        return z2;
    }
}

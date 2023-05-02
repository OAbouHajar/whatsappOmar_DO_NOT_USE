package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: X.0RY  reason: invalid class name */
public class AnonymousClass0RY {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04;
    public final CompoundButton A05;

    public AnonymousClass0RY(CompoundButton compoundButton) {
        this.A05 = compoundButton;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = X.AnonymousClass06U.A00(r2.A05);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(int r3) {
        /*
            r2 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 >= r0) goto L_0x0013
            android.widget.CompoundButton r0 = r2.A05
            android.graphics.drawable.Drawable r0 = X.AnonymousClass06U.A00(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RY.A00(int):int");
    }

    public void A01() {
        CompoundButton compoundButton = this.A05;
        Drawable A002 = AnonymousClass06U.A00(compoundButton);
        if (A002 == null) {
            return;
        }
        if (this.A02 || this.A03) {
            Drawable mutate = C018208n.A03(A002).mutate();
            if (this.A02) {
                C018208n.A04(this.A00, mutate);
            }
            if (this.A03) {
                C018208n.A07(this.A01, mutate);
            }
            if (mutate.isStateful()) {
                mutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|(2:6|7)|8|9|(1:13)|14|(1:16)|17|(1:19)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r7 = r10.A05
            android.content.Context r0 = r7.getContext()
            int[] r8 = X.AnonymousClass05L.A0B
            r3 = 0
            r6 = r11
            r9 = r12
            X.07T r2 = X.AnonymousClass07T.A00(r0, r11, r8, r12, r3)
            android.content.Context r4 = r7.getContext()
            android.content.res.TypedArray r5 = r2.A02
            X.C004601z.A0N(r4, r5, r6, r7, r8, r9)
            r0 = 1
            boolean r0 = r5.hasValue(r0)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0032
            r0 = 1
            int r1 = r5.getResourceId(r0, r3)     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x0032
            android.content.Context r0 = r7.getContext()     // Catch:{ NotFoundException -> 0x0032 }
            android.graphics.drawable.Drawable r0 = X.AnonymousClass06L.A01(r0, r1)     // Catch:{ NotFoundException -> 0x0032 }
            r7.setButtonDrawable(r0)     // Catch:{ NotFoundException -> 0x0032 }
            goto L_0x0049
        L_0x0032:
            boolean r0 = r5.hasValue(r3)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0049
            int r1 = r5.getResourceId(r3, r3)     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x0049
            android.content.Context r0 = r7.getContext()     // Catch:{ all -> 0x0070 }
            android.graphics.drawable.Drawable r0 = X.AnonymousClass06L.A01(r0, r1)     // Catch:{ all -> 0x0070 }
            r7.setButtonDrawable(r0)     // Catch:{ all -> 0x0070 }
        L_0x0049:
            r1 = 2
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0057
            android.content.res.ColorStateList r0 = r2.A01(r1)     // Catch:{ all -> 0x0070 }
            X.AnonymousClass06U.A01(r0, r7)     // Catch:{ all -> 0x0070 }
        L_0x0057:
            r0 = 3
            boolean r0 = r5.hasValue(r0)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006c
            r1 = 3
            r0 = -1
            int r1 = r5.getInt(r1, r0)     // Catch:{ all -> 0x0070 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C015307j.A00(r0, r1)     // Catch:{ all -> 0x0070 }
            X.AnonymousClass06U.A02(r0, r7)     // Catch:{ all -> 0x0070 }
        L_0x006c:
            r2.A04()
            return
        L_0x0070:
            r0 = move-exception
            r2.A04()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RY.A02(android.util.AttributeSet, int):void");
    }
}

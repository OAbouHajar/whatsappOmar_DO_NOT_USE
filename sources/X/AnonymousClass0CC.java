package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0CC  reason: invalid class name */
public class AnonymousClass0CC extends FrameLayout {
    public ViewGroup A00;
    public boolean A01 = true;

    public AnonymousClass0CC(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.A00 = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        AnonymousClass0We.A01(this.A00).A4U(this);
    }

    public static void A00(View view, ArrayList arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            A00((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007b, code lost:
        if (r10.getZ() > r9.getZ()) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        if (r5.size() == r1) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C02430Bw r12) {
        /*
            r11 = this;
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            android.view.View r0 = r12.A04
            A00(r0, r6)
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            int r0 = r11.getChildCount()
            int r4 = r0 + -1
            r3 = 0
        L_0x0014:
            if (r3 > r4) goto L_0x00a2
            int r0 = r3 + r4
            int r2 = r0 >> 1
            android.view.View r0 = r11.getChildAt(r2)
            X.0Bw r0 = (X.C02430Bw) r0
            android.view.View r0 = r0.A04
            A00(r0, r5)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x007d
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x007d
            r0 = 0
            java.lang.Object r1 = r6.get(r0)
            java.lang.Object r0 = r5.get(r0)
            if (r1 != r0) goto L_0x007d
            int r1 = r6.size()
            int r0 = r5.size()
            int r1 = java.lang.Math.min(r1, r0)
            r0 = 1
        L_0x0049:
            if (r0 >= r1) goto L_0x0098
            android.view.View r10 = X.AnonymousClass000.A0N(r6, r0)
            android.view.View r9 = X.AnonymousClass000.A0N(r5, r0)
            if (r10 == r9) goto L_0x0095
            android.view.ViewParent r8 = r10.getParent()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r7 = r8.getChildCount()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0083
            float r1 = r10.getZ()
            float r0 = r9.getZ()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0083
            float r1 = r10.getZ()
            float r0 = r9.getZ()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x009f
        L_0x007d:
            int r3 = r2 + 1
        L_0x007f:
            r5.clear()
            goto L_0x0014
        L_0x0083:
            r1 = 0
        L_0x0084:
            if (r1 >= r7) goto L_0x007d
            int r0 = X.AnonymousClass0We.A00(r8, r1)
            android.view.View r0 = r8.getChildAt(r0)
            if (r0 == r10) goto L_0x009f
            if (r0 == r9) goto L_0x007d
            int r1 = r1 + 1
            goto L_0x0084
        L_0x0095:
            int r0 = r0 + 1
            goto L_0x0049
        L_0x0098:
            int r0 = r5.size()
            if (r0 != r1) goto L_0x009f
            goto L_0x007d
        L_0x009f:
            int r4 = r2 + -1
            goto L_0x007f
        L_0x00a2:
            if (r3 < 0) goto L_0x00ae
            int r0 = r11.getChildCount()
            if (r3 >= r0) goto L_0x00ae
            r11.addView(r12, r3)
            return
        L_0x00ae:
            r11.addView(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CC.A01(X.0Bw):void");
    }

    public void onViewAdded(View view) {
        if (this.A01) {
            super.onViewAdded(view);
            return;
        }
        throw AnonymousClass000.A0V("This GhostViewHolder is detached!");
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            ViewGroup viewGroup = this.A00;
            viewGroup.setTag(R.id.ghost_view_holder, (Object) null);
            AnonymousClass0We.A01(viewGroup).Abr(this);
            this.A01 = false;
        }
    }
}

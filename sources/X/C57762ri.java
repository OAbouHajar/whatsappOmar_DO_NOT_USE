package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.widget.CheckBox;
import com.obwhatsapp.R;

/* renamed from: X.2ri  reason: invalid class name and case insensitive filesystem */
public class C57762ri extends C005602k implements AnonymousClass023 {
    public final View A00;
    public final CheckBox A01;
    public final int[] A02;
    public final int[] A03;

    public C57762ri(View view, int[] iArr, int[] iArr2) {
        super(view);
        this.A00 = C004601z.A0E(view, R.id.selectionRingContainer);
        this.A01 = (CheckBox) C004601z.A0E(view, R.id.selectionRing);
        this.A02 = iArr;
        this.A03 = iArr2;
    }

    public void A07(boolean z2, int i2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        CheckBox checkBox = this.A01;
        Resources resources = checkBox.getResources();
        int i3 = R.drawable.group_profile_emoji_editor_color_selection_unchecked;
        if (z2) {
            i3 = R.drawable.group_profile_emoji_editor_color_selection_checked;
        }
        Drawable A04 = AnonymousClass00X.A04(C13700nu.A04(checkBox), resources, i3);
        AnonymousClass00B.A06(A04);
        LayerDrawable layerDrawable = (LayerDrawable) A04;
        int[] iArr = this.A02;
        int i4 = iArr[i2 % iArr.length];
        int[] iArr2 = this.A03;
        int i5 = iArr2[i2 % iArr2.length];
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.color_selection_ring);
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.color_selection_circle);
        Drawable A06 = AnonymousClass2SR.A06(findDrawableByLayerId, i5);
        Drawable A062 = AnonymousClass2SR.A06(findDrawableByLayerId2, i4);
        layerDrawable.setDrawableByLayerId(R.id.color_selection_ring, A06);
        layerDrawable.setDrawableByLayerId(R.id.color_selection_circle, A062);
        stateListDrawable.addState(StateSet.WILD_CARD, layerDrawable);
        stateListDrawable.mutate();
        checkBox.setButtonDrawable(stateListDrawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r1 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void AOH(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r6.A00()
            int r0 = r7.intValue()
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1R(r5, r0)
            android.widget.CheckBox r2 = r6.A01
            boolean r1 = r2.isChecked()
            if (r3 == 0) goto L_0x001a
            r0 = 1
            if (r1 == 0) goto L_0x002c
        L_0x001a:
            r0 = 0
            if (r3 != 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
        L_0x001f:
            if (r5 < 0) goto L_0x0028
            if (r0 != 0) goto L_0x0025
            if (r4 == 0) goto L_0x0028
        L_0x0025:
            r6.A07(r3, r5)
        L_0x0028:
            r2.setChecked(r3)
            return
        L_0x002c:
            r4 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57762ri.AOH(java.lang.Object):void");
    }
}

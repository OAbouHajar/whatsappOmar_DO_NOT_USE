package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.06a  reason: invalid class name and case insensitive filesystem */
public abstract class C012306a extends View {
    public int A00;
    public Context A01;
    public C12340kE A02;
    public String A03;
    public HashMap A04 = new HashMap();
    public int[] A05 = new int[32];

    public C012306a(Context context) {
        super(context);
        this.A01 = context;
        A04((AttributeSet) null);
    }

    public C012306a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = context;
        A04(attributeSet);
    }

    public C012306a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A01 = context;
        A04(attributeSet);
    }

    public final int A00(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (!(str == null || (resources = this.A01.getResources()) == null)) {
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                if (childAt.getId() != -1) {
                    String str2 = null;
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void A01() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            A06((ConstraintLayout) parent);
        }
    }

    public void A02() {
        if (this.A02 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof AnonymousClass06X) {
                ((AnonymousClass06X) layoutParams).A0r = (AnonymousClass0SN) this.A02;
            }
        }
    }

    public final void A03(int i2) {
        if (i2 != getId()) {
            int i3 = this.A00 + 1;
            int[] iArr = this.A05;
            int length = iArr.length;
            if (i3 > length) {
                iArr = Arrays.copyOf(iArr, length << 1);
                this.A05 = iArr;
            }
            int i4 = this.A00;
            iArr[i4] = i2;
            this.A00 = i4 + 1;
        }
    }

    public void A04(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0NK.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.A03 = string;
                    setIds(string);
                }
            }
        }
    }

    public void A05(AnonymousClass0SN r1, boolean z2) {
    }

    public void A06(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i2 = 0; i2 < this.A00; i2++) {
            View view = (View) constraintLayout.A06.get(this.A05[i2]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void A07(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r2 != 0) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r2 == 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        if (r4 != null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x00a0
            int r0 = r8.length()
            if (r0 == 0) goto L_0x00a0
            android.content.Context r6 = r7.A01
            if (r6 == 0) goto L_0x00a0
            java.lang.String r3 = r8.trim()
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L_0x001b
            r7.getParent()
        L_0x001b:
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r5 = 0
            if (r0 == 0) goto L_0x005d
            android.view.ViewParent r4 = r7.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
        L_0x002a:
            boolean r0 = r7.isInEditMode()
            r2 = 0
            if (r0 == 0) goto L_0x005a
            if (r4 == 0) goto L_0x005f
            if (r3 == 0) goto L_0x0058
            java.util.HashMap r0 = r4.A0E
            if (r0 == 0) goto L_0x0058
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0058
            java.util.HashMap r0 = r4.A0E
            java.lang.Object r1 = r0.get(r3)
        L_0x0045:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0051
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            if (r2 != 0) goto L_0x0094
        L_0x0051:
            int r2 = r7.A00(r4, r3)
            if (r2 != 0) goto L_0x0094
            goto L_0x005f
        L_0x0058:
            r1 = 0
            goto L_0x0045
        L_0x005a:
            if (r4 == 0) goto L_0x005f
            goto L_0x0051
        L_0x005d:
            r4 = r5
            goto L_0x002a
        L_0x005f:
            java.lang.Class<X.0LH> r0 = X.AnonymousClass0LH.class
            java.lang.reflect.Field r0 = r0.getField(r3)     // Catch:{ Exception -> 0x0069 }
            int r2 = r0.getInt(r5)     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            if (r2 != 0) goto L_0x0094
            android.content.res.Resources r2 = r6.getResources()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "id"
            int r2 = r2.getIdentifier(r3, r0, r1)
            if (r2 != 0) goto L_0x0094
            java.lang.String r0 = "Could not find id of \""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = "\""
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r1)
            return
        L_0x0094:
            java.util.HashMap r1 = r7.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r3)
            r7.A03(r2)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012306a.A08(java.lang.String):void");
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.A05, this.A00);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.A03;
        if (str != null) {
            setIds(str);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.A03 = str;
        if (str != null) {
            int i2 = 0;
            this.A00 = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    A08(str.substring(i2));
                    return;
                } else {
                    A08(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.A03 = null;
        this.A00 = 0;
        for (int A032 : iArr) {
            A03(A032);
        }
    }
}

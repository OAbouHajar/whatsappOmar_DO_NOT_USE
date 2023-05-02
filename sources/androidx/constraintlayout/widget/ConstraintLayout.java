package androidx.constraintlayout.widget;

import X.AnonymousClass053;
import X.AnonymousClass06X;
import X.AnonymousClass0Dl;
import X.AnonymousClass0Dp;
import X.AnonymousClass0NK;
import X.AnonymousClass0SN;
import X.AnonymousClass0VD;
import X.C012306a;
import X.C03950Kn;
import X.C04820Ob;
import X.C06500Wj;
import X.C07230ap;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {
    public int A00 = -1;
    public int A01 = Integer.MAX_VALUE;
    public int A02 = Integer.MAX_VALUE;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 263;
    public SparseArray A06 = new SparseArray();
    public SparseArray A07 = new SparseArray();
    public AnonymousClass0Dp A08 = new AnonymousClass0Dp();
    public C07230ap A09 = new C07230ap(this, this);
    public C04820Ob A0A = null;
    public C06500Wj A0B = null;
    public C03950Kn A0C;
    public ArrayList A0D = new ArrayList(4);
    public HashMap A0E = new HashMap();
    public boolean A0F = true;

    public ConstraintLayout(Context context) {
        super(context);
        A01((AttributeSet) null, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01(attributeSet, i2, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A01(attributeSet, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r0 = java.lang.Math.max(0, getPaddingEnd()) + java.lang.Math.max(0, getPaddingStart());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getPaddingWidth() {
        /*
            r4 = this;
            int r0 = r4.getPaddingLeft()
            r3 = 0
            int r2 = java.lang.Math.max(r3, r0)
            int r0 = r4.getPaddingRight()
            int r0 = java.lang.Math.max(r3, r0)
            int r2 = r2 + r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 < r0) goto L_0x002c
            int r0 = r4.getPaddingStart()
            int r1 = java.lang.Math.max(r3, r0)
            int r0 = r4.getPaddingEnd()
            int r0 = java.lang.Math.max(r3, r0)
            int r0 = r0 + r1
            if (r0 <= 0) goto L_0x002c
            return r0
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.getPaddingWidth():int");
    }

    public final AnonymousClass0SN A00(View view) {
        if (view == this) {
            return this.A08;
        }
        if (view == null) {
            return null;
        }
        return ((AnonymousClass06X) view.getLayoutParams()).A0r;
    }

    public final void A01(AttributeSet attributeSet, int i2, int i3) {
        AnonymousClass0Dp r8 = this.A08;
        r8.A0e = this;
        C07230ap r1 = this.A09;
        r8.A06 = r1;
        r8.A08.A03 = r1;
        this.A06.put(getId(), this);
        this.A0B = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0NK.A01, i2, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 9) {
                    this.A04 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A04);
                } else if (index == 10) {
                    this.A03 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A03);
                } else if (index == 7) {
                    this.A02 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A02);
                } else if (index == 8) {
                    this.A01 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A01);
                } else if (index == 89) {
                    this.A05 = obtainStyledAttributes.getInt(index, this.A05);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.A0A = new C04820Ob(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.A0A = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C06500Wj r11 = new C06500Wj();
                        this.A0B = r11;
                        Context context = getContext();
                        XmlResourceParser xml = context.getResources().getXml(resourceId2);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    AnonymousClass053 A042 = r11.A04(context, Xml.asAttributeSet(xml));
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        A042.A02.A0y = true;
                                    }
                                    r11.A00.put(Integer.valueOf(A042.A00), A042);
                                }
                            }
                        } catch (IOException | XmlPullParserException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Resources.NotFoundException unused2) {
                        this.A0B = null;
                    }
                    this.A00 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i5 = this.A05;
        r8.A01 = i5;
        boolean z2 = false;
        if ((i5 & 256) == 256) {
            z2 = true;
        }
        AnonymousClass0VD.A0F = z2;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass06X;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r24) {
        /*
            r23 = this;
            r10 = r23
            java.util.ArrayList r2 = r10.A0D
            r16 = 0
            if (r2 == 0) goto L_0x0017
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x0017
            r0 = 0
        L_0x000f:
            r2.get(r0)
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x0017
            goto L_0x000f
        L_0x0017:
            r11 = r24
            super.dispatchDraw(r11)
            boolean r0 = r10.isInEditMode()
            if (r0 == 0) goto L_0x00d2
            int r9 = r10.getChildCount()
            int r0 = r10.getWidth()
            float r8 = (float) r0
            int r0 = r10.getHeight()
            float r7 = (float) r0
            r15 = 1149698048(0x44870000, float:1080.0)
            r14 = 1156579328(0x44f00000, float:1920.0)
            r6 = 0
        L_0x0035:
            if (r6 >= r9) goto L_0x00d2
            android.view.View r2 = r10.getChildAt(r6)
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00ce
            java.lang.Object r1 = r2.getTag()
            if (r1 == 0) goto L_0x00ce
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00ce
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)
            int r2 = r1.length
            r0 = 4
            if (r2 != r0) goto L_0x00ce
            r0 = r1[r16]
            int r4 = java.lang.Integer.parseInt(r0)
            r0 = 1
            r0 = r1[r0]
            int r3 = java.lang.Integer.parseInt(r0)
            r0 = 2
            r0 = r1[r0]
            int r2 = java.lang.Integer.parseInt(r0)
            r0 = 3
            r0 = r1[r0]
            int r1 = java.lang.Integer.parseInt(r0)
            float r0 = (float) r4
            float r0 = r0 / r15
            float r0 = r0 * r8
            int r13 = (int) r0
            float r0 = (float) r3
            float r0 = r0 / r14
            float r0 = r0 * r7
            int r12 = (int) r0
            float r0 = (float) r2
            float r0 = r0 / r15
            float r0 = r0 * r8
            int r2 = (int) r0
            float r0 = (float) r1
            float r0 = r0 / r14
            float r0 = r0 * r7
            int r1 = (int) r0
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r5.setColor(r0)
            float r4 = (float) r13
            float r3 = (float) r12
            int r13 = r13 + r2
            float r2 = (float) r13
            r19 = r3
            r20 = r2
            r21 = r3
            r22 = r5
            r18 = r4
            r17 = r11
            r17.drawLine(r18, r19, r20, r21, r22)
            int r12 = r12 + r1
            float r1 = (float) r12
            r18 = r2
            r21 = r1
            r17.drawLine(r18, r19, r20, r21, r22)
            r19 = r1
            r20 = r4
            r17.drawLine(r18, r19, r20, r21, r22)
            r21 = r3
            r18 = r4
            r17.drawLine(r18, r19, r20, r21, r22)
            r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r5.setColor(r0)
            r19 = r3
            r20 = r2
            r21 = r1
            r17.drawLine(r18, r19, r20, r21, r22)
            r19 = r1
            r21 = r3
            r17.drawLine(r18, r19, r20, r21, r22)
        L_0x00ce:
            int r6 = r6 + 1
            goto L_0x0035
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void forceLayout() {
        this.A0F = true;
        super.forceLayout();
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass06X(-2, -2);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass06X(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass06X(layoutParams);
    }

    public int getMaxHeight() {
        return this.A01;
    }

    public int getMaxWidth() {
        return this.A02;
    }

    public int getMinHeight() {
        return this.A03;
    }

    public int getMinWidth() {
        return this.A04;
    }

    public int getOptimizationLevel() {
        return this.A08.A01;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            AnonymousClass06X r2 = (AnonymousClass06X) childAt.getLayoutParams();
            AnonymousClass0SN r4 = r2.A0r;
            if (childAt.getVisibility() != 8 || r2.A0x || r2.A0y || isInEditMode) {
                int A052 = r4.A05();
                int A062 = r4.A06();
                childAt.layout(A052, A062, r4.A04() + A052, r4.A03() + A062);
            }
        }
        ArrayList arrayList = this.A0D;
        int size = arrayList.size();
        if (size > 0) {
            do {
                ((C012306a) arrayList.get(i6)).A07(this);
                i6++;
            } while (i6 < size);
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 742 */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06fd, code lost:
        if (r14.A01 <= 0.0f) goto L_0x06ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0711, code lost:
        if (r2 != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0799, code lost:
        if (r16 == 0) goto L_0x07a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x07a1, code lost:
        if (r16 == 0) goto L_0x07a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x07a3, code lost:
        r14 = java.lang.Math.max(0, r5.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x07b8, code lost:
        if (r16 == 0) goto L_0x07bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x07bd, code lost:
        if (r16 == 0) goto L_0x07bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x07bf, code lost:
        r15 = java.lang.Math.max(0, r5.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0972, code lost:
        if (r8 != 2) goto L_0x0974;
     */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04b4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x069d  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x06a5  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x06c9  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x06d9  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x079f  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x07bb  */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x09d9  */
    /* JADX WARNING: Removed duplicated region for block: B:647:0x070a A[EDGE_INSN: B:647:0x070a->B:368:0x070a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:663:0x095d A[EDGE_INSN: B:663:0x095d->B:478:0x095d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r5 = r30
            X.0Dp r0 = r5.A08
            r27 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r0 = 17
            if (r1 < r0) goto L_0x0024
            android.content.Context r0 = r5.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r2 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r0
            r1 = 1
            if (r2 == 0) goto L_0x0024
            int r0 = r5.getLayoutDirection()
            if (r1 != r0) goto L_0x0024
            r3 = 1
        L_0x0024:
            r0 = r27
            r0.A0A = r3
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x05bc
            r4 = 0
            r5.A0F = r4
            int r2 = r5.getChildCount()
            r1 = 0
        L_0x0034:
            if (r1 >= r2) goto L_0x05bc
            android.view.View r0 = r5.getChildAt(r1)
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L_0x005d
            r6 = 1
            boolean r16 = r5.isInEditMode()
            int r7 = r5.getChildCount()
            r8 = 0
            r1 = 0
        L_0x004b:
            if (r1 >= r7) goto L_0x0060
            android.view.View r0 = r5.getChildAt(r1)
            X.0SN r0 = r5.A00(r0)
            if (r0 == 0) goto L_0x005a
            r0.A08()
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x004b
        L_0x005d:
            int r1 = r1 + 1
            goto L_0x0034
        L_0x0060:
            r3 = -1
            if (r16 == 0) goto L_0x00e4
            r10 = 0
        L_0x0064:
            if (r10 >= r7) goto L_0x00e4
            android.view.View r11 = r5.getChildAt(r10)
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ NotFoundException -> 0x00e1 }
            int r0 = r11.getId()     // Catch:{ NotFoundException -> 0x00e1 }
            java.lang.String r9 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x00e1 }
            int r0 = r11.getId()     // Catch:{ NotFoundException -> 0x00e1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x00e1 }
            if (r9 == 0) goto L_0x009f
            java.util.HashMap r0 = r5.A0E     // Catch:{ NotFoundException -> 0x00e1 }
            if (r0 != 0) goto L_0x008b
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ NotFoundException -> 0x00e1 }
            r0.<init>()     // Catch:{ NotFoundException -> 0x00e1 }
            r5.A0E = r0     // Catch:{ NotFoundException -> 0x00e1 }
        L_0x008b:
            r1 = r9
            java.lang.String r0 = "/"
            int r0 = r9.indexOf(r0)     // Catch:{ NotFoundException -> 0x00e1 }
            if (r0 == r3) goto L_0x009a
            int r0 = r0 + 1
            java.lang.String r1 = r9.substring(r0)     // Catch:{ NotFoundException -> 0x00e1 }
        L_0x009a:
            java.util.HashMap r0 = r5.A0E     // Catch:{ NotFoundException -> 0x00e1 }
            r0.put(r1, r2)     // Catch:{ NotFoundException -> 0x00e1 }
        L_0x009f:
            r0 = 47
            int r0 = r9.indexOf(r0)     // Catch:{ NotFoundException -> 0x00e1 }
            if (r0 == r3) goto L_0x00ad
            int r0 = r0 + 1
            java.lang.String r9 = r9.substring(r0)     // Catch:{ NotFoundException -> 0x00e1 }
        L_0x00ad:
            int r2 = r11.getId()     // Catch:{ NotFoundException -> 0x00e1 }
            if (r2 == 0) goto L_0x00d4
            android.util.SparseArray r0 = r5.A06     // Catch:{ NotFoundException -> 0x00e1 }
            java.lang.Object r1 = r0.get(r2)     // Catch:{ NotFoundException -> 0x00e1 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ NotFoundException -> 0x00e1 }
            if (r1 != 0) goto L_0x00d1
            android.view.View r1 = r5.findViewById(r2)     // Catch:{ NotFoundException -> 0x00e1 }
            if (r1 == 0) goto L_0x00cf
            if (r1 == r5) goto L_0x00d1
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ NotFoundException -> 0x00e1 }
            if (r0 != r5) goto L_0x00d1
            r5.onViewAdded(r1)     // Catch:{ NotFoundException -> 0x00e1 }
            goto L_0x00d1
        L_0x00cf:
            r0 = 0
            goto L_0x00df
        L_0x00d1:
            if (r1 == r5) goto L_0x00d4
            goto L_0x00d7
        L_0x00d4:
            r0 = r27
            goto L_0x00df
        L_0x00d7:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()     // Catch:{ NotFoundException -> 0x00e1 }
            X.06X r0 = (X.AnonymousClass06X) r0     // Catch:{ NotFoundException -> 0x00e1 }
            X.0SN r0 = r0.A0r     // Catch:{ NotFoundException -> 0x00e1 }
        L_0x00df:
            r0.A0f = r9     // Catch:{ NotFoundException -> 0x00e1 }
        L_0x00e1:
            int r10 = r10 + 1
            goto L_0x0064
        L_0x00e4:
            int r0 = r5.A00
            if (r0 == r3) goto L_0x00f5
            r1 = 0
        L_0x00e9:
            if (r1 >= r7) goto L_0x00f5
            android.view.View r0 = r5.getChildAt(r1)
            r0.getId()
            int r1 = r1 + 1
            goto L_0x00e9
        L_0x00f5:
            X.0Wj r0 = r5.A0B
            if (r0 == 0) goto L_0x00fc
            r0.A05(r5)
        L_0x00fc:
            r0 = r27
            java.util.ArrayList r0 = r0.A00
            r0.clear()
            java.util.ArrayList r13 = r5.A0D
            int r12 = r13.size()
            if (r12 <= 0) goto L_0x0193
            r11 = 0
        L_0x010c:
            java.lang.Object r10 = r13.get(r11)
            X.06a r10 = (X.C012306a) r10
            boolean r0 = r10.isInEditMode()
            if (r0 == 0) goto L_0x011d
            java.lang.String r0 = r10.A03
            r10.setIds(r0)
        L_0x011d:
            X.0kE r0 = r10.A02
            if (r0 == 0) goto L_0x018d
            X.0Do r0 = (X.AnonymousClass0Do) r0
            r0.A00 = r4
            X.0SN[] r1 = r0.A01
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            r9 = 0
        L_0x012c:
            int r0 = r10.A00
            if (r9 >= r0) goto L_0x018d
            int[] r0 = r10.A05
            r1 = r0[r9]
            android.util.SparseArray r15 = r5.A06
            java.lang.Object r0 = r15.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x0163
            java.util.HashMap r14 = r10.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r14.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r10.A00(r5, r2)
            if (r1 == 0) goto L_0x018a
            int[] r0 = r10.A05
            r0[r9] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r14.put(r0, r2)
            java.lang.Object r0 = r15.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x018a
        L_0x0163:
            X.0kE r2 = r10.A02
            X.0SN r14 = r5.A00(r0)
            X.0Do r2 = (X.AnonymousClass0Do) r2
            if (r14 == r2) goto L_0x018a
            if (r14 == 0) goto L_0x018a
            int r0 = r2.A00
            int r15 = r0 + 1
            X.0SN[] r1 = r2.A01
            int r0 = r1.length
            if (r15 <= r0) goto L_0x0182
            int r0 = r0 << 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            X.0SN[] r1 = (X.AnonymousClass0SN[]) r1
            r2.A01 = r1
        L_0x0182:
            int r0 = r2.A00
            r1[r0] = r14
            int r0 = r0 + 1
            r2.A00 = r0
        L_0x018a:
            int r9 = r9 + 1
            goto L_0x012c
        L_0x018d:
            int r11 = r11 + 1
            if (r11 >= r12) goto L_0x0193
            goto L_0x010c
        L_0x0193:
            r0 = 0
        L_0x0194:
            if (r0 >= r7) goto L_0x019c
            r5.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x0194
        L_0x019c:
            android.util.SparseArray r2 = r5.A07
            r2.clear()
            r0 = r27
            r2.put(r4, r0)
            int r1 = r5.getId()
            r2.put(r1, r0)
            r9 = 0
        L_0x01ae:
            if (r9 >= r7) goto L_0x01c2
            android.view.View r0 = r5.getChildAt(r9)
            X.0SN r1 = r5.A00(r0)
            int r0 = r0.getId()
            r2.put(r0, r1)
            int r9 = r9 + 1
            goto L_0x01ae
        L_0x01c2:
            if (r8 >= r7) goto L_0x0578
            android.view.View r10 = r5.getChildAt(r8)
            X.0SN r1 = r5.A00(r10)
            if (r1 == 0) goto L_0x022f
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            X.06X r0 = (X.AnonymousClass06X) r0
            r9 = r27
            java.util.ArrayList r9 = r9.A00
            r9.add(r1)
            X.0SN r9 = r1.A0Z
            if (r9 == 0) goto L_0x01e9
            X.0Dk r9 = (X.AnonymousClass0Dk) r9
            java.util.ArrayList r9 = r9.A00
            r9.remove(r1)
            r9 = 0
            r1.A0Z = r9
        L_0x01e9:
            r9 = r27
            r1.A0Z = r9
            r0.A00()
            int r9 = r10.getVisibility()
            r1.A0N = r9
            r1.A0e = r10
            boolean r9 = r10 instanceof X.C012306a
            if (r9 == 0) goto L_0x0205
            X.06a r10 = (X.C012306a) r10
            r9 = r27
            boolean r9 = r9.A0A
            r10.A05(r1, r9)
        L_0x0205:
            boolean r9 = r0.A0x
            r10 = 17
            if (r9 == 0) goto L_0x024a
            X.0Dl r1 = (X.AnonymousClass0Dl) r1
            int r12 = r0.A0e
            int r11 = r0.A0f
            float r9 = r0.A06
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 >= r10) goto L_0x021d
            int r12 = r0.A0Q
            int r11 = r0.A0R
            float r9 = r0.A01
        L_0x021d:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0232
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x022f
            r1.A00 = r9
            r1.A02 = r3
        L_0x022d:
            r1.A03 = r3
        L_0x022f:
            int r8 = r8 + 1
            goto L_0x01c2
        L_0x0232:
            if (r12 == r3) goto L_0x023d
            if (r12 <= r3) goto L_0x022f
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.A00 = r0
            r1.A02 = r12
            goto L_0x022d
        L_0x023d:
            if (r11 == r3) goto L_0x022f
            if (r11 <= r3) goto L_0x022f
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.A00 = r0
            r1.A02 = r3
            r1.A03 = r11
            goto L_0x022f
        L_0x024a:
            int r14 = r0.A0g
            int r13 = r0.A0h
            int r12 = r0.A0i
            int r11 = r0.A0j
            int r9 = r0.A0c
            r22 = r9
            int r9 = r0.A0d
            r23 = r9
            float r9 = r0.A07
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r10) goto L_0x0289
            int r14 = r0.A0T
            int r13 = r0.A0U
            int r10 = r0.A0k
            int r11 = r0.A0l
            int r9 = r0.A0M
            r22 = r9
            int r9 = r0.A0N
            r23 = r9
            float r9 = r0.A02
            if (r14 != r3) goto L_0x027b
            if (r13 != r3) goto L_0x027b
            int r12 = r0.A0n
            if (r12 == r3) goto L_0x04db
            r14 = r12
        L_0x027b:
            if (r10 != r3) goto L_0x04d8
            if (r11 != r3) goto L_0x04d8
            int r12 = r0.A0J
            if (r12 != r3) goto L_0x0289
            int r12 = r0.A0I
            if (r12 == r3) goto L_0x04d8
            r11 = r12
            r12 = -1
        L_0x0289:
            int r10 = r0.A0D
            if (r10 == r3) goto L_0x03a1
            java.lang.Object r11 = r2.get(r10)
            X.0SN r11 = (X.AnonymousClass0SN) r11
            if (r11 == 0) goto L_0x02aa
            float r10 = r0.A00
            int r9 = r0.A0E
            X.0KD r18 = X.AnonymousClass0KD.CENTER
            r22 = 0
            r17 = r1
            r19 = r18
            r20 = r11
            r21 = r9
            r17.A0G(r18, r19, r20, r21, r22)
            r1.A00 = r10
        L_0x02aa:
            if (r16 == 0) goto L_0x02ba
            int r10 = r0.A0G
            if (r10 != r3) goto L_0x02b4
            int r9 = r0.A0H
            if (r9 == r3) goto L_0x02ba
        L_0x02b4:
            int r9 = r0.A0H
            r1.A0P = r10
            r1.A0Q = r9
        L_0x02ba:
            boolean r9 = r0.A0w
            r11 = -2
            if (r9 != 0) goto L_0x038c
            int r9 = r0.width
            if (r9 != r3) goto L_0x0381
            boolean r9 = r0.A0v
            if (r9 == 0) goto L_0x037d
            X.0Jy r10 = X.C03810Jy.MATCH_CONSTRAINT
        L_0x02c9:
            X.0Jy[] r9 = r1.A0o
            r9[r4] = r10
            X.0KD r9 = X.AnonymousClass0KD.LEFT
            X.0S1 r10 = r1.A07(r9)
            int r9 = r0.leftMargin
            r10.A01 = r9
            X.0KD r9 = X.AnonymousClass0KD.RIGHT
            X.0S1 r10 = r1.A07(r9)
            int r9 = r0.rightMargin
            r10.A01 = r9
        L_0x02e1:
            boolean r9 = r0.A10
            if (r9 != 0) goto L_0x0369
            int r9 = r0.height
            if (r9 != r3) goto L_0x035f
            boolean r9 = r0.A0u
            if (r9 == 0) goto L_0x035c
            X.0Jy r10 = X.C03810Jy.MATCH_CONSTRAINT
        L_0x02ef:
            X.0Jy[] r9 = r1.A0o
            r9[r6] = r10
            X.0KD r9 = X.AnonymousClass0KD.TOP
            X.0S1 r10 = r1.A07(r9)
            int r9 = r0.topMargin
            r10.A01 = r9
            X.0KD r9 = X.AnonymousClass0KD.BOTTOM
            X.0S1 r10 = r1.A07(r9)
            int r9 = r0.bottomMargin
            r10.A01 = r9
        L_0x0307:
            java.lang.String r10 = r0.A0t
            r12 = 0
            if (r10 == 0) goto L_0x050f
            int r13 = r10.length()
            if (r13 == 0) goto L_0x050f
            r11 = -1
            r9 = 44
            int r14 = r10.indexOf(r9)
            r15 = 0
            if (r14 <= 0) goto L_0x032f
            int r9 = r13 + -1
            if (r14 >= r9) goto L_0x032f
            java.lang.String r15 = r10.substring(r4, r14)
            java.lang.String r9 = "W"
            boolean r9 = r15.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0352
            r11 = 0
        L_0x032d:
            int r15 = r14 + 1
        L_0x032f:
            r9 = 58
            int r9 = r10.indexOf(r9)
            if (r9 < 0) goto L_0x0500
            int r13 = r13 - r6
            if (r9 >= r13) goto L_0x0500
            java.lang.String r13 = r10.substring(r15, r9)
            int r9 = r9 + 1
            java.lang.String r10 = r10.substring(r9)
            int r9 = r13.length()
            if (r9 <= 0) goto L_0x051a
            int r9 = r10.length()
            if (r9 <= 0) goto L_0x051a
            goto L_0x04e2
        L_0x0352:
            java.lang.String r9 = "H"
            boolean r9 = r15.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x032d
            r11 = 1
            goto L_0x032d
        L_0x035c:
            X.0Jy r10 = X.C03810Jy.MATCH_PARENT
            goto L_0x02ef
        L_0x035f:
            X.0Jy r10 = X.C03810Jy.MATCH_CONSTRAINT
            X.0Jy[] r9 = r1.A0o
            r9[r6] = r10
            r1.A09(r4)
            goto L_0x0307
        L_0x0369:
            X.0Jy r10 = X.C03810Jy.FIXED
            X.0Jy[] r9 = r1.A0o
            r9[r6] = r10
            int r9 = r0.height
            r1.A09(r9)
            if (r9 != r11) goto L_0x0307
            X.0Jy r10 = X.C03810Jy.WRAP_CONTENT
            X.0Jy[] r9 = r1.A0o
            r9[r6] = r10
            goto L_0x0307
        L_0x037d:
            X.0Jy r10 = X.C03810Jy.MATCH_PARENT
            goto L_0x02c9
        L_0x0381:
            X.0Jy r10 = X.C03810Jy.MATCH_CONSTRAINT
            X.0Jy[] r9 = r1.A0o
            r9[r4] = r10
            r1.A0A(r4)
            goto L_0x02e1
        L_0x038c:
            X.0Jy r10 = X.C03810Jy.FIXED
            X.0Jy[] r9 = r1.A0o
            r9[r4] = r10
            int r9 = r0.width
            r1.A0A(r9)
            if (r9 != r11) goto L_0x02e1
            X.0Jy r10 = X.C03810Jy.WRAP_CONTENT
            X.0Jy[] r9 = r1.A0o
            r9[r4] = r10
            goto L_0x02e1
        L_0x03a1:
            if (r14 == r3) goto L_0x04c6
            java.lang.Object r13 = r2.get(r14)
            X.0SN r13 = (X.AnonymousClass0SN) r13
            if (r13 == 0) goto L_0x03ba
            X.0KD r18 = X.AnonymousClass0KD.LEFT
            int r10 = r0.leftMargin
            r19 = r18
        L_0x03b1:
            r17 = r1
            r20 = r13
            r21 = r10
            r17.A0G(r18, r19, r20, r21, r22)
        L_0x03ba:
            if (r12 == r3) goto L_0x04b4
            java.lang.Object r11 = r2.get(r12)
            X.0SN r11 = (X.AnonymousClass0SN) r11
            if (r11 == 0) goto L_0x03d5
            X.0KD r18 = X.AnonymousClass0KD.RIGHT
            X.0KD r19 = X.AnonymousClass0KD.LEFT
            int r10 = r0.rightMargin
        L_0x03ca:
            r17 = r1
            r20 = r11
            r21 = r10
            r22 = r23
            r17.A0G(r18, r19, r20, r21, r22)
        L_0x03d5:
            int r10 = r0.A0p
            if (r10 == r3) goto L_0x049e
            java.lang.Object r12 = r2.get(r10)
            X.0SN r12 = (X.AnonymousClass0SN) r12
            if (r12 == 0) goto L_0x03f4
            X.0KD r18 = X.AnonymousClass0KD.TOP
            int r11 = r0.topMargin
            int r10 = r0.A0P
            r19 = r18
        L_0x03e9:
            r17 = r1
            r20 = r12
            r21 = r11
            r22 = r10
            r17.A0G(r18, r19, r20, r21, r22)
        L_0x03f4:
            int r10 = r0.A0C
            if (r10 == r3) goto L_0x0488
            java.lang.Object r12 = r2.get(r10)
            X.0SN r12 = (X.AnonymousClass0SN) r12
            if (r12 == 0) goto L_0x0413
            X.0KD r18 = X.AnonymousClass0KD.BOTTOM
            X.0KD r19 = X.AnonymousClass0KD.TOP
            int r11 = r0.bottomMargin
            int r10 = r0.A0K
        L_0x0408:
            r17 = r1
            r20 = r12
            r21 = r11
            r22 = r10
            r17.A0G(r18, r19, r20, r21, r22)
        L_0x0413:
            int r11 = r0.A0A
            if (r11 == r3) goto L_0x0462
            android.util.SparseArray r10 = r5.A06
            java.lang.Object r12 = r10.get(r11)
            android.view.View r12 = (android.view.View) r12
            java.lang.Object r11 = r2.get(r11)
            X.0SN r11 = (X.AnonymousClass0SN) r11
            if (r11 == 0) goto L_0x0462
            if (r12 == 0) goto L_0x0462
            android.view.ViewGroup$LayoutParams r10 = r12.getLayoutParams()
            boolean r10 = r10 instanceof X.AnonymousClass06X
            if (r10 == 0) goto L_0x0462
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            X.06X r13 = (X.AnonymousClass06X) r13
            r0.A0z = r6
            r13.A0z = r6
            X.0KD r10 = X.AnonymousClass0KD.BASELINE
            X.0S1 r12 = r1.A07(r10)
            X.0S1 r11 = r11.A07(r10)
            if (r11 != 0) goto L_0x0473
            r12.A01()
        L_0x044a:
            r1.A0h = r6
            X.0SN r10 = r13.A0r
            r10.A0h = r6
            X.0KD r10 = X.AnonymousClass0KD.TOP
            X.0S1 r10 = r1.A07(r10)
            r10.A01()
            X.0KD r10 = X.AnonymousClass0KD.BOTTOM
            X.0S1 r10 = r1.A07(r10)
            r10.A01()
        L_0x0462:
            r11 = 0
            int r10 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r10 < 0) goto L_0x0469
            r1.A02 = r9
        L_0x0469:
            float r10 = r0.A08
            int r9 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x02aa
            r1.A06 = r10
            goto L_0x02aa
        L_0x0473:
            r12.A03 = r11
            java.util.HashSet r10 = r11.A04
            if (r10 != 0) goto L_0x0480
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r11.A04 = r10
        L_0x0480:
            r10.add(r12)
            r12.A01 = r4
            r12.A00 = r3
            goto L_0x044a
        L_0x0488:
            int r10 = r0.A0B
            if (r10 == r3) goto L_0x0413
            java.lang.Object r12 = r2.get(r10)
            X.0SN r12 = (X.AnonymousClass0SN) r12
            if (r12 == 0) goto L_0x0413
            X.0KD r18 = X.AnonymousClass0KD.BOTTOM
            int r11 = r0.bottomMargin
            int r10 = r0.A0K
            r19 = r18
            goto L_0x0408
        L_0x049e:
            int r10 = r0.A0o
            if (r10 == r3) goto L_0x03f4
            java.lang.Object r12 = r2.get(r10)
            X.0SN r12 = (X.AnonymousClass0SN) r12
            if (r12 == 0) goto L_0x03f4
            X.0KD r18 = X.AnonymousClass0KD.TOP
            X.0KD r19 = X.AnonymousClass0KD.BOTTOM
            int r11 = r0.topMargin
            int r10 = r0.A0P
            goto L_0x03e9
        L_0x04b4:
            if (r11 == r3) goto L_0x03d5
            java.lang.Object r11 = r2.get(r11)
            X.0SN r11 = (X.AnonymousClass0SN) r11
            if (r11 == 0) goto L_0x03d5
            X.0KD r18 = X.AnonymousClass0KD.RIGHT
            int r10 = r0.rightMargin
            r19 = r18
            goto L_0x03ca
        L_0x04c6:
            if (r13 == r3) goto L_0x03ba
            java.lang.Object r13 = r2.get(r13)
            X.0SN r13 = (X.AnonymousClass0SN) r13
            if (r13 == 0) goto L_0x03ba
            X.0KD r18 = X.AnonymousClass0KD.LEFT
            X.0KD r19 = X.AnonymousClass0KD.RIGHT
            int r10 = r0.leftMargin
            goto L_0x03b1
        L_0x04d8:
            r12 = r10
            goto L_0x0289
        L_0x04db:
            int r12 = r0.A0m
            if (r12 == r3) goto L_0x027b
            r13 = r12
            goto L_0x027b
        L_0x04e2:
            float r13 = java.lang.Float.parseFloat(r13)     // Catch:{ NumberFormatException -> 0x051a }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x051a }
            int r9 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x051a
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x051a
            if (r11 != r6) goto L_0x04fa
            float r10 = r10 / r13
            float r10 = java.lang.Math.abs(r10)     // Catch:{ NumberFormatException -> 0x051a }
            goto L_0x0512
        L_0x04fa:
            float r13 = r13 / r10
            float r10 = java.lang.Math.abs(r13)     // Catch:{ NumberFormatException -> 0x051a }
            goto L_0x0512
        L_0x0500:
            java.lang.String r10 = r10.substring(r15)
            int r9 = r10.length()
            if (r9 <= 0) goto L_0x051a
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x051a }
            goto L_0x0512
        L_0x050f:
            r1.A01 = r12
            goto L_0x051a
        L_0x0512:
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x051a
            r1.A01 = r10
            r1.A08 = r11
        L_0x051a:
            float r9 = r0.A03
            float[] r10 = r1.A0j
            r10[r4] = r9
            float r9 = r0.A09
            r10[r6] = r9
            int r9 = r0.A0S
            r1.A0A = r9
            int r9 = r0.A0q
            r1.A0L = r9
            int r11 = r0.A0W
            int r9 = r0.A0a
            int r13 = r0.A0Y
            float r10 = r0.A05
            r1.A0D = r11
            r1.A0H = r9
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r9) goto L_0x053e
            r13 = 0
        L_0x053e:
            r1.A0F = r13
            r1.A04 = r10
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x0551
            r9 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0551
            if (r11 != 0) goto L_0x0551
            r9 = 2
            r1.A0D = r9
        L_0x0551:
            int r10 = r0.A0V
            int r13 = r0.A0Z
            int r11 = r0.A0X
            float r9 = r0.A04
            r1.A0C = r10
            r1.A0G = r13
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r11 != r0) goto L_0x0563
            r11 = 0
        L_0x0563:
            r1.A0E = r11
            r1.A03 = r9
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x022f
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x022f
            if (r10 != 0) goto L_0x022f
            r0 = 2
            r1.A0C = r0
            goto L_0x022f
        L_0x0578:
            r0 = r27
            X.0Pb r0 = r0.A07
            java.util.ArrayList r9 = r0.A02
            r9.clear()
            r0 = r27
            java.util.ArrayList r10 = r0.A00
            int r8 = r10.size()
            r7 = 0
        L_0x058a:
            if (r7 >= r8) goto L_0x05b5
            java.lang.Object r6 = r10.get(r7)
            X.0SN r6 = (X.AnonymousClass0SN) r6
            X.0Jy[] r0 = r6.A0o
            r0 = r0[r4]
            X.0Jy r3 = X.C03810Jy.MATCH_CONSTRAINT
            if (r0 == r3) goto L_0x05af
            X.0Jy[] r0 = r6.A0o
            r0 = r0[r4]
            X.0Jy r2 = X.C03810Jy.MATCH_PARENT
            if (r0 == r2) goto L_0x05af
            X.0Jy[] r0 = r6.A0o
            r1 = 1
            r0 = r0[r1]
            if (r0 == r3) goto L_0x05af
            X.0Jy[] r0 = r6.A0o
            r0 = r0[r1]
            if (r0 != r2) goto L_0x05b2
        L_0x05af:
            r9.add(r6)
        L_0x05b2:
            int r7 = r7 + 1
            goto L_0x058a
        L_0x05b5:
            r0 = r27
            X.0SC r1 = r0.A08
            r0 = 1
            r1.A07 = r0
        L_0x05bc:
            int r11 = r5.A05
            r29 = r31
            int r7 = android.view.View.MeasureSpec.getMode(r29)
            int r8 = android.view.View.MeasureSpec.getSize(r29)
            r28 = r32
            int r6 = android.view.View.MeasureSpec.getMode(r28)
            int r4 = android.view.View.MeasureSpec.getSize(r28)
            int r0 = r5.getPaddingTop()
            r9 = 0
            int r1 = java.lang.Math.max(r9, r0)
            int r0 = r5.getPaddingBottom()
            int r0 = java.lang.Math.max(r9, r0)
            int r12 = r1 + r0
            int r10 = r5.getPaddingWidth()
            X.0ap r3 = r5.A09
            r3.A04 = r1
            r3.A02 = r0
            r3.A05 = r10
            r3.A03 = r12
            r0 = r29
            r3.A01 = r0
            r0 = r28
            r3.A00 = r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r2 < r0) goto L_0x07c7
            int r0 = r5.getPaddingStart()
            int r2 = java.lang.Math.max(r9, r0)
            int r0 = r5.getPaddingEnd()
            int r14 = java.lang.Math.max(r9, r0)
            if (r2 > 0) goto L_0x0615
            if (r14 <= 0) goto L_0x07c7
        L_0x0615:
            android.content.Context r0 = r5.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r13 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r13 = r13 & r0
            r9 = 1
            if (r13 == 0) goto L_0x062c
            int r0 = r5.getLayoutDirection()
            if (r9 != r0) goto L_0x062c
            r2 = r14
        L_0x062c:
            int r8 = r8 - r10
            int r4 = r4 - r12
            r15 = r8
            r14 = r4
            int r13 = r3.A03
            int r9 = r3.A05
            X.0Jy r18 = X.C03810Jy.FIXED
            r25 = r18
            int r16 = r5.getChildCount()
            r10 = 1073741824(0x40000000, float:2.0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 0
            if (r7 == r0) goto L_0x07bb
            if (r7 == 0) goto L_0x07b6
            if (r7 == r10) goto L_0x07ab
            r17 = r18
        L_0x0649:
            r15 = 0
        L_0x064a:
            if (r6 == r0) goto L_0x079f
            if (r6 == 0) goto L_0x0797
            if (r6 != r10) goto L_0x079c
            int r0 = r5.A01
            int r0 = r0 - r13
            int r14 = java.lang.Math.min(r0, r4)
        L_0x0657:
            int r0 = r27.A04()
            if (r15 != r0) goto L_0x0663
            int r0 = r27.A03()
            if (r14 == r0) goto L_0x066a
        L_0x0663:
            r0 = r27
            X.0SC r10 = r0.A08
            r0 = 1
            r10.A08 = r0
        L_0x066a:
            r0 = r27
            r0.A0P = r12
            r0.A0Q = r12
            int r0 = r5.A02
            int r0 = r0 - r9
            r10 = r27
            int[] r10 = r10.A0k
            r10[r12] = r0
            int r0 = r5.A01
            int r0 = r0 - r13
            r16 = 1
            r10[r16] = r0
            r0 = r27
            r0.A0J = r12
            r0.A0I = r12
            X.0Jy[] r0 = r0.A0o
            r24 = r0
            r0[r12] = r17
            r0 = r27
            r0.A0A(r15)
            r24[r16] = r18
            r0 = r27
            r0.A09(r14)
            int r14 = r5.A04
            int r14 = r14 - r9
            if (r14 >= 0) goto L_0x069e
            r14 = 0
        L_0x069e:
            r0.A0J = r14
            int r9 = r5.A03
            int r9 = r9 - r13
            if (r9 >= 0) goto L_0x06a6
            r9 = 0
        L_0x06a6:
            r0.A0I = r9
            r0.A02 = r2
            r0.A03 = r1
            X.0Pb r9 = r0.A07
            X.0kF r0 = r0.A06
            r26 = r0
            r0 = r27
            java.util.ArrayList r13 = r0.A00
            int r23 = r13.size()
            int r21 = r27.A04()
            int r20 = r27.A03()
            r1 = 128(0x80, float:1.794E-43)
            r0 = r11 & r1
            r2 = 0
            if (r0 != r1) goto L_0x06ca
            r2 = 1
        L_0x06ca:
            r1 = 0
            if (r2 != 0) goto L_0x06d3
            r0 = 64
            r11 = r11 & 64
            if (r11 != r0) goto L_0x0708
        L_0x06d3:
            r17 = 1
        L_0x06d5:
            r0 = r23
            if (r12 >= r0) goto L_0x070a
            java.lang.Object r14 = r13.get(r12)
            X.0SN r14 = (X.AnonymousClass0SN) r14
            X.0Jy[] r0 = r14.A0o
            r0 = r0[r1]
            X.0Jy r11 = X.C03810Jy.MATCH_CONSTRAINT
            r16 = 0
            if (r0 != r11) goto L_0x06eb
            r16 = 1
        L_0x06eb:
            X.0Jy[] r0 = r14.A0o
            r0 = r0[r17]
            r15 = 0
            if (r0 != r11) goto L_0x06f3
            r15 = 1
        L_0x06f3:
            if (r16 == 0) goto L_0x06ff
            if (r15 == 0) goto L_0x06ff
            float r0 = r14.A01
            r11 = 0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r11 = 1
            if (r0 > 0) goto L_0x0700
        L_0x06ff:
            r11 = 0
        L_0x0700:
            boolean r0 = r14.A0J()
            if (r0 == 0) goto L_0x077a
            if (r11 == 0) goto L_0x077a
        L_0x0708:
            r17 = 0
        L_0x070a:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r7 != r11) goto L_0x0710
            if (r6 == r11) goto L_0x0713
        L_0x0710:
            r0 = 0
            if (r2 == 0) goto L_0x0714
        L_0x0713:
            r0 = 1
        L_0x0714:
            r17 = r17 & r0
            if (r17 == 0) goto L_0x0974
            r0 = r10[r1]
            int r8 = java.lang.Math.min(r0, r8)
            r0 = 1
            r0 = r10[r0]
            int r4 = java.lang.Math.min(r0, r4)
            if (r7 != r11) goto L_0x0735
            r0 = r21
            if (r0 == r8) goto L_0x0735
            r0 = r27
            r0.A0A(r8)
            X.0SC r8 = r0.A08
            r0 = 1
            r8.A07 = r0
        L_0x0735:
            if (r6 != r11) goto L_0x0745
            r0 = r20
            if (r0 == r4) goto L_0x0745
            r0 = r27
            r0.A09(r4)
            X.0SC r4 = r0.A08
            r0 = 1
            r4.A07 = r0
        L_0x0745:
            if (r7 != r11) goto L_0x08c4
            if (r6 != r11) goto L_0x08c4
            r0 = r27
            X.0SC r14 = r0.A08
            r16 = 1
            r15 = r2 & 1
            boolean r0 = r14.A07
            if (r0 != 0) goto L_0x0759
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x07df
        L_0x0759:
            X.0Dp r4 = r14.A00
            java.util.ArrayList r0 = r4.A00
            java.util.Iterator r8 = r0.iterator()
        L_0x0761:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x07d1
            java.lang.Object r2 = r8.next()
            X.0SN r2 = (X.AnonymousClass0SN) r2
            r2.A0i = r1
            X.0Dw r0 = r2.A0c
            r0.A0H()
            X.0Dv r0 = r2.A0d
            r0.A0H()
            goto L_0x0761
        L_0x077a:
            boolean r0 = r14.A0K()
            if (r0 == 0) goto L_0x0783
            if (r11 == 0) goto L_0x0783
            goto L_0x0708
        L_0x0783:
            boolean r0 = r14 instanceof X.AnonymousClass0Dm
            if (r0 != 0) goto L_0x0708
            boolean r0 = r14.A0J()
            if (r0 != 0) goto L_0x0708
            boolean r0 = r14.A0K()
            if (r0 != 0) goto L_0x0708
            int r12 = r12 + 1
            goto L_0x06d5
        L_0x0797:
            X.0Jy r18 = X.C03810Jy.WRAP_CONTENT
            if (r16 != 0) goto L_0x079c
            goto L_0x07a3
        L_0x079c:
            r14 = 0
            goto L_0x0657
        L_0x079f:
            X.0Jy r18 = X.C03810Jy.WRAP_CONTENT
            if (r16 != 0) goto L_0x0657
        L_0x07a3:
            int r0 = r5.A03
            int r14 = java.lang.Math.max(r12, r0)
            goto L_0x0657
        L_0x07ab:
            int r15 = r5.A02
            int r15 = r15 - r9
            int r15 = java.lang.Math.min(r15, r8)
            r17 = r18
            goto L_0x064a
        L_0x07b6:
            X.0Jy r17 = X.C03810Jy.WRAP_CONTENT
            if (r16 != 0) goto L_0x0649
            goto L_0x07bf
        L_0x07bb:
            X.0Jy r17 = X.C03810Jy.WRAP_CONTENT
            if (r16 != 0) goto L_0x064a
        L_0x07bf:
            int r15 = r5.A04
            int r15 = java.lang.Math.max(r12, r15)
            goto L_0x064a
        L_0x07c7:
            int r0 = r5.getPaddingLeft()
            int r2 = java.lang.Math.max(r9, r0)
            goto L_0x062c
        L_0x07d1:
            r4.A0i = r1
            X.0Dw r0 = r4.A0c
            r0.A0H()
            X.0Dv r0 = r4.A0d
            r0.A0H()
            r14.A08 = r1
        L_0x07df:
            X.0Dp r0 = r14.A01
            r14.A04(r0)
            X.0Dp r13 = r14.A00
            r13.A0P = r1
            r13.A0Q = r1
            X.0Jy[] r0 = r13.A0o
            r22 = r0
            r19 = r0[r1]
            r18 = 1
            r17 = r0[r16]
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x07fb
            r14.A01()
        L_0x07fb:
            int r12 = r13.A05()
            int r10 = r13.A06()
            X.0Dw r8 = r13.A0c
            X.0aq r0 = r8.A05
            r0.A02(r12)
            X.0Dv r4 = r13.A0d
            X.0aq r0 = r4.A05
            r0.A02(r10)
            r14.A02()
            X.0Jy r2 = X.C03810Jy.WRAP_CONTENT
            r0 = r19
            if (r0 == r2) goto L_0x081e
            r0 = r17
            if (r0 != r2) goto L_0x0838
        L_0x081e:
            if (r15 == 0) goto L_0x0838
            java.util.ArrayList r0 = r14.A05
            java.util.Iterator r15 = r0.iterator()
        L_0x0826:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0894
            java.lang.Object r0 = r15.next()
            X.0ar r0 = (X.C07250ar) r0
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0826
        L_0x0838:
            r2 = r22[r1]
            r0 = r25
            if (r2 == r0) goto L_0x0862
            X.0Jy r0 = X.C03810Jy.MATCH_PARENT
            if (r2 == r0) goto L_0x0862
            r10 = 0
        L_0x0843:
            java.util.ArrayList r8 = r14.A05
            java.util.Iterator r4 = r8.iterator()
        L_0x0849:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x09cf
            java.lang.Object r2 = r4.next()
            X.0ar r2 = (X.C07250ar) r2
            X.0SN r0 = r2.A03
            if (r0 != r13) goto L_0x085e
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x085e
            goto L_0x0849
        L_0x085e:
            r2.A0C()
            goto L_0x0849
        L_0x0862:
            int r2 = r13.A04()
            int r2 = r2 + r12
            X.0aq r0 = r8.A04
            r0.A02(r2)
            X.0Dr r0 = r8.A06
            int r2 = r2 - r12
            r0.A02(r2)
            r14.A02()
            r2 = r22[r16]
            r0 = r25
            if (r2 == r0) goto L_0x087f
            X.0Jy r0 = X.C03810Jy.MATCH_PARENT
            if (r2 != r0) goto L_0x088f
        L_0x087f:
            int r2 = r13.A03()
            int r2 = r2 + r10
            X.0aq r0 = r4.A04
            r0.A02(r2)
            X.0Dr r0 = r4.A06
            int r2 = r2 - r10
            r0.A02(r2)
        L_0x088f:
            r14.A02()
            r10 = 1
            goto L_0x0843
        L_0x0894:
            r0 = r19
            if (r0 != r2) goto L_0x08ab
            r22[r1] = r25
            int r0 = r14.A00(r13, r1)
            r13.A0A(r0)
            X.0Dr r0 = r8.A06
            r15 = r0
            int r0 = r13.A04()
            r15.A02(r0)
        L_0x08ab:
            r0 = r17
            if (r0 != r2) goto L_0x0838
            r22[r16] = r25
            r0 = 1
            int r0 = r14.A00(r13, r0)
            r13.A09(r0)
            X.0Dr r2 = r4.A06
            int r0 = r13.A03()
            r2.A02(r0)
            goto L_0x0838
        L_0x08c4:
            r0 = r27
            X.0SC r8 = r0.A08
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0914
            X.0Dp r10 = r8.A00
            java.util.ArrayList r0 = r10.A00
            java.util.Iterator r13 = r0.iterator()
        L_0x08d4:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x08f9
            java.lang.Object r12 = r13.next()
            X.0SN r12 = (X.AnonymousClass0SN) r12
            r12.A0i = r1
            X.0Dw r4 = r12.A0c
            X.0Dr r0 = r4.A06
            r0.A0B = r1
            r4.A09 = r1
            r4.A0H()
            X.0Dv r4 = r12.A0d
            X.0Dr r0 = r4.A06
            r0.A0B = r1
            r4.A09 = r1
            r4.A0H()
            goto L_0x08d4
        L_0x08f9:
            r10.A0i = r1
            X.0Dw r4 = r10.A0c
            X.0Dr r0 = r4.A06
            r0.A0B = r1
            r4.A09 = r1
            r4.A0H()
            X.0Dv r4 = r10.A0d
            X.0Dr r0 = r4.A06
            r0.A0B = r1
            r4.A09 = r1
            r4.A0H()
            r8.A01()
        L_0x0914:
            X.0Dp r0 = r8.A01
            r8.A04(r0)
            X.0Dp r4 = r8.A00
            r4.A0P = r1
            r4.A0Q = r1
            X.0Dw r0 = r4.A0c
            X.0aq r0 = r0.A05
            r0.A02(r1)
            X.0Dv r0 = r4.A0d
            X.0aq r0 = r0.A05
            r0.A02(r1)
            r10 = 1
            if (r7 != r11) goto L_0x0946
            r0 = r27
            boolean r0 = r0.A0M(r1, r2)
            r10 = r10 & r0
            r8 = 1
        L_0x0938:
            if (r6 != r11) goto L_0x0948
            r4 = 1
            r0 = r27
            boolean r16 = r0.A0M(r4, r2)
            r16 = r16 & r10
            int r8 = r8 + 1
            goto L_0x0962
        L_0x0946:
            r8 = 0
            goto L_0x0938
        L_0x0948:
            r16 = r10
            goto L_0x0962
        L_0x094b:
            X.0aq r0 = r2.A05
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x095b
            X.0aq r0 = r2.A04
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x09c0
            boolean r0 = r2 instanceof X.AnonymousClass0Ds
            if (r0 != 0) goto L_0x09c0
        L_0x095b:
            r16 = 0
        L_0x095d:
            r22[r1] = r19
            r22[r18] = r17
            r8 = 2
        L_0x0962:
            if (r16 == 0) goto L_0x0974
            r4 = 0
            if (r7 != r11) goto L_0x0968
            r4 = 1
        L_0x0968:
            r2 = 0
            if (r6 != r11) goto L_0x096c
            r2 = 1
        L_0x096c:
            r0 = r27
            r0.A0H(r4, r2)
            r0 = 2
            if (r8 == r0) goto L_0x0bb5
        L_0x0974:
            if (r23 <= 0) goto L_0x0a08
            r0 = r27
            java.util.ArrayList r0 = r0.A00
            int r8 = r0.size()
            r0 = r27
            X.0kF r10 = r0.A06
            r7 = 0
        L_0x0983:
            if (r7 >= r8) goto L_0x09e6
            r0 = r27
            java.util.ArrayList r0 = r0.A00
            java.lang.Object r11 = r0.get(r7)
            X.0SN r11 = (X.AnonymousClass0SN) r11
            boolean r0 = r11 instanceof X.AnonymousClass0Dl
            if (r0 != 0) goto L_0x09a3
            X.0Dw r0 = r11.A0c
            X.0Dr r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x09a6
            X.0Dv r0 = r11.A0d
            X.0Dr r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x09a6
        L_0x09a3:
            int r7 = r7 + 1
            goto L_0x0983
        L_0x09a6:
            X.0Jy[] r2 = r11.A0o
            r0 = r2[r1]
            r6 = 1
            r4 = r2[r6]
            X.0Jy r2 = X.C03810Jy.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x09bc
            int r0 = r11.A0D
            if (r0 == r6) goto L_0x09bc
            if (r4 != r2) goto L_0x09bc
            int r0 = r11.A0C
            if (r0 == r6) goto L_0x09bc
            goto L_0x09a3
        L_0x09bc:
            r9.A00(r11, r10, r1)
            goto L_0x09a3
        L_0x09c0:
            X.0Dr r0 = r2.A06
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x09d3
            boolean r0 = r2 instanceof X.AnonymousClass0Du
            if (r0 != 0) goto L_0x09d3
            boolean r0 = r2 instanceof X.AnonymousClass0Ds
            if (r0 != 0) goto L_0x09d3
            goto L_0x095b
        L_0x09cf:
            java.util.Iterator r4 = r8.iterator()
        L_0x09d3:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x095d
            java.lang.Object r2 = r4.next()
            X.0ar r2 = (X.C07250ar) r2
            if (r10 != 0) goto L_0x094b
            X.0SN r0 = r2.A03
            if (r0 != r13) goto L_0x094b
            goto L_0x09d3
        L_0x09e6:
            X.0ap r10 = (X.C07230ap) r10
            androidx.constraintlayout.widget.ConstraintLayout r6 = r10.A06
            int r2 = r6.getChildCount()
            r4 = 0
            r0 = 0
        L_0x09f0:
            if (r0 >= r2) goto L_0x09f8
            r6.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x09f0
        L_0x09f8:
            java.util.ArrayList r2 = r6.A0D
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0a08
        L_0x0a00:
            r2.get(r4)
            int r4 = r4 + 1
            if (r4 >= r0) goto L_0x0a08
            goto L_0x0a00
        L_0x0a08:
            r0 = r27
            int r10 = r0.A01
            java.util.ArrayList r11 = r9.A02
            int r8 = r11.size()
            if (r23 <= 0) goto L_0x0a30
            int r6 = r0.A0J
            int r4 = r0.A0I
            r0.A0J = r1
            r0.A0I = r1
            r2 = r0
            r0 = r21
            r2.A0A(r0)
            r0 = r20
            r2.A09(r0)
            r2.A0J = r6
            r2.A0I = r4
            X.0Dp r0 = r9.A00
            r0.A0L()
        L_0x0a30:
            if (r8 <= 0) goto L_0x0ba6
            r0 = r24[r1]
            X.0Jy r2 = X.C03810Jy.WRAP_CONTENT
            r19 = 0
            if (r0 != r2) goto L_0x0a3c
            r19 = 1
        L_0x0a3c:
            r0 = 1
            r0 = r24[r0]
            r18 = 0
            if (r0 != r2) goto L_0x0a45
            r18 = 1
        L_0x0a45:
            int r2 = r27.A04()
            X.0Dp r7 = r9.A00
            int r0 = r7.A0J
            int r6 = java.lang.Math.max(r2, r0)
            int r2 = r27.A03()
            int r0 = r7.A0I
            int r4 = java.lang.Math.max(r2, r0)
            r17 = 0
        L_0x0a5d:
            java.lang.Object r12 = r11.get(r1)
            X.0SN r12 = (X.AnonymousClass0SN) r12
            boolean r0 = r12 instanceof X.AnonymousClass0Dm
            if (r0 == 0) goto L_0x0ad0
            int r2 = r12.A04()
            int r13 = r12.A03()
            r14 = 1
            r0 = r26
            boolean r0 = r9.A00(r12, r0, r14)
            r17 = r17 | r0
            int r0 = r12.A04()
            int r14 = r12.A03()
            if (r0 == r2) goto L_0x0aa8
            r12.A0A(r0)
            if (r19 == 0) goto L_0x0aa6
            int r2 = r12.A05()
            int r0 = r12.A0O
            int r2 = r2 + r0
            if (r2 <= r6) goto L_0x0aa6
            int r2 = r12.A05()
            int r0 = r12.A0O
            int r2 = r2 + r0
            X.0KD r0 = X.AnonymousClass0KD.RIGHT
            X.0S1 r0 = r12.A07(r0)
            int r0 = r0.A00()
            int r2 = r2 + r0
            int r6 = java.lang.Math.max(r6, r2)
        L_0x0aa6:
            r17 = 1
        L_0x0aa8:
            if (r14 == r13) goto L_0x0ad0
            r12.A09(r14)
            if (r18 == 0) goto L_0x0ace
            int r2 = r12.A06()
            int r0 = r12.A09
            int r2 = r2 + r0
            if (r2 <= r4) goto L_0x0ace
            int r2 = r12.A06()
            int r0 = r12.A09
            int r2 = r2 + r0
            X.0KD r0 = X.AnonymousClass0KD.BOTTOM
            X.0S1 r0 = r12.A07(r0)
            int r0 = r0.A00()
            int r2 = r2 + r0
            int r4 = java.lang.Math.max(r4, r2)
        L_0x0ace:
            r17 = 1
        L_0x0ad0:
            int r1 = r1 + 1
            if (r1 < r8) goto L_0x0a5d
            r2 = 0
        L_0x0ad5:
            r12 = 0
        L_0x0ad6:
            java.lang.Object r13 = r11.get(r12)
            X.0SN r13 = (X.AnonymousClass0SN) r13
            boolean r0 = r13 instanceof X.C12340kE
            if (r0 == 0) goto L_0x0ae4
            boolean r0 = r13 instanceof X.AnonymousClass0Dm
            if (r0 == 0) goto L_0x0afe
        L_0x0ae4:
            boolean r0 = r13 instanceof X.AnonymousClass0Dl
            if (r0 != 0) goto L_0x0afe
            int r1 = r13.A0N
            r0 = 8
            if (r1 == r0) goto L_0x0afe
            X.0Dw r0 = r13.A0c
            X.0Dr r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0b29
            X.0Dv r0 = r13.A0d
            X.0Dr r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0b29
        L_0x0afe:
            int r12 = r12 + 1
            if (r12 < r8) goto L_0x0ad6
            if (r17 == 0) goto L_0x0b23
            r0 = r27
            int r13 = r0.A0J
            int r12 = r0.A0I
            r1 = 0
            r0.A0J = r1
            r0.A0I = r1
            r1 = r0
            r0 = r21
            r1.A0A(r0)
            r0 = r20
            r1.A09(r0)
            r1.A0J = r13
            r1.A0I = r12
            r7.A0L()
            r17 = 0
        L_0x0b23:
            int r2 = r2 + 1
            r0 = 2
            if (r2 >= r0) goto L_0x0ba6
            goto L_0x0ad5
        L_0x0b29:
            boolean r0 = r13 instanceof X.AnonymousClass0Dm
            if (r0 != 0) goto L_0x0afe
            int r15 = r13.A04()
            int r16 = r13.A03()
            int r1 = r13.A07
            r14 = 1
            r0 = r26
            boolean r0 = r9.A00(r13, r0, r14)
            r17 = r17 | r0
            int r0 = r13.A04()
            int r14 = r13.A03()
            if (r0 == r15) goto L_0x0b70
            r13.A0A(r0)
            if (r19 == 0) goto L_0x0b6e
            int r15 = r13.A05()
            int r0 = r13.A0O
            int r15 = r15 + r0
            if (r15 <= r6) goto L_0x0b6e
            int r15 = r13.A05()
            int r0 = r13.A0O
            int r15 = r15 + r0
            X.0KD r0 = X.AnonymousClass0KD.RIGHT
            X.0S1 r0 = r13.A07(r0)
            int r0 = r0.A00()
            int r15 = r15 + r0
            int r6 = java.lang.Math.max(r6, r15)
        L_0x0b6e:
            r17 = 1
        L_0x0b70:
            r0 = r16
            if (r14 == r0) goto L_0x0b9a
            r13.A09(r14)
            if (r18 == 0) goto L_0x0b98
            int r14 = r13.A06()
            int r0 = r13.A09
            int r14 = r14 + r0
            if (r14 <= r4) goto L_0x0b98
            int r14 = r13.A06()
            int r0 = r13.A09
            int r14 = r14 + r0
            X.0KD r0 = X.AnonymousClass0KD.BOTTOM
            X.0S1 r0 = r13.A07(r0)
            int r0 = r0.A00()
            int r14 = r14 + r0
            int r4 = java.lang.Math.max(r4, r14)
        L_0x0b98:
            r17 = 1
        L_0x0b9a:
            boolean r0 = r13.A0h
            if (r0 == 0) goto L_0x0afe
            int r0 = r13.A07
            if (r1 == r0) goto L_0x0afe
            r17 = 1
            goto L_0x0afe
        L_0x0ba6:
            r0 = r27
            r0.A01 = r10
            r0 = 256(0x100, float:3.59E-43)
            r10 = r10 & r0
            r1 = 256(0x100, float:3.59E-43)
            r0 = 0
            if (r10 != r1) goto L_0x0bb3
            r0 = 1
        L_0x0bb3:
            X.AnonymousClass0VD.A0F = r0
        L_0x0bb5:
            int r2 = r27.A04()
            int r7 = r27.A03()
            r0 = r27
            boolean r4 = r0.A0B
            boolean r6 = r0.A09
            int r1 = r3.A03
            int r0 = r3.A05
            int r2 = r2 + r0
            int r7 = r7 + r1
            r1 = 0
            r0 = r29
            int r2 = android.view.ViewGroup.resolveSizeAndState(r2, r0, r1)
            r0 = r28
            int r1 = android.view.ViewGroup.resolveSizeAndState(r7, r0, r1)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            r1 = r1 & r0
            int r0 = r5.A02
            int r2 = java.lang.Math.min(r0, r2)
            int r0 = r5.A01
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 == 0) goto L_0x0bec
            r2 = r2 | r0
        L_0x0bec:
            if (r6 == 0) goto L_0x0bef
            r1 = r1 | r0
        L_0x0bef:
            r5.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        AnonymousClass0SN A002 = A00(view);
        if ((view instanceof Guideline) && !(A002 instanceof AnonymousClass0Dl)) {
            AnonymousClass06X r0 = (AnonymousClass06X) view.getLayoutParams();
            AnonymousClass0Dl r1 = new AnonymousClass0Dl();
            r0.A0r = r1;
            r0.A0x = true;
            r1.A0L(r0.A0b);
        }
        if (view instanceof C012306a) {
            C012306a r2 = (C012306a) view;
            r2.A02();
            ((AnonymousClass06X) view.getLayoutParams()).A0y = true;
            ArrayList arrayList = this.A0D;
            if (!arrayList.contains(r2)) {
                arrayList.add(r2);
            }
        }
        this.A06.put(view.getId(), view);
        this.A0F = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A06.remove(view.getId());
        AnonymousClass0SN A002 = A00(view);
        this.A08.A00.remove(A002);
        A002.A0Z = null;
        this.A0D.remove(view);
        this.A0F = true;
    }

    public void requestLayout() {
        this.A0F = true;
        super.requestLayout();
    }

    public void setConstraintSet(C06500Wj r1) {
        this.A0B = r1;
    }

    public void setId(int i2) {
        SparseArray sparseArray = this.A06;
        sparseArray.remove(getId());
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.A01) {
            this.A01 = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.A02) {
            this.A02 = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.A03) {
            this.A03 = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.A04) {
            this.A04 = i2;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C03950Kn r2) {
        this.A0C = r2;
        C04820Ob r0 = this.A0A;
        if (r0 != null) {
            r0.A02 = r2;
        }
    }

    public void setOptimizationLevel(int i2) {
        this.A05 = i2;
        this.A08.A01 = i2;
        boolean z2 = false;
        if ((i2 & 256) == 256) {
            z2 = true;
        }
        AnonymousClass0VD.A0F = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

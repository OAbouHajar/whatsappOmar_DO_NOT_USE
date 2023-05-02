package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass1UP;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C16150sX;
import X.C39731sy;
import X.C52652eD;
import X.C52662eE;
import X.C82744Dz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape2S0201000_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;

public class TemplateQuickReplyButtonsLayout extends ViewGroup implements AnonymousClass006 {
    public AnonymousClass013 A00;
    public C14710pd A01;
    public C52662eE A02;
    public List A03;
    public boolean A04;
    public View[] A05;
    public View[] A06;

    public TemplateQuickReplyButtonsLayout(Context context) {
        super(context);
        A01();
        this.A05 = new View[3];
        this.A06 = new View[3];
        ViewGroup.inflate(context, R.layout.layout05af, this);
    }

    public TemplateQuickReplyButtonsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A05 = new View[3];
        this.A06 = new View[3];
        ViewGroup.inflate(context, R.layout.layout05af, this);
    }

    public TemplateQuickReplyButtonsLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
        this.A05 = new View[3];
        this.A06 = new View[3];
        ViewGroup.inflate(context, R.layout.layout05af, this);
    }

    public TemplateQuickReplyButtonsLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (A04(r10, r6) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(int r10) {
        /*
            r9 = this;
            android.util.DisplayMetrics r1 = X.C13690nt.A0H(r9)
            r5 = 1
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = android.util.TypedValue.applyDimension(r5, r0, r1)
            int r6 = (int) r0
            r4 = 0
            r7 = 0
        L_0x000e:
            android.view.View[] r2 = r9.A05
            r0 = r2[r7]
            if (r0 == 0) goto L_0x003a
            android.view.View[] r8 = r9.A06
            r0 = r8[r7]
            if (r0 == 0) goto L_0x003a
            r0 = r2[r7]
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x003a
            r3 = r2[r7]
            int r0 = r6 << 1
            int r1 = r10 - r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            r3.measure(r1, r0)
            r0 = r8[r7]
            X.C13680ns.A12(r0)
        L_0x003a:
            int r7 = r7 + 1
            r0 = 3
            if (r7 < r0) goto L_0x000e
            boolean r0 = r9.A03(r10, r6)
            if (r0 != 0) goto L_0x004c
            boolean r0 = r9.A04(r10, r6)
            r1 = 0
            if (r0 == 0) goto L_0x004d
        L_0x004c:
            r1 = 1
        L_0x004d:
            java.util.List r0 = r9.A03
            int r3 = r0.size()
            if (r1 == 0) goto L_0x0056
            int r3 = r3 - r5
        L_0x0056:
            r2 = r2[r4]
            if (r2 == 0) goto L_0x0078
            r0 = 1093664768(0x41300000, float:11.0)
            int r1 = X.C13680ns.A05(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            float r0 = r2.getTextSize()
            int r0 = (int) r0
            int r1 = r1 << 1
            int r1 = r1 + r0
        L_0x006a:
            int r1 = r1 * r3
            if (r1 == 0) goto L_0x0074
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = X.C13680ns.A05(r9, r0)
            int r1 = r1 + r0
        L_0x0074:
            X.C13690nt.A12(r9, r10, r1)
            return r1
        L_0x0078:
            r1 = 0
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout.A00(int):int");
    }

    public void A01() {
        if (!this.A04) {
            this.A04 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A00 = C16150sX.A0Z(A002);
            this.A01 = C16150sX.A0k(A002);
        }
    }

    public void A02(C82744Dz r9, List list) {
        boolean z2;
        View view;
        View view2;
        int i2;
        int i3;
        ArrayList A0u = AnonymousClass000.A0u();
        if (list != null) {
            for (int i4 = 0; i4 < list.size() && A0u.size() < 3; i4++) {
                if (((C39731sy) list.get(i4)).A03 == 1) {
                    A0u.add(list.get(i4));
                }
            }
        }
        this.A03 = A0u;
        boolean z3 = !A0u.isEmpty();
        setVisibility(C13680ns.A02(z3 ? 1 : 0));
        if (z3) {
            int i5 = 0;
            do {
                if (this.A03.size() > i5) {
                    z2 = true;
                    AnonymousClass00B.A0F(true);
                    View[] viewArr = this.A05;
                    if (viewArr[i5] == null) {
                        if (i5 != 0) {
                            i3 = R.id.quick_reply_btn_2;
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    i3 = R.id.quick_reply_btn_3;
                                }
                                AnonymousClass1UP.A06((TextView) viewArr[i5]);
                            }
                        } else {
                            i3 = R.id.quick_reply_btn_1;
                        }
                        viewArr[i5] = findViewById(i3);
                        AnonymousClass1UP.A06((TextView) viewArr[i5]);
                    }
                    view = viewArr[i5];
                } else {
                    z2 = false;
                    view = this.A05[i5];
                }
                TextView textView = (TextView) view;
                if (z2) {
                    AnonymousClass00B.A0F(true);
                    View[] viewArr2 = this.A06;
                    if (viewArr2[i5] == null) {
                        if (i5 != 0) {
                            i2 = R.id.quick_reply_btn_background_2;
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    i2 = R.id.quick_reply_btn_background_3;
                                }
                                View view3 = viewArr2[i5];
                                AnonymousClass00B.A04(view3);
                                view3.setBackground(AnonymousClass00T.A04(getContext(), R.drawable.balloon_incoming_normal_stkr));
                            }
                        } else {
                            i2 = R.id.quick_reply_btn_background_1;
                        }
                        viewArr2[i5] = findViewById(i2);
                        View view32 = viewArr2[i5];
                        AnonymousClass00B.A04(view32);
                        view32.setBackground(AnonymousClass00T.A04(getContext(), R.drawable.balloon_incoming_normal_stkr));
                    }
                    view2 = viewArr2[i5];
                } else {
                    view2 = this.A06[i5];
                }
                if (!(textView == null || view2 == null)) {
                    textView.setVisibility(C13690nt.A07(z2));
                    view2.setVisibility(C13690nt.A07(z2));
                }
                if (z2) {
                    AnonymousClass00B.A04(textView);
                    AnonymousClass00B.A04(view2);
                    boolean z4 = ((C39731sy) this.A03.get(i5)).A01;
                    textView.setText(((C39731sy) this.A03.get(i5)).A04);
                    textView.setSelected(z4);
                    view2.setOnClickListener(!z4 ? new ViewOnClickCListenerShape2S0201000_I1(this, i5, r9, 1) : null);
                    view2.setContentDescription(((C39731sy) this.A03.get(i5)).A04);
                    view2.setClickable(!z4);
                    view2.setLongClickable(true);
                }
                i5++;
            } while (i5 < 3);
        }
    }

    public final boolean A03(int i2, int i3) {
        if (this.A03.size() <= 1) {
            return false;
        }
        View[] viewArr = this.A05;
        int i4 = (i2 >> 1) - (i3 << 1);
        return viewArr[0].getMeasuredWidth() <= i4 && viewArr[1].getMeasuredWidth() <= i4;
    }

    public final boolean A04(int i2, int i3) {
        if (A03(i2, i3) || this.A03.size() <= 2) {
            return false;
        }
        View[] viewArr = this.A05;
        int i4 = (i2 / 2) - (i3 << 1);
        return viewArr[1].getMeasuredWidth() <= i4 && viewArr[2].getMeasuredWidth() <= i4;
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r23 == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r27, int r28, int r29, int r30, int r31) {
        /*
            r26 = this;
            r11 = r26
            android.util.DisplayMetrics r2 = X.C13690nt.A0H(r11)
            r25 = 1
            r1 = 1098907648(0x41800000, float:16.0)
            r0 = r25
            float r0 = android.util.TypedValue.applyDimension(r0, r1, r2)
            int r12 = (int) r0
            int r0 = r11.getMeasuredWidth()
            boolean r24 = r11.A03(r0, r12)
            int r0 = r11.getMeasuredWidth()
            boolean r23 = r11.A04(r0, r12)
            r1 = 0
            if (r24 == 0) goto L_0x0027
            r0 = 0
            if (r23 != 0) goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            X.AnonymousClass00B.A0F(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r10 = X.C13680ns.A05(r11, r0)
            int r22 = r11.getRight()
            int r0 = r11.getLeft()
            int r22 = r22 - r0
            android.view.View[] r9 = r11.A05
            r2 = r9[r1]
            if (r2 == 0) goto L_0x0136
            r0 = 1093664768(0x41300000, float:11.0)
            int r1 = X.C13680ns.A05(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            float r0 = r2.getTextSize()
            int r0 = (int) r0
            int r21 = r1 << 1
            int r21 = r21 + r0
        L_0x0052:
            int r20 = r10 >> 1
            r8 = r20
            r7 = 0
        L_0x0057:
            r0 = r9[r7]
            if (r0 == 0) goto L_0x013a
            android.view.View[] r1 = r11.A06
            r0 = r1[r7]
            if (r0 == 0) goto L_0x013a
            r0 = r9[r7]
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x013a
            if (r7 != 0) goto L_0x00a0
            if (r24 != 0) goto L_0x00af
        L_0x006d:
            int r5 = r11.getWidth()
            r4 = r9[r7]
            r13 = r1[r7]
            r0 = r22
            int r6 = X.C13690nt.A06(r4, r0, r12)
            int r0 = r4.getMeasuredHeight()
            int r0 = r21 - r0
            int r3 = r0 >> 1
            int r2 = -r10
            int r1 = r5 + r10
            int r0 = r21 + r8
            int r0 = r0 + r10
            r13.layout(r2, r8, r1, r0)
            int r1 = r8 + r3
            int r5 = r5 - r6
            int r0 = r4.getMeasuredHeight()
            int r0 = r0 + r1
            int r0 = r0 + r10
            r4.layout(r6, r1, r5, r0)
            int r7 = r7 + 1
        L_0x009a:
            int r8 = r8 + r21
            r0 = 3
            if (r7 >= r0) goto L_0x013a
            goto L_0x0057
        L_0x00a0:
            r0 = r25
            if (r7 != r0) goto L_0x006d
            if (r23 == 0) goto L_0x006d
            r2 = 2
            r0 = r9[r2]
            if (r0 == 0) goto L_0x006d
            r0 = r1[r2]
            if (r0 == 0) goto L_0x006d
        L_0x00af:
            X.013 r0 = r11.A00
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0127
            X.0pd r3 = r11.A01
            r2 = 2230(0x8b6, float:3.125E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            if (r0 == 0) goto L_0x0127
            int r13 = r11.getWidth()
            int r0 = r7 + 1
            r19 = r9[r0]
            r18 = r1[r0]
            r6 = r9[r7]
            r17 = r1[r7]
        L_0x00d1:
            int r5 = r13 >> 1
            int r0 = r19.getMeasuredHeight()
            int r0 = r21 - r0
            int r4 = r0 >> 1
            int r0 = r6.getMeasuredHeight()
            int r0 = r21 - r0
            int r3 = r0 >> 1
            r0 = r19
            int r2 = X.C13690nt.A06(r0, r5, r12)
            int r16 = X.C13690nt.A06(r6, r5, r12)
            int r0 = -r10
            r1 = r0
            int r0 = r5 + r20
            int r14 = r21 + r8
            int r14 = r14 + r10
            r15 = r1
            r1 = r0
            r0 = r18
            r0.layout(r15, r8, r1, r14)
            int r0 = r5 - r20
            int r15 = r10 + r13
            r1 = r0
            r0 = r17
            r0.layout(r1, r8, r15, r14)
            int r14 = r4 + r8
            int r1 = r5 - r2
            int r0 = r19.getMeasuredHeight()
            int r4 = r4 + r0
            int r4 = r4 + r8
            r0 = r19
            r0.layout(r2, r14, r1, r4)
            int r5 = r5 + r16
            int r1 = r3 + r8
            int r13 = r13 - r16
            int r0 = r19.getMeasuredHeight()
            int r3 = r3 + r0
            int r3 = r3 + r8
            r6.layout(r5, r1, r13, r3)
            int r7 = r7 + 2
            goto L_0x009a
        L_0x0127:
            int r13 = r11.getWidth()
            r19 = r9[r7]
            r18 = r1[r7]
            int r0 = r7 + 1
            r6 = r9[r0]
            r17 = r1[r0]
            goto L_0x00d1
        L_0x0136:
            r21 = 0
            goto L_0x0052
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout.onLayout(boolean, int, int, int, int):void");
    }
}

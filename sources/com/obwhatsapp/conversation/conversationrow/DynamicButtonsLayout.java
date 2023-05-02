package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass1UP;
import X.AnonymousClass38Z;
import X.AnonymousClass3P6;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C39821t7;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape2S0201000_I1;
import com.obwhatsapp.R;
import java.util.List;

public class DynamicButtonsLayout extends ViewGroup implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public final List A02;
    public final View[] A03;
    public final View[] A04;

    public DynamicButtonsLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public DynamicButtonsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicButtonsLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = new View[3];
        this.A04 = new View[3];
        this.A02 = AnonymousClass000.A0u();
        ViewGroup.inflate(context, R.layout.layout05af, this);
    }

    public static final int A00(View view) {
        if (view == null) {
            return 0;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 11.0f, C13690nt.A0H(view));
        return Math.max((applyDimension << 1) + ((int) ((TextView) view).getTextSize()), C13680ns.A05(view, 40.0f));
    }

    public int A01(int i2) {
        View[] viewArr;
        int i3;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, C13690nt.A0H(this));
        int i4 = 0;
        do {
            viewArr = this.A03;
            if (viewArr[i4] != null) {
                View[] viewArr2 = this.A04;
                if (viewArr2[i4] != null && viewArr[i4].getVisibility() == 0) {
                    viewArr[i4].measure(View.MeasureSpec.makeMeasureSpec(i2 - (applyDimension << 1), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                    C13680ns.A12(viewArr2[i4]);
                }
            }
            i4++;
        } while (i4 < 3);
        List list = this.A02;
        boolean z2 = true;
        if (list.size() != 2 || viewArr[0].getMeasuredWidth() > (i3 = (i2 / 2) - (applyDimension << 1)) || viewArr[1].getMeasuredWidth() > i3) {
            z2 = false;
        }
        int size = list.size();
        if (z2) {
            size--;
        }
        int A002 = A00(viewArr[0]) * size;
        if (A002 != 0) {
            A002 += C13680ns.A05(this, 1.0f);
        }
        C13690nt.A12(this, i2, A002);
        return A002;
    }

    public final View A02(int i2) {
        int i3;
        AnonymousClass00B.A0F(true);
        View[] viewArr = this.A04;
        if (viewArr[i2] == null) {
            if (i2 != 0) {
                i3 = R.id.quick_reply_btn_background_2;
                if (i2 != 1) {
                    if (i2 == 2) {
                        i3 = R.id.quick_reply_btn_background_3;
                    }
                    View view = viewArr[i2];
                    AnonymousClass00B.A04(view);
                    view.setBackground(AnonymousClass00T.A04(getContext(), R.drawable.balloon_incoming_normal_stkr));
                }
            } else {
                i3 = R.id.quick_reply_btn_background_1;
            }
            viewArr[i2] = findViewById(i3);
            View view2 = viewArr[i2];
            AnonymousClass00B.A04(view2);
            view2.setBackground(AnonymousClass00T.A04(getContext(), R.drawable.balloon_incoming_normal_stkr));
        }
        return viewArr[i2];
    }

    public final View A03(int i2) {
        int i3;
        AnonymousClass00B.A0F(true);
        View[] viewArr = this.A03;
        if (viewArr[i2] == null) {
            if (i2 != 0) {
                i3 = R.id.quick_reply_btn_2;
                if (i2 != 1) {
                    if (i2 == 2) {
                        i3 = R.id.quick_reply_btn_3;
                    }
                    AnonymousClass1UP.A06((TextView) viewArr[i2]);
                }
            } else {
                i3 = R.id.quick_reply_btn_1;
            }
            viewArr[i2] = findViewById(i3);
            AnonymousClass1UP.A06((TextView) viewArr[i2]);
        }
        return viewArr[i2];
    }

    public void A04(AnonymousClass38Z r8, List list) {
        boolean z2;
        View view;
        View view2;
        List list2 = this.A02;
        list2.clear();
        int min = Math.min(3, list.size());
        for (int i2 = 0; i2 < min; i2++) {
            list2.add(list.get(i2));
        }
        int i3 = 0;
        do {
            if (list2.size() > i3) {
                z2 = true;
                view = A03(i3);
                view2 = A02(i3);
            } else {
                z2 = false;
                view = this.A04[i3];
                view2 = this.A03[i3];
            }
            if (!(view == null || view2 == null)) {
                int i4 = 8;
                view.setVisibility(C13690nt.A07(z2));
                if (z2) {
                    i4 = 0;
                }
                view2.setVisibility(i4);
            }
            if (z2) {
                TextView textView = (TextView) A03(i3);
                textView.setVisibility(0);
                textView.setText(((C39821t7) list2.get(i3)).A03);
                textView.setSelected(((C39821t7) list2.get(i3)).A00);
                View A022 = A02(i3);
                A022.setVisibility(0);
                if (((C39821t7) list2.get(i3)).A00) {
                    A022.setClickable(false);
                } else {
                    A022.setClickable(true);
                    A022.setOnClickListener(new ViewOnClickCListenerShape2S0201000_I1(this, i3, r8, 0));
                }
                A022.setContentDescription(((C39821t7) list2.get(i3)).A03);
                A022.setLongClickable(true);
                C004601z.A0j(A022, new AnonymousClass3P6(this, i3));
            }
            i3++;
        } while (i3 < 3);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, C13690nt.A0H(this));
        int applyDimension2 = (int) TypedValue.applyDimension(1, 2.0f, C13690nt.A0H(this));
        int right = getRight() - getLeft();
        View[] viewArr = this.A03;
        int i7 = 0;
        int A002 = A00(viewArr[0]);
        int measuredWidth = getMeasuredWidth();
        boolean z3 = true;
        if (this.A02.size() != 2 || viewArr[0].getMeasuredWidth() > (i6 = (measuredWidth / 2) - (applyDimension << 1)) || viewArr[1].getMeasuredWidth() > i6) {
            z3 = false;
        }
        int i8 = applyDimension2 >> 1;
        int i9 = i8;
        do {
            View view = viewArr[i7];
            if (view != null) {
                View[] viewArr2 = this.A04;
                if (viewArr2[i7] != null && view.getVisibility() == 0) {
                    if (i7 != 0 || !z3) {
                        int width = getWidth();
                        View view2 = viewArr[i7];
                        View view3 = viewArr2[i7];
                        int A06 = C13690nt.A06(view2, right, applyDimension);
                        int measuredHeight = (A002 - view2.getMeasuredHeight()) >> 1;
                        view3.layout(-applyDimension2, i9, width + applyDimension2, A002 + i9 + applyDimension2);
                        int i10 = i9 + measuredHeight;
                        view2.layout(A06, i10, width - A06, view2.getMeasuredHeight() + i10 + applyDimension2);
                        i7++;
                    } else {
                        int width2 = getWidth();
                        View view4 = viewArr[0];
                        View view5 = viewArr2[0];
                        View view6 = viewArr[1];
                        View view7 = viewArr2[1];
                        int i11 = width2 >> 1;
                        int measuredHeight2 = (A002 - view4.getMeasuredHeight()) >> 1;
                        int measuredHeight3 = (A002 - view6.getMeasuredHeight()) >> 1;
                        int A062 = C13690nt.A06(view4, i11, applyDimension);
                        int A063 = C13690nt.A06(view6, i11, applyDimension);
                        int i12 = A002 + i9 + applyDimension2;
                        view5.layout(-applyDimension2, i9, i11 + i8, i12);
                        view7.layout(i11 - i8, i9, width2 + applyDimension2, i12);
                        view4.layout(A062, measuredHeight2 + i9, i11 - A062, measuredHeight2 + view4.getMeasuredHeight() + i9);
                        view6.layout(i11 + A063, measuredHeight3 + i9, width2 - A063, measuredHeight3 + view4.getMeasuredHeight() + i9);
                        i7 = 2;
                    }
                    i9 += A002;
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (i7 < 3);
    }
}

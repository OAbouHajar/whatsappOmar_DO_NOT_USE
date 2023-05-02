package com.obwhatsapp.payments.ui.widget;

import X.C110115dX;
import X.C111295fg;
import X.C114805od;
import X.C115515ps;
import X.C115725qD;
import X.C13680ns;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

public class PayToolbar extends C111295fg {
    public View A00;
    public FrameLayout A01;
    public TextView A02;
    public WaImageView A03;
    public C114805od A04;

    public PayToolbar(Context context) {
        super(context);
        C13680ns.A0G(this).inflate(R.layout.layout042e, this, true);
    }

    public PayToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C114805od r1;
        C13680ns.A0G(this).inflate(R.layout.layout042e, this, true);
        if (attributeSet != null && !isInEditMode()) {
            int i2 = 0;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C115725qD.A01, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId != 0) {
                setContentDescription(context.getString(resourceId));
            }
            findViewById(R.id.back).setVisibility(!obtainStyledAttributes.getBoolean(0, false) ? 8 : i2);
            int i3 = obtainStyledAttributes.getInt(3, -1);
            if (i3 >= 0) {
                C114805od[] values = C114805od.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        r1 = null;
                        break;
                    }
                    r1 = values[i4];
                    if (r1.ordinal() == i3) {
                        break;
                    }
                    i4++;
                }
                this.A04 = r1;
            }
            this.A02 = C13680ns.A0M(this, R.id.title);
            this.A01 = (FrameLayout) findViewById(R.id.title_layout);
            this.A03 = (WaImageView) findViewById(R.id.fbpay_logo);
            this.A00 = findViewById(R.id.lock);
            setLockIconVisibility(obtainStyledAttributes.getBoolean(1, true));
        }
    }

    public PayToolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C13680ns.A0G(this).inflate(R.layout.layout042e, this, true);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        C114805od r2;
        int i6;
        int i7;
        super.onLayout(z2, i2, i3, i4, i5);
        FrameLayout frameLayout = this.A01;
        if (frameLayout != null && frameLayout.getVisibility() != 8 && (r2 = this.A04) != null) {
            int width = getWidth();
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            int i8 = width - paddingRight;
            int i9 = height - paddingBottom;
            int measuredWidth = frameLayout.getMeasuredWidth();
            int i10 = 0;
            if (frameLayout.getLayoutParams() != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                i10 = marginLayoutParams.leftMargin;
                i6 = marginLayoutParams.rightMargin;
            } else {
                i6 = 0;
            }
            int i11 = measuredWidth + i10 + i6;
            int measuredHeight = frameLayout.getMeasuredHeight();
            int i12 = 0;
            if (frameLayout.getLayoutParams() != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                i12 = marginLayoutParams2.topMargin;
                i7 = marginLayoutParams2.bottomMargin;
            } else {
                i7 = 0;
            }
            int i13 = measuredHeight + i12 + i7;
            if (C110115dX.A01(r2, C115515ps.A00) == 1) {
                int i14 = height >> 1;
                int i15 = i13 >> 1;
                int i16 = paddingLeft - currentContentInsetLeft;
                paddingLeft = Math.max(i16, ((width >> 1) + i16) - (i11 >> 1));
                i8 = Math.min(i8 - currentContentInsetRight, i11 + paddingLeft);
                paddingTop = Math.max(paddingTop, i14 - i15);
                i9 = Math.min(i9, i14 + i15);
            }
            frameLayout.layout(paddingLeft, paddingTop, i8, i9);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r4 == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r4 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.C45902Bo.A01 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLockIconVisibility(boolean r6) {
        /*
            r5 = this;
            android.view.View r1 = r5.A00
            r3 = 0
            int r0 = X.C13680ns.A02(r6)
            r1.setVisibility(r0)
            X.013 r0 = r5.A00
            boolean r0 = r0.A0T()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0019
            boolean r0 = X.C45902Bo.A01
            r4 = 0
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r4 = 1
        L_0x001a:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r0 = 3
            if (r4 == 0) goto L_0x0024
            r0 = 5
        L_0x0024:
            r0 = r0 | 16
            r2.gravity = r0
            android.content.res.Resources r1 = X.C13680ns.A0D(r5)
            r0 = 2131166146(0x7f0703c2, float:1.794653E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            r0 = 0
            if (r4 != 0) goto L_0x0038
            r0 = r1
            r1 = 0
        L_0x0038:
            r2.setMargins(r0, r3, r1, r3)
            android.widget.FrameLayout r0 = r5.A01
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.res.Resources r1 = X.C13680ns.A0D(r5)
            r0 = 2131166147(0x7f0703c3, float:1.7946531E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            if (r6 == 0) goto L_0x0053
            r0 = r1
            if (r4 != 0) goto L_0x0058
        L_0x0053:
            r0 = 0
            if (r6 == 0) goto L_0x0058
            if (r4 == 0) goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            r2.setMargins(r1, r3, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.widget.PayToolbar.setLockIconVisibility(boolean):void");
    }

    public void setLogo(int i2) {
        this.A02.setVisibility(8);
        if (i2 != R.id.fbpay_logo) {
            this.A03.setVisibility(0);
        }
        this.A03.setImageResource(i2);
    }

    public void setLogo(Drawable drawable) {
        this.A02.setVisibility(8);
        WaImageView waImageView = this.A03;
        waImageView.setVisibility(0);
        waImageView.setImageDrawable(drawable);
    }

    public void setOnLockClicked(View.OnClickListener onClickListener) {
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2 = 8;
        if (charSequence == null || !getContext().getString(R.string.str08ae).equalsIgnoreCase(charSequence.toString())) {
            this.A03.setVisibility(8);
            textView = this.A02;
            textView.setText(charSequence);
            i2 = 0;
        } else {
            textView = this.A02;
        }
        textView.setVisibility(i2);
    }
}

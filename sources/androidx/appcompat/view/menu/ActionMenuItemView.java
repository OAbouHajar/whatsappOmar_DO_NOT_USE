package androidx.appcompat.view.menu;

import X.AnonymousClass02Z;
import X.AnonymousClass0D9;
import X.AnonymousClass0L4;
import X.AnonymousClass0L5;
import X.C016607w;
import X.C06970Yq;
import X.C07290av;
import X.C12240k4;
import X.C12950lE;
import X.C12960lF;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ActionMenuItemView extends AnonymousClass02Z implements View.OnClickListener, C12950lE, C12960lF {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public AnonymousClass0L4 A04;
    public C12240k4 A05;
    public C07290av A06;
    public C06970Yq A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r2.orientation == 2) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionMenuItemView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.content.res.Resources r3 = r5.getResources()
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r2 = r0.getConfiguration()
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L_0x001f
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r4.A09 = r0
            int[] r0 = X.AnonymousClass05L.A02
            r2 = 0
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r0, r7, r2)
            int r0 = r1.getDimensionPixelSize(r2, r2)
            r4.A01 = r0
            r1.recycle()
            android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r4.A00 = r0
            r4.setOnClickListener(r4)
            r0 = -1
            r4.A02 = r0
            r4.setSaveEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void A00() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.A08);
        if (this.A03 != null && ((this.A06.A06 & 4) != 4 || (!this.A09 && !this.A0A))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence = null;
        setText(z4 ? this.A08 : null);
        CharSequence contentDescription = this.A06.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z4 ? null : this.A06.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.A06.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z4) {
                charSequence = this.A06.getTitle();
            }
            AnonymousClass0L5.A00(this, charSequence);
            return;
        }
        AnonymousClass0L5.A00(this, tooltipText);
    }

    public void AII(C07290av r3, int i2) {
        this.A06 = r3;
        setIcon(r3.getIcon());
        setTitle(r3.getTitleCondensed());
        setId(r3.getItemId());
        int i3 = 8;
        if (r3.isVisible()) {
            i3 = 0;
        }
        setVisibility(i3);
        setEnabled(r3.isEnabled());
        if (r3.hasSubMenu() && this.A07 == null) {
            this.A07 = new AnonymousClass0D9(this);
        }
    }

    public boolean ALg() {
        return !TextUtils.isEmpty(getText());
    }

    public boolean ALh() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.A06.getIcon() == null;
    }

    public C07290av getItemData() {
        return this.A06;
    }

    public void onClick(View view) {
        C12240k4 r1 = this.A05;
        if (r1 != null) {
            r1.AIa(this.A06);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r2.orientation == 2) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r4) {
        /*
            r3 = this;
            super.onConfigurationChanged(r4)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r2 = r0.getConfiguration()
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L_0x001b
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            r3.A09 = r0
            r3.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z2 = !TextUtils.isEmpty(getText());
        if (z2 && (i6 = this.A02) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i5 = this.A01;
            i4 = Math.min(size, i5);
        } else {
            i4 = this.A01;
            i5 = i4;
        }
        if (mode != 1073741824 && i5 > 0 && measuredWidth < i4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
        }
        if (!z2 && this.A03 != null) {
            super.setPadding((getMeasuredWidth() - this.A03.getBounds().width()) >> 1, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C06970Yq r0;
        if (!this.A06.hasSubMenu() || (r0 = this.A07) == null || !r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.A0A != z2) {
            this.A0A = z2;
            C07290av r0 = this.A06;
            if (r0 != null) {
                C016607w r1 = r0.A0E;
                r1.A0D = true;
                r1.A0F(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A03 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.A00;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        A00();
    }

    public void setItemInvoker(C12240k4 r1) {
        this.A05 = r1;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.A02 = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AnonymousClass0L4 r1) {
        this.A04 = r1;
    }

    public void setTitle(CharSequence charSequence) {
        this.A08 = charSequence;
        A00();
    }
}

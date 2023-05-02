package com.obwhatsapp.biz;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass2Sy;
import X.AnonymousClass4BW;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14710pd;
import X.C16150sX;
import X.C17250um;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import java.util.List;

public class BusinessProfileFieldView extends LinearLayout implements AnonymousClass006 {
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public Drawable A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public AnonymousClass013 A07;
    public C17250um A08;
    public C14710pd A09;
    public C52662eE A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;

    public BusinessProfileFieldView(Context context) {
        super(context);
        A00();
        A01((AttributeSet) null);
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(attributeSet);
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        A01(attributeSet);
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
        A01(attributeSet);
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A00();
    }

    private void setIcon(Drawable drawable) {
        if (drawable != null) {
            setPadding(C13680ns.A0D(this).getDimensionPixelSize(R.dimen.dimen0457), getPaddingTop(), C13680ns.A0D(this).getDimensionPixelSize(R.dimen.dimen0457), getPaddingBottom());
        }
    }

    public void A00() {
        if (!this.A0C) {
            this.A0C = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A07 = C16150sX.A0Z(A002);
            this.A09 = C16150sX.A0k(A002);
            this.A08 = C16150sX.A0i(A002);
        }
    }

    public void A01(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C13700nu.A04(this).obtainStyledAttributes(attributeSet, AnonymousClass4BW.A03, 0, 0);
            try {
                this.A03 = obtainStyledAttributes.getDrawable(2);
                this.A00 = obtainStyledAttributes.getInteger(0, 0);
                this.A0D = obtainStyledAttributes.getBoolean(3, false);
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(4);
                this.A01 = colorStateList;
                if (colorStateList == null) {
                    this.A01 = new ColorStateList(new int[][]{new int[0]}, new int[]{AnonymousClass00T.A00(getContext(), R.color.color0660)});
                }
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(5);
                this.A02 = colorStateList2;
                if (colorStateList2 == null) {
                    this.A02 = this.A01;
                }
                this.A0B = this.A07.A0F(obtainStyledAttributes, 1);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        View inflate = C13680ns.A0G(this).inflate(R.layout.layout00c4, this, true);
        this.A04 = C13680ns.A0K(inflate, R.id.field_icon);
        setIcon(this.A03);
        this.A06 = C13680ns.A0M(inflate, R.id.field_textview);
        this.A05 = C13680ns.A0M(inflate, R.id.sub_field_textview);
        this.A06.setSingleLine(this.A0D);
        this.A05.setSingleLine(this.A0D);
        int i2 = this.A00;
        TextUtils.TruncateAt truncateAt = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.END : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
        this.A06.setEllipsize(truncateAt);
        this.A05.setEllipsize(truncateAt);
        TextView textView = this.A06;
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = (EllipsizedTextEmojiLabel) textView;
        ellipsizedTextEmojiLabel.A00 = 180;
        ellipsizedTextEmojiLabel.A02 = R.color.color0659;
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel2 = (EllipsizedTextEmojiLabel) this.A05;
        ellipsizedTextEmojiLabel2.A00 = 180;
        ellipsizedTextEmojiLabel2.A02 = R.color.color0659;
        textView.setTextColor(this.A01);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0A;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public int getLayoutRes() {
        return R.layout.layout00c4;
    }

    public TextView getSubTextView() {
        return this.A05;
    }

    public String getText() {
        TextView textView = this.A06;
        if (textView != null) {
            return C13690nt.A0b(textView);
        }
        return null;
    }

    public TextView getTextView() {
        return this.A06;
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.A06.setEnabled(z2);
        this.A05.setEnabled(z2);
    }

    public void setIcon(int i2) {
        setIcon(AnonymousClass00T.A04(getContext(), i2));
    }

    public void setInputType(int i2) {
        TextView textView = this.A06;
        if (textView != null) {
            textView.setInputType(i2);
        }
    }

    public void setSubText(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (TextUtils.isEmpty(charSequence)) {
            C13700nu.A0T(this.A05);
            textView = this.A05;
            i2 = 8;
        } else {
            ((TextEmojiLabel) this.A05).A0I((List) null, AnonymousClass2Sy.A03(getContext(), this.A06.getPaint(), this.A08, charSequence));
            textView = this.A05;
            i2 = 0;
        }
        textView.setVisibility(i2);
    }

    public void setText(CharSequence charSequence, View.OnClickListener onClickListener) {
        int i2;
        if (!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(this.A0B)) {
            this.A06.setTextColor(this.A01);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.A0B;
                this.A06.setTextColor(this.A02);
            }
            TextView textView = this.A06;
            ((EllipsizedTextEmojiLabel) textView).A03 = onClickListener;
            ((TextEmojiLabel) textView).A0I((List) null, AnonymousClass2Sy.A03(getContext(), this.A06.getPaint(), this.A08, charSequence));
            i2 = 0;
        } else {
            C13700nu.A0T(this.A06);
            i2 = 8;
        }
        setVisibility(i2);
    }

    public void setTextColor(int i2) {
        this.A06.setTextColor(i2);
        this.A01 = new ColorStateList(new int[][]{new int[0]}, new int[]{i2});
    }
}

package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.2Nd  reason: invalid class name and case insensitive filesystem */
public abstract class C48412Nd extends C48422Ne {
    public TextEmojiLabel A00;
    public WaImageView A01;
    public WaTextView A02;
    public AnonymousClass01V A03;
    public AnonymousClass013 A04;
    public boolean A05;

    public C48412Nd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C48412Nd(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A05 = true;
        A01(attributeSet);
    }

    public void A01(AttributeSet attributeSet) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C53072ew.A0B, 0, 0);
            try {
                i2 = obtainStyledAttributes.getResourceId(4, 0);
                i3 = obtainStyledAttributes.getResourceId(0, 0);
                i4 = obtainStyledAttributes.getResourceId(1, 0);
                i5 = obtainStyledAttributes.getColor(2, 0);
                i6 = obtainStyledAttributes.getColor(5, 0);
                this.A05 = obtainStyledAttributes.getBoolean(3, true);
                f2 = obtainStyledAttributes.getDimension(6, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            f2 = 0.0f;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(getRootLayoutID(), this, true);
        this.A02 = (WaTextView) C004601z.A0E(inflate, R.id.list_item_title);
        this.A00 = (TextEmojiLabel) C004601z.A0E(inflate, R.id.list_item_description);
        this.A01 = (WaImageView) C004601z.A0E(inflate, R.id.list_item_icon);
        if (i2 != 0) {
            this.A02.setText(i2);
        }
        if (i3 != 0) {
            this.A00.setText(i3);
            this.A00.setText(i3);
        }
        if (i6 != 0) {
            WaTextView waTextView = this.A02;
        }
        if (i5 != 0) {
            setIconColor(i5);
        }
        if (i4 != 0) {
            setIcon(i4);
        }
        if (f2 != 0.0f) {
            this.A02.setTextSize(0, f2);
        }
    }

    public abstract int getRootLayoutID();

    public void setDescription(Spanned spanned) {
        this.A00.setText(spanned);
        this.A00.setMovementMethod(new AnonymousClass3MF());
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, this.A03));
    }

    public void setDescription(String str) {
        this.A00.setText(str);
    }

    public void setIcon(int i2) {
        Drawable drawable;
        try {
            if (getResources().getXml(i2) != null) {
                drawable = AnonymousClass07V.A01((Resources.Theme) null, getResources(), i2);
                C447725m r1 = new C447725m(drawable, this.A04);
                r1.A00 = this.A05;
                this.A01.setImageDrawable(r1);
            }
        } catch (Resources.NotFoundException unused) {
        }
        drawable = AnonymousClass00T.A04(getContext(), i2);
        C447725m r12 = new C447725m(drawable, this.A04);
        r12.A00 = this.A05;
        this.A01.setImageDrawable(r12);
    }

    public void setIconColor(int i2) {
        C018808t.A00(ColorStateList.valueOf(i2), this.A01);
    }

    public void setIconVisible(boolean z2) {
        WaImageView waImageView = this.A01;
        int i2 = 8;
        if (z2) {
            i2 = 0;
        }
        waImageView.setVisibility(i2);
    }

    public void setTitle(String str) {
        this.A02.setText(str);
    }
}

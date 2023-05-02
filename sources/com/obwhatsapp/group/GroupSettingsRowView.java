package com.obwhatsapp.group;

import X.AnonymousClass01V;
import X.AnonymousClass2OS;
import X.AnonymousClass3MF;
import X.C004601z;
import X.C57102q8;
import X.C816449e;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public class GroupSettingsRowView extends AnonymousClass2OS {
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextEmojiLabel A03;
    public AnonymousClass01V A04;

    public GroupSettingsRowView(Context context) {
        this(context, (AttributeSet) null);
    }

    public GroupSettingsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public GroupSettingsRowView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01(context, attributeSet);
    }

    public void A01(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.layout02e7, this);
        this.A02 = (TextView) C004601z.A0E(this, R.id.group_setting_row_title);
        this.A01 = (TextView) C004601z.A0E(this, R.id.group_setting_row_info);
        this.A00 = C004601z.A0E(this, R.id.group_setting_row_description_container);
        this.A03 = (TextEmojiLabel) C004601z.A0E(this, R.id.group_setting_row_description);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C816449e.A00);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            setTextOrHideView(this.A02, resourceId != 0 ? context.getString(resourceId) : null);
            int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
            setTextOrHideView(this.A01, resourceId2 != 0 ? context.getString(resourceId2) : null);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public CharSequence getInfoText() {
        return this.A01.getText();
    }

    public CharSequence getTitleText() {
        return this.A02.getText();
    }

    public void setDescriptionText(int i2) {
        this.A00.setVisibility(0);
        setTextOrHideView(this.A03, getContext().getString(i2));
    }

    public void setDescriptionText(Spanned spanned) {
        this.A00.setVisibility(0);
        this.A03.setMovementMethod(new AnonymousClass3MF());
        TextEmojiLabel textEmojiLabel = this.A03;
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, this.A04));
        setTextOrHideView(this.A03, spanned);
    }

    public void setInfoText(int i2) {
        setTextOrHideView(this.A01, getContext().getString(i2));
    }

    public final void setTextOrHideView(TextView textView, CharSequence charSequence) {
        int i2 = 0;
        if (TextUtils.isEmpty(charSequence)) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        textView.setText(charSequence);
    }

    public void setTitleText(int i2) {
        setTextOrHideView(this.A02, getContext().getString(i2));
    }
}

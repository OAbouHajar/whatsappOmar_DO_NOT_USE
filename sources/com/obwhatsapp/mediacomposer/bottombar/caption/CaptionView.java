package com.obwhatsapp.mediacomposer.bottombar.caption;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass29G;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C16150sX;
import X.C34331k5;
import X.C52652eD;
import X.C52662eE;
import X.C53072ew;
import X.C93744jh;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.mentions.MentionableEntry;
import java.util.List;

public class CaptionView extends LinearLayout implements AnonymousClass006 {
    public AnonymousClass013 A00;
    public C52662eE A01;
    public boolean A02;
    public final Context A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ImageButton A07;
    public final LinearLayout A08;
    public final WaImageButton A09;
    public final WaImageView A0A;
    public final MentionableEntry A0B;

    public CaptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A04);
        LinearLayout.inflate(getContext(), obtainStyledAttributes.getBoolean(0, false) ? R.layout.layout0407 : R.layout.layout03c7, this);
        this.A03 = context;
        this.A0B = (MentionableEntry) C004601z.A0E(this, R.id.caption);
        this.A08 = (LinearLayout) C004601z.A0E(this, R.id.left_button_holder);
        this.A07 = (ImageButton) C004601z.A0E(this, R.id.emoji_picker_btn);
        this.A05 = C004601z.A0E(this, R.id.left_button_spacer);
        this.A09 = (WaImageButton) C004601z.A0E(this, R.id.add_button);
        this.A04 = C004601z.A0E(this, R.id.left_button_spacer);
        this.A0A = C13690nt.A0R(this, R.id.view_once_toggle);
        this.A06 = C004601z.A0E(this, R.id.view_once_toggle_spacer);
        obtainStyledAttributes.recycle();
    }

    public CaptionView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public Paint getCaptionPaint() {
        return this.A0B.getPaint();
    }

    public String getCaptionStringText() {
        return this.A0B.getStringText();
    }

    public CharSequence getCaptionText() {
        MentionableEntry mentionableEntry = this.A0B;
        return TextUtils.isEmpty(mentionableEntry.getText()) ? "" : mentionableEntry.getText();
    }

    @Deprecated
    public WaEditText getCaptionTextView() {
        return this.A0B;
    }

    public int getCaptionTop() {
        int[] iArr = new int[2];
        this.A0B.getLocationInWindow(iArr);
        return iArr[1];
    }

    public int getCurrentTextColor() {
        return this.A0B.getCurrentTextColor();
    }

    @Deprecated
    public ImageButton getEmojiPickerButton() {
        return this.A07;
    }

    public List getMentions() {
        return this.A0B.getMentions();
    }

    public void setAddButtonActivated(boolean z2) {
        this.A09.setActivated(z2);
    }

    public void setAddButtonClickable(boolean z2) {
        this.A09.setClickable(z2);
    }

    public void setAddButtonEnabled(boolean z2) {
        this.A09.setEnabled(z2);
    }

    public void setCaptionButtonsListener(AnonymousClass29G r3) {
        C34331k5.A04(this.A09, this, r3, 47);
        C13680ns.A16(this.A0A, r3, 45);
    }

    public void setCaptionEditTextView(CharSequence charSequence) {
        MentionableEntry mentionableEntry = this.A0B;
        mentionableEntry.setText(charSequence);
        mentionableEntry.setSelection(charSequence.length(), charSequence.length());
        mentionableEntry.setInputEnterAction(6);
        mentionableEntry.setFilters(new InputFilter[]{new C93744jh(1024)});
    }

    public void setCaptionText(CharSequence charSequence) {
        this.A0B.setText(charSequence);
    }

    public void setViewOnceButtonClickable(boolean z2) {
        this.A0A.setClickable(z2);
    }
}

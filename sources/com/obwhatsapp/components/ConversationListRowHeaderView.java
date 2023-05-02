package com.obwhatsapp.components;

import X.AnonymousClass006;
import X.C13680ns;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;

public class ConversationListRowHeaderView extends LinearLayout implements AnonymousClass006 {
    public TextEmojiLabel A00;
    public WaTextView A01;
    public C52662eE A02;
    public boolean A03;

    public ConversationListRowHeaderView(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        A00(context);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        A00(context);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        A00(context);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        A00(context);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    private void addfindViews() {
        this.A00 = C13680ns.A0R(this, R.id.conversations_row_contact_name);
        this.A01 = (WaTextView) findViewById(R.id.conversations_row_date);
    }

    public final void A00(Context context) {
    }

    public final void addA00(Context context) {
        LinearLayout.inflate(context, R.layout.layout016c, this);
        addfindViews();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public TextEmojiLabel getContactNameView() {
        return this.A00;
    }

    public WaTextView getDateView() {
        return this.A01;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        addfindViews();
    }
}

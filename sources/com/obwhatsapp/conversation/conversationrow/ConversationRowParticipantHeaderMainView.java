package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass3ON;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class ConversationRowParticipantHeaderMainView extends AnonymousClass3ON {
    public ConversationRowParticipantHeaderMainView(Context context) {
        super(context);
    }

    public ConversationRowParticipantHeaderMainView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationRowParticipantHeaderMainView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public View getPrimaryNameView() {
        return getChildAt(0);
    }

    public View getSecondaryNameView() {
        return getChildAt(1);
    }

    public /* bridge */ /* synthetic */ void setShouldTruncateNameViewWhenNeeded(boolean z2) {
        this.A00 = z2;
    }
}

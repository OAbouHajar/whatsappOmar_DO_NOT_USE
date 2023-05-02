package com.obwhatsapp.yo;

import android.widget.CompoundButton;
import com.obwhatsapp.youbasha.ui.activity.mediaPrivacy;

/* compiled from: lambda */
public final /* synthetic */ class maskmedia1 implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ mediaPrivacy f$0;

    public /* synthetic */ maskmedia1(mediaPrivacy mediaprivacy) {
        this.f$0 = mediaprivacy;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        Conversation.a(this.f$0, compoundButton, z2);
    }
}

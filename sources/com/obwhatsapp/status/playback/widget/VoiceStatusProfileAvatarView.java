package com.obwhatsapp.status.playback.widget;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.C004601z;
import X.C13690nt;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

public class VoiceStatusProfileAvatarView extends FrameLayout {
    public WaImageView A00;
    public WaImageView A01;

    public VoiceStatusProfileAvatarView(Context context) {
        super(context);
        A00(context);
    }

    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00(context);
    }

    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00(context);
    }

    public final void A00(Context context) {
        FrameLayout.inflate(context, R.layout.layout05e9, this);
        this.A01 = C13690nt.A0R(this, R.id.profile_avatar);
        this.A00 = C13690nt.A0R(this, R.id.mic_overlay);
    }

    public WaImageView getProfileAvatarImageView() {
        return this.A01;
    }

    public void setMicrophoneStrokeColor(int i2) {
        Drawable A04 = AnonymousClass00T.A04(getContext(), R.drawable.mic_background_incoming_normal);
        AnonymousClass00B.A06(A04);
        this.A00.setBackground(A04.mutate());
        C004601z.A0O(ColorStateList.valueOf(i2), this.A00);
    }
}

package com.mod2.fb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bbm.ui.TouchImageView;
import com.mod2.libs.TTRImage;
import com.mod2.libs.TTRPanel;
import com.mod2.libs.TTrigger;

public class AvatarView extends TouchImageView implements TTrigger.OnTriggerEvent {
    private TTRImage TRImage;
    private TTRPanel TRPanel;
    private TTrigger Trigger;
    private Context context;

    public AvatarView(Context context2) {
        super(context2);
        this.context = context2;
        InitAvatarView();
    }

    public AvatarView(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
        InitAvatarView();
    }

    public AvatarView(Context context2, AttributeSet attributeSet, int i2) {
        super(context2, attributeSet, i2);
        this.context = context2;
        InitAvatarView();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.mod2.fb.AvatarView, android.widget.ImageView, android.view.View, java.lang.Object, com.mod2.libs.TTrigger$OnTriggerEvent] */
    public void InitAvatarView() {
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(this.context, this);
            this.TRPanel = new TTRPanel(this.context, (View) this, (Object) this, (Boolean) true);
            this.TRPanel.InitPanel(this.Trigger);
            this.TRImage = new TTRImage(this.context, this, this, this.Trigger);
        }
    }

    public void onTriggered(String str) {
        this.TRPanel.DoTrigger(str);
        this.TRImage.DoTrigger(str);
    }
}

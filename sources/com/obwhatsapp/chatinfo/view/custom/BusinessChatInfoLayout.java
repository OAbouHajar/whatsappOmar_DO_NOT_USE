package com.obwhatsapp.chatinfo.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class BusinessChatInfoLayout extends ChatInfoLayoutV2 {
    public boolean A00;

    public BusinessChatInfoLayout(Context context) {
        super(context);
        A00();
    }

    public BusinessChatInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public BusinessChatInfoLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public BusinessChatInfoLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public int A03(int i2) {
        ImageView imageView = this.A05;
        return (imageView == null || imageView.getDrawable() == null) ? super.A03(i2) : (int) (((float) i2) * 0.5625f);
    }
}

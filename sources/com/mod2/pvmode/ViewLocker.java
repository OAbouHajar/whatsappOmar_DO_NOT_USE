package com.mod2.pvmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mod2.libs.Const;
import com.mod2.libs.TTR;

public class ViewLocker extends View {
    private TTR TR;

    public ViewLocker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TR = new TTR(context);
        if (!isInEditMode() && this.TR.GetSharedBool(Const.ViewLocker).booleanValue()) {
            this.TR.StartActivity(LockActivity.class);
            this.TR.StartService(LockService.class);
        }
    }
}

package com.whatsapp.util;

import X.C004601z;
import X.C28841Xz;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import java.lang.reflect.Field;

public class MarqueeToolbar extends C28841Xz {
    public Runnable A00;
    public boolean A01 = false;

    public MarqueeToolbar(Context context) {
        super(context);
    }

    public MarqueeToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MarqueeToolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final void A0J() {
        if (!this.A01) {
            try {
                Field declaredField = Toolbar.class.getDeclaredField("mTitleTextView");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (obj == null) {
                    return;
                }
                if (!(obj instanceof TextView)) {
                    this.A01 = true;
                    return;
                }
                TextView textView = (TextView) obj;
                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                textView.setMarqueeRepeatLimit(1);
                textView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(textView, 48));
                C004601z.A0j(textView, new IDxDCompatShape22S0100000_2_I0(this, 15));
                if (this.A00 == null) {
                    RunnableRunnableShape11S0200000_I0_9 runnableRunnableShape11S0200000_I0_9 = new RunnableRunnableShape11S0200000_I0_9(this, 20, textView);
                    this.A00 = runnableRunnableShape11S0200000_I0_9;
                    postDelayed(runnableRunnableShape11S0200000_I0_9, 1000);
                }
            } catch (IllegalAccessException | NoSuchFieldException e2) {
                Log.e("util/marqueetoolbar", e2);
                this.A01 = true;
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.A00;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.A00 = null;
        }
    }

    public void setTitle(int i2) {
        super.setTitle(i2);
        A0J();
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A0J();
    }
}

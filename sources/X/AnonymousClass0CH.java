package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.Switch;

/* renamed from: X.0CH  reason: invalid class name */
public class AnonymousClass0CH extends FrameLayout implements C13330lr {
    public final Switch A00;

    public AnonymousClass0CH(Context context) {
        super(context);
        Switch switchR = new Switch(context);
        this.A00 = switchR;
        addView(switchR, -2, -2);
    }

    public void Aet(ColorStateList colorStateList, boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            Switch switchR = this.A00;
            switchR.setTrackTintList(colorStateList);
            switchR.setTrackTintMode(PorterDuff.Mode.SRC_OVER);
            return;
        }
        Switch switchR2 = this.A00;
        Drawable trackDrawable = switchR2.getTrackDrawable();
        if (trackDrawable != null) {
            Drawable mutate = C018208n.A03(trackDrawable).mutate();
            C018208n.A04(colorStateList, mutate);
            if (mutate.isStateful()) {
                mutate.setState(switchR2.getDrawableState());
            }
            switchR2.setTrackDrawable(mutate);
        }
    }

    public void setChecked(boolean z2) {
        this.A00.setChecked(z2);
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.A00.setEnabled(z2);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A00.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setTag(int i2, Object obj) {
        this.A00.setTag(i2, obj);
    }

    public void setTag(Object obj) {
        this.A00.setTag(obj);
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        Switch switchR = this.A00;
        if (i2 >= 23) {
            switchR.setThumbTintList(colorStateList);
            return;
        }
        Drawable thumbDrawable = switchR.getThumbDrawable();
        if (thumbDrawable != null) {
            Drawable mutate = C018208n.A03(thumbDrawable).mutate();
            C018208n.A04(colorStateList, mutate);
            if (mutate.isStateful()) {
                mutate.setState(switchR.getDrawableState());
            }
            switchR.setThumbDrawable(mutate);
        }
    }
}

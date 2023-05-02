package androidx.drawerlayout.widget;

import X.C11890jV;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public abstract class DrawerLayout extends ViewGroup {
    public abstract float getDrawerElevation();

    public abstract Drawable getStatusBarBackgroundDrawable();

    public abstract void setDrawerElevation(float f2);

    @Deprecated
    public abstract void setDrawerListener(C11890jV r1);

    public abstract void setDrawerLockMode(int i2);

    public abstract void setScrimColor(int i2);

    public abstract void setStatusBarBackground(int i2);

    public abstract void setStatusBarBackground(Drawable drawable);

    public abstract void setStatusBarBackgroundColor(int i2);
}

package android.support.v4.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;

public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {
    private static final int ID_HOME = 16908332;
    private static final ActionBarDrawerToggleImpl IMPL;
    private final Activity mActivity;
    private final int mCloseDrawerContentDescRes;
    private Drawable mDrawerImage;
    private final int mDrawerImageResource;
    private boolean mDrawerIndicatorEnabled = true;
    private final DrawerLayout mDrawerLayout;
    private final int mOpenDrawerContentDescRes;
    private Object mSetIndicatorInfo;
    private SlideDrawable mSlider;
    private Drawable mThemeImage;

    private interface ActionBarDrawerToggleImpl {
        Drawable getThemeUpIndicator(Activity activity);

        Object setActionBarDescription(Object obj, Activity activity, int i2);

        Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i2);
    }

    private static class ActionBarDrawerToggleImplBase implements ActionBarDrawerToggleImpl {
        private ActionBarDrawerToggleImplBase() {
        }

        public Drawable getThemeUpIndicator(Activity activity) {
            return null;
        }

        public Object setActionBarDescription(Object obj, Activity activity, int i2) {
            return obj;
        }

        public Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i2) {
            return obj;
        }
    }

    private static class ActionBarDrawerToggleImplHC implements ActionBarDrawerToggleImpl {
        private ActionBarDrawerToggleImplHC() {
        }

        public Drawable getThemeUpIndicator(Activity activity) {
            return ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(activity);
        }

        public Object setActionBarDescription(Object obj, Activity activity, int i2) {
            return ActionBarDrawerToggleHoneycomb.setActionBarDescription(obj, activity, i2);
        }

        public Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i2) {
            return ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(obj, activity, drawable, i2);
        }
    }

    private static class SlideDrawable extends Drawable implements Drawable.Callback {
        private float mOffset;
        private float mOffsetBy;
        private final Rect mTmpRect = new Rect();
        private Drawable mWrapped;

        public SlideDrawable(Drawable drawable) {
            this.mWrapped = drawable;
        }

        public void clearColorFilter() {
            this.mWrapped.clearColorFilter();
        }

        public void draw(Canvas canvas) {
            this.mWrapped.copyBounds(this.mTmpRect);
            canvas.save();
            canvas.translate(this.mOffsetBy * ((float) this.mTmpRect.width()) * (-this.mOffset), 0.0f);
            this.mWrapped.draw(canvas);
            canvas.restore();
        }

        public int getChangingConfigurations() {
            return this.mWrapped.getChangingConfigurations();
        }

        public Drawable.ConstantState getConstantState() {
            return super.getConstantState();
        }

        public Drawable getCurrent() {
            return this.mWrapped.getCurrent();
        }

        public int getIntrinsicHeight() {
            return this.mWrapped.getIntrinsicHeight();
        }

        public int getIntrinsicWidth() {
            return this.mWrapped.getIntrinsicWidth();
        }

        public int getMinimumHeight() {
            return this.mWrapped.getMinimumHeight();
        }

        public int getMinimumWidth() {
            return this.mWrapped.getMinimumWidth();
        }

        public float getOffset() {
            return this.mOffset;
        }

        public int getOpacity() {
            return this.mWrapped.getOpacity();
        }

        public boolean getPadding(Rect rect) {
            return this.mWrapped.getPadding(rect);
        }

        public int[] getState() {
            return this.mWrapped.getState();
        }

        public Region getTransparentRegion() {
            return this.mWrapped.getTransparentRegion();
        }

        public void invalidateDrawable(Drawable drawable) {
            if (drawable == this.mWrapped) {
                invalidateSelf();
            }
        }

        public boolean isStateful() {
            return this.mWrapped.isStateful();
        }

        /* access modifiers changed from: protected */
        public void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            this.mWrapped.setBounds(rect);
        }

        /* access modifiers changed from: protected */
        public boolean onStateChange(int[] iArr) {
            this.mWrapped.setState(iArr);
            return super.onStateChange(iArr);
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            if (drawable == this.mWrapped) {
                scheduleSelf(runnable, j2);
            }
        }

        public void setAlpha(int i2) {
            this.mWrapped.setAlpha(i2);
        }

        public void setChangingConfigurations(int i2) {
            this.mWrapped.setChangingConfigurations(i2);
        }

        public void setColorFilter(int i2, PorterDuff.Mode mode) {
            this.mWrapped.setColorFilter(i2, mode);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mWrapped.setColorFilter(colorFilter);
        }

        public void setDither(boolean z2) {
            this.mWrapped.setDither(z2);
        }

        public void setFilterBitmap(boolean z2) {
            this.mWrapped.setFilterBitmap(z2);
        }

        public void setOffset(float f2) {
            this.mOffset = f2;
            invalidateSelf();
        }

        public void setOffsetBy(float f2) {
            this.mOffsetBy = f2;
            invalidateSelf();
        }

        public boolean setState(int[] iArr) {
            return this.mWrapped.setState(iArr);
        }

        public boolean setVisible(boolean z2, boolean z3) {
            return super.setVisible(z2, z3);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            if (drawable == this.mWrapped) {
                unscheduleSelf(runnable);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            IMPL = new ActionBarDrawerToggleImplHC();
        } else {
            IMPL = new ActionBarDrawerToggleImplBase();
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, int i2, int i3, int i4) {
        this.mActivity = activity;
        this.mDrawerLayout = drawerLayout;
        this.mDrawerImageResource = i2;
        this.mOpenDrawerContentDescRes = i3;
        this.mCloseDrawerContentDescRes = i4;
        this.mThemeImage = IMPL.getThemeUpIndicator(activity);
        this.mDrawerImage = activity.getResources().getDrawable(i2);
        this.mSlider = new SlideDrawable(this.mDrawerImage);
        this.mSlider.setOffsetBy(0.33333334f);
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.mDrawerIndicatorEnabled;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mThemeImage = IMPL.getThemeUpIndicator(this.mActivity);
        this.mDrawerImage = this.mActivity.getResources().getDrawable(this.mDrawerImageResource);
        syncState();
    }

    public void onDrawerClosed(View view) {
        this.mSlider.setOffset(0.0f);
        if (this.mDrawerIndicatorEnabled) {
            this.mSetIndicatorInfo = IMPL.setActionBarDescription(this.mSetIndicatorInfo, this.mActivity, this.mCloseDrawerContentDescRes);
        }
    }

    public void onDrawerOpened(View view) {
        this.mSlider.setOffset(1.0f);
        if (this.mDrawerIndicatorEnabled) {
            this.mSetIndicatorInfo = IMPL.setActionBarDescription(this.mSetIndicatorInfo, this.mActivity, this.mOpenDrawerContentDescRes);
        }
    }

    public void onDrawerSlide(View view, float f2) {
        float offset = this.mSlider.getOffset();
        this.mSlider.setOffset(f2 > 0.5f ? Math.max(offset, Math.max(0.0f, f2 - 0.5f) * 2.0f) : Math.min(offset, f2 * 2.0f));
    }

    public void onDrawerStateChanged(int i2) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != ID_HOME || !this.mDrawerIndicatorEnabled) {
            return false;
        }
        if (this.mDrawerLayout.isDrawerVisible((int) GravityCompat.START)) {
            this.mDrawerLayout.closeDrawer((int) GravityCompat.START);
            return false;
        }
        this.mDrawerLayout.openDrawer((int) GravityCompat.START);
        return false;
    }

    public void setDrawerIndicatorEnabled(boolean z2) {
        if (z2 != this.mDrawerIndicatorEnabled) {
            if (z2) {
                this.mSetIndicatorInfo = IMPL.setActionBarUpIndicator(this.mSetIndicatorInfo, this.mActivity, this.mSlider, this.mDrawerLayout.isDrawerOpen((int) GravityCompat.START) ? this.mOpenDrawerContentDescRes : this.mCloseDrawerContentDescRes);
            } else {
                this.mSetIndicatorInfo = IMPL.setActionBarUpIndicator(this.mSetIndicatorInfo, this.mActivity, this.mThemeImage, 0);
            }
            this.mDrawerIndicatorEnabled = z2;
        }
    }

    public void syncState() {
        if (this.mDrawerLayout.isDrawerOpen((int) GravityCompat.START)) {
            this.mSlider.setOffset(1.0f);
        } else {
            this.mSlider.setOffset(0.0f);
        }
        if (this.mDrawerIndicatorEnabled) {
            this.mSetIndicatorInfo = IMPL.setActionBarUpIndicator(this.mSetIndicatorInfo, this.mActivity, this.mSlider, this.mDrawerLayout.isDrawerOpen((int) GravityCompat.START) ? this.mOpenDrawerContentDescRes : this.mCloseDrawerContentDescRes);
        }
    }
}

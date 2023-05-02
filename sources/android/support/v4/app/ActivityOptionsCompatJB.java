package android.support.v4.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

class ActivityOptionsCompatJB {
    private final ActivityOptions mActivityOptions;

    private ActivityOptionsCompatJB(ActivityOptions activityOptions) {
        this.mActivityOptions = activityOptions;
    }

    public static ActivityOptionsCompatJB makeCustomAnimation(Context context, int i2, int i3) {
        return new ActivityOptionsCompatJB(ActivityOptions.makeCustomAnimation(context, i2, i3));
    }

    public static ActivityOptionsCompatJB makeScaleUpAnimation(View view, int i2, int i3, int i4, int i5) {
        return new ActivityOptionsCompatJB(ActivityOptions.makeScaleUpAnimation(view, i2, i3, i4, i5));
    }

    public static ActivityOptionsCompatJB makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i2, int i3) {
        return new ActivityOptionsCompatJB(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i2, i3));
    }

    public Bundle toBundle() {
        return this.mActivityOptions.toBundle();
    }

    public void update(ActivityOptionsCompatJB activityOptionsCompatJB) {
        this.mActivityOptions.update(activityOptionsCompatJB.mActivityOptions);
    }
}

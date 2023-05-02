package android.support.v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

class TaskStackBuilderJellybean {
    TaskStackBuilderJellybean() {
    }

    public static PendingIntent getActivitiesPendingIntent(Context context, int i2, Intent[] intentArr, int i3, Bundle bundle) {
        return PendingIntent.getActivities(context, i2, intentArr, i3, bundle);
    }
}

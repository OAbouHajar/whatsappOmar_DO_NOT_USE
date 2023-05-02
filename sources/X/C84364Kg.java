package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Kg  reason: invalid class name and case insensitive filesystem */
public final class C84364Kg {
    public final Intent A00;
    public final Drawable A01;
    public final CharSequence A02;

    public C84364Kg(Intent intent, ActivityInfo activityInfo, Drawable drawable, CharSequence charSequence) {
        C18450wi.A0H(intent, 1);
        Intent intent2 = new Intent(intent);
        intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        this.A00 = intent2;
        this.A01 = drawable;
        this.A02 = charSequence;
    }
}

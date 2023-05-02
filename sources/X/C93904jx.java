package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.MenuItem;
import com.obwhatsapp.gallerypicker.GalleryPicker;

/* renamed from: X.4jx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C93904jx implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ ResolveInfo A01;
    public final /* synthetic */ GalleryPicker A02;

    public /* synthetic */ C93904jx(Intent intent, ResolveInfo resolveInfo, GalleryPicker galleryPicker) {
        this.A02 = galleryPicker;
        this.A00 = intent;
        this.A01 = resolveInfo;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        GalleryPicker galleryPicker = this.A02;
        Intent intent = this.A00;
        ActivityInfo activityInfo = this.A01.activityInfo;
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        galleryPicker.startActivityForResult(intent, 91);
        return false;
    }
}

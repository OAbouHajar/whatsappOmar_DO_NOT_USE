package X;

import com.facebook.redex.RunnableRunnableShape0S0101200_I0;
import com.obwhatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1YH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1YH implements C28691Xe {
    public final /* synthetic */ StorageUsageGalleryActivity A00;

    public /* synthetic */ AnonymousClass1YH(StorageUsageGalleryActivity storageUsageGalleryActivity) {
        this.A00 = storageUsageGalleryActivity;
    }

    public final void APX(int i2, long j2, long j3) {
        StorageUsageGalleryActivity storageUsageGalleryActivity = this.A00;
        Log.i("storage-usage-gallery-activity/message delete started");
        storageUsageGalleryActivity.A0h = new RunnableRunnableShape0S0101200_I0(storageUsageGalleryActivity, i2, 1, j2, j3);
        if (i2 > 0) {
            storageUsageGalleryActivity.A0k.postDelayed(storageUsageGalleryActivity.A0o, 800);
        }
    }
}

package X;

import com.obwhatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.obwhatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.4xv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101814xv implements AnonymousClass5PU {
    public final /* synthetic */ StorageUsageGalleryActivity A00;
    public final /* synthetic */ Collection A01;

    public /* synthetic */ C101814xv(StorageUsageGalleryActivity storageUsageGalleryActivity, Collection collection) {
        this.A00 = storageUsageGalleryActivity;
        this.A01 = collection;
    }

    public final void AQD(Collection collection) {
        StorageUsageGalleryActivity storageUsageGalleryActivity = this.A00;
        Collection collection2 = this.A01;
        Log.i("storage-usage-gallery-activity/load duplicate messages/loaded");
        storageUsageGalleryActivity.A35();
        AnonymousClass1YH r1 = new AnonymousClass1YH(storageUsageGalleryActivity);
        StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = new StorageUsageDeleteMessagesDialogFragment();
        storageUsageDeleteMessagesDialogFragment.A04 = collection2;
        storageUsageDeleteMessagesDialogFragment.A03 = collection;
        storageUsageDeleteMessagesDialogFragment.A01 = r1;
        C13680ns.A1J(storageUsageDeleteMessagesDialogFragment, storageUsageGalleryActivity);
    }
}

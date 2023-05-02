package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.obwhatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.31W  reason: invalid class name */
public final class AnonymousClass31W extends AnonymousClass1LN {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass31W(AnonymousClass1L9 r2) {
        super(r2);
        C18450wi.A0H(r2, 1);
    }

    public boolean A02(C14550pN r7, Map map) {
        if (!(r7 instanceof StorageUsageGalleryActivity)) {
            return super.A02(r7, map);
        }
        StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) r7;
        C86144Rj r2 = storageUsageGalleryActivity.A0H;
        if (r2 == null || r2.A04.isEmpty()) {
            Log.e("storageusagegallery/dialog/delete no messages");
            return true;
        }
        StringBuilder A0r = AnonymousClass000.A0r("storageusagegallery/dialog/delete/");
        A0r.append(r2.A04.size());
        C13680ns.A1V(A0r);
        storageUsageGalleryActivity.A35();
        storageUsageGalleryActivity.A07 = new AnonymousClass024();
        Collection values = storageUsageGalleryActivity.A0H.A04.values();
        storageUsageGalleryActivity.A0L = new AnonymousClass36C(storageUsageGalleryActivity.A07, new C101814xv(storageUsageGalleryActivity, values), storageUsageGalleryActivity.A0M, values);
        storageUsageGalleryActivity.A0i = new RunnableRunnableShape11S0200000_I0_9(storageUsageGalleryActivity, 8, values);
        Handler handler = storageUsageGalleryActivity.A0k;
        handler.postDelayed(storageUsageGalleryActivity.A0p, 800);
        handler.postDelayed(storageUsageGalleryActivity.A0i, 5000);
        C13680ns.A1U(storageUsageGalleryActivity.A0L, storageUsageGalleryActivity.A05);
        Log.i("storage-usage-gallery-activity/load duplicate messages");
        return true;
    }
}

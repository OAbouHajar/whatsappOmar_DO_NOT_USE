package com.facebook.redex;

import X.AnonymousClass05J;
import X.AnonymousClass2GQ;
import X.AnonymousClass4Y3;
import X.C16490t9;
import X.C55312jJ;
import X.C75573sN;
import X.C86144Rj;
import com.obwhatsapp.R;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.obwhatsapp.storage.StorageUsageDeleteCompleteDialogFragment;
import com.obwhatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;

public class RunnableRunnableShape0S0101200_I0 implements Runnable {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public final int A04;

    public RunnableRunnableShape0S0101200_I0(Object obj, int i2, int i3, long j2, long j3) {
        this.A04 = i3;
        this.A03 = obj;
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = j3;
    }

    public final void run() {
        if (this.A04 != 0) {
            StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A03;
            long j2 = this.A01;
            long j3 = this.A02;
            int i2 = this.A00;
            Log.i("storage-usage-gallery-activity/message delete completed");
            storageUsageGalleryActivity.Ac1();
            storageUsageGalleryActivity.A02 += j2;
            storageUsageGalleryActivity.A36();
            String str = storageUsageGalleryActivity.A0j;
            int i3 = storageUsageGalleryActivity.A00;
            C16490t9 r6 = storageUsageGalleryActivity.A0W;
            C75573sN r2 = new C75573sN();
            AnonymousClass4Y3.A01(r2, str, 6, i3);
            r2.A04 = Long.valueOf(j3);
            r2.A03 = Long.valueOf((long) i2);
            r6.A06(r2);
            C86144Rj r0 = storageUsageGalleryActivity.A0H;
            if (r0 != null) {
                r0.A04.clear();
            }
            AnonymousClass05J r02 = storageUsageGalleryActivity.A06;
            if (r02 != null) {
                r02.A05();
            }
            if (j3 > 0) {
                StorageUsageDeleteCompleteDialogFragment.A01(j3).A1G(storageUsageGalleryActivity.AGM(), (String) null);
            }
            storageUsageGalleryActivity.A0h = null;
            return;
        }
        int i4 = this.A00;
        long j4 = this.A01;
        long j5 = this.A02;
        RestoreFromBackupActivity restoreFromBackupActivity = ((C55312jJ) this.A03).A01;
        if (!restoreFromBackupActivity.A3V()) {
            restoreFromBackupActivity.A05.setIndeterminate(false);
            restoreFromBackupActivity.A05.setProgress(i4);
            restoreFromBackupActivity.A08.setText(restoreFromBackupActivity.getString(R.string.str1583, new Object[]{AnonymousClass2GQ.A03(restoreFromBackupActivity.A01, j4), AnonymousClass2GQ.A03(restoreFromBackupActivity.A01, j5), restoreFromBackupActivity.A01.A0L().format(((double) i4) / 100.0d)}));
            return;
        }
        Log.i("restore>RestoreFromBackupActivity/observer/activity exited during msgstore download progress");
    }
}

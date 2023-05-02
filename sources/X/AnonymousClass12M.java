package X;

import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.12M  reason: invalid class name */
public class AnonymousClass12M extends C16590tJ {
    public volatile int A00 = -1;
    public volatile int A01 = -1;

    public void A04() {
        Log.i("GoogleBackupRestoreObservable/backup cancelled");
        this.A00 = 0;
        for (AnonymousClass12R AND : A01()) {
            AND.AND();
        }
    }

    public void A05() {
        Log.i("restore>GoogleBackupRestoreObservable/notify-media-restore-cancelled");
        this.A01 = -1;
        for (AnonymousClass12R ATQ : A01()) {
            ATQ.ATQ();
        }
    }

    public void A06(int i2, Bundle bundle) {
        for (AnonymousClass12R AQh : A01()) {
            AQh.AQh(i2, bundle);
        }
    }

    public void A07(long j2, long j3) {
        for (AnonymousClass12R ANR : A01()) {
            ANR.ANR(j2, j3);
        }
    }

    public void A08(boolean z2) {
        StringBuilder sb = new StringBuilder("GoogleBackupRestoreObservable/backup-end/success: ");
        sb.append(z2);
        Log.i(sb.toString());
        this.A00 = 0;
        for (AnonymousClass12R ANE : A01()) {
            ANE.ANE(z2);
        }
    }

    public void A09(boolean z2) {
        for (AnonymousClass12R ATi : A01()) {
            ATi.ATi(z2);
        }
    }
}

package X;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.os.RemoteException;
import java.util.Arrays;

/* renamed from: X.0Io  reason: invalid class name and case insensitive filesystem */
public class C03450Io extends C06120Ui {
    public final NetworkStats.Bucket A00 = new NetworkStats.Bucket();
    public final NetworkStatsManager A01;

    public C03450Io(Context context) {
        this.A01 = (NetworkStatsManager) context.getSystemService(NetworkStatsManager.class);
    }

    public boolean A01() {
        return true;
    }

    public boolean A02(long[] jArr) {
        try {
            Arrays.fill(jArr, 0);
            A03(jArr, 0, 2);
            A03(jArr, 1, 0);
            return true;
        } catch (RemoteException | IllegalArgumentException | NullPointerException unused) {
            return false;
        }
    }

    public final void A03(long[] jArr, int i2, int i3) {
        NetworkStats querySummary = this.A01.querySummary(i2, (String) null, Long.MIN_VALUE, Long.MAX_VALUE);
        while (querySummary.hasNextBucket()) {
            NetworkStats.Bucket bucket = this.A00;
            querySummary.getNextBucket(bucket);
            int i4 = 4;
            if (bucket.getState() == 2) {
                i4 = 0;
            }
            int i5 = i3 | i4;
            jArr[i5] = jArr[i5] + bucket.getRxBytes();
            int i6 = i4 | i3 | 1;
            jArr[i6] = jArr[i6] + bucket.getTxBytes();
        }
        querySummary.close();
    }
}

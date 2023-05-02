package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedList;

/* renamed from: X.27s  reason: invalid class name and case insensitive filesystem */
public class C452627s {
    public static final int[] A01 = {0, 0, 0, 2000, 5000, SearchActionVerificationClientService.NOTIFICATION_ID, 20000, 40000, 80000, 160000};
    public LinkedList A00;

    public C452627s() {
        synchronized (this) {
            this.A00 = new LinkedList();
        }
    }

    public synchronized long A00() {
        LinkedList linkedList = this.A00;
        int size = linkedList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) linkedList.get(size)).longValue();
            int[] iArr = A01;
            long j2 = (long) iArr[Math.min(size + 1, iArr.length - 1)];
            if (j2 > elapsedRealtime) {
                if (size > 0) {
                    return (((Long) linkedList.get(size)).longValue() + j2) - SystemClock.elapsedRealtime();
                }
            }
        }
        return 0;
    }
}

package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Process;
import com.facebook.redex.IDxBReceiverShape5S0100000_I1;

/* renamed from: X.0Iq  reason: invalid class name and case insensitive filesystem */
public class C03470Iq extends C06120Ui {
    public static final int A05 = Process.myUid();
    public int A00;
    public BroadcastReceiver A01 = new IDxBReceiverShape5S0100000_I1(this, 2);
    public boolean A02 = true;
    public final ConnectivityManager A03;
    public final long[] A04 = new long[8];

    public C03470Iq(Context context) {
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.A03 = connectivityManager;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        this.A00 = activeNetworkInfo == null ? -1 : activeNetworkInfo.getType();
        context.registerReceiver(this.A01, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        A03();
    }

    public boolean A01() {
        return false;
    }

    public synchronized boolean A02(long[] jArr) {
        if (!this.A02) {
            return false;
        }
        A03();
        System.arraycopy(this.A04, 0, jArr, 0, jArr.length);
        return true;
    }

    public synchronized void A03() {
        int i2 = A05;
        long uidTxBytes = TrafficStats.getUidTxBytes(i2);
        long uidRxBytes = TrafficStats.getUidRxBytes(i2);
        if (uidRxBytes == -1 || uidTxBytes == -1) {
            this.A02 = false;
        } else {
            char c2 = 2;
            if (this.A00 == 1) {
                c2 = 0;
            }
            long[] jArr = this.A04;
            long j2 = jArr[3] + jArr[1];
            long j3 = jArr[2] + jArr[0];
            char c3 = c2 | 1;
            jArr[c3] = jArr[c3] + (uidTxBytes - j2);
            char c4 = 0 | c2;
            jArr[c4] = jArr[c4] + (uidRxBytes - j3);
        }
    }
}

package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.0t3  reason: invalid class name and case insensitive filesystem */
public class C16440t3 {
    public final C16290sm A00;
    public volatile long A01;
    public volatile long A02;
    public volatile long A03;

    public C16440t3(C16290sm r10) {
        this.A00 = r10;
        SharedPreferences sharedPreferences = r10.A00;
        this.A02 = sharedPreferences.getLong("client_server_time_diff", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = sharedPreferences.getLong("last_ntp_client_time", 0);
        if (sharedPreferences.contains("client_ntp_time_diff") && j2 > 0 && Math.abs(currentTimeMillis - j2) < 86400000) {
            A03(sharedPreferences.getLong("client_ntp_time_diff", 0));
        }
    }

    public long A00() {
        long j2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A01 != 0) {
            j2 = this.A01;
        } else if (this.A03 == 0) {
            return System.currentTimeMillis() - this.A02;
        } else {
            j2 = this.A03;
        }
        return j2 + elapsedRealtime;
    }

    public long A01() {
        return this.A03 != 0 ? this.A03 + SystemClock.elapsedRealtime() : System.currentTimeMillis() - this.A02;
    }

    public long A02(long j2) {
        long currentTimeMillis;
        long j3;
        long currentTimeMillis2 = j2 + System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A01 != 0) {
            j3 = this.A01;
        } else if (this.A03 != 0) {
            j3 = this.A03;
        } else {
            currentTimeMillis = System.currentTimeMillis() - this.A02;
            return currentTimeMillis2 - currentTimeMillis;
        }
        currentTimeMillis = j3 + elapsedRealtime;
        return currentTimeMillis2 - currentTimeMillis;
    }

    public final void A03(long j2) {
        System.currentTimeMillis();
        A00();
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis + j2;
        this.A01 = j3 - SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder("app/time ntp update processed; diffClientNtp:");
        sb.append(j2);
        sb.append(" device time: ");
        sb.append(currentTimeMillis);
        sb.append(" ntp time: ");
        sb.append(j3);
        Log.i(sb.toString());
        System.currentTimeMillis();
        A00();
    }

    public void A04(long j2, long j3) {
        System.currentTimeMillis();
        A00();
        if (j2 > 0) {
            this.A03 = j2 - SystemClock.elapsedRealtime();
            this.A02 = j3 - j2;
            StringBuilder sb = new StringBuilder("app/time server update processed; diffClientWaServer:");
            sb.append(this.A02);
            sb.append(" device time: ");
            sb.append(j3);
            sb.append(" server time: ");
            sb.append(j2);
            Log.i(sb.toString());
            C16290sm r0 = this.A00;
            r0.A00.edit().putLong("client_server_time_diff", this.A02).apply();
        }
        System.currentTimeMillis();
        A00();
    }
}

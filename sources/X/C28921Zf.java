package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1Zf  reason: invalid class name and case insensitive filesystem */
public class C28921Zf {
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;
    public final boolean A04;

    public C28921Zf(String str) {
        this(false);
        A04(str);
    }

    public C28921Zf(boolean z2) {
        this.A04 = z2;
    }

    public long A00() {
        StringBuilder sb;
        String str;
        long j2 = this.A00;
        long j3 = this.A01;
        long j4 = 0;
        if (j3 != 0) {
            j4 = (this.A04 ? SystemClock.elapsedRealtime() : SystemClock.uptimeMillis()) - j3;
        }
        long j5 = j2 + j4;
        if (this.A03) {
            String str2 = this.A02;
            if (str2 != null) {
                sb.append(str2);
                str = "/timer/elapsed: ";
            } else {
                sb = new StringBuilder();
                str = "timer/elapsed: ";
            }
            sb.append(str);
            sb.append(j5);
            Log.i(sb.toString());
        }
        return j5;
    }

    public long A01() {
        StringBuilder sb;
        String str;
        long j2 = this.A01;
        if (j2 != 0) {
            long elapsedRealtime = this.A00 + ((this.A04 ? SystemClock.elapsedRealtime() : SystemClock.uptimeMillis()) - j2);
            this.A00 = elapsedRealtime;
            if (this.A03) {
                String str2 = this.A02;
                if (str2 != null) {
                    sb.append(str2);
                    str = "/timer/stop: ";
                } else {
                    sb = new StringBuilder();
                    str = "timer/stop: ";
                }
                sb.append(str);
                sb.append(elapsedRealtime);
                Log.i(sb.toString());
            }
            this.A01 = 0;
        }
        return this.A00;
    }

    public long A02(String str) {
        long j2 = this.A00;
        long j3 = this.A01;
        long j4 = 0;
        if (j3 != 0) {
            j4 = (this.A04 ? SystemClock.elapsedRealtime() : SystemClock.uptimeMillis()) - j3;
        }
        long j5 = j2 + j4;
        if (this.A03) {
            StringBuilder sb = new StringBuilder("timer/mark/");
            sb.append(str);
            sb.append(": ");
            sb.append(j5);
            String obj = sb.toString();
            String str2 = this.A02;
            if (str2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("/");
                sb2.append(obj);
                obj = sb2.toString();
            }
            Log.i(obj);
        }
        return j5;
    }

    public void A03() {
        if (this.A01 == 0) {
            this.A01 = this.A04 ? SystemClock.elapsedRealtime() : SystemClock.uptimeMillis();
        }
    }

    public void A04(String str) {
        this.A02 = str;
        this.A03 = true;
        A03();
    }
}

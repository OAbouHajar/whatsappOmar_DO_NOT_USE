package X;

import android.os.Build;
import android.os.Debug;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.4Wi  reason: invalid class name and case insensitive filesystem */
public class C87334Wi {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public final MultiBufferLogger A0A;

    public C87334Wi(MultiBufferLogger multiBufferLogger) {
        this.A0A = multiBufferLogger;
    }

    public void A00() {
        long globalAllocCount = (long) Debug.getGlobalAllocCount();
        A01(9240593, globalAllocCount, this.A00);
        this.A00 = globalAllocCount;
        long globalAllocSize = (long) Debug.getGlobalAllocSize();
        A01(9240594, globalAllocSize, this.A01);
        this.A01 = globalAllocSize;
        if (Build.VERSION.SDK_INT >= 23) {
            String runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
            if (runtimeStat != null) {
                long parseLong = Long.parseLong(runtimeStat);
                A01(9240595, parseLong, this.A04);
                this.A04 = parseLong;
            }
            String runtimeStat2 = Debug.getRuntimeStat("art.gc.gc-time");
            if (runtimeStat2 != null) {
                long parseLong2 = Long.parseLong(runtimeStat2);
                A01(9240665, parseLong2, this.A05);
                this.A05 = parseLong2;
            }
            String runtimeStat3 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
            if (runtimeStat3 != null) {
                long parseLong3 = Long.parseLong(runtimeStat3);
                A01(9240664, parseLong3, this.A02);
                this.A02 = parseLong3;
            }
            String runtimeStat4 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
            if (runtimeStat4 != null) {
                long parseLong4 = Long.parseLong(runtimeStat4);
                A01(9240666, parseLong4, this.A03);
                this.A03 = parseLong4;
            }
        }
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long j2 = runtime.totalMemory();
        long freeMemory = j2 - runtime.freeMemory();
        long j3 = maxMemory - freeMemory;
        A02(9240636, freeMemory, this.A09);
        A02(9240634, j3, this.A06);
        A02(9240635, maxMemory, this.A07);
        A02(9240637, j2, this.A08);
        this.A07 = maxMemory;
        this.A08 = j2;
        this.A09 = freeMemory;
        this.A06 = j3;
    }

    public final void A01(int i2, long j2, long j3) {
        long j4 = j2;
        if (j2 > j3) {
            this.A0A.writeStandardEntry(6, 44, 0, 0, i2, 0, j4);
        }
    }

    public final void A02(int i2, long j2, long j3) {
        long j4 = j2;
        if (j2 != j3) {
            this.A0A.writeStandardEntry(6, 44, 0, 0, i2, 0, j4);
        }
    }
}

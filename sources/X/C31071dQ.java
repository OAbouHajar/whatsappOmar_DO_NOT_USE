package X;

import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1dQ  reason: invalid class name and case insensitive filesystem */
public class C31071dQ implements C31051dO {
    public final C16440t3 A00;
    public final C225518j A01;

    public C31071dQ(C16440t3 r1, C225518j r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String ADD() {
        return "cpu_stats";
    }

    public boolean AJc() {
        return false;
    }

    public void AQM(C30191bu r9) {
        r9.A02(Integer.valueOf(Process.getThreadPriority(Process.myTid())), "cpu_stats", "stop_pri");
        ConcurrentHashMap concurrentHashMap = r9.A0A;
        Serializable serializable = (Serializable) concurrentHashMap.get(new Pair("cpu_stats", "start_ps_cpu_ms"));
        if (serializable != null) {
            try {
                r9.A02(Long.valueOf(Process.getElapsedCpuTime() - ((Number) serializable).longValue()), "cpu_stats", "ps_cpu_ms");
            } catch (RuntimeException unused) {
                Log.e("QPL: CpuMetadataProvider/onEnd processCpuTimeMsStart is not a number");
            }
            concurrentHashMap.remove(new Pair("cpu_stats", "start_ps_cpu_ms"));
        }
        Serializable serializable2 = (Serializable) concurrentHashMap.get(new Pair("cpu_stats", "start_th_cpu_ms"));
        if (serializable2 != null) {
            try {
                r9.A02(Long.valueOf(SystemClock.currentThreadTimeMillis() - ((Number) serializable2).longValue()), "cpu_stats", "th_cpu_ms");
            } catch (RuntimeException unused2) {
                Log.e("QPL: CpuMetadataProvider/onEnd threadCpuTimeMsStart is not a number");
            }
            concurrentHashMap.remove(new Pair("cpu_stats", "start_th_cpu_ms"));
        }
    }

    public void AXS(C30191bu r4) {
        r4.A02(Integer.valueOf(Process.getThreadPriority(Process.myTid())), "cpu_stats", "start_pri");
        r4.A02(Long.valueOf(Process.getElapsedCpuTime()), "cpu_stats", "start_ps_cpu_ms");
        r4.A02(Long.valueOf(SystemClock.currentThreadTimeMillis()), "cpu_stats", "start_th_cpu_ms");
    }
}

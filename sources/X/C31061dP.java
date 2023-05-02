package X;

import android.app.ActivityManager;
import android.util.Pair;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.Serializable;

/* renamed from: X.1dP  reason: invalid class name and case insensitive filesystem */
public class C31061dP implements C31051dO {
    public final AnonymousClass01V A00;
    public final C225618k A01;

    public C31061dP(AnonymousClass01V r1, C225618k r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final String ADD() {
        return "memory_stats";
    }

    public boolean AJc() {
        return true;
    }

    public void AQM(C30191bu r9) {
        ActivityManager A03 = this.A00.A03();
        if (A03 != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            A03.getMemoryInfo(memoryInfo);
            r9.A02(Long.valueOf((memoryInfo.availMem / SearchActionVerificationClientService.MS_TO_NS) * SearchActionVerificationClientService.MS_TO_NS), "memory_stats", "avail_mem");
            r9.A02(Long.valueOf((memoryInfo.threshold / SearchActionVerificationClientService.MS_TO_NS) * SearchActionVerificationClientService.MS_TO_NS), "memory_stats", "low_mem");
            r9.A02(Long.valueOf((memoryInfo.totalMem / SearchActionVerificationClientService.MS_TO_NS) * SearchActionVerificationClientService.MS_TO_NS), "memory_stats", "total_mem");
            long j2 = (memoryInfo.availMem / SearchActionVerificationClientService.MS_TO_NS) * SearchActionVerificationClientService.MS_TO_NS;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("avail_mem");
                sb.append("_at_start");
                Long l2 = (Long) ((Serializable) r9.A0A.get(new Pair("memory_stats", sb.toString())));
                if (l2 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("avail_mem");
                    sb2.append("_delta");
                    r9.A02(Long.valueOf(j2 - l2.longValue()), "memory_stats", sb2.toString());
                }
            } catch (RuntimeException unused) {
            }
        }
        Runtime runtime = this.A01.A00;
        long freeMemory = ((runtime.totalMemory() - runtime.freeMemory()) / SearchActionVerificationClientService.MS_TO_NS) * SearchActionVerificationClientService.MS_TO_NS;
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("java_heap");
            sb3.append("_at_start");
            Long l3 = (Long) ((Serializable) r9.A0A.get(new Pair("memory_stats", sb3.toString())));
            if (l3 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("java_heap");
                sb4.append("_delta");
                r9.A02(Long.valueOf(freeMemory - l3.longValue()), "memory_stats", sb4.toString());
            }
        } catch (RuntimeException unused2) {
        }
    }

    public void AXS(C30191bu r6) {
        ActivityManager A03 = this.A00.A03();
        if (A03 != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            A03.getMemoryInfo(memoryInfo);
            long j2 = (memoryInfo.availMem / SearchActionVerificationClientService.MS_TO_NS) * SearchActionVerificationClientService.MS_TO_NS;
            StringBuilder sb = new StringBuilder();
            sb.append("avail_mem");
            sb.append("_at_start");
            r6.A02(Long.valueOf(j2), "memory_stats", sb.toString());
        }
        Runtime runtime = this.A01.A00;
        long freeMemory = ((runtime.totalMemory() - runtime.freeMemory()) / SearchActionVerificationClientService.MS_TO_NS) * SearchActionVerificationClientService.MS_TO_NS;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("java_heap");
        sb2.append("_at_start");
        r6.A02(Long.valueOf(freeMemory), "memory_stats", sb2.toString());
    }
}

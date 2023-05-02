package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1kM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C34491kM implements AnonymousClass1WE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C34491kM(String str, int i2) {
        this.A01 = str;
        this.A00 = i2;
    }

    public final void accept(Object obj) {
        String str = this.A01;
        int i2 = this.A00;
        AnonymousClass1S5 r10 = (AnonymousClass1S5) obj;
        ConcurrentHashMap concurrentHashMap = r10.A03;
        if (!concurrentHashMap.containsKey(str)) {
            AnonymousClass4OG r2 = new AnonymousClass4OG();
            r2.A00 = i2;
            r2.A04 = SystemClock.uptimeMillis();
            concurrentHashMap.put(str, r2);
            C31081dR r22 = r10.A02;
            int hashCode = str.hashCode();
            r22.A04(hashCode, "IqMessagePerfLoggerInterceptor", true);
            r22.A07.AKo("iq_type", r22.A06.A05, hashCode, (long) i2);
            r22.A02(hashCode, "iq_queue");
            return;
        }
        StringBuilder sb = new StringBuilder("IqMessagePerfLoggingInterceptor/onIqMessageQueued already exists iqId:");
        sb.append(str);
        Log.e(sb.toString());
    }
}

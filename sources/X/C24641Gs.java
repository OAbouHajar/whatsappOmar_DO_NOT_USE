package X;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;

/* renamed from: X.1Gs  reason: invalid class name and case insensitive filesystem */
public class C24641Gs {
    public long A00;
    public final AnonymousClass01V A01;
    public final C16440t3 A02;

    public C24641Gs(AnonymousClass01V r1, C16440t3 r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public Long A00() {
        ActivityManager A03;
        if (SystemClock.uptimeMillis() - this.A00 > 300000 && (A03 = this.A01.A03()) != null) {
            Debug.MemoryInfo[] processMemoryInfo = A03.getProcessMemoryInfo(new int[]{Process.myPid()});
            this.A00 = SystemClock.uptimeMillis();
            if (processMemoryInfo != null && processMemoryInfo.length > 0) {
                return Long.valueOf((long) processMemoryInfo[0].getTotalPrivateDirty());
            }
        }
        return null;
    }
}

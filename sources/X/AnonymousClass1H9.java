package X;

import android.app.ActivityManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.DeadObjectException;
import android.os.Debug;
import com.whatsapp.util.Log;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1H9  reason: invalid class name */
public class AnonymousClass1H9 {
    public final AnonymousClass01V A00;

    public AnonymousClass1H9(AnonymousClass01V r1) {
        this.A00 = r1;
    }

    public void A00() {
        NetworkInfo[] networkInfoArr;
        ConnectivityManager A0H = this.A00.A0H();
        if (A0H == null) {
            Log.w("app/log-network-info cm=null");
            return;
        }
        try {
            networkInfoArr = A0H.getAllNetworkInfo();
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof DeadObjectException) {
                networkInfoArr = null;
            } else {
                throw e2;
            }
        }
        StringBuilder sb = new StringBuilder("network/info");
        if (networkInfoArr != null) {
            boolean z2 = false;
            for (NetworkInfo networkInfo : networkInfoArr) {
                if (networkInfo.getState() != NetworkInfo.State.UNKNOWN) {
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    sb.append(networkInfo.toString());
                    sb.append(", type: ");
                    sb.append(networkInfo.getType());
                    sb.append(", subtype: ");
                    sb.append(networkInfo.getSubtype());
                    z2 = true;
                }
            }
            Log.i(z2 ? sb.toString() : "app/log-network-info/all_network_states_unknown");
            return;
        }
        Log.e("app/log-network-info/unavailable");
    }

    public void A01() {
        AnonymousClass00B.A00();
        AnonymousClass01V r17 = this.A00;
        ActivityManager A03 = r17.A03();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (A03 == null) {
            Log.w("device/memory am=null");
        } else {
            A03.getMemoryInfo(memoryInfo);
            StringBuilder sb = new StringBuilder("device/memory/system/available ");
            sb.append(memoryInfo.availMem / FileUtils.ONE_KB);
            sb.append(" kiB (");
            sb.append(memoryInfo.threshold / FileUtils.ONE_KB);
            sb.append(" kiB) lowMemory=");
            sb.append(memoryInfo.lowMemory);
            Log.i(sb.toString());
        }
        long freeMemory = Runtime.getRuntime().freeMemory();
        long j2 = Runtime.getRuntime().totalMemory();
        long nativeHeapFreeSize = Debug.getNativeHeapFreeSize();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        long j3 = AnonymousClass01S.A00;
        StringBuilder sb2 = new StringBuilder("device/memory/max ");
        sb2.append(j3 / FileUtils.ONE_KB);
        sb2.append(" kiB (~");
        sb2.append(C29601at.A00(r17));
        sb2.append(" memory class)");
        Log.i(sb2.toString());
        StringBuilder sb3 = new StringBuilder("device/memory/native/size ");
        sb3.append((nativeHeapFreeSize + nativeHeapAllocatedSize) / FileUtils.ONE_KB);
        sb3.append(" kiB/allocated ");
        sb3.append(nativeHeapAllocatedSize / FileUtils.ONE_KB);
        sb3.append(" kiB/free ");
        sb3.append(nativeHeapFreeSize / FileUtils.ONE_KB);
        sb3.append(" kiB");
        Log.i(sb3.toString());
        StringBuilder sb4 = new StringBuilder("device/memory/dalvik/size ");
        sb4.append(j2 / FileUtils.ONE_KB);
        sb4.append(" kiB/allocated ");
        sb4.append((j2 - freeMemory) / FileUtils.ONE_KB);
        sb4.append(" kiB/free ");
        sb4.append(freeMemory / FileUtils.ONE_KB);
        sb4.append(" kiB");
        Log.i(sb4.toString());
    }
}

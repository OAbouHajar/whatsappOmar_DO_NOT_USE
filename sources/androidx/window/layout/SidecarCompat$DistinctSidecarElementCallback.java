package androidx.window.layout;

import X.AnonymousClass0X3;
import X.C18450wi;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

public final class SidecarCompat$DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState A00;
    public final AnonymousClass0X3 A01;
    public final SidecarInterface.SidecarCallback A02;
    public final WeakHashMap A03 = new WeakHashMap();
    public final ReentrantLock A04 = new ReentrantLock();

    public SidecarCompat$DistinctSidecarElementCallback(AnonymousClass0X3 r2, SidecarInterface.SidecarCallback sidecarCallback) {
        this.A01 = r2;
        this.A02 = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        C18450wi.A0H(sidecarDeviceState, 0);
        ReentrantLock reentrantLock = this.A04;
        reentrantLock.lock();
        try {
            if (!AnonymousClass0X3.A01(this.A00, sidecarDeviceState)) {
                this.A00 = sidecarDeviceState;
                this.A02.onDeviceStateChanged(sidecarDeviceState);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C18450wi.A0H(iBinder, 0);
        C18450wi.A0H(sidecarWindowLayoutInfo, 1);
        synchronized (this.A04) {
            WeakHashMap weakHashMap = this.A03;
            if (!this.A01.A06((SidecarWindowLayoutInfo) weakHashMap.get(iBinder), sidecarWindowLayoutInfo)) {
                weakHashMap.put(iBinder, sidecarWindowLayoutInfo);
                this.A02.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }
}

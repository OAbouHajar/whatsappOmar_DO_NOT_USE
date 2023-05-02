package X;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.21j  reason: invalid class name and case insensitive filesystem */
public class C437521j implements C15650rc, C15670re {
    public final /* synthetic */ AnonymousClass16R A00;

    public C437521j(AnonymousClass16R r1) {
        this.A00 = r1;
    }

    public void onConnected(Bundle bundle) {
        AnonymousClass16R r6 = this.A00;
        if (r6.A07.A05()) {
            Map map = r6.A02;
            AnonymousClass00B.A06(map);
            for (C436921c r4 : map.values()) {
                LocationRequest A002 = AnonymousClass16R.A00(r4);
                try {
                    C437121f r2 = r6.A01;
                    C13710nw.A02(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                    r2.A03(new C438421t(r2, r4, A002));
                } catch (SecurityException e2) {
                    Log.w("FusedLocationManager/GmsConnectionCallbacks/onConnected/unable to request location updates", e2);
                }
            }
            if (r6.A02.isEmpty()) {
                C437121f r0 = r6.A01;
                AnonymousClass00B.A06(r0);
                r0.A04();
            }
        }
    }

    public void onConnectionFailed(C15700rh r1) {
    }

    public void onConnectionSuspended(int i2) {
    }
}

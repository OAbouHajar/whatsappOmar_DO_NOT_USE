package X;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.16R  reason: invalid class name */
public class AnonymousClass16R {
    public LocationManager A00;
    public C437121f A01;
    public Map A02;
    public final C16570tH A03;
    public final C16300so A04;
    public final AnonymousClass01V A05;
    public final C16980tz A06;
    public final C16260sj A07;
    public volatile boolean A08;

    public AnonymousClass16R(C16570tH r1, C16300so r2, AnonymousClass01V r3, C16980tz r4, C16260sj r5) {
        this.A06 = r4;
        this.A04 = r2;
        this.A07 = r5;
        this.A05 = r3;
        this.A03 = r1;
    }

    public static LocationRequest A00(C436921c r7) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.A08 = true;
        int i2 = r7.A01;
        int i3 = 100;
        if ((i2 & 1) == 0) {
            i3 = 105;
            if ((i2 & 2) != 0) {
                i3 = 102;
            }
        }
        locationRequest.A01 = i3;
        long j2 = r7.A03;
        LocationRequest.A03(j2);
        locationRequest.A03 = j2;
        if (!locationRequest.A07) {
            locationRequest.A04 = (long) (((double) j2) / 6.0d);
        }
        long j3 = r7.A02;
        LocationRequest.A03(j3);
        locationRequest.A07 = true;
        locationRequest.A04 = j3;
        float f2 = r7.A00;
        if (f2 >= 0.0f) {
            locationRequest.A00 = f2;
            return locationRequest;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("invalid displacement: ");
        sb.append(f2);
        throw new IllegalArgumentException(sb.toString());
    }

    public Location A01(String str) {
        A03();
        Location A022 = A02(str, 1);
        Location A023 = A02(str, 2);
        if (A022 == null || (A023 != null && A022.getTime() <= A023.getTime() - 20000)) {
            A022 = A023;
            if (A023 == null) {
                return A022;
            }
        }
        if (A022.getTime() + 7200000 < System.currentTimeMillis()) {
            return null;
        }
        return A022;
    }

    public Location A02(String str, int i2) {
        LocationManager locationManager;
        String str2;
        C16260sj r3 = this.A07;
        if (r3.A05()) {
            StringBuilder sb = new StringBuilder("FusedLocationManager/getLocation:");
            sb.append(str);
            Log.i(sb.toString());
            A03();
            A06(str);
            C437121f r0 = this.A01;
            if (r0 != null && r0.A06()) {
                return C437221g.A03.AD3(this.A01);
            }
            if (this.A00 != null) {
                if (i2 == 1) {
                    if (r3.A03("android.permission.ACCESS_FINE_LOCATION") == 0) {
                        locationManager = this.A00;
                        str2 = "gps";
                    }
                } else if (r3.A03("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    locationManager = this.A00;
                    str2 = "network";
                }
                return locationManager.getLastKnownLocation(str2);
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("FusedLocationManager/getLastKnownLocation/do not have location permissions context:");
        sb2.append(str);
        Log.w(sb2.toString());
        return null;
    }

    public synchronized void A03() {
        if (this.A00 == null) {
            Context context = this.A06.A00;
            C437121f r0 = null;
            if (C437421i.A01(context)) {
                C437521j r2 = new C437521j(this);
                this.A02 = new HashMap();
                C437621k r1 = new C437621k(context);
                r1.A01(C437221g.A02);
                r1.A06.add(r2);
                r1.A07.add(r2);
                r0 = r1.A00();
            } else {
                this.A02 = null;
            }
            this.A01 = r0;
            this.A00 = this.A05.A0F();
        }
    }

    public void A04(LocationListener locationListener) {
        A03();
        if (this.A01 != null) {
            C436921c r2 = (C436921c) this.A02.remove(locationListener);
            if (r2 != null) {
                if (this.A01.A06()) {
                    C437121f r1 = this.A01;
                    r1.A03(new C437821m(r1, r2));
                }
                if (this.A02.isEmpty()) {
                    this.A01.A04();
                }
            }
        } else if (this.A00 != null && this.A07.A05()) {
            this.A00.removeUpdates(locationListener);
        }
    }

    public void A05(LocationListener locationListener, String str, float f2, int i2, long j2, long j3) {
        C16260sj r3 = this.A07;
        if (r3.A05()) {
            A03();
            A06(str);
            LocationListener locationListener2 = locationListener;
            float f3 = f2;
            int i3 = i2;
            long j4 = j2;
            if (this.A01 != null) {
                if (this.A02.isEmpty()) {
                    this.A01.A08();
                }
                C436921c r4 = new C436921c(locationListener2, f3, i3, j4, j3);
                this.A02.put(locationListener2, r4);
                if (this.A01.A06()) {
                    LocationRequest A002 = A00(r4);
                    C437121f r2 = this.A01;
                    C13710nw.A02(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                    r2.A03(new C438421t(r2, r4, A002));
                    return;
                }
                return;
            }
            if ((i2 & 1) != 0) {
                try {
                    if (this.A00 == null || r3.A03("android.permission.ACCESS_FINE_LOCATION") != 0) {
                        Log.w("FusedLocationManager/requestLocationUpdates/do not have fine location permission");
                    } else {
                        this.A00.requestLocationUpdates("gps", j4, f3, locationListener2);
                    }
                } catch (RuntimeException e2) {
                    Log.e("FusedLocationManager/requestLocationUpdates", e2);
                }
            }
            if ((i2 & 2) != 0) {
                try {
                    if (this.A00 == null || r3.A03("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                        Log.w("FusedLocationManager/requestLocationUpdates/do not have coarse location permission");
                    } else {
                        this.A00.requestLocationUpdates("network", j4, f3, locationListener2);
                    }
                } catch (RuntimeException e3) {
                    Log.e("FusedLocationManager/requestLocationUpdates", e3);
                }
            }
        }
    }

    public final void A06(String str) {
        if (Build.VERSION.SDK_INT == 29 && !this.A03.A00 && !this.A08 && !"group-chat-live-location-ui-oncreate".equals(str)) {
            this.A04.AcB("FusedLocationManager/logIfLocationAccessedInBackground", "background-location", true);
        }
    }

    public boolean A07() {
        A03();
        LocationManager locationManager = this.A00;
        if (locationManager != null) {
            return locationManager.isProviderEnabled("gps") || this.A00.isProviderEnabled("network");
        }
        return false;
    }
}

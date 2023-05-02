package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.view.Display;
import android.view.MotionEvent;
import com.facebook.redex.IDxEListenerShape385S0100000_1_I0;
import com.facebook.redex.IDxRCallbackShape330S0100000_2_I0;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.2jz  reason: invalid class name and case insensitive filesystem */
public abstract class C55582jz extends C55592k0 {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = 2;
    public long A04;
    public SensorManager A05 = this.A09.A0D();
    public Location A06;
    public Display A07 = this.A09.A0O().getDefaultDisplay();
    public AnonymousClass2NT A08;
    public AnonymousClass01V A09;
    public boolean A0A;
    public boolean A0B;
    public final SensorEventListener A0C = new IDxEListenerShape385S0100000_1_I0(this, 1);
    public final AnonymousClass5RJ A0D = new C98584se(this);
    public final float[] A0E = new float[3];
    public final float[] A0F = new float[16];
    public final float[] A0G = new float[3];

    public C55582jz(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        A06(new IDxRCallbackShape330S0100000_2_I0(this, 1));
    }

    public static LatLng A00(LatLng latLng, double d2) {
        double d3 = 50.0d / 6378137.0d;
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(latLng.A00);
        double radians3 = Math.toRadians(latLng.A01);
        double cos = Math.cos(d3);
        double sin = Math.sin(d3);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (Math.cos(radians) * cos2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }

    public AnonymousClass2NT A07(AnonymousClass5OF r2) {
        AnonymousClass00B.A01();
        AnonymousClass2NT r0 = this.A08;
        if (r0 != null) {
            r2.ATK(r0);
            return this.A08;
        }
        A06(r2);
        return null;
    }

    public void A08() {
        SensorManager sensorManager = this.A05;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            boolean z2 = false;
            if (defaultSensor != null) {
                z2 = true;
            }
            this.A0B = z2;
            if (defaultSensor != null) {
                sensorManager.registerListener(this.A0C, defaultSensor, 1);
            }
        }
    }

    public void A09() {
        int i2 = this.A03;
        if (i2 != 0) {
            if (i2 == 1) {
                setLocationMode(0);
                return;
            } else if (i2 != 2) {
                return;
            }
        }
        setLocationMode(1);
    }

    public abstract void A0A(int i2);

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A03 != 2) {
            this.A03 = 2;
            A0A(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLocationMode() {
        return this.A03;
    }

    public void setLocationMode(int i2) {
        LatLng latLng;
        int i3;
        AnonymousClass2NT r3 = this.A08;
        if (r3 != null) {
            CameraPosition A022 = r3.A02();
            if (i2 != 0) {
                if (i2 == 1) {
                    Location location = this.A06;
                    if (location != null) {
                        latLng = new LatLng(location.getLatitude(), this.A06.getLongitude());
                        this.A03 = 1;
                        i3 = 1;
                    } else {
                        latLng = A022.A03;
                        this.A03 = 2;
                        i3 = 2;
                    }
                    A0A(i3);
                    C13710nw.A02(latLng, "location must not be null.");
                    r3.A09(AnonymousClass2R8.A00(new CameraPosition(latLng, A022.A02, 0.0f, 0.0f)));
                    return;
                } else if (i2 == 2) {
                    this.A03 = 2;
                    A0A(2);
                    return;
                } else {
                    return;
                }
            } else if (this.A0B) {
                this.A01 = A022.A02;
                i2 = 0;
                A0A(0);
                Location location2 = this.A06;
                LatLng latLng2 = location2 != null ? new LatLng(location2.getLatitude(), this.A06.getLongitude()) : A022.A03;
                float f2 = this.A00;
                LatLng A002 = A00(latLng2, (double) f2);
                float max = Math.max(Math.min(this.A02, 67.5f), 0.0f);
                float max2 = Math.max(this.A01, 15.0f);
                C13710nw.A02(A002, "location must not be null.");
                CameraPosition cameraPosition = new CameraPosition(A002, max2, max, f2);
                this.A0A = true;
                r3.A0B(AnonymousClass2R8.A00(cameraPosition), this.A0D);
            } else {
                return;
            }
        }
        this.A03 = i2;
    }

    public void setMyLocation(Location location) {
        this.A06 = location;
    }
}

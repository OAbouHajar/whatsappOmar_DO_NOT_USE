package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.whatsapp.util.Log;

/* renamed from: X.4gN  reason: invalid class name and case insensitive filesystem */
public class C91714gN implements SensorEventListener {
    public boolean A00;
    public final /* synthetic */ C82534De A01;
    public final /* synthetic */ AnonymousClass4L9 A02;

    public C91714gN(C82534De r1, AnonymousClass4L9 r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z2 = false;
        float f2 = sensorEvent.values[0];
        if (f2 < 5.0f && f2 != this.A02.A01.getMaximumRange()) {
            z2 = true;
        }
        if (z2 != this.A00) {
            this.A00 = z2;
            C447225g r1 = this.A01.A00;
            Log.i(AnonymousClass000.A0g("voip/service/proximitylistener.onchanged ", r1));
            if (z2) {
                r1.A0Q();
            } else {
                r1.A0P();
            }
        }
    }
}

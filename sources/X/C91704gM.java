package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.4gM  reason: invalid class name and case insensitive filesystem */
public class C91704gM implements SensorEventListener {
    public final /* synthetic */ AnonymousClass2DT A00;
    public final /* synthetic */ AnonymousClass2DT A01;

    public C91704gM(AnonymousClass2DT r1, AnonymousClass2DT r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorEventListener sensorEventListener;
        Sensor sensor;
        AnonymousClass2DT r0 = this.A01;
        AnonymousClass2DT r3 = this.A00;
        if (r0 != r3) {
            SensorManager sensorManager = r3.A0F;
            if (!(sensorManager == null || (sensorEventListener = r3.A0E) == null || (sensor = r3.A0D) == null)) {
                sensorManager.unregisterListener(sensorEventListener, sensor);
                r3.A0F = null;
            }
            r3.A09();
            return;
        }
        float f2 = sensorEvent.values[0];
        if (f2 >= 5.0f || f2 == r3.A0D.getMaximumRange()) {
            r3.A0E(false);
        } else {
            r3.A0E(true);
        }
    }
}

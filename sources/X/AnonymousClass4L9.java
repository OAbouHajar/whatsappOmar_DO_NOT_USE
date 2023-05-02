package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.4L9  reason: invalid class name */
public final class AnonymousClass4L9 {
    public SensorEventListener A00;
    public final Sensor A01;
    public final SensorManager A02;

    public AnonymousClass4L9(AnonymousClass01V r3) {
        SensorManager A0D = r3.A0D();
        this.A02 = A0D;
        this.A01 = A0D.getDefaultSensor(8);
    }
}

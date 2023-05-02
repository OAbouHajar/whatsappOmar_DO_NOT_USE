package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.obwhatsapp.notification.PopupNotification;

/* renamed from: X.4gL  reason: invalid class name and case insensitive filesystem */
public class C91694gL implements SensorEventListener {
    public final /* synthetic */ PopupNotification A00;

    public C91694gL(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        PopupNotification popupNotification = this.A00;
        float f2 = sensorEvent.values[0];
        popupNotification.A00 = f2;
        StringBuilder A0r = AnonymousClass000.A0r("popupnotification/proximity:");
        A0r.append(f2);
        C13680ns.A1V(A0r);
    }
}

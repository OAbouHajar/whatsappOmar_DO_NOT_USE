package X;

import android.hardware.display.DisplayManager;
import com.obwhatsapp.calling.callgrid.viewmodel.OrientationViewModel;

/* renamed from: X.4gO  reason: invalid class name and case insensitive filesystem */
public class C91724gO implements DisplayManager.DisplayListener {
    public final /* synthetic */ OrientationViewModel A00;

    public C91724gO(OrientationViewModel orientationViewModel) {
        this.A00 = orientationViewModel;
    }

    public void onDisplayAdded(int i2) {
    }

    public void onDisplayChanged(int i2) {
        OrientationViewModel.A01(this.A00);
    }

    public void onDisplayRemoved(int i2) {
    }
}

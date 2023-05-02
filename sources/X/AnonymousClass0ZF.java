package X;

import android.os.RemoteException;
import androidx.car.app.CarAppPermissionActivity;
import androidx.car.app.IOnRequestPermissionsListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0ZF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0ZF implements AnonymousClass05g {
    public final /* synthetic */ CarAppPermissionActivity A00;
    public final /* synthetic */ IOnRequestPermissionsListener A01;

    public /* synthetic */ AnonymousClass0ZF(CarAppPermissionActivity carAppPermissionActivity, IOnRequestPermissionsListener iOnRequestPermissionsListener) {
        this.A00 = carAppPermissionActivity;
        this.A01 = iOnRequestPermissionsListener;
    }

    public final void AM3(Object obj) {
        CarAppPermissionActivity carAppPermissionActivity = this.A00;
        IOnRequestPermissionsListener iOnRequestPermissionsListener = this.A01;
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        Iterator A0y = AnonymousClass000.A0y((Map) obj);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            Boolean bool = (Boolean) A0z.getValue();
            if (bool == null || !bool.booleanValue()) {
                A0u2.add(A0z.getKey());
            } else {
                A0u.add(A0z.getKey());
            }
        }
        try {
            iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) A0u.toArray(new String[0]), (String[]) A0u2.toArray(new String[0]));
            carAppPermissionActivity.finish();
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }
}

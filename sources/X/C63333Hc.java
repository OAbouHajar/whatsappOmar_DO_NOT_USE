package X;

import android.location.Address;
import android.location.Geocoder;
import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.3Hc  reason: invalid class name and case insensitive filesystem */
public class C63333Hc implements Runnable {
    public double A00;
    public double A01;
    public final /* synthetic */ AnonymousClass29S A02;

    public C63333Hc(AnonymousClass29S r1, double d2, double d3) {
        this.A02 = r1;
        this.A00 = d2;
        this.A01 = d3;
    }

    public void run() {
        String str;
        AnonymousClass29S r2 = this.A02;
        Address address = null;
        try {
            List<Address> fromLocation = new Geocoder(r2.A0Y.getApplicationContext(), C13690nt.A0m(r2.A1E)).getFromLocation(this.A00, this.A01, 1);
            if (fromLocation != null && !fromLocation.isEmpty()) {
                address = fromLocation.get(0);
                StringBuilder A0o = AnonymousClass000.A0o();
                for (int i2 = 0; i2 <= address.getMaxAddressLineIndex(); i2++) {
                    if (i2 != 0) {
                        A0o.append(", ");
                    }
                    A0o.append(address.getAddressLine(i2));
                }
                str = A0o.toString();
                r2.A12.A0K(new RunnableRunnableShape1S1200000_I1(this, str, address, 8));
            }
        } catch (Exception unused) {
        }
        str = r2.A0Y.getString(R.string.str0c97);
        r2.A12.A0K(new RunnableRunnableShape1S1200000_I1(this, str, address, 8));
    }
}

package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Fe  reason: invalid class name and case insensitive filesystem */
public class C24261Fe {
    public final C16300so A00;

    public C24261Fe(C16300so r1) {
        this.A00 = r1;
    }

    public void A00(Exception exc) {
        Log.e("wamsysJniBridge/caught exception", exc);
        this.A00.AcB("wamsysJniBridge/caught exception", exc.getMessage(), true);
    }
}

package X;

import android.os.PersistableBundle;
import com.mod2.fblibs.FacebookFacade;

/* renamed from: X.0SW  reason: invalid class name */
public class AnonymousClass0SW {
    public static PersistableBundle A00(AnonymousClass04K r3) {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = r3.A01;
        persistableBundle.putString(FacebookFacade.RequestParameter.NAME, charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", r3.A03);
        persistableBundle.putString("key", r3.A02);
        persistableBundle.putBoolean("isBot", r3.A04);
        persistableBundle.putBoolean("isImportant", r3.A05);
        return persistableBundle;
    }

    public static AnonymousClass04K A01(PersistableBundle persistableBundle) {
        AnonymousClass04L r1 = new AnonymousClass04L();
        r1.A01 = persistableBundle.getString(FacebookFacade.RequestParameter.NAME);
        r1.A03 = persistableBundle.getString("uri");
        r1.A02 = persistableBundle.getString("key");
        r1.A04 = persistableBundle.getBoolean("isBot");
        r1.A05 = persistableBundle.getBoolean("isImportant");
        return new AnonymousClass04K(r1);
    }
}

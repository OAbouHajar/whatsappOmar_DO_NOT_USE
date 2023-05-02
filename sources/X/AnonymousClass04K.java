package X;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.mod2.fblibs.FacebookFacade;

/* renamed from: X.04K  reason: invalid class name */
public class AnonymousClass04K {
    public IconCompat A00;
    public CharSequence A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public AnonymousClass04K(AnonymousClass04L r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A04 = r2.A04;
        this.A05 = r2.A05;
    }

    public static AnonymousClass04K A00(PersistableBundle persistableBundle) {
        return AnonymousClass0SW.A01(persistableBundle);
    }

    public Person A01() {
        return AnonymousClass0LM.A00(this);
    }

    public Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(FacebookFacade.RequestParameter.NAME, this.A01);
        IconCompat iconCompat = this.A00;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.A0B() : null);
        bundle.putString("uri", this.A03);
        bundle.putString("key", this.A02);
        bundle.putBoolean("isBot", this.A04);
        bundle.putBoolean("isImportant", this.A05);
        return bundle;
    }

    public PersistableBundle A03() {
        return AnonymousClass0SW.A00(this);
    }
}

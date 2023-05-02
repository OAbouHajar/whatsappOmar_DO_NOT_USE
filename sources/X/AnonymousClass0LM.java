package X;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.0LM  reason: invalid class name */
public class AnonymousClass0LM {
    public static Person A00(AnonymousClass04K r2) {
        Person.Builder name = new Person.Builder().setName(r2.A01);
        IconCompat iconCompat = r2.A00;
        return name.setIcon(iconCompat != null ? iconCompat.A08() : null).setUri(r2.A03).setKey(r2.A02).setBot(r2.A04).setImportant(r2.A05).build();
    }
}

package X;

import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.35s  reason: invalid class name */
public abstract class AnonymousClass35s extends C16690tT {
    public final WeakReference A00;

    public AnonymousClass35s(ContactPickerFragment contactPickerFragment) {
        this.A00 = C13690nt.A0h(contactPickerFragment);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass4NB r11 = (AnonymousClass4NB) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00.get();
        if (contactPickerFragment != null && contactPickerFragment.A0c()) {
            ArrayList arrayList = r11.A00;
            arrayList.size();
            r11.A03.size();
            r11.A01.size();
            contactPickerFragment.A0v = null;
            if (contactPickerFragment.A1n() && !arrayList.isEmpty()) {
                C005402i x2 = contactPickerFragment.A0x.A00.x();
                AnonymousClass013 r6 = contactPickerFragment.A1H;
                long size = (long) arrayList.size();
                Object[] A1b = C13680ns.A1b();
                AnonymousClass000.A1M(A1b, arrayList.size(), 0);
                x2.A0I(r6.A0J(A1b, R.plurals.plurals00d7, size));
            }
            contactPickerFragment.A1c(r11);
        }
    }
}

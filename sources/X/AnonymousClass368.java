package X;

import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.368  reason: invalid class name */
public class AnonymousClass368 extends C16690tT {
    public final C16000sG A00;
    public final C19230xz A01;
    public final C15800rs A02;
    public final WeakReference A03;

    public AnonymousClass368(C16000sG r2, ContactPickerFragment contactPickerFragment, C19230xz r4, C15800rs r5) {
        this.A03 = C13690nt.A0h(contactPickerFragment);
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C452927v r1 = new C452927v(C34861kz.A0B);
        r1.A00 = C453027w.A09;
        r1.A02 = true;
        return this.A01.A01(r1.A01());
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass284 r5 = (AnonymousClass284) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A03.get();
        if (contactPickerFragment != null && contactPickerFragment.A0c()) {
            contactPickerFragment.A0x.A00.A1b(false);
            contactPickerFragment.A1O();
            int i2 = r5.A00;
            if (i2 == 0) {
                contactPickerFragment.A0x.Afg(R.string.str0474);
            } else if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (contactPickerFragment.A0l.A00()) {
                    contactPickerFragment.A0P.A09(R.string.str0475, 0);
                }
            } else if (i2 == 4 || i2 == 6) {
                contactPickerFragment.A0x.Afg(R.string.str0473);
                contactPickerFragment.A17.A05();
            }
        }
    }
}

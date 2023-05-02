package X;

import android.net.Uri;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4us  reason: invalid class name and case insensitive filesystem */
public class C99964us implements AnonymousClass2KA {
    public boolean A00 = false;
    public final ArrayList A01 = AnonymousClass000.A0u();
    public final ArrayList A02 = AnonymousClass000.A0u();
    public final /* synthetic */ ContactPickerFragment A03;
    public final /* synthetic */ List A04;

    public C99964us(ContactPickerFragment contactPickerFragment, List list) {
        this.A03 = contactPickerFragment;
        this.A04 = list;
    }

    public final void A00() {
        ArrayList arrayList = this.A02;
        int size = arrayList.size() + this.A01.size();
        ContactPickerFragment contactPickerFragment = this.A03;
        if (size == contactPickerFragment.A2K.size()) {
            if (!arrayList.isEmpty() && !this.A00) {
                C99874uj r0 = contactPickerFragment.A0x;
                r0.A00.Agv(this.A04);
            }
            contactPickerFragment.A0x.A00();
        }
    }

    public void AQs() {
        this.A00 = true;
    }

    public void AZR(Uri uri) {
        this.A01.add(uri);
        A00();
    }

    public void AZS(Uri uri) {
        this.A02.add(uri);
        A00();
    }
}

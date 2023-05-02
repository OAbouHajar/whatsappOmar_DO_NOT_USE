package X;

import android.net.Uri;
import android.util.Pair;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3zB  reason: invalid class name and case insensitive filesystem */
public class C79093zB extends C16690tT {
    public final Uri A00;
    public final C23181Au A01;
    public final AnonymousClass3BB A02;
    public final C17190ug A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;
    public final boolean A08;

    public C79093zB(Uri uri, ContactPickerFragment contactPickerFragment, C23181Au r4, AnonymousClass3BB r5, C17190ug r6, String str, String str2, String str3, boolean z2) {
        this.A07 = C13690nt.A0h(contactPickerFragment);
        this.A06 = str;
        this.A08 = z2;
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r4;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = uri;
    }

    public void A05() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A07.get();
        if (contactPickerFragment != null && contactPickerFragment.A0c()) {
            Log.i("contactpicker/existencecheck/canceled");
            contactPickerFragment.A0z = null;
            contactPickerFragment.A0x.Ac1();
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            this.A03.A07(32000);
            return this.A01.A00(C34861kz.A0D, this.A06);
        } catch (C34541kR unused) {
            return null;
        }
    }

    public void A09() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A07.get();
        if (contactPickerFragment != null && contactPickerFragment.A0c()) {
            Log.i("contactpicker/existencecheck/started");
            contactPickerFragment.A0x.Afr(0, R.string.str14b3);
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Pair pair = (Pair) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A07.get();
        if (contactPickerFragment != null && contactPickerFragment.A0c()) {
            String str = this.A06;
            boolean z2 = this.A08;
            contactPickerFragment.A1Y(this.A00, pair, this.A02, str, this.A05, this.A04, z2);
        }
    }
}

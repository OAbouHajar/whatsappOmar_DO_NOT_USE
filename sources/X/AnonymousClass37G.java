package X;

import android.util.Pair;
import android.widget.ListView;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.37G  reason: invalid class name */
public class AnonymousClass37G extends C16690tT {
    public final C16000sG A00;
    public final C23181Au A01;
    public final C17190ug A02;
    public final String A03;
    public final WeakReference A04;

    public AnonymousClass37G(C16000sG r2, ContactPickerFragment contactPickerFragment, C23181Au r4, C17190ug r5, String str) {
        this.A04 = C13690nt.A0h(contactPickerFragment);
        this.A03 = str;
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            this.A02.A07(32000);
            return this.A01.A00(C34861kz.A0D, this.A03);
        } catch (C34541kR unused) {
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        String str;
        ListView listView;
        int i2;
        String str2;
        int i3;
        Pair pair = (Pair) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A04.get();
        if (contactPickerFragment != null && contactPickerFragment.A0c()) {
            if (pair == null) {
                Log.w("handlecontactlesssync/fetchContactUsingNumber/disconnected/");
                return;
            }
            int i4 = ((AnonymousClass284) pair.first).A00;
            if (i4 == 3 || i4 == 2) {
                C450927a r5 = (C450927a) pair.second;
                AnonymousClass00B.A0B("deeplink: user is null", AnonymousClass000.A1V(r5));
                int i5 = r5.A04;
                if (i5 == 1) {
                    UserJid userJid = r5.A0C;
                    C16010sH r4 = new C16010sH(userJid);
                    if (r5.A09 != null) {
                        r4 = this.A00.A0A(userJid);
                    }
                    ArrayList A0u = AnonymousClass000.A0u();
                    A0u.add(new C56022kp(contactPickerFragment.A03().getString(R.string.str0e6e)));
                    A0u.add(new C101364xC(r4));
                    C49182Rm r0 = contactPickerFragment.A0w;
                    r0.A02 = A0u;
                    r0.notifyDataSetChanged();
                    contactPickerFragment.A0H.setVisibility(8);
                    listView = contactPickerFragment.A0G;
                    i2 = 0;
                } else {
                    if (i5 == 2) {
                        str = "handlecontactlesssync/fetchContactUsingNumber/user/not-wa/";
                    } else {
                        if (i5 == 3) {
                            str = "handlecontactlesssync/fetchContactUsingNumber/invalid/";
                        }
                        contactPickerFragment.A0H.setVisibility(8);
                        contactPickerFragment.A0G.setVisibility(0);
                    }
                    Log.e(str);
                    contactPickerFragment.A0H.setVisibility(8);
                    contactPickerFragment.A0G.setVisibility(0);
                }
            } else {
                if (i4 == 0) {
                    Log.w("handlecontactlesssync/fetchContactUsingNumber/network-unavailable/");
                    i3 = R.string.str084f;
                } else {
                    if (i4 == 4) {
                        str2 = "handlecontactlesssync/fetchContactUsingNumber/try-again-later/";
                    } else {
                        if (i4 == 1) {
                            Log.w("handlecontactlesssync/fetchContactUsingNumber/exisitng request ongoing/");
                        } else if (i4 == 6) {
                            str2 = "handlecontactlesssync/fetchContactUsingNumber/exception-occurred/";
                        }
                        contactPickerFragment.A0H.setVisibility(8);
                        contactPickerFragment.A0G.setVisibility(0);
                    }
                    Log.w(str2);
                    i3 = R.string.str084e;
                }
                contactPickerFragment.A0Z.setText(i3);
                contactPickerFragment.A0Z.setVisibility(0);
                listView = contactPickerFragment.A0G;
                i2 = 8;
            }
            listView.setVisibility(i2);
            contactPickerFragment.A0H.setVisibility(8);
            contactPickerFragment.A0G.setVisibility(0);
        }
    }
}

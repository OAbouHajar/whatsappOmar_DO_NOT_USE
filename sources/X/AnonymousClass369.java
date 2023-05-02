package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.PhoneContactsSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.369  reason: invalid class name */
public class AnonymousClass369 extends C16690tT {
    public final AnonymousClass013 A00;
    public final WeakReference A01;
    public final ArrayList A02;
    public final List A03;

    public AnonymousClass369(PhoneContactsSelector phoneContactsSelector, AnonymousClass013 r3, List list, List list2) {
        this.A00 = r3;
        this.A01 = C13690nt.A0h(phoneContactsSelector);
        this.A02 = list != null ? C13680ns.A0n(list) : null;
        this.A03 = C13680ns.A0n(list2);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A02;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            arrayList = this.A03;
        } else {
            ArrayList A0u = AnonymousClass000.A0u();
            for (C55902kd r3 : this.A03) {
                if (C40661uU.A03(this.A00, r3.A06, arrayList2, true)) {
                    A0u.add(r3);
                }
            }
            arrayList = A0u;
        }
        Collections.sort(arrayList, new AnonymousClass572(this.A00));
        return arrayList;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Collection collection = (Collection) obj;
        PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A01.get();
        if (phoneContactsSelector != null && !phoneContactsSelector.AIm()) {
            phoneContactsSelector.A0J = null;
            ArrayList arrayList = phoneContactsSelector.A0Z;
            arrayList.clear();
            arrayList.addAll(collection);
            phoneContactsSelector.A0I.notifyDataSetChanged();
            View findViewById = phoneContactsSelector.findViewById(R.id.contacts_empty_permission_denied);
            View findViewById2 = phoneContactsSelector.findViewById(R.id.contacts_empty);
            View findViewById3 = phoneContactsSelector.findViewById(R.id.search_no_matches);
            View findViewById4 = phoneContactsSelector.findViewById(R.id.init_contacts_progress);
            if (!phoneContactsSelector.A0B.A00()) {
                findViewById4.setVisibility(8);
                findViewById.setVisibility(0);
                findViewById2.setVisibility(8);
                findViewById3.setVisibility(8);
                phoneContactsSelector.A04.setVisibility(8);
                return;
            }
            if (phoneContactsSelector.A0K != null) {
                findViewById4.setVisibility(0);
                findViewById.setVisibility(8);
                findViewById2.setVisibility(8);
            } else {
                boolean isEmpty = TextUtils.isEmpty(phoneContactsSelector.A0T);
                findViewById4.setVisibility(8);
                if (!isEmpty) {
                    findViewById.setVisibility(8);
                    findViewById2.setVisibility(8);
                    findViewById3.setVisibility(0);
                    ((TextView) findViewById3).setText(C13680ns.A0d(phoneContactsSelector, phoneContactsSelector.A0T, C13680ns.A1b(), 0, R.string.str14a8));
                    return;
                }
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
            }
            findViewById3.setVisibility(8);
        }
    }
}

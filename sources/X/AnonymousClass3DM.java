package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3DM  reason: invalid class name */
public class AnonymousClass3DM implements C009804r {
    public final /* synthetic */ ContactPickerFragment A00;

    public AnonymousClass3DM(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public boolean AM1(MenuItem menuItem, AnonymousClass05J r12) {
        ContactPickerFragment contactPickerFragment;
        int i2;
        C99874uj r9;
        String A0J;
        if (menuItem.getItemId() == R.id.menuitem_new_broadcast) {
            contactPickerFragment = this.A00;
            int A02 = contactPickerFragment.A0T.A02(C15910s6.A1A);
            if (A02 <= 0 || contactPickerFragment.A2w.size() <= A02) {
                Context A0u = contactPickerFragment.A0u();
                Set keySet = contactPickerFragment.A2w.keySet();
                Intent A09 = C13680ns.A09();
                A09.setClassName(A0u.getPackageName(), "com.obwhatsapp.contact.picker.ListMembersSelector");
                if (!keySet.isEmpty()) {
                    A09.putExtra("selected", C16030sJ.A06(keySet));
                }
                contactPickerFragment.A0r(A09);
                contactPickerFragment.A0x.A00();
                return false;
            }
            r9 = contactPickerFragment.A0x;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, A02, 0);
            A0J = contactPickerFragment.A1H.A0J(objArr, R.plurals.plurals000a, (long) A02);
        } else if (menuItem.getItemId() == R.id.menuitem_new_group) {
            contactPickerFragment = this.A00;
            int A03 = contactPickerFragment.A1R.A0A.A03(C16620tM.A02, 1304) - 1;
            if (A03 <= 0 || contactPickerFragment.A2w.size() <= (i2 = A03 - 1)) {
                contactPickerFragment.A1j.A00(4);
                C001000l A0D = contactPickerFragment.A0D();
                A0D.startActivity(C14750ph.A0m(A0D, C16030sJ.A06(contactPickerFragment.A2w.keySet()), 4));
                contactPickerFragment.A0x.A00();
                return false;
            }
            r9 = contactPickerFragment.A0x;
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1M(objArr2, i2, 0);
            A0J = contactPickerFragment.A1H.A0J(objArr2, R.plurals.plurals00ba, (long) i2);
        } else {
            if (menuItem.getItemId() == R.id.menuitem_share) {
                ContactPickerFragment contactPickerFragment2 = this.A00;
                boolean z2 = contactPickerFragment2.A1C().getBoolean("skip_preview", false);
                ArrayList arrayList = contactPickerFragment2.A2K;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (contactPickerFragment2.A1m.A00((Uri) it.next()) != 1) {
                            break;
                        }
                    }
                }
                if (!z2) {
                    contactPickerFragment2.A1e((C16010sH) null);
                    return false;
                }
                AnonymousClass29T.A01(contactPickerFragment2.A0C(), 1);
                return false;
            }
            return false;
        }
        r9.Afh(A0J);
        contactPickerFragment.A0x.A00();
        return false;
    }

    public boolean APA(Menu menu, AnonymousClass05J r7) {
        ContactPickerFragment contactPickerFragment = this.A00;
        if (contactPickerFragment.A2i || contactPickerFragment.A2q || contactPickerFragment.A2o) {
            menu.add(0, R.id.menuitem_share, 0, R.string.str14e6).setIcon(R.drawable.input_send).setShowAsAction(2);
            return true;
        }
        if (!contactPickerFragment.A0Q.A0G()) {
            menu.add(0, R.id.menuitem_new_broadcast, 0, R.string.str0dcc).setShowAsAction(1);
        }
        menu.add(0, R.id.menuitem_new_group, 0, R.string.str0cfe).setShowAsAction(1);
        return true;
    }

    public void APd(AnonymousClass05J r7) {
        ContactPickerFragment contactPickerFragment = this.A00;
        Set set = contactPickerFragment.A2y;
        set.clear();
        Map map = contactPickerFragment.A2w;
        set.addAll(map.keySet());
        Handler handler = contactPickerFragment.A2r;
        Runnable runnable = contactPickerFragment.A2t;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200);
        map.clear();
        ContactPickerFragment.A02(contactPickerFragment);
        contactPickerFragment.A0J = null;
    }

    public boolean AV8(Menu menu, AnonymousClass05J r3) {
        return false;
    }
}

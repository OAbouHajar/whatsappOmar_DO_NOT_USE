package X;

import android.view.MenuItem;
import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.3DR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DR implements C12270k7 {
    public final /* synthetic */ C16740tZ A00;
    public final /* synthetic */ ViewOnClickCListenerShape2S0100000_I0_2 A01;

    public /* synthetic */ AnonymousClass3DR(C16740tZ r1, ViewOnClickCListenerShape2S0100000_I0_2 viewOnClickCListenerShape2S0100000_I0_2) {
        this.A01 = viewOnClickCListenerShape2S0100000_I0_2;
        this.A00 = r1;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i2;
        ViewOnClickCListenerShape2S0100000_I0_2 viewOnClickCListenerShape2S0100000_I0_2 = this.A01;
        C16740tZ r4 = this.A00;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_forward) {
            MyStatusesActivity myStatusesActivity = (MyStatusesActivity) viewOnClickCListenerShape2S0100000_I0_2.A00;
            AnonymousClass05J r0 = myStatusesActivity.A01;
            if (r0 != null) {
                r0.A05();
            }
            myStatusesActivity.A0Z = r4;
            AnonymousClass391 r3 = new AnonymousClass391(myStatusesActivity);
            r3.A05 = true;
            r3.A01 = r4.A11.A00;
            byte b2 = r4.A10;
            r3.A0R = C13680ns.A0n(Collections.singleton(Integer.valueOf(Byte.valueOf(b2).intValue())));
            r3.A0L = Long.valueOf(b2 == 3 ? C13690nt.A08(((C16730tY) r4).A00) : 0);
            if (b2 == 0) {
                String A0I = r4.A0I();
                AnonymousClass00B.A06(A0I);
                i2 = A0I.length();
            } else {
                i2 = 0;
            }
            r3.A0J = Integer.valueOf(i2);
            myStatusesActivity.startActivityForResult(r3.A00(), 2);
        } else if (itemId == R.id.menuitem_delete) {
            MyStatusesActivity myStatusesActivity2 = (MyStatusesActivity) viewOnClickCListenerShape2S0100000_I0_2.A00;
            Map map = myStatusesActivity2.A17;
            map.clear();
            map.put(r4.A11, r4);
            AnonymousClass29T.A01(myStatusesActivity2, 13);
            map.clear();
            return true;
        } else if (itemId == R.id.menuitem_share_status_facebook || itemId == R.id.menuitem_share_status_third_party) {
            boolean A1R = AnonymousClass000.A1R(itemId, R.id.menuitem_share_status_facebook);
            MyStatusesActivity myStatusesActivity3 = (MyStatusesActivity) viewOnClickCListenerShape2S0100000_I0_2.A00;
            Map map2 = myStatusesActivity3.A17;
            map2.clear();
            map2.put(r4.A11, r4);
            myStatusesActivity3.A39(Collections.singletonList(r4), A1R);
            return true;
        } else if (itemId == R.id.menuitem_advertise_on_facebook) {
            throw C13680ns.A0m();
        }
        return true;
    }
}

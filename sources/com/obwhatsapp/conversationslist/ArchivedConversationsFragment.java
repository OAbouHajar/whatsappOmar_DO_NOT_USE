package com.obwhatsapp.conversationslist;

import X.C001000l;
import X.C13680ns;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.obwhatsapp.R;

public class ArchivedConversationsFragment extends Hilt_ArchivedConversationsFragment {
    public View A00;

    public void A0z(Menu menu, MenuInflater menuInflater) {
        if (!this.A1J.A1b() || this.A0P.A0G()) {
            super.A0z(menu, menuInflater);
        } else {
            menu.add(1, R.id.menuitem_archive_chat_notifications, 0, R.string.str0101);
        }
    }

    public boolean A10(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_archive_chat_notifications) {
            return super.A10(menuItem);
        }
        C001000l A0C = A0C();
        if (A0C == null) {
            return true;
        }
        A0r(C13680ns.A09().setClassName(A0C.getPackageName(), "com.obwhatsapp.conversationslist.ArchiveNotificationSettingActivity"));
        return true;
    }

    public void A1G() {
        super.A1G();
        if (this.A0z.A00() == 0) {
            A0D().finish();
        }
    }
}

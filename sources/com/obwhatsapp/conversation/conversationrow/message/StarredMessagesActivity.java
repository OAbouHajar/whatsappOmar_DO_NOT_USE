package com.obwhatsapp.conversation.conversationrow.message;

import X.AnonymousClass2SX;
import X.AnonymousClass31T;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C18940xV;
import X.C32241fu;
import X.C74523qg;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.redex.IDxCListenerShape126S0100000_1_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.data.IDxMObserverShape75S0100000_2_I1;

public class StarredMessagesActivity extends AnonymousClass31T {
    public MenuItem A00;
    public final C18940xV A01 = new IDxMObserverShape75S0100000_2_I1(this, 2);

    public class UnstarAllDialogFragment extends Hilt_StarredMessagesActivity_UnstarAllDialogFragment {
        public Dialog A1B(Bundle bundle) {
            C32241fu A0c = AnonymousClass3K3.A0c(this);
            A0c.A01(R.string.str18a5);
            return AnonymousClass3K2.A0O(new IDxCListenerShape126S0100000_1_I1(this, 3), A0c, R.string.str13fc);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1678);
        this.A00.A0S.A02(this.A01);
        C74523qg r1 = new C74523qg();
        if (this.A0J == null) {
            r1.A00 = 1;
        } else {
            r1.A00 = 0;
        }
        this.A00.A0W.A06(r1);
        setContentView((int) R.layout.layout0567);
        ListView ADA = ADA();
        ADA.setFastScrollEnabled(false);
        ADA.setScrollbarFadingEnabled(true);
        ADA.setOnScrollListener(this.A0Q);
        A35(this.A07);
        A37();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ListAdapter listAdapter;
        MenuItem add = menu.add(0, R.id.menuitem_unstar_all, 0, R.string.str18a4);
        this.A00 = add;
        add.setShowAsAction(0);
        MenuItem menuItem = this.A00;
        AnonymousClass2SX r1 = this.A00;
        synchronized (r1) {
            listAdapter = r1.A00;
        }
        menuItem.setVisible(!listAdapter.isEmpty());
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.A0S.A03(this.A01);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_unstar_all) {
            return super.onOptionsItemSelected(menuItem);
        }
        new UnstarAllDialogFragment().A1G(AGM(), "UnstarAllDialogFragment");
        return true;
    }
}

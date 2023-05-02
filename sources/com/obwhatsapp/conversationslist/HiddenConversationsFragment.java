package com.obwhatsapp.conversationslist;

import X.AnonymousClass2Wo;
import X.C15800rs;
import X.C15830rv;
import X.C16220sf;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.obwhatsapp.yo.yo;
import java.util.ArrayList;

public class HiddenConversationsFragment extends Hilt_HiddenConversationsFragment {
    public View A00;

    public HiddenConversationsFragment() {
        yo.setConversationsFragment(this);
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
    }

    public boolean A10(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        return true;
    }

    public ArrayList A1D() {
        C15800rs r1 = this.A0z;
        C16220sf r0 = this.A27;
        yo.setHOp(true);
        ArrayList<C15830rv> H4N = yo.H4N();
        ArrayList arrayList = new ArrayList(H4N.size());
        for (C15830rv r12 : H4N) {
            arrayList.add(new AnonymousClass2Wo(r12));
        }
        return arrayList;
    }
}

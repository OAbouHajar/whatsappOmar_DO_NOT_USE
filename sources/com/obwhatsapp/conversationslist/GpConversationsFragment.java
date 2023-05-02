package com.obwhatsapp.conversationslist;

import X.AnonymousClass2Wo;
import X.C15830rv;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.obwhatsapp.yo.yo;
import java.util.ArrayList;
import java.util.List;

public class GpConversationsFragment extends Hilt_GpConversationsFragment {
    public View A00;

    public void A0z(Menu menu, MenuInflater menuInflater) {
    }

    public boolean A10(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        return true;
    }

    public ArrayList A1D() {
        List<C15830rv> A09 = this.A0z.A09(this.A27);
        ArrayList arrayList = new ArrayList(A09.size());
        for (C15830rv r1 : A09) {
            if (yo.H3G(r1)) {
                arrayList.add(new AnonymousClass2Wo(r1));
            }
        }
        return arrayList;
    }
}

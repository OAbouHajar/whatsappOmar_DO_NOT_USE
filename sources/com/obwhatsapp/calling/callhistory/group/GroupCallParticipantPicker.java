package com.obwhatsapp.calling.callhistory.group;

import X.AnonymousClass000;
import X.AnonymousClass2JP;
import X.C13680ns;
import X.C13700nu;
import X.C16030sJ;
import X.C204310c;
import X.C60082zw;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupCallParticipantPicker extends C60082zw {
    public C204310c A00;

    public void A35(ListAdapter listAdapter) {
        int intExtra = getIntent().getIntExtra("hidden_jids", 0);
        if (intExtra > 0) {
            ListView ADA = ADA();
            View inflate = getLayoutInflater().inflate(R.layout.layout02cc, ADA, false);
            ADA.addFooterView(inflate, (Object) null, false);
            TextView A0M = C13680ns.A0M(inflate, R.id.group_members_not_shown);
            Object[] A1b = C13680ns.A1b();
            AnonymousClass000.A1M(A1b, intExtra, 0);
            A0M.setText(this.A0S.A0J(A1b, R.plurals.plurals00ad, (long) intExtra));
            AnonymousClass2JP.A01(inflate);
        }
        super.A35(listAdapter);
    }

    public void A3Q(int i2) {
        if (i2 > 0 || x() == null) {
            super.A3Q(i2);
        } else {
            x().A0A(R.string.str00ba);
        }
    }

    public void A3Z(ArrayList arrayList) {
        List A07 = C16030sJ.A07(getIntent(), UserJid.class);
        if (A07.isEmpty()) {
            super.A3Z(arrayList);
        } else {
            A3f(arrayList, A07);
        }
    }

    public final void A3f(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.A0J.A0A(C13700nu.A0B(it)));
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }
}

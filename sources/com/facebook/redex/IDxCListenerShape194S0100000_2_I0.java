package com.facebook.redex;

import X.AnonymousClass1V8;
import X.AnonymousClass4M4;
import X.C13680ns;
import X.C14750ph;
import X.C16010sH;
import X.C56732oQ;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.R;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;
import java.util.List;

public class IDxCListenerShape194S0100000_2_I0 implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape194S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        switch (this.A01) {
            case 0:
                ((Activity) this.A00).openContextMenu(view);
                return;
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                int i3 = i2 - 1;
                if (i3 >= 0 && i3 < contactInfoActivity.A0W.getCount()) {
                    C56732oQ r2 = contactInfoActivity.A0W;
                    if (r2.A04 || C13680ns.A07(r2.A02) <= r2.A00 || i3 != r2.A01) {
                        List list = contactInfoActivity.A0W.A02;
                        contactInfoActivity.A00.A07(contactInfoActivity, new C14750ph().A0v(contactInfoActivity, list == null ? null : (C16010sH) list.get(i3)));
                        return;
                    }
                    C56732oQ r1 = contactInfoActivity.A0W;
                    if (!r1.A04) {
                        r1.A04 = true;
                        r1.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                C16010sH r0 = ((AnonymousClass4M4) view.getTag()).A03;
                if (r0 != null) {
                    listChatInfoActivity.A0K = r0;
                    view.showContextMenu();
                    return;
                }
                return;
            case 3:
                AnonymousClass1V8 r22 = (AnonymousClass1V8) this.A00;
                View findViewById = view.findViewById(R.id.selection_check);
                if (findViewById != null) {
                    C16010sH r12 = (C16010sH) findViewById.getTag();
                    if (r22.A3e(r12)) {
                        r22.A3X(r12);
                        return;
                    } else {
                        r22.A3W(r12);
                        return;
                    }
                } else {
                    return;
                }
            default:
                ((GroupChatInfoActivity) this.A00).onListItemClicked(view);
                return;
        }
    }
}

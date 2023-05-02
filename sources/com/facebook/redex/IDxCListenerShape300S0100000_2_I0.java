package com.facebook.redex;

import X.AnonymousClass2XJ;
import X.C16010sH;
import X.C16740tZ;
import X.C49182Rm;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.jid.UserJid;

public class IDxCListenerShape300S0100000_2_I0 implements AdapterView.OnItemLongClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape300S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onItemLongClick(AdapterView adapterView, View view, int i2, long j2) {
        if (this.A01 != 0) {
            MyStatusesActivity myStatusesActivity = (MyStatusesActivity) this.A00;
            if (i2 >= myStatusesActivity.A0k.getCount()) {
                return false;
            }
            myStatusesActivity.A38(view, (C16740tZ) myStatusesActivity.A0k.A00.get(i2));
            return true;
        }
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
        ListAdapter adapter = contactPickerFragment.A0G.getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        C49182Rm r2 = (C49182Rm) adapter;
        ListAdapter adapter2 = contactPickerFragment.A0G.getAdapter();
        if (adapter2 instanceof HeaderViewListAdapter) {
            i2 -= ((HeaderViewListAdapter) adapter2).getHeadersCount();
        }
        if (i2 < 0 || i2 >= contactPickerFragment.A0w.getCount()) {
            return true;
        }
        C16010sH AAn = ((AnonymousClass2XJ) r2.A02.get(i2)).AAn();
        if (AAn == null || !AAn.A0i || contactPickerFragment.A0a.A0V((UserJid) AAn.A08(UserJid.class))) {
            return false;
        }
        if (!contactPickerFragment.A1i()) {
            return true;
        }
        contactPickerFragment.A1Z(view, AAn);
        return true;
    }
}

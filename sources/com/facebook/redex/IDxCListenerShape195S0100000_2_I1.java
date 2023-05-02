package com.facebook.redex;

import X.AnonymousClass4Rp;
import X.C13680ns;
import X.C34201js;
import X.C55902kd;
import X.C56642oG;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.PhoneContactsSelector;
import com.obwhatsapp.documentpicker.DocumentPickerActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.whatsapp.util.Log;
import java.util.Collections;

public class IDxCListenerShape195S0100000_2_I1 implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape195S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        switch (this.A01) {
            case 0:
                PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A00;
                View findViewById = view.findViewById(R.id.selection_check);
                if (findViewById != null) {
                    phoneContactsSelector.A38((C55902kd) findViewById.getTag());
                    return;
                }
                return;
            case 1:
                DocumentPickerActivity documentPickerActivity = (DocumentPickerActivity) this.A00;
                int headerViewsCount = i2 - documentPickerActivity.ADA().getHeaderViewsCount();
                if (headerViewsCount < 0) {
                    documentPickerActivity.A37();
                    return;
                }
                C34201js r1 = (C34201js) documentPickerActivity.A0J.get(headerViewsCount);
                if (documentPickerActivity.A03 != null) {
                    documentPickerActivity.A39(r1);
                    return;
                } else {
                    documentPickerActivity.A3A(Collections.singletonList(r1));
                    return;
                }
            case 2:
                ((GroupChatInfoActivity) this.A00).onListItemClicked(view);
                return;
            case 3:
                Activity activity = (Activity) this.A00;
                try {
                    AnonymousClass4Rp r3 = (AnonymousClass4Rp) adapterView.getItemAtPosition(i2);
                    Intent A09 = C13680ns.A09();
                    A09.putExtra("country_name", r3.A01);
                    A09.putExtra("cc", r3.A00);
                    A09.putExtra("iso", r3.A03);
                    C13680ns.A0r(activity, A09);
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    return;
                }
            default:
                C56642oG r12 = (C56642oG) this.A00;
                Log.i("select-phone-number-dialog/phone-number-selected");
                if (r12.A00 != i2) {
                    r12.A00 = i2;
                    r12.notifyDataSetChanged();
                    return;
                }
                return;
        }
    }
}

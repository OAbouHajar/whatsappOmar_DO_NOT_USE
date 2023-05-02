package X;

import android.widget.Filter;
import com.facebook.redex.IDxComparatorShape184S0100000_2_I1;
import com.obwhatsapp.documentpicker.DocumentPickerActivity;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2oX  reason: invalid class name and case insensitive filesystem */
public class C56802oX extends Filter {
    public int A00 = 0;
    public final /* synthetic */ DocumentPickerActivity A01;

    public C56802oX(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (charSequence != null) {
            arrayList = C40661uU.A02(this.A01.A0A, charSequence.toString());
        } else {
            arrayList = null;
        }
        int i2 = this.A00;
        DocumentPickerActivity documentPickerActivity = this.A01;
        int i3 = documentPickerActivity.A00;
        if (i2 != i3) {
            this.A00 = i3;
            AnonymousClass013 r0 = documentPickerActivity.A0A;
            List list = documentPickerActivity.A0I;
            if (i3 == 0) {
                Collator instance = Collator.getInstance(C13690nt.A0m(r0));
                instance.setDecomposition(1);
                Collections.sort(list, new IDxComparatorShape184S0100000_2_I1(instance, 8));
            } else if (i3 == 1) {
                C13690nt.A1P(list, 17);
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            arrayList2 = documentPickerActivity.A0I;
        } else {
            ArrayList A0u = AnonymousClass000.A0u();
            for (C34201js r3 : documentPickerActivity.A0I) {
                if (C40661uU.A03(documentPickerActivity.A0A, r3.A03, arrayList, true)) {
                    A0u.add(r3);
                }
            }
            arrayList2 = A0u;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = arrayList2;
        filterResults.count = arrayList2.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults != null) {
            this.A01.A0J = (ArrayList) filterResults.values;
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        documentPickerActivity.A0B.notifyDataSetChanged();
        DocumentPickerActivity.A02(documentPickerActivity);
    }
}

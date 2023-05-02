package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.R;
import com.obwhatsapp.documentpicker.DocumentPickerActivity;
import java.util.List;

/* renamed from: X.3DG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DG implements AdapterView.OnItemLongClickListener {
    public final /* synthetic */ DocumentPickerActivity A00;

    public /* synthetic */ AnonymousClass3DG(DocumentPickerActivity documentPickerActivity) {
        this.A00 = documentPickerActivity;
    }

    public final boolean onItemLongClick(AdapterView adapterView, View view, int i2, long j2) {
        DocumentPickerActivity documentPickerActivity = this.A00;
        int headerViewsCount = i2 - documentPickerActivity.ADA().getHeaderViewsCount();
        if (headerViewsCount >= 0) {
            C34201js r1 = (C34201js) documentPickerActivity.A0J.get(headerViewsCount);
            if (documentPickerActivity.A03 != null) {
                documentPickerActivity.A39(r1);
            } else {
                List list = documentPickerActivity.A0M;
                list.clear();
                list.add(r1);
                AnonymousClass01V r6 = documentPickerActivity.A08;
                Resources resources = documentPickerActivity.getResources();
                int size = list.size();
                Object[] objArr = new Object[1];
                AnonymousClass000.A1M(objArr, list.size(), 0);
                AnonymousClass2JP.A00(documentPickerActivity, r6, resources.getQuantityString(R.plurals.plurals00dc, size, objArr));
                documentPickerActivity.A03 = documentPickerActivity.AgA(documentPickerActivity.A0L);
                documentPickerActivity.A0B.notifyDataSetChanged();
                return true;
            }
        }
        return true;
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.documentpicker.DocumentPickerActivity;
import java.io.File;
import java.util.List;

/* renamed from: X.2oT  reason: invalid class name and case insensitive filesystem */
public class C56762oT extends BaseAdapter implements Filterable {
    public final C56802oX A00;
    public final /* synthetic */ DocumentPickerActivity A01;

    public C56762oT(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
        this.A00 = new C56802oX(documentPickerActivity);
    }

    public int getCount() {
        return C13680ns.A07(this.A01.A0J);
    }

    public Filter getFilter() {
        return this.A00;
    }

    public Object getItem(int i2) {
        List list = this.A01.A0J;
        if (list == null) {
            return null;
        }
        return list.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        AnonymousClass4NI r7;
        int i3 = 0;
        if (view != null) {
            r7 = (AnonymousClass4NI) view.getTag();
        } else {
            view = this.A01.getLayoutInflater().inflate(R.layout.layout023a, (ViewGroup) null, false);
            r7 = new AnonymousClass4NI(view);
            view.setTag(r7);
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0J;
        if (list != null) {
            C34201js r5 = (C34201js) list.get(i2);
            ImageView imageView = r7.A01;
            Context context = view.getContext();
            File file = r5.A02;
            String A08 = file == null ? "" : AnonymousClass1XI.A08(file.getAbsolutePath());
            imageView.setImageDrawable(AnonymousClass4Y6.A01(context, C17970vw.A0J(A08), A08, false));
            r7.A04.setText(AnonymousClass2TP.A02(view.getContext(), documentPickerActivity.A0A, file.getName(), documentPickerActivity.A0H));
            r7.A03.setText(AnonymousClass2GQ.A03(documentPickerActivity.A0A, r5.A01));
            TextView textView = r7.A02;
            AnonymousClass013 r0 = documentPickerActivity.A0A;
            long j2 = r5.A00;
            textView.setText(C28961Zl.A0A(r0, j2, false));
            textView.setContentDescription(C28961Zl.A0A(documentPickerActivity.A0A, j2, true));
            View view2 = r7.A00;
            C13680ns.A0t(documentPickerActivity, view2, R.string.str0453);
            if (documentPickerActivity.A0M.contains(r5)) {
                view.setBackgroundResource(R.drawable.contact_row_selection);
            } else {
                view.setBackgroundResource(0);
                i3 = 8;
            }
            view2.setVisibility(i3);
        }
        return view;
    }

    public boolean isEmpty() {
        return false;
    }
}

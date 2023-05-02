package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.support.faq.SearchFAQ;
import java.util.List;

/* renamed from: X.2oE  reason: invalid class name and case insensitive filesystem */
public class C56622oE extends ArrayAdapter {
    public final /* synthetic */ SearchFAQ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56622oE(Context context, SearchFAQ searchFAQ, List list) {
        super(context, R.layout.layout0519, list);
        this.A00 = searchFAQ;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        C84004Iw r0;
        LinearLayout linearLayout;
        if (view == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            LayoutInflater A01 = AnonymousClass01V.A01(getContext());
            AnonymousClass00B.A06(A01);
            A01.inflate(R.layout.layout0519, linearLayout2, true);
            r0 = new C84004Iw();
            r0.A01 = C13680ns.A0M(linearLayout2, R.id.search_faq_row_text);
            r0.A00 = linearLayout2.findViewById(R.id.divider);
            linearLayout2.setTag(r0);
            linearLayout = linearLayout2;
        } else {
            r0 = (C84004Iw) view.getTag();
            linearLayout = view;
        }
        Object item = getItem(i2);
        AnonymousClass00B.A06(item);
        C84884Mg r3 = (C84884Mg) item;
        r0.A01.setText(r3.A02);
        View view2 = r0.A00;
        int i3 = 8;
        if (i2 < getCount() - 1) {
            i3 = 0;
        }
        view2.setVisibility(i3);
        C13690nt.A1A(linearLayout, this, r3, 19);
        return linearLayout;
    }
}

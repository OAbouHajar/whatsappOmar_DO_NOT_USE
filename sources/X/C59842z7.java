package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape3S1100000_I1;
import com.google.android.material.chip.ChipGroup;
import com.obwhatsapp.R;
import java.util.Iterator;

/* renamed from: X.2z7  reason: invalid class name and case insensitive filesystem */
public final class C59842z7 extends C72823ml {
    public final View A00;
    public final TextView A01;
    public final ChipGroup A02;

    public C59842z7(View view) {
        super(view);
        this.A00 = view;
        this.A02 = (ChipGroup) C18450wi.A00(view, R.id.suggestion_chip_group);
        this.A01 = (TextView) C18450wi.A00(view, R.id.title);
    }

    public /* bridge */ /* synthetic */ void A08(Object obj) {
        C72203lj r9 = (C72203lj) obj;
        C18450wi.A0H(r9, 0);
        TextView textView = this.A01;
        View view = this.A00;
        C13690nt.A0s(view.getContext(), textView, R.string.str01ed);
        ChipGroup chipGroup = this.A02;
        chipGroup.removeAllViews();
        Iterator it = r9.A00.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            Context context = view.getContext();
            C18450wi.A0B(context);
            View inflate = LayoutInflater.from(context).inflate(R.layout.layout0530, chipGroup, false);
            if (inflate != null) {
                TextView textView2 = (TextView) inflate;
                textView2.setText(A0m);
                textView2.setOnClickListener(new ViewOnClickCListenerShape3S1100000_I1(1, A0m, r9));
                chipGroup.addView(textView2);
            } else {
                throw AnonymousClass000.A0W("null cannot be cast to non-null type com.google.android.material.chip.Chip");
            }
        }
    }
}

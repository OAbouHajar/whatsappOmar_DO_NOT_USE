package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.363  reason: invalid class name */
public class AnonymousClass363 extends C16690tT {
    public final ArrayList A00;
    public final List A01;
    public final /* synthetic */ C32501gU A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass363(C32501gU r2, List list, List list2) {
        super(r2, true);
        this.A02 = r2;
        this.A00 = list != null ? C13680ns.A0n(list) : null;
        this.A01 = list2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C16010sH A0U = C13680ns.A0U(it);
            if (C16080sP.A01(this.A02.A0B, A0U, this.A00)) {
                A0u.add(A0U);
            }
        }
        return A0u;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        String A0d;
        C32501gU r5 = this.A02;
        r5.A03 = null;
        AnonymousClass2A8 r2 = r5.A0M;
        r2.A00 = (List) obj;
        r2.notifyDataSetChanged();
        View findViewById = r5.findViewById(16908292);
        if (r2.isEmpty()) {
            findViewById.setVisibility(0);
            if (TextUtils.isEmpty(r5.A0G)) {
                A0d = r5.getString(R.string.str0565);
            } else {
                A0d = C13680ns.A0d(r5, r5.A0G, C13680ns.A1b(), 0, R.string.str14a8);
            }
            TextView A0N = C13680ns.A0N(r5, R.id.search_no_matches);
            A0N.setText(A0d);
            A0N.setVisibility(0);
            findViewById = r5.findViewById(R.id.init_contacts_progress);
        }
        findViewById.setVisibility(8);
    }
}

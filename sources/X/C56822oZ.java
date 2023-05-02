package X;

import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.widget.Filter;
import com.obwhatsapp.status.StatusesFragment;
import com.obwhatsapp.yo.yo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2oZ  reason: invalid class name and case insensitive filesystem */
public class C56822oZ extends Filter {
    public final /* synthetic */ StatusesFragment A00;

    public C56822oZ(StatusesFragment statusesFragment) {
        this.A00 = statusesFragment;
    }

    public List A00(ArrayList arrayList, List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30991dI r3 = (C30991dI) it.next();
            StatusesFragment statusesFragment = this.A00;
            if (C16080sP.A01(statusesFragment.A0G, statusesFragment.A0E.A0A(r3.A0B), arrayList)) {
                A0u.add(new C63303Gx(r3));
            }
        }
        return A0u;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(charSequence)) {
            StatusesFragment statusesFragment = this.A00;
            C30991dI r7 = statusesFragment.A0u.A00;
            C30991dI r6 = r7;
            if (r7 == null) {
                r7 = new C30991dI(statusesFragment.A0N, statusesFragment.A0Z, C34091jg.A00, 0, 0, -1, -1, -1, -1, -1, 0);
            }
            A0u.add(new C63303Gx(r7));
            if (r6 != null && statusesFragment.A0m.A01()) {
                A0u.add(new C63313Gy(statusesFragment));
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            arrayList = C40661uU.A02(this.A00.A0R, charSequence.toString());
        }
        StatusesFragment statusesFragment2 = this.A00;
        List A002 = A00(arrayList, statusesFragment2.A0u.A02);
        List A003 = A00(arrayList, statusesFragment2.A0u.A03);
        List A004 = A00(arrayList, statusesFragment2.A0u.A01);
        boolean isEmpty = A002.isEmpty();
        if (!yo.HideRStatus() && !isEmpty) {
            A0u.add(new C63293Gw(statusesFragment2, 0));
            A0u.addAll(A002);
        }
        boolean isEmpty2 = A003.isEmpty();
        if (!yo.HideVStatus() && !isEmpty2) {
            A0u.add(new C63293Gw(statusesFragment2, 1));
            A0u.addAll(A003);
        }
        filterResults.values = new C83944Iq(A0u, A004);
        filterResults.count = A0u.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj = filterResults.values;
        if (obj != null) {
            C83944Iq r1 = (C83944Iq) obj;
            StatusesFragment statusesFragment = this.A00;
            statusesFragment.A12 = r1.A00;
            List list = r1.A01;
            statusesFragment.A13 = list;
            boolean isEmpty = list.isEmpty();
            if (!yo.HideMStatus() && !isEmpty) {
                statusesFragment.A12.add(new C63293Gw(statusesFragment, 2));
                if (!statusesFragment.A18 || statusesFragment.A16 || !statusesFragment.A15) {
                    statusesFragment.A12.addAll(statusesFragment.A13);
                }
            }
        }
        StatusesFragment statusesFragment2 = this.A00;
        statusesFragment2.A10 = charSequence;
        statusesFragment2.A11 = C40661uU.A02(statusesFragment2.A0R, charSequence == null ? null : charSequence.toString());
        statusesFragment2.A1E();
        AnimatorSet animatorSet = statusesFragment2.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
            statusesFragment2.A00 = null;
        }
        statusesFragment2.A0i.notifyDataSetChanged();
    }
}

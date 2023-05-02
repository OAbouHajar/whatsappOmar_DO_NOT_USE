package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.group.GroupAdminPickerActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.36L  reason: invalid class name */
public class AnonymousClass36L extends C16690tT {
    public final C16080sP A00;
    public final AnonymousClass013 A01;
    public final String A02;
    public final WeakReference A03;
    public final List A04;

    public AnonymousClass36L(C16080sP r3, AnonymousClass013 r4, GroupAdminPickerActivity groupAdminPickerActivity, String str, List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        this.A04 = A0u;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = C13690nt.A0h(groupAdminPickerActivity);
        A0u.addAll(list);
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A02;
        if (TextUtils.isEmpty(str)) {
            return this.A04;
        }
        ArrayList A0u = AnonymousClass000.A0u();
        AnonymousClass013 r5 = this.A01;
        ArrayList A022 = C40661uU.A02(r5, str);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C16010sH A0U = C13680ns.A0U(it);
            if (this.A00.A0T(A0U, A022, true) || C40661uU.A03(r5, A0U.A0W, A022, true)) {
                A0u.add(A0U);
            }
        }
        return A0u;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        List list = (List) obj;
        GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A03.get();
        if (groupAdminPickerActivity != null && !groupAdminPickerActivity.AIm()) {
            AnonymousClass2r5 r2 = groupAdminPickerActivity.A0I;
            String str = groupAdminPickerActivity.A0N;
            r2.A01 = list;
            r2.A00 = C40661uU.A02(r2.A02.A0D, str);
            r2.A01();
            TextView A0N = C13680ns.A0N(groupAdminPickerActivity, R.id.search_no_matches);
            if (!list.isEmpty() || TextUtils.isEmpty(groupAdminPickerActivity.A0N)) {
                A0N.setVisibility(8);
                return;
            }
            A0N.setVisibility(0);
            A0N.setText(C13680ns.A0d(groupAdminPickerActivity, groupAdminPickerActivity.A0N, C13680ns.A1b(), 0, R.string.str14a8));
        }
    }
}

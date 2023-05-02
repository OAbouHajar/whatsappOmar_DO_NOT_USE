package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.obwhatsapp.R;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.2oV  reason: invalid class name and case insensitive filesystem */
public class C56782oV extends Filter {
    public final /* synthetic */ C56772oU A00;

    public C56782oV(C56772oU r1) {
        this.A00 = r1;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList A0u = AnonymousClass000.A0u();
            String charSequence2 = charSequence.toString();
            C56772oU r2 = this.A00;
            GroupChatInfoActivity groupChatInfoActivity = r2.A07;
            ArrayList A02 = C40661uU.A02(groupChatInfoActivity.A08, charSequence2);
            boolean contains = AnonymousClass1ZW.A09(charSequence).contains(AnonymousClass1ZW.A09(groupChatInfoActivity.getString(R.string.str0a2c)));
            for (AnonymousClass2OF r5 : r2.A02) {
                if (r5 instanceof AnonymousClass2OE) {
                    C16010sH r8 = ((AnonymousClass2OE) r5).A00;
                    if (!groupChatInfoActivity.A0f.A0T(r8, A02, true)) {
                        if (!C40661uU.A03(groupChatInfoActivity.A08, r8.A0W, A02, true)) {
                            if (contains) {
                                C16070sO r22 = groupChatInfoActivity.A0C;
                                C16050sL r1 = groupChatInfoActivity.A1M;
                                Jid A03 = C16010sH.A03(r8);
                                AnonymousClass00B.A06(A03);
                                if (!r22.A0F(r1, (UserJid) A03)) {
                                }
                            }
                        }
                    }
                    A0u.add(r5);
                }
            }
            boolean isEmpty = A0u.isEmpty();
            arrayList = A0u;
            if (isEmpty) {
                A0u.add(0, new AnonymousClass2OG(charSequence.toString()));
                arrayList = A0u;
            }
        } else {
            arrayList = this.A00.A02;
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj = filterResults.values;
        this.A00.A01(obj == null ? this.A00.A02 : (ArrayList) obj);
    }
}

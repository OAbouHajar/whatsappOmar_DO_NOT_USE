package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2oa  reason: invalid class name and case insensitive filesystem */
public class C56832oa extends Filter {
    public CharSequence A00 = "";
    public final /* synthetic */ CallsHistoryFragmentV2ViewModel A01;

    public C56832oa(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel) {
        this.A01 = callsHistoryFragmentV2ViewModel;
    }

    public final void A00(C616739v r5, AnonymousClass5P6 r6, ArrayList arrayList, ArrayList arrayList2, HashSet hashSet) {
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A01;
        C16010sH A04 = r5.A04(callsHistoryFragmentV2ViewModel.A0D, callsHistoryFragmentV2ViewModel.A0I, callsHistoryFragmentV2ViewModel.A0J, arrayList);
        if (A04 != null) {
            arrayList2.add(r6);
            ArrayList arrayList3 = r5.A04;
            if (arrayList3.isEmpty() || ((C37831po) arrayList3.get(0)).A04 == null) {
                Jid A03 = C16010sH.A03(A04);
                if (A03 == null) {
                    Log.w("CallsHistoryViewModel/performFiltering contact user jid is null");
                } else {
                    hashSet.add(A03);
                }
            }
        }
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        UserJid userJid;
        this.A00 = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        HashSet A0o = C13680ns.A0o();
        ArrayList A0u = AnonymousClass000.A0u();
        Filter.FilterResults filterResults = new Filter.FilterResults();
        String charSequence2 = charSequence.toString();
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A01;
        ArrayList A02 = C40661uU.A02(callsHistoryFragmentV2ViewModel.A0G, charSequence2);
        Iterator it = callsHistoryFragmentV2ViewModel.A04.iterator();
        while (it.hasNext()) {
            C101134wl r7 = (C101134wl) it.next();
            A00(r7.A01, r7, A02, A0u, A0o);
        }
        if (!A0u.isEmpty()) {
            A0u.add(0, callsHistoryFragmentV2ViewModel.A0L.get(0));
        }
        int size = A0u.size();
        Iterator it2 = callsHistoryFragmentV2ViewModel.A03.iterator();
        while (it2.hasNext()) {
            C101124wk r72 = (C101124wk) it2.next();
            A00(r72.A01, r72, A02, A0u, A0o);
        }
        if (A0u.size() > size) {
            A0u.add(size, callsHistoryFragmentV2ViewModel.A0L.get(C13680ns.A0Y()));
            size = A0u.size();
        }
        synchronized (this) {
            if (callsHistoryFragmentV2ViewModel.A05 == null) {
                ArrayList A0u2 = AnonymousClass000.A0u();
                callsHistoryFragmentV2ViewModel.A05 = A0u2;
                callsHistoryFragmentV2ViewModel.A0D.A0Y(A0u2);
            }
            arrayList = callsHistoryFragmentV2ViewModel.A05;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C16010sH A0U = C13680ns.A0U(it3);
            if (A0U.A0D != null && (userJid = (UserJid) C16010sH.A03(A0U)) != null && !A0o.contains(userJid) && C16080sP.A01(callsHistoryFragmentV2ViewModel.A0E, A0U, A02)) {
                A0u.add(new C101104wi(userJid));
            }
        }
        if (A0u.size() > size) {
            A0u.add(size, callsHistoryFragmentV2ViewModel.A0L.get(C13680ns.A0Z()));
        }
        filterResults.values = C13680ns.A0n(A0u);
        filterResults.count = A0u.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A01;
        if (filterResults == null) {
            callsHistoryFragmentV2ViewModel.A06();
        } else {
            ArrayList arrayList = (ArrayList) filterResults.values;
            callsHistoryFragmentV2ViewModel.A02 = arrayList;
            callsHistoryFragmentV2ViewModel.A0K.A0B(arrayList);
        }
        callsHistoryFragmentV2ViewModel.A05();
    }
}

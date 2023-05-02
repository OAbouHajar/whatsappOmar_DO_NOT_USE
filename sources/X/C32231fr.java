package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.Filter;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1fr  reason: invalid class name and case insensitive filesystem */
public class C32231fr extends Filter {
    public ArrayList A00;
    public boolean A01;
    public final Object A02 = new Object();
    public final /* synthetic */ CallsHistoryFragment A03;

    public C32231fr(CallsHistoryFragment callsHistoryFragment) {
        this.A03 = callsHistoryFragment;
    }

    public static /* synthetic */ void A00(C32231fr r2) {
        synchronized (r2.A02) {
            r2.A00 = null;
        }
    }

    public final ArrayList A01(Collection collection) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C616739v r1 = (C616739v) it.next();
            if (r1.A07()) {
                arrayList2.add(new C101064we(r1));
            } else {
                arrayList.add(new C101044wc(r1));
            }
        }
        if (!arrayList.isEmpty()) {
            CallsHistoryFragment callsHistoryFragment = this.A03;
            if (C32601gl.A04(callsHistoryFragment.A06, callsHistoryFragment.A0W)) {
                arrayList.add(0, new C101074wf(callsHistoryFragment.A0J(R.string.str036a)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(0, arrayList2);
            CallsHistoryFragment callsHistoryFragment2 = this.A03;
            if (C32601gl.A04(callsHistoryFragment2.A06, callsHistoryFragment2.A0W)) {
                arrayList.add(0, new C101074wf(callsHistoryFragment2.A0J(R.string.str0369)));
            }
        }
        return arrayList;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        ArrayList arrayList2;
        UserJid userJid;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        this.A01 = true;
        if (!TextUtils.isEmpty(charSequence)) {
            arrayList = new ArrayList();
            String charSequence2 = charSequence.toString();
            CallsHistoryFragment callsHistoryFragment = this.A03;
            ArrayList A022 = C40661uU.A02(callsHistoryFragment.A0S, charSequence2);
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (C616739v r10 : callsHistoryFragment.A0h.values()) {
                C16010sH A04 = r10.A04(callsHistoryFragment.A0J, callsHistoryFragment.A0X, callsHistoryFragment.A0a, A022);
                if (A04 != null) {
                    if (r10.A07()) {
                        arrayList3.add(new C101064we(r10));
                    } else {
                        arrayList.add(new C101044wc(r10));
                    }
                    ArrayList arrayList4 = r10.A04;
                    boolean z2 = false;
                    if (!arrayList4.isEmpty() && ((C37831po) arrayList4.get(0)).A04 != null) {
                        z2 = true;
                    }
                    if (!z2) {
                        Jid A08 = A04.A08(UserJid.class);
                        AnonymousClass00B.A06(A08);
                        hashSet.add(A08);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                if (C32601gl.A04(callsHistoryFragment.A06, callsHistoryFragment.A0W)) {
                    arrayList.add(0, new C101074wf(callsHistoryFragment.A0J(R.string.str036a)));
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList.addAll(0, arrayList3);
                if (C32601gl.A04(callsHistoryFragment.A06, callsHistoryFragment.A0W)) {
                    arrayList.add(0, new C101074wf(callsHistoryFragment.A0J(R.string.str0369)));
                }
            }
            synchronized (this.A02) {
                if (this.A00 == null) {
                    ArrayList arrayList5 = new ArrayList();
                    this.A00 = arrayList5;
                    callsHistoryFragment.A0J.A0Y(arrayList5);
                }
                arrayList2 = this.A00;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C16010sH r9 = (C16010sH) it.next();
                if ((yo.showHiddenInForward() || !yo.H3T((Jid) r9.A0F)) && r9.A0D != null && (userJid = (UserJid) r9.A08(UserJid.class)) != null && !hashSet.contains(userJid) && callsHistoryFragment.A0L.A0T(r9, A022, true)) {
                    if (this.A01) {
                        arrayList.add(new C101074wf(callsHistoryFragment.A0C().getString(R.string.str14ad)));
                        this.A01 = false;
                    }
                    arrayList.add(new C101054wd(userJid));
                }
            }
        } else {
            arrayList = A01(this.A03.A0h.values());
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        CallsHistoryFragment callsHistoryFragment;
        ArrayList arrayList;
        View view;
        Object obj = filterResults.values;
        if (obj == null) {
            Log.e("voip/CallsFragment/publishResults got null values: exception in performFiltering?");
            callsHistoryFragment = this.A03;
            arrayList = A01(callsHistoryFragment.A0h.values());
        } else {
            callsHistoryFragment = this.A03;
            arrayList = (ArrayList) obj;
        }
        callsHistoryFragment.A0g = arrayList;
        callsHistoryFragment.A0e = charSequence;
        callsHistoryFragment.A0f = C40661uU.A02(callsHistoryFragment.A0S, charSequence == null ? null : charSequence.toString());
        callsHistoryFragment.A1F();
        CallsHistoryFragment.A02(callsHistoryFragment);
        if (C32601gl.A04(callsHistoryFragment.A06, callsHistoryFragment.A0W) && callsHistoryFragment.A0A != null && (view = callsHistoryFragment.A01) != null) {
            int i2 = 8;
            if (TextUtils.isEmpty(callsHistoryFragment.A0e)) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }
}

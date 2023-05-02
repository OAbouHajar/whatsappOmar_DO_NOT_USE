package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass4QA;
import X.C001000l;
import X.C101044wc;
import X.C109275Rk;
import X.C13680ns;
import X.C16220sf;
import X.C34091jg;
import X.C54472hZ;
import X.C57702rc;
import X.C59912zL;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.status.StatusConfirmMuteDialogFragment;
import com.obwhatsapp.status.StatusConfirmUnmuteDialogFragment;
import com.obwhatsapp.status.StatusesFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class IDxCListenerShape299S0100000_1_I0 implements AdapterView.OnItemLongClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape299S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onItemLongClick(AdapterView adapterView, View view, int i2, long j2) {
        String obj;
        UserJid userJid;
        if (this.A01 != 0) {
            StatusesFragment statusesFragment = (StatusesFragment) this.A00;
            C57702rc r3 = (C57702rc) view.getTag();
            C001000l A0C = statusesFragment.A0C();
            AnonymousClass00B.A06(A0C);
            if (r3 == null || (userJid = r3.A02) == C34091jg.A00 || A0C.AGM().A0o()) {
                return false;
            }
            C16220sf r0 = statusesFragment.A0d;
            AnonymousClass00B.A06(userJid);
            boolean A0R = r0.A0R(userJid);
            UserJid userJid2 = r3.A02;
            String A1C = statusesFragment.A1C();
            if (A0R) {
                C54472hZ.A01(StatusConfirmUnmuteDialogFragment.A01(userJid2, (Long) null, (String) null, (String) null, A1C, true), statusesFragment);
                return true;
            }
            C54472hZ.A01(StatusConfirmMuteDialogFragment.A01(userJid2, (Long) null, (String) null, (String) null, A1C, true), statusesFragment);
            return true;
        }
        CallsHistoryFragment callsHistoryFragment = (CallsHistoryFragment) this.A00;
        if (!(view.getTag() instanceof AnonymousClass4QA)) {
            return false;
        }
        AnonymousClass4QA r4 = (AnonymousClass4QA) view.getTag();
        if (r4 != null) {
            C109275Rk r32 = r4.A00;
            if (r32.ACu() == 2 && callsHistoryFragment.A0i) {
                if (TextUtils.isEmpty(((C101044wc) r32).A00.A05())) {
                    obj = C13680ns.A0c(i2, "calls/longclick/empty callgroup id/pos ");
                    Log.i(obj);
                    return false;
                }
                callsHistoryFragment.A1J(((C101044wc) r4.A00).A00, (C59912zL) r4);
                return true;
            }
        }
        StringBuilder A0r = AnonymousClass000.A0r("calls/longclick position = ");
        A0r.append(i2);
        A0r.append(" holder == null ? ");
        A0r.append(AnonymousClass000.A1W(r4));
        A0r.append(" searching = ");
        A0r.append(!callsHistoryFragment.A0f.isEmpty());
        obj = A0r.toString();
        Log.i(obj);
        return false;
    }
}

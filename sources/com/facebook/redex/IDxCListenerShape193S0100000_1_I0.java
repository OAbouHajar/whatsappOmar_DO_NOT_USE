package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1BI;
import X.AnonymousClass1yL;
import X.AnonymousClass2AY;
import X.AnonymousClass2XL;
import X.C13680ns;
import X.C14750ph;
import X.C16010sH;
import X.C16080sP;
import X.C16460t6;
import X.C16740tZ;
import X.C24561Gk;
import X.C28381Vw;
import X.C32501gU;
import X.C56002kn;
import X.C84644Li;
import X.C93514jK;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.obwhatsapp.R;
import com.obwhatsapp.blocklist.UnblockDialogFragment;
import com.obwhatsapp.contact.picker.PhoneNumberSelectionDialog;
import com.obwhatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.obwhatsapp.location.LiveLocationPrivacyActivity;
import com.obwhatsapp.status.audienceselector.StatusRecipientsActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IDxCListenerShape193S0100000_1_I0 implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape193S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        SearchView searchView;
        switch (this.A01) {
            case 0:
                C32501gU r4 = (C32501gU) this.A00;
                if (view.getTag() instanceof C84644Li) {
                    UserJid userJid = ((C84644Li) view.getTag()).A03;
                    if (!r4.A06.A0V(userJid)) {
                        Set set = r4.A0T;
                        if (set.contains(userJid)) {
                            set.remove(userJid);
                        } else {
                            set.add(userJid);
                        }
                        if (!TextUtils.isEmpty(r4.A0G) && set.contains(userJid) && (searchView = r4.A05.A02) != null) {
                            EditText editText = (EditText) searchView.findViewById(R.id.search_src_text);
                            editText.setSelection(0, editText.length());
                        }
                        r4.A0S.add(userJid);
                        Handler handler = r4.A0L;
                        Runnable runnable = r4.A0Q;
                        handler.removeCallbacks(runnable);
                        handler.postDelayed(runnable, 200);
                        r4.A37();
                        r4.A0M.notifyDataSetChanged();
                        return;
                    } else if (r4 instanceof StatusRecipientsActivity) {
                        C16010sH A0A = r4.A09.A0A(userJid);
                        C13680ns.A1J(UnblockDialogFragment.A01(new IDxUnblockerShape77S0200000_2_I1(A0A, 0, r4), C13680ns.A0d(r4, r4.A0B.A08(A0A), C13680ns.A1b(), 0, R.string.str1878), R.string.str0242, false), r4);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = (InviteNonWhatsAppContactPickerActivity) this.A00;
                Object itemAtPosition = adapterView.getItemAtPosition(i2);
                if (itemAtPosition instanceof C56002kn) {
                    C56002kn r6 = (C56002kn) itemAtPosition;
                    List list = r6.A01;
                    if (list.size() > 1) {
                        ArrayList A0u = AnonymousClass000.A0u();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C16010sH A0U = C13680ns.A0U(it);
                            String A012 = C24561Gk.A01(A0U);
                            AnonymousClass00B.A06(A012);
                            A0u.add(new C93514jK((String) C16080sP.A00(inviteNonWhatsAppContactPickerActivity, inviteNonWhatsAppContactPickerActivity.A0L, A0U), A012));
                        }
                        AnonymousClass1BI r3 = inviteNonWhatsAppContactPickerActivity.A0I;
                        Integer A37 = inviteNonWhatsAppContactPickerActivity.A37();
                        AnonymousClass2XL r1 = new AnonymousClass2XL();
                        r1.A03 = 1;
                        r1.A04 = A37;
                        Boolean bool = Boolean.TRUE;
                        r1.A02 = bool;
                        r1.A01 = bool;
                        r3.A03.A06(r1);
                        inviteNonWhatsAppContactPickerActivity.Afb(PhoneNumberSelectionDialog.A01(C13680ns.A0d(inviteNonWhatsAppContactPickerActivity, r6.A00, new Object[1], 0, R.string.str0d32), A0u), (String) null);
                        return;
                    }
                    AnonymousClass2AY r2 = inviteNonWhatsAppContactPickerActivity.A0K;
                    String A013 = C24561Gk.A01(r6.AAn());
                    AnonymousClass00B.A06(A013);
                    r2.A0D.A0B(A013);
                    return;
                }
                return;
            default:
                LiveLocationPrivacyActivity liveLocationPrivacyActivity = (LiveLocationPrivacyActivity) this.A00;
                int i3 = i2 - 1;
                if (i3 >= 0 && i3 < liveLocationPrivacyActivity.A0C.getCount()) {
                    C16740tZ A002 = C16460t6.A00(liveLocationPrivacyActivity.A0B, (C28381Vw) ((Pair) liveLocationPrivacyActivity.A0C.A00.A0G.get(i3)).second);
                    C14750ph A0q = C14750ph.A0q();
                    C28381Vw r42 = A002.A11;
                    Intent putExtra = A0q.A0y(liveLocationPrivacyActivity, r42.A00).putExtra("row_id", A002.A13).putExtra("sort_id", A002.A14);
                    AnonymousClass1yL.A00(putExtra, r42);
                    liveLocationPrivacyActivity.A00.A07(liveLocationPrivacyActivity, putExtra);
                    return;
                }
                return;
        }
    }
}

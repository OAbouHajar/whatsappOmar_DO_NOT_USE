package com.obwhatsapp.calling.views;

import X.AnonymousClass000;
import X.AnonymousClass050;
import X.C13680ns;
import X.C13690nt;
import X.C16030sJ;
import X.C32001fU;
import X.C93464jF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class VoipContactPickerDialogFragment extends Hilt_VoipContactPickerDialogFragment {
    public final ContactPickerFragment A00 = new ContactPickerFragment();

    public static VoipContactPickerDialogFragment A01(C93464jF r6, Map map, boolean z2) {
        VoipContactPickerDialogFragment voipContactPickerDialogFragment = new VoipContactPickerDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putBoolean("is_video_call", z2);
        voipContactPickerDialogFragment.A0T(A0D);
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator A0q = C13680ns.A0q(map);
        while (A0q.hasNext()) {
            C32001fU r2 = (C32001fU) A0q.next();
            if (!r2.A0G && r2.A01 != 11) {
                A0u.add(r2.A07);
            }
        }
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putBoolean("for_group_call", true);
        A0D2.putStringArrayList("contacts_to_exclude", C16030sJ.A06(A0u));
        if (r6 != null) {
            A0D2.putParcelable("share_sheet_data", r6);
        }
        ContactPickerFragment contactPickerFragment = voipContactPickerDialogFragment.A00;
        Bundle A0D3 = C13690nt.A0D();
        A0D3.putBundle("extras", A0D2);
        contactPickerFragment.A0T(A0D3);
        return voipContactPickerDialogFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout05f7);
        AnonymousClass050 r2 = new AnonymousClass050(A0F());
        r2.A09(this.A00, R.id.fragment_container);
        r2.A04();
        return A0H;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        if (r1 == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A14() {
        /*
            r5 = this;
            super.A14()
            android.app.Dialog r2 = r5.A03
            if (r2 == 0) goto L_0x0057
            r1 = 1
            com.facebook.redex.IDxKListenerShape224S0100000_2_I1 r0 = new com.facebook.redex.IDxKListenerShape224S0100000_2_I1
            r0.<init>(r5, r1)
            r2.setOnKeyListener(r0)
            android.app.Dialog r0 = r5.A03
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0057
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0057
            android.app.Dialog r0 = r5.A03
            android.view.Window r2 = r0.getWindow()
            android.app.Dialog r0 = r5.A03
            android.content.Context r1 = r0.getContext()
            r0 = 2131101286(0x7f060666, float:1.7814977E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            android.app.Dialog r0 = r5.A03
            android.view.Window r4 = r0.getWindow()
            android.app.Dialog r0 = r5.A03
            android.content.Context r3 = r0.getContext()
            android.os.Bundle r2 = r5.A05
            if (r2 == 0) goto L_0x004d
            r1 = 0
            java.lang.String r0 = "is_video_call"
            boolean r1 = r2.getBoolean(r0, r1)
            r0 = 2131101138(0x7f0605d2, float:1.7814677E38)
            if (r1 != 0) goto L_0x0050
        L_0x004d:
            r0 = 2131101695(0x7f0607ff, float:1.7815807E38)
        L_0x0050:
            int r0 = X.AnonymousClass00T.A00(r3, r0)
            r4.setNavigationBarColor(r0)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.views.VoipContactPickerDialogFragment.A14():void");
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A1E(0, R.style.style039a);
    }
}

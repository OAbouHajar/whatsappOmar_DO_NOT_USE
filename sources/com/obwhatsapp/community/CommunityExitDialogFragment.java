package com.obwhatsapp.community;

import X.AnonymousClass00B;
import X.AnonymousClass2AS;
import X.AnonymousClass3MF;
import X.C003401n;
import X.C004601z;
import X.C006602z;
import X.C14870pt;
import X.C16000sG;
import X.C16030sJ;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C17110uY;
import X.C17220uj;
import X.C19980zJ;
import X.C32241fu;
import X.C39461sW;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommunityExitDialogFragment extends Hilt_CommunityExitDialogFragment {
    public C19980zJ A00;
    public C14870pt A01;
    public C16000sG A02;
    public C16080sP A03;
    public C16070sO A04;
    public C16050sL A05;
    public C17220uj A06;
    public C17110uY A07;

    public static CommunityExitDialogFragment A01(C16050sL r4, List list) {
        Bundle bundle = new Bundle();
        bundle.putString("parent_jid", r4.getRawString());
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C39461sW) it.next()).A02);
        }
        bundle.putStringArrayList("subgroup_jids", C16030sJ.A06(arrayList));
        CommunityExitDialogFragment communityExitDialogFragment = new CommunityExitDialogFragment();
        communityExitDialogFragment.A0T(bundle);
        return communityExitDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        int i2;
        IDxCListenerShape127S0100000_2_I0 iDxCListenerShape127S0100000_2_I0;
        C16050sL A052 = C16050sL.A05(A04().getString("parent_jid"));
        AnonymousClass00B.A06(A052);
        this.A05 = A052;
        List A08 = C16030sJ.A08(C16050sL.class, A04().getStringArrayList("subgroup_jids"));
        C32241fu r5 = new C32241fu(A0D());
        int size = A08.size();
        if (this.A04.A0E(this.A05)) {
            r5.A06(A0J(R.string.str0885));
            r5.setNegativeButton(R.string.str064b, new IDxCListenerShape127S0100000_2_I0(this, 39));
            i2 = R.string.str0e87;
            iDxCListenerShape127S0100000_2_I0 = new IDxCListenerShape127S0100000_2_I0(this, 41);
        } else {
            C003401n A012 = new C006602z(A0D()).A01(AnonymousClass2AS.class);
            String A0J = this.A03.A0J(this.A05);
            int i3 = R.string.str0883;
            if (A0J == null) {
                i3 = R.string.str0884;
            }
            String A0K = A0K(i3, A0J, "learn-more");
            View inflate = View.inflate(A0u(), R.layout.layout0228, (ViewGroup) null);
            TextView textView = (TextView) C004601z.A0E(inflate, R.id.dialog_text_message);
            textView.setText(this.A07.A06(new RunnableRunnableShape5S0100000_I0_4((Object) this, 29), A0K, "learn-more"));
            textView.setMovementMethod(new AnonymousClass3MF());
            r5.setView(inflate);
            r5.setTitle(A03().getQuantityString(R.plurals.plurals008e, size, new Object[]{Integer.valueOf(size)}));
            r5.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 40));
            i2 = R.string.str0881;
            iDxCListenerShape127S0100000_2_I0 = new IDxCListenerShape127S0100000_2_I0(A012, 42);
        }
        r5.setPositiveButton(i2, iDxCListenerShape127S0100000_2_I0);
        return r5.create();
    }
}

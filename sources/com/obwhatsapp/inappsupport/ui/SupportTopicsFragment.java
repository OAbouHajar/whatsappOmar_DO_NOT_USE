package com.obwhatsapp.inappsupport.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass3CN;
import X.C19980zJ;
import X.C56682oK;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.obwhatsapp.R;
import java.util.ArrayList;

public class SupportTopicsFragment extends Hilt_SupportTopicsFragment {
    public AnonymousClass3CN A00;
    public SupportTopicsActivity A01;
    public ArrayList A02;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2 = 0;
        View inflate = layoutInflater.inflate(R.layout.layout05a5, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.topic_list_header);
        if (this.A01.A01 != 2) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        ((AbsListView) inflate.findViewById(R.id.topic_list)).setAdapter(new C56682oK(this.A01, this.A02));
        return inflate;
    }

    public void A16(Context context) {
        if (C19980zJ.A00(context) instanceof SupportTopicsActivity) {
            this.A01 = (SupportTopicsActivity) C19980zJ.A00(context);
            super.A16(context);
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("SupportTopicsFragment");
        A0r.append(" can only be used with ");
        throw AnonymousClass000.A0V(AnonymousClass000.A0h("SupportTopicsActivity", A0r));
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A00 = (AnonymousClass3CN) A04().getParcelable("parent_topic");
        ArrayList parcelableArrayList = A04().getParcelableArrayList("topics");
        AnonymousClass00B.A06(parcelableArrayList);
        this.A02 = parcelableArrayList;
    }
}

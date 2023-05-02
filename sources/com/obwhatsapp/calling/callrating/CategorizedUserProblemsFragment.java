package com.obwhatsapp.calling.callrating;

import X.AnonymousClass000;
import X.AnonymousClass01D;
import X.AnonymousClass01X;
import X.AnonymousClass3K4;
import X.AnonymousClass42O;
import X.C004601z;
import X.C106225Da;
import X.C106235Db;
import X.C106245Dc;
import X.C15220qW;
import X.C18450wi;
import X.C32521gW;
import X.C50322Za;
import X.C78513yC;
import X.C87054Ve;
import X.C93744jh;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.util.ArrayList;

public final class CategorizedUserProblemsFragment extends Hilt_CategorizedUserProblemsFragment {
    public View A00;
    public AnonymousClass01D A01;
    public final C15220qW A02 = C32521gW.A00(new C106225Da(this));
    public final C15220qW A03 = C32521gW.A00(new C106235Db(this));
    public final C15220qW A04 = C32521gW.A00(new C106245Dc(this));

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        return AnonymousClass3K4.A0K(layoutInflater, viewGroup, R.layout.layout00d7);
    }

    public void A13() {
        super.A13();
        this.A00 = null;
    }

    public void A18(Bundle bundle, View view) {
        View view2 = view;
        C18450wi.A0H(view2, 0);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.user_problems_recycler_view);
        int i2 = 0;
        C004601z.A0p(recyclerView, false);
        view2.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter((AnonymousClass01X) this.A03.getValue());
        View findViewById = view2.findViewById(R.id.user_problem_free_text_layout);
        C15220qW r7 = this.A04;
        int A0D = AnonymousClass000.A0D(this.A02.getValue());
        ArrayList arrayList = ((CallRatingViewModel) r7.getValue()).A0D;
        if (A0D >= arrayList.size() || ((C87054Ve) arrayList.get(A0D)).A00 != AnonymousClass42O.A02) {
            i2 = 8;
        } else {
            AnonymousClass01D r0 = this.A01;
            if (r0 != null) {
                C50322Za r3 = (C50322Za) r0.get();
                WaEditText waEditText = (WaEditText) AnonymousClass3K4.A0L(view2, R.id.user_problem_descriptive_text);
                CallRatingViewModel callRatingViewModel = (CallRatingViewModel) r7.getValue();
                C18450wi.A0H(waEditText, 0);
                C18450wi.A0H(callRatingViewModel, 1);
                waEditText.setFilters(new C93744jh[]{new C93744jh(1024)});
                waEditText.addTextChangedListener(new C78513yC(waEditText, callRatingViewModel, r3.A00, r3.A01, r3.A02, r3.A03));
            } else {
                throw C18450wi.A03("userFeedbackTextFilter");
            }
        }
        findViewById.setVisibility(i2);
        this.A00 = findViewById;
    }
}

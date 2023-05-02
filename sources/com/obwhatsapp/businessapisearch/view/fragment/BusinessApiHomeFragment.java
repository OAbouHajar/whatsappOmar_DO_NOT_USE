package com.obwhatsapp.businessapisearch.view.fragment;

import X.AnonymousClass026;
import X.AnonymousClass04o;
import X.AnonymousClass071;
import X.AnonymousClass2Xo;
import X.AnonymousClass4QK;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C14710pd;
import X.C16620tM;
import X.C23061Ai;
import X.C57192qQ;
import X.C57262qa;
import X.C71833l7;
import X.C82364Cn;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape33S0100000_1_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import java.util.ArrayList;
import java.util.Collection;

public class BusinessApiHomeFragment extends Hilt_BusinessApiHomeFragment {
    public RecyclerView A00;
    public C82364Cn A01;
    public AnonymousClass2Xo A02;
    public C57262qa A03;
    public C14710pd A04;
    public AnonymousClass4QK A05;
    public C23061Ai A06;
    public final AnonymousClass071 A07 = new IDxSListenerShape33S0100000_1_I0(this, 1);

    public static BusinessApiHomeFragment A01(int i2) {
        BusinessApiHomeFragment businessApiHomeFragment = new BusinessApiHomeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_home_view_state", i2);
        businessApiHomeFragment.A0T(bundle);
        return businessApiHomeFragment;
    }

    public void A0l(Bundle bundle) {
        this.A0V = true;
        A1B().A03 = this;
    }

    public void A0s(Bundle bundle) {
        C57262qa r0 = this.A03;
        r0.A05.A06("arg_home_view_state", Integer.valueOf(r0.A00));
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout008f, viewGroup, false);
        this.A00 = (RecyclerView) C004601z.A0E(inflate, R.id.home_list);
        if (this.A04.A0E(C16620tM.A02, 2806)) {
            RecyclerView recyclerView = this.A00;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), 0, this.A00.getPaddingRight(), this.A00.getPaddingBottom());
        }
        A0u();
        this.A00.setLayoutManager(new LinearLayoutManager(1));
        this.A00.A0o(this.A07);
        this.A00.setAdapter(this.A02);
        this.A03.A04.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 59));
        this.A03.A09.A01.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 57));
        return inflate;
    }

    public void A12() {
        super.A12();
        A1B().A03 = null;
    }

    public void A16(Context context) {
        super.A16(context);
        A1B().A03 = this;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        C57262qa r0 = (C57262qa) new C006602z((AnonymousClass04o) new C57192qQ(bundle, this, this.A01, A04().getInt("arg_home_view_state")), (C001500q) this).A01(C57262qa.class);
        this.A03 = r0;
        r0.A0C.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 58));
    }

    public BusinessApiSearchActivity A1B() {
        if (A0D() instanceof BusinessApiSearchActivity) {
            return (BusinessApiSearchActivity) A0D();
        }
        throw new IllegalStateException("BusinessApiHomeFragment should be attached to BusinessApiSearchActivity");
    }

    public void A1C() {
        C57262qa r5 = this.A03;
        if (r5.A00 == 0) {
            r5.A00 = 1;
            AnonymousClass026 r4 = r5.A04;
            if (r4.A01() != null) {
                ArrayList arrayList = new ArrayList((Collection) r4.A01());
                if (arrayList.isEmpty() || !(arrayList.get(0) instanceof C71833l7)) {
                    arrayList.add(0, new C71833l7(r5.A01));
                }
                r5.A0C.A0B(3);
                r4.A0B(arrayList);
                return;
            }
            return;
        }
        r5.A0C.A09(4);
    }
}

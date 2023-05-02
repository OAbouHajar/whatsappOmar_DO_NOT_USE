package com.obwhatsapp;

import X.AnonymousClass00B;
import X.AnonymousClass2r2;
import X.C018208n;
import X.C14710pd;
import X.C16620tM;
import X.C211613a;
import X.C35021lF;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape323S0100000_2_I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntentChooserBottomSheetDialogFragment extends Hilt_IntentChooserBottomSheetDialogFragment {
    public int A00;
    public int A01;
    public GridLayoutManager A02;
    public RecyclerView A03;
    public C14710pd A04;
    public C211613a A05;
    public Integer A06;
    public ArrayList A07;

    public static IntentChooserBottomSheetDialogFragment A01(List list, int i2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("title_resource", i2);
        bundle.putParcelableArrayList("choosable_intents", new ArrayList(list));
        bundle.putInt("request_code", i3);
        IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = new IntentChooserBottomSheetDialogFragment();
        intentChooserBottomSheetDialogFragment.A0T(bundle);
        return intentChooserBottomSheetDialogFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean A0E = this.A04.A0E(C16620tM.A02, 689);
        int i2 = R.layout.layout0358;
        if (A0E) {
            i2 = R.layout.layout0359;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup, false);
        Bundle A042 = A04();
        this.A00 = A042.getInt("request_code");
        ArrayList parcelableArrayList = A042.getParcelableArrayList("choosable_intents");
        AnonymousClass00B.A06(parcelableArrayList);
        this.A07 = new ArrayList(parcelableArrayList);
        this.A01 = A042.getInt("title_resource");
        if (A042.containsKey("parent_fragment")) {
            this.A06 = Integer.valueOf(A042.getInt("parent_fragment"));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.A03 = (RecyclerView) inflate.findViewById(R.id.intent_recycler);
        int A1N = A1N();
        A02();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(A1N);
        this.A02 = gridLayoutManager;
        this.A03.setLayoutManager(gridLayoutManager);
        ArrayList arrayList = this.A07;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C35021lF r1 = (C35021lF) it.next();
            if (r1.A04) {
                arrayList2.add(r1);
                it.remove();
            }
        }
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        if (toolbar != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C35021lF r7 = (C35021lF) it2.next();
                Drawable drawable = A03().getDrawable(r7.A05);
                if (r7.A02 != null) {
                    drawable = C018208n.A03(drawable);
                    C018208n.A0A(drawable, r7.A02.intValue());
                }
                toolbar.getMenu().add(0, r7.A00, 0, r7.A06).setIcon(drawable).setIntent(r7.A07).setShowAsAction(r7.A01);
            }
            toolbar.A0R = new IDxCListenerShape323S0100000_2_I0(this, 0);
        }
        this.A03.setAdapter(new AnonymousClass2r2(this, this.A07));
        textView.setText(this.A01);
        return inflate;
    }

    public final int A1N() {
        if (!this.A04.A0E(C16620tM.A02, 689)) {
            return 4;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        A0D().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels / A03().getDimensionPixelSize(R.dimen.dimen049a);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int A1N = A1N();
        A02();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(A1N);
        this.A02 = gridLayoutManager;
        this.A03.setLayoutManager(gridLayoutManager);
    }
}

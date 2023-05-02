package com.obwhatsapp.gallery;

import X.AnonymousClass01X;
import X.AnonymousClass05J;
import X.AnonymousClass2BF;
import X.AnonymousClass2OM;
import X.C14710pd;
import X.C16620tM;
import X.C18450wi;
import X.C54362hJ;
import X.C54502hd;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class NewMediaPickerFragment extends Hilt_NewMediaPickerFragment {
    public LayoutInflater A00;
    public Menu A01;
    public View A02;
    public ViewGroup A03;
    public RecyclerView A04;
    public final Set A05 = new LinkedHashSet();

    public void A0z(Menu menu, MenuInflater menuInflater) {
        C18450wi.A0H(menu, 0);
        C18450wi.A0H(menuInflater, 1);
        super.A0z(menu, menuInflater);
        this.A01 = menu;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        this.A00 = layoutInflater;
        View A11 = super.A11(bundle, layoutInflater, viewGroup);
        if (A11 == null) {
            return null;
        }
        View findViewById = A11.findViewById(R.id.root);
        C18450wi.A0B(findViewById);
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        viewGroup2.addView(layoutInflater.inflate(R.layout.layout02ae, viewGroup2, false));
        return A11;
    }

    public void A13() {
        super.A13();
        View view = this.A02;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        this.A02 = null;
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.setAdapter((AnonymousClass01X) null);
        }
        this.A04 = null;
        this.A03 = null;
    }

    public void A14() {
        super.A14();
        A1Q();
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        super.A18(bundle, view);
        this.A03 = (ViewGroup) view.findViewById(R.id.gallery_selected_container);
        C18450wi.A0B(view.getContext());
        View findViewById = view.findViewById(R.id.gallery_selected_media);
        C18450wi.A0B(findViewById);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.A04 = recyclerView;
        recyclerView.A0h = true;
        LayoutInflater layoutInflater = this.A00;
        if (layoutInflater == null) {
            C18450wi.A0O("inflater");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        AnonymousClass2OM r1 = this.A0L;
        C18450wi.A0A(r1);
        recyclerView.setAdapter(new C54362hJ(layoutInflater, r1));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.A1P(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        View findViewById2 = view.findViewById(R.id.gallery_done_btn);
        C18450wi.A0B(findViewById2);
        this.A02 = findViewById2;
        findViewById2.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 4));
    }

    public boolean A1M(AnonymousClass2BF r3, C54502hd r4) {
        Menu menu;
        Menu menu2;
        C18450wi.A0H(r3, 0);
        C18450wi.A0H(r4, 1);
        if (!A1K() && (menu = this.A01) != null && menu.size() > 0 && (menu2 = this.A01) != null) {
            MenuItem item = menu2.getItem(0);
            C18450wi.A0B(item);
            A10(item);
        }
        return super.A1M(r3, r4);
    }

    public void A1N() {
        super.A1N();
        this.A05.clear();
        A1Q();
    }

    public void A1O(AnonymousClass2BF r8) {
        ViewGroup viewGroup;
        AnonymousClass05J r0;
        C54362hJ r1;
        int i2;
        super.A1O(r8);
        boolean A1K = A1K();
        Set set = this.A05;
        if (A1K) {
            if (!set.remove(r8)) {
                if (!this.A0H && set.size() >= (i2 = this.A01) && !this.A0F) {
                    C14710pd r12 = this.A0F;
                    C16620tM r4 = C16620tM.A02;
                    this.A01 = i2 + (r12.A03(r4, 2693) - this.A0F.A03(r4, 2614));
                    this.A0F = true;
                }
                if (set.size() < this.A01) {
                    set.add(r8);
                }
            }
            int i3 = 8;
            if (!set.isEmpty()) {
                i3 = 0;
            }
            ViewGroup viewGroup2 = this.A03;
            if ((viewGroup2 == null || viewGroup2.getVisibility() != i3) && (viewGroup = this.A03) != null) {
                viewGroup.setVisibility(i3);
            }
            RecyclerView recyclerView = this.A04;
            AnonymousClass01X r13 = null;
            if (recyclerView != null) {
                r13 = recyclerView.A0N;
            }
            if ((r13 instanceof C54362hJ) && (r1 = (C54362hJ) r13) != null) {
                List list = r1.A02;
                list.clear();
                list.addAll(set);
                r1.A01();
            }
            if (set.isEmpty() && (r0 = this.A05) != null) {
                r0.A05();
                return;
            }
            return;
        }
        set.add(r8);
    }

    public final void A1Q() {
        ViewGroup viewGroup;
        C54362hJ r1;
        if (new ArrayList(this.A0I.A00.values()).isEmpty()) {
            this.A05.clear();
        }
        Set set = this.A05;
        int i2 = 8;
        if (!set.isEmpty()) {
            i2 = 0;
        }
        ViewGroup viewGroup2 = this.A03;
        if ((viewGroup2 == null || viewGroup2.getVisibility() != i2) && (viewGroup = this.A03) != null) {
            viewGroup.setVisibility(i2);
        }
        RecyclerView recyclerView = this.A04;
        AnonymousClass01X r12 = null;
        if (recyclerView != null) {
            r12 = recyclerView.A0N;
        }
        if ((r12 instanceof C54362hJ) && (r1 = (C54362hJ) r12) != null) {
            List list = r1.A02;
            list.clear();
            list.addAll(set);
            r1.A01();
        }
    }
}

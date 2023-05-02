package com.whatsapp.stickers.store;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass0Bo;
import X.AnonymousClass2SR;
import X.AnonymousClass3PO;
import X.C004601z;
import X.C13680ns;
import X.C447725m;
import X.C47812Kr;
import X.C59262vc;
import X.C95454mf;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxCListenerShape273S0100000_2_I1;
import com.facebook.redex.IDxObjectShape302S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.facebook.redex.ViewOnClickCListenerShape20S0100000_I1_5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape46S0100000_2_I1;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.R;

public class StickerStoreActivity extends C59262vc {
    public View A00;
    public ViewPager A01;
    public BottomSheetBehavior A02;
    public TabLayout A03;
    public AnonymousClass013 A04;
    public AnonymousClass3PO A05;
    public StickerStoreFeaturedTabFragment A06;
    public StickerStoreMyTabFragment A07;

    public final void A35(AnonymousClass01A r3, int i2) {
        this.A05.A00.add(r3);
        TabLayout tabLayout = this.A03;
        C47812Kr A032 = tabLayout.A03();
        A032.A02(i2);
        tabLayout.A0E(A032);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1 && i3 == 1 && this.A05 != null) {
            this.A01.postDelayed(new RunnableRunnableShape20S0100000_I1_3(this, 15), 300);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0589);
        View view = this.A00;
        this.A00 = view;
        View findViewById = view.findViewById(R.id.store_container);
        this.A03 = (TabLayout) this.A00.findViewById(R.id.sticker_store_tabs);
        this.A01 = (ViewPager) this.A00.findViewById(R.id.sticker_store_pager);
        this.A05 = new AnonymousClass3PO(AGM());
        this.A06 = new StickerStoreFeaturedTabFragment();
        this.A07 = new StickerStoreMyTabFragment();
        this.A06.A05 = AnonymousClass000.A1W(bundle);
        C004601z.A0f(this.A03, 0);
        if (C13680ns.A1Z(this.A04)) {
            A35(this.A06, R.string.str16d9);
            A35(this.A07, R.string.str16db);
        } else {
            A35(this.A07, R.string.str16db);
            A35(this.A06, R.string.str16d9);
        }
        this.A01.setAdapter(this.A05);
        this.A01.A0G(new C95454mf(this.A03));
        this.A01.A0G(new IDxCListenerShape273S0100000_2_I1(this, 3));
        this.A01.A0F(C13680ns.A1Z(this.A04) ^ true ? 1 : 0, false);
        this.A03.A0D(new IDxObjectShape302S0100000_2_I1(this, 2));
        Toolbar toolbar = (Toolbar) findViewById.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon((Drawable) new C447725m(AnonymousClass2SR.A02(this, R.drawable.ic_back, R.color.color04ef), this.A04));
        toolbar.setNavigationContentDescription((int) R.string.str16cf);
        toolbar.setTitle((int) R.string.str16e3);
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape20S0100000_I1_5((Object) this, 34));
        AnonymousClass3 r2 = new BottomSheetBehavior() {
        };
        this.A02 = r2;
        r2.A0J = true;
        r2.A0M(4);
        this.A02.A0N = true;
        BottomSheetBehavior bottomSheetBehavior = this.A02;
        ((AnonymousClass0Bo) findViewById.getLayoutParams()).A01(bottomSheetBehavior);
        bottomSheetBehavior.A0E = new IDxSCallbackShape46S0100000_2_I1(this, 3);
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A02;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0B == 4) {
            this.A00.post(new RunnableRunnableShape20S0100000_I1_3(this, 16));
        }
    }
}

package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass1Vo;
import X.AnonymousClass267;
import X.AnonymousClass4XO;
import X.AnonymousClass5vV;
import X.C005402i;
import X.C016207s;
import X.C110105dW;
import X.C110115dX;
import X.C110855ew;
import X.C110925f3;
import X.C111345g2;
import X.C112835jb;
import X.C113285ln;
import X.C114485nq;
import X.C1200960h;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C17130ua;
import X.C32241fu;
import X.C38411qk;
import X.C38461qp;
import X.C45902Bo;
import X.C49132Rg;
import X.C53842gO;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxTListenerShape172S0100000_3_I1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.obwhatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class IndiaUpiBankPickerActivity extends C112835jb {
    public View A00;
    public LinearLayout A01;
    public TextView A02;
    public RecyclerView A03;
    public ShimmerFrameLayout A04;
    public ShimmerFrameLayout A05;
    public AnonymousClass267 A06;
    public C17130ua A07;
    public AnonymousClass4XO A08;
    public AnonymousClass5vV A09;
    public C110855ew A0A;
    public C110855ew A0B;
    public C114485nq A0C;
    public C38411qk A0D;
    public String A0E;
    public ArrayList A0F;
    public List A0G;
    public List A0H;
    public boolean A0I;
    public boolean A0J;
    public final C53842gO A0K;
    public final AnonymousClass1Vo A0L;

    public IndiaUpiBankPickerActivity() {
        this(0);
        this.A0L = C110115dX.A0S("IndiaUpiBankPickerActivity");
        this.A0K = new C53842gO();
    }

    public IndiaUpiBankPickerActivity(int i2) {
        this.A0I = false;
        C110105dW.A0t(this, 40);
    }

    public void A1q() {
        if (!this.A0I) {
            this.A0I = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r1 = A0C2.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C2, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C2, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A04 = (C1200960h) r1.ACB.get();
            this.A00 = C110115dX.A0D(r1);
            this.A05 = (C113285ln) r1.ACF.get();
            this.A07 = (C17130ua) r1.AN9.get();
            this.A09 = (AnonymousClass5vV) r1.AHW.get();
        }
    }

    public void A2S(int i2) {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.setEnabled(true);
        }
        if (i2 != R.string.str0fed) {
            A3H();
            finish();
        }
    }

    public final void A3W(Integer num) {
        C53842gO r1 = this.A0K;
        C111345g2.A1t(r1, this, "nav_bank_select");
        r1.A08 = C13680ns.A0Y();
        r1.A0Z = this.A0O;
        r1.A07 = num;
        r1.A02 = Boolean.valueOf(this.A0J);
        C111345g2.A1s(r1, this);
    }

    public void onBackPressed() {
        if (this.A06.A06()) {
            this.A06.A05(true);
            this.A0K.A0P = this.A0E;
            A3W(1);
            return;
        }
        A3W(1);
        A3J();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C110105dW.A0l(this);
        File file = new File(getCacheDir(), "BankLogos");
        if (!file.mkdirs() && !file.isDirectory()) {
            this.A0L.A06("create unable to create bank logos cache directory");
        }
        this.A0D = new C38461qp(this.A05, this.A07, this.A0D, file, "india-upi-bank-picker-activity").A00();
        setContentView((int) R.layout.layout0329);
        A3L(R.string.str0ff0, R.color.color0585, R.id.data_layout);
        AnonymousClass013 r10 = this.A01;
        this.A06 = new AnonymousClass267(this, findViewById(R.id.search_holder), new IDxTListenerShape172S0100000_3_I1(this, 0), C110105dW.A09(this), r10);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            x2.A0B(R.string.str0ff0);
        }
        this.A05 = (ShimmerFrameLayout) findViewById(R.id.grid_view_shimmer_layout);
        this.A04 = (ShimmerFrameLayout) findViewById(R.id.list_view_shimmer_layout);
        this.A02 = C13680ns.A0N(this, R.id.bank_picker_empty_tv);
        this.A00 = findViewById(R.id.popular_banks_group);
        this.A01 = (LinearLayout) findViewById(R.id.list_items_layout);
        C13690nt.A0s(this, C13680ns.A0M(findViewById(R.id.grid_view_title), R.id.header_text), R.string.str0ff1);
        this.A03 = (RecyclerView) findViewById(R.id.bank_picker_list);
        this.A0B = new C110855ew(this, false);
        this.A0A = new C110855ew(this, true);
        this.A03.setAdapter(this.A0B);
        ((RecyclerView) findViewById(R.id.grid_view)).setAdapter(this.A0A);
        A3V(AnonymousClass000.A0u(), false);
        AnonymousClass4XO r1 = this.A0B.A04;
        this.A08 = r1;
        r1.A02("upi-bank-picker");
        this.A0E.AgB();
        this.A0J = false;
        this.A03.A0o(new C110925f3(this));
        C53842gO r2 = this.A0K;
        r2.A0X = this.A0L;
        r2.A0a = "nav_bank_select";
        r2.A0Z = this.A0O;
        C110115dX.A10(r2, 0);
        r2.A01 = Boolean.valueOf(this.A0I.A0G("add_bank"));
        r2.A02 = Boolean.valueOf(this.A0J);
        C111345g2.A1s(r2, this);
        this.A0D.A09();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, R.id.menuitem_search, 0, this.A01.A00.getResources().getString(R.string.str1d7c));
        add.setIcon(R.drawable.ic_action_search).setShowAsAction(9);
        C016207s.A00(ColorStateList.valueOf(AnonymousClass00T.A00(this, R.color.color059b)), add);
        A3N(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        C114485nq r1 = this.A0C;
        if (r1 != null) {
            r1.A06(true);
            this.A0C = null;
        }
        this.A0D.A02.A02(false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_help) {
            C32241fu A002 = C32241fu.A00(this);
            A002.A01(R.string.str05ac);
            A3O(A002, "nav_bank_select");
        } else if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId == 16908332) {
            this.A0L.A04("action bar home");
            A3W(1);
            A3J();
            return true;
        }
        return true;
    }

    public boolean onSearchRequested() {
        this.A0K.A03 = Boolean.TRUE;
        this.A06.A02();
        DisplayMetrics A0M = AnonymousClass000.A0M(this);
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, A0M);
        C45902Bo.A07(this.A06.A02, this.A01, applyDimension, 0);
        int applyDimension2 = (int) TypedValue.applyDimension(1, 8.0f, A0M);
        C45902Bo.A07(this.A06.A06.findViewById(R.id.search_back), this.A01, applyDimension2, 0);
        AnonymousClass267 r2 = this.A06;
        String string = getString(R.string.str0ff2);
        SearchView searchView = r2.A02;
        if (searchView != null) {
            searchView.setQueryHint(string);
        }
        C110105dW.A0r(findViewById(R.id.search_back), this, 34);
        A3W(65);
        return false;
    }
}

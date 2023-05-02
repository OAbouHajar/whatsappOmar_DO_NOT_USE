package com.obwhatsapp;

import X.AnonymousClass00T;
import X.AnonymousClass2r1;
import X.AnonymousClass3RK;
import X.C004601z;
import X.C005402i;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C17170ue;
import X.C23081Ak;
import X.C23091Al;
import X.C35701mM;
import X.C434920f;
import X.C455529g;
import X.C49132Rg;
import X.C50262Yq;
import X.C54602hp;
import X.C57612rS;
import X.C61913Ax;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxIListenerShape218S0100000_2_I1;
import com.whatsapp.jid.UserJid;

public class CatalogImageListActivity extends C14530pL {
    public static final boolean A0C;
    public int A00;
    public int A01;
    public LinearLayoutManager A02;
    public RecyclerView A03;
    public AnonymousClass3RK A04;
    public C35701mM A05;
    public C17170ue A06;
    public C23081Ak A07;
    public C50262Yq A08;
    public UserJid A09;
    public C23091Al A0A;
    public boolean A0B;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z2 = true;
        }
        A0C = z2;
    }

    public CatalogImageListActivity() {
        this(0);
    }

    public CatalogImageListActivity(int i2) {
        this.A0B = false;
        C13680ns.A1G(this, 0);
    }

    public void A1q() {
        if (!this.A0B) {
            this.A0B = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A07 = (C23081Ak) r1.A3Z.get();
            this.A06 = C16150sX.A0A(r1);
            this.A0A = (C23091Al) r1.A3f.get();
        }
    }

    public void onCreate(Bundle bundle) {
        if (C455529g.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
        super.onCreate(bundle);
        C61913Ax.A01(bundle, this, new C54602hp(this));
        if (A0C) {
            C13690nt.A0J(this).setSystemUiVisibility(1792);
            C434920f.A03(this, R.color.color064b);
        }
        this.A09 = C14530pL.A0O(getIntent(), "cached_jid");
        this.A05 = (C35701mM) getIntent().getParcelableExtra("product");
        this.A00 = getIntent().getIntExtra("image_index", 0);
        setContentView((int) R.layout.layout00bb);
        this.A03 = (RecyclerView) findViewById(R.id.catalog_image_list);
        C005402i A0s = C14550pN.A0s(this, R.id.catalog_image_list_toolbar);
        A0s.A0N(true);
        A0s.A0J(this.A05.A04);
        this.A08 = new C50262Yq(this.A07, this.A0A);
        AnonymousClass2r1 r1 = new AnonymousClass2r1(this, new C54602hp(this));
        this.A02 = new LinearLayoutManager();
        this.A03.setAdapter(r1);
        this.A03.setLayoutManager(this.A02);
        AnonymousClass3RK r12 = new AnonymousClass3RK(this.A05.A06.size(), getResources().getDimensionPixelSize(R.dimen.dimen005e));
        this.A04 = r12;
        this.A03.A0m(r12);
        C004601z.A0k(this.A03, new IDxIListenerShape218S0100000_2_I1(this, 2));
        int A002 = AnonymousClass00T.A00(this, R.color.color064b);
        int A003 = AnonymousClass00T.A00(this, R.color.color064b);
        this.A03.A0o(new C57612rS(A0s, this, A002, AnonymousClass00T.A00(this, R.color.color0107), A003));
    }

    public void onDestroy() {
        this.A08.A00();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}

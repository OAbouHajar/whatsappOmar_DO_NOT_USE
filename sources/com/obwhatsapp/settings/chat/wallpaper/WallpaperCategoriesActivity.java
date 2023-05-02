package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass027;
import X.AnonymousClass15P;
import X.AnonymousClass1AB;
import X.AnonymousClass2Rf;
import X.AnonymousClass3RG;
import X.AnonymousClass5SW;
import X.C005402i;
import X.C101594xZ;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16210se;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16690tT;
import X.C16980tz;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C23651Cv;
import X.C28251Uz;
import X.C40931uv;
import X.C434920f;
import X.C49132Rg;
import X.C55652k6;
import X.C55662k7;
import X.C55862kX;
import X.C62063Bm;
import X.C62653Ek;
import X.C809146b;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.obwhatsapp.R;
import java.util.ArrayList;

public class WallpaperCategoriesActivity extends C14530pL implements C28251Uz {
    public C23651Cv A00;
    public AnonymousClass5SW A01;
    public C62653Ek A02;
    public C16980tz A03;
    public C16260sj A04;
    public C15830rv A05;
    public C16210se A06;
    public C55652k6 A07;
    public boolean A08;
    public boolean A09;
    public final C809146b A0A;

    public WallpaperCategoriesActivity() {
        this(0);
        this.A0A = new C809146b();
        this.A05 = null;
    }

    public WallpaperCategoriesActivity(int i2) {
        this.A09 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 92));
    }

    public void A1q() {
        if (!this.A09) {
            this.A09 = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A00 = (C23651Cv) r1.A1k.get();
            this.A03 = (C16980tz) r1.AQB.get();
            this.A06 = (C16210se) r1.AQr.get();
            this.A04 = (C16260sj) r1.AQe.get();
        }
    }

    public void APk(int i2) {
    }

    public void APl(int i2) {
    }

    public void APm(int i2) {
        if (i2 == 112) {
            C16210se r2 = this.A06;
            C15830rv r1 = this.A05;
            if (r2 instanceof AnonymousClass1AB) {
                ((AnonymousClass1AB) r2).A0G(this, r1, (C40931uv) null);
            }
            setResult(-1);
            finish();
        } else if (i2 == 113) {
            C16210se r3 = this.A06;
            if (r3 instanceof AnonymousClass1AB) {
                AnonymousClass1AB r32 = (AnonymousClass1AB) r3;
                r32.A05.Acl(new RunnableRunnableShape14S0100000_I0_13((Object) r32, 42));
            }
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 != 0) {
            setResult(i3);
            if (this.A02.AM4(intent, i2, i3)) {
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        if (getResources().getBoolean(R.bool.notification_large_icon_width)) {
            setRequestedOrientation(1);
        }
        setContentView((int) R.layout.layout005c);
        C14870pt r14 = this.A05;
        C101594xZ r15 = new C101594xZ(r14);
        this.A01 = r15;
        this.A02 = new C62653Ek(this, this, r14, r15, this.A0A, this.A08, this.A06);
        this.A05 = C62063Bm.A03(getIntent());
        boolean booleanExtra = getIntent().getBooleanExtra("is_using_global_wallpaper", false);
        Aem((Toolbar) AnonymousClass00T.A05(this, R.id.wallpaper_categories_toolbar));
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        if (this.A05 == null || booleanExtra) {
            boolean A092 = C434920f.A09(this);
            i2 = R.string.str1b53;
            if (A092) {
                i2 = R.string.str1b48;
            }
        } else {
            i2 = R.string.str1b47;
        }
        setTitle(i2);
        this.A05 = C62063Bm.A03(getIntent());
        this.A08 = this.A04.A0B();
        C16210se r1 = this.A06;
        AnonymousClass027 r2 = r1 instanceof AnonymousClass1AB ? ((AnonymousClass1AB) r1).A00 : null;
        AnonymousClass00B.A06(r2);
        r2.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 288));
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        boolean z2 = this.A06.A06(this, this.A05).A03;
        if (!z2) {
            arrayList.add(4);
        }
        RecyclerView recyclerView = (RecyclerView) AnonymousClass00T.A05(this, R.id.categories);
        C55662k7 r9 = new C55662k7(this, z2);
        C55652k6 r3 = new C55652k6(getContentResolver(), new Handler(Looper.getMainLooper()), this.A00, this.A03, this.A08, r9, this.A05, arrayList);
        this.A07 = r3;
        recyclerView.setLayoutManager(new WallpaperGridLayoutManager(this, r3));
        recyclerView.A0m(new AnonymousClass3RG(this.A01, getResources().getDimensionPixelSize(R.dimen.dimen0849)));
        recyclerView.setAdapter(this.A07);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A05 == null) {
            menu.add(0, 999, 0, R.string.str1b64).setShowAsAction(0);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        for (C16690tT A062 : this.A07.A09.values()) {
            A062.A06(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 999) {
            C55862kX r1 = new C55862kX(113);
            r1.A02(getString(R.string.str1b62));
            r1.A05(getString(R.string.str1b63));
            r1.A03(getString(R.string.str0394));
            Afc(r1.A00());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        if (this.A08 != this.A04.A0B()) {
            this.A08 = this.A04.A0B();
            this.A07.A01();
        }
    }
}

package com.obwhatsapp.twofactor;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass0rA;
import X.AnonymousClass15P;
import X.AnonymousClass2Rf;
import X.C005402i;
import X.C018808t;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14860ps;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C49132Rg;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.obwhatsapp.R;
import java.util.List;

public class TwoFactorAuthActivity extends C14530pL implements AnonymousClass0rA {
    public static final int[] A0B = {R.id.page_indicator_1, R.id.page_indicator_2, R.id.page_indicator_3};
    public C005402i A00;
    public C14860ps A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public int[] A08;
    public final Handler A09;
    public final Runnable A0A;

    public TwoFactorAuthActivity() {
        this(0);
        this.A09 = new Handler(Looper.getMainLooper());
        this.A0A = new RunnableRunnableShape15S0100000_I0_14(this, 48);
    }

    public TwoFactorAuthActivity(int i2) {
        this.A07 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 107));
    }

    public void A1q() {
        if (!this.A07) {
            this.A07 = true;
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
            this.A01 = (C14860ps) r1.API.get();
        }
    }

    public void A35() {
        Afq(R.string.str1858);
        this.A09.postDelayed(this.A0A, C14860ps.A0D);
        this.A05.Aco(new RunnableRunnableShape16S0100000_I0_15(this, 1));
    }

    public void A36(View view, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            i3++;
            C018808t.A00(ColorStateList.valueOf(AnonymousClass00T.A00(this, R.color.color05ad)), (ImageView) view.findViewById(A0B[i3]));
        }
        int length = this.A08.length;
        while (true) {
            length++;
            int[] iArr = A0B;
            if (length < iArr.length) {
                view.findViewById(iArr[length]).setVisibility(8);
            } else {
                return;
            }
        }
    }

    public void A37(AnonymousClass01A r6, boolean z2) {
        AnonymousClass050 r4 = new AnonymousClass050(AGM());
        r4.A02 = R.anim.anim003e;
        r4.A03 = R.anim.anim0040;
        r4.A05 = R.anim.anim003d;
        r4.A06 = R.anim.anim0041;
        r4.A0A(r6, R.id.container);
        if (z2) {
            r4.A0I((String) null);
        }
        r4.A01();
    }

    public boolean A38(AnonymousClass01A r4) {
        return this.A08.length == 1 || r4.getClass() == SetEmailFragment.class;
    }

    public void AZH() {
        Handler handler = this.A09;
        handler.removeCallbacks(this.A0A);
        handler.postDelayed(new RunnableRunnableShape15S0100000_I0_14(this, 49), 700);
    }

    public void AZI() {
        Handler handler = this.A09;
        handler.removeCallbacks(this.A0A);
        handler.postDelayed(new RunnableRunnableShape16S0100000_I0_15(this, 0), 700);
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass01A A012;
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        setTitle(R.string.str15d8);
        C005402i x2 = x();
        this.A00 = x2;
        boolean z2 = true;
        if (x2 != null) {
            x2.A0N(true);
        }
        setContentView((int) R.layout.layout0059);
        int[] intArrayExtra = getIntent().getIntArrayExtra("workflows");
        AnonymousClass00B.A06(intArrayExtra);
        this.A08 = intArrayExtra;
        if (intArrayExtra.length <= 0) {
            z2 = false;
        }
        AnonymousClass00B.A0G(z2);
        String stringExtra = getIntent().getStringExtra("primaryCTA");
        AnonymousClass00B.A06(stringExtra);
        this.A06 = stringExtra;
        AnonymousClass050 r4 = new AnonymousClass050(AGM());
        int i2 = this.A08[0];
        if (i2 == 1) {
            A012 = SetCodeFragment.A01(1);
        } else if (i2 == 2) {
            A012 = SetEmailFragment.A01(1);
        } else {
            StringBuilder sb = new StringBuilder("Invalid work flow:");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        r4.A0A(A012, R.id.container);
        r4.A01();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            AnonymousClass02C AGM = AGM();
            if (AGM.A04() > 0) {
                AGM.A0I();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        List list = this.A01.A0B;
        AnonymousClass00B.A0G(list.contains(this));
        list.remove(this);
    }

    public void onResume() {
        super.onResume();
        List list = this.A01.A0B;
        AnonymousClass00B.A0G(!list.contains(this));
        list.add(this);
    }
}

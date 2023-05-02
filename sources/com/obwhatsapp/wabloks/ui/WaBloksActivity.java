package com.obwhatsapp.wabloks.ui;

import X.AnonymousClass01A;
import X.AnonymousClass01D;
import X.AnonymousClass1MQ;
import X.AnonymousClass22A;
import X.AnonymousClass2AL;
import X.AnonymousClass2KQ;
import X.AnonymousClass2KR;
import X.AnonymousClass2ZU;
import X.C011005f;
import X.C108615Or;
import X.C110105dW;
import X.C110115dX;
import X.C111415g9;
import X.C111545gY;
import X.C111555gZ;
import X.C111595h2;
import X.C13680ns;
import X.C20140zZ;
import X.C35001lD;
import X.C807545j;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import com.obwhatsapp.wabloks.base.BkScreenFragment;
import com.obwhatsapp.wabloks.base.FdsContentFragmentManager;
import java.util.Map;
import java.util.Set;

public class WaBloksActivity extends C111415g9 implements AnonymousClass2KQ, AnonymousClass2KR {
    public AnonymousClass2ZU A00;
    public AnonymousClass22A A01;
    public AnonymousClass1MQ A02;
    public C20140zZ A03;
    public C111545gY A04;
    public C111555gZ A05;
    public AnonymousClass01D A06;
    public String A07;
    public Map A08;
    public Map A09;
    public final Set A0A = C13680ns.A0o();
    public final Set A0B = C13680ns.A0o();

    public static Intent A09(Context context, String str, String str2) {
        return C110105dW.A04(context, WaBloksActivity.class).putExtra("screen_name", str).putExtra("screen_params", str2).putExtra("screen_cache_config", (Parcelable) null);
    }

    public AnonymousClass01A A35(Intent intent) {
        if (this instanceof WaFcsPreloadedBloksActivity) {
            return BkFcsPreloadingScreenFragment.A01((C35001lD) intent.getParcelableExtra("screen_cache_config"), intent.getStringExtra("screen_name"), intent.getStringExtra("data_module_job_id"), intent.getStringExtra("data_module_namespace"), intent.getStringExtra("screen_params"), intent.getStringExtra("qpl_param_map"), intent.getStringExtra("fds_observer_id"));
        } else if (this instanceof WaFcsModalActivity) {
            FdsContentFragmentManager A012 = FdsContentFragmentManager.A01(intent.getStringExtra("fds_observer_id"));
            ((WaFcsModalActivity) this).A00 = A012;
            return A012;
        } else {
            String stringExtra = intent.getStringExtra("screen_name");
            String stringExtra2 = intent.getStringExtra("screen_params");
            Parcelable parcelableExtra = intent.getParcelableExtra("screen_cache_config");
            String stringExtra3 = intent.getStringExtra("qpl_param_map");
            BkScreenFragment bkScreenFragment = new BkScreenFragment();
            bkScreenFragment.A1F(stringExtra);
            bkScreenFragment.A1E(stringExtra2);
            bkScreenFragment.A1C();
            bkScreenFragment.A04().putParcelable("screen_cache_config", parcelableExtra);
            bkScreenFragment.A1C();
            bkScreenFragment.A04().putSerializable("qpl_params", stringExtra3);
            return bkScreenFragment;
        }
    }

    public AnonymousClass1MQ AA9() {
        return this.A02;
    }

    public AnonymousClass22A AH1() {
        AnonymousClass22A r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C111595h2 A0A2 = C110115dX.A0A(this, AGM(), this.A00, this.A08);
        this.A01 = A0A2;
        return A0A2;
    }

    public void AhU(C108615Or r3) {
        if (this.A06.A02.A00(C011005f.CREATED)) {
            this.A04.A04(r3);
        }
    }

    public void AhV(C108615Or r3, boolean z2) {
        if (this.A06.A02.A00(C011005f.CREATED)) {
            C111555gZ r0 = this.A05;
            if (r0 != null) {
                r0.A00(r3);
            }
            if (z2) {
                onCreateOptionsMenu(this.A02.getMenu());
            }
        }
    }

    public void onBackPressed() {
        C111545gY r1 = this.A04;
        if (r1.A05()) {
            r1.A02();
        } else if (AGM().A04() <= 1) {
            setResult(0, C807545j.A00(getIntent()));
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008b A[LOOP:0: B:11:0x0085->B:13:0x008b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r0 = 2131558491(0x7f0d005b, float:1.87423E38)
            r4.setContentView((int) r0)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "screen_name"
            java.lang.String r0 = r1.getStringExtra(r0)
            r4.A07 = r0
            X.02C r3 = r4.AGM()
            X.01A r2 = r4.A35(r1)
            int r0 = r3.A04()
            if (r0 != 0) goto L_0x0036
            X.050 r1 = new X.050
            r1.<init>(r3)
            r0 = 2131362291(0x7f0a01f3, float:1.8344358E38)
            r1.A09(r2, r0)
            java.lang.String r0 = r4.A07
            r1.A0I(r0)
            r1.A02()
        L_0x0036:
            X.22A r0 = r4.A01
            if (r0 != 0) goto L_0x0048
            X.2ZU r2 = r4.A00
            X.02C r1 = r4.AGM()
            java.util.Map r0 = r4.A08
            X.5h2 r0 = X.C110115dX.A0A(r4, r1, r2, r0)
            r4.A01 = r0
        L_0x0048:
            java.util.Map r1 = r4.A09
            java.lang.String r0 = r4.A07
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0095
            java.util.Map r1 = r4.A09
            java.lang.String r0 = r4.A07
            java.lang.Object r1 = r1.get(r0)
            X.69H r1 = (X.AnonymousClass69H) r1
        L_0x005c:
            X.01D r0 = r4.A06
            java.lang.Object r0 = r0.get()
            X.5uY r0 = (X.C118355uY) r0
            X.5gY r0 = r1.A7U(r4, r0)
            r4.A04 = r0
            X.5gZ r0 = r1.A7T(r4)
        L_0x006e:
            r4.A05 = r0
            java.util.Set r2 = r4.A0A
            r2.add(r0)
            java.util.Set r1 = r4.A0B
            X.5gZ r0 = r4.A05
            r1.add(r0)
            X.5gY r0 = r4.A04
            r2.add(r0)
            java.util.Iterator r1 = r2.iterator()
        L_0x0085:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r1.next()
            android.app.Application$ActivityLifecycleCallbacks r0 = (android.app.Application.ActivityLifecycleCallbacks) r0
            r0.onActivityCreated(r4, r5)
            goto L_0x0085
        L_0x0095:
            boolean r0 = r4 instanceof X.AnonymousClass686
            if (r0 == 0) goto L_0x00ae
            r0 = r4
            X.686 r0 = (X.AnonymousClass686) r0
            X.5oP r0 = (X.C114695oP) r0
            X.633 r1 = r0.A02
            if (r1 != 0) goto L_0x005c
            java.lang.String r0 = "phoenixBloksActivityHelper"
            X.C18450wi.A0O(r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x00ae:
            X.013 r1 = r4.A01
            X.5oT r0 = new X.5oT
            r0.<init>(r1, r4)
            r4.A04 = r0
            X.5oX r0 = new X.5oX
            r0.<init>(r1, r4)
            goto L_0x006e
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.wabloks.ui.WaBloksActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        for (AnonymousClass2AL APE : this.A0B) {
            APE.APE(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        if (isFinishing() && getIntent().getStringExtra("wa_screen_options") != null) {
            this.A03.A04("wa_screen_options", getIntent().getStringExtra("wa_screen_options"));
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        for (AnonymousClass2AL AUD : this.A0B) {
            if (AUD.AUD(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        for (AnonymousClass2AL AVB : this.A0B) {
            AVB.AVB(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }
}

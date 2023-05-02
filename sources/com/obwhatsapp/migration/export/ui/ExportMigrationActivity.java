package com.obwhatsapp.migration.export.ui;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass12N;
import X.AnonymousClass15P;
import X.AnonymousClass2GQ;
import X.AnonymousClass2Rf;
import X.C005402i;
import X.C006602z;
import X.C1045255s;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
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
import X.C16330sr;
import X.C16360su;
import X.C16390sx;
import X.C16400sy;
import X.C16440t3;
import X.C16490t9;
import X.C16620tM;
import X.C16980tz;
import X.C17250um;
import X.C18260wP;
import X.C18890xQ;
import X.C19490yW;
import X.C19670yo;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C28281Vg;
import X.C32241fu;
import X.C446524y;
import X.C49132Rg;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape28S0200000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.RoundCornerProgressBar;
import com.obwhatsapp.migration.export.service.MessagesExporterService;
import com.whatsapp.util.Log;

public class ExportMigrationActivity extends C14530pL {
    public C18890xQ A00;
    public WaButton A01;
    public WaButton A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public C19670yo A09;
    public AnonymousClass12N A0A;
    public RoundCornerProgressBar A0B;
    public C16980tz A0C;
    public C16490t9 A0D;
    public C16360su A0E;
    public C16330sr A0F;
    public ExportMigrationViewModel A0G;
    public C16390sx A0H;
    public C28281Vg A0I;
    public String A0J;
    public boolean A0K;

    public ExportMigrationActivity() {
        this(0);
    }

    public ExportMigrationActivity(int i2) {
        this.A0K = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 63));
    }

    public void A1q() {
        if (!this.A0K) {
            this.A0K = true;
            C49132Rg r1 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r1.A1s;
            this.A05 = (C16320sq) r2.ARB.get();
            this.A0C = (C14710pd) r2.A05.get();
            this.A05 = (C14870pt) r2.AB3.get();
            this.A03 = (C16300so) r2.A5p.get();
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = (C17250um) r2.A7e.get();
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = (AnonymousClass01V) r2.AOi.get();
            this.A0D = (C19950zG) r2.AQV.get();
            this.A09 = (C15860rz) r2.AQh.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            this.A05 = (C16440t3) r2.AP2.get();
            this.A0B = (C23061Ai) r2.AC0.get();
            this.A01 = (C16040sK) r2.ADr.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r1.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A00 = (C18890xQ) r2.APS.get();
            this.A0C = (C16980tz) r2.AQB.get();
            AnonymousClass01J r12 = r2.AQz;
            this.A0D = (C16490t9) r12.get();
            this.A0F = (C16330sr) r2.A85.get();
            this.A0I = new C28281Vg((C16490t9) r12.get());
            this.A0E = (C16360su) r2.AFj.get();
            this.A0H = (C16390sx) r2.A8D.get();
            this.A09 = (C19670yo) r2.AB4.get();
            this.A0A = (AnonymousClass12N) r2.AB7.get();
        }
    }

    public final void A35(int i2) {
        Context context = this.A0C.A00;
        Log.i("xpm-export-service-cancelExport()");
        Intent intent = new Intent("ACTION_CANCEL_EXPORT");
        intent.setClass(context, MessagesExporterService.class);
        intent.putExtra("IS_FIRST_PARTY", false);
        C446524y.A00(context, intent);
        StringBuilder sb = new StringBuilder("ExportMigrationActivity/cancelMigrationAndReturn/resultCode: ");
        sb.append(i2);
        Log.i(sb.toString());
        setResult(i2);
        finish();
    }

    public final void A36(long j2) {
        String string = getString(R.string.str1d14);
        String A042 = AnonymousClass2GQ.A04(this.A01, j2);
        AnonymousClass013 r4 = this.A01;
        runOnUiThread(new C1045255s(this, string, r4.A0J(new Object[]{r4.A0G(A042)}, R.plurals.plurals019a, j2), j2));
    }

    public final void A37(Runnable runnable) {
        String string = getString(R.string.str1d19);
        if (!this.A0F.A08()) {
            this.A0I.A00(this.A0J, 15);
        }
        C32241fu r3 = new C32241fu(this);
        r3.A06(string);
        r3.A09(new IDxCListenerShape127S0100000_2_I0(this, 77), getString(R.string.str1d0d));
        r3.A08(new IDxCListenerShape28S0200000_2_I0(this, 9, runnable), getString(R.string.str1d0c));
        r3.A00();
    }

    public final void A38(Runnable runnable, Runnable runnable2, boolean z2) {
        String string = getString(R.string.str1d0e);
        String string2 = getString(R.string.str1d0b);
        C32241fu r3 = new C32241fu(this);
        r3.setTitle(string);
        r3.A06(string2);
        r3.A07(z2);
        r3.A09(new IDxCListenerShape127S0100000_2_I0(runnable, 78), getString(R.string.str1d0d));
        r3.A08(new IDxCListenerShape127S0100000_2_I0(runnable2, 79), getString(R.string.str1d0c));
        r3.A00();
    }

    public void onBackPressed() {
        A37(new RunnableRunnableShape11S0100000_I0_10((Object) this, 34));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String A022 = this.A0E.A02();
        this.A0J = A022;
        this.A0I.A00(A022, 11);
        if (!this.A0C.A0E(C16620tM.A02, 843)) {
            this.A0I.A01(this.A0J, 18);
            Log.e("ExportMigrationActivity/verifyActivityStartRequest; disabled: platform migration feature is disabled");
            setResult(102);
        } else {
            try {
                C16390sx r2 = this.A0H;
                synchronized (r2.A00) {
                }
                if (!r2.A02.A00("com.apple.movetoios")) {
                    this.A0I.A01(this.A0J, 19);
                    Log.e("ExportMigrationActivity/onCreate/security: Permission validation failed");
                    this.A03.AcB("xpm-export-activity-permission-denied", (String) null, false);
                    setResult(104);
                    this.A0E.A03();
                    super.finish();
                    return;
                }
                if (!this.A0F.A08()) {
                    C16040sK r0 = this.A01;
                    r0.A0B();
                    if (r0.A05 == null) {
                        this.A0I.A01(this.A0J, 21);
                        Log.e("ExportMigrationActivity/onCreate/user: no user logged in, skipping.");
                        startActivity(C14750ph.A06(this));
                        setResult(105);
                    }
                }
                if (this.A0F.A08()) {
                    C16400sy r1 = this.A0F.A0A;
                    if (!r1.A05()) {
                        r1.A03();
                    }
                    Log.i("ExportMigrationActivity/providerReady/finishing");
                    this.A0I.A01(this.A0J, 24);
                    Log.i("ExportMigrationActivity/activateContentProviderAndFinishActivity");
                    setResult(100);
                    finish();
                    return;
                }
                this.A0I.A00(this.A0J, 1);
                setContentView((int) R.layout.layout0278);
                setTitle(getString(R.string.str1d15));
                C005402i x2 = x();
                if (x2 != null) {
                    x2.A0N(true);
                }
                this.A07 = (WaTextView) AnonymousClass00T.A05(this, R.id.export_migrate_title);
                this.A06 = (WaTextView) AnonymousClass00T.A05(this, R.id.export_migrate_sub_title);
                this.A08 = (WaTextView) AnonymousClass00T.A05(this, R.id.export_migrate_warning);
                this.A04 = (WaTextView) AnonymousClass00T.A05(this, R.id.export_migrate_change_number_action);
                this.A01 = (WaButton) AnonymousClass00T.A05(this, R.id.export_migrate_main_action);
                this.A02 = (WaButton) AnonymousClass00T.A05(this, R.id.export_migrate_sub_action);
                this.A03 = (WaImageView) AnonymousClass00T.A05(this, R.id.export_migrate_image_view);
                this.A0B = (RoundCornerProgressBar) AnonymousClass00T.A05(this, R.id.export_migrate_progress_bar);
                this.A05 = (WaTextView) AnonymousClass00T.A05(this, R.id.export_migrate_progress_description);
                ExportMigrationViewModel exportMigrationViewModel = (ExportMigrationViewModel) new C006602z(this).A01(ExportMigrationViewModel.class);
                this.A0G = exportMigrationViewModel;
                exportMigrationViewModel.A02.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 52));
                this.A0G.A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 209));
                this.A0G.A01.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 208));
                return;
            } catch (SecurityException e2) {
                this.A0I.A01(this.A0J, 20);
                Log.e("ExportMigrationActivity/onCreate/security: Permission validation failed", e2);
                this.A03.A03("xpm-export-activity-permission-denied", (String) null, e2);
                setResult(104);
                this.A0E.A03();
                super.finish();
                return;
            }
        }
        this.A0E.A03();
        super.finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A37((Runnable) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r2.A01 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r3 = this;
            super.onResume()
            X.0sr r0 = r3.A0F
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0012
            com.obwhatsapp.migration.export.ui.ExportMigrationViewModel r1 = r3.A0G
            r0 = 5
        L_0x000e:
            r1.A05(r0)
            return
        L_0x0012:
            X.0sr r2 = r3.A0F
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x001e
            java.util.concurrent.CountDownLatch r1 = r2.A01     // Catch:{ all -> 0x0033 }
            r0 = 0
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0026
            com.obwhatsapp.migration.export.ui.ExportMigrationViewModel r1 = r3.A0G
            r0 = 1
            goto L_0x000e
        L_0x0026:
            X.0sq r2 = r3.A05
            r1 = 36
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r0 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Acl(r0)
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.migration.export.ui.ExportMigrationActivity.onResume():void");
    }
}

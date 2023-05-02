package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass107;
import X.AnonymousClass17F;
import X.AnonymousClass17Y;
import X.AnonymousClass1MB;
import X.AnonymousClass1Vo;
import X.AnonymousClass267;
import X.AnonymousClass2SE;
import X.AnonymousClass5Q6;
import X.AnonymousClass62K;
import X.AnonymousClass680;
import X.C004601z;
import X.C018208n;
import X.C110105dW;
import X.C110905f1;
import X.C113005lC;
import X.C114495nr;
import X.C114575nz;
import X.C117965tq;
import X.C118875vO;
import X.C1222969a;
import X.C13680ns;
import X.C13700nu;
import X.C15830rv;
import X.C15910s6;
import X.C16460t6;
import X.C18090w8;
import X.C18290wS;
import X.C218315p;
import X.C228919r;
import X.C32241fu;
import X.C39961tL;
import X.C41411vk;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.facebook.redex.IDxTObserverShape253S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.widget.MultiExclusionChip;
import com.obwhatsapp.payments.ui.widget.MultiExclusionChipGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class PaymentTransactionHistoryActivity extends C113005lC implements AnonymousClass2SE, AnonymousClass5Q6, AnonymousClass680 {
    public int A00;
    public View A01;
    public ProgressBar A02;
    public TextView A03;
    public AnonymousClass267 A04;
    public AnonymousClass013 A05;
    public C16460t6 A06;
    public AnonymousClass17F A07;
    public C15830rv A08;
    public AnonymousClass107 A09;
    public AnonymousClass17Y A0A;
    public C18090w8 A0B;
    public C18290wS A0C;
    public AnonymousClass1MB A0D;
    public C114495nr A0E;
    public C114575nz A0F;
    public C110905f1 A0G;
    public C118875vO A0H;
    public MultiExclusionChipGroup A0I;
    public C218315p A0J;
    public String A0K;
    public String A0L;
    public ArrayList A0M;
    public boolean A0N = false;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0S = false;
    public boolean A0T = false;
    public final C41411vk A0U = new IDxTObserverShape253S0100000_3_I1(this, 2);
    public final AnonymousClass1Vo A0V = C110105dW.A0Q("PaymentTransactionHistoryActivity", "payment-settings");
    public final C39961tL A0W = new C39961tL();
    public final ArrayList A0X = AnonymousClass000.A0u();

    public final MultiExclusionChip A35(String str) {
        MultiExclusionChip multiExclusionChip = (MultiExclusionChip) getLayoutInflater().inflate(R.layout.layout044e, (ViewGroup) null);
        C018208n.A0A(multiExclusionChip.getCheckedIcon(), getResources().getColor(R.color.color06ae));
        multiExclusionChip.setText(str);
        return multiExclusionChip;
    }

    public void A36() {
        C114495nr r0 = this.A0E;
        if (r0 != null) {
            r0.A06(true);
        }
        C114575nz r02 = this.A0F;
        if (r02 != null) {
            r02.A06(true);
        }
        boolean z2 = this.A0P;
        View view = this.A01;
        if (z2) {
            view.setVisibility(0);
            return;
        }
        view.setVisibility(8);
        if (!this.A06.A05(C15910s6.A0r) || TextUtils.isEmpty(this.A0L) || this.A08 != null) {
            C114495nr r1 = new C114495nr(new C117965tq(this), this, this.A0H, this.A0M);
            this.A0E = r1;
            C13700nu.A0W(r1, this.A05);
            return;
        }
        C218315p r8 = this.A0J;
        C114575nz r12 = new C114575nz(this.A05, this.A07, this.A0C, this.A0W, new C117965tq(this), this.A0H, r8, this.A0L, this.A0S);
        this.A0F = r12;
        C13700nu.A0W(r12, this.A05);
    }

    public final void A37() {
        this.A04.A05(true);
        MultiExclusionChipGroup multiExclusionChipGroup = this.A0I;
        if (multiExclusionChipGroup != null) {
            for (int i2 = 0; i2 < multiExclusionChipGroup.getChildCount(); i2++) {
                ((CompoundButton) multiExclusionChipGroup.getChildAt(i2)).setChecked(false);
            }
            this.A0I.setVisibility(8);
        }
        A36();
    }

    public final void A38() {
        C228919r A032;
        if (TextUtils.isEmpty(this.A0K) || (A032 = this.A0C.A04(this.A0K)) == null) {
            A032 = this.A0C.A03();
        }
        C1222969a ACC = A032.ACC();
        if (ACC != null) {
            Integer A0Y = C13680ns.A0Y();
            ACC.AKS(A0Y, A0Y, "payment_transaction_history", (String) null);
        }
    }

    public final boolean A39() {
        C228919r A032;
        if (!isTaskRoot()) {
            return false;
        }
        if (TextUtils.isEmpty(this.A0K) || (A032 = this.A0C.A04(this.A0K)) == null) {
            A032 = this.A0C.A03();
        }
        Class AEt = A032.AEt();
        this.A0V.A06(AnonymousClass000.A0g("PaymentTransactionHistoryActivity maybeOpenPaymentSettings ", AEt));
        Intent A042 = C110105dW.A04(this, AEt);
        if (Build.VERSION.SDK_INT >= 21) {
            finishAndRemoveTask();
            startActivity(A042);
            return true;
        }
        startActivity(A042);
        return false;
    }

    public void APN(String str) {
        this.A0G.A01();
    }

    public void AUd() {
        A36();
    }

    public void onBackPressed() {
        A38();
        if (this.A04.A06()) {
            A37();
        } else if (!A39()) {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r15.A0B.A07() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r5 = r15
            X.C110105dW.A0l(r15)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "extra_payment_service_name"
            java.lang.String r0 = r1.getStringExtra(r0)
            r15.A0K = r0
            r0 = r16
            super.onCreate(r0)
            X.0w8 r1 = r15.A0B
            r0 = 0
            boolean r2 = r1.A0C(r0)
            r1 = 1
            if (r2 != 0) goto L_0x0028
            X.0w8 r2 = r15.A0B
            boolean r3 = r2.A07()
            r2 = 0
            if (r3 == 0) goto L_0x0029
        L_0x0028:
            r2 = 1
        L_0x0029:
            X.AnonymousClass00B.A0G(r2)
            r2 = 2131559548(0x7f0d047c, float:1.8744443E38)
            r15.setContentView((int) r2)
            android.content.Intent r4 = r15.getIntent()
            r3 = 3
            java.lang.String r2 = "extra_payment_flow_entry_point"
            int r2 = r4.getIntExtra(r2, r3)
            r15.A00 = r2
            X.0sq r4 = r15.A05
            X.107 r3 = r15.A09
            X.64b r2 = new X.64b
            r2.<init>(r3)
            r4.Acl(r2)
            X.17Y r3 = r15.A0A
            X.1vk r2 = r15.A0U
            r3.A02(r2)
            boolean r2 = r15 instanceof com.obwhatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity
            X.15p r12 = r15.A0J
            X.013 r6 = r15.A05
            X.1Vo r9 = r15.A0V
            X.0t6 r7 = r15.A06
            java.util.ArrayList r13 = X.AnonymousClass000.A0u()
            X.5vO r11 = r15.A0H
            int r14 = r15.A00
            r10 = r15
            if (r2 == 0) goto L_0x015a
            X.5lH r4 = new X.5lH
            r8 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x006d:
            r15.A0G = r4
            r2 = 2131366742(0x7f0a1356, float:1.8353386E38)
            android.view.View r3 = r15.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            X.5f1 r2 = r15.A0G
            r3.setAdapter(r2)
            X.C004601z.A0p(r3, r1)
            r2 = 16908292(0x1020004, float:2.387724E-38)
            android.view.View r2 = r15.findViewById(r2)
            X.C004601z.A0p(r2, r1)
            r2 = 2131365555(0x7f0a0eb3, float:1.8350979E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r15.A02 = r2
            r2.setVisibility(r0)
            r2 = 2131363433(0x7f0a0669, float:1.8346675E38)
            android.view.View r2 = r15.findViewById(r2)
            r15.A01 = r2
            r2 = 2131363431(0x7f0a0667, float:1.834667E38)
            android.widget.TextView r2 = X.C13680ns.A0N(r15, r2)
            r15.A03 = r2
            androidx.appcompat.widget.Toolbar r10 = X.C110105dW.A09(r15)
            r15.Aem(r10)
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r2 = "extra_show_empty_list_screen"
            boolean r2 = r3.getBooleanExtra(r2, r0)
            r15.A0P = r2
            X.013 r11 = r15.A05
            r2 = 2131365943(0x7f0a1037, float:1.8351766E38)
            android.view.View r8 = r15.findViewById(r2)
            r4 = 2
            com.facebook.redex.IDxTListenerShape172S0100000_3_I1 r9 = new com.facebook.redex.IDxTListenerShape172S0100000_3_I1
            r9.<init>(r15, r4)
            X.267 r6 = new X.267
            r7 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            r15.A04 = r6
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r2 = "extra_for_mandates"
            boolean r2 = r3.getBooleanExtra(r2, r0)
            r15.A0R = r2
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r2 = "extra_show_mandate_pending_requests"
            boolean r2 = r3.getBooleanExtra(r2, r0)
            r15.A0Q = r2
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r2 = "extra_show_requests"
            boolean r2 = r3.getBooleanExtra(r2, r0)
            r15.A0S = r2
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r2 = "extra_disable_search"
            boolean r0 = r3.getBooleanExtra(r2, r0)
            r15.A0N = r0
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r0 = "extra_predefined_search_filter"
            android.os.Parcelable r2 = r2.getParcelableExtra(r0)
            X.1lg r2 = (X.C35291lg) r2
            if (r2 == 0) goto L_0x0116
            X.1tL r0 = r15.A0W
            r0.A01 = r2
        L_0x0116:
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r0 = "extra_jid"
            java.lang.String r0 = r2.getStringExtra(r0)
            X.0rv r0 = X.C15830rv.A02(r0)
            r15.A08 = r0
            X.02i r3 = r15.x()
            if (r3 == 0) goto L_0x0141
            boolean r0 = r15.A0S
            if (r0 == 0) goto L_0x0142
            android.content.res.Resources r2 = r15.getResources()
            r0 = 2131755277(0x7f10010d, float:1.9141429E38)
            java.lang.String r2 = r2.getQuantityString(r0, r4)
        L_0x013b:
            r3.A0J(r2)
            r3.A0N(r1)
        L_0x0141:
            return
        L_0x0142:
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r0 = "extra_list_screen_configurable_title"
            java.lang.String r2 = r2.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x013b
            r0 = 2131890406(0x7f1210e6, float:1.9415503E38)
            java.lang.String r2 = r15.getString(r0)
            goto L_0x013b
        L_0x015a:
            X.5f1 r4 = new X.5f1
            r8 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 100) {
            return super.onCreateDialog(i2);
        }
        C32241fu A002 = C32241fu.A00(this);
        A002.A01(R.string.str10b3);
        A002.A07(false);
        C110105dW.A0w(A002, this, 74, R.string.str0e87);
        A002.A02(R.string.str10af);
        return A002.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.A0N && !this.A0P) {
            menu.add(0, R.id.menuitem_search, 0, getString(R.string.str1d7c)).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        C114495nr r0 = this.A0E;
        if (r0 != null) {
            r0.A06(true);
        }
        C114575nz r02 = this.A0F;
        if (r02 != null) {
            r02.A06(true);
        }
        this.A0A.A03(this.A0U);
        this.A0E = null;
        this.A0F = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A38();
            finish();
            A39();
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0S = bundle.getBoolean("extra_show_requests");
        this.A08 = C15830rv.A02(bundle.getString("extra_jid"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_requests", this.A0S);
        C15830rv r0 = this.A08;
        if (r0 != null) {
            bundle.putString("extra_jid", r0.getRawString());
        }
    }

    public boolean onSearchRequested() {
        this.A04.A02();
        AnonymousClass267 r2 = this.A04;
        String string = getString(R.string.str14a4);
        SearchView searchView = r2.A02;
        if (searchView != null) {
            searchView.setQueryHint(string);
        }
        View findViewById = findViewById(R.id.search_back);
        if (this.A06.A05(C15910s6.A0r) && !this.A0S && (this.A0O || this.A0T)) {
            C13680ns.A1I(this, R.id.appBarLayout, 0);
            if (this.A0I == null) {
                MultiExclusionChipGroup multiExclusionChipGroup = (MultiExclusionChipGroup) C004601z.A0E(findViewById(R.id.payment_filters), R.id.payment_filter_group);
                this.A0I = multiExclusionChipGroup;
                String string2 = getString(R.string.str0fa7);
                String string3 = getString(R.string.str0fa9);
                String string4 = getString(R.string.str111f);
                String string5 = getString(R.string.str0fa8);
                MultiExclusionChip A35 = A35(string2);
                MultiExclusionChip A352 = A35(string3);
                MultiExclusionChip A353 = A35(string4);
                MultiExclusionChip A354 = A35(string5);
                if (this.A0T) {
                    ArrayList A0u = AnonymousClass000.A0u();
                    A0u.add(A35);
                    A0u.add(A352);
                    multiExclusionChipGroup.A01(A0u);
                }
                if (this.A0O) {
                    ArrayList A0u2 = AnonymousClass000.A0u();
                    A0u2.add(A353);
                    A0u2.add(A354);
                    multiExclusionChipGroup.A01(A0u2);
                }
                multiExclusionChipGroup.A00 = new AnonymousClass62K(this, A35, A352, A353, A354);
            }
            this.A0I.setVisibility(0);
        }
        C110105dW.A0r(findViewById, this, 98);
        return false;
    }

    public void onStart() {
        super.onStart();
        A36();
        AnonymousClass1MB r1 = this.A0D;
        r1.A00.clear();
        r1.A02.add(new WeakReference(this));
    }

    public void onStop() {
        super.onStop();
        C114495nr r0 = this.A0E;
        if (r0 != null) {
            r0.A06(true);
        }
        C114575nz r02 = this.A0F;
        if (r02 != null) {
            r02.A06(true);
        }
        this.A0E = null;
        this.A0F = null;
        this.A0D.A01(this);
    }
}

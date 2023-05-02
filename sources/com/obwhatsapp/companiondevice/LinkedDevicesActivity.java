package com.obwhatsapp.companiondevice;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01D;
import X.AnonymousClass01V;
import X.AnonymousClass078;
import X.AnonymousClass137;
import X.AnonymousClass139;
import X.AnonymousClass15P;
import X.AnonymousClass15V;
import X.AnonymousClass15X;
import X.AnonymousClass16S;
import X.AnonymousClass1BL;
import X.AnonymousClass1RS;
import X.AnonymousClass1SS;
import X.AnonymousClass1UX;
import X.AnonymousClass1WN;
import X.AnonymousClass2Rf;
import X.AnonymousClass2T3;
import X.AnonymousClass2UN;
import X.AnonymousClass38Y;
import X.C005402i;
import X.C006602z;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
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
import X.C17220uj;
import X.C17250um;
import X.C18260wP;
import X.C19410yO;
import X.C19490yW;
import X.C19590yg;
import X.C19680yp;
import X.C19950zG;
import X.C19980zJ;
import X.C226918x;
import X.C23061Ai;
import X.C23071Aj;
import X.C30801cy;
import X.C449126f;
import X.C47132Hs;
import X.C49132Rg;
import X.C49712Vf;
import X.C49722Vg;
import X.C91484fz;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxDObserverShape31S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

public class LinkedDevicesActivity extends C14530pL implements DialogInterface.OnDismissListener {
    public RecyclerView A00;
    public C19590yg A01;
    public C19680yp A02;
    public AnonymousClass2UN A03;
    public LinkedDevicesDetailDialogFragment A04;
    public LinkedDevicesSharedViewModel A05;
    public C49712Vf A06;
    public LinkedDevicesViewModel A07;
    public AnonymousClass139 A08;
    public AnonymousClass1SS A09;
    public C449126f A0A;
    public C19410yO A0B;
    public AnonymousClass137 A0C;
    public AnonymousClass15X A0D;
    public AnonymousClass16S A0E;
    public AnonymousClass1BL A0F;
    public AnonymousClass15V A0G;
    public C226918x A0H;
    public C17220uj A0I;
    public boolean A0J;
    public final AnonymousClass078 A0K;

    public LinkedDevicesActivity() {
        this(0);
        this.A0K = new IDxDObserverShape31S0100000_2_I0(this, 1);
    }

    public LinkedDevicesActivity(int i2) {
        this.A0J = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 40));
    }

    public void A1q() {
        if (!this.A0J) {
            this.A0J = true;
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
            this.A0G = new AnonymousClass15V();
            this.A0I = (C17220uj) r1.A9x.get();
            this.A0A = r2.A0E();
            this.A0E = (AnonymousClass16S) r1.AFt.get();
            this.A0D = (AnonymousClass15X) r1.AMk.get();
            this.A0H = (C226918x) r1.AO5.get();
            this.A0C = (AnonymousClass137) r1.A6f.get();
            this.A0B = (C19410yO) r1.A4T.get();
            this.A08 = (AnonymousClass139) r1.AOb.get();
            this.A01 = (C19590yg) r1.A4Y.get();
            this.A0F = (AnonymousClass1BL) r1.AJE.get();
            this.A09 = (AnonymousClass1SS) r1.A4S.get();
            this.A02 = (C19680yp) r1.A6k.get();
        }
    }

    public final void A35(List list) {
        boolean z2;
        if (!isFinishing() && list != null) {
            AnonymousClass2UN r5 = this.A03;
            List list2 = r5.A00;
            list2.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass1WN r0 = (AnonymousClass1WN) it.next();
                C49722Vg r2 = new C49722Vg(r0);
                Boolean bool = (Boolean) r5.A03.get(r0.A06);
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    z2 = true;
                    if (booleanValue) {
                        r2.A00 = z2;
                        list2.add(r2);
                    }
                }
                z2 = false;
                r2.A00 = z2;
                list2.add(r2);
            }
            r5.A0E();
            r5.A01();
            LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = this.A04;
            if (linkedDevicesDetailDialogFragment != null && linkedDevicesDetailDialogFragment.A07 != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AnonymousClass1WN r22 = (AnonymousClass1WN) it2.next();
                    if (r22.A06.equals(this.A04.A07.A06)) {
                        LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment2 = this.A04;
                        linkedDevicesDetailDialogFragment2.A07 = r22;
                        linkedDevicesDetailDialogFragment2.A0A = null;
                        if (linkedDevicesDetailDialogFragment2.A01 != null) {
                            linkedDevicesDetailDialogFragment2.A1M();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 100) {
            this.A07.A05();
        } else if (i2 != 101) {
            if (i2 == 12345) {
                this.A06.A00(i3);
            }
        } else if (i3 == -1 && intent != null && intent.getBooleanExtra("has_removed_all_devices", false)) {
            Log.i("LinkedDevicesActivity/onActivityResult removedAllDevices");
            C14870pt r2 = this.A05;
            r2.A02.post(new RunnableRunnableShape6S0100000_I0_5(this, 10));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A05.A0K(new RunnableRunnableShape6S0100000_I0_5(this, 11));
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass1UX r0;
        super.onCreate(bundle);
        setTitle(R.string.str0c4e);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        setContentView((int) R.layout.layout0384);
        this.A05 = (LinkedDevicesSharedViewModel) new C006602z(this).A01(LinkedDevicesSharedViewModel.class);
        this.A07 = (LinkedDevicesViewModel) new C006602z(this).A01(LinkedDevicesViewModel.class);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.linked_device_recycler_view);
        this.A00 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        AnonymousClass38Y r4 = new AnonymousClass38Y(this);
        C16440t3 r7 = this.A05;
        C14710pd r11 = this.A0C;
        C14870pt r3 = this.A05;
        C19980zJ r2 = this.A00;
        C17220uj r13 = this.A0I;
        AnonymousClass01V r6 = this.A08;
        AnonymousClass013 r8 = this.A01;
        AnonymousClass16S r12 = this.A0E;
        AnonymousClass2UN r1 = new AnonymousClass2UN(r2, r3, r4, this.A08, r6, r7, r8, this.A0B, this.A0C, r11, r12, r13);
        this.A03 = r1;
        this.A00.setAdapter(r1);
        this.A03.A01.registerObserver(this.A0K);
        C14710pd r42 = this.A0C;
        C14870pt r132 = this.A05;
        C49712Vf r112 = new C49712Vf(this.A03, r132, this, this.A03, this.A08, this.A0D, r42, this.A0G, this.A0H);
        this.A06 = r112;
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = r112.A05;
        C30801cy r22 = linkedDevicesSharedViewModel.A0O;
        C14530pL r32 = r112.A03;
        r22.A0A(r32, new IDxObserverShape115S0100000_2_I0((Object) r112, 135));
        linkedDevicesSharedViewModel.A0P.A0A(r32, new IDxObserverShape115S0100000_2_I0((Object) r112, 138));
        linkedDevicesSharedViewModel.A0Q.A0A(r32, new IDxObserverShape115S0100000_2_I0((Object) r112, 139));
        linkedDevicesSharedViewModel.A0M.A0A(r32, new IDxObserverShape115S0100000_2_I0((Object) r112, 136));
        linkedDevicesSharedViewModel.A0L.A0A(r32, new IDxObserverShape115S0100000_2_I0((Object) r112, 137));
        linkedDevicesSharedViewModel.A0U.A0A(r32, new IDxObserverShape115S0100000_2_I0((Object) r112, 140));
        linkedDevicesSharedViewModel.A05.A0A(r32, new IDxObserverShape115S0100000_2_I0((Object) r112, 134));
        linkedDevicesSharedViewModel.A0N.A0A(r32, new IDxObserverShape115S0100000_2_I0((Object) r112, 133));
        this.A05.A0T.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 128));
        this.A05.A0S.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 130));
        this.A05.A0R.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 127));
        this.A07.A08.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 131));
        this.A07.A07.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 132));
        this.A07.A06.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 129));
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel2 = this.A05;
        linkedDevicesSharedViewModel2.A0H.A05(linkedDevicesSharedViewModel2.A0W, linkedDevicesSharedViewModel2.A06.A06);
        C18260wP r23 = linkedDevicesSharedViewModel2.A0B;
        r23.A02(linkedDevicesSharedViewModel2.A0A);
        linkedDevicesSharedViewModel2.A0E.A02(linkedDevicesSharedViewModel2.A0D);
        synchronized (r23.A06) {
            r0 = r23.A00;
        }
        linkedDevicesSharedViewModel2.A01 = r0 == null ? null : Boolean.valueOf(r0.A04);
        this.A07.A05();
        C15860rz r14 = this.A0E.A01;
        if ((!(!r14.A1d()) || ((SharedPreferences) r14.A01.get()).getBoolean("md_opt_in_first_time_experience_shown", false)) && ((SharedPreferences) this.A09.A01.get()).getBoolean("md_opt_in_show_forced_dialog", false)) {
            this.A09.A0K().putBoolean("md_opt_in_show_forced_dialog", false).apply();
            AnonymousClass2T3 r24 = new AnonymousClass2T3();
            r24.A02 = R.layout.layout03be;
            IDxCListenerShape127S0100000_2_I0 iDxCListenerShape127S0100000_2_I0 = new IDxCListenerShape127S0100000_2_I0(this, 46);
            r24.A04 = R.string.str1cf6;
            r24.A07 = iDxCListenerShape127S0100000_2_I0;
            r24.A01(C91484fz.A00, R.string.str0e89);
            r24.A00().A1G(AGM(), "first_time_experience_dialog");
        }
        C15860rz r15 = this.A0E.A01;
        if ((!r15.A1d()) && !((SharedPreferences) r15.A01.get()).getBoolean("md_opt_in_first_time_experience_shown", false)) {
            this.A09.A0K().putBoolean("md_opt_in_first_time_experience_shown", true).apply();
            AnonymousClass2T3 r25 = new AnonymousClass2T3();
            r25.A02 = R.layout.layout03bf;
            IDxCListenerShape127S0100000_2_I0 iDxCListenerShape127S0100000_2_I02 = new IDxCListenerShape127S0100000_2_I0(this, 47);
            r25.A04 = R.string.str18b2;
            r25.A07 = iDxCListenerShape127S0100000_2_I02;
            r25.A01(C91484fz.A00, R.string.str0c13);
            r25.A00().A1G(AGM(), "first_time_experience_dialog");
        }
        C19680yp r5 = this.A02;
        if (r5.A03()) {
            AnonymousClass01D r43 = r5.A04.A01;
            boolean z2 = ((SharedPreferences) r43.get()).getBoolean("adv_key_index_list_require_update", false);
            int i2 = ((SharedPreferences) r43.get()).getInt("adv_key_index_list_update_retry_count", 0);
            if (z2 || i2 > 0) {
                Log.i("DeviceKeyIndexListUpdateHandler/onDevicesLoadedOnScreen/updating");
                r5.A00();
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A01.A04()) {
            C47132Hs A002 = this.A09.A00();
            C47132Hs r1 = C47132Hs.PHONE;
            int i2 = R.string.str0cfc;
            if (A002 != r1) {
                i2 = R.string.str0cfb;
            }
            menu.add(0, 1, 0, i2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        AnonymousClass2UN r0 = this.A03;
        r0.A01.unregisterObserver(this.A0K);
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A05;
        linkedDevicesSharedViewModel.A0B.A03(linkedDevicesSharedViewModel.A0A);
        AnonymousClass1RS r02 = linkedDevicesSharedViewModel.A0H;
        r02.A00.A02(linkedDevicesSharedViewModel.A0W);
        linkedDevicesSharedViewModel.A0E.A03(linkedDevicesSharedViewModel.A0D);
        super.onDestroy();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.A04 = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            Afc(new AndroidTabletBetaUpsellBottomSheet());
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.obwhatsapp.companionmode.registration.ConvertPrimaryToCompanionActivity");
            startActivity(intent);
            return true;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        DialogFragment dialogFragment;
        LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = this.A04;
        if (linkedDevicesDetailDialogFragment != null) {
            linkedDevicesDetailDialogFragment.A1D();
        }
        DialogFragment dialogFragment2 = (DialogFragment) AGM().A0B("first_time_experience_dialog");
        if (dialogFragment2 != null) {
            dialogFragment2.A1D();
        }
        AnonymousClass01A A0B2 = this.A06.A03.AGM().A0B("wifi_speed_bump_dialog");
        if ((A0B2 instanceof WifiSpeedBumpDialogFragment) && (dialogFragment = (DialogFragment) A0B2) != null) {
            dialogFragment.A1D();
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A05;
        linkedDevicesSharedViewModel.A0V.Acl(new RunnableRunnableShape6S0100000_I0_5(linkedDevicesSharedViewModel, 12));
    }

    public void onStop() {
        super.onStop();
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A05;
        Runnable runnable = linkedDevicesSharedViewModel.A02;
        if (runnable != null) {
            linkedDevicesSharedViewModel.A0V.Ac3(runnable);
        }
    }
}

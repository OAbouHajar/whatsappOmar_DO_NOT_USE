package com.obwhatsapp.location;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass020;
import X.AnonymousClass074;
import X.AnonymousClass0IS;
import X.AnonymousClass0P5;
import X.AnonymousClass0T2;
import X.AnonymousClass0UE;
import X.AnonymousClass0Wt;
import X.AnonymousClass0YG;
import X.AnonymousClass152;
import X.AnonymousClass16R;
import X.AnonymousClass1BQ;
import X.AnonymousClass1P7;
import X.AnonymousClass29S;
import X.AnonymousClass32e;
import X.C04660Nk;
import X.C05140Pl;
import X.C12830l2;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14710pd;
import X.C14870pt;
import X.C15810rt;
import X.C15860rz;
import X.C16040sK;
import X.C16150sX;
import X.C16260sj;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16760tb;
import X.C16980tz;
import X.C17020u3;
import X.C17030uP;
import X.C17130ua;
import X.C17160ud;
import X.C17220uj;
import X.C17250um;
import X.C19430yQ;
import X.C19950zG;
import X.C19980zJ;
import X.C206711d;
import X.C23061Ai;
import X.C25841Li;
import X.C35311li;
import X.C49132Rg;
import X.C55562jx;
import X.C614038t;
import X.C95504mk;
import X.C95524mm;
import X.C95544mo;
import X.C95554mp;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxCListenerShape329S0100000_2_I1;
import com.facebook.redex.IDxRCallbackShape296S0100000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public class LocationPicker extends C14530pL {
    public float A00;
    public float A01;
    public Bundle A02;
    public AnonymousClass074 A03;
    public C04660Nk A04;
    public C04660Nk A05;
    public C04660Nk A06;
    public AnonymousClass0IS A07;
    public AnonymousClass16R A08;
    public C17130ua A09;
    public C16760tb A0A;
    public C17160ud A0B;
    public C17030uP A0C;
    public AnonymousClass152 A0D;
    public C16980tz A0E;
    public C16260sj A0F;
    public C15810rt A0G;
    public C16460t6 A0H;
    public C206711d A0I;
    public AnonymousClass1BQ A0J;
    public C16490t9 A0K;
    public C25841Li A0L;
    public C55562jx A0M;
    public AnonymousClass29S A0N;
    public C19430yQ A0O;
    public AnonymousClass1P7 A0P;
    public WhatsAppLibLoader A0Q;
    public C17020u3 A0R;
    public C17220uj A0S;
    public boolean A0T;
    public boolean A0U;
    public final C12830l2 A0V;

    public LocationPicker() {
        this(0);
        this.A0V = new IDxRCallbackShape296S0100000_2_I1(this, 1);
    }

    public LocationPicker(int i2) {
        this.A0U = false;
        C13680ns.A1G(this, 84);
    }

    public static /* synthetic */ void A02(AnonymousClass074 r7, LocationPicker locationPicker) {
        if (locationPicker.A03 == null) {
            locationPicker.A03 = r7;
            if (r7 != null) {
                AnonymousClass00B.A06(r7);
                if (locationPicker.A0F.A05() && !locationPicker.A0N.A0v) {
                    locationPicker.A03.A0D(true);
                }
                AnonymousClass074 r3 = locationPicker.A03;
                AnonymousClass29S r0 = locationPicker.A0N;
                r3.A07(0, 0, Math.max(r0.A00, r0.A02));
                C05140Pl r02 = locationPicker.A03.A0T;
                r02.A01 = false;
                r02.A00();
                locationPicker.A03.A08 = new C95504mk(locationPicker);
                AnonymousClass074 r1 = locationPicker.A03;
                r1.A0D = new C95554mp(locationPicker);
                r1.A0A = new C95544mo(locationPicker);
                r1.A0B = new IDxCListenerShape329S0100000_2_I1(locationPicker, 2);
                r1.A09 = new C95524mm(locationPicker);
                locationPicker.A0N.A0R((Float) null, false);
                AnonymousClass29S r12 = locationPicker.A0N;
                C35311li r03 = r12.A0h;
                if (r03 != null && !r03.A08.isEmpty()) {
                    r12.A0E();
                }
                Bundle bundle = locationPicker.A02;
                if (bundle != null) {
                    locationPicker.A0M.setLocationMode(bundle.getInt("map_location_mode", 2));
                    if (locationPicker.A02.containsKey("camera_zoom")) {
                        locationPicker.A03.A09(AnonymousClass0T2.A01(new AnonymousClass020(locationPicker.A02.getDouble("camera_lat"), locationPicker.A02.getDouble("camera_lng")), locationPicker.A02.getFloat("camera_zoom")));
                    }
                    locationPicker.A02 = null;
                    return;
                }
                SharedPreferences A002 = locationPicker.A0R.A00(AnonymousClass01S.A07);
                locationPicker.A03.A09(AnonymousClass0T2.A01(new AnonymousClass020((double) A002.getFloat("share_location_lat", 37.389805f), (double) A002.getFloat("share_location_lon", -122.08141f)), A002.getFloat("share_location_zoom", 15.0f) - 0.2f));
            }
        }
    }

    public static /* synthetic */ void A03(AnonymousClass020 r2, LocationPicker locationPicker) {
        AnonymousClass00B.A06(locationPicker.A03);
        AnonymousClass0IS r0 = locationPicker.A07;
        if (r0 == null) {
            AnonymousClass0UE r1 = new AnonymousClass0UE();
            r1.A01 = r2;
            r1.A00 = locationPicker.A04;
            locationPicker.A07 = locationPicker.A03.A03(r1);
            return;
        }
        r0.A0J(r2);
        locationPicker.A07.A0A(true);
    }

    public void A1q() {
        if (!this.A0U) {
            this.A0U = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A0L = (C25841Li) r1.AB1.get();
            this.A0E = C16150sX.A0V(r1);
            this.A0G = C16150sX.A0c(r1);
            this.A09 = C16150sX.A05(r1);
            this.A0K = C16150sX.A0m(r1);
            this.A0A = (C16760tb) r1.APV.get();
            this.A0I = (C206711d) r1.AKp.get();
            this.A0P = (AnonymousClass1P7) r1.ADc.get();
            this.A0B = C16150sX.A0L(r1);
            this.A0S = C16150sX.A18(r1);
            this.A0H = (C16460t6) r1.A5k.get();
            this.A0Q = (WhatsAppLibLoader) r1.AR7.get();
            this.A0J = (AnonymousClass1BQ) r1.A7f.get();
            this.A0C = C16150sX.A0P(r1);
            this.A0F = C16150sX.A0X(r1);
            this.A08 = (AnonymousClass16R) r1.AAq.get();
            this.A0O = (C19430yQ) r1.ADa.get();
            this.A0R = C16150sX.A14(r1);
            this.A0D = (AnonymousClass152) r1.A51.get();
        }
    }

    public void onBackPressed() {
        AnonymousClass29S r2 = this.A0N;
        if (r2.A0Z.A06()) {
            r2.A0Z.A05(true);
            return;
        }
        r2.A0b.A05.dismiss();
        if (r2.A0v) {
            r2.A06();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        setTitle(R.string.str14f3);
        C614038t r1 = new C614038t(this.A09, this.A0K, this.A0D);
        C16980tz r50 = this.A0E;
        C16440t3 r49 = this.A05;
        C14710pd r35 = this.A0C;
        C14870pt r48 = this.A05;
        C23061Ai r44 = this.A0B;
        C16300so r47 = this.A03;
        C16040sK r46 = this.A01;
        C16320sq r45 = this.A05;
        C15810rt r30 = this.A0G;
        C17130ua r26 = this.A09;
        C17250um r25 = this.A0B;
        C16760tb r23 = this.A0A;
        C206711d r22 = this.A0I;
        C19980zJ r20 = this.A00;
        AnonymousClass1P7 r19 = this.A0P;
        C17160ud r21 = this.A0B;
        AnonymousClass01V r24 = this.A08;
        C17220uj r18 = this.A0S;
        C16460t6 r15 = this.A0H;
        WhatsAppLibLoader whatsAppLibLoader = this.A0Q;
        AnonymousClass1BQ r13 = this.A0J;
        C17030uP r12 = this.A0C;
        C19950zG r11 = this.A0D;
        C16260sj r10 = this.A0F;
        C15860rz r9 = this.A09;
        AnonymousClass16R r8 = this.A08;
        C19430yQ r7 = this.A0O;
        C17020u3 r6 = this.A0R;
        C17220uj r43 = r18;
        IDxUIShape17S0200000_1_I1 iDxUIShape17S0200000_1_I1 = new IDxUIShape17S0200000_1_I1(r20, r47, r8, r48, r46, r26, r23, r21, r12, this.A0D, r24, r49, r50, r10, r9, this.A01, r30, r15, r22, r25, r13, r35, r11, this, r7, r19, r1, whatsAppLibLoader, r6, r43, r44, r45);
        this.A0N = iDxUIShape17S0200000_1_I1;
        iDxUIShape17S0200000_1_I1.A0N(bundle2, this);
        C13680ns.A16(this.A0N.A0D, this, 40);
        this.A0P.A04(this);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_green);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_red);
        this.A05 = AnonymousClass0Wt.A01(decodeResource);
        this.A06 = AnonymousClass0Wt.A01(decodeResource2);
        this.A04 = AnonymousClass0Wt.A01(this.A0N.A05);
        AnonymousClass0P5 r14 = new AnonymousClass0P5();
        r14.A06 = true;
        r14.A03 = false;
        r14.A02 = "whatsapp_location_picker";
        this.A0M = new AnonymousClass32e(this, r14, this);
        ((ViewGroup) AnonymousClass00T.A05(this, R.id.map_holder)).addView(this.A0M);
        this.A0M.A0E(bundle2);
        this.A02 = bundle2;
        if (this.A03 == null) {
            this.A03 = this.A0M.A0J(this.A0V);
        }
        this.A0N.A0T = (ImageView) AnonymousClass00T.A05(this, R.id.my_location);
        C13680ns.A16(this.A0N.A0T, this, 41);
    }

    public Dialog onCreateDialog(int i2) {
        Dialog A012 = this.A0N.A01(i2);
        return A012 == null ? super.onCreateDialog(i2) : A012;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return C14530pL.A0q(menu);
    }

    public void onDestroy() {
        this.A0N.A03();
        if (this.A03 != null) {
            SharedPreferences.Editor edit = this.A0R.A00(AnonymousClass01S.A07).edit();
            AnonymousClass0YG A022 = this.A03.A02();
            AnonymousClass020 r4 = A022.A03;
            edit.putFloat("share_location_lat", (float) r4.A00);
            edit.putFloat("share_location_lon", (float) r4.A01);
            edit.putFloat("share_location_zoom", A022.A02);
            edit.apply();
        }
        super.onDestroy();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0M.A05();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A0N.A0J(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.A0N.A0Z(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        C55562jx r0 = this.A0M;
        SensorManager sensorManager = r0.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0D);
        }
        AnonymousClass29S r1 = this.A0N;
        r1.A0s = r1.A1C.A05();
        r1.A11.A04(r1);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        if (this.A0N.A0v) {
            menu.findItem(0).setVisible(false);
            findItem = menu.findItem(1);
        } else {
            if (!this.A0F.A05()) {
                findItem = menu.findItem(0);
            }
            return true;
        }
        findItem.setVisible(false);
        return true;
    }

    public void onResume() {
        AnonymousClass074 r1;
        super.onResume();
        if (this.A0F.A05() != this.A0N.A0s) {
            invalidateOptionsMenu();
            if (this.A0F.A05() && (r1 = this.A03) != null && !this.A0N.A0v) {
                r1.A0D(true);
            }
        }
        this.A0M.A0K();
        if (this.A03 == null) {
            this.A03 = this.A0M.A0J(this.A0V);
        }
        this.A0N.A04();
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass074 r0 = this.A03;
        if (r0 != null) {
            AnonymousClass0YG A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            AnonymousClass020 r3 = A022.A03;
            bundle.putDouble("camera_lat", r3.A00);
            bundle.putDouble("camera_lng", r3.A01);
            bundle.putInt("map_location_mode", this.A0M.A02);
        }
        this.A0M.A0F(bundle);
        this.A0N.A0M(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        this.A0N.A0Z.A02();
        return false;
    }
}

package com.obwhatsapp.location;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass152;
import X.AnonymousClass16R;
import X.AnonymousClass1B5;
import X.AnonymousClass1B9;
import X.AnonymousClass1BQ;
import X.AnonymousClass1P7;
import X.AnonymousClass29S;
import X.AnonymousClass2Ao;
import X.AnonymousClass2DE;
import X.AnonymousClass2NT;
import X.AnonymousClass2R8;
import X.AnonymousClass3EJ;
import X.AnonymousClass3EK;
import X.AnonymousClass491;
import X.AnonymousClass4C4;
import X.AnonymousClass4EP;
import X.AnonymousClass5OF;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14710pd;
import X.C14870pt;
import X.C15810rt;
import X.C15860rz;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
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
import X.C17200uh;
import X.C17220uj;
import X.C17250um;
import X.C17270uo;
import X.C19430yQ;
import X.C19610yi;
import X.C19950zG;
import X.C19980zJ;
import X.C206711d;
import X.C23061Ai;
import X.C25841Li;
import X.C32451gN;
import X.C35311li;
import X.C434920f;
import X.C438721w;
import X.C49132Rg;
import X.C55582jz;
import X.C58002sK;
import X.C58012sL;
import X.C614038t;
import X.C76663uU;
import X.C98604sg;
import X.C98634sj;
import X.C98644sk;
import X.C98664sm;
import X.C98674sn;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.R;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public class LocationPicker2 extends C14530pL {
    public Bundle A00;
    public View A01;
    public AnonymousClass2NT A02;
    public AnonymousClass4C4 A03;
    public AnonymousClass4C4 A04;
    public AnonymousClass4C4 A05;
    public C32451gN A06;
    public AnonymousClass16R A07;
    public C17130ua A08;
    public C16760tb A09;
    public C17160ud A0A;
    public C16000sG A0B;
    public C17030uP A0C;
    public C16080sP A0D;
    public AnonymousClass2Ao A0E;
    public C17200uh A0F;
    public AnonymousClass152 A0G;
    public AnonymousClass1B5 A0H;
    public C19610yi A0I;
    public C16980tz A0J;
    public C16260sj A0K;
    public C15810rt A0L;
    public C16460t6 A0M;
    public C206711d A0N;
    public AnonymousClass1BQ A0O;
    public C16490t9 A0P;
    public C25841Li A0Q;
    public AnonymousClass4EP A0R;
    public C55582jz A0S;
    public AnonymousClass29S A0T;
    public C19430yQ A0U;
    public AnonymousClass1P7 A0V;
    public WhatsAppLibLoader A0W;
    public C17020u3 A0X;
    public C17220uj A0Y;
    public AnonymousClass01D A0Z;
    public AnonymousClass01D A0a;
    public boolean A0b;
    public final AnonymousClass5OF A0c;

    public LocationPicker2() {
        this(0);
        this.A0c = new C98674sn(this);
    }

    public LocationPicker2(int i2) {
        this.A0b = false;
        C13680ns.A1G(this, 85);
    }

    public static /* synthetic */ void A02(AnonymousClass2NT r7, LocationPicker2 locationPicker2) {
        if (locationPicker2.A02 == null) {
            locationPicker2.A02 = r7;
            if (r7 != null) {
                AnonymousClass00B.A06(r7);
                locationPicker2.A0R = new AnonymousClass4EP(r7);
                r7.A0M(false);
                locationPicker2.A02.A0K(true);
                if (locationPicker2.A0K.A05() && !locationPicker2.A0T.A0v) {
                    locationPicker2.A02.A0L(true);
                }
                AnonymousClass2NT r3 = locationPicker2.A02;
                AnonymousClass29S r0 = locationPicker2.A0T;
                r3.A08(0, 0, 0, Math.max(r0.A00, r0.A02));
                locationPicker2.A02.A01().A00();
                locationPicker2.A02.A0D(new C98604sg(locationPicker2));
                locationPicker2.A02.A0I(new C98664sm(locationPicker2));
                locationPicker2.A02.A0G(new C98634sj(locationPicker2));
                locationPicker2.A02.A0H(new C98644sk(locationPicker2));
                locationPicker2.A02.A0F(new AnonymousClass3EK(locationPicker2));
                locationPicker2.A02.A0E(new AnonymousClass3EJ(locationPicker2));
                locationPicker2.A0T.A0R((Float) null, false);
                AnonymousClass29S r1 = locationPicker2.A0T;
                C35311li r02 = r1.A0h;
                if (r02 != null && !r02.A08.isEmpty()) {
                    r1.A0E();
                }
                Bundle bundle = locationPicker2.A00;
                if (bundle != null) {
                    locationPicker2.A0S.setLocationMode(bundle.getInt("map_location_mode", 2));
                    if (locationPicker2.A00.containsKey("camera_zoom")) {
                        locationPicker2.A02.A0A(AnonymousClass2R8.A02(new LatLng(locationPicker2.A00.getDouble("camera_lat"), locationPicker2.A00.getDouble("camera_lng")), locationPicker2.A00.getFloat("camera_zoom")));
                    }
                    locationPicker2.A00 = null;
                } else {
                    SharedPreferences A002 = locationPicker2.A0X.A00(AnonymousClass01S.A07);
                    locationPicker2.A02.A0A(AnonymousClass2R8.A02(new LatLng((double) A002.getFloat("share_location_lat", 37.389805f), (double) A002.getFloat("share_location_lon", -122.08141f)), A002.getFloat("share_location_zoom", 15.0f) - 0.2f));
                }
                if (C434920f.A09(locationPicker2)) {
                    locationPicker2.A02.A0J(C58002sK.A03(locationPicker2, R.raw.night_map_style_json));
                }
            }
        }
    }

    public static /* synthetic */ void A03(LatLng latLng, LocationPicker2 locationPicker2) {
        AnonymousClass2NT r2 = locationPicker2.A02;
        AnonymousClass00B.A06(r2);
        C32451gN r0 = locationPicker2.A06;
        if (r0 == null) {
            C58012sL r1 = new C58012sL();
            r1.A08 = latLng;
            r1.A07 = locationPicker2.A03;
            locationPicker2.A06 = r2.A03(r1);
            return;
        }
        r0.A06(latLng);
        locationPicker2.A06.A09(true);
    }

    public void A1q() {
        if (!this.A0b) {
            this.A0b = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A0Q = (C25841Li) r1.AB1.get();
            this.A0J = C16150sX.A0V(r1);
            this.A0L = C16150sX.A0c(r1);
            this.A08 = C16150sX.A05(r1);
            this.A0P = C16150sX.A0m(r1);
            this.A09 = (C16760tb) r1.APV.get();
            this.A0N = (C206711d) r1.AKp.get();
            this.A0F = C16150sX.A0R(r1);
            this.A0V = (AnonymousClass1P7) r1.ADc.get();
            this.A0A = C16150sX.A0L(r1);
            this.A0B = C16150sX.A0M(r1);
            this.A0Y = C16150sX.A18(r1);
            this.A0D = C16150sX.A0Q(r1);
            this.A0M = (C16460t6) r1.A5k.get();
            this.A0W = (WhatsAppLibLoader) r1.AR7.get();
            this.A0O = (AnonymousClass1BQ) r1.A7f.get();
            this.A0C = C16150sX.A0P(r1);
            this.A0K = C16150sX.A0X(r1);
            this.A07 = (AnonymousClass16R) r1.AAq.get();
            this.A0U = (C19430yQ) r1.ADa.get();
            this.A0X = C16150sX.A14(r1);
            this.A0H = (AnonymousClass1B5) r1.AEp.get();
            this.A0G = (AnonymousClass152) r1.A51.get();
            this.A0I = (C19610yi) r1.AEq.get();
            this.A0Z = C17270uo.A00(r1.AGp);
            this.A0a = C17270uo.A00(r1.ALh);
        }
    }

    public void onBackPressed() {
        if (C14550pN.A1Q(this)) {
            this.A0Z.get();
        }
        AnonymousClass29S r2 = this.A0T;
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
        C614038t r1 = new C614038t(this.A08, this.A0P, this.A0D);
        C16980tz r50 = this.A0J;
        C16440t3 r49 = this.A05;
        C14710pd r35 = this.A0C;
        C14870pt r48 = this.A05;
        C23061Ai r44 = this.A0B;
        C16300so r47 = this.A03;
        C16040sK r46 = this.A01;
        C16320sq r45 = this.A05;
        C15810rt r30 = this.A0L;
        C17130ua r26 = this.A08;
        C17250um r25 = this.A0B;
        C16760tb r23 = this.A09;
        C206711d r22 = this.A0N;
        C19980zJ r20 = this.A00;
        AnonymousClass1P7 r19 = this.A0V;
        C17160ud r21 = this.A0A;
        AnonymousClass01V r24 = this.A08;
        C17220uj r18 = this.A0Y;
        C16460t6 r15 = this.A0M;
        WhatsAppLibLoader whatsAppLibLoader = this.A0W;
        AnonymousClass1BQ r13 = this.A0O;
        C17030uP r12 = this.A0C;
        C19950zG r11 = this.A0D;
        C16260sj r10 = this.A0K;
        C15860rz r9 = this.A09;
        AnonymousClass16R r8 = this.A07;
        C19430yQ r7 = this.A0U;
        C17020u3 r6 = this.A0X;
        C17220uj r43 = r18;
        IDxUIShape17S0200000_1_I1 iDxUIShape17S0200000_1_I1 = new IDxUIShape17S0200000_1_I1(r20, r47, r8, r48, r46, r26, r23, r21, r12, this.A0G, r24, r49, r50, r10, r9, this.A01, r30, r15, r22, r25, r13, r35, r11, this, r7, r19, r1, whatsAppLibLoader, r6, r43, r44, r45);
        this.A0T = iDxUIShape17S0200000_1_I1;
        iDxUIShape17S0200000_1_I1.A0N(bundle2, this);
        C13680ns.A16(this.A0T.A0D, this, 43);
        C438721w.A00(this);
        this.A04 = AnonymousClass491.A00(BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_green));
        this.A05 = AnonymousClass491.A00(BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_red));
        this.A03 = AnonymousClass491.A00(this.A0T.A05);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.A00 = 1;
        googleMapOptions.A0C = false;
        googleMapOptions.A05 = false;
        googleMapOptions.A08 = true;
        googleMapOptions.A06 = false;
        googleMapOptions.A0A = true;
        googleMapOptions.A09 = true;
        this.A0S = new C76663uU(this, googleMapOptions, this);
        ((ViewGroup) AnonymousClass00T.A05(this, R.id.map_holder)).addView(this.A0S);
        this.A0S.A04(bundle2);
        this.A00 = bundle2;
        if (this.A02 == null) {
            this.A02 = this.A0S.A07(this.A0c);
        }
        this.A0T.A0T = (ImageView) AnonymousClass00T.A05(this, R.id.my_location);
        C13680ns.A16(this.A0T.A0T, this, 42);
    }

    public Dialog onCreateDialog(int i2) {
        Dialog A012 = this.A0T.A01(i2);
        return A012 == null ? super.onCreateDialog(i2) : A012;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return C14530pL.A0q(menu);
    }

    public void onDestroy() {
        this.A0S.A00();
        this.A0T.A03();
        if (this.A02 != null) {
            SharedPreferences.Editor edit = this.A0X.A00(AnonymousClass01S.A07).edit();
            CameraPosition A022 = this.A02.A02();
            LatLng latLng = A022.A03;
            edit.putFloat("share_location_lat", (float) latLng.A00);
            edit.putFloat("share_location_lon", (float) latLng.A01);
            edit.putFloat("share_location_zoom", A022.A02);
            edit.apply();
        }
        if (C14550pN.A1Q(this)) {
            AnonymousClass2DE.A02(this.A01, this.A0I);
            AnonymousClass2Ao r0 = this.A0E;
            if (r0 != null) {
                r0.A00();
                this.A0E = null;
            }
        }
        super.onDestroy();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0S.A01();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A0T.A0J(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.A0T.A0Z(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        this.A0S.A02();
        C55582jz r0 = this.A0S;
        SensorManager sensorManager = r0.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0C);
        }
        AnonymousClass29S r1 = this.A0T;
        r1.A0s = r1.A1C.A05();
        r1.A11.A04(r1);
        if (C14550pN.A1Q(this)) {
            AnonymousClass2DE.A07(this.A0I);
            C14530pL.A0i(this, this.A0Z);
        }
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        if (this.A0T.A0v) {
            menu.findItem(0).setVisible(false);
            findItem = menu.findItem(1);
        } else {
            if (!this.A0K.A05()) {
                findItem = menu.findItem(0);
            }
            return true;
        }
        findItem.setVisible(false);
        return true;
    }

    public void onResume() {
        AnonymousClass2NT r1;
        super.onResume();
        if (this.A0K.A05() != this.A0T.A0s) {
            invalidateOptionsMenu();
            if (this.A0K.A05() && (r1 = this.A02) != null && !this.A0T.A0v) {
                r1.A0L(true);
            }
        }
        this.A0S.A03();
        this.A0S.A08();
        if (this.A02 == null) {
            this.A02 = this.A0S.A07(this.A0c);
        }
        this.A0T.A04();
        if (C14550pN.A1Q(this)) {
            boolean z2 = ((AnonymousClass1B9) this.A0Z.get()).A03;
            View view = this.A00;
            if (z2) {
                C14710pd r15 = this.A0C;
                C14870pt r13 = this.A05;
                C16040sK r12 = this.A01;
                C16320sq r11 = this.A05;
                C17200uh r10 = this.A0F;
                C16000sG r9 = this.A0B;
                C16080sP r8 = this.A0D;
                AnonymousClass013 r7 = this.A01;
                AnonymousClass1B5 r6 = this.A0H;
                C19610yi r5 = this.A0I;
                AnonymousClass01D r4 = this.A0Z;
                AnonymousClass01D r3 = this.A0a;
                View view2 = this.A01;
                AnonymousClass2Ao r14 = this.A0E;
                C15860rz r25 = this.A09;
                C19610yi r24 = r5;
                AnonymousClass1B5 r23 = r6;
                C17200uh r22 = r10;
                AnonymousClass2Ao r21 = r14;
                C16080sP r20 = r8;
                C16000sG r19 = r9;
                C16040sK r18 = r12;
                C14870pt r17 = r13;
                View view3 = view2;
                View view4 = view;
                Pair A002 = AnonymousClass2DE.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "location-picker-activity");
                this.A01 = (View) A002.first;
                this.A0E = (AnonymousClass2Ao) A002.second;
            } else if (AnonymousClass1B9.A00(view)) {
                AnonymousClass2DE.A04(this.A00, this.A0I, this.A0Z);
            }
            ((AnonymousClass1B9) this.A0Z.get()).A01();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass2NT r0 = this.A02;
        if (r0 != null) {
            CameraPosition A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            LatLng latLng = A022.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A0S.A03);
        }
        this.A0S.A05(bundle);
        this.A0T.A0M(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        this.A0T.A0Z.A02();
        return false;
    }
}

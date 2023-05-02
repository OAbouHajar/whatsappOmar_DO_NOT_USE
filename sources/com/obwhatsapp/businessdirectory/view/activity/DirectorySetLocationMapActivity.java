package com.obwhatsapp.businessdirectory.view.activity;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass16R;
import X.AnonymousClass26B;
import X.AnonymousClass2NT;
import X.AnonymousClass2R7;
import X.AnonymousClass2R8;
import X.AnonymousClass2R9;
import X.AnonymousClass2Rf;
import X.AnonymousClass399;
import X.AnonymousClass3EI;
import X.AnonymousClass464;
import X.AnonymousClass4DM;
import X.AnonymousClass5OF;
import X.C105555Ab;
import X.C109225Re;
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
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17210ui;
import X.C17250um;
import X.C18110wA;
import X.C18170wG;
import X.C18260wP;
import X.C18890xQ;
import X.C19430yQ;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C25511Kb;
import X.C25641Ko;
import X.C30321cA;
import X.C31361e1;
import X.C32241fu;
import X.C434920f;
import X.C49132Rg;
import X.C50592a6;
import X.C55582jz;
import X.C58002sK;
import X.C66713aN;
import X.C66733aP;
import X.C90334dy;
import X.C98624si;
import X.C98654sl;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape368S0100000_2_I0;
import com.facebook.redex.IDxGListenerShape420S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape330S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape367S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.R;
import com.obwhatsapp.location.LocationSharingService;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public class DirectorySetLocationMapActivity extends C14530pL implements C30321cA {
    public Bundle A00;
    public AnonymousClass2NT A01;
    public AnonymousClass16R A02;
    public C18890xQ A03;
    public C17210ui A04;
    public AnonymousClass399 A05;
    public C25511Kb A06;
    public C25641Ko A07;
    public C18170wG A08;
    public AnonymousClass2R7 A09;
    public C16260sj A0A;
    public AnonymousClass013 A0B;
    public C55582jz A0C;
    public C19430yQ A0D;
    public WhatsAppLibLoader A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final AnonymousClass5OF A0I;

    public DirectorySetLocationMapActivity() {
        this(0);
        this.A0H = true;
        this.A0I = new IDxRCallbackShape330S0100000_2_I0(this, 0);
    }

    public DirectorySetLocationMapActivity(int i2) {
        this.A0F = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 29));
    }

    public static /* synthetic */ void A02(AnonymousClass2NT r8, DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        AnonymousClass2NT r1;
        AnonymousClass2R9 A022;
        Double d2;
        Float f2;
        if (directorySetLocationMapActivity.A01 == null) {
            directorySetLocationMapActivity.A01 = r8;
            AnonymousClass00B.A07(r8, "DirectorySetLocationMapActivity/setUpMap map is not available");
            AnonymousClass2R7 r2 = directorySetLocationMapActivity.A09;
            AnonymousClass00B.A07(r2.A03, "DirectorySetLocationMapActivity/setUpMap ui.centerView is not available");
            AnonymousClass00B.A07(r2.A01, "DirectorySetLocationMapActivity/setUpMap ui.centerFillerView is not available");
            AnonymousClass00B.A07(r2.A02, "DirectorySetLocationMapActivity/setUpMap ui.centerPinView is not available");
            r8.A0M(false);
            directorySetLocationMapActivity.A01.A0K(false);
            if (directorySetLocationMapActivity.A0A.A05() && directorySetLocationMapActivity.A09.A0E) {
                directorySetLocationMapActivity.A01.A0L(true);
            } else if (directorySetLocationMapActivity.A0A.A05()) {
                AnonymousClass2R7 r12 = directorySetLocationMapActivity.A09;
                if (!r12.A0E) {
                    r12.A02(new AnonymousClass4DM(directorySetLocationMapActivity));
                }
            }
            directorySetLocationMapActivity.A01.A01().A00();
            directorySetLocationMapActivity.A01.A0H(new IDxCListenerShape368S0100000_2_I0(directorySetLocationMapActivity, 0));
            directorySetLocationMapActivity.A01.A0F(new IDxSListenerShape367S0100000_2_I0(directorySetLocationMapActivity, 0));
            AnonymousClass2NT r0 = directorySetLocationMapActivity.A01;
            C98654sl r13 = new C98654sl(directorySetLocationMapActivity);
            try {
                IGoogleMapDelegate iGoogleMapDelegate = r0.A01;
                C66713aN r02 = new C66713aN(r13);
                C31361e1 r22 = (C31361e1) iGoogleMapDelegate;
                Parcel A012 = r22.A01();
                C90334dy.A00(r02, A012);
                r22.A03(42, A012);
                AnonymousClass2NT r03 = directorySetLocationMapActivity.A01;
                C98624si r14 = new C98624si(directorySetLocationMapActivity);
                try {
                    IGoogleMapDelegate iGoogleMapDelegate2 = r03.A01;
                    C66733aP r04 = new C66733aP(r14);
                    C31361e1 r23 = (C31361e1) iGoogleMapDelegate2;
                    Parcel A013 = r23.A01();
                    C90334dy.A00(r04, A013);
                    r23.A03(98, A013);
                    directorySetLocationMapActivity.A01.A0E(new AnonymousClass3EI(directorySetLocationMapActivity));
                    int dimensionPixelSize = directorySetLocationMapActivity.getResources().getDimensionPixelSize(R.dimen.dimen050b);
                    directorySetLocationMapActivity.A01.A08(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    Bundle bundle = directorySetLocationMapActivity.A00;
                    if (bundle != null) {
                        if (bundle.containsKey("camera_zoom")) {
                            float f3 = directorySetLocationMapActivity.A00.getFloat("camera_zoom");
                            double d3 = directorySetLocationMapActivity.A00.getDouble("camera_lat");
                            double d4 = directorySetLocationMapActivity.A00.getDouble("camera_lng");
                            directorySetLocationMapActivity.A09.A0G = directorySetLocationMapActivity.A00.getBoolean("should_update_address");
                            directorySetLocationMapActivity.A01.A0A(AnonymousClass2R8.A02(new LatLng(d3, d4), f3));
                        }
                        directorySetLocationMapActivity.A00 = null;
                    } else {
                        AnonymousClass2R7 r24 = directorySetLocationMapActivity.A09;
                        Double d5 = r24.A09;
                        if (d5 == null || (d2 = r24.A0A) == null || (f2 = r24.A0B) == null) {
                            AnonymousClass26B A002 = directorySetLocationMapActivity.A07.A00();
                            if (A002 == null) {
                                A002 = directorySetLocationMapActivity.A08.A00();
                            }
                            if ("city_default".equals(A002.A08)) {
                                Double d6 = A002.A03;
                                AnonymousClass00B.A06(d6);
                                double doubleValue = d6.doubleValue();
                                Double d7 = A002.A04;
                                AnonymousClass00B.A06(d7);
                                LatLng latLng = new LatLng(doubleValue, d7.doubleValue());
                                r1 = directorySetLocationMapActivity.A01;
                                A022 = AnonymousClass2R8.A02(latLng, 10.0f);
                            }
                        } else {
                            LatLng latLng2 = new LatLng(d5.doubleValue(), d2.doubleValue());
                            r1 = directorySetLocationMapActivity.A01;
                            A022 = AnonymousClass2R8.A02(latLng2, f2.floatValue());
                        }
                        r1.A0A(A022);
                    }
                    if (C434920f.A09(directorySetLocationMapActivity)) {
                        directorySetLocationMapActivity.A01.A0J(C58002sK.A03(directorySetLocationMapActivity, R.raw.night_map_style_json));
                    }
                    Intent intent = directorySetLocationMapActivity.getIntent();
                    String stringExtra = intent.getStringExtra("country_name");
                    if (stringExtra != null) {
                        AnonymousClass2R7 r15 = directorySetLocationMapActivity.A09;
                        r15.A08 = null;
                        r15.A06.setVisibility(0);
                        directorySetLocationMapActivity.A05.Acl(new RunnableRunnableShape0S1100000_I0(19, stringExtra, directorySetLocationMapActivity));
                        return;
                    }
                    double doubleExtra = intent.getDoubleExtra("latitude", 500.0d);
                    double doubleExtra2 = intent.getDoubleExtra("longitude", 500.0d);
                    if (doubleExtra != 500.0d && doubleExtra2 != 500.0d) {
                        AnonymousClass2R7 r16 = directorySetLocationMapActivity.A09;
                        r16.A0F = false;
                        r16.A09 = Double.valueOf(doubleExtra);
                        r16.A0A = Double.valueOf(doubleExtra2);
                        LatLng latLng3 = new LatLng(doubleExtra, doubleExtra2);
                        AnonymousClass2NT r17 = directorySetLocationMapActivity.A01;
                        AnonymousClass00B.A06(r17);
                        r17.A0A(AnonymousClass2R8.A02(latLng3, 16.0f));
                    }
                } catch (RemoteException e2) {
                    throw new C105555Ab(e2);
                }
            } catch (RemoteException e3) {
                throw new C105555Ab(e3);
            }
        }
    }

    public void A1q() {
        if (!this.A0F) {
            this.A0F = true;
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
            this.A03 = (C18890xQ) r2.APS.get();
            this.A0B = (AnonymousClass013) r2.AR8.get();
            this.A0E = (WhatsAppLibLoader) r2.AR7.get();
            this.A0A = (C16260sj) r2.AQe.get();
            this.A02 = (AnonymousClass16R) r2.AAq.get();
            this.A0D = (C19430yQ) r2.ADa.get();
            this.A04 = (C17210ui) r2.A73.get();
            this.A07 = (C25641Ko) r2.ALS.get();
            this.A06 = (C25511Kb) r2.A2u.get();
            this.A08 = C16150sX.A0F(r2);
            this.A05 = new AnonymousClass399((C50592a6) r1.A0N.get(), (C18110wA) r2.ABF.get());
        }
    }

    public final void A35() {
        Double d2;
        AnonymousClass2R7 r4 = this.A09;
        Double d3 = r4.A09;
        if (d3 == null || (d2 = r4.A0A) == null) {
            A37();
        } else {
            this.A05.A01(new LatLng(d3.doubleValue(), d2.doubleValue()), this, r4.A0C, "pin_on_map", 10.0f);
        }
    }

    public final void A36() {
        AnonymousClass2NT r0 = this.A01;
        if (r0 != null && r0.A02() != null && this.A01.A02().A03 != null) {
            LatLng latLng = this.A01.A02().A03;
            AnonymousClass2R7 r2 = this.A09;
            r2.A09 = Double.valueOf(latLng.A00);
            r2.A0A = Double.valueOf(latLng.A01);
        }
    }

    public final void A37() {
        Ac1();
        this.A09.A06.setVisibility(8);
        this.A09.A00();
    }

    public final void A38() {
        AnonymousClass2R7 r1 = this.A09;
        if (r1.A09 == null || r1.A0A == null) {
            A37();
            return;
        }
        r1.A08 = null;
        r1.A06.setVisibility(0);
        AnonymousClass2R7 r0 = this.A09;
        A3C(new IDxGListenerShape420S0100000_2_I0(this, 0), r0.A09, r0.A0A);
    }

    public final void A39() {
        AnonymousClass2NT r0 = this.A01;
        if (r0 != null) {
            r0.A0L(true);
            this.A09.A01();
            View view = this.A09.A03;
            if (view != null) {
                view.setVisibility(0);
            }
            C55582jz r02 = this.A0C;
            r02.A03 = 1;
            r02.A0A(1);
        }
    }

    public final void A3A() {
        Ac1();
        Afj(new Object[0], R.string.str01b9, R.string.str01b7);
        this.A04.A0A(3, 28, 2);
    }

    public final void A3B(DialogInterface.OnClickListener onClickListener, int i2) {
        int i3;
        Ac1();
        if (i2 == -1) {
            Ac1();
            C32241fu r2 = new C32241fu(this);
            r2.A02(R.string.str01b9);
            r2.A01(R.string.str01c4);
            r2.setPositiveButton(R.string.str01f0, onClickListener);
            r2.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
            r2.A00();
            i3 = 1;
        } else if (i2 == 1 || i2 == 2 || i2 == 3) {
            A3A();
            return;
        } else if (i2 == 4) {
            AnonymousClass464.A00(this, this.A03);
            i3 = 6;
        } else {
            return;
        }
        this.A04.A0A(3, 28, i3);
    }

    public void A3C(C109225Re r8, Double d2, Double d3) {
        C109225Re r4 = r8;
        if (!this.A07.A0A()) {
            r8.ARi(-1);
        } else {
            this.A05.Acl(new RunnableRunnableShape0S0400000_I0(this, d2, r4, d3, 12));
        }
    }

    public final boolean A3D() {
        Double d2;
        if (TextUtils.isEmpty(this.A09.A0C)) {
            AnonymousClass2R7 r0 = this.A09;
            Double d3 = r0.A09;
            if (d3 == null || (d2 = r0.A0A) == null) {
                A37();
            } else {
                A3C(new IDxGListenerShape420S0100000_2_I0(this, 1), d3, d2);
                return false;
            }
        }
        return true;
    }

    public void ASB(int i2) {
        A3B(new IDxCListenerShape127S0100000_2_I0(this, 31), i2);
    }

    public void ASC(AnonymousClass26B r3) {
        this.A09.A08 = r3;
        try {
            this.A06.A02(r3);
            Ac1();
            setResult(-1);
            finish();
        } catch (Exception e2) {
            A3A();
            Log.e("DirectoryUserLocationPickerUI/onOptionsItemSelected Failed to store search location", e2);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 34) {
            LocationSharingService.A01(getApplicationContext(), this.A0D);
            if (i3 == -1) {
                AnonymousClass2R7 r0 = this.A09;
                r0.A0D = true;
                r0.A0J.A02.A00().edit().putBoolean("DIRECTORY_LOCATION_INFO_ACCEPTED", true).apply();
                A39();
                return;
            }
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r11 = r14
            super.onCreate(r15)
            r2 = 0
            if (r15 == 0) goto L_0x0010
            java.lang.String r0 = "zoom_to_user"
            boolean r0 = r15.getBoolean(r0, r2)
            r14.A0H = r0
        L_0x0010:
            X.0sK r9 = r14.A01
            X.01V r12 = r14.A08
            com.whatsapp.nativelibloader.WhatsAppLibLoader r13 = r14.A0E
            X.16R r8 = r14.A02
            X.1Kb r10 = r14.A06
            X.2R7 r7 = new X.2R7
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.A09 = r7
            r7.A07 = r14
            r0 = 2131558964(0x7f0d0234, float:1.8743259E38)
            r14.setContentView((int) r0)
            r0 = 2131891484(0x7f12151c, float:1.941769E38)
            r14.setTitle(r0)
            android.view.View r1 = r14.A00
            r0 = 2131366673(0x7f0a1311, float:1.8353246E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r14.Aem(r0)
            X.02i r1 = r14.x()
            X.AnonymousClass00B.A06(r1)
            r0 = 1
            r1.A0O(r0)
            r1.A0N(r0)
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r7.A0L
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00fd
            java.lang.String r0 = "DirectoryUserLocationPickerUI/onCreate: aborting due to native libraries missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0058:
            r14.finish()
        L_0x005b:
            X.2R7 r3 = r14.A09
            android.view.View r1 = r14.A00
            r0 = 2131364787(0x7f0a0bb3, float:1.834942E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A04 = r0
            X.C438721w.A00(r14)
            com.google.android.gms.maps.GoogleMapOptions r3 = new com.google.android.gms.maps.GoogleMapOptions
            r3.<init>()
            r0 = 1
            r3.A00 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r3.A0C = r1
            r3.A05 = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A08 = r0
            r3.A06 = r1
            r3.A0A = r0
            r3.A09 = r0
            com.obwhatsapp.location.IDxMViewShape86S0100000_2_I0 r0 = new com.obwhatsapp.location.IDxMViewShape86S0100000_2_I0
            r0.<init>(r14, r3, r14, r2)
            r14.A0C = r0
            android.view.View r1 = r14.A00
            r0 = 2131364457(0x7f0a0a69, float:1.8348752E38)
            android.view.View r1 = X.C004601z.A0E(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.2jz r0 = r14.A0C
            r1.addView(r0)
            X.2jz r0 = r14.A0C
            r0.A04(r15)
            r14.A00 = r15
            X.2NT r0 = r14.A01
            if (r0 != 0) goto L_0x00b5
            X.2jz r1 = r14.A0C
            X.5OF r0 = r14.A0I
            X.2NT r0 = r1.A07(r0)
            r14.A01 = r0
        L_0x00b5:
            X.2R7 r0 = r14.A09
            android.widget.ImageView r3 = r0.A04
            r1 = 10
            com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1
            r0.<init>(r14, r1)
            r3.setOnClickListener(r0)
            X.2R7 r0 = r14.A09
            android.view.View r0 = r0.A01
            if (r0 == 0) goto L_0x00cc
            r0.setVisibility(r2)
        L_0x00cc:
            X.2R7 r4 = r14.A09
            android.view.View r0 = r4.A02
            if (r0 == 0) goto L_0x00f3
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x00f3
            int r0 = r0.getHeight()
            float r1 = (float) r0
            r0 = 0
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r3.<init>(r0, r0, r1, r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r3.setInterpolator(r0)
            r0 = 120(0x78, double:5.93E-322)
            r3.setDuration(r0)
            android.view.View r0 = r4.A02
            r0.startAnimation(r3)
        L_0x00f3:
            X.2R7 r0 = r14.A09
            android.view.View r0 = r0.A03
            if (r0 == 0) goto L_0x00fc
            r0.setVisibility(r2)
        L_0x00fc:
            return
        L_0x00fd:
            X.0sK r0 = r7.A0I
            r0.A0B()
            com.obwhatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0058
            android.content.Intent r3 = r14.getIntent()
            java.lang.String r4 = "ARG_LATITUDE"
            boolean r0 = r3.hasExtra(r4)
            if (r0 == 0) goto L_0x0130
            java.lang.String r6 = "ARG_LONGITUDE"
            boolean r0 = r3.hasExtra(r6)
            if (r0 == 0) goto L_0x0130
            r0 = 0
            double r4 = r3.getDoubleExtra(r4, r0)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r7.A09 = r4
            double r0 = r3.getDoubleExtra(r6, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r7.A0A = r0
        L_0x0130:
            r1 = 1098907648(0x41800000, float:16.0)
            java.lang.String r0 = "ARG_ZOOM_LEVEL"
            float r0 = r3.getFloatExtra(r0, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r7.A0B = r0
            java.lang.String r1 = "ARG_FULL_ADDRESS"
            boolean r0 = r3.hasExtra(r1)
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = r3.getStringExtra(r1)
            r7.A0C = r0
        L_0x014c:
            r0 = 2131365555(0x7f0a0eb3, float:1.8350979E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r14, r0)
            com.obwhatsapp.CircularProgressBar r0 = (com.obwhatsapp.CircularProgressBar) r0
            r7.A06 = r0
            r0 = 2131363839(0x7f0a07ff, float:1.8347498E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r14, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.A05 = r0
            java.lang.String r0 = r7.A0C
            r7.A03(r0)
            X.1Kb r0 = r7.A0J
            X.1I2 r3 = r0.A02
            android.content.SharedPreferences r1 = r3.A00()
            java.lang.String r0 = "DIRECTORY_LOCATION_INFO_ACCEPTED"
            boolean r0 = r1.getBoolean(r0, r2)
            r7.A0D = r0
            android.content.SharedPreferences r1 = r3.A00()
            java.lang.String r0 = "DIRECTORY_LOCATION_INFO_SHOWN"
            boolean r0 = r1.getBoolean(r0, r2)
            r7.A0E = r0
            android.view.View r1 = r14.A00
            r0 = 2131364448(0x7f0a0a60, float:1.8348733E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            r7.A03 = r0
            r0 = 2131364454(0x7f0a0a66, float:1.8348746E38)
            android.view.View r0 = r14.findViewById(r0)
            r7.A02 = r0
            r0 = 2131364451(0x7f0a0a63, float:1.834874E38)
            android.view.View r0 = r14.findViewById(r0)
            r7.A01 = r0
            android.view.View r1 = r14.A00
            r0 = 2131364787(0x7f0a0bb3, float:1.834942E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.A04 = r0
            X.0pL r1 = r7.A07
            r0 = 2131366839(0x7f0a13b7, float:1.8353583E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.animation.LayoutTransition r1 = r0.getLayoutTransition()
            r0 = 4
            r1.enableTransitionType(r0)
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i2) {
        AnonymousClass2R7 r1 = this.A09;
        if (i2 != 2) {
            return super.onCreateDialog(i2);
        }
        IDxCListenerShape127S0100000_2_I0 iDxCListenerShape127S0100000_2_I0 = new IDxCListenerShape127S0100000_2_I0(r1, 32);
        C32241fu r12 = new C32241fu(r1.A07);
        r12.A02(R.string.str0a05);
        r12.A01(R.string.str0a04);
        r12.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        r12.A07(true);
        r12.setPositiveButton(R.string.str01c8, iDxCListenerShape127S0100000_2_I0);
        return r12.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, getString(R.string.str072c)).setShowAsAction(2);
        return true;
    }

    public void onDestroy() {
        this.A0C.A00();
        super.onDestroy();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0C.A01();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        Afq(R.string.str01dd);
        if (!A3D()) {
            return true;
        }
        A35();
        return true;
    }

    public void onPause() {
        this.A0C.A02();
        C55582jz r0 = this.A0C;
        SensorManager sensorManager = r0.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0C);
        }
        this.A0G = this.A0A.A05();
        AnonymousClass2R7 r1 = this.A09;
        r1.A0H.A04(r1);
        super.onPause();
    }

    public void onResume() {
        AnonymousClass2NT r1;
        super.onResume();
        if (this.A0A.A05() != this.A0G && this.A0A.A05() && this.A09.A0D && (r1 = this.A01) != null) {
            r1.A0L(true);
        }
        this.A0C.A03();
        this.A0C.A08();
        if (this.A01 == null) {
            this.A01 = this.A0C.A07(this.A0I);
        }
        AnonymousClass2R7 r12 = this.A09;
        r12.A0H.A05(r12, "user-location-picker", 0.0f, 3, 5000, 1000);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.A01 != null) {
            bundle.putFloat("camera_zoom", this.A09.A0B.floatValue());
            Double d2 = this.A09.A09;
            if (d2 != null) {
                bundle.putDouble("camera_lat", d2.doubleValue());
            }
            Double d3 = this.A09.A0A;
            if (d3 != null) {
                bundle.putDouble("camera_lng", d3.doubleValue());
            }
            bundle.putBoolean("should_update_address", this.A09.A0G);
            bundle.putInt("map_location_mode", this.A0C.A03);
        }
        bundle.putBoolean("zoom_to_user", this.A0H);
        this.A0C.A05(bundle);
        this.A09.A03.setVisibility(0);
        super.onSaveInstanceState(bundle);
    }
}

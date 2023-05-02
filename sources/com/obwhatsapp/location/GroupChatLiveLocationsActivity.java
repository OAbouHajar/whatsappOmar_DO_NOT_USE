package com.obwhatsapp.location;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass020;
import X.AnonymousClass074;
import X.AnonymousClass076;
import X.AnonymousClass077;
import X.AnonymousClass0IS;
import X.AnonymousClass0IV;
import X.AnonymousClass0P5;
import X.AnonymousClass0QW;
import X.AnonymousClass0RX;
import X.AnonymousClass0T2;
import X.AnonymousClass0YG;
import X.AnonymousClass0YH;
import X.AnonymousClass127;
import X.AnonymousClass152;
import X.AnonymousClass15P;
import X.AnonymousClass16R;
import X.AnonymousClass18R;
import X.AnonymousClass1P7;
import X.AnonymousClass291;
import X.AnonymousClass29W;
import X.AnonymousClass2Rf;
import X.AnonymousClass2Sy;
import X.C05140Pl;
import X.C12830l2;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16600tK;
import X.C17020u3;
import X.C17140ub;
import X.C17160ud;
import X.C17200uh;
import X.C17250um;
import X.C18260wP;
import X.C19150xq;
import X.C19430yQ;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C204310c;
import X.C216114t;
import X.C23061Ai;
import X.C23071Aj;
import X.C25781Lc;
import X.C27471Rw;
import X.C39721sx;
import X.C49132Rg;
import X.C55562jx;
import X.C62413Dl;
import X.C62423Dm;
import X.C62433Dn;
import X.C62443Do;
import X.C62473Dr;
import X.C76653uT;
import X.C95514ml;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxComparatorShape0S0000020_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape295S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupChatLiveLocationsActivity extends C14530pL {
    public float A00;
    public int A01;
    public Bundle A02;
    public ImageView A03;
    public AnonymousClass077 A04;
    public AnonymousClass074 A05;
    public AnonymousClass16R A06;
    public C16600tK A07;
    public C204310c A08;
    public AnonymousClass127 A09;
    public C17160ud A0A;
    public C16000sG A0B;
    public C17140ub A0C;
    public C16080sP A0D;
    public C17200uh A0E;
    public AnonymousClass152 A0F;
    public C16260sj A0G;
    public C216114t A0H;
    public C16070sO A0I;
    public C19150xq A0J;
    public AnonymousClass18R A0K;
    public C55562jx A0L;
    public AnonymousClass291 A0M;
    public C19430yQ A0N;
    public AnonymousClass1P7 A0O;
    public C27471Rw A0P;
    public C17020u3 A0Q;
    public C25781Lc A0R;
    public Map A0S;
    public Set A0T;
    public boolean A0U;
    public final C12830l2 A0V;
    public volatile boolean A0W;
    public volatile boolean A0X;

    public GroupChatLiveLocationsActivity() {
        this(0);
        this.A0T = new HashSet();
        this.A0S = new HashMap();
        this.A01 = 0;
        this.A0V = new IDxRCallbackShape295S0100000_2_I0(this, 2);
        this.A00 = -1.0f;
        this.A0X = false;
        this.A04 = new C62413Dl(this);
    }

    public GroupChatLiveLocationsActivity(int i2) {
        this.A0U = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 58));
    }

    public static /* synthetic */ float A02(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, float f2, float f3) {
        if (f2 <= 0.0f) {
            return f3;
        }
        AnonymousClass074 r0 = groupChatLiveLocationsActivity.A05;
        AnonymousClass00B.A06(r0);
        AnonymousClass0RX A062 = r0.A0S.A06();
        Location location = new Location("");
        AnonymousClass020 r2 = A062.A02;
        location.setLatitude(r2.A00);
        location.setLongitude(r2.A01);
        Location location2 = new Location("");
        AnonymousClass020 r22 = A062.A03;
        location2.setLatitude(r22.A00);
        location2.setLongitude(r22.A01);
        double distanceTo = (double) location2.distanceTo(location);
        if (distanceTo <= 0.0d) {
            return f3;
        }
        float log = (float) (((double) groupChatLiveLocationsActivity.A05.A02().A02) + (Math.log((distanceTo / ((double) f2)) / 30.0d) / Math.log(2.0d)));
        if (log > 16.0f) {
            return 16.0f;
        }
        return log;
    }

    public static /* synthetic */ void A03(AnonymousClass074 r6, GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        if (groupChatLiveLocationsActivity.A05 == null) {
            groupChatLiveLocationsActivity.A05 = r6;
            if (r6 != null) {
                r6.A07(0, 0, groupChatLiveLocationsActivity.A01);
                groupChatLiveLocationsActivity.A01 = 0;
                AnonymousClass074 r0 = groupChatLiveLocationsActivity.A05;
                AnonymousClass00B.A06(r0);
                AnonymousClass074 r1 = r0.A0T.A00;
                if (r1.A0F == null) {
                    AnonymousClass0IV r02 = new AnonymousClass0IV(r1);
                    r1.A0F = r02;
                    r1.A0B(r02);
                }
                C05140Pl r03 = groupChatLiveLocationsActivity.A05.A0T;
                r03.A01 = false;
                r03.A00();
                groupChatLiveLocationsActivity.A05.A08 = new C62423Dm(groupChatLiveLocationsActivity);
                AnonymousClass074 r12 = groupChatLiveLocationsActivity.A05;
                r12.A0D = new C62473Dr(groupChatLiveLocationsActivity);
                r12.A09 = new C95514ml(groupChatLiveLocationsActivity);
                r12.A0B = new C62443Do(groupChatLiveLocationsActivity);
                r12.A0A = new C62433Dn(groupChatLiveLocationsActivity);
                groupChatLiveLocationsActivity.A36();
                Bundle bundle = groupChatLiveLocationsActivity.A02;
                if (bundle != null) {
                    groupChatLiveLocationsActivity.A0L.setLocationMode(bundle.getInt("map_location_mode", 2));
                    if (groupChatLiveLocationsActivity.A02.containsKey("camera_zoom")) {
                        groupChatLiveLocationsActivity.A05.A09(AnonymousClass0T2.A01(new AnonymousClass020(groupChatLiveLocationsActivity.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity.A02.getFloat("camera_zoom")));
                    }
                    groupChatLiveLocationsActivity.A02 = null;
                } else if (groupChatLiveLocationsActivity.A0T.isEmpty()) {
                    SharedPreferences A002 = groupChatLiveLocationsActivity.A0Q.A00(AnonymousClass01S.A07);
                    AnonymousClass020 r2 = new AnonymousClass020((double) A002.getFloat("live_location_lat", 37.389805f), (double) A002.getFloat("live_location_lng", -122.08141f));
                    AnonymousClass074 r13 = groupChatLiveLocationsActivity.A05;
                    AnonymousClass076 r04 = new AnonymousClass076();
                    r04.A06 = r2;
                    r13.A09(r04);
                    AnonymousClass074 r22 = groupChatLiveLocationsActivity.A05;
                    AnonymousClass076 r05 = new AnonymousClass076();
                    r05.A01 = A002.getFloat("live_location_zoom", 16.0f) - 0.2f;
                    r22.A09(r05);
                } else {
                    groupChatLiveLocationsActivity.A39(false);
                }
            }
        }
    }

    public void A1q() {
        if (!this.A0U) {
            this.A0U = true;
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
            this.A08 = (C204310c) r1.A3O.get();
            this.A0E = (C17200uh) r1.A52.get();
            this.A0O = (AnonymousClass1P7) r1.ADc.get();
            this.A0A = (C17160ud) r1.A4t.get();
            this.A0B = (C16000sG) r1.A4x.get();
            this.A0D = (C16080sP) r1.AQ9.get();
            this.A0C = (C17140ub) r1.A4y.get();
            this.A0J = (C19150xq) r1.AFC.get();
            this.A0R = new C25781Lc();
            this.A07 = (C16600tK) r1.ARd.get();
            this.A09 = (AnonymousClass127) r1.A3z.get();
            this.A0G = (C16260sj) r1.AQe.get();
            this.A06 = (AnonymousClass16R) r1.AAq.get();
            this.A0N = (C19430yQ) r1.ADa.get();
            this.A0I = (C16070sO) r1.ABY.get();
            this.A0Q = (C17020u3) r1.AMG.get();
            this.A0H = (C216114t) r1.A5O.get();
            this.A0F = (AnonymousClass152) r1.A51.get();
            this.A0K = (AnonymousClass18R) r1.ABZ.get();
            this.A0P = (C27471Rw) r1.ADd.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r3.A0G.A05() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A35() {
        /*
            r3 = this;
            X.AnonymousClass00B.A01()
            X.074 r0 = r3.A05
            if (r0 != 0) goto L_0x0011
            X.2jx r1 = r3.A0L
            X.0l2 r0 = r3.A0V
            X.074 r0 = r1.A0J(r0)
            r3.A05 = r0
        L_0x0011:
            android.widget.ImageView r2 = r3.A03
            X.291 r0 = r3.A0M
            X.1sx r0 = r0.A0m
            if (r0 != 0) goto L_0x0022
            X.0sj r0 = r3.A0G
            boolean r1 = r0.A05()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            r0 = 8
        L_0x0024:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.location.GroupChatLiveLocationsActivity.A35():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A36() {
        /*
            r15 = this;
            X.074 r2 = r15.A05
            if (r2 == 0) goto L_0x0185
            X.291 r1 = r15.A0M
            X.1sx r0 = r1.A0n
            r10 = 0
            r9 = 1
            if (r0 != 0) goto L_0x015e
            X.1sx r0 = r1.A0m
            if (r0 != 0) goto L_0x015e
            X.0sj r0 = r15.A0G
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x001d
            X.074 r0 = r15.A05
            r0.A0D(r9)
        L_0x001d:
            X.2jx r0 = r15.A0L
            int r1 = r0.getWidth()
            X.2jx r0 = r15.A0L
            int r0 = r0.getHeight()
            if (r1 == 0) goto L_0x0185
            if (r0 == 0) goto L_0x0185
            java.util.Set r8 = r15.A0T
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r8)
            r8.clear()
            X.074 r0 = r15.A05
            X.0Wn r7 = r0.A0S
            X.291 r1 = r15.A0M
            r0.A02()
            X.29U r0 = new X.29U
            r0.<init>((X.C06540Wn) r7)
            r1.A0S(r0)
            X.291 r0 = r15.A0M
            java.util.List r0 = r0.A1R
            java.util.Iterator r14 = r0.iterator()
        L_0x0050:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0163
            java.lang.Object r11 = r14.next()
            X.29W r11 = (X.AnonymousClass29W) r11
            java.util.Map r6 = r15.A0S
            java.lang.String r5 = r11.A03
            java.lang.Object r13 = r6.get(r5)
            X.0IS r13 = (X.AnonymousClass0IS) r13
            com.google.android.gms.maps.model.LatLng r0 = r11.A00()
            double r2 = r0.A00
            double r0 = r0.A01
            X.020 r4 = new X.020
            r4.<init>(r2, r0)
            if (r13 == 0) goto L_0x00f9
            java.lang.Object r2 = r13.A0K
            boolean r0 = r2 instanceof X.AnonymousClass29W
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x0082
            r13.A0A(r9)
        L_0x0082:
            r13.A0J(r4)
            X.29W r2 = (X.AnonymousClass29W) r2
            int r1 = r2.A00
            int r0 = r11.A00
            if (r1 != r0) goto L_0x0093
            int r1 = r2.A01
            int r0 = r11.A01
            if (r1 == r0) goto L_0x00ab
        L_0x0093:
            X.291 r0 = r15.A0M
            android.graphics.Bitmap r0 = r0.A05(r11)
            X.0Nk r0 = X.AnonymousClass0Wt.A01(r0)
            r13.A0I(r0)
            X.291 r0 = r15.A0M
            java.lang.String r0 = r0.A0A(r11)
            r13.A0M = r0
            r13.A0G()
        L_0x00ab:
            int r0 = r11.A00
            if (r0 != r9) goto L_0x00ec
            r1 = 1120403456(0x42c80000, float:100.0)
        L_0x00b1:
            r13.A07(r1)
            r13.A0K = r11
            android.graphics.Point r2 = r7.A04(r4)
            X.1sx r1 = r11.A02
            X.291 r0 = r15.A0M
            X.1sx r0 = r0.A0o
            if (r1 == r0) goto L_0x00e0
            if (r0 != 0) goto L_0x00e8
            boolean r0 = r13.A0P
            if (r0 == 0) goto L_0x00e8
            int r1 = r2.x
            if (r1 < 0) goto L_0x00e8
            X.2jx r0 = r15.A0L
            int r0 = r0.getWidth()
            if (r1 > r0) goto L_0x00e8
            int r1 = r2.y
            if (r1 < 0) goto L_0x00e8
            X.2jx r0 = r15.A0L
            int r0 = r0.getHeight()
            if (r1 > r0) goto L_0x00e8
        L_0x00e0:
            r13.A0F()
        L_0x00e3:
            r8.add(r13)
            goto L_0x0050
        L_0x00e8:
            r13.A0E()
            goto L_0x00e3
        L_0x00ec:
            java.util.List r0 = r11.A04
            int r0 = r0.size()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r9) goto L_0x00b1
            r1 = 1112014848(0x42480000, float:50.0)
            goto L_0x00b1
        L_0x00f9:
            X.074 r0 = r15.A05
            X.AnonymousClass00B.A06(r0)
            com.google.android.gms.maps.model.LatLng r0 = r11.A00()
            double r2 = r0.A00
            double r0 = r0.A01
            X.020 r13 = new X.020
            r13.<init>(r2, r0)
            X.291 r0 = r15.A0M
            android.graphics.Bitmap r0 = r0.A05(r11)
            X.0UE r2 = new X.0UE
            r2.<init>()
            X.0Nk r0 = X.AnonymousClass0Wt.A01(r0)
            r2.A00 = r0
            X.291 r0 = r15.A0M
            java.lang.String r0 = r0.A0A(r11)
            r2.A03 = r0
            r3 = 1063172178(0x3f5eb852, float:0.87)
            r1 = 1056964608(0x3f000000, float:0.5)
            float[] r0 = r2.A06
            r0[r10] = r1
            r0[r9] = r3
            X.0sK r3 = r15.A01
            X.1sx r0 = r11.A02
            com.whatsapp.jid.UserJid r1 = r0.A06
            boolean r0 = r3.A0I(r1)
            if (r0 == 0) goto L_0x0151
            r0 = 2131888913(0x7f120b11, float:1.9412475E38)
            java.lang.String r0 = r15.getString(r0)
        L_0x0142:
            r2.A03 = r0
            X.074 r0 = r15.A05
            r2.A01 = r13
            X.0IS r13 = r0.A03(r2)
            r6.put(r5, r13)
            goto L_0x00ab
        L_0x0151:
            X.0sG r0 = r15.A0B
            X.0sH r1 = r0.A0A(r1)
            X.0sP r0 = r15.A0D
            java.lang.String r0 = r0.A08(r1)
            goto L_0x0142
        L_0x015e:
            r2.A0D(r10)
            goto L_0x001d
        L_0x0163:
            java.util.Iterator r2 = r12.iterator()
        L_0x0167:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0185
            java.lang.Object r1 = r2.next()
            X.0IS r1 = (X.AnonymousClass0IS) r1
            boolean r0 = r8.contains(r1)
            if (r0 != 0) goto L_0x0167
            java.lang.Object r0 = r1.A0K
            if (r0 == 0) goto L_0x0167
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0167
            r1.A0A(r10)
            goto L_0x0167
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.location.GroupChatLiveLocationsActivity.A36():void");
    }

    public final void A37(AnonymousClass0QW r15, boolean z2) {
        AnonymousClass076 r2;
        AnonymousClass00B.A06(this.A05);
        AnonymousClass0YH A002 = r15.A00();
        AnonymousClass020 A003 = A002.A00();
        int width = this.A0L.getWidth();
        int height = this.A0L.getHeight();
        AnonymousClass020 r0 = A002.A01;
        LatLng latLng = new LatLng(r0.A00, r0.A01);
        AnonymousClass020 r02 = A002.A00;
        LatLngBounds latLngBounds = new LatLngBounds(latLng, new LatLng(r02.A00, r02.A01));
        LatLng latLng2 = latLngBounds.A00;
        double A004 = AnonymousClass291.A00(latLng2.A00);
        LatLng latLng3 = latLngBounds.A01;
        double A005 = (A004 - AnonymousClass291.A00(latLng3.A00)) / 3.141592653589793d;
        double d2 = latLng2.A01 - latLng3.A01;
        if (d2 < 0.0d) {
            d2 += 360.0d;
        }
        float min = (float) Math.min(Math.log((((double) height) / 256.0d) / A005) / 0.6931471805599453d, Math.log((((double) width) / 256.0d) / (d2 / 360.0d)) / 0.6931471805599453d);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen041a);
        int i2 = dimensionPixelSize << 1;
        if (this.A0L.getHeight() > i2 && this.A0L.getWidth() > i2) {
            if (z2) {
                this.A0W = true;
                int i3 = (min > 21.0f ? 1 : (min == 21.0f ? 0 : -1));
                AnonymousClass074 r3 = this.A05;
                if (i3 > 0) {
                    r2 = AnonymousClass0T2.A01(A003, 19.0f);
                } else {
                    r2 = new AnonymousClass076();
                    r2.A07 = A002;
                    r2.A05 = dimensionPixelSize;
                }
                r3.A0A(r2, this.A04, 1500);
                return;
            }
            this.A05.A09(AnonymousClass0T2.A01(A003, Math.min(19.0f, min)));
        }
    }

    public final void A38(List list, boolean z2) {
        AnonymousClass00B.A06(this.A05);
        if (list.size() != 1) {
            AnonymousClass0QW r6 = new AnonymousClass0QW();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C39721sx r0 = (C39721sx) it.next();
                r6.A01(new AnonymousClass020(r0.A00, r0.A01));
            }
            A37(r6, z2);
        } else if (z2) {
            this.A0W = true;
            this.A05.A08(AnonymousClass0T2.A01(new AnonymousClass020(((C39721sx) list.get(0)).A00, ((C39721sx) list.get(0)).A01), 16.0f));
        } else {
            this.A05.A09(AnonymousClass0T2.A01(new AnonymousClass020(((C39721sx) list.get(0)).A00, ((C39721sx) list.get(0)).A01), 16.0f));
        }
    }

    public final void A39(boolean z2) {
        if (this.A05 != null && !this.A0M.A0u) {
            Set set = this.A0T;
            if (set.isEmpty()) {
                return;
            }
            if (this.A0L.getWidth() <= 0 || this.A0L.getHeight() <= 0) {
                this.A0L.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 16));
            } else if (!z2 || !this.A0W) {
                ArrayList arrayList = new ArrayList(set);
                AnonymousClass00B.A06(this.A05);
                if (this.A0M.A06() != null) {
                    LatLng A062 = this.A0M.A06();
                    Collections.sort(arrayList, new IDxComparatorShape0S0000020_2_I0(A062.A00, A062.A01, 0));
                }
                AnonymousClass0QW r9 = new AnonymousClass0QW();
                AnonymousClass0QW r10 = new AnonymousClass0QW();
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    AnonymousClass0IS r6 = (AnonymousClass0IS) arrayList.get(i2);
                    r10.A01(r6.A0J);
                    AnonymousClass0YH A002 = r10.A00();
                    AnonymousClass020 r0 = A002.A01;
                    LatLng latLng = new LatLng(r0.A00, r0.A01);
                    AnonymousClass020 r02 = A002.A00;
                    if (!AnonymousClass291.A03(new LatLngBounds(latLng, new LatLng(r02.A00, r02.A01)))) {
                        break;
                    }
                    r9.A01(r6.A0J);
                    i2++;
                }
                if (i2 == 1) {
                    A38(((AnonymousClass29W) ((AnonymousClass0IS) arrayList.get(0)).A0K).A04, z2);
                } else {
                    A37(r9, z2);
                }
            } else {
                this.A0X = true;
            }
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.A0M.A0Z(i2, i3)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return true;
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        C16440t3 r29 = this.A05;
        C14870pt r22 = this.A05;
        C16040sK r20 = this.A01;
        C204310c r21 = this.A08;
        C19980zJ r19 = this.A00;
        C17200uh r18 = this.A0E;
        AnonymousClass1P7 r17 = this.A0O;
        C16000sG r15 = this.A0B;
        C16080sP r12 = this.A0D;
        AnonymousClass013 r11 = this.A01;
        C17140ub r10 = this.A0C;
        C19150xq r9 = this.A0J;
        C16600tK r8 = this.A07;
        AnonymousClass127 r7 = this.A09;
        C16260sj r6 = this.A0G;
        AnonymousClass16R r5 = this.A06;
        C19430yQ r4 = this.A0N;
        AnonymousClass152 r3 = this.A0F;
        AnonymousClass18R r2 = this.A0K;
        C19980zJ r16 = r19;
        AnonymousClass16R r172 = r5;
        C14870pt r182 = r22;
        C16040sK r192 = r20;
        C16600tK r202 = r8;
        AnonymousClass127 r222 = r7;
        this.A0M = new IDxLUiShape87S0100000_1_I0(r16, r172, r182, r192, r202, r21, r222, this.A0A, r15, r10, r12, r18, r3, r29, r6, r11, r9, r2, r4, r17, this.A0P, this, 0);
        x().A0N(true);
        setContentView((int) R.layout.layout02ef);
        C216114t r23 = this.A0H;
        C15830rv A022 = C15830rv.A02(getIntent().getStringExtra("jid"));
        AnonymousClass00B.A06(A022);
        C16010sH A012 = r23.A01(A022);
        x().A0J(AnonymousClass2Sy.A05(this, this.A0B, this.A0D.A08(A012)));
        this.A0M.A0N(this, bundle2);
        this.A0O.A04(this);
        AnonymousClass0P5 r1 = new AnonymousClass0P5();
        r1.A06 = true;
        r1.A03 = true;
        r1.A02 = "whatsapp_group_chat";
        this.A0L = new C76653uT(this, r1, this);
        ((ViewGroup) AnonymousClass00T.A05(this, R.id.map_holder)).addView(this.A0L);
        this.A0L.A0E(bundle2);
        ImageView imageView = (ImageView) AnonymousClass00T.A05(this, R.id.my_location);
        this.A03 = imageView;
        imageView.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 33));
        this.A02 = bundle2;
        A35();
    }

    public Dialog onCreateDialog(int i2) {
        Dialog A042 = this.A0M.A04(i2);
        return A042 == null ? super.onCreateDialog(i2) : A042;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu000e, menu);
        menu.removeGroup(R.id.map_setting);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0M.A0C();
        if (this.A05 != null) {
            SharedPreferences.Editor edit = this.A0Q.A00(AnonymousClass01S.A07).edit();
            AnonymousClass0YG A022 = this.A05.A02();
            AnonymousClass020 r4 = A022.A03;
            edit.putFloat("live_location_lat", (float) r4.A00);
            edit.putFloat("live_location_lng", (float) r4.A01);
            edit.putFloat("live_location_zoom", A022.A02);
            edit.apply();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0L.A05();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass00B.A06(this.A05);
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        C55562jx r0 = this.A0L;
        SensorManager sensorManager = r0.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0D);
        }
        this.A0M.A0D();
    }

    public void onResume() {
        super.onResume();
        this.A0L.A0K();
        this.A0M.A0E();
        A35();
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass074 r0 = this.A05;
        if (r0 != null) {
            AnonymousClass0YG A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            AnonymousClass020 r3 = A022.A03;
            bundle.putDouble("camera_lat", r3.A00);
            bundle.putDouble("camera_lng", r3.A01);
            bundle.putInt("map_location_mode", this.A0L.A02);
        }
        this.A0L.A0F(bundle);
        this.A0M.A0O(bundle);
        super.onSaveInstanceState(bundle);
    }
}

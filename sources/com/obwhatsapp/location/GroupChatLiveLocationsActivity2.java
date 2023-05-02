package com.obwhatsapp.location;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass127;
import X.AnonymousClass152;
import X.AnonymousClass15P;
import X.AnonymousClass16R;
import X.AnonymousClass18R;
import X.AnonymousClass1P7;
import X.AnonymousClass291;
import X.AnonymousClass2NT;
import X.AnonymousClass2R8;
import X.AnonymousClass2R9;
import X.AnonymousClass2Rf;
import X.AnonymousClass2Sy;
import X.AnonymousClass39T;
import X.AnonymousClass3EG;
import X.AnonymousClass3EH;
import X.AnonymousClass3EL;
import X.AnonymousClass3EM;
import X.AnonymousClass5OF;
import X.AnonymousClass5RJ;
import X.C105555Ab;
import X.C13710nw;
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
import X.C31361e1;
import X.C31371e2;
import X.C39721sx;
import X.C434920f;
import X.C438721w;
import X.C49132Rg;
import X.C55582jz;
import X.C58002sK;
import X.C66063Xq;
import X.C98614sh;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape368S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape330S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape367S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.obwhatsapp.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupChatLiveLocationsActivity2 extends C14530pL {
    public float A00;
    public int A01;
    public Bundle A02;
    public MenuItem A03;
    public ImageView A04;
    public AnonymousClass5RJ A05;
    public AnonymousClass2NT A06;
    public AnonymousClass16R A07;
    public C16600tK A08;
    public C204310c A09;
    public AnonymousClass127 A0A;
    public C17160ud A0B;
    public C16000sG A0C;
    public C17140ub A0D;
    public C16080sP A0E;
    public C17200uh A0F;
    public AnonymousClass152 A0G;
    public C16260sj A0H;
    public C216114t A0I;
    public C16070sO A0J;
    public C19150xq A0K;
    public AnonymousClass18R A0L;
    public C55582jz A0M;
    public AnonymousClass291 A0N;
    public C19430yQ A0O;
    public AnonymousClass1P7 A0P;
    public C27471Rw A0Q;
    public C17020u3 A0R;
    public C25781Lc A0S;
    public Map A0T;
    public Set A0U;
    public boolean A0V;
    public final AnonymousClass5OF A0W;
    public volatile boolean A0X;
    public volatile boolean A0Y;

    public GroupChatLiveLocationsActivity2() {
        this(0);
        this.A0U = new HashSet();
        this.A0T = new HashMap();
        this.A01 = 0;
        this.A00 = -1.0f;
        this.A0Y = false;
        this.A05 = new AnonymousClass3EG(this);
        this.A0W = new IDxRCallbackShape330S0100000_2_I0(this, 2);
    }

    public GroupChatLiveLocationsActivity2(int i2) {
        this.A0V = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 59));
    }

    public static /* synthetic */ float A02(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, float f2, float f3) {
        if (f2 <= 0.0f) {
            return f3;
        }
        AnonymousClass2NT r0 = groupChatLiveLocationsActivity2.A06;
        AnonymousClass00B.A06(r0);
        C66063Xq A022 = r0.A00().A02();
        Location location = new Location("");
        LatLng latLng = A022.A02;
        location.setLatitude(latLng.A00);
        location.setLongitude(latLng.A01);
        Location location2 = new Location("");
        LatLng latLng2 = A022.A03;
        location2.setLatitude(latLng2.A00);
        location2.setLongitude(latLng2.A01);
        double distanceTo = (double) location2.distanceTo(location);
        if (distanceTo <= 0.0d) {
            return f3;
        }
        float log = (float) (((double) groupChatLiveLocationsActivity2.A06.A02().A02) + (Math.log((distanceTo / ((double) f2)) / 30.0d) / Math.log(2.0d)));
        if (log > 16.0f) {
            return 16.0f;
        }
        return log;
    }

    public static /* synthetic */ void A03(AnonymousClass2NT r6, GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        if (groupChatLiveLocationsActivity2.A06 == null) {
            groupChatLiveLocationsActivity2.A06 = r6;
            if (r6 != null) {
                r6.A08(0, 0, 0, groupChatLiveLocationsActivity2.A01);
                groupChatLiveLocationsActivity2.A01 = 0;
                AnonymousClass00B.A06(groupChatLiveLocationsActivity2.A06);
                C17020u3 r0 = groupChatLiveLocationsActivity2.A0R;
                String str = AnonymousClass01S.A07;
                int i2 = 0;
                boolean z2 = r0.A00(str).getBoolean("live_location_show_traffic", false);
                groupChatLiveLocationsActivity2.A06.A0M(z2);
                MenuItem menuItem = groupChatLiveLocationsActivity2.A03;
                if (menuItem != null) {
                    menuItem.setChecked(z2);
                }
                groupChatLiveLocationsActivity2.A06.A07(groupChatLiveLocationsActivity2.A0R.A00(str).getInt("live_location_map_type", 1));
                groupChatLiveLocationsActivity2.A06.A0K(true);
                try {
                    C31361e1 r62 = (C31361e1) groupChatLiveLocationsActivity2.A06.A01().A00;
                    Parcel A012 = r62.A01();
                    A012.writeInt(1);
                    r62.A03(2, A012);
                    try {
                        C31361e1 r1 = (C31361e1) groupChatLiveLocationsActivity2.A06.A01().A00;
                        Parcel A013 = r1.A01();
                        A013.writeInt(0);
                        r1.A03(1, A013);
                        groupChatLiveLocationsActivity2.A06.A01().A00();
                        groupChatLiveLocationsActivity2.A06.A0D(new AnonymousClass3EH(groupChatLiveLocationsActivity2));
                        groupChatLiveLocationsActivity2.A06.A0I(new AnonymousClass3EM(groupChatLiveLocationsActivity2));
                        groupChatLiveLocationsActivity2.A06.A0F(new IDxSListenerShape367S0100000_2_I0(groupChatLiveLocationsActivity2, 1));
                        groupChatLiveLocationsActivity2.A06.A0E(new C98614sh(groupChatLiveLocationsActivity2));
                        groupChatLiveLocationsActivity2.A06.A0H(new IDxCListenerShape368S0100000_2_I0(groupChatLiveLocationsActivity2, 1));
                        groupChatLiveLocationsActivity2.A06.A0G(new AnonymousClass3EL(groupChatLiveLocationsActivity2));
                        groupChatLiveLocationsActivity2.A36();
                        if (groupChatLiveLocationsActivity2.A02 != null) {
                            AnonymousClass291 r2 = groupChatLiveLocationsActivity2.A0N;
                            View view = r2.A0U;
                            if (!r2.A0u || r2.A0m != null) {
                                i2 = 8;
                            }
                            view.setVisibility(i2);
                            groupChatLiveLocationsActivity2.A0M.setLocationMode(groupChatLiveLocationsActivity2.A02.getInt("map_location_mode", 2));
                            if (groupChatLiveLocationsActivity2.A02.containsKey("camera_zoom")) {
                                groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass2R8.A02(new LatLng(groupChatLiveLocationsActivity2.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity2.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity2.A02.getFloat("camera_zoom")));
                            }
                            groupChatLiveLocationsActivity2.A02 = null;
                        } else if (groupChatLiveLocationsActivity2.A0U.isEmpty()) {
                            SharedPreferences A002 = groupChatLiveLocationsActivity2.A0R.A00(str);
                            groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass2R8.A01(new LatLng((double) A002.getFloat("live_location_lat", 37.389805f), (double) A002.getFloat("live_location_lng", -122.08141f))));
                            AnonymousClass2NT r4 = groupChatLiveLocationsActivity2.A06;
                            float f2 = A002.getFloat("live_location_zoom", 16.0f) - 0.2f;
                            try {
                                ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = AnonymousClass2R8.A00;
                                C13710nw.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
                                C31361e1 r22 = (C31361e1) iCameraUpdateFactoryDelegate;
                                Parcel A014 = r22.A01();
                                A014.writeFloat(f2);
                                Parcel A022 = r22.A02(4, A014);
                                IObjectWrapper A003 = C31371e2.A00(A022.readStrongBinder());
                                A022.recycle();
                                r4.A0A(new AnonymousClass2R9(A003));
                            } catch (RemoteException e2) {
                                throw new C105555Ab(e2);
                            }
                        } else {
                            groupChatLiveLocationsActivity2.A38(false);
                        }
                        if (C434920f.A09(groupChatLiveLocationsActivity2)) {
                            groupChatLiveLocationsActivity2.A06.A0J(C58002sK.A03(groupChatLiveLocationsActivity2, R.raw.night_map_style_json));
                        }
                    } catch (RemoteException e3) {
                        throw new C105555Ab(e3);
                    }
                } catch (RemoteException e4) {
                    throw new C105555Ab(e4);
                }
            }
        }
    }

    public void A1q() {
        if (!this.A0V) {
            this.A0V = true;
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
            this.A09 = (C204310c) r1.A3O.get();
            this.A0F = (C17200uh) r1.A52.get();
            this.A0P = (AnonymousClass1P7) r1.ADc.get();
            this.A0B = (C17160ud) r1.A4t.get();
            this.A0C = (C16000sG) r1.A4x.get();
            this.A0E = (C16080sP) r1.AQ9.get();
            this.A0D = (C17140ub) r1.A4y.get();
            this.A0K = (C19150xq) r1.AFC.get();
            this.A0S = new C25781Lc();
            this.A0A = (AnonymousClass127) r1.A3z.get();
            this.A0H = (C16260sj) r1.AQe.get();
            this.A07 = (AnonymousClass16R) r1.AAq.get();
            this.A0O = (C19430yQ) r1.ADa.get();
            this.A0J = (C16070sO) r1.ABY.get();
            this.A0R = (C17020u3) r1.AMG.get();
            this.A0I = (C216114t) r1.A5O.get();
            this.A0G = (AnonymousClass152) r1.A51.get();
            this.A0L = (AnonymousClass18R) r1.ABZ.get();
            this.A0Q = (C27471Rw) r1.ADd.get();
            this.A08 = (C16600tK) r1.ARd.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r3.A0H.A05() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A35() {
        /*
            r3 = this;
            X.AnonymousClass00B.A01()
            X.2NT r0 = r3.A06
            if (r0 != 0) goto L_0x0011
            X.2jz r1 = r3.A0M
            X.5OF r0 = r3.A0W
            X.2NT r0 = r1.A07(r0)
            r3.A06 = r0
        L_0x0011:
            android.widget.ImageView r2 = r3.A04
            X.291 r0 = r3.A0N
            X.1sx r0 = r0.A0m
            if (r0 != 0) goto L_0x0022
            X.0sj r0 = r3.A0H
            boolean r1 = r0.A05()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            r0 = 8
        L_0x0024:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.location.GroupChatLiveLocationsActivity2.A35():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A36() {
        /*
            r12 = this;
            X.2NT r2 = r12.A06
            if (r2 == 0) goto L_0x0149
            X.291 r1 = r12.A0N
            X.1sx r0 = r1.A0n
            r4 = 0
            r7 = 1
            if (r0 != 0) goto L_0x0117
            X.1sx r0 = r1.A0m
            if (r0 != 0) goto L_0x0117
            X.0sj r0 = r12.A0H
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x001d
            X.2NT r0 = r12.A06
            r0.A0L(r7)
        L_0x001d:
            X.2jz r0 = r12.A0M
            int r1 = r0.getWidth()
            X.2jz r0 = r12.A0M
            int r0 = r0.getHeight()
            if (r1 == 0) goto L_0x0149
            if (r0 == 0) goto L_0x0149
            java.util.Set r3 = r12.A0U
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            r3.clear()
            X.2NT r0 = r12.A06
            X.39T r2 = r0.A00()
            X.291 r1 = r12.A0N
            X.2NT r0 = r12.A06
            r0.A02()
            X.29U r0 = new X.29U
            r0.<init>((X.AnonymousClass39T) r2)
            r1.A0S(r0)
            X.291 r0 = r12.A0N
            java.util.List r0 = r0.A1R
            java.util.Iterator r11 = r0.iterator()
        L_0x0054:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r5 = r11.next()
            X.29W r5 = (X.AnonymousClass29W) r5
            java.util.Map r10 = r12.A0T
            java.lang.String r9 = r5.A03
            java.lang.Object r2 = r10.get(r9)
            X.1gN r2 = (X.C32451gN) r2
            com.google.android.gms.maps.model.LatLng r1 = r5.A00()
            if (r2 == 0) goto L_0x00e2
            java.lang.Object r8 = r2.A01()
            boolean r0 = r8 instanceof X.AnonymousClass29W
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r2.A0A()
            if (r0 != 0) goto L_0x0081
            r2.A09(r7)
        L_0x0081:
            r2.A06(r1)
            X.29W r8 = (X.AnonymousClass29W) r8
            int r1 = r8.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0092
            int r1 = r8.A01
            int r0 = r5.A01
            if (r1 == r0) goto L_0x00a8
        L_0x0092:
            X.291 r0 = r12.A0N
            android.graphics.Bitmap r1 = r0.A05(r5)
            X.291 r0 = r12.A0N
            java.lang.String r0 = r0.A0A(r5)
            r2.A08(r0)
            X.4C4 r0 = X.AnonymousClass491.A00(r1)
            r2.A05(r0)
        L_0x00a8:
            int r0 = r5.A00
            if (r0 != r7) goto L_0x00af
            r9 = 1120403456(0x42c80000, float:100.0)
            goto L_0x00bb
        L_0x00af:
            java.util.List r0 = r5.A04
            int r0 = r0.size()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r7) goto L_0x00bb
            r9 = 1112014848(0x42480000, float:50.0)
        L_0x00bb:
            X.5U1 r8 = r2.A00     // Catch:{ RemoteException -> 0x011c }
            X.1e1 r8 = (X.C31361e1) r8     // Catch:{ RemoteException -> 0x011c }
            android.os.Parcel r1 = r8.A01()     // Catch:{ RemoteException -> 0x011c }
            r1.writeFloat(r9)     // Catch:{ RemoteException -> 0x011c }
            r0 = 27
            r8.A03(r0, r1)     // Catch:{ RemoteException -> 0x011c }
            r2.A07(r5)
            X.1sx r1 = r5.A02
            X.291 r0 = r12.A0N
            X.1sx r0 = r0.A0o
            if (r1 != r0) goto L_0x00de
            r2.A04()
        L_0x00d9:
            r3.add(r2)
            goto L_0x0054
        L_0x00de:
            r2.A03()
            goto L_0x00d9
        L_0x00e2:
            com.google.android.gms.maps.model.LatLng r8 = r5.A00()
            X.291 r0 = r12.A0N
            android.graphics.Bitmap r0 = r0.A05(r5)
            X.2sL r2 = new X.2sL
            r2.<init>()
            X.4C4 r0 = X.AnonymousClass491.A00(r0)
            r2.A07 = r0
            X.291 r0 = r12.A0N
            java.lang.String r0 = r0.A0A(r5)
            r2.A09 = r0
            r1 = 1063172178(0x3f5eb852, float:0.87)
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.A00 = r0
            r2.A01 = r1
            X.2NT r0 = r12.A06
            X.AnonymousClass00B.A06(r0)
            r2.A08 = r8
            X.1gN r2 = r0.A03(r2)
            r10.put(r9, r2)
            goto L_0x00a8
        L_0x0117:
            r2.A0L(r4)
            goto L_0x001d
        L_0x011c:
            r1 = move-exception
            X.5Ab r0 = new X.5Ab
            r0.<init>(r1)
            throw r0
        L_0x0123:
            java.util.Iterator r2 = r6.iterator()
        L_0x0127:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r1 = r2.next()
            X.1gN r1 = (X.C32451gN) r1
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0127
            java.lang.Object r0 = r1.A01()
            if (r0 == 0) goto L_0x0127
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0127
            r1.A09(r4)
            goto L_0x0127
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.location.GroupChatLiveLocationsActivity2.A36():void");
    }

    public final void A37(List list, boolean z2) {
        AnonymousClass00B.A06(this.A06);
        List<C39721sx> list2 = list;
        if (list2.size() != 1) {
            double d2 = Double.POSITIVE_INFINITY;
            double d3 = Double.NEGATIVE_INFINITY;
            double d4 = Double.NaN;
            double d5 = Double.NaN;
            for (C39721sx r8 : list2) {
                LatLng latLng = new LatLng(r8.A00, r8.A01);
                double d6 = latLng.A00;
                d2 = Math.min(d2, d6);
                d3 = Math.max(d3, d6);
                double d7 = latLng.A01;
                if (Double.isNaN(d4)) {
                    d4 = d7;
                } else {
                    int i2 = (d4 > d7 ? 1 : (d4 == d7 ? 0 : -1));
                    if (d4 <= d5) {
                        if (i2 <= 0 && d7 <= d5) {
                        }
                    } else if (i2 > 0) {
                        if (d7 <= d5) {
                        }
                    }
                    if (((d4 - d7) + 360.0d) % 360.0d < ((d7 - d5) + 360.0d) % 360.0d) {
                        d4 = d7;
                    }
                }
                d5 = d7;
            }
            AnonymousClass00B.A06(this.A06);
            C13710nw.A04("no included points", !Double.isNaN(d4));
            LatLngBounds latLngBounds = new LatLngBounds(new LatLng(d2, d4), new LatLng(d3, d5));
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen041a);
            int i3 = dimensionPixelSize << 1;
            if (this.A0M.getHeight() > i3 && this.A0M.getWidth() > i3) {
                if (!z2) {
                    this.A06.A05();
                    this.A06.A0A(AnonymousClass2R8.A03(latLngBounds, dimensionPixelSize));
                    this.A0M.postDelayed(new RunnableRunnableShape10S0100000_I0_9((Object) this, 16), 500);
                } else if (!this.A0X) {
                    this.A0X = true;
                    this.A06.A05();
                    this.A06.A0B(AnonymousClass2R8.A03(latLngBounds, dimensionPixelSize), this.A05);
                }
            }
        } else if (!z2) {
            this.A06.A0A(AnonymousClass2R8.A02(new LatLng(((C39721sx) list2.get(0)).A00, ((C39721sx) list2.get(0)).A01), 16.0f));
        } else if (!this.A0X) {
            this.A0X = true;
            this.A06.A0B(AnonymousClass2R8.A02(new LatLng(((C39721sx) list2.get(0)).A00, ((C39721sx) list2.get(0)).A01), 16.0f), this.A05);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c6 A[EDGE_INSN: B:95:0x01c6->B:78:0x01c6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01c6 A[EDGE_INSN: B:96:0x01c6->B:78:0x01c6 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A38(boolean r32) {
        /*
            r31 = this;
            r6 = r31
            X.2NT r0 = r6.A06
            if (r0 == 0) goto L_0x002f
            X.291 r0 = r6.A0N
            boolean r0 = r0.A0u
            if (r0 != 0) goto L_0x002f
            java.util.Set r1 = r6.A0U
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x002f
            X.2jz r0 = r6.A0M
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x025a
            X.2jz r0 = r6.A0M
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x025a
            r30 = r32
            if (r32 == 0) goto L_0x0030
            boolean r0 = r6.A0X
            if (r0 == 0) goto L_0x0030
            r0 = 1
            r6.A0Y = r0
        L_0x002f:
            return
        L_0x0030:
            java.util.ArrayList r29 = new java.util.ArrayList
            r0 = r29
            r0.<init>(r1)
            X.2NT r0 = r6.A06
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r29.isEmpty()
            if (r0 != 0) goto L_0x002f
            X.291 r0 = r6.A0N
            com.google.android.gms.maps.model.LatLng r0 = r0.A06()
            if (r0 == 0) goto L_0x0059
            double r8 = r0.A00
            double r10 = r0.A01
            r12 = 1
            com.facebook.redex.IDxComparatorShape0S0000020_2_I0 r7 = new com.facebook.redex.IDxComparatorShape0S0000020_2_I0
            r7.<init>(r8, r10, r12)
            r0 = r29
            java.util.Collections.sort(r0, r7)
        L_0x0059:
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r11 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r14 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r1 = 0
            r0 = r29
            java.lang.Object r0 = r0.get(r1)
            X.1gN r0 = (X.C32451gN) r0
            com.google.android.gms.maps.model.LatLng r9 = r0.A00()
            java.lang.String r28 = "point must not be null"
            r0 = r28
            X.C13710nw.A02(r9, r0)
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            double r7 = r9.A00
            double r26 = java.lang.Math.min(r0, r7)
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r24 = java.lang.Math.max(r0, r7)
            double r0 = r9.A01
            boolean r20 = java.lang.Double.isNaN(r4)
            if (r20 == 0) goto L_0x01a6
            r14 = r0
        L_0x008c:
            r2 = r0
        L_0x008d:
            r1 = 0
            r0 = r29
            java.lang.Object r0 = r0.get(r1)
            X.1gN r0 = (X.C32451gN) r0
            com.google.android.gms.maps.model.LatLng r13 = r0.A00()
            r0 = r28
            X.C13710nw.A02(r13, r0)
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            double r7 = r13.A00
            double r22 = java.lang.Math.min(r0, r7)
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r9 = java.lang.Math.max(r0, r7)
            double r0 = r13.A01
            if (r20 == 0) goto L_0x0186
            r4 = r0
        L_0x00b2:
            r11 = r0
        L_0x00b3:
            r21 = 1
        L_0x00b5:
            int r1 = r29.size()
            r0 = r21
            if (r0 >= r1) goto L_0x01c6
            r1 = r29
            java.lang.Object r20 = r1.get(r0)
            r0 = r20
            X.1gN r0 = (X.C32451gN) r0
            r20 = r0
            com.google.android.gms.maps.model.LatLng r13 = r20.A00()
            r0 = r28
            X.C13710nw.A02(r13, r0)
            double r7 = r13.A00
            r0 = r26
            double r26 = java.lang.Math.min(r0, r7)
            r0 = r24
            double r24 = java.lang.Math.max(r0, r7)
            double r0 = r13.A01
            boolean r7 = java.lang.Double.isNaN(r14)
            if (r7 == 0) goto L_0x015a
            r14 = r0
        L_0x00e9:
            r2 = r0
        L_0x00ea:
            boolean r0 = java.lang.Double.isNaN(r14)
            r1 = r0 ^ 1
            java.lang.String r0 = "no included points"
            X.C13710nw.A04(r0, r1)
            com.google.android.gms.maps.model.LatLng r7 = new com.google.android.gms.maps.model.LatLng
            r0 = r26
            r7.<init>(r0, r14)
            com.google.android.gms.maps.model.LatLng r8 = new com.google.android.gms.maps.model.LatLng
            r0 = r24
            r8.<init>(r0, r2)
            com.google.android.gms.maps.model.LatLngBounds r0 = new com.google.android.gms.maps.model.LatLngBounds
            r0.<init>(r7, r8)
            boolean r0 = X.AnonymousClass291.A03(r0)
            if (r0 == 0) goto L_0x01c6
            com.google.android.gms.maps.model.LatLng r13 = r20.A00()
            r0 = r28
            X.C13710nw.A02(r13, r0)
            double r7 = r13.A00
            r0 = r22
            double r22 = java.lang.Math.min(r0, r7)
            double r9 = java.lang.Math.max(r9, r7)
            double r0 = r13.A01
            boolean r7 = java.lang.Double.isNaN(r4)
            if (r7 == 0) goto L_0x0130
            r4 = r0
        L_0x012c:
            r11 = r0
        L_0x012d:
            int r21 = r21 + 1
            goto L_0x00b5
        L_0x0130:
            int r8 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 > 0) goto L_0x0153
            if (r7 > 0) goto L_0x013c
            int r7 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x012d
        L_0x013c:
            double r18 = r4 - r0
            r7 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r18 = r18 + r7
            double r18 = r18 % r7
            double r16 = r0 - r11
            double r16 = r16 + r7
            double r16 = r16 % r7
            int r7 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x012c
            r4 = r0
            goto L_0x012d
        L_0x0153:
            if (r7 <= 0) goto L_0x012d
            int r7 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x013c
            goto L_0x012d
        L_0x015a:
            int r8 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            int r7 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r8 > 0) goto L_0x017e
            if (r7 > 0) goto L_0x0166
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x00ea
        L_0x0166:
            double r18 = r14 - r0
            r7 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r18 = r18 + r7
            double r18 = r18 % r7
            double r16 = r0 - r2
            double r16 = r16 + r7
            double r16 = r16 % r7
            int r7 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x00e9
            r14 = r0
            goto L_0x00ea
        L_0x017e:
            if (r7 <= 0) goto L_0x00ea
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x0166
            goto L_0x00ea
        L_0x0186:
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x00b3
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x00b3
            double r18 = r4 - r0
            r7 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r18 = r18 + r7
            double r18 = r18 % r7
            double r16 = r0 - r4
            double r16 = r16 + r7
            double r16 = r16 % r7
            int r7 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b2
            r4 = r0
            goto L_0x00b3
        L_0x01a6:
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x008d
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x008d
            double r18 = r4 - r0
            r16 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r18 = r18 + r16
            double r18 = r18 % r16
            double r8 = r0 - r4
            double r8 = r8 + r16
            double r8 = r8 % r16
            int r7 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x008c
            r14 = r0
            goto L_0x008d
        L_0x01c6:
            r1 = 1
            r0 = r21
            if (r0 != r1) goto L_0x01e5
            r1 = 0
            r0 = r29
            java.lang.Object r0 = r0.get(r1)
            X.1gN r0 = (X.C32451gN) r0
            java.lang.Object r0 = r0.A01()
            X.AnonymousClass00B.A06(r0)
            X.29W r0 = (X.AnonymousClass29W) r0
            java.util.List r1 = r0.A04
            r0 = r30
            r6.A37(r1, r0)
            return
        L_0x01e5:
            X.2NT r0 = r6.A06
            X.AnonymousClass00B.A06(r0)
            boolean r0 = java.lang.Double.isNaN(r4)
            r1 = r0 ^ 1
            java.lang.String r0 = "no included points"
            X.C13710nw.A04(r0, r1)
            com.google.android.gms.maps.model.LatLng r2 = new com.google.android.gms.maps.model.LatLng
            r0 = r22
            r2.<init>(r0, r4)
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r9, r11)
            com.google.android.gms.maps.model.LatLngBounds r4 = new com.google.android.gms.maps.model.LatLngBounds
            r4.<init>(r2, r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166234(0x7f07041a, float:1.7946708E38)
            int r3 = r1.getDimensionPixelSize(r0)
            X.2jz r0 = r6.A0M
            int r0 = r0.getHeight()
            int r1 = r3 << 1
            if (r0 <= r1) goto L_0x002f
            X.2jz r0 = r6.A0M
            int r0 = r0.getWidth()
            if (r0 <= r1) goto L_0x002f
            if (r32 == 0) goto L_0x023d
            boolean r0 = r6.A0X
            if (r0 != 0) goto L_0x002f
            r0 = 1
            r6.A0X = r0
            X.2NT r0 = r6.A06
            r0.A05()
            X.2NT r2 = r6.A06
            X.2R9 r1 = X.AnonymousClass2R8.A03(r4, r3)
            X.5RJ r0 = r6.A05
            r2.A0B(r1, r0)
            return
        L_0x023d:
            X.2NT r0 = r6.A06
            r0.A05()
            X.2NT r1 = r6.A06
            X.2R9 r0 = X.AnonymousClass2R8.A03(r4, r3)
            r1.A0A(r0)
            X.2jz r3 = r6.A0M
            r0 = 16
            com.facebook.redex.RunnableRunnableShape10S0100000_I0_9 r2 = new com.facebook.redex.RunnableRunnableShape10S0100000_I0_9
            r2.<init>((java.lang.Object) r6, (int) r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x025a:
            X.2jz r0 = r6.A0M
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 17
            com.facebook.redex.IDxLListenerShape144S0100000_2_I0 r0 = new com.facebook.redex.IDxLListenerShape144S0100000_2_I0
            r0.<init>(r6, r1)
            r2.addOnGlobalLayoutListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.location.GroupChatLiveLocationsActivity2.A38(boolean):void");
    }

    public final boolean A39(LatLng latLng) {
        AnonymousClass2NT r0 = this.A06;
        AnonymousClass00B.A06(r0);
        AnonymousClass39T A002 = r0.A00();
        if (A002.A02().A04.A00(latLng)) {
            return false;
        }
        if (latLng.A00 >= A002.A02().A04.A01.A00) {
            return true;
        }
        Point A003 = A002.A00(A002.A02().A04.A01);
        A003.offset(0, this.A0N.A0A);
        return !new LatLngBounds(A002.A01(A003), A002.A02().A04.A00).A00(latLng);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.A0N.A0Z(i2, i3)) {
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
        C14870pt r40 = this.A05;
        C16040sK r39 = this.A01;
        C204310c r21 = this.A09;
        C19980zJ r20 = this.A00;
        C17200uh r19 = this.A0F;
        AnonymousClass1P7 r18 = this.A0P;
        C17160ud r17 = this.A0B;
        C16080sP r15 = this.A0E;
        AnonymousClass013 r12 = this.A01;
        C17140ub r11 = this.A0D;
        C19150xq r10 = this.A0K;
        C16600tK r9 = this.A08;
        AnonymousClass127 r8 = this.A0A;
        C16260sj r7 = this.A0H;
        AnonymousClass16R r6 = this.A07;
        C19430yQ r5 = this.A0O;
        AnonymousClass152 r4 = this.A0G;
        AnonymousClass18R r3 = this.A0L;
        C19980zJ r16 = r20;
        AnonymousClass16R r172 = r6;
        C14870pt r182 = r40;
        C16040sK r192 = r39;
        C16600tK r202 = r9;
        this.A0N = new IDxLUiShape87S0100000_1_I0(r16, r172, r182, r192, r202, r21, r8, r17, this.A0C, r11, r15, r19, r4, r29, r7, r12, r10, r3, r5, r18, this.A0Q, this, 1);
        x().A0N(true);
        setContentView((int) R.layout.layout02ef);
        C216114t r32 = this.A0I;
        C15830rv A022 = C15830rv.A02(getIntent().getStringExtra("jid"));
        AnonymousClass00B.A06(A022);
        C16010sH A012 = r32.A01(A022);
        x().A0J(AnonymousClass2Sy.A05(this, this.A0B, this.A0E.A08(A012)));
        this.A0N.A0N(this, bundle2);
        C438721w.A00(this);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.A00 = 1;
        googleMapOptions.A05 = false;
        googleMapOptions.A08 = true;
        googleMapOptions.A06 = true;
        googleMapOptions.A0A = true;
        googleMapOptions.A09 = true;
        this.A0M = new IDxMViewShape86S0100000_2_I0(this, googleMapOptions, this, 1);
        ((ViewGroup) AnonymousClass00T.A05(this, R.id.map_holder)).addView(this.A0M);
        this.A0M.A04(bundle2);
        ImageView imageView = (ImageView) AnonymousClass00T.A05(this, R.id.my_location);
        this.A04 = imageView;
        imageView.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 34));
        this.A02 = bundle2;
        A35();
    }

    public Dialog onCreateDialog(int i2) {
        Dialog A042 = this.A0N.A04(i2);
        return A042 == null ? super.onCreateDialog(i2) : A042;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass2NT r0;
        getMenuInflater().inflate(R.menu.menu000e, menu);
        MenuItem findItem = menu.findItem(R.id.map_traffic);
        this.A03 = findItem;
        if (findItem == null || (r0 = this.A06) == null) {
            return true;
        }
        findItem.setChecked(r0.A0N());
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0M.A00();
        this.A0N.A0C();
        if (this.A06 != null) {
            SharedPreferences.Editor edit = this.A0R.A00(AnonymousClass01S.A07).edit();
            CameraPosition A022 = this.A06.A02();
            LatLng latLng = A022.A03;
            edit.putFloat("live_location_lat", (float) latLng.A00);
            edit.putFloat("live_location_lng", (float) latLng.A01);
            edit.putFloat("live_location_zoom", A022.A02);
            edit.apply();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0M.A01();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor putBoolean;
        AnonymousClass2NT r0;
        int i2;
        if (this.A06 != null) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.map_type_normal) {
                this.A06.A07(1);
                putBoolean = this.A0R.A00(AnonymousClass01S.A07).edit().putInt("live_location_map_type", 1);
            } else {
                if (itemId == R.id.map_type_satellite) {
                    r0 = this.A06;
                    i2 = 4;
                } else if (itemId == R.id.map_type_terrain) {
                    r0 = this.A06;
                    i2 = 3;
                } else if (itemId == R.id.map_traffic) {
                    boolean z2 = !this.A06.A0N();
                    this.A06.A0M(z2);
                    this.A03.setChecked(z2);
                    putBoolean = this.A0R.A00(AnonymousClass01S.A07).edit().putBoolean("live_location_show_traffic", z2);
                } else if (itemId == 16908332) {
                    finish();
                    return true;
                }
                r0.A07(i2);
                putBoolean = this.A0R.A00(AnonymousClass01S.A07).edit().putInt("live_location_map_type", i2);
            }
            putBoolean.apply();
            return true;
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.A0M.A02();
        C55582jz r0 = this.A0M;
        SensorManager sensorManager = r0.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0C);
        }
        this.A0N.A0D();
    }

    public void onResume() {
        super.onResume();
        this.A0M.A03();
        this.A0M.A08();
        this.A0N.A0E();
        A35();
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass2NT r0 = this.A06;
        if (r0 != null) {
            CameraPosition A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            LatLng latLng = A022.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A0M.A03);
        }
        this.A0M.A05(bundle);
        this.A0N.A0O(bundle);
        super.onSaveInstanceState(bundle);
    }
}

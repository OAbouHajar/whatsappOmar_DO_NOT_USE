package com.obwhatsapp.businessdirectory.view.activity;

import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass074;
import X.AnonymousClass07P;
import X.AnonymousClass152;
import X.AnonymousClass15P;
import X.AnonymousClass16R;
import X.AnonymousClass1GE;
import X.AnonymousClass1P7;
import X.AnonymousClass1US;
import X.AnonymousClass269;
import X.AnonymousClass2Rf;
import X.AnonymousClass38W;
import X.C005702l;
import X.C011105i;
import X.C016407u;
import X.C04660Nk;
import X.C100814wF;
import X.C1041354b;
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
import X.C16980tz;
import X.C17120uZ;
import X.C17180uf;
import X.C17250um;
import X.C18260wP;
import X.C18450wi;
import X.C19490yW;
import X.C19840z5;
import X.C19860z7;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C25511Kb;
import X.C25651Kp;
import X.C25661Kq;
import X.C32241fu;
import X.C43201zV;
import X.C49132Rg;
import X.C50052Xn;
import X.C50302Yu;
import X.C50512Zx;
import X.C50602a7;
import X.C52602e7;
import X.C54932iV;
import X.C55562jx;
import X.C56302nQ;
import X.C56332nT;
import X.C57832ry;
import X.C615339h;
import X.C87594Xo;
import X.C93414j9;
import X.C93714je;
import X.C94894le;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape161S0100000_2_I0;
import com.facebook.redex.IDxDListenerShape158S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape82S0200000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class BusinessDirectoryMapViewActivity extends C14530pL {
    public Bitmap A00;
    public Bitmap A01;
    public View A02;
    public ViewGroup A03;
    public ImageView A04;
    public C005702l A05;
    public AnonymousClass074 A06;
    public C04660Nk A07;
    public BottomSheetBehavior A08;
    public C50512Zx A09;
    public TextEmojiLabel A0A;
    public C17180uf A0B;
    public C25511Kb A0C;
    public C19860z7 A0D;
    public DirectoryMapViewLocationUpdateListener A0E;
    public C50052Xn A0F;
    public C615339h A0G;
    public C50302Yu A0H;
    public AnonymousClass38W A0I;
    public C56302nQ A0J;
    public C56332nT A0K;
    public C56332nT A0L;
    public AnonymousClass269 A0M;
    public C17120uZ A0N;
    public C16260sj A0O;
    public C55562jx A0P;
    public AnonymousClass1P7 A0Q;
    public Runnable A0R;
    public boolean A0S;
    public final Handler A0T;
    public final C011105i A0U;
    public final Map A0V;
    public final Map A0W;

    public BusinessDirectoryMapViewActivity() {
        this(0);
        this.A0V = new LinkedHashMap();
        this.A0W = new LinkedHashMap();
        this.A0T = new Handler(Looper.getMainLooper());
        this.A0U = A0O(new C94894le(this), new AnonymousClass07P());
    }

    public BusinessDirectoryMapViewActivity(int i2) {
        this.A0S = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 28));
    }

    public void A1q() {
        if (!this.A0S) {
            this.A0S = true;
            C49132Rg r11 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r11.A1s;
            AnonymousClass01J r4 = r2.ARB;
            this.A05 = (C16320sq) r4.get();
            this.A0C = (C14710pd) r2.A05.get();
            AnonymousClass01J r6 = r2.AB3;
            this.A05 = (C14870pt) r6.get();
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
            AnonymousClass01J r7 = r2.ADr;
            this.A01 = (C16040sK) r7.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r11.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A09 = (C50512Zx) r11.A0O.get();
            this.A0Q = (AnonymousClass1P7) r2.ADc.get();
            this.A0F = new C50052Xn((C50602a7) r11.A0P.get());
            this.A0O = (C16260sj) r2.AQe.get();
            AnonymousClass01J r12 = r2.A2n;
            this.A0B = (C17180uf) r12.get();
            this.A0H = r11.A0A();
            this.A0D = r11.A08();
            this.A0I = new AnonymousClass38W((C25651Kp) r2.A2m.get());
            AnonymousClass01J r5 = r2.AQB;
            AnonymousClass01J r3 = r2.AR8;
            C19840z5 A092 = r11.A09();
            C19860z7 A082 = r11.A08();
            AnonymousClass152 r18 = (AnonymousClass152) r2.A51.get();
            C16980tz r19 = (C16980tz) r5.get();
            this.A0G = new C615339h((C16040sK) r7.get(), (C17180uf) r12.get(), A082, A092, (C25661Kq) r2.A70.get(), r18, r19, (AnonymousClass013) r3.get(), (C16320sq) r4.get());
            this.A0N = (C17120uZ) r2.AQT.get();
            this.A0C = (C25511Kb) r2.A2u.get();
            AnonymousClass013 r8 = (AnonymousClass013) r3.get();
            this.A0E = new DirectoryMapViewLocationUpdateListener((AnonymousClass16R) r2.AAq.get(), (C14870pt) r6.get(), (C16980tz) r5.get(), r8, (C16320sq) r4.get());
        }
    }

    public final C25511Kb A35() {
        C25511Kb r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("businessDirectorySharedPrefs");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final DirectoryMapViewLocationUpdateListener A36() {
        DirectoryMapViewLocationUpdateListener directoryMapViewLocationUpdateListener = this.A0E;
        if (directoryMapViewLocationUpdateListener != null) {
            return directoryMapViewLocationUpdateListener;
        }
        C18450wi.A0O("locationUpdateListener");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final void A37() {
        C32241fu r3 = new C32241fu(this);
        r3.A02(R.string.str0a05);
        r3.A01(R.string.str0a04);
        r3.A03(new IDxCListenerShape161S0100000_2_I0(this, 5));
        r3.A0C(new IDxDListenerShape158S0100000_2_I0(this, 0));
        r3.A07(true);
        r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 30));
        r3.create().show();
    }

    public final void A38() {
        C54932iV r3 = new C54932iV(this);
        r3.A01 = R.drawable.permission_location;
        r3.A0K = AnonymousClass1GE.A07;
        r3.A0J = new String[]{"android.permission.ACCESS_COARSE_LOCATION"};
        r3.A09 = R.string.str11ce;
        r3.A06 = R.string.str11d7;
        startActivityForResult(r3.A00(), 34);
    }

    public final void A39(C93714je r4, String str, List list, Map map, int i2) {
        C50302Yu r1 = this.A0H;
        if (r1 != null) {
            r1.A00(new C100814wF(this, r4, str, list, map, i2), str, C87594Xo.A00(this, 54.0f));
            return;
        }
        C18450wi.A0O("directoryImageLoader");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final void A3A(C93714je r10, List list, int i2) {
        AnonymousClass1US r5 = r10.A03;
        if (r5 != null) {
            String str = r5.A0C;
            if (str == null || this.A0V.get(str) != null) {
                Map map = this.A0W;
                if (map.get(r5.A02()) != null) {
                    AnonymousClass074 r3 = this.A06;
                    C18450wi.A0F(r3);
                    Bitmap bitmap = this.A00;
                    if (bitmap == null) {
                        C18450wi.A0O("defaultAvatar");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    C57832ry r2 = new C57832ry(bitmap, r3, r10);
                    List list2 = r5.A0I;
                    int A002 = C52602e7.A00(list2.isEmpty() ? "" : ((C93414j9) list2.get(0)).A02);
                    C56332nT r32 = r2.A03;
                    r32.A0L.setColor(r32.A0F.getResources().getColor(A002));
                    r32.A09 = r5.A0E;
                    r32.A03 = r5.A05;
                    Bitmap bitmap2 = (Bitmap) map.get(r5.A02());
                    if (bitmap2 != null) {
                        if (!bitmap2.equals(C43201zV.A07) || (bitmap2 = this.A01) != null) {
                            r32.A05 = bitmap2;
                        } else {
                            C18450wi.A0O("defaultCategoryBitmap");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                    }
                    Bitmap bitmap3 = (Bitmap) this.A0V.get(str);
                    if (bitmap3 != null) {
                        if (!bitmap3.equals(C43201zV.A07) || (bitmap3 = this.A00) != null) {
                            r32.A04(bitmap3);
                        } else {
                            C18450wi.A0O("defaultAvatar");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                    }
                    r32.A03();
                    r2.A00 = new ViewOnClickCListenerShape3S0200000_I0(this, 6, r2);
                    AnonymousClass074 r0 = this.A06;
                    if (r0 != null) {
                        r0.A0B(r2);
                    }
                    if (r10.A01) {
                        r2.A07(1.0f);
                        AnonymousClass269 r02 = this.A0M;
                        if (r02 == null) {
                            C18450wi.A0O("viewModel");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                        r02.A07 = r2;
                    }
                    list.add(r2);
                    if (i2 == list.size()) {
                        AnonymousClass269 r03 = this.A0M;
                        if (r03 == null) {
                            C18450wi.A0O("viewModel");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        } else {
                            r03.A0E.addAll(list);
                        }
                    }
                }
            }
        }
    }

    public final void A3B(boolean z2) {
        LocationManager A0F2 = this.A08.A0F();
        boolean z3 = false;
        if (A0F2 != null && (A0F2.isProviderEnabled("gps") || A0F2.isProviderEnabled("network"))) {
            z3 = true;
        }
        AnonymousClass269 r2 = this.A0M;
        if (z2) {
            if (r2 == null) {
                C18450wi.A0O("viewModel");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                r2.A0I(z3);
            }
        } else if (z3) {
            if (r2 == null) {
                C18450wi.A0O("viewModel");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            r2.A0U.A00(5);
            r2.A0O.A0B(1);
            r2.A0f.A0B(0);
        } else if (r2 == null) {
            C18450wi.A0O("viewModel");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            r2.A0U.A00(75);
            A37();
        }
    }

    public final boolean A3C() {
        Object systemService = getSystemService("location");
        if (systemService != null) {
            LocationManager locationManager = (LocationManager) systemService;
            C16260sj r0 = this.A0O;
            if (r0 != null) {
                return r0.A05() && locationManager.isProviderEnabled("gps");
            }
            C18450wi.A0O("waPermissionsHelper");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 34) {
            if (i3 == -1) {
                A35().A03(true);
                A35().A01();
                A3B(false);
            } else if (i3 == 0) {
                AnonymousClass269 r0 = this.A0M;
                if (r0 == null) {
                    C18450wi.A0O("viewModel");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                r0.A08();
            }
            AnonymousClass074 r1 = this.A06;
            if (r1 != null) {
                r1.A0D(A3C());
            }
        } else if (i2 == 35) {
            LocationManager A0F2 = this.A08.A0F();
            boolean z2 = false;
            if (A0F2 != null && (A0F2.isProviderEnabled("gps") || A0F2.isProviderEnabled("network"))) {
                z2 = true;
            }
            AnonymousClass269 r2 = this.A0M;
            if (z2) {
                if (r2 == null) {
                    C18450wi.A0O("viewModel");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                r2.A0U.A00(5);
                r2.A0O.A0B(1);
                r2.A0f.A0B(0);
            } else if (r2 == null) {
                C18450wi.A0O("viewModel");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                r2.A08();
            }
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onBackPressed() {
        AnonymousClass269 r0 = this.A0M;
        if (r0 == null) {
            C18450wi.A0O("viewModel");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            r0.A07();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0060, code lost:
        if (r2.A0E(r1, 2791) == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.view.Window r0 = r6.getWindow()
            android.view.View r0 = r0.getDecorView()
            int r0 = r0.getSystemUiVisibility()
            r1 = r0 | 1024(0x400, float:1.435E-42)
            android.view.Window r0 = r6.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.setSystemUiVisibility(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x002d
            android.view.Window r1 = r6.getWindow()
            r0 = 2131101586(0x7f060792, float:1.7815586E38)
            int r0 = X.AnonymousClass00T.A00(r6, r0)
        L_0x002d:
            r0 = 2131558468(0x7f0d0044, float:1.8742253E38)
            r6.setContentView((int) r0)
            android.view.View r1 = r6.A00
            r0 = 2131362654(0x7f0a035e, float:1.8345095E38)
            android.view.View r3 = X.C004601z.A0E(r1, r0)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r0 = 1
            r3.setNestedScrollingEnabled(r0)
            X.2Xn r0 = r6.A0F
            if (r0 == 0) goto L_0x03a9
            r3.setAdapter(r0)
            X.0uf r0 = r6.A0B
            if (r0 == 0) goto L_0x039c
            X.0pd r2 = r0.A02
            r0 = 450(0x1c2, float:6.3E-43)
            X.0tM r1 = X.C16620tM.A02
            boolean r0 = r2.A0E(r1, r0)
            if (r0 == 0) goto L_0x0062
            r0 = 2791(0xae7, float:3.911E-42)
            boolean r1 = r2.A0E(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0064
        L_0x0062:
            r0 = 8
        L_0x0064:
            r3.setVisibility(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131231506(0x7f080312, float:1.8079095E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)
            X.C18450wi.A0B(r0)
            r6.A01 = r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131232315(0x7f08063b, float:1.8080736E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)
            X.0Nk r0 = X.AnonymousClass0Wt.A01(r0)
            r6.A07 = r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131230908(0x7f0800bc, float:1.8077882E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)
            X.C18450wi.A0B(r0)
            r6.A00 = r0
            X.2nQ r0 = new X.2nQ
            r0.<init>(r6)
            r6.A0J = r0
            r0 = 1113063424(0x42580000, float:54.0)
            int r2 = X.C87594Xo.A00(r6, r0)
            android.graphics.Bitmap r1 = r6.A00
            java.lang.String r3 = "defaultAvatar"
            if (r1 != 0) goto L_0x00b6
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            X.2nT r0 = new X.2nT
            r0.<init>(r6, r1, r2)
            r6.A0K = r0
            r0 = 1123024896(0x42f00000, float:120.0)
            int r2 = X.C87594Xo.A00(r6, r0)
            android.graphics.Bitmap r1 = r6.A00
            if (r1 != 0) goto L_0x00d2
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            X.2nT r0 = new X.2nT
            r0.<init>(r6, r1, r2)
            r6.A0L = r0
            X.1P7 r0 = r6.A0Q
            if (r0 == 0) goto L_0x038f
            r0.A03(r6)
            android.view.View r1 = r6.A00
            r0 = 2131364787(0x7f0a0bb3, float:1.834942E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            X.C18450wi.A0B(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.A04 = r0
            X.0P5 r5 = new X.0P5
            r5.<init>()
            r0 = 1
            r5.A06 = r0
            r0 = 0
            r5.A03 = r0
            boolean r0 = X.C434920f.A09(r6)
            r5.A04 = r0
            java.lang.String r0 = "whatsapp_smb_business_discovery"
            r5.A02 = r0
            r2 = -4599168823961265218(0xc02c785271bcdbbe, double:-14.235004)
            r0 = -4590867386055929270(0xc049f66f9335d24a, double:-51.92528)
            X.020 r4 = new X.020
            r4.<init>(r2, r0)
            r3 = 1082130432(0x40800000, float:4.0)
            r2 = 1119092736(0x42b40000, float:90.0)
            r1 = 0
            X.0YG r0 = new X.0YG
            r0.<init>(r4, r3, r2, r1)
            r5.A01 = r0
            X.3uS r0 = new X.3uS
            r0.<init>(r5, r6)
            r6.A0P = r0
            android.view.View r1 = r6.A00
            r0 = 2131364466(0x7f0a0a72, float:1.834877E38)
            android.view.View r2 = X.C004601z.A0E(r1, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.2jx r0 = r6.A0P
            java.lang.String r1 = "facebookMapView"
            if (r0 != 0) goto L_0x0144
            X.C18450wi.A0O(r1)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0144:
            r0.A0E(r7)
            X.2jx r0 = r6.A0P
            if (r0 != 0) goto L_0x0156
            X.C18450wi.A0O(r1)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0156:
            r2.addView(r0)
            X.074 r0 = r6.A06
            if (r0 != 0) goto L_0x0175
            X.2jx r2 = r6.A0P
            if (r2 != 0) goto L_0x016c
            X.C18450wi.A0O(r1)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x016c:
            r1 = 0
            com.facebook.redex.IDxRCallbackShape295S0100000_2_I0 r0 = new com.facebook.redex.IDxRCallbackShape295S0100000_2_I0
            r0.<init>(r6, r1)
            r2.A0J(r0)
        L_0x0175:
            android.view.View r1 = r6.A00
            r0 = 2131365557(0x7f0a0eb5, float:1.8350983E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            X.C18450wi.A0B(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.A03 = r0
            android.view.View r1 = r6.A00
            r0 = 2131362746(0x7f0a03ba, float:1.8345281E38)
            android.view.View r2 = X.C004601z.A0E(r1, r0)
            X.C18450wi.A0B(r2)
            com.obwhatsapp.TextEmojiLabel r2 = (com.obwhatsapp.TextEmojiLabel) r2
            r6.A0A = r2
            if (r2 != 0) goto L_0x01a4
            java.lang.String r0 = "mapViewChipText"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x01a4:
            r1 = 9
            com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1
            r0.<init>(r6, r1)
            r2.setOnClickListener(r0)
            r1 = 2131362320(0x7f0a0210, float:1.8344417E38)
            android.view.View r0 = r6.findViewById(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.A00(r0)
            X.C18450wi.A0B(r0)
            r6.A08 = r0
            android.view.View r0 = r6.A00
            android.view.View r0 = X.C004601z.A0E(r0, r1)
            X.C18450wi.A0B(r0)
            r6.A02 = r0
            android.view.View r1 = r6.A00
            r0 = 2131363219(0x7f0a0593, float:1.834624E38)
            android.view.View r2 = X.C004601z.A0E(r1, r0)
            r1 = 6
            com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1
            r0.<init>(r6, r1)
            r2.setOnClickListener(r0)
            android.view.View r1 = r6.A02
            java.lang.String r5 = "businessProfileSheet"
            if (r1 != 0) goto L_0x01ec
            X.C18450wi.A0O(r5)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x01ec:
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            android.view.View r4 = X.C004601z.A0E(r1, r0)
            X.C18450wi.A0B(r4)
            int r3 = r4.getPaddingLeft()
            r2 = 0
            int r1 = r4.getPaddingRight()
            int r0 = r4.getPaddingBottom()
            r4.setPadding(r3, r2, r1, r0)
            X.39h r0 = r6.A0G
            if (r0 == 0) goto L_0x0382
            r0.A02(r4)
            android.view.View r1 = r6.A02
            if (r1 != 0) goto L_0x021c
            X.C18450wi.A0O(r5)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x021c:
            r0 = 2131362363(0x7f0a023b, float:1.8344504E38)
            android.view.View r1 = X.C004601z.A0E(r1, r0)
            X.C18450wi.A0B(r1)
            r0 = 8
            r1.setVisibility(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r6.A08
            if (r2 != 0) goto L_0x023c
            java.lang.String r0 = "bottomSheetBehavior"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x023c:
            r1 = 1
            com.google.android.material.bottomsheet.IDxSCallbackShape45S0100000_2_I0 r0 = new com.google.android.material.bottomsheet.IDxSCallbackShape45S0100000_2_I0
            r0.<init>(r6, r1)
            r2.A0E = r0
            android.view.View r1 = r6.A00
            r0 = 2131362143(0x7f0a015f, float:1.8344058E38)
            android.view.View r2 = X.C004601z.A0E(r1, r0)
            r1 = 7
            com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1
            r0.<init>(r6, r1)
            r2.setOnClickListener(r0)
            android.view.View r1 = r6.A00
            r0 = 2131364787(0x7f0a0bb3, float:1.834942E38)
            android.view.View r2 = X.C004601z.A0E(r1, r0)
            r1 = 8
            com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1
            r0.<init>(r6, r1)
            r2.setOnClickListener(r0)
            X.2Zx r1 = r6.A09
            if (r1 == 0) goto L_0x0374
            X.2qP r0 = new X.2qP
            r0.<init>(r7, r6, r1)
            X.02z r1 = new X.02z
            r1.<init>((X.AnonymousClass04o) r0, (X.C001500q) r6)
            java.lang.Class<X.269> r0 = X.AnonymousClass269.class
            X.01n r0 = r1.A01(r0)
            X.269 r0 = (X.AnonymousClass269) r0
            r6.A0M = r0
            java.lang.String r3 = "viewModel"
            if (r0 != 0) goto L_0x0291
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0291:
            X.1cy r2 = r0.A0f
            r1 = 17
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0
            r0.<init>(r6, r1)
            r2.A0A(r6, r0)
            X.269 r0 = r6.A0M
            if (r0 != 0) goto L_0x02ac
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02ac:
            X.027 r2 = r0.A0M
            r1 = 62
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.A0A(r6, r0)
            X.269 r0 = r6.A0M
            if (r0 != 0) goto L_0x02c7
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02c7:
            X.1cy r2 = r0.A0d
            r1 = 63
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.A0A(r6, r0)
            X.269 r0 = r6.A0M
            if (r0 != 0) goto L_0x02e2
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02e2:
            X.027 r2 = r0.A0O
            r1 = 61
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.A0A(r6, r0)
            X.269 r0 = r6.A0M
            if (r0 != 0) goto L_0x02fd
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02fd:
            X.1cy r2 = r0.A0e
            r1 = 60
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.A0A(r6, r0)
            X.269 r0 = r6.A0M
            if (r0 != 0) goto L_0x0318
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0318:
            X.027 r2 = r0.A0P
            r1 = 18
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0
            r0.<init>(r6, r1)
            r2.A0A(r6, r0)
            X.269 r0 = r6.A0M
            if (r0 != 0) goto L_0x0333
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0333:
            X.1cy r2 = r0.A0c
            r1 = 16
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0
            r0.<init>(r6, r1)
            r2.A0A(r6, r0)
            X.269 r0 = r6.A0M
            if (r0 != 0) goto L_0x034e
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x034e:
            X.027 r2 = r0.A0N
            r1 = 64
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.A0A(r6, r0)
            X.04p r1 = r6.A06
            com.obwhatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener r0 = r6.A36()
            r1.A00(r0)
            com.obwhatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener r0 = r6.A36()
            X.027 r2 = r0.A00
            r1 = 15
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0
            r0.<init>(r6, r1)
            r2.A0A(r6, r0)
            return
        L_0x0374:
            java.lang.String r0 = "viewModelFactory"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0382:
            java.lang.String r0 = "businessProfileRowHelper"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x038f:
            java.lang.String r0 = "locationUtils"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x039c:
            java.lang.String r0 = "directoryGating"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x03a9:
            java.lang.String r0 = "filterAdapter"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0R;
        if (runnable != null) {
            this.A0T.removeCallbacks(runnable);
        }
        if (this.A0P == null) {
            C18450wi.A0O("facebookMapView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        C55562jx r0 = this.A0P;
        if (r0 == null) {
            C18450wi.A0O("facebookMapView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            r0.A05();
        }
    }

    public void onPause() {
        super.onPause();
        C55562jx r2 = this.A0P;
        if (r2 == null) {
            C18450wi.A0O("facebookMapView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        SensorManager sensorManager = r2.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r2.A0D);
        }
    }

    public void onResume() {
        super.onResume();
        C55562jx r1 = this.A0P;
        if (r1 == null) {
            C18450wi.A0O("facebookMapView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        r1.A0K();
        AnonymousClass074 r12 = this.A06;
        if (r12 != null) {
            r12.A0D(A3C());
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18450wi.A0H(bundle, 0);
        AnonymousClass269 r3 = this.A0M;
        if (r3 == null) {
            C18450wi.A0O("viewModel");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        C016407u r2 = r3.A0S;
        r2.A06("saved-state-marker-items", r3.A0P.A01());
        r2.A06("saved-state-selected-category", r3.A09);
        r2.A06("saved-state-search-business-chip-visible", Boolean.valueOf(r3.A0L));
        r2.A06("saved-state-should-handle-gps-location-change", Boolean.valueOf(r3.A0K));
        r2.A06("saved-state-map-view-chip-state", r3.A0O.A01());
        r2.A06("saved-state-show-request-dialog", Boolean.FALSE);
        r2.A06("saved-state-error-dialog", r3.A0M.A01());
        r2.A06("saved-state-marker_state", Integer.valueOf(r3.A00));
        r2.A06("saved-state-view_state", r3.A0C);
        C55562jx r0 = this.A0P;
        if (r0 == null) {
            C18450wi.A0O("facebookMapView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        r0.A0F(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        if (this.A0P == null) {
            C18450wi.A0O("facebookMapView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public void onStop() {
        super.onStop();
        if (this.A0P == null) {
            C18450wi.A0O("facebookMapView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public final void updateMapPadding(View view) {
        C1041354b r3 = new C1041354b();
        BottomSheetBehavior bottomSheetBehavior = this.A08;
        if (bottomSheetBehavior == null) {
            C18450wi.A0O("bottomSheetBehavior");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        if (bottomSheetBehavior.A0B == 3) {
            r3.element = view.getHeight();
        }
        C55562jx r2 = this.A0P;
        if (r2 == null) {
            C18450wi.A0O("facebookMapView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            r2.A0J(new IDxRCallbackShape82S0200000_2_I0(r3, 0, this));
        }
    }
}

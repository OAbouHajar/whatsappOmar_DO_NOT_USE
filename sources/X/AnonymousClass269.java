package X;

import android.app.Application;
import android.location.Location;
import android.os.Build;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.269  reason: invalid class name */
public final class AnonymousClass269 extends AnonymousClass02H implements C30321cA {
    public int A00;
    public C06540Wn A01;
    public AnonymousClass0YG A02;
    public AnonymousClass0YG A03;
    public AnonymousClass0YH A04;
    public AnonymousClass0IS A05;
    public AnonymousClass4KG A06;
    public C57832ry A07;
    public C57822rx A08;
    public C73563oM A09;
    public Integer A0A;
    public String A0B;
    public String A0C = "unknown";
    public Map A0D = new LinkedHashMap();
    public Set A0E = new LinkedHashSet();
    public Set A0F = new LinkedHashSet();
    public Set A0G = new LinkedHashSet();
    public Set A0H = new LinkedHashSet();
    public boolean A0I = true;
    public boolean A0J;
    public boolean A0K = true;
    public boolean A0L;
    public final AnonymousClass027 A0M = new AnonymousClass027();
    public final AnonymousClass027 A0N = new AnonymousClass027();
    public final AnonymousClass027 A0O = new AnonymousClass027();
    public final AnonymousClass027 A0P = new AnonymousClass027();
    public final AnonymousClass023 A0Q;
    public final AnonymousClass023 A0R;
    public final C016407u A0S;
    public final C17180uf A0T;
    public final C17210ui A0U;
    public final AnonymousClass399 A0V;
    public final AnonymousClass2Z2 A0W;
    public final C25641Ko A0X;
    public final C18170wG A0Y;
    public final AnonymousClass3FG A0Z;
    public final AnonymousClass4DQ A0a;
    public final C16260sj A0b;
    public final C30801cy A0c = new C30801cy();
    public final C30801cy A0d = new C30801cy();
    public final C30801cy A0e = new C30801cy();
    public final C30801cy A0f = new C30801cy();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass269(Application application, C016407u r6, C17180uf r7, C17210ui r8, AnonymousClass399 r9, AnonymousClass2Z2 r10, C25641Ko r11, C18170wG r12, AnonymousClass3FG r13, C16260sj r14) {
        super(application);
        C30801cy r1;
        int i2;
        C18450wi.A0H(application, 1);
        C18450wi.A0H(r6, 2);
        C18450wi.A0H(r14, 3);
        C18450wi.A0H(r7, 4);
        C18450wi.A0H(r11, 7);
        C18450wi.A0H(r8, 9);
        this.A0S = r6;
        this.A0b = r14;
        this.A0T = r7;
        this.A0W = r10;
        this.A0Z = r13;
        this.A0X = r11;
        this.A0Y = r12;
        this.A0U = r8;
        this.A0V = r9;
        IDxObserverShape113S0100000_1_I0 iDxObserverShape113S0100000_1_I0 = new IDxObserverShape113S0100000_1_I0(this, 22);
        this.A0R = iDxObserverShape113S0100000_1_I0;
        IDxObserverShape115S0100000_2_I0 iDxObserverShape115S0100000_2_I0 = new IDxObserverShape115S0100000_2_I0((Object) this, 66);
        this.A0Q = iDxObserverShape115S0100000_2_I0;
        this.A0a = new AnonymousClass4DQ(this);
        r10.A0A = r13;
        r10.A08 = r13;
        Map map = r6.A03;
        Boolean bool = (Boolean) map.get("saved-state-should-handle-gps-location-change");
        if (bool != null) {
            this.A0K = bool.booleanValue();
        }
        if (!map.containsKey("saved-state-show-request-dialog")) {
            if (A0L()) {
                this.A0U.A00(0);
                r1 = this.A0f;
                i2 = 2;
            } else {
                r1 = this.A0f;
                i2 = 1;
            }
            r1.A0B(Integer.valueOf(i2));
        }
        r13.A02.A07(iDxObserverShape113S0100000_1_I0);
        r13.A00.A07(iDxObserverShape115S0100000_2_I0);
        C14710pd r2 = r7.A02;
        C16620tM r15 = C16620tM.A02;
        if (r2.A0E(r15, 450) && r2.A0E(r15, 2791)) {
            A06();
        }
    }

    public void A04() {
        AnonymousClass3FG r2 = this.A0Z;
        AnonymousClass2Z2 r0 = r2.A04.A00;
        r0.A00();
        r0.A07 = null;
        AnonymousClass2Z2 r02 = this.A0W;
        r02.A08 = null;
        r02.A0A = null;
        r2.A00.A08(this.A0Q);
        r2.A02.A08(this.A0R);
    }

    public final AnonymousClass26B A05() {
        AnonymousClass26B A012 = this.A0X.A01();
        return A012 == null ? new AnonymousClass26B(Double.valueOf(2800.0d), Double.valueOf(-23.533773d), Double.valueOf(-46.62529d), (Double) null, (Double) null, (Double) null, "São Paulo", (String) null, "city_default") : A012;
    }

    public final void A06() {
        AnonymousClass027 r1 = this.A0Z.A00;
        if (r1.A01() == null) {
            this.A0W.A05(this.A0Y.A00());
            return;
        }
        Object A012 = r1.A01();
        C18450wi.A0F(A012);
        C18450wi.A0B(A012);
        A0H((List) A012);
    }

    public final void A07() {
        C17210ui r2 = this.A0U;
        C29151a7 r1 = new C29151a7();
        r1.A07 = 2;
        r2.A06(r1);
        C57832ry r0 = this.A07;
        if (r0 != null) {
            A0D(r0);
            return;
        }
        C57822rx r02 = this.A08;
        if (r02 != null) {
            A0F(r02);
        } else {
            this.A0f.A0B(9);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        r2 = X.AnonymousClass0T2.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
        r2 = X.AnonymousClass0T2.A01(r2, 15.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005e, code lost:
        r3.A0B(new X.C49812Vy(r2, 1000));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r7 = this;
            java.util.Set r0 = r7.A0F
            boolean r0 = r0.isEmpty()
            r6 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0068
            X.0ui r1 = r7.A0U
            r0 = 6
            r1.A00(r0)
            r0 = 0
            r7.A0K = r0
            X.1Ko r1 = r7.A0X
            X.26B r0 = r1.A01()
            if (r0 == 0) goto L_0x0083
            X.26B r1 = r1.A01()
            if (r1 == 0) goto L_0x0068
            int r0 = r1.A00()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A0A = r0
            r7.A0J = r6
            java.lang.String r6 = r1.A08
            r7.A0B = r6
            X.1cy r3 = r7.A0e
            java.lang.Double r0 = r1.A03
            X.C18450wi.A0F(r0)
            X.C18450wi.A0B(r0)
            double r4 = r0.doubleValue()
            java.lang.Double r0 = r1.A04
            X.C18450wi.A0F(r0)
            X.C18450wi.A0B(r0)
            double r0 = r0.doubleValue()
            X.020 r2 = new X.020
            r2.<init>(r4, r0)
            int r0 = r6.hashCode()
            r1 = 1098383360(0x41780000, float:15.5)
            switch(r0) {
                case -1178371219: goto L_0x0069;
                case -1081415738: goto L_0x0074;
                default: goto L_0x005a;
            }
        L_0x005a:
            X.076 r2 = X.AnonymousClass0T2.A01(r2, r1)
        L_0x005e:
            r1 = 1000(0x3e8, float:1.401E-42)
            X.2Vy r0 = new X.2Vy
            r0.<init>(r2, r1)
            r3.A0B(r0)
        L_0x0068:
            return
        L_0x0069:
            java.lang.String r0 = "city_default"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 1093664768(0x41300000, float:11.0)
            goto L_0x007e
        L_0x0074:
            java.lang.String r0 = "manual"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 1092616192(0x41200000, float:10.0)
        L_0x007e:
            X.076 r2 = X.AnonymousClass0T2.A01(r2, r0)
            goto L_0x005e
        L_0x0083:
            r4 = -4599168823961265218(0xc02c785271bcdbbe, double:-14.235004)
            r2 = -4590867386055929270(0xc049f66f9335d24a, double:-51.92528)
            X.020 r1 = new X.020
            r1.<init>(r4, r2)
            r0 = 1082130432(0x40800000, float:4.0)
            X.076 r3 = X.AnonymousClass0T2.A01(r1, r0)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A0A = r0
            r7.A0J = r6
            java.lang.String r0 = "country_default"
            r7.A0B = r0
            X.1cy r2 = r7.A0e
            r1 = 100
            X.2Vy r0 = new X.2Vy
            r0.<init>(r3, r1)
            r2.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass269.A08():void");
    }

    public final void A09() {
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            AnonymousClass0IS r3 = (AnonymousClass0IS) it.next();
            List list = (List) this.A0P.A01();
            if (list != null) {
                Object obj = r3.A0K;
                if (obj != null) {
                    list.remove(obj);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.obwhatsapp.businessdirectory.viewmodel.MarkerData");
                }
            }
            Set set = this.A0H;
            Object obj2 = r3.A0K;
            if (obj2 != null) {
                set.remove(((C93714je) obj2).A02);
                r3.A06();
                it.remove();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.obwhatsapp.businessdirectory.viewmodel.MarkerData");
            }
        }
    }

    public final void A0A() {
        AnonymousClass0YG r2 = this.A02;
        if (r2 != null) {
            this.A0O.A0B(2);
            AnonymousClass020 r0 = r2.A03;
            LatLng latLng = new LatLng(r0.A00, r0.A01);
            this.A0B = "map_view";
            this.A0V.A01(latLng, this, "", "map_view", 0.0f);
        }
    }

    public final void A0B(C06540Wn r12, AnonymousClass0YG r13) {
        this.A01 = r12;
        this.A04 = r12.A06().A04;
        this.A02 = r13;
        if (this.A0J) {
            this.A03 = r13;
            this.A0O.A0B(2);
            AnonymousClass399 r5 = this.A0V;
            AnonymousClass020 r0 = r13.A03;
            LatLng latLng = new LatLng(r0.A00, r0.A01);
            String str = this.A0B;
            if (str == null) {
                str = "manual";
            }
            r5.A01(latLng, this, "", str, 0.0f);
            this.A0J = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f9, code lost:
        if (r0 >= 0) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.C06540Wn r10, X.AnonymousClass0YG r11) {
        /*
            r9 = this;
            r3 = 0
            X.C18450wi.A0H(r11, r3)
            r1 = 1
            X.0YG r2 = r9.A02
            if (r2 == 0) goto L_0x0017
            int r0 = r9.A00
            if (r0 != r1) goto L_0x0017
            float r1 = r11.A02
            float r0 = r2.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            r9.A0I = r3
        L_0x0017:
            r9.A01 = r10
            X.0RX r0 = r10.A06()
            X.0YH r0 = r0.A04
            r9.A04 = r0
            r9.A02 = r11
            X.0YG r2 = r9.A03
            if (r2 != 0) goto L_0x002a
            r9.A03 = r11
        L_0x0029:
            return
        L_0x002a:
            float r0 = r2.A02
            float r1 = r11.A02
            float r0 = r0 - r1
            float r8 = java.lang.Math.abs(r0)
            boolean r0 = r9.A0J
            r7 = 3
            if (r0 != 0) goto L_0x0124
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fb
            X.020 r2 = r2.A03
            X.020 r0 = r11.A03
            double r4 = r2.A00
            double r2 = r2.A01
            com.google.android.gms.maps.model.LatLng r6 = new com.google.android.gms.maps.model.LatLng
            r6.<init>(r4, r2)
            double r4 = r0.A00
            double r2 = r0.A01
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r4, r2)
            float r4 = X.C61853Aq.A00(r6, r0)
            r3 = 1097859072(0x41700000, float:15.0)
            r0 = 1101529088(0x41a80000, float:21.0)
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00f9
            r0 = 1101004800(0x41a00000, float:20.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1106247680(0x41f00000, float:30.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1100480512(0x41980000, float:19.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1117126656(0x42960000, float:75.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1099956224(0x41900000, float:18.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1125515264(0x43160000, float:150.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1099431936(0x41880000, float:17.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1132068864(0x437a0000, float:250.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1142292480(0x44160000, float:600.0)
            if (r0 >= 0) goto L_0x00f7
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1150681088(0x44960000, float:1200.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1096810496(0x41600000, float:14.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1158660096(0x450fc000, float:2300.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1095761920(0x41500000, float:13.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1166843904(0x458ca000, float:4500.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1094713344(0x41400000, float:12.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1175232512(0x460ca000, float:9000.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1093664768(0x41300000, float:11.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1184133120(0x46947000, float:19000.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1192521728(0x47147000, float:38000.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1091567616(0x41100000, float:9.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1200910336(0x47947000, float:76000.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1209170944(0x48127c00, float:150000.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1088421888(0x40e00000, float:7.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1217559552(0x48927c00, float:300000.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1086324736(0x40c00000, float:6.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1225948160(0x49127c00, float:600000.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1233536768(0x49864700, float:1100000.0)
            if (r0 >= 0) goto L_0x00f7
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1249125376(0x4a742400, float:4000000.0)
            if (r0 < 0) goto L_0x00f7
            r2 = 1241925376(0x4a064700, float:2200000.0)
        L_0x00f7:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
        L_0x00f9:
            if (r0 < 0) goto L_0x0124
        L_0x00fb:
            X.0ui r2 = r9.A0U
            r0 = 78
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1a7 r0 = new X.1a7
            r0.<init>()
            r0.A0B = r1
            r2.A06(r0)
            X.027 r1 = r9.A0O
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A0B(r0)
            r9.A03 = r11
            X.0uf r0 = r9.A0T
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0029
            r9.A0A()
            return
        L_0x0124:
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            X.027 r1 = r9.A0O
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass269.A0C(X.0Wn, X.0YG):void");
    }

    public final void A0D(C57832ry r3) {
        if (r3 != null) {
            r3.A07(0.0f);
            r3.A04.A01 = false;
            r3.A0E();
            this.A07 = null;
            this.A0c.A0B((Object) null);
        }
    }

    public final void A0E(C57832ry r3, List list) {
        List list2 = (List) this.A0P.A01();
        if (list2 != null) {
            list2.remove(r3.A04);
        }
        AnonymousClass1US r0 = r3.A04.A03;
        if (r0 != null) {
            list.add(r0);
            this.A0D.remove(r0.A0B);
        }
        r3.A06();
    }

    public final void A0F(C57822rx r3) {
        if (r3 != null) {
            r3.A07(0.0f);
            r3.A0C.A01 = false;
            this.A08 = null;
            this.A0c.A0B((Object) null);
        }
    }

    public final void A0G(AnonymousClass1US r6) {
        LatLng latLng;
        AnonymousClass4KG r0 = this.A06;
        if (r0 == null) {
            latLng = null;
        } else {
            LatLng latLng2 = r0.A01;
            latLng = new LatLng(latLng2.A00, latLng2.A01);
        }
        this.A0U.A09(this.A0A, 17);
        this.A0c.A0B(new C87034Vc(latLng, r6));
    }

    public final void A0H(List list) {
        boolean equals;
        AnonymousClass027 r6 = this.A0N;
        ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C73563oM r3 = (C73563oM) it.next();
            C73563oM r0 = this.A09;
            String str = null;
            if (r0 != null) {
                str = r0.A00;
            }
            String str2 = r3.A00;
            if (str == null) {
                equals = false;
                if (str2 == null) {
                    equals = true;
                }
            } else {
                equals = str.equals(str2);
            }
            arrayList.add(new C87234Vy(this.A0a, r3, equals));
        }
        r6.A0B(arrayList);
    }

    public final void A0I(boolean z2) {
        C30801cy r1;
        int i2;
        if (Build.VERSION.SDK_INT >= 31) {
            C16260sj r12 = this.A0b;
            if (r12.A05() && r12.A03("android.permission.ACCESS_FINE_LOCATION") != 0) {
                r1 = this.A0f;
                i2 = 8;
                r1.A0B(Integer.valueOf(i2));
            }
        }
        r1 = this.A0f;
        i2 = 1;
        if (z2) {
            i2 = 3;
        }
        r1.A0B(Integer.valueOf(i2));
    }

    public final void A0J(boolean z2) {
        Iterator it = this.A0G.iterator();
        while (it.hasNext()) {
            C57822rx r2 = (C57822rx) it.next();
            if (z2 || !C18450wi.A0R(r2, this.A08)) {
                List list = (List) this.A0P.A01();
                if (list != null) {
                    list.remove(r2.A0C);
                }
                this.A0D.remove(r2.A0D.A0B);
                r2.A06();
                it.remove();
            }
        }
    }

    public final void A0K(boolean z2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            C57832ry r1 = (C57832ry) it.next();
            if (z2 || !C18450wi.A0R(r1, this.A07)) {
                A0E(r1, arrayList);
                it.remove();
            }
        }
        this.A0d.A0B(arrayList);
    }

    public final boolean A0L() {
        AnonymousClass1I2 r3 = this.A0X.A01.A02;
        return r3.A00().getBoolean("show_request_permission_dialog", true) || !r3.A00().getBoolean("location_access_granted", false) || !this.A0b.A05();
    }

    public final boolean A0M(AnonymousClass1US r3) {
        Map map = this.A0D;
        String str = r3.A0B;
        if (map.containsKey(str)) {
            return false;
        }
        C57832ry r0 = this.A07;
        if (r0 != null) {
            AnonymousClass1US r02 = r0.A04.A03;
            if (C18450wi.A0R(r02 == null ? null : r02.A0B, str)) {
                return false;
            }
        }
        C57822rx r03 = this.A08;
        return r03 == null || !C18450wi.A0R(r03.A0D.A0B, str);
    }

    public void ASB(int i2) {
        this.A0U.A0A(this.A0A, 28, 1);
        this.A0K = false;
        this.A0O.A0B(0);
        this.A0M.A0B(0);
    }

    public void ASC(AnonymousClass26B r17) {
        double d2;
        C06540Wn r10;
        AnonymousClass26B r6 = r17;
        C18450wi.A0H(r6, 0);
        AnonymousClass0YG r7 = this.A02;
        if (r7 != null) {
            this.A0O.A0B(2);
            AnonymousClass0YG r0 = this.A02;
            if (r0 == null || (r10 = this.A01) == null) {
                d2 = 0.0d;
            } else {
                Location location = new Location("");
                AnonymousClass020 r2 = r0.A03;
                location.setLatitude(r2.A00);
                location.setLongitude(r2.A01);
                Location location2 = new Location("");
                double d3 = (double) 2;
                location2.setLatitude((r10.A06().A02.A00 + r10.A06().A03.A00) / d3);
                location2.setLongitude((r10.A06().A02.A01 + r10.A06().A03.A01) / d3);
                d2 = (double) location.distanceTo(location2);
            }
            Double d4 = r6.A05;
            C18450wi.A0F(d4);
            C18450wi.A0B(d4);
            double max = Math.max(d2, d4.doubleValue());
            AnonymousClass2Z2 r02 = this.A0W;
            int i2 = (int) r7.A02;
            C73563oM r1 = this.A09;
            String str = r1 == null ? null : r1.A00;
            AnonymousClass26B r62 = new AnonymousClass26B(Double.valueOf(max), r6.A03, r6.A04, r6.A01, r6.A02, r6.A00, r6.A07, (String) null, r6.A08);
            r02.A01();
            C62883Fh r72 = new C62883Fh(r02);
            r02.A05 = r72;
            C59752yt A79 = r02.A0L.A79(r62, r72, r02.A0O.A00, str, i2);
            A79.A04();
            r02.A00 = A79;
        }
    }
}

package X;

import com.facebook.redex.IDxObjectShape261S0100000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape16S0100000_I1_1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.3FH  reason: invalid class name */
public class AnonymousClass3FH implements C109215Rd, C109195Rb {
    public AnonymousClass260 A00;
    public List A01;
    public List A02 = null;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final AnonymousClass027 A06 = C13690nt.A0O();
    public final C17180uf A07;
    public final C25591Kj A08;
    public final AnonymousClass4P1 A09;
    public final C108665Ow A0A;
    public final C108675Ox A0B;
    public final C108685Oy A0C;
    public final C108695Oz A0D;
    public final C88204a7 A0E;
    public final C85894Qk A0F;
    public final AnonymousClass4DN A0G;
    public final C616239q A0H;
    public final C29101a2 A0I;
    public final C29111a3 A0J;
    public final String A0K;
    public final AnonymousClass1DU A0L;
    public final boolean A0M;

    public AnonymousClass3FH(C17180uf r3, C25601Kk r4, C108665Ow r5, C108675Ox r6, C108685Oy r7, C108695Oz r8, C88204a7 r9, C85894Qk r10, AnonymousClass4DN r11, C616239q r12, C29101a2 r13, C29111a3 r14, int i2) {
        this.A05 = i2;
        this.A07 = r3;
        this.A0H = r12;
        this.A0B = r6;
        this.A0C = r7;
        this.A0A = r5;
        this.A0D = r8;
        this.A0E = r9;
        this.A0F = r10;
        r10.A00.A07 = this;
        this.A0I = r13;
        this.A0J = r14;
        this.A0G = r11;
        this.A09 = new AnonymousClass4P1();
        this.A08 = r4.A00;
        this.A0K = Long.toHexString(new Random().nextLong());
        this.A0M = r3.A05();
        this.A0L = new IDxObjectShape261S0100000_2_I1(r14, 0);
    }

    public static final List A00(String str, List list) {
        List<AnonymousClass1US> list2 = list;
        C18450wi.A0H(list2, 0);
        ArrayList A0N = AnonymousClass1J9.A0N(list2);
        for (AnonymousClass1US r13 : list2) {
            if (C18450wi.A0R(str, r13.A03)) {
                boolean z2 = r13.A0L;
                boolean z3 = r13.A0K;
                String str2 = r13.A0B;
                String str3 = r13.A0A;
                String str4 = r13.A0F;
                Double d2 = r13.A08;
                Double d3 = r13.A09;
                Double valueOf = Double.valueOf(r13.A00);
                String str5 = r13.A0E;
                List list3 = r13.A0H;
                String str6 = r13.A0C;
                int i2 = r13.A05;
                Double d4 = r13.A07;
                String str7 = r13.A0D;
                Double d5 = r13.A02;
                int i3 = r13.A06;
                boolean z4 = z2;
                boolean z5 = z3;
                String str8 = str2;
                String str9 = str3;
                String str10 = str4;
                String str11 = str5;
                String str12 = str6;
                String str13 = str7;
                Double d6 = d2;
                Double d7 = d3;
                Double d8 = d4;
                Double d9 = d5;
                r13 = new AnonymousClass1US(d6, d7, valueOf, d8, d9, str8, str9, str10, str11, str12, str13, list3, r13.A0I, r13.A0J, r13.A0G, i2, i3, z4, z5);
                r13.A01 = 2;
            }
            A0N.add(r13);
        }
        return A0N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r6.A04() == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C72243ln A01(X.AnonymousClass26B r11, java.util.List r12, int r13) {
        /*
            r10 = this;
            java.lang.Object r6 = r12.get(r13)
            X.1US r6 = (X.AnonymousClass1US) r6
            java.lang.String r1 = r11.A08
            java.lang.String r0 = "country_default"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0047
            com.google.android.gms.maps.model.LatLng r2 = X.C15710ri.A01(r11)
        L_0x0014:
            int r1 = r13 + 1
            int r7 = r11.A00()
            boolean r0 = r11.A02()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r6.A04()
            r8 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            boolean r9 = r10.A0M
            X.4wS r3 = new X.4wS
            r3.<init>(r10, r6, r1)
            X.4wU r4 = new X.4wU
            r4.<init>(r10)
            X.4wX r5 = new X.4wX
            r5.<init>(r10, r6, r1)
            X.3ln r1 = new X.3ln
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            X.5Oy r0 = r10.A0C
            java.lang.String r0 = r0.AFs()
            r1.A00 = r0
            return r1
        L_0x0047:
            r2 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FH.A01(X.26B, java.util.List, int):X.3ln");
    }

    public List A02() {
        if (this.A02 == null) {
            return null;
        }
        ArrayList A0u = AnonymousClass000.A0u();
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            AnonymousClass1US r2 = (AnonymousClass1US) this.A02.get(i2);
            String str = r2.A0D;
            if (str != null) {
                C75513sH r4 = new C75513sH();
                r4.A02 = C13680ns.A0a();
                r4.A05 = str;
                r4.A01 = Double.valueOf(r2.A00);
                r4.A00 = r2.A02;
                r4.A04 = Long.valueOf(((long) i2) + 1);
                r4.A06 = this.A0K;
                r4.A03 = Integer.valueOf(this.A0D.AH4());
                A0u.add(r4);
            }
        }
        this.A02 = null;
        return A0u;
    }

    public final List A03() {
        ArrayList A0u = AnonymousClass000.A0u();
        if (this.A05 != 0) {
            C108675Ox r1 = this.A0B;
            if (r1.AFl() != null && r1.AFl().A08.equals("country_default")) {
                A0u.add(new C72193li(this.A0J, this.A0C.AFs()));
                return A0u;
            }
        }
        A0u.add(new C72163lf((String) null));
        return A0u;
    }

    public void A04() {
        boolean AJM = this.A0A.AJM();
        AnonymousClass4P1 r1 = this.A09;
        if (!AJM) {
            r1.A02 = 7;
            r1.A00++;
        } else {
            r1.A02 = 9;
        }
        A05();
    }

    public void A05() {
        this.A06.A0B(this.A09);
    }

    public void A06() {
        AnonymousClass4P1 r3 = this.A09;
        List list = r3.A0B;
        if (!list.isEmpty()) {
            int size = list.size() - 1;
            if (list.get(size) instanceof C55272jC) {
                list.remove(size);
                r3.A02 = 2;
                A05();
            }
        }
    }

    public final void A07() {
        ArrayList A0u = AnonymousClass000.A0u();
        AnonymousClass26B AFl = this.A0B.AFl();
        if (AFl != null) {
            AnonymousClass4P1 r4 = this.A09;
            C87314Wg r1 = r4.A04;
            AnonymousClass00B.A07(r1, "BusinessListItemDelegate/addNextBusinessProfilesPage Current search results cannot be null");
            List list = r1.A07;
            int size = list.size();
            if (this.A05 == 0) {
                C31301dt A022 = this.A0H.A02(this.A0I, r4.A04.A06);
                if (A022 != null) {
                    r4.A0B.add(A022);
                }
                List list2 = r4.A04.A04;
                A0A(AFl, list2, Math.min(2, list2.size()));
                if (!r4.A04.A07.isEmpty()) {
                    r4.A0B.add(new C72213lk(AFl, this.A0L, R.string.str01d2));
                }
            }
            for (int i2 = 0; i2 < size; i2++) {
                A0u.add(A01(AFl, list, i2));
                A0u.add(new C71883lD());
            }
            A0u.remove(A0u.size() - 1);
            List list3 = r4.A0B;
            list3.addAll(A0u);
            list3.addAll(A03());
            r4.A0A = true;
            r4.A02 = 2;
            A05();
        }
    }

    public final void A08() {
        C87314Wg r1;
        AnonymousClass4P1 r2 = this.A09;
        List list = r2.A0B;
        list.clear();
        AnonymousClass26B AFl = this.A0B.AFl();
        if (AFl != null && (r1 = r2.A04) != null) {
            if (this.A05 == 0) {
                C31301dt A022 = this.A0H.A02(this.A0I, r1.A06);
                if (A022 != null) {
                    list.add(A022);
                }
                List list2 = r2.A04.A04;
                A0A(AFl, list2, Math.min(2, list2.size()));
                if (list2.size() >= 2) {
                    list.add(new C71883lD());
                    list.add(new C71983lN(new ViewOnClickCListenerShape16S0100000_I1_1(this, 5), 1));
                }
                if (!r2.A04.A07.isEmpty()) {
                    list.add(new C72213lk(AFl, this.A0L, R.string.str01d2));
                }
            }
            for (int i2 = 0; i2 < r2.A04.A07.size(); i2++) {
                list.add(A01(AFl, r2.A04.A07, i2));
                list.add(new C71883lD());
            }
            if (!list.isEmpty()) {
                list.remove(C13700nu.A00(list, 1));
            }
            if (r2.A0A) {
                list.addAll(A03());
            } else {
                list.add(new C55272jC(0));
            }
            r2.A02 = 2;
            A05();
        }
    }

    public final void A09() {
        if (!this.A04) {
            AnonymousClass4P1 r2 = this.A09;
            C87314Wg r1 = r2.A04;
            if (r1 != null) {
                this.A02 = AnonymousClass000.A0u();
                this.A02.addAll(r2.A04.A07.subList(0, Math.min(r1.A07.size(), 10)));
                return;
            }
            return;
        }
        this.A02 = null;
    }

    public final void A0A(AnonymousClass26B r4, List list, int i2) {
        if (!list.isEmpty()) {
            List list2 = this.A09.A0B;
            list2.add(new C72183lh(2));
            for (int i3 = 0; i3 < i2; i3++) {
                list2.add(A01(r4, list, i3));
            }
        }
    }

    public final void A0B(C87314Wg r3) {
        String str;
        if (this.A07.A05() && (str = r3.A03) != null && !str.isEmpty() && !r3.A07.isEmpty()) {
            this.A0F.A00(str);
        }
    }

    public void A0C(String str) {
        AnonymousClass4P1 r4 = this.A09;
        r4.A04 = null;
        r4.A0A = false;
        r4.A00 = 0;
        r4.A09 = str;
        r4.A03 = new AnonymousClass4HF(150, (String) null);
        r4.A02 = 0;
        r4.A0B.clear();
        C88204a7 r2 = this.A0E;
        AnonymousClass260 r1 = r2.A00;
        if (r1 != null) {
            r1.A00 = true;
            r2.A00 = null;
        }
        r2.A03.clear();
        r2.A01.clear();
        this.A01 = null;
        r4.A06 = null;
        AnonymousClass260 r12 = this.A00;
        if (r12 != null) {
            r12.A00 = true;
            this.A00 = null;
        }
        A05();
    }

    public void AMD(int i2, String str) {
        if (this.A0A.AJM()) {
            AnonymousClass4P1 r4 = this.A09;
            if (r4.A04 != null) {
                C88204a7 r3 = this.A0E;
                List list = r3.A03;
                List A002 = A00(str, list);
                list.clear();
                list.addAll(A002);
                List A003 = A00(str, r3.A01);
                r3.A01.clear();
                r3.A01.addAll(A003);
                List list2 = r4.A04.A07;
                list2.clear();
                list2.addAll(list);
                A08();
                return;
            }
            return;
        }
        AnonymousClass4P1 r2 = this.A09;
        C87314Wg r0 = r2.A04;
        if (r0 != null) {
            List A004 = A00(str, r0.A07);
            List list3 = r2.A04.A07;
            list3.clear();
            list3.addAll(A004);
            r2.A0B.clear();
            A07();
        }
    }

    public void AME(Map map) {
        C87014Va r0;
        if (this.A0A.AJM()) {
            AnonymousClass4P1 r3 = this.A09;
            if (r3.A04 != null) {
                C88204a7 r2 = this.A0E;
                List list = r2.A03;
                List A002 = C88204a7.A00(list, map);
                list.clear();
                list.addAll(A002);
                r2.A01 = C88204a7.A00(r2.A01, map);
                List list2 = r3.A04.A07;
                list2.clear();
                list2.addAll(A002);
                A08();
                return;
            }
            return;
        }
        AnonymousClass4P1 r5 = this.A09;
        C87314Wg r02 = r5.A04;
        if (r02 != null) {
            List<AnonymousClass1US> list3 = r02.A07;
            C18450wi.A0H(map, 1);
            ArrayList A0N = AnonymousClass1J9.A0N(list3);
            for (AnonymousClass1US r1 : list3) {
                if (!(r1.A01 == 1 || (r0 = (C87014Va) map.get(r1.A0B)) == null)) {
                    r1 = r1.A01(r0.A01);
                }
                A0N.add(r1);
            }
            List list4 = r5.A04.A07;
            list4.clear();
            list4.addAll(A0N);
            r5.A0B.clear();
            A07();
        }
    }

    public void ANp(int i2) {
        A06();
        AnonymousClass4P1 r1 = this.A09;
        r1.A01 = i2;
        r1.A02 = 8;
        A05();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c8, code lost:
        if (r14.A07.isEmpty() != false) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ANq(X.C87314Wg r14) {
        /*
            r13 = this;
            X.4P1 r1 = r13.A09
            X.4Wg r2 = r1.A04
            if (r2 != 0) goto L_0x000d
            X.4Qk r2 = r13.A0F
            X.2Z2 r2 = r2.A00
            r2.A00()
        L_0x000d:
            X.4Wg r2 = r1.A04
            if (r2 == 0) goto L_0x001e
            java.lang.String r3 = r2.A01
            if (r3 == 0) goto L_0x001e
            java.lang.String r2 = r14.A01
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001e
            return
        L_0x001e:
            boolean r2 = r13.A03
            X.5Ox r3 = r13.A0B
            if (r2 == 0) goto L_0x0038
            X.26B r4 = r3.AFl()
            java.util.List r3 = r14.A04
            int r2 = r3.size()
            r13.A0A(r4, r3, r2)
            r2 = 2
        L_0x0032:
            r1.A02 = r2
            r13.A05()
            return
        L_0x0038:
            X.26B r2 = r3.AFl()
            if (r2 == 0) goto L_0x00a8
            X.26B r2 = r3.AFl()
            java.lang.String r4 = r2.A08
            java.lang.String r2 = "device"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x005c
            java.lang.String r2 = "pin_on_map"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x005c
            java.lang.String r2 = "map_view"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00a8
        L_0x005c:
            java.util.List r2 = r14.A07
            X.26B r11 = r3.AFl()
            java.util.ListIterator r10 = r2.listIterator()
        L_0x0066:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00a8
            java.lang.Object r4 = r10.next()
            X.1US r4 = (X.AnonymousClass1US) r4
            boolean r2 = r4.A05()
            if (r2 == 0) goto L_0x0066
            java.util.List r2 = r4.A0G
            java.lang.Object r9 = X.C13690nt.A0Z(r2)
            X.1mC r9 = (X.C35601mC) r9
            java.lang.Double r2 = r9.A00
            double r6 = r2.doubleValue()
            java.lang.Double r2 = r9.A01
            double r4 = r2.doubleValue()
            com.google.android.gms.maps.model.LatLng r8 = new com.google.android.gms.maps.model.LatLng
            r8.<init>(r6, r4)
            com.google.android.gms.maps.model.LatLng r2 = X.C15710ri.A01(r11)
            float r4 = X.C61853Aq.A00(r8, r2)
            java.lang.Integer r2 = r9.A02
            int r2 = r2.intValue()
            float r2 = (float) r2
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0066
            r10.remove()
            goto L_0x0066
        L_0x00a8:
            X.5Ow r2 = r13.A0A
            boolean r2 = r2.AJM()
            if (r2 == 0) goto L_0x018c
            java.lang.String r6 = r14.A01
            r4 = 150(0x96, float:2.1E-43)
            X.4HF r2 = new X.4HF
            r2.<init>(r4, r6)
            r1.A03 = r2
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x00ca
            java.util.List r2 = r14.A07
            boolean r4 = r2.isEmpty()
            r2 = 0
            if (r4 == 0) goto L_0x00cb
        L_0x00ca:
            r2 = 1
        L_0x00cb:
            r1.A0A = r2
            X.4Wg r2 = r1.A04
            if (r2 != 0) goto L_0x010e
            r4 = r14
        L_0x00d2:
            r1.A04 = r4
            X.39q r2 = r13.A0H
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x0143
            java.util.List r11 = r13.A01
            if (r11 != 0) goto L_0x00e4
            java.util.ArrayList r11 = X.AnonymousClass000.A0u()
            r13.A01 = r11
        L_0x00e4:
            X.4DN r10 = r13.A0G
            java.util.List r2 = r14.A07
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()
            java.util.Iterator r12 = r2.iterator()
        L_0x00f0:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0122
            java.lang.Object r8 = r12.next()
            X.1US r8 = (X.AnonymousClass1US) r8
            double r6 = r8.A00
            double r4 = r10.A00
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x00f0
            r4 = 0
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f0
            r9.add(r8)
            goto L_0x00f0
        L_0x010e:
            java.util.List r10 = r2.A04
            java.util.List r9 = r14.A05
            java.util.List r11 = r14.A07
            java.util.List r12 = r14.A06
            java.lang.String r7 = r14.A03
            java.lang.Double r5 = r14.A00
            java.lang.String r8 = r14.A02
            X.4Wg r4 = new X.4Wg
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00d2
        L_0x0122:
            r11.addAll(r9)
            java.util.List r2 = r13.A01
            int r4 = r2.size()
            X.4a7 r2 = r13.A0E
            java.util.List r2 = r2.A01
            int r2 = r2.size()
            int r4 = r4 + r2
            r2 = 14
            if (r4 >= r2) goto L_0x0140
            boolean r2 = r1.A0A
            if (r2 != 0) goto L_0x0140
            r2 = 10
            goto L_0x0032
        L_0x0140:
            java.util.List r6 = r13.A01
            goto L_0x0145
        L_0x0143:
            java.util.List r6 = r14.A07
        L_0x0145:
            X.4Wg r2 = r1.A04
            X.4a7 r5 = r13.A0E
            X.26B r7 = r3.AFl()
            X.AnonymousClass00B.A06(r7)
            boolean r4 = r1.A0A
            int r1 = r13.A05
            r11 = 2
            if (r1 != 0) goto L_0x0158
            r11 = 1
        L_0x0158:
            X.4HG r3 = new X.4HG
            r3.<init>(r2, r13)
            java.lang.Double r9 = r2.A00
            java.util.List r1 = r5.A01
            java.util.ArrayList r10 = X.C13680ns.A0n(r1)
            r10.addAll(r6)
            java.util.List r1 = r5.A01
            r1.addAll(r6)
            X.260 r2 = r5.A00
            if (r2 == 0) goto L_0x0177
            r1 = 1
            r2.A00 = r1
            r1 = 0
            r5.A00 = r1
        L_0x0177:
            X.3FF r8 = new X.3FF
            r8.<init>(r3, r5, r10, r4)
            X.260 r6 = new X.260
            r6.<init>(r7, r8, r9, r10, r11)
            r5.A00 = r6
            X.1Kj r1 = r5.A02
            r1.AbJ(r6)
            r1 = 0
            r13.A01 = r1
            return
        L_0x018c:
            java.util.List r1 = r14.A07
            java.util.ArrayList r5 = X.C13680ns.A0n(r1)
            X.26B r2 = r3.AFl()
            X.AnonymousClass00B.A06(r2)
            int r1 = r13.A05
            r6 = 2
            if (r1 != 0) goto L_0x019f
            r6 = 1
        L_0x019f:
            java.lang.Double r4 = r14.A00
            r1 = 1
            com.facebook.redex.IDxRCallbackShape41S0300000_2_I1 r3 = new com.facebook.redex.IDxRCallbackShape41S0300000_2_I1
            r3.<init>(r14, r13, r5, r1)
            X.260 r1 = new X.260
            r1.<init>(r2, r3, r4, r5, r6)
            r13.A00 = r1
            X.1Kj r0 = r13.A08
            r0.AbJ(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FH.ANq(X.4Wg):void");
    }
}

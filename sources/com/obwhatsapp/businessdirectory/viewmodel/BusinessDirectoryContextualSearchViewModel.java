package com.obwhatsapp.businessdirectory.viewmodel;

import X.AnonymousClass00B;
import X.AnonymousClass026;
import X.AnonymousClass027;
import X.AnonymousClass028;
import X.AnonymousClass02H;
import X.AnonymousClass1DU;
import X.AnonymousClass1PS;
import X.AnonymousClass1US;
import X.AnonymousClass1W4;
import X.AnonymousClass26A;
import X.AnonymousClass26B;
import X.AnonymousClass2RC;
import X.AnonymousClass2Z2;
import X.AnonymousClass3F7;
import X.AnonymousClass3FH;
import X.AnonymousClass49L;
import X.AnonymousClass4HF;
import X.AnonymousClass4HJ;
import X.AnonymousClass4HM;
import X.AnonymousClass4HN;
import X.AnonymousClass4P1;
import X.AnonymousClass4Q8;
import X.AnonymousClass4R9;
import X.AnonymousClass5P2;
import X.AnonymousClass5P3;
import X.C016407u;
import X.C100824wG;
import X.C100844wI;
import X.C100864wK;
import X.C100884wM;
import X.C100904wO;
import X.C108655Ov;
import X.C14710pd;
import X.C14870pt;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16440t3;
import X.C16620tM;
import X.C17180uf;
import X.C17210ui;
import X.C18170wG;
import X.C18450wi;
import X.C25531Kd;
import X.C25641Ko;
import X.C29091a1;
import X.C29101a2;
import X.C29111a3;
import X.C29121a4;
import X.C29131a5;
import X.C29141a6;
import X.C29151a7;
import X.C30801cy;
import X.C31241dn;
import X.C31261dp;
import X.C31291ds;
import X.C35631mF;
import X.C35641mG;
import X.C35651mH;
import X.C450626x;
import X.C616239q;
import X.C71953lK;
import X.C72023lR;
import X.C72053lU;
import X.C72083lX;
import X.C72103lZ;
import X.C72163lf;
import X.C72183lh;
import X.C72203lj;
import X.C74053pf;
import X.C74633qr;
import X.C84784Lw;
import X.C87124Vm;
import X.C87314Wg;
import android.app.Application;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.redex.IDxCListenerShape105S0200000_2_I0;
import com.facebook.redex.IDxObjectShape260S0100000_2_I0;
import com.facebook.redex.IDxObjectShape331S0100000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BusinessDirectoryContextualSearchViewModel extends AnonymousClass02H implements C29091a1, C29101a2, C29111a3, C29121a4, C29131a5, C29141a6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C31241dn A05;
    public Runnable A06;
    public Runnable A07;
    public LinkedList A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final AnonymousClass028 A0E;
    public final AnonymousClass026 A0F;
    public final AnonymousClass026 A0G;
    public final AnonymousClass027 A0H;
    public final AnonymousClass027 A0I;
    public final C016407u A0J;
    public final C14870pt A0K;
    public final C17180uf A0L;
    public final C25531Kd A0M;
    public final C17210ui A0N;
    public final AnonymousClass2Z2 A0O;
    public final C25641Ko A0P;
    public final C18170wG A0Q;
    public final AnonymousClass1PS A0R;
    public final AnonymousClass4Q8 A0S;
    public final AnonymousClass3FH A0T;
    public final C450626x A0U;
    public final C616239q A0V;
    public final AnonymousClass4HM A0W;
    public final AnonymousClass3F7 A0X;
    public final C16440t3 A0Y;
    public final C30801cy A0Z;
    public final C30801cy A0a;
    public final C30801cy A0b;
    public final C30801cy A0c;
    public final C30801cy A0d = new C30801cy();
    public final LinkedList A0e;
    public final AnonymousClass1DU A0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessDirectoryContextualSearchViewModel(Application application, C016407u r19, C14870pt r20, C17180uf r21, C25531Kd r22, C17210ui r23, AnonymousClass2Z2 r24, C25641Ko r25, C18170wG r26, AnonymousClass1PS r27, AnonymousClass4Q8 r28, C108655Ov r29, C450626x r30, AnonymousClass5P2 r31, AnonymousClass4HM r32, AnonymousClass5P3 r33, C16440t3 r34) {
        super(application);
        AnonymousClass026 r7 = new AnonymousClass026();
        this.A0G = r7;
        this.A0c = new C30801cy();
        this.A0Z = new C30801cy();
        this.A0a = new C30801cy();
        AnonymousClass026 r4 = new AnonymousClass026();
        this.A0F = r4;
        this.A06 = new RunnableRunnableShape4S0100000_I0_3(this, 34);
        this.A0f = new IDxObjectShape260S0100000_2_I0(this, 0);
        this.A0Y = r34;
        this.A0K = r20;
        C016407u r8 = r19;
        this.A0J = r8;
        this.A0D = new Handler();
        this.A0e = new LinkedList();
        this.A0L = r21;
        this.A0C = new Handler();
        this.A0S = r28;
        C450626x r3 = r30;
        this.A0U = r3;
        this.A0b = new C30801cy();
        AnonymousClass2Z2 r1 = r24;
        this.A0O = r1;
        this.A0M = r22;
        this.A0P = r25;
        this.A0R = r27;
        this.A0Q = r26;
        this.A0N = r23;
        r1.A0D = this;
        boolean z2 = false;
        this.A04 = 0;
        C616239q A6w = r31.A6w(new C100904wO(this));
        this.A0V = A6w;
        this.A08 = new LinkedList();
        Map map = r8.A03;
        if (map.get("business_search_queries") != null) {
            this.A08.addAll((Collection) map.get("business_search_queries"));
        }
        this.A09 = map.get("saved_search_session_started") != null ? ((Boolean) map.get("saved_search_session_started")).booleanValue() : z2;
        A6w.A06(r8);
        AnonymousClass3FH A78 = r29.A78(new C100824wG(this), new C100844wI(this), new C100864wK(), new C100884wM(this), A6w, this, this, 0);
        this.A0T = A78;
        AnonymousClass3F7 A6x = r33.A6x(this, this);
        this.A0X = A6x;
        AnonymousClass4HM r82 = r32;
        this.A0W = r82;
        AnonymousClass027 r2 = r82.A00;
        this.A0E = r2;
        this.A0A = true;
        r1.A0B = r82;
        r7.A0D(r2, new IDxObserverShape113S0100000_1_I0(this, 21));
        r7.A0D(A78.A06, new IDxObserverShape113S0100000_1_I0(this, 20));
        AnonymousClass26A r6 = A6x.A00;
        r7.A0D(r6, new IDxObserverShape113S0100000_1_I0(this, 19));
        this.A0H = r3.A02;
        this.A0I = r3.A01;
        r4.A0D(r3.A00, new IDxObserverShape115S0100000_2_I0((Object) this, 65));
        r4.A0D(r6, new IDxObserverShape113S0100000_1_I0(this, 19));
        C17210ui r42 = r3.A03;
        Integer A022 = r3.A05.A02();
        C29151a7 r210 = new C29151a7();
        r210.A0B = 47;
        r210.A0Q = null;
        r210.A0U = null;
        r210.A0N = 1L;
        r210.A06 = A022;
        r42.A06(r210);
    }

    public void A04() {
        AnonymousClass2Z2 r0 = this.A0T.A0F.A00;
        r0.A00();
        r0.A07 = null;
        AnonymousClass2Z2 r02 = this.A0O;
        r02.A0D = null;
        r02.A0B = null;
    }

    public final int A05(String str) {
        C14710pd r2 = this.A0L.A02;
        C16620tM r1 = C16620tM.A02;
        if (r2.A0E(r1, 450) && r2.A0E(r1, 2762) && str.length() >= 2) {
            C616239q r12 = this.A0V;
            return (!r12.A08() || r12.A02) ? 1 : 0;
        }
    }

    public final AnonymousClass26B A06() {
        AnonymousClass26B A002 = this.A0P.A00();
        return A002 == null ? this.A0Q.A00() : A002;
    }

    public final String A07() {
        AnonymousClass4P1 r0 = (AnonymousClass4P1) this.A0T.A06.A01();
        if (r0 != null) {
            return r0.A09;
        }
        return null;
    }

    public final List A08() {
        AnonymousClass4P1 r2 = (AnonymousClass4P1) this.A0T.A06.A01();
        if (A0R() && r2 != null && this.A04 == 1) {
            List list = r2.A0B;
            if (!list.isEmpty()) {
                return list;
            }
        }
        return new ArrayList();
    }

    public final List A09() {
        C31241dn r0;
        ArrayList arrayList = new ArrayList();
        if (!(this.A0X.A00.A01() == null || (r0 = this.A05) == null)) {
            arrayList.add(new C31291ds(new C31261dp(this), r0.A01));
        }
        return arrayList;
    }

    public final List A0A(C87124Vm r6, String str) {
        ArrayList arrayList = new ArrayList();
        C14710pd r2 = this.A0L.A02;
        C16620tM r1 = C16620tM.A02;
        if (!r2.A0E(r1, 450) || !r2.A0E(r1, 2440) || r6 == null) {
            arrayList.add(new C72083lX(this, str, 0));
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C72163lf(str));
        List list = r6.A01;
        if (list != null && !list.isEmpty()) {
            arrayList2.add(new C72203lj(list, new IDxObjectShape331S0100000_2_I0(this, 0)));
        }
        AnonymousClass028 r22 = this.A0E;
        if (r22.A01() != null && !((C84784Lw) r22.A01()).A03.isEmpty()) {
            arrayList2.add(new C72183lh(0));
            arrayList2.addAll(((C84784Lw) r22.A01()).A03);
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0056, code lost:
        if (r15.A04() == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0B(java.lang.String r27, java.util.List r28, int r29, boolean r30) {
        /*
            r26 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7 = r28
            java.util.Iterator r9 = r7.iterator()
        L_0x000b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r15 = r9.next()
            X.1US r15 = (X.AnonymousClass1US) r15
            r6 = r26
            X.26B r8 = r6.A06()
            int r24 = r7.size()
            int r5 = r7.indexOf(r15)
            java.lang.String r1 = r8.A08
            java.lang.String r0 = "country_default"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008a
            java.lang.Double r0 = r8.A03
            X.AnonymousClass00B.A06(r0)
            double r2 = r0.doubleValue()
            java.lang.Double r0 = r8.A04
            X.AnonymousClass00B.A06(r0)
            double r0 = r0.doubleValue()
            com.google.android.gms.maps.model.LatLng r11 = new com.google.android.gms.maps.model.LatLng
            r11.<init>(r2, r0)
        L_0x0046:
            int r16 = r8.A00()
            boolean r0 = r8.A02()
            if (r0 == 0) goto L_0x0058
            boolean r0 = r15.A04()
            r17 = 1
            if (r0 != 0) goto L_0x005a
        L_0x0058:
            r17 = 0
        L_0x005a:
            r18 = 0
            X.4wT r12 = new X.4wT
            r22 = r27
            r23 = r29
            r19 = r12
            r20 = r6
            r21 = r15
            r25 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25)
            X.4wV r13 = new X.4wV
            r13.<init>(r6)
            X.4wY r14 = new X.4wY
            r14.<init>(r6, r15, r5)
            X.3ln r10 = new X.3ln
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r4.add(r10)
            if (r30 == 0) goto L_0x000b
            X.3lD r0 = new X.3lD
            r0.<init>()
            r4.add(r0)
            goto L_0x000b
        L_0x008a:
            r11 = 0
            goto L_0x0046
        L_0x008c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0B(java.lang.String, java.util.List, int, boolean):java.util.List");
    }

    public void A0C() {
        AnonymousClass4P1 r1;
        AnonymousClass4HF r5;
        if (A0R()) {
            AnonymousClass3FH r2 = this.A0T;
            AnonymousClass027 r3 = r2.A06;
            AnonymousClass4P1 r0 = (AnonymousClass4P1) r3.A01();
            if ((r0 == null || r0.A02 != 9) && this.A04 == 1 && (r1 = (AnonymousClass4P1) r3.A01()) != null && r1.A09 != null) {
                r2.A04();
                AnonymousClass2Z2 r4 = this.A0O;
                String str = r1.A09;
                int i2 = this.A04;
                AnonymousClass26B A062 = A06();
                if (A0R()) {
                    AnonymousClass4P1 r02 = (AnonymousClass4P1) r3.A01();
                    r5 = r02 != null ? r02.A03 : new AnonymousClass4HF(150, (String) null);
                } else {
                    r5 = null;
                }
                r4.A04(r5, (AnonymousClass4R9) null, A062, str, r2.A0K, i2, 1);
            }
        }
    }

    public void A0D() {
        C17210ui r8 = this.A0N;
        C616239q r1 = this.A0V;
        Boolean valueOf = r1.A06.AIq() ? Boolean.valueOf(r1.A02) : null;
        String str = r1.A03 ? "has_catalog" : null;
        String str2 = r1.A04 ? "open_now" : null;
        Integer A022 = this.A0P.A02();
        String A042 = r1.A04();
        C29151a7 r12 = new C29151a7();
        r12.A0B = 63;
        r12.A06 = A022;
        r12.A0X = str;
        r12.A00 = valueOf;
        r12.A0Y = str2;
        r12.A0D = 1;
        r12.A0Z = A042;
        r8.A07(r12);
    }

    public final void A0E() {
        synchronized (this.A0e) {
            C17210ui r5 = this.A0N;
            LinkedList linkedList = this.A08;
            String str = this.A0T.A0K;
            C14710pd r6 = r5.A03.A02;
            C16620tM r1 = C16620tM.A02;
            if (r6.A0E(r1, 450) && r6.A0E(r1, 1521) && linkedList != null && !linkedList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(linkedList);
                JSONArray jSONArray = new JSONArray();
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (AnonymousClass49L.A00.matcher(str2).find()) {
                            str2 = "number_sequence";
                        } else if (str2.length() > 30) {
                            str2 = str2.substring(0, 30);
                            jSONObject.put("long_query_string", true);
                        }
                        jSONObject.put("query_content", str2);
                    } catch (JSONException unused) {
                        Log.e("DirectorySearchQueryAnalyticsUtil/getJsonArray: Query JSON mapping failed");
                    }
                    jSONArray.put(jSONObject);
                }
                C74633qr r12 = new C74633qr();
                r12.A00 = jSONArray.toString();
                r12.A01 = str;
                r5.A04.A06(r12);
            }
            linkedList.clear();
        }
    }

    public final void A0F() {
        if (!A0S()) {
            ArrayList arrayList = new ArrayList();
            A0Q(arrayList);
            AnonymousClass26A r1 = this.A0X.A00;
            AnonymousClass26B r0 = r1.A01;
            int i2 = r1.A00;
            if (r0 != null && (i2 == 2 || i2 == 0 || i2 == 7)) {
                C31241dn r02 = this.A05;
                if (r02 != null) {
                    arrayList.add(new C31291ds(new C31261dp(this), r02.A01));
                }
                A0P(arrayList);
            }
            this.A0F.A09(arrayList);
        }
    }

    public final void A0G() {
        if (A0S()) {
            AnonymousClass26A r1 = this.A0X.A00;
            AnonymousClass26B r0 = r1.A01;
            int i2 = r1.A00;
            if (r0 != null && (i2 == 2 || i2 == 0 || i2 == 7)) {
                String str = ((AnonymousClass4P1) this.A0T.A06.A01()).A09;
                synchronized (this.A0e) {
                    A0N(str);
                }
                return;
            }
        }
        A0F();
    }

    public void A0H(int i2) {
        C17210ui r10 = this.A0N;
        C87314Wg r0 = this.A0T.A09.A04;
        long size = (long) (r0 != null ? r0.A07.size() : 0);
        C616239q r1 = this.A0V;
        List list = r1.A00;
        long size2 = list != null ? (long) list.size() : 0;
        Boolean valueOf = r1.A06.AIq() ? Boolean.valueOf(r1.A02) : null;
        String str = r1.A03 ? "has_catalog" : null;
        String str2 = r1.A04 ? "open_now" : null;
        Integer A022 = this.A0P.A02();
        String A042 = r1.A04();
        C29151a7 r12 = new C29151a7();
        r12.A0B = Integer.valueOf(i2);
        r12.A06 = A022;
        r12.A0P = Long.valueOf(size);
        r12.A0X = str;
        r12.A0S = Long.valueOf(size2);
        r12.A00 = valueOf;
        r12.A0Y = str2;
        r12.A0Z = A042;
        r10.A07(r12);
    }

    public final void A0I(AnonymousClass1US r10) {
        this.A0U.A01(new C35651mH(r10.A0E, TextUtils.join(",", r10.A0H), r10.A0B, System.currentTimeMillis()));
    }

    public final void A0J(AnonymousClass1US r12, int i2) {
        C14710pd r2 = this.A0L.A02;
        C16620tM r1 = C16620tM.A02;
        if (r2.A0E(r1, 450) && r2.A0E(r1, 2313)) {
            AnonymousClass1PS r22 = this.A0R;
            String str = r12.A0B;
            double d2 = r12.A00;
            String str2 = this.A0T.A0K;
            String str3 = r12.A0D;
            Double d3 = r12.A02;
            C18450wi.A0H(str, 0);
            r22.A00();
            C74053pf r13 = new C74053pf(r22, d3, str, str2, str3, d2, i2, 1);
            r22.A00 = r13;
            r22.A02.A02(r13);
        }
    }

    public final void A0K(AnonymousClass1US r23, Integer num, Integer num2, String str, int i2, int i3, int i4) {
        AnonymousClass1US r3 = r23;
        A0I(r3);
        C17210ui r9 = this.A0N;
        int i5 = i4;
        Integer num3 = num;
        Integer num4 = num2;
        r9.A0C(num3, num4, this.A0P.A02(), Long.valueOf((long) this.A02), Long.valueOf((long) this.A01), Long.valueOf((long) i2), (Long) null, Long.valueOf((long) i3), Long.valueOf((long) i5), Long.valueOf((long) this.A03), str, 54);
        double d2 = r3.A00;
        r9.A08(r3.A02, 0, this.A0T.A0K, r3.A0D, d2, i5, 1);
        A0J(r3, i5);
    }

    public final void A0L(AnonymousClass1US r22, String str, int i2, int i3, int i4) {
        AnonymousClass1US r3 = r22;
        A0I(r3);
        C17210ui r8 = this.A0N;
        int i5 = i4;
        r8.A0C((Integer) null, (Integer) null, this.A0P.A02(), Long.valueOf((long) this.A02), Long.valueOf((long) this.A01), Long.valueOf((long) i2), (Long) null, Long.valueOf((long) i3), Long.valueOf((long) i5), Long.valueOf((long) this.A03), str, 56);
        double d2 = r3.A00;
        r8.A08(r3.A02, 1, this.A0T.A0K, r3.A0D, d2, i5, 1);
        A0J(r3, i5);
    }

    public void A0M(String str) {
        synchronized (this.A0e) {
            A0N(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        if (((X.C84784Lw) r1.A01()).A03.isEmpty() == false) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r4 = r9.trim()
            X.3FH r0 = r8.A0T
            r0.A0C(r4)
            X.07u r6 = r8.A0J
            java.lang.String r5 = "saved_search_query"
            java.util.Map r7 = r6.A03
            java.lang.Object r3 = r7.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r2 = "saved_search_state"
            r1 = 0
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = r8.A07()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r7.get(r2)
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r7.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
        L_0x003a:
            r8.A04 = r1
        L_0x003c:
            r0 = 0
            r6.A06(r2, r0)
            r6.A06(r5, r0)
            java.util.LinkedList r2 = r8.A0e
            r2.add(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0117
            boolean r0 = r8.A09
            r6 = 1
            if (r0 != 0) goto L_0x008e
            X.1Kd r2 = r8.A0M
            java.util.Random r0 = r2.A01
            if (r0 != 0) goto L_0x0060
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.A01 = r0
        L_0x0060:
            long r0 = r0.nextLong()
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            r2.A00 = r0
            X.0ui r5 = r8.A0N
            X.1Ko r0 = r8.A0P
            java.lang.Integer r3 = r0.A02()
            X.1a7 r2 = new X.1a7
            r2.<init>()
            r0 = 41
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0B = r0
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0N = r0
            r2.A06 = r3
            r5.A06(r2)
            r8.A09 = r6
        L_0x008e:
            int r0 = r8.A04
            if (r0 != r6) goto L_0x00a4
            int r0 = r8.A05(r9)
            r8.A0O(r4, r0)
            return
        L_0x009a:
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x003a
            r0 = 1
            r8.A04 = r0
            r8.A0B = r1
            goto L_0x003c
        L_0x00a4:
            android.os.Handler r1 = r8.A0C
            java.lang.Runnable r0 = r8.A06
            r2 = 500(0x1f4, double:2.47E-321)
            r1.postDelayed(r0, r2)
            java.lang.Runnable r1 = r8.A07
            if (r1 == 0) goto L_0x00b6
            android.os.Handler r0 = r8.A0D
            r0.removeCallbacks(r1)
        L_0x00b6:
            r1 = 20
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r0.<init>(r1, r4, r8)
            r8.A07 = r0
            X.0uf r0 = r8.A0L
            X.0pd r4 = r0.A02
            r0 = 450(0x1c2, float:6.3E-43)
            X.0tM r1 = X.C16620tM.A02
            boolean r0 = r4.A0E(r1, r0)
            if (r0 == 0) goto L_0x010f
            r0 = 2440(0x988, float:3.419E-42)
            boolean r0 = r4.A0E(r1, r0)
            if (r0 == 0) goto L_0x010f
            boolean r0 = r8.A0A
            if (r0 != 0) goto L_0x00ef
            X.028 r1 = r8.A0E
            java.lang.Object r0 = r1.A01()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r1.A01()
            X.4Lw r0 = (X.C84784Lw) r0
            java.util.List r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x010f
        L_0x00ef:
            X.3F7 r0 = r8.A0X
            X.26A r0 = r0.A00
            X.26B r5 = r0.A01
            if (r5 == 0) goto L_0x010f
            X.2Z2 r4 = r8.A0O
            r4.A01()
            X.2Z0 r1 = r4.A0J
            X.0wA r0 = r4.A0O
            X.1Kf r0 = r0.A00
            X.2yq r1 = r1.A74(r5, r4, r0)
            java.lang.String r0 = "2.0"
            r1.A00 = r0
            r1.A04()
            r4.A00 = r1
        L_0x010f:
            android.os.Handler r1 = r8.A0D
            java.lang.Runnable r0 = r8.A07
            r1.postDelayed(r0, r2)
            return
        L_0x0117:
            monitor-enter(r2)
            r2.clear()     // Catch:{ all -> 0x0127 }
            android.os.Handler r1 = r8.A0C     // Catch:{ all -> 0x0127 }
            java.lang.Runnable r0 = r8.A06     // Catch:{ all -> 0x0127 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0127 }
            r8.A0G()     // Catch:{ all -> 0x0127 }
            monitor-exit(r2)     // Catch:{ all -> 0x0127 }
            return
        L_0x0127:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0127 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0N(java.lang.String):void");
    }

    public final void A0O(String str, int i2) {
        AnonymousClass4HF r12 = null;
        this.A05 = null;
        LinkedList linkedList = this.A0e;
        synchronized (linkedList) {
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                AnonymousClass3FH r6 = this.A0T;
                r6.A0C(A07());
                boolean z2 = true;
                this.A04 = 1;
                this.A0d.A09(3);
                linkedList.clear();
                if (A08().isEmpty()) {
                    List A092 = A09();
                    boolean z3 = true;
                    if (!this.A0L.A01() || this.A04 != 1) {
                        z3 = false;
                    }
                    A092.add(new C71953lK(z3));
                    this.A0G.A09(A092);
                }
                r6.A09.A02 = 9;
                int i3 = i2;
                if (i3 != 2) {
                    z2 = false;
                }
                r6.A03 = z2;
                AnonymousClass2Z2 r11 = this.A0O;
                int i4 = this.A04;
                AnonymousClass26B A062 = A06();
                if (A0R()) {
                    AnonymousClass4P1 r0 = (AnonymousClass4P1) r6.A06.A01();
                    r12 = r0 != null ? r0.A03 : new AnonymousClass4HF(150, (String) null);
                }
                r11.A04(r12, this.A0V.A00(), A062, str2, r6.A0K, i4, i3);
                this.A0N.A0C((Integer) null, (Integer) null, this.A0P.A02(), Long.valueOf((long) this.A02), Long.valueOf((long) this.A01), (Long) null, (Long) null, (Long) null, (Long) null, Long.valueOf((long) this.A03), str2, 55);
            }
        }
    }

    public final void A0P(List list) {
        String str;
        IDxCListenerShape105S0200000_2_I0 iDxCListenerShape105S0200000_2_I0;
        C450626x r3 = this.A0U;
        List<C35641mG> list2 = (List) r3.A00.A01();
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            for (C35641mG r4 : list2) {
                if (r4 instanceof C35631mF) {
                    C35631mF r42 = (C35631mF) r4;
                    str = r42.A00;
                    iDxCListenerShape105S0200000_2_I0 = new IDxCListenerShape105S0200000_2_I0(r42, 1, r3);
                } else if (r4 instanceof C35651mH) {
                    C35651mH r43 = (C35651mH) r4;
                    try {
                        C16000sG r1 = r3.A06;
                        String str2 = r43.A02;
                        C15830rv A012 = C15830rv.A01(str2);
                        AnonymousClass00B.A06(A012);
                        C16010sH A082 = r1.A08(A012);
                        if (A082 != null) {
                            arrayList.add(new C72103lZ(new AnonymousClass4HJ(r43, r3), A082, r43.A00, str2, new ArrayList(Arrays.asList(r43.A01.split(",")))));
                        }
                    } catch (AnonymousClass1W4 e2) {
                        Log.i("DirectoryRecentSearchDelegate/createRecentSearchListDirectoryRecentSearchDelegates: one of the business profiles could not be loaded", e2);
                    }
                } else if (r4 instanceof AnonymousClass2RC) {
                    AnonymousClass2RC r44 = (AnonymousClass2RC) r4;
                    str = r44.A01;
                    iDxCListenerShape105S0200000_2_I0 = new IDxCListenerShape105S0200000_2_I0(r44, 0, r3);
                } else {
                    Log.i("DirectoryRecentSearchDelegate/createRecentSearchListItems: one of the recent searches is of unknown type");
                }
                arrayList.add(new C72053lU(iDxCListenerShape105S0200000_2_I0, str));
            }
        }
        list.addAll(arrayList);
    }

    public final void A0Q(List list) {
        AnonymousClass3F7 r4 = this.A0X;
        AnonymousClass26A r2 = r4.A00;
        int i2 = r2.A00;
        if (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 4) {
            if (r2.A01() != null) {
                list.add(r2.A01());
            }
            this.A0N.A0B(Integer.valueOf(r4.A02()), 25, r4.A01());
        }
    }

    public boolean A0R() {
        String str;
        AnonymousClass26B A062 = A06();
        if (A062 == null || (str = A062.A08) == null) {
            return false;
        }
        return str.equals("device") || str.equals("pin_on_map");
    }

    public final boolean A0S() {
        AnonymousClass4P1 r0 = (AnonymousClass4P1) this.A0T.A06.A01();
        return r0 != null && !TextUtils.isEmpty(r0.A09);
    }

    public void AMP() {
        this.A0Z.A09(3);
    }

    public void AOE() {
        AnonymousClass4HN A032 = this.A0V.A03();
        if (A032 != null) {
            this.A0a.A09(A032);
        }
    }

    public void AOG() {
        this.A0c.A0B(new Pair(7, A06()));
        this.A0X.A03();
    }

    public void AOT(int i2) {
        C30801cy r3;
        int i3;
        if (i2 == 0 || i2 == 7 || i2 == 6) {
            this.A0N.A0A(Integer.valueOf(this.A0X.A02()), 29, 0);
            r3 = this.A0c;
            i3 = 8;
        } else if (i2 == 3) {
            this.A0N.A0A(Integer.valueOf(this.A0X.A02()), 29, 3);
            r3 = this.A0c;
            i3 = 5;
        } else {
            return;
        }
        r3.A09(new Pair(Integer.valueOf(i3), A06()));
    }

    public void AOU() {
        this.A0V.A05();
        String A072 = A07();
        if (A072 == null) {
            A072 = "";
        }
        String A073 = A07();
        if (A073 == null) {
            A073 = "";
        }
        A0O(A072, A05(A073));
        A0D();
    }

    public void AOV() {
        Log.e("BusinessDirectoryContextualSearchViewModel/onRetryNetworkClicked Should not reach here - no filters on this screen");
    }

    public void APx(boolean z2) {
        this.A0V.A02 = z2;
        String A072 = A07();
        if (A072 == null) {
            A072 = "";
        }
        A0O(A072, 1);
        A0D();
    }

    public void AS2(boolean z2) {
        this.A0V.A03 = z2;
        String A072 = A07();
        if (A072 == null) {
            A072 = "";
        }
        A0O(A072, 1);
        A0D();
    }

    public void ASA(int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C72023lR(this, 2));
        this.A0F.A09(arrayList);
        this.A0N.A0A(Integer.valueOf(this.A0X.A02()), 28, 2);
    }

    public void AT5() {
    }

    public void ATA() {
        this.A0Z.A09(0);
        this.A0N.A0A(Integer.valueOf(this.A0X.A02()), 34, 0);
    }

    public void ATn() {
        AOG();
    }

    public void AUA(boolean z2) {
        this.A0V.A04 = z2;
        String A072 = A07();
        if (A072 == null) {
            A072 = "";
        }
        A0O(A072, 1);
        A0D();
    }

    public void AWa() {
        AnonymousClass3F7 r2 = this.A0X;
        r2.A02 = true;
        r2.A06();
        this.A0Z.A09(1);
        this.A0N.A0A(Integer.valueOf(r2.A02()), 31, 0);
    }

    public void AWb() {
        synchronized (this.A0e) {
            A0G();
        }
    }

    public void AWr() {
        Log.e("BusinessDirectoryContextualSearchViewModel/onSeeAllCategoriesClicked Should not reach here, no category screen view");
    }
}

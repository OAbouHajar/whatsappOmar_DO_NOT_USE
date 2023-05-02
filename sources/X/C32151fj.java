package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape4S0400000_2_I0;
import com.obwhatsapp.Me;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.CatalogHeader;
import com.obwhatsapp.biz.catalog.view.CategoryMediaCard;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1fj  reason: invalid class name and case insensitive filesystem */
public class C32151fj extends C32161fk implements C32201fo {
    public long A00 = 1;
    public String A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final Activity A05;
    public final AnonymousClass1KO A06;
    public final C18640x1 A07;
    public final C17170ue A08;
    public final C57242qY A09;
    public final AnonymousClass5RY A0A;
    public final C16000sG A0B;
    public final C17030uP A0C;
    public final C16080sP A0D;
    public final C15860rz A0E;
    public final AnonymousClass013 A0F;
    public final C14710pd A0G;
    public final AnonymousClass15W A0H;
    public final Map A0I = new HashMap();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32151fj(android.app.Activity r9, X.C19980zJ r10, X.C16040sK r11, X.AnonymousClass1KO r12, X.C18640x1 r13, X.C17170ue r14, X.AnonymousClass1KA r15, X.C50262Yq r16, X.C57242qY r17, X.AnonymousClass5RY r18, X.C16000sG r19, X.C17030uP r20, X.C16080sP r21, X.C15860rz r22, X.AnonymousClass013 r23, X.C14710pd r24, X.AnonymousClass15W r25, com.whatsapp.jid.UserJid r26) {
        /*
            r8 = this;
            r2 = r8
            r7 = r26
            r3 = r10
            r4 = r11
            r5 = r15
            r6 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 1
            r8.A00 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r8.A0I = r0
            r0 = 1
            r8.A0B(r0)
            r8.A06 = r12
            r0 = r25
            r8.A0H = r0
            r8.A07 = r13
            r8.A05 = r9
            r0 = 0
            r8.A04 = r0
            r8.A03 = r0
            r0 = r24
            r8.A0G = r0
            r0 = r19
            r8.A0B = r0
            r0 = r21
            r8.A0D = r0
            r0 = r23
            r8.A0F = r0
            r0 = r20
            r8.A0C = r0
            r8.A08 = r14
            r0 = r22
            r8.A0E = r0
            r0 = r18
            r8.A0A = r0
            r0 = r17
            r8.A09 = r0
            r8.A0P(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32151fj.<init>(android.app.Activity, X.0zJ, X.0sK, X.1KO, X.0x1, X.0ue, X.1KA, X.2Yq, X.2qY, X.5RY, X.0sG, X.0uP, X.0sP, X.0rz, X.013, X.0pd, X.15W, com.whatsapp.jid.UserJid):void");
    }

    public long A0D(int i2) {
        String str;
        StringBuilder sb;
        String str2;
        switch (getItemViewType(i2)) {
            case 1:
                return -2;
            case 2:
                return -3;
            case 3:
                return -4;
            case 4:
                return -5;
            case 5:
                C50072Xv r2 = (C50072Xv) this.A00.get(i2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("product_");
                sb2.append(r2.A01.A0D);
                str = sb2.toString();
                String str3 = r2.A02;
                if (str3 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("_in_collection_");
                    sb3.append(str3);
                    str = sb3.toString();
                    break;
                }
                break;
            case 6:
                return -6;
            case 7:
                sb = new StringBuilder("collection_");
                str2 = ((C71553kc) this.A00.get(i2)).A02;
                break;
            case 8:
                sb = new StringBuilder("collection_review_status_banner");
                str2 = ((C71543kb) this.A00.get(i2)).A01;
                break;
            case 9:
                return -7;
            case 10:
                return -8;
            case 11:
                return -10;
            case 12:
                this.A00.get(i2);
                throw new NullPointerException("orderProduct");
            case 13:
                return -9;
            case 14:
                return -11;
            case 15:
                return -12;
            case 16:
                return -13;
            default:
                return 0;
        }
        sb.append(str2);
        str = sb.toString();
        Map map = this.A0I;
        if (!map.containsKey(str)) {
            long j2 = this.A00;
            this.A00 = 1 + j2;
            map.put(str, Long.valueOf(j2));
        }
        return ((Number) map.get(str)).longValue();
    }

    public C65123Sy A0F(ViewGroup viewGroup, int i2) {
        int i3 = i2;
        if (i3 == 2) {
            UserJid userJid = this.A05;
            C16040sK r5 = this.A02;
            C19980zJ r4 = this.A01;
            C16000sG r6 = this.A0B;
            C16080sP r8 = this.A0D;
            return new C59672yj(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00be, viewGroup, false), r4, r5, r6, this.A0C, r8, userJid);
        } else if (i3 == 5) {
            Activity activity = this.A05;
            UserJid userJid2 = this.A05;
            C16040sK r3 = this.A02;
            AnonymousClass013 r11 = this.A0F;
            C50262Yq r62 = this.A04;
            C17170ue r42 = this.A08;
            AnonymousClass5RY r10 = this.A0A;
            AnonymousClass4D4 r52 = new AnonymousClass4D4(897462978);
            View A0H2 = C13680ns.A0H(LayoutInflater.from(activity), viewGroup, R.layout.layout00c1);
            AnonymousClass2JP.A02(A0H2);
            return new C59652yh(A0H2, r3, r42, r52, r62, this, this, (C108585Oo) null, r10, r11, userJid2);
        } else if (i3 == 7) {
            C19980zJ r53 = this.A01;
            return new C71623kj(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout04d5, viewGroup, false), r53, this, this, this.A05);
        } else if (i3 == 10) {
            return new C71563kd(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00c0, viewGroup, false));
        } else {
            switch (i2) {
                case 14:
                    C447525k r43 = (C447525k) this.A05;
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout04a9, viewGroup, false);
                    inflate.setOnClickListener(new ViewOnClickCListenerShape4S0100000_I1(r43, 16));
                    r43.setPostcodeAndLocationViews(inflate);
                    return new C71593kg(inflate);
                case 15:
                    C19980zJ r44 = this.A01;
                    UserJid userJid3 = this.A05;
                    return new C71613ki(r44, this.A04, (CategoryMediaCard) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00f5, viewGroup, false), this.A09, userJid3);
                case 16:
                    return new C71603kh(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00f4, viewGroup, false), this.A09);
                default:
                    if (i3 != 1) {
                        return super.A0F(viewGroup, i3);
                    }
                    UserJid userJid4 = this.A05;
                    return new C71573ke(this.A01, this.A02, (CatalogHeader) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00bf, viewGroup, false), userJid4);
            }
        }
    }

    public final int A0J() {
        List list = this.A00;
        if (list.size() <= 0 || !(list.get(list.size() - 1) instanceof C71523kZ)) {
            return -1;
        }
        return list.size() - 1;
    }

    public void A0K() {
        List list = this.A00;
        if (list.size() <= 0 || !(list.get(0) instanceof C71493kW)) {
            list.add(0, new C71493kW());
            A03(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r0 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L() {
        /*
            r4 = this;
            X.1KA r2 = r4.A03
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x003b
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x003b
            r4.A0G()
        L_0x000d:
            int r1 = r4.A0J()
            r0 = -1
            if (r1 == r0) goto L_0x0038
            java.util.List r0 = r4.A00
            java.lang.Object r3 = r0.get(r1)
            X.3kZ r3 = (X.C71523kZ) r3
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0039
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0039
            X.0x1 r2 = r4.A07
            com.whatsapp.jid.UserJid r1 = r4.A05
            boolean r0 = r2.A0J(r1)
            if (r0 != 0) goto L_0x0035
            boolean r0 = r2.A0I(r1)
            r1 = 3
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            r3.A00 = r1
        L_0x0038:
            return
        L_0x0039:
            r1 = 5
            goto L_0x0036
        L_0x003b:
            r4.A0H()
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32151fj.A0L():void");
    }

    public void A0M() {
        List list = this.A00;
        if (list.size() > 0 && (list.get(0) instanceof C71493kW)) {
            A02(0);
        }
    }

    public void A0N(int i2) {
        if (i2 == 404) {
            A0P(this.A05);
            A01();
        }
        AnonymousClass1KA r1 = this.A03;
        if (r1.A01 || r1.A00) {
            A0H();
        } else {
            A0G();
        }
        int A0J = A0J();
        if (A0J != -1) {
            C71523kZ r3 = (C71523kZ) this.A00.get(A0J);
            int i3 = 1;
            if (i2 != 404) {
                if (i2 == 406) {
                    Activity activity = this.A05;
                    C16040sK r32 = this.A02;
                    AnonymousClass1KO r5 = this.A06;
                    AnonymousClass15W r6 = this.A0H;
                    WeakReference weakReference = AnonymousClass44Z.A00;
                    if (weakReference == null || weakReference.get() == null || !((Dialog) weakReference.get()).isShowing()) {
                        r32.A0B();
                        Me me = r32.A00;
                        C32241fu r33 = new C32241fu(activity);
                        r33.A01(R.string.str03c9);
                        r33.A07(true);
                        r33.setPositiveButton(R.string.str0394, (DialogInterface.OnClickListener) null);
                        r33.A0B(new IDxCListenerShape4S0400000_2_I0(r5, r6, activity, me, 0), R.string.str13cb);
                        C005702l create = r33.create();
                        AnonymousClass44Z.A00 = new WeakReference(create);
                        create.show();
                    }
                    A02(A0J);
                } else if (i2 == -1) {
                    i3 = 4;
                } else {
                    StringBuilder sb = new StringBuilder("business-catalog-list-adapter/request-catalog/fetch-catalog-error/error: ");
                    sb.append(i2);
                    Log.w(sb.toString());
                    i3 = 2;
                }
            }
            r3.A00 = i3;
            A02(A0J);
        }
    }

    public void A0O(C35701mM r10) {
        List list;
        if (A0Q(r10)) {
            boolean z2 = true;
            int i2 = 0;
            while (true) {
                list = this.A00;
                if (i2 >= list.size()) {
                    break;
                }
                C50082Xw r2 = (C50082Xw) list.get(i2);
                if (r2 instanceof C50072Xv) {
                    C50072Xv r22 = (C50072Xv) r2;
                    String str = r22.A01.A0D;
                    String str2 = r10.A0D;
                    if (str.equals(str2)) {
                        r22.A01 = r10;
                        r22.A00 = A0E(str2);
                        A02(i2);
                        z2 = false;
                    }
                }
                i2++;
            }
            if (z2) {
                int i3 = 0;
                boolean z3 = false;
                boolean z4 = false;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    C50082Xw r6 = (C50082Xw) list.get(i4);
                    int i5 = r6.A00;
                    if (!(i5 == 16 || i5 == 15 || i5 == 1 || i5 == 14)) {
                        if (!(r6 instanceof C71553kc)) {
                            if (!(r6 instanceof C50072Xv)) {
                                if (!(r6 instanceof C71543kb)) {
                                    break;
                                }
                            } else if (AnonymousClass1ZW.A0E(((C50072Xv) r6).A02)) {
                                break;
                            }
                        } else {
                            if ("catalog_products_all_items_collection_id".equals(((C71553kc) r6).A02)) {
                                z4 = true;
                            }
                            i3++;
                            z3 = true;
                        }
                    }
                    i3++;
                }
                if ((!z3 || z4) && i3 != -1) {
                    list.add(i3, new C50072Xv(r10, A0E(r10.A0D)));
                    A03(i3);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0169, code lost:
        if (r0.A01 != false) goto L_0x016b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(com.whatsapp.jid.UserJid r13) {
        /*
            r12 = this;
            java.util.List r5 = r12.A00
            r5.clear()
            android.app.Activity r6 = r12.A05
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 1
            if (r1 != r0) goto L_0x0017
            r12.A0K()
        L_0x0017:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0052
            X.0rz r2 = r12.A0E
            com.whatsapp.jid.UserJid r1 = r12.A05
            java.lang.String r0 = r1.getRawString()
            java.lang.String r4 = r2.A0R(r0)
            java.lang.String r3 = r1.getRawString()
            X.01D r0 = r2.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "dc_location_name_"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            if (r4 == 0) goto L_0x0109
            if (r0 == 0) goto L_0x0109
            X.3ka r1 = new X.3ka
            r1.<init>(r4, r0)
        L_0x004f:
            r5.add(r1)
        L_0x0052:
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x0068
            X.3kV r0 = new X.3kV
            r0.<init>()
            r5.add(r0)
            java.util.List r1 = r12.A02
            X.3kY r0 = new X.3kY
            r0.<init>(r1)
            r5.add(r0)
        L_0x0068:
            X.0sK r1 = r12.A02
            com.whatsapp.jid.UserJid r0 = r12.A05
            boolean r0 = r1.A0I(r0)
            X.0pd r2 = r12.A0G
            r1 = 582(0x246, float:8.16E-43)
            if (r0 == 0) goto L_0x0078
            r1 = 451(0x1c3, float:6.32E-43)
        L_0x0078:
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x011f
            X.0x1 r8 = r12.A07
            java.util.List r0 = r8.A07(r13)
            java.util.Iterator r11 = r0.iterator()
            r9 = 0
            r3 = 0
        L_0x008c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0161
            java.lang.Object r2 = r11.next()
            X.2GE r2 = (X.AnonymousClass2GE) r2
            X.2gM r0 = r2.A00
            int r0 = r0.A00
            if (r0 != 0) goto L_0x008c
            java.util.List r10 = r2.A04
            java.util.Iterator r1 = r10.iterator()
        L_0x00a4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r1.next()
            X.1mM r0 = (X.C35701mM) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00a4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r4 = r2.A03
            java.lang.String r3 = r2.A02
            X.2gM r2 = r2.A00
            int r1 = r2.A00
            X.3kc r0 = new X.3kc
            r0.<init>(r4, r3, r9)
            r7.add(r0)
            r0 = 2
            if (r1 != r0) goto L_0x00d6
            X.3kb r0 = new X.3kb
            r0.<init>(r2, r4)
            r7.add(r0)
        L_0x00d6:
            r9 = 0
            java.util.Iterator r10 = r10.iterator()
        L_0x00db:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r3 = r10.next()
            X.1mM r3 = (X.C35701mM) r3
            r0 = 3
            if (r9 == r0) goto L_0x0103
            boolean r0 = r12.A0Q(r3)
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = r3.A0D
            long r0 = r12.A0E(r0)
            X.2Xv r2 = new X.2Xv
            r2.<init>(r3, r0)
            r2.A02 = r4
            r7.add(r2)
            int r9 = r9 + 1
            goto L_0x00db
        L_0x0103:
            r5.addAll(r7)
            r9 = 1
            r3 = 1
            goto L_0x008c
        L_0x0109:
            java.lang.String r2 = r12.A01
            if (r2 == 0) goto L_0x0052
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131890929(0x7f1212f1, float:1.9416564E38)
            java.lang.String r0 = r1.getString(r0)
            X.3ka r1 = new X.3ka
            r1.<init>(r2, r0)
            goto L_0x004f
        L_0x011f:
            r3 = 0
        L_0x0120:
            X.0x1 r0 = r12.A07
            java.util.List r4 = r0.A08(r13)
            if (r4 == 0) goto L_0x016b
            if (r3 == 0) goto L_0x013c
            r3 = 1
            r0 = 2131887223(0x7f120477, float:1.9409047E38)
            java.lang.String r2 = r6.getString(r0)
            java.lang.String r1 = "catalog_products_all_items_collection_id"
            X.3kc r0 = new X.3kc
            r0.<init>(r1, r2, r3)
            r5.add(r0)
        L_0x013c:
            java.util.Iterator r4 = r4.iterator()
        L_0x0140:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r3 = r4.next()
            X.1mM r3 = (X.C35701mM) r3
            boolean r0 = r12.A0Q(r3)
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = r3.A0D
            long r1 = r12.A0E(r0)
            X.2Xv r0 = new X.2Xv
            r0.<init>(r3, r1)
            r5.add(r0)
            goto L_0x0140
        L_0x0161:
            X.2GH r0 = r8.A02(r13)
            if (r0 == 0) goto L_0x0120
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0120
        L_0x016b:
            int r1 = r12.A0J()
            r0 = -1
            if (r1 != r0) goto L_0x0183
            X.3kZ r0 = new X.3kZ
            r0.<init>()
            r5.add(r0)
            int r0 = r5.size()
            int r0 = r0 + -1
            r12.A03(r0)
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32151fj.A0P(com.whatsapp.jid.UserJid):void");
    }

    public boolean A0Q(C35701mM r3) {
        if (!r3.A01()) {
            return false;
        }
        Integer num = this.A09.A00;
        return num == null || num.intValue() != 404;
    }

    public AnonymousClass4K6 AAj(int i2) {
        int i3 = 0;
        String str = null;
        boolean z2 = false;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i3 <= i2) {
                C50082Xw r1 = (C50082Xw) this.A00.get(i3);
                if (r1 instanceof C71553kc) {
                    i4++;
                    str = ((C71553kc) r1).A02;
                    z2 = true;
                    i5 = -1;
                }
                if (r1 instanceof C50072Xv) {
                    if (!z2) {
                        break;
                    }
                    i5++;
                }
                i3++;
            } else if (z2) {
                return "catalog_products_all_items_collection_id".equals(str) ? new AnonymousClass4K6((String) null, String.valueOf(i5), (String) null) : new AnonymousClass4K6(String.valueOf(i4), String.valueOf(i5), str);
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        int i3 = i2;
        if (i3 == 2) {
            UserJid userJid = this.A05;
            C16040sK r5 = this.A02;
            C19980zJ r4 = this.A01;
            C16000sG r6 = this.A0B;
            C16080sP r8 = this.A0D;
            return new C59672yj(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00be, viewGroup, false), r4, r5, r6, this.A0C, r8, userJid);
        } else if (i3 == 5) {
            Activity activity = this.A05;
            UserJid userJid2 = this.A05;
            C16040sK r3 = this.A02;
            AnonymousClass013 r11 = this.A0F;
            C50262Yq r62 = this.A04;
            C17170ue r42 = this.A08;
            AnonymousClass5RY r10 = this.A0A;
            AnonymousClass4D4 r52 = new AnonymousClass4D4(897462978);
            View A0H2 = C13680ns.A0H(LayoutInflater.from(activity), viewGroup, R.layout.layout00c1);
            AnonymousClass2JP.A02(A0H2);
            return new C59652yh(A0H2, r3, r42, r52, r62, this, this, (C108585Oo) null, r10, r11, userJid2);
        } else if (i3 == 7) {
            C19980zJ r53 = this.A01;
            return new C71623kj(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout04d5, viewGroup, false), r53, this, this, this.A05);
        } else if (i3 == 10) {
            return new C71563kd(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00c0, viewGroup, false));
        } else {
            switch (i2) {
                case 14:
                    C447525k r43 = (C447525k) this.A05;
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout04a9, viewGroup, false);
                    inflate.setOnClickListener(new ViewOnClickCListenerShape4S0100000_I1(r43, 16));
                    r43.setPostcodeAndLocationViews(inflate);
                    return new C71593kg(inflate);
                case 15:
                    C19980zJ r44 = this.A01;
                    UserJid userJid3 = this.A05;
                    return new C71613ki(r44, this.A04, (CategoryMediaCard) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00f5, viewGroup, false), this.A09, userJid3);
                case 16:
                    return new C71603kh(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00f4, viewGroup, false), this.A09);
                default:
                    if (i3 != 1) {
                        return super.A0F(viewGroup, i3);
                    }
                    UserJid userJid4 = this.A05;
                    return new C71573ke(this.A01, this.A02, (CatalogHeader) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00bf, viewGroup, false), userJid4);
            }
        }
    }
}

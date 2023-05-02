package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.redex.IDxCListenerShape27S0300000_3_I1;
import com.facebook.redex.IDxCListenerShape33S0200000_3_I1;
import com.facebook.redex.IDxCListenerShape5S1100000_3_I1;
import com.facebook.redex.IDxCallbackShape65S0200000_3_I1;
import com.facebook.redex.IDxTObserverShape253S0100000_3_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5em  reason: invalid class name and case insensitive filesystem */
public class C110755em extends C003401n implements AnonymousClass2SE {
    public int A00;
    public int A01 = R.string.str17cc;
    public AnonymousClass027 A02 = new AnonymousClass027(AnonymousClass000.A0u());
    public C35611mD A03;
    public AnonymousClass1Vt A04;
    public C41411vk A05;
    public C114625o5 A06;
    public C117415sx A07;
    public C28381Vw A08;
    public C30801cy A09 = new C30801cy();
    public Boolean A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E = false;
    public boolean A0F = false;
    public final Bundle A0G;
    public final C14870pt A0H;
    public final C16040sK A0I;
    public final C17150uc A0J;
    public final AnonymousClass1ME A0K;
    public final AnonymousClass01Y A0L;
    public final C16000sG A0M;
    public final AnonymousClass01V A0N;
    public final C16440t3 A0O;
    public final C16980tz A0P;
    public final AnonymousClass013 A0Q;
    public final C16460t6 A0R;
    public final C17630vO A0S;
    public final C221116r A0T;
    public final AnonymousClass173 A0U;
    public final AnonymousClass160 A0V;
    public final C1204661t A0W;
    public final AnonymousClass107 A0X;
    public final AnonymousClass175 A0Y;
    public final C18300wT A0Z;
    public final AnonymousClass17Y A0a;
    public final C18090w8 A0b;
    public final C18290wS A0c;
    public final AnonymousClass1MA A0d;
    public final C1222969a A0e;
    public final AnonymousClass1Vo A0f = C110105dW.A0Q("PaymentTransactionDetailsViewModel", "payment-settings");
    public final AnonymousClass1GO A0g;
    public final AnonymousClass5wT A0h;
    public final C218315p A0i;
    public final C16320sq A0j;

    public C110755em(Bundle bundle, C14870pt r6, C16040sK r7, C17150uc r8, AnonymousClass1ME r9, AnonymousClass01Y r10, C16000sG r11, AnonymousClass01V r12, C16440t3 r13, C16980tz r14, AnonymousClass013 r15, C16460t6 r16, C17630vO r17, C221116r r18, AnonymousClass173 r19, AnonymousClass160 r20, C1204661t r21, AnonymousClass107 r22, AnonymousClass175 r23, C18300wT r24, AnonymousClass17Y r25, C18090w8 r26, C18290wS r27, AnonymousClass1MA r28, C1222969a r29, AnonymousClass1GO r30, AnonymousClass5wT r31, C218315p r32, C16320sq r33) {
        this.A0O = r13;
        this.A0H = r6;
        this.A0I = r7;
        this.A0P = r14;
        this.A0j = r33;
        this.A0V = r20;
        this.A0i = r32;
        this.A0M = r11;
        this.A0N = r12;
        this.A0Q = r15;
        this.A0c = r27;
        this.A0L = r10;
        this.A0R = r16;
        this.A0K = r9;
        this.A0Z = r24;
        this.A0h = r31;
        this.A0Y = r23;
        this.A0S = r17;
        this.A0b = r26;
        this.A0U = r19;
        this.A0J = r8;
        this.A0W = r21;
        this.A0e = r29;
        this.A0g = r30;
        this.A0T = r18;
        this.A0d = r28;
        AnonymousClass17Y r3 = r25;
        this.A0a = r3;
        this.A0X = r22;
        this.A0G = bundle;
        bundle.getString("referral_screen");
        this.A08 = AnonymousClass1yL.A03(bundle, "");
        this.A0C = bundle.getString("extra_transaction_id");
        String string = bundle.getString("extra_payment_receipt_type");
        this.A0B = string == null ? "native" : string;
        this.A0D = bundle.getString("extra_transaction_ref");
        this.A0A = Boolean.valueOf(bundle.getBoolean("extra_is_pending_request_saved_instance", false));
        IDxTObserverShape253S0100000_3_I1 iDxTObserverShape253S0100000_3_I1 = new IDxTObserverShape253S0100000_3_I1(this, this instanceof C114175nF ? 7 : this instanceof C114165nE ? 5 : 8);
        this.A05 = iDxTObserverShape253S0100000_3_I1;
        r3.A02(iDxTObserverShape253S0100000_3_I1);
        this.A00 = bundle.getInt("extra_payment_flow_entry_point", 0);
    }

    public static void A01(C110755em r0, Object obj) {
        r0.A09.A0B(obj);
    }

    public static void A02(List list) {
        list.add(new C113765ma());
    }

    public C228919r A05() {
        return this.A0c.A03();
    }

    public C116245r4 A06() {
        AnonymousClass1Vt r0;
        AnonymousClass1W2 r02;
        C35301lh A0C2;
        C117415sx r03 = this.A07;
        if (r03 == null || (r0 = r03.A01) == null || (r02 = r0.A0A) == null || (A0C2 = r02.A0C()) == null || C39841t9.A03(A0C2)) {
            return null;
        }
        C113975mv r2 = new C113975mv();
        r2.A03 = (String) C39841t9.A02(A0C2);
        r2.A04 = this.A0P.A00.getString(R.string.str17c1);
        return r2;
    }

    public C116245r4 A07() {
        C117415sx r0 = this.A07;
        if (r0 != null) {
            AnonymousClass1Vt r1 = r0.A01;
            C113975mv r3 = new C113975mv();
            if (!r1.A0E()) {
                AnonymousClass1W1.A09(r1.A0F);
            }
            String A092 = A09(r1);
            if (AnonymousClass1W1.A09(A092)) {
                r3.A04 = this.A0P.A00.getString(R.string.str17e8);
                r3.A03 = A092;
                r3.A02 = new IDxCListenerShape5S1100000_3_I1(1, A092, this);
                return r3;
            }
        }
        return null;
    }

    public String A08() {
        C117415sx r0 = this.A07;
        if (r0 != null) {
            Boolean A022 = r0.A01.A02();
            AnonymousClass1W2 r1 = this.A07.A01.A0A;
            AnonymousClass00B.A06(r1);
            if (A022 != null) {
                return A022.booleanValue() ? r1.A0I() : r1.A0J();
            }
        }
        return null;
    }

    public String A09(AnonymousClass1Vt r2) {
        return (r2.A0E() || AnonymousClass1W1.A09(r2.A0F)) ? r2.A0F : r2.A0K;
    }

    public void A0A() {
        C117725tS r2;
        String str;
        C117725tS A002;
        AnonymousClass1Vo r4 = this.A0f;
        r4.A06("Parent- HANDLE_SEND_AGAIN child did not handle");
        C117415sx r0 = this.A07;
        C16740tZ r02 = r0 != null ? r0.A02 : null;
        if (r02 != null) {
            AnonymousClass1Vt r22 = r02.A0L;
            if (r22 != null) {
                UserJid userJid = r22.A0D;
                if (userJid != null) {
                    if (!this.A0L.A0V(userJid)) {
                        AnonymousClass1W2 r03 = r22.A0A;
                        if (r03 == null || r03.A02 == null) {
                            r2 = C117725tS.A00(12);
                            A01(this, r2);
                        }
                        A002 = C117725tS.A00(21);
                        A002.A0D = r22.A0A.A02.A01;
                        C117415sx r04 = this.A07;
                        AnonymousClass00B.A06(r04);
                        A002.A08 = r04.A03;
                        A002.A01 = this.A00;
                    } else {
                        A002 = C117725tS.A00(13);
                        A002.A06 = r22.A0D;
                    }
                    A01(this, A002);
                    return;
                }
                str = "Parent- HANDLE_SEND_AGAIN pmtTxnInfo.receiverJid is null";
            } else {
                str = "Parent- HANDLE_SEND_AGAIN pmtTxnInfo is null";
            }
        } else {
            str = "Parent- HANDLE_SEND_AGAIN FMessage is null";
        }
        r4.A06(str);
        r2 = C117725tS.A00(8);
        r2.A0C = this.A0P.A00.getString(R.string.str1031);
        A01(this, r2);
    }

    public void A0B() {
        AnonymousClass1Vt r6;
        C117415sx r1 = this.A07;
        if (r1 != null && !this.A0F && (r6 = r1.A01) != null) {
            this.A0F = true;
            if (this.A0Y.A0E() && !TextUtils.isEmpty(r6.A0K) && !r6.A0E()) {
                AnonymousClass1Vo r2 = this.A0f;
                StringBuilder A0r = AnonymousClass000.A0r("syncing pending transaction: ");
                A0r.append(r6.A0K);
                A0r.append(" status: ");
                A0r.append(r6.A02);
                C110105dW.A1L(r2, A0r);
                C1222969a ACC = A05().ACC();
                if (ACC != null) {
                    ACC.AgB();
                }
                this.A0d.A00(new IDxCallbackShape65S0200000_3_I1(ACC, 5, this), A05(), r6.A0K, r6.A0H());
            }
        }
    }

    public void A0C() {
        AnonymousClass1Vt r0;
        if (!this.A0E) {
            C117725tS A002 = C117725tS.A00(0);
            C117415sx r02 = this.A07;
            if (!(r02 == null || (r0 = r02.A01) == null || !r0.A0C())) {
                this.A01 = R.string.str143a;
            }
            A002.A02.putInt("action_bar_title_res_id", this.A01);
            A01(this, A002);
            this.A0E = true;
        }
    }

    public final void A0D() {
        if ("native".equals(this.A0B)) {
            A0B();
        }
        AnonymousClass027 r2 = this.A02;
        List list = (List) r2.A01();
        list.clear();
        A0S(false);
        C117415sx r0 = this.A07;
        if (r0 != null && r0.A01 != null) {
            A0I(list);
            r2.A0B(list);
        }
    }

    public void A0E(AnonymousClass1Vt r4) {
        if ((!TextUtils.isEmpty(r4.A0K) && r4.A0K.equals(this.A0C)) || ((!TextUtils.isEmpty(r4.A0L) && r4.A0L.equals(this.A08.A01)) || (!TextUtils.isEmpty(r4.A0M) && r4.A0M.equals(this.A08.A01)))) {
            A0T(false);
        }
    }

    public void A0F(C114015mz r3) {
        AnonymousClass1Vt r1 = this.A07.A01;
        r3.A03 = C218315p.A06(this.A0P.A00, r1);
        r3.A01 = C218315p.A01(r1);
    }

    public void A0G(C116275r7 r3) {
        if (r3.A00 == 2) {
            A0T(true);
        }
    }

    public void A0H(List list) {
        C117415sx r0 = this.A07;
        if (r0 != null) {
            AnonymousClass1Vt r7 = r0.A01;
            C28401Vy r4 = r7.A08;
            SpannableStringBuilder A042 = r4 != null ? C218315p.A04(this.A0P.A00, this.A0Q, r7.A00(), r4, false) : new SpannableStringBuilder();
            C35361lo A012 = r7.A01();
            boolean A002 = A05().AEP().A00(r7);
            C218315p r2 = this.A0i;
            String A0K2 = r2.A0K(r7);
            if (TextUtils.isEmpty(A0K2)) {
                A0K2 = r2.A05.A00.getString(R.string.str17ca);
            }
            list.add(new C113955mt(A012, A042, C13680ns.A0d(r2.A05.A00, A0K2, C110105dW.A1a(A042), 1, R.string.str17c5), A002));
        }
    }

    public void A0I(List list) {
        A0P(list);
        A0R(list);
        A02(list);
        C117415sx r0 = this.A07;
        AnonymousClass00B.A06(r0);
        AnonymousClass1Vt r4 = r0.A01;
        AnonymousClass1W2 r3 = r4.A0A;
        if (!(r3 == null || r3.A02 == null)) {
            list.add(new C113855mj(new IDxCListenerShape27S0300000_3_I1(r3, r4, this, 4), r4, 306));
            list.add(new C113755mZ());
        }
        A0O(list);
        A0Q(list);
    }

    public void A0J(List list) {
        C113925mq r1 = new C113925mq();
        r1.A02 = this.A07;
        r1.A01 = this;
        r1.A00 = A05().ABY();
        list.add(r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(java.util.List r13) {
        /*
            r12 = this;
            X.5my r7 = new X.5my
            r7.<init>()
            X.5sx r0 = r12.A07
            X.1Vt r6 = r0.A01
            X.0tz r0 = r12.A0P
            android.content.Context r5 = r0.A00
            int r2 = r6.A03
            r4 = 1
            r1 = 2131892166(0x7f1217c6, float:1.9419073E38)
            if (r2 == r4) goto L_0x0178
            r0 = 2
            if (r2 == r0) goto L_0x0175
            r0 = 9
            if (r2 == r0) goto L_0x0175
            r0 = 10
            r1 = 2131892168(0x7f1217c8, float:1.9419077E38)
            if (r2 == r0) goto L_0x0178
            r0 = 20
            if (r2 == r0) goto L_0x0171
            r0 = 40
            if (r2 == r0) goto L_0x0171
            r0 = 100
            r1 = 2131892162(0x7f1217c2, float:1.9419064E38)
            if (r2 == r0) goto L_0x0178
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x0175
            java.lang.String r0 = ""
        L_0x0038:
            r7.A09 = r0
            X.15p r0 = r12.A0i
            java.lang.String r0 = r0.A0M(r6)
            r7.A08 = r0
            long r0 = r6.A05
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0070
            r10 = 2131892134(0x7f1217a6, float:1.9419008E38)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r3 = 0
            X.013 r2 = r12.A0Q
            X.0t3 r9 = r12.A0O
            long r0 = r9.A02(r0)
            java.lang.String r11 = X.C28891Zc.A03(r2, r0)
            long r0 = r6.A05
            long r0 = r9.A02(r0)
            java.lang.String r0 = X.C47672Jx.A00(r2, r0)
            java.lang.String r0 = X.C42681yF.A05(r2, r11, r0)
            java.lang.String r0 = X.C13680ns.A0d(r5, r0, r8, r3, r10)
            r7.A0A = r0
        L_0x0070:
            X.19r r0 = r12.A05()
            X.1yJ r8 = r0.AEd()
            if (r8 == 0) goto L_0x00bd
            X.0pd r0 = r8.A07
            boolean r0 = X.C110115dX.A18(r0)
            if (r0 == 0) goto L_0x00bd
            int r1 = r6.A03
            r0 = 9
            if (r1 != r0) goto L_0x010d
            int r2 = r6.A01
            r1 = 2131231707(0x7f0803db, float:1.8079503E38)
            if (r2 == r4) goto L_0x0098
            r0 = 2
            r1 = 2131231706(0x7f0803da, float:1.80795E38)
            if (r2 == r0) goto L_0x0098
            r1 = 2131230908(0x7f0800bc, float:1.8077882E38)
        L_0x0098:
            r7.A00 = r1
            X.1Vt r1 = r12.A04
            if (r1 == 0) goto L_0x00bd
            int r3 = r8.A06()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            X.15p r0 = r8.A08
            java.lang.String r0 = r0.A0M(r1)
            java.lang.String r1 = android.text.Html.escapeHtml(r0)
            r0 = 0
            java.lang.String r0 = X.C13680ns.A0d(r5, r1, r2, r0, r3)
            r7.A07 = r0
            r0 = 128(0x80, float:1.794E-43)
            com.facebook.redex.IDxCListenerShape135S0100000_3_I1 r0 = X.C110115dX.A06(r12, r0)
            r7.A03 = r0
        L_0x00bd:
            java.lang.Boolean r0 = r6.A02()
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x010a
            com.whatsapp.jid.UserJid r1 = r6.A0D
        L_0x00cb:
            if (r1 == 0) goto L_0x00d5
            X.0sG r0 = r12.A0M
            X.0sH r0 = r0.A0A(r1)
            r7.A05 = r0
        L_0x00d5:
            X.0sH r0 = r7.A05
            if (r0 == 0) goto L_0x00ea
            X.666 r1 = new X.666
            r1.<init>(r7, r12)
        L_0x00de:
            r0 = 129(0x81, float:1.81E-43)
            com.facebook.redex.IDxCListenerShape135S0100000_3_I1 r0 = X.C110115dX.A06(r1, r0)
        L_0x00e4:
            r7.A04 = r0
            r13.add(r7)
            return
        L_0x00ea:
            X.19r r0 = r12.A05()
            X.2H6 r0 = r0.AES()
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = r12.A08()
            if (r0 == 0) goto L_0x0108
            X.175 r0 = r12.A0Y
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0108
            X.665 r1 = new X.665
            r1.<init>(r7, r12)
            goto L_0x00de
        L_0x0108:
            r0 = 0
            goto L_0x00e4
        L_0x010a:
            com.whatsapp.jid.UserJid r1 = r6.A0E
            goto L_0x00cb
        L_0x010d:
            X.1GO r2 = r12.A0g
            X.1W2 r0 = r6.A0A
            if (r0 == 0) goto L_0x014a
            X.1lz r3 = r0.A00
            if (r3 == 0) goto L_0x014a
            java.lang.String r0 = r3.A02
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.2fS r0 = r2.A0G
            java.util.concurrent.ConcurrentHashMap r0 = r0.A02
            java.lang.Object r2 = r0.get(r1)
            X.2fU r2 = (X.C53302fU) r2
            if (r2 == 0) goto L_0x014a
            java.lang.String r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x014a
            int r1 = r6.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x0155
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0155
            r0 = 419(0x1a3, float:5.87E-43)
            if (r1 == r0) goto L_0x0155
            r0 = 420(0x1a4, float:5.89E-43)
            if (r1 == r0) goto L_0x0155
            switch(r1) {
                case 401: goto L_0x0155;
                case 402: goto L_0x0155;
                case 403: goto L_0x0155;
                default: goto L_0x014a;
            }
        L_0x014a:
            r0 = 0
        L_0x014b:
            r7.A07 = r0
            java.lang.String r0 = r8.A09()
            r7.A06 = r0
            goto L_0x00bd
        L_0x0155:
            X.1lv r0 = r2.A07
            X.013 r2 = r8.A06
            X.1Vy r1 = r0.A02
            X.1Vz r0 = r0.A01
            android.text.SpannableStringBuilder r0 = X.C218315p.A03(r5, r2, r0, r1)
            java.lang.String r3 = r0.toString()
            int r2 = r8.A05()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 0
            java.lang.String r0 = X.C13680ns.A0d(r5, r3, r1, r0, r2)
            goto L_0x014b
        L_0x0171:
            r1 = 2131892167(0x7f1217c7, float:1.9419075E38)
            goto L_0x0178
        L_0x0175:
            r1 = 2131892169(0x7f1217c9, float:1.9419079E38)
        L_0x0178:
            java.lang.String r0 = r5.getString(r1)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110755em.A0K(java.util.List):void");
    }

    public void A0L(List list) {
        if (this.A0b.A0C(0) && A0U(this.A07.A01)) {
            list.add(new C113835mh(C110115dX.A06(this, 127)));
        }
    }

    public void A0M(List list) {
        String str;
        Context context;
        int i2;
        Object[] objArr;
        C113865mk r6 = new C113865mk();
        AnonymousClass1Vt r5 = this.A07.A01;
        if (r5.A0E()) {
            int i3 = r5.A02;
            if (i3 == 12 || i3 == 11) {
                str = (String) this.A0i.A0D(r5).second;
            }
            str = null;
        } else {
            C218315p r0 = this.A0i;
            String A0N2 = r0.A0N(r5);
            String A0Q2 = r0.A0Q(r5);
            int i4 = r5.A02;
            if (i4 == 406 || i4 == 407) {
                context = this.A0P.A00;
                i2 = R.string.str17fd;
                objArr = new Object[]{A0N2};
            } else {
                if (i4 == 102 && this.A0I.A0I(r5.A0D)) {
                    context = this.A0P.A00;
                    i2 = R.string.str17fe;
                    objArr = new Object[]{A0Q2};
                }
                str = null;
            }
            str = context.getString(i2, objArr);
        }
        if (!C218315p.A09(r5) && !TextUtils.isEmpty(str)) {
            r6.A01 = str;
            r6.A00 = 0;
            list.add(r6);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0077, code lost:
        if (r3.A08 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0393, code lost:
        r4 = r5.A01.A00;
        r0 = com.obwhatsapp.R.string.str1808;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03af, code lost:
        r4 = r5.A01.A00;
        r0 = com.obwhatsapp.R.string.str181e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x042c, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0439, code lost:
        r4 = r5.A01.A00;
        r0 = com.obwhatsapp.R.string.str111f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0523, code lost:
        r10 = X.C13680ns.A0d(r4, r11, new java.lang.Object[1], 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017f, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01aa, code lost:
        r4 = r5.A01.A00;
        r0 = com.obwhatsapp.R.string.str112a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c6, code lost:
        r4 = r5.A01.A00;
        r0 = com.obwhatsapp.R.string.str1124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0231, code lost:
        r4 = r5.A01.A00;
        r0 = com.obwhatsapp.R.string.str181c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(java.util.List r15) {
        /*
            r14 = this;
            X.5sx r0 = r14.A07
            X.1Vt r8 = r0.A01
            X.1cl r3 = r0.A00
            X.5mz r7 = new X.5mz
            r7.<init>()
            r14.A0F(r7)
            X.0tz r0 = r14.A0P
            android.content.Context r5 = r0.A00
            boolean r1 = r8.A0E()
            r0 = 2131889972(0x7f120f34, float:1.9414623E38)
            if (r1 == 0) goto L_0x001e
            r0 = 2131890077(0x7f120f9d, float:1.9414836E38)
        L_0x001e:
            java.lang.String r0 = r5.getString(r0)
            r7.A04 = r0
            X.15p r0 = r14.A0i
            java.lang.String r0 = r0.A0K(r8)
            r7.A05 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x065f
            long r0 = r8.A06
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0062
            r10 = 2131892134(0x7f1217a6, float:1.9419008E38)
            java.lang.Object[] r6 = X.C13680ns.A1b()
            r4 = 0
            X.013 r2 = r14.A0Q
            X.0t3 r9 = r14.A0O
            long r0 = r9.A02(r0)
            java.lang.String r11 = X.C28891Zc.A03(r2, r0)
            long r0 = r8.A06
            long r0 = r9.A02(r0)
            java.lang.String r0 = X.C47672Jx.A00(r2, r0)
            java.lang.String r0 = X.C42681yF.A05(r2, r11, r0)
            java.lang.String r0 = X.C13680ns.A0d(r5, r0, r6, r4, r10)
            r7.A07 = r0
        L_0x0062:
            X.19r r0 = r14.A05()
            X.19b r6 = r0.AB6()
            X.5wT r5 = r14.A0h
            if (r6 == 0) goto L_0x0640
            java.lang.String r1 = r8.A0J
            if (r1 == 0) goto L_0x0640
            if (r3 == 0) goto L_0x0079
            X.1tF r0 = r3.A08
            r4 = 1
            if (r0 != 0) goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            r0 = -1
            int r2 = X.C29501aj.A00(r1, r0)
            int r1 = r8.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x0631
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 == r0) goto L_0x0631
            r0 = 406(0x196, float:5.69E-43)
            if (r1 != r0) goto L_0x0640
            boolean r0 = r6.AIz(r2)
            if (r0 == 0) goto L_0x05fd
            X.0tz r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892176(0x7f1217d0, float:1.9419093E38)
            if (r4 != 0) goto L_0x009f
            r0 = 2131892178(0x7f1217d2, float:1.9419097E38)
        L_0x009f:
            java.lang.String r0 = r1.getString(r0)
        L_0x00a3:
            r7.A0B = r0
            if (r0 == 0) goto L_0x0140
            java.util.HashMap r2 = X.AnonymousClass000.A0x()
            r7.A0C = r2
            X.66a r4 = new X.66a
            r4.<init>(r3, r8, r14)
            X.664 r1 = new X.664
            r1.<init>(r3, r14)
            java.lang.String r0 = "forgot-pin"
            r2.put(r0, r1)
            java.util.Map r2 = r7.A0C
            X.663 r1 = new X.663
            r1.<init>(r3, r14)
            java.lang.String r0 = "view-balance"
            r2.put(r0, r1)
            java.util.Map r1 = r7.A0C
            java.lang.String r0 = "learn-more"
            r1.put(r0, r4)
            java.util.Map r1 = r7.A0C
            java.lang.String r0 = "refund_failed_learn_more"
            r1.put(r0, r4)
            java.util.Map r3 = r7.A0C
            r2 = r14
            boolean r0 = r14 instanceof X.C114155nD
            if (r0 == 0) goto L_0x012f
            X.5nD r2 = (X.C114155nD) r2
            X.64j r1 = new X.64j
            r1.<init>(r2)
            java.lang.String r0 = "incoming_payment_limit_learn_more"
            r3.put(r0, r1)
        L_0x00e9:
            if (r6 == 0) goto L_0x012d
            java.lang.String r1 = r8.A0J
            if (r1 == 0) goto L_0x012d
            r0 = -1
            int r2 = X.C29501aj.A00(r1, r0)
            int r1 = r8.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x00fe
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x012d
        L_0x00fe:
            java.lang.String r0 = r6.ABA(r2)
        L_0x0102:
            r7.A09 = r0
            if (r6 == 0) goto L_0x012b
            java.lang.String r1 = r8.A0J
            if (r1 == 0) goto L_0x012b
            r0 = -1
            int r2 = X.C29501aj.A00(r1, r0)
            int r1 = r8.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x0119
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x012b
        L_0x0119:
            java.lang.String r0 = r6.AB8(r2)
        L_0x011d:
            r7.A08 = r0
            r1 = 5
            com.facebook.redex.IDxCListenerShape27S0300000_3_I1 r0 = new com.facebook.redex.IDxCListenerShape27S0300000_3_I1
            r0.<init>(r8, r6, r14, r1)
            r7.A02 = r0
            r15.add(r7)
            return
        L_0x012b:
            r0 = 0
            goto L_0x011d
        L_0x012d:
            r0 = 0
            goto L_0x0102
        L_0x012f:
            boolean r0 = r14 instanceof X.C114165nE
            if (r0 == 0) goto L_0x00e9
            X.5nE r2 = (X.C114165nE) r2
            X.64i r1 = new X.64i
            r1.<init>(r2)
            java.lang.String r0 = "incoming_payment_limit_learn_more"
            r3.put(r0, r1)
            goto L_0x00e9
        L_0x0140:
            X.15p r4 = r5.A04
            java.lang.String r11 = r4.A0M(r8)
            boolean r0 = r8.A0E()
            r9 = 0
            r3 = 0
            if (r0 == 0) goto L_0x05f9
            java.lang.String r9 = r4.A0O(r8)
            java.lang.String r12 = r4.A0P(r8)
            X.0tz r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131893160(0x7f121ba8, float:1.9421089E38)
            java.lang.String r0 = r1.getString(r0)
            boolean r13 = r12.equals(r0)
        L_0x0165:
            X.0wS r0 = r5.A03
            X.19r r0 = r0.A03()
            X.19e r1 = r0.ABC()
            if (r1 == 0) goto L_0x0185
            X.0tz r0 = r5.A01
            android.content.res.Resources r0 = X.C16980tz.A00(r0)
            java.lang.String r10 = r1.AGg(r0, r8, r11)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0185
        L_0x0181:
            r7.A0A = r10
            goto L_0x00e9
        L_0x0185:
            int r0 = r8.A02
            if (r0 == 0) goto L_0x05d2
            r1 = 418(0x1a2, float:5.86E-43)
            if (r0 == r1) goto L_0x0442
            r1 = -1
            java.lang.String r10 = ""
            r2 = 1
            switch(r0) {
                case 11: goto L_0x01aa;
                case 12: goto L_0x052b;
                case 13: goto L_0x041c;
                case 14: goto L_0x0181;
                case 15: goto L_0x0406;
                case 16: goto L_0x03f0;
                case 17: goto L_0x0439;
                case 18: goto L_0x03e5;
                default: goto L_0x0194;
            }
        L_0x0194:
            r13 = 3
            r9 = 2
            switch(r0) {
                case 101: goto L_0x01aa;
                case 102: goto L_0x04ed;
                case 103: goto L_0x04d7;
                case 104: goto L_0x04d7;
                case 105: goto L_0x03dc;
                case 106: goto L_0x04c5;
                case 107: goto L_0x03d3;
                case 108: goto L_0x0181;
                case 109: goto L_0x03ca;
                case 110: goto L_0x03c1;
                case 111: goto L_0x03b8;
                case 112: goto L_0x0514;
                default: goto L_0x0199;
            }
        L_0x0199:
            r12 = 402(0x192, float:5.63E-43)
            switch(r0) {
                case 401: goto L_0x01aa;
                case 402: goto L_0x044b;
                case 403: goto L_0x051c;
                case 404: goto L_0x039c;
                case 405: goto L_0x04b4;
                case 406: goto L_0x025f;
                case 407: goto L_0x025f;
                case 408: goto L_0x021e;
                case 409: goto L_0x0181;
                case 410: goto L_0x024c;
                case 411: goto L_0x039c;
                case 412: goto L_0x0492;
                case 413: goto L_0x0243;
                case 414: goto L_0x023a;
                case 415: goto L_0x0393;
                case 416: goto L_0x04ac;
                default: goto L_0x019e;
            }
        L_0x019e:
            switch(r0) {
                case 420: goto L_0x0216;
                case 421: goto L_0x020e;
                case 422: goto L_0x0231;
                case 423: goto L_0x0393;
                case 424: goto L_0x03af;
                default: goto L_0x01a1;
            }
        L_0x01a1:
            switch(r0) {
                case 601: goto L_0x0206;
                case 602: goto L_0x0206;
                case 603: goto L_0x01fe;
                case 604: goto L_0x0439;
                case 605: goto L_0x01f6;
                case 606: goto L_0x01ee;
                case 607: goto L_0x01e6;
                case 608: goto L_0x01de;
                default: goto L_0x01a4;
            }
        L_0x01a4:
            switch(r0) {
                case 801: goto L_0x01d6;
                case 802: goto L_0x01ce;
                case 803: goto L_0x01c6;
                case 804: goto L_0x01ce;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            switch(r0) {
                case 901: goto L_0x01be;
                case 902: goto L_0x01b6;
                case 903: goto L_0x01c6;
                case 904: goto L_0x01b6;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890474(0x7f12112a, float:1.941564E38)
        L_0x01b1:
            java.lang.String r10 = r4.getString(r0)
            goto L_0x0181
        L_0x01b6:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890472(0x7f121128, float:1.9415637E38)
            goto L_0x01b1
        L_0x01be:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890469(0x7f121125, float:1.941563E38)
            goto L_0x01b1
        L_0x01c6:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890468(0x7f121124, float:1.9415629E38)
            goto L_0x01b1
        L_0x01ce:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890471(0x7f121127, float:1.9415635E38)
            goto L_0x01b1
        L_0x01d6:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890470(0x7f121126, float:1.9415633E38)
            goto L_0x01b1
        L_0x01de:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890572(0x7f12118c, float:1.941584E38)
            goto L_0x01b1
        L_0x01e6:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890574(0x7f12118e, float:1.9415844E38)
            goto L_0x01b1
        L_0x01ee:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890577(0x7f121191, float:1.941585E38)
            goto L_0x01b1
        L_0x01f6:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890464(0x7f121120, float:1.941562E38)
            goto L_0x01b1
        L_0x01fe:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890575(0x7f12118f, float:1.9415846E38)
            goto L_0x01b1
        L_0x0206:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890576(0x7f121190, float:1.9415848E38)
            goto L_0x01b1
        L_0x020e:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892256(0x7f121820, float:1.9419255E38)
            goto L_0x01b1
        L_0x0216:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892245(0x7f121815, float:1.9419233E38)
            goto L_0x01b1
        L_0x021e:
            X.1W2 r0 = r8.A0A
            if (r0 == 0) goto L_0x0231
            int r0 = r0.A06()
            if (r0 != r12) goto L_0x0231
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r1 = 2131892253(0x7f12181d, float:1.941925E38)
            goto L_0x0523
        L_0x0231:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892252(0x7f12181c, float:1.9419247E38)
            goto L_0x01b1
        L_0x023a:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892223(0x7f1217ff, float:1.9419188E38)
            goto L_0x01b1
        L_0x0243:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892224(0x7f121800, float:1.941919E38)
            goto L_0x01b1
        L_0x024c:
            java.lang.String r1 = r8.A0G
            java.lang.String r0 = "BR"
            boolean r1 = r1.equals(r0)
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            if (r1 == 0) goto L_0x04a8
            r0 = 2131892235(0x7f12180b, float:1.9419213E38)
            goto L_0x01b1
        L_0x025f:
            java.lang.String r0 = r8.A0J
            if (r0 == 0) goto L_0x0393
            if (r6 == 0) goto L_0x0393
            int r1 = X.C29501aj.A00(r0, r1)
            boolean r0 = r6.AJm(r1)
            if (r0 == 0) goto L_0x0298
            X.0tz r0 = r5.A01
            android.content.Context r11 = r0.A00
            r10 = 2131892239(0x7f12180f, float:1.941922E38)
            java.lang.Object[] r12 = new java.lang.Object[r9]
            int r0 = r6.ALT()
            X.AnonymousClass000.A1M(r12, r0, r3)
            X.1Vz r9 = r8.A00()
            X.013 r4 = r5.A02
            int r1 = r6.ALS()
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.lang.String r0 = r9.A9I(r4, r0, r3)
            java.lang.String r10 = X.C13680ns.A0d(r11, r0, r12, r2, r10)
            goto L_0x0181
        L_0x0298:
            boolean r0 = r6.AIy(r1)
            if (r0 == 0) goto L_0x02af
            X.0tz r0 = r5.A01
            android.content.Context r2 = r0.A00
            r0 = 2131892179(0x7f1217d3, float:1.9419099E38)
        L_0x02a5:
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r10 = r6.AC1(r1, r0)
            goto L_0x0181
        L_0x02af:
            boolean r0 = r6.AJ0(r1)
            if (r0 == 0) goto L_0x02bd
            X.0tz r0 = r5.A01
            android.content.Context r2 = r0.A00
            r0 = 2131892183(0x7f1217d7, float:1.9419107E38)
            goto L_0x02a5
        L_0x02bd:
            boolean r0 = r6.AJ4(r1)
            if (r0 == 0) goto L_0x02cb
            X.0tz r0 = r5.A01
            android.content.Context r2 = r0.A00
            r0 = 2131892181(0x7f1217d5, float:1.9419103E38)
            goto L_0x02a5
        L_0x02cb:
            boolean r0 = r6.AIi(r1)
            if (r0 == 0) goto L_0x02d9
            X.0tz r0 = r5.A01
            android.content.Context r2 = r0.A00
            r0 = 2131892254(0x7f12181e, float:1.9419251E38)
            goto L_0x02a5
        L_0x02d9:
            boolean r0 = r6.AJ3(r1)
            if (r0 == 0) goto L_0x02e8
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892186(0x7f1217da, float:1.9419113E38)
            goto L_0x01b1
        L_0x02e8:
            boolean r0 = r6.AJ2(r1)
            if (r0 == 0) goto L_0x02f7
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892185(0x7f1217d9, float:1.9419111E38)
            goto L_0x01b1
        L_0x02f7:
            boolean r0 = r6.AJ1(r1)
            if (r0 == 0) goto L_0x0306
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892184(0x7f1217d8, float:1.941911E38)
            goto L_0x01b1
        L_0x0306:
            boolean r0 = r6.AJ5(r1)
            if (r0 == 0) goto L_0x0315
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892182(0x7f1217d6, float:1.9419105E38)
            goto L_0x01b1
        L_0x0315:
            boolean r0 = r6.AJQ(r1)
            if (r0 == 0) goto L_0x0324
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892195(0x7f1217e3, float:1.9419131E38)
            goto L_0x01b1
        L_0x0324:
            boolean r0 = r6.AJp(r1)
            if (r0 == 0) goto L_0x0333
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892198(0x7f1217e6, float:1.9419138E38)
            goto L_0x01b1
        L_0x0333:
            boolean r0 = r6.AJB(r1)
            if (r0 != 0) goto L_0x038a
            boolean r0 = r6.AJ9(r1)
            if (r0 != 0) goto L_0x038a
            boolean r0 = r6.AJA(r1)
            if (r0 == 0) goto L_0x034e
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892189(0x7f1217dd, float:1.941912E38)
            goto L_0x01b1
        L_0x034e:
            boolean r0 = r6.AJF(r1)
            if (r0 == 0) goto L_0x035d
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892187(0x7f1217db, float:1.9419115E38)
            goto L_0x01b1
        L_0x035d:
            boolean r0 = r6.AJG(r1)
            if (r0 == 0) goto L_0x036c
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892188(0x7f1217dc, float:1.9419117E38)
            goto L_0x01b1
        L_0x036c:
            boolean r0 = r6.AJP(r1)
            if (r0 == 0) goto L_0x037b
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892194(0x7f1217e2, float:1.941913E38)
            goto L_0x01b1
        L_0x037b:
            java.lang.String r10 = r6.AFX(r1)
            if (r10 != 0) goto L_0x0181
            X.0tz r0 = r5.A01
            android.content.Context r2 = r0.A00
            r0 = 2131892232(0x7f121808, float:1.9419206E38)
            goto L_0x02a5
        L_0x038a:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892190(0x7f1217de, float:1.9419121E38)
            goto L_0x01b1
        L_0x0393:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892232(0x7f121808, float:1.9419206E38)
            goto L_0x01b1
        L_0x039c:
            X.1W2 r0 = r8.A0A
            if (r0 == 0) goto L_0x03af
            int r0 = r0.A06()
            if (r0 != r12) goto L_0x03af
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r1 = 2131892255(0x7f12181f, float:1.9419253E38)
            goto L_0x0523
        L_0x03af:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892254(0x7f12181e, float:1.9419251E38)
            goto L_0x01b1
        L_0x03b8:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131893708(0x7f121dcc, float:1.94222E38)
            goto L_0x01b1
        L_0x03c1:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131893707(0x7f121dcb, float:1.9422198E38)
            goto L_0x01b1
        L_0x03ca:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131893709(0x7f121dcd, float:1.9422202E38)
            goto L_0x01b1
        L_0x03d3:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892249(0x7f121819, float:1.941924E38)
            goto L_0x01b1
        L_0x03dc:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890467(0x7f121123, float:1.9415627E38)
            goto L_0x01b1
        L_0x03e5:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            if (r13 == 0) goto L_0x05c7
            r0 = 2131890354(0x7f1210b2, float:1.9415397E38)
            goto L_0x01b1
        L_0x03f0:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            if (r13 == 0) goto L_0x0401
            r1 = 2131890356(0x7f1210b4, float:1.9415401E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r10 = X.C13680ns.A0d(r4, r9, r0, r3, r1)
            goto L_0x0181
        L_0x0401:
            r0 = 2131890355(0x7f1210b3, float:1.94154E38)
            goto L_0x01b1
        L_0x0406:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            if (r13 == 0) goto L_0x0417
            r1 = 2131890358(0x7f1210b6, float:1.9415406E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r10 = X.C13680ns.A0d(r4, r9, r0, r3, r1)
            goto L_0x0181
        L_0x0417:
            r0 = 2131890357(0x7f1210b5, float:1.9415404E38)
            goto L_0x01b1
        L_0x041c:
            if (r6 == 0) goto L_0x0430
            java.lang.String r0 = r8.A0J
            int r0 = X.C29501aj.A00(r0, r1)
            java.lang.String r10 = r6.ABB(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0430
            goto L_0x0181
        L_0x0430:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890347(0x7f1210ab, float:1.9415383E38)
            goto L_0x01b1
        L_0x0439:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131890463(0x7f12111f, float:1.9415619E38)
            goto L_0x01b1
        L_0x0442:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892225(0x7f121801, float:1.9419192E38)
            goto L_0x01b1
        L_0x044b:
            java.lang.Long r0 = r4.A0F(r8)
            if (r0 == 0) goto L_0x0181
            long r0 = r0.longValue()
            java.lang.String r10 = r4.A0G(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 != 0) goto L_0x0474
            X.0tz r0 = r5.A01
            android.content.res.Resources r4 = X.C16980tz.A00(r0)
            r1 = 2131755378(0x7f100172, float:1.9141634E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r3] = r11
            r0[r2] = r10
            java.lang.String r10 = r4.getQuantityString(r1, r2, r0)
            goto L_0x0181
        L_0x0474:
            r12 = 0
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            if (r9 <= 0) goto L_0x0489
            r1 = 2131892246(0x7f121816, float:1.9419235E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r10 = X.C13680ns.A0d(r4, r11, r0, r3, r1)
            goto L_0x0181
        L_0x0489:
            r0 = 2131892244(0x7f121814, float:1.941923E38)
            java.lang.String r10 = r4.getString(r0)
            goto L_0x0181
        L_0x0492:
            X.0tz r0 = r5.A01
            android.content.Context r5 = r0.A00
            r4 = 2131892247(0x7f121817, float:1.9419237E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            X.AnonymousClass000.A1M(r1, r9, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.String r10 = X.C13680ns.A0d(r5, r0, r1, r2, r4)
            goto L_0x0181
        L_0x04a8:
            r1 = 2131892233(0x7f121809, float:1.9419209E38)
            goto L_0x0523
        L_0x04ac:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r1 = 2131892258(0x7f121822, float:1.941926E38)
            goto L_0x0523
        L_0x04b4:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            boolean r0 = X.AnonymousClass5wT.A00(r8)
            r1 = 2131889917(0x7f120efd, float:1.9414511E38)
            if (r0 == 0) goto L_0x0523
            r1 = 2131889908(0x7f120ef4, float:1.9414493E38)
            goto L_0x0523
        L_0x04c5:
            X.0tz r0 = r5.A01
            android.content.Context r3 = r0.A00
            boolean r0 = X.AnonymousClass5wT.A00(r8)
            r1 = 2131889916(0x7f120efc, float:1.941451E38)
            if (r0 == 0) goto L_0x05f3
            r1 = 2131889907(0x7f120ef3, float:1.941449E38)
            goto L_0x05f3
        L_0x04d7:
            X.0tz r0 = r5.A01
            android.content.Context r5 = r0.A00
            r4 = 2131892229(0x7f121805, float:1.94192E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            X.AnonymousClass000.A1M(r1, r9, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.String r10 = X.C13680ns.A0d(r5, r0, r1, r2, r4)
            goto L_0x0181
        L_0x04ed:
            java.lang.Long r0 = r4.A0F(r8)
            if (r0 == 0) goto L_0x0181
            long r0 = r0.longValue()
            java.lang.String r9 = r4.A0G(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L_0x05e3
            X.0tz r0 = r5.A01
            android.content.res.Resources r4 = X.C16980tz.A00(r0)
            r1 = 2131755379(0x7f100173, float:1.9141636E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r9
            java.lang.String r10 = r4.getQuantityString(r1, r2, r0)
            goto L_0x0181
        L_0x0514:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r1 = 2131892250(0x7f12181a, float:1.9419243E38)
            goto L_0x0523
        L_0x051c:
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            r1 = 2131892243(0x7f121813, float:1.9419229E38)
        L_0x0523:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r10 = X.C13680ns.A0d(r4, r11, r0, r3, r1)
            goto L_0x0181
        L_0x052b:
            int r1 = r8.A03
            r0 = 20
            if (r1 != r0) goto L_0x0577
            X.0sK r1 = r5.A00
            com.whatsapp.jid.UserJid r0 = r8.A0E
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x0577
            java.lang.Long r0 = r4.A0F(r8)
            if (r0 == 0) goto L_0x0181
            long r0 = r0.longValue()
            android.util.Pair r10 = r4.A0C(r0)
            if (r10 == 0) goto L_0x0566
            X.0tz r0 = r5.A01
            android.content.res.Resources r9 = X.C16980tz.A00(r0)
            r5 = 2131755376(0x7f100170, float:1.914163E38)
            java.lang.Object r0 = r10.first
            int r4 = X.AnonymousClass000.A0D(r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r0 = r10.second
            r1[r3] = r0
            java.lang.String r10 = r9.getQuantityString(r5, r4, r1)
            goto L_0x0181
        L_0x0566:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            X.0tz r0 = r5.A01
            android.content.Context r3 = r0.A00
            r1 = 2131892226(0x7f121802, float:1.9419194E38)
            if (r2 <= 0) goto L_0x05f3
            r1 = 2131892227(0x7f121803, float:1.9419196E38)
            goto L_0x05f3
        L_0x0577:
            X.AnonymousClass00B.A06(r9)
            java.lang.Long r0 = r4.A0F(r8)
            if (r0 == 0) goto L_0x0181
            long r0 = r0.longValue()
            android.util.Pair r10 = r4.A0C(r0)
            if (r10 == 0) goto L_0x05a9
            X.0tz r0 = r5.A01
            android.content.res.Resources r11 = X.C16980tz.A00(r0)
            r5 = 2131755377(0x7f100171, float:1.9141632E38)
            java.lang.Object r0 = r10.first
            int r4 = X.AnonymousClass000.A0D(r0)
            java.lang.Object[] r1 = X.C13690nt.A1Z()
            r1[r3] = r9
            java.lang.Object r0 = r10.second
            r1[r2] = r0
            java.lang.String r10 = r11.getQuantityString(r5, r4, r1)
            goto L_0x0181
        L_0x05a9:
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            X.0tz r0 = r5.A01
            android.content.Context r4 = r0.A00
            if (r10 <= 0) goto L_0x05be
            r1 = 2131892228(0x7f121804, float:1.9419198E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r10 = X.C13680ns.A0d(r4, r9, r0, r3, r1)
            goto L_0x0181
        L_0x05be:
            r0 = 2131892226(0x7f121802, float:1.9419194E38)
            java.lang.String r10 = r4.getString(r0)
            goto L_0x0181
        L_0x05c7:
            r1 = 2131890353(0x7f1210b1, float:1.9415395E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r10 = X.C13680ns.A0d(r4, r12, r0, r3, r1)
            goto L_0x0181
        L_0x05d2:
            X.0tz r0 = r5.A01
            android.content.Context r3 = r0.A00
            boolean r0 = r8.A0E()
            r1 = 2131892230(0x7f121806, float:1.9419202E38)
            if (r0 == 0) goto L_0x05f3
            r1 = 2131890346(0x7f1210aa, float:1.9415381E38)
            goto L_0x05f3
        L_0x05e3:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            X.0tz r0 = r5.A01
            android.content.Context r3 = r0.A00
            r1 = 2131892244(0x7f121814, float:1.941923E38)
            if (r2 <= 0) goto L_0x05f3
            r1 = 2131892248(0x7f121818, float:1.9419239E38)
        L_0x05f3:
            java.lang.String r10 = r3.getString(r1)
            goto L_0x0181
        L_0x05f9:
            r12 = r9
            r13 = 0
            goto L_0x0165
        L_0x05fd:
            boolean r0 = r6.AJE(r2)
            if (r0 == 0) goto L_0x0611
            X.0tz r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892191(0x7f1217df, float:1.9419123E38)
            if (r4 != 0) goto L_0x009f
            r0 = 2131892192(0x7f1217e0, float:1.9419125E38)
            goto L_0x009f
        L_0x0611:
            boolean r0 = r6.AIy(r2)
            if (r0 == 0) goto L_0x0640
            X.0wS r0 = r5.A03
            X.19r r0 = r0.A03()
            boolean r0 = r0.A5y()
            if (r0 == 0) goto L_0x0640
            X.0tz r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892179(0x7f1217d3, float:1.9419099E38)
            if (r4 == 0) goto L_0x009f
            r0 = 2131892180(0x7f1217d4, float:1.94191E38)
            goto L_0x009f
        L_0x0631:
            boolean r0 = r6.AJW(r2)
            if (r0 == 0) goto L_0x0640
            X.0tz r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892238(0x7f12180e, float:1.9419219E38)
            goto L_0x009f
        L_0x0640:
            int r1 = r8.A02
            r0 = 14
            if (r1 == r0) goto L_0x0656
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x064d
            r0 = 0
            goto L_0x00a3
        L_0x064d:
            X.0tz r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892251(0x7f12181b, float:1.9419245E38)
            goto L_0x009f
        L_0x0656:
            X.0tz r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131890465(0x7f121121, float:1.9415623E38)
            goto L_0x009f
        L_0x065f:
            r0 = 2131892170(0x7f1217ca, float:1.941908E38)
            java.lang.String r0 = r5.getString(r0)
            r7.A06 = r0
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110755em.A0N(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (X.AnonymousClass5wT.A00(r5) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(java.util.List r10) {
        /*
            r9 = this;
            r6 = r9
            X.5sx r0 = r9.A07
            X.1Vt r5 = r0.A01
            X.1cl r4 = r0.A00
            X.5mn r2 = new X.5mn
            r2.<init>()
            X.0w8 r0 = r9.A0b
            X.0pd r1 = r0.A03
            r0 = 1359(0x54f, float:1.904E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0021
            boolean r1 = X.AnonymousClass5wT.A00(r5)
            r0 = 1
            r7 = 22
            if (r1 != 0) goto L_0x0024
        L_0x0021:
            r0 = 0
            r7 = 10
        L_0x0024:
            r8 = 1
            com.facebook.redex.IDxCListenerShape0S0301000_3_I1 r3 = new com.facebook.redex.IDxCListenerShape0S0301000_3_I1
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A00 = r3
            r2.A01 = r0
            r10.add(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110755em.A0O(java.util.List):void");
    }

    public void A0P(List list) {
        C117415sx r0;
        C113775mb r1;
        int i2;
        C117415sx r02;
        if (this instanceof C114155nD) {
            A0H(list);
            A0M(list);
            A0J(list);
            A0L(list);
            if (this.A0b.A03.A0C(1905) && (r02 = this.A07) != null && this.A0i.A0b(r02.A01)) {
                r1 = new C113775mb();
                i2 = 122;
            }
            A0N(list);
            A0K(list);
        }
        boolean z2 = this instanceof C114165nE;
        A0H(list);
        A0M(list);
        A0J(list);
        if (z2) {
            A0L(list);
            if (this.A0b.A03.A0C(1905) && (r0 = this.A07) != null && this.A0i.A0b(r0.A01)) {
                r1 = new C113775mb();
                i2 = 117;
            }
        } else {
            A0L(list);
        }
        A0N(list);
        A0K(list);
        r1.A00 = C110115dX.A06(this, i2);
        list.add(r1);
        A0N(list);
        A0K(list);
    }

    public void A0Q(List list) {
        AnonymousClass1Vt r3 = this.A07.A01;
        if (this.A0b.A03.A0C(1359) && r3.A03 == 100 && r3.A0F()) {
            C113845mi r2 = new C113845mi();
            r2.A00 = new IDxCListenerShape33S0200000_3_I1(r3, 31, this);
            list.add(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cc, code lost:
        r1 = r6.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(java.util.List r10) {
        /*
            r9 = this;
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            X.5r4 r0 = r9.A06()
            if (r0 == 0) goto L_0x009c
            A02(r10)
            r10.add(r0)
        L_0x0010:
            X.0w8 r2 = r9.A0b
            X.0pd r1 = r2.A03
            r0 = 2208(0x8a0, float:3.094E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r2.A0A()
            if (r0 != 0) goto L_0x0028
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x0030
        L_0x0028:
            X.5sx r0 = r9.A07
            if (r0 != 0) goto L_0x0040
            r6 = 0
        L_0x002d:
            r3.add(r6)
        L_0x0030:
            X.5sx r0 = r9.A07
            r2 = 0
            if (r0 == 0) goto L_0x0127
            X.1Vt r6 = r0.A01
            X.1cl r4 = r0.A00
            r8 = 0
            r7 = 1
            if (r4 == 0) goto L_0x0127
            monitor-enter(r6)
            goto L_0x00c6
        L_0x0040:
            X.1Vt r1 = r0.A01
            X.5mv r6 = new X.5mv
            r6.<init>()
            X.0tz r0 = r9.A0P
            android.content.Context r7 = r0.A00
            r0 = 2131890122(0x7f120fca, float:1.9414927E38)
            java.lang.String r0 = r7.getString(r0)
            r6.A04 = r0
            int r1 = r1.A03
            r0 = 100
            if (r1 == r0) goto L_0x008e
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x008e
            r5 = 2131231862(0x7f080476, float:1.8079817E38)
            r4 = 2131892268(0x7f12182c, float:1.941928E38)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131166728(0x7f070608, float:1.794771E38)
        L_0x006b:
            float r0 = r1.getDimension(r0)
            int r2 = (int) r0
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r7, r5)
            java.lang.String r0 = r7.getString(r4)
            r6.A03 = r0
            if (r1 == 0) goto L_0x002d
            r0 = 2131101457(0x7f060711, float:1.7815324E38)
            int r0 = X.AnonymousClass00T.A00(r7, r0)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass2SR.A06(r1, r0)
            r6.A00 = r1
            r0 = 0
            r1.setBounds(r0, r0, r2, r2)
            goto L_0x002d
        L_0x008e:
            r5 = 2131231062(0x7f080156, float:1.8078194E38)
            r4 = 2131892269(0x7f12182d, float:1.9419282E38)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131166726(0x7f070606, float:1.7947705E38)
            goto L_0x006b
        L_0x009c:
            X.5sx r0 = r9.A07
            r1 = 0
            if (r0 == 0) goto L_0x00b3
            X.0tZ r2 = r0.A02
            if (r2 == 0) goto L_0x00b3
            boolean r0 = r2 instanceof X.C30581cc
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = r2.A0I()
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)
            if (r0 == 0) goto L_0x00b8
        L_0x00b3:
            r3.add(r1)
            goto L_0x0010
        L_0x00b8:
            boolean r1 = r2 instanceof X.C38641rB
            r0 = 205(0xcd, float:2.87E-43)
            if (r1 == 0) goto L_0x00c0
            r0 = 209(0xd1, float:2.93E-43)
        L_0x00c0:
            X.5mf r1 = new X.5mf
            r1.<init>(r2, r0)
            goto L_0x00b3
        L_0x00c6:
            boolean r0 = r6.A0E()     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x00e3
            int r1 = r6.A02     // Catch:{ all -> 0x00e0 }
            r0 = 13
            if (r1 == r0) goto L_0x00de
            r0 = 14
            if (r1 == r0) goto L_0x00de
            r0 = 15
            if (r1 == r0) goto L_0x00de
            r0 = 16
            if (r1 != r0) goto L_0x00e3
        L_0x00de:
            r0 = 1
            goto L_0x00e4
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            monitor-exit(r6)
            if (r0 != 0) goto L_0x0127
            java.lang.String r1 = r9.A0B
            java.lang.String r0 = "non_native"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0189
            X.0tz r0 = r9.A0P
            android.content.Context r5 = r0.A00
            r0 = 2131892217(0x7f1217f9, float:1.9419176E38)
        L_0x00f8:
            java.lang.String r0 = r5.getString(r0)
            X.5mv r2 = new X.5mv
            r2.<init>()
            r2.A04 = r0
            X.0wS r0 = r9.A0c
            java.lang.String r0 = X.C119405xi.A05(r5, r4, r0, r7)
            r2.A03 = r0
            int r1 = r6.A03
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0116
            boolean r0 = r4 instanceof X.C111785hP
            if (r0 != 0) goto L_0x0116
            r8 = 1
        L_0x0116:
            X.5sx r0 = r9.A07
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0127
            if (r8 == 0) goto L_0x0127
            r1 = 30
            com.facebook.redex.IDxCListenerShape33S0200000_3_I1 r0 = new com.facebook.redex.IDxCListenerShape33S0200000_3_I1
            r0.<init>(r4, r1, r9)
            r2.A01 = r0
        L_0x0127:
            r3.add(r2)
            X.5r4 r0 = r9.A07()
            r3.add(r0)
            r4 = r9
            boolean r0 = r9 instanceof X.C114175nF
            if (r0 == 0) goto L_0x0184
            X.5nF r4 = (X.C114175nF) r4
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            X.5sx r0 = r4.A07
            X.1Vt r0 = r0.A01
            X.1W2 r1 = r0.A0A
            X.5hW r1 = (X.C111855hW) r1
            r4.A0e(r2)
            X.5sx r0 = r4.A07
            X.1Vt r0 = r0.A01
            int r0 = r0.A02
            r4.A0c(r1, r2, r0)
        L_0x0150:
            r3.addAll(r2)
        L_0x0153:
            r0 = 0
            boolean r0 = r3.remove(r0)
            if (r0 != 0) goto L_0x0153
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x01a6
            A02(r10)
            r1 = 0
        L_0x0164:
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x01a6
            java.lang.Object r0 = r3.get(r1)
            r10.add(r0)
            int r0 = r3.size()
            int r0 = r0 + -1
            if (r1 == r0) goto L_0x0181
            X.5mZ r0 = new X.5mZ
            r0.<init>()
            r10.add(r0)
        L_0x0181:
            int r1 = r1 + 1
            goto L_0x0164
        L_0x0184:
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            goto L_0x0150
        L_0x0189:
            int r2 = r6.A03
            if (r2 == r7) goto L_0x019d
            r1 = 100
            X.0tz r0 = r9.A0P
            android.content.Context r5 = r0.A00
            r0 = 2131892218(0x7f1217fa, float:1.9419178E38)
            if (r2 == r1) goto L_0x00f8
            r0 = 2131892203(0x7f1217eb, float:1.9419148E38)
            goto L_0x00f8
        L_0x019d:
            X.0tz r0 = r9.A0P
            android.content.Context r5 = r0.A00
            r0 = 2131892219(0x7f1217fb, float:1.941918E38)
            goto L_0x00f8
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110755em.A0R(java.util.List):void");
    }

    public void A0S(boolean z2) {
        C117725tS A002 = C117725tS.A00(1);
        A002.A0I = z2;
        A01(this, A002);
    }

    public void A0T(boolean z2) {
        C114625o5 r2;
        boolean z3 = z2;
        if (this instanceof C114085n6) {
            C114085n6 r22 = (C114085n6) this;
            if (r22.A06 == null) {
                C114145nC r1 = new C114145nC(r22, r22.A05, r22.A0A, r22.A0H, z3);
                r22.A06 = r1;
                C13680ns.A1U(r1, r22.A0j);
            }
        } else if (this.A06 == null) {
            String str = this.A0B;
            if ("native".equals(str)) {
                r2 = new C114625o5(this, this.A08, this.A0C, z2);
            } else if ("non_native".equals(str)) {
                r2 = new C114135nB(this, this.A08, this.A0C, z2);
            } else {
                C110105dW.A1O("PaymentTransactionDetailsViewModel", "unsupported payment receipt type");
                return;
            }
            this.A06 = r2;
            C13680ns.A1U(r2, this.A0j);
        }
    }

    public boolean A0U(AnonymousClass1Vt r5) {
        return this.A0i.A0c(r5, A05().AB6(), A05().ADT(), 1);
    }

    public void AUd() {
        A0T(false);
    }
}

package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.obwhatsapp.payments.IDxRCallbackShape18S0200000_2_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0wU  reason: invalid class name and case insensitive filesystem */
public class C18310wU {
    public final C16300so A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C17130ua A03;
    public final C16440t3 A04;
    public final C16980tz A05;
    public final C16460t6 A06;
    public final AnonymousClass160 A07;
    public final C17190ug A08;
    public final AnonymousClass175 A09;
    public final AnonymousClass17P A0A;
    public final C18340wX A0B;
    public final AnonymousClass17O A0C;
    public final C18300wT A0D;
    public final AnonymousClass174 A0E;
    public final C18090w8 A0F;
    public final C18290wS A0G;
    public final AnonymousClass1HQ A0H;
    public final AnonymousClass1Vo A0I = AnonymousClass1Vo.A00("PaymentsActionManager", "network", "COMMON");
    public final AnonymousClass1TT A0J;
    public final C18280wR A0K;
    public final C224718b A0L;
    public final AnonymousClass1HB A0M;
    public final C222617g A0N;
    public final C17670vS A0O;

    public C18310wU(C16300so r4, C14870pt r5, C16040sK r6, C17130ua r7, C16440t3 r8, C16980tz r9, C16460t6 r10, AnonymousClass160 r11, C17190ug r12, AnonymousClass175 r13, AnonymousClass17P r14, C18340wX r15, AnonymousClass17O r16, C18300wT r17, AnonymousClass174 r18, C18090w8 r19, C18290wS r20, AnonymousClass1HQ r21, AnonymousClass1TT r22, C18280wR r23, C224718b r24, AnonymousClass1HB r25, C222617g r26, C17670vS r27) {
        this.A05 = r9;
        this.A04 = r8;
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = r6;
        this.A03 = r7;
        this.A07 = r11;
        this.A08 = r12;
        this.A0N = r26;
        this.A0K = r23;
        this.A0G = r20;
        this.A06 = r10;
        this.A0O = r27;
        this.A0L = r24;
        this.A0D = r17;
        this.A09 = r13;
        this.A0J = r22;
        this.A0M = r25;
        this.A0F = r19;
        this.A0E = r18;
        this.A0A = r14;
        this.A0H = r21;
        this.A0B = r15;
        this.A0C = r16;
    }

    public C35431lv A00(C28411Vz r6, C28401Vy r7) {
        int ABG = A03(r6).ABG(((C35491m1) r6).A04);
        long doubleValue = (long) ((int) (r7.A00.doubleValue() * ((double) ABG)));
        return ABG <= 0 ? new C35431lv(r6, 1, doubleValue) : new C35431lv(r6, ABG, doubleValue);
    }

    public final C35431lv A01(C28411Vz r6, C28401Vy r7) {
        C228919r A032 = A03(r6);
        int ABG = A032 != null ? A032.ABG(((C35491m1) r6).A04) : 1000;
        long doubleValue = (long) ((int) (r7.A00.doubleValue() * ((double) ABG)));
        return ABG <= 0 ? new C35431lv(r6, 1, doubleValue) : new C35431lv(r6, ABG, doubleValue);
    }

    public AnonymousClass1Vt A02(C28411Vz r5, C28401Vy r6, C30671cl r7, AnonymousClass1W2 r8, C35361lo r9, C16740tZ r10, String str, String str2, boolean z2) {
        if (!A0J(r5, r6, r7, r8, r9, r10, str, str2, z2)) {
            return null;
        }
        this.A06.A0u(r10);
        AnonymousClass17P r3 = this.A0A;
        String str3 = r10.A11.A01;
        AnonymousClass1Vt r1 = r10.A0L;
        synchronized (r3) {
            if (r1 != null) {
                r3.A03.put(str3, r1);
            }
        }
        this.A0H.A00(r9, r10);
        AnonymousClass1Vt r0 = r10.A0L;
        AnonymousClass00B.A06(r0);
        return r0;
    }

    public final C228919r A03(C28411Vz r3) {
        return this.A0G.A02(this.A0E.A01().A03).AEp(((C35491m1) r3).A04);
    }

    public C28371Vv A04(C28411Vz r11, C28401Vy r12, String str) {
        C28411Vz r5 = r11;
        int ABG = A03(r11).ABG(((C35491m1) r5).A04);
        return A05(r5, str, ABG, (long) ((int) (r12.A00.doubleValue() * ((double) ABG))));
    }

    public C28371Vv A05(C28411Vz r5, String str, int i2, long j2) {
        C228919r A032 = A03(r5);
        return new C28371Vv(A032 != null ? A032.ADq(i2 <= 0 ? new C35431lv(r5, 1, j2) : new C35431lv(r5, i2, j2)) : null, str, (C35081lL[]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        if (r1 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass2HF r9, X.C28371Vv r10, boolean r11) {
        /*
            r8 = this;
            java.lang.String r0 = "account"
            X.1Vv r1 = r10.A0J(r0)
            X.1HB r0 = r8.A0M
            java.util.ArrayList r1 = r0.A04(r1)
            r3 = r9
            if (r1 == 0) goto L_0x0091
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0091
            r2 = 0
            boolean r0 = X.AnonymousClass160.A04(r1)
            if (r0 == 0) goto L_0x008b
            X.0wS r0 = r8.A0G
            r0.A06()
            X.1xv r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            X.AnonymousClass00B.A06(r0)
            r0.A03(r9, r1)
        L_0x002c:
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x00b3
            java.util.Iterator r2 = r1.iterator()
        L_0x0036:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r1 = r2.next()
            X.1cl r1 = (X.C30671cl) r1
            boolean r0 = r1 instanceof X.C35391lr
            if (r0 == 0) goto L_0x0036
            int r1 = r1.A01
            r0 = 2
            if (r1 != r0) goto L_0x0036
            X.0wT r5 = r8.A0D
            r2 = 1
        L_0x004e:
            android.content.SharedPreferences r0 = r5.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "payments_card_can_receive_payment"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            X.0t3 r0 = r5.A01
            long r3 = r0.A00()
            android.content.SharedPreferences r0 = r5.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "payments_methods_last_sync_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r3)
            r0.apply()
            X.1Vo r2 = r5.A02
            java.lang.String r1 = "updateMethodsLastSyncTimeMilli to: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.A06(r0)
        L_0x008a:
            return
        L_0x008b:
            if (r11 == 0) goto L_0x008a
            r8.A08(r2)
            return
        L_0x0091:
            X.0wS r0 = r8.A0G
            r0.A06()
            X.1xv r4 = r0.A00
            X.AnonymousClass00B.A06(r4)
            X.AnonymousClass00B.A06(r4)
            X.0sq r7 = r4.A03
            X.160 r5 = r4.A01
            X.1GR r6 = r4.A02
            X.2HG r2 = new X.2HG
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r7.Ack(r2, r0)
            if (r1 == 0) goto L_0x00b3
            goto L_0x002c
        L_0x00b3:
            X.0wT r5 = r8.A0D
            r2 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18310wU.A06(X.2HF, X.1Vv, boolean):void");
    }

    public void A07(C28401Vy r2, C35361lo r3, UserJid userJid, C16740tZ r5) {
        if (A0K(r2, r3, userJid, r5)) {
            this.A06.A0u(r5);
        }
    }

    @Deprecated
    public void A08(AnonymousClass1TV r3) {
        A09(r3, this.A0G.A03(), 3);
    }

    public void A09(AnonymousClass1TV r16, C228919r r17, int i2) {
        SharedPreferences sharedPreferences;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35081lL("version", i2));
        arrayList.add(new C35081lL("action", "get-methods"));
        arrayList.add(new C35081lL("device-id", this.A0K.A01()));
        AnonymousClass2HC r8 = new AnonymousClass2HC(new AnonymousClass2HB((C35081lL[]) arrayList.toArray(new C35081lL[0])));
        AnonymousClass1TT r3 = this.A0J;
        synchronized (r3) {
            sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A01.A00("com.obwhatsapp_payment_sync_preferences");
                r3.A00 = sharedPreferences;
            }
        }
        String string = sharedPreferences.getString(r8.A01.A00(), (String) null);
        if (string != null) {
            arrayList.add(new C35081lL("instance-id", string));
        }
        C28371Vv r11 = new C28371Vv("account", (C35081lL[]) arrayList.toArray(new C35081lL[0]));
        C228919r r7 = r17;
        C1222969a ACC = r7.ACC();
        if (ACC != null) {
            ACC.AgB();
        }
        AnonymousClass1TV r4 = r16;
        A0H(new AnonymousClass2HD(this.A05.A00, r4, this.A0B, this, r7, r8, this.A01, string), r11, "get", 0);
    }

    public void A0A(AnonymousClass1TV r11, C28371Vv r12) {
        Context context = this.A05.A00;
        C14870pt r3 = this.A01;
        IDxRCallbackShape18S0200000_2_I0 iDxRCallbackShape18S0200000_2_I0 = new IDxRCallbackShape18S0200000_2_I0(context, this.A0B, r3, r11, this, 1);
        A0H(iDxRCallbackShape18S0200000_2_I0, r12, "set", AnonymousClass1NO.A0L);
    }

    public void A0B(AnonymousClass1TV r11, C28371Vv r12) {
        Context context = this.A05.A00;
        C14870pt r3 = this.A01;
        IDxRCallbackShape18S0200000_2_I0 iDxRCallbackShape18S0200000_2_I0 = new IDxRCallbackShape18S0200000_2_I0(context, this.A0B, r3, r11, this, 0);
        A0H(iDxRCallbackShape18S0200000_2_I0, r12, "set", AnonymousClass1NO.A0L);
    }

    public void A0C(AnonymousClass1TV r6, C28371Vv r7, String str, String str2) {
        C28371Vv r0;
        if (TextUtils.isEmpty(str2)) {
            byte[] A012 = C224718b.A01(this.A02, this.A04, false);
            AnonymousClass00B.A06(A012);
            str2 = C004101u.A04(A012);
        }
        C35081lL[] r4 = {new C35081lL("action", "remove-credential"), new C35081lL("credential-id", str), new C35081lL("version", "2"), new C35081lL("nonce", str2)};
        if (r7 != null) {
            r0 = new C28371Vv(r7, "account", r4);
        }
        A0A(r6, r0);
    }

    public void A0D(AnonymousClass2HE r12, C28371Vv r13) {
        Context context = this.A05.A00;
        C14870pt r3 = this.A01;
        IDxRCallbackShape18S0200000_2_I0 iDxRCallbackShape18S0200000_2_I0 = new IDxRCallbackShape18S0200000_2_I0(context, this.A0B, r3, r12, this, 2);
        A0I(iDxRCallbackShape18S0200000_2_I0, r13, "set", "w:pay", AnonymousClass1NO.A0L);
    }

    public void A0E(C16740tZ r4) {
        AnonymousClass1Vo r2;
        String str;
        if (!this.A0F.A0C(0)) {
            r2 = this.A0I;
            StringBuilder sb = new StringBuilder("decline/cancelPaymentRequest is not enabled for country: ");
            sb.append(this.A0E.A01());
            str = sb.toString();
        } else if (r4.A11.A00 == null) {
            r2 = this.A0I;
            str = "requestPayment found null or empty args jid";
        } else {
            this.A06.A0u(r4);
            return;
        }
        r2.A06(str);
    }

    public void A0F(C19550yc r8, C28371Vv r9, String str) {
        A0I(r8, r9, str, "w:pay", AnonymousClass1NO.A0L);
    }

    public void A0G(C19550yc r8, C28371Vv r9, String str, long j2) {
        this.A08.A0A(r8, r9, str, 204, j2);
    }

    public void A0H(C19550yc r8, C28371Vv r9, String str, long j2) {
        A0I(r8, r9, str, "w:pay", j2);
    }

    public void A0I(C19550yc r12, C28371Vv r13, String str, String str2, long j2) {
        C17190ug r4 = this.A08;
        String A022 = r4.A02();
        C19550yc r5 = r12;
        r4.A0A(r5, new C28371Vv(r13, "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("type", str), new C35081lL("id", A022), new C35081lL("xmlns", str2)}), A022, 204, j2);
    }

    public boolean A0J(C28411Vz r34, C28401Vy r35, C30671cl r36, AnonymousClass1W2 r37, C35361lo r38, C16740tZ r39, String str, String str2, boolean z2) {
        AnonymousClass1Vo r2;
        StringBuilder sb;
        boolean A0L2;
        int i2;
        char c2;
        C30671cl r14;
        String str3;
        C30671cl r0 = r36;
        C16040sK r1 = this.A02;
        r1.A0B();
        C28881Zb r8 = r1.A01;
        AnonymousClass00B.A06(r8);
        ArrayList arrayList = null;
        if (!this.A0F.A0C(0)) {
            r2 = this.A0I;
            sb = new StringBuilder("sendPayment is not enabled for country: ");
            sb.append(this.A0E.A01());
        } else {
            C16740tZ r6 = r39;
            C15830rv r10 = r6.A11.A00;
            if (r10 == null || ((A0L2 = C16030sJ.A0L(r10)) && r6.A0B() == null)) {
                r2 = this.A0I;
                sb = new StringBuilder("sendPayment found null or empty args jid: ");
                sb.append(r10);
                sb.append(" receiver: ");
                sb.append(r6.A0B());
                sb.append(" payment methods: ");
            } else {
                C28401Vy r12 = r35;
                if (!r12.A02()) {
                    this.A0I.A06("sendPayment not sending payment; got invalid amount");
                    return false;
                }
                C28411Vz r9 = r34;
                C228919r A032 = A03(r9);
                C35431lv A012 = A01(r9, r12);
                AnonymousClass1W2 r32 = r37;
                AnonymousClass00B.A06(r32);
                AnonymousClass1W2 r22 = r32;
                r22.A01 = A012;
                if (r22.A02 != null) {
                    i2 = 2;
                } else {
                    i2 = 0;
                    if (z2) {
                        i2 = 1;
                    }
                }
                try {
                    AnonymousClass1Vo r3 = this.A0I;
                    r3.A06("sendPayment building payment to send amount");
                    UserJid userJid = (UserJid) r8.A0E;
                    if (A0L2) {
                        r10 = r6.A0B();
                    }
                    UserJid of = UserJid.of(r10);
                    String str4 = ((C35491m1) r9).A04;
                    AnonymousClass174 r31 = this.A0E;
                    C30681cm A013 = r31.A01();
                    AnonymousClass00B.A06(A013);
                    String str5 = A013.A03;
                    int AG1 = A032.AG1();
                    int i3 = 1;
                    if (z2) {
                        i3 = 100;
                    }
                    AnonymousClass1Vt A014 = AnonymousClass1W1.A01(r9, r12, userJid, of, str4, (String) null, str5, i3, 401, AnonymousClass1W0.A00(str5), AG1, i2, -1);
                    A014.A05(r38);
                    AnonymousClass160 r17 = this.A07;
                    List A0B2 = r17.A0B();
                    if (A0B2.size() <= 0) {
                        StringBuilder sb2 = new StringBuilder("sendPayment not sending payment; got no methods: ");
                        sb2.append(A0B2);
                        r3.A06(sb2.toString());
                        c2 = 7;
                    } else {
                        Iterator it = r17.A0B().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                r14 = null;
                                break;
                            }
                            r14 = (C30671cl) it.next();
                            if (r14.A01 == 1) {
                                break;
                            }
                        }
                        if (r14 != null && !TextUtils.isEmpty(r14.A0A)) {
                            int A042 = r14.A04();
                            if (A042 != r31.A01().A00) {
                                StringBuilder sb3 = new StringBuilder("sendPayment not sending payment; primary methods type ");
                                sb3.append(A042);
                                sb3.append(" does not match primary account type for country: ");
                                sb3.append(r31.A01().A00);
                                r3.A06(sb3.toString());
                                c2 = 3;
                            } else if (A042 != 3) {
                                StringBuilder sb4 = new StringBuilder("sendPayment not sending payment; primary method type unsupported: ");
                                sb4.append(A042);
                                r3.A06(sb4.toString());
                                c2 = 6;
                            } else {
                                C35371lp r142 = (C35371lp) r14;
                                C28401Vy r82 = r142.A01;
                                if (r82 == null || !r82.A02()) {
                                    StringBuilder sb5 = new StringBuilder("sendPayment not sending payment; got invalid balance: ");
                                    sb5.append(r82);
                                    r3.A06(sb5.toString());
                                    c2 = 5;
                                } else {
                                    ArrayList arrayList2 = new ArrayList(2);
                                    BigDecimal bigDecimal = r82.A00;
                                    BigDecimal bigDecimal2 = r12.A00;
                                    if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                                        arrayList2.add(new C35401ls(r12, r142, 1));
                                    } else {
                                        BigDecimal bigDecimal3 = BigDecimal.ZERO;
                                        if (bigDecimal.compareTo(bigDecimal3) > 0) {
                                            arrayList2.add(new C35401ls(r82, r142, 1));
                                        }
                                        BigDecimal subtract = bigDecimal2.subtract(bigDecimal);
                                        if (subtract.compareTo(bigDecimal3) > 0) {
                                            if (!(r36 == null && (r0 = r17.A06()) == null) && !TextUtils.isEmpty(r0.A0A)) {
                                                if (C43041zF.A04(r31.A01().A09, r0.A04())) {
                                                    arrayList2.add(new C35401ls(new C28401Vy(subtract, bigDecimal2.scale()), r0, 1));
                                                }
                                            }
                                            StringBuilder sb6 = new StringBuilder("sendPayment not sending payment; got invalid secondary methods with insufficient balance: ");
                                            sb6.append(r82);
                                            str3 = sb6.toString();
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        r3.A06("sendPayment found 0 sources");
                                        c2 = 11;
                                    } else {
                                        c2 = 0;
                                        arrayList = arrayList2;
                                        StringBuilder sb7 = new StringBuilder("findSourcesForTransfer returning sources: ");
                                        sb7.append(arrayList2);
                                        sb7.append(" for amount");
                                        r3.A06(sb7.toString());
                                    }
                                }
                            }
                        } else if (r31.A01().A08) {
                            if (!(r36 == null && (r0 = r17.A06()) == null) && !TextUtils.isEmpty(r0.A0A)) {
                                if (C43041zF.A04(r31.A01().A09, r0.A04())) {
                                    arrayList = new ArrayList(1);
                                    arrayList.add(new C35401ls(r12, r0, 1));
                                    c2 = 0;
                                    StringBuilder sb8 = new StringBuilder("PAY PaymentsActionManager:findSourcesForTransfer found no legacy primary but found primary: ");
                                    sb8.append(arrayList);
                                    sb8.append(" for amount");
                                    Log.i(sb8.toString());
                                }
                            }
                            str3 = "sendPayment not sending payment; got invalid primary methods and no legacy primary methods";
                        } else {
                            StringBuilder sb9 = new StringBuilder("sendPayment not sending payment; got null primary methods or empty credential id: ");
                            sb9.append(r14);
                            r3.A06(sb9.toString());
                            c2 = 4;
                        }
                        r3.A06(str3);
                        c2 = 9;
                    }
                    A014.A0M = str;
                    A014.A0K = str2;
                    A014.A06 = r32.A08();
                    if (c2 == 0) {
                        A014.A08(arrayList);
                        A014.A0A = r32;
                        if (A014.A0N.size() == 1) {
                            r6.A0b((C15830rv) null);
                            A014.A0H = ((C35401ls) A014.A0N.get(0)).A01.A0A;
                            long A002 = this.A04.A00();
                            r6.A0I = A002;
                            r6.A0L = A014;
                            A014.A05 = A002;
                            r6.A0n = AnonymousClass1W1.A09(A014.A0K) ? A014.A0K : "UNSET";
                            return true;
                        }
                        r3.A06("PaymentsActionManager sendPayment could not send. no correct sources found.");
                        return false;
                    }
                    return false;
                } catch (Exception e2) {
                    this.A0I.A0A("sendPayment blew up creating transaction info: ", e2);
                    return false;
                }
            }
        }
        r2.A06(sb.toString());
        return false;
    }

    public boolean A0K(C28401Vy r22, C35361lo r23, UserJid userJid, C16740tZ r25) {
        AnonymousClass1Vo r4;
        StringBuilder sb;
        if (!this.A0F.A0C(0)) {
            r4 = this.A0I;
            sb = new StringBuilder("requestPayment is not enabled for country: ");
            sb.append(this.A0E.A01());
        } else {
            C16740tZ r1 = r25;
            C15830rv r3 = r1.A11.A00;
            UserJid userJid2 = userJid;
            if (r3 != null && (!C16030sJ.A0L(r3) || userJid != null)) {
                C28401Vy r8 = r22;
                if (r22 != null) {
                    AnonymousClass174 r5 = this.A0E;
                    C30681cm A012 = r5.A01();
                    AnonymousClass00B.A06(A012);
                    C28411Vz r2 = A012.A02;
                    C228919r A032 = A03(r2);
                    C16040sK r32 = this.A02;
                    r32.A0B();
                    C28881Zb r33 = r32.A01;
                    AnonymousClass00B.A06(r33);
                    String str = ((C35491m1) r5.A00()).A04;
                    C28411Vz A002 = r5.A00();
                    String str2 = this.A0L.A02(userJid2, true).A01;
                    String str3 = r5.A01().A03;
                    AnonymousClass1Vt A013 = AnonymousClass1W1.A01(A002, r8, userJid2, (UserJid) r33.A0E, str, str2, str3, 10, 11, AnonymousClass1W0.A00(str3), A032.AG1(), 0, -1);
                    A013.A05(r23);
                    AnonymousClass1W2 AI7 = A032.AI7();
                    AI7.A01 = A01(r2, r8);
                    A013.A0A = AI7;
                    long A003 = this.A04.A00();
                    r1.A0I = A003;
                    r1.A0n = "UNSET";
                    r1.A0L = A013;
                    A013.A05 = A003;
                    A013.A02 = 12;
                    A013.A0K = A013.A0K;
                    AnonymousClass1W2 r42 = A013.A0A;
                    this.A0G.A03().AES();
                    A013.A03(r42, A003 + 604800000);
                    return true;
                }
            }
            r4 = this.A0I;
            sb = new StringBuilder("requestPayment found null or empty args jid: ");
            sb.append(r3);
            sb.append(" receiver: ");
            sb.append(userJid2);
        }
        r4.A06(sb.toString());
        return false;
    }

    public boolean A0L(AnonymousClass2H7 r7, C30161br r8, C28371Vv r9, C30641ci r10) {
        C28371Vv A0J2;
        C16880tn r0;
        C35251lc r1;
        String A0N2 = r9.A0N("service", (String) null);
        if (!TextUtils.isEmpty(A0N2)) {
            this.A0G.A04(A0N2);
        }
        AnonymousClass1Vt A022 = this.A0M.A02((AnonymousClass1W5) null, r9);
        if (A022 == null) {
            return false;
        }
        if ("P2M_LITE".equals(A0N2) && (A0J2 = r9.A0J("order")) != null) {
            String A0N3 = A0J2.A0N("message_id", (String) null);
            if (!TextUtils.isEmpty(A0N3)) {
                C28381Vw r12 = new C28381Vw(A022.A0C, A0N3, false);
                C16460t6 r3 = this.A06;
                C16830ti r2 = (C16830ti) r3.A0K.A03(r12);
                if (!(r2 == null || (r0 = r2.A00) == null || (r1 = r0.A01) == null)) {
                    AnonymousClass00B.A06(r1);
                    r1.A03 = A022.A0K;
                    r3.A0a(r2);
                }
            }
        }
        if (r8 != null) {
            r8.A07 = A022;
            return true;
        }
        StringBuilder sb = new StringBuilder("xmpp/reader/on-recv-payment-transaction-update: stanzaKey:");
        sb.append(r10);
        sb.append(" paymentTransactionInfo id:");
        sb.append(A022.A0K);
        Log.i(sb.toString());
        AnonymousClass2H8 r4 = r7.A01;
        Message obtain = Message.obtain((Handler) null, 0, 133, 0);
        Bundle data = obtain.getData();
        data.putParcelable("stanzaKey", r10);
        data.putParcelable("paymentTransactionInfo", new AnonymousClass2H9(A022));
        r4.AZq(obtain);
        return true;
    }
}

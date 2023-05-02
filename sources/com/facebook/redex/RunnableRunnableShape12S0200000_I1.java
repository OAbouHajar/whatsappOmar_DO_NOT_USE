package com.facebook.redex;

import X.C96114no;
import com.google.android.gms.internal.gtm.zzcb;
import com.google.android.gms.internal.gtm.zzey;
import java.io.File;

public class RunnableRunnableShape12S0200000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape12S0200000_I1(C96114no r2, File file) {
        this.A02 = 2;
        this.A00 = r2;
        this.A01 = file;
    }

    public RunnableRunnableShape12S0200000_I1(zzcb zzcb, zzey zzey, byte[] bArr, int i2) {
        this.A02 = 17;
        this.A00 = zzcb;
        this.A01 = zzey;
    }

    public RunnableRunnableShape12S0200000_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:63|66|67|68|69) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:71|72|73|74|75|76) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ae, code lost:
        if (r10 != false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019d, code lost:
        if (r10 != false) goto L_0x019f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0128 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0130 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:456:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r4 = r16
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x05b1;
                case 1: goto L_0x0991;
                case 2: goto L_0x0017;
                case 3: goto L_0x0980;
                case 4: goto L_0x047e;
                case 5: goto L_0x0969;
                case 6: goto L_0x0959;
                case 7: goto L_0x094b;
                case 8: goto L_0x093d;
                case 9: goto L_0x099c;
                case 10: goto L_0x0935;
                case 11: goto L_0x0927;
                case 12: goto L_0x0917;
                case 13: goto L_0x0909;
                case 14: goto L_0x0446;
                case 15: goto L_0x0423;
                case 16: goto L_0x0346;
                case 17: goto L_0x032b;
                case 18: goto L_0x02f7;
                case 19: goto L_0x08f2;
                case 20: goto L_0x08dd;
                case 21: goto L_0x08c1;
                case 22: goto L_0x08a8;
                case 23: goto L_0x04f4;
                case 24: goto L_0x086c;
                case 25: goto L_0x083f;
                case 26: goto L_0x0817;
                case 27: goto L_0x07e9;
                case 28: goto L_0x0241;
                case 29: goto L_0x07dc;
                case 30: goto L_0x079f;
                case 31: goto L_0x0730;
                case 32: goto L_0x0724;
                case 33: goto L_0x0715;
                case 34: goto L_0x0707;
                case 35: goto L_0x06fb;
                case 36: goto L_0x06fb;
                case 37: goto L_0x06ef;
                case 38: goto L_0x06ef;
                case 39: goto L_0x06df;
                case 40: goto L_0x06d1;
                case 41: goto L_0x0227;
                case 42: goto L_0x0085;
                case 43: goto L_0x0077;
                case 44: goto L_0x0007;
                case 45: goto L_0x0007;
                case 46: goto L_0x06c2;
                case 47: goto L_0x060d;
                case 48: goto L_0x05be;
                case 49: goto L_0x001f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A00
            X.3F2 r0 = (X.AnonymousClass3F2) r0
            java.lang.Object r2 = r4.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.0uc r1 = r0.A08
            X.1mD r0 = r0.A00
            r1.A06(r0, r2)
        L_0x0016:
            return
        L_0x0017:
            java.lang.String r0 = "version"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)     // Catch:{ JSONException -> 0x0016 }
            throw r0     // Catch:{ JSONException -> 0x0016 }
        L_0x001f:
            java.lang.Object r3 = r4.A00
            X.4Ou r3 = (X.C85524Ou) r3
            java.lang.Object r4 = r4.A01
            java.util.concurrent.Future r4 = (java.util.concurrent.Future) r4
            r1 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            java.lang.Object r0 = r4.get(r1, r0)     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            X.4HB r0 = (X.AnonymousClass4HB) r0     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            java.lang.Object r2 = r0.A01     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            if (r2 == 0) goto L_0x0049
            X.1Pc r0 = r3.A05     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            X.4Lt r2 = (X.C84754Lt) r2     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            java.util.Map r1 = r0.A00     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            java.lang.String r0 = r2.A02     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            r1.put(r0, r2)     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            X.027 r0 = r3.A00     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            if (r0 == 0) goto L_0x0016
            r0.A09(r2)     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            goto L_0x09a3
        L_0x0049:
            android.util.Pair r1 = r0.A00     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            X.027 r0 = r3.A01     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            if (r0 == 0) goto L_0x0016
            r0.A09(r1)     // Catch:{ ExecutionException -> 0x0054, Exception -> 0x005c }
            goto L_0x09a4
        L_0x0054:
            r2 = move-exception
            java.lang.String r0 = "OrderRepository/fetchOrder/delivery-failure"
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 2
            goto L_0x0063
        L_0x005c:
            r2 = move-exception
            java.lang.String r0 = "OrderRepository/fetchOrder/fetch-error"
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 1
        L_0x0063:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r2.toString()
            android.util.Pair r1 = X.C13690nt.A0I(r1, r0)
            X.027 r0 = r3.A01
            if (r0 == 0) goto L_0x0016
            r0.A09(r1)
            return
        L_0x0077:
            java.lang.Object r0 = r4.A00
            X.39J r0 = (X.AnonymousClass39J) r0
            java.lang.Object r1 = r4.A01
            X.027 r0 = r0.A02
            if (r0 == 0) goto L_0x0016
            r0.A0B(r1)
            return
        L_0x0085:
            java.lang.Object r1 = r4.A00
            com.facebook.redex.IDxCListenerShape418S0100000_2_I0 r1 = (com.facebook.redex.IDxCListenerShape418S0100000_2_I0) r1
            java.lang.Object r0 = r4.A01
            X.4Gy r0 = (X.C83504Gy) r0
            java.lang.Object r7 = r1.A00
            X.2RR r7 = (X.AnonymousClass2RR) r7
            X.1Gf r5 = r7.A0C
            com.whatsapp.jid.UserJid r4 = r7.A0I
            java.util.List r3 = r0.A01
            r15 = 0
            X.12m r0 = r5.A01     // Catch:{ Exception -> 0x0131 }
            X.2Dk r0 = r0.A00()     // Catch:{ Exception -> 0x0131 }
            X.0tf r8 = r0.A02()     // Catch:{ Exception -> 0x0131 }
            X.1cj r14 = r8.A00()     // Catch:{ all -> 0x012b }
            java.util.concurrent.Future r0 = r5.A04(r4)     // Catch:{ all -> 0x0123 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x0123 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0123 }
            int r0 = r3.size()     // Catch:{ all -> 0x0123 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0123 }
            r9.<init>(r0)     // Catch:{ all -> 0x0123 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0123 }
        L_0x00bd:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0123 }
            X.1mM r1 = (X.C35701mM) r1     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = r1.A0D     // Catch:{ all -> 0x0123 }
            r9.put(r0, r1)     // Catch:{ all -> 0x0123 }
            goto L_0x00bd
        L_0x00cf:
            java.util.Iterator r13 = r6.iterator()     // Catch:{ all -> 0x0123 }
            r6 = 0
        L_0x00d4:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0117
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0121 }
            X.2Xy r11 = (X.C50102Xy) r11     // Catch:{ all -> 0x0121 }
            X.1mM r12 = r11.A01     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = r12.A0D     // Catch:{ all -> 0x0121 }
            java.lang.Object r10 = r9.get(r2)     // Catch:{ all -> 0x0121 }
            X.1mM r10 = (X.C35701mM) r10     // Catch:{ all -> 0x0121 }
            if (r10 == 0) goto L_0x00d4
            X.1mK r0 = r10.A01     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00fb
            int r1 = r0.A00     // Catch:{ all -> 0x0121 }
            r0 = 3
            if (r1 != r0) goto L_0x00fb
        L_0x00f5:
            r5.A07(r4, r2)     // Catch:{ all -> 0x0121 }
            int r6 = r6 + 1
            goto L_0x00d4
        L_0x00fb:
            int r1 = r10.A00     // Catch:{ all -> 0x0121 }
            r0 = 1
            if (r1 == r0) goto L_0x00f5
            boolean r0 = r10.A07     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r12.equals(r10)     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x00d4
            long r0 = r11.A00     // Catch:{ all -> 0x0121 }
            X.2Xy r2 = new X.2Xy     // Catch:{ all -> 0x0121 }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x0121 }
            int r0 = X.C24511Gf.A00(r2, r8, r4)     // Catch:{ all -> 0x0121 }
            int r15 = r15 + r0
            goto L_0x00d4
        L_0x0117:
            r14.A00()     // Catch:{ all -> 0x0121 }
            r14.close()     // Catch:{ all -> 0x0129 }
            r8.close()     // Catch:{ Exception -> 0x0132 }
            goto L_0x0132
        L_0x0121:
            r0 = move-exception
            goto L_0x0125
        L_0x0123:
            r0 = move-exception
            r6 = 0
        L_0x0125:
            r14.close()     // Catch:{ all -> 0x0128 }
        L_0x0128:
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            goto L_0x012d
        L_0x012b:
            r0 = move-exception
            r6 = 0
        L_0x012d:
            r8.close()     // Catch:{ all -> 0x0130 }
        L_0x0130:
            throw r0     // Catch:{ Exception -> 0x0132 }
        L_0x0131:
            r6 = 0
        L_0x0132:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            android.util.Pair r1 = X.C13680ns.A0F(r0, r6)
            java.lang.Object r0 = r1.first
            int r0 = X.AnonymousClass000.A0D(r0)
            r11 = 1
            boolean r10 = X.AnonymousClass000.A1Q(r0)
            java.lang.Object r0 = r1.second
            int r0 = X.AnonymousClass000.A0D(r0)
            if (r0 > 0) goto L_0x014e
            r11 = 0
        L_0x014e:
            java.util.Iterator r9 = r3.iterator()
        L_0x0152:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0198
            java.lang.Object r6 = r9.next()
            X.1mM r6 = (X.C35701mM) r6
            X.0x1 r8 = r7.A0F
            java.lang.String r1 = r6.A0D
            r0 = 0
            X.1mM r2 = r8.A05(r0, r1)
            if (r2 == 0) goto L_0x0152
            X.1mK r1 = r6.A01
            if (r1 == 0) goto L_0x0183
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0183
            r2.A01 = r1
        L_0x0173:
            r8.A0C(r2, r4)
            X.0pt r2 = r7.A0A
            r1 = 14
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1
            r0.<init>(r7, r1, r6)
            r2.A0K(r0)
            goto L_0x0152
        L_0x0183:
            java.lang.String r0 = r6.A04
            r2.A04 = r0
            java.math.BigDecimal r0 = r6.A05
            r2.A05 = r0
            X.1sq r0 = r6.A03
            r2.A03 = r0
            X.4jc r0 = r6.A02
            r2.A02 = r0
            int r0 = r6.A00
            r2.A00 = r0
            goto L_0x0173
        L_0x0198:
            if (r11 == 0) goto L_0x01ae
            r1 = 2131889106(0x7f120bd2, float:1.9412866E38)
            if (r10 == 0) goto L_0x01a2
        L_0x019f:
            r1 = 2131887038(0x7f1203be, float:1.9408672E38)
        L_0x01a2:
            X.027 r0 = r7.A01
            if (r0 == 0) goto L_0x01a9
            X.C13680ns.A1P(r0, r1)
        L_0x01a9:
            java.util.concurrent.Future r0 = r5.A04(r4)
            goto L_0x01b1
        L_0x01ae:
            if (r10 == 0) goto L_0x01a9
            goto L_0x019f
        L_0x01b1:
            java.lang.Object r6 = r0.get()     // Catch:{  }
            java.util.List r6 = (java.util.List) r6     // Catch:{  }
            X.027 r0 = r7.A00     // Catch:{  }
            if (r0 == 0) goto L_0x0016
            if (r6 == 0) goto L_0x0220
            java.util.HashMap r5 = X.AnonymousClass000.A0x()     // Catch:{  }
            java.util.Iterator r3 = r3.iterator()     // Catch:{  }
        L_0x01c5:
            boolean r0 = r3.hasNext()     // Catch:{  }
            if (r0 == 0) goto L_0x01e9
            java.lang.Object r0 = r3.next()     // Catch:{  }
            X.1mM r0 = (X.C35701mM) r0     // Catch:{  }
            java.util.List r0 = r0.A06     // Catch:{  }
            java.util.Iterator r2 = r0.iterator()     // Catch:{  }
        L_0x01d7:
            boolean r0 = r2.hasNext()     // Catch:{  }
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r1 = r2.next()     // Catch:{  }
            X.1mL r1 = (X.C35691mL) r1     // Catch:{  }
            java.lang.String r0 = r1.A04     // Catch:{  }
            r5.put(r0, r1)     // Catch:{  }
            goto L_0x01d7
        L_0x01e9:
            java.util.Iterator r4 = r6.iterator()     // Catch:{  }
        L_0x01ed:
            boolean r0 = r4.hasNext()     // Catch:{  }
            if (r0 == 0) goto L_0x0220
            java.lang.Object r0 = r4.next()     // Catch:{  }
            X.2Xy r0 = (X.C50102Xy) r0     // Catch:{  }
            X.1mM r0 = r0.A01     // Catch:{  }
            java.util.List r0 = r0.A06     // Catch:{  }
            java.util.Iterator r3 = r0.iterator()     // Catch:{  }
        L_0x0201:
            boolean r0 = r3.hasNext()     // Catch:{  }
            if (r0 == 0) goto L_0x01ed
            java.lang.Object r2 = r3.next()     // Catch:{  }
            X.1mL r2 = (X.C35691mL) r2     // Catch:{  }
            java.lang.String r0 = r2.A04     // Catch:{  }
            java.lang.Object r1 = r5.get(r0)     // Catch:{  }
            X.1mL r1 = (X.C35691mL) r1     // Catch:{  }
            if (r1 == 0) goto L_0x0201
            java.lang.String r0 = r1.A00     // Catch:{  }
            r2.A00 = r0     // Catch:{  }
            java.lang.String r0 = r1.A01     // Catch:{  }
            r2.A01 = r0     // Catch:{  }
            goto L_0x0201
        L_0x0220:
            X.027 r0 = r7.A00     // Catch:{  }
            r0.A09(r6)     // Catch:{  }
            goto L_0x09a5
        L_0x0227:
            java.lang.Object r0 = r4.A00
            com.facebook.redex.IDxCListenerShape418S0100000_2_I0 r0 = (com.facebook.redex.IDxCListenerShape418S0100000_2_I0) r0
            java.lang.Object r3 = r4.A01
            java.lang.Object r2 = r0.A00     // Catch:{  }
            X.2RR r2 = (X.AnonymousClass2RR) r2     // Catch:{  }
            X.1Gf r1 = r2.A0C     // Catch:{  }
            com.whatsapp.jid.UserJid r0 = r2.A0I     // Catch:{  }
            r1.A06(r0)     // Catch:{  }
            X.027 r0 = r2.A08     // Catch:{  }
            if (r0 == 0) goto L_0x0016
            r0.A09(r3)     // Catch:{  }
            goto L_0x09a6
        L_0x0241:
            java.lang.Object r0 = r4.A00
            X.4E3 r0 = (X.AnonymousClass4E3) r0
            java.lang.Object r7 = r4.A01
            java.util.Set r7 = (java.util.Set) r7
            X.2DF r2 = r0.A00
            java.util.Iterator r1 = r7.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02f4
            java.lang.Object r0 = r1.next()
        L_0x0259:
            X.0tZ r0 = (X.C16740tZ) r0
            if (r0 != 0) goto L_0x02ee
            r8 = 0
        L_0x025e:
            int r6 = r7.size()
            X.1yT r0 = r2.A0G
            X.0pP r0 = (X.C14570pP) r0
            X.013 r5 = r0.A01
            r1 = 2131755218(0x7f1000d2, float:1.914131E38)
            long r3 = (long) r6
            java.lang.Object[] r0 = X.C13680ns.A1b()
            boolean r9 = X.C13690nt.A1W(r0, r6)
            java.lang.String r6 = r5.A0J(r0, r1, r3)
            X.1yT r1 = r2.A0G
            r0 = 2131892360(0x7f121888, float:1.9419466E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 3
            com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0 r4 = new com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0
            r4.<init>(r2, r8, r7, r0)
            X.1yT r3 = r2.A0G
            r0 = r3
            X.00m r0 = (X.C001100m) r0
            X.04p r0 = r0.A06
            X.05f r1 = r0.A02
            X.05f r0 = X.C011005f.DESTROYED
            if (r1 == r0) goto L_0x0016
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 4000(0xfa0, float:5.605E-42)
            X.1fz r6 = X.C32291fz.A01(r1, r6, r0)
            r6.A09(r5, r4)
            X.1yT r1 = r2.A0G
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131101493(0x7f060735, float:1.7815397E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r6.A07(r0)
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()
            X.1yT r1 = r2.A0G
            r0 = 2131364836(0x7f0a0be4, float:1.834952E38)
            android.view.View r0 = r1.findViewById(r0)
            r8.add(r0)
            X.1yT r1 = r2.A0G
            r0 = 2131365899(0x7f0a100b, float:1.8351676E38)
            android.view.View r0 = r1.findViewById(r0)
            r8.add(r0)
            X.1yT r5 = r2.A0G
            r0 = r5
            X.0pN r0 = (X.C14550pN) r0
            X.01V r7 = r0.A08
            X.00n r5 = (X.C001200n) r5
            X.0pc r4 = new X.0pc
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A0n = r4
            r1 = 32
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6
            r0.<init>(r2, r1)
            r4.A03(r0)
            X.0pc r0 = r2.A0n
            r0.A01()
            return
        L_0x02ee:
            X.1Vw r0 = r0.A11
            X.0rv r8 = r0.A00
            goto L_0x025e
        L_0x02f4:
            r0 = 0
            goto L_0x0259
        L_0x02f7:
            java.lang.Object r0 = r4.A01
            com.google.android.gms.internal.gtm.zzcb r0 = (com.google.android.gms.internal.gtm.zzcb) r0
            com.google.android.gms.internal.gtm.zzcc r2 = r0.zza
            java.lang.Object r1 = r4.A00
            X.C15000qA.A00()
            com.google.android.gms.internal.gtm.zzey r0 = r2.zzd
            if (r0 == 0) goto L_0x0016
            r0 = 0
            r2.zzd = r0
            java.lang.String r0 = "Disconnected from device AnalyticsService"
            r2.zzP(r0, r1)
            com.google.android.gms.internal.gtm.zzbv r1 = r2.zza
            com.google.android.gms.internal.gtm.zzbq r0 = r1.zzh
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzbq r0 = r1.zzh
            r0.zzW()
            X.C15000qA.A00()
            com.google.android.gms.internal.gtm.zzck r1 = r0.zza
            X.C15000qA.A00()
            r1.zzW()
            java.lang.String r0 = "Service disconnected"
            r1.zzO(r0)
            return
        L_0x032b:
            java.lang.Object r2 = r4.A00
            com.google.android.gms.internal.gtm.zzcb r2 = (com.google.android.gms.internal.gtm.zzcb) r2
            com.google.android.gms.internal.gtm.zzcc r1 = r2.zza
            boolean r0 = r1.zzg()
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "Connected to service after a timeout"
            r1.zzF(r0)
            com.google.android.gms.internal.gtm.zzcc r1 = r2.zza
            java.lang.Object r0 = r4.A01
            com.google.android.gms.internal.gtm.zzey r0 = (com.google.android.gms.internal.gtm.zzey) r0
            com.google.android.gms.internal.gtm.zzcc.zzi(r1, r0)
            return
        L_0x0346:
            java.lang.Object r6 = r4.A00
            X.2sC r6 = (X.C57922sC) r6
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0016
            java.lang.Object r9 = r4.A01
            X.4GU r9 = (X.AnonymousClass4GU) r9
            X.0rh r2 = r9.A01
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0386
            X.5So r6 = r6.A00
            android.app.Activity r5 = r6.AD7()
            X.C13710nw.A01(r5)
            android.app.PendingIntent r4 = r2.A02
            X.C13710nw.A01(r4)
            int r3 = r9.A00
            r2 = 0
            java.lang.Class<com.google.android.gms.common.api.GoogleApiActivity> r0 = com.google.android.gms.common.api.GoogleApiActivity.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r0)
            java.lang.String r0 = "pending_intent"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "failing_client_id"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "notify_manager"
            r1.putExtra(r0, r2)
            r0 = 1
            r6.startActivityForResult(r1, r0)
            return
        L_0x0386:
            X.2s9 r1 = r6.A02
            X.5So r7 = r6.A00
            android.app.Activity r0 = r7.AD7()
            X.C13710nw.A01(r0)
            int r3 = r2.A01
            r8 = 0
            android.content.Intent r0 = r1.A01(r0, r8, r3)
            if (r0 == 0) goto L_0x03b8
            android.app.Activity r2 = r7.AD7()
            X.C13710nw.A01(r2)
            java.lang.String r0 = "d"
            android.content.Intent r1 = r1.A01(r2, r0, r3)
            X.3YK r0 = new X.3YK
            r0.<init>(r1, r7)
            android.app.Dialog r1 = X.C57892s9.A00(r2, r6, r0, r3)
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "GooglePlayServicesErrorDialog"
            X.C57892s9.A01(r2, r1, r6, r0)
            return
        L_0x03b8:
            r5 = 18
            if (r3 != r5) goto L_0x09a7
            android.app.Activity r3 = r7.AD7()
            X.C13710nw.A01(r3)
            r0 = 16842874(0x101007a, float:2.36939E-38)
            android.widget.ProgressBar r2 = new android.widget.ProgressBar
            r2.<init>(r3, r8, r0)
            r0 = 1
            r2.setIndeterminate(r0)
            r0 = 0
            r2.setVisibility(r0)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r3)
            r1.setView(r2)
            java.lang.String r0 = X.C62093Bp.A01(r3, r5)
            r1.setMessage(r0)
            java.lang.String r0 = ""
            r1.setPositiveButton(r0, r8)
            android.app.AlertDialog r1 = r1.create()
            java.lang.String r0 = "GooglePlayServicesUpdatingDialog"
            X.C57892s9.A01(r3, r1, r6, r0)
            android.app.Activity r0 = r7.AD7()
            X.C13710nw.A01(r0)
            android.content.Context r5 = r0.getApplicationContext()
            X.3Wj r3 = new X.3Wj
            r3.<init>(r1, r4)
            java.lang.String r0 = "android.intent.action.PACKAGE_ADDED"
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>(r0)
            java.lang.String r0 = "package"
            r2.addDataScheme(r0)
            X.3Ke r1 = new X.3Ke
            r1.<init>(r3)
            r5.registerReceiver(r1, r2)
            r1.A00 = r5
            boolean r0 = X.C15040qE.A03(r5)
            if (r0 != 0) goto L_0x0016
            r3.A00()
            r1.A00()
            return
        L_0x0423:
            java.lang.Object r0 = r4.A00
            X.4Jh r0 = (X.C84114Jh) r0
            java.lang.Object r1 = r4.A01
            X.5Lh r1 = (X.C107755Lh) r1
            java.lang.Object r0 = r0.A02
            if (r0 == 0) goto L_0x0016
            X.4qn r1 = (X.C97914qn) r1     // Catch:{ RuntimeException -> 0x09b5 }
            X.21d r0 = (X.C437021d) r0     // Catch:{ RuntimeException -> 0x09b5 }
            android.location.Location r1 = r1.A00     // Catch:{ RuntimeException -> 0x09b5 }
            X.21c r0 = (X.C436921c) r0     // Catch:{ RuntimeException -> 0x09b5 }
            java.lang.ref.WeakReference r0 = r0.A04     // Catch:{ RuntimeException -> 0x09b5 }
            java.lang.Object r0 = r0.get()     // Catch:{ RuntimeException -> 0x09b5 }
            android.location.LocationListener r0 = (android.location.LocationListener) r0     // Catch:{ RuntimeException -> 0x09b5 }
            if (r0 == 0) goto L_0x0016
            r0.onLocationChanged(r1)     // Catch:{ RuntimeException -> 0x09b5 }
            goto L_0x09b4
        L_0x0446:
            java.lang.Object r2 = r4.A01
            X.3ED r2 = (X.AnonymousClass3ED) r2
            X.3CL r0 = r2.A05
            java.util.Map r1 = r0.A09
            X.4Ui r0 = r2.A04
            java.lang.Object r5 = r1.get(r0)
            X.0rl r5 = (X.C15730rl) r5
            if (r5 == 0) goto L_0x0016
            java.lang.Object r1 = r4.A00
            X.0rh r1 = (X.C15700rh) r1
            int r0 = r1.A01
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r4 = 0
            if (r0 == 0) goto L_0x09e8
            r0 = 1
            r2.A02 = r0
            X.0rn r3 = r2.A03
            boolean r0 = r3.AcM()
            if (r0 == 0) goto L_0x09b7
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0016
            com.google.android.gms.common.internal.IAccountAccessor r1 = r2.A00
            if (r1 == 0) goto L_0x0016
            java.util.Set r0 = r2.A01
            r3.AFQ(r1, r0)
            return
        L_0x047e:
            java.lang.Object r6 = r4.A00
            X.3UF r6 = (X.AnonymousClass3UF) r6
            java.lang.Object r5 = r4.A01
            X.4V3 r5 = (X.AnonymousClass4V3) r5
            int r1 = r6.A02
            int r0 = r5.A01
            int r1 = r1 - r0
            r6.A02 = r1
            boolean r0 = r5.A06
            r2 = 1
            if (r0 == 0) goto L_0x0498
            r6.A08 = r2
            int r0 = r5.A00
            r6.A01 = r0
        L_0x0498:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x04a0
            int r0 = r5.A02
            r6.A03 = r0
        L_0x04a0:
            if (r1 != 0) goto L_0x0016
            X.4df r0 = r5.A03
            com.google.android.exoplayer2.Timeline r3 = r0.A05
            X.4df r0 = r6.A05
            com.google.android.exoplayer2.Timeline r0 = r0.A05
            boolean r0 = r0.A0C()
            r12 = 0
            if (r0 != 0) goto L_0x04be
            boolean r0 = r3.A0C()
            if (r0 == 0) goto L_0x04be
            r0 = -1
            r6.A00 = r0
            r0 = 0
            r6.A04 = r0
        L_0x04be:
            boolean r0 = r3.A0C()
            if (r0 != 0) goto L_0x09ec
            X.3UE r3 = (X.AnonymousClass3UE) r3
            com.google.android.exoplayer2.Timeline[] r0 = r3.A05
            java.util.List r4 = java.util.Arrays.asList(r0)
            int r1 = r4.size()
            java.util.List r3 = r6.A0L
            int r0 = r3.size()
            if (r1 == r0) goto L_0x04d9
            r2 = 0
        L_0x04d9:
            X.C90524eJ.A04(r2)
            r2 = 0
        L_0x04dd:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x09ec
            java.lang.Object r1 = r3.get(r2)
            X.4nw r1 = (X.C96194nw) r1
            java.lang.Object r0 = r4.get(r2)
            com.google.android.exoplayer2.Timeline r0 = (com.google.android.exoplayer2.Timeline) r0
            r1.A00 = r0
            int r2 = r2 + 1
            goto L_0x04dd
        L_0x04f4:
            java.lang.Object r5 = r4.A01     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            X.4sv r5 = (X.C98754sv) r5     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            X.5MD r1 = r5.A00     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            java.lang.Object r0 = r4.A00     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            X.0on r0 = (X.C14210on) r0     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            java.lang.Object r6 = r0.A01()     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            X.4t6 r1 = (X.C98864t6) r1     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            com.google.firebase.iid.FirebaseInstanceId r0 = r1.A00     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            java.lang.String r10 = r1.A01     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            java.lang.String r9 = r1.A02     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            X.0od r3 = com.google.firebase.iid.FirebaseInstanceId.A08     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            X.0ob r0 = r0.A03     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            java.lang.String r8 = r0.A05()     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            monitor-enter(r3)     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0586 }
            org.json.JSONObject r7 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0545 }
            java.lang.String r2 = "token"
            r7.put(r2, r6)     // Catch:{ JSONException -> 0x0545 }
            java.lang.String r2 = "appVersion"
            r7.put(r2, r8)     // Catch:{ JSONException -> 0x0545 }
            java.lang.String r2 = "timestamp"
            r7.put(r2, r0)     // Catch:{ JSONException -> 0x0545 }
            java.lang.String r2 = r7.toString()     // Catch:{ JSONException -> 0x0545 }
            if (r2 == 0) goto L_0x0562
            android.content.SharedPreferences r0 = r3.A01     // Catch:{ all -> 0x0586 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = X.C14110od.A01(r10, r9)     // Catch:{ all -> 0x0586 }
            r1.putString(r0, r2)     // Catch:{ all -> 0x0586 }
            r1.commit()     // Catch:{ all -> 0x0586 }
            goto L_0x0562
        L_0x0545:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0586 }
            int r0 = r2.length()     // Catch:{ all -> 0x0586 }
            int r0 = r0 + 24
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = "Failed to encode token: "
            r1.append(r0)     // Catch:{ all -> 0x0586 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = "FirebaseInstanceId"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0586 }
        L_0x0562:
            monitor-exit(r3)     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            X.0ow r0 = new X.0ow     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            r0.<init>(r6)     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            X.0on r3 = new X.0on     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            r3.<init>()     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            r3.A08(r0)     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            java.util.concurrent.Executor r2 = X.C14500pH.A01
            r3.A06(r5, r2)
            r3.A05(r5, r2)
            X.0oq r1 = r3.A03
            X.0pI r0 = new X.0pI
            r0.<init>(r5, r2)
            r1.A00(r0)
            r3.A04()
            return
        L_0x0586:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
            throw r0     // Catch:{ 5Ac -> 0x059a, CancellationException -> 0x0592, Exception -> 0x0589 }
        L_0x0589:
            r1 = move-exception
            java.lang.Object r0 = r4.A01
            X.4sv r0 = (X.C98754sv) r0
            r0.AQu(r1)
            return
        L_0x0592:
            java.lang.Object r0 = r4.A01
            X.4sv r0 = (X.C98754sv) r0
            r0.AO5()
            return
        L_0x059a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r2 = r1 instanceof java.lang.Exception
            java.lang.Object r1 = r4.A01
            X.4sv r1 = (X.C98754sv) r1
            if (r2 == 0) goto L_0x05ad
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
        L_0x05ad:
            r1.AQu(r0)
            return
        L_0x05b1:
            r0 = 10
            android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x05b6 }
        L_0x05b6:
            java.lang.Object r0 = r4.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x05be:
            java.lang.Object r0 = r4.A00
            X.3Gf r0 = (X.C63123Gf) r0
            java.lang.Object r1 = r4.A01
            X.4DA r1 = (X.AnonymousClass4DA) r1
            X.4Gx r0 = r0.A01
            X.2Xz r6 = r0.A00
            com.whatsapp.jid.UserJid r5 = r0.A01
            java.util.List r1 = r1.A00
            if (r1 == 0) goto L_0x0605
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0605
            r4 = 0
            java.lang.Object r2 = r1.get(r4)
            java.lang.Object[] r1 = X.C13690nt.A1Z()
            java.lang.String r0 = "wa.me"
            X.C13690nt.A1L(r0, r2, r1)
            java.lang.String r0 = "%s/%s"
            java.lang.String r3 = java.lang.String.format(r0, r1)
            com.obwhatsapp.WaTextView r2 = r6.A0A
            r2.setText(r3)
            r2.setVisibility(r4)
            r1 = 7
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r0.<init>(r5, r1, r6)
            r2.setOnClickListener(r0)
            X.4kU r0 = new X.4kU
            r0.<init>(r6, r3)
            r2.setOnLongClickListener(r0)
            return
        L_0x0605:
            com.obwhatsapp.WaTextView r1 = r6.A0A
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x060d:
            java.lang.Object r2 = r4.A00
            com.obwhatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel r2 = (com.obwhatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel) r2
            java.lang.Object r1 = r4.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.String r3 = "BusinessComplianceViewModel/loadBusinessComplianceDetails/fetch-error"
            X.1Oo r7 = r2.A02
            monitor-enter(r7)
            X.0ug r0 = r7.A00     // Catch:{ all -> 0x06bf }
            X.3GS r10 = new X.3GS     // Catch:{ all -> 0x06bf }
            r10.<init>(r1, r0)     // Catch:{ all -> 0x06bf }
            X.0ug r9 = r10.A01     // Catch:{ all -> 0x06bf }
            java.lang.String r12 = r9.A02()     // Catch:{ all -> 0x06bf }
            r5 = 1
            X.1lL[] r6 = new X.C35081lL[r5]     // Catch:{ all -> 0x06bf }
            com.whatsapp.jid.UserJid r0 = r10.A00     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x06bf }
            java.lang.String r0 = "jid"
            boolean r4 = X.C35081lL.A03(r0, r1, r6)     // Catch:{ all -> 0x06bf }
            java.lang.String r0 = "merchant_info"
            X.1Vv r8 = new X.1Vv     // Catch:{ all -> 0x06bf }
            r8.<init>(r0, r6)     // Catch:{ all -> 0x06bf }
            r0 = 5
            X.1lL[] r6 = new X.C35081lL[r0]     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = "smax_id"
            java.lang.String r0 = "53"
            X.C35081lL.A02(r1, r0, r6, r4)     // Catch:{ all -> 0x06bf }
            java.lang.String r0 = "id"
            X.C35081lL.A02(r0, r12, r6, r5)     // Catch:{ all -> 0x06bf }
            X.1lL r1 = X.C35081lL.A00()     // Catch:{ all -> 0x06bf }
            r0 = 2
            r6[r0] = r1     // Catch:{ all -> 0x06bf }
            java.lang.String r4 = "xmlns"
            java.lang.String r0 = "w:biz:merchant_info"
            X.1lL r1 = new X.1lL     // Catch:{ all -> 0x06bf }
            r1.<init>((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x06bf }
            r0 = 3
            r6[r0] = r1     // Catch:{ all -> 0x06bf }
            java.lang.String r4 = "type"
            java.lang.String r0 = "get"
            X.1lL r1 = new X.1lL     // Catch:{ all -> 0x06bf }
            r1.<init>((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x06bf }
            r0 = 4
            r6[r0] = r1     // Catch:{ all -> 0x06bf }
            X.1Vv r11 = X.C28371Vv.A04(r8, r6)     // Catch:{ all -> 0x06bf }
            r13 = 280(0x118, float:3.92E-43)
            r14 = 32000(0x7d00, double:1.581E-319)
            r9.A0B(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x06bf }
            X.1kE r6 = r10.A02     // Catch:{ all -> 0x06bf }
            X.0sq r4 = r7.A01     // Catch:{ all -> 0x06bf }
            r1 = 6
            com.facebook.redex.RunnableRunnableShape4S0100000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape4S0100000_I0_3     // Catch:{ all -> 0x06bf }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x06bf }
            r4.Acl(r0)     // Catch:{ all -> 0x06bf }
            monitor-exit(r7)
            r4 = 3
            java.lang.Object r0 = r6.get()     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            X.4HB r0 = (X.AnonymousClass4HB) r0     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            java.lang.Object r1 = r0.A01     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            if (r1 == 0) goto L_0x06a4
            X.027 r0 = r2.A00     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            X.4jZ r1 = (X.C93664jZ) r1     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            r0.A09(r1)     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            X.027 r1 = r2.A01     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
        L_0x06a0:
            r1.A09(r0)     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            goto L_0x06b0
        L_0x06a4:
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            X.027 r0 = r2.A01     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            X.C13680ns.A1P(r0, r5)     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            X.027 r1 = r2.A00     // Catch:{ ExecutionException -> 0x06b1, Exception -> 0x06b5 }
            r0 = 0
            goto L_0x06a0
        L_0x06b0:
            return
        L_0x06b1:
            r0 = move-exception
            java.lang.String r3 = "BusinessComplianceViewModel/loadBusinessComplianceDetails/delivery-failure"
            goto L_0x06b6
        L_0x06b5:
            r0 = move-exception
        L_0x06b6:
            com.whatsapp.util.Log.e(r3, r0)
            X.027 r0 = r2.A01
            X.C13680ns.A1P(r0, r4)
            return
        L_0x06bf:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x06c2:
            java.lang.Object r0 = r4.A01
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.01X r0 = r0.A0N
            X.AnonymousClass00B.A06(r0)
            X.1fj r0 = (X.C32151fj) r0
            r0.A0L()
            return
        L_0x06d1:
            java.lang.Object r0 = r4.A00
            X.3pb r0 = (X.C74013pb) r0
            java.lang.Object r1 = r4.A01
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.1Gf r0 = r0.A00
            r0.A06(r1)
            return
        L_0x06df:
            java.lang.Object r2 = r4.A00
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r1 = r4.A01
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r0 = 1
            r2.set(r0)
            r1.disconnect()
            return
        L_0x06ef:
            java.lang.Object r0 = r4.A00
            X.3AX r0 = (X.AnonymousClass3AX) r0
            java.lang.Object r1 = r4.A01
            X.0wP r0 = r0.A09
            r0.A03(r1)
            return
        L_0x06fb:
            java.lang.Object r0 = r4.A00
            X.3AX r0 = (X.AnonymousClass3AX) r0
            java.lang.Object r1 = r4.A01
            X.0wP r0 = r0.A09
            r0.A02(r1)
            return
        L_0x0707:
            java.lang.Object r0 = r4.A00
            X.38v r0 = (X.C614238v) r0
            java.lang.Object r1 = r4.A01
            X.0rv r1 = (X.C15830rv) r1
            X.0sf r0 = r0.A06
            r0.A0P(r1)
            return
        L_0x0715:
            java.lang.Object r0 = r4.A00
            X.38v r0 = (X.C614238v) r0
            java.lang.Object r2 = r4.A01
            X.0rv r2 = (X.C15830rv) r2
            X.0sf r1 = r0.A06
            r0 = 2
            r1.A0H(r2, r0)
            return
        L_0x0724:
            java.lang.Object r1 = r4.A00
            X.3IM r1 = (X.AnonymousClass3IM) r1
            java.lang.Object r0 = r4.A01
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            X.AnonymousClass3IM.A00(r1, r0)
            return
        L_0x0730:
            java.lang.Object r8 = r4.A00
            X.2x1 r8 = (X.C59302x1) r8
            java.lang.Object r6 = r4.A01
            android.os.PowerManager$WakeLock r6 = (android.os.PowerManager.WakeLock) r6
            java.lang.String r0 = "backupMessages/mediaClanup"
            X.1Zf r5 = new X.1Zf
            r5.<init>((java.lang.String) r0)
            X.0sb r9 = r8.A03     // Catch:{ all -> 0x0795 }
            X.1jH r0 = r9.A05()     // Catch:{ all -> 0x0795 }
            java.io.File r1 = r0.A03     // Catch:{ all -> 0x0795 }
            r0 = 1
            X.C16180sb.A04(r1, r0)     // Catch:{ all -> 0x0795 }
            r2 = 604800000(0x240c8400, double:2.988109026E-315)
            X.AnonymousClass1XI.A0E(r1, r2)     // Catch:{ all -> 0x0795 }
            X.1jH r0 = r9.A05()     // Catch:{ all -> 0x0795 }
            java.io.File r0 = r0.A09     // Catch:{ all -> 0x0795 }
            r7 = 0
            X.C16180sb.A04(r0, r7)     // Catch:{ all -> 0x0795 }
            X.AnonymousClass1XI.A0E(r0, r2)     // Catch:{ all -> 0x0795 }
            X.0pf r4 = r8.A0C     // Catch:{ all -> 0x0795 }
            X.0sc r1 = r9.A02     // Catch:{ all -> 0x0795 }
            java.lang.String r0 = ".Thumbs"
            java.io.File r0 = r1.A07(r0)     // Catch:{ all -> 0x0795 }
            X.AnonymousClass1XI.A0A(r4, r0)     // Catch:{ all -> 0x0795 }
            java.lang.String r0 = ".StickerThumbs"
            java.io.File r0 = r1.A07(r0)     // Catch:{ all -> 0x0795 }
            X.C16180sb.A04(r0, r7)     // Catch:{ all -> 0x0795 }
            X.AnonymousClass1XI.A0A(r4, r0)     // Catch:{ all -> 0x0795 }
            android.content.Context r0 = r8.A00     // Catch:{ all -> 0x0795 }
            java.io.File r1 = r0.getExternalCacheDir()     // Catch:{ all -> 0x0795 }
            java.lang.String r0 = "gif/gif_preview_cache"
            java.io.File r1 = X.C13700nu.A0C(r1, r0)     // Catch:{ all -> 0x0795 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0795 }
            if (r0 == 0) goto L_0x078c
            X.AnonymousClass1XI.A0E(r1, r2)     // Catch:{ all -> 0x0795 }
        L_0x078c:
            if (r6 == 0) goto L_0x0791
            r6.release()
        L_0x0791:
            r5.A01()
            return
        L_0x0795:
            r0 = move-exception
            if (r6 == 0) goto L_0x079b
            r6.release()
        L_0x079b:
            r5.A01()
            throw r0
        L_0x079f:
            java.lang.Object r0 = r4.A00
            com.facebook.redex.IDxBReceiverShape7S0100000_2_I0 r0 = (com.facebook.redex.IDxBReceiverShape7S0100000_2_I0) r0
            java.lang.Object r2 = r4.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A00
            X.16k r1 = (X.C220416k) r1
            monitor-enter(r1)
            X.0sK r0 = r1.A00     // Catch:{ all -> 0x07d9 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x07d9 }
            if (r0 == 0) goto L_0x07ba
            java.lang.String r0 = "androidcontactssync/skipping updating Android contact action items due to being in companion mode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07d9 }
            goto L_0x07d7
        L_0x07ba:
            X.19Y r0 = r1.A01     // Catch:{ all -> 0x07d9 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x07d9 }
            if (r0 != 0) goto L_0x07c8
            java.lang.String r0 = "androidcontactssync/skipping updating Android contact action items due to permissions denied"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07d9 }
            goto L_0x07d7
        L_0x07c8:
            android.accounts.Account r0 = r1.A02(r2)     // Catch:{ all -> 0x07d9 }
            if (r0 == 0) goto L_0x07d2
            r1.A03(r0, r2)     // Catch:{ all -> 0x07d9 }
            goto L_0x07d7
        L_0x07d2:
            java.lang.String r0 = "androidcontactssync/skipping updating Android contact action items due to null account"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x07d9 }
        L_0x07d7:
            monitor-exit(r1)
            return
        L_0x07d9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x07dc:
            java.lang.Object r2 = r4.A00
            X.0t6 r2 = (X.C16460t6) r2
            java.lang.Object r1 = r4.A01
            X.0rv r1 = (X.C15830rv) r1
            r0 = 0
            r2.A0s(r1, r0)
            return
        L_0x07e9:
            java.lang.Object r5 = r4.A00
            X.2rU r5 = (X.C57632rU) r5
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r0)
            r5.A00 = r3
            java.lang.Object r2 = r4.A01
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            X.2rN r1 = r5.A03
            X.4fG r0 = new X.4fG
            r0.<init>(r2, r1)
            r3.addUpdateListener(r0)
            android.animation.ValueAnimator r2 = r5.A00
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.animation.ValueAnimator r0 = r5.A00
            r0.start()
            r0 = 0
            r5.A02 = r0
            return
        L_0x0817:
            java.lang.Object r1 = r4.A01
            X.4Oj r1 = (X.C85424Oj) r1
            java.lang.Object r0 = r4.A00
            com.facebook.redex.RunnableRunnableShape1S1300000_I1 r0 = (com.facebook.redex.RunnableRunnableShape1S1300000_I1) r0
            java.lang.Object r4 = r0.A00
            X.0q4 r4 = (X.C14960q4) r4
            r3 = 0
            X.2Wa r1 = X.C62563Eb.A04(r4, r1, r3)
            java.lang.Object r2 = r0.A02
            X.0q1 r2 = (X.C14930q1) r2
            X.0q2 r0 = new X.0q2
            r0.<init>()
            r0.A03(r1, r3)
            java.util.List r1 = r0.A00
            X.0q3 r0 = new X.0q3
            r0.<init>(r1)
            X.C14980q6.A00(r4, r0, r2)
            return
        L_0x083f:
            java.lang.Object r3 = r4.A00
            X.4RR r3 = (X.AnonymousClass4RR) r3
            java.lang.Object r0 = r4.A01
            android.content.Intent r0 = (android.content.Intent) r0
            java.lang.String r2 = r0.getAction()
            int r0 = X.C13680ns.A06(r2)
            int r0 = r0 + 61
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Service took too long to process intent: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " App may get closed."
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "FirebaseInstanceId"
            android.util.Log.w(r0, r1)
            r3.A00()
            return
        L_0x086c:
            java.lang.Object r6 = r4.A00
            X.0rE r6 = (X.C15500rE) r6
            java.lang.Object r0 = r4.A01
            X.0pF r0 = (X.C14480pF) r0
            int r5 = r0.A00
            monitor-enter(r6)
            android.util.SparseArray r4 = r6.A03     // Catch:{ all -> 0x08a5 }
            java.lang.Object r3 = r4.get(r5)     // Catch:{ all -> 0x08a5 }
            X.0pF r3 = (X.C14480pF) r3     // Catch:{ all -> 0x08a5 }
            if (r3 == 0) goto L_0x08a3
            java.lang.String r2 = "MessengerIpcClient"
            r0 = 31
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)     // Catch:{ all -> 0x08a5 }
            java.lang.String r0 = "Timing out request: "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r5)     // Catch:{ all -> 0x08a5 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x08a5 }
            r4.remove(r5)     // Catch:{ all -> 0x08a5 }
            r2 = 3
            java.lang.String r1 = "Timed out waiting for response"
            X.0pJ r0 = new X.0pJ     // Catch:{ all -> 0x08a5 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x08a5 }
            r3.A01(r0)     // Catch:{ all -> 0x08a5 }
            r6.A00()     // Catch:{ all -> 0x08a5 }
        L_0x08a3:
            monitor-exit(r6)
            return
        L_0x08a5:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x08a8:
            java.lang.Object r0 = r4.A01
            X.4t9 r0 = (X.C98894t9) r0
            java.lang.Object r2 = r0.A01
            monitor-enter(r2)
            X.0ou r1 = r0.A00     // Catch:{ all -> 0x08be }
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x08be }
            X.0on r0 = (X.C14210on) r0     // Catch:{ all -> 0x08be }
            java.lang.Object r0 = r0.A01()     // Catch:{ all -> 0x08be }
            r1.AYB(r0)     // Catch:{ all -> 0x08be }
            monitor-exit(r2)     // Catch:{ all -> 0x08be }
            return
        L_0x08be:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x08be }
            throw r0
        L_0x08c1:
            java.lang.Object r0 = r4.A01
            X.4t8 r0 = (X.C98884t8) r0
            java.lang.Object r2 = r0.A01
            monitor-enter(r2)
            X.0ot r1 = r0.A00     // Catch:{ all -> 0x08da }
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x08da }
            X.0on r0 = (X.C14210on) r0     // Catch:{ all -> 0x08da }
            java.lang.Exception r0 = r0.A00()     // Catch:{ all -> 0x08da }
            X.C13710nw.A01(r0)     // Catch:{ all -> 0x08da }
            r1.AQu(r0)     // Catch:{ all -> 0x08da }
            monitor-exit(r2)     // Catch:{ all -> 0x08da }
            return
        L_0x08da:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x08da }
            throw r0
        L_0x08dd:
            java.lang.Object r0 = r4.A01
            X.4t7 r0 = (X.C98874t7) r0
            java.lang.Object r2 = r0.A01
            monitor-enter(r2)
            X.5OG r1 = r0.A00     // Catch:{ all -> 0x08ef }
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x08ef }
            X.0on r0 = (X.C14210on) r0     // Catch:{ all -> 0x08ef }
            r1.AOw(r0)     // Catch:{ all -> 0x08ef }
            monitor-exit(r2)     // Catch:{ all -> 0x08ef }
            return
        L_0x08ef:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x08ef }
            throw r0
        L_0x08f2:
            java.lang.Object r0 = r4.A00
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r4.A01
            X.0p3 r2 = (X.C14370p3) r2
            X.C90414e6.A00(r0)     // Catch:{ Exception -> 0x0902 }
            r0 = 0
            r2.A01(r0)     // Catch:{ Exception -> 0x0902 }
            return
        L_0x0902:
            r1 = move-exception
            X.0on r0 = r2.A00
            r0.A07(r1)
            return
        L_0x0909:
            java.lang.Object r0 = r4.A00
            X.4GS r0 = (X.AnonymousClass4GS) r0
            java.lang.Object r1 = r4.A01
            X.4Oq r1 = (X.C85484Oq) r1
            X.5TJ r0 = r0.A01
            r0.AZb(r1)
            return
        L_0x0917:
            java.lang.Object r0 = r4.A00
            X.4GS r0 = (X.AnonymousClass4GS) r0
            java.lang.Object r1 = r4.A01
            X.4Oq r1 = (X.C85484Oq) r1
            monitor-enter(r1)
            monitor-exit(r1)
            X.5TJ r0 = r0.A01
            r0.AZa(r1)
            return
        L_0x0927:
            java.lang.Object r0 = r4.A00
            X.4GS r0 = (X.AnonymousClass4GS) r0
            java.lang.Object r1 = r4.A01
            android.view.Surface r1 = (android.view.Surface) r1
            X.5TJ r0 = r0.A01
            r0.AW5(r1)
            return
        L_0x0935:
            java.lang.Object r0 = r4.A01
            X.3E2 r0 = (X.AnonymousClass3E2) r0
            X.AnonymousClass3E2.A01(r0)
            return
        L_0x093d:
            java.lang.Object r0 = r4.A00
            X.4TD r0 = (X.AnonymousClass4TD) r0
            java.lang.Object r1 = r4.A01
            java.lang.Exception r1 = (java.lang.Exception) r1
            X.5TI r0 = r0.A01
            r0.AMr(r1)
            return
        L_0x094b:
            java.lang.Object r0 = r4.A00
            X.4TD r0 = (X.AnonymousClass4TD) r0
            java.lang.Object r1 = r4.A01
            X.4Oq r1 = (X.C85484Oq) r1
            X.5TI r0 = r0.A01
            r0.AMn(r1)
            return
        L_0x0959:
            java.lang.Object r0 = r4.A00
            X.4TD r0 = (X.AnonymousClass4TD) r0
            java.lang.Object r1 = r4.A01
            X.4Oq r1 = (X.C85484Oq) r1
            monitor-enter(r1)
            monitor-exit(r1)
            X.5TI r0 = r0.A01
            r0.AMm(r1)
            return
        L_0x0969:
            java.lang.Object r0 = r4.A01
            X.4VB r0 = (X.AnonymousClass4VB) r0
            X.C97274pg.A02(r0)     // Catch:{ 43y -> 0x0971 }
            goto L_0x097f
        L_0x0971:
            r2 = move-exception
            java.lang.String r1 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Unexpected error delivering message on external thread."
            X.C89504cL.A01(r1, r0, r2)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
        L_0x097f:
            return
        L_0x0980:
            java.lang.Object r0 = r4.A00
            X.58U r0 = (X.AnonymousClass58U) r0
            int r0 = r0.A00
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r4.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0991:
            java.lang.Object r0 = r4.A01
            X.4nn r0 = (X.C96104nn) r0
            r0.A9t()
            r0.AG7()
            return
        L_0x099c:
            java.lang.String r0 = "playlistParserFactory"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x09a3:
            return
        L_0x09a4:
            return
        L_0x09a5:
            return
        L_0x09a6:
            return
        L_0x09a7:
            int r1 = r9.A00
            java.util.concurrent.atomic.AtomicReference r0 = r6.A04
            r0.set(r8)
            X.3CL r0 = r6.A03
            r0.A04(r2, r1)
            return
        L_0x09b4:
            return
        L_0x09b5:
            r0 = move-exception
            throw r0
        L_0x09b7:
            r1 = r3
            X.2sH r1 = (X.C57972sH) r1     // Catch:{ SecurityException -> 0x09cc }
            boolean r0 = r1.AcM()     // Catch:{ SecurityException -> 0x09cc }
            if (r0 == 0) goto L_0x09c6
            java.util.Set r0 = r1.A01     // Catch:{ SecurityException -> 0x09cc }
        L_0x09c2:
            r3.AFQ(r4, r0)     // Catch:{ SecurityException -> 0x09cc }
            goto L_0x09cb
        L_0x09c6:
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ SecurityException -> 0x09cc }
            goto L_0x09c2
        L_0x09cb:
            return
        L_0x09cc:
            r2 = move-exception
            java.lang.String r1 = "GoogleApiManager"
            java.lang.String r0 = "Failed to get service from broker. "
            android.util.Log.e(r1, r0, r2)
            java.lang.String r0 = "Failed to get service from broker."
            X.0rp r3 = (X.C15770rp) r3
            r3.A0S = r0
            r3.A80()
            r1 = 10
            X.0rh r0 = new X.0rh
            r0.<init>(r1)
            r5.A07(r0, r4)
            return
        L_0x09e8:
            r5.A07(r1, r4)
            return
        L_0x09ec:
            boolean r11 = r6.A08
            r6.A08 = r12
            X.4df r7 = r5.A03
            int r8 = r6.A01
            r9 = 1
            int r10 = r6.A03
            r6.A06(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape12S0200000_I1.run():void");
    }
}

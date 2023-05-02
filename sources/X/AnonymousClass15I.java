package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.15I  reason: invalid class name */
public class AnonymousClass15I {
    public SharedPreferences A00;
    public final C16040sK A01;
    public final C17150uc A02;
    public final C16000sG A03;
    public final C17030uP A04;
    public final C30961dF A05;
    public final AnonymousClass2D1 A06;
    public final AnonymousClass158 A07;
    public final C16440t3 A08;
    public final C19820z3 A09;
    public final C16920ts A0A;
    public final C15810rt A0B;
    public final C16460t6 A0C;
    public final C16070sO A0D;
    public final C18550ws A0E;
    public final C221316t A0F = new AnonymousClass2D2(this);
    public final C18940xV A0G;
    public final C17290uq A0H;
    public final AnonymousClass15B A0I;
    public final AnonymousClass10G A0J;
    public final C17580vJ A0K;
    public final AnonymousClass15H A0L;
    public final AnonymousClass15G A0M;
    public final C18030w2 A0N;
    public final C18600wx A0O;
    public final C14710pd A0P;
    public final C16490t9 A0Q;
    public final C18040w3 A0R;
    public final C17240ul A0S;
    public final C19830z4 A0T;
    public final C17020u3 A0U;
    public final C16220sf A0V;
    public final C18570wu A0W;
    public final AnonymousClass15F A0X;
    public final AnonymousClass15D A0Y;
    public final AnonymousClass1WA A0Z;
    public final C19270y9 A0a;

    public AnonymousClass15I(C16040sK r8, C17150uc r9, C16000sG r10, C17030uP r11, AnonymousClass159 r12, AnonymousClass157 r13, AnonymousClass158 r14, C16440t3 r15, C19820z3 r16, C16920ts r17, C15810rt r18, C16460t6 r19, C16070sO r20, C18550ws r21, C19150xq r22, C17290uq r23, AnonymousClass15B r24, AnonymousClass10G r25, C17580vJ r26, AnonymousClass15H r27, AnonymousClass15G r28, C18030w2 r29, C18600wx r30, C14710pd r31, C16490t9 r32, C18040w3 r33, C17240ul r34, C19830z4 r35, C17020u3 r36, C16220sf r37, C18570wu r38, AnonymousClass15F r39, AnonymousClass15D r40, C16320sq r41, AnonymousClass15A r42) {
        AnonymousClass2D1 r5 = new AnonymousClass2D1(this);
        this.A06 = r5;
        IDxCObserverShape111S0100000_2_I0 iDxCObserverShape111S0100000_2_I0 = new IDxCObserverShape111S0100000_2_I0(this, 4);
        this.A0a = iDxCObserverShape111S0100000_2_I0;
        AnonymousClass2D3 r3 = new AnonymousClass2D3(this);
        this.A05 = r3;
        IDxMObserverShape74S0100000_2_I0 iDxMObserverShape74S0100000_2_I0 = new IDxMObserverShape74S0100000_2_I0(this, 3);
        this.A0G = iDxMObserverShape74S0100000_2_I0;
        this.A08 = r15;
        this.A0P = r31;
        this.A0A = r17;
        this.A01 = r8;
        this.A0B = r18;
        this.A0Q = r32;
        this.A0H = r23;
        this.A0I = r24;
        this.A0E = r21;
        this.A0N = r29;
        this.A03 = r10;
        this.A0Y = r40;
        this.A0C = r19;
        this.A0X = r39;
        this.A0S = r34;
        this.A0K = r26;
        this.A0V = r37;
        this.A0W = r38;
        this.A0R = r33;
        this.A0M = r28;
        this.A0J = r25;
        this.A04 = r11;
        this.A02 = r9;
        this.A0L = r27;
        this.A0D = r20;
        this.A0U = r36;
        this.A09 = r16;
        this.A07 = r14;
        this.A0O = r30;
        this.A0Z = new AnonymousClass1WA(r41, false);
        this.A0T = r35;
        r22.A02(iDxMObserverShape74S0100000_2_I0);
        r12.A02(r3);
        r42.A02(iDxCObserverShape111S0100000_2_I0);
        r13.A02(r5);
    }

    public static final void A00(SharedPreferences sharedPreferences, AnonymousClass2D4 r2, String str) {
        sharedPreferences.edit().putString(str, r2.toString()).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0198, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a3, code lost:
        if (5 != r13.A08(android.net.Uri.parse(r1))) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a5, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a8, code lost:
        if (r15 == false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01aa, code lost:
        if (r9 == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ae, code lost:
        if ((r14 instanceof X.C39021rn) == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01b0, code lost:
        r2.A03 = java.lang.Long.valueOf(X.AnonymousClass2D6.A00(r2.A03, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01bc, code lost:
        r2.A02 = java.lang.Long.valueOf(X.AnonymousClass2D6.A00(r2.A02, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01cb, code lost:
        if ((r14 instanceof X.C30581cc) == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01cd, code lost:
        if (r9 == false) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01cf, code lost:
        r14 = r14.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01d5, code lost:
        if ((r14 instanceof X.C38891ra) == false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01e3, code lost:
        if (((X.C38891ra) r14).A11.A01.startsWith("product_inquiry") == false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e5, code lost:
        r2.A05 = java.lang.Long.valueOf(X.AnonymousClass2D6.A00(r2.A05, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01f2, code lost:
        r2.A01 = java.lang.Long.valueOf(X.AnonymousClass2D6.A00(r2.A01, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01fe, code lost:
        r4.edit().putString(r3, r2.toString()).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x020d, code lost:
        if (r9 == false) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x020f, code lost:
        r2 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0215, code lost:
        if (X.C16030sJ.A0H(r2) == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0217, code lost:
        r12.A08(r11, 19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x021c, code lost:
        r4 = r12.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x021e, code lost:
        if (r2 == null) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0220, code lost:
        r13 = r4.A01();
        r3 = r10.A01;
        r1 = r13.getString(X.AnonymousClass158.A00(r2, r3), "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0234, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0237, code lost:
        r0 = r1.contains("quick_reply");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x023e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0240, code lost:
        if (r0 == false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0246, code lost:
        if (r6.A0I(r11) != false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0248, code lost:
        r12.A0Z.execute(new com.facebook.redex.RunnableRunnableShape0S0201000_I0(r12, r11, 3, 14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0254, code lost:
        r4.A01().edit().remove(X.AnonymousClass158.A00(r2, r3)).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0267, code lost:
        r6 = r4.A02().getInt(X.AnonymousClass158.A00(r2, r3), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0274, code lost:
        if (r6 == 0) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0276, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0279, code lost:
        if (r6 == 1) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x027c, code lost:
        if (r6 == 2) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x027e, code lost:
        r0 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0280, code lost:
        if (r6 == 3) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0283, code lost:
        if (r6 != 4) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0285, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0288, code lost:
        r0 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if ((r5 instanceof X.C39131ry) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x028a, code lost:
        r12.A08(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x028d, code lost:
        r4.A02().edit().remove(X.AnonymousClass158.A00(r2, r3)).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r0 = r12.A0P;
        r4 = X.C16620tM.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02aa, code lost:
        if (r0.A0E(r4, 2474) == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02ac, code lost:
        if (r5 == null) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02ae, code lost:
        r3 = r12.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02b2, code lost:
        if (r3 == null) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02b4, code lost:
        r1 = r12.A0Y;
        r2 = new X.AnonymousClass2D7(r9, r8, r7, r18);
        r10 = r1.A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02c7, code lost:
        if (r10.hasNext() == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02d5, code lost:
        if (((X.AnonymousClass15C) r10.next()).A00.A0E(r4, 2474) == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02d7, code lost:
        r0 = r5 instanceof X.C38841rV;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02db, code lost:
        if ((r5 instanceof X.C30901d9) == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02dd, code lost:
        if (r0 != false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02e1, code lost:
        if (r2.A02 == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02e3, code lost:
        r1 = r11.getRawString();
        X.C18450wi.A0B(r1);
        r9 = X.C18450wi.A06(r1, "_location");
        r7 = "0";
        r0 = r3.getString(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02f6, code lost:
        if (r0 == null) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02f8, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02f9, code lost:
        r3.edit().putString(r9, java.lang.String.valueOf(X.C29501aj.A01(r7, 0) + 1)).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r12.A0M.A00(r10) == 56) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r5 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (68 != r12.A0M.A00(r10)) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r13 = r12.A05();
        r4 = r15.getRawString();
        r3 = X.AnonymousClass2D4.A00(r13.getString(r4, "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"));
        r8 = r18;
        r7 = r19;
        r18 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r17 == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        r3.A01(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r8 == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        r3.A01(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        if (r19 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        r3.A01(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r20 == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        r3.A01(21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r21 == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        r0 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r3.A01(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        if (r8 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        r3.A01(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (r19 == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        r3.A01(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        if (r21 == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009d, code lost:
        r0 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009f, code lost:
        r3.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        r2 = r14.A03(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r17 = X.C16030sJ.A0L(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        if (r17 != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ac, code lost:
        r15 = r12.A03.A08(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b2, code lost:
        if (r15 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b4, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("ChatMessageCounts/recordEngagementConversationRows/Can't get contact for jid - ");
        r1.append(r11.getRawString());
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cf, code lost:
        if (r3.A07 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d1, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        if (r9 != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d4, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d5, code lost:
        r3.A07 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00db, code lost:
        if (r9 != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00dd, code lost:
        if (r2 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00df, code lost:
        r3.A0D = java.lang.Long.valueOf(r2.A0G);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00eb, code lost:
        if (r15.A0H() == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ed, code lost:
        r1 = r3.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ef, code lost:
        if (r1 != null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f1, code lost:
        r3.A09 = 0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f9, code lost:
        r3.A08 = java.lang.Boolean.valueOf(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0100, code lost:
        r0 = r3.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0102, code lost:
        if (r0 == null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0109, code lost:
        if ((r0.booleanValue() ^ r9) == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010b, code lost:
        r3.A09 = java.lang.Long.valueOf(r1.longValue() + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0119, code lost:
        if (r9 == false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011b, code lost:
        r15 = r3.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x011d, code lost:
        if (r15 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0121, code lost:
        if (r3.A0E != null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0123, code lost:
        if (r2 == null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0125, code lost:
        r3.A0E = java.lang.Long.valueOf((r2.A0I - r15.longValue()) / 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0136, code lost:
        if (r2 == null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013a, code lost:
        if (r2.A0t == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013c, code lost:
        if (r9 != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013e, code lost:
        r3.A01(20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0143, code lost:
        A00(r13, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0146, code lost:
        if (r17 != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0148, code lost:
        r4 = r12.A05();
        r0 = r11.getRawString();
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append("_commerce");
        r3 = r1.toString();
        r2 = X.AnonymousClass2D5.A00(r4.getString(r3, "null,false,false,null,false,null,null,null,null,null"));
        r14 = r14.A03(r10);
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0170, code lost:
        if (r14 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0174, code lost:
        if ((r14 instanceof X.C39021rn) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0178, code lost:
        if ((r14 instanceof X.C38891ra) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x017a, code lost:
        r1 = r14.A10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017e, code lost:
        if (r1 == 52) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0182, code lost:
        if (r1 == 54) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0186, code lost:
        if ((r14 instanceof X.C30581cc) == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0188, code lost:
        r1 = r14.A0I();
        r13 = r12.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0192, code lost:
        if (r13.A0D(r1) != false) goto L_0x01a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A01(X.AnonymousClass15I r14, X.C15830rv r15, X.C28381Vw r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21) {
        /*
            r12 = r14
            monitor-enter(r12)
            X.0w3 r1 = r14.A0R     // Catch:{ all -> 0x0318 }
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x0318 }
            r0.<init>()     // Catch:{ all -> 0x0318 }
            long r3 = r1.A02(r0)     // Catch:{ all -> 0x0318 }
            X.0t6 r0 = r14.A0C     // Catch:{ all -> 0x0318 }
            X.0th r14 = r0.A0K     // Catch:{ all -> 0x0318 }
            r10 = r16
            X.0tZ r0 = r14.A03(r10)     // Catch:{ all -> 0x0318 }
            if (r0 == 0) goto L_0x001f
            long r1 = r0.A0I     // Catch:{ all -> 0x0318 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0316
        L_0x001f:
            X.0sK r6 = r12.A01     // Catch:{ all -> 0x0318 }
            r11 = r15
            boolean r0 = r6.A0I(r15)     // Catch:{ all -> 0x0318 }
            if (r0 != 0) goto L_0x0316
            X.0tZ r5 = r14.A03(r10)     // Catch:{ all -> 0x0318 }
            r9 = r17
            if (r17 != 0) goto L_0x0033
            if (r5 != 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            boolean r0 = r5 instanceof X.C39131ry     // Catch:{ all -> 0x0318 }
            if (r0 == 0) goto L_0x0047
        L_0x0037:
            X.0tZ r0 = r14.A03(r10)     // Catch:{ all -> 0x0318 }
            if (r0 != 0) goto L_0x0316
            X.15G r0 = r12.A0M     // Catch:{ all -> 0x0318 }
            byte r1 = r0.A00(r10)     // Catch:{ all -> 0x0318 }
            r0 = 56
            if (r1 != r0) goto L_0x0316
        L_0x0047:
            if (r5 != 0) goto L_0x0055
            r1 = 68
            X.15G r0 = r12.A0M     // Catch:{ all -> 0x0318 }
            byte r0 = r0.A00(r10)     // Catch:{ all -> 0x0318 }
            if (r1 != r0) goto L_0x0055
            goto L_0x0316
        L_0x0055:
            android.content.SharedPreferences r13 = r12.A05()     // Catch:{ all -> 0x0314 }
            java.lang.String r4 = r15.getRawString()     // Catch:{ all -> 0x0314 }
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r13.getString(r4, r0)     // Catch:{ all -> 0x0314 }
            X.2D4 r3 = X.AnonymousClass2D4.A00(r0)     // Catch:{ all -> 0x0314 }
            r8 = r18
            r7 = r19
            r18 = r20
            if (r17 == 0) goto L_0x008b
            r0 = 0
            r3.A01(r0)     // Catch:{ all -> 0x0314 }
            if (r8 == 0) goto L_0x0079
            r0 = 2
            r3.A01(r0)     // Catch:{ all -> 0x0314 }
        L_0x0079:
            if (r19 == 0) goto L_0x007f
            r0 = 4
            r3.A01(r0)     // Catch:{ all -> 0x0314 }
        L_0x007f:
            if (r20 == 0) goto L_0x0086
            r0 = 21
            r3.A01(r0)     // Catch:{ all -> 0x0314 }
        L_0x0086:
            if (r21 == 0) goto L_0x00a2
            r0 = 22
            goto L_0x009f
        L_0x008b:
            r0 = 1
            r3.A01(r0)     // Catch:{ all -> 0x0314 }
            if (r8 == 0) goto L_0x0095
            r0 = 3
            r3.A01(r0)     // Catch:{ all -> 0x0314 }
        L_0x0095:
            if (r19 == 0) goto L_0x009b
            r0 = 5
            r3.A01(r0)     // Catch:{ all -> 0x0314 }
        L_0x009b:
            if (r21 == 0) goto L_0x00a2
            r0 = 23
        L_0x009f:
            r3.A01(r0)     // Catch:{ all -> 0x0314 }
        L_0x00a2:
            X.0tZ r2 = r14.A03(r10)     // Catch:{ all -> 0x0314 }
            boolean r17 = X.C16030sJ.A0L(r15)     // Catch:{ all -> 0x0312 }
            if (r17 != 0) goto L_0x0136
            X.0sG r0 = r12.A03     // Catch:{ all -> 0x0312 }
            X.0sH r15 = r0.A08(r15)     // Catch:{ all -> 0x0312 }
            if (r15 != 0) goto L_0x00cd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0312 }
            r1.<init>()     // Catch:{ all -> 0x0312 }
            java.lang.String r0 = "ChatMessageCounts/recordEngagementConversationRows/Can't get contact for jid - "
            r1.append(r0)     // Catch:{ all -> 0x0312 }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x0312 }
            r1.append(r0)     // Catch:{ all -> 0x0312 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0312 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0312 }
            goto L_0x0136
        L_0x00cd:
            java.lang.Boolean r0 = r3.A07     // Catch:{ all -> 0x0312 }
            if (r0 != 0) goto L_0x00e7
            r0 = 0
            if (r9 != 0) goto L_0x00d5
            r0 = 1
        L_0x00d5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0312 }
            r3.A07 = r0     // Catch:{ all -> 0x0312 }
            if (r9 != 0) goto L_0x00e7
            if (r2 == 0) goto L_0x00e7
            long r0 = r2.A0G     // Catch:{ all -> 0x0312 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0312 }
            r3.A0D = r0     // Catch:{ all -> 0x0312 }
        L_0x00e7:
            boolean r0 = r15.A0H()     // Catch:{ all -> 0x0312 }
            if (r0 == 0) goto L_0x0119
            java.lang.Long r1 = r3.A09     // Catch:{ all -> 0x0312 }
            if (r1 != 0) goto L_0x0100
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0312 }
            r3.A09 = r0     // Catch:{ all -> 0x0312 }
        L_0x00f9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0312 }
            r3.A08 = r0     // Catch:{ all -> 0x0312 }
            goto L_0x0119
        L_0x0100:
            java.lang.Boolean r0 = r3.A08     // Catch:{ all -> 0x0312 }
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0312 }
            r0 = r0 ^ r9
            if (r0 == 0) goto L_0x00f9
            long r15 = r1.longValue()     // Catch:{ all -> 0x0312 }
            r0 = 1
            long r15 = r15 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0312 }
            r3.A09 = r0     // Catch:{ all -> 0x0312 }
            goto L_0x00f9
        L_0x0119:
            if (r9 == 0) goto L_0x0136
            java.lang.Long r15 = r3.A0D     // Catch:{ all -> 0x0312 }
            if (r15 == 0) goto L_0x0136
            java.lang.Long r0 = r3.A0E     // Catch:{ all -> 0x0312 }
            if (r0 != 0) goto L_0x0136
            if (r2 == 0) goto L_0x0143
            long r0 = r2.A0I     // Catch:{ all -> 0x0312 }
            long r15 = r15.longValue()     // Catch:{ all -> 0x0312 }
            long r0 = r0 - r15
            r15 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r15
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0312 }
            r3.A0E = r0     // Catch:{ all -> 0x0312 }
            goto L_0x0138
        L_0x0136:
            if (r2 == 0) goto L_0x0143
        L_0x0138:
            boolean r0 = r2.A0t     // Catch:{ all -> 0x0314 }
            if (r0 == 0) goto L_0x0143
            if (r9 != 0) goto L_0x0143
            r0 = 20
            r3.A01(r0)     // Catch:{ all -> 0x0314 }
        L_0x0143:
            A00(r13, r3, r4)     // Catch:{ all -> 0x0314 }
            if (r17 != 0) goto L_0x020d
            android.content.SharedPreferences r4 = r12.A05()     // Catch:{ all -> 0x0314 }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x0314 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0314 }
            r1.<init>()     // Catch:{ all -> 0x0314 }
            r1.append(r0)     // Catch:{ all -> 0x0314 }
            java.lang.String r0 = "_commerce"
            r1.append(r0)     // Catch:{ all -> 0x0314 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0314 }
            java.lang.String r0 = "null,false,false,null,false,null,null,null,null,null"
            java.lang.String r0 = r4.getString(r3, r0)     // Catch:{ all -> 0x0314 }
            X.2D5 r2 = X.AnonymousClass2D5.A00(r0)     // Catch:{ all -> 0x0314 }
            X.0tZ r14 = r14.A03(r10)     // Catch:{ all -> 0x0314 }
            r15 = 0
            if (r14 == 0) goto L_0x01a6
            boolean r0 = r14 instanceof X.C39021rn     // Catch:{ all -> 0x0314 }
            if (r0 != 0) goto L_0x01a5
            boolean r0 = r14 instanceof X.C38891ra     // Catch:{ all -> 0x0314 }
            if (r0 != 0) goto L_0x01a5
            byte r1 = r14.A10     // Catch:{ all -> 0x0314 }
            r0 = 52
            if (r1 == r0) goto L_0x01a5
            r0 = 54
            if (r1 == r0) goto L_0x01a5
            boolean r0 = r14 instanceof X.C30581cc     // Catch:{ all -> 0x0314 }
            if (r0 == 0) goto L_0x01a6
            java.lang.String r1 = r14.A0I()     // Catch:{ all -> 0x0314 }
            X.0w2 r13 = r12.A0N     // Catch:{ all -> 0x0314 }
            boolean r0 = r13.A0D(r1)     // Catch:{ all -> 0x0314 }
            if (r0 != 0) goto L_0x01a5
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0314 }
            if (r0 != 0) goto L_0x01a6
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x0314 }
            r1 = 5
            int r0 = r13.A08(r0)     // Catch:{ all -> 0x0314 }
            if (r1 != r0) goto L_0x01a6
        L_0x01a5:
            r15 = 1
        L_0x01a6:
            r0 = 1
            if (r15 == 0) goto L_0x01c9
            if (r9 == 0) goto L_0x01f2
            boolean r13 = r14 instanceof X.C39021rn     // Catch:{ all -> 0x0314 }
            if (r13 == 0) goto L_0x01bc
            java.lang.Long r13 = r2.A03     // Catch:{ all -> 0x0314 }
            long r13 = X.AnonymousClass2D6.A00(r13, r0)     // Catch:{ all -> 0x0314 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0314 }
            r2.A03 = r13     // Catch:{ all -> 0x0314 }
        L_0x01bc:
            java.lang.Long r13 = r2.A02     // Catch:{ all -> 0x0314 }
            long r0 = X.AnonymousClass2D6.A00(r13, r0)     // Catch:{ all -> 0x0314 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0314 }
            r2.A02 = r0     // Catch:{ all -> 0x0314 }
            goto L_0x01fe
        L_0x01c9:
            boolean r13 = r14 instanceof X.C30581cc     // Catch:{ all -> 0x0314 }
            if (r13 == 0) goto L_0x020d
            if (r9 == 0) goto L_0x02a0
            X.0tZ r14 = r14.A0D()     // Catch:{ all -> 0x0314 }
            boolean r13 = r14 instanceof X.C38891ra     // Catch:{ all -> 0x0314 }
            if (r13 == 0) goto L_0x01fe
            X.1ra r14 = (X.C38891ra) r14     // Catch:{ all -> 0x0314 }
            X.1Vw r13 = r14.A11     // Catch:{ all -> 0x0314 }
            java.lang.String r14 = r13.A01     // Catch:{ all -> 0x0314 }
            java.lang.String r13 = "product_inquiry"
            boolean r13 = r14.startsWith(r13)     // Catch:{ all -> 0x0314 }
            if (r13 == 0) goto L_0x01fe
            java.lang.Long r13 = r2.A05     // Catch:{ all -> 0x0314 }
            long r0 = X.AnonymousClass2D6.A00(r13, r0)     // Catch:{ all -> 0x0314 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0314 }
            r2.A05 = r0     // Catch:{ all -> 0x0314 }
            goto L_0x01fe
        L_0x01f2:
            java.lang.Long r13 = r2.A01     // Catch:{ all -> 0x0314 }
            long r0 = X.AnonymousClass2D6.A00(r13, r0)     // Catch:{ all -> 0x0314 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0314 }
            r2.A01 = r0     // Catch:{ all -> 0x0314 }
        L_0x01fe:
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x0314 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0314 }
            android.content.SharedPreferences$Editor r0 = r1.putString(r3, r0)     // Catch:{ all -> 0x0314 }
            r0.apply()     // Catch:{ all -> 0x0314 }
        L_0x020d:
            if (r9 == 0) goto L_0x02a0
            X.0rv r2 = r10.A00     // Catch:{ all -> 0x0314 }
            boolean r0 = X.C16030sJ.A0H(r2)     // Catch:{ all -> 0x0314 }
            if (r0 == 0) goto L_0x021c
            r0 = 19
            r12.A08(r11, r0)     // Catch:{ all -> 0x0314 }
        L_0x021c:
            X.158 r4 = r12.A07     // Catch:{ all -> 0x0314 }
            if (r2 == 0) goto L_0x02a0
            android.content.SharedPreferences r13 = r4.A01()     // Catch:{ all -> 0x0314 }
            java.lang.String r3 = r10.A01     // Catch:{ all -> 0x0314 }
            java.lang.String r1 = X.AnonymousClass158.A00(r2, r3)     // Catch:{ all -> 0x0314 }
            java.lang.String r0 = ""
            java.lang.String r1 = r13.getString(r1, r0)     // Catch:{ all -> 0x0314 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0314 }
            if (r0 == 0) goto L_0x0237
            goto L_0x023e
        L_0x0237:
            java.lang.String r0 = "quick_reply"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0314 }
            goto L_0x023f
        L_0x023e:
            r0 = 0
        L_0x023f:
            r10 = 3
            if (r0 == 0) goto L_0x0267
            boolean r0 = r6.A0I(r11)     // Catch:{ all -> 0x0314 }
            if (r0 != 0) goto L_0x0254
            X.1WA r6 = r12.A0Z     // Catch:{ all -> 0x0314 }
            r1 = 14
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0     // Catch:{ all -> 0x0314 }
            r0.<init>((X.AnonymousClass15I) r12, (X.C15830rv) r11, (int) r10, (int) r1)     // Catch:{ all -> 0x0314 }
            r6.execute(r0)     // Catch:{ all -> 0x0314 }
        L_0x0254:
            android.content.SharedPreferences r0 = r4.A01()     // Catch:{ all -> 0x0314 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0314 }
            java.lang.String r0 = X.AnonymousClass158.A00(r2, r3)     // Catch:{ all -> 0x0314 }
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x0314 }
            r0.apply()     // Catch:{ all -> 0x0314 }
        L_0x0267:
            r6 = 0
            android.content.SharedPreferences r1 = r4.A02()     // Catch:{ all -> 0x0314 }
            java.lang.String r0 = X.AnonymousClass158.A00(r2, r3)     // Catch:{ all -> 0x0314 }
            int r6 = r1.getInt(r0, r6)     // Catch:{ all -> 0x0314 }
            if (r6 == 0) goto L_0x02a0
            r1 = 1
            r0 = 8
            if (r6 == r1) goto L_0x028a
            r0 = 2
            if (r6 == r0) goto L_0x0288
            r0 = 11
            if (r6 == r10) goto L_0x028a
            r0 = 4
            if (r6 != r0) goto L_0x028d
            r0 = 10
            goto L_0x028a
        L_0x0288:
            r0 = 12
        L_0x028a:
            r12.A08(r11, r0)     // Catch:{ all -> 0x0314 }
        L_0x028d:
            android.content.SharedPreferences r0 = r4.A02()     // Catch:{ all -> 0x0314 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0314 }
            java.lang.String r0 = X.AnonymousClass158.A00(r2, r3)     // Catch:{ all -> 0x0314 }
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x0314 }
            r0.apply()     // Catch:{ all -> 0x0314 }
        L_0x02a0:
            X.0pd r0 = r12.A0P     // Catch:{ all -> 0x0318 }
            r6 = 2474(0x9aa, float:3.467E-42)
            X.0tM r4 = X.C16620tM.A02     // Catch:{ all -> 0x0318 }
            boolean r0 = r0.A0E(r4, r6)     // Catch:{ all -> 0x0318 }
            if (r0 == 0) goto L_0x0316
            if (r5 == 0) goto L_0x0316
            android.content.SharedPreferences r3 = r12.A05()     // Catch:{ all -> 0x0318 }
            if (r3 == 0) goto L_0x0316
            X.15D r1 = r12.A0Y     // Catch:{ all -> 0x0318 }
            X.2D7 r2 = new X.2D7     // Catch:{ all -> 0x0318 }
            r0 = r18
            r2.<init>(r9, r8, r7, r0)     // Catch:{ all -> 0x0318 }
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x0318 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0318 }
        L_0x02c3:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0318 }
            if (r0 == 0) goto L_0x0316
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0318 }
            X.15C r0 = (X.AnonymousClass15C) r0     // Catch:{ all -> 0x0318 }
            X.0pd r0 = r0.A00     // Catch:{ all -> 0x0318 }
            boolean r0 = r0.A0E(r4, r6)     // Catch:{ all -> 0x0318 }
            if (r0 == 0) goto L_0x02c3
            boolean r1 = r5 instanceof X.C30901d9     // Catch:{ all -> 0x0318 }
            boolean r0 = r5 instanceof X.C38841rV     // Catch:{ all -> 0x0318 }
            if (r1 == 0) goto L_0x02c3
            if (r0 != 0) goto L_0x02c3
            boolean r0 = r2.A02     // Catch:{ all -> 0x0318 }
            if (r0 == 0) goto L_0x02c3
            java.lang.String r1 = r11.getRawString()     // Catch:{ all -> 0x0318 }
            X.C18450wi.A0B(r1)     // Catch:{ all -> 0x0318 }
            java.lang.String r0 = "_location"
            java.lang.String r9 = X.C18450wi.A06(r1, r0)     // Catch:{ all -> 0x0318 }
            java.lang.String r7 = "0"
            java.lang.String r0 = r3.getString(r9, r7)     // Catch:{ all -> 0x0318 }
            if (r0 == 0) goto L_0x02f9
            r7 = r0
        L_0x02f9:
            r0 = 0
            long r7 = X.C29501aj.A01(r7, r0)     // Catch:{ all -> 0x0318 }
            r0 = 1
            long r7 = r7 + r0
            android.content.SharedPreferences$Editor r1 = r3.edit()     // Catch:{ all -> 0x0318 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0318 }
            android.content.SharedPreferences$Editor r0 = r1.putString(r9, r0)     // Catch:{ all -> 0x0318 }
            r0.apply()     // Catch:{ all -> 0x0318 }
            goto L_0x02c3
        L_0x0312:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0314 }
        L_0x0314:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0318 }
        L_0x0316:
            monitor-exit(r12)
            return
        L_0x0318:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15I.A01(X.15I, X.0rv, X.1Vw, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static /* synthetic */ boolean A02(AnonymousClass15I r1, C28381Vw r2) {
        return r1.A0C.A0K.A03(r2) == null && r1.A0M.A00(r2) == 56;
    }

    public static /* synthetic */ boolean A03(AnonymousClass15I r0, C28381Vw r1) {
        C16740tZ A032 = r0.A0C.A0K.A03(r1);
        return A032 != null && C30921dB.A00(A032.A10);
    }

    public static /* synthetic */ boolean A04(AnonymousClass15I r0, C28381Vw r1) {
        C16740tZ A032 = r0.A0C.A0K.A03(r1);
        return (A032 == null || A032.A0D() == null) ? false : true;
    }

    public final SharedPreferences A05() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A002 = this.A0U.A00("chatCounts");
        this.A00 = A002;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0782, code lost:
        if (r25 < 0) goto L_0x0784;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x080e, code lost:
        if (r7.A0D == null) goto L_0x0810;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:309:0x09da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:314:0x09df */
    /* JADX WARNING: Missing exception handler attribute for start block: B:323:0x09e8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:331:0x09f2 */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0337  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A06() {
        /*
            r35 = this;
            r22 = r35
            monitor-enter(r22)
            android.content.SharedPreferences r23 = r22.A05()     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0t3 r0 = r0.A08     // Catch:{ all -> 0x0aa2 }
            long r20 = r0.A00()     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0w3 r0 = r0.A0R     // Catch:{ all -> 0x0aa2 }
            r34 = r0
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x0aa2 }
            r1.<init>()     // Catch:{ all -> 0x0aa2 }
            long r18 = r0.A02(r1)     // Catch:{ all -> 0x0aa2 }
            long r16 = r20 - r18
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0aa0
            java.util.Map r0 = r23.getAll()     // Catch:{ all -> 0x0aa2 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0aa2 }
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0aa2 }
            r3.<init>()     // Catch:{ all -> 0x0aa2 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0aa2 }
        L_0x0038:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x006e
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0aa2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "start_time_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "thread_user_secret"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x0038
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "_"
            int r1 = r2.lastIndexOf(r0)     // Catch:{ all -> 0x0aa2 }
            r0 = -1
            if (r1 == r0) goto L_0x006a
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)     // Catch:{ all -> 0x0aa2 }
        L_0x006a:
            r3.add(r2)     // Catch:{ all -> 0x0aa2 }
            goto L_0x0038
        L_0x006e:
            java.util.Iterator r24 = r3.iterator()     // Catch:{ all -> 0x0aa2 }
        L_0x0072:
            boolean r0 = r24.hasNext()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x09f3
            java.lang.Object r25 = r24.next()     // Catch:{ all -> 0x0aa2 }
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0aa2 }
            r25 = r0
            X.2D8 r9 = new X.2D8     // Catch:{ all -> 0x0aa2 }
            r9.<init>()     // Catch:{ all -> 0x0aa2 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r18 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A17 = r0     // Catch:{ all -> 0x0aa2 }
            android.content.SharedPreferences r2 = r22.A05()     // Catch:{ all -> 0x0aa2 }
            r1 = 0
            r0 = r25
            java.lang.String r1 = r2.getString(r0, r1)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x0127
            X.2D4 r2 = X.AnonymousClass2D4.A00(r1)     // Catch:{ all -> 0x0aa2 }
            long r0 = r2.A03     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0r = r0     // Catch:{ all -> 0x0aa2 }
            long r0 = r2.A02     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0q = r0     // Catch:{ all -> 0x0aa2 }
            long r0 = r2.A01     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0h = r0     // Catch:{ all -> 0x0aa2 }
            long r0 = r2.A00     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0g = r0     // Catch:{ all -> 0x0aa2 }
            long r0 = r2.A06     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A1E = r0     // Catch:{ all -> 0x0aa2 }
            long r0 = r2.A05     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A1D = r0     // Catch:{ all -> 0x0aa2 }
            long r0 = r2.A04     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A1C = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0C     // Catch:{ all -> 0x0aa2 }
            r9.A0i = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0I     // Catch:{ all -> 0x0aa2 }
            r9.A0z = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0H     // Catch:{ all -> 0x0aa2 }
            r9.A0y = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0N     // Catch:{ all -> 0x0aa2 }
            r9.A19 = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0M     // Catch:{ all -> 0x0aa2 }
            r9.A18 = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0F     // Catch:{ all -> 0x0aa2 }
            r9.A0l = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0G     // Catch:{ all -> 0x0aa2 }
            r9.A0m = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0B     // Catch:{ all -> 0x0aa2 }
            r9.A0R = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Boolean r0 = r2.A07     // Catch:{ all -> 0x0aa2 }
            r9.A09 = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A09     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x0113
            long r3 = r0.longValue()     // Catch:{ all -> 0x0aa2 }
            r0 = 2
            long r3 = r3 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0aa2 }
            r9.A0P = r0     // Catch:{ all -> 0x0aa2 }
        L_0x0113:
            java.lang.Long r0 = r2.A0E     // Catch:{ all -> 0x0aa2 }
            r9.A0j = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0A     // Catch:{ all -> 0x0aa2 }
            r9.A0Q = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0L     // Catch:{ all -> 0x0aa2 }
            r9.A14 = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0K     // Catch:{ all -> 0x0aa2 }
            r9.A12 = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r2.A0J     // Catch:{ all -> 0x0aa2 }
            r9.A11 = r0     // Catch:{ all -> 0x0aa2 }
        L_0x0127:
            android.content.SharedPreferences r2 = r22.A05()     // Catch:{ all -> 0x0aa2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa2 }
            r1.<init>()     // Catch:{ all -> 0x0aa2 }
            r0 = r25
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "_businessTools"
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x016b
            java.lang.String r0 = ","
            java.lang.String[] r4 = r1.split(r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            java.lang.Long r3 = X.AnonymousClass2D6.A04(r4, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 1
            java.lang.Long r2 = X.AnonymousClass2D6.A04(r4, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 2
            java.lang.Long r1 = X.AnonymousClass2D6.A04(r4, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 3
            java.lang.Long r0 = X.AnonymousClass2D6.A04(r4, r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0o = r3     // Catch:{ all -> 0x0aa2 }
            r9.A0O = r2     // Catch:{ all -> 0x0aa2 }
            r9.A0k = r1     // Catch:{ all -> 0x0aa2 }
            r9.A10 = r0     // Catch:{ all -> 0x0aa2 }
        L_0x016b:
            X.0rv r8 = X.C15830rv.A02(r25)     // Catch:{ all -> 0x0aa2 }
            if (r8 == 0) goto L_0x0360
            r0 = r22
            X.0uq r0 = r0.A0H     // Catch:{ all -> 0x09e0 }
            r33 = r0
            r7 = 0
            long r0 = r0.A03(r8, r7)     // Catch:{ all -> 0x09e0 }
            r3 = 1
            r32 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x032f
            r2 = r22
            X.0t6 r11 = r2.A0C     // Catch:{ all -> 0x09e0 }
            X.0th r2 = r11.A0K     // Catch:{ all -> 0x09e0 }
            X.0tZ r12 = r2.A00(r0)     // Catch:{ all -> 0x09e0 }
            if (r12 != 0) goto L_0x01a6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x09e0 }
            r3.<init>()     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = "ChatMessageCounts/getGaStatus/Null message for id - "
            r3.append(r2)     // Catch:{ all -> 0x09e0 }
            r3.append(r0)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x09e0 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x09e0 }
            goto L_0x032f
        L_0x01a6:
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x09e0 }
            r0 = 11
            r1.set(r0, r7)     // Catch:{ all -> 0x09e0 }
            r0 = 12
            r1.set(r0, r7)     // Catch:{ all -> 0x09e0 }
            r0 = 13
            r1.set(r0, r7)     // Catch:{ all -> 0x09e0 }
            r0 = 14
            r1.set(r0, r7)     // Catch:{ all -> 0x09e0 }
            long r2 = r1.getTimeInMillis()     // Catch:{ all -> 0x09e0 }
            long r30 = r2 - r5
            long r28 = r34.A01()     // Catch:{ all -> 0x09e0 }
            r10 = 1
            int[] r6 = new int[r10]     // Catch:{ all -> 0x09e0 }
            r0 = 7
            r6[r7] = r0     // Catch:{ all -> 0x09e0 }
            r0 = r22
            X.15B r14 = r0.A0I     // Catch:{ all -> 0x09e0 }
            X.0rt r0 = r14.A02     // Catch:{ all -> 0x09e0 }
            X.0rx r13 = r0.A06(r8)     // Catch:{ all -> 0x09e0 }
            r4 = -9223372036854775808
            if (r13 == 0) goto L_0x0259
            long r0 = r13.A0F     // Catch:{ all -> 0x09e0 }
            int r15 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r15 != 0) goto L_0x0257
            java.lang.String r0 = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ?"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09e0 }
            r1.<init>(r0)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = " AND "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x09e0 }
            r4.<init>(r0)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = X.C224417y.A00(r6)     // Catch:{ all -> 0x09e0 }
            r4.append(r0)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x09e0 }
            r1.append(r0)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = " ORDER BY "
            r1.append(r0)     // Catch:{ all -> 0x09e0 }
            java.lang.String r15 = "sort_id"
            r1.append(r15)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = " ASC LIMIT 1"
            r1.append(r0)     // Catch:{ all -> 0x09e0 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x09e0 }
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x09e0 }
            X.0ts r0 = r14.A01     // Catch:{ all -> 0x09e0 }
            long r26 = r0.A02(r8)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = java.lang.String.valueOf(r26)     // Catch:{ all -> 0x09e0 }
            r1[r7] = r0     // Catch:{ all -> 0x09e0 }
            X.0tq r0 = r14.A04     // Catch:{ all -> 0x09e0 }
            X.0tf r5 = r0.get()     // Catch:{ all -> 0x09e0 }
            X.0tg r0 = r5.A02     // Catch:{ all -> 0x09db }
            android.database.Cursor r4 = r0.A08(r4, r1)     // Catch:{ all -> 0x09db }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x09cd }
            if (r0 == 0) goto L_0x023d
            int r0 = r4.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x09cd }
            long r0 = r4.getLong(r0)     // Catch:{ all -> 0x09cd }
            r13.A0F = r0     // Catch:{ all -> 0x09cd }
            goto L_0x0251
        L_0x023d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09cd }
            r1.<init>()     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "msgstore/getfirstsortrefexcludetypes can't get value for "
            r1.append(r0)     // Catch:{ all -> 0x09cd }
            r1.append(r8)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x09cd }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x09cd }
        L_0x0251:
            r4.close()     // Catch:{ all -> 0x09db }
            r5.close()     // Catch:{ all -> 0x09e0 }
        L_0x0257:
            long r4 = r13.A0F     // Catch:{ all -> 0x09e0 }
        L_0x0259:
            X.0tZ r0 = r11.A0F(r4)     // Catch:{ all -> 0x09e0 }
            if (r0 != 0) goto L_0x0275
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09e0 }
            r1.<init>()     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = "Failed to get message from coreMessageStore, sortId - "
            r1.append(r0)     // Catch:{ all -> 0x09e0 }
            r1.append(r4)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x09e0 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x09e0 }
            goto L_0x032f
        L_0x0275:
            long r0 = r0.A0I     // Catch:{ all -> 0x09e0 }
            int r4 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r4 <= 0) goto L_0x0281
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x09e0 }
            goto L_0x0331
        L_0x0281:
            r4 = r33
            r0 = r30
            long r26 = r4.A04(r8, r6, r0)     // Catch:{ all -> 0x09e0 }
            long r13 = r4.A04(r8, r6, r2)     // Catch:{ all -> 0x09e0 }
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x09e0 }
            X.0ts r0 = r4.A02     // Catch:{ all -> 0x09e0 }
            long r4 = r0.A02(r8)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x09e0 }
            r4 = 0
            r1[r7] = r0     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = java.lang.Long.toString(r26)     // Catch:{ all -> 0x09e0 }
            r1[r10] = r0     // Catch:{ all -> 0x09e0 }
            java.lang.String r5 = java.lang.Long.toString(r13)     // Catch:{ all -> 0x09e0 }
            r0 = 2
            r1[r0] = r5     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND _id>? AND _id<=?"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x09e0 }
            r7.<init>(r0)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = " AND "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x09e0 }
            r5.<init>(r0)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = X.C224417y.A00(r6)     // Catch:{ all -> 0x09e0 }
            r5.append(r0)     // Catch:{ all -> 0x09e0 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x09e0 }
            r7.append(r0)     // Catch:{ all -> 0x09e0 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x09e0 }
            r0 = r33
            X.0tq r0 = r0.A06     // Catch:{ all -> 0x09e0 }
            X.0tf r5 = r0.get()     // Catch:{ all -> 0x09e0 }
            X.0tg r0 = r5.A02     // Catch:{ all -> 0x09db }
            android.database.Cursor r6 = r0.A08(r6, r1)     // Catch:{ all -> 0x09db }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x09d4 }
            if (r0 == 0) goto L_0x02fd
            java.lang.String r0 = "count"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09d4 }
            int r4 = r6.getInt(r0)     // Catch:{ all -> 0x09d4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09d4 }
            r1.<init>()     // Catch:{ all -> 0x09d4 }
            java.lang.String r0 = "msgstore/getmessagesatid/pos:"
            r1.append(r0)     // Catch:{ all -> 0x09d4 }
            r1.append(r4)     // Catch:{ all -> 0x09d4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x09d4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x09d4 }
            goto L_0x0311
        L_0x02fd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09d4 }
            r1.<init>()     // Catch:{ all -> 0x09d4 }
            java.lang.String r0 = "msgstore/getmessagesatid/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x09d4 }
            r1.append(r8)     // Catch:{ all -> 0x09d4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x09d4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x09d4 }
        L_0x0311:
            r6.close()     // Catch:{ all -> 0x09db }
            r5.close()     // Catch:{ all -> 0x09e0 }
            long r0 = (long) r4     // Catch:{ all -> 0x09e0 }
            long r4 = r12.A0I     // Catch:{ all -> 0x09e0 }
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0329
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0329
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x09e0 }
            goto L_0x0331
        L_0x0329:
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x09e0 }
            goto L_0x0331
        L_0x032f:
            r0 = r32
        L_0x0331:
            r9.A0L = r0     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x0360
            r1 = r8
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0sG r0 = r0.A03     // Catch:{ all -> 0x0aa2 }
            X.0sH r0 = r0.A08(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x04e0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa2 }
            r2.<init>()     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Contact is null for jid - "
        L_0x034b:
            r2.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = r1.getRawString()     // Catch:{ all -> 0x0aa2 }
            r2.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0aa2 }
        L_0x0359:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0aa2 }
        L_0x035c:
            r0 = r32
            r9.A0G = r0     // Catch:{ all -> 0x0aa2 }
        L_0x0360:
            android.content.SharedPreferences r2 = r22.A05()     // Catch:{ all -> 0x0aa2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa2 }
            r1.<init>()     // Catch:{ all -> 0x0aa2 }
            r0 = r25
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "_commerce"
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x03ca
            X.2D5 r1 = X.AnonymousClass2D5.A00(r1)     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r1.A06     // Catch:{ all -> 0x0aa2 }
            r9.A0x = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r1.A03     // Catch:{ all -> 0x0aa2 }
            r9.A0u = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r1.A05     // Catch:{ all -> 0x0aa2 }
            r9.A0w = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r1.A04     // Catch:{ all -> 0x0aa2 }
            r9.A0v = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r1.A02     // Catch:{ all -> 0x0aa2 }
            r9.A0f = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r1.A01     // Catch:{ all -> 0x0aa2 }
            r9.A0e = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = r1.A00     // Catch:{ all -> 0x0aa2 }
            r9.A0d = r0     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0sG r0 = r0.A03     // Catch:{ all -> 0x0aa2 }
            X.0sH r0 = r0.A08(r8)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x03ca
            boolean r0 = r0.A0H()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x03ca
            boolean r0 = r1.A07     // Catch:{ all -> 0x0aa2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A06 = r0     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r1.A09     // Catch:{ all -> 0x0aa2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A08 = r0     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r1.A08     // Catch:{ all -> 0x0aa2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A07 = r0     // Catch:{ all -> 0x0aa2 }
        L_0x03ca:
            android.content.SharedPreferences r2 = r22.A05()     // Catch:{ all -> 0x0aa2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa2 }
            r1.<init>()     // Catch:{ all -> 0x0aa2 }
            r0 = r25
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "_integrity"
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x0414
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            long r3 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.Integer r2 = X.AnonymousClass2D6.A03(r1)     // Catch:{ all -> 0x0aa2 }
            r0 = 2
            java.lang.Boolean r1 = X.AnonymousClass2D6.A02(r1, r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0aa2 }
            r9.A16 = r0     // Catch:{ all -> 0x0aa2 }
            com.whatsapp.jid.Jid r0 = com.whatsapp.jid.Jid.getNullable(r25)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = X.C16030sJ.A0L(r0)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x0414
            r9.A0H = r2     // Catch:{ all -> 0x0aa2 }
            r9.A05 = r1     // Catch:{ all -> 0x0aa2 }
        L_0x0414:
            android.content.SharedPreferences r2 = r22.A05()     // Catch:{ all -> 0x0aa2 }
            java.lang.String r1 = X.AnonymousClass2D9.A00(r25)     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x04a9
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            long r32 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 1
            long r30 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 2
            long r28 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 3
            long r26 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 4
            long r14 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 5
            long r12 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 6
            long r10 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 7
            long r7 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 8
            long r5 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 9
            long r3 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 10
            long r1 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x0aa2 }
            r9.A0T = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x0aa2 }
            r9.A0S = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x0aa2 }
            r9.A1A = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x0aa2 }
            r9.A1B = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0aa2 }
            r9.A1F = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0aa2 }
            r9.A0W = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0aa2 }
            r9.A0Y = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0aa2 }
            r9.A0Z = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0aa2 }
            r9.A0U = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0aa2 }
            r9.A0V = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0aa2 }
            r9.A0X = r0     // Catch:{ all -> 0x0aa2 }
        L_0x04a9:
            android.content.SharedPreferences r1 = r22.A05()     // Catch:{ all -> 0x0aa2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa2 }
            r2.<init>()     // Catch:{ all -> 0x0aa2 }
            r0 = r25
            r2.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "_discovery"
            r2.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0aa2 }
            r3 = 0
            java.lang.String r1 = r1.getString(r0, r3)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x054c
            java.lang.String r0 = ","
            java.lang.String[] r4 = r1.split(r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            int r1 = r4.length     // Catch:{ all -> 0x0aa2 }
            if (r1 <= r0) goto L_0x0539
            r2 = r4[r0]     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x053a
            goto L_0x0539
        L_0x04e0:
            boolean r0 = r0.A0H()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x035c
            r0 = r22
            X.0uc r0 = r0.A02     // Catch:{ all -> 0x0aa2 }
            X.235 r0 = r0.A0A     // Catch:{ all -> 0x0aa2 }
            X.1mD r0 = r0.A00(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x04fb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa2 }
            r2.<init>()     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Failed to get profile for jid - "
            goto L_0x034b
        L_0x04fb:
            java.lang.String r2 = r0.A05     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "catalog"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x0507
            r0 = 1
            goto L_0x0511
        L_0x0507:
            java.lang.String r0 = "shop"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x0517
            r0 = 0
        L_0x0511:
            java.lang.Integer r32 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            goto L_0x035c
        L_0x0517:
            java.lang.String r0 = "none"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x035c
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x0535
            java.lang.String r1 = "ChatMessageCounts/getBizCatalogType/Unknown commerceExperience value - "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa2 }
            r0.<init>(r1)     // Catch:{ all -> 0x0aa2 }
            r0.append(r2)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0aa2 }
            goto L_0x0359
        L_0x0535:
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Empty commerceExperience value"
            goto L_0x0359
        L_0x0539:
            r2 = r3
        L_0x053a:
            r0 = 1
            if (r1 <= r0) goto L_0x0548
            r1 = r4[r0]     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x0548
            r3 = r1
        L_0x0548:
            r9.A1G = r2     // Catch:{ all -> 0x0aa2 }
            r9.A1H = r3     // Catch:{ all -> 0x0aa2 }
        L_0x054c:
            android.content.SharedPreferences r2 = r22.A05()     // Catch:{ all -> 0x0aa2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa2 }
            r1.<init>()     // Catch:{ all -> 0x0aa2 }
            r0 = r25
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "_actions"
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x057a
            r0 = 0
            long r0 = X.C29501aj.A01(r2, r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0c = r0     // Catch:{ all -> 0x0aa2 }
        L_0x057a:
            android.content.SharedPreferences r2 = r22.A05()     // Catch:{ all -> 0x0aa2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa2 }
            r1.<init>()     // Catch:{ all -> 0x0aa2 }
            r0 = r25
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "_cart"
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x05a8
            r0 = 0
            long r0 = X.C29501aj.A01(r2, r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0a = r0     // Catch:{ all -> 0x0aa2 }
        L_0x05a8:
            r0 = r22
            X.0pd r0 = r0.A0P     // Catch:{ all -> 0x0aa2 }
            r3 = 2474(0x9aa, float:3.467E-42)
            X.0tM r2 = X.C16620tM.A02     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r0.A0E(r2, r3)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x05fa
            if (r25 == 0) goto L_0x05fa
            r0 = r22
            X.15F r0 = r0.A0X     // Catch:{ all -> 0x0aa2 }
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x0aa2 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0aa2 }
        L_0x05c2:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x05fa
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0aa2 }
            X.15E r0 = (X.AnonymousClass15E) r0     // Catch:{ all -> 0x0aa2 }
            X.0pd r0 = r0.A00     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r0.A0E(r2, r3)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x05c2
            java.lang.String r1 = "_location"
            r0 = r25
            java.lang.String r4 = X.C18450wi.A06(r0, r1)     // Catch:{ all -> 0x0aa2 }
            r1 = 0
            r0 = r23
            java.lang.String r4 = r0.getString(r4, r1)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x05c2
            if (r4 == 0) goto L_0x05c2
            r0 = 0
            long r0 = X.C29501aj.A01(r4, r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0p = r0     // Catch:{ all -> 0x0aa2 }
            goto L_0x05c2
        L_0x05fa:
            X.0rv r12 = X.C15830rv.A02(r25)     // Catch:{ all -> 0x0aa2 }
            if (r12 == 0) goto L_0x09c8
            r2 = 28800000(0x1b77400, double:1.42290906E-316)
            long r0 = r18 - r2
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x0aa2 }
            r2.<init>(r0)     // Catch:{ all -> 0x0aa2 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x0aa2 }
            java.lang.String r1 = "yyyy/MM/dd"
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0aa2 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r3 = r0.format(r2)     // Catch:{ all -> 0x0aa2 }
            r9.A1I = r3     // Catch:{ all -> 0x0aa2 }
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x0aa2 }
            r1.<init>()     // Catch:{ all -> 0x0aa2 }
            r0 = r34
            byte[] r2 = r0.A05(r1)     // Catch:{ all -> 0x0aa2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa2 }
            r1.<init>()     // Catch:{ all -> 0x0aa2 }
            r0 = r25
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            r1.append(r3)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = X.C18040w3.A00(r2, r0)     // Catch:{ all -> 0x0aa2 }
            r9.A1J = r0     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0sG r8 = r0.A03     // Catch:{ all -> 0x0aa2 }
            X.0sH r10 = r8.A08(r12)     // Catch:{ all -> 0x0aa2 }
            if (r10 == 0) goto L_0x06ef
            boolean r0 = r10.A0J()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x06ef
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0aa2 }
            r9.A03 = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r10.A08(r0)     // Catch:{ all -> 0x0aa2 }
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ all -> 0x0aa2 }
            com.whatsapp.jid.UserJid r0 = r8.A0D(r0)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x06af
            X.0sH r7 = r8.A08(r0)     // Catch:{ all -> 0x0aa2 }
        L_0x0662:
            boolean r0 = X.C16030sJ.A0N(r12)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x06e8
            r0 = r22
            X.0sO r0 = r0.A0D     // Catch:{ all -> 0x0aa2 }
            r1 = r12
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1     // Catch:{ all -> 0x0aa2 }
            X.0us r0 = r0.A07     // Catch:{ all -> 0x0aa2 }
            X.1cE r2 = r0.A04(r1)     // Catch:{ all -> 0x0aa2 }
            java.util.Map r0 = r2.A04     // Catch:{ all -> 0x0aa2 }
            int r0 = r0.size()     // Catch:{ all -> 0x0aa2 }
            long r0 = (long) r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0n = r0     // Catch:{ all -> 0x0aa2 }
            X.0uz r0 = r2.A04()     // Catch:{ all -> 0x0aa2 }
            X.1Ub r2 = r0.iterator()     // Catch:{ all -> 0x0aa2 }
        L_0x068a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x06b3
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0aa2 }
            X.1ck r1 = (X.C30661ck) r1     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0sK r0 = r0.A01     // Catch:{ all -> 0x0aa2 }
            com.whatsapp.jid.UserJid r1 = r1.A03     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r0.A0I(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x068a
            X.0sH r0 = r8.A08(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x068a
            boolean r0 = r0.A0H()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x068a
            goto L_0x06b1
        L_0x06af:
            r7 = 0
            goto L_0x0662
        L_0x06b1:
            r0 = 1
            goto L_0x06b4
        L_0x06b3:
            r0 = 0
        L_0x06b4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A01 = r0     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0rt r0 = r0.A0B     // Catch:{ all -> 0x0aa2 }
            r2 = r12
            X.0sL r2 = (X.C16050sL) r2     // Catch:{ all -> 0x0aa2 }
            boolean r1 = X.C16030sJ.A0L(r2)     // Catch:{ all -> 0x0aa2 }
            if (r1 != 0) goto L_0x06c9
            r0 = 0
            goto L_0x06d8
        L_0x06c9:
            int r1 = r0.A03(r2)     // Catch:{ all -> 0x0aa2 }
            r0 = 2
            if (r1 == r0) goto L_0x06d4
            r0 = 3
            if (r1 == r0) goto L_0x06d4
            r0 = 1
        L_0x06d4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
        L_0x06d8:
            r9.A0N = r0     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0ul r0 = r0.A0S     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r0.A0h(r10, r2)     // Catch:{ all -> 0x0aa2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A00 = r0     // Catch:{ all -> 0x0aa2 }
        L_0x06e8:
            boolean r1 = r10.A0l     // Catch:{ all -> 0x0aa2 }
            r0 = 2
            if (r1 == 0) goto L_0x06f5
            r0 = 1
            goto L_0x06f5
        L_0x06ef:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0aa2 }
            r9.A03 = r0     // Catch:{ all -> 0x0aa2 }
            r7 = r10
            goto L_0x06fb
        L_0x06f5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0M = r0     // Catch:{ all -> 0x0aa2 }
        L_0x06fb:
            r0 = r22
            X.0wx r2 = r0.A0O     // Catch:{ all -> 0x0aa2 }
            java.lang.Integer r0 = r2.A04()     // Catch:{ all -> 0x0aa2 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0aa2 }
            long r0 = (long) r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A15 = r0     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r12 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x0720
            r0 = r12
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0aa2 }
            int r0 = r2.A00(r0)     // Catch:{ all -> 0x0aa2 }
            long r0 = (long) r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A13 = r0     // Catch:{ all -> 0x0aa2 }
        L_0x0720:
            r0 = r22
            X.0rt r6 = r0.A0B     // Catch:{ all -> 0x0aa2 }
            X.0rx r0 = r6.A06(r12)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x073c
            X.1WV r0 = r0.A0X     // Catch:{ all -> 0x0aa2 }
            int r1 = r0.disappearingMessagesInitiator     // Catch:{ all -> 0x0aa2 }
            r0 = 2
            if (r1 != 0) goto L_0x0733
            r0 = 1
            goto L_0x0736
        L_0x0733:
            if (r1 != r0) goto L_0x0736
            r0 = 3
        L_0x0736:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0K = r0     // Catch:{ all -> 0x0aa2 }
        L_0x073c:
            r0 = r22
            X.0ts r4 = r0.A0A     // Catch:{ all -> 0x0aa2 }
            long r27 = r4.A02(r12)     // Catch:{ all -> 0x0aa2 }
            r25 = -1
            r13 = 0
            int r0 = (r27 > r13 ? 1 : (r27 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0784
            X.0tq r0 = r4.A04     // Catch:{ all -> 0x0aa2 }
            X.0tf r3 = r0.get()     // Catch:{ all -> 0x0aa2 }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x09e9 }
            java.lang.String r1 = "SELECT created_timestamp FROM chat WHERE _id = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x09e9 }
            r11 = 0
            java.lang.String r5 = java.lang.Long.toString(r27)     // Catch:{ all -> 0x09e9 }
            r0[r11] = r5     // Catch:{ all -> 0x09e9 }
            android.database.Cursor r1 = r2.A08(r1, r0)     // Catch:{ all -> 0x09e9 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x09e2 }
            if (r0 == 0) goto L_0x077a
            java.lang.String r0 = "created_timestamp"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09e2 }
            boolean r2 = r1.isNull(r0)     // Catch:{ all -> 0x09e2 }
            if (r2 != 0) goto L_0x077a
            long r25 = r1.getLong(r0)     // Catch:{ all -> 0x09e2 }
        L_0x077a:
            r1.close()     // Catch:{ all -> 0x09e9 }
            r3.close()     // Catch:{ all -> 0x0aa2 }
            int r0 = (r25 > r13 ? 1 : (r25 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x07eb
        L_0x0784:
            r0 = r22
            X.0t6 r0 = r0.A0C     // Catch:{ all -> 0x0aa2 }
            r25 = -1
            int r1 = (r27 > r13 ? 1 : (r27 == r13 ? 0 : -1))
            if (r1 < 0) goto L_0x07bd
            X.0tq r0 = r0.A0v     // Catch:{ all -> 0x0aa2 }
            X.0tf r3 = r0.get()     // Catch:{ all -> 0x0aa2 }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x09e9 }
            java.lang.String r1 = "SELECT timestamp FROM message_view WHERE chat_row_id = ? ORDER BY sort_id LIMIT 1"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x09e9 }
            r11 = 0
            java.lang.String r5 = java.lang.Long.toString(r27)     // Catch:{ all -> 0x09e9 }
            r0[r11] = r5     // Catch:{ all -> 0x09e9 }
            android.database.Cursor r1 = r2.A08(r1, r0)     // Catch:{ all -> 0x09e9 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x09e2 }
            if (r0 == 0) goto L_0x07b7
            java.lang.String r0 = "timestamp"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09e2 }
            long r25 = r1.getLong(r0)     // Catch:{ all -> 0x09e2 }
        L_0x07b7:
            r1.close()     // Catch:{ all -> 0x09e9 }
            r3.close()     // Catch:{ all -> 0x0aa2 }
        L_0x07bd:
            int r0 = (r27 > r13 ? 1 : (r27 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x07eb
            X.0tq r0 = r4.A04     // Catch:{ all -> 0x0aa2 }
            X.0tf r5 = r0.A02()     // Catch:{ all -> 0x0aa2 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x09ee }
            r4.<init>()     // Catch:{ all -> 0x09ee }
            java.lang.String r1 = "created_timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x09ee }
            r4.put(r1, r0)     // Catch:{ all -> 0x09ee }
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x09ee }
            java.lang.String r2 = "chat"
            java.lang.String r1 = "_id=?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x09ee }
            r13 = 0
            java.lang.String r11 = java.lang.Long.toString(r27)     // Catch:{ all -> 0x09ee }
            r0[r13] = r11     // Catch:{ all -> 0x09ee }
            r3.A00(r2, r4, r1, r0)     // Catch:{ all -> 0x09ee }
            r5.close()     // Catch:{ all -> 0x0aa2 }
        L_0x07eb:
            int r1 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x07f1
            r0 = 1
        L_0x07f1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0C = r0     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0sf r3 = r0.A0V     // Catch:{ all -> 0x0aa2 }
            boolean r4 = r3.A0Q(r12)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = r12.getRawString()     // Catch:{ all -> 0x0aa2 }
            X.1WS r0 = r3.A07(r0)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r0.A0H     // Catch:{ all -> 0x0aa2 }
            if (r7 == 0) goto L_0x0810
            X.1ko r1 = r7.A0D     // Catch:{ all -> 0x0aa2 }
            r2 = 1
            if (r1 != 0) goto L_0x0811
        L_0x0810:
            r2 = 0
        L_0x0811:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0aa2 }
            r9.A02 = r1     // Catch:{ all -> 0x0aa2 }
            r2 = 3
            if (r4 != 0) goto L_0x081c
            r1 = 1
            goto L_0x0820
        L_0x081c:
            r1 = 2
            if (r0 == 0) goto L_0x0820
            r1 = 3
        L_0x0820:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0aa2 }
            r9.A0I = r0     // Catch:{ all -> 0x0aa2 }
            if (r7 == 0) goto L_0x0856
            boolean r0 = r7.A0H()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x0856
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0J = r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r7.A08(r0)     // Catch:{ all -> 0x0aa2 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r7.A0F()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x085d
            if (r1 == 0) goto L_0x085d
            r0 = r22
            X.0uP r0 = r0.A04     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r0.A02(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x085d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0aa2 }
            r9.A0J = r0     // Catch:{ all -> 0x0aa2 }
            goto L_0x085d
        L_0x0856:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0J = r0     // Catch:{ all -> 0x0aa2 }
        L_0x085d:
            java.lang.String r0 = r12.getRawString()     // Catch:{ all -> 0x0aa2 }
            X.1WS r0 = r3.A07(r0)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r0.A0G     // Catch:{ all -> 0x0aa2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0A = r0     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r6.A0G(r12)     // Catch:{ all -> 0x0aa2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A04 = r0     // Catch:{ all -> 0x0aa2 }
            boolean r0 = X.C16030sJ.A0M(r12)     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x0988
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0aa2 }
            r9.A0B = r2     // Catch:{ all -> 0x0aa2 }
            r1 = r12
            X.1ZX r1 = (X.AnonymousClass1ZX) r1     // Catch:{ all -> 0x0aa2 }
            java.lang.Boolean r0 = r9.A09     // Catch:{ all -> 0x0aa2 }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.15H r0 = r0.A0L     // Catch:{ all -> 0x0aa2 }
            if (r2 != 0) goto L_0x096a
            java.lang.Boolean r0 = r0.A01(r1)     // Catch:{ all -> 0x0aa2 }
            r9.A0F = r0     // Catch:{ all -> 0x0aa2 }
        L_0x0896:
            int r0 = r6.A00(r12)     // Catch:{ all -> 0x0aa2 }
            long r0 = (long) r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0t = r0     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.10G r0 = r0.A0J     // Catch:{ all -> 0x0aa2 }
            long r0 = r0.A00(r12)     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0s = r0     // Catch:{ all -> 0x0aa2 }
            int r0 = X.C40491uD.A00(r8, r6, r12)     // Catch:{ all -> 0x0aa2 }
            long r0 = (long) r0     // Catch:{ all -> 0x0aa2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0b = r0     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0t9 r11 = r0.A0Q     // Catch:{ all -> 0x0aa2 }
            r11.A05(r9)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r13 = r12.getRawString()     // Catch:{ all -> 0x0aa2 }
            android.content.SharedPreferences r2 = r22.A05()     // Catch:{ all -> 0x0aa2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa2 }
            r1.<init>()     // Catch:{ all -> 0x0aa2 }
            r1.append(r13)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = "_notification"
            r1.append(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x0aa2 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0aa2 }
            if (r0 != 0) goto L_0x09c8
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            java.lang.Long r10 = X.AnonymousClass2D6.A04(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 1
            java.lang.Long r9 = X.AnonymousClass2D6.A04(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 2
            java.lang.Long r8 = X.AnonymousClass2D6.A04(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 3
            java.lang.Long r7 = X.AnonymousClass2D6.A04(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 4
            java.lang.Long r6 = X.AnonymousClass2D6.A04(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 5
            java.lang.Long r5 = X.AnonymousClass2D6.A04(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 6
            java.lang.Long r4 = X.AnonymousClass2D6.A04(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 7
            java.lang.Long r3 = X.AnonymousClass2D6.A04(r1, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 8
            java.lang.Long r2 = X.AnonymousClass2D6.A04(r1, r0)     // Catch:{ all -> 0x0aa2 }
            if (r10 == 0) goto L_0x09c8
            long r25 = r10.longValue()     // Catch:{ all -> 0x0aa2 }
            r14 = 0
            int r0 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x09c8
            X.2DA r1 = new X.2DA     // Catch:{ all -> 0x0aa2 }
            r1.<init>()     // Catch:{ all -> 0x0aa2 }
            r0 = r34
            java.lang.String r0 = r0.A03(r13)     // Catch:{ all -> 0x0aa2 }
            r1.A0C = r0     // Catch:{ all -> 0x0aa2 }
            boolean r0 = X.C16030sJ.A0L(r12)     // Catch:{ all -> 0x0aa2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r1.A00 = r0     // Catch:{ all -> 0x0aa2 }
            boolean r0 = r12 instanceof X.C16050sL     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x0951
            r13 = r12
            X.0sL r13 = (X.C16050sL) r13     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0ul r0 = r0.A0S     // Catch:{ all -> 0x0aa2 }
            int r0 = X.C40511uF.A03(r0, r13)     // Catch:{ all -> 0x0aa2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r1.A02 = r0     // Catch:{ all -> 0x0aa2 }
        L_0x0951:
            boolean r0 = r12 instanceof X.C16060sN     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x09a9
            r0 = r22
            X.0sO r0 = r0.A0D     // Catch:{ all -> 0x0aa2 }
            X.0sN r12 = (X.C16060sN) r12     // Catch:{ all -> 0x0aa2 }
            int r0 = r0.A01(r12)     // Catch:{ all -> 0x0aa2 }
            int r0 = X.C40511uF.A01(r0)     // Catch:{ all -> 0x0aa2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r1.A01 = r0     // Catch:{ all -> 0x0aa2 }
            goto L_0x09a9
        L_0x096a:
            boolean r0 = r0.A0B(r1)     // Catch:{ all -> 0x0aa2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0D = r0     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.0vJ r0 = r0.A0K     // Catch:{ all -> 0x0aa2 }
            X.1ZT r1 = r0.A01(r1)     // Catch:{ all -> 0x0aa2 }
            r0 = 0
            if (r1 != 0) goto L_0x0980
            r0 = 1
        L_0x0980:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0aa2 }
            r9.A0E = r0     // Catch:{ all -> 0x0aa2 }
            goto L_0x0896
        L_0x0988:
            if (r10 == 0) goto L_0x09a3
            boolean r0 = r10.A0J()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x09a3
            r0 = r12
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ all -> 0x0aa2 }
            int r0 = r6.A02(r0)     // Catch:{ all -> 0x0aa2 }
            if (r0 != r2) goto L_0x09a3
            boolean r0 = r10.A0b     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x09a3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0aa2 }
            r9.A0B = r0     // Catch:{ all -> 0x0aa2 }
            goto L_0x0896
        L_0x09a3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0aa2 }
            r9.A0B = r0     // Catch:{ all -> 0x0aa2 }
            goto L_0x0896
        L_0x09a9:
            if (r2 == 0) goto L_0x09b5
            long r12 = r2.longValue()     // Catch:{ all -> 0x0aa2 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x09b5
            r1.A03 = r2     // Catch:{ all -> 0x0aa2 }
        L_0x09b5:
            r1.A04 = r3     // Catch:{ all -> 0x0aa2 }
            r1.A05 = r7     // Catch:{ all -> 0x0aa2 }
            r1.A06 = r6     // Catch:{ all -> 0x0aa2 }
            r1.A07 = r8     // Catch:{ all -> 0x0aa2 }
            r1.A08 = r5     // Catch:{ all -> 0x0aa2 }
            r1.A09 = r4     // Catch:{ all -> 0x0aa2 }
            r1.A0A = r10     // Catch:{ all -> 0x0aa2 }
            r1.A0B = r9     // Catch:{ all -> 0x0aa2 }
            r11.A05(r1)     // Catch:{ all -> 0x0aa2 }
        L_0x09c8:
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x0072
        L_0x09cd:
            r0 = move-exception
            if (r4 == 0) goto L_0x09da
            r4.close()     // Catch:{ all -> 0x09da }
            goto L_0x09da
        L_0x09d4:
            r0 = move-exception
            if (r6 == 0) goto L_0x09da
            r6.close()     // Catch:{ all -> 0x09da }
        L_0x09da:
            throw r0     // Catch:{ all -> 0x09db }
        L_0x09db:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x09df }
        L_0x09df:
            throw r0     // Catch:{ all -> 0x09e0 }
        L_0x09e0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0aa2 }
        L_0x09e2:
            r0 = move-exception
            if (r1 == 0) goto L_0x09e8
            r1.close()     // Catch:{ all -> 0x09e8 }
        L_0x09e8:
            throw r0     // Catch:{ all -> 0x09e9 }
        L_0x09e9:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x09f2 }
            goto L_0x09f2
        L_0x09ee:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x09f2 }
        L_0x09f2:
            throw r0     // Catch:{ all -> 0x0aa2 }
        L_0x09f3:
            long r1 = r18 + r5
            long r3 = r1 + r5
            int r0 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a01
            long r16 = r16 / r5
            long r16 = r16 * r5
            long r1 = r18 + r16
        L_0x0a01:
            android.content.SharedPreferences r0 = r22.A05()     // Catch:{ all -> 0x0aa2 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0aa2 }
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch:{ all -> 0x0aa2 }
            r0.apply()     // Catch:{ all -> 0x0aa2 }
            r0 = r34
            r0.A04(r1)     // Catch:{ all -> 0x0aa2 }
            r0 = r22
            X.158 r4 = r0.A07     // Catch:{ all -> 0x0aa2 }
            android.content.SharedPreferences r0 = r4.A02()     // Catch:{ all -> 0x0aa2 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0aa2 }
            java.util.Set r2 = r0.keySet()     // Catch:{ all -> 0x0aa2 }
            android.content.SharedPreferences r0 = r4.A01()     // Catch:{ all -> 0x0aa2 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0aa2 }
            java.util.Set r1 = r0.keySet()     // Catch:{ all -> 0x0aa2 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0aa2 }
            r0.<init>()     // Catch:{ all -> 0x0aa2 }
            r0.addAll(r2)     // Catch:{ all -> 0x0aa2 }
            r0.addAll(r1)     // Catch:{ all -> 0x0aa2 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0aa2 }
        L_0x0a40:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0aa2 }
            if (r0 == 0) goto L_0x0aa0
            java.lang.Object r5 = r8.next()     // Catch:{ all -> 0x0aa2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0aa2 }
            java.lang.String r0 = ","
            java.lang.String[] r7 = r5.split(r0)     // Catch:{ all -> 0x0aa2 }
            int r2 = r7.length     // Catch:{ all -> 0x0aa2 }
            r1 = 2
            r0 = 0
            r6 = 1
            if (r2 != r1) goto L_0x0a81
            r0 = r7[r0]     // Catch:{ all -> 0x0aa2 }
            X.0rv r3 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0aa2 }
            if (r3 == 0) goto L_0x0a81
            X.0t6 r2 = r4.A03     // Catch:{ all -> 0x0aa2 }
            r0 = r7[r6]     // Catch:{ all -> 0x0aa2 }
            X.1Vw r1 = new X.1Vw     // Catch:{ all -> 0x0aa2 }
            r1.<init>(r3, r0, r6)     // Catch:{ all -> 0x0aa2 }
            X.0th r0 = r2.A0K     // Catch:{ all -> 0x0aa2 }
            X.0tZ r1 = r0.A03(r1)     // Catch:{ all -> 0x0aa2 }
            if (r1 == 0) goto L_0x0a81
            X.0t3 r0 = r4.A02     // Catch:{ all -> 0x0aa2 }
            long r2 = r0.A00()     // Catch:{ all -> 0x0aa2 }
            long r0 = r1.A0I     // Catch:{ all -> 0x0aa2 }
            int r1 = X.C42681yF.A00(r2, r0)     // Catch:{ all -> 0x0aa2 }
            r0 = 3
            if (r1 >= r0) goto L_0x0a81
            goto L_0x0a40
        L_0x0a81:
            android.content.SharedPreferences r0 = r4.A02()     // Catch:{ all -> 0x0aa2 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0aa2 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)     // Catch:{ all -> 0x0aa2 }
            r0.apply()     // Catch:{ all -> 0x0aa2 }
            android.content.SharedPreferences r0 = r4.A01()     // Catch:{ all -> 0x0aa2 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0aa2 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)     // Catch:{ all -> 0x0aa2 }
            r0.apply()     // Catch:{ all -> 0x0aa2 }
            goto L_0x0a40
        L_0x0aa0:
            monitor-exit(r22)
            return
        L_0x0aa2:
            r0 = move-exception
            monitor-exit(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15I.A06():void");
    }

    public final void A07(AnonymousClass04N r4, UserJid userJid) {
        C16010sH A082;
        if (!this.A01.A0I(userJid) && (A082 = this.A03.A08(userJid)) != null && A082.A0H()) {
            this.A0Z.execute(new RunnableRunnableShape0S0300000_I0(this, userJid, r4, 36));
        }
    }

    public void A08(C15830rv r4, int i2) {
        if (!this.A01.A0I(r4)) {
            this.A0Z.execute(new RunnableRunnableShape0S0201000_I0(this, r4, i2, 13));
        }
    }

    public void A09(C15830rv r4, int i2) {
        if (!this.A01.A0I(r4)) {
            this.A0Z.execute(new RunnableRunnableShape0S0201000_I0(this, r4, i2, 12));
        }
    }

    public synchronized void A0A(C15830rv r12, Integer num, boolean z2) {
        if (!C16030sJ.A0L(r12)) {
            SharedPreferences A052 = A05();
            String rawString = r12.getRawString();
            StringBuilder sb = new StringBuilder();
            sb.append(rawString);
            sb.append("_integrity");
            String obj = sb.toString();
            String[] split = A052.getString(obj, "0,null,null").split(",");
            long A012 = AnonymousClass2D6.A01(split, 0);
            AnonymousClass2D6.A03(split);
            AnonymousClass2D6.A02(split, 2);
            Boolean valueOf = Boolean.valueOf(z2);
            A052.edit().putString(obj, TextUtils.join(",", Arrays.asList(new Serializable[]{Long.valueOf(A012), num, valueOf}))).apply();
        }
    }

    public void A0B(C37831po r5, Integer num) {
        if (r5 != null && num != null) {
            Object obj = r5.A0A() ? r5.A04 : r5.A0C.A01;
            if (obj != null) {
                this.A0Z.execute(new RunnableRunnableShape0S0300000_I0(this, obj, num, 35));
            }
        }
    }
}

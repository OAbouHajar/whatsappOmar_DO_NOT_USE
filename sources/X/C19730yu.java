package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.facebook.redex.IDxBReceiverShape6S0100000_1_I0;
import com.facebook.redex.IDxBReceiverShape7S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.obwhatsapp.data.device.DeviceChangeManager;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.0yu  reason: invalid class name and case insensitive filesystem */
public class C19730yu {
    public final Context A00;
    public final C19570ye A01;
    public final C16570tH A02;
    public final C19510yY A03;
    public final C16300so A04;
    public final C16180sb A05;
    public final C19300yD A06;
    public final C16040sK A07;
    public final C18900xR A08;
    public final C15900s5 A09;
    public final C19100xl A0A;
    public final C17130ua A0B;
    public final C18890xQ A0C;
    public final C19000xb A0D;
    public final C16600tK A0E;
    public final C19010xc A0F;
    public final C19250y7 A0G;
    public final C19670yo A0H;
    public final C19080xj A0I;
    public final C19180xt A0J;
    public final C19280yB A0K;
    public final C19590yg A0L;
    public final C19680yp A0M;
    public final C19540yb A0N;
    public final C18930xU A0O;
    public final C19360yJ A0P;
    public final C19630yk A0Q;
    public final C19710ys A0R;
    public final C19330yG A0S;
    public final C18260wP A0T;
    public final C19310yE A0U;
    public final C16000sG A0V;
    public final C17030uP A0W;
    public final C16080sP A0X;
    public final AnonymousClass0y4 A0Y;
    public final C19230xz A0Z;
    public final C19600yh A0a;
    public final C19610yi A0b;
    public final AnonymousClass01V A0c;
    public final C16440t3 A0d;
    public final C19380yL A0e;
    public final AnonymousClass013 A0f;
    public final C14730pf A0g;
    public final C17080uV A0h;
    public final C18920xT A0i;
    public final C19260y8 A0j;
    public final C19700yr A0k;
    public final C18910xS A0l;
    public final C15810rt A0m;
    public final C19150xq A0n;
    public final AnonymousClass0y0 A0o;
    public final C19650ym A0p;
    public final C16900tq A0q;
    public final C19410yO A0r;
    public final DeviceChangeManager A0s;
    public final C19020xd A0t;
    public final C19580yf A0u;
    public final C18350wY A0v;
    public final AnonymousClass0y2 A0w;
    public final C19460yT A0x;
    public final C14710pd A0y;
    public final C19070xi A0z;
    public final C19130xo A10;
    public final C17990vy A11;
    public final C16490t9 A12;
    public final C19060xh A13;
    public final C19340yH A14;
    public final C19240y6 A15;
    public final C19350yI A16;
    public final C19470yU A17;
    public final C19030xe A18;
    public final C19690yq A19;
    public final C19520yZ A1A;
    public final C19430yQ A1B;
    public final C19290yC A1C;
    public final C19200xv A1D;
    public final AnonymousClass0y1 A1E;
    public final C17190ug A1F;
    public final C19090xk A1G;
    public final C19440yR A1H;
    public final AnonymousClass0y3 A1I;
    public final WhatsAppLibLoader A1J;
    public final C19720yt A1K;
    public final C14770pj A1L;
    public final C14760pi A1M;
    public final C19320yF A1N;
    public final C18320wV A1O;
    public final C19560yd A1P;
    public final C19210xw A1Q;
    public final C19220xx A1R;
    public final AnonymousClass0y5 A1S;
    public final C19500yX A1T;
    public final C19190xu A1U;
    public final C18990xa A1V;
    public final C15960sC A1W;
    public final C19640yl A1X;
    public final C19040xf A1Y;
    public final C19490yW A1Z;
    public final C19450yS A1a;
    public final C19660yn A1b;
    public final C19390yM A1c;
    public final C19160xr A1d;
    public final C16510tB A1e;
    public final C16320sq A1f;
    public final C18980xZ A1g;
    public final AnonymousClass01J A1h;

    public C19730yu(Context context, C19570ye r3, C16570tH r4, C19510yY r5, C16300so r6, C16180sb r7, C19300yD r8, C16040sK r9, C18900xR r10, C15900s5 r11, C19100xl r12, C17130ua r13, C18890xQ r14, C19000xb r15, C16600tK r16, C19010xc r17, C19250y7 r18, C19670yo r19, C19080xj r20, C19180xt r21, C19280yB r22, C19590yg r23, C19680yp r24, C19540yb r25, C18930xU r26, C19360yJ r27, C19630yk r28, C19710ys r29, C19330yG r30, C18260wP r31, C19310yE r32, C16000sG r33, C17030uP r34, C16080sP r35, AnonymousClass0y4 r36, C19230xz r37, C19600yh r38, C19610yi r39, AnonymousClass01V r40, C16440t3 r41, C19380yL r42, AnonymousClass013 r43, C14730pf r44, C17080uV r45, C18920xT r46, C19260y8 r47, C19700yr r48, C18910xS r49, C15810rt r50, C19150xq r51, AnonymousClass0y0 r52, C19650ym r53, C16900tq r54, C19410yO r55, DeviceChangeManager deviceChangeManager, C19020xd r57, C19580yf r58, C18350wY r59, AnonymousClass0y2 r60, C19460yT r61, C14710pd r62, C19070xi r63, C19130xo r64, C17990vy r65, C16490t9 r66, C19060xh r67, C19340yH r68, C19240y6 r69, C19350yI r70, C19470yU r71, C19030xe r72, C19690yq r73, C19520yZ r74, C19430yQ r75, C19290yC r76, C19200xv r77, AnonymousClass0y1 r78, C17190ug r79, C19090xk r80, C19440yR r81, AnonymousClass0y3 r82, WhatsAppLibLoader whatsAppLibLoader, C19720yt r84, C14770pj r85, C14760pi r86, C19320yF r87, C18320wV r88, C19560yd r89, C19210xw r90, C19220xx r91, AnonymousClass0y5 r92, C19500yX r93, C19190xu r94, C18990xa r95, C15960sC r96, C19640yl r97, C19040xf r98, C19490yW r99, C19450yS r100, C19660yn r101, C19390yM r102, C19160xr r103, C16510tB r104, C16320sq r105, C18980xZ r106, AnonymousClass01J r107) {
        this.A00 = context;
        this.A0d = r41;
        this.A0C = r14;
        this.A0y = r62;
        this.A04 = r6;
        this.A07 = r9;
        this.A1f = r105;
        this.A0m = r50;
        this.A05 = r7;
        this.A08 = r10;
        this.A0B = r13;
        this.A12 = r66;
        this.A0l = r49;
        this.A09 = r11;
        this.A0i = r46;
        this.A0O = r26;
        this.A1g = r106;
        this.A1V = r95;
        this.A0g = r44;
        this.A0D = r15;
        this.A0F = r17;
        this.A0t = r57;
        this.A18 = r72;
        this.A1F = r79;
        this.A1Y = r98;
        this.A13 = r67;
        this.A0z = r63;
        this.A0I = r20;
        this.A0V = r33;
        this.A1G = r80;
        this.A0c = r40;
        this.A0X = r35;
        this.A0f = r43;
        this.A0A = r12;
        this.A10 = r64;
        this.A0n = r51;
        this.A1d = r103;
        this.A0E = r16;
        this.A0J = r21;
        this.A1U = r94;
        this.A1D = r77;
        this.A1Q = r90;
        this.A1R = r91;
        this.A1J = whatsAppLibLoader;
        this.A0Z = r37;
        this.A0o = r52;
        this.A1E = r78;
        this.A0w = r60;
        this.A1I = r82;
        this.A0Y = r36;
        this.A1S = r92;
        this.A15 = r69;
        this.A0G = r18;
        this.A0j = r47;
        this.A0s = deviceChangeManager;
        this.A0K = r22;
        this.A1C = r76;
        this.A06 = r8;
        this.A1L = r85;
        this.A0q = r54;
        this.A0U = r32;
        this.A1N = r87;
        this.A0W = r34;
        this.A0S = r30;
        this.A14 = r68;
        this.A1e = r104;
        this.A16 = r70;
        this.A0P = r27;
        this.A0e = r42;
        this.A1c = r102;
        this.A0r = r55;
        this.A1B = r75;
        this.A1H = r81;
        this.A1M = r86;
        this.A1a = r100;
        this.A0x = r61;
        this.A11 = r65;
        this.A17 = r71;
        this.A1Z = r99;
        this.A1T = r93;
        this.A1O = r88;
        this.A1W = r96;
        this.A02 = r4;
        this.A03 = r5;
        this.A0T = r31;
        this.A1h = r107;
        this.A1A = r74;
        this.A0N = r25;
        this.A1P = r89;
        this.A01 = r3;
        this.A0u = r58;
        this.A0L = r23;
        this.A0a = r38;
        this.A0b = r39;
        this.A0Q = r28;
        this.A1X = r97;
        this.A0p = r53;
        this.A1b = r101;
        this.A0H = r19;
        this.A0v = r59;
        this.A0h = r45;
        this.A0M = r24;
        this.A19 = r73;
        this.A0k = r48;
        this.A0R = r29;
        this.A1K = r84;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|(3:8|9|10)|11|12|(12:14|(1:16)|17|(1:19)|20|272|26|(1:28)(3:32|(1:34)|35)|29|(3:31|36|37)(36:38|39|(4:41|(2:44|42)|192|45)|46|47|48|49|50|51|52|53|(1:55)(5:56|(3:58|(1:60)|62)|63|(2:65|(1:67))|62)|68|69|(1:71)|72|73|(6:75|76|77|78|79|80)(4:86|87|88|91)|92|93|(1:95)|96|(17:98|99|100|101|102|103|(2:106|104)|193|107|(2:109|(1:111))|112|(2:114|(1:116))|117|(2:120|118)|194|123|(2:125|(1:127)))|128|129|130|(1:132)(4:133|134|135|136)|137|138|139|140|141|(2:143|78a)|167|168|169)|170|171)(2:185|188)) */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x08a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x08a7, code lost:
        X.C004201v.A00();
        r8.A03("AppInit_main");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x08af, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0588, code lost:
        if (r4.A04.A01() == false) goto L_0x0590;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x05e0 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ba A[Catch:{ all -> 0x08a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0899 A[Catch:{ all -> 0x08a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r49) {
        /*
            java.lang.Class<X.01F> r0 = X.AnonymousClass01F.class
            r1 = r49
            java.lang.Object r2 = X.AnonymousClass01I.A00(r1, r0)
            X.01F r2 = (X.AnonymousClass01F) r2
            X.10F r19 = r2.AgI()
            java.lang.String r17 = "main_thread_init"
            r1 = r19
            r0 = r17
            r1.A08(r0)
            X.0yd r1 = r2.A50()
            java.lang.String r0 = "app_init_instance"
            r1.A04(r0)
            X.0yu r9 = r2.A1J()
            r1.A03(r0)
            X.0yd r8 = r9.A1P
            java.lang.String r18 = "AppInit_main"
            r0 = r18
            r8.A04(r0)
            java.lang.String r0 = "AppInit/main"
            X.C004201v.A01(r0)
            X.0s5 r1 = r9.A09
            X.0s8 r0 = X.C15910s6.A0C
            boolean r0 = r1.A05(r0)
            X.C14720pe.A06 = r0
            X.1iD r0 = X.C33211iD.A0o     // Catch:{ all -> 0x08a6 }
            X.1Wr r4 = r0.A0U()     // Catch:{ all -> 0x08a6 }
            X.1iE r4 = (X.C33221iE) r4     // Catch:{ all -> 0x08a6 }
            X.1cM r0 = X.C30441cM.A0l     // Catch:{ all -> 0x08a6 }
            X.1Wr r3 = r0.A0U()     // Catch:{ all -> 0x08a6 }
            X.1cL r3 = (X.C30431cL) r3     // Catch:{ all -> 0x08a6 }
            X.1iF r0 = X.C33231iF.A05     // Catch:{ all -> 0x08a6 }
            X.1Wr r2 = r0.A0U()     // Catch:{ all -> 0x08a6 }
            X.1iG r2 = (X.C33241iG) r2     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "throw away fix line - "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x08a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x08a6 }
            r1.append(r4)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = " - "
            r1.append(r0)     // Catch:{ all -> 0x08a6 }
            r1.append(r3)     // Catch:{ all -> 0x08a6 }
            r1.append(r0)     // Catch:{ all -> 0x08a6 }
            r1.append(r2)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x08a6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08a6 }
            android.content.Context r7 = r9.A00     // Catch:{ all -> 0x08a6 }
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x00ad
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x08a6 }
            r0 = 19
            if (r1 < r0) goto L_0x00ad
            r0 = 22
            if (r1 > r0) goto L_0x00ad
            java.lang.String r0 = "android.sec.clipboard.ClipboardUIManager"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r2 = "getInstance"
            r4 = 1
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00ad }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r3 = 0
            r1[r3] = r0     // Catch:{ Exception -> 0x00ad }
            java.lang.reflect.Method r2 = r5.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x00ad }
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x00ad }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ad }
            r0[r3] = r7     // Catch:{ Exception -> 0x00ad }
            r2.invoke(r1, r0)     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            X.0sP r0 = r9.A0X     // Catch:{ all -> 0x08a6 }
            X.0ub r2 = r0.A03     // Catch:{ all -> 0x08a6 }
            X.1iH r1 = new X.1iH     // Catch:{ all -> 0x08a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x08a6 }
            X.1iH r0 = r2.A00     // Catch:{ all -> 0x08a6 }
            if (r0 != 0) goto L_0x0899
            r2.A00 = r1     // Catch:{ all -> 0x08a6 }
            X.0yt r2 = r9.A1K     // Catch:{ all -> 0x08a6 }
            X.1Gl r1 = r2.A01     // Catch:{ all -> 0x08a6 }
            X.1iI r0 = new X.1iI     // Catch:{ all -> 0x08a6 }
            r0.<init>(r2)     // Catch:{ all -> 0x08a6 }
            r1.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0xq r1 = r9.A0n     // Catch:{ all -> 0x08a6 }
            X.0yD r0 = r9.A06     // Catch:{ all -> 0x08a6 }
            r1.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0xU r3 = r9.A0O     // Catch:{ all -> 0x08a6 }
            X.0tK r0 = r3.A0A     // Catch:{ all -> 0x08a6 }
            r0.A02(r3)     // Catch:{ all -> 0x08a6 }
            X.19R r0 = r3.A0B     // Catch:{ all -> 0x08a6 }
            r0.A02(r3)     // Catch:{ all -> 0x08a6 }
            X.1WB r2 = new X.1WB     // Catch:{ all -> 0x08a6 }
            r2.<init>(r3)     // Catch:{ all -> 0x08a6 }
            r3.A03 = r2     // Catch:{ all -> 0x08a6 }
            X.0yO r0 = r3.A0c     // Catch:{ all -> 0x08a6 }
            r0.A02(r2)     // Catch:{ all -> 0x08a6 }
            X.1Ch r0 = r3.A0E     // Catch:{ all -> 0x08a6 }
            r0.A02(r3)     // Catch:{ all -> 0x08a6 }
            X.16Q r0 = r3.A0d     // Catch:{ all -> 0x08a6 }
            X.1iJ r2 = r0.A05     // Catch:{ all -> 0x08a6 }
            X.1iK r0 = new X.1iK     // Catch:{ all -> 0x08a6 }
            r0.<init>(r3)     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.17d r2 = r3.A0X     // Catch:{ all -> 0x08a6 }
            X.1iL r0 = r3.A0M     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.1CS r2 = r3.A09     // Catch:{ all -> 0x08a6 }
            X.1aM r0 = new X.1aM     // Catch:{ all -> 0x08a6 }
            r0.<init>(r3)     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.1CX r0 = r3.A0l     // Catch:{ all -> 0x08a6 }
            r0.A00 = r3     // Catch:{ all -> 0x08a6 }
            X.1Ci r0 = r3.A0K     // Catch:{ all -> 0x08a6 }
            r0.A00 = r3     // Catch:{ all -> 0x08a6 }
            X.0yJ r3 = r9.A0P     // Catch:{ all -> 0x08a6 }
            X.11Q r0 = r3.A02     // Catch:{ all -> 0x08a6 }
            r0.A02(r3)     // Catch:{ all -> 0x08a6 }
            X.16Q r0 = r3.A0A     // Catch:{ all -> 0x08a6 }
            X.1iM r2 = r0.A04     // Catch:{ all -> 0x08a6 }
            X.1iN r0 = new X.1iN     // Catch:{ all -> 0x08a6 }
            r0.<init>(r3)     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0yO r2 = r9.A0r     // Catch:{ all -> 0x08a6 }
            X.0y2 r0 = r9.A0w     // Catch:{ all -> 0x08a6 }
            X.1WC r0 = r0.A01     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0yb r3 = r9.A0N     // Catch:{ all -> 0x08a6 }
            X.0sK r0 = r3.A01     // Catch:{ all -> 0x08a6 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x08a6 }
            if (r0 != 0) goto L_0x013e
            X.0yO r2 = r3.A08     // Catch:{ all -> 0x08a6 }
            X.1WC r0 = r3.A07     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
        L_0x013e:
            X.0xv r4 = r9.A1D     // Catch:{ all -> 0x08a6 }
            X.15A r3 = r4.A0A     // Catch:{ all -> 0x08a6 }
            r2 = 7
            com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0 r0 = new com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0     // Catch:{ all -> 0x08a6 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x08a6 }
            r3.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0pi r4 = r9.A1M     // Catch:{ all -> 0x08a6 }
            X.15A r2 = r4.A0L     // Catch:{ all -> 0x08a6 }
            r3 = 8
            com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0 r0 = new com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0     // Catch:{ all -> 0x08a6 }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0tH r6 = r9.A02     // Catch:{ all -> 0x08a6 }
            X.0sq r0 = r9.A1f     // Catch:{ all -> 0x08a6 }
            r49 = r0
            X.0yX r4 = r9.A1T     // Catch:{ all -> 0x08a6 }
            X.1iP r2 = new X.1iP     // Catch:{ all -> 0x08a6 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x08a6 }
            r6.A02(r2)     // Catch:{ all -> 0x08a6 }
            X.0yY r0 = r9.A03     // Catch:{ all -> 0x08a6 }
            X.1iQ r4 = r0.A00     // Catch:{ all -> 0x08a6 }
            java.lang.String r2 = "android.media.AUDIO_BECOMING_NOISY"
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x08a6 }
            r0.<init>(r2)     // Catch:{ all -> 0x08a6 }
            r7.registerReceiver(r4, r0)     // Catch:{ all -> 0x08a6 }
            X.0y4 r2 = r9.A0Y     // Catch:{ all -> 0x08a6 }
            X.1iR r0 = new X.1iR     // Catch:{ all -> 0x08a6 }
            r0.<init>(r9)     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0sG r4 = r9.A0V     // Catch:{ all -> 0x08a6 }
            X.18c r0 = r4.A06     // Catch:{ all -> 0x08a6 }
            X.1iS r2 = new X.1iS     // Catch:{ all -> 0x08a6 }
            r2.<init>(r4)     // Catch:{ all -> 0x08a6 }
            X.1iU r0 = r0.A02     // Catch:{ all -> 0x08a6 }
            r0.A02(r2)     // Catch:{ all -> 0x08a6 }
            X.12w r0 = r4.A02     // Catch:{ all -> 0x08a6 }
            r5 = 1
            com.facebook.redex.IDxCObserverShape426S0100000_2_I0 r2 = new com.facebook.redex.IDxCObserverShape426S0100000_2_I0     // Catch:{ all -> 0x08a6 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x08a6 }
            X.1iW r0 = r0.A05     // Catch:{ all -> 0x08a6 }
            r0.A02(r2)     // Catch:{ all -> 0x08a6 }
            X.16j r2 = r4.A09     // Catch:{ all -> 0x08a6 }
            X.1iX r0 = new X.1iX     // Catch:{ all -> 0x08a6 }
            r0.<init>(r4)     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0yI r4 = r9.A16     // Catch:{ all -> 0x08a6 }
            X.19T r2 = r4.A00     // Catch:{ all -> 0x08a6 }
            X.1iZ r0 = new X.1iZ     // Catch:{ all -> 0x08a6 }
            r0.<init>(r4)     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0yo r4 = r9.A0H     // Catch:{ all -> 0x08a6 }
            X.12s r2 = r4.A0O     // Catch:{ all -> 0x08a6 }
            X.1ib r0 = new X.1ib     // Catch:{ all -> 0x08a6 }
            r0.<init>(r4)     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0yU r4 = r9.A17     // Catch:{ all -> 0x08a6 }
            boolean r0 = r4 instanceof X.AnonymousClass11B     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x01e4
            r12 = r4
            X.11B r12 = (X.AnonymousClass11B) r12     // Catch:{ all -> 0x08a6 }
            X.0xq r0 = r12.A02     // Catch:{ all -> 0x08a6 }
            r0.A02(r12)     // Catch:{ all -> 0x08a6 }
            X.0ub r2 = r12.A00     // Catch:{ all -> 0x08a6 }
            X.0s4 r11 = r12.A04     // Catch:{ all -> 0x08a6 }
            X.118 r10 = r12.A05     // Catch:{ all -> 0x08a6 }
            X.1id r0 = new X.1id     // Catch:{ all -> 0x08a6 }
            r0.<init>(r11, r10)     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.11A r2 = r12.A01     // Catch:{ all -> 0x08a6 }
            X.1if r0 = new X.1if     // Catch:{ all -> 0x08a6 }
            r0.<init>(r11, r10)     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
        L_0x01e4:
            X.0xc r0 = r9.A0F     // Catch:{ all -> 0x08a6 }
            r48 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A0x     // Catch:{ all -> 0x08a6 }
            r0.add(r4)     // Catch:{ all -> 0x08a6 }
            X.0yi r4 = r9.A0b     // Catch:{ all -> 0x08a6 }
            r2 = 4
            com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0 r0 = new com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0     // Catch:{ all -> 0x08a6 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x08a6 }
            r1.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0yp r0 = r9.A0M     // Catch:{ all -> 0x08a6 }
            X.0yO r2 = r0.A06     // Catch:{ all -> 0x08a6 }
            X.1WC r0 = r0.A05     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0yr r4 = r9.A0k     // Catch:{ all -> 0x08a6 }
            X.1SQ r2 = r4.A01     // Catch:{ all -> 0x08a6 }
            X.1ih r0 = new X.1ih     // Catch:{ all -> 0x08a6 }
            r0.<init>(r4)     // Catch:{ all -> 0x08a6 }
            r2.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0y1 r0 = r9.A1E     // Catch:{ all -> 0x08a6 }
            r6.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0yF r2 = r9.A1N     // Catch:{ all -> 0x08a6 }
            X.0tK r0 = r2.A04     // Catch:{ all -> 0x08a6 }
            r0.A02(r2)     // Catch:{ all -> 0x08a6 }
            X.0y8 r2 = r9.A0j     // Catch:{ all -> 0x08a6 }
            X.15A r0 = r2.A03     // Catch:{ all -> 0x08a6 }
            r0.A02(r2)     // Catch:{ all -> 0x08a6 }
            X.1ii r0 = new X.1ii     // Catch:{ all -> 0x08a6 }
            r0.<init>(r7, r6)     // Catch:{ all -> 0x08a6 }
            r1.A02(r0)     // Catch:{ all -> 0x08a6 }
            X.0wY r1 = r9.A0v     // Catch:{ all -> 0x08a6 }
            X.0y3 r0 = r9.A1I     // Catch:{ all -> 0x08a6 }
            r1.A00 = r0     // Catch:{ all -> 0x08a6 }
            X.0xk r1 = r9.A1G     // Catch:{ all -> 0x08a6 }
            X.0yR r0 = r9.A1H     // Catch:{ all -> 0x08a6 }
            r1.A09 = r0     // Catch:{ all -> 0x08a6 }
            X.0xd r1 = r9.A0t     // Catch:{ all -> 0x08a6 }
            com.obwhatsapp.data.device.DeviceChangeManager r0 = r9.A0s     // Catch:{ all -> 0x08a6 }
            r1.A00 = r0     // Catch:{ all -> 0x08a6 }
            X.1ij r0 = new X.1ij     // Catch:{ all -> 0x08a6 }
            r0.<init>()     // Catch:{ all -> 0x08a6 }
            X.C33541ik.A00 = r0     // Catch:{ all -> 0x08a6 }
            X.1il r1 = new X.1il     // Catch:{ all -> 0x08a6 }
            r1.<init>()     // Catch:{ all -> 0x08a6 }
            java.util.concurrent.atomic.AtomicReference r0 = X.C33561im.A00     // Catch:{ all -> 0x08a6 }
            r0.set(r1)     // Catch:{ all -> 0x08a6 }
            X.0xf r4 = r9.A1Y     // Catch:{ all -> 0x08a6 }
            X.0t3 r2 = r9.A0d     // Catch:{ all -> 0x08a6 }
            X.0ug r1 = r9.A1F     // Catch:{ all -> 0x08a6 }
            X.1in r0 = new X.1in     // Catch:{ all -> 0x08a6 }
            r0.<init>(r2, r1, r4)     // Catch:{ all -> 0x08a6 }
            r4.A0K = r0     // Catch:{ all -> 0x08a6 }
            X.0y0 r4 = r9.A0o     // Catch:{ all -> 0x08a6 }
            X.0pf r2 = r9.A0g     // Catch:{ all -> 0x08a6 }
            X.0yL r0 = r9.A0e     // Catch:{ all -> 0x08a6 }
            X.1io r1 = new X.1io     // Catch:{ all -> 0x08a6 }
            r1.<init>(r7, r0, r2)     // Catch:{ all -> 0x08a6 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.A00     // Catch:{ all -> 0x08a6 }
            r0.add(r1)     // Catch:{ all -> 0x08a6 }
            X.0tB r1 = r9.A1e     // Catch:{ all -> 0x08a6 }
            X.0sb r0 = r9.A05     // Catch:{ all -> 0x08a6 }
            r1.A02 = r0     // Catch:{ all -> 0x08a6 }
            X.1G1 r0 = X.AnonymousClass1G1.A00()     // Catch:{ all -> 0x08a6 }
            monitor-enter(r0)     // Catch:{ all -> 0x08a6 }
            r0.A00 = r7     // Catch:{ all -> 0x0896 }
            monitor-exit(r0)     // Catch:{ all -> 0x08a6 }
            X.0yQ r2 = r9.A1B     // Catch:{ all -> 0x08a6 }
            X.01J r1 = r9.A1h     // Catch:{ all -> 0x08a6 }
            com.facebook.redex.IDxLazyShape245S0100000_2_I0 r0 = new com.facebook.redex.IDxLazyShape245S0100000_2_I0     // Catch:{ all -> 0x08a6 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x08a6 }
            r2.A0d = r0     // Catch:{ all -> 0x08a6 }
            X.013 r3 = r9.A0f     // Catch:{ all -> 0x08a6 }
            java.lang.String r1 = "StringPackIdsRegister"
            r8.A04(r1)     // Catch:{ all -> 0x08a6 }
            X.1ip r0 = new X.1ip     // Catch:{ all -> 0x08a6 }
            r0.<init>()     // Catch:{ all -> 0x08a6 }
            X.AnonymousClass1UQ.A02 = r0     // Catch:{ all -> 0x08a6 }
            r8.A03(r1)     // Catch:{ all -> 0x08a6 }
            java.lang.String r2 = "loadAndApplyForcedLanguage"
            r8.A04(r2)     // Catch:{ all -> 0x08a6 }
            X.0sm r0 = r3.A08     // Catch:{ all -> 0x08a6 }
            android.content.SharedPreferences r4 = r0.A00     // Catch:{ all -> 0x08a6 }
            java.lang.String r1 = "forced_language"
            r0 = 0
            java.lang.String r4 = r4.getString(r1, r0)     // Catch:{ all -> 0x08a6 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x02bd
            java.lang.String r0 = "whatsapplocale/loadandapplyforcedlanguage/no language to load"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08a6 }
            r0 = 0
            r3.A06 = r0     // Catch:{ all -> 0x08a6 }
        L_0x02b1:
            r8.A03(r2)     // Catch:{ all -> 0x08a6 }
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r9.A1J     // Catch:{ all -> 0x08a6 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x08a6 }
            if (r0 != 0) goto L_0x031e
            goto L_0x0309
        L_0x02bd:
            java.lang.String r1 = "whatsapplocale/loadandapplyforcedlanguage/language to load: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x08a6 }
            r0.<init>(r1)     // Catch:{ all -> 0x08a6 }
            r0.append(r4)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x08a6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = X.C33601iq.A00(r4)     // Catch:{ all -> 0x08a6 }
            java.util.Locale r0 = X.AnonymousClass1WH.A09(r0)     // Catch:{ all -> 0x08a6 }
            r3.A04 = r0     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = r0.getCountry()     // Catch:{ all -> 0x08a6 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x02fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x08a6 }
            r1.<init>()     // Catch:{ all -> 0x08a6 }
            r1.append(r4)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "-IN"
            r1.append(r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = X.C33601iq.A00(r0)     // Catch:{ all -> 0x08a6 }
            java.util.Locale r0 = X.AnonymousClass1WH.A09(r0)     // Catch:{ all -> 0x08a6 }
            r3.A04 = r0     // Catch:{ all -> 0x08a6 }
        L_0x02fe:
            r3.A06 = r5     // Catch:{ all -> 0x08a6 }
            java.util.Locale r0 = r3.A04     // Catch:{ all -> 0x08a6 }
            java.util.Locale.setDefault(r0)     // Catch:{ all -> 0x08a6 }
            r3.A0Q()     // Catch:{ all -> 0x08a6 }
            goto L_0x02b1
        L_0x0309:
            X.0uV r3 = r9.A0h     // Catch:{ all -> 0x088f }
            X.1WA r2 = r3.A03     // Catch:{ all -> 0x088f }
            r1 = 49
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3     // Catch:{ all -> 0x088f }
            r0.<init>(r3, r1, r7)     // Catch:{ all -> 0x088f }
            r2.execute(r0)     // Catch:{ all -> 0x088f }
            X.0ua r0 = r9.A0B     // Catch:{ all -> 0x088f }
            r0.A01()     // Catch:{ all -> 0x088f }
            goto L_0x086b
        L_0x031e:
            X.0yM r10 = r9.A1c     // Catch:{ all -> 0x08a6 }
            X.0sm r0 = r10.A00     // Catch:{ all -> 0x08a6 }
            android.content.SharedPreferences r4 = r0.A00     // Catch:{ all -> 0x08a6 }
            java.lang.String r3 = "version"
            java.lang.String r0 = "0.0.0"
            java.lang.String r0 = r4.getString(r3, r0)     // Catch:{ all -> 0x08a6 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r2 = "2.23.1.76"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x08a6 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0381
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "run_on_connect_tasks_for_version_change"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r5)     // Catch:{ all -> 0x08a6 }
            r0.apply()     // Catch:{ all -> 0x08a6 }
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "async_tasks_pending_for_version_change"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r5)     // Catch:{ all -> 0x08a6 }
            r0.apply()     // Catch:{ all -> 0x08a6 }
            X.0sC r0 = r10.A01     // Catch:{ all -> 0x08a6 }
            r0.A00()     // Catch:{ all -> 0x08a6 }
            X.01D r0 = r10.A03     // Catch:{ all -> 0x08a6 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x08a6 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x08a6 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x08a6 }
        L_0x0366:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x0376
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x08a6 }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ all -> 0x08a6 }
            r0.AMX()     // Catch:{ all -> 0x08a6 }
            goto L_0x0366
        L_0x0376:
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x08a6 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r2)     // Catch:{ all -> 0x08a6 }
            r0.apply()     // Catch:{ all -> 0x08a6 }
        L_0x0381:
            X.0xi r1 = r9.A0z     // Catch:{ all -> 0x08a6 }
            X.0xh r0 = r9.A13     // Catch:{ all -> 0x08a6 }
            r1.A00 = r0     // Catch:{ all -> 0x08a6 }
            X.0yk r4 = r9.A0Q     // Catch:{ all -> 0x08a6 }
            X.0t3 r15 = r4.A0L     // Catch:{ all -> 0x08a6 }
            X.0rt r3 = r4.A0P     // Catch:{ all -> 0x08a6 }
            X.0sf r0 = r4.A0X     // Catch:{ all -> 0x08a6 }
            r47 = r0
            X.0zv r1 = r4.A0V     // Catch:{ all -> 0x08a6 }
            X.1ir r27 = new X.1ir     // Catch:{ all -> 0x08a6 }
            r2 = r0
            r0 = r27
            r0.<init>(r15, r3, r1, r2)     // Catch:{ all -> 0x08a6 }
            X.0ts r0 = r4.A0O     // Catch:{ all -> 0x08a6 }
            r46 = r0
            X.17Z r0 = r4.A0G     // Catch:{ all -> 0x08a6 }
            r45 = r0
            X.19D r0 = r4.A04     // Catch:{ all -> 0x08a6 }
            r44 = r0
            X.19E r0 = r4.A06     // Catch:{ all -> 0x08a6 }
            r43 = r0
            X.0rz r0 = r4.A0M     // Catch:{ all -> 0x08a6 }
            r42 = r0
            X.0rs r0 = r4.A0I     // Catch:{ all -> 0x08a6 }
            r41 = r0
            X.1is r26 = new X.1is     // Catch:{ all -> 0x08a6 }
            r28 = r26
            r29 = r44
            r30 = r43
            r31 = r45
            r32 = r0
            r33 = r15
            r34 = r42
            r35 = r46
            r36 = r3
            r37 = r1
            r38 = r2
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x08a6 }
            X.0t6 r10 = r4.A0Q     // Catch:{ all -> 0x08a6 }
            X.0tq r2 = r4.A0S     // Catch:{ all -> 0x08a6 }
            X.10G r0 = r4.A0T     // Catch:{ all -> 0x08a6 }
            X.1it r25 = new X.1it     // Catch:{ all -> 0x08a6 }
            r28 = r25
            r31 = r15
            r32 = r46
            r33 = r10
            r34 = r2
            r35 = r0
            r36 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x08a6 }
            X.0sK r2 = r4.A01     // Catch:{ all -> 0x08a6 }
            X.013 r0 = r4.A0N     // Catch:{ all -> 0x08a6 }
            X.1WG r14 = new X.1WG     // Catch:{ all -> 0x08a6 }
            r14.<init>(r2, r15, r0, r1)     // Catch:{ all -> 0x08a6 }
            X.1Gn r0 = r4.A03     // Catch:{ all -> 0x08a6 }
            r39 = r0
            X.1iu r24 = new X.1iu     // Catch:{ all -> 0x08a6 }
            r28 = r24
            r29 = r0
            r30 = r44
            r31 = r43
            r32 = r15
            r33 = r3
            r34 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x08a6 }
            X.0sq r0 = r4.A0c     // Catch:{ all -> 0x08a6 }
            r40 = r0
            X.0sG r0 = r4.A0D     // Catch:{ all -> 0x08a6 }
            r20 = r0
            X.0sP r0 = r4.A0E     // Catch:{ all -> 0x08a6 }
            r16 = r0
            X.0vJ r0 = r4.A0U     // Catch:{ all -> 0x08a6 }
            r13 = r0
            X.0xz r12 = r4.A0F     // Catch:{ all -> 0x08a6 }
            X.0sO r11 = r4.A0R     // Catch:{ all -> 0x08a6 }
            X.11R r0 = r4.A0K     // Catch:{ all -> 0x08a6 }
            X.1Wb r23 = new X.1Wb     // Catch:{ all -> 0x08a6 }
            r28 = r23
            r29 = r2
            r30 = r20
            r31 = r16
            r32 = r12
            r33 = r0
            r34 = r15
            r35 = r11
            r36 = r13
            r38 = r40
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x08a6 }
            X.10Y r0 = r4.A0H     // Catch:{ all -> 0x08a6 }
            X.1iv r22 = new X.1iv     // Catch:{ all -> 0x08a6 }
            r28 = r22
            r29 = r44
            r30 = r0
            r31 = r15
            r32 = r3
            r33 = r1
            r28.<init>(r29, r30, r31, r32, r33)     // Catch:{ all -> 0x08a6 }
            X.0ug r0 = r4.A0W     // Catch:{ all -> 0x08a6 }
            X.1iw r13 = new X.1iw     // Catch:{ all -> 0x08a6 }
            r13.<init>(r2, r15, r1, r0)     // Catch:{ all -> 0x08a6 }
            X.1ix r12 = new X.1ix     // Catch:{ all -> 0x08a6 }
            r12.<init>(r15, r10, r1)     // Catch:{ all -> 0x08a6 }
            X.1iy r21 = new X.1iy     // Catch:{ all -> 0x08a6 }
            r28 = r21
            r29 = r39
            r30 = r44
            r31 = r43
            r32 = r15
            r33 = r3
            r34 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x08a6 }
            X.19W r0 = r4.A07     // Catch:{ all -> 0x08a6 }
            X.1iz r11 = new X.1iz     // Catch:{ all -> 0x08a6 }
            r11.<init>(r2, r0, r15, r1)     // Catch:{ all -> 0x08a6 }
            X.17e r0 = r4.A0J     // Catch:{ all -> 0x08a6 }
            X.1j0 r20 = new X.1j0     // Catch:{ all -> 0x08a6 }
            r28 = r20
            r29 = r2
            r32 = r45
            r33 = r41
            r34 = r0
            r35 = r15
            r36 = r42
            r37 = r46
            r38 = r3
            r39 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x08a6 }
            X.0pt r0 = r4.A00     // Catch:{ all -> 0x08a6 }
            r29 = r0
            X.1Go r0 = r4.A0b     // Catch:{ all -> 0x08a6 }
            r36 = r0
            X.14W r0 = r4.A0Z     // Catch:{ all -> 0x08a6 }
            r34 = r0
            X.1CX r0 = r4.A0a     // Catch:{ all -> 0x08a6 }
            r10 = r0
            X.01Z r3 = r4.A02     // Catch:{ all -> 0x08a6 }
            X.1Gq r0 = r4.A05     // Catch:{ all -> 0x08a6 }
            X.1j1 r16 = new X.1j1     // Catch:{ all -> 0x08a6 }
            r28 = r16
            r30 = r2
            r31 = r3
            r32 = r0
            r33 = r1
            r35 = r10
            r37 = r40
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x08a6 }
            X.1j2 r10 = new X.1j2     // Catch:{ all -> 0x08a6 }
            r10.<init>(r15, r1)     // Catch:{ all -> 0x08a6 }
            X.13k r0 = r4.A0Y     // Catch:{ all -> 0x08a6 }
            X.1j3 r3 = new X.1j3     // Catch:{ all -> 0x08a6 }
            r3.<init>(r15, r1, r0)     // Catch:{ all -> 0x08a6 }
            X.1j4 r2 = new X.1j4     // Catch:{ all -> 0x08a6 }
            r0 = r47
            r2.<init>(r15, r1, r0)     // Catch:{ all -> 0x08a6 }
            X.15h r1 = r4.A08     // Catch:{ all -> 0x08a6 }
            java.lang.String r15 = "mute"
            r0 = r27
            r1.A05(r0, r15)     // Catch:{ all -> 0x08a6 }
            java.lang.String r15 = "deleteChat"
            r0 = r24
            r1.A05(r0, r15)     // Catch:{ all -> 0x08a6 }
            java.lang.String r15 = "archive"
            r0 = r26
            r1.A05(r0, r15)     // Catch:{ all -> 0x08a6 }
            java.lang.String r15 = "contact"
            r0 = r23
            r1.A05(r0, r15)     // Catch:{ all -> 0x08a6 }
            java.lang.String r15 = "star"
            r0 = r25
            r1.A05(r0, r15)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "setting_locale"
            r1.A05(r14, r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r14 = "markChatAsRead"
            r0 = r22
            r1.A05(r0, r14)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "setting_pushName"
            r1.A05(r13, r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "deleteMessageForMe"
            r1.A05(r12, r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r12 = "clearChat"
            r0 = r21
            r1.A05(r0, r12)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "sentinel"
            r1.A05(r11, r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r11 = "setting_unarchiveChats"
            r0 = r20
            r1.A05(r0, r11)     // Catch:{ all -> 0x08a6 }
            java.lang.String r11 = "favoriteSticker"
            r0 = r16
            r1.A05(r0, r11)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "android_unsupported_actions"
            r1.A05(r10, r0)     // Catch:{ all -> 0x08a6 }
            X.1Gm r10 = r4.A0B     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "primary_feature"
            r1.A05(r10, r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "removeRecentSticker"
            r1.A05(r3, r0)     // Catch:{ all -> 0x08a6 }
            X.15j r3 = r4.A09     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "nux"
            r1.A05(r3, r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "userStatusMute"
            r1.A05(r2, r0)     // Catch:{ all -> 0x08a6 }
            X.0zw r2 = r4.A0A     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "pnForLidChat"
            r1.A05(r2, r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r1 = "PaymentsLifecycleManagerInit"
            r8.A04(r1)     // Catch:{ all -> 0x08a6 }
            X.0wV r0 = r9.A1O     // Catch:{ all -> 0x08a6 }
            r0.A00()     // Catch:{ all -> 0x08a6 }
            r8.A03(r1)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "AppInit/main/mediaState"
            X.C004201v.A01(r0)     // Catch:{ all -> 0x0891 }
            X.0yC r0 = r9.A1C     // Catch:{ all -> 0x0891 }
            r2 = 0
            r0.A01(r2, r5)     // Catch:{ all -> 0x0891 }
            X.C004201v.A00()     // Catch:{ all -> 0x08a6 }
            X.AnonymousClass00B.A0H(r2)     // Catch:{ all -> 0x08a6 }
            X.0sC r0 = r9.A1W     // Catch:{ all -> 0x08a1 }
            int r1 = r0.A00()     // Catch:{ all -> 0x08a1 }
            r0 = 6
            if (r1 != r0) goto L_0x056c
            r48.A00()     // Catch:{ all -> 0x08a1 }
            goto L_0x059e
        L_0x056c:
            X.0sK r0 = r9.A07     // Catch:{ all -> 0x08a1 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x08a1 }
            if (r0 == 0) goto L_0x0590
            X.0yg r4 = r9.A0L     // Catch:{ all -> 0x08a1 }
            X.0pd r3 = r4.A09     // Catch:{ all -> 0x08a1 }
            r1 = 1761(0x6e1, float:2.468E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x08a1 }
            boolean r0 = r3.A0E(r0, r1)     // Catch:{ all -> 0x08a1 }
            if (r0 != 0) goto L_0x058a
            X.1RE r0 = r4.A04     // Catch:{ all -> 0x08a1 }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x08a1 }
            if (r0 == 0) goto L_0x0590
        L_0x058a:
            r0 = r48
            r0.A07(r5)     // Catch:{ all -> 0x08a1 }
            goto L_0x059e
        L_0x0590:
            X.0ys r0 = r9.A0R     // Catch:{ all -> 0x08a1 }
            int r1 = r0.A00()     // Catch:{ all -> 0x08a1 }
            r0 = 7
            if (r1 == r0) goto L_0x058a
            r0 = 9
            if (r1 != r0) goto L_0x059e
            goto L_0x058a
        L_0x059e:
            X.AnonymousClass00B.A0H(r5)     // Catch:{ all -> 0x08a6 }
            X.0ys r1 = r9.A0R     // Catch:{ all -> 0x08a6 }
            boolean r0 = r1.A02()     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x05ac
            r1.A01(r2)     // Catch:{ all -> 0x08a6 }
        L_0x05ac:
            X.0xa r3 = r9.A1V     // Catch:{ all -> 0x088f }
            X.0tz r0 = r3.A01     // Catch:{ all -> 0x088f }
            android.content.Context r10 = r0.A00     // Catch:{ all -> 0x088f }
            java.io.File r4 = r10.getFilesDir()     // Catch:{ all -> 0x088f }
            java.lang.String r1 = "login_failed"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x088f }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x088f }
            r0.getAbsolutePath()     // Catch:{ all -> 0x088f }
            r0.exists()     // Catch:{ all -> 0x088f }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x088f }
            if (r0 == 0) goto L_0x05e1
            java.io.FileInputStream r0 = r10.openFileInput(r1)     // Catch:{ IOException -> 0x05e7 }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ IOException -> 0x05e7 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x05e7 }
            boolean r0 = r1.readBoolean()     // Catch:{ all -> 0x05dc }
            r3.A00 = r0     // Catch:{ all -> 0x05dc }
            r1.close()     // Catch:{ IOException -> 0x05e7 }
            goto L_0x05ef
        L_0x05dc:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x05e0 }
        L_0x05e0:
            throw r0     // Catch:{ IOException -> 0x05e7 }
        L_0x05e1:
            java.lang.String r0 = "loginmanager/loadloginfailed/none"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x088f }
            goto L_0x05ed
        L_0x05e7:
            r1 = move-exception
            java.lang.String r0 = "loginmanager/failed login_failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x088f }
        L_0x05ed:
            r3.A00 = r2     // Catch:{ all -> 0x088f }
        L_0x05ef:
            X.0so r0 = r9.A04     // Catch:{ all -> 0x08a6 }
            X.C23291Bk.A04 = r0     // Catch:{ all -> 0x08a6 }
            X.1Ue r3 = X.C23291Bk.A06     // Catch:{ all -> 0x08a6 }
            r3.A02 = r0     // Catch:{ all -> 0x08a6 }
            X.0pd r11 = r9.A0y     // Catch:{ all -> 0x08a6 }
            r0 = 1888(0x760, float:2.646E-42)
            X.0tM r10 = X.C16620tM.A02     // Catch:{ all -> 0x08a6 }
            boolean r0 = r11.A0E(r10, r0)     // Catch:{ all -> 0x08a6 }
            X.C33741j5.A05 = r0     // Catch:{ all -> 0x08a6 }
            X.0xT r2 = r9.A0i     // Catch:{ all -> 0x08a6 }
            X.0yT r1 = r9.A0x     // Catch:{ all -> 0x08a6 }
            X.0yT r0 = r2.A00     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x0610
            java.lang.String r0 = "SignalLocks/setTransactionLockManager was already set"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x08a6 }
        L_0x0610:
            r2.A00 = r1     // Catch:{ all -> 0x08a6 }
            X.0y6 r1 = r9.A15     // Catch:{ all -> 0x08a6 }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x0723
            X.0qW r0 = r1.A06     // Catch:{ all -> 0x08a6 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x08a6 }
            X.035 r2 = (X.AnonymousClass035) r2     // Catch:{ all -> 0x08a6 }
            android.content.Context r4 = r1.A01     // Catch:{ all -> 0x08a6 }
            java.lang.String r13 = r4.getPackageName()     // Catch:{ all -> 0x08a6 }
            X.C18450wi.A0B(r13)     // Catch:{ all -> 0x08a6 }
            java.lang.String r15 = "com.obwhatsapp.HomeActivity"
            android.content.ComponentName r12 = new android.content.ComponentName     // Catch:{ all -> 0x08a6 }
            r12.<init>(r13, r15)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "com.obwhatsapp.Conversation"
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ all -> 0x08a6 }
            r1.<init>(r13, r0)     // Catch:{ all -> 0x08a6 }
            X.1Jq r0 = new X.1Jq     // Catch:{ all -> 0x08a6 }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x08a6 }
            java.util.List r1 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x08a6 }
            X.C18450wi.A0B(r1)     // Catch:{ all -> 0x08a6 }
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ all -> 0x0708 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x0708 }
            float r4 = r0.density     // Catch:{ all -> 0x0708 }
            r0 = 1144258560(0x44340000, float:720.0)
            float r4 = r4 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r14 = (int) r4     // Catch:{ all -> 0x0708 }
            r0 = 10
            int r0 = X.AnonymousClass1J9.A0M(r1, r0)     // Catch:{ all -> 0x08a6 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x08a6 }
            r12.<init>(r0)     // Catch:{ all -> 0x08a6 }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ all -> 0x08a6 }
        L_0x0665:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x0682
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x08a6 }
            X.1Jq r0 = (X.C25401Jq) r0     // Catch:{ all -> 0x08a6 }
            java.lang.Object r4 = r0.first     // Catch:{ all -> 0x08a6 }
            android.content.ComponentName r4 = (android.content.ComponentName) r4     // Catch:{ all -> 0x08a6 }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x08a6 }
            android.content.ComponentName r1 = (android.content.ComponentName) r1     // Catch:{ all -> 0x08a6 }
            X.036 r0 = new X.036     // Catch:{ all -> 0x08a6 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x08a6 }
            r12.add(r0)     // Catch:{ all -> 0x08a6 }
            goto L_0x0665
        L_0x0682:
            java.util.Set r0 = X.C003101j.A0F(r12)     // Catch:{ all -> 0x08a6 }
            X.037 r1 = new X.037     // Catch:{ all -> 0x08a6 }
            r1.<init>(r0, r14, r14)     // Catch:{ all -> 0x08a6 }
            X.03A r4 = r2.A01     // Catch:{ all -> 0x08a6 }
            X.03B r4 = (X.AnonymousClass03B) r4     // Catch:{ all -> 0x08a6 }
            java.util.concurrent.CopyOnWriteArraySet r2 = r4.A03     // Catch:{ all -> 0x08a6 }
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x08a6 }
            if (r0 != 0) goto L_0x06a1
            r2.add(r1)     // Catch:{ all -> 0x08a6 }
            X.03C r0 = r4.A00     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x06a1
            r0.Aeg(r2)     // Catch:{ all -> 0x08a6 }
        L_0x06a1:
            java.lang.String r1 = "com.obwhatsapp.home.ui.HomePlaceholderActivity"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ all -> 0x08a6 }
            r0.<init>(r13, r1)     // Catch:{ all -> 0x08a6 }
            android.content.Intent r12 = new android.content.Intent     // Catch:{ all -> 0x08a6 }
            r12.<init>()     // Catch:{ all -> 0x08a6 }
            r12.setComponent(r0)     // Catch:{ all -> 0x08a6 }
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ all -> 0x08a6 }
            r1.<init>(r13, r15)     // Catch:{ all -> 0x08a6 }
            X.03D r0 = new X.03D     // Catch:{ all -> 0x08a6 }
            r0.<init>(r1)     // Catch:{ all -> 0x08a6 }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x08a6 }
            X.C18450wi.A0B(r0)     // Catch:{ all -> 0x08a6 }
            X.03E r1 = new X.03E     // Catch:{ all -> 0x08a6 }
            r1.<init>(r12, r0, r14, r14)     // Catch:{ all -> 0x08a6 }
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x08a6 }
            if (r0 != 0) goto L_0x06d6
            r2.add(r1)     // Catch:{ all -> 0x08a6 }
            X.03C r0 = r4.A00     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x06d6
            r0.Aeg(r2)     // Catch:{ all -> 0x08a6 }
        L_0x06d6:
            java.lang.String r0 = "com.obwhatsapp.backup.google.GoogleDriveNewUserSetupActivity"
            java.util.List r1 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x08a6 }
            X.C18450wi.A0B(r1)     // Catch:{ all -> 0x08a6 }
            r0 = 10
            int r0 = X.AnonymousClass1J9.A0M(r1, r0)     // Catch:{ all -> 0x08a6 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x08a6 }
            r12.<init>(r0)     // Catch:{ all -> 0x08a6 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x08a6 }
        L_0x06ee:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x070a
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x08a6 }
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ all -> 0x08a6 }
            r1.<init>(r13, r0)     // Catch:{ all -> 0x08a6 }
            X.03D r0 = new X.03D     // Catch:{ all -> 0x08a6 }
            r0.<init>(r1)     // Catch:{ all -> 0x08a6 }
            r12.add(r0)     // Catch:{ all -> 0x08a6 }
            goto L_0x06ee
        L_0x0708:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x08a6 }
        L_0x070a:
            java.util.Set r0 = X.C003101j.A0F(r12)     // Catch:{ all -> 0x08a6 }
            X.03F r1 = new X.03F     // Catch:{ all -> 0x08a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x08a6 }
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x08a6 }
            if (r0 != 0) goto L_0x0723
            r2.add(r1)     // Catch:{ all -> 0x08a6 }
            X.03C r0 = r4.A00     // Catch:{ all -> 0x08a6 }
            if (r0 == 0) goto L_0x0723
            r0.Aeg(r2)     // Catch:{ all -> 0x08a6 }
        L_0x0723:
            java.lang.String r0 = "AppInit/msgStore/checkHealth"
            X.C004201v.A01(r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r2 = "MsgStoreInit"
            r8.A04(r2)     // Catch:{ all -> 0x08a6 }
            X.0sK r0 = r9.A07     // Catch:{ all -> 0x0887 }
            r0.A0B()     // Catch:{ all -> 0x0887 }
            com.obwhatsapp.Me r0 = r0.A00     // Catch:{ all -> 0x0887 }
            if (r0 == 0) goto L_0x0745
            X.0xS r0 = r9.A0l     // Catch:{ all -> 0x0887 }
            r0.A07(r5)     // Catch:{ all -> 0x0887 }
            r1 = 7
            com.facebook.redex.RunnableRunnableShape10S0100000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape10S0100000_I0_9     // Catch:{ all -> 0x0887 }
            r0.<init>((java.lang.Object) r9, (int) r1)     // Catch:{ all -> 0x0887 }
            r0.run()     // Catch:{ all -> 0x0887 }
            goto L_0x0756
        L_0x0745:
            X.0tq r0 = r9.A0q     // Catch:{ all -> 0x0887 }
            X.1ZU r0 = r0.A03     // Catch:{ all -> 0x0887 }
            r0.A01()     // Catch:{ all -> 0x0887 }
            java.lang.String r0 = "app-init/main/sendInitialMigrationInfoNeededBroadcast"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0885 }
            X.0yl r0 = r9.A1X     // Catch:{ all -> 0x0885 }
            r0.A01()     // Catch:{ all -> 0x0885 }
        L_0x0756:
            r8.A03(r2)     // Catch:{ all -> 0x08a6 }
            X.C004201v.A00()     // Catch:{ all -> 0x08a6 }
            X.0xr r0 = r9.A1d     // Catch:{ all -> 0x08a6 }
            r6.A02(r0)     // Catch:{ all -> 0x08a6 }
            android.app.Application r1 = X.AnonymousClass1UR.A00(r7)     // Catch:{ all -> 0x08a6 }
            X.0ye r0 = r9.A01     // Catch:{ all -> 0x08a6 }
            r1.registerActivityLifecycleCallbacks(r0)     // Catch:{ all -> 0x08a6 }
            android.app.Application r1 = X.AnonymousClass1UR.A00(r7)     // Catch:{ all -> 0x08a6 }
            X.0yZ r0 = r9.A1A     // Catch:{ all -> 0x08a6 }
            r1.registerActivityLifecycleCallbacks(r0)     // Catch:{ all -> 0x08a6 }
            android.app.Application r1 = X.AnonymousClass1UR.A00(r7)     // Catch:{ all -> 0x08a6 }
            X.0yq r0 = r9.A19     // Catch:{ all -> 0x08a6 }
            r1.registerActivityLifecycleCallbacks(r0)     // Catch:{ all -> 0x08a6 }
            r0 = r49
            boolean r0 = r0 instanceof X.C23291Bk     // Catch:{ all -> 0x088f }
            if (r0 == 0) goto L_0x07d9
            r0 = 1442(0x5a2, float:2.02E-42)
            boolean r6 = r11.A0E(r10, r0)     // Catch:{ all -> 0x088f }
            java.util.concurrent.Executor r5 = X.C23291Bk.A08     // Catch:{ all -> 0x088f }
            monitor-enter(r3)     // Catch:{ all -> 0x088f }
            java.util.List r4 = r3.A01     // Catch:{ all -> 0x07d5 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x07d5 }
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x07d5 }
            java.lang.String r0 = "job-anomaly-detector-thread"
            android.os.HandlerThread r2 = new android.os.HandlerThread     // Catch:{ all -> 0x07d5 }
            r2.<init>(r0)     // Catch:{ all -> 0x07d5 }
            r2.start()     // Catch:{ all -> 0x07d5 }
            X.1Un r1 = r3.A00     // Catch:{ all -> 0x07d5 }
            X.1Uv r0 = new X.1Uv     // Catch:{ all -> 0x07d5 }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x07d5 }
            r4.add(r0)     // Catch:{ all -> 0x07d5 }
            X.1Ur r0 = new X.1Ur     // Catch:{ all -> 0x07d5 }
            r0.<init>(r2, r1, r5)     // Catch:{ all -> 0x07d5 }
            r4.add(r0)     // Catch:{ all -> 0x07d5 }
            if (r6 == 0) goto L_0x07ba
            X.1Uu r0 = new X.1Uu     // Catch:{ all -> 0x07d5 }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x07d5 }
            r4.add(r0)     // Catch:{ all -> 0x07d5 }
        L_0x07ba:
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x07d5 }
        L_0x07be:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x07d5 }
            if (r0 == 0) goto L_0x07d8
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x07d5 }
            X.1Uq r1 = (X.C28171Uq) r1     // Catch:{ all -> 0x07d5 }
            monitor-enter(r1)     // Catch:{ all -> 0x07d5 }
            java.util.Set r0 = r1.A01     // Catch:{ all -> 0x07d2 }
            r0.add(r3)     // Catch:{ all -> 0x07d2 }
            monitor-exit(r1)     // Catch:{ all -> 0x07d5 }
            goto L_0x07be
        L_0x07d2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x07d5 }
            throw r0     // Catch:{ all -> 0x07d5 }
        L_0x07d5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x088f }
            throw r0     // Catch:{ all -> 0x088f }
        L_0x07d8:
            monitor-exit(r3)     // Catch:{ all -> 0x088f }
        L_0x07d9:
            r0 = 687(0x2af, float:9.63E-43)
            boolean r6 = r11.A0E(r10, r0)     // Catch:{ all -> 0x088f }
            r0 = 2872(0xb38, float:4.025E-42)
            boolean r5 = r11.A0E(r10, r0)     // Catch:{ all -> 0x088f }
            X.0t9 r3 = r9.A12     // Catch:{ all -> 0x088f }
            X.0xo r2 = r9.A10     // Catch:{ all -> 0x088f }
            r0 = 6
            com.facebook.redex.RunnableRunnableShape10S0100000_I0_9 r4 = new com.facebook.redex.RunnableRunnableShape10S0100000_I0_9     // Catch:{ all -> 0x088f }
            r4.<init>((java.lang.Object) r9, (int) r0)     // Catch:{ all -> 0x088f }
            X.0yH r1 = r9.A14     // Catch:{ all -> 0x088f }
            r0 = 305(0x131, float:4.27E-43)
            int r0 = r11.A03(r10, r0)     // Catch:{ all -> 0x088f }
            r3.A08 = r2     // Catch:{ all -> 0x088f }
            r3.A07 = r1     // Catch:{ all -> 0x088f }
            r3.A0Q = r6     // Catch:{ all -> 0x088f }
            r3.A09 = r5     // Catch:{ all -> 0x088f }
            r3.A0N = r0     // Catch:{ all -> 0x088f }
            X.1CI r0 = r3.A0G     // Catch:{ all -> 0x088f }
            r0.A02 = r3     // Catch:{ all -> 0x088f }
            X.1CJ r0 = r3.A0J     // Catch:{ all -> 0x088f }
            X.1WA r1 = r0.A00     // Catch:{ all -> 0x088f }
            X.1j6 r0 = new X.1j6     // Catch:{ all -> 0x088f }
            r0.<init>(r7, r3, r5)     // Catch:{ all -> 0x088f }
            r1.execute(r0)     // Catch:{ all -> 0x088f }
            X.18r r3 = r3.A0H     // Catch:{ all -> 0x088f }
            X.1CJ r0 = r3.A02     // Catch:{ all -> 0x088f }
            X.1WA r2 = r0.A00     // Catch:{ all -> 0x088f }
            r1 = 22
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5     // Catch:{ all -> 0x088f }
            r0.<init>(r3, r1, r4)     // Catch:{ all -> 0x088f }
            r2.execute(r0)     // Catch:{ all -> 0x088f }
            X.0ua r0 = r9.A0B     // Catch:{ all -> 0x088f }
            r0.A01()     // Catch:{ all -> 0x088f }
            r1 = 5
            com.facebook.redex.RunnableRunnableShape10S0100000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape10S0100000_I0_9     // Catch:{ all -> 0x088f }
            r0.<init>((java.lang.Object) r9, (int) r1)     // Catch:{ all -> 0x088f }
            r0.run()     // Catch:{ all -> 0x088f }
            X.0xZ r0 = r9.A1g     // Catch:{ all -> 0x088f }
            r0.A01(r7)     // Catch:{ all -> 0x088f }
            X.0uV r3 = r9.A0h     // Catch:{ all -> 0x088f }
            X.1WA r2 = r3.A03     // Catch:{ all -> 0x088f }
            r1 = 49
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3     // Catch:{ all -> 0x088f }
            r0.<init>(r3, r1, r7)     // Catch:{ all -> 0x088f }
            r2.execute(r0)     // Catch:{ all -> 0x088f }
            X.0xj r3 = r9.A0I     // Catch:{ all -> 0x088f }
            X.1WA r2 = r3.A0G     // Catch:{ all -> 0x088f }
            r1 = 9
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1     // Catch:{ all -> 0x088f }
            r0.<init>(r3, r1, r7)     // Catch:{ all -> 0x088f }
            r2.execute(r0)     // Catch:{ all -> 0x088f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x08a6 }
            r1.<init>()     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "app-init/async/device_info/OS_BUILD_NUMBER "
            r1.append(r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = android.os.Build.DISPLAY     // Catch:{ all -> 0x08a6 }
            r1.append(r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x08a6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "app-init/main/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08a6 }
        L_0x086b:
            X.C004201v.A00()
            r0 = r18
            r8.A03(r0)
            java.lang.String r3 = "main_thread"
            java.lang.String r2 = "init"
            java.lang.String r1 = "_end"
            r0 = r19
            r0.A0A(r3, r2, r1)
            r1 = r0
            r0 = r17
            r1.A07(r0)
            return
        L_0x0885:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0887 }
        L_0x0887:
            r1 = move-exception
            r8.A03(r2)     // Catch:{ all -> 0x08a6 }
            X.C004201v.A00()     // Catch:{ all -> 0x08a6 }
            goto L_0x08a5
        L_0x088f:
            r1 = move-exception
            goto L_0x08a5
        L_0x0891:
            r1 = move-exception
            X.C004201v.A00()     // Catch:{ all -> 0x08a6 }
            goto L_0x08a5
        L_0x0896:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x08a6 }
            goto L_0x08a5
        L_0x0899:
            java.lang.String r0 = "observer already set"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x08a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x08a6 }
            goto L_0x08a5
        L_0x08a1:
            r1 = move-exception
            X.AnonymousClass00B.A0H(r5)     // Catch:{ all -> 0x08a6 }
        L_0x08a5:
            throw r1     // Catch:{ all -> 0x08a6 }
        L_0x08a6:
            r1 = move-exception
            X.C004201v.A00()
            r0 = r18
            r8.A03(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19730yu.A00(android.content.Context):void");
    }

    public static void A01(Context context) {
        C19730yu A1J2 = ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class)).A1J();
        C004201v.A01("AppAsyncInit/BroadcastReceiver");
        new RunnableRunnableShape3S0100000_I0_2(A1J2.A0J, 40).run();
        new RunnableRunnableShape6S0100000_I0_5(A1J2.A0S, 46).run();
        Context context2 = A1J2.A00;
        AnonymousClass01V r0 = A1J2.A0c;
        C19490yW r1 = A1J2.A1Z;
        boolean z2 = !C33761j7.A00(r0);
        C33761j7.A04 = z2;
        r1.A04(z2);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        context2.registerReceiver(C33761j7.A05, intentFilter);
        new RunnableRunnableShape10S0100000_I0_9((Object) A1J2.A1Q, 8).run();
        context2.registerReceiver(new C33771j8(A1J2.A1L), new IntentFilter("com.obwhatsapp.alarm.WEB_RENOTIFY"), AnonymousClass01S.A09, (Handler) null);
        context2.registerReceiver(new IDxBReceiverShape7S0100000_2_I0(A1J2, 11), new IntentFilter("android.intent.action.TIME_SET"));
        context2.registerReceiver(new IDxBReceiverShape7S0100000_2_I0(A1J2, 12), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
        context2.registerReceiver(new IDxBReceiverShape6S0100000_1_I0(A1J2, 2), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        context2.registerReceiver(new IDxBReceiverShape6S0100000_1_I0(A1J2.A0V, 1), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        C19600yh r02 = A1J2.A0a;
        C220416k r3 = r02.A05;
        Context context3 = r02.A0J.A00;
        if (!r3.A00.A0G()) {
            context3.registerReceiver(new IDxBReceiverShape7S0100000_2_I0(r3, 0), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        }
        C004201v.A00();
    }
}

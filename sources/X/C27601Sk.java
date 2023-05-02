package X;

import android.os.Handler;
import android.os.Message;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.facebook.redex.RunnableRunnableShape7S0200000_I0_5;
import com.facebook.simplejni.NativeHolder;
import com.obwhatsapp.jobqueue.job.SyncDeviceAndResendMessageJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: X.1Sk  reason: invalid class name and case insensitive filesystem */
public class C27601Sk implements C19420yP {
    public int A00;
    public final C16300so A01;
    public final C14870pt A02;
    public final C16040sK A03;
    public final C18020w1 A04;
    public final C211512z A05;
    public final AnonymousClass138 A06;
    public final C15900s5 A07;
    public final AnonymousClass1H7 A08;
    public final C19000xb A09;
    public final C16600tK A0A;
    public final AnonymousClass01Y A0B;
    public final AnonymousClass1OL A0C;
    public final C18380wb A0D;
    public final C23461Cb A0E;
    public final AnonymousClass19I A0F;
    public final C18260wP A0G;
    public final AnonymousClass16U A0H;
    public final C16440t3 A0I;
    public final C16980tz A0J;
    public final C15860rz A0K;
    public final C208211s A0L;
    public final AnonymousClass16P A0M;
    public final C18920xT A0N;
    public final AnonymousClass126 A0O;
    public final C15810rt A0P;
    public final C16460t6 A0Q;
    public final C27531Sc A0R;
    public final C16070sO A0S;
    public final AnonymousClass17E A0T;
    public final AnonymousClass195 A0U;
    public final C16480t8 A0V;
    public final AnonymousClass1HK A0W;
    public final C216414w A0X;
    public final C27581Si A0Y;
    public final AnonymousClass16V A0Z;
    public final AnonymousClass15G A0a;
    public final C27591Sj A0b;
    public final C19410yO A0c;
    public final AnonymousClass137 A0d;
    public final C19810z2 A0e;
    public final AnonymousClass1RS A0f;
    public final AnonymousClass19M A0g;
    public final C14710pd A0h;
    public final C16490t9 A0i;
    public final C17240ul A0j;
    public final C17780vd A0k;
    public final AnonymousClass1HE A0l;
    public final C19200xv A0m;
    public final C216214u A0n;
    public final AnonymousClass1HP A0o;
    public final AnonymousClass13B A0p;
    public final C27541Sd A0q;
    public final C222717h A0r;
    public final C20340zt A0s;
    public final AnonymousClass16S A0t;
    public final C27571Sg A0u;
    public final AnonymousClass17L A0v;
    public final C19790z0 A0w;
    public final C222517f A0x;
    public final AnonymousClass124 A0y;
    public final C23321Bn A0z;
    public final C207811o A10;
    public final C19320yF A11;
    public final C18290wS A12;
    public final AnonymousClass1HG A13;
    public final AnonymousClass1RI A14;
    public final C27551Se A15;
    public final C27561Sf A16;
    public final C27521Sb A17;
    public final AnonymousClass122 A18;
    public final AnonymousClass116 A19;
    public final AnonymousClass1Sh A1A;
    public final C16320sq A1B;
    public final Set A1C = new HashSet();
    public final Set A1D = new HashSet();

    public C27601Sk(C16300so r2, C14870pt r3, C16040sK r4, C18020w1 r5, C211512z r6, AnonymousClass138 r7, C15900s5 r8, AnonymousClass1H7 r9, C19000xb r10, C16600tK r11, AnonymousClass01Y r12, AnonymousClass1OL r13, C18380wb r14, C23461Cb r15, AnonymousClass19I r16, C18260wP r17, AnonymousClass16U r18, C16440t3 r19, C16980tz r20, C15860rz r21, C208211s r22, AnonymousClass16P r23, C18920xT r24, AnonymousClass126 r25, C15810rt r26, C16460t6 r27, C27531Sc r28, C16070sO r29, AnonymousClass17E r30, AnonymousClass195 r31, C16480t8 r32, AnonymousClass1HK r33, C216414w r34, C27581Si r35, AnonymousClass16V r36, AnonymousClass15G r37, C27591Sj r38, C19410yO r39, AnonymousClass137 r40, C19810z2 r41, AnonymousClass1RS r42, AnonymousClass19M r43, C14710pd r44, C16490t9 r45, C17240ul r46, C17780vd r47, AnonymousClass1HE r48, C19200xv r49, C216214u r50, AnonymousClass1HP r51, AnonymousClass13B r52, C27541Sd r53, C222717h r54, C20340zt r55, AnonymousClass16S r56, C27571Sg r57, AnonymousClass17L r58, C19790z0 r59, C222517f r60, AnonymousClass124 r61, C23321Bn r62, C207811o r63, C19320yF r64, C18290wS r65, AnonymousClass1HG r66, AnonymousClass1RI r67, C27551Se r68, C27561Sf r69, C27521Sb r70, AnonymousClass122 r71, AnonymousClass116 r72, AnonymousClass1Sh r73, C16320sq r74) {
        this.A0J = r20;
        this.A0I = r19;
        this.A0h = r44;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A1B = r74;
        this.A0P = r26;
        this.A0i = r45;
        this.A0y = r61;
        this.A07 = r8;
        this.A0N = r24;
        this.A0x = r60;
        this.A09 = r10;
        this.A0T = r30;
        this.A04 = r5;
        this.A08 = r9;
        this.A12 = r65;
        this.A0B = r12;
        this.A0Q = r27;
        this.A19 = r72;
        this.A0j = r46;
        this.A0k = r47;
        this.A0r = r54;
        this.A05 = r6;
        this.A0w = r59;
        this.A0A = r11;
        this.A0n = r50;
        this.A0H = r18;
        this.A0m = r49;
        this.A0V = r32;
        this.A0t = r56;
        this.A0g = r43;
        this.A0L = r22;
        this.A0e = r41;
        this.A0O = r25;
        this.A0W = r33;
        this.A0v = r58;
        this.A10 = r63;
        this.A0a = r37;
        this.A11 = r64;
        this.A17 = r70;
        this.A0D = r14;
        this.A0K = r21;
        this.A0d = r40;
        this.A0R = r28;
        this.A0U = r31;
        this.A0X = r34;
        this.A0Z = r36;
        this.A18 = r71;
        this.A0q = r53;
        this.A06 = r7;
        this.A0o = r51;
        this.A0C = r13;
        this.A0c = r39;
        this.A15 = r68;
        this.A16 = r69;
        this.A0z = r62;
        this.A0E = r15;
        this.A0p = r52;
        this.A0f = r42;
        this.A0u = r57;
        this.A0l = r48;
        this.A0S = r29;
        this.A0s = r55;
        this.A1A = r73;
        this.A0G = r17;
        this.A0Y = r35;
        this.A0b = r38;
        this.A0F = r16;
        this.A0M = r23;
        this.A14 = r67;
        this.A13 = r66;
    }

    public final int A00(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String obj;
        if (bArr2 == null) {
            return 1;
        }
        if (bArr == null) {
            obj = "MessagingXmppHandler/validateServerErrorEncData/badmediadata;";
        } else if (bArr3 == null) {
            obj = "MessagingXmppHandler/validateServerErrorEncData/incomplete enc data";
        } else {
            AnonymousClass13B.A00(bArr, bArr3);
            NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOO(1, str, bArr2, bArr, bArr3);
            if (nativeHolder != null) {
                AnonymousClass2QV r0 = new AnonymousClass2QV(nativeHolder);
                JniBridge.getInstance();
                NativeHolder nativeHolder2 = r0.A00;
                long j2 = (long) 34;
                if (str.equals(JniBridge.jvidispatchOIO(1, j2, nativeHolder2))) {
                    return 1;
                }
                StringBuilder sb = new StringBuilder("MessagingXmppHandler/validateServerErrorEncData/incorrect stanza id; key=");
                sb.append(str);
                sb.append("; stanzaId=");
                JniBridge.getInstance();
                sb.append((String) JniBridge.jvidispatchOIO(1, j2, nativeHolder2));
                obj = sb.toString();
            } else {
                Log.e("MessagingXmppHandler/validateServerErrorEncData/malformed enc data");
                return 3;
            }
        }
        Log.e(obj);
        return 0;
    }

    public Future A01(AnonymousClass2Qs r6) {
        C34421kE r4 = new C34421kE();
        RunnableRunnableShape2S0300000_I0_2 runnableRunnableShape2S0300000_I0_2 = new RunnableRunnableShape2S0300000_I0_2(this, r6, r4, 4);
        boolean A052 = this.A07.A05(C15910s6.A0x);
        AnonymousClass126 r0 = this.A0O;
        if (A052) {
            Handler handler = r0.A01;
            Message obtain = Message.obtain(handler, runnableRunnableShape2S0300000_I0_2);
            obtain.arg1 = 13;
            handler.sendMessage(obtain);
            return r4;
        }
        r0.A01(runnableRunnableShape2S0300000_I0_2, 13);
        return r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.1s4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: X.1s3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: X.1rv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: X.1rv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: X.1rv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: X.1rv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: X.1rv} */
    /* JADX WARNING: type inference failed for: r0v197, types: [java.util.AbstractCollection] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:247|248|249|250) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:262|263|264|265|266) */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x057b, code lost:
        if (r4 == null) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0581, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        r24.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:123:0x0268, B:132:0x029e] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x0266 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:233:0x056b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:238:0x0570 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:249:0x0580 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:260:0x058c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:265:0x0591 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:249:0x0580=Splitter:B:249:0x0580, B:240:0x0571=Splitter:B:240:0x0571} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:48:0x0151=Splitter:B:48:0x0151, B:265:0x0591=Splitter:B:265:0x0591} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r33 = this;
            r26 = 0
            r32 = r33
            r0 = r32
            X.17E r0 = r0.A0T
            android.os.Handler r0 = r0.A00
            r11 = 7
            android.os.Message r0 = android.os.Message.obtain(r0, r11)
            r0.sendToTarget()
            r0 = r32
            X.1Sc r8 = r0.A0R
            X.1Sn r7 = r8.A06
            java.lang.Object r10 = r7.A0b
            monitor-enter(r10)
            java.util.ArrayList r23 = new java.util.ArrayList     // Catch:{ all -> 0x0592 }
            r23.<init>()     // Catch:{ all -> 0x0592 }
            X.0tq r0 = r7.A0K     // Catch:{ all -> 0x0592 }
            X.0tf r22 = r0.A02()     // Catch:{ all -> 0x0592 }
            r0 = r22
            X.0tg r9 = r0.A02     // Catch:{ all -> 0x058d }
            java.lang.String r6 = "SELECT _id, key_id, from_me, chat_row_id, sender_jid_row_id, timestamp, message_type, revoked_key_id, retry_count, admin_jid_row_id, orphan_message_data  FROM message_orphaned_edit"
            r0 = r26
            android.database.Cursor r5 = r9.A08(r6, r0)     // Catch:{ all -> 0x058d }
            if (r5 != 0) goto L_0x003f
            java.lang.String r0 = "msgstore/resolve-orphaned-edits/cursor-null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0586 }
            java.util.List r23 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0586 }
            goto L_0x0151
        L_0x003f:
            X.11G r0 = r7.A0P     // Catch:{ all -> 0x0586 }
            r0.A0B()     // Catch:{ all -> 0x0586 }
            java.util.concurrent.ConcurrentHashMap r0 = r0.A08     // Catch:{ all -> 0x0586 }
            java.util.Map r21 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x0586 }
            X.0t3 r0 = r7.A01     // Catch:{ all -> 0x0586 }
            long r19 = r0.A00()     // Catch:{ all -> 0x0586 }
            r4 = 0
            r3 = 0
        L_0x0052:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0586 }
            if (r0 == 0) goto L_0x011a
            X.2EB r2 = r7.A00(r5)     // Catch:{ all -> 0x0586 }
            if (r2 == 0) goto L_0x0113
            int r1 = r2.A01     // Catch:{ all -> 0x0586 }
            if (r1 != 0) goto L_0x009d
            java.lang.String r14 = r2.A06     // Catch:{ all -> 0x0586 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0586 }
            if (r0 != 0) goto L_0x0052
            com.whatsapp.jid.UserJid r15 = r2.A04     // Catch:{ all -> 0x0586 }
            if (r15 != 0) goto L_0x0091
            X.1Vw r13 = r2.A05     // Catch:{ all -> 0x0586 }
            long r0 = r2.A02     // Catch:{ all -> 0x0586 }
            X.1rT r12 = new X.1rT     // Catch:{ all -> 0x0586 }
            r12.<init>(r13, r0)     // Catch:{ all -> 0x0586 }
        L_0x0077:
            r12.A01 = r14     // Catch:{ all -> 0x0586 }
            X.0rv r0 = r2.A03     // Catch:{ all -> 0x0586 }
            r12.A0b(r0)     // Catch:{ all -> 0x0586 }
            int r0 = r2.A00     // Catch:{ all -> 0x0586 }
            r12.A0B = r0     // Catch:{ all -> 0x0586 }
            boolean r0 = r13.A02     // Catch:{ all -> 0x0586 }
            if (r0 == 0) goto L_0x0089
            r0 = 1
            r12.A1D = r0     // Catch:{ all -> 0x0586 }
        L_0x0089:
            r1 = 1
            r0 = 0
            r7.A02(r12, r0, r0, r1)     // Catch:{ all -> 0x0586 }
            int r4 = r4 + 1
            goto L_0x0052
        L_0x0091:
            X.1Vw r13 = r2.A05     // Catch:{ all -> 0x0586 }
            long r0 = r2.A02     // Catch:{ all -> 0x0586 }
            X.1s1 r12 = new X.1s1     // Catch:{ all -> 0x0586 }
            r12.<init>(r13, r0)     // Catch:{ all -> 0x0586 }
            r12.A00 = r15     // Catch:{ all -> 0x0586 }
            goto L_0x0077
        L_0x009d:
            r0 = 1
            if (r1 != r0) goto L_0x0052
            long r0 = r2.A02     // Catch:{ all -> 0x0586 }
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            long r13 = r0 + r15
            int r12 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r12 <= 0) goto L_0x0052
            X.0rv r13 = r2.A03     // Catch:{ all -> 0x0586 }
            r12 = r21
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x0586 }
            if (r12 == 0) goto L_0x0052
            X.17g r12 = r7.A0Z     // Catch:{ all -> 0x0586 }
            r27 = r12
            X.1Vw r14 = r2.A05     // Catch:{ all -> 0x0586 }
            X.0rv r12 = r14.A00     // Catch:{ all -> 0x0586 }
            r18 = r12
            X.AnonymousClass00B.A06(r18)     // Catch:{ all -> 0x0586 }
            java.lang.String r12 = r14.A01     // Catch:{ all -> 0x0586 }
            r17 = r12
            java.lang.Long r16 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0586 }
            r14 = 1
            r15 = 0
            if (r18 == 0) goto L_0x00cf
            r15 = 1
        L_0x00cf:
            java.lang.String r12 = "remoteJid must be provided"
            X.AnonymousClass00B.A0C(r12, r15)     // Catch:{ all -> 0x0586 }
            r15 = 0
            if (r17 == 0) goto L_0x00d8
            r15 = 1
        L_0x00d8:
            java.lang.String r12 = "id must be provided"
            X.AnonymousClass00B.A0C(r12, r15)     // Catch:{ all -> 0x0586 }
            r15 = 0
            if (r16 == 0) goto L_0x00e1
            r15 = 1
        L_0x00e1:
            java.lang.String r12 = "timestampMillis must be provided"
            X.AnonymousClass00B.A0C(r12, r15)     // Catch:{ all -> 0x0586 }
            java.lang.String r12 = "fromMe must be provided"
            X.AnonymousClass00B.A0C(r12, r14)     // Catch:{ all -> 0x0586 }
            r31 = 0
            X.1br r12 = new X.1br     // Catch:{ all -> 0x0586 }
            r24 = r12
            r25 = r18
            r28 = r17
            r29 = r0
            r24.<init>(r25, r26, r27, r28, r29, r31)     // Catch:{ all -> 0x0586 }
            X.AnonymousClass00B.A06(r13)     // Catch:{ all -> 0x0586 }
            r12.A08 = r13     // Catch:{ all -> 0x0586 }
            r12.A01 = r11     // Catch:{ all -> 0x0586 }
            int r0 = r2.A00     // Catch:{ all -> 0x0586 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0586 }
            r12.A0J = r0     // Catch:{ all -> 0x0586 }
            r0 = r23
            r0.add(r12)     // Catch:{ all -> 0x0586 }
            int r3 = r3 + 1
            goto L_0x0052
        L_0x0113:
            java.lang.String r0 = "msgstore/edit/resolve-orphaned-edits error reading orphaned message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0586 }
            goto L_0x0052
        L_0x011a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0586 }
            r1.<init>()     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = "msgstore/edit/resolve-orphaned-edits orphaned="
            r1.append(r0)     // Catch:{ all -> 0x0586 }
            r1.append(r4)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = " delayed="
            r1.append(r0)     // Catch:{ all -> 0x0586 }
            r1.append(r3)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0586 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0586 }
            java.lang.String r4 = "message_orphaned_edit"
            java.lang.String r3 = "message_type IN ( ?, ? )"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0586 }
            r1 = 0
            java.lang.String r0 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0586 }
            r2[r1] = r0     // Catch:{ all -> 0x0586 }
            r1 = 1
            java.lang.String r0 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0586 }
            r2[r1] = r0     // Catch:{ all -> 0x0586 }
            r9.A01(r4, r3, r2)     // Catch:{ all -> 0x0586 }
            r5.close()     // Catch:{ all -> 0x058d }
        L_0x0151:
            r22.close()     // Catch:{ all -> 0x0592 }
            monitor-exit(r10)     // Catch:{ all -> 0x0592 }
            X.0pd r2 = r8.A0I
            r1 = 2189(0x88d, float:3.067E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x026f
            X.0tq r0 = r8.A0D
            X.0tf r9 = r0.A02()
            X.0tg r5 = r9.A02     // Catch:{ all -> 0x0267 }
            r0 = r26
            android.database.Cursor r6 = r5.A08(r6, r0)     // Catch:{ all -> 0x0267 }
            r6.getCount()     // Catch:{ all -> 0x0260 }
        L_0x0172:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0260 }
            r10 = 2
            r4 = 0
            if (r0 == 0) goto L_0x024c
            X.2EB r3 = r7.A00(r6)     // Catch:{ all -> 0x0260 }
            if (r3 == 0) goto L_0x0172
            int r0 = r3.A01     // Catch:{ all -> 0x0260 }
            if (r0 != r10) goto L_0x0172
            byte[] r0 = r3.A07     // Catch:{ 1bD -> 0x0244 }
            X.1iD r2 = X.C33211iD.A0U(r0)     // Catch:{ 1bD -> 0x0244 }
            int r1 = r2.A01     // Catch:{ 1bD -> 0x0244 }
            r0 = 8192(0x2000, float:1.14794E-41)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x023d
            X.2en r0 = r2.A0G     // Catch:{ 1bD -> 0x0244 }
            if (r0 != 0) goto L_0x0197
            X.2en r0 = X.C52992en.A02     // Catch:{ 1bD -> 0x0244 }
        L_0x0197:
            X.1iD r0 = r0.A01     // Catch:{ 1bD -> 0x0244 }
            if (r0 != 0) goto L_0x019d
            X.1iD r0 = X.C33211iD.A0o     // Catch:{ 1bD -> 0x0244 }
        L_0x019d:
            X.2eo r10 = r0.A0b     // Catch:{ 1bD -> 0x0244 }
            if (r10 != 0) goto L_0x01a3
            X.2eo r10 = X.C53002eo.A0F     // Catch:{ 1bD -> 0x0244 }
        L_0x01a3:
            X.1iD r12 = r10.A0D     // Catch:{ 1bD -> 0x0244 }
            if (r12 != 0) goto L_0x01a9
            X.1iD r12 = X.C33211iD.A0o     // Catch:{ 1bD -> 0x0244 }
        L_0x01a9:
            int r2 = r12.A00     // Catch:{ 1bD -> 0x0244 }
            r1 = 1
            r0 = r2 & 1
            if (r0 != r1) goto L_0x01ef
            X.1Vw r13 = r3.A05     // Catch:{ 1bD -> 0x0244 }
            long r0 = r3.A02     // Catch:{ 1bD -> 0x0244 }
            java.lang.String r11 = r12.A0n     // Catch:{ 1bD -> 0x0244 }
            X.1cc r2 = new X.1cc     // Catch:{ 1bD -> 0x0244 }
            r2.<init>(r13, r0)     // Catch:{ 1bD -> 0x0244 }
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r0, r11)     // Catch:{ 1bD -> 0x0244 }
            r2.A0k(r0)     // Catch:{ 1bD -> 0x0244 }
        L_0x01c4:
            r0 = 131072(0x20000, float:1.83671E-40)
            r2.A0S(r0)     // Catch:{ 1bD -> 0x0244 }
            X.1Vw r0 = r2.A11     // Catch:{ 1bD -> 0x0244 }
            X.0rv r11 = r0.A00     // Catch:{ 1bD -> 0x0244 }
            boolean r1 = r0.A02     // Catch:{ 1bD -> 0x0244 }
            X.1iF r0 = r10.A0E     // Catch:{ 1bD -> 0x0244 }
            if (r0 != 0) goto L_0x01d5
            X.1iF r0 = X.C33231iF.A05     // Catch:{ 1bD -> 0x0244 }
        L_0x01d5:
            java.lang.String r0 = r0.A01     // Catch:{ 1bD -> 0x0244 }
            X.1Vw r12 = new X.1Vw     // Catch:{ 1bD -> 0x0244 }
            r12.<init>(r11, r0, r1)     // Catch:{ 1bD -> 0x0244 }
            long r13 = r2.A0I     // Catch:{ 1bD -> 0x0244 }
            long r0 = r10.A04     // Catch:{ 1bD -> 0x0244 }
            X.1sC r11 = new X.1sC     // Catch:{ 1bD -> 0x0244 }
            r15 = r0
            r11.<init>(r12, r13, r15)     // Catch:{ 1bD -> 0x0244 }
            r2.A0g(r11)     // Catch:{ 1bD -> 0x0244 }
            X.0rv r0 = r3.A03     // Catch:{ 1bD -> 0x0244 }
            r2.A0b(r0)     // Catch:{ 1bD -> 0x0244 }
            goto L_0x022a
        L_0x01ef:
            r1 = 32
            r0 = r2 & 32
            if (r0 != r1) goto L_0x0236
            X.2ep r13 = r12.A0E     // Catch:{ 1bD -> 0x0244 }
            if (r13 != 0) goto L_0x01fb
            X.2ep r13 = X.C53012ep.A0P     // Catch:{ 1bD -> 0x0244 }
        L_0x01fb:
            int r1 = r13.A01     // Catch:{ 1bD -> 0x0244 }
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == r0) goto L_0x022f
            boolean r0 = r13.A0O     // Catch:{ 1bD -> 0x0244 }
            if (r0 != 0) goto L_0x022f
            X.1Vw r11 = r3.A05     // Catch:{ 1bD -> 0x0244 }
            long r0 = r3.A02     // Catch:{ 1bD -> 0x0244 }
            X.1cc r2 = new X.1cc     // Catch:{ 1bD -> 0x0244 }
            r2.<init>(r11, r0)     // Catch:{ 1bD -> 0x0244 }
            r2.A15(r13)     // Catch:{ 1bD -> 0x0244 }
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            X.2ep r0 = r12.A0E     // Catch:{ 1bD -> 0x0244 }
            if (r0 != 0) goto L_0x021a
            X.2ep r0 = X.C53012ep.A0P     // Catch:{ 1bD -> 0x0244 }
        L_0x021a:
            X.21S r0 = r0.A0F     // Catch:{ 1bD -> 0x0244 }
            if (r0 != 0) goto L_0x0220
            X.21S r0 = X.AnonymousClass21S.A0R     // Catch:{ 1bD -> 0x0244 }
        L_0x0220:
            X.1XE r0 = r0.A09     // Catch:{ 1bD -> 0x0244 }
            java.util.List r0 = X.C16030sJ.A08(r1, r0)     // Catch:{ 1bD -> 0x0244 }
            r2.A0u(r0)     // Catch:{ 1bD -> 0x0244 }
            goto L_0x01c4
        L_0x022a:
            r8.A01(r2, r4)     // Catch:{ all -> 0x0260 }
            goto L_0x0172
        L_0x022f:
            java.lang.String r0 = "EditedMessageManager/getMessageAddOnFromOrphan/Invalid edited message - is view once message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1bD -> 0x0244 }
            goto L_0x0172
        L_0x0236:
            java.lang.String r0 = "EditedMessageManager/getMessageAddOnFromOrphan invalid edited orphan message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1bD -> 0x0244 }
            goto L_0x0172
        L_0x023d:
            java.lang.String r0 = "EditedMessageManager/getMessageAddOnFromOrphan/Invalid edited orphan message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1bD -> 0x0244 }
            goto L_0x0172
        L_0x0244:
            r1 = move-exception
            java.lang.String r0 = "EditedMessageManager/getMessageAddOnFromOrphan/Failed to parse orphan message"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0260 }
            goto L_0x0172
        L_0x024c:
            java.lang.String r3 = "message_orphaned_edit"
            java.lang.String r2 = "message_type = ? "
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = java.lang.Integer.toString(r10)     // Catch:{ all -> 0x0260 }
            r1[r4] = r0     // Catch:{ all -> 0x0260 }
            r5.A01(r3, r2, r1)     // Catch:{ all -> 0x0260 }
            r6.close()     // Catch:{ all -> 0x0267 }
            goto L_0x026c
        L_0x0260:
            r0 = move-exception
            if (r6 == 0) goto L_0x0266
            r6.close()     // Catch:{ all -> 0x0266 }
        L_0x0266:
            throw r0     // Catch:{ all -> 0x0267 }
        L_0x0267:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0585 }
            throw r0
        L_0x026c:
            r9.close()
        L_0x026f:
            java.util.Iterator r2 = r23.iterator()
        L_0x0273:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0285
            java.lang.Object r1 = r2.next()
            X.1br r1 = (X.C30161br) r1
            r0 = r32
            r0.A07(r1)
            goto L_0x0273
        L_0x0285:
            r0 = r32
            X.15G r6 = r0.A0a
            java.lang.String r0 = "MessageAddOnManager/resolveOrphanedMessageAddOns"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashSet r25 = new java.util.HashSet
            r25.<init>()
            X.0tq r0 = r6.A0B
            X.0tf r24 = r0.get()
            X.1QN r0 = r6.A0D     // Catch:{ all -> 0x0581 }
            r32 = r0
            r0 = r24
            X.0tg r2 = r0.A02     // Catch:{ all -> 0x0581 }
            java.lang.String r1 = X.AnonymousClass23Q.A02     // Catch:{ all -> 0x0581 }
            r0 = r26
            android.database.Cursor r4 = r2.A08(r1, r0)     // Catch:{ all -> 0x0581 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x057a }
            r7.<init>()     // Catch:{ all -> 0x057a }
            java.lang.String[] r0 = X.C53022eq.A01     // Catch:{ all -> 0x057a }
            X.C33931jQ.A03(r4, r7, r0)     // Catch:{ all -> 0x057a }
            java.lang.String r0 = "_id"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x057a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x057a }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x057a }
            int r23 = r0.intValue()     // Catch:{ all -> 0x057a }
            java.lang.String r0 = "parent_from_me"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x057a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x057a }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x057a }
            int r22 = r0.intValue()     // Catch:{ all -> 0x057a }
            java.lang.String r0 = "parent_key_id"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x057a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x057a }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x057a }
            int r21 = r0.intValue()     // Catch:{ all -> 0x057a }
            java.lang.String r0 = "parent_chat_row_id"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x057a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x057a }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x057a }
            int r20 = r0.intValue()     // Catch:{ all -> 0x057a }
            java.lang.String r0 = "parent_sender_jid_row_id"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x057a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x057a }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x057a }
            int r19 = r0.intValue()     // Catch:{ all -> 0x057a }
        L_0x0303:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x057a }
            if (r0 == 0) goto L_0x04e0
            r0 = r23
            long r16 = r4.getLong(r0)     // Catch:{ all -> 0x057a }
            r0 = r20
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x057a }
            X.0ts r2 = r6.A05     // Catch:{ all -> 0x057a }
            long r0 = (long) r0     // Catch:{ all -> 0x057a }
            X.0rv r9 = r2.A05(r0)     // Catch:{ all -> 0x0578 }
            r0 = r22
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0578 }
            r10 = 1
            if (r0 == r10) goto L_0x0326
            r10 = 0
        L_0x0326:
            r0 = r21
            java.lang.String r3 = r4.getString(r0)     // Catch:{ all -> 0x0578 }
            r0 = r19
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0578 }
            X.14v r8 = r6.A09     // Catch:{ all -> 0x0578 }
            java.lang.Class<X.0rv> r2 = X.C15830rv.class
            long r0 = (long) r0     // Catch:{ all -> 0x0578 }
            com.whatsapp.jid.Jid r18 = r8.A07(r2, r0)     // Catch:{ all -> 0x0578 }
            r0 = r18
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x0578 }
            r18 = r0
            if (r9 != 0) goto L_0x0362
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0578 }
            r2.<init>()     // Catch:{ all -> 0x0578 }
            java.lang.String r0 = "MessageAddOnManager/resolveOrphanedMessageAddOns ignoring orphanId="
            r2.append(r0)     // Catch:{ all -> 0x0578 }
            r0 = r16
            r2.append(r0)     // Catch:{ all -> 0x0578 }
            java.lang.String r0 = " id="
            r2.append(r0)     // Catch:{ all -> 0x0578 }
            r2.append(r3)     // Catch:{ all -> 0x0578 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0578 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0578 }
            goto L_0x0303
        L_0x0362:
            X.1Vw r8 = new X.1Vw     // Catch:{ all -> 0x0578 }
            r8.<init>(r9, r3, r10)     // Catch:{ all -> 0x0578 }
            boolean r0 = r5.contains(r8)     // Catch:{ all -> 0x0578 }
            if (r0 != 0) goto L_0x0303
            X.0t6 r0 = r6.A07     // Catch:{ all -> 0x0578 }
            X.0th r0 = r0.A0K     // Catch:{ all -> 0x0578 }
            X.0tZ r3 = r0.A03(r8)     // Catch:{ all -> 0x0578 }
            if (r3 != 0) goto L_0x037b
            r5.add(r8)     // Catch:{ all -> 0x0578 }
            goto L_0x0303
        L_0x037b:
            X.17o r9 = r6.A0A     // Catch:{ all -> 0x0578 }
            long r0 = r3.A13     // Catch:{ all -> 0x0578 }
            byte[] r9 = r9.A01(r0)     // Catch:{ all -> 0x0578 }
            java.lang.String r0 = "chat_row_id"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x0578 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0578 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0578 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x0578 }
            java.lang.String r0 = "from_me"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x0578 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0578 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0578 }
            int r14 = r0.intValue()     // Catch:{ all -> 0x0578 }
            java.lang.String r0 = "key_id"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x0578 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0578 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0578 }
            int r11 = r0.intValue()     // Catch:{ all -> 0x0578 }
            java.lang.String r0 = "sender_jid_row_id"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x0578 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0578 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0578 }
            int r13 = r0.intValue()     // Catch:{ all -> 0x0578 }
            java.lang.String r0 = "timestamp"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x0578 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0578 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0578 }
            int r12 = r0.intValue()     // Catch:{ all -> 0x0578 }
            java.lang.String r0 = "orphan_message_data"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x0578 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0578 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0578 }
            int r10 = r0.intValue()     // Catch:{ all -> 0x0578 }
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x0578 }
            r0 = r32
            X.0ts r15 = r0.A01     // Catch:{ all -> 0x0578 }
            long r0 = (long) r1     // Catch:{ all -> 0x0578 }
            X.0rv r1 = r15.A05(r0)     // Catch:{ all -> 0x0578 }
            int r0 = r4.getInt(r14)     // Catch:{ all -> 0x0578 }
            r14 = 1
            if (r0 == r14) goto L_0x03f4
            r14 = 0
        L_0x03f4:
            java.lang.String r0 = r4.getString(r11)     // Catch:{ all -> 0x0578 }
            X.1Vw r11 = new X.1Vw     // Catch:{ all -> 0x0578 }
            r11.<init>(r1, r0, r14)     // Catch:{ all -> 0x0578 }
            int r1 = r4.getInt(r13)     // Catch:{ all -> 0x0578 }
            r0 = -1
            if (r1 == r0) goto L_0x0418
            r0 = r32
            X.14v r13 = r0.A02     // Catch:{ all -> 0x0578 }
            long r0 = (long) r1     // Catch:{ all -> 0x0578 }
            com.whatsapp.jid.Jid r13 = r13.A07(r2, r0)     // Catch:{ all -> 0x0578 }
            X.0rv r13 = (X.C15830rv) r13     // Catch:{ all -> 0x0578 }
        L_0x040f:
            long r1 = r4.getLong(r12)     // Catch:{ all -> 0x0578 }
            byte[] r0 = r4.getBlob(r10)     // Catch:{ all -> 0x0578 }
            goto L_0x041a
        L_0x0418:
            r13 = 0
            goto L_0x040f
        L_0x041a:
            X.1iD r10 = X.C33211iD.A0U(r0)     // Catch:{ 1bD -> 0x04d8 }
            boolean r0 = X.AnonymousClass23W.A02(r10)     // Catch:{ all -> 0x0578 }
            if (r0 != 0) goto L_0x042b
            java.lang.String r0 = "MessageAddOnOrphanStore/getMessageAddOnFromOrphan orphan message is not messageAddOn"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0578 }
            goto L_0x0303
        L_0x042b:
            int r14 = r10.A01     // Catch:{ all -> 0x0578 }
            r12 = 16
            r0 = r14 & 16
            if (r0 != r12) goto L_0x0467
            X.2eu r9 = r10.A0c     // Catch:{ all -> 0x0578 }
            if (r9 != 0) goto L_0x0439
            X.2eu r9 = X.C53052eu.A05     // Catch:{ all -> 0x0578 }
        L_0x0439:
            X.AnonymousClass00B.A06(r9)     // Catch:{ all -> 0x0578 }
            X.1iF r0 = r9.A02     // Catch:{ all -> 0x0578 }
            if (r0 != 0) goto L_0x0442
            X.1iF r0 = X.C33231iF.A05     // Catch:{ all -> 0x0578 }
        L_0x0442:
            X.1rv r10 = new X.1rv     // Catch:{ all -> 0x0578 }
            r30 = r1
            r26 = r10
            r27 = r9
            r28 = r0
            r29 = r11
            r26.<init>(r27, r28, r29, r30)     // Catch:{ all -> 0x0578 }
            r10.A0b(r13)     // Catch:{ all -> 0x0578 }
            X.23X r1 = new X.23X     // Catch:{ all -> 0x0578 }
            r0 = r18
            r1.<init>(r0, r8)     // Catch:{ all -> 0x0578 }
            r10.A02 = r1     // Catch:{ all -> 0x0578 }
        L_0x045d:
            boolean r0 = r3 instanceof X.C38791rQ     // Catch:{ all -> 0x0578 }
            if (r0 == 0) goto L_0x04bf
            boolean r0 = r10 instanceof X.C39181s3     // Catch:{ all -> 0x0578 }
            if (r0 == 0) goto L_0x04bf
            goto L_0x0303
        L_0x0467:
            r12 = 128(0x80, float:1.794E-43)
            r0 = r14 & r12
            if (r0 != r12) goto L_0x0498
            X.2ex r0 = r10.A0Z     // Catch:{ all -> 0x0578 }
            r12 = r0
            if (r0 != 0) goto L_0x0474
            X.2ex r0 = X.C53082ex.A05     // Catch:{ all -> 0x0578 }
        L_0x0474:
            int r0 = r0.A00     // Catch:{ all -> 0x0578 }
            r15 = 2
            r0 = r0 & 2
            if (r0 != r15) goto L_0x0498
            if (r12 != 0) goto L_0x047f
            X.2ex r12 = X.C53082ex.A05     // Catch:{ all -> 0x0578 }
        L_0x047f:
            X.AnonymousClass00B.A06(r12)     // Catch:{ all -> 0x0578 }
            X.1s3 r10 = new X.1s3     // Catch:{ 23S -> 0x0303 }
            r10.<init>(r12, r11, r1)     // Catch:{ 23S -> 0x0303 }
            r10.A0b(r13)     // Catch:{ all -> 0x0578 }
            X.23X r1 = new X.23X     // Catch:{ all -> 0x0578 }
            r0 = r18
            r1.<init>(r0, r8)     // Catch:{ all -> 0x0578 }
            r10.A02 = r1     // Catch:{ all -> 0x0578 }
            if (r9 == 0) goto L_0x045d
            r10.A1F = r9     // Catch:{ all -> 0x0578 }
            goto L_0x045d
        L_0x0498:
            r0 = 256(0x100, float:3.59E-43)
            r14 = r14 & r0
            if (r14 != r0) goto L_0x0303
            r0 = r32
            X.0pd r0 = r0.A04     // Catch:{ all -> 0x0578 }
            boolean r0 = X.C34321k4.A03(r0)     // Catch:{ all -> 0x0578 }
            if (r0 == 0) goto L_0x0303
            X.2Q2 r0 = r10.A0Q     // Catch:{ all -> 0x0578 }
            if (r0 != 0) goto L_0x04ad
            X.2Q2 r0 = X.AnonymousClass2Q2.A04     // Catch:{ all -> 0x0578 }
        L_0x04ad:
            X.1s4 r10 = new X.1s4     // Catch:{ all -> 0x0578 }
            r10.<init>(r0, r11, r1)     // Catch:{ all -> 0x0578 }
            r10.A0b(r13)     // Catch:{ all -> 0x0578 }
            X.23X r1 = new X.23X     // Catch:{ all -> 0x0578 }
            r0 = r18
            r1.<init>(r0, r8)     // Catch:{ all -> 0x0578 }
            r10.A02 = r1     // Catch:{ all -> 0x0578 }
            goto L_0x045d
        L_0x04bf:
            r0 = 0
            int r1 = r6.A01(r10, r0)     // Catch:{ all -> 0x0578 }
            boolean r0 = X.AnonymousClass23W.A01(r1)     // Catch:{ all -> 0x0578 }
            if (r0 != 0) goto L_0x04cd
            r0 = 5
            if (r1 != r0) goto L_0x0303
        L_0x04cd:
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0578 }
            r0 = r25
            r0.add(r1)     // Catch:{ all -> 0x0578 }
            goto L_0x0303
        L_0x04d8:
            r1 = move-exception
            java.lang.String r0 = "MessageAddOnOrphanStore/getMessageAddOnFromOrphan failed to parse orphan message"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0578 }
            goto L_0x0303
        L_0x04e0:
            boolean r0 = r25.isEmpty()     // Catch:{ all -> 0x0578 }
            if (r0 != 0) goto L_0x0571
            java.lang.String r0 = "MessageAddOnManager/deleteMessageAddOnOrphans count = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0578 }
            r1.<init>(r0)     // Catch:{ all -> 0x0578 }
            int r0 = r25.size()     // Catch:{ all -> 0x0578 }
            r1.append(r0)     // Catch:{ all -> 0x0578 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0578 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0578 }
            int r0 = r25.size()     // Catch:{ all -> 0x0578 }
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0578 }
            java.util.Iterator r6 = r25.iterator()     // Catch:{ all -> 0x0578 }
            r5 = 0
        L_0x0506:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0578 }
            if (r0 == 0) goto L_0x0520
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x0578 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0578 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x0578 }
            int r1 = r5 + 1
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0578 }
            r8[r5] = r0     // Catch:{ all -> 0x0578 }
            r5 = r1
            goto L_0x0506
        L_0x0520:
            r0 = r32
            X.0tq r0 = r0.A03     // Catch:{ all -> 0x0578 }
            X.0tf r7 = r0.A02()     // Catch:{ all -> 0x0578 }
            X.1cj r6 = r7.A00()     // Catch:{ all -> 0x056c }
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r5 = new X.1jh     // Catch:{ all -> 0x0567 }
            r5.<init>(r8, r0)     // Catch:{ all -> 0x0567 }
        L_0x0533:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x055d
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x0567 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x0567 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0567 }
            r1.<init>()     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "_id IN "
            r1.append(r0)     // Catch:{ all -> 0x0567 }
            int r0 = r3.length     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = X.C34111ji.A00(r0)     // Catch:{ all -> 0x0567 }
            r1.append(r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0567 }
            X.0tg r1 = r7.A02     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "message_add_on_orphan"
            r1.A01(r0, r2, r3)     // Catch:{ all -> 0x0567 }
            goto L_0x0533
        L_0x055d:
            r6.A00()     // Catch:{ all -> 0x0567 }
            r6.close()     // Catch:{ all -> 0x056c }
            r7.close()     // Catch:{ all -> 0x0578 }
            goto L_0x0571
        L_0x0567:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x056b }
        L_0x056b:
            throw r0     // Catch:{ all -> 0x056c }
        L_0x056c:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0570 }
        L_0x0570:
            throw r0     // Catch:{ all -> 0x0578 }
        L_0x0571:
            r4.close()     // Catch:{ all -> 0x0581 }
            r24.close()
            return
        L_0x0578:
            r0 = move-exception
            goto L_0x057d
        L_0x057a:
            r0 = move-exception
            if (r4 == 0) goto L_0x0580
        L_0x057d:
            r4.close()     // Catch:{ all -> 0x0580 }
        L_0x0580:
            throw r0     // Catch:{ all -> 0x0581 }
        L_0x0581:
            r0 = move-exception
            r24.close()     // Catch:{ all -> 0x0585 }
        L_0x0585:
            throw r0
        L_0x0586:
            r0 = move-exception
            if (r5 == 0) goto L_0x058c
            r5.close()     // Catch:{ all -> 0x058c }
        L_0x058c:
            throw r0     // Catch:{ all -> 0x058d }
        L_0x058d:
            r0 = move-exception
            r22.close()     // Catch:{ all -> 0x0591 }
        L_0x0591:
            throw r0     // Catch:{ all -> 0x0592 }
        L_0x0592:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0592 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27601Sk.A02():void");
    }

    public final void A03(C15830rv r10, Jid jid, UserJid userJid, C16730tY r13, String str, int i2, boolean z2, boolean z3) {
        C16750ta r0;
        if (z2) {
            C16040sK r1 = this.A03;
            r1.A0B();
            if (r1.A05 != null) {
                Jid jid2 = jid;
                if (r1.A0J(DeviceJid.of(jid))) {
                    C16730tY r4 = r13;
                    if (r13 == null || !((r0 = r13.A02) == null || r0.A0U == null)) {
                        this.A0p.A01(r10, jid2, userJid, r4, str, (String) null, i2, z3);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0218 */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0185 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass2Qs r41, long r42) {
        /*
            r40 = this;
            r5 = r40
            X.126 r0 = r5.A0O
            r0.A00()
            r39 = r41
            X.1ci r4 = r39.Ag0()
            X.11o r3 = r5.A10
            if (r4 == 0) goto L_0x033a
            long r1 = r4.A00
        L_0x0013:
            r0 = 1
            X.1d2 r3 = r3.A00(r0, r1)
            X.2em r3 = (X.C52982em) r3
            if (r3 == 0) goto L_0x0020
            r0 = 3
            r3.A00(r0)
        L_0x0020:
            java.util.ArrayList r24 = new java.util.ArrayList
            r24.<init>()
            java.util.HashSet r23 = new java.util.HashSet
            r23.<init>()
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            java.util.HashSet r21 = new java.util.HashSet
            r21.<init>()
            java.util.HashMap r20 = new java.util.HashMap
            r20.<init>()
            if (r4 == 0) goto L_0x0337
            com.whatsapp.jid.UserJid r15 = r4.A03
        L_0x003d:
            boolean r19 = r39.AJK()
            r1 = 0
            X.1Zf r18 = new X.1Zf
            r0 = r18
            r0.<init>((boolean) r1)
            r18.A03()
            int r8 = r39.size()
            if (r3 == 0) goto L_0x0055
            long r0 = (long) r8
            r3.A01 = r0
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 >= r8) goto L_0x0098
            long r6 = r18.A00()
            int r0 = (r6 > r42 ? 1 : (r6 == r42 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e6
            if (r3 == 0) goto L_0x0065
            long r0 = (long) r2
            r3.A00 = r0
        L_0x0065:
            java.lang.String r0 = "messagingXmppHandler/onMessageStatusUpdate: processed "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r2)
            java.lang.String r0 = " items in "
            r6.append(r0)
            long r0 = r18.A00()
            r6.append(r0)
            java.lang.String r0 = " msec.  Requeuing "
            r6.append(r0)
            int r0 = r8 - r2
            r6.append(r0)
            java.lang.String r0 = " items."
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0xb r1 = r5.A09
            r0 = r39
            r0.Ad5(r1, r2)
        L_0x0098:
            if (r2 < r8) goto L_0x009f
            if (r3 == 0) goto L_0x009f
            long r0 = (long) r8
            r3.A00 = r0
        L_0x009f:
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x00ac
            X.1HK r1 = r5.A0W
            r0 = r24
            r1.A02(r0)
        L_0x00ac:
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x0343
            X.1Sj r8 = r5.A0b
            X.15G r2 = r8.A0A
            r1 = r23
            r0 = r20
            r2.A0A(r0, r1)
            java.util.Set r0 = r20.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x00c5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x033e
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            X.0pj r6 = r8.A0F
            java.lang.Object r3 = r0.getKey()
            android.os.Handler r2 = r6.A01()
            r1 = 9
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r6, r1, r3)
            r2.post(r0)
            goto L_0x00c5
        L_0x00e6:
            r0 = r39
            com.whatsapp.jid.DeviceJid r26 = r0.AaF(r2)
            long r30 = r0.Agl(r2)
            X.1Vw r7 = r0.AK2(r2)
            com.whatsapp.jid.Jid r6 = r39.Abp()
            X.0rv r1 = r7.A00
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 != 0) goto L_0x0116
            boolean r0 = X.C16030sJ.A0Q(r1)
            if (r0 != 0) goto L_0x0116
            boolean r0 = X.C16030sJ.A0G(r1)
            if (r0 != 0) goto L_0x0116
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0331
            boolean r0 = X.C16030sJ.A0H(r6)
            if (r0 == 0) goto L_0x0331
        L_0x0116:
            int r0 = r39.AgJ()
            X.0t6 r1 = r5.A0Q
            X.0th r1 = r1.A0K
            X.0tZ r6 = r1.A03(r7)
            if (r6 != 0) goto L_0x0240
            X.15G r6 = r5.A0a
            X.1qx r6 = r6.A05(r7)
            if (r6 != 0) goto L_0x0240
            X.0rv r11 = r7.A00
            r9 = 0
            java.lang.String r10 = r7.A01
            X.1Vw r6 = new X.1Vw
            r6.<init>(r11, r10, r9)
            X.0tZ r6 = r1.A03(r6)
            if (r6 != 0) goto L_0x0240
            java.lang.String r6 = "msgstore/updatetargetstatus/nosuchmessage: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
            boolean r1 = X.C42881yp.A01(r0)
            if (r1 == 0) goto L_0x0180
            X.14w r9 = r5.A0X
            X.AnonymousClass00B.A06(r26)
            X.2Bz r6 = new X.2Bz
            r32 = r6
            r33 = r26
            r34 = r15
            r35 = r0
            r36 = r30
            r32.<init>(r33, r34, r35, r36)
            long r0 = r6.A01
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x0189
            java.lang.String r7 = "orphanedreceiptstore/addorphanedreceiptsformessage/invalid timestamp: "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0180:
            if (r3 == 0) goto L_0x0185
            r0 = 1
            r3.A02 = r0
        L_0x0185:
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0189:
            java.lang.String r12 = "orphanedreceiptstore/addorphanedreceiptsformessage/key:"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            r13.append(r7)
            java.lang.String r12 = ";receipt:"
            r13.append(r12)
            r13.append(r6)
            java.lang.String r12 = r13.toString()
            com.whatsapp.util.Log.i((java.lang.String) r12)
            r13 = 6
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>(r13)
            X.0ts r13 = r9.A01
            X.AnonymousClass00B.A06(r11)
            long r13 = r13.A02(r11)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            java.lang.String r11 = "chat_row_id"
            r12.put(r11, r13)
            java.lang.String r11 = "key_id"
            r12.put(r11, r10)
            boolean r10 = r7.A02
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.String r10 = "from_me"
            r12.put(r10, r11)
            X.14v r13 = r9.A02
            com.whatsapp.jid.DeviceJid r11 = r6.A02
            long r16 = r13.A01(r11)
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            java.lang.String r10 = "receipt_device_jid_row_id"
            r12.put(r10, r14)
            com.whatsapp.jid.UserJid r10 = r6.A03
            if (r10 == 0) goto L_0x01ec
            long r13 = r13.A01(r10)
            java.lang.Long r14 = java.lang.Long.valueOf(r13)
            java.lang.String r13 = "receipt_recipient_jid_row_id"
            r12.put(r13, r14)
        L_0x01ec:
            int r14 = r6.A00
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            java.lang.String r6 = "status"
            r12.put(r6, r13)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r12.put(r0, r1)
            X.0tq r0 = r9.A03     // Catch:{ SQLiteConstraintException -> 0x0219 }
            X.0tf r1 = r0.A02()     // Catch:{ SQLiteConstraintException -> 0x0219 }
            X.0tg r6 = r1.A02     // Catch:{ all -> 0x0214 }
            java.lang.String r0 = "receipt_orphaned"
            r6.A03(r12, r0)     // Catch:{ all -> 0x0214 }
            r1.close()     // Catch:{ SQLiteConstraintException -> 0x0219 }
            goto L_0x0180
        L_0x0214:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0218 }
        L_0x0218:
            throw r0     // Catch:{ SQLiteConstraintException -> 0x0219 }
        L_0x0219:
            java.lang.String r0 = "orphanedreceiptstore/addorphanedreceiptsformessage/failed "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r11)
            r1.append(r0)
            r1.append(r10)
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0180
        L_0x0240:
            if (r15 == 0) goto L_0x027f
            X.1Vw r1 = r6.A11
            X.0rv r1 = r1.A00
            boolean r1 = X.C16030sJ.A0L(r1)
            if (r1 == 0) goto L_0x027f
            X.0rv r1 = r6.A0B()
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x027f
            java.lang.String r1 = "messagingXmppHandler/onMessageStatusUpdate: invalid message update. StanzaKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r7 = r5.A01
            java.lang.String r1 = "StanzaKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r6 = r0.toString()
            java.lang.String r1 = "invalid_message_status_update"
            r0 = 0
            r7.AcB(r1, r6, r0)
            goto L_0x0185
        L_0x027f:
            boolean r1 = r6 instanceof X.C38541qx
            r9 = 17
            if (r1 == 0) goto L_0x02e6
            if (r0 != r9) goto L_0x02d0
            X.1Vw r1 = r6.A11
            r0 = r23
            r0.add(r1)
            X.0rv r7 = r1.A00
            r0 = r20
            java.lang.Object r10 = r0.get(r7)
            java.lang.Number r10 = (java.lang.Number) r10
            if (r10 == 0) goto L_0x02a4
            long r12 = r10.longValue()
            long r0 = r6.A13
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x02aa
        L_0x02a4:
            long r0 = r6.A13
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
        L_0x02aa:
            byte r0 = r6.A10
            java.util.List r1 = X.AnonymousClass15G.A0M
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0185
            r0 = r6
            X.1qx r0 = (X.C38541qx) r0
            X.1Vw r1 = r0.A12()
            int r0 = r6.A0C
            if (r0 == r9) goto L_0x0185
            if (r1 == 0) goto L_0x0185
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0185
            r0 = r20
            r0.put(r7, r10)
            goto L_0x0185
        L_0x02d0:
            r1 = 15
            if (r0 == r1) goto L_0x02d7
            r1 = 5
            if (r0 != r1) goto L_0x0185
        L_0x02d7:
            X.1ta r28 = r39.AbY()
            r25 = r5
            r27 = r6
            r29 = r0
            r25.A08(r26, r27, r28, r29, r30)
            goto L_0x0185
        L_0x02e6:
            if (r0 != r9) goto L_0x0302
            X.0z0 r1 = r5.A0w
            boolean r1 = r1.A02(r6)
            if (r1 == 0) goto L_0x031c
            r1 = r22
            r1.add(r6)
        L_0x02f5:
            boolean r0 = X.AnonymousClass1HK.A00(r7, r0)
            if (r0 == 0) goto L_0x0185
            r0 = r24
            r0.add(r7)
            goto L_0x0185
        L_0x0302:
            r1 = 18
            if (r0 != r1) goto L_0x031c
            X.1ta r28 = r39.AbY()
            r29 = 8
            r25 = r5
            r27 = r6
            boolean r1 = r25.A08(r26, r27, r28, r29, r30)
            if (r1 == 0) goto L_0x0185
            r1 = r21
            r1.add(r6)
            goto L_0x02f5
        L_0x031c:
            X.1ta r35 = r39.AbY()
            r32 = r5
            r33 = r26
            r34 = r6
            r36 = r0
            r37 = r30
            boolean r1 = r32.A08(r33, r34, r35, r36, r37)
            if (r1 == 0) goto L_0x0185
            goto L_0x02f5
        L_0x0331:
            com.whatsapp.jid.DeviceJid r26 = com.whatsapp.jid.DeviceJid.of(r6)
            goto L_0x0116
        L_0x0337:
            r15 = 0
            goto L_0x003d
        L_0x033a:
            r1 = 0
            goto L_0x0013
        L_0x033e:
            X.0pj r0 = r8.A0F
            r0.A08()
        L_0x0343:
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x0350
            X.17f r1 = r5.A0x
            r0 = r22
            r1.A09(r0)
        L_0x0350:
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x035e
            X.124 r2 = r5.A0y
            r1 = 1
            r0 = r21
            r2.A05(r0, r1)
        L_0x035e:
            r18.A01()
            if (r4 == 0) goto L_0x0377
            if (r19 == 0) goto L_0x0372
            X.17L r1 = r5.A0v
            monitor-enter(r1)
            java.util.List r0 = r1.A02     // Catch:{ all -> 0x036f }
            r0.add(r4)     // Catch:{ all -> 0x036f }
            monitor-exit(r1)     // Catch:{ all -> 0x036f }
            goto L_0x0372
        L_0x036f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x036f }
            throw r0
        L_0x0372:
            X.124 r0 = r5.A0y
            r0.A02(r4)
        L_0x0377:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27601Sk.A04(X.2Qs, long):void");
    }

    public final void A05(C16740tZ r5, C28381Vw r6) {
        if (r5 instanceof C38541qx) {
            C27591Sj r3 = this.A0b;
            if (!r5.A11.A02) {
                Log.e("MessageAddOnSendRecvManager/cant use this method for messageAddOn not from self");
            } else {
                r3.A04.A01(new RunnableRunnableShape7S0200000_I0_5(r3, 6, r5), 57);
            }
        } else if (r5 != null) {
            r5.A0W(7);
            this.A0Q.A0e(r5, 23);
        } else {
            StringBuilder sb = new StringBuilder("MessagingXmppHandler/onMessageError/bounce unable to find message ");
            sb.append(r6);
            Log.w(sb.toString());
        }
    }

    public final void A06(C28381Vw r15, boolean z2, boolean z3) {
        Object obj;
        long j2;
        C28381Vw r7 = r15;
        HashSet hashSet = new HashSet(this.A0Z.A00(r15));
        C16040sK r0 = this.A03;
        if (z3) {
            obj = r0.A02();
        } else {
            r0.A0B();
            obj = r0.A04;
        }
        hashSet.add(obj);
        Set A0A2 = C16030sJ.A0A(this.A01, hashSet);
        AnonymousClass16U r6 = this.A0H;
        UserJid[] userJidArr = (UserJid[]) A0A2.toArray(new UserJid[0]);
        if (z2) {
            j2 = 0;
        } else {
            long A002 = this.A0I.A00();
            long A032 = (long) this.A0h.A03(C16620tM.A02, 2257);
            j2 = A002 + ((A032 <= 0 || A032 > 60) ? 300000 : A032 * 60000);
        }
        boolean A062 = this.A0A.A06();
        if (userJidArr.length == 0) {
            StringBuilder sb = new StringBuilder("SyncDeviceAndResendMessageJob/empty recipients for ");
            sb.append(r15);
            Log.w(sb.toString());
        } else if (r6.A02.A01(r15)) {
            r6.A00.A00(new SyncDeviceAndResendMessageJob(r7, userJidArr, r6.A04.A00(), j2, A062));
        }
    }

    public final void A07(C30161br r14) {
        C20340zt r6 = this.A0s;
        new C31001dJ(this.A05, this.A09, this.A0L, this.A0O, this.A0q, r6, r14, (C30971dG) null, (C30971dG) null, (byte[]) null, (byte[]) null, true).A00();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0186 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x0186=Splitter:B:45:0x0186, B:34:0x014a=Splitter:B:34:0x014a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(com.whatsapp.jid.DeviceJid r20, X.C16740tZ r21, X.C40111ta r22, int r23, long r24) {
        /*
            r19 = this;
            r6 = r19
            X.126 r0 = r6.A0O
            r0.A00()
            r7 = r21
            X.1Vw r5 = r7.A11
            r17 = r23
            boolean r0 = X.C42881yp.A01(r17)
            if (r0 == 0) goto L_0x018c
            boolean r0 = r7 instanceof X.C38541qx
            r18 = r20
            r13 = r24
            if (r0 == 0) goto L_0x0041
            X.16V r1 = r6.A0Z
            r0 = r18
            r1.A01(r0, r7, r13)
            r4 = 1
        L_0x0023:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x002f
            X.0sK r0 = r6.A03
            boolean r0 = X.C38621r6.A0T(r0, r7)
            if (r0 == 0) goto L_0x0040
        L_0x002f:
            X.1Yb r3 = X.C28851Ya.A02(r18)
            X.16P r2 = r6.A0M
            r0 = 6
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r1 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2
            r1.<init>(r6, r3, r5, r0)
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00
            r0.execute(r1)
        L_0x0040:
            return r4
        L_0x0041:
            X.1Si r8 = r6.A0Y
            X.126 r0 = r8.A01
            r0.A00()
            X.0t6 r0 = r8.A02
            X.0th r0 = r0.A0K
            X.0tZ r10 = r0.A03(r5)
            if (r10 != 0) goto L_0x007d
            java.lang.String r1 = "PrivacyStateMessageManager/check privacy conflict on receipt/fMsg not found for messageKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0063:
            X.1HK r11 = r6.A0W
            X.AnonymousClass00B.A06(r18)
            X.126 r0 = r11.A04
            r0.A00()
            java.util.Map r0 = r11.A0L
            r0.remove(r5)
            r15 = r13
            r12 = r18
            r13 = r7
            r14 = r17
            boolean r4 = r11.A04(r12, r13, r14, r15)
            goto L_0x0023
        L_0x007d:
            X.186 r3 = r8.A03
            long r0 = r10.A13
            X.1uG r4 = r3.A00(r0)
            r2 = 0
            r9 = r22
            if (r4 == 0) goto L_0x00d3
            java.lang.String r1 = "PrivacyStateMessageManager/check privacy conflict on receipt/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1ta r2 = r4.A00
        L_0x009d:
            boolean r0 = X.C47402Iv.A01(r2, r9)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "PrivacyStateMessageManager/check privacy conflict on receipt/privacy mismatch. jid="
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            X.1Vw r0 = r10.A11
            X.0rv r4 = r0.A00
            r11.append(r4)
            java.lang.String r0 = " privacy mode="
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = " row id="
            r11.append(r0)
            long r0 = r10.A13
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            if (r22 == 0) goto L_0x017b
            X.0tq r0 = r3.A02
            X.0tf r11 = r0.A02()
            goto L_0x00e7
        L_0x00d3:
            if (r22 == 0) goto L_0x009d
            java.lang.String r1 = "PrivacyStateMessageManager/check privacy conflict on receipt (ent upgrade)/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x009d
        L_0x00e7:
            X.1cj r16 = r11.A00()     // Catch:{ all -> 0x0187 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x0182 }
            r12.<init>()     // Catch:{ all -> 0x0182 }
            java.lang.String r15 = "message_row_id"
            long r0 = r10.A13     // Catch:{ all -> 0x0182 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0182 }
            r12.put(r15, r0)     // Catch:{ all -> 0x0182 }
            java.lang.String r1 = "host_storage"
            int r0 = r9.hostStorage     // Catch:{ all -> 0x0182 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0182 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0182 }
            java.lang.String r1 = "actual_actors"
            int r0 = r9.actualActors     // Catch:{ all -> 0x0182 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0182 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0182 }
            java.lang.String r15 = "privacy_mode_ts"
            long r0 = r9.privacyModeTs     // Catch:{ all -> 0x0182 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0182 }
            r12.put(r15, r0)     // Catch:{ all -> 0x0182 }
            X.0tg r15 = r11.A02     // Catch:{ all -> 0x0182 }
            java.lang.String r1 = "message_privacy_state"
            r0 = 5
            r15.A06(r12, r1, r0)     // Catch:{ all -> 0x0182 }
            r0 = 4096(0x1000, float:5.74E-42)
            r10.A0S(r0)     // Catch:{ all -> 0x0182 }
            X.17G r1 = r3.A01     // Catch:{ IOException -> 0x0133 }
            r0 = 0
            r1.A07(r10, r0)     // Catch:{ IOException -> 0x0133 }
            r16.A00()     // Catch:{ IOException -> 0x0133 }
            goto L_0x014a
        L_0x0133:
            r3 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0182 }
            r12.<init>()     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = "Failed to update msg privacy flag for "
            r12.append(r0)     // Catch:{ all -> 0x0182 }
            long r0 = r10.A13     // Catch:{ all -> 0x0182 }
            r12.append(r0)     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0182 }
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x0182 }
        L_0x014a:
            r16.close()     // Catch:{ all -> 0x0187 }
            r11.close()
            if (r2 == 0) goto L_0x015a
            long r2 = r2.privacyModeTs
            long r0 = r9.privacyModeTs
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x0063
        L_0x015a:
            java.lang.String r1 = "PrivacyStateMessageManager/check privacy conflict on receipt/GetVNameCertificateJob. UserJid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0xb r2 = r8.A00
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r4)
            com.obwhatsapp.jobqueue.job.GetVNameCertificateJob r0 = new com.obwhatsapp.jobqueue.job.GetVNameCertificateJob
            r0.<init>(r1)
            r2.A00(r0)
            goto L_0x0063
        L_0x017b:
            long r0 = r10.A13
            r3.A01(r0)
            goto L_0x0063
        L_0x0182:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x0186 }
        L_0x0186:
            throw r0     // Catch:{ all -> 0x0187 }
        L_0x0187:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x018b }
        L_0x018b:
            throw r0
        L_0x018c:
            X.1HK r2 = r6.A0W
            r1 = 0
            r0 = r17
            boolean r4 = r2.A03(r1, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27601Sk.A08(com.whatsapp.jid.DeviceJid, X.0tZ, X.1ta, int, long):boolean");
    }

    public int[] ACW() {
        return new int[]{0, 1, 2, 19, 69, 86, 16, 15, 215, 227};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.util.HashSet} */
    /* JADX WARNING: type inference failed for: r15v4, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: type inference failed for: r1v98, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:479|480|481|482|483) */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0399, code lost:
        if (r2 == 8) goto L_0x039b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:477:0x0b47 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:482:0x0b4c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0477  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AHS(android.os.Message r33, int r34) {
        /*
            r32 = this;
            r7 = 1
            r0 = r32
            r4 = r33
            r2 = r34
            if (r34 == 0) goto L_0x0855
            if (r2 == r7) goto L_0x07f7
            r1 = 2
            if (r2 == r1) goto L_0x06eb
            r1 = 15
            if (r2 == r1) goto L_0x05e5
            r1 = 16
            if (r2 == r1) goto L_0x04e2
            r1 = 19
            r10 = 0
            if (r2 == r1) goto L_0x02ab
            r1 = 69
            if (r2 == r1) goto L_0x0041
            r1 = 86
            if (r2 == r1) goto L_0x0037
            r1 = 215(0xd7, float:3.01E-43)
            if (r2 == r1) goto L_0x002c
            r1 = 227(0xe3, float:3.18E-43)
            if (r2 == r1) goto L_0x066e
            return r10
        L_0x002c:
            X.0yF r1 = r0.A11
            int r0 = r4.arg2
            if (r0 != r7) goto L_0x0033
            r10 = 1
        L_0x0033:
            r1.A00(r10)
            return r7
        L_0x0037:
            java.lang.Object r1 = r4.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r0 = "msgid"
            r1.getString(r0)
            return r7
        L_0x0041:
            java.lang.Object r2 = r4.obj
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r1 = "recipient"
            com.whatsapp.jid.Jid r4 = X.AnonymousClass2RS.A00(r2, r1)
            X.0rv r4 = (X.C15830rv) r4
            java.lang.String r1 = "remote_jid"
            com.whatsapp.jid.Jid r8 = X.AnonymousClass2RS.A00(r2, r1)
            if (r4 != 0) goto L_0x0059
            X.0rv r4 = X.C15830rv.A00(r8)
        L_0x0059:
            java.lang.String r1 = "from_me"
            boolean r3 = r2.getBoolean(r1)
            java.lang.String r1 = "msgid"
            java.lang.String r1 = r2.getString(r1)
            X.1Vw r6 = new X.1Vw
            r6.<init>(r4, r1, r3)
            java.lang.String r1 = "category"
            java.lang.String r3 = r2.getString(r1)
            java.lang.String r1 = "requester"
            com.whatsapp.jid.Jid r5 = X.AnonymousClass2RS.A00(r2, r1)
            java.lang.String r1 = "participant"
            com.whatsapp.jid.Jid r4 = X.AnonymousClass2RS.A00(r2, r1)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            com.whatsapp.jid.DeviceJid r8 = com.whatsapp.jid.DeviceJid.of(r8)
            java.lang.String r1 = "is_md_rmr"
            boolean r15 = r2.getBoolean(r1)
            java.lang.String r1 = "enc_data"
            byte[] r12 = r2.getByteArray(r1)
            java.lang.String r1 = "enc_iv"
            byte[] r9 = r2.getByteArray(r1)
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget; key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r6)
            java.lang.String r1 = "; participant="
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = "; remoteJid="
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = "peer"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0133
            if (r12 == 0) goto L_0x012f
            if (r9 == 0) goto L_0x012f
            if (r8 == 0) goto L_0x012f
            X.19M r1 = r0.A0g
            java.lang.String r2 = r6.A01
            X.1bL r4 = r1.A03(r8, r2)
            X.1bM r4 = (X.C29871bM) r4
            if (r4 != 0) goto L_0x00d3
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/message-missing"
            goto L_0x036b
        L_0x00d3:
            int r1 = r4.A02
            if (r1 <= 0) goto L_0x00db
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/too many retries"
            goto L_0x036b
        L_0x00db:
            byte[] r1 = r4.A0H
            int r1 = r0.A00(r2, r1, r12, r9)
            if (r1 != r7) goto L_0x069a
            com.whatsapp.jid.DeviceJid r10 = r4.A00
            if (r10 != 0) goto L_0x00eb
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/no recipient"
            goto L_0x036b
        L_0x00eb:
            int r1 = r4.A03
            r2 = 4
            if (r1 != r2) goto L_0x0101
            X.1Cb r1 = r0.A0E
            r1.A01()
            X.0sq r3 = r0.A1B
            r2 = 5
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r1 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2
            r1.<init>(r0, r4, r10, r2)
            r3.Acl(r1)
            return r7
        L_0x0101:
            r2 = 2
            if (r1 == r2) goto L_0x0107
            r2 = 3
            if (r1 != r2) goto L_0x069a
        L_0x0107:
            X.1RS r2 = r0.A0f
            long r3 = r4.A13
            r9 = 0
            r14 = -1
            r12 = -1
            r16 = -1
            r18 = -1
            r20 = -1
            r22 = -1
            r24 = -1
            r28 = r3
            r30 = -1
            r13 = 1
            X.1bK r8 = new X.1bK
            r11 = r1
            r26 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r18, r20, r22, r24, r26, r28, r30)
            r2.A02(r8)
            X.1Cb r0 = r0.A0E
            r0.A02()
            return r7
        L_0x012f:
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/no-data"
            goto L_0x036b
        L_0x0133:
            X.0rv r3 = r6.A00
            if (r3 != 0) goto L_0x014d
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/key doesn't have chat jid"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x013c:
            java.lang.String r2 = r6.A01
            r12 = 0
            r14 = 0
        L_0x0140:
            boolean r1 = r6.A02
            r8 = r0
            r9 = r3
            r10 = r5
            r11 = r4
            r13 = r2
            r16 = r1
            r8.A03(r9, r10, r11, r12, r13, r14, r15, r16)
            return r7
        L_0x014d:
            boolean r1 = X.C16030sJ.A0G(r3)
            if (r1 == 0) goto L_0x01b3
            if (r4 == 0) goto L_0x01b3
            boolean r1 = X.C16030sJ.A0Q(r3)
            if (r1 != 0) goto L_0x01b3
            boolean r2 = r6.A02
            java.lang.String r1 = r6.A01
            X.1Vw r10 = new X.1Vw
            r10.<init>(r4, r1, r2)
        L_0x0164:
            X.17h r1 = r0.A0r
            r1.A00(r8, r10)
            X.0t6 r1 = r0.A0Q
            X.0th r1 = r1.A0K
            X.0tZ r8 = r1.A03(r10)
            if (r8 != 0) goto L_0x017d
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/messagemissing"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0178:
            java.lang.String r2 = r6.A01
            r12 = 0
            r14 = 2
            goto L_0x0140
        L_0x017d:
            byte r2 = r8.A10
            boolean r1 = X.C38621r6.A0N(r2)
            if (r1 != 0) goto L_0x0191
            boolean r1 = X.C30921dB.A00(r2)
            if (r1 != 0) goto L_0x0191
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/wrongtype"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x013c
        L_0x0191:
            X.0tY r8 = (X.C16730tY) r8
            X.0ta r1 = r8.A02
            X.AnonymousClass00B.A06(r1)
            X.0ta r11 = new X.0ta
            r11.<init>(r1)
            java.io.File r1 = r11.A0F
            if (r1 != 0) goto L_0x01b5
            java.lang.String r2 = "MessagingXmppHandler/onMessageServerErrorForTarget/badmediadata; mediaDataV2="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0178
        L_0x01b3:
            r10 = r6
            goto L_0x0164
        L_0x01b5:
            java.lang.String r2 = r10.A01
            byte[] r1 = r11.A0U
            int r9 = r0.A00(r2, r1, r12, r9)
            if (r9 == r7) goto L_0x01d9
            java.lang.String r2 = r6.A01
            r20 = 0
            boolean r1 = r6.A02
            r16 = r0
            r17 = r3
            r18 = r5
            r19 = r4
            r21 = r2
            r22 = r9
            r24 = r1
            r23 = r15
            r16.A03(r17, r18, r19, r20, r21, r22, r23, r24)
            return r7
        L_0x01d9:
            java.io.File r1 = r11.A0F
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0200
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/filemissing"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r2 = r6.A01
            boolean r1 = r6.A02
            r22 = 2
        L_0x01ec:
            r16 = r0
            r17 = r3
            r18 = r5
            r19 = r4
            r20 = r8
            r21 = r2
            r24 = r1
            r23 = r15
            r16.A03(r17, r18, r19, r20, r21, r22, r23, r24)
            return r7
        L_0x0200:
            long r1 = r11.A0A
            r12 = 0
            int r9 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x023a
            java.io.File r9 = r11.A0F
            long r12 = r9.length()
            int r9 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x023a
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/filereplaced; mediaDataV2.fileSize="
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r1)
            long r1 = r11.A0A
            r9.append(r1)
            java.lang.String r1 = "; mediaDataV2.file.length="
            r9.append(r1)
            java.io.File r1 = r11.A0F
            long r1 = r1.length()
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r2 = r6.A01
            boolean r1 = r6.A02
            r22 = 0
            goto L_0x01ec
        L_0x023a:
            if (r15 != 0) goto L_0x0285
            X.0wP r1 = r0.A0G
            int r11 = r1.A04(r7)
            X.14u r2 = r0.A0n
            boolean r1 = r2.A03(r8)
            if (r1 != 0) goto L_0x0285
            boolean r1 = r2.A06(r8, r11)
            if (r1 != 0) goto L_0x0285
            byte r9 = r8.A10
            if (r9 != r7) goto L_0x0259
            if (r11 == 0) goto L_0x0259
            r1 = 3
            if (r11 != r1) goto L_0x0285
        L_0x0259:
            java.lang.String r0 = "MessagingXmppHandler/onMessageServerErrorForTarget/skipreupload; activeNetworkType="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r11)
            java.lang.String r0 = "; message.media_wa_type="
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = "; message.origin="
            r2.append(r0)
            int r0 = r8.A08
            r2.append(r0)
            java.lang.String r0 = "; message.media_size="
            r2.append(r0)
            long r0 = r8.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x036b
        L_0x0285:
            X.1HE r9 = r0.A0l
            if (r15 != 0) goto L_0x028f
            X.0rv r5 = r10.A00
            X.AnonymousClass00B.A06(r5)
            r3 = 0
        L_0x028f:
            boolean r2 = r6.A02
            if (r15 == 0) goto L_0x0298
            X.1Cb r0 = r9.A04
            r0.A01()
        L_0x0298:
            X.0sq r1 = r9.A0O
            X.2ec r0 = new X.2ec
            r11 = r4
            r12 = r9
            r13 = r8
            r14 = r15
            r15 = r2
            r8 = r0
            r9 = r3
            r10 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1.Acl(r0)
            return r7
        L_0x02ab:
            android.os.Bundle r2 = r4.getData()
            java.lang.String r1 = "edit"
            java.lang.String r2 = r2.getString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x036f
            r2 = 0
        L_0x02bc:
            android.os.Bundle r3 = r4.getData()
            java.lang.String r1 = "remote_chat_jid"
            java.lang.String r1 = r3.getString(r1)
            X.0rv r6 = X.C15830rv.A02(r1)
            r1 = 8
            if (r2 == r1) goto L_0x02cf
            r10 = 1
        L_0x02cf:
            android.os.Bundle r3 = r4.getData()
            java.lang.String r1 = "msgid"
            java.lang.String r1 = r3.getString(r1)
            X.1Vw r5 = new X.1Vw
            r5.<init>(r6, r1, r10)
            android.os.Bundle r3 = r4.getData()
            java.lang.String r1 = "participant"
            com.whatsapp.jid.Jid r15 = X.AnonymousClass2RS.A00(r3, r1)
            android.os.Bundle r3 = r4.getData()
            java.lang.String r1 = "remoteJid"
            com.whatsapp.jid.Jid r11 = X.AnonymousClass2RS.A00(r3, r1)
            com.whatsapp.jid.DeviceJid r11 = (com.whatsapp.jid.DeviceJid) r11
            android.os.Bundle r1 = r4.getData()
            java.lang.String r10 = "phash"
            java.lang.String r9 = r1.getString(r10)
            android.os.Bundle r3 = r4.getData()
            java.lang.String r1 = "counter_abuse_token"
            java.lang.String r19 = r3.getString(r1)
            android.os.Bundle r3 = r4.getData()
            java.lang.String r1 = "count"
            int r18 = r3.getInt(r1)
            android.os.Bundle r3 = r4.getData()
            java.lang.String r1 = "timestamp"
            long r16 = r3.getLong(r1)
            java.lang.String r14 = "; participant="
            java.lang.String r13 = "; remoteJid="
            java.lang.String r12 = "; serverParticipantHash="
            java.lang.String r8 = "; recipientCount="
            java.lang.String r6 = "; counterAbuseToken="
            java.lang.String r4 = "; edit="
            java.lang.String r1 = "; timestamp="
            if (r15 == 0) goto L_0x0375
            java.lang.String r0 = "MessagingXmppHandler/onMessageReceivedByServer message received by server ignored; key="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r5)
            r3.append(r14)
            r3.append(r15)
            r3.append(r13)
            r3.append(r11)
            r3.append(r12)
            r3.append(r9)
            r3.append(r8)
            r0 = r18
            r3.append(r0)
            r3.append(r6)
            r0 = r19
            r3.append(r0)
            r3.append(r4)
            r3.append(r2)
            r3.append(r1)
            r0 = r16
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x036b:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r7
        L_0x036f:
            int r2 = java.lang.Integer.parseInt(r2)
            goto L_0x02bc
        L_0x0375:
            X.17h r4 = r0.A0r
            java.util.Map r3 = r4.A01
            monitor-enter(r3)
            java.lang.Object r1 = r3.get(r5)     // Catch:{ all -> 0x04df }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ all -> 0x04df }
            if (r1 == 0) goto L_0x0388
            java.lang.Object r6 = r1.second     // Catch:{ all -> 0x04df }
            X.0tZ r6 = (X.C16740tZ) r6     // Catch:{ all -> 0x04df }
        L_0x0386:
            monitor-exit(r3)     // Catch:{ all -> 0x04df }
            goto L_0x038a
        L_0x0388:
            r6 = 0
            goto L_0x0386
        L_0x038a:
            r4.A00(r11, r5)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            r11 = r1 ^ 1
            r1 = 7
            if (r2 == r1) goto L_0x039b
            r1 = 8
            r8 = 0
            if (r2 != r1) goto L_0x039c
        L_0x039b:
            r8 = 1
        L_0x039c:
            X.0rv r4 = r5.A00
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r4)
            if (r2 == 0) goto L_0x03a9
            X.1HG r1 = r0.A13
            r1.A00(r2)
        L_0x03a9:
            boolean r14 = X.C16030sJ.A0Q(r4)
            r3 = 0
            if (r14 != 0) goto L_0x03b8
            boolean r1 = X.C16030sJ.A0H(r4)
            if (r1 == 0) goto L_0x04dc
            if (r8 != 0) goto L_0x04dc
        L_0x03b8:
            r1 = 1
        L_0x03b9:
            if (r11 == 0) goto L_0x0422
            boolean r13 = X.C16030sJ.A0L(r4)
            if (r13 != 0) goto L_0x048f
            if (r1 != 0) goto L_0x048f
            boolean r1 = r4 instanceof com.whatsapp.jid.UserJid
            if (r1 == 0) goto L_0x0422
            X.16V r1 = r0.A0Z
            java.util.Set r1 = r1.A00(r5)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r1)
            X.0sK r1 = r0.A03
            r1.A0B()
            X.1Za r1 = r1.A04
            r2.add(r1)
            java.lang.String r1 = X.C37431p9.A00(r2)
            boolean r1 = android.text.TextUtils.equals(r1, r9)
            if (r1 != 0) goto L_0x0422
            r0.A06(r5, r8, r3)
        L_0x03e9:
            X.0w1 r9 = r0.A04
            X.2eh r2 = new X.2eh
            r2.<init>()
            if (r13 == 0) goto L_0x0479
            r1 = 2
        L_0x03f3:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
        L_0x03f7:
            r2.A02 = r10
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r2.A01 = r1
            if (r6 == 0) goto L_0x0477
            X.0w2 r1 = r9.A09
            int r1 = X.C18020w1.A02(r1, r6)
        L_0x0407:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r9.A0N(r4, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r1
            X.0rt r1 = r9.A06
            java.lang.Integer r1 = X.C30871d6.A00(r1, r4)
            r2.A03 = r1
            X.0t9 r1 = r9.A0C
            r1.A06(r2)
        L_0x0422:
            boolean r1 = r6 instanceof X.C38541qx
            if (r1 == 0) goto L_0x0453
            X.1Sj r5 = r0.A0b
            X.1Vw r1 = r6.A11
            boolean r1 = r1.A02
            if (r1 != 0) goto L_0x0445
            java.lang.String r1 = "MessageAddOnSendRecvManager/cant use this method for messageAddOn not from self"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0433:
            X.1H7 r0 = r0.A08
            X.1Sl r1 = r0.A0C
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x069a
            r1.A02 = r3
            X.0yL r2 = r1.A01
            r1 = 6
            r0 = 0
            r2.A03(r1, r0)
            return r7
        L_0x0445:
            X.126 r4 = r5.A04
            r1 = 7
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r2 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r2.<init>(r5, r1, r6)
            r1 = 56
            r4.A01(r2, r1)
            goto L_0x0433
        L_0x0453:
            X.0t6 r8 = r0.A0Q
            java.util.Map r1 = r8.A1o
            r1.remove(r5)
            X.126 r4 = r8.A0H
            com.facebook.redex.RunnableRunnableShape0S1301100_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S1301100_I0
            r23 = 0
            r20 = r6
            r21 = r19
            r22 = r18
            r24 = r16
            r17 = r2
            r18 = r8
            r19 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r1 = 23
            r4.A01(r2, r1)
            goto L_0x0433
        L_0x0477:
            r1 = 1
            goto L_0x0407
        L_0x0479:
            if (r14 == 0) goto L_0x047e
            r1 = 3
            goto L_0x03f3
        L_0x047e:
            boolean r1 = X.C16030sJ.A0G(r4)
            if (r1 == 0) goto L_0x0487
            r1 = 4
            goto L_0x03f3
        L_0x0487:
            boolean r1 = r4 instanceof com.whatsapp.jid.UserJid
            r10 = 0
            if (r1 == 0) goto L_0x03f7
            r1 = 1
            goto L_0x03f3
        L_0x048f:
            boolean r1 = r4 instanceof X.C16060sN
            if (r1 == 0) goto L_0x04da
            r12 = r4
        L_0x0494:
            X.AnonymousClass00B.A06(r12)
            X.0rt r1 = r0.A0P
            boolean r11 = X.C38621r6.A0Y(r1, r6)
            X.16V r1 = r0.A0Z
            java.util.Set r1 = r1.A00(r5)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r1)
            X.0sK r1 = r0.A03
            if (r11 == 0) goto L_0x04d4
            X.1ZY r1 = r1.A02()
        L_0x04b0:
            r2.add(r1)
            java.lang.String r1 = X.C37431p9.A00(r2)
            boolean r1 = android.text.TextUtils.equals(r1, r9)
            if (r1 != 0) goto L_0x0422
            r0.A06(r5, r8, r11)
            boolean r1 = X.C16030sJ.A0L(r12)
            if (r1 == 0) goto L_0x03e9
            X.0vd r2 = r0.A0k
            X.0sL r1 = X.C16050sL.A03(r12)
            X.AnonymousClass00B.A06(r1)
            r2.A0A(r1, r10, r7)
            goto L_0x03e9
        L_0x04d4:
            r1.A0B()
            X.1Za r1 = r1.A04
            goto L_0x04b0
        L_0x04da:
            r12 = 0
            goto L_0x0494
        L_0x04dc:
            r1 = 0
            goto L_0x03b9
        L_0x04df:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04df }
            throw r0
        L_0x04e2:
            java.lang.Object r1 = r4.obj
            X.2eL r1 = (X.C52722eL) r1
            X.1Vw r2 = r1.A03
            com.whatsapp.jid.DeviceJid r6 = r1.A02
            int r5 = r1.A00
            X.17h r4 = r0.A0r
            java.util.Map r3 = r4.A01
            monitor-enter(r3)
            java.lang.Object r1 = r3.get(r2)     // Catch:{ all -> 0x05e2 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ all -> 0x05e2 }
            if (r1 == 0) goto L_0x04ff
            java.lang.Object r1 = r1.second     // Catch:{ all -> 0x05e2 }
            X.0tZ r1 = (X.C16740tZ) r1     // Catch:{ all -> 0x05e2 }
        L_0x04fd:
            monitor-exit(r3)     // Catch:{ all -> 0x05e2 }
            goto L_0x0501
        L_0x04ff:
            r1 = 0
            goto L_0x04fd
        L_0x0501:
            r4.A00(r6, r2)
            X.0rv r4 = r2.A00
            boolean r6 = X.C16030sJ.A0L(r4)
            if (r6 == 0) goto L_0x0566
            r3 = 401(0x191, float:5.62E-43)
            if (r5 != r3) goto L_0x0566
            X.0t6 r6 = r0.A0Q
            X.122 r5 = r0.A18
            X.0t3 r3 = r0.A0I
            long r12 = r3.A00()
            X.18b r3 = r5.A03
            X.1Vw r9 = r3.A02(r4, r7)
            X.0so r8 = r5.A00
            r11 = 8
            r10 = 0
            X.1WU r3 = X.AnonymousClass122.A00(r8, r9, r10, r11, r12)
            r6.A0W(r3)
            r0.A05(r1, r2)
            X.0sO r2 = r0.A0S
            r1 = r4
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            boolean r1 = r2.A09(r1)
            if (r1 == 0) goto L_0x069a
            X.0ul r5 = r0.A0j
            X.0sL r3 = X.C16050sL.A03(r4)
            X.AnonymousClass00B.A06(r3)
            X.0sK r0 = r0.A03
            r0.A0B()
            X.1Zb r0 = r0.A01
            X.AnonymousClass00B.A06(r0)
            X.0rv r0 = r0.A0E
            X.AnonymousClass00B.A06(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r5.A0M(r3, r0)
            X.0pt r2 = r5.A07
            r1 = 38
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r5, r1, r3)
            r2.A0K(r0)
            return r7
        L_0x0566:
            r3 = 405(0x195, float:5.68E-43)
            if (r5 == r3) goto L_0x059a
            if (r6 != 0) goto L_0x057a
            r3 = 403(0x193, float:5.65E-43)
            if (r5 != r3) goto L_0x059e
            r0.A05(r1, r2)
            X.01Y r1 = r0.A0B
            r0 = 0
            r1.A0N(r0)
            return r7
        L_0x057a:
            r3 = 420(0x1a4, float:5.89E-43)
            if (r5 != r3) goto L_0x059e
            X.0t6 r6 = r0.A0Q
            X.122 r5 = r0.A18
            X.0t3 r3 = r0.A0I
            long r12 = r3.A00()
            r11 = 33
            X.18b r3 = r5.A03
            X.1Vw r9 = r3.A02(r4, r7)
            X.0so r8 = r5.A00
            r10 = 0
            X.1WU r3 = X.AnonymousClass122.A00(r8, r9, r10, r11, r12)
            r6.A0W(r3)
        L_0x059a:
            r0.A05(r1, r2)
            return r7
        L_0x059e:
            if (r1 == 0) goto L_0x069a
            X.1Vt r2 = r1.A0L
            if (r2 == 0) goto L_0x069a
            int r2 = r1.A0C
            r3 = 7
            r1.A0W(r3)
            X.0t6 r4 = r0.A0Q
            r3 = 23
            r4.A0e(r1, r3)
            X.1Vt r8 = r1.A0L
            boolean r3 = r8.A0E()
            r12 = 406(0x196, float:5.69E-43)
            if (r3 == 0) goto L_0x05bd
            r12 = 13
        L_0x05bd:
            X.0t3 r3 = r0.A0I
            long r13 = r3.A00()
            X.1Vt r3 = r1.A0L
            java.lang.String r9 = r3.A0H
            java.lang.String r10 = java.lang.Integer.toString(r5)
            r11 = 0
            r8.A07(r9, r10, r11, r12, r13)
            X.0wS r0 = r0.A12
            r0.A06()
            X.16r r8 = r0.A08
            X.1Vw r10 = r1.A11
            X.1Vt r9 = r1.A0L
            r13 = 0
            r12 = 0
            r11 = r2
            r8.A0m(r9, r10, r11, r12, r13)
            return r7
        L_0x05e2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x05e2 }
            throw r0
        L_0x05e5:
            java.lang.Object r2 = r4.obj
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r1 = "messageCount"
            r2.getInt(r1)
            X.0wP r5 = r0.A0G
            boolean r6 = r5.A0B()
            X.1Se r3 = r0.A15
            r1 = 24
            com.facebook.redex.RunnableRunnableShape0S0110000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0110000_I0
            r2.<init>(r0, r1, r6)
            java.util.concurrent.ThreadPoolExecutor r1 = r3.A01
            if (r1 != 0) goto L_0x0605
            X.16P r1 = r3.A00
            java.util.concurrent.ThreadPoolExecutor r1 = r1.A00
        L_0x0605:
            r1.execute(r2)
            X.1RI r4 = r0.A14
            monitor-enter(r4)
            X.16U r1 = r4.A03     // Catch:{ all -> 0x06e8 }
            X.0pd r3 = r1.A06     // Catch:{ all -> 0x06e8 }
            r2 = 560(0x230, float:7.85E-43)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ all -> 0x06e8 }
            boolean r1 = r3.A0E(r1, r2)     // Catch:{ all -> 0x06e8 }
            if (r1 != 0) goto L_0x061c
            r4.A00()     // Catch:{ all -> 0x06e8 }
        L_0x061c:
            monitor-exit(r4)
            X.0yF r2 = r0.A11
            monitor-enter(r2)
            boolean r1 = r2.A02     // Catch:{ all -> 0x06e5 }
            if (r1 != 0) goto L_0x0628
            r1 = 0
            r2.A00(r1)     // Catch:{ all -> 0x06e5 }
        L_0x0628:
            monitor-exit(r2)
            X.14u r1 = r0.A0n
            int r2 = r5.A04(r7)
            X.0rz r1 = r1.A05
            int r5 = X.AnonymousClass20B.A00(r1, r2)
            if (r5 == 0) goto L_0x0643
            X.0xv r4 = r0.A0m
            r3 = 0
            android.os.Handler r2 = r4.A01
            java.lang.Runnable r1 = r4.A0B
            r2.removeCallbacks(r1)
            r4.A00 = r3
        L_0x0643:
            X.0sq r3 = r0.A1B
            r1 = 25
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r2.<init>((java.lang.Object) r0, (int) r5, (int) r1)
            java.lang.String r1 = "MessagingXmppHandler/onOfflineComplete-retry-media-download"
            r3.Acm(r2, r1)
            r1 = 40
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r2 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r2.<init>((java.lang.Object) r0, (int) r1)
            java.lang.String r1 = "MessagingXmppHandler/onOfflineComplete-zombie-cleanup"
            r3.Acm(r2, r1)
            if (r6 != 0) goto L_0x069a
            r3 = 0
            X.0pt r5 = r0.A02
            r2 = 41
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r1 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r1.<init>((java.lang.Object) r0, (int) r2)
            r5.A0L(r1, r3)
            return r7
        L_0x066e:
            java.lang.Object r2 = r4.obj
            X.1Vv r2 = (X.C28371Vv) r2
            java.lang.String r9 = "readreceipts"
            r1 = 0
            java.lang.String r2 = r2.A0N(r9, r1)
            java.lang.String r1 = "all"
            boolean r8 = r1.equals(r2)
            java.lang.String r6 = "none"
            if (r8 != 0) goto L_0x069b
            boolean r1 = r6.equals(r2)
            if (r1 != 0) goto L_0x069b
            java.lang.String r1 = "MessagingXmppHandler/onSyncPrivacySetting unknown readreceipts setting: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x069a:
            return r7
        L_0x069b:
            X.0rz r5 = r0.A0K
            boolean r4 = r5.A1i()
            if (r8 == r4) goto L_0x069a
            X.0so r3 = r0.A01
            java.lang.String r1 = "server="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "; client="
            r2.append(r1)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "readReceipt-setting-inconsistency"
            r3.AcB(r1, r2, r10)
            if (r4 == 0) goto L_0x06df
            android.content.SharedPreferences$Editor r2 = r5.A0K()
            java.lang.String r1 = "read_receipts_enabled"
            android.content.SharedPreferences$Editor r1 = r2.putBoolean(r1, r8)
            r1.apply()
            X.138 r3 = r0.A06
            X.0pt r2 = r3.A01
            r1 = 13
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r0.<init>(r3, r1)
            r2.A0K(r0)
            return r7
        L_0x06df:
            X.138 r0 = r0.A06
            r0.A01(r9, r6)
            return r7
        L_0x06e5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x06e8:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x06eb:
            java.lang.Object r12 = r4.obj
            X.2eM r12 = (X.C52732eM) r12
            java.lang.String r2 = "peer"
            java.lang.String r1 = r12.A06
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x07e6
            X.1Sg r11 = r0.A0u
            X.1ci r10 = r12.A05
            X.1Vw r9 = r12.A02
            byte[] r0 = r12.A0A
            r22 = r0
            int r13 = r12.A00
            long r4 = r12.A01
            byte[] r0 = r12.A09
            r20 = r0
            byte[] r14 = r12.A08
            X.1dG r8 = r12.A04
            X.1dG r6 = r12.A03
            boolean r12 = r12.A07
            com.whatsapp.jid.Jid r0 = r10.A01
            com.whatsapp.jid.DeviceJid r3 = com.whatsapp.jid.DeviceJid.of(r0)
            int r2 = X.C28641Wx.A00(r22)
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/got retry request from peer "
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r0)
            r15.append(r3)
            java.lang.String r0 = " retryCount "
            r15.append(r0)
            r15.append(r13)
            java.lang.String r0 = " for "
            r15.append(r0)
            java.lang.String r0 = r9.A01
            r15.append(r0)
            java.lang.String r1 = " with "
            r15.append(r1)
            r15.append(r2)
            java.lang.String r1 = " originally sent at "
            r15.append(r1)
            r15.append(r4)
            java.lang.String r1 = r15.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            if (r3 == 0) goto L_0x07b6
            X.0sK r1 = r11.A00
            boolean r1 = r1.A0J(r3)
            if (r1 == 0) goto L_0x07b6
            X.0z2 r1 = r11.A06
            X.0uz r1 = r1.A06()
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x07b6
            X.19M r1 = r11.A07
            X.1bL r4 = r1.A03(r3, r0)
            if (r4 != 0) goto L_0x078d
            java.lang.String r2 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/invalid peer message: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " device: "
            r1.append(r0)
            r1.append(r3)
        L_0x0780:
            java.lang.String r0 = r1.toString()
        L_0x0784:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.124 r0 = r11.A08
            r0.A02(r10)
            return r7
        L_0x078d:
            long r0 = r4.A0I
            X.0t3 r5 = r11.A03
            long r17 = r5.A00()
            r15 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r17 = r17 - r15
            int r5 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r5 >= 0) goto L_0x07a3
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/cannot send retry to older message"
            goto L_0x0784
        L_0x07a3:
            X.19E r0 = r11.A02
            r0.A0E(r4, r13)
            r0 = 4
            if (r13 <= r0) goto L_0x07c5
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/skipping retry for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r9)
            goto L_0x0780
        L_0x07b6:
            java.lang.String r1 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/got peer message retry from device other than my companion: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L_0x0784
        L_0x07c5:
            X.16P r0 = r11.A04
            X.2eN r1 = new X.2eN
            r15 = r9
            r16 = r6
            r17 = r8
            r18 = r10
            r19 = r4
            r21 = r14
            r23 = r13
            r24 = r2
            r25 = r12
            r12 = r1
            r13 = r3
            r14 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.execute(r1)
            return r7
        L_0x07e6:
            X.1Sb r3 = r0.A17
            X.16P r2 = r3.A08
            r0 = 8
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r1 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r1.<init>(r3, r0, r12)
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00
            r0.execute(r1)
            return r7
        L_0x07f7:
            java.lang.Object r6 = r4.obj
            X.2Qs r6 = (X.AnonymousClass2Qs) r6
            X.1ci r3 = r6.Ag0()
            java.util.Set r5 = r0.A1D
            monitor-enter(r5)
            if (r3 == 0) goto L_0x0817
            boolean r1 = r5.contains(r3)     // Catch:{ all -> 0x0852 }
            if (r1 != 0) goto L_0x083c
            X.0s5 r2 = r0.A07     // Catch:{ all -> 0x0852 }
            X.0s8 r1 = X.C15910s6.A0w     // Catch:{ all -> 0x0852 }
            boolean r1 = r2.A05(r1)     // Catch:{ all -> 0x0852 }
            if (r1 == 0) goto L_0x0817
            r5.add(r3)     // Catch:{ all -> 0x0852 }
        L_0x0817:
            r1 = 7
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r4 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2     // Catch:{ all -> 0x0852 }
            r4.<init>(r0, r6, r3, r1)     // Catch:{ all -> 0x0852 }
            r3 = 12
            X.0s5 r2 = r0.A07     // Catch:{ all -> 0x0852 }
            X.0s8 r1 = X.C15910s6.A0x     // Catch:{ all -> 0x0852 }
            boolean r1 = r2.A05(r1)     // Catch:{ all -> 0x0852 }
            X.126 r0 = r0.A0O     // Catch:{ all -> 0x0852 }
            if (r1 == 0) goto L_0x0838
            android.os.Handler r1 = r0.A01     // Catch:{ all -> 0x0852 }
            android.os.Message r0 = android.os.Message.obtain(r1, r4)     // Catch:{ all -> 0x0852 }
            r0.arg1 = r3     // Catch:{ all -> 0x0852 }
            r1.sendMessage(r0)     // Catch:{ all -> 0x0852 }
        L_0x0836:
            monitor-exit(r5)     // Catch:{ all -> 0x0852 }
            goto L_0x0851
        L_0x0838:
            r0.A01(r4, r3)     // Catch:{ all -> 0x0852 }
            goto L_0x0836
        L_0x083c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0852 }
            r1.<init>()     // Catch:{ all -> 0x0852 }
            java.lang.String r0 = "messagingXmppHandler/onMessageStatusUpdate receipt in queue; skipping stanzaKey:"
            r1.append(r0)     // Catch:{ all -> 0x0852 }
            r1.append(r3)     // Catch:{ all -> 0x0852 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0852 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0852 }
            goto L_0x0836
        L_0x0851:
            return r7
        L_0x0852:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0852 }
            throw r0
        L_0x0855:
            java.lang.Object r1 = r4.obj
            X.2eO r1 = (X.C52752eO) r1
            X.1br r6 = r1.A00
            java.util.Map r8 = r1.A01
            java.lang.String r1 = "MessagingXmppHandler/onMessageForMe "
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r1)
            java.lang.String r1 = r6.A0o
            r10.append(r1)
            r5 = 32
            r10.append(r5)
            long r3 = r6.A0j
            r10.append(r3)
            r10.append(r5)
            X.0t3 r9 = r0.A0I
            long r1 = java.lang.System.currentTimeMillis()
            r10.append(r1)
            r10.append(r5)
            int r1 = r6.A00()
            r10.append(r1)
            r10.append(r5)
            int r1 = r6.A01
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.jid.Jid r1 = r6.A01()
            com.whatsapp.jid.DeviceJid r20 = com.whatsapp.jid.DeviceJid.of(r1)
            com.whatsapp.jid.Jid r1 = r6.A0k
            X.0rv r1 = X.C16030sJ.A00(r1)
            boolean r1 = X.C16030sJ.A0Q(r1)
            r5 = 1
            if (r1 == 0) goto L_0x08df
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r3 + r1
            long r9 = r9.A00()
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x08df
            X.1d1 r1 = r6.A09
            if (r1 != 0) goto L_0x08df
            X.17f r3 = r0.A0x
            r2 = 0
            java.lang.String r1 = "status-old"
            r3.A08(r6, r1, r2)
        L_0x08c7:
            X.0xv r4 = r0.A0m
            java.lang.Integer r0 = r6.A0H
            if (r0 != 0) goto L_0x08ce
            r5 = 0
        L_0x08ce:
            android.os.Handler r3 = r4.A01
            java.lang.Runnable r2 = r4.A0B
            r3.removeCallbacks(r2)
            if (r5 == 0) goto L_0x08dc
            r0 = 15000(0x3a98, double:7.411E-320)
            r3.postDelayed(r2, r0)
        L_0x08dc:
            r4.A00 = r5
            return r7
        L_0x08df:
            X.16S r1 = r0.A0t
            X.0rz r1 = r1.A01
            boolean r1 = r1.A1d()
            if (r1 == 0) goto L_0x0a89
            X.19I r11 = r0.A0F
            X.11o r10 = r11.A02
            long r1 = r6.A06
            r9 = 0
            X.1d2 r2 = r10.A00(r9, r1)
            if (r2 == 0) goto L_0x08fa
            r1 = 7
            r2.A00(r1)
        L_0x08fa:
            X.1Vw r13 = r6.A0C
            r10 = r13
            if (r13 != 0) goto L_0x0901
            X.1Vw r13 = r6.A0m
        L_0x0901:
            X.0rv r12 = r13.A00
            r9 = 0
            if (r12 == 0) goto L_0x0931
            boolean r1 = X.C16030sJ.A0L(r12)
            if (r1 == 0) goto L_0x091f
            boolean r1 = r13.A02
            if (r1 != 0) goto L_0x091f
            com.whatsapp.jid.Jid r1 = r6.A01()
            X.0rv r1 = X.C16030sJ.A00(r1)
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r1)
            if (r1 == 0) goto L_0x0931
            r9 = r1
        L_0x091f:
            boolean r2 = r13.A02
            java.lang.String r1 = r13.A01
            X.1pv r13 = new X.1pv
            r16 = r1
            r17 = r3
            r19 = r2
            r14 = r12
            r15 = r9
            r13.<init>(r14, r15, r16, r17, r19)
            r9 = r13
        L_0x0931:
            if (r10 != 0) goto L_0x0935
            X.1Vw r10 = r6.A0m
        L_0x0935:
            r12 = 0
            if (r9 == 0) goto L_0x0a89
            X.0rv r15 = r9.A01
            monitor-enter(r11)
            java.util.Set r14 = r11.A00     // Catch:{ all -> 0x0b4d }
            if (r14 != 0) goto L_0x0994
            X.0zv r13 = r11.A01     // Catch:{ all -> 0x0b4d }
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ all -> 0x0b4d }
            r14.<init>()     // Catch:{ all -> 0x0b4d }
            X.19K r1 = r13.A01     // Catch:{ all -> 0x0b4d }
            X.0tf r4 = r1.get()     // Catch:{ all -> 0x0b4d }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0b48 }
            java.lang.String r2 = "SELECT mutation_index, chat_jid FROM syncd_mutations WHERE chat_jid IS NOT NULL  AND are_dependencies_missing = 1"
            r1 = 0
            android.database.Cursor r3 = r3.A08(r2, r1)     // Catch:{ all -> 0x0b48 }
        L_0x0955:
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x0b41 }
            if (r1 == 0) goto L_0x098c
            java.lang.String r1 = "mutation_index"
            int r1 = r3.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0b41 }
            java.lang.String r16 = r3.getString(r1)     // Catch:{ all -> 0x0b41 }
            X.15i r2 = r13.A02     // Catch:{ all -> 0x0b41 }
            java.lang.String r1 = X.C28501Wi.A00(r16)     // Catch:{ all -> 0x0b41 }
            boolean r1 = r2.A02(r1)     // Catch:{ all -> 0x0b41 }
            if (r1 == 0) goto L_0x0955
            boolean r1 = X.AnonymousClass19I.A00(r16)     // Catch:{ all -> 0x0b41 }
            if (r1 == 0) goto L_0x0955
            java.lang.String r1 = "chat_jid"
            int r1 = r3.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0b41 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ all -> 0x0b41 }
            X.0rv r1 = X.C15830rv.A02(r1)     // Catch:{ all -> 0x0b41 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x0b41 }
            r14.add(r1)     // Catch:{ all -> 0x0b41 }
            goto L_0x0955
        L_0x098c:
            r3.close()     // Catch:{ all -> 0x0b48 }
            r4.close()     // Catch:{ all -> 0x0b4d }
            r11.A00 = r14     // Catch:{ all -> 0x0b4d }
        L_0x0994:
            boolean r1 = r14.contains(r15)     // Catch:{ all -> 0x0b4d }
            monitor-exit(r11)
            if (r1 == 0) goto L_0x0a89
            X.0zv r11 = r11.A01
            X.2eP r3 = new X.2eP
            r3.<init>()
            java.lang.String[] r2 = new java.lang.String[r7]
            java.lang.String r1 = r15.getRawString()
            r2[r12] = r1
            java.lang.String r1 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid == ? AND are_dependencies_missing = 1 ORDER BY _id ASC"
            java.util.List r4 = r11.A07(r3, r1, r2)
            java.util.Iterator r3 = r4.iterator()
        L_0x09b4:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0a85
            java.lang.Object r2 = r3.next()
            X.1WJ r2 = (X.AnonymousClass1WJ) r2
            boolean r1 = r2 instanceof X.C37101oc
            if (r1 == 0) goto L_0x09b4
            X.1oc r2 = (X.C37101oc) r2
            X.1Vw r1 = r2.A01
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x09b4
            r18 = 1
        L_0x09d0:
            java.util.Iterator r17 = r4.iterator()
        L_0x09d4:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0a89
            java.lang.Object r2 = r17.next()
            X.1WJ r2 = (X.AnonymousClass1WJ) r2
            boolean r14 = r2 instanceof X.C37231op
            if (r14 != 0) goto L_0x0a20
            boolean r1 = r2 instanceof X.C36811o9
            if (r1 != 0) goto L_0x0a20
            boolean r1 = r2 instanceof X.C36851oD
            if (r1 == 0) goto L_0x09d4
            r1 = r2
            X.1oD r1 = (X.C36851oD) r1
            X.1Vw r1 = r1.A02
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x09d4
            r2.A05(r12)
            java.util.Set r1 = java.util.Collections.singleton(r2)
            r11.A0G(r1)
            java.lang.String r1 = "SyncdDeleteMessageRangeHelper/checkIfMessageNeedsToBeDeleted deleteForMeMutation: deletedId = "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r9.A03
            r2.append(r1)
        L_0x0a0d:
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0w1 r1 = r0.A04
            r1.A0K(r6, r7)
            X.17f r1 = r0.A0x
            r1.A07(r6)
            goto L_0x08c7
        L_0x0a20:
            r1 = r2
            X.1oB r1 = (X.C36831oB) r1
            X.1o8 r13 = r1.ADZ()
            if (r14 == 0) goto L_0x0a31
            X.1op r2 = (X.C37231op) r2
            boolean r1 = r2.A03
            if (r1 != 0) goto L_0x0a31
            if (r18 != 0) goto L_0x09d4
        L_0x0a31:
            long r3 = r9.A00
            long r1 = r13.A00
            int r15 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r15 >= 0) goto L_0x0a5b
            java.lang.String r15 = "MessageRangeUtil/isKeyEnclosedByRange enclosed by the range"
            com.whatsapp.util.Log.i((java.lang.String) r15)
            long r15 = X.AnonymousClass19D.A00(r1, r3)
            int r1 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r1 >= 0) goto L_0x0a5b
        L_0x0a46:
            java.lang.String r1 = "SyncdDeleteMessageRangeHelper/checkIfMessageNeedsToBeDeleted: deletedId = "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r9.A03
            r2.append(r1)
            java.lang.String r1 = "; isClearChat="
            r2.append(r1)
            r2.append(r14)
            goto L_0x0a0d
        L_0x0a5b:
            java.util.Set r1 = r13.A02
            boolean r4 = r1.contains(r9)
            java.util.Set r1 = r13.A03
            boolean r3 = r1.contains(r9)
            if (r4 != 0) goto L_0x0a6b
            if (r3 == 0) goto L_0x09d4
        L_0x0a6b:
            java.lang.String r1 = "MessageRangeUtil/isKeyEnclosedByRange messageRangeContains:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r4)
            java.lang.String r1 = " messagesWithoutTimestampContains:"
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x0a46
        L_0x0a85:
            r18 = 0
            goto L_0x09d0
        L_0x0a89:
            boolean r1 = r6.A0e
            if (r1 == 0) goto L_0x0aa2
            X.1Se r3 = r0.A15
            r1 = 5
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r2 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r2.<init>(r0, r1, r6)
            java.util.concurrent.ThreadPoolExecutor r1 = r3.A01
            if (r1 != 0) goto L_0x0a9d
            X.16P r1 = r3.A00
            java.util.concurrent.ThreadPoolExecutor r1 = r1.A00
        L_0x0a9d:
            r1.execute(r2)
            goto L_0x08c7
        L_0x0aa2:
            int r1 = r6.A00()
            if (r1 != 0) goto L_0x0acf
            java.lang.String r3 = r6.A0T
            if (r3 == 0) goto L_0x0acf
            X.0z2 r1 = r0.A0e
            X.0xd r2 = r1.A05
            java.lang.String r1 = r2.A06
            if (r1 != 0) goto L_0x0abd
            monitor-enter(r2)
            java.lang.String r1 = r2.A06     // Catch:{ all -> 0x0b50 }
            if (r1 != 0) goto L_0x0abc
            r2.A03()     // Catch:{ all -> 0x0b50 }
        L_0x0abc:
            monitor-exit(r2)     // Catch:{ all -> 0x0b50 }
        L_0x0abd:
            java.lang.String r1 = r2.A06
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0acf
            X.0t9 r2 = r0.A0i
            X.2eS r1 = new X.2eS
            r1.<init>()
            r2.A06(r1)
        L_0x0acf:
            java.util.Set r3 = r0.A1C
            monitor-enter(r3)
            boolean r1 = r8.isEmpty()     // Catch:{ all -> 0x0b53 }
            if (r1 != 0) goto L_0x0afd
            boolean r1 = r3.contains(r8)     // Catch:{ all -> 0x0b53 }
            if (r1 == 0) goto L_0x0afd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b53 }
            r2.<init>()     // Catch:{ all -> 0x0b53 }
            java.lang.String r1 = "messagingXmppHandler/onMessageForMe message in queue; skipping id:"
            r2.append(r1)     // Catch:{ all -> 0x0b53 }
            java.lang.String r1 = "id"
            java.lang.Object r1 = r8.get(r1)     // Catch:{ all -> 0x0b53 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0b53 }
            r2.append(r1)     // Catch:{ all -> 0x0b53 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0b53 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0b53 }
        L_0x0afa:
            monitor-exit(r3)     // Catch:{ all -> 0x0b53 }
            goto L_0x08c7
        L_0x0afd:
            boolean r1 = r8.isEmpty()     // Catch:{ all -> 0x0b53 }
            if (r1 != 0) goto L_0x0b06
            r3.add(r8)     // Catch:{ all -> 0x0b53 }
        L_0x0b06:
            int r1 = r0.A00     // Catch:{ all -> 0x0b53 }
            int r1 = r1 + 1
            r0.A00 = r1     // Catch:{ all -> 0x0b53 }
            X.11o r9 = r0.A10     // Catch:{ all -> 0x0b53 }
            long r1 = r6.A06     // Catch:{ all -> 0x0b53 }
            r4 = 0
            X.1d2 r4 = r9.A00(r4, r1)     // Catch:{ all -> 0x0b53 }
            X.1d3 r4 = (X.C30841d3) r4     // Catch:{ all -> 0x0b53 }
            if (r4 == 0) goto L_0x0b24
            int r1 = r0.A00     // Catch:{ all -> 0x0b53 }
            int r1 = r1 + -1
            long r1 = (long) r1     // Catch:{ all -> 0x0b53 }
            r4.A01 = r1     // Catch:{ all -> 0x0b53 }
            r1 = 2
            r4.A00(r1)     // Catch:{ all -> 0x0b53 }
        L_0x0b24:
            X.1Se r4 = r0.A15     // Catch:{ all -> 0x0b53 }
            r23 = 32
            com.facebook.redex.RunnableRunnableShape0S0400000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0400000_I0     // Catch:{ all -> 0x0b53 }
            r19 = r0
            r21 = r8
            r22 = r6
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0b53 }
            java.util.concurrent.ThreadPoolExecutor r1 = r4.A01     // Catch:{ all -> 0x0b53 }
            if (r1 != 0) goto L_0x0b3d
            X.16P r1 = r4.A00     // Catch:{ all -> 0x0b53 }
            java.util.concurrent.ThreadPoolExecutor r1 = r1.A00     // Catch:{ all -> 0x0b53 }
        L_0x0b3d:
            r1.execute(r2)     // Catch:{ all -> 0x0b53 }
            goto L_0x0afa
        L_0x0b41:
            r0 = move-exception
            if (r3 == 0) goto L_0x0b47
            r3.close()     // Catch:{ all -> 0x0b47 }
        L_0x0b47:
            throw r0     // Catch:{ all -> 0x0b48 }
        L_0x0b48:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0b4c }
        L_0x0b4c:
            throw r0     // Catch:{ all -> 0x0b4d }
        L_0x0b4d:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x0b50:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0b50 }
            throw r0
        L_0x0b53:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0b53 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27601Sk.AHS(android.os.Message, int):boolean");
    }
}

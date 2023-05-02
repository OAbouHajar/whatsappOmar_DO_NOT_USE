package X;

import android.content.Intent;
import android.os.ConditionVariable;
import com.facebook.redex.IDxExecutorShape280S0100000_2_I0;
import com.facebook.redex.IDxNConsumerShape153S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.obwhatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob;
import com.obwhatsapp.media.download.ExpressPathGarbageCollectWorker;
import com.obwhatsapp.media.download.service.MediaDownloadService;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

/* renamed from: X.12c  reason: invalid class name and case insensitive filesystem */
public class C209212c {
    public static final AnonymousClass00F A0x = new AnonymousClass00F(1, 60, 200);
    public long A00;
    public final ConditionVariable A01 = new ConditionVariable(true);
    public final AnonymousClass10M A02;
    public final C16300so A03;
    public final C16180sb A04;
    public final C14870pt A05;
    public final C16040sK A06;
    public final C18020w1 A07;
    public final Mp4Ops A08;
    public final AnonymousClass01Z A09;
    public final C15900s5 A0A;
    public final C17130ua A0B;
    public final C19000xb A0C;
    public final AnonymousClass1XS A0D = new AnonymousClass1XS();
    public final C16440t3 A0E;
    public final C16980tz A0F;
    public final C14730pf A0G;
    public final C16460t6 A0H;
    public final C16480t8 A0I;
    public final C19150xq A0J;
    public final AnonymousClass1HK A0K;
    public final C18030w2 A0L;
    public final C14710pd A0M;
    public final C20330zs A0N;
    public final C17680vT A0O;
    public final C18210wK A0P;
    public final C221516v A0Q;
    public final C215514n A0R;
    public final C215914r A0S;
    public final C20130zY A0T;
    public final AnonymousClass1OJ A0U;
    public final C216214u A0V;
    public final AnonymousClass1P8 A0W;
    public final AnonymousClass2C3 A0X = new AnonymousClass2C3(this);
    public final C215214k A0Y;
    public final AnonymousClass13B A0Z;
    public final AnonymousClass1QT A0a;
    public final AnonymousClass124 A0b;
    public final C17020u3 A0c;
    public final AnonymousClass1QO A0d;
    public final AnonymousClass18C A0e;
    public final C19040xf A0f;
    public final AnonymousClass116 A0g;
    public final C16220sf A0h;
    public final C18840xL A0i;
    public final C18820xJ A0j;
    public final C25791Ld A0k;
    public final C215714p A0l;
    public final C18830xK A0m;
    public final C16320sq A0n;
    public final C28831Xx A0o;
    public final AnonymousClass1QZ A0p;
    public final AnonymousClass12P A0q;
    public final HashMap A0r = new HashMap();
    public final HashMap A0s = new HashMap();
    public final HashMap A0t = new HashMap();
    public final Set A0u = new HashSet();
    public final Executor A0v;
    public final Executor A0w;

    public C209212c(AnonymousClass10M r7, C16300so r8, C16180sb r9, C14870pt r10, C16040sK r11, C18020w1 r12, Mp4Ops mp4Ops, AnonymousClass01Z r14, C15900s5 r15, C17130ua r16, C19000xb r17, C16440t3 r18, C16980tz r19, C14730pf r20, C16460t6 r21, C16480t8 r22, C19150xq r23, AnonymousClass1HK r24, C18030w2 r25, C14710pd r26, C20330zs r27, C17680vT r28, C18210wK r29, C221516v r30, C215514n r31, C215914r r32, C20130zY r33, AnonymousClass1OJ r34, C216214u r35, AnonymousClass1P8 r36, C215214k r37, AnonymousClass13B r38, AnonymousClass1QT r39, AnonymousClass124 r40, C17020u3 r41, AnonymousClass1QO r42, AnonymousClass18C r43, C19040xf r44, AnonymousClass116 r45, C16220sf r46, C18840xL r47, C18820xJ r48, C25791Ld r49, C215714p r50, C18830xK r51, C16320sq r52, AnonymousClass1QZ r53, AnonymousClass12P r54) {
        C28831Xx r3 = null;
        this.A0E = r18;
        this.A08 = mp4Ops;
        C14710pd r5 = r26;
        this.A0M = r5;
        this.A05 = r10;
        this.A06 = r11;
        this.A03 = r8;
        this.A0F = r19;
        C16320sq r4 = r52;
        this.A0n = r4;
        this.A04 = r9;
        this.A0Q = r30;
        this.A0B = r16;
        this.A02 = r7;
        this.A0b = r40;
        this.A0A = r15;
        this.A0p = r53;
        this.A0P = r29;
        this.A0G = r20;
        this.A0C = r17;
        this.A0f = r44;
        this.A0j = r48;
        this.A0L = r25;
        this.A07 = r12;
        this.A0a = r39;
        this.A0m = r51;
        this.A0W = r36;
        this.A0i = r47;
        this.A0q = r54;
        this.A0R = r31;
        this.A0H = r21;
        this.A0g = r45;
        this.A0J = r23;
        this.A0h = r46;
        this.A0U = r34;
        this.A0I = r22;
        this.A0k = r49;
        this.A0K = r24;
        this.A0V = r35;
        this.A0S = r32;
        this.A0l = r50;
        this.A0Z = r38;
        this.A0O = r28;
        this.A0N = r27;
        this.A0c = r41;
        this.A0Y = r37;
        this.A0e = r43;
        this.A09 = r14;
        this.A0T = r33;
        this.A0d = r42;
        this.A0v = new IDxExecutorShape280S0100000_2_I0(r10, 3);
        this.A0w = new IDxExecutorShape280S0100000_2_I0(r4, 2);
        C16620tM r1 = C16620tM.A02;
        this.A0o = r5.A03(r1, 776) > 0 ? new C28831Xx(r4, r5.A03(r1, 776), false) : r3;
    }

    public static final void A00(C30761cu r4, C16730tY r5, boolean z2) {
        Boolean bool;
        boolean z3;
        String str;
        byte[] bArr;
        Integer num;
        Integer num2;
        Long l2;
        String str2;
        Integer num3;
        Integer num4;
        Integer num5;
        Long l3;
        Long l4;
        Integer num6;
        Integer num7;
        Integer num8;
        String str3;
        Long l5;
        Integer num9;
        Integer num10;
        byte[] bArr2;
        String str4;
        Boolean bool2;
        synchronized (r5) {
            C16750ta r2 = r5.A02;
            AnonymousClass00B.A06(r2);
            C31701et A012 = r4.A01();
            AnonymousClass00B.A06(A012);
            r2.A0Z = false;
            r2.A0Y = false;
            r2.A0X = false;
            r2.A0W = false;
            synchronized (r4) {
                bool = r4.A04;
            }
            if (bool != null) {
                synchronized (r4) {
                    bool2 = r4.A04;
                }
                r2.A0L = bool2.booleanValue();
            }
            if (r4.A04() != null) {
                r2.A0P = r4.A04().booleanValue();
            }
            synchronized (r4) {
                z3 = r4.A0I;
            }
            if (z3) {
                if (r5.A12() != null) {
                    r5.A12().A01();
                }
                r2.A0K = null;
                r2.A0J = null;
            }
            r2.A07 = r4.A00();
            synchronized (r4) {
                str = r4.A0F;
            }
            if (str != null) {
                synchronized (r4) {
                    str4 = r4.A0F;
                }
                r2.A0I = str4;
            }
            synchronized (r4) {
                bArr = r4.A0K;
            }
            if (bArr != null) {
                C38641rB r1 = (C38641rB) r5;
                synchronized (r4) {
                    bArr2 = r4.A0K;
                }
                r1.A02 = AnonymousClass1XO.A00(bArr2);
            }
            synchronized (r4) {
                num = r4.A09;
            }
            if (num != null) {
                synchronized (r4) {
                    num10 = r4.A09;
                }
                r2.A02 = num10.intValue();
            }
            synchronized (r4) {
                num2 = r4.A0A;
            }
            if (num2 != null) {
                synchronized (r4) {
                    num9 = r4.A0A;
                }
                r2.A03 = num9.intValue();
            }
            synchronized (r4) {
                l2 = r4.A0D;
            }
            if (l2 != null) {
                synchronized (r4) {
                    l5 = r4.A0D;
                }
                r2.A09 = l5.longValue();
            }
            synchronized (r4) {
                str2 = r4.A0G;
            }
            if (str2 != null) {
                synchronized (r4) {
                    str3 = r4.A0G;
                }
                r2.A0G = str3;
            }
            synchronized (r4) {
                num3 = r4.A07;
            }
            if (num3 != null) {
                synchronized (r4) {
                    num8 = r4.A07;
                }
                r2.A01 = num8.intValue();
            }
            if (!z2 || A012.A01 == 0) {
                synchronized (r4) {
                    num4 = r4.A0C;
                }
                if (num4 != null) {
                    synchronized (r4) {
                        num7 = r4.A0C;
                    }
                    r2.A08 = num7.intValue();
                }
                synchronized (r4) {
                    num5 = r4.A0B;
                }
                if (num5 != null) {
                    synchronized (r4) {
                        num6 = r4.A0B;
                    }
                    r2.A06 = num6.intValue();
                }
                synchronized (r4) {
                    l3 = r4.A0E;
                }
                if (l3 != null) {
                    synchronized (r4) {
                        l4 = r4.A0E;
                    }
                    r2.A0A = l4.longValue();
                }
                if (!(r5.A0F() == null || r4.A0G() == null)) {
                    r5.A0F().A02(r4.A0G());
                }
            }
        }
    }

    public static /* synthetic */ void A01(C209212c r6, C38241qT r7) {
        String str;
        String str2 = r7.A0E;
        File file = r7.A0B;
        if (file == null) {
            str = "mediadownloadmanager/scheduleExpressPathFileCleanUp encrypted file is null";
        } else if (str2 == null) {
            str = "mediadownloadmanager/scheduleExpressPathFileCleanUp encrypted file hash is null";
        } else {
            C006903e r5 = new C006903e(ExpressPathGarbageCollectWorker.class);
            C007103g r4 = new C007103g();
            String absolutePath = file.getAbsolutePath();
            Map map = r4.A00;
            map.put("file_path", absolutePath);
            map.put("end_hash", str2);
            r5.A00.A0B = r4.A00();
            r5.A02(5, TimeUnit.MINUTES);
            ((AnonymousClass022) r6.A0q.get()).A06(AnonymousClass03z.KEEP, (AnonymousClass043) r5.A00(), str2);
            return;
        }
        Log.e(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0325, code lost:
        if (r3.A13 != -1) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0209, code lost:
        if (r0 != 12) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021d, code lost:
        if (r3.A0F().A04() == false) goto L_0x021f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30701co A02(X.C38331qc r98, X.C16730tY r99, int r100, long r101, boolean r103, boolean r104) {
        /*
            r97 = this;
            r3 = r99
            X.0ta r5 = r3.A02
            r16 = 0
            if (r5 != 0) goto L_0x0029
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS unable to download due to missing media data; message.key="
        L_0x000f:
            r1.append(r0)
            X.1Vw r0 = r3.A11
            r1.append(r0)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r3.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0028:
            return r16
        L_0x0029:
            boolean r0 = r5.A0P
            if (r0 == 0) goto L_0x0039
            boolean r0 = r5.A0W
            if (r0 != 0) goto L_0x0039
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS download already completed; message.key="
            goto L_0x000f
        L_0x0039:
            r2 = r97
            X.1P8 r0 = r2.A0W
            r96 = r0
            X.1co r11 = r0.A00(r5)
            boolean r0 = r5.A0Z
            r1 = 0
            r10 = r98
            r7 = r100
            r56 = r104
            if (r0 == 0) goto L_0x006b
            if (r11 == 0) goto L_0x006b
            if (r104 != 0) goto L_0x0054
            r11.A05 = r1
        L_0x0054:
            int r0 = r11.A0u
            if (r7 >= r0) goto L_0x0063
            r5.A0X = r1
            r11.A0u = r7
            X.1cs r1 = r11.A0c
            monitor-enter(r1)
            r1.A00 = r7     // Catch:{ all -> 0x03c6 }
            goto L_0x0383
        L_0x0063:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS download already in progress (according to media data); message.key="
            goto L_0x000f
        L_0x006b:
            int r1 = r5.A07
            r0 = 1
            if (r1 != r0) goto L_0x0078
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS media has been marked suspicious; message.key="
            goto L_0x000f
        L_0x0078:
            java.lang.String r0 = r5.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0089
            java.lang.String r0 = r3.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00eb
        L_0x0089:
            X.0rv r0 = r3.A0B()
            boolean r0 = X.C16030sJ.A0P(r0)
            if (r0 != 0) goto L_0x00eb
            X.0pd r6 = r2.A0M
            r1 = 715(0x2cb, float:1.002E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r6.A0E(r0, r1)
            if (r0 == 0) goto L_0x00eb
            X.00F r0 = A0x
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00d8
            X.0so r7 = r2.A03
            java.lang.String r6 = "MediaDownloadManager/createMediaDownloadForFMessage"
            java.lang.String r0 = "createMediaDownloadForFMessage/direct_path is "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = "null"
        L_0x00bc:
            r1.append(r0)
            java.lang.String r0 = " encHash is "
            r1.append(r0)
            java.lang.String r0 = r3.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = "null"
        L_0x00ce:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.AcB(r6, r0, r4)
        L_0x00d8:
            java.util.concurrent.Executor r2 = r2.A0v
            r1 = 36
            com.facebook.redex.RunnableRunnableShape10S0100000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape10S0100000_I0_9
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.execute(r0)
            return r16
        L_0x00e5:
            java.lang.String r0 = "not null"
            goto L_0x00ce
        L_0x00e8:
            java.lang.String r0 = "not null"
            goto L_0x00bc
        L_0x00eb:
            X.0pt r0 = r2.A05
            r95 = r0
            r22 = 9
            com.facebook.redex.RunnableRunnableShape0S0301000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0301000_I0
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r5
            r21 = r7
            r17.<init>(r18, r19, r20, r21, r22)
            r0.Acq(r1)
            X.2C3 r6 = r2.A0X
            monitor-enter(r6)
            X.1Vw r9 = r3.A11     // Catch:{ all -> 0x041d }
            boolean r0 = r6.containsKey(r9)     // Catch:{ all -> 0x041d }
            if (r0 != 0) goto L_0x0338
            X.0pd r0 = r2.A0M     // Catch:{ all -> 0x041d }
            r31 = r0
            X.0sb r0 = r2.A04     // Catch:{ all -> 0x041d }
            r94 = r0
            X.0w2 r14 = r2.A0L     // Catch:{ all -> 0x041d }
            X.0sf r0 = r2.A0h     // Catch:{ all -> 0x041d }
            r44 = r0
            X.1QO r12 = r2.A0d     // Catch:{ all -> 0x041d }
            X.0ta r4 = r3.A02     // Catch:{ all -> 0x041d }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x041d }
            boolean r0 = X.C40541uI.A03(r3)     // Catch:{ all -> 0x041d }
            if (r0 == 0) goto L_0x012c
            r78 = 3
            goto L_0x0138
        L_0x012c:
            r0 = r31
            boolean r0 = X.AnonymousClass20C.A01(r0, r3)     // Catch:{ all -> 0x041d }
            r78 = 1
            if (r0 == 0) goto L_0x0138
            r78 = 2
        L_0x0138:
            X.0rv r0 = r9.A00     // Catch:{ all -> 0x041d }
            r30 = r0
            boolean r84 = X.C16030sJ.A0Q(r30)     // Catch:{ all -> 0x041d }
            java.lang.String r0 = r4.A0I     // Catch:{ all -> 0x041d }
            if (r0 != 0) goto L_0x014e
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x041d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x041d }
            r4.A0I = r0     // Catch:{ all -> 0x041d }
        L_0x014e:
            boolean r86 = X.C16030sJ.A0K(r30)     // Catch:{ all -> 0x041d }
            boolean r0 = r3 instanceof X.C39001rl     // Catch:{ all -> 0x041d }
            r28 = r0
            byte r11 = r3.A10     // Catch:{ all -> 0x041d }
            int r0 = r3.A08     // Catch:{ all -> 0x041d }
            X.1XK r59 = X.C31831f6.A01(r11, r0)     // Catch:{ all -> 0x041d }
            java.lang.String r1 = r3.A04     // Catch:{ all -> 0x041d }
            java.lang.String r0 = r3.A05     // Catch:{ all -> 0x041d }
            java.lang.String r13 = r3.A08     // Catch:{ all -> 0x041d }
            r23 = 0
            r17 = r94
            r18 = r59
            r19 = r1
            r20 = r0
            r21 = r13
            r22 = r86
            java.io.File r62 = r17.A0D(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x041d }
            r22 = 0
            r19 = r0
            r20 = r13
            r21 = r86
            r23 = r28
            java.io.File r61 = r17.A0E(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x041d }
            if (r13 == 0) goto L_0x0192
            java.lang.String r0 = "static.whatsapp.net/downloadable?category=PSA"
            boolean r0 = r13.contains(r0)     // Catch:{ all -> 0x041d }
            if (r0 == 0) goto L_0x0192
            r79 = 2
            goto L_0x01b2
        L_0x0192:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x041d }
            if (r0 != 0) goto L_0x01b0
            r8 = 715(0x2cb, float:1.002E-42)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ all -> 0x041d }
            r0 = r31
            boolean r0 = r0.A0E(r1, r8)     // Catch:{ all -> 0x041d }
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = r4.A0G     // Catch:{ all -> 0x041d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x041d }
            if (r0 == 0) goto L_0x01ad
            goto L_0x01b0
        L_0x01ad:
            r79 = 0
            goto L_0x01b2
        L_0x01b0:
            r79 = 1
        L_0x01b2:
            int r0 = r4.A04     // Catch:{ all -> 0x041d }
            r27 = r0
            byte[] r0 = r4.A0R     // Catch:{ all -> 0x041d }
            r26 = r0
            java.io.File r0 = r4.A0F     // Catch:{ all -> 0x041d }
            r25 = r0
            long r0 = r3.A01     // Catch:{ all -> 0x041d }
            r23 = r0
            int r0 = r3.A00     // Catch:{ all -> 0x041d }
            long r0 = (long) r0     // Catch:{ all -> 0x041d }
            r21 = r0
            X.1y4 r1 = r3.A12()     // Catch:{ all -> 0x041d }
            X.2C7 r15 = new X.2C7     // Catch:{ all -> 0x041d }
            r15.<init>(r1, r12)     // Catch:{ all -> 0x041d }
            java.lang.String r0 = r3.A05     // Catch:{ all -> 0x041d }
            r20 = r0
            java.lang.String r65 = r3.A14()     // Catch:{ all -> 0x041d }
            java.lang.String r0 = r4.A0I     // Catch:{ all -> 0x041d }
            r19 = r0
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x041d }
            r18 = r0
            java.lang.String r0 = r3.A06     // Catch:{ all -> 0x041d }
            r17 = r0
            java.lang.String r0 = r4.A0G     // Catch:{ all -> 0x041d }
            r12 = r0
            int r8 = r3.A08     // Catch:{ all -> 0x041d }
            r0 = r44
            int r76 = X.AnonymousClass1A9.A0O(r3, r0)     // Catch:{ all -> 0x041d }
            int r77 = X.C18020w1.A02(r14, r3)     // Catch:{ all -> 0x041d }
            X.0rv r0 = r3.A0B()     // Catch:{ all -> 0x041d }
            boolean r85 = X.C16030sJ.A0P(r0)     // Catch:{ all -> 0x041d }
            int r0 = r3.A0C     // Catch:{ all -> 0x041d }
            r1 = 11
            r88 = 1
            if (r0 == r1) goto L_0x020b
            r88 = 0
            r1 = 12
            r89 = 1
            if (r0 == r1) goto L_0x020d
        L_0x020b:
            r89 = 0
        L_0x020d:
            X.0tm r0 = r3.A0F()     // Catch:{ all -> 0x041d }
            if (r0 == 0) goto L_0x021f
            X.0tm r0 = r3.A0F()     // Catch:{ all -> 0x041d }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x041d }
            r90 = 1
            if (r0 != 0) goto L_0x0221
        L_0x021f:
            r90 = 0
        L_0x0221:
            r0 = 20
            if (r11 != r0) goto L_0x0233
            r0 = r3
            X.1rB r0 = (X.C38641rB) r0     // Catch:{ all -> 0x041d }
            boolean r0 = r0.A00     // Catch:{ all -> 0x041d }
            if (r0 != 0) goto L_0x0230
            int r0 = r4.A04     // Catch:{ all -> 0x041d }
            if (r0 <= 0) goto L_0x0233
        L_0x0230:
            r91 = 1
            goto L_0x0235
        L_0x0233:
            r91 = 0
        L_0x0235:
            byte[] r4 = r4.A0U     // Catch:{ all -> 0x041d }
            X.0ta r0 = r3.A02     // Catch:{ all -> 0x041d }
            java.lang.String r1 = r0.A0K     // Catch:{ all -> 0x041d }
            X.1qT r0 = new X.1qT     // Catch:{ all -> 0x041d }
            r87 = 0
            r93 = 0
            r57 = r0
            r58 = r30
            r60 = r25
            r63 = r13
            r64 = r20
            r66 = r19
            r67 = r18
            r68 = r17
            r69 = r12
            r70 = r1
            r71 = r15
            r72 = r26
            r73 = r4
            r74 = r27
            r75 = r8
            r80 = r23
            r82 = r21
            r92 = r28
            r57.<init>(r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r82, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93)     // Catch:{ all -> 0x041d }
            X.0t3 r1 = r2.A0E     // Catch:{ all -> 0x041d }
            r27 = r1
            com.whatsapp.Mp4Ops r1 = r2.A08     // Catch:{ all -> 0x041d }
            r24 = r1
            X.0tz r1 = r2.A0F     // Catch:{ all -> 0x041d }
            r28 = r1
            X.0so r1 = r2.A03     // Catch:{ all -> 0x041d }
            r58 = r1
            X.0sq r1 = r2.A0n     // Catch:{ all -> 0x041d }
            r49 = r1
            X.0ua r1 = r2.A0B     // Catch:{ all -> 0x041d }
            r26 = r1
            X.10M r1 = r2.A02     // Catch:{ all -> 0x041d }
            r57 = r1
            X.0s5 r1 = r2.A0A     // Catch:{ all -> 0x041d }
            r25 = r1
            X.1QZ r1 = r2.A0p     // Catch:{ all -> 0x041d }
            r50 = r1
            X.0wK r1 = r2.A0P     // Catch:{ all -> 0x041d }
            r34 = r1
            X.0pf r1 = r2.A0G     // Catch:{ all -> 0x041d }
            r29 = r1
            X.0xf r1 = r2.A0f     // Catch:{ all -> 0x041d }
            r43 = r1
            X.0xJ r1 = r2.A0j     // Catch:{ all -> 0x041d }
            r46 = r1
            X.0w1 r1 = r2.A07     // Catch:{ all -> 0x041d }
            r23 = r1
            X.1QT r1 = r2.A0a     // Catch:{ all -> 0x041d }
            r41 = r1
            X.0xK r1 = r2.A0m     // Catch:{ all -> 0x041d }
            r48 = r1
            X.0xL r1 = r2.A0i     // Catch:{ all -> 0x041d }
            r22 = r1
            X.12P r1 = r2.A0q     // Catch:{ all -> 0x041d }
            r21 = r1
            X.14n r1 = r2.A0R     // Catch:{ all -> 0x041d }
            r20 = r1
            X.0t8 r1 = r2.A0I     // Catch:{ all -> 0x041d }
            r19 = r1
            X.1OJ r1 = r2.A0U     // Catch:{ all -> 0x041d }
            r18 = r1
            X.14u r1 = r2.A0V     // Catch:{ all -> 0x041d }
            r17 = r1
            X.14r r15 = r2.A0S     // Catch:{ all -> 0x041d }
            X.14p r14 = r2.A0l     // Catch:{ all -> 0x041d }
            X.0vT r13 = r2.A0O     // Catch:{ all -> 0x041d }
            X.0zs r12 = r2.A0N     // Catch:{ all -> 0x041d }
            X.0u3 r8 = r2.A0c     // Catch:{ all -> 0x041d }
            android.os.ConditionVariable r4 = r2.A01     // Catch:{ all -> 0x041d }
            X.0zY r1 = r2.A0T     // Catch:{ all -> 0x041d }
            if (r84 == 0) goto L_0x02d3
            r53 = 3
            goto L_0x02e2
        L_0x02d3:
            boolean r11 = X.C16030sJ.A0L(r30)     // Catch:{ all -> 0x041d }
            if (r11 == 0) goto L_0x02dc
            r53 = 2
            goto L_0x02e2
        L_0x02dc:
            r53 = 1
            if (r86 == 0) goto L_0x02e2
            r53 = 6
        L_0x02e2:
            X.1co r11 = new X.1co     // Catch:{ all -> 0x041d }
            r54 = r101
            r30 = r19
            r32 = r12
            r33 = r13
            r35 = r20
            r36 = r15
            r37 = r1
            r38 = r18
            r39 = r17
            r40 = r0
            r42 = r8
            r45 = r22
            r47 = r14
            r51 = r21
            r52 = r7
            r17 = r11
            r18 = r4
            r19 = r57
            r20 = r58
            r21 = r94
            r22 = r95
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r56)     // Catch:{ all -> 0x041d }
            int r7 = r3.A08()     // Catch:{ all -> 0x041d }
            r4 = 2
            r1 = 0
            if (r7 != r4) goto L_0x031a
            r1 = 1
        L_0x031a:
            if (r86 != 0) goto L_0x0327
            if (r1 != 0) goto L_0x0327
            long r7 = r3.A13     // Catch:{ all -> 0x041d }
            r12 = -1
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            r1 = 0
            if (r4 == 0) goto L_0x0328
        L_0x0327:
            r1 = 1
        L_0x0328:
            X.AnonymousClass00B.A0G(r1)     // Catch:{ all -> 0x041d }
            r6.put(r9, r3)     // Catch:{ all -> 0x041d }
            r1 = r96
            java.util.HashMap r1 = r1.A00     // Catch:{ all -> 0x041d }
            monitor-enter(r1)     // Catch:{ all -> 0x041d }
            r1.put(r5, r11)     // Catch:{ all -> 0x03c9 }
            monitor-exit(r1)     // Catch:{ all -> 0x03c9 }
            goto L_0x033b
        L_0x0338:
            r0 = r16
            r11 = r0
        L_0x033b:
            monitor-exit(r6)     // Catch:{ all -> 0x041d }
            r5 = r103
            if (r103 == 0) goto L_0x034f
            X.0xq r7 = r2.A0J
            r6 = -1
            r1 = 28
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r4.<init>((java.lang.Object) r7, (int) r6, (java.lang.Object) r3, (int) r1)
            r1 = r95
            r1.A0K(r4)
        L_0x034f:
            if (r11 == 0) goto L_0x03c5
            java.lang.String r1 = r3.A05
            r17 = r2
            r18 = r10
            r19 = r11
            r20 = r0
            r21 = r3
            r22 = r1
            r23 = r5
            boolean r1 = r17.A0C(r18, r19, r20, r21, r22, r23)
            if (r1 == 0) goto L_0x03cc
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS existing download with hash for message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r9)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r3.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r16
        L_0x0383:
            monitor-exit(r1)
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS existing download upgraded to "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = "; message.key="
            r1.append(r0)
            X.1Vw r0 = r3.A11
            r1.append(r0)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r3.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0pt r6 = r2.A05
            X.0xq r5 = r2.A0J
            r4 = -1
            r1 = 28
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r0.<init>((java.lang.Object) r5, (int) r4, (java.lang.Object) r3, (int) r1)
            r6.A0K(r0)
            if (r100 != 0) goto L_0x0028
            boolean r0 = r2.A0D(r3)
            if (r0 == 0) goto L_0x0028
            if (r98 == 0) goto L_0x03c5
            r11.A4Z(r10)
        L_0x03c5:
            return r11
        L_0x03c6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x03c9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03c9 }
            throw r0     // Catch:{ all -> 0x041d }
        L_0x03cc:
            if (r98 == 0) goto L_0x03d1
            r11.A4Z(r10)
        L_0x03d1:
            r1 = 16
            com.facebook.redex.IDxNConsumerShape153S0100000_2_I0 r4 = new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0
            r4.<init>(r3, r1)
            java.util.concurrent.Executor r7 = r2.A0v
            X.1XS r1 = r11.A0L
            r1.A03(r4, r7)
            r1 = 8
            com.facebook.redex.IDxNConsumerShape39S0200000_2_I0 r4 = new com.facebook.redex.IDxNConsumerShape39S0200000_2_I0
            r4.<init>(r3, r1, r2)
            X.1XS r1 = r11.A0J
            r1.A03(r4, r7)
            if (r103 == 0) goto L_0x0405
            r1 = 7
            com.facebook.redex.IDxNConsumerShape39S0200000_2_I0 r6 = new com.facebook.redex.IDxNConsumerShape39S0200000_2_I0
            r6.<init>(r3, r1, r2)
            java.util.concurrent.Executor r4 = r2.A0w
            X.1XS r1 = r11.A0I
            r1.A03(r6, r4)
            r1 = 6
            com.facebook.redex.IDxNConsumerShape17S0300000_2_I0 r4 = new com.facebook.redex.IDxNConsumerShape17S0300000_2_I0
            r4.<init>(r3, r2, r0, r1)
            X.1XS r1 = r11.A0K
            r1.A03(r4, r7)
        L_0x0405:
            r1 = 6
            com.facebook.redex.IDxNConsumerShape39S0200000_2_I0 r4 = new com.facebook.redex.IDxNConsumerShape39S0200000_2_I0
            r4.<init>(r3, r1, r2)
            X.1XS r1 = r11.A0H
            r1.A03(r4, r7)
            X.2C8 r4 = new X.2C8
            r4.<init>(r2, r0, r3, r5)
            java.util.concurrent.Executor r1 = r2.A0w
            X.1XS r0 = r11.A0G
            r0.A03(r4, r1)
            return r11
        L_0x041d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x041d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209212c.A02(X.1qc, X.0tY, int, long, boolean, boolean):X.1co");
    }

    public C30701co A03(C16730tY r4) {
        C30731cr r1;
        HashMap hashMap = this.A0s;
        synchronized (hashMap) {
            r1 = (C30731cr) hashMap.get(r4.A05);
        }
        if (r1 instanceof C30701co) {
            return (C30701co) r1;
        }
        return null;
    }

    public Collection A04() {
        ArrayList arrayList;
        AnonymousClass2C3 r2 = this.A0X;
        synchronized (r2) {
            arrayList = new ArrayList(r2.values());
        }
        return arrayList;
    }

    public void A05() {
        synchronized (this.A0X) {
            for (C16730tY A0B2 : A04()) {
                A0B(A0B2, true, true);
            }
        }
    }

    public final void A06() {
        Collection<C16730tY> A042 = A04();
        ArrayList arrayList = new ArrayList();
        for (C16730tY r1 : A042) {
            if (A0E(r1)) {
                arrayList.add(r1);
            }
        }
        this.A0D.A04(arrayList);
    }

    public void A07(C38331qc r15, C16730tY r16, int i2) {
        C30731cr r2;
        C30701co r22;
        C16730tY r8 = r16;
        C30701co A022 = A02(r15, r8, i2, -1, true, false);
        if (A022 != null) {
            if (r8.A04 != null && this.A0M.A0E(C16620tM.A01, 1539)) {
                String str = r8.A04;
                HashMap hashMap = this.A0t;
                synchronized (hashMap) {
                    r2 = (C30731cr) hashMap.get(str);
                }
                if ((r2 instanceof C30701co) && (r22 = (C30701co) r2) != null) {
                    StringBuilder sb = new StringBuilder("mediaDownloadManager/startDownloadImmediately cancel existing express path download ");
                    sb.append(r22);
                    Log.i(sb.toString());
                    r22.A64(true);
                }
            }
            StringBuilder sb2 = new StringBuilder("MediaDownloadManager/start manual download ");
            sb2.append(r8.A11);
            sb2.append(", message.mediaHash=");
            sb2.append(r8.A05);
            Log.i(sb2.toString());
            if (A0E(r8)) {
                this.A0g.A03(this.A0F.A00, new Intent("com.obwhatsapp.media.download.service.MediaDownloadService.DOWNLOAD_STARTED"), MediaDownloadService.class);
                A06();
            }
            C28831Xx r0 = this.A0o;
            if (r0 != null) {
                r0.execute(A022);
            } else {
                this.A0n.Acl(A022);
            }
        }
    }

    public void A08(C38331qc r13, C16730tY r14, int i2, long j2, boolean z2, boolean z3) {
        C30731cr r8;
        C30701co r82;
        C30701co A022 = A02(r13, r14, i2, j2, z2, z3);
        if (A022 != null) {
            StringBuilder sb = new StringBuilder("MediaDownloadManager/queueDownload auto download ");
            sb.append(r14.A11);
            sb.append(", message.mediaHash=");
            sb.append(r14.A05);
            Log.i(sb.toString());
            if (r14.A04 != null && this.A0M.A0E(C16620tM.A01, 1539)) {
                String str = r14.A04;
                HashMap hashMap = this.A0t;
                synchronized (hashMap) {
                    r8 = (C30731cr) hashMap.get(str);
                }
                if ((r8 instanceof C30701co) && (r82 = (C30701co) r8) != null) {
                    r82.A0J.A03(new IDxNConsumerShape153S0100000_2_I0(A022, 15), (Executor) null);
                    A022.A00.A03(new IDxNConsumerShape153S0100000_2_I0(r82, 14), this.A0w);
                    this.A0n.Acl(new RunnableRunnableShape0S0400000_I0(this, r82, A022, r14, 28));
                    return;
                }
            }
            this.A0Y.A01(A022, r14);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r5.A01 != r2.A00) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r2.A01().A02 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C30761cu r19, X.C38241qT r20, X.C16730tY r21, boolean r22) {
        /*
            r18 = this;
            r0 = r21
            monitor-enter(r0)
            X.0ta r4 = r0.A02     // Catch:{ all -> 0x00e1 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x00e1 }
            r2 = r19
            X.1et r7 = r2.A01()     // Catch:{ all -> 0x00e1 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x00e1 }
            r3 = r18
            if (r22 == 0) goto L_0x0019
            int r1 = r7.A01     // Catch:{ all -> 0x00e1 }
            if (r1 != 0) goto L_0x00c2
        L_0x0019:
            java.io.File r1 = r2.A03()     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x00c2
            java.io.File r1 = r2.A03()     // Catch:{ all -> 0x00e1 }
            r4.A0F = r1     // Catch:{ all -> 0x00e1 }
            r5 = r20
            if (r22 == 0) goto L_0x0030
            int r6 = r5.A01     // Catch:{ all -> 0x00e1 }
            int r1 = r2.A00     // Catch:{ all -> 0x00e1 }
            r8 = 1
            if (r6 == r1) goto L_0x0031
        L_0x0030:
            r8 = 0
        L_0x0031:
            X.1et r1 = r2.A01()     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0040
            X.1et r1 = r2.A01()     // Catch:{ all -> 0x00e1 }
            java.io.File r1 = r1.A02     // Catch:{ all -> 0x00e1 }
            r6 = 1
            if (r1 != 0) goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            if (r22 == 0) goto L_0x0086
            if (r8 != 0) goto L_0x0086
            if (r6 != 0) goto L_0x0086
            boolean r14 = r5.A0U     // Catch:{ all -> 0x00e1 }
            boolean r15 = r5.A0P     // Catch:{ all -> 0x00e1 }
            boolean r6 = r5.A0S     // Catch:{ all -> 0x00e1 }
            boolean r1 = r5.A0W     // Catch:{ all -> 0x00e1 }
            X.1XK r9 = r5.A09     // Catch:{ all -> 0x00e1 }
            int r12 = r5.A04     // Catch:{ all -> 0x00e1 }
            int r13 = r5.A01     // Catch:{ all -> 0x00e1 }
            java.lang.String r10 = r5.A0I     // Catch:{ all -> 0x00e1 }
            java.lang.String r11 = r7.A03     // Catch:{ all -> 0x00e1 }
            java.lang.String r7 = r5.A0J     // Catch:{ all -> 0x00e1 }
            if (r11 != 0) goto L_0x0066
            if (r7 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r11 = 0
            goto L_0x0066
        L_0x0062:
            java.lang.String r11 = X.AnonymousClass1XI.A08(r7)     // Catch:{ all -> 0x00e1 }
        L_0x0066:
            X.0sb r7 = r3.A04     // Catch:{ all -> 0x00e1 }
            X.0u3 r8 = r3.A0c     // Catch:{ all -> 0x00e1 }
            r16 = r6
            r17 = r1
            java.io.File r1 = X.C17970vw.A0D(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00e1 }
            r4.A0F = r1     // Catch:{ all -> 0x00e1 }
            r1.getAbsolutePath()     // Catch:{ all -> 0x00e1 }
            java.io.File r6 = r2.A03()     // Catch:{ IOException -> 0x0083 }
            java.io.File r2 = r4.A0F     // Catch:{ IOException -> 0x0083 }
            X.0tB r1 = r7.A04     // Catch:{ IOException -> 0x0083 }
            X.AnonymousClass1XI.A0B(r1, r6, r2)     // Catch:{ IOException -> 0x0083 }
            goto L_0x00c2
        L_0x0083:
            r6 = move-exception
            r1 = 0
            goto L_0x00a7
        L_0x0086:
            java.io.File r1 = r2.A03()     // Catch:{ all -> 0x00e1 }
            r1.getAbsolutePath()     // Catch:{ all -> 0x00e1 }
            java.io.File r5 = r2.A03()     // Catch:{ all -> 0x00e1 }
            r4.A0F = r5     // Catch:{ all -> 0x00e1 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e1 }
            r5.setLastModified(r1)     // Catch:{ all -> 0x00e1 }
            if (r8 != 0) goto L_0x009e
            if (r6 == 0) goto L_0x00c2
        L_0x009e:
            X.01Z r5 = r3.A09     // Catch:{ all -> 0x00e1 }
            java.io.File r2 = r4.A0F     // Catch:{ all -> 0x00e1 }
            r1 = 1
            r5.A05(r2, r1, r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x00c2
        L_0x00a7:
            r4.A0P = r1     // Catch:{ all -> 0x00e1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r2.<init>()     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "MediaDownload/applyDownloadDataInWorkerThread/MMS download failed to copy file to duplicate download; mediaHash = "
            r2.append(r1)     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = r5.A0F     // Catch:{ all -> 0x00e1 }
            r2.append(r1)     // Catch:{ all -> 0x00e1 }
            r2.append(r6)     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00e1 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x00e1 }
        L_0x00c2:
            java.util.Set r2 = r3.A0u     // Catch:{ all -> 0x00e1 }
            monitor-enter(r2)     // Catch:{ all -> 0x00e1 }
            X.1Vw r1 = r0.A11     // Catch:{ all -> 0x00de }
            boolean r1 = r2.remove(r1)     // Catch:{ all -> 0x00de }
            monitor-exit(r2)     // Catch:{ all -> 0x00de }
            if (r1 == 0) goto L_0x00dc
            java.io.File r2 = r4.A0F     // Catch:{ all -> 0x00e1 }
            if (r2 == 0) goto L_0x00dc
            X.01Z r1 = r3.A09     // Catch:{ all -> 0x00e1 }
            byte r3 = r0.A10     // Catch:{ all -> 0x00e1 }
            r4 = 1
            r6 = 0
            r5 = 1
            r1.A00(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00e1 }
        L_0x00dc:
            monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
            return
        L_0x00de:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00de }
            throw r1     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209212c.A09(X.1cu, X.1qT, X.0tY, boolean):void");
    }

    public final void A0A(C16730tY r4, int i2, boolean z2) {
        if (z2) {
            if (C42941yx.A02(r4)) {
                this.A0C.A00(new ProcessVCardMessageJob(r4));
                this.A0J.A08(r4, 20);
            }
            C16460t6 r2 = this.A0H;
            int i3 = 3;
            if (i2 == 13) {
                i3 = -1;
            }
            r2.A0e(r4, i3);
        }
    }

    public final void A0B(C16730tY r4, boolean z2, boolean z3) {
        C30731cr r2;
        HashMap hashMap = this.A0s;
        synchronized (hashMap) {
            r2 = (C30731cr) hashMap.get(r4.A05);
        }
        if (r2 != null) {
            StringBuilder sb = new StringBuilder("MediaDownloadManager/cancelDownload/message.key=");
            sb.append(r4.A11);
            sb.append(", message.mediaHash=");
            sb.append(r4.A05);
            Log.i(sb.toString());
            r2.A64(z3);
        }
        this.A0Y.A05(r4);
        if (z2) {
            Set set = this.A0u;
            synchronized (set) {
                set.add(r4.A11);
            }
        }
    }

    public boolean A0C(C38331qc r10, C30731cr r11, C38241qT r12, C16730tY r13, String str, boolean z2) {
        C30701co A032;
        HashMap hashMap = this.A0s;
        synchronized (hashMap) {
            if (((C30731cr) hashMap.get(str)) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("MediaDownloadManager/addAndDedupeDownload/No existing regular MMS download in progress, creating new download instance for mediaHash=");
                sb.append(str);
                Log.i(sb.toString());
                hashMap.put(str, r11);
                r11.A4Z(new AnonymousClass2C5(this, str));
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MediaDownloadManager/addAndDedupeDownload/MMS download already in progress (according to current downloads) mediaHash=");
            sb2.append(str);
            Log.i(sb2.toString());
            C16730tY r7 = r13;
            if (r13 != null) {
                C38241qT r6 = r12;
                if (!(r12 == null || (A032 = A03(r13)) == null)) {
                    A032.A0G.A03(new AnonymousClass2C6(r10, this, r6, r7, z2), this.A0w);
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r3.A04(r0, r5) == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r1 == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0D(X.C16730tY r5) {
        /*
            r4 = this;
            X.14k r3 = r4.A0Y
            monitor-enter(r3)
            java.util.Map r2 = r3.A01     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r2.get(r5)     // Catch:{ all -> 0x002b }
            X.1zo r0 = (X.C43321zo) r0     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0012
            boolean r1 = r0.A03     // Catch:{ all -> 0x002b }
            r0 = 1
            if (r1 != 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0018
            r1 = 0
            return r1
        L_0x0018:
            monitor-enter(r3)
            java.lang.Object r0 = r2.get(r5)     // Catch:{ all -> 0x002b }
            X.1zo r0 = (X.C43321zo) r0     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0028
            boolean r0 = r3.A04(r0, r5)     // Catch:{ all -> 0x002b }
            r1 = 1
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            monitor-exit(r3)
            return r1
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209212c.A0D(X.0tY):boolean");
    }

    public final boolean A0E(C16730tY r7) {
        C14710pd r2 = this.A0M;
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 1147) && ((r7 instanceof C38631rA) || (r7 instanceof C38711rI)) && !C16030sJ.A0Q(r7.A11.A00) && r7.A01 > ((long) r2.A03(r1, 1148)) * FileUtils.ONE_MB;
    }
}

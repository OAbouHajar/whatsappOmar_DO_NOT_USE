package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.1vi  reason: invalid class name and case insensitive filesystem */
public class C41391vi extends HandlerThread {
    public long A00;
    public C51422be A01;
    public C51552br A02;
    public C51432bf A03;
    public AnonymousClass2CU A04;
    public AnonymousClass2CW A05;
    public C41401vj A06;
    public C51542bq A07;
    public final C16570tH A08;
    public final AnonymousClass1CG A09;
    public final AnonymousClass129 A0A;
    public final C16300so A0B;
    public final C207511l A0C;
    public final C16040sK A0D;
    public final C211512z A0E;
    public final C18900xR A0F;
    public final C15900s5 A0G;
    public final C17130ua A0H;
    public final AnonymousClass1CQ A0I;
    public final C17650vQ A0J;
    public final AnonymousClass1CH A0K;
    public final C19710ys A0L;
    public final C16440t3 A0M;
    public final C16980tz A0N;
    public final C17120uZ A0O;
    public final C15860rz A0P;
    public final C16290sm A0Q;
    public final C16460t6 A0R;
    public final C16900tq A0S;
    public final C24361Fp A0T;
    public final C14710pd A0U;
    public final C226318r A0V;
    public final C16490t9 A0W;
    public final C17240ul A0X;
    public final AnonymousClass1HA A0Y;
    public final AnonymousClass1SC A0Z;
    public final C207711n A0a;
    public final AnonymousClass2CN A0b;
    public final C229219u A0c;
    public final AnonymousClass2CO A0d = new AnonymousClass2CO("connection_thread/logged_flag/connected", false);
    public final AnonymousClass2CO A0e = new AnonymousClass2CO("connection_thread/logged_flag/disconnecting", false);
    public final AnonymousClass2CO A0f = new AnonymousClass2CO("connection_thread/logged_flag/quit", false);
    public final C17190ug A0g;
    public final AnonymousClass1HL A0h;
    public final AnonymousClass17L A0i;
    public final C19790z0 A0j;
    public final AnonymousClass1S6 A0k;
    public final AnonymousClass1CP A0l;
    public final AnonymousClass1SD A0m;
    public final C207811o A0n;
    public final C207911p A0o;
    public final C18310wU A0p;
    public final C18290wS A0q;
    public final AnonymousClass168 A0r;
    public final AnonymousClass1HB A0s;
    public final AnonymousClass1S9 A0t;
    public final C46022Ca A0u;
    public final C222617g A0v;
    public final C18990xa A0w;
    public final C15960sC A0x;
    public final C229519x A0y;
    public final AnonymousClass2CY A0z;
    public final C229619y A10;
    public final Random A11;
    public final Set A12 = new HashSet(0);

    public C41391vi(C16570tH r4, AnonymousClass1CG r5, AnonymousClass129 r6, C16300so r7, C207511l r8, C16040sK r9, C211512z r10, C18900xR r11, C15900s5 r12, C17130ua r13, AnonymousClass1CQ r14, C17650vQ r15, AnonymousClass1CH r16, C19710ys r17, C16440t3 r18, C16980tz r19, C17120uZ r20, C15860rz r21, C16290sm r22, C16460t6 r23, C16900tq r24, C24361Fp r25, C14710pd r26, C226318r r27, C16490t9 r28, C17240ul r29, AnonymousClass1HA r30, AnonymousClass1SC r31, C207711n r32, AnonymousClass2CN r33, C229219u r34, C17190ug r35, AnonymousClass1HL r36, AnonymousClass17L r37, C19790z0 r38, AnonymousClass1S6 r39, AnonymousClass1CP r40, AnonymousClass1SD r41, C207811o r42, C207911p r43, C18310wU r44, C18290wS r45, AnonymousClass168 r46, AnonymousClass1HB r47, AnonymousClass1S9 r48, C46022Ca r49, C222617g r50, C18990xa r51, C15960sC r52, C229519x r53, AnonymousClass2CY r54, C229619y r55) {
        super("ConnectionThread", 1);
        this.A0b = r33;
        this.A0N = r19;
        this.A0M = r18;
        this.A0U = r26;
        this.A0T = r25;
        this.A0B = r7;
        this.A0D = r9;
        this.A0F = r11;
        this.A0H = r13;
        this.A0W = r28;
        this.A0G = r12;
        this.A09 = r5;
        this.A0w = r51;
        this.A0g = r35;
        this.A0J = r15;
        this.A0c = r34;
        this.A0k = r39;
        this.A0v = r50;
        this.A0q = r45;
        this.A0z = r54;
        this.A0R = r23;
        this.A0X = r29;
        this.A0E = r10;
        this.A0j = r38;
        this.A0y = r53;
        this.A0V = r27;
        this.A0i = r37;
        this.A0Y = r30;
        this.A0A = r6;
        this.A0n = r42;
        this.A0h = r36;
        this.A0S = r24;
        this.A0s = r47;
        this.A0P = r21;
        this.A0t = r48;
        this.A0Z = r31;
        this.A0m = r41;
        this.A0o = r43;
        this.A0p = r44;
        this.A0I = r14;
        this.A10 = r55;
        this.A0a = r32;
        this.A0x = r52;
        this.A08 = r4;
        this.A0r = r46;
        this.A0l = r40;
        this.A0Q = r22;
        this.A0K = r16;
        this.A0O = r20;
        this.A0L = r17;
        this.A0C = r8;
        this.A0u = r49;
        this.A11 = new Random();
    }

    public static /* synthetic */ void A00(Message message, C41391vi r5) {
        Handler handler;
        Message message2;
        int i2;
        int i3 = message.arg1;
        if (i3 != 4) {
            if (i3 == 87) {
                r5.A03.removeMessages(2);
            } else if (i3 == 205) {
                Object obj = message.obj;
                AnonymousClass2CU r3 = r5.A04;
                Message obtain = Message.obtain((Handler) null, 0, 76, 0, obj);
                obtain.what = 2;
                ((Handler) r3).sendMessage(obtain);
                return;
            }
            AnonymousClass1CP r2 = r5.A0l;
            int i4 = r2.A04.get(i3, -1);
            if (i4 < 0 || i4 >= r2.A0C.size()) {
                AnonymousClass2CN r22 = r5.A0b;
                message2 = Message.obtain(message);
                handler = (Handler) r22;
                i2 = 5;
            } else {
                Message obtain2 = Message.obtain(message);
                obtain2.what = 1;
                obtain2.arg1 = i3;
                r2.A09.sendMessage(obtain2);
                return;
            }
        } else {
            r5.A0M.A04(message.getData().getLong("timestamp") * 1000, System.currentTimeMillis());
            AnonymousClass2CU r23 = r5.A04;
            message2 = Message.obtain((Handler) null, 0, 0, 0);
            handler = (Handler) r23;
            i2 = 2;
        }
        message2.what = i2;
        handler.sendMessage(message2);
    }

    public static /* synthetic */ void A01(Message message, C41391vi r4) {
        String string = message.getData().getString("iqId");
        if (!r4.A0l.A05((C28371Vv) message.obj, string)) {
            ((Handler) r4.A0b).obtainMessage(8, string).sendToTarget();
        }
    }

    public static void A02(C15860rz r4, C226318r r5, C28371Vv r6) {
        String A0N2 = r6.A0N("location", (String) null);
        if (TextUtils.isEmpty(A0N2) || A0N2.length() < 40) {
            r5.A02(A0N2, 2795, 0);
            r5.A02(A0N2, 2795, 1);
            boolean isEmpty = TextUtils.isEmpty(A0N2);
            SharedPreferences.Editor A0K2 = r4.A0K();
            (isEmpty ? A0K2.remove("last_datacenter") : A0K2.putString("last_datacenter", A0N2)).apply();
        }
    }

    public static final void A03(C51442bg r5, Map map) {
        String[] strArr;
        char c2;
        String str;
        if (r5 instanceof C51452bh) {
            strArr = new String[1];
            c2 = 0;
            str = "receipt";
        } else if (r5 instanceof C51462bi) {
            strArr = new String[1];
            c2 = 0;
            str = "presence";
        } else if (r5 instanceof C51472bj) {
            strArr = new String[1];
            c2 = 0;
            str = "notification";
        } else if (r5 instanceof C51482bk) {
            strArr = new String[1];
            c2 = 0;
            str = "message";
        } else if (r5 instanceof C51492bl) {
            strArr = new String[1];
            c2 = 0;
            str = "iq";
        } else if (r5 instanceof C51502bm) {
            strArr = new String[1];
            c2 = 0;
            str = "ib";
        } else if (r5 instanceof C51512bn) {
            strArr = new String[2];
            strArr[0] = "stream:error";
            c2 = 1;
            str = "error";
        } else if (r5 instanceof C51522bo) {
            strArr = new String[1];
            c2 = 0;
            str = "chatstate";
        } else {
            strArr = new String[1];
            c2 = 0;
            str = r5 instanceof C51532bp ? "call" : "ack";
        }
        strArr[c2] = str;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str2 = strArr[i2];
            if (!map.containsKey(str2)) {
                map.put(str2, r5);
                i2++;
            } else {
                throw new IllegalStateException("ConnectionReader/addStanzaHandler this stanza is already handled");
            }
        }
    }

    public final void A04() {
        Log.i("ConnectionThread/closeSocket");
        this.A01.A00();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A05(int r15, int r16, int r17, int r18, long r19, long r21, boolean r23) {
        /*
            r14 = this;
            X.2bx r7 = new X.2bx
            r7.<init>()
            long r12 = android.os.SystemClock.elapsedRealtime()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r7.A04 = r0
            r0 = r16
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A07 = r0
            r0 = r17
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A08 = r0
            long r0 = r12 - r19
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A06 = r0
            X.1HL r6 = r14.A0h
            boolean r0 = r6.A00()
            r5 = 1
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            r7.A01 = r0
            r4 = 5
            if (r15 == r5) goto L_0x0049
            if (r15 == r4) goto L_0x0049
            java.lang.Long r0 = java.lang.Long.valueOf(r21)
            r7.A09 = r0
        L_0x0049:
            monitor-enter(r6)
            X.2CH r3 = r6.A03     // Catch:{ all -> 0x00e8 }
            X.2CH r2 = new X.2CH     // Catch:{ all -> 0x00e8 }
            r2.<init>(r3)     // Catch:{ all -> 0x00e8 }
            monitor-exit(r6)
            int r0 = r2.A00
            r8 = 3
            if (r0 == 0) goto L_0x00d1
            long r0 = r2.A02
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00d1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.AnonymousClass00B.A06(r0)
            long r0 = r0.longValue()
            long r19 = r19 - r0
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 10
            long r9 = r9.toMillis(r0)
            int r0 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d1
            long r0 = r2.A02
            long r12 = r12 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r7.A05 = r0
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AnonymousClass00B.A06(r0)
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r5) goto L_0x0098
            r0 = 2
            if (r1 == r0) goto L_0x0098
            r0 = 3
            if (r1 != r8) goto L_0x0098
            r0 = 4
        L_0x0098:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x009c:
            r7.A03 = r0
            r1 = 1
            r2 = r18
            if (r18 == 0) goto L_0x00cc
            r0 = 2
            if (r2 == r5) goto L_0x00b3
            r1 = 3
            if (r2 == r0) goto L_0x00cc
            r0 = 4
            if (r2 == r8) goto L_0x00b3
            r1 = 5
            if (r2 == r0) goto L_0x00cc
            r0 = 0
            if (r2 != r4) goto L_0x00b7
            r0 = 6
        L_0x00b3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00b7:
            r7.A02 = r0
            if (r15 == r5) goto L_0x00c6
            if (r15 == r4) goto L_0x00c6
            X.0t9 r0 = r14.A0W
            r0.A05(r7)
        L_0x00c2:
            monitor-enter(r6)
            if (r15 != r5) goto L_0x00e0
            goto L_0x00d6
        L_0x00c6:
            X.0t9 r0 = r14.A0W
            r0.A06(r7)
            goto L_0x00c2
        L_0x00cc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x00b7
        L_0x00d1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x009c
        L_0x00d6:
            r2 = 0
            r3.A00 = r2     // Catch:{ all -> 0x00e8 }
            r0 = 0
            r3.A02 = r0     // Catch:{ all -> 0x00e8 }
            r3.A01 = r2     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x00e0:
            int r0 = r3.A01     // Catch:{ all -> 0x00e8 }
            int r0 = r0 + 1
            r3.A01 = r0     // Catch:{ all -> 0x00e8 }
        L_0x00e6:
            monitor-exit(r6)
            return
        L_0x00e8:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41391vi.A05(int, int, int, int, long, long, boolean):void");
    }

    public final void A06(boolean z2) {
        boolean hasMessages = this.A03.hasMessages(0);
        this.A03.removeCallbacksAndMessages((Object) null);
        if (this.A07 != null) {
            this.A06.A00(false);
        }
        AnonymousClass2CO r3 = this.A0d;
        if (r3.A00) {
            AnonymousClass2CO r5 = this.A0e;
            if (!r5.A00) {
                if (z2) {
                    Log.i("xmpp/connection/forced_disconnect/reader_thread/mark_finished");
                    C51552br r0 = this.A02;
                    if (r0 != null) {
                        r0.A00 = true;
                    }
                    A04();
                    ((Handler) this.A04).sendEmptyMessage(1);
                    ((Handler) this.A0b).obtainMessage(4, 1, 0).sendToTarget();
                    r3.A00(false);
                    if (this.A0f.A00) {
                        Log.i("xmpp/connection/quit during forced disconnect");
                        this.A05.quit();
                        quit();
                        return;
                    }
                    return;
                }
                this.A03.sendEmptyMessageDelayed(0, 10000);
                AnonymousClass2CU r32 = this.A04;
                Message obtain = Message.obtain((Handler) null, 0, 13, 0);
                obtain.what = 2;
                ((Handler) r32).sendMessage(obtain);
                r5.A00(true);
                return;
            }
        }
        if (hasMessages && z2) {
            C51432bf r1 = this.A03;
            Log.w("xmpp/connection/fire-logout-timeout");
            r1.sendEmptyMessage(0);
        }
    }

    public final void A07(boolean z2) {
        C41401vj r1 = this.A06;
        if (r1 != null) {
            r1.A00(false);
        }
        this.A0d.A00(false);
        this.A0e.A00(false);
        if (!this.A0f.A00) {
            this.A03.removeMessages(0);
            ((Handler) this.A04).sendEmptyMessage(1);
            ((Handler) this.A0b).obtainMessage(4, z2 ? 1 : 0, 0).sendToTarget();
        } else {
            Log.i("xmpp/connection/quit");
            this.A05.quit();
            quit();
        }
        this.A03.removeCallbacksAndMessages((Object) null);
    }

    public void onLooperPrepared() {
        this.A03 = new C51432bf(this);
        AnonymousClass2CW r0 = new AnonymousClass2CW(new C51592bv(this.A0j), new C51602bw(this.A0u), new C51572bt(this));
        this.A05 = r0;
        r0.start();
        AnonymousClass1SD r7 = this.A0m;
        synchronized (r7) {
            if (!r7.A00) {
                for (C19420yP r1 : (Set) r7.A02.get()) {
                    AnonymousClass1CP r9 = r7.A01;
                    int[] ACW = r1.ACW();
                    List list = r9.A0C;
                    int size = list.size();
                    list.add(r1);
                    int length = ACW.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            int i3 = ACW[i2];
                            SparseIntArray sparseIntArray = r9.A04;
                            if (sparseIntArray.get(i3, -1) == -1) {
                                sparseIntArray.put(i3, size);
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder("Already have registered handler for recv message type:");
                                sb.append(i3);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                }
                r7.A00 = true;
            }
        }
        this.A0l.A02 = this.A0g;
    }
}

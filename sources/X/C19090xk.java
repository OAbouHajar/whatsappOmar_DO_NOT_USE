package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.redex.IDxBReceiverShape7S0100000_2_I0;
import com.facebook.redex.IDxCallbackShape187S0100000_2_I0;
import com.facebook.redex.IDxNConsumerShape17S0300000_2_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.messaging.MessageService;
import com.obwhatsapp.yo.HomeUI;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0xk  reason: invalid class name and case insensitive filesystem */
public class C19090xk {
    public static CountDownLatch A11 = new CountDownLatch(1);
    public static final long A12 = TimeUnit.MINUTES.toMillis(15);
    public static final AtomicBoolean A13 = new AtomicBoolean();
    public int A00;
    public long A01 = -1;
    public long A02 = 0;
    public long A03;
    public HandlerThread A04;
    public UserJid A05;
    public AnonymousClass28H A06;
    public C41391vi A07;
    public C34511kO A08;
    public C19440yR A09;
    public C19440yR A0A;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D = false;
    public final BroadcastReceiver A0E = new IDxBReceiverShape7S0100000_2_I0(this, 14);
    public final Handler A0F = new Handler(new IDxCallbackShape187S0100000_2_I0(this, 4));
    public final C16570tH A0G;
    public final AnonymousClass1CG A0H;
    public final AnonymousClass1S4 A0I;
    public final C16040sK A0J;
    public final C16600tK A0K;
    public final C17650vQ A0L;
    public final C19710ys A0M;
    public final C18260wP A0N;
    public final C19310yE A0O;
    public final C210712r A0P;
    public final AnonymousClass01V A0Q;
    public final AnonymousClass1H9 A0R;
    public final C16440t3 A0S;
    public final C16980tz A0T;
    public final C19380yL A0U;
    public final C14710pd A0V;
    public final C19070xi A0W;
    public final C17990vy A0X;
    public final C17240ul A0Y;
    public final AnonymousClass1HJ A0Z;
    public final AnonymousClass2CO A0a = new AnonymousClass2CO("message_handler/logged_flag/disconnected", true);
    public final AnonymousClass2CO A0b = new AnonymousClass2CO("message_handler/logged_flag/must_ignore_network_once", false);
    public final AnonymousClass2CO A0c = new AnonymousClass2CO("message_handler/logged_flag/must_reconnect", true);
    public final AnonymousClass1CO A0d;
    public final C17190ug A0e;
    public final AnonymousClass2CM A0f = new AnonymousClass2CM(Looper.getMainLooper(), this);
    public final AnonymousClass2CP A0g;
    public final AnonymousClass1Vm A0h;
    public final AnonymousClass1HL A0i;
    public final AnonymousClass1CP A0j;
    public final AnonymousClass1S5 A0k;
    public final C207811o A0l;
    public final C14850pr A0m;
    public final C207411k A0n;
    public final AnonymousClass116 A0o;
    public final AnonymousClass1A4 A0p;
    public final C34531kQ A0q;
    public final C16320sq A0r;
    public final AnonymousClass1S3 A0s;
    public final Object A0t = new Object();
    public final Random A0u = new Random();
    public final AtomicBoolean A0v = new AtomicBoolean();
    public final AtomicBoolean A0w = new AtomicBoolean();
    public final AnonymousClass01J A0x;
    public volatile boolean A0y = true;
    public volatile boolean A0z;
    public volatile boolean A10;

    public C19090xk(C16570tH r8, AnonymousClass1CG r9, AnonymousClass1S4 r10, C16040sK r11, C16600tK r12, C17650vQ r13, C19710ys r14, C18260wP r15, C19310yE r16, C210712r r17, AnonymousClass01V r18, AnonymousClass1H9 r19, C16440t3 r20, C16980tz r21, C19380yL r22, C14710pd r23, C19070xi r24, C17990vy r25, C17240ul r26, AnonymousClass1HJ r27, AnonymousClass1CO r28, C17190ug r29, AnonymousClass1HL r30, AnonymousClass1CP r31, AnonymousClass1S5 r32, C207811o r33, C14850pr r34, C207411k r35, AnonymousClass116 r36, AnonymousClass1A4 r37, C16320sq r38, AnonymousClass1S3 r39, AnonymousClass01J r40) {
        AnonymousClass1Vm r2;
        C16980tz r3 = r21;
        this.A0T = r3;
        this.A0S = r20;
        this.A0V = r23;
        this.A0P = r17;
        this.A0J = r11;
        this.A0r = r38;
        this.A0e = r29;
        this.A0L = r13;
        this.A0W = r24;
        this.A0Q = r18;
        this.A0m = r34;
        this.A0o = r36;
        this.A0K = r12;
        this.A0Y = r26;
        this.A0Z = r27;
        this.A0X = r25;
        this.A0R = r19;
        this.A0l = r33;
        this.A0i = r30;
        this.A0O = r16;
        this.A0s = r39;
        this.A0U = r22;
        this.A0d = r28;
        this.A0I = r10;
        this.A0G = r8;
        this.A0N = r15;
        this.A0j = r31;
        this.A0k = r32;
        this.A0p = r37;
        this.A0M = r14;
        this.A0x = r40;
        this.A0H = r9;
        this.A0n = r35;
        this.A0q = new C34531kQ(1, 17280);
        this.A0g = new AnonymousClass2CP(Looper.getMainLooper(), this);
        r3.A00.registerReceiver(new IDxBReceiverShape7S0100000_2_I0(this, 15), new IntentFilter("com.obwhatsapp.MessageHandler.RECONNECT_ACTION"), AnonymousClass01S.A09, (Handler) null);
        if (Build.VERSION.SDK_INT >= 29) {
            r2 = new C28321Vn(this.A0Q, this.A0R, this);
        } else {
            C16980tz r6 = this.A0T;
            AnonymousClass1H9 r5 = this.A0R;
            r2 = new AnonymousClass1Vl(this.A0N, this.A0O, r5, r6, this);
        }
        this.A0h = r2;
    }

    public static /* synthetic */ void A00(Message message, C19090xk r9) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (message.arg1 != 0) {
            z4 = true;
        }
        long j2 = message.getData().getLong("networkId");
        synchronized (r9.A0t) {
            z2 = false;
            if (r9.A0B != z4) {
                if (z4) {
                    Log.i("xmpp/handler/network/up");
                    r9.A0G(false, true, false);
                } else {
                    Log.i("xmpp/handler/network/down");
                    C34511kO r0 = r9.A08;
                    if (r0 != null) {
                        r0.AdP(true);
                    }
                }
                r9.A0B = z4;
                r9.A01 = j2;
                z2 = true;
            } else if (z4) {
                long j3 = r9.A01;
                if (j2 != j3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("xmpp/handler/network/switch old=");
                    sb.append(j3);
                    sb.append(" new=");
                    sb.append(j2);
                    Log.i(sb.toString());
                    C34511kO r02 = r9.A08;
                    if (r02 != null) {
                        r02.AdP(true);
                    }
                    r9.A01 = j2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                r9.A0G(false, false, true);
                z2 = z3;
            }
        }
        if (z2) {
            r9.A0X.A01(r9.A0N.A06());
        }
    }

    public static /* synthetic */ void A01(C19090xk r105) {
        C19090xk r12 = r105;
        if (!r12.A10 && !HomeUI.getAirplaneMode()) {
            Log.i("xmpp/handler/start");
            r12.A10 = true;
            if (r12.A0V.A0E(C16620tM.A02, 1740)) {
                C17190ug r1 = r12.A0e;
                AnonymousClass1S5 r0 = r12.A0k;
                Set set = r1.A0A;
                synchronized (set) {
                    set.add(r0);
                }
            }
            AnonymousClass1S4 r13 = r12.A0I;
            AnonymousClass2CM r83 = r12.A0f;
            C16150sX r02 = r13.A00.A01;
            C16980tz r56 = (C16980tz) r02.AQB.get();
            C16440t3 r55 = (C16440t3) r02.AP2.get();
            C14710pd r54 = (C14710pd) r02.A05.get();
            C24361Fp r53 = (C24361Fp) r02.A7G.get();
            AnonymousClass01J r4 = r02.A5p;
            C16300so r52 = (C16300so) r4.get();
            AnonymousClass01J r14 = r02.ADr;
            C16040sK r51 = (C16040sK) r14.get();
            C18900xR r50 = (C18900xR) r02.ALD.get();
            AnonymousClass01J r3 = r02.AN9;
            C17130ua r49 = (C17130ua) r3.get();
            C16490t9 r48 = (C16490t9) r02.AQz.get();
            C15900s5 r47 = (C15900s5) r02.ALm.get();
            AnonymousClass1CG r46 = (AnonymousClass1CG) r02.A0t.get();
            C18990xa r45 = (C18990xa) r02.ADh.get();
            C17190ug r44 = (C17190ug) r02.AEu.get();
            C17650vQ A0J2 = C16150sX.A0J(r02);
            C229219u r43 = (C229219u) r02.A9w.get();
            AnonymousClass1S6 r42 = (AnonymousClass1S6) r02.APk.get();
            C222617g r41 = (C222617g) r02.A8a.get();
            AnonymousClass01J r2 = r02.AIB;
            C18290wS r40 = (C18290wS) r2.get();
            AnonymousClass2CY r104 = new AnonymousClass2CY();
            C16460t6 r39 = (C16460t6) r02.A5k.get();
            C17240ul r38 = (C17240ul) r02.ABK.get();
            C211512z r37 = (C211512z) r02.AG1.get();
            C19790z0 r36 = (C19790z0) r02.AKg.get();
            C229519x r35 = (C229519x) r02.ALH.get();
            C226318r r34 = (C226318r) r02.AQs.get();
            AnonymousClass17L r33 = (AnonymousClass17L) r02.AIW.get();
            AnonymousClass1HA r32 = (AnonymousClass1HA) r02.ARW.get();
            AnonymousClass129 r31 = (AnonymousClass129) r02.A3k.get();
            C207811o r30 = (C207811o) r02.ADe.get();
            AnonymousClass1HL r29 = (AnonymousClass1HL) r02.AF2.get();
            C16900tq r28 = (C16900tq) r02.AFT.get();
            AnonymousClass1HB r27 = (AnonymousClass1HB) r02.AIG.get();
            C15860rz r26 = (C15860rz) r02.AQh.get();
            AnonymousClass1S9 r25 = (AnonymousClass1S9) r02.ARb.get();
            AnonymousClass1SC r24 = (AnonymousClass1SC) r02.A48.get();
            AnonymousClass1SD r23 = (AnonymousClass1SD) r02.ARc.get();
            C207911p r22 = (C207911p) r02.ADf.get();
            C18310wU r21 = (C18310wU) r02.AHz.get();
            AnonymousClass1CQ r20 = (AnonymousClass1CQ) r02.A0v.get();
            C229619y r19 = (C229619y) r02.A47.get();
            C207711n r18 = (C207711n) r02.A4n.get();
            C15960sC r17 = (C15960sC) r02.AKz.get();
            C16570tH r16 = (C16570tH) r02.A0e.get();
            AnonymousClass1CQ r64 = r20;
            AnonymousClass1CH r66 = (AnonymousClass1CH) r02.A4d.get();
            C19710ys r67 = (C19710ys) r02.A4f.get();
            C16440t3 r68 = r55;
            C16980tz r69 = r56;
            C17120uZ r70 = (C17120uZ) r02.AQT.get();
            C15860rz r71 = r26;
            C16290sm r72 = (C16290sm) r02.AQk.get();
            C16460t6 r73 = r39;
            C16900tq r74 = r28;
            C24361Fp r75 = r53;
            C14710pd r76 = r54;
            C226318r r77 = r34;
            C16490t9 r78 = r48;
            C17240ul r79 = r38;
            AnonymousClass1HA r80 = r32;
            AnonymousClass1SC r81 = r24;
            C207711n r82 = r18;
            C229219u r84 = r43;
            C17190ug r85 = r44;
            AnonymousClass1HL r86 = r29;
            AnonymousClass17L r87 = r33;
            C19790z0 r88 = r36;
            AnonymousClass1S6 r89 = r42;
            AnonymousClass1CP r90 = (AnonymousClass1CP) r02.ARX.get();
            AnonymousClass1SD r91 = r23;
            C207811o r92 = r30;
            C207911p r93 = r22;
            C18310wU r94 = r21;
            C18290wS r95 = r40;
            AnonymousClass168 r96 = (AnonymousClass168) r02.AAi.get();
            AnonymousClass1HB r97 = r27;
            AnonymousClass1S9 r98 = r25;
            C16570tH r542 = r16;
            AnonymousClass1CG r552 = r46;
            AnonymousClass129 r562 = r31;
            C16300so r57 = r52;
            C207511l r58 = (C207511l) r02.A4l.get();
            C16040sK r59 = r51;
            C211512z r60 = r37;
            C18900xR r61 = r50;
            C15900s5 r62 = r47;
            C17130ua r63 = r49;
            C41391vi r532 = new C41391vi(r542, r552, r562, r57, r58, r59, r60, r61, r62, r63, r64, A0J2, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, new C46022Ca((C16300so) r4.get(), (C17130ua) r3.get(), new AnonymousClass2CZ((C16040sK) r14.get(), (AnonymousClass11R) r02.A4a.get()), (AnonymousClass159) r02.A3s.get(), (C18290wS) r2.get(), (AnonymousClass1S7) r02.AMf.get()), r41, r45, r17, r35, r104, r19);
            r12.A07 = r532;
            r532.start();
        }
    }

    public static /* synthetic */ void A02(C19090xk r17, Integer num, int i2, boolean z2, boolean z3) {
        byte[] bArr;
        C15830rv r0;
        boolean containsKey;
        C19090xk r4 = r17;
        Context context = r4.A0T.A00;
        synchronized (r4.A0t) {
            r4.A0a.A00(false);
            r4.A0r.Aco(new RunnableRunnableShape8S0200000_I0_6(r4, 43, num));
            C207411k r6 = r4.A0n;
            AnonymousClass1CG r1 = r4.A0H;
            synchronized (r1) {
                try {
                    C31981fL r02 = r1.A02().A01;
                    bArr = r02 != null ? r02.A02.A01 : null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            r6.A03.Acm(new RunnableRunnableShape9S0200000_I0_7(r6, 48, bArr), "sendKeystoreAttestation");
            if (!r4.A0B && Build.VERSION.SDK_INT < 29) {
                r4.A0B = r4.A0h.isConnected();
                Log.i("xmpp/handler/handleConnected setting isNetworkUp to true");
            }
            r4.A00 = i2;
            boolean z4 = z2;
            if (!r4.A0M.A02()) {
                C19440yR r7 = r4.A0A;
                AnonymousClass00B.A01();
                r7.A0w.A03();
                r7.A0A.A05(z4);
                C19300yD r12 = r7.A04;
                r12.A00 = false;
                r7.A0n.A02 = false;
                r12.A01 = false;
                C222717h r9 = r7.A0Z;
                Map map = r9.A01;
                synchronized (map) {
                    try {
                        map.clear();
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                            break;
                        }
                    }
                }
                AnonymousClass1HD r13 = r7.A08;
                synchronized (r13) {
                    try {
                        r13.A08.clear();
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                C211512z r2 = r7.A07;
                synchronized (r2) {
                    try {
                        r2.A02 = false;
                        r2.A00 = 0;
                        r2.A05(0);
                    } catch (Throwable th4) {
                        while (true) {
                            th = th4;
                            break;
                        }
                    }
                }
                Log.i("server connected");
                C15860rz r5 = r7.A0M;
                r5.A0K().putBoolean("spam_banned", false).apply();
                r5.A14("spam_banned_expiry_timestamp", 0);
                r5.A0K().putBoolean("underage_account_banned", false).apply();
                C19040xf r14 = r7.A0q;
                r14.A02 = true;
                r14.A0B();
                if (!r7.A05.A0G()) {
                    r7.A0x.Acl(new RunnableRunnableShape11S0100000_I0_10((Object) r7, 15));
                }
                C16320sq r8 = r7.A0x;
                r8.Acl(new RunnableRunnableShape11S0100000_I0_10((Object) r7, 16));
                if (r7.A0T.A0E(C16620tM.A02, 877)) {
                    r8.Acl(new RunnableRunnableShape11S0100000_I0_10((Object) r7.A0t, 14));
                }
                r8.Acl(new RunnableRunnableShape11S0100000_I0_10((Object) r7, 21));
                C16900tq r22 = r7.A0P;
                if (r22.A00) {
                    AnonymousClass1HE r132 = r7.A0X;
                    RunnableRunnableShape11S0100000_I0_10 runnableRunnableShape11S0100000_I0_10 = new RunnableRunnableShape11S0100000_I0_10((Object) r7, 18);
                    AnonymousClass1HO r15 = r132.A0L;
                    synchronized (r15) {
                        try {
                            r15.A01.clear();
                        } catch (Throwable th5) {
                            th = th5;
                            throw th;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    synchronized (r132.A0Q) {
                        try {
                            for (Map.Entry entry : r132.A0R.entrySet()) {
                                C27411Rq r10 = r132.A0J;
                                AnonymousClass1XQ r152 = (AnonymousClass1XQ) entry.getValue();
                                synchronized (r10) {
                                    containsKey = r10.A01.containsKey(r152);
                                }
                                if (containsKey) {
                                    arrayList.addAll(Collections.unmodifiableList(((C43241zg) entry.getKey()).A01));
                                }
                            }
                        } catch (Throwable th6) {
                            while (true) {
                                th = th6;
                                break;
                            }
                        }
                    }
                    AnonymousClass2CQ r102 = new AnonymousClass2CQ(r132, arrayList);
                    r132.A0O.Acl(r102);
                    r102.A01(new IDxNConsumerShape17S0300000_2_I0(arrayList, r132, runnableRunnableShape11S0100000_I0_10, 0), r132.A0S);
                }
                C17190ug r122 = r7.A0a;
                AnonymousClass1CM r03 = r122.A06;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = r03.A00;
                synchronized (linkedHashMap2) {
                    try {
                        Iterator it = linkedHashMap2.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            if (((Integer) ((Pair) entry2.getValue()).second).intValue() < 3) {
                                linkedHashMap.put((String) entry2.getKey(), (Message) ((Pair) entry2.getValue()).first);
                            } else {
                                it.remove();
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("unacked-messages/getUnackedMessages: ");
                        sb.append(linkedHashMap.size());
                        Log.i(sb.toString());
                    } catch (Throwable th7) {
                        while (true) {
                            th = th7;
                            break;
                        }
                    }
                }
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    r122.A08((Message) entry3.getValue(), (String) entry3.getKey(), true);
                }
                AnonymousClass125 r103 = r7.A0j;
                Set set = r103.A07;
                HashSet hashSet = new HashSet(set);
                set.clear();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    r103.A05((C15830rv) it2.next());
                }
                AnonymousClass2CR r142 = new AnonymousClass2CR(r7);
                List<C34441kG> list = r9.A00;
                synchronized (list) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("in-flight-messages/for-each/send-pending-requests: ");
                        sb2.append(list.size());
                        Log.i(sb2.toString());
                        for (C34441kG r04 : list) {
                            String str = r04.A01;
                            Message message = r04.A00;
                            boolean z5 = r04.A02;
                            C17190ug r16 = r142.A00.A0a;
                            if (z5) {
                                r16.A08(message, str, true);
                            } else {
                                r16.A08(message, str, false);
                            }
                        }
                        list.clear();
                    } catch (Throwable th8) {
                        while (true) {
                            th = th8;
                            break;
                        }
                    }
                }
                C14850pr r92 = r7.A0i;
                if (r92.A00 != 3) {
                    AnonymousClass1yO A002 = r7.A01.A00();
                    if (A002.A02 && (r0 = (C15830rv) ((Conversation) A002.A00()).A00.A2l.A08(C15830rv.class)) != null) {
                        r103.A05(r0);
                    }
                }
                boolean z6 = false;
                if (r92.A00 == 3) {
                    z6 = true;
                }
                if (z3 == z6) {
                    if (!z6) {
                        r7.A0k.A00();
                    } else {
                        r7.A0k.A01();
                    }
                }
                if (r7.A0N.A00.getBoolean("run_on_connect_tasks_for_version_change", false)) {
                    r5.A1H(true);
                    r8.Acl(new RunnableRunnableShape11S0100000_I0_10((Object) r7, 19));
                }
                if (((SharedPreferences) r5.A01.get()).getBoolean("future_proof_processing_needed", false)) {
                    r22.A04();
                    if (r22.A01) {
                        AnonymousClass1H3 r52 = r7.A0Y;
                        r52.A0L.Acm(new RunnableRunnableShape11S0100000_I0_10((Object) r52, 13), "FutureProofMessageHandler/processFutureMessages");
                    }
                }
                r7.A0U.A0F(false);
            } else {
                r4.A0K.A05(z4);
            }
            MessageService.A00(context);
            AnonymousClass1HL r53 = r4.A0i;
            if (r53.A00()) {
                r4.A0s.A02();
            }
            C17240ul r62 = r4.A0Y;
            C16900tq r05 = r62.A0d;
            r05.A04();
            if (r05.A01) {
                AnonymousClass01D r72 = r62.A0N.A01;
                if (((SharedPreferences) r72.get()).getBoolean("pnh_group_lid_incomplete", false)) {
                    r62.A10.Acl(new RunnableRunnableShape9S0100000_I0_8(r62, 28));
                }
                if (((SharedPreferences) r72.get()).getBoolean("pnh_cag_upgrade_incomplete", false)) {
                    r62.A10.Acl(r62.A04);
                }
            }
            r4.A0q.A02();
            r4.A07();
            AnonymousClass1HJ r73 = r4.A0Z;
            C34511kO r63 = r4.A08;
            r73.A05 = r53.A00();
            r73.A09.post(new RunnableRunnableShape8S0200000_I0_6(r73, 38, r63));
            r4.A0U.A03(10, (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r1.A00.A06.isEmpty() != false) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A03(X.C19090xk r9, boolean r10) {
        /*
            X.1HJ r6 = r9.A0Z
            long r4 = r6.A0G
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x000c
            r0 = 1
        L_0x000c:
            r3 = 1
            if (r0 == 0) goto L_0x0010
            r10 = 1
        L_0x0010:
            X.11o r5 = r9.A0l
            monitor-enter(r5)
            int[] r4 = r5.A06     // Catch:{ all -> 0x011d }
            int r2 = r4.length     // Catch:{ all -> 0x011d }
            r1 = 0
        L_0x0017:
            if (r1 >= r2) goto L_0x0025
            r0 = r4[r1]     // Catch:{ all -> 0x011d }
            java.util.Map r0 = r5.A02(r0)     // Catch:{ all -> 0x011d }
            r0.clear()     // Catch:{ all -> 0x011d }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0025:
            monitor-exit(r5)
            X.0tz r0 = r9.A0T
            android.content.Context r7 = r0.A00
            java.lang.Object r2 = r9.A0t
            monitor-enter(r2)
            X.2CO r0 = r9.A0a     // Catch:{ all -> 0x011a }
            r0.A00(r3)     // Catch:{ all -> 0x011a }
            X.0yR r0 = r9.A0A     // Catch:{ all -> 0x011a }
            r0.A00()     // Catch:{ all -> 0x011a }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x011a }
            r0 = 26
            if (r1 < r0) goto L_0x003f
            if (r10 != 0) goto L_0x004e
        L_0x003f:
            java.lang.String r0 = "messageservice/stopService"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x011a }
            java.lang.Class<com.obwhatsapp.messaging.MessageService> r1 = com.obwhatsapp.messaging.MessageService.class
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x011a }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x011a }
            r7.stopService(r0)     // Catch:{ all -> 0x011a }
        L_0x004e:
            X.1CO r4 = r9.A0d     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "disconnected"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x011a }
            r0.<init>(r1)     // Catch:{ all -> 0x011a }
            r4.A01(r0)     // Catch:{ all -> 0x011a }
            X.1CP r5 = r9.A0j     // Catch:{ all -> 0x011a }
            X.1kO r1 = r9.A08     // Catch:{ all -> 0x011a }
            r4 = 0
            if (r1 == 0) goto L_0x0083
            X.2CT r1 = (X.AnonymousClass2CT) r1     // Catch:{ all -> 0x011a }
            r0 = 4
            boolean r0 = r1.hasMessages(r0)     // Catch:{ all -> 0x011a }
            if (r0 != 0) goto L_0x0081
            X.1vi r0 = r1.A00     // Catch:{ all -> 0x011a }
            X.2CU r1 = r0.A04     // Catch:{ all -> 0x011a }
            X.2CV r1 = (X.AnonymousClass2CV) r1     // Catch:{ all -> 0x011a }
            r0 = 2
            boolean r0 = r1.hasMessages(r0)     // Catch:{ all -> 0x011a }
            if (r0 != 0) goto L_0x0081
            X.2CW r0 = r1.A00     // Catch:{ all -> 0x011a }
            java.util.LinkedList r0 = r0.A06     // Catch:{ all -> 0x011a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x011a }
            if (r0 != 0) goto L_0x0083
        L_0x0081:
            r0 = 1
            goto L_0x0084
        L_0x0083:
            r0 = 0
        L_0x0084:
            r5.A04(r0)     // Catch:{ all -> 0x011a }
            android.os.Handler r1 = r6.A09     // Catch:{ all -> 0x011a }
            r5 = 10
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r0 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10     // Catch:{ all -> 0x011a }
            r0.<init>((java.lang.Object) r6, (int) r5)     // Catch:{ all -> 0x011a }
            r1.post(r0)     // Catch:{ all -> 0x011a }
            X.1S3 r0 = r9.A0s     // Catch:{ all -> 0x011a }
            r0.A00()     // Catch:{ all -> 0x011a }
            X.116 r1 = r9.A0o     // Catch:{ all -> 0x011a }
            java.lang.Class<com.obwhatsapp.service.GcmFGService> r0 = com.obwhatsapp.service.GcmFGService.class
            r1.A01(r7, r0)     // Catch:{ all -> 0x011a }
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A0v     // Catch:{ all -> 0x011a }
            boolean r0 = r0.getAndSet(r4)     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0104
            r0 = 2131893495(0x7f121cf7, float:1.9421768E38)
            java.lang.String r8 = r7.getString(r0)     // Catch:{ all -> 0x011a }
            X.03l r6 = X.C218415q.A00(r7)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "failure_notifications@1"
            r6.A0J = r0     // Catch:{ all -> 0x011a }
            r1 = 2131889703(0x7f120e27, float:1.9414077E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x011a }
            r0[r4] = r8     // Catch:{ all -> 0x011a }
            java.lang.String r0 = r7.getString(r1, r0)     // Catch:{ all -> 0x011a }
            r6.A0B(r0)     // Catch:{ all -> 0x011a }
            X.0t3 r0 = r9.A0S     // Catch:{ all -> 0x011a }
            long r0 = r0.A00()     // Catch:{ all -> 0x011a }
            r6.A05(r0)     // Catch:{ all -> 0x011a }
            r0 = 3
            r6.A02(r0)     // Catch:{ all -> 0x011a }
            r6.A0D(r3)     // Catch:{ all -> 0x011a }
            r6.A0A(r8)     // Catch:{ all -> 0x011a }
            r0 = 2131889704(0x7f120e28, float:1.941408E38)
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x011a }
            r6.A09(r0)     // Catch:{ all -> 0x011a }
            android.content.Intent r0 = X.C14750ph.A04(r7)     // Catch:{ all -> 0x011a }
            android.app.PendingIntent r0 = X.C42341xd.A00(r7, r3, r0, r4)     // Catch:{ all -> 0x011a }
            r6.A09 = r0     // Catch:{ all -> 0x011a }
            r1 = 2131232243(0x7f0805f3, float:1.808059E38)
            int r1 = com.obwhatsapp.yo.yo.getNIcon(r1)     // Catch:{ all -> 0x011a }
            android.app.Notification r0 = r6.A07     // Catch:{ all -> 0x011a }
            r0.icon = r1     // Catch:{ all -> 0x011a }
            X.0yL r1 = r9.A0U     // Catch:{ all -> 0x011a }
            android.app.Notification r0 = r6.A01()     // Catch:{ all -> 0x011a }
            r1.A02(r5, r0)     // Catch:{ all -> 0x011a }
            X.1A4 r0 = r9.A0p     // Catch:{ all -> 0x011a }
            r0.A00()     // Catch:{ all -> 0x011a }
        L_0x0104:
            if (r10 == 0) goto L_0x0111
            X.1Vm r0 = r9.A0h     // Catch:{ all -> 0x011a }
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0113
            r9.A0E(r4)     // Catch:{ all -> 0x011a }
        L_0x0111:
            monitor-exit(r2)     // Catch:{ all -> 0x011a }
            goto L_0x0119
        L_0x0113:
            X.2CO r0 = r9.A0c     // Catch:{ all -> 0x011a }
            r0.A00(r3)     // Catch:{ all -> 0x011a }
            goto L_0x0111
        L_0x0119:
            return
        L_0x011a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011a }
            throw r0
        L_0x011d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19090xk.A03(X.0xk, boolean):void");
    }

    public void A04() {
        Message obtain = Message.obtain((Handler) null, 0, 0, 0);
        obtain.getData().putBoolean("should_register", true);
        this.A0g.sendMessage(obtain);
    }

    public void A05() {
        Message obtain = Message.obtain((Handler) null, 0, 0, 0);
        obtain.getData().putBoolean("should_register", false);
        this.A0g.sendMessage(obtain);
    }

    public void A06() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("long_connect", true);
        this.A0g.sendMessage(Message.obtain((Handler) null, 0, 3, 0, bundle));
        A0C((String) null, (String) null, 0, true, false, false, false, false, false);
    }

    public final void A07() {
        synchronized (this.A0t) {
            AnonymousClass2CO r2 = this.A0c;
            boolean z2 = false;
            if (!this.A0i.A00()) {
                z2 = true;
            }
            r2.A00(z2);
        }
    }

    public void A08(int i2) {
        Message obtain = Message.obtain((Handler) null, 0, 2, 0);
        obtain.getData().putBoolean("force", true);
        obtain.getData().putInt("connect_reason", i2);
        this.A0g.sendMessage(obtain);
    }

    public void A09(long j2, boolean z2) {
        Handler handler = this.A0F;
        Message obtain = Message.obtain(handler, 0, z2 ? 1 : 0, 0);
        obtain.getData().putLong("networkId", j2);
        handler.sendMessage(obtain);
    }

    public void A0A(AnonymousClass28H r5) {
        Message obtain = Message.obtain((Handler) null, 0, 0, 0, r5);
        obtain.getData().putBoolean("should_register", true);
        this.A0g.sendMessage(obtain);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A0B(X.AnonymousClass28H r11, java.lang.String r12, java.lang.String r13, int r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            r10 = this;
            r4 = 1
            r3 = 0
            if (r16 == 0) goto L_0x0014
            long r0 = r10.A03
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x001d
            long r5 = android.os.SystemClock.elapsedRealtime()
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x001d
        L_0x0014:
            r8 = 0
        L_0x0015:
            X.0tz r0 = r10.A0T
            android.content.Context r5 = r0.A00
            java.lang.Object r2 = r10.A0t
            monitor-enter(r2)
            goto L_0x001f
        L_0x001d:
            r8 = 1
            goto L_0x0015
        L_0x001f:
            X.2CO r0 = r10.A0a     // Catch:{ all -> 0x0154 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0075
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0053
            int r1 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x003d }
            int r0 = r10.A00     // Catch:{ NumberFormatException -> 0x003d }
            if (r1 != r0) goto L_0x0053
            X.1kO r0 = r10.A08     // Catch:{ NumberFormatException -> 0x003d }
            X.AnonymousClass00B.A06(r0)     // Catch:{ NumberFormatException -> 0x003d }
            r0.AdP(r4)     // Catch:{ NumberFormatException -> 0x003d }
            goto L_0x014f
        L_0x003d:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0154 }
            r1.<init>()     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = "xmpp/handler/reconnect invalid sessionId="
            r1.append(r0)     // Catch:{ all -> 0x0154 }
            r1.append(r12)     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0154 }
            com.whatsapp.util.Log.w(r0, r3)     // Catch:{ all -> 0x0154 }
        L_0x0053:
            if (r17 == 0) goto L_0x0060
            java.lang.String r0 = "xmpp/handler/reconnect/not_disconnected/check_connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0154 }
            X.1HJ r0 = r10.A0Z     // Catch:{ all -> 0x0154 }
            r0.A00()     // Catch:{ all -> 0x0154 }
        L_0x0060:
            X.1HL r0 = r10.A0i     // Catch:{ all -> 0x0154 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x014f
            X.1S3 r1 = r10.A0s     // Catch:{ all -> 0x0154 }
            boolean r0 = r1.A03()     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x014f
            r1.A02()     // Catch:{ all -> 0x0154 }
            goto L_0x014f
        L_0x0075:
            X.1HL r7 = r10.A0i     // Catch:{ all -> 0x0154 }
            monitor-enter(r7)     // Catch:{ all -> 0x0154 }
            X.2CH r6 = r7.A03     // Catch:{ all -> 0x0151 }
            int r0 = r6.A00     // Catch:{ all -> 0x0151 }
            if (r0 != 0) goto L_0x008a
            if (r14 == 0) goto L_0x008a
            r6.A00 = r14     // Catch:{ all -> 0x0151 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0151 }
            r6.A02 = r0     // Catch:{ all -> 0x0151 }
            r6.A01 = r3     // Catch:{ all -> 0x0151 }
        L_0x008a:
            monitor-exit(r7)     // Catch:{ all -> 0x0154 }
            if (r15 != 0) goto L_0x0091
            if (r8 != 0) goto L_0x0091
            goto L_0x0149
        L_0x0091:
            X.2CO r9 = r10.A0c     // Catch:{ all -> 0x0154 }
            r9.A00(r4)     // Catch:{ all -> 0x0154 }
            X.2CO r0 = r10.A0b     // Catch:{ all -> 0x0154 }
            r0.A00(r4)     // Catch:{ all -> 0x0154 }
        L_0x009b:
            boolean r0 = r10.A0B     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x00a7
            long r0 = r10.A01     // Catch:{ all -> 0x0154 }
            r7 = -1
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00df
        L_0x00a7:
            boolean r0 = r9.A00     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x0142
            X.2CO r1 = r10.A0b     // Catch:{ all -> 0x0154 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x0142
            r1.A00(r3)     // Catch:{ all -> 0x0154 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0154 }
            r6.<init>()     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = "xmpp/handler/network/ignore ("
            r6.append(r0)     // Catch:{ all -> 0x0154 }
            boolean r0 = r10.A0B     // Catch:{ all -> 0x0154 }
            r6.append(r0)     // Catch:{ all -> 0x0154 }
            r0 = 44
            r6.append(r0)     // Catch:{ all -> 0x0154 }
            long r0 = r10.A01     // Catch:{ all -> 0x0154 }
            r6.append(r0)     // Catch:{ all -> 0x0154 }
            r0 = 41
            r6.append(r0)     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0154 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0154 }
            X.1H9 r0 = r10.A0R     // Catch:{ all -> 0x0154 }
            r0.A00()     // Catch:{ all -> 0x0154 }
        L_0x00df:
            boolean r0 = r10.A10     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x014f
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.A0v     // Catch:{ all -> 0x0154 }
            r1 = r18
            r0.compareAndSet(r3, r1)     // Catch:{ all -> 0x0154 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.A0w     // Catch:{ all -> 0x0154 }
            r0 = r19
            r1.compareAndSet(r3, r0)     // Catch:{ all -> 0x0154 }
            X.0yR r0 = r10.A0A     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x014f
            X.1kO r0 = r10.A08     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x014f
            boolean r0 = r10.A0C     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x014f
            boolean r0 = r1.getAndSet(r3)     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x011d
            X.0yL r3 = r10.A0U     // Catch:{ all -> 0x0154 }
            r1 = 10
            r0 = 0
            r3.A03(r1, r0)     // Catch:{ all -> 0x0154 }
            X.0tH r0 = r10.A0G     // Catch:{ all -> 0x0154 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x011d
            X.116 r3 = r10.A0o     // Catch:{ all -> 0x0154 }
            java.lang.Class<com.obwhatsapp.service.GcmFGService> r1 = com.obwhatsapp.service.GcmFGService.class
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0154 }
            r0.<init>()     // Catch:{ all -> 0x0154 }
            r3.A03(r5, r0, r1)     // Catch:{ all -> 0x0154 }
        L_0x011d:
            X.0pr r0 = r10.A0m     // Catch:{ all -> 0x0154 }
            int r1 = r0.A00     // Catch:{ all -> 0x0154 }
            r0 = 3
            r7 = 1
            if (r1 != r0) goto L_0x0126
            r7 = 0
        L_0x0126:
            com.whatsapp.jid.UserJid r0 = r10.A05     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0133
            X.0ys r0 = r10.A0M     // Catch:{ all -> 0x0154 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0133
            r4 = 0
        L_0x0133:
            X.AnonymousClass00B.A0F(r4)     // Catch:{ all -> 0x0154 }
            X.1kO r3 = r10.A08     // Catch:{ all -> 0x0154 }
            com.whatsapp.jid.UserJid r4 = r10.A05     // Catch:{ all -> 0x0154 }
            boolean r8 = r10.A0y     // Catch:{ all -> 0x0154 }
            r5 = r11
            r6 = r13
            r3.AdO(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0154 }
            goto L_0x014f
        L_0x0142:
            java.lang.String r0 = "xmpp/handler/reconnect/network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0154 }
            goto L_0x014f
        L_0x0149:
            X.2CO r9 = r10.A0c     // Catch:{ all -> 0x0154 }
            boolean r0 = r9.A00     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x009b
        L_0x014f:
            monitor-exit(r2)     // Catch:{ all -> 0x0154 }
            return
        L_0x0151:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0154 }
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0154 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19090xk.A0B(X.28H, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean):void");
    }

    public void A0C(String str, String str2, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Message obtain = Message.obtain((Handler) null, 0, 2, 0);
        obtain.getData().putBoolean("force", z2);
        obtain.getData().putBoolean("force_no_ongoing_backoff", z3);
        obtain.getData().putBoolean("reset", z4);
        obtain.getData().putBoolean("check_connection", z5);
        obtain.getData().putBoolean("notify_on_failure", z6);
        obtain.getData().putString("ip_address", str);
        obtain.getData().putString("cl_sess", str2);
        obtain.getData().putBoolean("fgservice", z7);
        obtain.getData().putInt("connect_reason", i2);
        this.A0g.sendMessage(obtain);
    }

    public void A0D(boolean z2) {
        StringBuilder sb = new StringBuilder("xmpp/service/stop/unregister:");
        sb.append(z2);
        Log.i(sb.toString());
        this.A0K.A05 = false;
        Message obtain = Message.obtain((Handler) null, 0, 1, 0);
        obtain.getData().putBoolean("should_unregister", z2);
        this.A0g.sendMessage(obtain);
    }

    public final void A0E(boolean z2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.A03;
        if (j2 <= 0 || elapsedRealtime >= j2) {
            Context context = this.A0T.A00;
            if (this.A0D) {
                this.A0q.A03(this.A02);
                this.A0D = false;
            }
            C34531kQ r0 = this.A0q;
            long A012 = r0.A01();
            this.A02 = r0.A00();
            long j3 = A012 * 10000;
            if (j3 == 0) {
                Log.i("xmpp/handler/schedule-reconnect/immediate");
                A08(0);
                return;
            }
            Random random = this.A0u;
            long nextLong = (j3 / 2) + ((random.nextLong() & Long.MAX_VALUE) % j3);
            if (z2) {
                long j4 = A12;
                if (nextLong > j4) {
                    nextLong = j4 + ((long) (random.nextInt(60) - 30));
                    Log.i("xmpp/handler/schedule-reconnect/backoff clamped to ~15mins");
                }
            }
            StringBuilder sb = new StringBuilder("xmpp/handler/schedule-reconnect/backoff:");
            sb.append(nextLong);
            Log.i(sb.toString());
            Intent intent = new Intent("com.obwhatsapp.MessageHandler.RECONNECT_ACTION").setPackage("com.obwhatsapp");
            intent.putExtra("connect_reason", 3);
            long j5 = elapsedRealtime + nextLong;
            if (this.A0P.A02(C42341xd.A01(context, 0, intent, 0), 2, j5)) {
                this.A03 = j5;
                return;
            }
            Log.w("MessageHandler/scheduleReconnect AlarmManager is null");
            this.A03 = 0;
            return;
        }
        Log.i("xmpp/handler/schedule-reconnect/already-pending");
    }

    public void A0F(boolean z2, boolean z3) {
        Context context = this.A0T.A00;
        AlarmManager A042 = this.A0Q.A04();
        if (A042 != null) {
            Intent intent = new Intent("com.obwhatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION").setPackage("com.obwhatsapp");
            if (!z2) {
                PendingIntent A012 = C42341xd.A01(context, 0, intent, 536870912);
                if (A012 != null) {
                    Log.i("connectivity retry alarm canceled");
                    A042.cancel(A012);
                    A012.cancel();
                }
            } else if (!z3) {
                this.A0P.A02(C42341xd.A01(context, 0, intent, 134217728), 2, SystemClock.elapsedRealtime() + 60000);
                Log.i("connectivity retry alarm set for 60000ms from now");
                return;
            }
        } else {
            Log.w("MessageHandler/onCaptivePortalDetectionAndWaitDone AlarmManager is null");
        }
        A13.set(z2);
        A11.countDown();
    }

    public final void A0G(boolean z2, boolean z3, boolean z4) {
        A0B(this.A0M.A02() ? this.A06 : null, (String) null, (String) null, 0, z2, z3, z4, false, false);
    }
}

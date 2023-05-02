package X;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.redex.IDxEventShape164S0100000_2_I0;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: X.2PR  reason: invalid class name */
public class AnonymousClass2PR extends AnonymousClass2PS implements AnonymousClass2PU {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public AudioTrack A04;
    public Surface A05;
    public SurfaceHolder A06;
    public TextureView A07;
    public C32491gT A08;
    public C32491gT A09;
    public C89164bh A0A;
    public C85484Oq A0B;
    public C85484Oq A0C;
    public AnonymousClass4TE A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J;
    public final Context A0K;
    public final AnonymousClass4G4 A0L;
    public final AnonymousClass4WT A0M;
    public final AnonymousClass3UF A0N;
    public final C62543Dz A0O;
    public final C55082io A0P;
    public final AnonymousClass4Bq A0Q;
    public final C82194Br A0R;
    public final C96224nz A0S;
    public final CopyOnWriteArraySet A0T;
    public final CopyOnWriteArraySet A0U;
    public final CopyOnWriteArraySet A0V;
    public final CopyOnWriteArraySet A0W;
    public final CopyOnWriteArraySet A0X;
    public final AnonymousClass5UO[] A0Y;

    @Deprecated
    public AnonymousClass2PR(Context context, Looper looper, AnonymousClass5L7 r27, C108225Nd r28, C96224nz r29, AnonymousClass5LL r30, AnonymousClass4GL r31, AnonymousClass5LX r32, AnonymousClass5TU r33) {
        int A002;
        C85564Oy r0 = new C85564Oy(context, r28);
        r0.A07 = r31;
        r0.A06 = r30;
        r0.A02 = r27;
        r0.A08 = r32;
        r0.A04 = r29;
        r0.A09 = r33;
        r0.A00 = looper;
        Context context2 = r0.A0A;
        Context applicationContext = context2.getApplicationContext();
        this.A0K = applicationContext;
        C96224nz r10 = r0.A04;
        this.A0S = r10;
        this.A0A = r0.A05;
        C62543Dz r1 = new C62543Dz(this);
        this.A0O = r1;
        this.A0X = new CopyOnWriteArraySet();
        this.A0T = new CopyOnWriteArraySet();
        this.A0W = new CopyOnWriteArraySet();
        this.A0V = new CopyOnWriteArraySet();
        this.A0U = new CopyOnWriteArraySet();
        Handler handler = new Handler(r0.A00);
        AnonymousClass5UO[] A7X = r0.A0B.A7X(handler, r1, r1, r1, r1);
        this.A0Y = A7X;
        this.A00 = 1.0f;
        if (AnonymousClass3C1.A01 < 21) {
            AudioTrack audioTrack = this.A04;
            if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                this.A04.release();
                this.A04 = null;
            }
            AudioTrack audioTrack2 = this.A04;
            if (audioTrack2 == null) {
                audioTrack2 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                this.A04 = audioTrack2;
            }
            A002 = audioTrack2.getAudioSessionId();
        } else {
            A002 = C90604eR.A00(applicationContext);
        }
        this.A01 = A002;
        this.A0E = Collections.emptyList();
        this.A0J = true;
        AnonymousClass4GL r12 = r0.A07;
        AnonymousClass5LL r11 = r0.A06;
        AnonymousClass5L7 r7 = r0.A02;
        AnonymousClass5LX r13 = r0.A08;
        AnonymousClass3UF r4 = new AnonymousClass3UF(r0.A00, r0.A01, r7, this, r0.A03, r10, r11, r12, r13, r0.A09, A7X);
        this.A0N = r4;
        r4.A4a(r1);
        this.A0L = new AnonymousClass4G4(context2, handler, r1);
        this.A0M = new AnonymousClass4WT(context2, handler, r1);
        C55082io r5 = new C55082io(context2, handler, r1);
        this.A0P = r5;
        r5.A03(2 - this.A0A.A01 != 0 ? 3 : 0);
        this.A0Q = new AnonymousClass4Bq(context2);
        this.A0R = new C82194Br(context2);
        this.A0D = new AnonymousClass4TE(r5.A01(), r5.A05.getStreamMaxVolume(r5.A00));
        A09(Integer.valueOf(this.A01), 1, 102);
        A09(Integer.valueOf(this.A01), 2, 102);
        A09(this.A0A, 1, 3);
        A09(1, 2, 4);
        A09(Boolean.valueOf(this.A0I), 1, 101);
    }

    public static /* synthetic */ void A00(AnonymousClass2PR r2) {
        int AF5 = r2.AF5();
        if (AF5 == 1) {
            return;
        }
        if (AF5 == 2 || AF5 == 3) {
            r2.A03();
            r2.A03();
            r2.A03();
        } else if (AF5 != 4) {
            throw new IllegalStateException();
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A01() {
        /*
            r12 = this;
            r12.A03()
            int r1 = X.AnonymousClass3C1.A01
            r5 = 0
            r0 = 21
            if (r1 >= r0) goto L_0x0013
            android.media.AudioTrack r0 = r12.A04
            if (r0 == 0) goto L_0x0013
            r0.release()
            r12.A04 = r5
        L_0x0013:
            X.2io r3 = r12.A0P
            X.3Ka r1 = r3.A02
            if (r1 == 0) goto L_0x0029
            android.content.Context r0 = r3.A04     // Catch:{ RuntimeException -> 0x001f }
            r0.unregisterReceiver(r1)     // Catch:{ RuntimeException -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r2 = move-exception
            java.lang.String r1 = "StreamVolumeManager"
            java.lang.String r0 = "Error unregistering stream volume receiver"
            X.C89504cL.A02(r1, r0, r2)
        L_0x0027:
            r3.A02 = r5
        L_0x0029:
            X.4WT r0 = r12.A0M
            r0.A02 = r5
            r0.A00()
            X.3UF r3 = r12.A0N
            java.lang.String r0 = "Release "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r2.append(r0)
            java.lang.String r0 = " ["
            r2.append(r0)
            java.lang.String r0 = "ExoPlayerLib/2.13.3"
            r2.append(r0)
            java.lang.String r1 = "] ["
            r2.append(r1)
            java.lang.String r0 = X.AnonymousClass3C1.A03
            r2.append(r0)
            r2.append(r1)
            java.lang.Class<X.4Yt> r1 = X.AnonymousClass4Yt.class
            monitor-enter(r1)
            java.lang.String r0 = X.AnonymousClass4Yt.A00     // Catch:{ all -> 0x0153 }
            monitor-exit(r1)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "ExoPlayerImpl"
            android.util.Log.i(r0, r1)
            X.4pg r4 = r3.A0B
            monitor-enter(r4)
            boolean r0 = r4.A0F     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x00c7
            android.os.HandlerThread r0 = r4.A0K     // Catch:{ all -> 0x0150 }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x00c7
            X.5La r0 = r4.A0Y     // Catch:{ all -> 0x0150 }
            r1 = 7
            X.4qO r0 = (X.C97684qO) r0     // Catch:{ all -> 0x0150 }
            android.os.Handler r0 = r0.A00     // Catch:{ all -> 0x0150 }
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0150 }
            X.4tO r9 = new X.4tO     // Catch:{ all -> 0x0150 }
            r9.<init>(r4)     // Catch:{ all -> 0x0150 }
            r6 = 500(0x1f4, double:2.47E-321)
            monitor-enter(r4)     // Catch:{ all -> 0x0150 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00c4 }
            long r10 = r10 + r6
            r8 = 0
        L_0x0099:
            java.lang.Object r0 = r9.get()     // Catch:{ all -> 0x00c4 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00c4 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x00b7
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            r4.wait(r6)     // Catch:{ InterruptedException -> 0x00af }
            goto L_0x00b0
        L_0x00af:
            r8 = 1
        L_0x00b0:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00c4 }
            long r6 = r10 - r0
            goto L_0x0099
        L_0x00b7:
            if (r8 == 0) goto L_0x00c0
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00c4 }
            r0.interrupt()     // Catch:{ all -> 0x00c4 }
        L_0x00c0:
            monitor-exit(r4)     // Catch:{ all -> 0x0150 }
            boolean r0 = r4.A0F     // Catch:{ all -> 0x0150 }
            goto L_0x00c8
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0150 }
            throw r0     // Catch:{ all -> 0x0150 }
        L_0x00c7:
            r0 = 1
        L_0x00c8:
            monitor-exit(r4)
            if (r0 != 0) goto L_0x00da
            X.4Wf r2 = r3.A0K
            X.4qP r1 = new X.4qP
            r1.<init>()
            r0 = 11
            r2.A02(r1, r0)
            r2.A00()
        L_0x00da:
            X.4Wf r0 = r3.A0K
            r0.A01()
            X.5La r0 = r3.A0J
            X.4qO r0 = (X.C97684qO) r0
            android.os.Handler r0 = r0.A00
            r0.removeCallbacksAndMessages(r5)
            X.4nz r1 = r3.A0D
            if (r1 == 0) goto L_0x00f5
            X.5LX r0 = r3.A0H
            X.3E2 r0 = (X.AnonymousClass3E2) r0
            X.4Pt r0 = r0.A09
            r0.A00(r1)
        L_0x00f5:
            X.4df r1 = r3.A05
            r0 = 1
            X.4df r1 = r1.A01(r0)
            r3.A05 = r1
            X.1c3 r0 = r1.A07
            X.4df r2 = r1.A06(r0)
            r3.A05 = r2
            long r0 = r2.A0G
            r2.A0F = r0
            X.4df r2 = r3.A05
            r0 = 0
            r2.A0H = r0
            X.4nz r2 = r12.A0S
            X.3AT r0 = r2.A06
            X.1c3 r0 = r0.A00
            X.4VC r1 = r2.A03(r0)
            android.util.SparseArray r0 = r2.A03
            r4 = 1036(0x40c, float:1.452E-42)
            r0.put(r4, r1)
            X.4Wf r0 = r2.A01
            r3 = 1
            com.facebook.redex.IDxEventShape164S0100000_2_I0 r2 = new com.facebook.redex.IDxEventShape164S0100000_2_I0
            r2.<init>(r1, r3)
            X.5La r0 = r0.A02
            r1 = 0
            X.4qO r0 = (X.C97684qO) r0
            android.os.Handler r0 = r0.A00
            android.os.Message r0 = r0.obtainMessage(r3, r4, r1, r2)
            r0.sendToTarget()
            r12.A02()
            android.view.Surface r1 = r12.A05
            if (r1 == 0) goto L_0x0147
            boolean r0 = r12.A0G
            if (r0 == 0) goto L_0x0145
            r1.release()
        L_0x0145:
            r12.A05 = r5
        L_0x0147:
            java.util.List r0 = java.util.Collections.emptyList()
            r12.A0E = r0
            r12.A0H = r3
            return
        L_0x0150:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0153:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PR.A01():void");
    }

    public final void A02() {
        TextureView textureView = this.A07;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0O) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.A07.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.A07 = null;
        }
        SurfaceHolder surfaceHolder = this.A06;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A0O);
            this.A06 = null;
        }
    }

    public final void A03() {
        if (Looper.myLooper() == this.A0N.A09) {
            return;
        }
        if (!this.A0J) {
            C89504cL.A02("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.A0F ? null : new IllegalStateException());
            this.A0F = true;
            return;
        }
        throw new IllegalStateException("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
    }

    public void A04(float f2) {
        A03();
        float max = Math.max(0.0f, Math.min(f2, 1.0f));
        if (this.A00 != max) {
            this.A00 = max;
            A09(Float.valueOf(max * this.A0M.A00), 1, 2);
            C96224nz r3 = this.A0S;
            AnonymousClass4VC A032 = r3.A03(r3.A06.A02);
            r3.A05(A032, new IDxEventShape164S0100000_2_I0(A032, 3), 1019);
            Iterator it = this.A0T.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onVolumeChanged");
            }
        }
    }

    public final void A05(int i2, int i3) {
        if (i2 != this.A03 || i3 != this.A02) {
            this.A03 = i2;
            this.A02 = i3;
            C96224nz r3 = this.A0S;
            AnonymousClass4VC A032 = r3.A03(r3.A06.A02);
            r3.A05(A032, new IDxEventShape164S0100000_2_I0(A032, 0), 1029);
            Iterator it = this.A0X.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void A06(int i2, int i3, boolean z2) {
        boolean z3;
        int i4 = 0;
        if (!z2 || i2 == -1) {
            z3 = false;
        } else {
            z3 = true;
            if (i2 != 1) {
                i4 = 1;
            }
        }
        this.A0N.A04(i4, i3, z3);
    }

    public final void A07(Surface surface, boolean z2) {
        Surface surface2;
        ArrayList arrayList = new ArrayList();
        AnonymousClass5UO[] r7 = this.A0Y;
        int length = r7.length;
        int i2 = 0;
        while (true) {
            surface2 = surface;
            if (i2 >= length) {
                break;
            }
            AnonymousClass5UO r15 = r7[i2];
            if (((C96244o1) r15).A09 == 2) {
                AnonymousClass3UF r8 = this.A0N;
                C97274pg r14 = r8.A0B;
                Timeline timeline = r8.A05.A05;
                r8.ABW();
                AnonymousClass4VB r12 = new AnonymousClass4VB(r14.A0L, r14, r15, timeline, r8.A0I);
                boolean z3 = !r12.A05;
                C90524eJ.A04(z3);
                r12.A00 = 1;
                C90524eJ.A04(z3);
                r12.A02 = surface2;
                r12.A00();
                arrayList.add(r12);
            }
            i2++;
        }
        Surface surface3 = this.A05;
        if (!(surface3 == null || surface3 == surface2)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass4VB r72 = (AnonymousClass4VB) it.next();
                    long j2 = 2000;
                    synchronized (r72) {
                        C90524eJ.A04(r72.A05);
                        boolean z4 = false;
                        if (r72.A01.getThread() != Thread.currentThread()) {
                            z4 = true;
                        }
                        C90524eJ.A04(z4);
                        long elapsedRealtime = SystemClock.elapsedRealtime() + 2000;
                        while (!r72.A04) {
                            if (j2 > 0) {
                                r72.wait(j2);
                                j2 = elapsedRealtime - SystemClock.elapsedRealtime();
                            } else {
                                throw new TimeoutException("Message delivery timed out.");
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.A0N.A05(new C804643y((C32491gT) null, (String) null, new AnonymousClass43W(3), 1, -1, 4, false), false);
            }
            if (this.A0G) {
                this.A05.release();
            }
        }
        this.A05 = surface2;
        this.A0G = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        if (r7 >= r12.A01) goto L_0x00b1;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass2PW r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r0.A03()
            java.util.List r12 = java.util.Collections.singletonList(r20)
            r7 = -1
            if (r21 == 0) goto L_0x000d
            r7 = 0
        L_0x000d:
            r0.A03()
            X.3UF r1 = r0.A0N
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r16 = r1.A01()
            long r14 = r1.ABQ()
            int r3 = r1.A02
            r2 = 1
            int r3 = r3 + 1
            r1.A02 = r3
            java.util.List r10 = r1.A0L
            boolean r3 = r10.isEmpty()
            if (r3 != 0) goto L_0x0045
            int r8 = r10.size()
            r6 = 0
            int r3 = r8 + -1
        L_0x0035:
            if (r3 < r6) goto L_0x003d
            r10.remove(r3)
            int r3 = r3 + -1
            goto L_0x0035
        L_0x003d:
            X.5TE r3 = r1.A07
            X.5TE r3 = r3.A6K(r6, r8)
            r1.A07 = r3
        L_0x0045:
            r3 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r13 = 0
        L_0x004c:
            int r6 = r12.size()
            if (r13 >= r6) goto L_0x0073
            java.lang.Object r11 = r12.get(r13)
            X.2PW r11 = (X.AnonymousClass2PW) r11
            boolean r9 = r1.A0M
            X.4nx r6 = new X.4nx
            r6.<init>(r11, r9)
            r8.add(r6)
            java.lang.Object r11 = r6.A03
            X.3VN r6 = r6.A02
            X.3VR r9 = r6.A01
            X.4nw r6 = new X.4nw
            r6.<init>(r9, r11)
            r10.add(r13, r6)
            int r13 = r13 + 1
            goto L_0x004c
        L_0x0073:
            X.5TE r9 = r1.A07
            int r6 = r8.size()
            X.5TE r6 = r9.A6J(r3, r6)
            r1.A07 = r6
            X.3UE r12 = new X.3UE
            r12.<init>(r6, r10)
            boolean r13 = r12.A0C()
            if (r13 != 0) goto L_0x0094
            int r6 = r12.A01
            if (r7 < r6) goto L_0x0094
            X.448 r0 = new X.448
            r0.<init>(r12, r7, r4)
            throw r0
        L_0x0094:
            r11 = -1
            if (r7 != r11) goto L_0x009a
            r7 = r16
            r4 = r14
        L_0x009a:
            X.4df r9 = r1.A05
            android.util.Pair r6 = r1.A02(r12, r7, r4)
            X.4df r10 = r1.A03(r6, r9, r12)
            int r9 = r10.A00
            if (r7 == r11) goto L_0x00b2
            if (r9 == r2) goto L_0x00b2
            if (r13 != 0) goto L_0x00b1
            int r6 = r12.A01
            r9 = 2
            if (r7 < r6) goto L_0x00b2
        L_0x00b1:
            r9 = 4
        L_0x00b2:
            X.4df r9 = r10.A01(r9)
            X.4pg r6 = r1.A0B
            long r14 = X.C90604eR.A01(r4)
            X.5TE r5 = r1.A07
            X.5La r4 = r6.A0Y
            X.4LO r6 = new X.4LO
            r10 = r6
            r11 = r5
            r12 = r8
            r13 = r7
            r10.<init>(r11, r12, r13, r14)
            r5 = 17
            X.4qO r4 = (X.C97684qO) r4
            android.os.Handler r4 = r4.A00
            android.os.Message r5 = r4.obtainMessage(r5, r6)
            r5.sendToTarget()
            r10 = 4
            r15 = 1
            r13 = 0
            r14 = 0
            r11 = 0
            r12 = 1
            r8 = r1
            r8.A06(r9, r10, r11, r12, r13, r14)
            r0.A03()
            boolean r7 = r0.AF3()
            X.4WT r5 = r0.A0M
            r6 = -1
            r5.A00()
            if (r7 == 0) goto L_0x00f0
            r6 = 1
        L_0x00f0:
            r5 = 1
            if (r7 == 0) goto L_0x00f6
            if (r6 == r2) goto L_0x00f6
            r5 = 2
        L_0x00f6:
            r0.A06(r6, r5, r7)
            X.4df r5 = r1.A05
            int r0 = r5.A00
            if (r0 != r2) goto L_0x012a
            r0 = 0
            X.4df r5 = r5.A03(r0)
            com.google.android.exoplayer2.Timeline r0 = r5.A05
            boolean r2 = r0.A0C()
            r0 = 2
            if (r2 == 0) goto L_0x010e
            r0 = 4
        L_0x010e:
            X.4df r13 = r5.A01(r0)
            int r0 = r1.A02
            int r0 = r0 + 1
            r1.A02 = r0
            android.os.Message r0 = r4.obtainMessage(r3)
            r0.sendToTarget()
            r14 = 4
            r16 = 1
            r17 = 0
            r18 = 0
            r12 = r1
            r12.A06(r13, r14, r15, r16, r17, r18)
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PR.A08(X.2PW, boolean):void");
    }

    public final void A09(Object obj, int i2, int i3) {
        for (AnonymousClass5UO r7 : this.A0Y) {
            if (((C96244o1) r7).A09 == i2) {
                AnonymousClass3UF r4 = this.A0N;
                C97274pg r6 = r4.A0B;
                Timeline timeline = r4.A05.A05;
                r4.ABW();
                AnonymousClass4VB r42 = new AnonymousClass4VB(r6.A0L, r6, r7, timeline, r4.A0I);
                boolean z2 = !r42.A05;
                C90524eJ.A04(z2);
                r42.A00 = i3;
                C90524eJ.A04(z2);
                r42.A02 = obj;
                r42.A00();
            }
        }
    }

    public void A0A(boolean z2) {
        A03();
        AnonymousClass4WT r0 = this.A0M;
        A03();
        AnonymousClass3UF r1 = this.A0N;
        r0.A00();
        r1.A05((C804643y) null, z2);
        this.A0E = Collections.emptyList();
    }

    public void A4a(AnonymousClass5TQ r2) {
        this.A0N.A4a(r2);
    }

    public long AAF() {
        A03();
        return this.A0N.AAF();
    }

    public long AAw() {
        A03();
        return this.A0N.AAw();
    }

    public int ABI() {
        A03();
        return this.A0N.ABI();
    }

    public int ABJ() {
        A03();
        return this.A0N.ABJ();
    }

    public int ABP() {
        A03();
        return this.A0N.ABP();
    }

    public long ABQ() {
        A03();
        return this.A0N.ABQ();
    }

    public Timeline ABV() {
        A03();
        return this.A0N.A05.A05;
    }

    public int ABW() {
        A03();
        return this.A0N.ABW();
    }

    public long ABq() {
        A03();
        return this.A0N.ABq();
    }

    public boolean AF3() {
        A03();
        return this.A0N.A05.A0D;
    }

    public int AF5() {
        A03();
        return this.A0N.A05.A00;
    }

    public long AGb() {
        A03();
        return this.A0N.AGb();
    }

    public boolean AJS() {
        A03();
        return this.A0N.AJS();
    }

    public void Aby(AnonymousClass5TQ r2) {
        this.A0N.Aby(r2);
    }

    public void AdE(int i2, long j2) {
        A03();
        C96224nz r4 = this.A0S;
        if (!r4.A02) {
            AnonymousClass4VC A032 = r4.A03(r4.A06.A00);
            r4.A02 = true;
            r4.A05(A032, new IDxEventShape164S0100000_2_I0(A032, 2), -1);
        }
        this.A0N.AdE(i2, j2);
    }

    public void AeK(boolean z2) {
        A03();
        AnonymousClass4WT r0 = this.A0M;
        A03();
        int i2 = -1;
        r0.A00();
        if (z2) {
            i2 = 1;
        }
        int i3 = 1;
        if (z2 && i2 != 1) {
            i3 = 2;
        }
        A06(i2, i3, z2);
    }
}

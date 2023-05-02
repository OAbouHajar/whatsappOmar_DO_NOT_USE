package X;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxCListenerShape42S0000000_2_I0;
import com.facebook.redex.IDxTListenerShape464S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.obwhatsapp.R;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.29C  reason: invalid class name */
public final class AnonymousClass29C extends AnonymousClass29D {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public AudioManager.OnAudioFocusChangeListener A06;
    public Uri A07;
    public AnonymousClass2PR A08;
    public C65593Vj A09;
    public C108355Nq A0A;
    public AnonymousClass4E2 A0B;
    public ExoPlaybackControlView A0C;
    public AnonymousClass2PV A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final Activity A0Q;
    public final Handler A0R;
    public final AnonymousClass5TQ A0S;
    public final C14870pt A0T;
    public final AnonymousClass01V A0U;
    public final AnonymousClass013 A0V;
    public final C16320sq A0W;
    public final AnonymousClass4FM A0X;
    public final C56852oj A0Y;

    public AnonymousClass29C(Activity activity, C14870pt r4, AnonymousClass01V r5, AnonymousClass013 r6, C16320sq r7, AnonymousClass4FM r8, AnonymousClass2PV r9, boolean z2, boolean z3) {
        this.A0R = new Handler(Looper.getMainLooper());
        this.A07 = new Uri.Builder().build();
        this.A00 = Integer.MAX_VALUE;
        this.A04 = 5;
        this.A03 = -1;
        this.A02 = 0;
        this.A0S = new AnonymousClass3Dy(this);
        this.A0T = r4;
        this.A0W = r7;
        this.A0U = r5;
        this.A0V = r6;
        this.A0Q = activity;
        C56852oj r0 = new C56852oj(activity, z3);
        this.A0Y = r0;
        r0.setLayoutResizingEnabled(z2);
        this.A0X = r8;
        this.A0D = r9;
    }

    public AnonymousClass29C(Activity activity, Uri uri, C14870pt r15, AnonymousClass01V r16, AnonymousClass013 r17, C16320sq r18, C97584qE r19, AnonymousClass2PV r20) {
        this(activity, r15, r16, r17, r18, (AnonymousClass4FM) null, r20, true, false);
        this.A07 = uri;
        C97584qE r1 = r19;
        r1.A00 = new C48652Oi(this);
        this.A0A = r1;
    }

    public final AnonymousClass2PW A0F() {
        Uri uri = this.A07;
        C108355Nq r5 = this.A0A;
        if (r5 == null) {
            Activity activity = this.A0Q;
            r5 = new C97614qH(activity, AnonymousClass3C1.A07(activity, activity.getString(R.string.str1bd4)));
            this.A0A = r5;
        }
        AnonymousClass3VL r2 = new AnonymousClass3VL(uri, C96754oq.A0M, r5, new C97654qL(), (Object) null);
        return this.A0I ? new AnonymousClass3VM(r2, this.A00) : r2;
    }

    public void A0G() {
        hashCode();
        if (this.A08 == null) {
            ExoPlaybackControlView exoPlaybackControlView = this.A0C;
            if (exoPlaybackControlView != null) {
                if ((this.A0Q.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) {
                    exoPlaybackControlView.A0F.setVisibility(0);
                    if (exoPlaybackControlView.A09) {
                        exoPlaybackControlView.A0E.setVisibility(0);
                    }
                    exoPlaybackControlView.A04();
                    exoPlaybackControlView.A03();
                    exoPlaybackControlView.A05();
                } else {
                    exoPlaybackControlView.A02();
                }
            }
            A0I();
            this.A0G = true;
            if (this.A0O) {
                AnonymousClass2PR r1 = this.A08;
                if (r1 != null) {
                    r1.AeK(true);
                    ExoPlaybackControlView exoPlaybackControlView2 = this.A0C;
                    if (exoPlaybackControlView2 != null) {
                        exoPlaybackControlView2.A03 = null;
                        exoPlaybackControlView2.A04 = new IDxTListenerShape464S0100000_2_I0(this, 1);
                    }
                    this.A0T.A0K(new RunnableRunnableShape16S0100000_I0_15(this, 15));
                }
            } else if (this.A0C == null) {
                AnonymousClass2PV r0 = this.A0D;
                if (r0 != null) {
                    r0.A00();
                }
                this.A08.A08(A0F(), true);
            } else {
                AnonymousClass2PR r12 = this.A08;
                AnonymousClass00B.A06(r12);
                r12.AeK(false);
                ExoPlaybackControlView exoPlaybackControlView3 = this.A0C;
                if (exoPlaybackControlView3 != null) {
                    exoPlaybackControlView3.A03 = new C1038552z(this);
                    exoPlaybackControlView3.A04 = new IDxTListenerShape464S0100000_2_I0(this, 0);
                }
            }
        }
    }

    public void A0H() {
        boolean z2;
        AnonymousClass2PR r0 = this.A08;
        if (r0 != null) {
            if (r0.AF5() == 1) {
                z2 = false;
                this.A0M = false;
            } else {
                this.A0M = true;
                z2 = false;
                this.A08.A0A(false);
            }
            this.A0N = z2;
            this.A0E = z2;
            this.A0L = z2;
            this.A0K = z2;
            AnonymousClass2PV r02 = this.A0D;
            if (r02 != null) {
                r02.A00();
            }
            this.A08.A08(A0F(), true);
            this.A0G = true;
        }
    }

    public final void A0I() {
        AnonymousClass2PR A002;
        boolean z2;
        if (this.A08 == null) {
            C56852oj r1 = this.A0Y;
            this.A09 = new C65593Vj(r1.getContext());
            AnonymousClass4FM r0 = this.A0X;
            if (r0 != null) {
                Context context = r1.getContext();
                C65593Vj r3 = this.A09;
                C88394aQ r5 = r0.A00;
                int i2 = r5.A00;
                if (i2 < C88394aQ.A08) {
                    r5.A00 = i2 + 1;
                    z2 = true;
                } else {
                    z2 = false;
                }
                C97574qD r8 = new C97574qD(32768);
                C90524eJ.A04(true);
                C96184nv.A00("bufferForPlaybackMs", "0", 100, 0);
                C96184nv.A00("bufferForPlaybackAfterRebufferMs", "0", 100, 0);
                C96184nv.A00("minBufferMs", "bufferForPlaybackMs", 700, 100);
                C96184nv.A00("minBufferMs", "bufferForPlaybackAfterRebufferMs", 700, 100);
                C96184nv.A00("maxBufferMs", "minBufferMs", 1000, 700);
                C90524eJ.A04(true);
                C96274o4 r02 = new C96274o4(context, z2);
                C90524eJ.A04(true);
                A002 = C806444x.A00(context, new C96184nv(r8, 700, 1000, 100, 100), r02, r3);
            } else {
                Context context2 = r1.getContext();
                C96264o3 r4 = new C96264o3(r1.getContext());
                C65593Vj r32 = this.A09;
                C97574qD r82 = new C97574qD(32768);
                C90524eJ.A04(true);
                C96184nv.A00("bufferForPlaybackMs", "0", 1000, 0);
                C96184nv.A00("bufferForPlaybackAfterRebufferMs", "0", 1000, 0);
                C96184nv.A00("minBufferMs", "bufferForPlaybackMs", 1000, 1000);
                C96184nv.A00("minBufferMs", "bufferForPlaybackAfterRebufferMs", 1000, 1000);
                C96184nv.A00("maxBufferMs", "minBufferMs", 2000, 1000);
                C90524eJ.A04(true);
                C90524eJ.A04(true);
                A002 = C806444x.A00(context2, new C96184nv(r82, 1000, 2000, 1000, 1000), r4, r32);
            }
            this.A08 = A002;
            float f2 = 1.0f;
            if (this.A0J) {
                f2 = 0.0f;
            }
            A002.A04(f2);
            this.A08.A4a(this.A0S);
            r1.setPlayer(this.A08);
            if (this.A0P) {
                long j2 = this.A05;
                int i3 = (j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1));
                AnonymousClass2PR r12 = this.A08;
                int i4 = this.A01;
                if (i3 == 0) {
                    r12.AdE(i4, -9223372036854775807L);
                } else {
                    r12.AdE(i4, j2);
                }
            } else {
                int i5 = this.A03;
                if (i5 >= 0) {
                    this.A08.AdF((long) i5);
                    this.A03 = -1;
                }
            }
        }
    }

    public final void A0J() {
        AudioManager A0G2;
        if (!this.A0F && (A0G2 = this.A0U.A0G()) != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A06;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new IDxCListenerShape42S0000000_2_I0(2);
                this.A06 = onAudioFocusChangeListener;
            }
            A0G2.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
        }
    }

    public final void A0K(AnonymousClass2PW r3) {
        ExoPlaybackControlView exoPlaybackControlView = this.A0C;
        if (exoPlaybackControlView != null) {
            exoPlaybackControlView.A03 = null;
            exoPlaybackControlView.A04 = null;
        }
        A0I();
        AnonymousClass2PV r0 = this.A0D;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass2PR r02 = this.A08;
        if (r02 != null && r02.AF5() == 1) {
            this.A08.A08(r3, true);
        }
        A0J();
    }
}

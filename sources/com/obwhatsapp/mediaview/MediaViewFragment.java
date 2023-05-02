package com.obwhatsapp.mediaview;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass08E;
import X.AnonymousClass10B;
import X.AnonymousClass10C;
import X.AnonymousClass10G;
import X.AnonymousClass10X;
import X.AnonymousClass120;
import X.AnonymousClass121;
import X.AnonymousClass12W;
import X.AnonymousClass156;
import X.AnonymousClass1A9;
import X.AnonymousClass1BU;
import X.AnonymousClass1G1;
import X.AnonymousClass1H9;
import X.AnonymousClass1HE;
import X.AnonymousClass1N7;
import X.AnonymousClass1P7;
import X.AnonymousClass1P8;
import X.AnonymousClass1yL;
import X.AnonymousClass20C;
import X.AnonymousClass29B;
import X.AnonymousClass29C;
import X.AnonymousClass29D;
import X.AnonymousClass2B7;
import X.AnonymousClass2B8;
import X.AnonymousClass2JP;
import X.AnonymousClass2PV;
import X.AnonymousClass2SR;
import X.AnonymousClass3DI;
import X.AnonymousClass4I6;
import X.AnonymousClass5QC;
import X.C004601z;
import X.C018208n;
import X.C102854zd;
import X.C14550pN;
import X.C14580pQ;
import X.C14630pV;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15800rs;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C16210se;
import X.C16260sj;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16480t8;
import X.C16490t9;
import X.C16500tA;
import X.C16620tM;
import X.C16730tY;
import X.C16750ta;
import X.C16760tb;
import X.C16980tz;
import X.C17020u3;
import X.C17030uP;
import X.C17090uW;
import X.C17120uZ;
import X.C17140ub;
import X.C17180uf;
import X.C17190ug;
import X.C17220uj;
import X.C17240ul;
import X.C17800vf;
import X.C18030w2;
import X.C18050w4;
import X.C18090w8;
import X.C18260wP;
import X.C18290wS;
import X.C18930xU;
import X.C18940xV;
import X.C19150xq;
import X.C19410yO;
import X.C19610yi;
import X.C19820z3;
import X.C19980zJ;
import X.C19990zK;
import X.C20260zl;
import X.C208811y;
import X.C209212c;
import X.C215914r;
import X.C216114t;
import X.C217915l;
import X.C226818w;
import X.C23101Am;
import X.C23181Au;
import X.C23201Aw;
import X.C23231Az;
import X.C23651Cv;
import X.C24961Hy;
import X.C25791Ld;
import X.C28381Vw;
import X.C28961Zl;
import X.C30211bx;
import X.C33481ie;
import X.C34321k4;
import X.C38621r6;
import X.C41961wy;
import X.C41971wz;
import X.C42601y5;
import X.C447725m;
import X.C47712Kc;
import X.C51202bB;
import X.C610537d;
import X.C610637e;
import X.C613038j;
import X.C75643sU;
import X.C91844ga;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxNConsumerShape151S0100000_1_I0;
import com.facebook.redex.IDxNConsumerShape39S0200000_2_I0;
import com.facebook.redex.IDxRListenerShape346S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0310000_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.InteractiveAnnotation;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0;
import com.obwhatsapp.ui.media.MediaCaptionTextView;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;
import com.obwhatsapp.voicerecorder.VoiceNoteSeekBar;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MediaViewFragment extends Hilt_MediaViewFragment implements AnonymousClass29B {
    public static final boolean A1y;
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03 = 0;
    public int A04;
    public long A05;
    public Handler A06;
    public View A07;
    public ImageButton A08;
    public TextView A09;
    public DialogFragment A0A;
    public DialogFragment A0B;
    public RunnableRunnableShape0S0310000_I0 A0C;
    public C23101Am A0D;
    public C19980zJ A0E;
    public AnonymousClass1G1 A0F;
    public C16300so A0G;
    public C208811y A0H;
    public C14870pt A0I;
    public C17090uW A0J;
    public C16040sK A0K;
    public AnonymousClass10X A0L;
    public C15900s5 A0M;
    public C16760tb A0N;
    public C24961Hy A0O;
    public C17180uf A0P;
    public C23651Cv A0Q;
    public C18930xU A0R;
    public C18260wP A0S;
    public C16000sG A0T;
    public C17140ub A0U;
    public AnonymousClass156 A0V;
    public C17030uP A0W;
    public C16080sP A0X;
    public AnonymousClass120 A0Y;
    public C23181Au A0Z;
    public C15800rs A0a;
    public C19610yi A0b;
    public AnonymousClass10C A0c;
    public AnonymousClass12W A0d;
    public AnonymousClass01V A0e;
    public AnonymousClass1H9 A0f;
    public C16440t3 A0g;
    public C16980tz A0h;
    public C17120uZ A0i;
    public C16260sj A0j;
    public C15860rz A0k;
    public AnonymousClass013 A0l;
    public C14730pf A0m;
    public C19820z3 A0n;
    public C226818w A0o;
    public C216114t A0p;
    public C16460t6 A0q;
    public AnonymousClass10B A0r;
    public C16480t8 A0s;
    public C19150xq A0t;
    public AnonymousClass10G A0u;
    public C19410yO A0v;
    public C16500tA A0w;
    public C18030w2 A0x;
    public C14710pd A0y;
    public C20260zl A0z;
    public C16490t9 A10;
    public C17240ul A11;
    public C217915l A12;
    public C15830rv A13;
    public GroupJid A14;
    public AnonymousClass1P7 A15;
    public AnonymousClass4I6 A16;
    public AnonymousClass1HE A17;
    public C215914r A18;
    public AnonymousClass1P8 A19;
    public C209212c A1A;
    public C613038j A1B;
    public AnonymousClass2B7 A1C;
    public AnonymousClass2B8 A1D;
    public C19990zK A1E;
    public C17190ug A1F;
    public C17800vf A1G;
    public C18090w8 A1H;
    public C18290wS A1I;
    public C17020u3 A1J;
    public AnonymousClass121 A1K;
    public C28381Vw A1L;
    public C16730tY A1M;
    public C16730tY A1N;
    public C16730tY A1O;
    public C51202bB A1P;
    public AnonymousClass1N7 A1Q;
    public C16210se A1R;
    public AnonymousClass1BU A1S;
    public C17220uj A1T;
    public MediaCaptionTextView A1U;
    public C18050w4 A1V;
    public C30211bx A1W;
    public C23231Az A1X;
    public AnonymousClass1A9 A1Y;
    public C25791Ld A1Z;
    public C16320sq A1a;
    public C23201Aw A1b;
    public AnonymousClass29C A1c = null;
    public VoiceNoteSeekBar A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g = false;
    public boolean A1h = false;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k = true;
    public boolean A1l = true;
    public boolean A1m;
    public boolean A1n;
    public boolean A1o;
    public boolean A1p;
    public boolean A1q;
    public final C33481ie A1r = new IDxCObserverShape68S0100000_2_I0(this, 22);
    public final C18940xV A1s = new IDxMObserverShape73S0100000_1_I0(this, 4);
    public final AnonymousClass5QC A1t = new IDxRListenerShape346S0100000_2_I0(this, 1);
    public final Runnable A1u = new RunnableRunnableShape11S0100000_I0_10((Object) this, 4);
    public final HashMap A1v = new HashMap();
    public final Map A1w = new HashMap();
    public final Map A1x = new HashMap();
    public boolean prevon;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT > 23) {
            z2 = true;
        }
        A1y = z2;
    }

    public static int A01(int i2) {
        if (i2 == 1) {
            return R.string.str092c;
        }
        if (i2 == 2) {
            return R.string.str0926;
        }
        if (i2 != 3) {
            return i2 != 9 ? i2 != 13 ? i2 != 42 ? i2 == 43 ? R.string.str093b : R.string.str0930 : R.string.str092c : R.string.str092b : R.string.str092a;
        }
    }

    public static MediaViewFragment A02(Bundle bundle, C15830rv r5, C28381Vw r6, int i2, int i3, int i4, long j2, boolean z2, boolean z3, boolean z4) {
        MediaViewFragment mediaViewFragment = new MediaViewFragment();
        Bundle bundle2 = new Bundle();
        AnonymousClass1yL.A09(bundle2, r6, "");
        if (r5 != null) {
            bundle2.putString("jid", r5.getRawString());
        }
        bundle2.putBoolean("gallery", z2);
        bundle2.putBoolean("nogallery", z3);
        bundle2.putInt("video_play_origin", i2);
        bundle2.putLong("start_t", j2);
        bundle2.putBundle("animation_bundle", bundle);
        bundle2.putInt("navigator_type", i4);
        bundle2.putInt("menu_style", i3);
        bundle2.putBoolean("menu_set_wallpaper", z4);
        mediaViewFragment.A0T(bundle2);
        return mediaViewFragment;
    }

    public static final void A03(Menu menu, int i2, boolean z2) {
        MenuItem findItem = menu.findItem(i2);
        if (findItem != null) {
            findItem.setVisible(z2);
        }
    }

    public static /* synthetic */ void A04(InteractiveAnnotation interactiveAnnotation, MediaViewFragment mediaViewFragment, PhotoView photoView) {
        C613038j r1 = new C613038j(photoView.getContext(), (ViewGroup) photoView.getRootView(), mediaViewFragment.A15);
        mediaViewFragment.A1B = r1;
        r1.A00((PopupWindow.OnDismissListener) null, interactiveAnnotation, photoView);
    }

    public static /* synthetic */ void A05(MediaViewFragment mediaViewFragment) {
        if (mediaViewFragment.A1p && mediaViewFragment.A1f) {
            if (mediaViewFragment.A1N != null && mediaViewFragment.A0j.A0B()) {
                C16730tY r2 = mediaViewFragment.A1N;
                mediaViewFragment.A1N = null;
                C102854zd r1 = new C102854zd(mediaViewFragment, r2);
                if (!mediaViewFragment.A0E) {
                    r1.AZA(true);
                } else {
                    mediaViewFragment.A0A = r1;
                }
            }
            if (mediaViewFragment.A1R()) {
                mediaViewFragment.A0D().A0c();
            } else {
                mediaViewFragment.A0M();
            }
        }
    }

    public static /* synthetic */ void A06(MediaViewFragment mediaViewFragment, ExoPlaybackControlView exoPlaybackControlView, AnonymousClass29C r6, int i2) {
        ExoPlaybackControlView exoPlaybackControlView2;
        ExoPlaybackControlView exoPlaybackControlView3;
        if (!r6.A0G) {
            return;
        }
        if ((i2 & 4) == 0) {
            mediaViewFragment.A1P(true, false);
            for (AnonymousClass29C r0 : mediaViewFragment.A1x.values()) {
                if (!(r0 == r6 || (exoPlaybackControlView3 = r0.A0C) == null)) {
                    exoPlaybackControlView3.A0F.setVisibility(0);
                    if (exoPlaybackControlView3.A09) {
                        exoPlaybackControlView3.A0E.setVisibility(0);
                    }
                    exoPlaybackControlView3.A04();
                    exoPlaybackControlView3.A03();
                    exoPlaybackControlView3.A05();
                }
            }
            if (Build.VERSION.SDK_INT < 19 && exoPlaybackControlView.getVisibility() != 0) {
                exoPlaybackControlView.A01();
                exoPlaybackControlView.A06(3000);
                return;
            }
            return;
        }
        mediaViewFragment.A1P(false, false);
        for (AnonymousClass29C r02 : mediaViewFragment.A1x.values()) {
            if (!(r02 == r6 || (exoPlaybackControlView2 = r02.A0C) == null)) {
                exoPlaybackControlView2.A02();
            }
        }
    }

    public void A0q() {
        AnonymousClass29C r0;
        C47712Kc r3 = ((C14580pQ) ((C14630pV) A0D())).A01;
        r3.A01.A08("on_fragment_start");
        super.A0q();
        if (A1y && (r0 = this.A1c) != null) {
            r0.A0G();
            AnonymousClass2PV r1 = this.A1c.A0D;
            if (r1 != null && !(r1 instanceof C610537d)) {
                C610637e r12 = (C610637e) r1;
                if (!r12.A06) {
                    r12.A0B.A02();
                }
            }
        }
        this.A06.setAlpha(1.0f);
        r3.A01.A07("on_fragment_start");
    }

    public void A0r(Intent intent) {
        AnonymousClass2B7 r0 = this.A1C;
        if (r0 != null) {
            r0.ATs();
        }
        super.A0r(intent);
    }

    public void A0s(Bundle bundle) {
        GroupJid groupJid = this.A14;
        if (groupJid != null) {
            bundle.putString("gid", groupJid.getRawString());
        }
        bundle.putBoolean("is_different_video", this.A1k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (X.C38621r6.A0o(r9) != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        if (r13 != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0109, code lost:
        if (r19 == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0127, code lost:
        if (r6 != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015c, code lost:
        if (r22 == false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0187, code lost:
        if (X.C38621r6.A0c(r11.A0z, r9) == false) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0t(android.view.Menu r24) {
        /*
            r23 = this;
            r12 = r24
            int r0 = r12.size()
            if (r0 == 0) goto L_0x0167
            r11 = r23
            X.2hw r1 = r11.A09
            r14 = 1
            if (r1 == 0) goto L_0x0198
            X.0rv r0 = r11.A13
            if (r0 == 0) goto L_0x0193
            boolean r0 = r11.A1o
            r10 = r0 ^ 1
            r22 = 1
        L_0x0019:
            int r0 = r1.getCurrentItem()
            X.0tY r9 = r11.A1U(r0)
            if (r9 == 0) goto L_0x01aa
            byte r8 = r9.A10
            r7 = 0
            if (r8 != r14) goto L_0x0029
            r7 = 1
        L_0x0029:
            boolean r6 = r9.A0x
            X.10B r0 = r11.A0r
            boolean r21 = r0.A02(r9)
            X.10B r0 = r11.A0r
            boolean r20 = r0.A03(r9)
            X.0pd r1 = r11.A0y
            X.0s5 r0 = r11.A0M
            boolean r19 = X.C38621r6.A0W(r0, r1, r9)
            boolean r5 = X.C38621r6.A0m(r9)
            boolean r4 = r9 instanceof X.C39001rl
            if (r4 != 0) goto L_0x005f
            r0 = 10
            if (r8 == r0) goto L_0x005f
            r0 = 12
            if (r8 == r0) goto L_0x005f
            r0 = 11
            if (r8 == r0) goto L_0x005f
            r0 = 31
            if (r8 == r0) goto L_0x005f
            boolean r0 = X.C38621r6.A0o(r9)
            r18 = 1
            if (r0 == 0) goto L_0x0061
        L_0x005f:
            r18 = 0
        L_0x0061:
            X.0zl r2 = r11.A0z
            X.1Vw r1 = r9.A11
            X.0rv r0 = r1.A00
            boolean r0 = X.C40561uK.A01(r2, r0)
            if (r0 == 0) goto L_0x018f
            r22 = 0
        L_0x006f:
            X.0ta r0 = r9.A02
            boolean r3 = r1.A02
            if (r3 == 0) goto L_0x018c
            if (r0 == 0) goto L_0x018c
            boolean r0 = r0.A0P
            if (r0 != 0) goto L_0x018c
            java.lang.String r0 = "mediaViewFragment/cannot save partially uploaded message."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r2 = 0
        L_0x0081:
            if (r18 == 0) goto L_0x00a7
            if (r6 != 0) goto L_0x00a7
            boolean r0 = X.C38621r6.A0l(r9)
            if (r0 == 0) goto L_0x00a7
            X.0pd r13 = r11.A0y
            r1 = 1353(0x549, float:1.896E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r13.A0E(r0, r1)
            if (r0 != 0) goto L_0x00a5
            int r0 = r9.A06()
            if (r14 != r0) goto L_0x00a7
            X.0pd r0 = r11.A0y
            boolean r0 = X.C34321k4.A05(r0, r9)
            if (r0 == 0) goto L_0x00a7
        L_0x00a5:
            r18 = 0
        L_0x00a7:
            r1 = r4 ^ 1
            int r13 = r11.A02
            r0 = 3
            if (r13 != r0) goto L_0x0172
            X.0zl r0 = r11.A0z
            boolean r13 = X.C38621r6.A0c(r0, r9)
            if (r13 == 0) goto L_0x00e5
        L_0x00b6:
            com.whatsapp.jid.UserJid r15 = r9.A0C()
            if (r15 != 0) goto L_0x00c0
            X.0rv r15 = r11.A13
            if (r15 == 0) goto L_0x00e5
        L_0x00c0:
            r0 = 15
            android.view.MenuItem r14 = r12.findItem(r0)
            if (r14 == 0) goto L_0x00e5
            X.0sG r0 = r11.A0T
            X.0sH r15 = r0.A0A(r15)
            X.0sP r0 = r11.A0X
            java.lang.String r17 = r0.A0C(r15)
            r15 = 2131891233(0x7f121421, float:1.941718E38)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r16 = 0
            r0[r16] = r17
            java.lang.String r0 = r11.A0K(r15, r0)
            r14.setTitle(r0)
        L_0x00e5:
            X.0ta r9 = r9.A02
            boolean r0 = X.AnonymousClass20C.A00(r8)
            if (r0 == 0) goto L_0x01bb
            if (r3 != 0) goto L_0x01bb
            if (r9 == 0) goto L_0x01bb
            boolean r0 = r9.A0P
            if (r0 != 0) goto L_0x01bb
            r14 = 1
            r3 = 1
            r8 = 1
        L_0x00f8:
            r12.setGroupVisible(r3, r7)
            r0 = 6
            A03(r12, r0, r14)
            r0 = 8
            A03(r12, r0, r5)
            r5 = 9
            if (r8 != 0) goto L_0x010b
            r0 = 1
            if (r19 != 0) goto L_0x010c
        L_0x010b:
            r0 = 0
        L_0x010c:
            A03(r12, r5, r0)
            r0 = 14
            A03(r12, r0, r4)
            r0 = 12
            A03(r12, r0, r1)
            r0 = 7
            A03(r12, r0, r10)
            r0 = 16
            A03(r12, r0, r2)
            r4 = 1
            r2 = 0
            if (r18 == 0) goto L_0x0129
            r1 = 1
            if (r6 == 0) goto L_0x012a
        L_0x0129:
            r1 = 0
        L_0x012a:
            r0 = 10
            A03(r12, r0, r1)
            r0 = 11
            if (r18 == 0) goto L_0x0170
            if (r6 == 0) goto L_0x0170
        L_0x0135:
            A03(r12, r0, r4)
            r0 = 17
            A03(r12, r0, r2)
            r0 = 18
            A03(r12, r0, r2)
            r2 = 10
            r1 = 0
            if (r20 == 0) goto L_0x016c
            A03(r12, r0, r3)
            A03(r12, r2, r1)
        L_0x014d:
            r0 = 17
            if (r21 == 0) goto L_0x0168
            A03(r12, r0, r3)
            A03(r12, r2, r1)
        L_0x0157:
            r1 = 13
            if (r8 != 0) goto L_0x015e
            r0 = 1
            if (r22 != 0) goto L_0x015f
        L_0x015e:
            r0 = 0
        L_0x015f:
            A03(r12, r1, r0)
            r0 = 15
            A03(r12, r0, r13)
        L_0x0167:
            return
        L_0x0168:
            A03(r12, r0, r1)
            goto L_0x0157
        L_0x016c:
            A03(r12, r0, r1)
            goto L_0x014d
        L_0x0170:
            r4 = 0
            goto L_0x0135
        L_0x0172:
            if (r13 != r14) goto L_0x0189
            X.0pd r14 = r11.A0y
            r13 = 535(0x217, float:7.5E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r14.A0E(r0, r13)
            if (r0 == 0) goto L_0x0189
            X.0zl r0 = r11.A0z
            boolean r0 = X.C38621r6.A0c(r0, r9)
            r13 = 1
            if (r0 != 0) goto L_0x00b6
        L_0x0189:
            r13 = 0
            goto L_0x00e5
        L_0x018c:
            r2 = 1
            goto L_0x0081
        L_0x018f:
            r22 = r4 ^ 1
            goto L_0x006f
        L_0x0193:
            r10 = 0
            r22 = 0
            goto L_0x0019
        L_0x0198:
            r1 = 0
            r14 = 0
            r3 = 1
            r10 = 0
            r7 = 0
            r6 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r5 = 0
            r18 = 0
            r22 = 0
            goto L_0x01b7
        L_0x01aa:
            r1 = 0
            r3 = 1
            r7 = 0
            r6 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r5 = 0
            r18 = 0
        L_0x01b7:
            r2 = 0
            r4 = 0
            r13 = 0
            goto L_0x01bd
        L_0x01bb:
            r14 = 1
            r3 = 1
        L_0x01bd:
            r8 = 0
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediaview.MediaViewFragment.A0t(android.view.Menu):void");
    }

    public void A0w() {
        AnonymousClass2B7 r0;
        super.A0w();
        if (!A1y && this.A1c != null) {
            this.A0I.A0J(this.A1u);
            this.A1c.A09();
            AnonymousClass2PV r02 = this.A1c.A0D;
            if (r02 != null) {
                r02.A01();
            }
        }
        if (A0D().isFinishing() && (r0 = this.A1C) != null) {
            r0.AgL();
        }
        C613038j r03 = this.A1B;
        if (r03 != null) {
            r03.A02.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.1m6} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.0rv] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d2, code lost:
        r2.A1G(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d6, code lost:
        if (r14 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r15 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00da, code lost:
        r12.A1K.A03(r15, (X.C14550pN) A0D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010e, code lost:
        r2.A09(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0111, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0151, code lost:
        if (r7.size() != 1) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015d, code lost:
        if (X.C16030sJ.A0Q((com.whatsapp.jid.Jid) r7.get(0)) != false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015f, code lost:
        X.C54472hZ.A00(new X.C14750ph().A0v(A02(), r12.A0T.A0A((X.C15830rv) r7.get(0))), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019f, code lost:
        ((X.C14530pL) A0D()).Agv(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0x(int r13, int r14, android.content.Intent r15) {
        /*
            r12 = this;
            r5 = 0
            java.lang.String r3 = "jids"
            r1 = 0
            r0 = -1
            r9 = r12
            switch(r13) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0035;
                case 2: goto L_0x0059;
                case 3: goto L_0x00af;
                case 4: goto L_0x00e6;
                case 5: goto L_0x013e;
                case 6: goto L_0x017c;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.A0x(r13, r14, r15)
        L_0x000c:
            return
        L_0x000d:
            if (r14 != r0) goto L_0x000c
            if (r15 == 0) goto L_0x000c
            android.net.Uri r0 = r15.getData()
            if (r0 == 0) goto L_0x000c
            android.net.Uri r4 = r15.getData()
            int r0 = r12.A03
            X.0tY r0 = r12.A1U(r0)
            if (r0 == 0) goto L_0x0027
            X.1Vw r0 = r0.A11
            X.0rv r5 = r0.A00
        L_0x0027:
            android.content.Context r3 = r12.A02()
            X.0se r2 = r12.A1R
            r1 = 1
            r2.A05(r3, r4, r5, r1)
            X.C17970vw.A0K(r3, r4)
            return
        L_0x0035:
            if (r14 != r0) goto L_0x00d6
            X.121 r2 = r12.A1K
            X.0sK r0 = r12.A0K
            r0.A0B()
            X.1Zb r0 = r0.A01
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r2.A0A(r0)
            if (r0 == 0) goto L_0x000c
            r0 = 2131892401(0x7f1218b1, float:1.941955E38)
            com.obwhatsapp.dialogs.ProgressDialogFragment r2 = com.obwhatsapp.dialogs.ProgressDialogFragment.A01(r1, r0)
            r12.A0B = r2
            X.02C r1 = r12.A0F()
            java.lang.String r0 = "photo_progress_fragment"
            goto L_0x00d2
        L_0x0059:
            if (r14 != r0) goto L_0x000c
            if (r15 == 0) goto L_0x000c
            java.lang.String r0 = "contact"
            java.lang.String r0 = r15.getStringExtra(r0)
            com.whatsapp.jid.GroupJid r0 = com.whatsapp.jid.GroupJid.getNullable(r0)
            r12.A14 = r0
            X.0t6 r4 = r12.A0q
            r2 = -1
            java.lang.String r0 = "message_row_id"
            long r2 = r15.getLongExtra(r0, r2)
            X.0th r0 = r4.A0K
            X.0tZ r0 = r0.A00(r2)
            X.0tY r0 = (X.C16730tY) r0
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            if (r0 == 0) goto L_0x00a4
            X.0ta r0 = r0.A02
            X.AnonymousClass00B.A06(r0)
            java.io.File r0 = r0.A0F
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r7.setData(r0)
            X.121 r6 = r12.A1K
            r11 = 3
            android.content.Context r0 = r12.A0u()
            if (r0 == 0) goto L_0x000c
            X.00l r8 = r12.A0D()
            X.0pN r8 = (X.C14550pN) r8
            r10 = r5
            r6.A05(r7, r8, r9, r10, r11)
            return
        L_0x00a4:
            java.lang.String r0 = "mediaview/no-message-for-group-icon"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0pt r2 = r12.A0I
            r0 = 2131888340(0x7f1208d4, float:1.9411313E38)
            goto L_0x010e
        L_0x00af:
            if (r14 != r0) goto L_0x00d6
            com.whatsapp.jid.GroupJid r3 = r12.A14
            if (r3 == 0) goto L_0x000c
            X.121 r2 = r12.A1K
            X.0sG r0 = r12.A0T
            X.0sH r0 = r0.A0A(r3)
            boolean r0 = r2.A0A(r0)
            if (r0 == 0) goto L_0x000c
            r0 = 2131892400(0x7f1218b0, float:1.9419547E38)
            com.obwhatsapp.dialogs.ProgressDialogFragment r2 = com.obwhatsapp.dialogs.ProgressDialogFragment.A01(r1, r0)
            r12.A0A = r2
            X.02C r1 = r12.A0F()
            java.lang.String r0 = "group_progress_fragment"
        L_0x00d2:
            r2.A1G(r1, r0)
            return
        L_0x00d6:
            if (r14 != 0) goto L_0x000c
            if (r15 == 0) goto L_0x000c
            X.121 r1 = r12.A1K
            X.00l r0 = r12.A0D()
            X.0pN r0 = (X.C14550pN) r0
            r1.A03(r15, r0)
            return
        L_0x00e6:
            if (r14 != r0) goto L_0x000c
            if (r15 == 0) goto L_0x000c
            X.1Vw r2 = X.AnonymousClass1yL.A02(r15)
            int r0 = r12.A03
            X.0tY r6 = r12.A1U(r0)
            if (r6 == 0) goto L_0x00fa
            X.1Vw r0 = r6.A11
            if (r0 == r2) goto L_0x0112
        L_0x00fa:
            X.0t6 r0 = r12.A0q
            X.0th r0 = r0.A0K
            X.0tZ r6 = r0.A03(r2)
            if (r6 != 0) goto L_0x0112
            java.lang.String r0 = "mediaview/forward/failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0pt r2 = r12.A0I
            r0 = 2131889465(0x7f120d39, float:1.9413594E38)
        L_0x010e:
            r2.A09(r0, r1)
            return
        L_0x0112:
            java.lang.Class<X.0rv> r2 = X.C15830rv.class
            java.util.ArrayList r0 = r15.getStringArrayListExtra(r3)
            java.util.List r7 = X.C16030sJ.A08(r2, r0)
            java.lang.String r0 = "include_captions"
            boolean r8 = r15.getBooleanExtra(r0, r1)
            boolean r0 = r12.A1m
            if (r0 == 0) goto L_0x0136
            boolean r0 = X.C16030sJ.A0S(r7)
            if (r0 == 0) goto L_0x0136
            X.1BU r2 = r12.A1S
            android.os.Bundle r0 = r15.getExtras()
            X.1m6 r5 = r2.A00(r0)
        L_0x0136:
            X.0tb r3 = r12.A0N
            X.10X r4 = r12.A0L
            r3.A08(r4, r5, r6, r7, r8)
            goto L_0x014c
        L_0x013e:
            if (r14 != r0) goto L_0x000c
            if (r15 == 0) goto L_0x000c
            java.lang.Class<X.0rv> r2 = X.C15830rv.class
            java.util.ArrayList r0 = r15.getStringArrayListExtra(r3)
            java.util.List r7 = X.C16030sJ.A08(r2, r0)
        L_0x014c:
            int r2 = r7.size()
            r0 = 1
            if (r2 != r0) goto L_0x019f
            java.lang.Object r0 = r7.get(r1)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 != 0) goto L_0x019f
            X.0ph r4 = new X.0ph
            r4.<init>()
            android.content.Context r3 = r12.A02()
            X.0sG r2 = r12.A0T
            java.lang.Object r0 = r7.get(r1)
            X.0rv r0 = (X.C15830rv) r0
            X.0sH r0 = r2.A0A(r0)
            android.content.Intent r0 = r4.A0v(r3, r0)
            X.C54472hZ.A00(r0, r12)
            return
        L_0x017c:
            if (r14 != r0) goto L_0x000c
            if (r15 == 0) goto L_0x000c
            android.net.Uri r0 = r15.getData()
            if (r0 == 0) goto L_0x000c
            android.net.Uri r5 = r15.getData()
            X.0rv r4 = X.C62063Bm.A03(r15)
            android.content.Context r3 = r12.A02()
            X.0se r2 = r12.A1R
            r1 = 1
            r2.A05(r3, r5, r4, r1)
            X.C17970vw.A0K(r3, r5)
            r12.A1F()
            return
        L_0x019f:
            X.00l r0 = r12.A0D()
            X.0pL r0 = (X.C14530pL) r0
            r0.Agv(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediaview.MediaViewFragment.A0x(int, int, android.content.Intent):void");
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
        MenuItem add;
        int i2;
        menu.clear();
        yo.MV_addSaveToMenu(menu, A1U(this.A03), this);
        if (this.A02 == 3) {
            yo.VO_addDLToMenu(menu);
            menu.add(0, 14, 1, R.string.str19e9).setIcon(AnonymousClass2SR.A02(A02(), R.drawable.ic_viewonce, R.color.color090b)).setShowAsAction(2);
        } else {
            menu.add(0, 10, 0, R.string.str00c2).setIcon(R.drawable.ic_media_unstarred).setShowAsAction(2);
            menu.add(0, 11, 0, R.string.str13fc).setIcon(R.drawable.ic_media_starred).setShowAsAction(2);
            C14710pd r1 = this.A0y;
            C16620tM r8 = C16620tM.A02;
            if (r1.A0E(r8, 1353)) {
                menu.add(0, 17, 0, R.string.str00b4).setIcon(R.drawable.ic_media_undo_keep).setShowAsAction(2);
            }
            if (C34321k4.A03(this.A0y)) {
                menu.add(0, 18, 0, R.string.str1887).setIcon(R.drawable.ic_action_keep).setShowAsAction(2);
            }
            if (this.A02 == 2) {
                add = menu.add(0, 6, 0, R.string.str1c4c);
                i2 = R.drawable.ic_action_delete;
            } else {
                add = menu.add(0, 9, 0, R.string.str05ca);
                i2 = R.drawable.ic_media_forward;
            }
            add.setIcon(i2).setShowAsAction(2);
            C16010sH A0A2 = this.A0T.A0A(this.A13);
            if (!this.A11.A0f(A0A2) && !this.A12.A00(A0A2)) {
                Drawable A032 = C018208n.A03(AnonymousClass08E.A01(A02(), R.drawable.ic_text_status_compose));
                C018208n.A0A(A032, -1);
                menu.add(0, 13, 0, R.string.str1c80).setIcon(A032).setShowAsAction(1);
            }
            menu.add(0, 7, 0, R.string.str00d9).setIcon(R.drawable.ic_action_all_media).setShowAsAction(0);
            menu.add(0, 12, 0, R.string.str19de).setShowAsAction(0);
            menu.add(0, 8, 0, R.string.str15f0).setIcon(R.drawable.ic_action_share);
            if (this.A0y.A0E(r8, 942)) {
                this.A1h = this.A0y.A0E(r8, 1050);
                menu.add(0, 16, 0, R.string.str1484);
            }
            SubMenu addSubMenu = menu.addSubMenu(1, 0, 0, R.string.str1519);
            addSubMenu.clearHeader();
            addSubMenu.add(1, 4, 0, R.string.str151b);
            addSubMenu.add(1, 5, 0, R.string.str151a);
            if (this.A1n) {
                addSubMenu.add(1, 1, 0, R.string.str1973);
            }
            menu.add(1, 2, 0, R.string.str19df);
            menu.add(1, 3, 0, R.string.str147e);
            if (this.A02 == 2) {
                return;
            }
        }
        menu.add(0, 6, 0, R.string.str1c4c);
        menu.add(0, 15, 0, R.string.str1420);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e1, code lost:
        r2.Acl(new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6(r8, r1, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02c8, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02cb, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A10(android.view.MenuItem r18) {
        /*
            r17 = this;
            r8 = r17
            int r0 = r8.A03
            X.0tY r7 = r8.A1U(r0)
            int r0 = r18.getItemId()
            r3 = 0
            r2 = 2
            r4 = 0
            r10 = 1
            switch(r0) {
                case 1: goto L_0x0281;
                case 2: goto L_0x0257;
                case 3: goto L_0x0014;
                case 4: goto L_0x00ce;
                case 5: goto L_0x0128;
                case 6: goto L_0x00a5;
                case 7: goto L_0x0124;
                case 8: goto L_0x00f6;
                case 9: goto L_0x01ee;
                case 10: goto L_0x01bf;
                case 11: goto L_0x01b4;
                case 12: goto L_0x016d;
                case 13: goto L_0x014d;
                case 14: goto L_0x0108;
                case 15: goto L_0x008e;
                case 16: goto L_0x0067;
                case 17: goto L_0x0041;
                case 18: goto L_0x0041;
                default: goto L_0x0013;
            }
        L_0x0013:
            return r10
        L_0x0014:
            int r0 = r8.A03
            X.0tY r0 = r8.A1U(r0)
            boolean r0 = r0 instanceof X.C38681rF
            if (r0 == 0) goto L_0x0013
            int r0 = r8.A03
            X.0tY r3 = r8.A1U(r0)
            X.AnonymousClass00B.A06(r3)
            X.1rF r3 = (X.C38681rF) r3
            X.0sq r2 = r8.A1a
            X.1A9 r1 = r8.A1Y
            X.0t8 r12 = r8.A0s
            X.1Ld r0 = r8.A1Z
            X.36M r11 = new X.36M
            r13 = r8
            r14 = r3
            r15 = r1
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Void[] r0 = new java.lang.Void[r4]
            r2.Ack(r11, r0)
            return r10
        L_0x0041:
            if (r7 == 0) goto L_0x0013
            X.00l r0 = r8.A0C()
            if (r0 == 0) goto L_0x0013
            X.10B r2 = r8.A0r
            int r1 = r18.getItemId()
            r0 = 17
            r9 = 0
            if (r1 != r0) goto L_0x0055
            r9 = 1
        L_0x0055:
            X.00l r4 = r8.A0D()
            X.0pN r4 = (X.C14550pN) r4
            X.0tb r5 = r8.A0N
            com.facebook.redex.IDxDInterfaceShape429S0100000_2_I0 r6 = new com.facebook.redex.IDxDInterfaceShape429S0100000_2_I0
            r6.<init>(r8, r10)
            r8 = 4
            r2.A01(r3, r4, r5, r6, r7, r8, r9)
            return r10
        L_0x0067:
            if (r7 == 0) goto L_0x0086
            X.0ta r0 = r7.A02
            if (r0 == 0) goto L_0x007e
            java.io.File r3 = r0.A0F
            if (r3 == 0) goto L_0x007e
            X.0sq r2 = r8.A1a
            r1 = 26
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r0.<init>(r8, r7, r3, r1)
            r2.Acl(r0)
            return r10
        L_0x007e:
            boolean r0 = r8.A1h
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "mediasave/no-message-media-to-save-to-storage"
            goto L_0x02c8
        L_0x0086:
            boolean r0 = r8.A1h
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "mediasave/no-message-to-save-to-storage"
            goto L_0x02c8
        L_0x008e:
            if (r7 == 0) goto L_0x0013
            X.0rv r0 = r8.A13
            if (r0 == 0) goto L_0x0013
            X.0yO r0 = r8.A0v
            X.1WD r2 = r0.A04()
            r1 = 14
            com.facebook.redex.IDxNConsumerShape39S0200000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape39S0200000_2_I0
            r0.<init>(r7, r1, r8)
            r2.A00(r0)
            return r10
        L_0x00a5:
            int r0 = r8.A03
            X.0tY r0 = r8.A1U(r0)
            if (r0 == 0) goto L_0x0013
            java.util.List r6 = java.util.Collections.singletonList(r0)
            int r0 = r8.A02
            if (r0 != r2) goto L_0x0246
            X.0sq r5 = r8.A1a
            X.0t8 r3 = r8.A0s
            X.024 r2 = new X.024
            r2.<init>()
            X.4xu r0 = new X.4xu
            r0.<init>(r8, r6)
            X.36C r1 = new X.36C
            r1.<init>(r2, r0, r3, r6)
            java.lang.Void[] r0 = new java.lang.Void[r4]
            r5.Ack(r1, r0)
            return r10
        L_0x00ce:
            if (r7 == 0) goto L_0x0254
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            X.0ta r0 = r7.A02
            X.AnonymousClass00B.A06(r0)
            java.io.File r0 = r0.A0F
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r6.setData(r0)
            X.121 r5 = r8.A1K
            android.content.Context r0 = r8.A0u()
            if (r0 == 0) goto L_0x0013
            X.00l r7 = r8.A0D()
            X.0pN r7 = (X.C14550pN) r7
            r9 = r3
            r5.A05(r6, r7, r8, r9, r10)
            return r10
        L_0x00f6:
            int r0 = r8.A03
            X.0tY r3 = r8.A1U(r0)
            X.0tb r2 = r8.A0N
            X.00l r1 = r8.A0D()
            X.0zJ r0 = r8.A0E
            r2.A04(r1, r0, r3)
            return r10
        L_0x0108:
            X.0pd r2 = r8.A0y
            r1 = 1710(0x6ae, float:2.396E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r1 = r2.A0E(r0, r1)
            X.02C r0 = r8.A0G()
            X.1rl r7 = (X.C39001rl) r7
            X.0tZ r7 = (X.C16740tZ) r7
            if (r1 == 0) goto L_0x0120
            com.obwhatsapp.ephemeral.ViewOnceNuxBottomSheet.A01(r0, r3, r7, r10)
            return r10
        L_0x0120:
            com.obwhatsapp.ephemeral.ViewOnceNUXDialog.A01(r0, r7, r10)
            return r10
        L_0x0124:
            r8.A1I()
            return r10
        L_0x0128:
            android.content.Context r0 = r8.A02()
            X.391 r3 = new X.391
            r3.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r3.A0E = r0
            int r0 = r8.A03
            X.0tY r0 = r8.A1U(r0)
            long r0 = r0.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0K = r0
            android.content.Intent r0 = r3.A00()
            r8.startActivityForResult(r0, r2)
            return r10
        L_0x014d:
            if (r7 == 0) goto L_0x0169
            X.2n0 r3 = new X.2n0
            r3.<init>(r8, r7)
            androidx.appcompat.widget.Toolbar r0 = r8.A06
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 100
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.setListener(r3)
            return r10
        L_0x0169:
            java.lang.String r0 = "mediaview/no-message-for-edit"
            goto L_0x02c8
        L_0x016d:
            if (r7 == 0) goto L_0x01b0
            long r3 = r7.A13
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01ad
            r3 = 1
        L_0x0179:
            long r1 = X.C38621r6.A07(r7)
            android.content.Context r6 = r8.A02()
            X.1Vw r7 = r7.A11
            X.0rv r5 = r7.A00
            r0 = 0
            android.content.Intent r6 = X.C14750ph.A08(r6, r0)
            java.lang.String r5 = X.C16030sJ.A03(r5)
            java.lang.String r0 = "jid"
            android.content.Intent r5 = r6.putExtra(r0, r5)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r5 = r5.addFlags(r0)
            java.lang.String r0 = "row_id"
            r5.putExtra(r0, r3)
            java.lang.String r0 = "sort_id"
            r5.putExtra(r0, r1)
            X.AnonymousClass1yL.A00(r5, r7)
            X.C54472hZ.A00(r5, r8)
            return r10
        L_0x01ad:
            long r3 = r7.A13
            goto L_0x0179
        L_0x01b0:
            java.lang.String r0 = "mediaview/no-message-to-view-in-chat"
            goto L_0x02c8
        L_0x01b4:
            if (r7 == 0) goto L_0x01bb
            X.0sq r2 = r8.A1a
            r1 = 35
            goto L_0x01e1
        L_0x01bb:
            java.lang.String r0 = "mediaview/no-message-for-unstar"
            goto L_0x02c8
        L_0x01bf:
            if (r7 == 0) goto L_0x01ea
            X.3r2 r1 = new X.3r2
            r1.<init>()
            X.0w2 r0 = r8.A0x
            int r0 = X.C18020w1.A02(r0, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1.A01 = r0
            X.0t9 r0 = r8.A10
            r0.A06(r1)
            X.0sq r2 = r8.A1a
            r1 = 34
        L_0x01e1:
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r8, r1, r7)
            r2.Acl(r0)
            return r10
        L_0x01ea:
            java.lang.String r0 = "mediaview/no-message-for-star"
            goto L_0x02c8
        L_0x01ee:
            if (r7 == 0) goto L_0x0242
            android.content.Context r0 = r8.A02()
            X.391 r5 = new X.391
            r5.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r5.A05 = r0
            X.0rv r0 = r8.A13
            r5.A01 = r0
            X.1Vw r4 = r7.A11
            java.util.List r0 = java.util.Collections.singletonList(r4)
            r5.A0S = r0
            byte r2 = r7.A10
            java.lang.Byte r0 = java.lang.Byte.valueOf(r2)
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Set r1 = java.util.Collections.singleton(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r5.A0R = r0
            r0 = 3
            if (r2 != r0) goto L_0x023f
            int r0 = r7.A00
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
        L_0x022d:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A0L = r0
            android.content.Intent r1 = r5.A00()
            X.AnonymousClass1yL.A00(r1, r4)
            r0 = 4
            r8.startActivityForResult(r1, r0)
            return r10
        L_0x023f:
            r2 = 0
            goto L_0x022d
        L_0x0242:
            java.lang.String r0 = "mediaview/no-message-for-forward"
            goto L_0x02c8
        L_0x0246:
            X.0rv r0 = r8.A13
            com.obwhatsapp.mediaview.DeleteMessagesDialogFragment r1 = com.obwhatsapp.mediaview.DeleteMessagesDialogFragment.A01(r0, r6)
            X.02C r0 = r8.A0F()
            r1.A1G(r0, r3)
            return r10
        L_0x0254:
            java.lang.String r0 = "mediaview/no-message-to-set-as-profile-photo"
            goto L_0x02c8
        L_0x0257:
            if (r7 == 0) goto L_0x027e
            X.0pt r1 = r8.A0I
            r0 = 2131889292(0x7f120c8c, float:1.9413243E38)
            r1.A08(r4, r0)
            X.0pt r6 = r8.A0I
            X.0so r5 = r8.A0G
            X.0sq r4 = r8.A1a
            X.0tA r3 = r8.A0w
            r0 = 13
            com.facebook.redex.IDxNConsumerShape39S0200000_2_I0 r2 = new com.facebook.redex.IDxNConsumerShape39S0200000_2_I0
            r2.<init>(r7, r0, r8)
            X.1wy r1 = new X.1wy
            r1.<init>(r5, r3, r7)
            java.util.concurrent.Executor r0 = r6.A06
            r1.A01(r2, r0)
            r4.Acl(r1)
            return r10
        L_0x027e:
            java.lang.String r0 = "mediaview/no-message-to-view-in-gallery"
            goto L_0x02c8
        L_0x0281:
            if (r7 == 0) goto L_0x02c6
            X.0ta r0 = r7.A02
            X.AnonymousClass00B.A06(r0)
            java.io.File r0 = r0.A0F
            android.net.Uri r5 = android.net.Uri.fromFile(r0)
            X.1Vw r0 = r7.A11
            X.0rv r4 = r0.A00
            X.00l r1 = r8.A0D()
            X.0se r0 = r8.A1R
            android.net.Uri r3 = r0.A04()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.settings.chat.wallpaper.GalleryWallpaperPreview"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            r2.setData(r5)
            java.lang.String r0 = "output"
            r2.putExtra(r0, r3)
            java.lang.String r1 = X.C16030sJ.A03(r4)
            java.lang.String r0 = "chat_jid"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "is_using_global_wallpaper"
            r2.putExtra(r0, r10)
            r0 = 6
            r8.startActivityForResult(r2, r0)
            return r10
        L_0x02c6:
            java.lang.String r0 = "mediaview/no-message-to-set-as-wallpaper"
        L_0x02c8:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediaview.MediaViewFragment.A10(android.view.MenuItem):boolean");
    }

    public void A12() {
        A1Y();
        RunnableRunnableShape0S0310000_I0 runnableRunnableShape0S0310000_I0 = this.A0C;
        if (runnableRunnableShape0S0310000_I0 != null) {
            runnableRunnableShape0S0310000_I0.A03 = true;
            ((Thread) runnableRunnableShape0S0310000_I0.A02).interrupt();
            this.A0C = null;
        }
        AnonymousClass29C r0 = this.A1c;
        if (r0 != null) {
            r0.A01();
            this.A1c = null;
            C16730tY r2 = this.A1O;
            if (r2 != null) {
                this.A1A.A0B(r2, false, false);
            }
        }
        this.A1O = null;
        this.A0U.A03(this.A1r);
        this.A0t.A03(this.A1s);
        AnonymousClass2B7 r02 = this.A1C;
        if (r02 != null) {
            r02.close();
        }
        this.A1a.Acl(new RunnableRunnableShape8S0100000_I0_7(this.A0f, 1));
        C613038j r03 = this.A1B;
        if (r03 != null) {
            r03.A02.dismiss();
        }
        this.A1U = null;
        this.A07 = null;
        this.A09 = null;
        this.A08 = null;
        super.A12();
    }

    public void A14() {
        C47712Kc r3 = ((C14580pQ) ((C14630pV) A0D())).A01;
        r3.A01.A08("on_fragment_resume");
        super.A14();
        AnonymousClass29C r0 = this.A1c;
        if (r0 != null) {
            r0.A0G();
            AnonymousClass2PV r1 = this.A1c.A0D;
            if (r1 != null && !(r1 instanceof C610537d)) {
                C610637e r12 = (C610637e) r1;
                if (!r12.A06) {
                    r12.A0B.A02();
                }
            }
        }
        r3.A01.A07("on_fragment_resume");
    }

    public void A15() {
        super.A15();
        if (A1y && this.A1c != null) {
            this.A0I.A0J(this.A1u);
            this.A1c.A09();
            AnonymousClass2PV r0 = this.A1c.A0D;
            if (r0 != null) {
                r0.A01();
            }
        }
    }

    public void A17(Bundle bundle) {
        C47712Kc r5 = ((C14580pQ) ((C14630pV) A0D())).A01;
        r5.A01.A08("on_fragment_create");
        this.A1a.Acl(new RunnableRunnableShape8S0100000_I0_7(this.A0f, 1));
        super.A17(bundle);
        C14710pd r1 = this.A0y;
        C16620tM r14 = C16620tM.A02;
        this.A1i = !C41971wz.A0B(r1.A06(r14, 2917));
        RunnableRunnableShape0S0310000_I0 runnableRunnableShape0S0310000_I0 = new RunnableRunnableShape0S0310000_I0(this);
        this.A0C = runnableRunnableShape0S0310000_I0;
        ((Thread) runnableRunnableShape0S0310000_I0.A02).start();
        boolean z2 = false;
        if (bundle != null) {
            z2 = true;
        }
        this.A1e = z2;
        A0a(true);
        r5.A01.A07("on_fragment_create");
        this.A1m = this.A0y.A0E(C16620tM.A01, 815);
        C16440t3 r32 = this.A0g;
        C14710pd r36 = this.A0y;
        C14870pt r48 = this.A0I;
        C16040sK r47 = this.A0K;
        C16320sq r41 = this.A1a;
        C16490t9 r37 = this.A10;
        C23101Am r46 = this.A0D;
        C15900s5 r24 = this.A0M;
        C17090uW r23 = this.A0J;
        C17190ug r22 = this.A1F;
        C16000sG r25 = this.A0T;
        AnonymousClass01V r21 = this.A0e;
        C16080sP r20 = this.A0X;
        C208811y r19 = this.A0H;
        C18290wS r18 = this.A1I;
        C23181Au r17 = this.A0Z;
        C226818w r13 = this.A0o;
        C17030uP r11 = this.A0W;
        C15800rs r10 = this.A0a;
        C23201Aw r9 = this.A1b;
        C18090w8 r8 = this.A1H;
        C17180uf r7 = this.A0P;
        C18260wP r6 = this.A0S;
        AnonymousClass156 r52 = this.A0V;
        C19820z3 r4 = this.A0n;
        C17120uZ r3 = this.A0i;
        C24961Hy r2 = this.A0O;
        boolean A0E2 = this.A0y.A0E(r14, 611);
        this.A1P = new C51202bB(r46, this.A0F, r19, (C14550pN) A0D(), r48, r23, r47, r24, r2, r7, r6, r25, r52, r11, r20, r17, r10, r21, r32, r3, r4, r13, r36, r37, r22, r8, r18, r41, r9, (Integer) null, A0E2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A18(android.os.Bundle r12, android.view.View r13) {
        /*
            r11 = this;
            X.00l r0 = r11.A0D()
            X.0pV r0 = (X.C14630pV) r0
            X.0pQ r0 = (X.C14580pQ) r0
            X.2Kc r8 = r0.A01
            java.lang.String r7 = "on_fragment_view_created"
            X.1dR r0 = r8.A01
            r0.A08(r7)
            super.A18(r12, r13)
            java.lang.OutOfMemoryError r0 = r11.A0C
            r2 = 0
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "mediaview/oncreate/oom/heap size:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            long r0 = android.os.Debug.getNativeHeapAllocatedSize()
            r6 = 1024(0x400, double:5.06E-321)
            long r0 = r0 / r6
            r3.append(r0)
            java.lang.String r5 = " kB"
            r3.append(r5)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.120 r4 = r11.A0Y
            java.lang.String r0 = "native heap size:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            long r0 = android.os.Debug.getNativeHeapAllocatedSize()
            long r0 = r0 / r6
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Cv r0 = r4.A02
            X.1kk r0 = r0.A01()
            X.1km r0 = r0.A02
            r0.A05(r2)
            r1 = 2131888204(0x7f12084c, float:1.9411037E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.2T3 r1 = com.obwhatsapp.LegacyMessageDialogFragment.A01(r0, r1)
            r0 = 101(0x65, float:1.42E-43)
            r1.A00 = r0
            androidx.fragment.app.DialogFragment r2 = r1.A00()
            X.02C r1 = r11.A0F()
            java.lang.String r0 = "oom_fragment"
            r2.A1G(r1, r0)
            return
        L_0x0077:
            android.os.Bundle r3 = r11.A04()
            X.0sj r0 = r11.A0j
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = ""
            X.1Vw r0 = X.AnonymousClass1yL.A03(r3, r0)
            X.AnonymousClass00B.A06(r0)
            r11.A1L = r0
            java.lang.String r0 = "jid"
            java.lang.String r0 = r3.getString(r0)
            X.0rv r0 = X.C15830rv.A02(r0)
            r11.A13 = r0
            java.lang.String r0 = "nogallery"
            boolean r0 = r3.getBoolean(r0, r2)
            r11.A1o = r0
            r0 = 0
            java.lang.String r4 = "start_t"
            long r0 = r3.getLong(r4, r0)
            r11.A05 = r0
            java.lang.String r0 = "gallery"
            boolean r0 = r3.getBoolean(r0, r2)
            r11.A1j = r0
            java.lang.String r0 = "video_play_origin"
            int r1 = r3.getInt(r0)
            r0 = 1
            if (r1 == r0) goto L_0x00c9
            r0 = 2
            if (r1 == r0) goto L_0x00c9
            r0 = 3
            if (r1 == r0) goto L_0x00c9
            r0 = 4
            if (r1 == r0) goto L_0x00c9
            r0 = 5
        L_0x00c9:
            r11.A04 = r0
            java.lang.String r0 = "navigator_type"
            int r1 = r3.getInt(r0)
            java.lang.String r0 = "menu_style"
            int r0 = r3.getInt(r0)
            r11.A02 = r0
            java.lang.String r0 = "menu_set_wallpaper"
            boolean r0 = r3.getBoolean(r0, r2)
            r11.A1n = r0
            r3 = 2
            r9 = 1
            if (r1 != r9) goto L_0x00fa
            X.0rv r0 = r11.A13
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "mediaview/oncreate/jid navigatorfactory with null jid"
        L_0x00eb:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00ee:
            r11.A1F()
            return
        L_0x00f2:
            X.4zc r0 = new X.4zc
            r0.<init>(r11)
            r11.A1D = r0
            goto L_0x0114
        L_0x00fa:
            if (r1 != r3) goto L_0x0114
            X.00l r0 = r11.A0D()
            X.02z r1 = new X.02z
            r1.<init>(r0)
            java.lang.Class<com.obwhatsapp.search.SearchViewModel> r0 = com.obwhatsapp.search.SearchViewModel.class
            X.01n r1 = r1.A01(r0)
            com.obwhatsapp.search.SearchViewModel r1 = (com.obwhatsapp.search.SearchViewModel) r1
            r11.A1D = r1
            X.04p r0 = r11.A0K
            r0.A00(r1)
        L_0x0114:
            X.2B8 r0 = r11.A1D
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "mediaview/oncreate/null navigatorfactory"
            goto L_0x00eb
        L_0x011b:
            boolean r0 = r11.A1o
            if (r0 == 0) goto L_0x0126
            android.view.View r1 = r11.A02
            r0 = 8
            r1.setVisibility(r0)
        L_0x0126:
            if (r12 == 0) goto L_0x0130
            java.lang.String r0 = "is_different_video"
            boolean r0 = r12.getBoolean(r0, r9)
            r11.A1k = r0
        L_0x0130:
            java.lang.String r0 = "mediaview/found-key "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            X.1Vw r0 = r11.A1L
            X.0rv r0 = r0.A00
            r4.append(r0)
            java.lang.String r0 = " me:"
            r4.append(r0)
            X.1Vw r1 = r11.A1L
            boolean r0 = r1.A02
            r4.append(r0)
            java.lang.String r0 = " id:"
            r4.append(r0)
            java.lang.String r0 = r1.A01
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0t6 r0 = r11.A0q
            X.1Vw r1 = r11.A1L
            X.0th r0 = r0.A0K
            X.0tZ r6 = r0.A03(r1)
            X.0tY r6 = (X.C16730tY) r6
            if (r6 != 0) goto L_0x017b
            java.lang.String r0 = "mediaview/cannot find message for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r11.A1L
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00eb
        L_0x017b:
            byte r5 = r6.A10
            if (r5 == r3) goto L_0x018f
            boolean r0 = X.AnonymousClass20C.A00(r5)
            if (r0 != 0) goto L_0x018f
            r0 = 9
            if (r5 == r0) goto L_0x018f
            boolean r0 = X.C38621r6.A0M(r5)
            if (r0 == 0) goto L_0x0191
        L_0x018f:
            r11.A1N = r6
        L_0x0191:
            java.lang.String r0 = "mediaview/view message:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r11.A1L
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2B8 r0 = r11.A1D
            X.2B7 r1 = r0.A7V(r11, r6)
            r11.A1C = r1
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r0 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10
            r0.<init>((java.lang.Object) r11, (int) r9)
            r1.Adq(r0)
            r4 = 0
            X.3GC r0 = new X.3GC
            r0.<init>(r11)
            r11.A1N(r0)
            X.2B7 r1 = r11.A1C
            X.1Vw r0 = r11.A1L
            int r1 = r1.AF9(r0)
            X.2B7 r0 = r11.A1C
            r0.getCount()
            r11.A03 = r1
            r11.A1G()
            X.2hw r0 = r11.A09
            r0.A0F(r1, r2)
            X.00l r0 = r11.A0D()
            r0.invalidateOptionsMenu()
            android.view.View r1 = r11.A02
            r0 = 8
            r1.setVisibility(r0)
            boolean r0 = r11.A1o
            if (r0 != 0) goto L_0x01eb
            X.2B7 r0 = r11.A1C
            r0.Ag5()
        L_0x01eb:
            r11.A1O = r6
            r0 = 3
            if (r5 == r0) goto L_0x02e8
            if (r5 == r9) goto L_0x02e8
            boolean r0 = X.C30921dB.A00(r5)
            if (r0 == 0) goto L_0x021f
            X.0pd r2 = r11.A0y
            r1 = 1710(0x6ae, float:2.396E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x02bb
            X.00l r0 = r11.A0D()
            android.view.Window r1 = r0.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
            X.0vf r2 = r11.A1G
            X.02C r1 = r11.A0G()
            r0 = r6
            X.1rl r0 = (X.C39001rl) r0
            X.0tZ r0 = (X.C16740tZ) r0
            com.obwhatsapp.ephemeral.ViewOnceNuxBottomSheet.A02(r1, r4, r2, r0)
        L_0x021f:
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0 = 3
            com.facebook.redex.IDxCallbackShape186S0100000_1_I0 r1 = new com.facebook.redex.IDxCallbackShape186S0100000_1_I0
            r1.<init>(r11, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r2, r1)
            r11.A06 = r0
            boolean r0 = r11.A1e
            if (r0 == 0) goto L_0x0236
            r11.A1N = r4
        L_0x0236:
            X.0tY r0 = r11.A1N
            r11.A1O = r0
            int r0 = r11.A03
            r11.A1Z(r0)
            boolean r0 = r11.A1e
            if (r0 != 0) goto L_0x0250
            r11.A1M = r6
            android.os.Bundle r1 = r11.A01
            if (r1 == 0) goto L_0x0250
            r11.A0E = r9
            X.29g r0 = r11.A0B
            r0.A0C(r1, r11)
        L_0x0250:
            if (r12 == 0) goto L_0x025e
            java.lang.String r0 = "gid"
            java.lang.String r0 = r12.getString(r0)
            com.whatsapp.jid.GroupJid r0 = com.whatsapp.jid.GroupJid.getNullable(r0)
            r11.A14 = r0
        L_0x025e:
            X.0ub r1 = r11.A0U
            X.1ie r0 = r11.A1r
            r1.A02(r0)
            X.0xq r1 = r11.A0t
            X.0xV r0 = r11.A1s
            r1.A02(r0)
            X.1dR r4 = r8.A01
            r4.A07(r7)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "media_type"
            r4.A0A(r0, r1, r9)
            long r2 = r6.A01
            double r0 = (double) r2
            double r0 = java.lang.Math.log10(r0)
            int r8 = (int) r0
            r0 = 17
            if (r8 > r0) goto L_0x02b1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            double r0 = (double) r8
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r5 = java.lang.Math.pow(r2, r0)
            long r0 = (long) r5
            r7.append(r0)
            java.lang.String r0 = "_"
            r7.append(r0)
            int r0 = r8 + 1
            double r0 = (double) r0
            double r2 = java.lang.Math.pow(r2, r0)
            long r0 = (long) r2
            r7.append(r0)
            java.lang.String r1 = r7.toString()
            if (r1 == 0) goto L_0x02b1
            java.lang.String r0 = "file_size"
            r4.A0A(r0, r1, r9)
        L_0x02b1:
            X.00l r0 = r11.A0D()
            X.0pV r0 = (X.C14630pV) r0
            r0.ATc()
            return
        L_0x02bb:
            X.0vf r10 = r11.A1G
            X.02C r3 = r11.A0G()
            r2 = r6
            X.1rl r2 = (X.C39001rl) r2
            X.0tZ r2 = (X.C16740tZ) r2
            boolean r0 = r3.A0o()
            r1 = 0
            if (r0 != 0) goto L_0x021f
            if (r2 != 0) goto L_0x02e5
            java.lang.String r0 = "ephemeral_view_once"
        L_0x02d1:
            boolean r0 = r10.A00(r4, r0)
            if (r0 != 0) goto L_0x021f
            java.lang.String r0 = "view_once_nux"
            X.01A r0 = r3.A0B(r0)
            if (r0 != 0) goto L_0x021f
            com.obwhatsapp.ephemeral.ViewOnceNUXDialog.A01(r3, r2, r1)
            goto L_0x021f
        L_0x02e5:
            java.lang.String r0 = "ephemeral_view_once_receiver"
            goto L_0x02d1
        L_0x02e8:
            X.0sq r2 = r11.A1a
            r1 = 36
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r11, r1, r6)
            r2.Acl(r0)
            goto L_0x021f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediaview.MediaViewFragment.A18(android.os.Bundle, android.view.View):void");
    }

    public void A1E() {
        View findViewWithTag;
        C16730tY A1U2 = A1U(this.A03);
        if (!(A1U2 == null || (findViewWithTag = this.A09.findViewWithTag(A1U2.A11)) == null)) {
            View findViewById = findViewWithTag.findViewById(R.id.thumbnail);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                findViewById.setAlpha(1.0f);
            }
            View findViewById2 = findViewWithTag.findViewById(R.id.video_view);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        super.A1E();
    }

    public void A1F() {
        super.A1F();
        Map map = this.A1w;
        for (AnonymousClass29D A092 : map.values()) {
            A092.A09();
        }
        map.clear();
    }

    public final C16730tY A1U(int i2) {
        AnonymousClass2B7 r0 = this.A1C;
        if (r0 == null) {
            return null;
        }
        return r0.ADV(i2);
    }

    public final void A1V() {
        C30211bx r2 = this.A1W;
        if (r2 != null && this.A01 != 2) {
            r2.A04();
            A1X();
            this.A01 = 2;
        }
    }

    public final void A1W() {
        ImageButton imageButton = this.A08;
        if (imageButton != null) {
            imageButton.setImageDrawable(new C447725m(AnonymousClass00T.A04(A02(), R.drawable.mviewer_pause), this.A0l));
            this.A08.setContentDescription(A0J(R.string.str0f30));
        }
        View view = this.A07;
        if (view != null) {
            AnonymousClass2JP.A03(view, R.string.str0f30);
        }
    }

    public final void A1X() {
        ImageButton imageButton = this.A08;
        if (imageButton != null) {
            imageButton.setImageDrawable(new C447725m(AnonymousClass00T.A04(A02(), R.drawable.mviewer_play), this.A0l));
            this.A08.setContentDescription(A0J(R.string.str1d62));
        }
        View view = this.A07;
        if (view != null) {
            AnonymousClass2JP.A03(view, R.string.str1d62);
        }
    }

    public final void A1Y() {
        C30211bx r0 = this.A1W;
        if (r0 != null) {
            r0.A06();
            this.A1W = null;
            this.A01 = 0;
        }
        VoiceNoteSeekBar voiceNoteSeekBar = this.A1d;
        if (voiceNoteSeekBar != null) {
            voiceNoteSeekBar.setProgress(0);
        }
        A1X();
        TextView textView = this.A09;
        if (textView != null) {
            textView.setText(C28961Zl.A04(this.A0l, 0));
        }
    }

    public final void A1Z(int i2) {
        String A082;
        int i3;
        C16730tY A1U2 = A1U(i2);
        if (A1U2 != null) {
            AnonymousClass2B7 r0 = this.A1C;
            if (r0 != null) {
                r0.AhQ(i2);
            }
            if (A1U2.A11.A02) {
                i3 = R.string.str1ba8;
            } else {
                C15830rv A0C2 = A1U2.A0C();
                if (A0C2 == null && (A0C2 = this.A13) == null) {
                    Log.e("mediaview/no sender and no jid");
                    this.A0G.AcB("MediaViewFragment/setSenderAndDateTime", "null_jid_no_sender", true);
                    i3 = R.string.str188a;
                } else {
                    A082 = this.A0X.A08(this.A0T.A0A(A0C2));
                    this.A07.setText(A082);
                    this.A05.setText(C28961Zl.A01(this.A0l, this.A0g.A02(A1U2.A0I)).toString());
                    A0D().invalidateOptionsMenu();
                }
            }
            A082 = A0J(i3);
            this.A07.setText(A082);
            this.A05.setText(C28961Zl.A01(this.A0l, this.A0g.A02(A1U2.A0I)).toString());
            A0D().invalidateOptionsMenu();
        }
    }

    public final void A1a(C16730tY r7) {
        View findViewWithTag;
        StringBuilder sb = new StringBuilder("mediaview/prepareaudioplayback/");
        C28381Vw r1 = r7.A11;
        sb.append(r1.A01);
        Log.i(sb.toString());
        if (this.A0j.A0B() && (findViewWithTag = this.A09.findViewWithTag(r1)) != null) {
            this.A09 = (TextView) C004601z.A0E(findViewWithTag, R.id.progress_tv);
            VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) C004601z.A0E(findViewWithTag, R.id.audio_seekbar);
            this.A1d = voiceNoteSeekBar;
            voiceNoteSeekBar.setOnSeekBarChangeListener(new AnonymousClass3DI(this));
            ImageButton imageButton = (ImageButton) C004601z.A0E(findViewWithTag, R.id.audio_control_btn);
            this.A08 = imageButton;
            ViewOnClickCListenerShape3S0200000_I0 viewOnClickCListenerShape3S0200000_I0 = new ViewOnClickCListenerShape3S0200000_I0(this.A1d, 37, this);
            imageButton.setOnClickListener(viewOnClickCListenerShape3S0200000_I0);
            View A0E2 = C004601z.A0E(findViewWithTag, R.id.audio_icon);
            this.A07 = A0E2;
            if (this.A0G) {
                A0E2.setOnClickListener(viewOnClickCListenerShape3S0200000_I0);
            } else {
                A0E2.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 36, viewOnClickCListenerShape3S0200000_I0));
            }
            C30211bx r0 = this.A1W;
            if (r0 != null) {
                r0.A06();
                this.A1W = null;
            }
            try {
                C16750ta r02 = r7.A02;
                AnonymousClass00B.A06(r02);
                File file = r02.A0F;
                if (file != null) {
                    C30211bx A002 = C30211bx.A00((C16980tz) null, (C14710pd) null, file, 3);
                    this.A1W = A002;
                    A002.A0B(new C91844ga());
                    this.A1W.A05();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mediaview/audio duration:");
                    sb2.append(this.A1W.A03());
                    Log.i(sb2.toString());
                    this.A01 = 2;
                    this.A09.setText(C28961Zl.A04(this.A0l, (long) (this.A1W.A03() / 1000)));
                    this.A1d.setMax(this.A1W.A03());
                } else {
                    Log.e("mediaview/ audio file is null");
                    ((C14550pN) A0D()).Afg(R.string.str0925);
                }
            } catch (IOException e2) {
                Log.e("mediaview/prepare fail", e2);
                C30211bx r03 = this.A1W;
                if (r03 != null) {
                    r03.A06();
                    this.A1W = null;
                }
                ((C14550pN) A0D()).Afg(R.string.str0925);
            }
            this.A1d.setProgress(0);
            A1X();
        }
    }

    public final void A1b(C16730tY r12, int i2, boolean z2) {
        AnonymousClass29C r1;
        this.A0b.A04();
        C42601y5.A02(this.A0z, this.A10, this.A1O, 5);
        boolean z3 = this.A1i;
        byte b2 = r12.A10;
        boolean A002 = AnonymousClass20C.A00(b2);
        if (z3) {
            if ((A002 || C38621r6.A0M(b2)) && z2 && (r1 = this.A1c) != null) {
                r1.A04 = this.A04;
                r1.A09();
                this.A1c.A0A(i2);
                this.A1c.A08();
                A0D().invalidateOptionsMenu();
                return;
            }
        } else if (A002) {
            this.A0I.A08(0, R.string.str0c8c);
            C14870pt r7 = this.A0I;
            C16300so r6 = this.A0G;
            C16320sq r5 = this.A1a;
            C16500tA r0 = this.A0w;
            IDxNConsumerShape151S0100000_1_I0 iDxNConsumerShape151S0100000_1_I0 = new IDxNConsumerShape151S0100000_1_I0(this, 1);
            C41961wy r13 = new C41961wy(r6, r0, r12);
            r13.A01(iDxNConsumerShape151S0100000_1_I0, r7.A06);
            r5.Acl(r13);
            C16750ta r4 = r12.A02;
            AnonymousClass00B.A06(r4);
            if (this.A1k) {
                AnonymousClass4I6 r62 = this.A16;
                int i3 = 1;
                if (r12.A11.A02) {
                    i3 = 3;
                }
                int i4 = z2 ? this.A04 : 4;
                long j2 = (long) r12.A00;
                File file = r4.A0F;
                if (file != null) {
                    C75643sU r52 = new C75643sU();
                    r52.A05 = Long.valueOf(j2);
                    r52.A04 = Long.valueOf((System.currentTimeMillis() - file.lastModified()) / 1000);
                    r52.A03 = Integer.valueOf(i3);
                    r52.A02 = 1;
                    r52.A01 = Integer.valueOf(i4);
                    r52.A00 = Double.valueOf((double) file.length());
                    r62.A01.A06(r52);
                }
            }
            this.A1k = false;
            return;
        } else if (C38621r6.A0M(b2)) {
            AnonymousClass29D r02 = (AnonymousClass29D) this.A1w.get(r12.A11);
            if (r02 != null) {
                r02.A08();
                return;
            }
            return;
        }
        if (b2 == 2) {
            A1a(r12);
            if (this.A1W != null) {
                this.A1X.A02(R.string.str12ac);
                try {
                    this.A1W.A08();
                    if (i2 > 0) {
                        this.A1W.A0A(i2);
                        this.A1d.setProgress(this.A1W.A02());
                    }
                    this.A01 = 1;
                    this.A06.sendEmptyMessage(0);
                    A1W();
                } catch (IOException e2) {
                    Log.e("mediaview/playMedia failed to start", e2);
                    ((C14550pN) A0D()).Afg(R.string.str0925);
                }
            }
        } else if (b2 == 9) {
            Log.i("mediaview/playMedia trying to open document");
            this.A0I.A08(0, R.string.str0c8c);
            C14870pt r63 = this.A0I;
            C16300so r53 = this.A0G;
            C16320sq r42 = this.A1a;
            C16500tA r3 = this.A0w;
            IDxNConsumerShape39S0200000_2_I0 iDxNConsumerShape39S0200000_2_I0 = new IDxNConsumerShape39S0200000_2_I0(r12, 12, this);
            C41961wy r14 = new C41961wy(r53, r3, r12);
            r14.A01(iDxNConsumerShape39S0200000_2_I0, r63.A06);
            r42.Acl(r14);
        }
    }

    public void APW() {
        A1Y();
        AnonymousClass29C r1 = this.A1c;
        if (!(r1 == null || this.A1O == null)) {
            r1.A09();
            this.A1c.A01();
            this.A1x.remove(this.A1O.A11);
            this.A1v.remove(this.A1O.A11);
            this.A1c = null;
        }
        AnonymousClass2B7 r0 = this.A1C;
        if (r0 == null || r0.getCount() == 1) {
            A1F();
        }
    }

    public void delPrevon() {
        if (this.prevon) {
            try {
                A1U(this.A03).A02.A0F.delete();
            } catch (Exception e2) {
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C613038j r0 = this.A1B;
        if (r0 != null) {
            r0.A02.dismiss();
        }
    }

    public void setPrevon(Intent intent) {
        this.prevon = intent != null && intent.hasExtra("prevonly");
    }
}

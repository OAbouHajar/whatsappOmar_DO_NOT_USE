package com.obwhatsapp.mediacomposer;

import X.AnonymousClass00B;
import X.AnonymousClass00F;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01D;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass028;
import X.AnonymousClass0Bo;
import X.AnonymousClass10X;
import X.AnonymousClass11G;
import X.AnonymousClass156;
import X.AnonymousClass15P;
import X.AnonymousClass1A9;
import X.AnonymousClass1BQ;
import X.AnonymousClass1BU;
import X.AnonymousClass1G1;
import X.AnonymousClass1H9;
import X.AnonymousClass1L1;
import X.AnonymousClass1MF;
import X.AnonymousClass1XP;
import X.AnonymousClass1XQ;
import X.AnonymousClass20I;
import X.AnonymousClass29F;
import X.AnonymousClass29K;
import X.AnonymousClass29L;
import X.AnonymousClass29M;
import X.AnonymousClass29N;
import X.AnonymousClass29O;
import X.AnonymousClass29P;
import X.AnonymousClass29Q;
import X.AnonymousClass2OM;
import X.AnonymousClass2Ra;
import X.AnonymousClass2Rf;
import X.AnonymousClass2S8;
import X.AnonymousClass322;
import X.AnonymousClass37O;
import X.AnonymousClass38B;
import X.AnonymousClass391;
import X.AnonymousClass39P;
import X.AnonymousClass4IF;
import X.AnonymousClass4XG;
import X.AnonymousClass4Xy;
import X.AnonymousClass5QC;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15800rs;
import X.C15810rt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16030sJ;
import X.C16040sK;
import X.C16050sL;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16620tM;
import X.C16740tZ;
import X.C16760tb;
import X.C16980tz;
import X.C17020u3;
import X.C17030uP;
import X.C17090uW;
import X.C17120uZ;
import X.C17180uf;
import X.C17190ug;
import X.C17200uh;
import X.C17250um;
import X.C17270uo;
import X.C17960vv;
import X.C18090w8;
import X.C18210wK;
import X.C18220wL;
import X.C18260wP;
import X.C18290wS;
import X.C19490yW;
import X.C19820z3;
import X.C19950zG;
import X.C19980zJ;
import X.C19990zK;
import X.C206711d;
import X.C208811y;
import X.C215614o;
import X.C222617g;
import X.C226818w;
import X.C23061Ai;
import X.C23071Aj;
import X.C23101Am;
import X.C23181Au;
import X.C23201Aw;
import X.C23651Cv;
import X.C24961Hy;
import X.C25841Li;
import X.C26051Md;
import X.C26221Mu;
import X.C26241Mw;
import X.C27401Rp;
import X.C27661Sq;
import X.C30141bo;
import X.C30151bp;
import X.C31091dS;
import X.C34711kk;
import X.C34771kq;
import X.C35541m6;
import X.C39501sa;
import X.C41551w9;
import X.C42061xA;
import X.C43251zh;
import X.C455529g;
import X.C455729k;
import X.C456429w;
import X.C456629y;
import X.C49112Rc;
import X.C49132Rg;
import X.C49332Sl;
import X.C51202bB;
import X.C59992zi;
import X.C613938s;
import X.C62033Bj;
import X.C62823Fb;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxRListenerShape346S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape44S0100000_1_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.gallerypicker.PhotoViewPager;
import com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.obwhatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView;
import com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.obwhatsapp.mediacomposer.filter.FilterSelectorController$4;
import com.obwhatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

public class MediaComposerActivity extends C14530pL implements AnonymousClass29K, AnonymousClass29L, C41551w9, AnonymousClass29M, AnonymousClass29N, AnonymousClass29O {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Bitmap A04;
    public View A05;
    public View A06;
    public FrameLayout A07;
    public AnonymousClass028 A08;
    public C23101Am A09;
    public AnonymousClass1G1 A0A;
    public C49332Sl A0B;
    public C208811y A0C;
    public C17090uW A0D;
    public AnonymousClass10X A0E;
    public C16760tb A0F;
    public C24961Hy A0G;
    public C17180uf A0H;
    public C23651Cv A0I;
    public C16000sG A0J;
    public AnonymousClass156 A0K;
    public C17030uP A0L;
    public C16080sP A0M;
    public C17200uh A0N;
    public C23181Au A0O;
    public C15800rs A0P;
    public AnonymousClass1H9 A0Q;
    public C16980tz A0R;
    public C17120uZ A0S;
    public C16260sj A0T;
    public AnonymousClass013 A0U;
    public C19820z3 A0V;
    public C226818w A0W;
    public C15810rt A0X;
    public C16460t6 A0Y;
    public AnonymousClass11G A0Z;
    public C26051Md A0a;
    public C206711d A0b;
    public AnonymousClass1BQ A0c;
    public C16490t9 A0d;
    public AnonymousClass2OM A0e;
    public PhotoViewPager A0f;
    public C25841Li A0g;
    public C18210wK A0h;
    public C17960vv A0i;
    public C18220wL A0j;
    public C215614o A0k;
    public AnonymousClass29P A0l;
    public AnonymousClass2S8 A0m;
    public C59992zi A0n;
    public C456429w A0o;
    public AnonymousClass29F A0p;
    public C613938s A0q;
    public C26221Mu A0r;
    public C49112Rc A0s;
    public C26241Mw A0t;
    public C19990zK A0u;
    public C27661Sq A0v;
    public C17190ug A0w;
    public C18090w8 A0x;
    public C18290wS A0y;
    public C17020u3 A0z;
    public AnonymousClass37O A10;
    public C51202bB A11;
    public AnonymousClass1BU A12;
    public AnonymousClass1L1 A13;
    public AnonymousClass1MF A14;
    public AnonymousClass1A9 A15;
    public C23201Aw A16;
    public AnonymousClass01D A17;
    public AnonymousClass01D A18;
    public Runnable A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public final PointF A1O;
    public final Rect A1P;
    public final Handler A1Q;
    public final Handler A1R;
    public final AnonymousClass29Q A1S;
    public final AnonymousClass5QC A1T;
    public final Runnable A1U;
    public final Collection A1V;
    public final HashMap A1W;
    public final HashSet A1X;
    public final Map A1Y;

    public MediaComposerActivity() {
        this(0);
        this.A02 = 0;
        this.A1U = new RunnableRunnableShape10S0100000_I0_9((Object) this, 41);
        this.A1T = new IDxRListenerShape346S0100000_2_I0(this, 0);
        this.A1S = new AnonymousClass29Q();
        this.A1W = new HashMap();
        this.A1X = new HashSet();
        this.A1Y = new HashMap();
        this.A1V = new ArrayList();
        this.A1Q = new Handler(Looper.getMainLooper());
        this.A1R = new Handler(Looper.getMainLooper());
        this.A1P = new Rect();
        this.A1O = new PointF();
        this.A1J = false;
    }

    public MediaComposerActivity(int i2) {
        this.A1E = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 61));
    }

    public static final long A02(AnonymousClass20I r4) {
        C42061xA r0;
        if (r4.A06() == null || r4.A06().byteValue() != 3) {
            return -1;
        }
        Point A022 = r4.A02();
        if (A022 != null) {
            return (long) (A022.y - A022.x);
        }
        synchronized (r4) {
            r0 = r4.A05;
        }
        if (r0 != null) {
            return r0.A04;
        }
        return -1;
    }

    public static /* synthetic */ void A03(Window window, MediaComposerActivity mediaComposerActivity) {
        if (mediaComposerActivity.A08.A01() == null) {
            mediaComposerActivity.A1B = true;
            window.setSharedElementEnterTransition((Transition) null);
            mediaComposerActivity.A06.setVisibility(8);
            mediaComposerActivity.A0c();
        }
    }

    public void A1q() {
        if (!this.A1E) {
            this.A1E = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A0I = (C23651Cv) r1.A1k.get();
            this.A0g = (C25841Li) r1.AB1.get();
            this.A0u = (C19990zK) r1.AEZ.get();
            this.A0E = (AnonymousClass10X) r1.ALc.get();
            this.A0R = (C16980tz) r1.AQB.get();
            this.A0X = (C15810rt) r1.A43.get();
            this.A0d = (C16490t9) r1.AQz.get();
            this.A09 = (C23101Am) r1.A0N.get();
            this.A0v = (C27661Sq) r1.AAP.get();
            this.A0Z = (AnonymousClass11G) r1.ANN.get();
            this.A0F = (C16760tb) r1.APV.get();
            this.A0k = (C215614o) r1.ABz.get();
            this.A0D = (C17090uW) r1.ADM.get();
            this.A0h = (C18210wK) r1.AE4.get();
            this.A0b = (C206711d) r1.AKp.get();
            this.A0N = (C17200uh) r1.A52.get();
            this.A0a = (C26051Md) r1.AAb.get();
            this.A0w = (C17190ug) r1.AEu.get();
            this.A0J = (C16000sG) r1.A4x.get();
            this.A15 = (AnonymousClass1A9) r1.AE7.get();
            this.A0M = (C16080sP) r1.AQ9.get();
            this.A0U = (AnonymousClass013) r1.AR8.get();
            this.A0C = (C208811y) r1.A6K.get();
            this.A0j = (C18220wL) r1.AEB.get();
            this.A0y = (C18290wS) r1.AIB.get();
            this.A0O = (C23181Au) r1.A53.get();
            this.A0A = (AnonymousClass1G1) r1.AJl.get();
            this.A0Y = (C16460t6) r1.A5k.get();
            this.A0Q = (AnonymousClass1H9) r1.AOj.get();
            this.A0i = C16150sX.A0r(r1);
            this.A0c = (AnonymousClass1BQ) r1.A7f.get();
            this.A0W = (C226818w) r1.A6A.get();
            this.A0L = (C17030uP) r1.APp.get();
            this.A0T = (C16260sj) r1.AQe.get();
            this.A0P = (C15800rs) r1.A5c.get();
            this.A0r = (C26221Mu) r1.AMA.get();
            this.A13 = (AnonymousClass1L1) r1.ANR.get();
            this.A16 = (C23201Aw) r1.AK6.get();
            this.A0x = (C18090w8) r1.AI6.get();
            this.A0t = (C26241Mw) r1.ADv.get();
            this.A14 = (AnonymousClass1MF) r1.ANa.get();
            this.A0H = (C17180uf) r1.A2n.get();
            this.A0z = (C17020u3) r1.AMG.get();
            this.A12 = (AnonymousClass1BU) r1.ANA.get();
            this.A0K = (AnonymousClass156) r1.ADH.get();
            this.A0V = (C19820z3) r1.A7p.get();
            this.A0S = (C17120uZ) r1.AQT.get();
            this.A0G = (C24961Hy) r1.A2l.get();
            this.A17 = C17270uo.A00(r1.A5z);
            this.A0B = (C49332Sl) r2.A0c.get();
            this.A18 = C17270uo.A00(r1.AAf);
        }
    }

    public int A1r() {
        return 78318969;
    }

    public C31091dS A1s() {
        C31091dS A1s = super.A1s();
        A1s.A03 = false;
        return A1s;
    }

    public final int A35() {
        return ((Number) this.A0l.A02.A01()).intValue();
    }

    public final AnonymousClass322 A36(byte b2) {
        boolean contains = ((List) this.A0l.A01.A01()).contains(C34771kq.A00);
        int size = ((List) this.A0l.A01.A01()).size();
        int intExtra = getIntent().getIntExtra("origin", 1);
        long longExtra = getIntent().getLongExtra("picker_open_time", 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = this.A1G;
        boolean z3 = this.A1F;
        AnonymousClass29P r0 = this.A0l;
        return AnonymousClass38B.A00(b2, size, intExtra, longExtra, elapsedRealtime, getIntent().getLongExtra("gallery_duration_ms", -1), contains, false, z2, z3, !r0.A0A.equals(r0.A01.A01()));
    }

    public final MediaComposerFragment A37() {
        Uri A022 = this.A0l.A02();
        if (A022 != null) {
            for (AnonymousClass01A r1 : A2E()) {
                if (r1 instanceof MediaComposerFragment) {
                    MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) r1;
                    if (A022.equals(mediaComposerFragment.A00)) {
                        return mediaComposerFragment;
                    }
                }
            }
        }
        return null;
    }

    public final C16740tZ A38() {
        long longExtra = getIntent().getLongExtra("quoted_message_row_id", 0);
        C16050sL A052 = C16050sL.A05(getIntent().getStringExtra("quoted_group_jid"));
        if (longExtra > 0) {
            return this.A0Y.A0K.A00(longExtra);
        }
        if (A052 != null) {
            return C222617g.A00(A052, (String) null, (String) null, this.A05.A00());
        }
        return null;
    }

    public final List A39() {
        return (List) this.A0l.A03.A01();
    }

    public final void A3A() {
        Map map = this.A1Y;
        for (AnonymousClass1XQ r2 : map.values()) {
            C18220wL r5 = this.A0j;
            AnonymousClass1XP r4 = (AnonymousClass1XP) r2;
            if (r4.A0U == null) {
                r4.A02 = true;
                C43251zh r1 = r4.A0K;
                AnonymousClass00B.A06(r1);
                synchronized (r1) {
                    if (!r1.A0D) {
                        r1.A08 = 0;
                    } else {
                        r1.A08 = 1;
                    }
                }
                C27401Rp r22 = r5.A0B;
                r22.A05.A00(r4.A01().A05).A05(r4);
                r22.A03.A05(r4);
                r22.A04.A05(r4);
                r5.A0E.A05(r4);
                r5.A0J.Acl(new RunnableRunnableShape8S0200000_I0_6(r5, 20, r4));
            } else {
                StringBuilder sb = new StringBuilder("app/mediajobmanager/attempting to cancel non-optimistic job, skipped, job=");
                sb.append(r2);
                Log.w(sb.toString());
            }
        }
        map.clear();
    }

    public final void A3B() {
        for (AnonymousClass01A r1 : A2E()) {
            if (r1 instanceof MediaComposerFragment) {
                A3M((MediaComposerFragment) r1);
            }
        }
    }

    public final void A3C() {
        for (AnonymousClass01A r2 : A2E()) {
            if (r2 instanceof ImageComposerFragment) {
                ImageComposerFragment imageComposerFragment = (ImageComposerFragment) r2;
                this.A1S.A00(imageComposerFragment.A00).A0A(imageComposerFragment.A07.A01);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        if (r1 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0021 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3D() {
        /*
            r11 = this;
            boolean r0 = r11.A1N
            if (r0 != 0) goto L_0x0010
            com.obwhatsapp.mediacomposer.MediaComposerFragment r2 = r11.A37()
            if (r2 == 0) goto L_0x0011
            boolean r0 = r2.A1H()
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            return
        L_0x0011:
            r11.A3B()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.List r0 = r11.A39()
            java.util.Iterator r10 = r0.iterator()
        L_0x0021:
            boolean r0 = r10.hasNext()
            r7 = 13
            r4 = 0
            r8 = 1
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r1 = r10.next()
            android.net.Uri r1 = (android.net.Uri) r1
            X.29Q r0 = r11.A1S
            X.20I r3 = r0.A00(r1)
            X.0vv r0 = r11.A0i
            byte r1 = r0.A01(r3)
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            r3.A0C(r0)
            boolean r0 = r3.A0F()
            if (r0 != 0) goto L_0x004c
            r7 = r1
        L_0x004c:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r7)
            java.lang.Object r6 = r5.get(r0)
            X.322 r6 = (X.AnonymousClass322) r6
            if (r6 != 0) goto L_0x005f
            X.322 r6 = r11.A36(r7)
            r5.put(r0, r6)
        L_0x005f:
            java.lang.Long r0 = r6.A09
            long r0 = r0.longValue()
            long r0 = r0 + r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A09 = r0
            java.io.File r0 = r3.A03()
            r7 = 1
            if (r0 == 0) goto L_0x0081
            java.lang.Long r0 = r6.A08
            long r0 = r0.longValue()
            long r0 = r0 + r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A08 = r0
            r4 = 1
        L_0x0081:
            int r0 = r3.A01()
            if (r0 != 0) goto L_0x0088
            r7 = r4
        L_0x0088:
            java.lang.String r4 = r3.A08()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00ca
            com.obwhatsapp.mediacomposer.MediaComposerFragment r0 = r11.A37()
            if (r0 == 0) goto L_0x00ca
            X.AnonymousClass00B.A06(r4)
            X.0um r3 = r11.A0B
            X.013 r1 = r11.A0U
            X.1MF r0 = r0.A0I
            X.3Bj r0 = X.C62033Bj.A03(r11, r1, r3, r0, r4)
            if (r0 == 0) goto L_0x00ca
            r0.A09(r6)
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x00b5
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00b6
        L_0x00b5:
            r0 = 1
        L_0x00b6:
            r0 = r0 ^ 1
        L_0x00b8:
            r0 = r0 | r7
            if (r0 == 0) goto L_0x0021
            java.lang.Long r0 = r6.A07
            long r0 = r0.longValue()
            long r0 = r0 + r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A07 = r0
            goto L_0x0021
        L_0x00ca:
            r0 = 0
            goto L_0x00b8
        L_0x00cc:
            java.util.HashSet r6 = r11.A1X
            java.util.Iterator r7 = r6.iterator()
        L_0x00d2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0114
            java.lang.Object r3 = r7.next()
            X.20I r3 = (X.AnonymousClass20I) r3
            X.0vv r0 = r11.A0i
            byte r1 = r0.A01(r3)
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            r3.A0C(r0)
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x00f3
            r1 = 13
        L_0x00f3:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            java.lang.Object r3 = r5.get(r0)
            X.322 r3 = (X.AnonymousClass322) r3
            if (r3 != 0) goto L_0x0106
            X.322 r3 = r11.A36(r1)
            r5.put(r0, r3)
        L_0x0106:
            java.lang.Long r0 = r3.A09
            long r0 = r0.longValue()
            long r0 = r0 + r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A09 = r0
            goto L_0x00d2
        L_0x0114:
            java.util.Collection r0 = r5.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x011c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x012e
            java.lang.Object r1 = r3.next()
            X.0t7 r1 = (X.C16470t7) r1
            X.0t9 r0 = r11.A0d
            r0.A05(r1)
            goto L_0x011c
        L_0x012e:
            X.1A9 r5 = r11.A15
            java.util.Collection r3 = r11.A1V
            X.29Q r0 = r11.A1S
            java.util.Map r0 = r0.A00
            java.util.Collection r1 = r0.values()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            X.AnonymousClass1A9.A0R(r5, r3, r0)
            X.1A9 r0 = r11.A15
            X.AnonymousClass1A9.A0R(r0, r3, r6)
            java.util.List r0 = r11.A39()
            java.util.Iterator r1 = r0.iterator()
        L_0x014f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015f
            java.lang.Object r0 = r1.next()
            android.net.Uri r0 = (android.net.Uri) r0
            r11.A3K(r0)
            goto L_0x014f
        L_0x015f:
            java.util.List r0 = r11.A39()
            int r0 = r0.size()
            r6 = 0
            r5 = 1
            if (r0 != r5) goto L_0x0188
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "origin"
            int r1 = r1.getIntExtra(r0, r5)
            r0 = 2
            if (r1 == r0) goto L_0x0187
            r0 = 7
            if (r1 == r0) goto L_0x0187
            r0 = 12
            if (r1 == r0) goto L_0x0187
            r0 = 15
            if (r1 == r0) goto L_0x0187
            r0 = 18
            if (r1 != r0) goto L_0x0188
        L_0x0187:
            r6 = 1
        L_0x0188:
            r3 = 17432577(0x10a0001, float:2.53466E-38)
            if (r6 == 0) goto L_0x0196
            r11.finish()
            r0 = 17432576(0x10a0000, float:2.5346597E-38)
            r11.overridePendingTransition(r0, r3)
            return
        L_0x0196:
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "origin"
            int r1 = r1.getIntExtra(r0, r5)
            r0 = 29
            if (r1 != r0) goto L_0x01ab
            r11.finish()
            r11.overridePendingTransition(r4, r3)
            return
        L_0x01ab:
            android.graphics.Bitmap r0 = r11.A04
            if (r0 == 0) goto L_0x0201
            if (r2 == 0) goto L_0x0201
            android.view.View r0 = r11.A06
            r0.setVisibility(r4)
            boolean r0 = r2 instanceof com.obwhatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x01de
            com.obwhatsapp.mediacomposer.VideoComposerFragment r2 = (com.obwhatsapp.mediacomposer.VideoComposerFragment) r2
            X.29D r0 = r2.A0M
            r0.A09()
            X.29D r0 = r2.A0M
            android.view.View r1 = r0.A06()
            r0 = 0
            r1.setAlpha(r0)
            android.view.View r1 = r2.A06()
            r0 = 2131362933(0x7f0a0475, float:1.834566E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 4
            r1.setVisibility(r0)
        L_0x01da:
            r11.A0Z()
            return
        L_0x01de:
            boolean r0 = r2 instanceof com.obwhatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x01eb
            com.obwhatsapp.mediacomposer.ImageComposerFragment r2 = (com.obwhatsapp.mediacomposer.ImageComposerFragment) r2
            com.obwhatsapp.mediaview.PhotoView r1 = r2.A08
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x01da
        L_0x01eb:
            boolean r0 = r2 instanceof com.obwhatsapp.mediacomposer.GifComposerFragment
            if (r0 == 0) goto L_0x01da
            com.obwhatsapp.mediacomposer.GifComposerFragment r2 = (com.obwhatsapp.mediacomposer.GifComposerFragment) r2
            X.29D r0 = r2.A00
            r0.A09()
            X.29D r0 = r2.A00
            android.view.View r1 = r0.A06()
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x01da
        L_0x0201:
            r11.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.MediaComposerActivity.A3D():void");
    }

    public final void A3E() {
        int i2;
        int i3;
        if (this.A1H) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A07.getLayoutParams();
            if (getResources().getConfiguration().orientation == 2) {
                i2 = 0;
                i3 = 0;
            } else {
                i2 = this.A03;
                i3 = this.A00;
            }
            marginLayoutParams.setMargins(0, i2, 0, i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00f7, code lost:
        if ((!r0.A0A.equals(r0.A01.A01())) == false) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3F() {
        /*
            r54 = this;
            r3 = 0
            r2 = r54
            r2.A1K = r3
            java.lang.String r0 = "MediaComposerActivity/sendmedia uris size = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.List r0 = r2.A39()
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r8 = "send"
            r6 = 1
            boolean r0 = r0.getBooleanExtra(r8, r6)
            if (r0 == 0) goto L_0x0040
            X.29P r0 = r2.A0l
            X.027 r0 = r0.A01
            java.lang.Object r0 = r0.A01()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0040
            r2.A3N(r3)
            return
        L_0x0040:
            X.29P r0 = r2.A0l
            X.027 r0 = r0.A01
            java.lang.Object r0 = r0.A01()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r6) goto L_0x007c
            X.29P r0 = r2.A0l
            X.027 r0 = r0.A01
            java.lang.Object r0 = r0.A01()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = r0.get(r3)
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
        L_0x0060:
            X.01D r0 = r2.A18
            java.lang.Object r1 = r0.get()
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = X.C16030sJ.A0Q(r4)
            if (r0 == 0) goto L_0x007e
            X.11G r0 = r2.A0Z
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x007e
            if (r1 == 0) goto L_0x007e
            r2.Afc(r1)
            return
        L_0x007c:
            r4 = 0
            goto L_0x0060
        L_0x007e:
            X.29w r0 = r2.A0o
            X.4UK r0 = r0.A07
            r5 = 0
            com.obwhatsapp.WaImageButton r0 = r0.A01
            r0.setEnabled(r3)
            r2.A3B()
            r2.A3C()
            X.0tZ r26 = r2.A38()
            android.content.Intent r7 = r2.getIntent()
            r0 = 0
            java.lang.String r4 = "picker_open_time"
            long r35 = r7.getLongExtra(r4, r0)
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "number_from_url"
            boolean r39 = r1.getBooleanExtra(r0, r3)
            android.content.Intent r0 = r2.getIntent()
            boolean r40 = r0.getBooleanExtra(r8, r6)
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "origin"
            int r34 = r1.getIntExtra(r0, r6)
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "is_new_content"
            boolean r42 = r1.getBooleanExtra(r0, r3)
            android.content.Intent r4 = r2.getIntent()
            r0 = -1
            java.lang.String r3 = "gallery_duration_ms"
            long r37 = r4.getLongExtra(r3, r0)
            r2.A1N = r6
            X.0pt r4 = r2.A05
            java.lang.Runnable r3 = r2.A1U
            r0 = 300(0x12c, double:1.48E-321)
            r4.A0L(r3, r0)
            X.29P r0 = r2.A0l
            java.util.List r0 = r0.A0A
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00f9
            X.29P r0 = r2.A0l
            java.util.List r1 = r0.A0A
            X.027 r0 = r0.A01
            java.lang.Object r0 = r0.A01()
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            r45 = 1
            if (r0 != 0) goto L_0x00fb
        L_0x00f9:
            r45 = 0
        L_0x00fb:
            X.0sq r4 = r2.A05
            X.0t3 r0 = r2.A05
            r53 = r0
            X.0pd r0 = r2.A0C
            r18 = r0
            X.0tz r0 = r2.A0R
            r52 = r0
            X.0pt r0 = r2.A05
            r51 = r0
            X.0so r0 = r2.A03
            r50 = r0
            X.10X r0 = r2.A0E
            r49 = r0
            X.0sb r0 = r2.A04
            r48 = r0
            X.0t9 r0 = r2.A0d
            r19 = r0
            X.0um r0 = r2.A0B
            r47 = r0
            X.0tb r0 = r2.A0F
            r46 = r0
            X.14o r0 = r2.A0k
            r23 = r0
            X.0wK r0 = r2.A0h
            r21 = r0
            X.1Md r0 = r2.A0a
            r17 = r0
            X.1A9 r0 = r2.A15
            r16 = r0
            X.0vv r15 = r2.A0i
            X.013 r14 = r2.A0U
            X.1Mw r13 = r2.A0t
            X.1MF r12 = r2.A14
            X.29P r0 = r2.A0l
            X.027 r0 = r0.A01
            java.lang.Object r3 = r0.A01()
            java.util.List r3 = (java.util.List) r3
            java.util.List r32 = r2.A39()
            java.util.Collection r11 = r2.A1V
            X.29Q r10 = r2.A1S
            java.util.Map r9 = r2.A1Y
            java.util.HashSet r8 = r2.A1X
            X.29P r0 = r2.A0l
            X.027 r0 = r0.A06
            java.lang.Object r0 = r0.A01()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 3
            r41 = 0
            if (r1 != r0) goto L_0x0168
            r41 = 1
        L_0x0168:
            X.29P r0 = r2.A0l
            X.027 r0 = r0.A04
            java.lang.Object r1 = r0.A01()
            X.1m6 r1 = (X.C35541m6) r1
            boolean r7 = r2.A1G
            boolean r6 = r2.A1F
            X.37L r0 = new X.37L
            r20 = r10
            r22 = r15
            r24 = r13
            r25 = r2
            r27 = r12
            r28 = r16
            r29 = r11
            r30 = r8
            r31 = r3
            r33 = r9
            r43 = r7
            r44 = r6
            r6 = r0
            r7 = r50
            r8 = r48
            r9 = r51
            r10 = r49
            r11 = r46
            r12 = r53
            r13 = r52
            r15 = r1
            r16 = r17
            r17 = r47
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r40, r41, r42, r43, r44, r45)
            java.lang.Void[] r1 = new java.lang.Void[r5]
            r4.Ack(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.MediaComposerActivity.A3F():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (r1.A00 == 35) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3G() {
        /*
            r33 = this;
            r12 = r33
            X.0pd r0 = r12.A0C
            r16 = r0
            X.1Ai r15 = r12.A0B
            X.0so r14 = r12.A03
            X.0rt r13 = r12.A0X
            X.0um r11 = r12.A0B
            X.11d r10 = r12.A0b
            X.01V r9 = r12.A08
            X.013 r8 = r12.A0U
            X.1BQ r7 = r12.A0c
            X.0rz r6 = r12.A09
            X.29P r5 = r12.A0l
            X.0u3 r4 = r12.A0z
            X.027 r0 = r5.A01
            java.lang.Object r3 = r0.A01()
            java.util.List r3 = (java.util.List) r3
            X.29w r0 = r12.A0o
            X.2X6 r0 = r0.A04
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r0 = r0.A04
            java.lang.CharSequence r28 = r0.getCaptionText()
            if (r28 != 0) goto L_0x0032
            java.lang.String r28 = ""
        L_0x0032:
            X.29P r1 = r12.A0l
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0046
            X.027 r0 = r1.A01
            java.lang.Object r0 = r0.A01()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004e
        L_0x0046:
            int r1 = r1.A00
            r0 = 35
            r30 = 0
            if (r1 != r0) goto L_0x0050
        L_0x004e:
            r30 = 1
        L_0x0050:
            X.0tZ r0 = r12.A38()
            r31 = 0
            if (r0 != 0) goto L_0x005a
            r31 = 1
        L_0x005a:
            boolean r2 = r12.A1G
            X.2Sl r1 = r12.A0B
            X.29F r0 = new X.29F
            r29 = r3
            r32 = r2
            r26 = r4
            r27 = r15
            r24 = r16
            r25 = r5
            r22 = r11
            r23 = r7
            r20 = r13
            r21 = r10
            r18 = r6
            r19 = r8
            r16 = r12
            r17 = r9
            r15 = r1
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r12.A0p = r0
            r0.show()
            X.29w r1 = r12.A0o
            X.29P r0 = r12.A0l
            boolean r0 = r0.A08()
            r1.A02(r0)
            X.29w r0 = r12.A0o
            X.4IF r0 = r0.A05
            com.obwhatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView r1 = r0.A01
            android.widget.TextView r0 = r1.A00
            r0.clearAnimation()
            r0 = 8
            r1.setFilterSwipeTextVisibility(r0)
            X.29F r2 = r12.A0p
            r1 = 0
            com.facebook.redex.IDxDListenerShape157S0100000_1_I0 r0 = new com.facebook.redex.IDxDListenerShape157S0100000_1_I0
            r0.<init>(r12, r1)
            r2.setOnDismissListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.MediaComposerActivity.A3G():void");
    }

    public final void A3H() {
        this.A0o.A04.A00((Integer) this.A0l.A06.A01());
        MediaComposerFragment A37 = A37();
        if (A37 != null) {
            AnonymousClass29P r0 = this.A0l;
            Uri A022 = r0.A02();
            byte byteValue = Byte.valueOf(A022 != null ? r0.A09.A01(r0.A08.A00(A022)) : -1).byteValue();
            if (byteValue != 13 && byteValue != 29) {
                boolean z2 = false;
                if (((Number) this.A0l.A06.A01()).intValue() == 3) {
                    z2 = true;
                }
                A37.A1G(z2);
                A37.A1E();
            }
        }
    }

    public final void A3I(int i2) {
        boolean z2;
        VideoComposerFragment videoComposerFragment;
        if (i2 >= 0 && i2 < A39().size()) {
            this.A0l.A04(i2);
            this.A0o.A08.A02.A01();
            C456429w r0 = this.A0o;
            r0.A08.A06.A0a(A35());
            MediaComposerFragment A37 = A37();
            for (AnonymousClass01A r1 : A2E()) {
                if ((r1 instanceof MediaComposerFragment) && r1 != A37) {
                    MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) r1;
                    if (!(mediaComposerFragment instanceof VideoComposerFragment)) {
                        if (mediaComposerFragment instanceof ImageComposerFragment) {
                            C30141bo r2 = ((ImageComposerFragment) mediaComposerFragment).A07;
                            r2.A0K.removeCallbacks(r2.A0X);
                            r2.A02 = null;
                            r2.A0B = false;
                            r2.A03();
                        } else if (!(mediaComposerFragment instanceof GifComposerFragment)) {
                        }
                    }
                    mediaComposerFragment.A1I();
                }
            }
            if (A37 != null && !getIntent().getBooleanExtra("smb_send_product", false)) {
                if (!(((Number) this.A0l.A05.A01()).intValue() == 5 || ((Number) this.A0l.A05.A01()).intValue() == 1 || ((Number) this.A0l.A05.A01()).intValue() == 3)) {
                    this.A0l.A05(0);
                }
                AnonymousClass2Ra r22 = A37.A0D;
                boolean z3 = false;
                if (A37.A03().getConfiguration().orientation == 2) {
                    z3 = true;
                }
                r22.A07 = z3;
                C49112Rc r5 = r22.A0Q;
                r5.A01 = r22.A0F.A00;
                int i3 = 0;
                r22.A0E.A05(false);
                AnonymousClass4XG r02 = r22.A03;
                r02.A00();
                r5.A04 = r02;
                r5.A05 = r22;
                if (!(!r22.A0O.A03.A00.isEmpty())) {
                    i3 = 4;
                }
                r5.A0H.setUndoButtonVisibility(i3);
                r22.A03();
                r22.A04();
                boolean z4 = A37 instanceof ImageComposerFragment;
                if (z4) {
                    TitleBarView titleBarView = this.A0s.A0H;
                    if (!titleBarView.A05.isSelected() && !titleBarView.A06.isSelected() && !titleBarView.A09.isSelected()) {
                        C30141bo r7 = ((ImageComposerFragment) A37).A07;
                        View view = r7.A0L;
                        if (view != null && r7.A08 == null) {
                            r7.A08 = new FilterSelectorController$4(r7);
                            BottomSheetBehavior bottomSheetBehavior = r7.A08;
                            ((AnonymousClass0Bo) view.getLayoutParams()).A01(bottomSheetBehavior);
                            IDxSCallbackShape44S0100000_1_I0 iDxSCallbackShape44S0100000_1_I0 = new IDxSCallbackShape44S0100000_1_I0(r7, 1);
                            r7.A07 = iDxSCallbackShape44S0100000_1_I0;
                            bottomSheetBehavior.A0E = iDxSCallbackShape44S0100000_1_I0;
                            if (bottomSheetBehavior.A0B == 3) {
                                iDxSCallbackShape44S0100000_1_I0.A02(view, 3);
                            }
                            r7.A0N.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(r7, 21));
                        }
                        C456429w r52 = this.A0o;
                        boolean A072 = this.A0l.A07();
                        AnonymousClass4IF r03 = r52.A05;
                        if (A072) {
                            FilterSwipeView filterSwipeView = r03.A01;
                            TextView textView = filterSwipeView.A00;
                            if (textView.getVisibility() != 0) {
                                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                                translateAnimation.setDuration(1);
                                AnimationSet animationSet = new AnimationSet(false);
                                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                                alphaAnimation.setDuration(300);
                                animationSet.addAnimation(alphaAnimation);
                                animationSet.addAnimation(translateAnimation);
                                textView.startAnimation(animationSet);
                            }
                            filterSwipeView.setFilterSwipeTextVisibility(0);
                        }
                    }
                    this.A0s.A0H.setCropToolVisibility(0);
                } else {
                    if (!(A37 instanceof GifComposerFragment)) {
                        if (A37 instanceof VideoComposerFragment) {
                            A37.A1E();
                        } else {
                            StringBuilder sb = new StringBuilder("Unhandled fragment instance type ");
                            sb.append(A37.getClass().getSimpleName());
                            Log.w(sb.toString());
                        }
                    }
                    this.A0s.A0H.setCropToolVisibility(8);
                    FilterSwipeView filterSwipeView2 = this.A0o.A05.A01;
                    filterSwipeView2.A00.clearAnimation();
                    filterSwipeView2.setFilterSwipeTextVisibility(8);
                }
                if (A37 instanceof VideoComposerFragment) {
                    VideoComposerFragment videoComposerFragment2 = (VideoComposerFragment) A37;
                    z2 = videoComposerFragment2.A0Q;
                    videoComposerFragment = videoComposerFragment2;
                } else if (z4) {
                    C30141bo r12 = ((ImageComposerFragment) A37).A07;
                    if (!r12.A0B) {
                        r12.A04();
                    }
                    C30151bp r04 = r12.A0A;
                    if (r04 == null) {
                        r12.A0K.postDelayed(r12.A0X, 500);
                    } else {
                        r04.A01();
                    }
                } else {
                    z2 = A37 instanceof GifComposerFragment;
                    videoComposerFragment = A37;
                }
                if (z2) {
                    videoComposerFragment.A1D();
                }
            }
            Uri A022 = this.A0l.A02();
            AnonymousClass29Q r05 = this.A1S;
            AnonymousClass00B.A06(A022);
            AnonymousClass20I A002 = r05.A00(A022);
            SpannableStringBuilder spannableStringBuilder = null;
            if (A002.A07() != null) {
                spannableStringBuilder = new SpannableStringBuilder(A002.A07());
                this.A0u.A02(this, spannableStringBuilder, C39501sa.A01(A002.A09()));
            }
            this.A0o.A00(spannableStringBuilder, true);
        }
    }

    public final void A3J(Uri uri) {
        AnonymousClass29P r1 = this.A0l;
        r1.A0B.remove(uri);
        r1.A03();
        Map map = this.A1S.A00;
        Object remove = map.remove(uri);
        if (remove != null) {
            this.A1X.add(remove);
            int size = new ArrayList(map.values()).size();
            int i2 = this.A01;
            if (size >= i2) {
                i2 = this.A0C.A03(C16620tM.A02, 2693);
                this.A01 = i2;
            }
            boolean z2 = false;
            if (i2 > new ArrayList(map.values()).size()) {
                z2 = true;
            }
            this.A1C = z2;
            this.A0o.A04.A04.setAddButtonActivated(z2);
        }
        this.A0n.A06();
        this.A0o.A08.A02.A01();
        if (A39().isEmpty()) {
            finish();
            return;
        }
        if (A35() >= 0) {
            AQ0();
            this.A0o.A03.setAlpha(1.0f - 0.0f);
            this.A0f.setCurrentItem(A35());
            A3I(A35());
        }
        this.A0o.A04(this.A0l.A08());
    }

    public final void A3K(Uri uri) {
        if (uri != null) {
            C34711kk A022 = this.A0I.A02();
            A022.A02.A03(uri.toString());
            C34711kk A023 = this.A0I.A02();
            StringBuilder sb = new StringBuilder();
            sb.append(uri.toString());
            sb.append("-thumb");
            A023.A02.A03(sb.toString());
            C34711kk A024 = this.A0I.A02();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri.toString());
            sb2.append("-filter");
            A024.A02.A03(sb2.toString());
            C34711kk A002 = this.A0I.A00();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(uri.toString());
            sb3.append("-thumb");
            A002.A02.A03(sb3.toString());
        }
    }

    public final void A3L(C35541m6 r5, List list) {
        this.A0q.A00(r5, list, true);
        C456429w r3 = this.A0o;
        boolean z2 = !((List) this.A0l.A01.A01()).isEmpty();
        CaptionView captionView = r3.A04.A04;
        captionView.getContext();
        AnonymousClass013 r0 = captionView.A00;
        if (z2) {
            AnonymousClass4Xy.A00(captionView, r0);
        } else {
            AnonymousClass4Xy.A01(captionView, r0);
        }
        r3.A07.A01(z2);
    }

    public final void A3M(MediaComposerFragment mediaComposerFragment) {
        String str;
        String str2;
        Uri uri = mediaComposerFragment.A00;
        AnonymousClass29Q r6 = this.A1S;
        AnonymousClass20I A002 = r6.A00(uri);
        if (!mediaComposerFragment.A0D.A0O.A04.isEmpty()) {
            AnonymousClass2Ra r1 = mediaComposerFragment.A0D;
            AnonymousClass39P r0 = r1.A0I;
            str = new C62033Bj(r0.A06, r0.A07, r1.A0O.A05, r0.A02).A04();
        } else {
            str = null;
        }
        synchronized (A002) {
            A002.A0A = str;
        }
        AnonymousClass20I A003 = r6.A00(uri);
        if (!mediaComposerFragment.A0D.A0O.A04.isEmpty()) {
            C455729k r02 = mediaComposerFragment.A0D.A0O;
            try {
                str2 = r02.A03.A01(r02.A04);
            } catch (JSONException e2) {
                Log.e("ShapeRepository/saveEditState", e2);
                str2 = null;
            }
        } else {
            str2 = null;
        }
        synchronized (A003) {
            A003.A0B = str2;
        }
    }

    public final void A3N(boolean z2) {
        long j2;
        StringBuilder sb = new StringBuilder("MediaComposerActivity/openContactPicker uris size = ");
        sb.append(A39().size());
        Log.i(sb.toString());
        HashSet hashSet = new HashSet();
        boolean z3 = false;
        if (((Number) this.A0l.A06.A01()).intValue() == 3) {
            z3 = true;
        }
        AnonymousClass29Q r2 = this.A1S;
        if (z3) {
            j2 = A02(r2.A00((Uri) A39().get(0)));
            int i2 = 42;
            if (this.A0l.A00() == 3) {
                i2 = 43;
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            Iterator it = new ArrayList(r2.A00.values()).iterator();
            j2 = -1;
            while (it.hasNext()) {
                AnonymousClass20I r1 = (AnonymousClass20I) it.next();
                if (r1.A06() != null) {
                    hashSet.add(Integer.valueOf(r1.A06().byteValue()));
                    j2 = Math.max(j2, A02(r1));
                }
            }
        }
        AnonymousClass391 r12 = new AnonymousClass391(this);
        r12.A0D = true;
        r12.A0T = (List) this.A0l.A01.A01();
        r12.A0F = true;
        r12.A0L = Long.valueOf(j2);
        r12.A0R = new ArrayList(hashSet);
        r12.A0G = Boolean.valueOf(z2);
        Intent A002 = r12.A00();
        this.A12.A01(A002, (C35541m6) this.A0l.A04.A01());
        startActivityForResult(A002, 1);
    }

    public final boolean A3O() {
        int intExtra = getIntent().getIntExtra("origin", 1);
        return intExtra == 5 || intExtra == 8 || intExtra == 9 || intExtra == 23 || intExtra == 22 || intExtra == 24 || intExtra == 25 || intExtra == 29 || intExtra == 35;
    }

    public Uri A9w() {
        if (C455529g.A00) {
            return (Uri) getIntent().getParcelableExtra("animate_uri");
        }
        return null;
    }

    public String ABt(Uri uri) {
        String str;
        AnonymousClass20I A002 = this.A1S.A00(uri);
        synchronized (A002) {
            str = A002.A0B;
        }
        return str;
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public void AM7() {
        MediaComposerFragment A37 = A37();
        if (A37 != null && A37.A1H()) {
            return;
        }
        if (!this.A1C) {
            this.A05.A0H(getString(R.string.str1616, new Object[]{Integer.valueOf(this.A01)}), 0);
            return;
        }
        A3B();
        A3C();
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList((Collection) this.A0l.A03.A01()));
        if (this.A1G) {
            intent.putStringArrayListExtra("jids", C16030sJ.A06((Collection) this.A0l.A01.A01()));
        }
        AnonymousClass29Q r0 = this.A1S;
        Bundle bundle = new Bundle();
        r0.A02(bundle);
        intent.putExtra("media_preview_params", bundle);
        this.A02 = 1;
        setResult(1, intent);
        finish();
    }

    public void AQ0() {
        A3K(this.A0l.A02());
        A3B();
        C456429w r2 = this.A0o;
        boolean A082 = this.A0l.A08();
        r2.A08.A02.A01();
        r2.A01(A082);
    }

    public void AXh() {
        A3F();
    }

    public void Aev(Uri uri, long j2, long j3) {
        AnonymousClass20I A002 = this.A1S.A00(uri);
        Point point = new Point((int) j2, (int) j3);
        synchronized (A002) {
            A002.A03 = point;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00aa, code lost:
        if (r9 != 100) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r5 = r16
            boolean r0 = r5.A1N
            if (r0 != 0) goto L_0x00fa
            X.2S8 r2 = r5.A0m
            com.obwhatsapp.gallerypicker.PhotoViewPager r9 = r5.A0f
            android.view.View r0 = r2.A06
            r7 = 0
            r3 = r17
            if (r0 == 0) goto L_0x0162
            int r1 = r3.getAction()
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = 2
            r8 = 255(0xff, float:3.57E-43)
            r12 = 1
            r4 = 0
            if (r1 != r0) goto L_0x012d
            android.view.ViewGroup r11 = r2.A08
            r11.setVisibility(r7)
            android.view.ViewGroup r5 = r2.A07
            int[] r8 = r2.A0E
            r5.getLocationOnScreen(r8)
            float r0 = r3.getX()
            int r10 = (int) r0
            r0 = r8[r7]
            int r10 = r10 - r0
            float r0 = r2.A00
            int r0 = (int) r0
            int r10 = r10 - r0
            float r0 = r3.getY()
            int r1 = (int) r0
            r0 = r8[r12]
            int r1 = r1 - r0
            float r0 = r2.A01
            int r0 = (int) r0
            int r1 = r1 - r0
            r5.setPadding(r10, r1, r7, r7)
            android.view.View r10 = r2.A05
            int r1 = r11.getHeight()
            int r0 = r9.getHeight()
            int r1 = r1 - r0
            r10.setPadding(r7, r7, r7, r1)
            android.widget.TextView r1 = r2.A0A
            r1.getLocationOnScreen(r8)
            r9 = r8[r12]
            int r0 = r1.getHeight()
            int r9 = r9 + r0
            int r0 = r5.getHeight()
            int r0 = r0 - r9
            if (r0 <= 0) goto L_0x00ac
            float r8 = (float) r0
            float r3 = r3.getY()
            float r0 = (float) r9
            float r3 = r3 - r0
            float r3 = r8 - r3
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            float r3 = r3 / r8
            float r0 = java.lang.Math.min(r0, r3)
            int r9 = (int) r0
            if (r9 < 0) goto L_0x00ac
            r0 = 70
            r8 = 100
            if (r9 <= r0) goto L_0x00ac
            int r0 = r9 << 1
            int r0 = r0 / 3
            int r0 = r0 * 255
            int r0 = r0 / r8
            int r0 = r0 << 24
            r10.setBackgroundColor(r0)
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x009f
            int r3 = r9 * 255
            int r3 = r3 / r8
            int r0 = r3 << 24
            r6 = r6 | r0
            r1.setTextColor(r6)
            android.graphics.drawable.Drawable r0 = r2.A03
            r0.setAlpha(r3)
        L_0x009f:
            r10.clearAnimation()
            android.os.Handler r3 = r2.A0C
            java.lang.Runnable r0 = r2.A0D
            r3.removeCallbacks(r0)
            r3 = 1
            if (r9 == r8) goto L_0x00ad
        L_0x00ac:
            r3 = 0
        L_0x00ad:
            r13 = 1056964608(0x3f000000, float:0.5)
            boolean r0 = r2.A0B
            if (r3 == 0) goto L_0x00fc
            if (r0 != 0) goto L_0x00f5
            r2.A0B = r12
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r1.setTextColor(r0)
            android.graphics.drawable.Drawable r0 = r2.A02
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
            int r0 = r5.getWidth()
            float r9 = (float) r0
            float r9 = r9 * r13
            int r0 = r1.getWidth()
            float r0 = (float) r0
            float r9 = r9 / r0
            r8 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r14 = 1
            r15 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r7 = new android.view.animation.ScaleAnimation
            r11 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            android.view.animation.BounceInterpolator r0 = new android.view.animation.BounceInterpolator
            r0.<init>()
            r7.setInterpolator(r0)
            r3 = 800(0x320, double:3.953E-321)
        L_0x00e4:
            r7.setDuration(r3)
            r7.setFillAfter(r12)
            r1.clearAnimation()
            r1.startAnimation(r7)
            android.widget.ImageView r0 = r2.A09
            r0.invalidate()
        L_0x00f5:
            android.view.View r0 = r2.A06
            r0.invalidate()
        L_0x00fa:
            r1 = 1
        L_0x00fb:
            return r1
        L_0x00fc:
            if (r0 == 0) goto L_0x00f5
            r2.A0B = r7
            r0 = -1
            r1.setTextColor(r0)
            android.graphics.drawable.Drawable r0 = r2.A03
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
            int r0 = r5.getWidth()
            float r8 = (float) r0
            float r8 = r8 * r13
            int r0 = r1.getWidth()
            float r0 = (float) r0
            float r8 = r8 / r0
            r9 = 1065353216(0x3f800000, float:1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            r14 = 1
            r15 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r7 = new android.view.animation.ScaleAnimation
            r10 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r7.setInterpolator(r0)
            r3 = 500(0x1f4, double:2.47E-321)
            goto L_0x00e4
        L_0x012d:
            int r0 = r3.getAction()
            if (r0 != r12) goto L_0x016a
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x016a
            android.net.Uri r1 = r2.A04
            com.obwhatsapp.mediacomposer.MediaComposerActivity r0 = r2.A0F
            r0.A3J(r1)
        L_0x013e:
            r2.A0B = r7
            r2.A04 = r4
            r2.A06 = r4
            android.view.ViewGroup r1 = r2.A08
            r0 = 8
            r1.setVisibility(r0)
            android.graphics.drawable.Drawable r1 = r2.A03
            r1.setAlpha(r8)
            android.widget.TextView r0 = r2.A0A
            r0.clearAnimation()
            r0.setTextColor(r6)
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r4, r4, r4)
            android.os.Handler r1 = r2.A0C
            java.lang.Runnable r0 = r2.A0D
            r1.removeCallbacks(r0)
        L_0x0162:
            boolean r0 = super.dispatchTouchEvent(r3)
            r1 = 0
            if (r0 == 0) goto L_0x00fb
            goto L_0x00fa
        L_0x016a:
            android.view.View r0 = r2.A06
            r0.invalidate()
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.MediaComposerActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1 && intent != null) {
            if (i3 == -1) {
                this.A0l.A01.A0B(Collections.unmodifiableList(C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"))));
                AnonymousClass00B.A06(intent);
                C35541m6 A002 = this.A12.A00(intent.getExtras());
                if (A002 != null) {
                    this.A0l.A04.A0B(A002);
                }
                A3F();
            } else if (i3 == 0 && this.A1G) {
                List A082 = C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"));
                C35541m6 A003 = this.A12.A00(intent.getExtras());
                this.A0l.A01.A0B(Collections.unmodifiableList(A082));
                AnonymousClass29P r0 = this.A0l;
                AnonymousClass00B.A06(A003);
                r0.A04.A0B(A003);
                AnonymousClass29P r1 = this.A0l;
                r1.A06(r1.A01());
            }
        }
    }

    public void onBackPressed() {
        A3D();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A3E();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0627, code lost:
        if (r0 != null) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01b2, code lost:
        if (getIntent().getBooleanExtra("smb_send_product", false) != false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0408, code lost:
        if (r5.A0C.A0E(r12, 2855) == false) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x057d, code lost:
        if (r13 != 0) goto L_0x057f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x05c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r44) {
        /*
            r43 = this;
            r5 = r43
            android.view.Window r6 = r5.getWindow()
            boolean r0 = X.C41971wz.A01()
            if (r0 != 0) goto L_0x0011
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r6.addFlags(r0)
        L_0x0011:
            boolean r17 = X.C455529g.A00
            r11 = 1
            if (r17 == 0) goto L_0x00b7
            r0 = 12
            r6.requestFeature(r0)
            r0 = 13
            r6.requestFeature(r0)
            r6.setAllowEnterTransitionOverlap(r11)
            r6.setAllowReturnTransitionOverlap(r11)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            android.transition.ChangeBounds r7 = new android.transition.ChangeBounds
            r7.<init>()
            r7.setInterpolator(r0)
            android.transition.ChangeTransform r4 = new android.transition.ChangeTransform
            r4.<init>()
            r4.setInterpolator(r0)
            android.transition.ChangeImageTransform r3 = new android.transition.ChangeImageTransform
            r3.<init>()
            r3.setInterpolator(r0)
            android.transition.TransitionSet r2 = new android.transition.TransitionSet
            r2.<init>()
            r2.setInterpolator(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r2.addTransition(r7)
            r2.addTransition(r4)
            r2.addTransition(r3)
            r0 = 2131362583(0x7f0a0317, float:1.834495E38)
            r2.excludeTarget(r0, r11)
            r0 = 2131361946(0x7f0a009a, float:1.8343659E38)
            r2.excludeTarget(r0, r11)
            r0 = 2131361947(0x7f0a009b, float:1.834366E38)
            r2.excludeTarget(r0, r11)
            r0 = 2131362580(0x7f0a0314, float:1.8344945E38)
            r2.excludeTarget(r0, r11)
            r0 = 2131366959(0x7f0a142f, float:1.8353826E38)
            r2.excludeTarget(r0, r11)
            r0 = 2131366071(0x7f0a10b7, float:1.8352025E38)
            r2.excludeTarget(r0, r11)
            r6.setSharedElementEnterTransition(r2)
            android.transition.TransitionSet r0 = r2.clone()
            r6.setSharedElementReturnTransition(r0)
            X.3hh r0 = new X.3hh
            r0.<init>(r5)
            r2.addListener(r0)
            android.transition.Fade r4 = new android.transition.Fade
            r4.<init>()
            android.transition.Fade r3 = new android.transition.Fade
            r3.<init>()
            r2 = 16908335(0x102002f, float:2.387736E-38)
            r4.excludeTarget(r2, r11)
            r1 = 16908336(0x1020030, float:2.3877364E-38)
            r4.excludeTarget(r1, r11)
            r0 = 2131363698(0x7f0a0772, float:1.8347212E38)
            r4.excludeTarget(r0, r11)
            r3.excludeTarget(r2, r11)
            r3.excludeTarget(r1, r11)
            r6.setEnterTransition(r4)
            r6.setReturnTransition(r3)
        L_0x00b7:
            r7 = r44
            super.onCreate(r7)
            X.0sj r0 = r5.A0T
            boolean r0 = com.obwhatsapp.RequestPermissionActivity.A0X(r5, r0)
            if (r0 == 0) goto L_0x06ed
            r0 = 2131889393(0x7f120cf1, float:1.9413448E38)
            r5.setTitle(r0)
            X.0sq r2 = r5.A05
            X.1H9 r1 = r5.A0Q
            r4 = 1
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r0.<init>(r1, r11)
            r2.Acl(r0)
            if (r44 != 0) goto L_0x0226
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r24 = r1.getParcelableArrayListExtra(r0)
            android.content.Intent r0 = r5.getIntent()
            android.os.Bundle r10 = r0.getExtras()
            r8 = 0
            r26 = -1
            r27 = -1
        L_0x00f0:
            if (r24 == 0) goto L_0x06ed
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x06ed
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.0rv r0 = X.C15830rv.A02(r0)
            if (r0 == 0) goto L_0x0211
            r3.add(r0)
        L_0x0110:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "status_distribution"
            android.os.Parcelable r9 = r1.getParcelableExtra(r0)
            X.1m6 r9 = (X.C35541m6) r9
            r12 = 0
            if (r9 != 0) goto L_0x0137
            X.11G r0 = r5.A0Z
            int r2 = r0.A02()
            X.11G r0 = r5.A0Z
            java.util.List r1 = r0.A08()
            X.11G r0 = r5.A0Z
            java.util.List r0 = r0.A09()
            X.1m6 r9 = new X.1m6
            r9.<init>(r1, r0, r2, r12)
        L_0x0137:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "origin"
            int r18 = r1.getIntExtra(r0, r11)
            X.0vv r13 = r5.A0i
            X.29Q r2 = r5.A1S
            X.0uP r12 = r5.A0L
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "send"
            boolean r29 = r1.getBooleanExtra(r0, r11)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "smb_quick_reply"
            r11 = 0
            r1.getBooleanExtra(r0, r11)
            X.29P r0 = new X.29P
            r21 = r9
            r22 = r2
            r23 = r13
            r25 = r3
            r28 = r18
            r19 = r0
            r20 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r5.A0l = r0
            r9 = 191(0xbf, float:2.68E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r1.<init>((java.lang.Object) r5, (int) r9)
            X.027 r0 = r0.A03
            r0.A0A(r5, r1)
            X.29P r9 = r5.A0l
            r0 = 188(0xbc, float:2.63E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r1.<init>((java.lang.Object) r5, (int) r0)
            X.027 r0 = r9.A06
            r0.A0A(r5, r1)
            X.29P r9 = r5.A0l
            r0 = 189(0xbd, float:2.65E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r1.<init>((java.lang.Object) r5, (int) r0)
            X.027 r0 = r9.A05
            r0.A0A(r5, r1)
            X.0u3 r1 = r5.A0z
            X.01V r0 = r5.A08
            int r1 = X.C42971z5.A01(r0, r1)
            r0 = 2013(0x7dd, float:2.821E-42)
            if (r1 < r0) goto L_0x01b4
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "smb_send_product"
            boolean r1 = r1.getBooleanExtra(r0, r11)
            r0 = 1
            if (r1 == 0) goto L_0x01b5
        L_0x01b4:
            r0 = 0
        L_0x01b5:
            r5.A1K = r0
            if (r10 == 0) goto L_0x01bc
            r2.A01(r10)
        L_0x01bc:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r12 = r1.getStringExtra(r0)
            r10 = 0
        L_0x01c7:
            java.util.List r0 = r5.A39()
            int r0 = r0.size()
            if (r10 >= r0) goto L_0x024d
            java.util.List r0 = r5.A39()
            java.lang.Object r9 = r0.get(r10)
            android.net.Uri r9 = (android.net.Uri) r9
            X.20I r13 = r2.A00(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x01e8
            r13.A0D(r12)
        L_0x01e8:
            java.lang.String r0 = "caption"
            java.lang.String r1 = r9.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01f7
            r13.A0D(r1)
        L_0x01f7:
            if (r8 != 0) goto L_0x0206
            long r0 = (long) r10
        L_0x01fa:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.util.HashMap r0 = r5.A1W
            r0.put(r9, r1)
            int r10 = r10 + 1
            goto L_0x01c7
        L_0x0206:
            java.lang.Object r0 = r8.get(r10)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            goto L_0x01fa
        L_0x0211:
            java.lang.Class<X.0rv> r2 = X.C15830rv.class
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "jids"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            java.util.List r0 = X.C16030sJ.A08(r2, r0)
            r3.addAll(r0)
            goto L_0x0110
        L_0x0226:
            java.lang.String r0 = "uris"
            java.util.ArrayList r24 = r7.getParcelableArrayList(r0)
            java.lang.String r0 = "ids"
            java.io.Serializable r8 = r7.getSerializable(r0)
            java.util.AbstractList r8 = (java.util.AbstractList) r8
            java.lang.String r0 = "position"
            int r26 = r7.getInt(r0)
            java.lang.String r0 = "optimistic_started"
            boolean r0 = r7.getBoolean(r0)
            r5.A1L = r0
            java.lang.String r0 = "view_once"
            int r27 = r7.getInt(r0)
            r10 = r7
            goto L_0x00f0
        L_0x024d:
            r0 = 2131559365(0x7f0d03c5, float:1.8744072E38)
            r5.setContentView((int) r0)
            android.view.View r1 = r5.A00
            r0 = 2131362309(0x7f0a0205, float:1.8344395E38)
            android.view.View r13 = X.C004601z.A0E(r1, r0)
            com.obwhatsapp.mediacomposer.bottombar.BottomBarView r13 = (com.obwhatsapp.mediacomposer.bottombar.BottomBarView) r13
            boolean r14 = r13.A04
            r5.A1G = r14
            if (r14 == 0) goto L_0x0280
            X.29P r8 = r5.A0l
            r0 = 190(0xbe, float:2.66E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r1.<init>((java.lang.Object) r5, (int) r0)
            X.027 r0 = r8.A01
            r0.A0A(r5, r1)
            X.29P r8 = r5.A0l
            r0 = 187(0xbb, float:2.62E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r1.<init>((java.lang.Object) r5, (int) r0)
            X.027 r0 = r8.A04
            r0.A0A(r5, r1)
        L_0x0280:
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r5)
            r1 = 2131559860(0x7f0d05b4, float:1.8745076E38)
            r0 = 2131365457(0x7f0a0e51, float:1.835078E38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r8.inflate(r1, r0, r4)
            r0 = 2131366645(0x7f0a12f5, float:1.835319E38)
            android.view.View r9 = r1.findViewById(r0)
            com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView r9 = (com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView) r9
            X.4ES r8 = new X.4ES
            r8.<init>(r5)
            X.29P r1 = r5.A0l
            X.2Rc r0 = new X.2Rc
            r0.<init>(r1, r8, r9)
            r5.A0s = r0
            X.0pd r1 = r5.A0C
            r0 = 2182(0x886, float:3.058E-42)
            X.0tM r12 = X.C16620tM.A02
            boolean r0 = r1.A0E(r12, r0)
            r5.A1H = r0
            X.0pd r1 = r5.A0C
            r0 = 2614(0xa36, float:3.663E-42)
            int r0 = r1.A03(r12, r0)
            r5.A01 = r0
            X.1Cv r10 = r5.A0I
            android.content.ContentResolver r8 = r5.getContentResolver()
            android.os.Handler r9 = r5.A1Q
            java.lang.String r1 = "media-composer"
            X.2OM r0 = new X.2OM
            r0.<init>(r8, r9, r10, r1)
            r5.A0e = r0
            boolean r1 = r5.A1G
            X.2S8 r0 = new X.2S8
            r0.<init>(r5, r5, r1)
            r5.A0m = r0
            r0 = 1024(0x400, float:1.435E-42)
            r6.addFlags(r0)
            X.01V r1 = r5.A08
            r0 = 2131364506(0x7f0a0a9a, float:1.834885E38)
            android.view.View r0 = r5.findViewById(r0)
            X.C41971wz.A00(r0, r6, r1)
            r1 = 1280(0x500, float:1.794E-42)
            boolean r0 = X.C15450qv.A03()
            if (r0 == 0) goto L_0x02fa
            boolean r0 = r5.A1G
            if (r0 != 0) goto L_0x02fa
            r1 = 1792(0x700, float:2.511E-42)
        L_0x02fa:
            r1 = r1 | 4
            android.view.View r0 = r6.getDecorView()
            r0.setSystemUiVisibility(r1)
            r0 = 2131365457(0x7f0a0e51, float:1.835078E38)
            android.view.View r1 = r5.findViewById(r0)
            r5.A05 = r1
            int r0 = r1.getPaddingBottom()
            r1.setPadding(r11, r11, r11, r0)
            boolean r0 = X.C15450qv.A03()
            if (r0 == 0) goto L_0x0327
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r6.addFlags(r0)
            boolean r0 = r5.A1G
            if (r0 != 0) goto L_0x0327
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r6.addFlags(r0)
        L_0x0327:
            X.C19980zJ.A05(r6)
            r0 = 2131365459(0x7f0a0e53, float:1.8350784E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r5.A07 = r0
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "preview_top_margin"
            int r0 = r1.getIntExtra(r0, r11)
            r5.A03 = r0
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "preview_bottom_margin"
            int r0 = r1.getIntExtra(r0, r11)
            r5.A00 = r0
            X.2Rc r1 = r5.A0s
            int r0 = r5.A03
            r1.A02 = r0
            boolean r0 = r5.A1H
            if (r0 == 0) goto L_0x0361
            android.view.View r0 = r5.A05
            r0.setFitsSystemWindows(r11)
            android.view.View r0 = r5.A05
            r0.invalidate()
        L_0x0361:
            r5.A3E()
            r0 = 2131364996(0x7f0a0c84, float:1.8349845E38)
            android.view.View r1 = r5.findViewById(r0)
            com.obwhatsapp.gallerypicker.PhotoViewPager r1 = (com.obwhatsapp.gallerypicker.PhotoViewPager) r1
            r5.A0f = r1
            r8 = 1094713344(0x41400000, float:12.0)
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r8
            int r0 = (int) r0
            r1.setPageMargin(r0)
            com.obwhatsapp.gallerypicker.PhotoViewPager r1 = r5.A0f
            r0 = 0
            r1.A0H(r0, r11)
            com.obwhatsapp.gallerypicker.PhotoViewPager r1 = r5.A0f
            r8 = 0
            com.facebook.redex.IDxTListenerShape443S0100000_2_I0 r0 = new com.facebook.redex.IDxTListenerShape443S0100000_2_I0
            r0.<init>(r5, r11)
            r1.A04 = r0
            X.4me r0 = new X.4me
            r0.<init>(r5)
            r1.A0W = r0
            r1.setFocusable(r11)
            r0 = 2131365461(0x7f0a0e55, float:1.8350788E38)
            android.view.View r10 = r5.findViewById(r0)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 2131365462(0x7f0a0e56, float:1.835079E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.A06 = r0
            android.content.Intent r15 = r5.getIntent()
            java.lang.String r1 = "product_origin"
            r0 = -1
            int r1 = r15.getIntExtra(r1, r0)
            android.content.Intent r15 = r5.getIntent()
            java.lang.String r0 = "smb_send_product"
            boolean r0 = r15.getBooleanExtra(r0, r11)
            if (r0 == 0) goto L_0x03f5
            java.util.List r0 = r5.A39()
            java.lang.Object r0 = r0.get(r11)
            android.net.Uri r0 = (android.net.Uri) r0
            X.20I r16 = r2.A00(r0)
            java.lang.String r0 = r16.A07()
            if (r0 == 0) goto L_0x03f5
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r0)
            X.0zK r15 = r5.A0u
            java.lang.String r0 = r16.A09()
            java.util.List r0 = X.C39501sa.A01(r0)
            r15.A02(r5, r11, r0)
            X.29w r0 = r5.A0o
            r0.A00(r11, r4)
            r0 = 2
            if (r1 != r0) goto L_0x03f5
            r5.A3G()
        L_0x03f5:
            r5.A1G = r14
            X.29P r0 = r5.A0l
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x040a
            X.0pd r1 = r5.A0C
            r0 = 2855(0xb27, float:4.001E-42)
            boolean r1 = r1.A0E(r12, r0)
            r0 = 1
            if (r1 != 0) goto L_0x040b
        L_0x040a:
            r0 = 0
        L_0x040b:
            r5.A1I = r0
            r0 = 2131362583(0x7f0a0317, float:1.834495E38)
            android.view.View r14 = X.C004601z.A0E(r13, r0)
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r14 = (com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView) r14
            X.0rt r15 = r5.A0X
            X.0um r11 = r5.A0B
            X.01V r1 = r5.A08
            X.0u3 r0 = r5.A0z
            X.2X6 r37 = new X.2X6
            r38 = r1
            r39 = r15
            r40 = r11
            r41 = r14
            r42 = r0
            r37.<init>(r38, r39, r40, r41, r42)
            X.2Sl r11 = r5.A0B
            r0 = 2131364534(0x7f0a0ab6, float:1.8348908E38)
            android.view.View r1 = X.C004601z.A0E(r13, r0)
            com.obwhatsapp.mediacomposer.bottombar.recipients.RecipientsView r1 = (com.obwhatsapp.mediacomposer.bottombar.recipients.RecipientsView) r1
            boolean r0 = r5.A1G
            X.38s r0 = r11.A00(r1, r0)
            r5.A0q = r0
            r0 = 2131363697(0x7f0a0771, float:1.834721E38)
            android.view.View r0 = X.C004601z.A0E(r13, r0)
            com.obwhatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView r0 = (com.obwhatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView) r0
            X.4IF r15 = new X.4IF
            r15.<init>(r0)
            r0 = 2131366625(0x7f0a12e1, float:1.8353149E38)
            android.view.View r0 = X.C004601z.A0E(r13, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            com.obwhatsapp.gallerypicker.PhotoViewPager r1 = r5.A0f
            r28 = r1
            X.0um r1 = r5.A0B
            r24 = r1
            X.1A9 r1 = r5.A15
            r33 = r1
            X.0vv r1 = r5.A0i
            r29 = r1
            X.2S8 r1 = r5.A0m
            r31 = r1
            X.2OM r1 = r5.A0e
            r27 = r1
            X.013 r1 = r5.A0U
            r22 = r1
            X.29P r1 = r5.A0l
            r30 = r1
            java.util.HashSet r1 = r5.A1X
            r34 = r1
            X.1Cv r1 = r5.A0I
            X.1kk r21 = r1.A00()
            X.1MF r1 = r5.A14
            r20 = r1
            X.1Md r1 = r5.A0a
            r19 = r1
            X.0pd r1 = r5.A0C
            r16 = r1
            boolean r14 = r5.A1G
            boolean r1 = r5.A1I
            X.29n r11 = new X.29n
            r23 = r19
            r25 = r16
            r26 = r2
            r32 = r20
            r35 = r14
            r36 = r1
            r19 = r11
            r20 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.29y r0 = r11.A02
            r0.A00 = r4
            r0.A01()
            r0 = 2131366071(0x7f0a10b7, float:1.8352025E38)
            android.view.View r14 = X.C004601z.A0E(r13, r0)
            com.obwhatsapp.WaImageButton r14 = (com.obwhatsapp.WaImageButton) r14
            X.013 r1 = r5.A0U
            X.4UK r0 = new X.4UK
            r0.<init>(r14, r1)
            X.29P r1 = r5.A0l
            r19 = r1
            X.38s r1 = r5.A0q
            r16 = r1
            boolean r14 = r5.A1G
            X.29w r1 = new X.29w
            r35 = r19
            r36 = r13
            r38 = r15
            r39 = r16
            r40 = r0
            r41 = r11
            r42 = r14
            r34 = r1
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42)
            r5.A0o = r1
            X.0tZ r0 = r5.A38()
            r15 = 0
            if (r0 != 0) goto L_0x04e6
            r15 = 1
        L_0x04e6:
            r1.A00 = r5
            r1.A01 = r5
            X.2X6 r0 = r1.A04
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r14 = r0.A04
            r14.setCaptionButtonsListener(r1)
            com.obwhatsapp.mentions.MentionableEntry r13 = r14.A0B
            r11 = 48
            com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1 r0 = new com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1
            r0.<init>(r14, r11, r1)
            r13.setOnClickListener(r0)
            X.29n r0 = r1.A08
            r0.A03 = r1
            r0.A04 = r5
            X.4UK r14 = r1.A07
            com.obwhatsapp.WaImageButton r13 = r14.A01
            r11 = 49
            com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1 r0 = new com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1
            r0.<init>(r14, r11, r1)
            com.obwhatsapp.yo.HomeUI.sendStatusShowConfirmation(r5, r13, r0)
            com.obwhatsapp.mediacomposer.bottombar.BottomBarView r13 = r1.A03
            r11 = 21
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r0.<init>(r5, r11, r1)
            r13.setAddStandaloneButtonClick(r0)
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x052a
            if (r15 == 0) goto L_0x052a
            X.38s r0 = r1.A06
            com.obwhatsapp.mediacomposer.bottombar.recipients.RecipientsView r0 = r0.A03
            r0.setRecipientsListener(r1)
        L_0x052a:
            X.0tZ r0 = r5.A38()
            if (r0 == 0) goto L_0x053d
            X.29w r0 = r5.A0o
            X.38s r0 = r0.A06
            com.obwhatsapp.mediacomposer.bottombar.recipients.RecipientsView r1 = r0.A03
            r1.A04 = r8
            r0 = 2131099737(0x7f060059, float:1.7811836E38)
            r1.A00 = r0
        L_0x053d:
            r5.A3H()
            android.content.Intent r11 = r5.getIntent()
            int r1 = r5.A01
            java.lang.String r0 = "max_items"
            int r13 = r11.getIntExtra(r0, r1)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "skip_max_items_new_limit"
            boolean r0 = r1.getBooleanExtra(r0, r8)
            if (r0 != 0) goto L_0x057d
            if (r13 != 0) goto L_0x057f
            boolean r0 = r5.A1J
            if (r0 != 0) goto L_0x06ea
            X.0pd r1 = r5.A0C
            r0 = 2693(0xa85, float:3.774E-42)
            int r11 = r1.A03(r12, r0)
            X.0pd r1 = r5.A0C
            r0 = 2614(0xa36, float:3.663E-42)
            int r0 = r1.A03(r12, r0)
            int r11 = r11 - r0
            int r13 = r13 + r11
            X.0pd r1 = r5.A0C
            r0 = 2693(0xa85, float:3.774E-42)
            int r0 = r1.A03(r12, r0)
            r5.A01 = r0
            r5.A1J = r4
        L_0x057d:
            if (r13 == 0) goto L_0x06ea
        L_0x057f:
            r1 = 1
        L_0x0580:
            r5.A1C = r1
            X.29w r0 = r5.A0o
            X.2X6 r0 = r0.A04
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r0 = r0.A04
            r0.setAddButtonActivated(r1)
            android.content.Intent r12 = r5.getIntent()
            java.lang.String r11 = "quoted_message_row_id"
            r0 = 0
            long r12 = r12.getLongExtra(r11, r0)
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x05a1
            boolean r0 = r5.A3O()
            if (r0 == 0) goto L_0x05b3
        L_0x05a1:
            X.29w r0 = r5.A0o
            X.2X6 r0 = r0.A04
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r11 = r0.A04
            com.obwhatsapp.WaImageButton r1 = r11.A09
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r0 = r11.A04
            r0.setVisibility(r8)
        L_0x05b3:
            X.29w r1 = r5.A0o
            X.29P r0 = r5.A0l
            boolean r0 = r0.A08()
            r1.A04(r0)
            r1 = 35
            r0 = r18
            if (r0 != r1) goto L_0x05d5
            X.29w r0 = r5.A0o
            X.2X6 r0 = r0.A04
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r1 = r0.A04
            r0 = 4
            r1.setVisibility(r0)
            X.29w r0 = r5.A0o
            com.obwhatsapp.mediacomposer.bottombar.BottomBarView r0 = r0.A03
            r0.setAddStandaloneButtonVisibility(r8)
        L_0x05d5:
            com.obwhatsapp.gallerypicker.PhotoViewPager r1 = r5.A0f
            X.3DX r0 = new X.3DX
            r0.<init>(r5)
            X.C004601z.A0k(r1, r0)
            android.net.Uri r12 = r5.A9w()
            if (r17 == 0) goto L_0x064b
            if (r12 == 0) goto L_0x064b
            X.1Cv r0 = r5.A0I
            X.1kk r11 = r0.A02()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r0 = "-media_view"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object r0 = r11.A00(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r5.A04 = r0
            if (r0 != 0) goto L_0x0629
            X.1Cv r0 = r5.A0I
            X.1kk r11 = r0.A02()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r0 = "-gallery_thumb"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object r0 = r11.A00(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r5.A04 = r0
            if (r0 == 0) goto L_0x064b
        L_0x0629:
            java.lang.String r0 = r12.toString()
            X.C004601z.A0n(r10, r0)
            android.graphics.Bitmap r0 = r5.A04
            r10.setImageBitmap(r0)
            if (r44 != 0) goto L_0x063c
            android.view.View r0 = r5.A06
            r0.setVisibility(r8)
        L_0x063c:
            r5.A0b()
            r0 = 27
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r7 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r7.<init>(r5, r0, r6)
            r0 = 2000(0x7d0, double:9.88E-321)
            r9.postDelayed(r7, r0)
        L_0x064b:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "scan_for_qr"
            boolean r0 = r1.getBooleanExtra(r0, r8)
            r5.A1M = r0
            X.29w r7 = r5.A0o
            X.29P r0 = r5.A0l
            boolean r6 = r0.A08()
            com.obwhatsapp.mediacomposer.bottombar.BottomBarView r1 = r7.A03
            r0 = 4
            r1.setVisibility(r0)
            X.29n r0 = r7.A08
            r1 = 8
            if (r6 == 0) goto L_0x066d
            r1 = 4
        L_0x066d:
            androidx.recyclerview.widget.RecyclerView r0 = r0.A06
            r0.setVisibility(r1)
            r0 = 2131365554(0x7f0a0eb2, float:1.8350977E38)
            android.view.View r0 = r5.findViewById(r0)
            r0.setVisibility(r8)
            X.0sq r9 = r5.A05
            X.0pd r7 = r5.A0C
            X.1A9 r6 = r5.A15
            X.0vv r1 = r5.A0i
            X.0u3 r0 = r5.A0z
            X.01V r11 = r5.A08
            X.4OF r10 = new X.4OF
            r12 = r7
            r13 = r2
            r14 = r1
            r15 = r0
            r16 = r6
            r17 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.util.List r7 = r5.A39()
            X.1cy r6 = new X.1cy
            r6.<init>()
            X.0sq r2 = r10.A06
            r1 = 32
            com.facebook.redex.RunnableRunnableShape3S0300000_I1 r0 = new com.facebook.redex.RunnableRunnableShape3S0300000_I1
            r0.<init>(r10, r7, r6, r1)
            r2.Acl(r0)
            r5.A08 = r6
            r1 = 49
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0
            r0.<init>(r5, r1)
            r6.A0A(r5, r0)
            X.29P r0 = r5.A0l
            X.027 r0 = r0.A06
            r0.A01()
            r5.A3H()
            int r0 = r3.size()
            if (r0 > r4) goto L_0x06d4
            int r0 = r3.size()
            if (r0 != r4) goto L_0x06e2
            java.lang.Object r0 = r3.get(r8)
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x06e2
        L_0x06d4:
            X.1Sq r4 = r5.A0v
            X.0sq r2 = r4.A05
            r1 = 42
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
        L_0x06e2:
            android.view.View r1 = r5.A00
            X.0pt r0 = r5.A05
            r5.A20(r1, r0)
            return
        L_0x06ea:
            r1 = 0
            goto L_0x0580
        L_0x06ed:
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.MediaComposerActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        this.A1R.removeCallbacksAndMessages((Object) null);
        if (this.A0f != null) {
            for (int i2 = 0; i2 < this.A0f.getChildCount(); i2++) {
                View childAt = this.A0f.getChildAt(i2);
                if (childAt instanceof FrameLayout) {
                    int i3 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (i3 >= viewGroup.getChildCount()) {
                            break;
                        }
                        View childAt2 = viewGroup.getChildAt(i3);
                        if (childAt2 instanceof PhotoView) {
                            ((PhotoView) childAt2).A02();
                        }
                        i3++;
                    }
                }
            }
        }
        if (this.A02 == -1 || A3O()) {
            this.A0I.A02().A02.A05(-1);
        }
        this.A05.Acl(new RunnableRunnableShape8S0100000_I0_7(this.A0Q, 1));
        super.onDestroy();
        AnonymousClass37O r0 = this.A10;
        if (r0 != null) {
            r0.A06(true);
            this.A10 = null;
        }
        C456429w r02 = this.A0o;
        if (r02 != null) {
            C456629y r4 = r02.A08.A02;
            Set<C62823Fb> set = r4.A0H;
            for (C62823Fb r1 : set) {
                r4.A09.A01(r1);
                r1.A0C.set(true);
            }
            set.clear();
            this.A0o = null;
        }
        AnonymousClass2OM r03 = this.A0e;
        if (r03 != null) {
            r03.A00();
            this.A0e = null;
        }
        C26221Mu r12 = this.A0r;
        synchronized (r12) {
            r12.A04.clear();
        }
        this.A05.A0J(this.A1U);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A3D();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("uris", new ArrayList((Collection) this.A0l.A03.A01()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : A39()) {
            arrayList.add(this.A1W.get(obj));
        }
        bundle.putSerializable("ids", arrayList);
        bundle.putInt("position", A35());
        bundle.putInt("view_once", ((Number) this.A0l.A06.A01()).intValue());
        AnonymousClass29Q r0 = this.A1S;
        Bundle bundle2 = new Bundle();
        r0.A02(bundle2);
        bundle.putBundle("media_preview_params", bundle2);
        bundle.putBoolean("optimistic_started", this.A1L);
    }

    public void onStart() {
        super.onStart();
        this.A1A = true;
        A3I(A35());
        if (this.A08.A01() == null && !this.A1N && this.A0n != null && this.A0T.A0B()) {
            ArrayList arrayList = new ArrayList();
            for (Uri uri : A39()) {
                File A042 = this.A1S.A00(uri).A04();
                if (A042 == null || !A042.exists()) {
                    arrayList.add(uri);
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                this.A05.A0H(this.A0U.A0J(new Object[]{Integer.valueOf(size)}, R.plurals.plurals009b, (long) size), 1);
                if (size == A39().size()) {
                    finish();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    A3J((Uri) it.next());
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.A1A = false;
        if (!this.A1N) {
            A3A();
        }
    }
}

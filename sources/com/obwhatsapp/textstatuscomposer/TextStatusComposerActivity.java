package com.obwhatsapp.textstatuscomposer;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass01V;
import X.AnonymousClass027;
import X.AnonymousClass028;
import X.AnonymousClass04o;
import X.AnonymousClass090;
import X.AnonymousClass0GD;
import X.AnonymousClass0GG;
import X.AnonymousClass0GT;
import X.AnonymousClass11G;
import X.AnonymousClass15P;
import X.AnonymousClass1BU;
import X.AnonymousClass1L1;
import X.AnonymousClass1MJ;
import X.AnonymousClass1MV;
import X.AnonymousClass1U3;
import X.AnonymousClass1ZR;
import X.AnonymousClass1w8;
import X.AnonymousClass21F;
import X.AnonymousClass2JY;
import X.AnonymousClass2Rf;
import X.AnonymousClass2b1;
import X.AnonymousClass391;
import X.AnonymousClass4QS;
import X.AnonymousClass5RN;
import X.C001500q;
import X.C006602z;
import X.C015807o;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16030sJ;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16620tM;
import X.C16740tZ;
import X.C16750ta;
import X.C16760tb;
import X.C16980tz;
import X.C17020u3;
import X.C17230uk;
import X.C17250um;
import X.C17270uo;
import X.C17970vw;
import X.C17980vx;
import X.C18020w1;
import X.C18220wL;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C206711d;
import X.C23061Ai;
import X.C23071Aj;
import X.C23081Ak;
import X.C23091Al;
import X.C23231Az;
import X.C25841Li;
import X.C25861Lk;
import X.C26151Mn;
import X.C27661Sq;
import X.C27701Su;
import X.C30581cc;
import X.C30771cv;
import X.C30931dC;
import X.C34771kq;
import X.C35541m6;
import X.C38701rH;
import X.C40531uH;
import X.C40651uT;
import X.C41481w0;
import X.C41521w4;
import X.C41541w6;
import X.C41551w9;
import X.C41561wA;
import X.C41571wB;
import X.C41591wD;
import X.C41601wE;
import X.C41641wJ;
import X.C41661wL;
import X.C41671wM;
import X.C41681wN;
import X.C42661yC;
import X.C43241zg;
import X.C45902Bo;
import X.C45922Bq;
import X.C47462Jb;
import X.C47562Jm;
import X.C47572Jn;
import X.C47622Js;
import X.C49132Rg;
import X.C50212Yk;
import X.C50882ac;
import X.C51092ax;
import X.C51102ay;
import X.C51112az;
import X.C51122b0;
import X.C62843Fd;
import X.C62853Fe;
import X.C88544ag;
import X.C93764jj;
import X.C94144kR;
import android.animation.LayoutTransition;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.OM7753.res.rescust;
import com.OM7753.res.resstts;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxAListenerShape211S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape243S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape93S0200000_1_I0;
import com.facebook.redex.IDxDListenerShape266S0100000_2_I0;
import com.facebook.redex.IDxEListenerShape200S0100000_2_I0;
import com.facebook.redex.IDxFactoryShape37S0300000_1_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextData;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.gifsearch.GifSearchContainer;
import com.obwhatsapp.status.playback.widget.StatusEditText;
import com.obwhatsapp.status.posting.FirstStatusConfirmationDialogFragment;
import com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape3S0100000_I0_3;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextStatusComposerActivity extends C14530pL implements AnonymousClass1U3, AnonymousClass1w8, C41551w9, C41561wA, C41541w6 {
    public static final int[] A0w = {R.string.str04af, R.string.str04ce, R.string.str04c7, R.string.str04c1, R.string.str0484, R.string.str0487, R.string.str049b, R.string.str04ba, R.string.str048e, R.string.str04b1, R.string.str049d, R.string.str0480, R.string.str04c6, R.string.str04ad, R.string.str04c2, R.string.str047e, R.string.str04ae, R.string.str04cd, R.string.str04b2, R.string.str049c, R.string.str04b9};
    public static final int[] A0x = {R.string.str0909, R.string.str090a, R.string.str0906, R.string.str0907, R.string.str0908};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public DisplayMetrics A06;
    public View A07;
    public ViewGroup A08;
    public ViewGroup A09;
    public ImageButton A0A;
    public ScrollView A0B;
    public TextView A0C;
    public AnonymousClass027 A0D;
    public C50882ac A0E;
    public C51092ax A0F;
    public C51102ay A0G;
    public C51112az A0H;
    public C16760tb A0I;
    public AnonymousClass1ZR A0J;
    public C17230uk A0K;
    public C41681wN A0L;
    public AnonymousClass1MJ A0M;
    public AnonymousClass11G A0N;
    public C206711d A0O;
    public C16490t9 A0P;
    public C26151Mn A0Q;
    public C47572Jn A0R;
    public C47562Jm A0S;
    public C25841Li A0T;
    public C25861Lk A0U;
    public C18220wL A0V;
    public C17020u3 A0W;
    public AnonymousClass1BU A0X;
    public C17980vx A0Y;
    public AnonymousClass1L1 A0Z;
    public StatusEditText A0a;
    public C41571wB A0b;
    public C41661wL A0c;
    public VoiceRecordingView A0d;
    public C41521w4 A0e;
    public WebPagePreviewView A0f;
    public AnonymousClass01D A0g;
    public String A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public final Handler A0p;
    public final View.OnClickListener A0q;
    public final AnonymousClass027 A0r;
    public final AnonymousClass5RN A0s;
    public final AnonymousClass4QS A0t;
    public final Runnable A0u;
    public final int[] A0v;
    public int fmTColor;

    public TextStatusComposerActivity() {
        this(0);
        this.A0u = new RunnableRunnableShape15S0100000_I0_14(this, 30);
        int[] iArr = C47622Js.A01;
        this.A00 = iArr[Math.abs(C47622Js.A00.nextInt()) % iArr.length];
        this.A02 = 0;
        this.A0p = new Handler(Looper.getMainLooper());
        this.A0r = new AnonymousClass027();
        this.A0D = new AnonymousClass027(0);
        this.A0s = new IDxCListenerShape203S0100000_2_I0(this, 12);
        this.A0t = new AnonymousClass4QS(this);
        this.A0q = new ViewOnClickCListenerShape13S0100000_I0_6(this, 25);
        this.A0v = new int[2];
    }

    public TextStatusComposerActivity(int i2) {
        this.A0i = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 105));
    }

    public static /* synthetic */ void A02(AnonymousClass1ZR r6, TextStatusComposerActivity textStatusComposerActivity) {
        if (r6 != null) {
            int intValue = ((Number) textStatusComposerActivity.A0D.A01()).intValue();
            textStatusComposerActivity.A0L.A06(r6);
            String str = r6.A0W;
            if (str.equals(textStatusComposerActivity.A0h) || !r6.A0F() || !TextUtils.equals(textStatusComposerActivity.A0L.A05, str)) {
                textStatusComposerActivity.A0J = null;
                textStatusComposerActivity.A36();
                return;
            }
            textStatusComposerActivity.A0J = r6;
            Log.i("textstatus/showlinkpreview");
            if (textStatusComposerActivity.A0f == null) {
                WebPagePreviewView webPagePreviewView = new WebPagePreviewView(textStatusComposerActivity);
                textStatusComposerActivity.A0f = webPagePreviewView;
                webPagePreviewView.setForeground((Drawable) null);
                textStatusComposerActivity.A0f.setImageContentBackgroundResource(0);
                textStatusComposerActivity.A09.addView(textStatusComposerActivity.A0f);
                C45902Bo.A08(textStatusComposerActivity.A0f.findViewById(R.id.title), textStatusComposerActivity.A01, 0, textStatusComposerActivity.getResources().getDimensionPixelSize(R.dimen.dimen07d4));
                textStatusComposerActivity.A0f.setImageProgressBarVisibility(false);
                View findViewById = textStatusComposerActivity.A0f.findViewById(R.id.cancel);
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new ViewOnClickCListenerShape3S0100000_I0_3(textStatusComposerActivity, 7));
                View findViewById2 = textStatusComposerActivity.A0f.findViewById(R.id.thumb);
                ViewOnClickCListenerShape0S0200000_I0 viewOnClickCListenerShape0S0200000_I0 = new ViewOnClickCListenerShape0S0200000_I0(findViewById2, 30, textStatusComposerActivity);
                findViewById2.setOnClickListener(viewOnClickCListenerShape0S0200000_I0);
                textStatusComposerActivity.A0f.findViewById(R.id.webPagePreviewImageLarge_thumb).setOnClickListener(viewOnClickCListenerShape0S0200000_I0);
            }
            textStatusComposerActivity.A0f.A08(r6, (List) null, false, textStatusComposerActivity.A0K.A0A());
            if (textStatusComposerActivity.A0a.getText() != null) {
                textStatusComposerActivity.A0f.A0L.addOnLayoutChangeListener(new C94144kR(textStatusComposerActivity, intValue));
            }
            if (textStatusComposerActivity.A09.getVisibility() != 0) {
                textStatusComposerActivity.A09.setVisibility(0);
                textStatusComposerActivity.A09.setAlpha(0.0f);
                textStatusComposerActivity.A09.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(textStatusComposerActivity, 31));
            }
        }
    }

    public void A1q() {
        if (!this.A0i) {
            this.A0i = true;
            C49132Rg r1 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r1.A1s;
            this.A05 = (C16320sq) r2.ARB.get();
            this.A0C = (C14710pd) r2.A05.get();
            this.A05 = (C14870pt) r2.AB3.get();
            this.A03 = (C16300so) r2.A5p.get();
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = (C17250um) r2.A7e.get();
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = (AnonymousClass01V) r2.AOi.get();
            this.A0D = (C19950zG) r2.AQV.get();
            this.A09 = (C15860rz) r2.AQh.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            this.A05 = (C16440t3) r2.AP2.get();
            this.A0B = (C23061Ai) r2.AC0.get();
            this.A01 = (C16040sK) r2.ADr.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r1.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A0T = (C25841Li) r2.AB1.get();
            this.A0P = (C16490t9) r2.AQz.get();
            this.A0N = (AnonymousClass11G) r2.ANN.get();
            this.A0I = (C16760tb) r2.APV.get();
            this.A0O = (C206711d) r2.AKp.get();
            this.A0V = (C18220wL) r2.AEB.get();
            this.A0U = (C25861Lk) r2.AJq.get();
            this.A0K = (C17230uk) r2.A4I.get();
            this.A0Z = (AnonymousClass1L1) r2.ANR.get();
            this.A0M = (AnonymousClass1MJ) r2.A69.get();
            this.A0Y = C16150sX.A17(r2);
            this.A0X = (AnonymousClass1BU) r2.ANA.get();
            this.A0W = (C17020u3) r2.AMG.get();
            this.A0Q = r1.A0L();
            this.A0E = (C50882ac) r1.A1o.get();
            this.A0g = C17270uo.A00(r2.A5z);
            this.A0F = (C51092ax) r1.A1J.get();
            this.A0G = (C51102ay) r1.A1L.get();
            this.A0H = (C51112az) r1.A1O.get();
        }
    }

    public final void A35() {
        if (C23061Ai.A00(this.A0a)) {
            this.A0B.A01(this.A0a);
        }
    }

    public final void A36() {
        if (this.A09.getVisibility() == 0) {
            this.A09.animate().translationY((float) this.A09.getHeight()).alpha(0.0f).setDuration((long) 200).setListener(new C41671wM(this, 8));
        }
    }

    public final void A37() {
        if (this.A0d != null && this.A0e != null) {
            C015807o.A01((ViewGroup) this.A00);
            VoiceRecordingView voiceRecordingView = this.A0d;
            StatusEditText statusEditText = this.A0a;
            AnonymousClass0GD r2 = new AnonymousClass0GD();
            r2.A03 = true;
            AnonymousClass0GT r0 = new AnonymousClass0GT(3);
            r0.A06(statusEditText);
            r0.A06(voiceRecordingView);
            r0.A02 = 0;
            r2.A0a(r0);
            AnonymousClass0GG r02 = new AnonymousClass0GG();
            r02.A06(voiceRecordingView);
            r02.A02 = 0;
            r2.A0a(r02);
            r2.A0Y(new DecelerateInterpolator());
            r2.A0X(300);
            C015807o.A02((ViewGroup) this.A00, r2);
            C015807o.A01(this.A08);
            ViewGroup viewGroup = this.A08;
            ImageButton imageButton = this.A0A;
            TextView textView = this.A0C;
            AnonymousClass0GT r22 = new AnonymousClass0GT(1);
            r22.A06(imageButton);
            r22.A06(textView);
            r22.A02 = 0;
            r22.A04(300);
            r22.A05(new DecelerateInterpolator());
            C015807o.A02(viewGroup, r22);
            this.A0a.setVisibility(0);
            this.A0d.setScaleX(0.0f);
            this.A0d.setScaleY(0.0f);
            this.A0d.setVisibility(4);
            this.A0A.setVisibility(0);
            this.A0C.setVisibility(0);
        }
    }

    public final void A38() {
        int length;
        int i2 = this.A00;
        int[] iArr = C47622Js.A01;
        int i3 = 0;
        while (true) {
            length = iArr.length;
            if (i3 < length) {
                if (i2 == iArr[i3]) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        this.A00 = iArr[(i3 + 1) % length];
        A3C();
        A3E();
    }

    public final void A39() {
        C30771cv r3;
        C41571wB r1 = this.A0b;
        List<Jid> unmodifiableList = r1 != null ? Collections.unmodifiableList(r1.A09) : Collections.singletonList(C34771kq.A00);
        String trim = this.A0a.getText() != null ? this.A0a.getText().toString().trim() : "";
        if (!C45922Bq.A0B(this.A08, this.A0W, trim)) {
            this.A05.A09(R.string.str03a3, 1);
        } else if (unmodifiableList.size() == 0) {
            A3J(false);
        } else if (!this.A0N.A0G()) {
            Afc(new FirstStatusConfirmationDialogFragment());
        } else {
            C41571wB r4 = this.A0b;
            if (r4 != null) {
                C41591wD r32 = r4.A06;
                if (r32.A00 == C41601wE.SEND_TEXT) {
                    r32.A00();
                    ((CreationModeBottomBar) r4.A0L).A05.setEnabled(false);
                }
            }
            boolean A092 = C47622Js.A09(this.A0J, C47622Js.A01(trim));
            C16760tb r10 = this.A0I;
            C41681wN r12 = this.A0L;
            String A052 = C40651uT.A05(trim);
            int i2 = this.A00;
            int i3 = this.A02;
            AnonymousClass1ZR r11 = this.A0J;
            C35541m6 r13 = (C35541m6) this.A0r.A01();
            boolean z2 = this.A0j;
            C34771kq r19 = C34771kq.A00;
            boolean z3 = !unmodifiableList.equals(Collections.singletonList(r19));
            if (C16030sJ.A0S(unmodifiableList)) {
                TextData textData = new TextData();
                textData.backgroundColor = i2;
                textData.textColor = this.fmTColor;
                textData.fontStyle = i3;
                C30581cc A042 = r10.A1N.A04(r11, r19, (C16740tZ) null, r12 != null ? r12.A03 : null, C47622Js.A06(A052), (List) null, r10.A0Q.A00(), A092, r10.A0y.A0E(C16620tM.A02, 2567));
                r10.A0M(A042);
                A042.A14(textData);
                A042.A08 = 5;
                A042.A0K = r13;
                r10.A0O(A042);
                if (r12 == null || (r3 = r12.A03) == null || r3.A01() || r12.A00 != 3) {
                    r10.A0e.A0W(A042);
                    r10.A1T.A09(A042, "request", C18020w1.A02(r10.A0w, A042), 0, z2, z3);
                } else {
                    r10.A0O(A042);
                    r10.A0e.A0d(A042, 1);
                    r10.A1T.A09(A042, "request", C18020w1.A02(r10.A0w, A042), 0, z2, z3);
                    String str = r12.A05;
                    AnonymousClass21F r42 = r12.A02;
                    if (r42 != null && str.equals(r42.A02)) {
                        r42.A00 = A042;
                    }
                    r10.A03.A0L(new RunnableRunnableShape0S0300000_I0(r10, r12, A042, 10), 3000);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Jid jid : unmodifiableList) {
                if (!C16030sJ.A0Q(jid)) {
                    arrayList.add(jid);
                }
            }
            if (arrayList.size() > 0) {
                r10.A09(r11, (C41681wN) null, r13, (C40531uH) null, (C16740tZ) null, A052, arrayList, (List) null, false, false, false);
            }
            A3H(unmodifiableList);
        }
    }

    public final void A3A() {
        if (this.A0Y.A00()) {
            AnonymousClass1L1 r3 = this.A0Z;
            int i2 = this.A01;
            r3.A0B((byte) 0, Integer.valueOf(i2), AnonymousClass1L1.A02(i2));
        }
    }

    public final void A3B() {
        File file;
        C41521w4 r1 = this.A0e;
        if (r1 != null && this.A0d != null && (file = r1.A09) != null) {
            C41481w0 r0 = r1.A08;
            if (r0 != null) {
                r0.A02();
            }
            C41571wB r02 = this.A0b;
            List<C15830rv> unmodifiableList = r02 != null ? Collections.unmodifiableList(r02.A09) : Collections.singletonList(C34771kq.A00);
            if (unmodifiableList.size() == 0) {
                A3J(false);
            } else if (!this.A0N.A0G()) {
                Afc(new FirstStatusConfirmationDialogFragment());
            } else {
                C41571wB r3 = this.A0b;
                if (r3 != null) {
                    C41591wD r2 = r3.A06;
                    if (r2.A00 == C41601wE.SEND_VOICE) {
                        r2.A00();
                        ((CreationModeBottomBar) r3.A0L).A05.setEnabled(false);
                    }
                }
                C42661yC r32 = new C42661yC(this.A0e.A0C, this.A00);
                C16760tb r22 = this.A0I;
                C35541m6 r9 = (C35541m6) this.A0r.A01();
                boolean z2 = this.A0j;
                boolean z3 = !unmodifiableList.equals(Collections.singletonList(C34771kq.A00));
                C16750ta r14 = new C16750ta();
                r14.A0F = file;
                int A032 = C17970vw.A03(file);
                ArrayList arrayList = new ArrayList();
                for (C15830rv r15 : unmodifiableList) {
                    C38701rH A022 = r22.A1N.A02(r14, r15, (C16740tZ) null, file.getName(), r22.A0Q.A00(), file.length());
                    A022.A00 = A032;
                    A022.A19(r32);
                    if (C16030sJ.A0Q(r15)) {
                        A022.A0K = r9;
                    }
                    arrayList.add(A022);
                }
                r22.A07(new C43241zg(arrayList), (byte[]) null, z2, z3);
                A3H(unmodifiableList);
            }
        }
    }

    public final void A3C() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{(this.A00 & ViewCompat.MEASURED_SIZE_MASK) | -436207616, 0});
        gradientDrawable.setCornerRadius(0.0f);
        ViewGroup viewGroup = this.A08;
        if (viewGroup != null) {
            viewGroup.setBackground(gradientDrawable);
        }
    }

    public final void A3D() {
        View view = this.A07;
        if (view != null) {
            view.setVisibility(0);
            this.A07.setAlpha(0.0f);
            this.A07.animate().alpha(1.0f).setDuration(320).start();
            C14870pt r0 = this.A05;
            Runnable runnable = this.A0u;
            r0.A0J(runnable);
            this.A05.A0L(runnable, 3500);
        }
    }

    public final void A3E() {
        getWindow().setBackgroundDrawable(new ColorDrawable(this.A00));
        A3C();
        VoiceRecordingView voiceRecordingView = this.A0d;
        if (voiceRecordingView != null) {
            voiceRecordingView.setBackgroundTint(AnonymousClass090.A03(0.2f, this.A00, -16777216));
        }
    }

    public final void A3F() {
        DisplayMetrics displayMetrics = this.A06;
        float f2 = ((float) displayMetrics.widthPixels) / displayMetrics.density;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A09.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A0a.getLayoutParams();
        int i2 = f2 > 360.0f ? this.A03 : this.A04;
        int i3 = this.A05;
        marginLayoutParams.setMargins(i2, i3, i2, i3);
        marginLayoutParams2.setMargins(i2, this.A05, i2, 0);
        this.A09.requestLayout();
        this.A0a.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0196, code lost:
        if (r0.A00 > 0) goto L_0x0198;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3G(int r10) {
        /*
            r9 = this;
            X.1ZR r0 = r9.A0J
            if (r0 == 0) goto L_0x01b1
            android.graphics.Bitmap r4 = r0.A03()
            X.1ZR r0 = r9.A0J
            if (r0 == 0) goto L_0x014c
            android.graphics.Bitmap r3 = r0.A03()
            if (r3 == 0) goto L_0x014c
            X.1ZR r0 = r9.A0J
            boolean r0 = X.C47622Js.A09(r0, r10)
            if (r0 == 0) goto L_0x014c
            android.util.DisplayMetrics r2 = r9.A06
            int r0 = r2.heightPixels
            float r1 = (float) r0
            float r0 = r2.density
            float r1 = r1 / r0
            r0 = 1142947840(0x44200000, float:640.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x014c
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131167120(0x7f070790, float:1.7948505E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.widget.ScrollView r0 = r9.A0B
            int r1 = r0.getHeight()
            com.obwhatsapp.status.playback.widget.StatusEditText r0 = r9.A0a
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0f
            android.widget.LinearLayout r0 = r0.A0E
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            if (r1 < r2) goto L_0x014c
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131167121(0x7f070791, float:1.7948507E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            android.util.DisplayMetrics r0 = r9.A06
            float r0 = r0.density
            float r1 = r1 / r0
            int r1 = (int) r1
            int r0 = r3.getWidth()
            if (r0 < r1) goto L_0x014c
            if (r4 == 0) goto L_0x014c
            X.1wN r2 = r9.A0L
            X.1ZR r0 = r2.A01
            if (r0 == 0) goto L_0x00a8
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r0.A0W
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00a8
            X.1ZR r0 = r2.A01
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x00a8
            X.1wN r2 = r9.A0L
            int r1 = r2.A00
            r0 = 1
            if (r1 != r0) goto L_0x00a8
            X.1ZR r1 = r2.A01
            if (r1 == 0) goto L_0x00a8
            byte[] r0 = r1.A0U
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r1 instanceof X.C70653hS
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r9.A0l
            if (r0 == 0) goto L_0x00a8
            X.0sq r2 = r9.A05
            r1 = 31
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r0.<init>(r9, r1)
            r2.Acl(r0)
        L_0x00a8:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131167121(0x7f070791, float:1.7948507E38)
            int r6 = r1.getDimensionPixelSize(r0)
            com.obwhatsapp.webpagepreview.WebPagePreviewView r1 = r9.A0f
            r0 = 2131362567(0x7f0a0307, float:1.8344918E38)
            android.view.View r3 = r1.findViewById(r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0f
            r0.A00()
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0f
            android.widget.LinearLayout r0 = r0.A0E
            int r7 = r0.getHeight()
            r1 = 1068708659(0x3fb33333, float:1.4)
            int r0 = r4.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r8 = (int) r0
            int r5 = r4.getHeight()
            int r5 = r5 * r6
            int r0 = r4.getWidth()
            int r5 = r5 / r0
            android.widget.ScrollView r0 = r9.A0B
            int r1 = r0.getHeight()
            com.obwhatsapp.status.playback.widget.StatusEditText r0 = r9.A0a
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            int r1 = r1 - r7
            int r0 = java.lang.Math.min(r5, r1)
            int r1 = java.lang.Math.min(r8, r0)
            int r7 = r7 + r1
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0f
            r0.A05(r6, r1)
            android.view.ViewGroup r0 = r9.A09
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r1.width = r6
            r1.height = r7
            android.view.ViewGroup r0 = r9.A09
            r0.setLayoutParams(r1)
            r0 = 1
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r4, r6, r5, r0)     // Catch:{ OutOfMemoryError -> 0x011b }
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0f     // Catch:{ OutOfMemoryError -> 0x011b }
            r0.setImageLargeThumbWithBitmap(r1)     // Catch:{ OutOfMemoryError -> 0x011b }
            goto L_0x0120
        L_0x011b:
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0f
            r0.setImageLargeThumbWithBitmap(r4)
        L_0x0120:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131101963(0x7f06090b, float:1.781635E38)
            int r0 = r1.getColor(r0)
            r3.setColorFilter(r0)
            r0 = 2131232481(0x7f0806e1, float:1.8081072E38)
            r3.setBackgroundResource(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131167122(0x7f070792, float:1.7948509E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            r2.setMargins(r0, r1, r1, r0)
            r3.setLayoutParams(r2)
            android.view.ViewGroup r0 = r9.A09
            r0.requestLayout()
            return
        L_0x014c:
            com.obwhatsapp.webpagepreview.WebPagePreviewView r1 = r9.A0f
            r0 = 2131362567(0x7f0a0307, float:1.8344918E38)
            android.view.View r4 = r1.findViewById(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            int r6 = android.os.Build.VERSION.SDK_INT
            r5 = 1
            android.content.res.Resources$Theme r2 = r9.getTheme()
            r1 = 21
            r0 = 16843534(0x101030e, float:2.369575E-38)
            if (r6 < r1) goto L_0x0173
            r0 = 16843868(0x101045c, float:2.3696686E-38)
        L_0x0173:
            r2.resolveAttribute(r0, r7, r5)
            r4.clearColorFilter()
            int r0 = r7.resourceId
            r4.setBackgroundResource(r0)
            r2 = 0
            r3.setMargins(r2, r2, r2, r2)
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0f
            r0.A02()
            X.1ZR r1 = r9.A0J
            if (r1 == 0) goto L_0x01a6
            byte[] r0 = r1.A0T
            if (r0 == 0) goto L_0x0190
            r2 = 1
        L_0x0190:
            X.2k5 r0 = r1.A09
            if (r0 == 0) goto L_0x01a6
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x01a6
        L_0x0198:
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0f
            r0.setImageThumbVisibility(r5)
            r4.setLayoutParams(r3)
            android.view.ViewGroup r0 = r9.A09
            X.C47622Js.A07(r9, r0)
            return
        L_0x01a6:
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0f
            com.obwhatsapp.components.button.ThumbnailButton r1 = r0.A0N
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r0)
            r5 = r2
            goto L_0x0198
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity.A3G(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        r1 = X.C14750ph.A03(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        if (r3 != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r3 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r5.size() != 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r1 = new X.C14750ph().A0x(r4, (X.C15830rv) r5.get(0));
        X.AnonymousClass22U.A00(r1, "TextStatusComposerActivity:sendEntry");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        startActivity(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3H(java.util.List r5) {
        /*
            r4 = this;
            android.view.Window r1 = r4.getWindow()
            r0 = 3
            r1.setSoftInputMode(r0)
            r4.A35()
            boolean r3 = X.C16030sJ.A0S(r5)
            int r0 = r5.size()
            r2 = 0
            r1 = 1
            if (r0 != r1) goto L_0x001d
            if (r3 == 0) goto L_0x001f
        L_0x0019:
            r4.finish()
            return
        L_0x001d:
            if (r3 != 0) goto L_0x003d
        L_0x001f:
            int r0 = r5.size()
            if (r0 != r1) goto L_0x003d
            X.0ph r1 = new X.0ph
            r1.<init>()
            java.lang.Object r0 = r5.get(r2)
            X.0rv r0 = (X.C15830rv) r0
            android.content.Intent r1 = r1.A0x(r4, r0)
            java.lang.String r0 = "TextStatusComposerActivity:sendEntry"
            X.AnonymousClass22U.A00(r1, r0)
        L_0x0039:
            r4.startActivity(r1)
            goto L_0x0019
        L_0x003d:
            android.content.Intent r1 = X.C14750ph.A03(r4)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity.A3H(java.util.List):void");
    }

    public final void A3I(boolean z2) {
        int i2;
        C41481w0 r0;
        if (this.A0a.getText() == null || this.A0a.getText().length() <= 0) {
            C41521w4 r1 = this.A0e;
            if (r1 == null || this.A0d == null || r1.A09 == null) {
                super.onBackPressed();
                return;
            }
            i2 = 2;
        } else {
            i2 = 1;
        }
        Afb(DiscardWarningDialogFragment.A01(i2, z2), (String) null);
        C41521w4 r12 = this.A0e;
        if (r12 != null && this.A0d != null && (r0 = r12.A08) != null) {
            r0.A01();
        }
    }

    public final void A3J(boolean z2) {
        AnonymousClass391 r2 = new AnonymousClass391(this);
        r2.A0D = true;
        r2.A0F = true;
        C41571wB r0 = this.A0b;
        r2.A0T = r0 != null ? Collections.unmodifiableList(r0.A09) : Collections.singletonList(C34771kq.A00);
        Byte b2 = (byte) 0;
        r2.A0R = new ArrayList(Collections.singleton(Integer.valueOf(b2.intValue())));
        r2.A0G = Boolean.valueOf(z2);
        Intent A002 = r2.A00();
        this.A0X.A01(A002, (C35541m6) this.A0r.A01());
        startActivityForResult(A002, 2);
    }

    public final boolean A3K() {
        VoiceRecordingView voiceRecordingView = this.A0d;
        return voiceRecordingView == null || this.A0e == null || !this.A0m || voiceRecordingView.getVisibility() == 4 || this.A0d.getVisibility() == 8;
    }

    public void ARp() {
    }

    public void ARq() {
        this.A05.Acl(new RunnableRunnableShape15S0100000_I0_14(this, 32));
    }

    public void AVs(boolean z2) {
        this.A0j = true;
        A3J(z2);
    }

    public void AXh() {
        A3A();
        if (A3K()) {
            A39();
        } else {
            A3B();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A0S.A01()) {
            ViewGroup viewGroup = this.A08;
            int[] iArr = this.A0v;
            viewGroup.getLocationOnScreen(iArr);
            if (motionEvent.getRawY() >= ((float) iArr[1]) && motionEvent.getRawY() < ((float) (iArr[1] + this.A08.getHeight()))) {
                if (motionEvent.getAction() == 0) {
                    this.A0o = true;
                } else if (motionEvent.getAction() == 1 && this.A0o) {
                    this.A0S.A00(true);
                    this.A0o = false;
                    return false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 1) {
            if (i2 == 2) {
                if (this.A0k) {
                    AnonymousClass00B.A06(intent);
                    C35541m6 A002 = this.A0X.A00(intent.getExtras());
                    AnonymousClass027 r0 = this.A0r;
                    AnonymousClass00B.A06(A002);
                    r0.A0B(A002);
                }
                C41571wB r5 = this.A0b;
                if (r5 != null && r5.A0M) {
                    r5.A09 = C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"));
                    AnonymousClass028 r6 = r5.A0D;
                    boolean z2 = false;
                    if (r6.A01() != null) {
                        r5.A05.A00((C35541m6) r6.A01(), r5.A09, false);
                    }
                    int size = r5.A09.size();
                    int i4 = R.drawable.ic_done;
                    if (size > 0) {
                        z2 = true;
                        i4 = R.drawable.input_send;
                    }
                    r5.A03 = i4;
                    C16980tz r1 = r5.A0G;
                    int i5 = R.string.str072c;
                    if (z2) {
                        i5 = R.string.str14e6;
                    }
                    r5.A08 = r1.A02(i5);
                    r5.A06.A00();
                }
                if (i3 == -1) {
                    A3A();
                    if (A3K()) {
                        A39();
                    } else {
                        A3B();
                    }
                }
            }
        } else if (i3 == -1) {
            finish();
        }
    }

    public void onBackPressed() {
        if (!this.A0S.A02()) {
            A3I(true);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A06 = getResources().getDisplayMetrics();
        A3F();
        Number number = (Number) this.A0D.A01();
        if (this.A0a.getText() != null && number != null) {
            A3G(number.intValue());
        }
    }

    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setFlags(67108864, 67108864);
        }
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        C41681wN r0 = (C41681wN) new C006602z((AnonymousClass04o) new IDxFactoryShape37S0300000_1_I0(this.A0p, this.A0E, this, 0), (C001500q) this).A01(C41681wN.class);
        this.A0L = r0;
        r0.A0A.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 295));
        this.A0L.A0D.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 292));
        this.A0L.A0C.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 294));
        AnonymousClass027 r7 = this.A0D;
        r7.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 293));
        C14710pd r1 = this.A0C;
        C16620tM r2 = C16620tM.A01;
        boolean A0E2 = r1.A0E(r2, 815);
        this.A0k = A0E2;
        this.A0m = this.A0C.A0E(r2, 1874);
        this.A0l = this.A0C.A0E(C16620tM.A02, 2343);
        setContentView((int) R.layout.layout040a);
        VoiceRecordingView voiceRecordingView = (VoiceRecordingView) findViewById(R.id.voice_recording_view);
        this.A0d = voiceRecordingView;
        if (voiceRecordingView != null) {
            C50212Yk r12 = this.A0H.A00;
            C49132Rg r11 = r12.A01;
            C16150sX r13 = r12.A03;
            C41521w4 r112 = new C41521w4((C51122b0) r11.A1M.get(), (AnonymousClass2b1) r11.A1N.get(), this, (AnonymousClass01V) r13.AOi.get(), (AnonymousClass1L1) r13.ANR.get(), voiceRecordingView, (C23231Az) r13.A0r.get(), (C16320sq) r13.ARB.get());
            this.A0e = r112;
            r112.A06 = this;
        }
        this.A06 = getResources().getDisplayMetrics();
        this.A05 = getResources().getDimensionPixelSize(R.dimen.dimen078c);
        this.A04 = getResources().getDimensionPixelSize(R.dimen.dimen078b);
        this.A03 = getResources().getDimensionPixelSize(R.dimen.dimen078a);
        if (bundle == null) {
            A38();
        } else {
            this.A00 = bundle2.getInt("background_color");
            getWindow().setBackgroundDrawable(new ColorDrawable(this.A00));
        }
        View findViewById = findViewById(R.id.color_picker_btn);
        findViewById.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 26));
        findViewById.setOnLongClickListener(new rescust(this, this.A00));
        TextView textView = (TextView) findViewById(R.id.font_picker_btn);
        this.A0C = textView;
        textView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 27));
        this.A0C.setOnLongClickListener(new resstts(this, this.fmTColor));
        AnonymousClass027 r14 = this.A0r;
        r14.A0B(getIntent().getParcelableExtra("status_distribution"));
        if (r14.A01() == null) {
            r14.A0B(new C35541m6(this.A0N.A08(), this.A0N.A09(), this.A0N.A02(), false));
        }
        CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) AnonymousClass00T.A05(this, R.id.bottom_bar);
        C16150sX r132 = this.A0G.A00.A03;
        C41571wB r133 = new C41571wB(r14, this, (C16440t3) r132.AP2.get(), (C16980tz) r132.AQB.get(), (AnonymousClass013) r132.AR8.get(), (C14710pd) r132.A05.get(), (AnonymousClass1MV) r132.AKK.get(), (AnonymousClass1L1) r132.ANR.get(), creationModeBottomBar);
        this.A0b = r133;
        r133.A07 = this;
        if (A0E2) {
            creationModeBottomBar.setRecipientsListener(this);
        }
        this.A09 = (ViewGroup) findViewById(R.id.web_page_preview_container);
        this.A0a = (StatusEditText) AnonymousClass00T.A05(this, R.id.entry);
        View findViewById2 = findViewById(R.id.web_page_cardview_container);
        View.OnClickListener onClickListener = this.A0q;
        findViewById2.setOnClickListener(onClickListener);
        findViewById(R.id.close_keyboard_container).setOnClickListener(onClickListener);
        findViewById(R.id.back).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 24));
        this.A0B = (ScrollView) findViewById(R.id.scroll_container);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(2);
        layoutTransition.enableTransitionType(3);
        this.A09.setLayoutTransition(layoutTransition);
        A3F();
        C51092ax r15 = this.A0F;
        ViewGroup viewGroup = this.A09;
        StatusEditText statusEditText = this.A0a;
        AnonymousClass4QS r16 = this.A0t;
        C41681wN r18 = this.A0L;
        ScrollView scrollView = this.A0B;
        C41571wB r142 = this.A0b;
        C16150sX r02 = r15.A00.A03;
        C17980vx A17 = C16150sX.A17(r02);
        StatusEditText statusEditText2 = statusEditText;
        AnonymousClass4QS r28 = r16;
        C41571wB r29 = r142;
        AnonymousClass01V r19 = (AnonymousClass01V) r02.AOi.get();
        C17250um r20 = (C17250um) r02.A7e.get();
        C14710pd r21 = (C14710pd) r02.A05.get();
        C27661Sq r22 = (C27661Sq) r02.AAP.get();
        C17020u3 r23 = (C17020u3) r02.AMG.get();
        ViewGroup viewGroup2 = viewGroup;
        C41661wL r134 = new C41661wL(viewGroup2, scrollView, r7, (C23081Ak) r02.A3Z.get(), r18, r19, r20, r21, r22, r23, (C23091Al) r02.A3f.get(), A17, (AnonymousClass1L1) r02.ANR.get(), statusEditText2, r28, r29);
        this.A0c = r134;
        C41641wJ r17 = new C41641wJ(r134);
        r134.A02 = r17;
        StatusEditText statusEditText3 = r134.A0J;
        statusEditText3.addTextChangedListener(r17);
        statusEditText3.setFilters(new InputFilter[]{new C93764jj(r134)});
        if (this.A0Y.A00()) {
            Intent intent = getIntent();
            if (intent.hasExtra("entry_point")) {
                this.A01 = intent.getIntExtra("entry_point", 0);
            }
            if (!(bundle == null && this.A01 == 5)) {
                AnonymousClass1L1 r24 = this.A0Z;
                boolean z2 = false;
                if (this.A01 == 5) {
                    z2 = true;
                }
                r24.A0A(Boolean.valueOf(z2));
            }
            AnonymousClass1L1 r25 = this.A0Z;
            Integer valueOf = Integer.valueOf(this.A01);
            C27701Su r4 = r25.A0D;
            if (r4.A04.A00()) {
                C47462Jb A012 = r4.A01();
                Integer A002 = C27701Su.A00(valueOf);
                A012.A03 = 25;
                A012.A02 = A002;
                A012.A01 = 2;
                AnonymousClass2JY r03 = r4.A05;
                r03.A01 = A002;
                r03.A00 = 2;
                r4.A02.A05(A012);
            }
        }
        String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null || TextUtils.getTrimmedLength(stringExtra) == 0) {
            this.A0n = true;
        } else {
            this.A0n = false;
            String A013 = C30931dC.A01(stringExtra);
            StatusEditText statusEditText4 = this.A0a;
            if (!TextUtils.isEmpty(A013)) {
                StringBuilder sb = new StringBuilder();
                sb.append(stringExtra);
                sb.append(" ");
                stringExtra = sb.toString();
            }
            statusEditText4.setText(stringExtra);
            this.A0a.addOnLayoutChangeListener(new IDxCListenerShape243S0100000_2_I0(this, 4));
        }
        this.A0a.requestFocus();
        this.A0a.setOnEditorActionListener(new IDxAListenerShape211S0100000_2_I0(this, 6));
        C88544ag r26 = new C88544ag();
        this.A0a.A0D = new IDxCListenerShape93S0200000_1_I0(r26, 1, this);
        this.A08 = (ViewGroup) findViewById(R.id.controls);
        A3C();
        this.A0A = (ImageButton) AnonymousClass00T.A05(this, R.id.emoji_picker_btn);
        C26151Mn r5 = this.A0Q;
        r5.A00 = this;
        ImageButton imageButton = this.A0A;
        StatusEditText statusEditText5 = this.A0a;
        r5.A02 = (KeyboardPopupLayout) findViewById(R.id.main);
        r5.A01 = imageButton;
        r5.A03 = statusEditText5;
        AnonymousClass1MJ r110 = this.A0M;
        r5.A05 = r110.A00();
        r5.A06 = new C62853Fe(r110.A05, r110.A0B, r110.A0C);
        C47572Jn A003 = r5.A00();
        this.A0R = A003;
        A003.A0C(this.A0s);
        A003.setOnDismissListener(new IDxDListenerShape266S0100000_2_I0(this, 1));
        C25841Li r252 = this.A0T;
        C23061Ai r292 = this.A0B;
        C16490t9 r152 = this.A0P;
        AnonymousClass01V r143 = this.A08;
        C25861Lk r135 = this.A0U;
        C15860rz r10 = this.A09;
        C47572Jn r6 = this.A0R;
        C17250um r52 = this.A0B;
        C206711d r42 = this.A0O;
        C47562Jm r153 = new C47562Jm(this, r143, r10, this.A01, r42, r52, (EmojiSearchContainer) findViewById(R.id.emoji_search_container), r152, r6, r252, (GifSearchContainer) findViewById(R.id.gif_search_container), r135, this.A0W, r292);
        this.A0S = r153;
        r153.A00 = new IDxEListenerShape200S0100000_2_I0(this, 10);
        r153.A00 = new C62843Fd(this);
        this.A07 = findViewById(R.id.voice_status_tip);
        if (((SharedPreferences) this.A09.A01.get()).getBoolean("show_voice_status_tooltip", true)) {
            A3D();
            this.A09.A0K().putBoolean("show_voice_status_tooltip", false).apply();
            return;
        }
        View view = this.A07;
        if (view != null) {
            view.clearAnimation();
            this.A07.setVisibility(8);
        }
        this.A05.A0J(this.A0u);
    }

    public void onDestroy() {
        super.onDestroy();
        C47572Jn r0 = this.A0R;
        if (r0 != null) {
            r0.A0E();
        }
        C41661wL r2 = this.A0c;
        StatusEditText statusEditText = r2.A0J;
        statusEditText.removeTextChangedListener(r2.A02);
        statusEditText.setFilters(new InputFilter[0]);
        r2.A02 = null;
        this.A05.A0J(this.A0u);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!keyEvent.isPrintingKey() || !this.A0a.isShown() || this.A0a.hasFocus()) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.A0a.requestFocus();
        dispatchKeyEvent(keyEvent);
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if ((i2 != 82 && i2 != 4) || !this.A0R.isShowing()) {
            return super.onKeyUp(i2, keyEvent);
        }
        this.A0R.dismiss();
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("background_color", this.A00);
    }

    public void onStart() {
        super.onStart();
        if ((!this.A0m || getResources().getConfiguration().orientation != 2) && this.A0n) {
            Window window = getWindow();
            int i2 = 4;
            if (this.A0R.isShowing()) {
                i2 = 2;
            }
            window.setSoftInputMode(i2 | 1);
            if (!this.A0R.isShowing()) {
                this.A0a.A04(true);
            }
        }
    }
}

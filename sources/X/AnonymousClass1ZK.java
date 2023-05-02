package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioRecord;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape465S0100000_2_I0;
import com.facebook.redex.IDxDListenerShape57S0200000_2_I0;
import com.facebook.redex.IDxLAdapterShape0S0200000_2_I0;
import com.facebook.redex.IDxNCallbackShape315S0100000_2_I0;
import com.facebook.redex.IDxUCallbackShape350S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7;
import com.obwhatsapp.R;
import com.obwhatsapp.audioRecording.AudioRecordFactory;
import com.obwhatsapp.audioRecording.OpusRecorderFactory;
import com.obwhatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.util.ClippingLayout;
import com.whatsapp.util.Log;
import com.whatsapp.util.OpusRecorder;
import com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* renamed from: X.1ZK  reason: invalid class name */
public class AnonymousClass1ZK {
    public static int A1X;
    public static int A1Y;
    public static int A1Z;
    public static int A1a;
    public static int A1b;
    public static int A1c;
    public static SoundPool A1d;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public AnimatorSet A0E;
    public ObjectAnimator A0F;
    public PowerManager.WakeLock A0G;
    public C70653hS A0H;
    public AnonymousClass3BB A0I;
    public C15830rv A0J;
    public C43171zS A0K;
    public C16740tZ A0L;
    public C63913Lz A0M;
    public C30211bx A0N;
    public AnonymousClass2P3 A0O;
    public C30811cz A0P;
    public File A0Q;
    public File A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public final float A0X;
    public final Rect A0Y;
    public final Handler A0Z;
    public final Handler A0a;
    public final Handler A0b;
    public final View A0c;
    public final View A0d;
    public final View A0e;
    public final View A0f;
    public final ImageView A0g;
    public final TextView A0h;
    public final TextView A0i;
    public final C001000l A0j;
    public final AnonymousClass4X6 A0k;
    public final AnonymousClass44E A0l;
    public final AnonymousClass44E A0m;
    public final C16300so A0n;
    public final C14600pS A0o;
    public final C16180sb A0p;
    public final C14870pt A0q;
    public final C16760tb A0r;
    public final AudioRecordFactory A0s;
    public final OpusRecorderFactory A0t;
    public final C33461ic A0u;
    public final C210812s A0v;
    public final C19610yi A0w;
    public final AnonymousClass2ZO A0x;
    public final AnonymousClass01V A0y;
    public final C16440t3 A0z;
    public final C15860rz A10;
    public final AnonymousClass013 A11;
    public final AnonymousClass15N A12;
    public final C14710pd A13;
    public final C18210wK A14;
    public final AnonymousClass1HE A15;
    public final C17020u3 A16;
    public final C222617g A17;
    public final AnonymousClass1MV A18;
    public final C23231Az A19;
    public final AnonymousClass1M4 A1A;
    public final ClippingLayout A1B;
    public final ClippingLayout A1C;
    public final C16320sq A1D;
    public final C25981Lw A1E;
    public final C25961Lu A1F;
    public final AnonymousClass1ZL A1G;
    public final AnonymousClass2ZQ A1H;
    public final AnonymousClass1B2 A1I;
    public final C612838h A1J;
    public final C54262h6 A1K;
    public final C109495Sj A1L;
    public final C84934Ml A1M;
    public final C54242h4 A1N;
    public final C19270y9 A1O;
    public final AnonymousClass15A A1P;
    public final Runnable A1Q;
    public final Runnable A1R;
    public final Runnable A1S;
    public final Runnable A1T = new RunnableRunnableShape16S0100000_I0_15(this, 21);
    public final boolean A1U;
    public final boolean A1V;
    public final boolean A1W;

    public AnonymousClass1ZK(View view, C001000l r29, C16300so r30, C14600pS r31, C16180sb r32, C14870pt r33, C15900s5 r34, C16760tb r35, AudioRecordFactory audioRecordFactory, OpusRecorderFactory opusRecorderFactory, C210812s r38, C19610yi r39, AnonymousClass2ZO r40, AnonymousClass01V r41, C16440t3 r42, C15860rz r43, AnonymousClass013 r44, AnonymousClass15N r45, C14710pd r46, C18210wK r47, AnonymousClass1HE r48, C17020u3 r49, C222617g r50, AnonymousClass1MV r51, C23231Az r52, AnonymousClass1M4 r53, C16320sq r54, C25981Lw r55, C25961Lu r56, AnonymousClass1ZL r57, AnonymousClass1B0 r58, AnonymousClass2ZQ r59, AnonymousClass1B2 r60, C612838h r61, C109495Sj r62, AnonymousClass15A r63, boolean z2, boolean z3) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A0a = handler;
        this.A0l = new AnonymousClass44E(0.0d);
        AnonymousClass44E r8 = new AnonymousClass44E(Double.MIN_VALUE);
        this.A0m = r8;
        this.A0Y = new Rect();
        this.A08 = -1;
        IDxCObserverShape111S0100000_2_I0 iDxCObserverShape111S0100000_2_I0 = new IDxCObserverShape111S0100000_2_I0(this, 10);
        this.A1O = iDxCObserverShape111S0100000_2_I0;
        this.A0Z = new Handler(Looper.getMainLooper());
        this.A1Q = new AnonymousClass2P2(this);
        this.A0u = new C100154vB(this);
        C16440t3 r6 = r42;
        this.A0z = r6;
        C14710pd r2 = r46;
        this.A13 = r2;
        this.A0q = r33;
        this.A18 = r51;
        this.A0n = r30;
        this.A1D = r54;
        this.A0p = r32;
        this.A19 = r52;
        C16760tb r17 = r35;
        this.A0r = r17;
        this.A14 = r47;
        AnonymousClass15A r9 = r63;
        this.A1P = r9;
        this.A1F = r56;
        AnonymousClass01V r1 = r41;
        this.A0y = r1;
        AnonymousClass013 r3 = r44;
        this.A11 = r3;
        this.A17 = r50;
        this.A0s = audioRecordFactory;
        AnonymousClass1ZL r16 = r57;
        this.A1G = r16;
        this.A12 = r45;
        C15860rz r10 = r43;
        this.A10 = r10;
        this.A1I = r60;
        this.A0v = r38;
        this.A1E = r55;
        this.A15 = r48;
        this.A16 = r49;
        this.A0t = opusRecorderFactory;
        this.A0x = r40;
        this.A1J = r61;
        this.A1H = r59;
        this.A1U = z2;
        this.A1V = z3;
        this.A1A = r53;
        this.A0w = r39;
        C001000l r11 = r29;
        this.A0j = r11;
        C14600pS r26 = r31;
        this.A0o = r26;
        View view2 = view;
        this.A0f = view2;
        this.A1L = r62;
        this.A1W = r2.A0E(C16620tM.A02, 1139);
        this.A1M = new C84934Ml(view2, r3);
        ImageView imageView = (ImageView) view2.findViewById(R.id.voice_note_btn_slider);
        this.A0g = imageView;
        imageView.setImageResource(R.drawable.input_mic_white_large);
        imageView.setBackgroundResource(R.drawable.input_circle_large);
        imageView.setPadding(0, 0, 0, 0);
        PowerManager A0I2 = r1.A0I();
        if (A0I2 == null) {
            Log.w("voicenoterecordingui pm=null");
        } else {
            this.A0G = C43421zy.A00(A0I2, "voicenote", 6);
        }
        if (A1d == null) {
            SoundPool soundPool = new SoundPool(1, 1, 0);
            A1d = soundPool;
            A1c = soundPool.load(r11, R.raw.wa_ptt_start_record, 0);
            A1Z = A1d.load(r11, R.raw.wa_ptt_quick_cancel, 0);
            A1a = A1d.load(r11, R.raw.wa_ptt_sent, 0);
            A1b = A1d.load(r11, R.raw.wa_ptt_slide_to_cancel, 0);
            A1Y = A1d.load(r11, R.raw.wa_ptt_stop_record, 0);
            A1X = A1d.load(r11, R.raw.wa_ptt_quick_cancel, 0);
        }
        this.A1C = (ClippingLayout) view2.findViewById(R.id.voice_note_clipping_layout);
        this.A0h = (TextView) view2.findViewById(R.id.entry);
        TextView textView = (TextView) view2.findViewById(R.id.voice_note_slide_to_cancel);
        this.A0i = textView;
        View findViewById = view2.findViewById(R.id.input_layout);
        this.A0d = findViewById;
        this.A1B = (ClippingLayout) view2.findViewById(R.id.footer);
        this.A0c = findViewById.findViewById(R.id.entry);
        r2.A0C(746);
        if (!r3.A0T()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.voice_note_slide_to_cancel, 0, 0, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C447725m(AnonymousClass00T.A04(r11, R.drawable.voice_note_slide_to_cancel), r3), (Drawable) null);
        }
        View findViewById2 = view2.findViewById(R.id.voice_note_slide_to_cancel_scroller);
        findViewById2.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape57S0200000_2_I0(findViewById2, 5, this));
        ((ViewGroup) view2.findViewById(R.id.voice_recorder_decor)).addView(new C64123Mv(r11, this), -1, -1);
        AnonymousClass4X6 A012 = C88974bO.A00().A01();
        this.A0k = A012;
        A012.A03 = new AnonymousClass4Zg(440.0d, 21.0d);
        this.A0e = view2.findViewById(R.id.quoted_message_preview_container);
        this.A0X = ((float) ViewConfiguration.get(r11).getScaledTouchSlop()) * 1.5f;
        r9.A02(iDxCObserverShape111S0100000_2_I0);
        long A022 = ((long) r34.A02(C15910s6.A1f)) * FileUtils.ONE_MB;
        C30201bw r112 = new C30201bw(this);
        this.A1K = new C54262h6(r10, r58, r112);
        AnonymousClass3HO r15 = new AnonymousClass3HO(this);
        IDxUCallbackShape350S0100000_2_I0 iDxUCallbackShape350S0100000_2_I0 = new IDxUCallbackShape350S0100000_2_I0(this, 2);
        IDxNCallbackShape315S0100000_2_I0 iDxNCallbackShape315S0100000_2_I0 = new IDxNCallbackShape315S0100000_2_I0(this, 1);
        IDxNCallbackShape315S0100000_2_I0 iDxNCallbackShape315S0100000_2_I02 = new IDxNCallbackShape315S0100000_2_I0(this, 2);
        AnonymousClass44E r13 = r8;
        this.A0b = new C56472nh(r13, r17, r6, r16, iDxNCallbackShape315S0100000_2_I0, iDxNCallbackShape315S0100000_2_I02, new IDxNCallbackShape315S0100000_2_I0(this, 3), new IDxNCallbackShape315S0100000_2_I0(this, 0), r112, r15, iDxUCallbackShape350S0100000_2_I0, A022);
        IDxUCallbackShape350S0100000_2_I0 iDxUCallbackShape350S0100000_2_I02 = new IDxUCallbackShape350S0100000_2_I0(this, 1);
        IDxUCallbackShape350S0100000_2_I0 iDxUCallbackShape350S0100000_2_I03 = iDxUCallbackShape350S0100000_2_I02;
        this.A1S = new RunnableRunnableShape0S0400000_I0(iDxUCallbackShape350S0100000_2_I03, new IDxUCallbackShape350S0100000_2_I0(this, 0), r112, handler, 36);
        this.A1R = new RunnableRunnableShape2S0300000_I0_2(this, r6, r26, 24);
        this.A1N = new IDxCListenerShape465S0100000_2_I0(this, 1);
    }

    public static /* synthetic */ void A00(AnonymousClass1ZK r3) {
        C30211bx r2 = r3.A0N;
        if (r2 != null) {
            try {
                int i2 = r3.A08;
                if (i2 != -1) {
                    r2.A0A(i2);
                    if (r3.A0N.A0D()) {
                        r3.A0a.post(r3.A1S);
                        r3.A09();
                    }
                }
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder("Error resuming playback after seek ");
                sb.append(e2.getMessage());
                Log.e(sb.toString());
            }
        }
    }

    public static /* synthetic */ void A01(AnonymousClass1ZK r3, int i2, boolean z2) {
        C30211bx r0 = r3.A0N;
        if (r0 != null && z2) {
            r3.A08 = i2;
            if (i2 == 0 && !r0.A0D()) {
                i2 = r3.A0N.A03();
            }
            r3.A1G.A02((long) i2);
            if (!r3.A0N.A0D()) {
                r3.A0A();
            }
        }
    }

    public void A02() {
        A0R(false);
        A0T(false, false);
        this.A0a.removeCallbacks(this.A1S);
        if (this.A0N != null) {
            A04();
            this.A0N.A06();
            this.A0N = null;
        }
        this.A1P.A03(this.A1O);
    }

    public void A03() {
        if (A0V()) {
            C30811cz r2 = this.A0P;
            if (r2 == null) {
                Log.e("VoiceNoteRecordingUI/pauseRecording/voice recorder ir null");
                return;
            }
            try {
                OpusRecorder opusRecorder = r2.A06;
                opusRecorder.pause();
                r2.A01 = opusRecorder.getPageNumber();
                try {
                    this.A0P.A01();
                } catch (IOException e2) {
                    Log.e("VoiceNoteRecordingUI/pauseRecording/stop waveform creation failed", e2);
                }
                this.A1K.A03 = true;
                long elapsedRealtime = (SystemClock.elapsedRealtime() - this.A0B) + this.A0A;
                this.A0A = elapsedRealtime;
                if (elapsedRealtime < 1000) {
                    A0T(false, false);
                    return;
                }
                A1d.play(A1Y, 1.0f, 1.0f, 0, 0, 1.0f);
                C001000l r4 = this.A0j;
                AnonymousClass01V r3 = this.A0y;
                C812847o.A00(r4, r3);
                C63913Lz r0 = this.A0M;
                if (r0 != null) {
                    r0.A00();
                    this.A0M = null;
                }
                this.A19.A00();
                if (this.A1V) {
                }
                this.A0b.removeCallbacksAndMessages((Object) null);
                AnonymousClass1ZL r5 = this.A1G;
                r5.A0J.clear();
                C30811cz r02 = this.A0P;
                A0M(r02.A08, r02.A09, false, true);
                this.A12.A00 = false;
                AnonymousClass1B2 r1 = this.A1I;
                Log.i("voicenote/voicenotestopped");
                for (C54272h7 A052 : r1.A01()) {
                    A052.A05();
                }
                VoiceVisualizer voiceVisualizer = r5.A0F;
                voiceVisualizer.A0A = false;
                voiceVisualizer.A06 = 0;
                voiceVisualizer.A07 = 166;
                AnonymousClass2JP.A00(r4, r3, r4.getString(R.string.str1a5b));
            } catch (IOException e3) {
                Log.e("VoiceNoteRecordingUI/pauseRecording/pause failed", e3);
                try {
                    this.A0P.A01();
                } catch (IOException e4) {
                    Log.e("VoiceNoteRecordingUI/pauseRecording/stop waveform creation failed", e4);
                }
            } catch (Throwable th) {
                try {
                    this.A0P.A01();
                    throw th;
                } catch (IOException e5) {
                    Log.e("VoiceNoteRecordingUI/pauseRecording/stop waveform creation failed", e5);
                    throw th;
                }
            }
        }
    }

    public void A04() {
        C30211bx r0 = this.A0N;
        if (r0 != null && r0.A0D()) {
            this.A0N.A04();
        }
        A0A();
        this.A0a.removeCallbacks(this.A1S);
    }

    public void A05() {
        if (this.A18.A03(this.A0j, this.A0o, this.A0J)) {
            this.A0w.A04();
            this.A19.A01();
            if (this.A0P != null) {
                A08();
                return;
            }
            File file = this.A0Q;
            File file2 = this.A0R;
            IDxNCallbackShape315S0100000_2_I0 iDxNCallbackShape315S0100000_2_I0 = new IDxNCallbackShape315S0100000_2_I0(this, 4);
            if (file != null) {
                this.A1D.Acl(new RunnableRunnableShape0S0400000_I0(this, file, iDxNCallbackShape315S0100000_2_I0, file2, 37));
            }
        }
    }

    public void A06() {
        SharedPreferences.Editor A0K2;
        SharedPreferences sharedPreferences;
        String str;
        C54262h6 r6 = this.A1K;
        C15830rv r2 = r6.A06.A00.A0J;
        if (r2 != null) {
            if (C16030sJ.A0G(r2)) {
                C15860rz r1 = r6.A04;
                A0K2 = r1.A0K();
                sharedPreferences = (SharedPreferences) r1.A01.get();
                str = "ptt_record_broadcast";
            } else {
                boolean A0L2 = C16030sJ.A0L(r2);
                C15860rz r12 = r6.A04;
                A0K2 = r12.A0K();
                sharedPreferences = (SharedPreferences) r12.A01.get();
                str = A0L2 ? "ptt_record_group" : "ptt_record_individual";
            }
            A0K2.putLong(str, sharedPreferences.getLong(str, 0) + 1).apply();
        }
        r6.A03 = false;
        r6.A00 = 0;
        r6.A01 = 0;
        r6.A02 = 0;
        AnonymousClass1MV r22 = this.A18;
        C14600pS r9 = this.A0o;
        C001000l r7 = this.A0j;
        if (!r22.A03(r7, r9, this.A0J)) {
            return;
        }
        if (this.A0P != null) {
            Log.e("voicenote/startvoicenote/inprogress");
            return;
        }
        View view = this.A0c;
        view.clearFocus();
        view.setFocusable(false);
        this.A0w.A04();
        if (this.A1V) {
            AnonymousClass2ZQ.A00(r7);
        }
        PowerManager.WakeLock wakeLock = this.A0G;
        if (wakeLock != null) {
            wakeLock.acquire();
        }
        this.A19.A01();
        A0O(false);
        C812847o.A00(r7, this.A0y);
        float f2 = 1.0f;
        this.A09 = A1d.play(A1c, 1.0f, 1.0f, 0, 0, 1.0f);
        C84934Ml r8 = this.A1M;
        TextView textView = r8.A00;
        AnonymousClass013 r5 = r8.A03;
        textView.setText(C28961Zl.A04(r5, 0));
        textView.setVisibility(0);
        r8.A01.setText(C28961Zl.A04(r5, 0));
        this.A06 = 0;
        this.A07 = 0;
        AnonymousClass1ZL r82 = this.A1G;
        r82.A0J.clear();
        this.A04 = 0;
        AnonymousClass44E r11 = this.A0l;
        r11.A00.set(Double.doubleToRawLongBits(1.0d));
        View view2 = this.A0f;
        View findViewById = view2.findViewById(R.id.voice_note_pulse);
        findViewById.setVisibility(0);
        if (this.A0F == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "alpha", new float[]{0.0f, 1.0f});
            this.A0F = ofFloat;
            ofFloat.setInterpolator(new C91014fE(r11));
            this.A0F.setDuration(500);
            this.A0F.setRepeatMode(2);
            this.A0F.setRepeatCount(-1);
        }
        this.A0F.start();
        ImageView imageView = this.A0g;
        imageView.setVisibility(0);
        float width = ((float) imageView.getWidth()) / 5.5f;
        AnonymousClass013 r112 = this.A11;
        if (r112.A0T()) {
            width = -width;
        }
        imageView.setTranslationX(width);
        imageView.setTranslationY((float) (imageView.getHeight() / 4));
        imageView.setScaleX(0.5f);
        imageView.setScaleY(0.5f);
        imageView.requestFocus();
        AnonymousClass4X6 r13 = this.A0k;
        r13.A04.clear();
        r13.A03(new AnonymousClass3Tt(this, 0));
        r13.A02(1.0d);
        view2.findViewById(R.id.buttons).setVisibility(4);
        view2.findViewById(R.id.emoji_picker_btn).setVisibility(0);
        View findViewById2 = view2.findViewById(R.id.voice_cancel_trashcan);
        findViewById2.clearAnimation();
        findViewById2.setVisibility(8);
        View findViewById3 = view2.findViewById(R.id.voice_cancel_animation);
        findViewById3.clearAnimation();
        findViewById3.setVisibility(8);
        View findViewById4 = view2.findViewById(R.id.voice_cancel_trashcan_lid);
        findViewById4.clearAnimation();
        findViewById4.setVisibility(8);
        view2.findViewById(R.id.voice_note_slide_to_cancel_layout).setVisibility(0);
        View findViewById5 = view2.findViewById(R.id.voice_note_slide_to_cancel_animation);
        findViewById5.setVisibility(0);
        findViewById5.post(new RunnableRunnableShape11S0200000_I0_9(this, 29, findViewById5));
        View findViewById6 = view2.findViewById(R.id.voice_note_layout);
        findViewById6.setVisibility(0);
        findViewById6.setClickable(true);
        C004601z.A0d(findViewById6, 2);
        if (!(!r112.A0T())) {
            f2 = -1.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, f2, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(160);
        findViewById6.startAnimation(translateAnimation);
        View findViewById7 = view2.findViewById(R.id.input_layout_content);
        findViewById7.clearAnimation();
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(160);
        alphaAnimation.setFillBefore(true);
        alphaAnimation.setFillAfter(true);
        findViewById7.startAnimation(alphaAnimation);
        view2.findViewById(R.id.voice_recorder_decor).setVisibility(0);
        findViewById7.setFocusable(false);
        C004601z.A0d(findViewById7, 4);
        File A0N2 = this.A0p.A0N(C17970vw.A0H());
        C16440t3 r122 = this.A0z;
        C14710pd r10 = this.A13;
        this.A0P = new C30811cz(this.A0s, this.A0t, r122, r10, r82, A0N2.getAbsolutePath());
        this.A12.A00 = true;
        this.A0C = SystemClock.elapsedRealtime();
        this.A0B = SystemClock.elapsedRealtime();
        this.A0A = 0;
        try {
            this.A0P.A06.prepare();
        } catch (Exception unused) {
            AnonymousClass1MV.A00(this.A0P, 0, false);
            A0T(false, false);
            r9.Afg(R.string.str0862);
        }
        Runnable runnable = this.A1R;
        view2.removeCallbacks(runnable);
        view2.postDelayed(runnable, 160);
        this.A0V = false;
        this.A0S = false;
        if (this.A1U) {
            view2.findViewById(R.id.voice_note_lock_container).setVisibility(0);
            if (this.A0O == null) {
                ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.voice_note_lock_container);
                AnonymousClass2P3 r3 = new AnonymousClass2P3(r7);
                this.A0O = r3;
                r3.setVisibility(4);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                int i2 = 83;
                if (!r112.A0T()) {
                    i2 = 85;
                }
                layoutParams.gravity = i2;
                viewGroup.addView(this.A0O, layoutParams);
            }
            this.A0T = false;
            this.A0W = false;
            this.A0Z.post(this.A1Q);
            r82.A01(R.drawable.ic_pause_draft_preview);
        }
    }

    public final void A07() {
        View view = this.A0f;
        view.findViewById(R.id.voice_note_pulse).setVisibility(4);
        ObjectAnimator objectAnimator = this.A0F;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        int i2 = A1b;
        if (i2 != 0) {
            A1d.play(i2, 1.0f, 1.0f, 0, 0, 1.0f);
        }
        View findViewById = view.findViewById(R.id.voice_cancel_trashcan);
        findViewById.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(213);
        translateAnimation.setStartOffset(640);
        translateAnimation.setFillBefore(true);
        findViewById.startAnimation(translateAnimation);
        View findViewById2 = view.findViewById(R.id.voice_cancel_animation);
        findViewById2.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator(1.1f));
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -3.0f);
        translateAnimation2.setDuration(640);
        translateAnimation2.setRepeatMode(2);
        translateAnimation2.setRepeatCount(1);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(640);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.61f, 1.0f, 0.61f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(320);
        scaleAnimation.setStartOffset(960);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation2);
        View findViewById3 = view.findViewById(R.id.voice_cancel_trashcan_lid);
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, -0.3f, 1, 0.0f, 1, 0.0f);
        translateAnimation3.setDuration(160);
        translateAnimation3.setStartOffset(746);
        translateAnimation3.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, -60.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setDuration(160);
        rotateAnimation2.setStartOffset(746);
        rotateAnimation2.setFillAfter(true);
        animationSet2.addAnimation(rotateAnimation2);
        animationSet2.addAnimation(translateAnimation3);
        animationSet2.setFillAfter(true);
        findViewById3.setVisibility(0);
        findViewById3.startAnimation(animationSet2);
        View findViewById4 = view.findViewById(R.id.emoji_picker_btn);
        findViewById4.setVisibility(4);
        findViewById2.startAnimation(animationSet);
        animationSet.setAnimationListener(new C70363gX(findViewById2, findViewById, findViewById3, findViewById4, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
        com.whatsapp.util.Log.e("VoiceNoteRecordingUI/resumeRecording/resume failed", r1);
        A0T(false, false);
        r6.A0o.Afg(com.obwhatsapp.R.string.str0862);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r6 = this;
            X.1cz r0 = r6.A0P
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = "VoiceNoteRecordingUI/resumeVoiceNoteRecording/resume voice recorder is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000a:
            r5 = 1
            r6.A0W = r5
            X.1ZL r3 = r6.A1G
            java.io.File r4 = r0.A09
            X.0sq r2 = r3.A0I
            r1 = 27
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9
            r0.<init>(r3, r1, r4)
            r2.Acl(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A0B = r0
            X.1bx r0 = r6.A0N
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0032
            X.1bx r0 = r6.A0N
            r0.A09()
        L_0x0032:
            r4 = 0
            r6.A0D()     // Catch:{ IOException -> 0x009b }
            boolean r0 = r6.A1V     // Catch:{ IOException -> 0x009b }
            if (r0 == 0) goto L_0x003f
            X.00l r0 = r6.A0j     // Catch:{ IOException -> 0x009b }
            X.AnonymousClass2ZQ.A00(r0)     // Catch:{ IOException -> 0x009b }
        L_0x003f:
            X.15N r0 = r6.A12     // Catch:{ IOException -> 0x009b }
            r0.A00 = r5     // Catch:{ IOException -> 0x009b }
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation     // Catch:{ IOException -> 0x009b }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x009b }
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)     // Catch:{ IOException -> 0x009b }
            r1 = 26
            com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0 r0 = new com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0     // Catch:{ IOException -> 0x009b }
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x009b }
            r2.setAnimationListener(r0)     // Catch:{ IOException -> 0x009b }
            X.1j5 r0 = r3.A0H     // Catch:{ IOException -> 0x009b }
            android.view.View r0 = r0.A02()     // Catch:{ IOException -> 0x009b }
            r0.startAnimation(r2)     // Catch:{ IOException -> 0x009b }
            android.view.animation.Animation r0 = X.C812747n.A00()     // Catch:{ IOException -> 0x009b }
            r3.A03(r0, r4)     // Catch:{ IOException -> 0x009b }
            X.44E r3 = r6.A0m     // Catch:{ IOException -> 0x009b }
            X.1cz r2 = r6.A0P     // Catch:{ IOException -> 0x009b }
            java.lang.String r1 = "PushToTalkVoiceVisualizerHandler"
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch:{ IOException -> 0x009b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x009b }
            r0.start()     // Catch:{ IOException -> 0x009b }
            X.3Lz r1 = new X.3Lz     // Catch:{ IOException -> 0x009b }
            r1.<init>(r0, r3, r2)     // Catch:{ IOException -> 0x009b }
            r6.A0M = r1     // Catch:{ IOException -> 0x009b }
            monitor-enter(r1)     // Catch:{ IOException -> 0x009b }
            r1.sendEmptyMessage(r4)     // Catch:{ all -> 0x0098 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x009b }
            android.os.Handler r0 = r6.A0b     // Catch:{ IOException -> 0x009b }
            r0.sendEmptyMessage(r4)     // Catch:{ IOException -> 0x009b }
            X.00l r2 = r6.A0j     // Catch:{ IOException -> 0x009b }
            X.01V r1 = r6.A0y     // Catch:{ IOException -> 0x009b }
            r0 = 2131892829(0x7f121a5d, float:1.9420417E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ IOException -> 0x009b }
            X.AnonymousClass2JP.A00(r2, r1, r0)     // Catch:{ IOException -> 0x009b }
            return
        L_0x0098:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x009b }
            throw r0     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            r1 = move-exception
            java.lang.String r0 = "VoiceNoteRecordingUI/resumeRecording/resume failed"
            com.whatsapp.util.Log.e(r0, r1)
            r6.A0T(r4, r4)
            X.0pS r1 = r6.A0o
            r0 = 2131888226(0x7f120862, float:1.9411081E38)
            r1.Afg(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZK.A08():void");
    }

    public final void A09() {
        AnonymousClass1ZL r3 = this.A1G;
        r3.A0H.A02();
        r3.A01.setImageResource(R.drawable.inline_audio_pause);
        r3.A01.setContentDescription(r3.A05.getString(R.string.str0f30));
    }

    public final void A0A() {
        AnonymousClass1ZL r3 = this.A1G;
        r3.A0H.A02();
        ImageButton imageButton = r3.A01;
        Context context = r3.A05;
        imageButton.setImageDrawable(AnonymousClass00T.A04(context, R.drawable.inline_audio_play));
        r3.A01.setContentDescription(context.getString(R.string.str1d62));
    }

    public final void A0B() {
        boolean z2;
        int i2;
        if (this.A0N != null) {
            AnonymousClass1ZL r2 = this.A1G;
            boolean z3 = false;
            if (r2.A04.getVisibility() == 0) {
                z3 = true;
            }
            if (z3) {
                if (r2.A04.getProgress() != 0 || this.A0N.A0D()) {
                    z2 = false;
                    i2 = r2.A04.getProgress();
                } else {
                    z2 = true;
                    i2 = r2.A04.getMax();
                }
            } else if (r2.A03.getVisibility() != 0) {
                z2 = true;
                i2 = 0;
            } else if (r2.A03.A00 != 0.0f || this.A0N.A0D()) {
                z2 = false;
                i2 = this.A0N.A02();
            } else {
                z2 = true;
                i2 = this.A0N.A03();
            }
            C001000l r6 = this.A0j;
            int i3 = R.string.str1a50;
            if (z2) {
                i3 = R.string.str18a2;
            }
            String string = r6.getString(i3, new Object[]{C28961Zl.A06(this.A11, (long) i2)});
            r2.A04.setContentDescription(string);
            r2.A03.setContentDescription(string);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (X.C45922Bq.A0B(r5.A0y, r5.A16, ((com.obwhatsapp.mentions.MentionableEntry) r0).getStringText()) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r5 = this;
            android.view.View r4 = r5.A0f
            android.view.View r0 = r5.A0c
            if (r0 == 0) goto L_0x0017
            X.01V r2 = r5.A0y
            X.0u3 r1 = r5.A16
            com.obwhatsapp.mentions.MentionableEntry r0 = (com.obwhatsapp.mentions.MentionableEntry) r0
            java.lang.String r0 = r0.getStringText()
            boolean r0 = X.C45922Bq.A0B(r2, r1, r0)
            r3 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            r2 = 8
            r1 = 0
            r0 = 2131366071(0x7f0a10b7, float:1.8352025E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r3 == 0) goto L_0x003a
            r0.setVisibility(r1)
            r0 = 2131366995(0x7f0a1453, float:1.83539E38)
            android.view.View r0 = r4.findViewById(r0)
            r0.setVisibility(r2)
        L_0x0031:
            r4.setVisibility(r1)
            android.view.View r0 = r5.A0d
            r0.requestFocus()
            return
        L_0x003a:
            r0.setVisibility(r2)
            r0 = 2131366995(0x7f0a1453, float:1.83539E38)
            android.view.View r0 = r4.findViewById(r0)
            r0.setVisibility(r1)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZK.A0C():void");
    }

    public final void A0D() {
        C30811cz r1 = this.A0P;
        if (r1 != null) {
            r1.A06.start();
            AudioRecord audioRecord = r1.A04;
            if (audioRecord.getState() == 1) {
                audioRecord.startRecording();
            }
            AnonymousClass1B2 r12 = this.A1I;
            Log.i("voicenote/voicenotestarted");
            for (C54272h7 A042 : r12.A01()) {
                A042.A04();
            }
        }
    }

    public final void A0E() {
        if (this.A1U) {
            this.A0Z.removeCallbacks(this.A1Q);
            View view = this.A0f;
            if (view != null && view.getKeepScreenOn()) {
                view.setKeepScreenOn(false);
            }
            if (this.A0U) {
                this.A0U = false;
                this.A0v.A03(this.A0u);
            }
        }
    }

    public final void A0F(float f2, float f3, int i2, int i3) {
        C001000l r1 = this.A0j;
        String string = r1.getString(i3);
        if (this.A0P == null) {
            AnonymousClass2JP.A00(r1, this.A0y, string);
        }
        C84934Ml r0 = this.A1M;
        TextView textView = r0.A02;
        textView.setBackground(new C447725m(r1.getResources().getDrawable(i2), r0.A03));
        textView.setText(string);
        textView.setTranslationY(f2);
        textView.setTranslationX(f3);
        textView.setVisibility(0);
        textView.setAlpha(0.0f);
        textView.animate().alpha(1.0f).setDuration(320).start();
        C14870pt r3 = this.A0q;
        Runnable runnable = this.A1T;
        r3.A0J(runnable);
        r3.A0L(runnable, 3500);
    }

    public final void A0G(long j2, boolean z2) {
        try {
            C30811cz r2 = this.A0P;
            OpusRecorder opusRecorder = r2.A06;
            opusRecorder.stop();
            r2.A01 = opusRecorder.getPageNumber();
        } catch (Exception e2) {
            if (!z2 || j2 < 1000) {
                StringBuilder sb = new StringBuilder();
                sb.append("voicenote/stopandreleasevoicerecorder/stop ");
                sb.append(e2.toString());
                Log.i(sb.toString());
            } else {
                Log.e("voicenote/stopandreleasevoicerecorder/stop ", e2);
            }
        } catch (Throwable th) {
            this.A18.A02(this.A0P, j2, z2);
            throw th;
        }
        this.A18.A02(this.A0P, j2, z2);
        try {
            C30811cz r1 = this.A0P;
            r1.A06.close();
            r1.A04.release();
        } catch (Exception e3) {
            Log.e("voicenote/stopandreleasevoicerecorder/release", e3);
        }
        AnonymousClass1B2 r12 = this.A1I;
        Log.i("voicenote/voicenotestopped");
        for (C54272h7 A052 : r12.A01()) {
            A052.A05();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (java.lang.Math.abs(r15) <= r0.A0X) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r11 >= 0.0f) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(android.view.MotionEvent r23, android.view.View r24, boolean r25) {
        /*
            r22 = this;
            int r6 = r23.getAction()
            r4 = 0
            r1 = 1
            r14 = 0
            r0 = r22
            if (r6 == 0) goto L_0x025c
            r3 = r25
            if (r6 == r1) goto L_0x01fd
            r2 = 2
            if (r6 == r2) goto L_0x0017
            r2 = 3
            if (r6 == r2) goto L_0x01fd
        L_0x0016:
            return
        L_0x0017:
            boolean r2 = r0.A0V
            if (r2 != 0) goto L_0x0016
            boolean r2 = r0.A0W
            if (r2 != 0) goto L_0x0016
            float r11 = r23.getY()
            float r2 = r0.A01
            float r11 = r11 - r2
            float r15 = r23.getX()
            float r2 = r0.A00
            float r15 = r15 - r2
            boolean r2 = r0.A0T
            if (r2 != 0) goto L_0x003c
            float r6 = java.lang.Math.abs(r15)
            float r2 = r0.A0X
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r2 = 1
            if (r6 > 0) goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            r0.A0S = r2
            boolean r8 = r0.A1U
            r7 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            if (r8 == 0) goto L_0x00b5
            if (r2 != 0) goto L_0x0057
            float r9 = java.lang.Math.abs(r11)
            float r2 = r0.A0X
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0057
            int r9 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            r2 = 1
            if (r9 < 0) goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            r0.A0T = r2
            if (r2 == 0) goto L_0x01e7
            X.2P3 r2 = r0.A0O
            if (r2 == 0) goto L_0x01e7
            boolean r2 = r2.A0d
            if (r2 != 0) goto L_0x0071
            android.os.Handler r9 = r0.A0Z
            java.lang.Runnable r2 = r0.A1Q
            r9.removeCallbacks(r2)
            X.2P3 r9 = r0.A0O
            r2 = 0
            r9.A07(r2, r4)
        L_0x0071:
            float r2 = r0.A0X
            float r11 = r11 + r2
            X.2P3 r12 = r0.A0O
            int r9 = r12.A0M
            int r2 = r12.A0I
            int r9 = r9 - r2
            float r10 = (float) r9
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01dc
            r9 = 0
        L_0x0081:
            r12.setPercentageLocked(r9)
            float r2 = r0.A03
            float r11 = r11 + r2
            float r2 = r2 - r10
            float r2 = java.lang.Math.max(r11, r2)
            android.widget.ImageView r10 = r0.A0g
            r10.setTranslationY(r2)
            X.4X6 r2 = r0.A0k
            java.util.concurrent.CopyOnWriteArraySet r2 = r2.A04
            r2.clear()
            float r2 = r7 - r9
            float r2 = java.lang.Math.max(r6, r2)
            r10.setScaleX(r2)
            r10.setScaleY(r2)
            r2 = 1041865114(0x3e19999a, float:0.15)
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x00b5
            r0.A0O(r1)
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x00b5
            r0.A0P(r3)
        L_0x00b5:
            boolean r2 = r0.A0S
            if (r2 == 0) goto L_0x02be
            float r9 = r23.getX()
            android.widget.TextView r2 = r0.A0h
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r9 = r9 / r2
            float r10 = java.lang.Math.abs(r9)
            r2 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x01ac
            r0.A0U(r14, r3, r1, r1)
        L_0x00d2:
            X.1cz r2 = r0.A0P
            if (r2 == 0) goto L_0x0016
            long r2 = r0.A0C
            r9 = 160(0xa0, double:7.9E-322)
            long r2 = r2 + r9
            long r10 = android.os.SystemClock.elapsedRealtime()
            int r9 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x0016
            X.013 r10 = r0.A11
            boolean r2 = r10.A0T()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0191
            int r2 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x018c
            r15 = 0
        L_0x00f2:
            android.graphics.Rect r11 = r0.A0Y
            android.view.View r2 = r0.A0d
            int r3 = r2.getWidth()
            int r2 = (int) r15
            int r3 = r3 + r2
            com.whatsapp.util.ClippingLayout r12 = r0.A1B
            int r2 = r12.getHeight()
            r11.set(r14, r14, r3, r2)
        L_0x0105:
            if (r8 == 0) goto L_0x0144
            X.2P3 r8 = r0.A0O
            if (r8 == 0) goto L_0x0144
            boolean r2 = r8.A0d
            if (r2 == 0) goto L_0x0144
            int r2 = r8.getHeight()
            float r9 = (float) r2
            float r13 = java.lang.Math.abs(r15)
            X.2P3 r2 = r0.A0O
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r3 = r13 / r2
            X.2P3 r2 = r0.A0O
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r3 = r3 * r2
            r2 = 1066611507(0x3f933333, float:1.15)
            float r3 = r3 * r2
            float r2 = java.lang.Math.min(r9, r3)
            r8.setTranslationY(r2)
            X.2P3 r3 = r0.A0O
            int r2 = r3.getWidth()
            float r2 = (float) r2
            float r13 = r13 / r2
            float r7 = r7 - r13
            float r2 = java.lang.Math.max(r6, r7)
            r3.setAlpha(r2)
        L_0x0144:
            android.view.View r2 = r0.A0e
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0186
            r12.setClipBounds(r11)
        L_0x014f:
            android.widget.ImageView r6 = r0.A0g
            int r2 = r6.getWidth()
            float r3 = (float) r2
            r2 = 1085276160(0x40b00000, float:5.5)
            float r3 = r3 / r2
            boolean r2 = r10.A0T()
            if (r2 == 0) goto L_0x0160
            float r3 = -r3
        L_0x0160:
            float r2 = r15 + r3
            r6.setTranslationX(r2)
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            android.view.animation.TranslateAnimation r13 = new android.view.animation.TranslateAnimation
            r17 = r15
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r13.setDuration(r4)
            r13.setFillBefore(r1)
            r13.setFillAfter(r1)
            android.widget.TextView r0 = r0.A0i
            r0.clearAnimation()
            goto L_0x02ba
        L_0x0186:
            com.whatsapp.util.ClippingLayout r2 = r0.A1C
            r2.setClipBounds(r11)
            goto L_0x014f
        L_0x018c:
            float r2 = r0.A0X
            float r15 = r15 + r2
            goto L_0x00f2
        L_0x0191:
            int r2 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x01a8
            r15 = 0
        L_0x0196:
            android.graphics.Rect r11 = r0.A0Y
            int r9 = (int) r15
            com.whatsapp.util.ClippingLayout r12 = r0.A1B
            int r3 = r12.getWidth()
            int r2 = r12.getHeight()
            r11.set(r9, r14, r3, r2)
            goto L_0x0105
        L_0x01a8:
            float r2 = r0.A0X
            float r15 = r15 - r2
            goto L_0x0196
        L_0x01ac:
            r2 = 1036831949(0x3dcccccd, float:0.1)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            X.44E r9 = r0.A0l
            if (r2 <= 0) goto L_0x01cf
            r3 = 1066192077(0x3f8ccccd, float:1.1)
            r2 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 * r2
            float r3 = r3 - r10
            float r2 = java.lang.Math.max(r6, r3)
            double r2 = (double) r2
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            java.util.concurrent.atomic.AtomicLong r9 = r9.A00
            r9.set(r2)
            r0.A0O(r1)
            goto L_0x00d2
        L_0x01cf:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            java.util.concurrent.atomic.AtomicLong r9 = r9.A00
            r9.set(r2)
            goto L_0x00d2
        L_0x01dc:
            float r9 = java.lang.Math.abs(r11)
            r2 = 1062836634(0x3f59999a, float:0.85)
            float r2 = r2 * r10
            float r9 = r9 / r2
            goto L_0x0081
        L_0x01e7:
            X.2P3 r2 = r0.A0O
            if (r2 == 0) goto L_0x01ee
            r2.setPercentageLocked(r6)
        L_0x01ee:
            android.widget.ImageView r9 = r0.A0g
            float r2 = r0.A03
            r9.setTranslationY(r2)
            r9.setScaleX(r7)
            r9.setScaleY(r7)
            goto L_0x00b5
        L_0x01fd:
            boolean r2 = r0.A0V
            if (r2 != 0) goto L_0x0016
            boolean r2 = r0.A0W
            if (r2 != 0) goto L_0x0016
            boolean r4 = r0.A0T
            android.widget.TextView r2 = r0.A0h
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x024c
            android.widget.ImageView r4 = r0.A0g
            android.view.ViewPropertyAnimator r2 = r4.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r1 = r2.setListener(r1)
            r1.cancel()
            android.view.ViewPropertyAnimator r4 = r4.animate()
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r4.setDuration(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r2)
            android.view.ViewPropertyAnimator r2 = r1.scaleY(r2)
            float r1 = r0.A03
            android.view.ViewPropertyAnimator r2 = r2.translationY(r1)
            X.3KI r1 = new X.3KI
            r1.<init>(r0, r5, r3)
            r2.setListener(r1)
            return
        L_0x024c:
            r0.A0U(r5, r3, r1, r14)
            if (r5 != 0) goto L_0x0016
            r1 = r24
            r1.playSoundEffect(r14)
            X.5Sj r0 = r0.A1L
            r0.AX3()
            return
        L_0x025c:
            android.widget.TextView r2 = r0.A0h
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0016
            X.38h r3 = r0.A1J
            java.lang.String r2 = "note"
            boolean r2 = r3.A00(r2)
            if (r2 == 0) goto L_0x0016
            r0.A06()
            X.1M4 r3 = r0.A1A
            r2 = 3
            r3.A00(r2)
            float r2 = r23.getX()
            r0.A00 = r2
            float r2 = r23.getY()
            r0.A01 = r2
            android.widget.ImageView r3 = r0.A0g
            float r2 = r3.getTranslationX()
            r0.A02 = r2
            float r2 = r3.getTranslationY()
            r0.A03 = r2
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            android.view.animation.TranslateAnimation r13 = new android.view.animation.TranslateAnimation
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r13.setDuration(r4)
            r13.setFillBefore(r1)
            r13.setFillAfter(r1)
            android.widget.TextView r0 = r0.A0i
        L_0x02ba:
            r0.startAnimation(r13)
            return
        L_0x02be:
            android.widget.ImageView r2 = r0.A0g
            float r1 = r0.A02
            r2.setTranslationX(r1)
            android.view.View r2 = r0.A0f
            r1 = 2131363738(0x7f0a079a, float:1.8347293E38)
            android.view.View r2 = r2.findViewById(r1)
            com.whatsapp.util.ClippingLayout r2 = (com.whatsapp.util.ClippingLayout) r2
            r1 = 0
            r2.setClipBounds(r1)
            com.whatsapp.util.ClippingLayout r0 = r0.A1C
            r0.setClipBounds(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZK.A0H(android.view.MotionEvent, android.view.View, boolean):void");
    }

    public final void A0I(File file) {
        this.A1D.Acl(new RunnableRunnableShape16S0100000_I0_15(file, 23));
    }

    public final void A0J(File file) {
        AnonymousClass00B.A06(file);
        try {
            C30211bx r0 = this.A0N;
            if (r0 != null) {
                r0.A06();
            }
            C30211bx A002 = C30211bx.A00((C16980tz) null, (C14710pd) null, file, 3);
            this.A0N = A002;
            A002.A05();
        } catch (IOException e2) {
            this.A0N = null;
            Log.e("voicenoterecordingui/prepareVoiceNoteDraftPlayer/ error creating audio player for voice note preview ", e2);
        }
    }

    public final void A0K(File file, int i2, boolean z2) {
        AnonymousClass3BB r1;
        StringBuilder sb = new StringBuilder("voicenote/onrecordingstopped ");
        sb.append(z2);
        Log.i(sb.toString());
        this.A0K.A01 = true;
        if (z2) {
            C16750ta r2 = new C16750ta();
            r2.A0L = true;
            File file2 = this.A0K.A02.A06;
            AnonymousClass00B.A06(file2);
            r2.A0F = file2;
            C222617g r12 = this.A17;
            C15830rv r3 = this.A0J;
            AnonymousClass00B.A06(r3);
            long j2 = this.A0D;
            C38701rH A022 = r12.A02(r2, r3, this.A0L, file2.getName(), j2, r2.A0F.length());
            A022.A00 = i2;
            C70653hS r22 = this.A0H;
            if (!(r22 == null || (r1 = this.A0I) == null)) {
                A022.A0c(this.A0x.A00(r22, r1));
            }
            this.A18.A01(this.A0K.A00, A022, file);
        } else {
            AnonymousClass1HE r13 = this.A15;
            C43171zS r23 = this.A0K;
            Log.i("app/mediajobmanager/cancelVoiceNoteUpload");
            r13.A0D.A06(r23.A00);
        }
        this.A0K = null;
    }

    public void A0L(File file, File file2, boolean z2) {
        AnonymousClass3BB r3;
        File file3 = file;
        AnonymousClass00B.A06(file3);
        AnonymousClass00B.A06(this.A0J);
        C54262h6 r32 = this.A1K;
        long length = file3.length();
        C30211bx r2 = this.A0N;
        r32.A02(length, r2 != null ? (long) r2.A03() : -1, this.A0W);
        File A0B2 = C17970vw.A0B(this.A0p, this.A16, AnonymousClass1XK.A0I, file3, 1);
        if (!file3.renameTo(A0B2)) {
            StringBuilder sb = new StringBuilder("voicenote/sendvoicenotefile/failed to rename ");
            sb.append(file3);
            sb.append(" to ");
            sb.append(A0B2);
            Log.e(sb.toString());
            A0B2 = file3;
        }
        C16750ta r7 = new C16750ta();
        r7.A0F = A0B2;
        C16730tY A032 = this.A14.A03((Uri) null, r7, (C35541m6) null, this.A0J, this.A0L, (String) null, (String) null, (List) null, (List) null, (byte) 2, 1, 0, z2);
        C70653hS r4 = this.A0H;
        if (!(r4 == null || (r3 = this.A0I) == null)) {
            A032.A0c(this.A0x.A00(r4, r3));
        }
        if (A032.A00 == 0) {
            A032.A00 = C17970vw.A03(file3);
        }
        this.A18.A01((AnonymousClass1XP) null, (C38701rH) A032, file2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        if (r1 != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(java.io.File r8, java.io.File r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            r7.A0J(r8)
            X.1bx r0 = r7.A0N
            if (r0 == 0) goto L_0x00c9
            int r0 = r0.A03()
            long r0 = (long) r0
            r7.A0A = r0
            r7.A0A()
            X.1ZL r4 = r7.A1G
            X.2h5 r3 = new X.2h5
            r3.<init>(r7)
            android.widget.ImageButton r2 = r4.A01
            r1 = 15
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r0 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7
            r0.<init>(r3, r1)
            r2.setOnClickListener(r0)
            long r0 = r7.A0A
            r4.A02(r0)
            X.1bx r2 = r7.A0N
            X.1cz r0 = r7.A0P
            if (r0 == 0) goto L_0x0038
            com.whatsapp.util.OpusRecorder r0 = r0.A06
            boolean r1 = r0.isRecording()
            r0 = 1
            if (r1 == 0) goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            r4.A04(r2, r9, r11, r0)
            r7.A0B()
            android.view.View r1 = r7.A0f
            r0 = 2131367012(0x7f0a1464, float:1.8353934E38)
            android.view.View r0 = r1.findViewById(r0)
            r6 = 8
            r0.setVisibility(r6)
            r0 = 2131364134(0x7f0a0926, float:1.8348096E38)
            android.view.View r0 = r1.findViewById(r0)
            r5 = 4
            r0.setVisibility(r5)
            r0 = 2131362466(0x7f0a02a2, float:1.8344713E38)
            android.view.View r0 = r1.findViewById(r0)
            r3 = 0
            r0.setVisibility(r3)
            r0 = 2131366995(0x7f0a1453, float:1.83539E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r6)
            r0 = 2131366071(0x7f0a10b7, float:1.8352025E38)
            android.view.View r2 = r1.findViewById(r0)
            r1 = 16
            com.facebook.redex.IDxDCompatShape22S0100000_2_I0 r0 = new com.facebook.redex.IDxDCompatShape22S0100000_2_I0
            r0.<init>(r7, r1)
            X.C004601z.A0j(r2, r0)
            android.widget.ImageView r0 = r7.A0g
            r0.setVisibility(r6)
            X.2P3 r0 = r7.A0O
            if (r0 == 0) goto L_0x008a
            r0.setVisibility(r5)
        L_0x008a:
            android.view.ViewGroup r1 = r4.A0B
            r1.setVisibility(r3)
            r0 = 1
            r1.setClickable(r0)
            X.53G r3 = new X.53G
            r3.<init>(r7, r8)
            android.widget.ImageButton r2 = r4.A0C
            r1 = 14
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r0 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7
            r0.<init>(r3, r1)
            r2.setOnClickListener(r0)
            X.4lX r1 = new X.4lX
            r1.<init>(r7)
            com.obwhatsapp.voicerecorder.VoiceNoteSeekBar r0 = r4.A04
            r0.setOnSeekBarChangeListener(r1)
            X.4xb r1 = new X.4xb
            r1.<init>(r7)
            com.obwhatsapp.conversation.waveforms.VoiceVisualizer r0 = r4.A03
            r0.A08 = r1
            if (r10 == 0) goto L_0x00c5
            X.0sq r2 = r7.A1D
            r1 = 20
            com.facebook.redex.RunnableRunnableShape16S0100000_I0_15 r0 = new com.facebook.redex.RunnableRunnableShape16S0100000_I0_15
            r0.<init>(r7, r1)
            r2.Acl(r0)
        L_0x00c5:
            r7.A0Q = r8
            r7.A0R = r9
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZK.A0M(java.io.File, java.io.File, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
        if (X.C45922Bq.A0B(r2.A0y, r2.A16, ((com.obwhatsapp.mentions.MentionableEntry) r0).getStringText()) == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(boolean r18) {
        /*
            r17 = this;
            r2 = r17
            X.1Lu r1 = r2.A1F
            java.io.File r0 = r2.A0Q
            r1.A00(r0)
            r4 = 0
            if (r18 == 0) goto L_0x0019
            X.0rv r1 = r2.A0J
            if (r1 == 0) goto L_0x0019
            X.1Lw r0 = r2.A1E
            r0.A04(r1)
            r2.A0Q = r4
            r2.A0R = r4
        L_0x0019:
            android.os.Handler r1 = r2.A0a
            java.lang.Runnable r0 = r2.A1S
            r1.removeCallbacks(r0)
            X.1bx r0 = r2.A0N
            if (r0 == 0) goto L_0x002e
            r2.A04()
            X.1bx r0 = r2.A0N
            r0.A06()
            r2.A0N = r4
        L_0x002e:
            android.view.View r9 = r2.A0f
            r0 = 2131364134(0x7f0a0926, float:1.8348096E38)
            android.view.View r3 = r9.findViewById(r0)
            r0 = 1
            r3.setFocusable(r0)
            X.C004601z.A0d(r3, r0)
            r0 = 2131366071(0x7f0a10b7, float:1.8352025E38)
            android.view.View r7 = r9.findViewById(r0)
            X.C004601z.A0j(r7, r4)
            android.view.View r0 = r2.A0c
            if (r0 == 0) goto L_0x005d
            X.01V r4 = r2.A0y
            X.0u3 r1 = r2.A16
            com.obwhatsapp.mentions.MentionableEntry r0 = (com.obwhatsapp.mentions.MentionableEntry) r0
            java.lang.String r0 = r0.getStringText()
            boolean r0 = X.C45922Bq.A0B(r4, r1, r0)
            r4 = 1
            if (r0 != 0) goto L_0x005e
        L_0x005d:
            r4 = 0
        L_0x005e:
            r0 = 200(0xc8, double:9.9E-322)
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x0097
            r8 = 0
            android.view.animation.AlphaAnimation r6 = new android.view.animation.AlphaAnimation
            r6.<init>(r10, r8)
            r4 = 100
            r6.setDuration(r4)
            r5 = 7
            com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0 r4 = new com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0
            r4.<init>(r7, r5, r2)
            r6.setAnimationListener(r4)
            r7.startAnimation(r6)
            android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
            r7.<init>(r8, r10)
            r4 = 2131366995(0x7f0a1453, float:1.83539E38)
            android.view.View r6 = r9.findViewById(r4)
            r7.setDuration(r0)
            r5 = 8
            com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0 r4 = new com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0
            r4.<init>(r6, r5, r2)
            r7.setAnimationListener(r4)
            r6.startAnimation(r7)
        L_0x0097:
            r9 = 1
            X.013 r4 = r2.A11
            boolean r4 = r4.A0T()
            r4 = r4 ^ 1
            if (r4 != 0) goto L_0x00a4
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00a4:
            r12 = 0
            r11 = 1
            r13 = 1
            r14 = 0
            r15 = 1
            r16 = 0
            android.view.animation.TranslateAnimation r8 = new android.view.animation.TranslateAnimation
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r8.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r8.setInterpolator(r0)
            r1 = 9
            com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0 r0 = new com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0
            r0.<init>(r3, r1, r2)
            r8.setAnimationListener(r0)
            r3.startAnimation(r8)
            X.1ZL r2 = r2.A1G
            r1 = 8
            android.view.ViewGroup r0 = r2.A0B
            r0.setVisibility(r1)
            android.view.ViewGroup r1 = r2.A09
            r0 = 8
            r1.setVisibility(r0)
            com.obwhatsapp.conversation.waveforms.VoiceVisualizer r2 = r2.A0F
            java.util.LinkedList r0 = r2.A0I
            r0.clear()
            r0 = 0
            r2.A0A = r0
            r0 = 0
            r2.A06 = r0
            r0 = 166(0xa6, double:8.2E-322)
            r2.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZK.A0N(boolean):void");
    }

    public void A0O(boolean z2) {
        TextView textView = this.A1M.A02;
        if (textView.getVisibility() == 0) {
            this.A0q.A0J(this.A1T);
            if (z2) {
                textView.setVisibility(8);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(320);
                textView.startAnimation(alphaAnimation);
                return;
            }
            textView.clearAnimation();
            textView.setVisibility(8);
        }
    }

    public void A0P(boolean z2) {
        SharedPreferences.Editor A0K2;
        SharedPreferences sharedPreferences;
        String str;
        this.A0W = true;
        C54262h6 r5 = this.A1K;
        C15830rv r1 = r5.A06.A00.A0J;
        if (r1 != null) {
            if (C16030sJ.A0G(r1)) {
                C15860rz r0 = r5.A04;
                A0K2 = r0.A0K();
                sharedPreferences = (SharedPreferences) r0.A01.get();
                str = "ptt_lock_broadcast";
            } else {
                boolean A0L2 = C16030sJ.A0L(r1);
                C15860rz r02 = r5.A04;
                A0K2 = r02.A0K();
                sharedPreferences = (SharedPreferences) r02.A01.get();
                str = A0L2 ? "ptt_lock_group" : "ptt_lock_individual";
            }
            A0K2.putLong(str, sharedPreferences.getLong(str, 0) + 1).apply();
        }
        r5.A05.A00.A06(new C74213q4());
        View view = this.A0f;
        view.findViewById(R.id.voice_note_btn).setVisibility(8);
        view.findViewById(R.id.buttons).setVisibility(4);
        C210812s r7 = this.A0v;
        if (r7.A00.A00() >= 16.0d) {
            if (!view.getKeepScreenOn()) {
                view.setKeepScreenOn(true);
            }
            if (!this.A0U) {
                this.A0U = true;
                r7.A02(this.A0u);
            }
        }
        AnonymousClass1ZL r52 = this.A1G;
        AnonymousClass53H r72 = new AnonymousClass53H(this, z2);
        IDxCListenerShape465S0100000_2_I0 iDxCListenerShape465S0100000_2_I0 = new IDxCListenerShape465S0100000_2_I0(this, 0);
        r52.A0C.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(r72, 14));
        r52.A0D.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(iDxCListenerShape465S0100000_2_I0, 16));
        r52.A0B.setVisibility(0);
        r52.A00();
        VoiceVisualizer voiceVisualizer = r52.A0F;
        voiceVisualizer.setEnabled(true);
        if (r52.A0K) {
            voiceVisualizer.setVisibility(0);
        }
        r52.A0A.setVisibility(0);
        r52.A0H.A03(8);
        AnonymousClass1B2 r12 = this.A1I;
        Log.i("voicenote/notifyVoiceNoteLocked");
        AnonymousClass00B.A01();
        for (C54272h7 A012 : r12.A01()) {
            A012.A01();
        }
        View findViewById = view.findViewById(R.id.voice_note_slide_to_cancel_layout);
        findViewById.animate().setDuration(200).alpha(0.0f).setListener(new IDxLAdapterShape0S0200000_2_I0(findViewById, 4, this)).start();
        AnonymousClass2P3 r10 = this.A0O;
        if (r10 != null) {
            RunnableRunnableShape16S0100000_I0_15 runnableRunnableShape16S0100000_I0_15 = new RunnableRunnableShape16S0100000_I0_15(this, 22);
            r10.setPivotX((float) (r10.getWidth() / 2));
            r10.setPivotY((float) (r10.A0I / 2));
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 1.3f});
            ofFloat.setDuration(250);
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(2);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(r10, 31));
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(r10.A0O), Integer.valueOf(r10.A0N)});
            ofObject.setDuration(250);
            ofObject.setInterpolator(new AccelerateDecelerateInterpolator());
            ofObject.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(r10, 34));
            animatorSet.addListener(new IDxLAdapterShape0S0200000_2_I0(runnableRunnableShape16S0100000_I0_15, 3, r10));
            animatorSet.playTogether(new Animator[]{ofFloat, ofObject});
            animatorSet.start();
        }
        this.A0g.setVisibility(8);
        View findViewById2 = view.findViewById(R.id.voice_note_slide_to_cancel_animation);
        findViewById2.post(new RunnableRunnableShape16S0100000_I0_15(this, 19));
        findViewById2.setVisibility(8);
        view.findViewById(R.id.voice_recorder_decor).setVisibility(8);
    }

    public void A0Q(boolean z2) {
        File file = this.A0Q;
        if (file != null) {
            this.A1F.A00(file);
            A0L(this.A0Q, this.A0R, z2);
            this.A0Q = null;
            int i2 = A1a;
            if (i2 != 0) {
                A1d.play(i2, 1.0f, 1.0f, 0, 0, 1.0f);
            }
            this.A0R = null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x021d */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(boolean r18) {
        /*
            r17 = this;
            int r0 = A1Y
            r1 = r17
            if (r0 == 0) goto L_0x0024
            boolean r0 = r1.A0V()
            if (r0 == 0) goto L_0x0024
            if (r18 == 0) goto L_0x0024
            android.media.SoundPool r2 = A1d
            int r3 = A1Y
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r2.play(r3, r4, r5, r6, r7, r8)
            X.00l r2 = r1.A0j
            X.01V r0 = r1.A0y
            X.C812847o.A00(r2, r0)
        L_0x0024:
            X.1cz r2 = r1.A0P
            r0 = 0
            if (r2 == 0) goto L_0x002a
            r0 = 1
        L_0x002a:
            r7 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0255
            X.0rv r0 = r1.A0J
            if (r0 == 0) goto L_0x0255
            X.2h6 r3 = r1.A1K
            r0 = 1
            r3.A03 = r0
            X.1bw r0 = r3.A06
            X.1ZK r0 = r0.A00
            X.0rv r2 = r0.A0J
            if (r2 == 0) goto L_0x0065
            boolean r0 = X.C16030sJ.A0G(r2)
            if (r0 == 0) goto L_0x022d
            X.0rz r0 = r3.A04
            android.content.SharedPreferences$Editor r6 = r0.A0K()
            X.01D r0 = r0.A01
            java.lang.Object r4 = r0.get()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.String r0 = "ptt_draft_review_broadcast"
        L_0x0055:
            r2 = 0
            long r2 = r4.getLong(r0, r2)
            r8 = 1
            long r2 = r2 + r8
            android.content.SharedPreferences$Editor r0 = r6.putLong(r0, r2)
            r0.apply()
        L_0x0065:
            X.00l r6 = r1.A0j
            X.01V r2 = r1.A0y
            r0 = 2131892825(0x7f121a59, float:1.942041E38)
            java.lang.String r0 = r6.getString(r0)
            X.AnonymousClass2JP.A00(r6, r2, r0)
            java.lang.String r0 = "voicenote/cachevoicenoteandpreview"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A0O(r5)
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r2 = r1.A0B
            long r8 = r8 - r2
            long r2 = r1.A0A
            long r8 = r8 + r2
            r1.A0A = r8
            java.lang.String r2 = "voicenote/cachevoicenoteandpreview duration:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A0G(r8, r5)
            X.5Sj r0 = r1.A1L
            r0.AQ8()
            X.1cz r0 = r1.A0P
            java.io.File r4 = r0.A08
            com.obwhatsapp.yo.yo.processVNSound(r4)
            long r2 = r4.length()
            X.1cz r10 = r1.A0P
            java.io.File r0 = r10.A09
            long r15 = r10.A01
            r13 = 1000(0x3e8, double:4.94E-321)
            r11 = 99
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x00d4
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 < 0) goto L_0x00d4
            java.lang.String r11 = "voicenote/file too small; not previewing; voiceNoteFileLength="
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            com.whatsapp.util.Log.e((java.lang.String) r10)
            r1.A07()
        L_0x00d4:
            android.widget.ImageView r11 = r1.A0g
            float r10 = r1.A02
            r11.setTranslationX(r10)
            android.view.View r11 = r1.A0f
            r10 = 2131363738(0x7f0a079a, float:1.8347293E38)
            android.view.View r10 = r11.findViewById(r10)
            com.whatsapp.util.ClippingLayout r10 = (com.whatsapp.util.ClippingLayout) r10
            r10.setClipBounds(r7)
            com.whatsapp.util.ClippingLayout r10 = r1.A1C
            r10.setClipBounds(r7)
            X.1zS r10 = r1.A0K
            if (r10 == 0) goto L_0x00f5
            r1.A0K(r0, r5, r5)
        L_0x00f5:
            X.3Lz r10 = r1.A0M
            if (r10 == 0) goto L_0x00fe
            r10.A00()
            r1.A0M = r7
        L_0x00fe:
            android.os.PowerManager$WakeLock r11 = r1.A0G
            if (r11 == 0) goto L_0x010b
            boolean r10 = r11.isHeld()
            if (r10 == 0) goto L_0x010b
            r11.release()
        L_0x010b:
            if (r18 == 0) goto L_0x011b
            X.15N r10 = r1.A12
            r10.A00 = r5
            boolean r10 = r1.A1V
            if (r10 == 0) goto L_0x0116
            r10 = -1
        L_0x0116:
            X.1Az r6 = r1.A19
            r6.A00()
        L_0x011b:
            r1.A0P = r7
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x0249
            r8 = 99
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0249
            X.1Lw r9 = r1.A1E
            X.0rv r10 = r1.A0J
            X.0tZ r11 = r1.A0L
            java.lang.String r2 = "Jid cannot be null"
            X.AnonymousClass00B.A07(r10, r2)
            java.lang.String r2 = r4.getAbsolutePath()
            java.lang.String r3 = X.AnonymousClass1XI.A08(r2)
            java.lang.String r2 = "opus"
            boolean r3 = r3.equals(r2)
            java.lang.String r2 = "Invalid file type for voice note file. Use opus"
            X.AnonymousClass00B.A0C(r2, r3)
            X.0sj r3 = r9.A03
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            boolean r2 = r3.A0F(r2)
            if (r2 == 0) goto L_0x0226
            java.io.File r8 = r9.A01(r10)
            if (r8 == 0) goto L_0x0226
            java.io.File r6 = r9.A02(r10)
            if (r11 != 0) goto L_0x01d6
            java.io.File r3 = r9.A03(r10)
            if (r3 == 0) goto L_0x016c
            boolean r2 = r3.exists()
            if (r2 == 0) goto L_0x016c
            r3.delete()
        L_0x016c:
            X.12W r3 = r9.A00
            boolean r2 = X.AnonymousClass1XI.A0K(r3, r4, r8)
            if (r2 == 0) goto L_0x0226
            if (r6 == 0) goto L_0x0179
            X.AnonymousClass1XI.A0K(r3, r0, r6)
        L_0x0179:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r8, r6)
        L_0x017e:
            java.lang.Object r6 = r2.first
            java.io.File r6 = (java.io.File) r6
            java.lang.Object r3 = r2.second
            java.io.File r3 = (java.io.File) r3
            X.1Lu r12 = r1.A1F
            if (r6 == 0) goto L_0x01a7
            r7 = 2
            int r2 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01a7
            java.lang.String r7 = r6.getName()
            java.lang.String r2 = "@"
            java.lang.String[] r2 = r7.split(r2)
            r13 = r2[r5]
            X.0sq r2 = r12.A01
            r14 = 1
            com.facebook.redex.RunnableRunnableShape0S1100100_I0 r11 = new com.facebook.redex.RunnableRunnableShape0S1100100_I0
            r11.<init>(r12, r13, r14, r15)
            r2.Acl(r11)
        L_0x01a7:
            r1.A0I(r4)
            r1.A0I(r0)
            r1.A0E()
            X.1bx r0 = r1.A0N
            if (r0 == 0) goto L_0x01bf
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x01bf
            X.1bx r0 = r1.A0N
            r0.A09()
        L_0x01bf:
            r0 = 1
            if (r18 == 0) goto L_0x01c7
            if (r6 == 0) goto L_0x01cc
            r1.A0M(r6, r3, r5, r0)
        L_0x01c7:
            r1.A0Q = r6
            r1.A0R = r3
            return
        L_0x01cc:
            java.lang.String r0 = "voicenote/ error caching voice note for preview"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1.A0S(r5)
            goto L_0x01c7
        L_0x01d6:
            java.io.File r10 = r9.A03(r10)
            if (r10 != 0) goto L_0x01e2
            java.lang.String r2 = "draftvoicenotecache/savequotedmessage/quoted message file is null"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            goto L_0x016c
        L_0x01e2:
            X.1Vw r12 = r11.A11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x021e }
            r11.<init>()     // Catch:{ IOException -> 0x021e }
            X.0rv r2 = r12.A00     // Catch:{ IOException -> 0x021e }
            java.lang.String r2 = X.C16030sJ.A03(r2)     // Catch:{ IOException -> 0x021e }
            r11.append(r2)     // Catch:{ IOException -> 0x021e }
            java.lang.String r3 = ":;:"
            r11.append(r3)     // Catch:{ IOException -> 0x021e }
            boolean r2 = r12.A02     // Catch:{ IOException -> 0x021e }
            r11.append(r2)     // Catch:{ IOException -> 0x021e }
            r11.append(r3)     // Catch:{ IOException -> 0x021e }
            java.lang.String r2 = r12.A01     // Catch:{ IOException -> 0x021e }
            r11.append(r2)     // Catch:{ IOException -> 0x021e }
            java.lang.String r2 = r11.toString()     // Catch:{ IOException -> 0x021e }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x021e }
            r3.<init>(r10)     // Catch:{ IOException -> 0x021e }
            byte[] r2 = r2.getBytes()     // Catch:{ all -> 0x0219 }
            r3.write(r2)     // Catch:{ all -> 0x0219 }
            r3.close()     // Catch:{ IOException -> 0x021e }
            goto L_0x016c
        L_0x0219:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x021d }
        L_0x021d:
            throw r2     // Catch:{ IOException -> 0x021e }
        L_0x021e:
            r3 = move-exception
            java.lang.String r2 = "draftvoicenotecache/savequotedmessage/ "
            com.whatsapp.util.Log.e(r2, r3)
            goto L_0x016c
        L_0x0226:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r7, r7)
            goto L_0x017e
        L_0x022d:
            boolean r2 = X.C16030sJ.A0L(r2)
            X.0rz r0 = r3.A04
            android.content.SharedPreferences$Editor r6 = r0.A0K()
            X.01D r0 = r0.A01
            java.lang.Object r4 = r0.get()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            if (r2 == 0) goto L_0x0245
            java.lang.String r0 = "ptt_draft_review_group"
            goto L_0x0055
        L_0x0245:
            java.lang.String r0 = "ptt_draft_review_individual"
            goto L_0x0055
        L_0x0249:
            r1.A0E()
            r1.A0S(r5)
            r1.A0I(r4)
            r1.A0I(r0)
        L_0x0255:
            r1.A0Q = r7
            r1.A0R = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZK.A0R(boolean):void");
    }

    public final void A0S(boolean z2) {
        View view = this.A0f;
        view.findViewById(R.id.voice_recorder_decor).setVisibility(8);
        if (this.A1U) {
            AnonymousClass2P3 r0 = this.A0O;
            if (r0 != null) {
                r0.A03();
            }
            view.findViewById(R.id.voice_note_lock_container).setVisibility(8);
            view.findViewById(R.id.send).setEnabled(!TextUtils.isEmpty(this.A0h.getText().toString().trim()));
            AnonymousClass1ZL r1 = this.A1G;
            r1.A0B.setVisibility(8);
            r1.A09.setVisibility(8);
            VoiceVisualizer voiceVisualizer = r1.A0F;
            voiceVisualizer.A0I.clear();
            voiceVisualizer.A0A = false;
            voiceVisualizer.A06 = 0;
            voiceVisualizer.A07 = 166;
        }
        AnonymousClass4X6 r9 = this.A0k;
        r9.A04.clear();
        if (r9.A07.A00 == 0.0d || !z2) {
            r9.A02(0.0d);
            ImageView imageView = this.A0g;
            imageView.setVisibility(4);
            imageView.setScaleX(0.0f);
            imageView.setScaleY(0.0f);
            A0C();
        } else {
            r9.A03(new C79203zN(this, (int) this.A0g.getTranslationX()));
            r9.A02(0.0d);
        }
        View findViewById = view.findViewById(R.id.voice_note_layout);
        findViewById.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(160);
        findViewById.startAnimation(alphaAnimation);
        View findViewById2 = view.findViewById(R.id.input_layout_content);
        findViewById2.clearAnimation();
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(160);
        alphaAnimation2.setFillBefore(true);
        alphaAnimation2.setFillAfter(true);
        findViewById2.startAnimation(alphaAnimation2);
        ((ClippingLayout) view.findViewById(R.id.footer)).setClipBounds((Rect) null);
        this.A1C.setClipBounds((Rect) null);
        View findViewById3 = view.findViewById(R.id.voice_note_pulse);
        findViewById3.clearAnimation();
        ((ImageView) findViewById3).getDrawable().setAlpha(MotionEventCompat.ACTION_MASK);
    }

    public void A0T(boolean z2, boolean z3) {
        A0U(z2, z3, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f8, code lost:
        if (r4 <= 99) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        if (r32 != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010b, code lost:
        if (r4 > 99) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0250, code lost:
        if (r32 != false) goto L_0x00f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            r31 = this;
            r0 = r31
            android.view.View r1 = r0.A0f
            r30 = r1
            r2 = 2131364134(0x7f0a0926, float:1.8348096E38)
            android.view.View r1 = r1.findViewById(r2)
            r10 = 1
            r1.setFocusable(r10)
            X.C004601z.A0d(r1, r10)
            boolean r1 = r0.A0V
            if (r1 == 0) goto L_0x0027
            X.00l r2 = r0.A0j
            X.01V r1 = r0.A0y
            r0 = 2131892825(0x7f121a59, float:1.942041E38)
            java.lang.String r0 = r2.getString(r0)
            X.AnonymousClass2JP.A00(r2, r1, r0)
        L_0x0026:
            return
        L_0x0027:
            X.1cz r1 = r0.A0P
            if (r1 == 0) goto L_0x0026
            X.0rv r1 = r0.A0J
            if (r1 == 0) goto L_0x0026
            java.lang.String r2 = "voicenote/stopvoicenote "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r3 = r32
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = r32 ^ 1
            r0.A0V = r1
            if (r1 == 0) goto L_0x0057
            X.00l r4 = r0.A0j
            X.01V r2 = r0.A0y
            r1 = 2131892805(0x7f121a45, float:1.9420369E38)
            java.lang.String r1 = r4.getString(r1)
            X.AnonymousClass2JP.A00(r4, r2, r1)
        L_0x0057:
            r9 = 0
            r0.A0O(r9)
            X.0tb r2 = r0.A0r
            X.0rv r1 = r0.A0J
            r2.A0B(r1)
            r0.A0E()
            X.1bx r1 = r0.A0N
            if (r1 == 0) goto L_0x0074
            boolean r1 = r1.A0D()
            if (r1 == 0) goto L_0x0074
            X.1bx r1 = r0.A0N
            r1.A09()
        L_0x0074:
            r1 = r34
            r0.A0S(r1)
            android.animation.ObjectAnimator r1 = r0.A0F
            if (r1 == 0) goto L_0x0080
            r1.end()
        L_0x0080:
            r2 = 2131367016(0x7f0a1468, float:1.8353942E38)
            r1 = r30
            android.view.View r4 = r1.findViewById(r2)
            r2 = 19
            com.facebook.redex.RunnableRunnableShape16S0100000_I0_15 r1 = new com.facebook.redex.RunnableRunnableShape16S0100000_I0_15
            r1.<init>(r0, r2)
            r4.post(r1)
            r1 = 8
            r4.setVisibility(r1)
            X.1cz r1 = r0.A0P
            if (r1 == 0) goto L_0x0254
            com.whatsapp.util.OpusRecorder r1 = r1.A06
            boolean r1 = r1.isRecording()
            if (r1 == 0) goto L_0x0254
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0.A0B
            long r1 = r1 - r4
            long r4 = r0.A0A
            long r1 = r1 + r4
            r0.A0A = r1
        L_0x00b0:
            java.lang.String r5 = "voicenote/stopvoicenote duration:"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r0.A0G(r1, r3)
            X.1cz r4 = r0.A0P
            java.io.File r4 = r4.A08
            com.obwhatsapp.yo.yo.processVNSound(r4)
            r29 = r4
            long r4 = r29.length()
            X.1cz r6 = r0.A0P
            java.io.File r11 = r6.A09
            r14 = 99
            r12 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 > 0) goto L_0x0250
            if (r32 == 0) goto L_0x00fa
            int r6 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x00f6
            java.lang.String r7 = "voicenote/file too small; not sending; voiceNoteFileLength="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.whatsapp.util.Log.e((java.lang.String) r6)
        L_0x00f6:
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 > 0) goto L_0x0105
        L_0x00fa:
            int r6 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x0235
            if (r35 == 0) goto L_0x0220
            r0.A07()
        L_0x0103:
            if (r32 == 0) goto L_0x010d
        L_0x0105:
            int r6 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x010d
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 > 0) goto L_0x0114
        L_0x010d:
            X.1zS r6 = r0.A0K
            if (r6 == 0) goto L_0x0114
            r0.A0K(r11, r9, r9)
        L_0x0114:
            X.15N r6 = r0.A12
            r6.A00 = r9
            r7 = 0
            r0.A0P = r7
            X.3Lz r6 = r0.A0M
            if (r6 == 0) goto L_0x0124
            r6.A00()
            r0.A0M = r7
        L_0x0124:
            X.00l r6 = r0.A0j
            r7 = -1
            X.1Az r7 = r0.A19
            r7.A00()
            android.os.PowerManager$WakeLock r8 = r0.A0G
            if (r8 == 0) goto L_0x0139
            boolean r7 = r8.isHeld()
            if (r7 == 0) goto L_0x0139
            r8.release()
        L_0x0139:
            X.01V r7 = r0.A0y
            X.C812847o.A00(r6, r7)
            if (r32 == 0) goto L_0x01a8
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 < 0) goto L_0x01bb
            int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r3 <= 0) goto L_0x01bb
            r6 = 50
            android.os.SystemClock.sleep(r6)
            android.media.SoundPool r14 = A1d
            int r15 = A1a
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r14.play(r15, r16, r17, r18, r19, r20)
            X.2h6 r6 = r0.A1K
            boolean r3 = r0.A0W
            r14 = r6
            r15 = r4
            r17 = r1
            r19 = r3
            r14.A02(r15, r17, r19)
            X.1Lu r4 = r0.A1F
            java.io.File r3 = r0.A0Q
            r4.A00(r3)
            X.1zS r3 = r0.A0K
            if (r3 == 0) goto L_0x01a0
            long r1 = r1 / r12
            int r3 = (int) r1
            r0.A0K(r11, r3, r10)
        L_0x017b:
            X.5Sj r1 = r0.A1L
            r1.AZk()
        L_0x0180:
            int r2 = r0.A05
            if (r2 == 0) goto L_0x0194
            r1 = 30
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r4.<init>((java.lang.Object) r0, (int) r2, (int) r1)
            r2 = 2000(0x7d0, double:9.88E-321)
            r1 = r30
            r1.postDelayed(r4, r2)
            r0.A05 = r9
        L_0x0194:
            android.view.View r0 = r0.A0c
            r0.setFocusable(r10)
            r0.setFocusableInTouchMode(r10)
            r0.requestFocus()
            return
        L_0x01a0:
            r2 = r33
            r1 = r29
            r0.A0L(r1, r11, r2)
            goto L_0x017b
        L_0x01a8:
            r6 = 0
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0216
            X.2h6 r6 = r0.A1K
            boolean r3 = r0.A0W
            r12 = r6
            r13 = r4
            r15 = r1
            r17 = r3
            r12.A01(r13, r15, r17)
            goto L_0x0216
        L_0x01bb:
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0216
            android.media.SoundPool r12 = A1d
            int r13 = A1Z
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 0
            r17 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r12.play(r13, r14, r15, r16, r17, r18)
            X.2h6 r7 = r0.A1K
            boolean r3 = r0.A0W
            r18 = r3
            X.1B0 r3 = r7.A05
            r17 = r3
            long r14 = r7.A01
            long r12 = r7.A02
            boolean r3 = r7.A03
            long r7 = r7.A00
            r16 = 3
            r19 = r1
            r21 = r14
            r23 = r12
            r25 = r7
            r27 = r18
            r28 = r3
            r15 = r17
            r17 = r4
            r15.A00(r16, r17, r19, r21, r23, r25, r27, r28)
            android.content.res.Resources r2 = r6.getResources()
            r1 = 2131167277(0x7f07082d, float:1.7948823E38)
            int r1 = r2.getDimensionPixelSize(r1)
            float r5 = (float) r1
            r4 = 2131232535(0x7f080717, float:1.8081182E38)
            r3 = 2131892817(0x7f121a51, float:1.9420393E38)
            r2 = 0
            X.013 r1 = r0.A11
            boolean r1 = r1.A0T()
            if (r1 == 0) goto L_0x0213
            float r5 = -r5
        L_0x0213:
            r0.A0F(r2, r5, r4, r3)
        L_0x0216:
            r1 = r29
            r0.A0I(r1)
            r0.A0I(r11)
            goto L_0x0180
        L_0x0220:
            int r17 = A1X
            if (r17 == 0) goto L_0x0103
            android.media.SoundPool r16 = A1d
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r16.play(r17, r18, r19, r20, r21, r22)
            goto L_0x0103
        L_0x0235:
            if (r32 != 0) goto L_0x0105
            int r6 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x010d
            int r17 = A1X
            if (r17 == 0) goto L_0x010d
            android.media.SoundPool r16 = A1d
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r16.play(r17, r18, r19, r20, r21, r22)
            goto L_0x010d
        L_0x0250:
            if (r32 == 0) goto L_0x00fa
            goto L_0x00f6
        L_0x0254:
            long r1 = r0.A0A
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZK.A0U(boolean, boolean, boolean, boolean):void");
    }

    public boolean A0V() {
        C30811cz r0 = this.A0P;
        return r0 != null && r0.A06.isRecording();
    }
}

package X;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;

/* renamed from: X.2DE  reason: invalid class name */
public class AnonymousClass2DE {
    public static Pair A00(Activity activity, View view, View view2, C14870pt r27, C16040sK r28, C16000sG r29, C16080sP r30, AnonymousClass2Ao r31, C17200uh r32, AnonymousClass1B5 r33, C19610yi r34, C15860rz r35, AnonymousClass013 r36, C14710pd r37, C16320sq r38, AnonymousClass01D r39, AnonymousClass01D r40, String str) {
        AnonymousClass2Ao r11 = r31;
        View view3 = view2;
        Activity activity2 = activity;
        if (r31 == null) {
            Context baseContext = activity2.getBaseContext();
            StringBuilder sb = new StringBuilder("out-of-chat-");
            sb.append(str);
            r11 = r32.A04(baseContext, sb.toString());
        }
        AnonymousClass013 r15 = r36;
        C15860rz r14 = r35;
        C19610yi r13 = r34;
        AnonymousClass1B5 r12 = r33;
        AnonymousClass01D r3 = r39;
        C16040sK r8 = r28;
        C16000sG r9 = r29;
        C16080sP r10 = r30;
        if (view2 == null) {
            view3 = C004601z.A0E(view, R.id.out_of_chat_playback_holder);
            activity2.getLayoutInflater().inflate(R.layout.layout0429, (ViewGroup) view3, true);
            C004601z.A0E(view3, R.id.out_of_chat_close_btn).setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(r13, 41, r3));
            C004601z.A0E(view3, R.id.out_of_chat_playback_btn).setOnClickListener(new C62243Cn(activity2, view3, r8, r9, r10, r11, r12, r13, r14, r15));
            C004601z.A0E(view3, R.id.out_of_chat_layout).setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(r13, 42, r3));
        }
        AnonymousClass2DT A00 = r13.A00();
        if (A00 != null) {
            C14710pd r16 = r37;
            A00.A0J = new AnonymousClass3FN(activity2, view3, r27, r8, r9, r10, r11, r12, r13, r14, r15, r16, r38, r40);
            A00.A0C = activity2;
        }
        AnonymousClass2DT A002 = r13.A00();
        if (A002 != null) {
            A002.A0N = new C84554Kz(view3, r13, r3);
        }
        A01(view3, r8, r9, r10, r11, r13, r15);
        view3.setVisibility(0);
        AnonymousClass1B9 r2 = (AnonymousClass1B9) r3.get();
        if (!r2.A01) {
            r2.A06.A02(r2.A08);
            r2.A01 = true;
        }
        if (r13.A0B()) {
            r13.A05();
        }
        AnonymousClass2DT A003 = r13.A00();
        if (A003 != null) {
            A003.A0X = true;
        }
        return new Pair(view3, r11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.view.View r9, X.C16040sK r10, X.C16000sG r11, X.C16080sP r12, X.AnonymousClass2Ao r13, X.C19610yi r14, X.AnonymousClass013 r15) {
        /*
            r0 = 2131364959(0x7f0a0c5f, float:1.834977E38)
            android.view.View r3 = X.C004601z.A0E(r9, r0)
            com.obwhatsapp.WaImageButton r3 = (com.obwhatsapp.WaImageButton) r3
            boolean r0 = r14.A0B()
            if (r0 == 0) goto L_0x0172
            A05(r3)
        L_0x0012:
            X.2DT r2 = r14.A00()
            X.1rH r8 = r14.A01()
            if (r8 == 0) goto L_0x00e6
            r0 = 2131364961(0x7f0a0c61, float:1.8349774E38)
            android.view.View r1 = X.C004601z.A0E(r9, r0)
            com.obwhatsapp.voicerecorder.VoiceNoteSeekBar r1 = (com.obwhatsapp.voicerecorder.VoiceNoteSeekBar) r1
            r0 = 0
            r1.setEnabled(r0)
            r1.setLongClickable(r0)
            r0 = 1
            r1.A0A = r0
            if (r2 == 0) goto L_0x0044
            int r0 = r2.A03
            r1.setMax(r0)
            int r0 = r2.A03()
            r1.setProgress(r0)
            X.4xO r0 = new X.4xO
            r0.<init>(r3, r8, r1)
            r2.A0K = r0
        L_0x0044:
            r0 = 2131364956(0x7f0a0c5c, float:1.8349764E38)
            android.view.View r7 = X.C004601z.A0E(r9, r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 2131364954(0x7f0a0c5a, float:1.834976E38)
            android.view.View r6 = X.C004601z.A0E(r9, r0)
            r0 = 2131364951(0x7f0a0c57, float:1.8349754E38)
            android.view.View r5 = X.C004601z.A0E(r9, r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 2131364955(0x7f0a0c5b, float:1.8349762E38)
            android.view.View r4 = X.C004601z.A0E(r9, r0)
            boolean r0 = r8.A1B()
            r3 = 0
            r2 = 8
            if (r0 != 0) goto L_0x0115
            r0 = 2131230882(0x7f0800a2, float:1.807783E38)
            r7.setImageResource(r0)
            r6.setVisibility(r2)
            r0 = 2131231472(0x7f0802f0, float:1.8079026E38)
        L_0x0079:
            r5.setImageResource(r0)
            r5.setVisibility(r3)
            r4.setVisibility(r2)
        L_0x0082:
            r0 = 2131364962(0x7f0a0c62, float:1.8349776E38)
            android.view.View r4 = X.C004601z.A0E(r9, r0)
            com.obwhatsapp.TextEmojiLabel r4 = (com.obwhatsapp.TextEmojiLabel) r4
            android.content.Context r1 = r9.getContext()
            X.1Vw r5 = r8.A11
            boolean r0 = r5.A02
            r6 = 1
            if (r0 == 0) goto L_0x00f4
            r0 = 2131893160(0x7f121ba8, float:1.9421089E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x009d:
            X.0rv r1 = r5.A00
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x00c9
            if (r1 == 0) goto L_0x00c9
            X.0sH r0 = r11.A0A(r1)
            java.lang.String r5 = r12.A09(r0)
            boolean r2 = r15.A0T()
            java.lang.String r1 = " • "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r2 == 0) goto L_0x00e7
            r0.<init>()
            r0.append(r5)
            r0.append(r1)
            r0.append(r7)
        L_0x00c5:
            java.lang.String r7 = r0.toString()
        L_0x00c9:
            r4.setSelected(r6)
            r1 = 0
            r0 = 100
            r4.A0H(r7, r1, r0, r3)
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            if (r0 == 0) goto L_0x00e6
            android.view.ViewTreeObserver r2 = r4.getViewTreeObserver()
            r1 = 23
            com.facebook.redex.IDxLListenerShape144S0100000_2_I0 r0 = new com.facebook.redex.IDxLListenerShape144S0100000_2_I0
            r0.<init>(r4, r1)
            r2.addOnGlobalLayoutListener(r0)
        L_0x00e6:
            return
        L_0x00e7:
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            r0.append(r5)
            goto L_0x00c5
        L_0x00f4:
            X.0rv r0 = r5.A00
            boolean r2 = X.C16030sJ.A0L(r0)
            if (r2 == 0) goto L_0x0100
            X.0rv r0 = r8.A0B()
        L_0x0100:
            if (r0 == 0) goto L_0x00e6
            X.0sH r1 = r11.A0A(r0)
            java.lang.String r7 = r12.A0B(r1)
            if (r7 != 0) goto L_0x009d
            r0 = 2
            if (r2 == 0) goto L_0x0110
            r0 = 1
        L_0x0110:
            java.lang.String r7 = r12.A0G(r1, r0, r3)
            goto L_0x009d
        L_0x0115:
            int r1 = r8.A08
            r0 = 1
            if (r1 == r0) goto L_0x0138
            java.lang.String r1 = r8.A06
            java.lang.String r0 = "audio/ogg; codecs=opus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0138
            boolean r0 = X.C30921dB.A05(r8)
            if (r0 != 0) goto L_0x0138
        L_0x012a:
            r0 = 2131230882(0x7f0800a2, float:1.807783E38)
            r7.setImageResource(r0)
            r6.setVisibility(r2)
            r0 = 2131232062(0x7f08053e, float:1.8080223E38)
            goto L_0x0079
        L_0x0138:
            boolean r0 = r8.A1A()
            if (r0 != 0) goto L_0x012a
            X.1Vw r1 = r8.A11
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x015e
            r10.A0B()
            X.1Zb r0 = r10.A01
            if (r0 == 0) goto L_0x0082
            r10.A0B()
            X.1Zb r0 = r10.A01
        L_0x0150:
            r13.A06(r7, r0)
            r6.setVisibility(r2)
            r5.setVisibility(r2)
            r4.setVisibility(r3)
            goto L_0x0082
        L_0x015e:
            X.0rv r1 = r1.A00
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x016a
            X.0rv r1 = r8.A0B()
        L_0x016a:
            X.AnonymousClass00B.A06(r1)
            X.0sH r0 = r11.A0A(r1)
            goto L_0x0150
        L_0x0172:
            A06(r3)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2DE.A01(android.view.View, X.0sK, X.0sG, X.0sP, X.2Ao, X.0yi, X.013):void");
    }

    public static void A02(View view, C19610yi r3) {
        C84554Kz r1;
        AnonymousClass2DT A00 = r3.A00();
        if (A00 != null && view != null && (r1 = A00.A0N) != null && r1.A00 == view) {
            r1.A00 = null;
        }
    }

    public static void A03(View view, C19610yi r2) {
        r2.A0A(false);
        View findViewById = view.findViewById(R.id.out_of_chat_playback_holder);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            r2.A04();
        }
    }

    public static void A04(View view, C19610yi r4, AnonymousClass01D r5) {
        r4.A0A(false);
        View findViewById = view.findViewById(R.id.out_of_chat_playback_holder);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            if (viewGroup.getLayoutTransition() == null) {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.addTransitionListener(new C91004fD(layoutTransition, findViewById, viewGroup));
                viewGroup.setLayoutTransition(layoutTransition);
            }
            findViewById.setVisibility(8);
            A09(r4, r5);
        }
    }

    public static void A05(ImageButton imageButton) {
        imageButton.setImageResource(R.drawable.inline_audio_pause);
        imageButton.setContentDescription(imageButton.getContext().getString(R.string.str0f30));
    }

    public static void A06(ImageButton imageButton) {
        imageButton.setImageDrawable(AnonymousClass00T.A04(imageButton.getContext(), R.drawable.inline_audio_play));
        imageButton.setContentDescription(imageButton.getContext().getString(R.string.str1d62));
    }

    public static void A07(C19610yi r1) {
        AnonymousClass2DT A00 = r1.A00();
        if (A00 != null) {
            A00.A0C = null;
        }
    }

    public static void A08(C19610yi r3, C15860rz r4, C15830rv r5) {
        if (r3.A0B()) {
            synchronized (r3) {
                AnonymousClass2DT r1 = r3.A00;
                if (r1 != null) {
                    r1.A0Y = false;
                    AnonymousClass1B4 r12 = r1.A0l;
                    r12.A06 = true;
                    r12.A0F.A03(14, (String) null);
                }
            }
            r3.A0A(true);
            A0B(r4, r5);
        }
    }

    public static void A09(C19610yi r4, AnonymousClass01D r5) {
        r4.A0A(false);
        r4.A06();
        r4.A07();
        AnonymousClass1B9 r2 = (AnonymousClass1B9) r5.get();
        if (r2.A01) {
            r2.A06.A03(r2.A08);
            r2.A01 = false;
        }
        ((AnonymousClass1B9) r5.get()).A00 = null;
    }

    public static void A0A(C19610yi r2, AnonymousClass01D r3) {
        synchronized (r2) {
            AnonymousClass2DT r0 = r2.A00;
            r2.A02 = r0 != null ? r0.A0O : r2.A01;
        }
        r2.A0A(false);
        r2.A06();
        r2.A07();
        AnonymousClass1B9 r22 = (AnonymousClass1B9) r3.get();
        if (r22.A01) {
            r22.A06.A03(r22.A08);
            r22.A01 = false;
        }
        ((AnonymousClass1B9) r3.get()).A00 = null;
    }

    public static void A0B(C15860rz r4, C15830rv r5) {
        SharedPreferences.Editor A0K;
        SharedPreferences sharedPreferences;
        String str;
        if (r5 != null) {
            if (C16030sJ.A0G(r5)) {
                A0K = r4.A0K();
                sharedPreferences = (SharedPreferences) r4.A01.get();
                str = "ptt_out_of_chat_broadcast";
            } else {
                boolean A0L = C16030sJ.A0L(r5);
                A0K = r4.A0K();
                sharedPreferences = (SharedPreferences) r4.A01.get();
                str = A0L ? "ptt_out_of_chat_group" : "ptt_out_of_chat_individual";
            }
            A0K.putLong(str, sharedPreferences.getLong(str, 0) + 1).apply();
        }
    }
}

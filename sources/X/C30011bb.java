package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape177S0100000_2_I0;
import com.facebook.redex.IDxKListenerShape254S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment;
import com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView;
import com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView;
import com.obwhatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.obwhatsapp.conversation.conversationrow.InteractiveMessageView;
import com.obwhatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.obwhatsapp.reactions.ReactionsBottomSheetDialogFragment;
import com.obwhatsapp.yo.Conversation;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.1bb  reason: invalid class name and case insensitive filesystem */
public abstract class C30011bb extends C30021bc implements C30061bg {
    public int A00 = 0;
    public int A01;
    public int A02;
    public View A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public FrameLayout A07;
    public ImageView A08;
    public ImageView A09;
    public ImageView A0A;
    public ImageView A0B;
    public LinearLayout A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public AnonymousClass05M A0H;
    public C19980zJ A0I;
    public C14870pt A0J;
    public C17090uW A0K;
    public C16040sK A0L;
    public AnonymousClass10X A0M;
    public C15900s5 A0N;
    public C17130ua A0O;
    public TextEmojiLabel A0P;
    public TextEmojiLabel A0Q;
    public C16760tb A0R;
    public C18640x1 A0S;
    public C17170ue A0T;
    public C25821Lg A0U;
    public AnonymousClass01Y A0V;
    public C204310c A0W;
    public AnonymousClass1SN A0X;
    public C17230uk A0Y;
    public C18260wP A0Z;
    public C16000sG A0a;
    public C18190wI A0b;
    public C17030uP A0c;
    public C16080sP A0d;
    public C17200uh A0e;
    public C23181Au A0f;
    public C25831Lh A0g;
    public AnonymousClass2a9 A0h;
    public AnonymousClass1MY A0i;
    public AnonymousClass1LA A0j;
    public C56572nv A0k;
    public ConversationRowParticipantHeaderMainView A0l;
    public ConversationRowParticipantHeaderQuotedView A0m;
    public C52832eW A0n;
    public C609536t A0o;
    public C25801Le A0p;
    public C18180wH A0q;
    public C16440t3 A0r;
    public C17120uZ A0s;
    public C15860rz A0t;
    public C15810rt A0u;
    public C216114t A0v;
    public C16460t6 A0w;
    public C27531Sc A0x;
    public AnonymousClass188 A0y;
    public C16070sO A0z;
    public AnonymousClass10B A10;
    public C18550ws A11;
    public C26081Mg A12;
    public AnonymousClass186 A13;
    public AnonymousClass11G A14;
    public AnonymousClass119 A15;
    public AnonymousClass15G A16;
    public C16500tA A17;
    public C18030w2 A18;
    public C17250um A19;
    public C20260zl A1A;
    public C17240ul A1B;
    public C18210wK A1C;
    public C19990zK A1D;
    public C222717h A1E;
    public C17190ug A1F;
    public AnonymousClass1L9 A1G;
    public C19800z1 A1H;
    public C26701Ou A1I;
    public C227919h A1J;
    public C18290wS A1K;
    public AnonymousClass1DY A1L;
    public C86424Sq A1M;
    public C17020u3 A1N;
    public C26141Mm A1O;
    public C27121Qn A1P;
    public AnonymousClass1ML A1Q;
    public C211613a A1R;
    public AnonymousClass1RU A1S;
    public C26721Ow A1T;
    public C18570wu A1U;
    public C25781Lc A1V;
    public AnonymousClass1MF A1W;
    public C50772aQ A1X;
    public C27651Sp A1Y;
    public C17220uj A1Z;
    public C216014s A1a;
    public AnonymousClass135 A1b;
    public C17110uY A1c;
    public C25791Ld A1d;
    public C16320sq A1e;
    public Runnable A1f;
    public Runnable A1g;
    public boolean A1h;
    public boolean A1i = false;
    public boolean A1j = false;
    public boolean A1k = true;
    public final View.OnClickListener A1l = new ViewOnClickCListenerShape9S0100000_I0_2(this, 31);
    public final View.OnKeyListener A1m = new IDxKListenerShape254S0100000_2_I0(this, 0);
    public final View.OnLongClickListener A1n = new IDxCListenerShape177S0100000_2_I0(this, 1);
    public final AnonymousClass38Z A1o = new AnonymousClass38Z(this);
    public final C82744Dz A1p = new C82744Dz(this);
    public final AnonymousClass4E0 A1q = new AnonymousClass4E0(this);
    public final Runnable A1r = new RunnableRunnableShape7S0100000_I0_6(this, 30);
    public boolean prevon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30011bb(Context context, AnonymousClass1YG r14, C16740tZ r15) {
        super(context, r14, r15);
        AnonymousClass013 r7;
        int i2;
        int i3;
        int i4;
        int i5;
        if (r14 != null) {
            this.A0S = r14.AAs() == 2;
        }
        setClipToPadding(false);
        setClipChildren(false);
        int A012 = this.A0c.A01(context);
        int A002 = AnonymousClass1UP.A00(context);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0583);
        if (this.A0S) {
            int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.dimen0066);
            setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize2);
        } else if (r15.A0C != 6 || r15.A10 == 8) {
            if (A0k()) {
                r7 = this.A0K;
                Rect rect = C30031bd.A0g;
                i2 = rect.left;
                i3 = rect.top + dimensionPixelSize;
                i4 = rect.right;
                i5 = rect.bottom;
            } else {
                boolean z2 = r15.A11.A02;
                r7 = this.A0K;
                Rect rect2 = z2 ? C30031bd.A0i : C30031bd.A0h;
                i2 = rect2.left + A002;
                i3 = rect2.top + dimensionPixelSize;
                i4 = A002 + rect2.right;
                i5 = rect2.bottom;
            }
            C45902Bo.A0A(this, r7, i2, i3, i4, A012 + i5);
            setMinimumHeight((int) getResources().getDimension(R.dimen.dimen0277));
        } else {
            Rect rect3 = C30031bd.A0h;
            setPadding(A002, (dimensionPixelSize + rect3.top) - getResources().getDimensionPixelSize(R.dimen.dimen02b7), A002, (A012 + rect3.bottom) - getResources().getDimensionPixelSize(R.dimen.dimen02b7));
        }
        setBackground(new AnonymousClass3LB(this));
        this.A0E = (TextView) findViewById(R.id.date);
        this.A0B = (ImageView) findViewById(R.id.status);
        this.A0l = !this.A0S ? (ConversationRowParticipantHeaderMainView) findViewById(R.id.name_in_group) : null;
        this.A04 = (ViewGroup) findViewById(R.id.date_wrapper);
        A1J(false);
        if (A1K()) {
            setLongClickable(true);
            setOnLongClickListener(this.A1n);
        }
        AnonymousClass1YG r0 = this.A0b;
        if (r0 == null || !r0.AHi() || (this instanceof AnonymousClass31J)) {
            View view = this.A0E;
            if (view != null) {
                view.setVisibility(8);
            }
            C56572nv r02 = this.A0k;
            if (r02 != null) {
                r02.setRowSelected(false);
            }
        } else {
            A0v();
            C56572nv r1 = this.A0k;
            AnonymousClass00B.A06(r14);
            r1.setRowSelected(r14.AJI(r15));
        }
        this.A1M = new C86424Sq();
    }

    public static int A00(C30031bd r1) {
        return TextUtils.isEmpty(((C16730tY) r1.A0O).A13()) ? R.drawable.broadcast_status_icon_onmedia : R.drawable.broadcast_status_icon;
    }

    public static int A01(C30031bd r0, DynamicButtonsLayout dynamicButtonsLayout, int i2) {
        return i2 + dynamicButtonsLayout.A01(r0.A0D.getMeasuredWidth());
    }

    public static int A02(C30031bd r2, TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout) {
        return r2.getMeasuredHeight() + templateQuickReplyButtonsLayout.A00(r2.A0D.getMeasuredWidth());
    }

    public static Drawable A03(View view) {
        Drawable A042 = AnonymousClass00T.A04(view.getContext(), R.drawable.ic_ephemeral_v2);
        AnonymousClass00B.A06(A042);
        return AnonymousClass2SR.A06(A042, AnonymousClass00T.A00(view.getContext(), R.color.color0187));
    }

    public static Drawable A04(View view) {
        return AnonymousClass2SR.A02(view.getContext(), R.drawable.keep, R.color.color090b);
    }

    public static C49132Rg A05(C16150sX r1, C52652eD r2, C30011bb r3, Object obj) {
        r3.A0O = (C17130ua) obj;
        r3.A0u = (C15810rt) r1.A43.get();
        r3.A19 = (C17250um) r1.A7e.get();
        r3.A0N = (C15900s5) r1.ALm.get();
        r3.A1a = (C216014s) r1.AMr.get();
        r3.A14 = (AnonymousClass11G) r1.ANN.get();
        r3.A0R = (C16760tb) r1.APV.get();
        r3.A0W = (C204310c) r1.A3O.get();
        return r2.A05;
    }

    public static C16150sX A06(C52652eD r1, C30031bd r2) {
        C16150sX r12 = r1.A07;
        r2.A0M = (C14710pd) r12.A05.get();
        r2.A0P = (AnonymousClass1PD) r12.AEP.get();
        r2.A0F = (C16300so) r12.A5p.get();
        r2.A0N = (AnonymousClass1P7) r12.ADc.get();
        r2.A0J = (AnonymousClass01V) r12.AOi.get();
        r2.A0K = (AnonymousClass013) r12.AR8.get();
        return r12;
    }

    public static C52652eD A07(C30041be r0) {
        return (C52652eD) ((C52642eC) r0.generatedComponent());
    }

    public static C17230uk A08(C16150sX r1, C30011bb r2) {
        r2.A0c = (C17030uP) r1.APp.get();
        r2.A0t = (C15860rz) r1.AQh.get();
        return (C17230uk) r1.A4I.get();
    }

    public static C54592ho A09(View view, C28381Vw r2, boolean z2) {
        C54592ho r1 = new C54592ho(view.getContext());
        r1.A07 = z2;
        C15830rv r0 = r2.A00;
        AnonymousClass00B.A06(r0);
        r1.A03 = r0;
        r1.A04 = r2;
        return r1;
    }

    public static C34331k5 A0A(TextView textView, AnonymousClass2Q7 r5, C16730tY r6) {
        r5.A18(textView, Collections.singletonList(r6), r6.A01);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
        C34331k5 r0 = r5.A09;
        textView.setOnClickListener(r0);
        return r0;
    }

    public static Object A0B(C49132Rg r0, C16150sX r1, C30011bb r2) {
        r2.A1A = r0.A0I();
        r2.A0K = (C17090uW) r1.ADM.get();
        r2.A1R = (C211613a) r1.A1E.get();
        r2.A1C = (C18210wK) r1.AE4.get();
        r2.A0I = (C19980zJ) r1.A0P.get();
        r2.A0e = (C17200uh) r1.A52.get();
        r2.A11 = (C18550ws) r1.ADB.get();
        r2.A1F = (C17190ug) r1.AEu.get();
        r2.A0a = (C16000sG) r1.A4x.get();
        r2.A0U = (C25821Lg) r1.AMI.get();
        r2.A0d = (C16080sP) r1.AQ9.get();
        return r1.A9x.get();
    }

    public static Object A0C(C16150sX r1, C30011bb r2) {
        r2.A0Q = C16150sX.A19(r1);
        r2.A0L = (C26101Mi) r1.AQU.get();
        r2.A0G = (AnonymousClass1L8) r1.A5W.get();
        r2.A0r = (C16440t3) r1.AP2.get();
        r2.A0J = (C14870pt) r1.AB3.get();
        r2.A1D = (C19990zK) r1.AEZ.get();
        r2.A1c = (C17110uY) r1.ADT.get();
        r2.A1e = (C16320sq) r1.ARB.get();
        r2.A0L = (C16040sK) r1.ADr.get();
        r2.A0p = (C25801Le) r1.AFa.get();
        r2.A0M = (AnonymousClass10X) r1.ALc.get();
        return r1.AN9.get();
    }

    public static void A0E(Context context, TextView textView, C30011bb r3) {
        textView.setBackgroundResource(R.drawable.date_balloon);
        Conversation.tvBalloons(textView);
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.dimen027a));
        textView.setTextSize(r3.getDividerFontSize());
    }

    public static void A0F(Intent intent, View view, View view2, Object obj) {
        C455529g.A08(view.getContext(), intent, view2, new C54602hp(view.getContext()), C47612Jr.A04(obj.toString()));
    }

    public static void A0G(Resources resources, C005302h r5, C30011bb r6, C16010sH r7, int i2) {
        r5.A06(resources.getString(i2, new Object[]{r6.A0d.A08(r7)}));
        r5.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
        r5.A07(true);
        r5.create().show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r9 = r14;
        r11.A0i.A00(java.lang.Boolean.valueOf(r14), java.lang.Boolean.valueOf(r8), 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r10 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r0 = r10.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r4 = ((X.C450927a) r0).A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r0 = X.C24561Gk.A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r0 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r2 = com.obwhatsapp.PhoneHyperLinkDialogFragment.A01(r4, r5, r13, r7, r8, r9);
        r1 = (X.C14550pN) X.C19980zJ.A00(r11.getContext());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r1.AIm() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1.Afb(r2, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if ((!((X.AnonymousClass284) r10.first).A00()) != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r10 != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r0 = r10.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r0 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (((X.C450927a) r0).A04 == 1) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A0H(android.util.Pair r10, X.C30011bb r11, java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            r5 = r12
            r1 = 1
            if (r10 == 0) goto L_0x0011
            java.lang.Object r0 = r10.first
            X.284 r0 = (X.AnonymousClass284) r0
            boolean r0 = r0.A00()
            r0 = r0 ^ 1
            r7 = 0
            if (r0 == 0) goto L_0x0014
        L_0x0011:
            r7 = 1
            if (r10 == 0) goto L_0x001f
        L_0x0014:
            java.lang.Object r0 = r10.second
            if (r0 == 0) goto L_0x001f
            X.27a r0 = (X.C450927a) r0
            int r0 = r0.A04
            r8 = 1
            if (r0 == r1) goto L_0x0020
        L_0x001f:
            r8 = 0
        L_0x0020:
            X.1MY r3 = r11.A0i
            r2 = 3
            r9 = r14
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r3.A00(r1, r0, r2)
            r3 = 0
            if (r10 == 0) goto L_0x005a
            java.lang.Object r0 = r10.second
            if (r0 == 0) goto L_0x005a
            X.27a r0 = (X.C450927a) r0
            com.whatsapp.jid.UserJid r4 = r0.A0C
        L_0x003a:
            java.lang.String r0 = X.C24561Gk.A04(r4)
            if (r0 == 0) goto L_0x0041
            r5 = r0
        L_0x0041:
            r6 = r13
            com.obwhatsapp.PhoneHyperLinkDialogFragment r2 = com.obwhatsapp.PhoneHyperLinkDialogFragment.A01(r4, r5, r6, r7, r8, r9)
            android.content.Context r0 = r11.getContext()
            android.app.Activity r1 = X.C19980zJ.A00(r0)
            X.0pN r1 = (X.C14550pN) r1
            boolean r0 = r1.AIm()
            if (r0 != 0) goto L_0x0059
            r1.Afb(r2, r3)
        L_0x0059:
            return
        L_0x005a:
            r4 = r3
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30011bb.A0H(android.util.Pair, X.1bb, java.lang.String, java.lang.String, boolean):void");
    }

    public static void A0I(View view, C30031bd r3) {
        Drawable A042 = AnonymousClass00T.A04(view.getContext(), R.drawable.balloon_centered_normal);
        AnonymousClass00B.A06(A042);
        view.setBackground(A042);
        r3.A0R = false;
    }

    public static void A0J(View view, C30031bd r6) {
        View view2 = r6.A0D;
        view.layout(view2.getLeft(), view2.getBottom(), view2.getRight(), view.getMeasuredHeight() + view2.getBottom());
    }

    public static void A0K(View view, C30011bb r2) {
        view.setOnLongClickListener(r2.A1n);
    }

    public static void A0L(View view, C30011bb r2, C16740tZ r3, Object obj) {
        C004601z.A0n(view, C47612Jr.A04(obj.toString()));
        C004601z.A0n(r2.A0E, C47612Jr.A03(r3));
        ImageView imageView = r2.A0B;
        if (imageView != null) {
            StringBuilder sb = new StringBuilder("status-transition-");
            sb.append(r3.A11);
            C004601z.A0n(imageView, sb.toString());
        }
    }

    public static void A0M(C49132Rg r1, C16150sX r2, C52652eD r3, C30011bb r4, AnonymousClass01J r5) {
        r4.A0Z = (C18260wP) r5.get();
        r4.A1Q = r1.A0c();
        r4.A0v = (C216114t) r2.A5O.get();
        r4.A0y = (AnonymousClass188) r2.A8P.get();
        r4.A0j = (AnonymousClass1LA) r2.AIg.get();
        r4.A1Y = (C27651Sp) r2.ANj.get();
        r4.A1G = (AnonymousClass1L9) r2.AFI.get();
        r4.A0X = (AnonymousClass1SN) r2.AD0.get();
        r4.A0i = (AnonymousClass1MY) r2.AIf.get();
        r4.A0s = (C17120uZ) r2.AQT.get();
        r4.A0q = C16150sX.A0S(r2);
        r4.A1L = (AnonymousClass1DY) r2.A3w.get();
        r4.A0n = r3.A02();
    }

    public static void A0N(C49132Rg r1, C16150sX r2, C52652eD r3, AnonymousClass2QC r4, AnonymousClass01J r5) {
        r4.A05 = (AnonymousClass1D0) r5.get();
        r4.A02 = (AnonymousClass1L3) r2.A4N.get();
        r4.A0A = (AnonymousClass15W) r2.AOC.get();
        r4.A08 = (AnonymousClass15X) r2.AMk.get();
        r4.A06 = (AnonymousClass195) r2.ACz.get();
        r4.A0B = (AnonymousClass15Y) r2.AHo.get();
        r4.A0D = r3.A04();
        r4.A00 = (AnonymousClass15Z) r2.AOg.get();
        r4.A07 = (AnonymousClass1FI) r2.AIq.get();
        r4.A0E = C17270uo.A00(r1.A0E);
        r4.A04 = (AnonymousClass11R) r2.A4a.get();
        r4.A0C = (AnonymousClass1BL) r2.AJE.get();
    }

    public static void A0O(C49132Rg r1, C16150sX r2, C17230uk r3, C30011bb r4) {
        r4.A0Y = r3;
        r4.A0x = (C27531Sc) r2.A7X.get();
        r4.A1H = r2.A1Y();
        r4.A1O = (C26141Mm) r2.A10.get();
        r4.A0T = (C17170ue) r2.A3W.get();
        r4.A1W = (AnonymousClass1MF) r2.ANa.get();
        r4.A1J = (C227919h) r2.AH8.get();
        r4.A0b = C16150sX.A0O(r2);
        r4.A0z = (C16070sO) r2.ABY.get();
        r4.A0h = (AnonymousClass2a9) r1.A0F.get();
        r4.A13 = (AnonymousClass186) r2.AJI.get();
        r4.A1N = (C17020u3) r2.AMG.get();
        r4.A1X = (C50772aQ) r1.A02.get();
    }

    public static void A0P(C16150sX r1, C52652eD r2, AnonymousClass31L r3) {
        r3.A00 = (C16180sb) r1.A8b.get();
        r3.A02 = (AnonymousClass1P8) r1.ADz.get();
        r3.A01 = r2.A01();
    }

    public static void A0Q(C16150sX r1, C30011bb r2) {
        r2.A1V = new C25781Lc();
        r2.A1P = (C27121Qn) r1.A1H.get();
        r2.A10 = (AnonymousClass10B) r1.AD5.get();
        r2.A1U = r1.A1d();
        r2.A1d = (C25791Ld) r1.AFY.get();
        r2.A1I = (C26701Ou) r1.AGb.get();
        r2.A1S = (AnonymousClass1RU) r1.AEd.get();
        r2.A15 = (AnonymousClass119) r1.APO.get();
        r2.A0S = (C18640x1) r1.A3X.get();
        r2.A16 = (AnonymousClass15G) r1.AEe.get();
        r2.A17 = (C16500tA) r1.AMF.get();
        r2.A1b = (AnonymousClass135) r1.AP7.get();
    }

    public static void A0R(C16150sX r1, C30011bb r2) {
        r2.A1K = (C18290wS) r1.AIB.get();
        r2.A18 = (C18030w2) r1.A6W.get();
    }

    public static void A0S(C16150sX r1, C30011bb r2, Object obj) {
        r2.A1Z = (C17220uj) obj;
        r2.A1T = (C26721Ow) r1.A7o.get();
        r2.A12 = (C26081Mg) r1.AIY.get();
        r2.A0f = (C23181Au) r1.A53.get();
        r2.A0g = (C25831Lh) r1.A5Q.get();
        r2.A0w = (C16460t6) r1.A5k.get();
        r2.A0V = (AnonymousClass01Y) r1.A1w.get();
        r2.A1B = (C17240ul) r1.ABK.get();
        r2.A1E = (C222717h) r1.AC3.get();
    }

    public static void A0T(C16150sX r1, AnonymousClass31D r2) {
        r2.A02 = new C809846j();
        r2.A01 = (C26681Os) r1.A39.get();
        r2.A03 = (C24551Gj) r1.A5l.get();
    }

    public static void A0U(C16150sX r1, AnonymousClass2Q7 r2) {
        r2.A1K = (C18290wS) r1.AIB.get();
        r2.A18 = (C18030w2) r1.A6W.get();
        r2.A01 = (C16260sj) r1.AQe.get();
        r2.A06 = (C209212c) r1.AE1.get();
        r2.A07 = (C26691Ot) r1.AE5.get();
        r2.A04 = (AnonymousClass1HE) r1.ALb.get();
        r2.A03 = new C809846j();
        r2.A02 = (C26681Os) r1.A39.get();
        r2.A05 = (C24551Gj) r1.A5l.get();
    }

    public static void A0V(C16750ta r6, C16730tY r7, StringBuilder sb, boolean z2) {
        String str;
        sb.append(z2);
        sb.append(" type:");
        sb.append(r7.A10);
        sb.append(" url:");
        String str2 = r7.A08;
        if (str2 == null) {
            str = null;
        } else {
            try {
                str = C38031q8.A00(new URL(str2));
            } catch (MalformedURLException e2) {
                Log.w("redactedversion/not-url", e2);
                int length = str2.length();
                str = "***";
                if (length > 25) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2.substring(0, length - 25));
                    sb2.append(str);
                    str = sb2.toString();
                }
            }
        }
        sb.append(str);
        sb.append(" file:");
        sb.append(r6.A0F);
        sb.append(" progress:");
        sb.append(r6.A0C);
        sb.append(" transferred:");
        sb.append(r6.A0P);
        sb.append(" transferring:");
        sb.append(r6.A0Z);
        sb.append(" fileSize:");
        sb.append(r6.A0A);
        sb.append(" media_size:");
        sb.append(r7.A01);
        sb.append(" timestamp:");
        sb.append(r7.A0I);
        Log.i(sb.toString());
    }

    public static void A0W(TextEmojiLabel textEmojiLabel, C30011bb r15, String str, int i2) {
        SpannableString valueOf = SpannableString.valueOf(AnonymousClass1ZW.A01(str, new Object[i2]));
        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
            int spanStart = valueOf.getSpanStart(uRLSpan);
            int spanEnd = valueOf.getSpanEnd(uRLSpan);
            valueOf.removeSpan(uRLSpan);
            valueOf.setSpan(new C59142uk(r15.getContext(), r15.A0K, r15.A0J, r15.A0J, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, r15.A0J));
        textEmojiLabel.setText(valueOf);
    }

    public static void A0X(C30011bb r1, InteractiveMessageView interactiveMessageView, C16740tZ r3) {
        interactiveMessageView.setLayoutView(r3.A11.A02 ^ true ? 1 : 0);
        View.OnLongClickListener onLongClickListener = r1.A1n;
        interactiveMessageView.setOnLongClickListener(onLongClickListener);
        interactiveMessageView.A05.setOnLongClickListener(onLongClickListener);
    }

    public static void A0Y(AnonymousClass2Q7 r3, C28381Vw r4) {
        Log.w("viewmessage/ no file");
        if (r3.A1P()) {
            return;
        }
        if (r3.A0c.A08()) {
            C14550pN r1 = (C14550pN) AnonymousClass22N.A01(r3.getContext(), C14550pN.class);
            if (r1 != null) {
                r3.A0P.A01(r1);
                return;
            }
            return;
        }
        r3.getContext().startActivity(C14750ph.A0I(r3.getContext(), r4.A00, r4.hashCode()));
    }

    public static boolean A0Z(C30031bd r0) {
        return TextUtils.isEmpty(((C16730tY) r0.A0O).A13());
    }

    public static boolean A0a(C20260zl r7, C16740tZ r8, int i2, boolean z2) {
        C28381Vw r6 = r8.A11;
        return (!r6.A02 && C16030sJ.A0L(r6.A00) && (i2 <= 1 || r8.A0F != 0 || r8.A10 != 0 || C30921dB.A04(r8) || (C30921dB.A05(r8) && !z2))) || C40561uK.A01(r7, r6.A00);
    }

    public static boolean A0b(File file) {
        return new File(Uri.fromFile(file).getPath()).exists();
    }

    private int getExtraBottomPadding() {
        C56942pD r0;
        int i2 = this.A01;
        if ((i2 != 1 && i2 != 2) || (r0 = this.A0H) == null || r0.getVisibility() == 8) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.dimen066f);
    }

    @Deprecated
    private C16740tZ getFailedMessage() {
        return C38621r6.A0C(this.A0r, this.A1E, getFMessage());
    }

    private AnonymousClass4OI getFailedMessageBundle() {
        C39191s4 r1;
        C39181s3 A0F2;
        C16740tZ r4 = null;
        C39191s4 r5 = null;
        C39181s3 r6 = null;
        C39101rv r7 = null;
        boolean z2 = false;
        boolean z3 = false;
        C16440t3 r3 = this.A0r;
        C222717h r2 = this.A1E;
        C16740tZ fMessage = getFMessage();
        ArrayList arrayList = new ArrayList();
        C16740tZ A0D2 = C38621r6.A0D(r3, r2, fMessage);
        if (A0D2 != null) {
            r4 = A0D2;
            arrayList.add(A0D2);
            z2 = true;
        }
        C39101rv A0G2 = C38621r6.A0G(r3, r2, fMessage);
        if (A0G2 != null) {
            r7 = A0G2;
            arrayList.add(A0G2);
            if (!z2) {
                z2 = true;
            } else {
                z3 = true;
            }
        }
        if ((fMessage instanceof C39171s2) && (A0F2 = C38621r6.A0F(r3, r2, (C39171s2) fMessage)) != null) {
            r6 = A0F2;
            arrayList.add(A0F2);
            if (!z2) {
                z2 = true;
            } else if (!z3) {
                z3 = true;
            }
        }
        C39191s4 r12 = fMessage.A1A;
        if (r12 != null && r12.A11.A02) {
            C16740tZ A0D3 = C38621r6.A0D(r3, r2, r12);
            if ((A0D3 instanceof C39191s4) && (r1 = (C39191s4) A0D3) != null) {
                r5 = r1;
                arrayList.add(r1);
                if (!z2) {
                    z2 = true;
                } else if (!z3) {
                    z3 = true;
                }
            }
        }
        return new AnonymousClass4OI(r4, r5, r6, r7, arrayList, z2, z3);
    }

    /* access modifiers changed from: private */
    public String getMoreInfoString() {
        Context context;
        int i2;
        C40111ta r3;
        C40521uG A002 = this.A13.A00(getFMessage().A13);
        if (A002 == null || (r3 = A002.A00) == null) {
            context = getContext();
            i2 = R.string.str0538;
        } else {
            C32441gM r0 = new C32441gM(r3, 3, 1);
            context = getContext();
            switch (r0.A01()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 7:
                case 8:
                    i2 = R.string.str0537;
                    break;
                default:
                    i2 = R.string.str0539;
                    break;
            }
            i2 = R.string.str0538;
        }
        return C45902Bo.A01(this.A0K, context.getString(i2));
    }

    private float getNameInGroupTextFontSize() {
        return this.A0g.A01(getResources());
    }

    public int A0p(int i2) {
        if (C42881yp.A02(i2, 13) || C42881yp.A02(i2, 5)) {
            return yo.getBubbleTick("message_got_receipt_from_target");
        }
        return i2 == 4 ? yo.getBubbleTick("message_got_receipt_from_server") : yo.getBubbleTick("message_unsent");
    }

    public int A0q(int i2) {
        return C42881yp.A02(i2, 13) ? R.color.color0559 : R.color.color055a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r4 = getHighlightTerms();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A0r(java.lang.CharSequence r7) {
        /*
            r6 = this;
            r3 = r7
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0024
            java.util.List r4 = r6.getHighlightTerms()
            if (r4 == 0) goto L_0x0024
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0024
            android.content.Context r0 = r6.getContext()
            X.013 r1 = r6.A0K
            X.2TP r2 = X.AnonymousClass2TP.A01
            r5 = 0
            X.01Q r0 = X.AnonymousClass2TP.A00(r0, r1, r2, r3, r4, r5)
            java.lang.Object r3 = r0.A00
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30011bb.A0r(java.lang.CharSequence):java.lang.CharSequence");
    }

    public void A0s() {
        AnonymousClass1YG r1;
        if (this instanceof AnonymousClass2Uj) {
            AnonymousClass2Uj r12 = (AnonymousClass2Uj) this;
            if (r12.A1K()) {
                C16740tZ r0 = r12.A0O;
                AnonymousClass1YG r2 = r12.A0b;
                if (r2 != null) {
                    r2.Ag8(r0);
                    r2.Aec(r12.A05, true);
                }
            }
        } else if (A1K() && (r1 = this.A0b) != null && !r1.AHi()) {
            r1.Ag8(getFMessage());
            A1D(getFMessage());
            AnonymousClass1L9 r22 = this.A1G;
            r22.A01 = r22.A04.A00();
            r22.A02 = UUID.randomUUID().toString();
            r22.A00 = 1;
            r22.A03 = r22.A06.A00();
            AnonymousClass1L9 r23 = this.A1G;
            if (r23.A03 && r23.A00 == 1) {
                r23.A00 = 2;
                r23.A00(0);
            }
        }
    }

    public void A0t() {
        A1J(false);
    }

    public void A0u() {
        if (this instanceof AnonymousClass31L) {
            AnonymousClass31L r1 = (AnonymousClass31L) this;
            C16740tZ r4 = r1.A0O;
            r1.A03 = true;
            C25791Ld r2 = r1.A1d;
            AnonymousClass00B.A06(r2);
            r2.A0B(r1.A0D, r4, r1.A0E, r4.A11, false);
        } else if (this instanceof AnonymousClass31I) {
            C61783Ah r12 = ((AnonymousClass31I) this).A04;
            r12.A01 = true;
            C25791Ld r22 = r12.A0I;
            AnonymousClass00B.A06(r22);
            C16730tY r42 = r12.A00;
            r22.A0B(r12.A0F, r42, r12.A0H, r42.A11, false);
        } else if (this instanceof C603030w) {
            C603030w r43 = (C603030w) this;
            C16740tZ r3 = r43.A0O;
            r43.A02 = true;
            r43.A1d.A0D(r3);
            r43.A1d.A07(r43.A0G, r3, r43.A0H);
        } else if (this instanceof AnonymousClass31B) {
            AnonymousClass31B r13 = (AnonymousClass31B) this;
            C16740tZ r44 = r13.A0O;
            r13.A07 = true;
            C25791Ld r23 = r13.A1d;
            AnonymousClass00B.A06(r23);
            r23.A0B(r13.A04, r44, r13.A08, r44.A11, false);
        } else if (this instanceof AnonymousClass318) {
            AnonymousClass318 r14 = (AnonymousClass318) this;
            C16870tm A0F2 = ((C16730tY) r14.A0O).A0F();
            AnonymousClass00B.A06(A0F2);
            if (A0F2.A04()) {
                C25791Ld r24 = r14.A1d;
                AnonymousClass00B.A06(r24);
                C16740tZ r45 = r14.A0O;
                r24.A0A(r14.A09, r45, r14.A0H, r45.A11, 480, false, false);
            }
        }
    }

    public void A0v() {
        View view = this.A0E;
        if (view != null) {
            view.setVisibility(0);
            this.A0E.bringToFront();
            return;
        }
        C56572nv r1 = new C56572nv(getContext(), this);
        this.A0k = r1;
        this.A0E = r1;
        r1.setClickable(true);
        this.A0E.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 30));
        setClipToPadding(false);
        setClipChildren(false);
        addView(this.A0E, new RelativeLayout.LayoutParams(-1, -1));
    }

    public void A0w() {
        UserJid A002;
        StringBuilder sb;
        String str;
        C16740tZ fMessage = getFMessage();
        C38621r6.A0J(fMessage);
        C14550pN r5 = (C14550pN) AnonymousClass22N.A01(getContext(), C14550pN.class);
        if (r5 != null) {
            if (C38621r6.A0g(fMessage)) {
                A002 = ((AnonymousClass1WT) fMessage).A00;
            } else {
                C28381Vw r1 = fMessage.A11;
                A002 = (!C16030sJ.A0L(r1.A00) || (r1.A02 && fMessage.A0C != 6)) ? null : C17240ul.A00(fMessage);
            }
            if (A002 == null) {
                sb = new StringBuilder();
                str = "conversation/getdialogitems/remote_resource is null! ";
            } else if (!C16030sJ.A0L(fMessage.A11.A00) || !C16030sJ.A0M(A002)) {
                r5.Afb(ConversationRow$ConversationRowDialogFragment.A01(A002), (String) null);
                return;
            } else {
                sb = new StringBuilder();
                str = "conversation/getdialogitems/remote_resource is lid ";
            }
            sb.append(str);
            sb.append(C38621r6.A0J(fMessage));
            sb.append("");
            Log.i(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r4 == 100) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0x() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.AnonymousClass31J
            if (r0 == 0) goto L_0x008d
            r7 = r10
            X.31J r7 = (X.AnonymousClass31J) r7
            r6 = 0
        L_0x0008:
            java.util.ArrayList r1 = r7.A08
            int r0 = r1.size()
            if (r6 >= r0) goto L_0x023f
            java.util.List r0 = r7.A06
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x0087
            java.lang.Object r0 = r1.get(r6)
            X.39Z r0 = (X.AnonymousClass39Z) r0
            X.3Ah r0 = r0.A0A
            X.1j5 r5 = r0.A0N
            java.util.List r0 = r7.A06
            java.lang.Object r0 = r0.get(r6)
            X.0tY r0 = (X.C16730tY) r0
            X.0ta r1 = r0.A02
            X.AnonymousClass00B.A06(r1)
            boolean r0 = r1.A0Z
            if (r0 == 0) goto L_0x008b
            boolean r0 = r1.A0X
            if (r0 != 0) goto L_0x008b
            long r0 = r1.A0C
            int r2 = (int) r0
            X.1HE r1 = r7.A03
            java.util.List r0 = r7.A06
            java.lang.Object r0 = r0.get(r6)
            X.0tY r0 = (X.C16730tY) r0
            boolean r0 = r1.A06(r0)
            int r4 = r2 >> 1
            if (r0 == 0) goto L_0x004e
            int r4 = r4 + 50
        L_0x004e:
            if (r4 == 0) goto L_0x0055
            r0 = 100
            r3 = 0
            if (r4 != r0) goto L_0x0056
        L_0x0055:
            r3 = 1
        L_0x0056:
            android.content.Context r1 = r7.getContext()
            r0 = 2131100993(0x7f060541, float:1.7814383E38)
            if (r4 != 0) goto L_0x0062
            r0 = 2131100994(0x7f060542, float:1.7814385E38)
        L_0x0062:
            int r2 = X.AnonymousClass00T.A00(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = "#updateProgress"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.52o r0 = new X.52o
            r0.<init>(r4, r2, r3)
            r5.A06(r0, r1)
        L_0x0087:
            int r6 = r6 + 1
            goto L_0x0008
        L_0x008b:
            r4 = 0
            goto L_0x0055
        L_0x008d:
            boolean r0 = r10 instanceof X.AnonymousClass2Uj
            if (r0 == 0) goto L_0x00e5
            r6 = r10
            X.2Uj r6 = (X.AnonymousClass2Uj) r6
            java.util.List r0 = r6.A05
            r5 = 0
            if (r0 == 0) goto L_0x023f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x023f
            java.util.List r0 = r6.A05
            int r9 = r0.size()
            java.util.List r0 = r6.A05
            java.util.Iterator r8 = r0.iterator()
            r7 = 0
        L_0x00ac:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0206
            java.lang.Object r4 = r8.next()
            X.0tY r4 = (X.C16730tY) r4
            X.0ta r1 = r4.A02
            X.AnonymousClass00B.A06(r1)
            boolean r0 = r1.A0Z
            if (r0 == 0) goto L_0x00de
            boolean r0 = r1.A0X
            if (r0 != 0) goto L_0x00de
            long r2 = r1.A0C
            int r1 = (int) r2
            X.1HE r0 = r6.A02
            boolean r0 = r0.A05(r4)
            if (r0 == 0) goto L_0x00dc
            X.1HE r0 = r6.A02
            boolean r0 = r0.A06(r4)
            int r1 = r1 >> 1
            if (r0 == 0) goto L_0x00dc
            int r1 = r1 + 50
        L_0x00dc:
            int r7 = r7 + r1
            goto L_0x00ac
        L_0x00de:
            boolean r0 = r1.A0P
            if (r0 == 0) goto L_0x00ac
            int r7 = r7 + 100
            goto L_0x00ac
        L_0x00e5:
            boolean r0 = r10 instanceof X.AnonymousClass312
            if (r0 == 0) goto L_0x0100
            r0 = r10
            X.30u r0 = (X.C602830u) r0
            com.obwhatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView r3 = r0.A03
        L_0x00ee:
            X.0tY r2 = r0.getFMessage()
            boolean r0 = r3.isInEditMode()
            if (r0 != 0) goto L_0x023f
            X.1HE r1 = r3.A00
            X.1j5 r0 = r3.A04
            X.AnonymousClass3A3.A00(r1, r2, r0)
            return
        L_0x0100:
            boolean r0 = r10 instanceof X.AnonymousClass31M
            if (r0 == 0) goto L_0x010a
            r0 = r10
            X.31M r0 = (X.AnonymousClass31M) r0
            com.obwhatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView r3 = r0.A08
            goto L_0x00ee
        L_0x010a:
            boolean r0 = r10 instanceof X.AnonymousClass31L
            if (r0 == 0) goto L_0x0145
            r2 = r10
            X.31L r2 = (X.AnonymousClass31L) r2
            X.0tZ r9 = r2.A0O
            X.0tY r9 = (X.C16730tY) r9
            X.0pd r3 = r2.A0M
            r1 = 1418(0x58a, float:1.987E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x013d
            android.widget.TextView r4 = r2.A0B
            X.12c r8 = r2.A06
            X.1HE r7 = r2.A04
            X.2eV r5 = r2.A01
            r3 = 0
            r6 = r3
            X.AnonymousClass3A3.A01(r3, r4, r5, r6, r7, r8, r9)
        L_0x012e:
            X.1j5 r1 = r2.A0H
            X.1HE r0 = r2.A04
            X.AnonymousClass00B.A06(r0)
            int r0 = X.AnonymousClass3A3.A00(r0, r9, r1)
            r2.A1M(r1, r0)
            return
        L_0x013d:
            android.widget.TextView r1 = r2.A0B
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x012e
        L_0x0145:
            boolean r0 = r10 instanceof X.AnonymousClass31I
            if (r0 == 0) goto L_0x0161
            r3 = r10
            X.31I r3 = (X.AnonymousClass31I) r3
            X.3Ah r0 = r3.A04
            X.1j5 r2 = r0.A0N
            X.0tZ r1 = r3.A0O
            X.0tY r1 = (X.C16730tY) r1
            X.1HE r0 = r3.A04
            X.AnonymousClass00B.A06(r0)
            int r0 = X.AnonymousClass3A3.A00(r0, r1, r2)
            r3.A1M(r2, r0)
            return
        L_0x0161:
            boolean r0 = r10 instanceof X.C603030w
            if (r0 == 0) goto L_0x017b
            r3 = r10
            X.30w r3 = (X.C603030w) r3
            X.1j5 r2 = r3.A0J
            X.0tZ r1 = r3.A0O
            X.0tY r1 = (X.C16730tY) r1
            X.1HE r0 = r3.A04
            X.AnonymousClass00B.A06(r0)
            int r0 = X.AnonymousClass3A3.A00(r0, r1, r2)
            r3.A1M(r2, r0)
            return
        L_0x017b:
            boolean r0 = r10 instanceof X.C602930v
            if (r0 == 0) goto L_0x0195
            r3 = r10
            X.30v r3 = (X.C602930v) r3
            X.1j5 r2 = r3.A09
            X.0tZ r1 = r3.A0O
            X.0tY r1 = (X.C16730tY) r1
            X.1HE r0 = r3.A04
            X.AnonymousClass00B.A06(r0)
            int r0 = X.AnonymousClass3A3.A00(r0, r1, r2)
            r3.A1M(r2, r0)
            return
        L_0x0195:
            boolean r0 = r10 instanceof X.AnonymousClass31B
            if (r0 == 0) goto L_0x01af
            r3 = r10
            X.31B r3 = (X.AnonymousClass31B) r3
            X.1j5 r2 = r3.A06
            X.0tZ r1 = r3.A0O
            X.0tY r1 = (X.C16730tY) r1
            X.1HE r0 = r3.A04
            X.AnonymousClass00B.A06(r0)
            int r0 = X.AnonymousClass3A3.A00(r0, r1, r2)
            r3.A1M(r2, r0)
            return
        L_0x01af:
            boolean r0 = r10 instanceof X.C602430q
            if (r0 == 0) goto L_0x01c9
            r3 = r10
            X.30q r3 = (X.C602430q) r3
            X.1j5 r2 = r3.A0C
            X.0tZ r1 = r3.A0O
            X.0tY r1 = (X.C16730tY) r1
            X.1HE r0 = r3.A04
            X.AnonymousClass00B.A06(r0)
            int r0 = X.AnonymousClass3A3.A00(r0, r1, r2)
            r3.A1M(r2, r0)
            return
        L_0x01c9:
            boolean r0 = r10 instanceof X.AnonymousClass318
            if (r0 == 0) goto L_0x01ee
            r0 = r10
            X.318 r0 = (X.AnonymousClass318) r0
            X.0tZ r7 = r0.A0O
            X.0tY r7 = (X.C16730tY) r7
            android.widget.TextView r2 = r0.A0D
            android.view.ViewGroup r1 = r0.A06
            X.013 r4 = r0.A0K
            X.12c r6 = r0.A06
            X.1HE r5 = r0.A04
            X.2eV r3 = r0.A00
            X.AnonymousClass3A3.A01(r1, r2, r3, r4, r5, r6, r7)
            X.1j5 r1 = r0.A0I
            X.1HE r0 = r0.A04
            X.AnonymousClass00B.A06(r0)
            X.AnonymousClass3A3.A00(r0, r7, r1)
            return
        L_0x01ee:
            boolean r0 = r10 instanceof X.AnonymousClass2Q5
            if (r0 == 0) goto L_0x023f
            r3 = r10
            X.2Q5 r3 = (X.AnonymousClass2Q5) r3
            com.obwhatsapp.search.views.itemviews.AudioPlayerView r0 = r3.A09
            X.1j5 r2 = r0.A06
            X.0tZ r1 = r3.A0O
            X.0tY r1 = (X.C16730tY) r1
            X.1HE r0 = r3.A04
            X.AnonymousClass00B.A06(r0)
            X.AnonymousClass3A3.A00(r0, r1, r2)
            return
        L_0x0206:
            if (r9 == 0) goto L_0x023f
            int r4 = r7 / r9
            if (r7 == 0) goto L_0x0210
            r0 = 100
            if (r7 != r0) goto L_0x0211
        L_0x0210:
            r5 = 1
        L_0x0211:
            android.content.Context r1 = r6.getContext()
            r0 = 2131100993(0x7f060541, float:1.7814383E38)
            if (r7 != 0) goto L_0x021d
            r0 = 2131100994(0x7f060542, float:1.7814385E38)
        L_0x021d:
            int r3 = X.AnonymousClass00T.A00(r1, r0)
            X.1j5 r1 = r6.A0E
            android.view.View r0 = r1.A01
            if (r0 == 0) goto L_0x023f
            android.view.View r0 = r1.A02()
            com.obwhatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.obwhatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.1j5 r2 = r0.A05
            java.lang.String r1 = "ConversationRowMediaControlView"
            java.lang.String r0 = "#updateProgress"
            java.lang.String r1 = X.C18450wi.A06(r1, r0)
            X.52n r0 = new X.52n
            r0.<init>(r4, r3, r5)
            r2.A06(r0, r1)
        L_0x023f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30011bb.A0x():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d8, code lost:
        if (r0 != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f8, code lost:
        if ((!A0k()) != false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01fa, code lost:
        r3 = r5.A0I;
        r2 = X.C798641q.A02;
        r0 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018a, code lost:
        if (r0 == false) goto L_0x01fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y() {
        /*
            r5 = this;
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x00b9
            X.2ox r0 = r5.A0I
            if (r0 != 0) goto L_0x0032
            android.content.Context r1 = r5.getContext()
            X.2ox r0 = new X.2ox
            r0.<init>(r1)
            r5.A0I = r0
            r0 = -2
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r2.<init>(r0, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165881(0x7f0702b9, float:1.7945992E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            r2.setMargins(r1, r0, r0, r0)
            X.2ox r0 = r5.A0I
            r0.setLayoutParams(r2)
            X.2ox r0 = r5.A0I
            r5.addView(r0)
        L_0x0032:
            X.2ox r2 = r5.A0I
            android.widget.ImageView r0 = r2.A02
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.A01
            r0.setVisibility(r1)
            android.widget.Space r0 = r2.A03
            r0.setVisibility(r1)
            X.0sK r0 = r5.A0L
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0122
            X.0pd r1 = r5.A0M
            r0 = 1396(0x574, float:1.956E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r0 = r1.A0E(r2, r0)
            if (r0 == 0) goto L_0x0122
            boolean r0 = r5 instanceof X.AnonymousClass31I
            if (r0 == 0) goto L_0x0122
            X.0pd r1 = r5.A0M
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r1.A0E(r2, r0)
            if (r0 == 0) goto L_0x0122
            X.0tZ r1 = r5.A0O
            X.0tY r1 = (X.C16730tY) r1
            X.1rB r1 = (X.C38641rB) r1
            X.1Vw r0 = r1.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0122
            X.1XO r0 = r1.A02
            if (r0 == 0) goto L_0x0122
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0122
            X.2ox r3 = r5.A0I
            X.41q r2 = X.C798641q.AVATAR
            r0 = 19
        L_0x0081:
            com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1 r1 = new com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1
            r1.<init>(r5, r0)
        L_0x0086:
            android.view.View$OnLongClickListener r0 = r5.A1n
            r3.setupActionButton(r2, r1, r0)
        L_0x008b:
            boolean r0 = r5 instanceof X.AnonymousClass30Y
            if (r0 == 0) goto L_0x00ba
            X.0tZ r0 = r5.getFMessage()
            X.1cd r0 = (X.C30591cd) r0
            X.1cf r0 = r0.AGV()
            java.lang.Long r1 = r0.A00
            if (r1 == 0) goto L_0x00b9
        L_0x009d:
            X.0t3 r0 = r5.A0r
            long r3 = r0.A00()
            long r1 = r1.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b9
            X.2ox r2 = r5.A0I
            r0 = 18
            com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1 r1 = new com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1
            r1.<init>(r5, r0)
            android.view.View$OnLongClickListener r0 = r5.A1n
            r2.setupRateButton(r1, r0)
        L_0x00b9:
            return
        L_0x00ba:
            boolean r0 = r5 instanceof X.C602130n
            if (r0 == 0) goto L_0x00cd
            X.0tZ r0 = r5.A0O
            X.1rM r0 = (X.C38751rM) r0
            X.1cd r0 = (X.C30591cd) r0
            X.1cf r0 = r0.AGV()
            java.lang.Long r1 = r0.A00
            if (r1 == 0) goto L_0x00b9
            goto L_0x009d
        L_0x00cd:
            boolean r0 = r5 instanceof X.AnonymousClass310
            if (r0 == 0) goto L_0x00e2
            X.0tZ r0 = r5.A0O
            X.0tY r0 = (X.C16730tY) r0
            X.1rI r0 = (X.C38711rI) r0
            X.1cd r0 = (X.C30591cd) r0
            X.1cf r0 = r0.AGV()
            java.lang.Long r1 = r0.A00
            if (r1 == 0) goto L_0x00b9
            goto L_0x009d
        L_0x00e2:
            boolean r0 = r5 instanceof X.AnonymousClass319
            if (r0 == 0) goto L_0x00f7
            X.0tZ r0 = r5.A0O
            X.0tY r0 = (X.C16730tY) r0
            X.1rF r0 = (X.C38681rF) r0
            X.1cd r0 = (X.C30591cd) r0
            X.1cf r0 = r0.AGV()
            java.lang.Long r1 = r0.A00
            if (r1 == 0) goto L_0x00b9
            goto L_0x009d
        L_0x00f7:
            boolean r0 = r5 instanceof X.C601830k
            if (r0 == 0) goto L_0x010c
            X.0tZ r0 = r5.A0O
            X.0tY r0 = (X.C16730tY) r0
            X.1rR r0 = (X.C38801rR) r0
            X.1cd r0 = (X.C30591cd) r0
            X.1cf r0 = r0.AGV()
            java.lang.Long r1 = r0.A00
            if (r1 == 0) goto L_0x00b9
            goto L_0x009d
        L_0x010c:
            boolean r0 = r5 instanceof X.C601630i
            if (r0 == 0) goto L_0x00b9
            X.0tZ r0 = r5.A0O
            X.0tY r0 = (X.C16730tY) r0
            X.1rA r0 = (X.C38631rA) r0
            X.1cd r0 = (X.C30591cd) r0
            X.1cf r0 = r0.AGV()
            java.lang.Long r1 = r0.A00
            if (r1 == 0) goto L_0x00b9
            goto L_0x009d
        L_0x0122:
            boolean r0 = r5.A0l()
            if (r0 == 0) goto L_0x0144
            android.content.Context r0 = r5.getContext()
            X.1yP r0 = X.AnonymousClass22O.A01(r0)
            if (r0 == 0) goto L_0x008b
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            X.1yj r0 = r0.A00
            X.0sH r0 = r0.A2l
            boolean r0 = r0.A0a
            if (r0 != 0) goto L_0x008b
            X.2ox r3 = r5.A0I
            X.41q r2 = X.C798641q.INFO
            r0 = 20
            goto L_0x0081
        L_0x0144:
            r3 = r5
            boolean r4 = r5 instanceof X.AnonymousClass31K
            if (r4 == 0) goto L_0x0172
            X.0s5 r1 = r5.A0N
            X.0s8 r0 = X.C15910s6.A0v
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0172
            X.0tZ r2 = r5.A0O
            int r1 = r2.A05
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 < r0) goto L_0x0172
            boolean r1 = r5.A0S
            boolean r0 = X.C30921dB.A05(r2)
            if (r0 == 0) goto L_0x0172
            if (r1 != 0) goto L_0x0172
            X.2ox r3 = r5.A0I
            X.41q r2 = X.C798641q.SEARCH
            r0 = 32
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r1 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2
            r1.<init>(r5, r0)
            goto L_0x0086
        L_0x0172:
            X.0tZ r0 = r5.getFMessage()
            int r1 = r0.A05
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 >= r0) goto L_0x008b
            if (r4 == 0) goto L_0x018e
            X.31K r3 = (X.AnonymousClass31K) r3
            boolean r0 = r3.A1N()
        L_0x0184:
            if (r0 == 0) goto L_0x008b
            boolean r0 = r3.A0k()
        L_0x018a:
            if (r0 == 0) goto L_0x01fa
            goto L_0x008b
        L_0x018e:
            boolean r0 = r5 instanceof X.AnonymousClass31D
            if (r0 == 0) goto L_0x01a8
            X.0tZ r1 = r5.A0O
            X.1d9 r1 = (X.C30901d9) r1
            X.1Vw r0 = r1.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x01a3
            int r1 = r1.A02
            r0 = 2
            if (r1 == r0) goto L_0x01a3
            goto L_0x008b
        L_0x01a3:
            boolean r0 = r5.A0k()
            goto L_0x018a
        L_0x01a8:
            boolean r0 = r5 instanceof X.AnonymousClass30W
            if (r0 != 0) goto L_0x01f2
            boolean r0 = r5 instanceof X.C600930a
            if (r0 != 0) goto L_0x01f2
            boolean r0 = r5 instanceof X.AnonymousClass31L
            if (r0 != 0) goto L_0x01e7
            boolean r0 = r5 instanceof X.AnonymousClass31I
            if (r0 != 0) goto L_0x01dc
            boolean r0 = r5 instanceof X.C603030w
            if (r0 != 0) goto L_0x01dc
            boolean r0 = r5 instanceof X.C602930v
            if (r0 != 0) goto L_0x01dc
            boolean r0 = r5 instanceof X.AnonymousClass31B
            if (r0 != 0) goto L_0x01e7
            boolean r0 = r5 instanceof X.C602430q
            if (r0 != 0) goto L_0x01e7
            boolean r0 = r5 instanceof X.AnonymousClass318
            if (r0 != 0) goto L_0x01e7
            boolean r0 = r5 instanceof X.AnonymousClass2Q5
            if (r0 == 0) goto L_0x008b
            X.2Q5 r3 = (X.AnonymousClass2Q5) r3
            boolean r0 = r3 instanceof X.C601230e
            if (r0 != 0) goto L_0x008b
            boolean r0 = r3 instanceof X.AnonymousClass2Q3
            if (r0 == 0) goto L_0x01e7
            goto L_0x008b
        L_0x01dc:
            X.2Q7 r3 = (X.AnonymousClass2Q7) r3
            X.0tY r0 = r3.getFMessage()
            boolean r0 = X.C38621r6.A11(r0)
            goto L_0x0184
        L_0x01e7:
            X.0pd r2 = r3.A0M
            X.0s5 r1 = r3.A0N
            X.0tZ r0 = r3.A0O
            boolean r0 = X.C38621r6.A0W(r1, r2, r0)
            goto L_0x0184
        L_0x01f2:
            boolean r0 = r5.A0k()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008b
        L_0x01fa:
            X.2ox r3 = r5.A0I
            X.41q r2 = X.C798641q.FORWARD
            r0 = 17
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30011bb.A0y():void");
    }

    public void A0z() {
    }

    public final void A10() {
        Handler handler = getHandler();
        if (handler == null) {
            Runnable runnable = this.A1r;
            removeCallbacks(runnable);
            post(runnable);
            return;
        }
        Runnable runnable2 = this.A1r;
        if (!handler.hasMessages(0, runnable2)) {
            Message obtain = Message.obtain(handler, runnable2);
            obtain.what = 0;
            obtain.obj = runnable2;
            obtain.sendToTarget();
        }
    }

    public void A11(int i2) {
        int i3;
        Resources resources;
        int i4;
        this.A01 = i2;
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A0l;
        int i5 = 0;
        if (conversationRowParticipantHeaderMainView != null) {
            int i6 = 8;
            if (A0a(this.A1A, getFMessage(), i2, this.A0S)) {
                i6 = 0;
            }
            conversationRowParticipantHeaderMainView.setVisibility(i6);
        }
        int extraBottomPadding = getExtraBottomPadding();
        if (this instanceof AnonymousClass2QE) {
            i5 = getResources().getDimensionPixelOffset(R.dimen.dimen02b7);
            i3 = getResources().getDimensionPixelOffset(R.dimen.dimen02b5);
        } else {
            i3 = 0;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i7 = (int) ((getContext().getResources().getDisplayMetrics().density * 4.0f) / 3.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0583);
        int i8 = this.A01;
        if (i8 != 1) {
            if (i8 == 2) {
                setPadding(paddingLeft, i7 - i5, paddingRight, (i7 - i3) + extraBottomPadding);
            } else if (i8 != 3) {
                if (this.A1i) {
                    i5 = getResources().getDimensionPixelOffset(R.dimen.dimen02b7);
                }
                setPadding(paddingLeft, dimensionPixelSize - i5, paddingRight, dimensionPixelSize - i3);
                resources = getResources();
                i4 = R.dimen.dimen0277;
            } else {
                setPadding(paddingLeft, i7 - i5, paddingRight, (dimensionPixelSize - i3) + extraBottomPadding);
            }
            resources = getResources();
            i4 = R.dimen.dimen0278;
        } else {
            if (this.A1i) {
                i5 = getResources().getDimensionPixelOffset(R.dimen.dimen02b7);
            }
            setPadding(paddingLeft, dimensionPixelSize - i5, paddingRight, (i7 - i3) + extraBottomPadding);
            resources = getResources();
            i4 = R.dimen.dimen0278;
        }
        setMinimumHeight((int) resources.getDimension(i4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r1 = (r0 = r5.A0b).AAs();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A12(int r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass31J
            if (r0 != 0) goto L_0x002f
            X.1YG r0 = r5.A0b
            if (r0 == 0) goto L_0x002f
            int r1 = r0.AAs()
            if (r1 == 0) goto L_0x0011
            r0 = 2
            if (r1 != r0) goto L_0x002f
        L_0x0011:
            X.0tZ r0 = r5.getFMessage()
            boolean r0 = r5.A0o(r0)
        L_0x0019:
            r3 = 0
            if (r0 != 0) goto L_0x0031
            X.2pD r4 = r5.A0H
            if (r4 == 0) goto L_0x002e
            X.0sK r2 = r5.A0L
            java.util.List r1 = java.util.Collections.emptyList()
            X.23T r0 = new X.23T
            r0.<init>(r2, r1)
            r4.A00(r0, r3)
        L_0x002e:
            return
        L_0x002f:
            r0 = 0
            goto L_0x0019
        L_0x0031:
            X.2pD r0 = r5.A0H
            if (r0 != 0) goto L_0x0054
            android.content.Context r0 = r5.getContext()
            X.2pD r2 = new X.2pD
            r2.<init>(r0)
            r5.A0H = r2
            r1 = 21
            com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1 r0 = new com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1
            r0.<init>(r5, r1)
            r2.setOnClickListener(r0)
            X.2pD r0 = r5.A0H
            r5.addView(r0)
            X.2pD r0 = r5.A0H
            r0.bringToFront()
        L_0x0054:
            X.2pD r2 = r5.A0H
            X.23T r1 = r5.getMessageReactions()
            r0 = 28
            if (r6 == r0) goto L_0x0061
            r0 = -1
            if (r6 != r0) goto L_0x0062
        L_0x0061:
            r3 = 1
        L_0x0062:
            r2.A00(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30011bb.A12(int):void");
    }

    public void A13(int i2, boolean z2) {
        ScaleAnimation scaleAnimation;
        if (!(this instanceof AnonymousClass31I)) {
            ImageView imageView = i2 != 0 ? this.A09 : this.A0A;
            if (imageView != null) {
                if (z2) {
                    scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation.setInterpolator(new OvershootInterpolator());
                    imageView.getViewTreeObserver().addOnPreDrawListener(new C94514l2(imageView, this, i2));
                } else {
                    scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    imageView.setVisibility(0);
                    scaleAnimation.setAnimationListener(new IDxLAdapterShape11S0200000_2_I0(imageView, 1, this));
                    scaleAnimation.setInterpolator(new AnticipateInterpolator());
                }
                scaleAnimation.setDuration(500);
                imageView.startAnimation(scaleAnimation);
            }
        }
    }

    public void A14(int i2, boolean z2) {
        ImageView imageView;
        int i3;
        if (this.A0M.A0E(C16620tM.A02, 1352)) {
            AnonymousClass1RU r4 = this.A1S;
            C16740tZ fMessage = getFMessage();
            boolean z3 = !z2;
            boolean A012 = r4.A00.A00().A01(fMessage.A11.A00);
            if (AnonymousClass1RU.A00(fMessage, (byte) 68)) {
                r4.A05.execute(new C1045655w(fMessage, r4, z3, A012));
            } else {
                r4.A03(fMessage, (Runnable) null, (byte) 68, false, A012);
            }
            if (1 == i2) {
                if (this.A09 == null) {
                    this.A09 = new ImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    ImageView imageView2 = this.A09;
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen076f);
                    ViewGroup viewGroup = this.A04;
                    imageView2.setLayoutParams(layoutParams);
                    imageView2.setContentDescription(imageView2.getContext().getString(R.string.str0bf9));
                    C45902Bo.A08(imageView2, this.A0K, 0, dimensionPixelSize);
                    if (viewGroup != null) {
                        if (this.A0A != null) {
                            viewGroup.addView(imageView2, 1);
                        } else {
                            viewGroup.addView(imageView2, 0);
                        }
                        viewGroup.setClipChildren(false);
                    }
                    this.A09.setImageDrawable(getKeepDrawable());
                }
                imageView = this.A09;
                i3 = 0;
                imageView.setVisibility(i3);
            }
        }
        imageView = this.A09;
        if (imageView != null) {
            i3 = 8;
            imageView.setVisibility(i3);
        }
    }

    /* JADX WARNING: type inference failed for: r2v49, types: [java.lang.Object, X.2uk] */
    /* JADX WARNING: type inference failed for: r17v4, types: [X.2uk] */
    /* JADX WARNING: type inference failed for: r17v5, types: [X.2uk] */
    /* JADX WARNING: type inference failed for: r17v6, types: [X.2uk] */
    /* JADX WARNING: type inference failed for: r17v7, types: [X.2uk] */
    /* JADX WARNING: type inference failed for: r17v8, types: [com.obwhatsapp.IDxTSpanShape14S0200000_1_I0] */
    /* JADX WARNING: type inference failed for: r17v9, types: [X.3gr] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A15(android.text.Spannable r27, com.obwhatsapp.TextEmojiLabel r28, X.C16740tZ r29, boolean r30, boolean r31, boolean r32) {
        /*
            r26 = this;
            r0 = r26
            X.0uY r3 = r0.A1c
            X.0rz r1 = r0.A0t
            java.lang.String r2 = r1.A0O()
            r1 = r27
            if (r32 == 0) goto L_0x0011
            r3.A09(r1, r2)
        L_0x0011:
            java.util.List r16 = X.C45922Bq.A05(r1)
            if (r16 == 0) goto L_0x01ae
            boolean r2 = r16.isEmpty()
            if (r2 != 0) goto L_0x01ae
            X.0sG r6 = r0.A0a
            X.14t r7 = r0.A0v
            X.0ul r4 = r0.A1B
            X.0sK r5 = r0.A0L
            X.14s r2 = r0.A1a
            X.0pd r8 = r0.A0M
            r3 = r29
            r9 = r4
            r10 = r3
            r11 = r2
            boolean r2 = X.C47612Jr.A06(r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x019a
            X.1Mg r7 = r0.A12
            r5 = 0
            java.util.Iterator r6 = r16.iterator()
        L_0x003b:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0058
            java.lang.Object r2 = r6.next()
            android.text.style.URLSpan r2 = (android.text.style.URLSpan) r2
            java.lang.String r4 = r2.getURL()
            com.whatsapp.jid.UserJid r2 = r3.A0C()
            java.util.Set r2 = r7.A00(r2, r3, r4)
            if (r2 == 0) goto L_0x003b
            int r5 = r5 + 1
            goto L_0x003b
        L_0x0058:
            java.util.Iterator r15 = r16.iterator()
            r4 = 0
        L_0x005d:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x019c
            java.lang.Object r2 = r15.next()
            android.text.style.URLSpan r2 = (android.text.style.URLSpan) r2
            java.lang.String r7 = r2.getURL()
            int r8 = r1.getSpanStart(r2)
            int r6 = r1.getSpanEnd(r2)
            int r9 = r1.getSpanFlags(r2)
            X.1Mg r10 = r0.A12
            com.whatsapp.jid.UserJid r2 = r3.A0C()
            java.util.Set r24 = r10.A00(r2, r3, r7)
            if (r24 == 0) goto L_0x00e6
            android.content.Context r18 = r0.getContext()
            X.0pt r12 = r0.A0J
            X.01V r11 = r0.A0J
            X.0uW r10 = r0.A0K
            X.3gr r2 = new X.3gr
            r21 = r11
            r22 = r3
            r23 = r7
            r19 = r10
            r20 = r12
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
        L_0x00a0:
            X.1Lg r11 = r0.A0U
            X.0pd r13 = r11.A01
            r12 = 355(0x163, float:4.97E-43)
            X.0tM r10 = X.C16620tM.A02
            boolean r10 = r13.A0E(r10, r12)
            if (r10 == 0) goto L_0x00c5
            X.19m r10 = r11.A03
            boolean r10 = r10.A00()
            if (r10 == 0) goto L_0x00c5
            X.1K8 r10 = r11.A00
            boolean r7 = r10.A01(r7)
            if (r7 == 0) goto L_0x00c5
            X.4un r7 = new X.4un
            r7.<init>(r11)
            r2.A02 = r7
        L_0x00c5:
            java.lang.Class<X.35o> r7 = X.C607235o.class
            java.lang.Object[] r13 = r1.getSpans(r8, r6, r7)
            X.35o[] r13 = (X.C607235o[]) r13
            if (r13 == 0) goto L_0x00df
            int r12 = r13.length
            if (r12 <= 0) goto L_0x00df
            r11 = 1
            r2.A05 = r11
            r10 = 0
        L_0x00d6:
            r7 = r13[r10]
            r7.A02 = r11
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x00df
            goto L_0x00d6
        L_0x00df:
            r1.setSpan(r2, r8, r6, r9)
            int r4 = r4 + 1
            goto L_0x005d
        L_0x00e6:
            java.lang.String r2 = "wapay"
            boolean r2 = r7.startsWith(r2)
            if (r2 != 0) goto L_0x017f
            java.lang.String r2 = "upi"
            boolean r2 = r7.startsWith(r2)
            if (r2 != 0) goto L_0x017f
            X.0pd r11 = r0.A0M
            r10 = 1215(0x4bf, float:1.703E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r11.A0E(r2, r10)
            if (r2 == 0) goto L_0x012e
            java.lang.String r2 = "tel"
            boolean r2 = r7.startsWith(r2)
            if (r2 == 0) goto L_0x012e
            android.content.Context r18 = r0.getContext()
            X.0pt r12 = r0.A0J
            X.01V r11 = r0.A0J
            X.0uW r10 = r0.A0K
            r25 = 1
            com.obwhatsapp.IDxTSpanShape14S0200000_1_I0 r2 = new com.obwhatsapp.IDxTSpanShape14S0200000_1_I0
            r21 = r11
            r22 = r3
            r23 = r0
            r24 = r7
            r19 = r10
            r20 = r12
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x00a0
        L_0x012e:
            X.19h r2 = r0.A1J
            android.net.Uri r10 = android.net.Uri.parse(r7)
            X.0w2 r2 = r2.A04
            int r12 = r2.A08(r10)
            r11 = 21
            android.content.Context r18 = r0.getContext()
            X.0pt r14 = r0.A0J
            X.01V r13 = r0.A0J
            X.0uW r10 = r0.A0K
            X.2uk r2 = new X.2uk
            r21 = r13
            r22 = r7
            r19 = r10
            r20 = r14
            r17 = r2
            if (r12 != r11) goto L_0x0159
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x00a0
        L_0x0159:
            r17.<init>(r18, r19, r20, r21, r22)
            boolean r10 = r3 instanceof X.C30581cc
            if (r10 == 0) goto L_0x016a
            r10 = r3
            X.1cc r10 = (X.C30581cc) r10
            int r10 = r10.A00
            r2.A01 = r10
            r10 = 1
            r2.A04 = r10
        L_0x016a:
            X.1Vw r10 = r3.A11
            X.0rv r11 = r10.A00
            boolean r10 = X.C16030sJ.A0L(r11)
            if (r10 == 0) goto L_0x0179
            r10 = 3
        L_0x0175:
            r2.A00 = r10
            goto L_0x00a0
        L_0x0179:
            boolean r10 = r11 instanceof com.whatsapp.jid.UserJid
            if (r10 == 0) goto L_0x00a0
            r10 = 2
            goto L_0x0175
        L_0x017f:
            android.content.Context r18 = r0.getContext()
            X.0pt r12 = r0.A0J
            X.01V r11 = r0.A0J
            X.19h r10 = r0.A1J
            X.2uk r2 = new X.2uk
            r21 = r11
            r22 = r7
            r19 = r10
            r20 = r12
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x00a0
        L_0x019a:
            r5 = 0
            r4 = 0
        L_0x019c:
            java.util.Iterator r3 = r16.iterator()
        L_0x01a0:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x01b0
            java.lang.Object r2 = r3.next()
            r1.removeSpan(r2)
            goto L_0x01a0
        L_0x01ae:
            r4 = 0
            r5 = 0
        L_0x01b0:
            r6 = r28
            if (r30 != 0) goto L_0x0253
            if (r4 > 0) goto L_0x0253
            X.0EL r2 = r6.A06
            if (r2 == 0) goto L_0x01be
            r2 = 0
            r6.setFocusable(r2)
        L_0x01be:
            r2 = 0
            r6.setAccessibilityHelper(r2)
        L_0x01c2:
            if (r5 <= 0) goto L_0x0249
            android.view.ViewGroup r2 = r0.A06
            r7 = 1
            if (r2 != 0) goto L_0x01f4
            r2 = 2131366528(0x7f0a1280, float:1.8352952E38)
            android.view.View r2 = r0.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.A06 = r2
            if (r2 == 0) goto L_0x01f4
            android.content.Context r2 = r0.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r2)
            r3 = 2131559846(0x7f0d05a6, float:1.8745048E38)
            android.view.ViewGroup r2 = r0.A06
            r8.inflate(r3, r2, r7)
            android.view.ViewGroup r3 = r0.A06
            r2 = 2131366527(0x7f0a127f, float:1.835295E38)
            android.view.View r2 = r3.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            X.AnonymousClass1UP.A06(r2)
        L_0x01f4:
            android.view.ViewGroup r2 = r0.A06
            if (r2 == 0) goto L_0x021e
            r11 = 0
            r2.setVisibility(r11)
            android.view.ViewGroup r3 = r0.A06
            r2 = 2131366527(0x7f0a127f, float:1.835295E38)
            android.view.View r10 = r3.findViewById(r2)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r4 <= r7) goto L_0x023d
            X.013 r9 = r0.A0K
            r8 = 2131755351(0x7f100157, float:1.9141579E38)
            long r2 = (long) r5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7[r11] = r5
            java.lang.String r2 = r9.A0J(r7, r8, r2)
        L_0x021b:
            r10.setText(r2)
        L_0x021e:
            X.2ox r5 = r0.A0I
            if (r5 == 0) goto L_0x022f
            X.41q r3 = X.C798641q.FORWARD
            X.41q r2 = r5.A00
            if (r3 != r2) goto L_0x022f
            android.widget.ImageView r3 = r5.A01
            r2 = 8
            r3.setVisibility(r2)
        L_0x022f:
            if (r4 > 0) goto L_0x0233
            if (r31 == 0) goto L_0x023c
        L_0x0233:
            java.lang.CharSequence r1 = r0.A0r(r1)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r6.setText(r1, r0)
        L_0x023c:
            return
        L_0x023d:
            android.content.Context r3 = r0.getContext()
            r2 = 2131891998(0x7f12171e, float:1.9418732E38)
            java.lang.String r2 = r3.getString(r2)
            goto L_0x021b
        L_0x0249:
            android.view.ViewGroup r3 = r0.A06
            if (r3 == 0) goto L_0x022f
            r2 = 8
            r3.setVisibility(r2)
            goto L_0x022f
        L_0x0253:
            X.0EL r2 = r6.A06
            if (r2 != 0) goto L_0x01c2
            X.01V r3 = r0.A0J
            X.2q8 r2 = new X.2q8
            r2.<init>(r6, r3)
            r6.setAccessibilityHelper(r2)
            r2 = 0
            r6.setFocusable(r2)
            goto L_0x01c2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30011bb.A15(android.text.Spannable, com.obwhatsapp.TextEmojiLabel, X.0tZ, boolean, boolean, boolean):void");
    }

    public void A16(View view, C38891ra r11, boolean z2) {
        C38891ra r3 = r11;
        UserJid userJid = r11.A01;
        if (userJid == null) {
            this.A0J.A09(R.string.str03f1, 0);
            return;
        }
        C17170ue r1 = this.A0T;
        int i2 = 3;
        boolean z3 = z2;
        if (z2) {
            i2 = 14;
        }
        r1.A02(i2);
        boolean A0I2 = this.A0L.A0I(userJid);
        C61843Ap.A01(getContext(), view, this.A0S, r3, this.A1d, 1, z3, A0I2, A0I2);
    }

    public final void A17(TextView textView, C16740tZ r6, int i2) {
        if (r6.A0t) {
            C28381Vw r1 = r6.A11;
            boolean z2 = r1.A02;
            if (1 != 0 && !C16030sJ.A0G(r1.A00)) {
                int i3 = R.color.color0792;
                if (i2 == R.drawable.broadcast_status_icon) {
                    i3 = R.color.color0550;
                }
                Drawable A022 = AnonymousClass2SR.A02(getContext(), i2, i3);
                if (this.A0K.A0T()) {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C447725m(A022, this.A0K), (Drawable) null);
                    Conversation.paintForwarded(textView, getFMessage());
                    return;
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(A022, (Drawable) null, (Drawable) null, (Drawable) null);
                Conversation.paintForwarded(textView, getFMessage());
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        Conversation.paintForwarded(textView, getFMessage());
    }

    public void A18(TextView textView, List list, long j2) {
        long j3;
        C31781f1 A012;
        Iterator it = list.iterator();
        long j4 = 0;
        int i2 = 0;
        while (it.hasNext()) {
            C16730tY r0 = (C16730tY) it.next();
            C16750ta r9 = r0.A02;
            AnonymousClass00B.A06(r9);
            C18210wK r10 = this.A1C;
            long j5 = r0.A01;
            if (r9.A0W) {
                j3 = 0;
            } else {
                String str = r9.A0I;
                j3 = 0;
                if (!(str == null || (A012 = r10.A01(str)) == null)) {
                    j3 = A012.A0A;
                }
            }
            j4 += j5 - j3;
            if (this.A1C.A01(r9.A0I) == null) {
                break;
            }
            i2++;
        }
        if (i2 == list.size()) {
            textView.setText(C38621r6.A0I(this.A0K, j4));
            return;
        }
        textView.setText(C38621r6.A0I(this.A0K, j2));
        this.A1e.Ack(new AnonymousClass36A(textView, this.A0K, this.A1C, list), new Void[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r5 != 1) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bc, code lost:
        if (r0.A00 == Integer.MIN_VALUE) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A19(com.obwhatsapp.TextEmojiLabel r20, X.C16740tZ r21, java.lang.String r22, boolean r23, boolean r24) {
        /*
            r19 = this;
            r8 = r20
            android.content.Context r13 = r8.getContext()
            r6 = r19
            if (r24 == 0) goto L_0x0014
            float r0 = r6.getTextFontSize()
            r8.setTextSize(r0)
            com.obwhatsapp.yo.yo.bubbleTextOptions(r6, r8, r0)
        L_0x0014:
            java.lang.CharSequence r0 = X.AnonymousClass1ZW.A02(r22)
            java.lang.String r4 = r0.toString()
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r4)
            if (r23 == 0) goto L_0x002a
            X.01V r1 = r6.A0J
            X.0u3 r0 = r6.A1N
            X.C45922Bq.A03(r1, r0, r7)
        L_0x002a:
            X.1YG r3 = r6.A0b
            r2 = 1
            r9 = r21
            if (r3 == 0) goto L_0x00de
            int r5 = r3.AGW(r9)
            if (r5 != 0) goto L_0x0038
            r5 = 1
        L_0x0038:
            int r1 = r9.A05
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 < r0) goto L_0x0042
            r0 = 308(0x134, float:4.32E-43)
            if (r5 == r2) goto L_0x0044
        L_0x0042:
            r0 = 768(0x300, float:1.076E-42)
        L_0x0044:
            X.1tU r15 = new X.1tU
            r15.<init>(r5, r0)
            android.text.TextPaint r14 = r8.getPaint()
            r18 = 1067869798(0x3fa66666, float:1.3)
            X.0um r0 = r6.A19
            r16 = r0
            r17 = r7
            X.AnonymousClass2Sy.A00(r13, r14, r15, r16, r17, r18)
            int r1 = r15.A02
            r12 = 0
            if (r1 <= 0) goto L_0x00dc
            int r0 = r7.length()
            if (r1 >= r0) goto L_0x00dc
            int r0 = r1 + -1
            int r0 = r4.codePointAt(r0)
            int r0 = java.lang.Character.charCount(r0)
            int r1 = r1 + r0
            int r1 = r1 - r2
            int r0 = r7.length()
            if (r1 == r0) goto L_0x00dc
            int r0 = r7.length()
            r7.delete(r1, r0)
            r0 = 2131891022(0x7f12134e, float:1.9416752E38)
            java.lang.String r0 = r13.getString(r0)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r0)
            X.3gc r2 = new X.3gc
            r2.<init>(r13, r6)
            int r1 = r4.length()
            r0 = 18
            r4.setSpan(r2, r12, r1, r0)
            java.lang.String r0 = "... "
            r7.append(r0)
            r7.append(r4)
            r10 = 1
        L_0x00a0:
            X.0zK r1 = r6.A1D
            java.util.List r0 = r9.A0q
            r11 = 1
            r1.A02(r13, r7, r0)
            r4 = 0
            if (r3 == 0) goto L_0x00b3
            java.lang.Class<X.38q> r0 = X.C613738q.class
            java.lang.Object r4 = r3.AAy(r0)
            X.38q r4 = (X.C613738q) r4
        L_0x00b3:
            X.0EL r0 = r8.A06
            if (r0 == 0) goto L_0x00be
            int r1 = r0.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            if (r1 != r0) goto L_0x00bf
        L_0x00be:
            r2 = 0
        L_0x00bf:
            if (r4 == 0) goto L_0x00d7
            r6.A15(r7, r8, r9, r10, r11, r12)
            X.1Vw r1 = r9.A11
            X.4xI r0 = new X.4xI
            r0.<init>(r8, r6, r9, r10)
            r4.A00(r8, r0, r7, r1)
        L_0x00ce:
            if (r2 == 0) goto L_0x00d6
            r1 = 0
            r0 = 64
            r6.performAccessibilityAction(r0, r1)
        L_0x00d6:
            return
        L_0x00d7:
            r12 = 1
            r6.A15(r7, r8, r9, r10, r11, r12)
            goto L_0x00ce
        L_0x00dc:
            r10 = 0
            goto L_0x00a0
        L_0x00de:
            r5 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30011bb.A19(com.obwhatsapp.TextEmojiLabel, X.0tZ, java.lang.String, boolean, boolean):void");
    }

    public final void A1A(AnonymousClass3ON r7, int i2) {
        int width;
        int paddingTop;
        int width2;
        View view = (View) r7.getParent();
        View A0E2 = C004601z.A0E(r7, i2);
        r7.layout(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getPaddingTop() + r7.getMeasuredHeight());
        if (this.A0K.A0T()) {
            width = r7.getPaddingLeft();
            paddingTop = r7.getPaddingTop();
            width2 = r7.getPaddingLeft() + A0E2.getWidth();
        } else {
            width = (r7.getWidth() - r7.getPaddingRight()) - A0E2.getWidth();
            paddingTop = r7.getPaddingTop();
            width2 = r7.getWidth() - r7.getPaddingRight();
        }
        A0E2.layout(width, paddingTop, width2, r7.getPaddingTop() + A0E2.getHeight());
    }

    public void A1B(C15830rv r5, AnonymousClass23T r6) {
        C49612Uh r1;
        ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment;
        boolean z2;
        if (r6 == null) {
            Log.e("ConversationRow/onReactionViewClicked null message reactions.");
            return;
        }
        C001000l r3 = (C001000l) AnonymousClass22N.A01(getContext(), C14550pN.class);
        if (r3 != null) {
            if (this instanceof AnonymousClass2Uj) {
                AnonymousClass00B.A06(r5);
                r1 = ((AnonymousClass2Uj) this).A01;
                reactionsBottomSheetDialogFragment = new ReactionsBottomSheetDialogFragment();
                reactionsBottomSheetDialogFragment.A0H = r5;
                reactionsBottomSheetDialogFragment.A0I = r6;
                z2 = false;
                if (r1 != null) {
                    z2 = true;
                }
            } else {
                AnonymousClass00B.A06(r5);
                r1 = null;
                reactionsBottomSheetDialogFragment = new ReactionsBottomSheetDialogFragment();
                reactionsBottomSheetDialogFragment.A0H = r5;
                reactionsBottomSheetDialogFragment.A0I = r6;
                z2 = false;
            }
            reactionsBottomSheetDialogFragment.A0N = z2;
            reactionsBottomSheetDialogFragment.A0C = r1;
            reactionsBottomSheetDialogFragment.A1G(r3.AGM(), "reactionsheet");
        }
    }

    public void A1C(C16740tZ r8) {
        TextView dateView = getDateView();
        ViewGroup dateWrapper = getDateWrapper();
        int i2 = 0;
        if (dateView != null) {
            dateView.setVisibility(0);
            dateView.setText(C47672Jx.A00(this.A0K, this.A0r.A02(r8.A0I)));
            Conversation.setChatDateColor(dateView, r8);
            yo.isMRevoked(r8, dateView);
            A17(dateView, r8, getBroadcastDrawableId());
        }
        if (dateWrapper != null) {
            dateWrapper.setVisibility(0);
            if (!(this instanceof AnonymousClass31J)) {
                A14(r8.A06(), true);
                boolean z2 = r8.A0x;
                ImageView imageView = this.A0A;
                if (z2) {
                    if (imageView == null) {
                        this.A0A = new ImageView(getContext());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 16;
                        ImageView imageView2 = this.A0A;
                        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen076f);
                        imageView2.setLayoutParams(layoutParams);
                        imageView2.setContentDescription(imageView2.getContext().getString(R.string.str1675));
                        C45902Bo.A08(imageView2, this.A0K, 0, dimensionPixelSize);
                        dateWrapper.addView(imageView2, 0);
                        dateWrapper.setClipChildren(false);
                        this.A0A.setImageDrawable(getStarDrawable());
                    }
                    imageView = this.A0A;
                } else if (imageView != null) {
                    i2 = 8;
                } else {
                    return;
                }
                imageView.setVisibility(i2);
            }
        }
    }

    public void A1D(C16740tZ r14) {
        C16010sH A082;
        C16440t3 r11 = this.A0r;
        C14710pd r9 = this.A0M;
        C15810rt r8 = this.A0u;
        C16000sG r7 = this.A0a;
        C17240ul r6 = this.A1B;
        AnonymousClass135 r12 = this.A1b;
        C17030uP r10 = this.A0c;
        C16070sO r5 = this.A0z;
        AnonymousClass2a9 r4 = this.A0h;
        AnonymousClass1YG r3 = this.A0b;
        C20260zl r2 = this.A1A;
        if (r3 != null) {
            int AAs = r3.AAs();
            if (AAs == 0 || AAs == 2) {
                if (C41871wn.A01(r9, r12) && r14 != null) {
                    C15830rv r0 = r14.A11.A00;
                    AnonymousClass00B.A06(r0);
                    C16010sH A072 = r7.A07(r0);
                    if (A072 != null) {
                        UserJid userJid = (UserJid) A072.A08(UserJid.class);
                        if (!C32431gL.A01(r2, userJid) && new C32441gM(r10, userJid).A02()) {
                            return;
                        }
                    }
                }
                if (!C41861wm.A00(r7, r10, r9, r2, r14)) {
                    C15830rv r102 = r14.A11.A00;
                    if (!C16030sJ.A0H(r102) && !C38621r6.A0v(r14, r11.A00()) && !C40561uK.A01(r2, r102) && r4.A00(r102) == null) {
                        GroupJid of = GroupJid.of(r102);
                        if ((of == null || (((A082 = r7.A08(of)) == null || ((r8.A03(of) != 3 || (A082.A0b && r14.A1F != null && r9.A0E(C16620tM.A02, 2036) && r6.A03(A082) != 1)) && !r6.A0e(A082))) && r5.A09(of))) && C38621r6.A0t(r14)) {
                            r3.Afs(this, r14, this.A04, this.A0S);
                        }
                    }
                }
            }
        }
    }

    public void A1E(C16740tZ r5) {
        AnonymousClass1YG r0;
        AnonymousClass1YG r2;
        if (this instanceof AnonymousClass31J) {
            Iterator it = ((AnonymousClass31J) this).A08.iterator();
            while (it.hasNext()) {
                AnonymousClass39Z r3 = (AnonymousClass39Z) it.next();
                C16730tY r02 = r3.A06;
                if (r02 != null && r5.A11.equals(r02.A11)) {
                    AnonymousClass1YG r22 = r3.A0C.A0b;
                    if (r22 != null && r22.AHi()) {
                        r3.A02.setSelected(r22.Agy(r3.A06));
                        return;
                    }
                    return;
                }
            }
        } else if (this instanceof AnonymousClass2Uj) {
            AnonymousClass2Uj r32 = (AnonymousClass2Uj) this;
            if (r32.A1K() && (r2 = r32.A0b) != null) {
                boolean z2 = !r2.AJI(r5);
                r2.Aec(r32.A05, z2);
                r32.A0k.setRowSelected(z2);
            }
        } else if (A1K() && (r0 = this.A0b) != null) {
            this.A0k.setRowSelected(r0.Agy(r5));
        }
    }

    public void A1F(C16740tZ r5, int i2) {
        if (this instanceof AnonymousClass31J) {
            AnonymousClass31J r1 = (AnonymousClass31J) this;
            if (r5 instanceof C16730tY) {
                Iterator it = r1.A08.iterator();
                while (it.hasNext()) {
                    AnonymousClass39Z r2 = (AnonymousClass39Z) it.next();
                    C16730tY r0 = r2.A06;
                    if (r0 != null && r5.A11.equals(r0.A11)) {
                        r2.A01 = i2;
                        r2.A01((C16730tY) r5, false);
                        return;
                    }
                }
                return;
            }
            return;
        }
        setFMessage(r5);
        A12(i2);
        A11(this.A01);
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A1G(X.C16740tZ r4, boolean r5) {
        /*
            r3 = this;
            X.0tZ r1 = r3.getFMessage()
            r0 = 0
            if (r1 == r4) goto L_0x0008
            r0 = 1
        L_0x0008:
            r3.setFMessage(r4)
            if (r0 != 0) goto L_0x000f
            if (r5 == 0) goto L_0x0012
        L_0x000f:
            r3.A1J(r0)
        L_0x0012:
            X.1YG r2 = r3.A0b
            if (r2 == 0) goto L_0x0032
            boolean r0 = r2.AHi()
            if (r0 == 0) goto L_0x0032
            boolean r0 = r3 instanceof X.AnonymousClass31J
            if (r0 != 0) goto L_0x0032
            r3.A0v()
            X.2nv r1 = r3.A0k
            boolean r0 = r2.AJI(r4)
        L_0x0029:
            r1.setRowSelected(r0)
        L_0x002c:
            X.4Sq r0 = r3.A1M
            java.util.Set r1 = r0.A00
            monitor-enter(r1)
            goto L_0x0041
        L_0x0032:
            android.view.View r1 = r3.A0E
            if (r1 == 0) goto L_0x003b
            r0 = 8
            r1.setVisibility(r0)
        L_0x003b:
            X.2nv r1 = r3.A0k
            if (r1 == 0) goto L_0x002c
            r0 = 0
            goto L_0x0029
        L_0x0041:
            r1.clear()     // Catch:{ all -> 0x0046 }
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30011bb.A1G(X.0tZ, boolean):void");
    }

    public void A1H(C16740tZ r2, boolean z2) {
        A1G(r2, true);
    }

    public void A1I(boolean z2) {
        int i2;
        this.A1i = z2;
        TextView textView = this.A0D;
        if (z2) {
            if (textView == null) {
                TextView textView2 = new TextView(getContext());
                this.A0D = textView2;
                textView2.setId(R.id.conversation_row_date_divider);
                TextView textView3 = this.A0D;
                Typeface A032 = AnonymousClass1UP.A03(getContext());
                TextView textView4 = this.A0D;
                int A002 = AnonymousClass00T.A00(getContext(), R.color.color0190);
                TextView textView5 = this.A0D;
                textView5.setBackgroundResource(R.drawable.date_balloon_normal);
                Conversation.tvBalloons(textView5);
                this.A0D.setGravity(17);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen023b);
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                int dimensionPixelSize2 = dimensionPixelSize - getResources().getDimensionPixelSize(R.dimen.dimen02b5);
                marginLayoutParams.bottomMargin = dimensionPixelSize2;
                if (this instanceof AnonymousClass2QE) {
                    marginLayoutParams.bottomMargin = dimensionPixelSize2 - getResources().getDimensionPixelSize(R.dimen.dimen02b7);
                }
                addView(this.A0D, marginLayoutParams);
                textView = this.A0D;
                this.A0C = textView;
            }
            textView.setText(C28961Zl.A09(this.A0K, getFMessage().A0I));
            this.A0D.setTextSize(this.A0g.A00(getResources()));
            textView = this.A0D;
            i2 = 0;
        } else if (textView != null) {
            i2 = 8;
        } else {
            return;
        }
        textView.setVisibility(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x030b, code lost:
        if (r8 != r2) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r6 != null) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x06af  */
    /* JADX WARNING: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1J(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            X.0tZ r1 = r0.getFMessage()
            if (r19 == 0) goto L_0x0036
            boolean r2 = r0 instanceof X.AnonymousClass31J
            if (r2 == 0) goto L_0x002d
            r2 = r0
            X.31J r2 = (X.AnonymousClass31J) r2
            java.util.ArrayList r2 = r2.A08
            java.util.Iterator r5 = r2.iterator()
        L_0x0015:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r4 = r5.next()
            X.39Z r4 = (X.AnonymousClass39Z) r4
            com.whatsapp.stickers.StickerView r3 = r4.A0B
            r3.clearAnimation()
            r2 = 0
            r4.A00 = r2
            r3.invalidate()
            goto L_0x0015
        L_0x002d:
            r0.clearAnimation()
            r2 = 0
            r0.A00 = r2
            r0.invalidate()
        L_0x0036:
            X.1Vw r2 = r1.A11
            r0.setTag(r2)
            android.view.ViewGroup r4 = r0.A06
            r3 = 8
            if (r4 == 0) goto L_0x0044
            r4.setVisibility(r3)
        L_0x0044:
            boolean r4 = r0.A0S
            if (r4 != 0) goto L_0x014c
            X.0tZ r5 = r0.getFMessage()
            X.0tZ r11 = r5.A0D()
            if (r11 == 0) goto L_0x07b9
            byte r6 = r11.A10
            r4 = 79
            if (r6 > r4) goto L_0x07b9
            if (r6 < 0) goto L_0x07b9
            android.view.ViewGroup r6 = r0.A05
            if (r6 != 0) goto L_0x006b
            r4 = 2131365615(0x7f0a0eef, float:1.83511E38)
            android.view.View r6 = r0.findViewById(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.A05 = r6
            if (r6 == 0) goto L_0x014c
        L_0x006b:
            r4 = 0
            r6.setVisibility(r4)
            android.widget.FrameLayout r4 = r0.A07
            if (r4 != 0) goto L_0x00d7
            android.content.Context r4 = r0.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r4)
            r7 = 2131559653(0x7f0d04e5, float:1.8744656E38)
            android.view.ViewGroup r6 = r0.A05
            r4 = 1
            android.view.View r7 = r8.inflate(r7, r6, r4)
            r4 = 2131365614(0x7f0a0eee, float:1.8351098E38)
            android.view.View r6 = X.C004601z.A0E(r7, r4)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r0.A07 = r6
            android.graphics.drawable.Drawable r4 = r0.getInnerFrameForegroundDrawable()
            r6.setForeground(r4)
            r4 = 2131365627(0x7f0a0efb, float:1.8351125E38)
            android.view.View r6 = X.C004601z.A0E(r7, r4)
            com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r6 = (com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView) r6
            r0.A0m = r6
            r4 = 2131365626(0x7f0a0efa, float:1.8351123E38)
            android.view.View r8 = r6.findViewById(r4)
            android.widget.TextView r8 = (android.widget.TextView) r8
            com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r6 = r0.A0m
            r4 = 2131365612(0x7f0a0eec, float:1.8351094E38)
            android.view.View r7 = r6.findViewById(r4)
            android.widget.TextView r7 = (android.widget.TextView) r7
            com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r6 = r0.A0m
            r4 = 2131365623(0x7f0a0ef7, float:1.8351117E38)
            android.view.View r6 = r6.findViewById(r4)
            android.widget.TextView r6 = (android.widget.TextView) r6
            float r4 = r0.getNameInGroupTextFontSize()
            r8.setTextSize(r4)
            r7.setTextSize(r4)
            r6.setTextSize(r4)
            X.AnonymousClass1UP.A06(r8)
            X.AnonymousClass1UP.A06(r7)
            X.AnonymousClass1UP.A06(r6)
        L_0x00d7:
            android.content.Context r4 = r0.getContext()
            X.1yP r9 = X.AnonymousClass22O.A01(r4)
            if (r9 == 0) goto L_0x00f5
            android.widget.FrameLayout r4 = r0.A07
            r12 = 0
            com.whatsapp.util.ViewOnClickCListenerShape0S0400000_I0 r7 = new com.whatsapp.util.ViewOnClickCListenerShape0S0400000_I0
            r8 = r0
            r10 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            r4.setOnClickListener(r7)
            android.widget.FrameLayout r6 = r0.A07
            android.view.View$OnLongClickListener r4 = r0.A1n
            r6.setOnLongClickListener(r4)
        L_0x00f5:
            X.1Vw r4 = r11.A11
            X.0rv r6 = r4.A00
            boolean r4 = r6 instanceof com.whatsapp.jid.GroupJid
            r14 = 0
            if (r4 == 0) goto L_0x0128
            X.0wI r4 = r0.A0b
            boolean r7 = r4.A00(r6)
            boolean r4 = X.C16030sJ.A0L(r6)
            if (r4 == 0) goto L_0x07b6
            r9 = 1
            if (r7 == 0) goto L_0x010e
            r9 = 7
        L_0x010e:
            X.0sG r6 = r0.A0a
            X.0rv r4 = r11.A0B()
            X.0sH r8 = r6.A0A(r4)
            if (r7 == 0) goto L_0x0128
            X.1uQ r7 = X.C40621uQ.PUSH_NAME
            X.0sP r6 = r0.A0d
            r4 = 1
            X.0sQ r4 = r6.A06(r8, r9, r14, r4)
            X.1uQ r4 = r4.A00
            if (r7 != r4) goto L_0x0128
            r14 = 1
        L_0x0128:
            X.1Le r7 = r0.A0p
            android.widget.FrameLayout r8 = r0.A07
            X.1Vw r4 = r5.A11
            X.0rv r10 = r4.A00
            X.1MF r12 = r0.A1W
            X.2Ao r9 = r0.getContactPhotosLoader()
            boolean r13 = r4.A02
            X.0wI r4 = r0.A0b
            X.0pd r6 = r4.A01
            r5 = 604(0x25c, float:8.46E-43)
            X.0tM r4 = X.C16620tM.A02
            r6.A0E(r4, r5)
            r7.A01(r8, r9, r10, r11, r12, r13, r14)
            com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r4 = r0.A0m
            if (r4 == 0) goto L_0x014c
            r4.A00 = r14
        L_0x014c:
            X.4OI r9 = r0.getFailedMessageBundle()
            boolean r4 = r9.A05
            r6 = 0
            r5 = 0
            if (r4 == 0) goto L_0x07a4
            android.widget.ImageView r4 = r0.A08
            if (r4 != 0) goto L_0x01be
            android.content.Context r4 = r0.getContext()
            android.widget.ImageView r7 = new android.widget.ImageView
            r7.<init>(r4)
            r0.A08 = r7
            r4 = 2131363654(0x7f0a0746, float:1.8347123E38)
            r7.setId(r4)
            android.widget.ImageView r8 = r0.A08
            android.content.Context r7 = r0.getContext()
            r4 = 2131889496(0x7f120d58, float:1.9413657E38)
            java.lang.String r4 = r7.getString(r4)
            r8.setContentDescription(r4)
            android.widget.ImageView r4 = r0.A08
            X.AnonymousClass2JP.A02(r4)
            android.widget.ImageView r7 = r0.A08
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER
            r7.setScaleType(r4)
            android.widget.ImageView r7 = r0.A08
            r4 = 2131231763(0x7f080413, float:1.8079616E38)
            r7.setImageResource(r4)
            android.widget.ImageView r8 = r0.A08
            android.content.Context r7 = r0.getContext()
            r4 = 2131100040(0x7f060188, float:1.781245E38)
            int r4 = X.AnonymousClass00T.A00(r7, r4)
            r8.setColorFilter(r4)
            android.content.Context r4 = r0.getContext()
            android.content.res.Resources r7 = r4.getResources()
            r4 = 2131165816(0x7f070278, float:1.794586E38)
            int r7 = r7.getDimensionPixelSize(r4)
            android.widget.ImageView r4 = r0.A08
            r0.addView(r4, r7, r7)
            android.widget.ImageView r8 = r0.A08
            r7 = 1
            com.whatsapp.util.ViewOnClickCListenerShape0S0300000_I0 r4 = new com.whatsapp.util.ViewOnClickCListenerShape0S0300000_I0
            r4.<init>(r0, r9, r1, r7)
            r8.setOnClickListener(r4)
        L_0x01be:
            android.widget.ImageView r8 = r0.A0B
            if (r8 == 0) goto L_0x01c5
            r8.setVisibility(r3)
        L_0x01c5:
            boolean r3 = r0.A0S
            if (r3 == 0) goto L_0x074d
            X.013 r3 = r0.A0K
            X.C45902Bo.A08(r0, r3, r5, r5)
        L_0x01ce:
            r0.A1C(r1)
            r7 = -1
            r0.A12(r7)
            if (r8 == 0) goto L_0x0244
            boolean r3 = r2.A02
            if (r3 == 0) goto L_0x0244
            int r10 = r1.A0C
            int r9 = r0.A0p(r10)
            int r4 = r0.A0q(r10)
            int r9 = com.obwhatsapp.yo.yo.getReadTick(r4, r9)
            if (r4 != 0) goto L_0x0743
            r3 = r6
        L_0x01ec:
            int r3 = r0.A00
            if (r9 == r3) goto L_0x0230
            if (r19 != 0) goto L_0x073b
            if (r3 == 0) goto L_0x073b
            r3 = 13
            boolean r3 = X.C42881yp.A02(r10, r3)
            if (r3 == 0) goto L_0x073b
            X.3NV r10 = new X.3NV
            r10.<init>(r8, r9)
            r3 = 400(0x190, double:1.976E-321)
            r10.setDuration(r3)
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            r10.setInterpolator(r3)
            r8.startAnimation(r10)
        L_0x0211:
            android.content.Context r11 = r8.getContext()
            int r10 = r1.A0C
            byte r12 = r1.A10
            r3 = 13
            boolean r3 = X.C42881yp.A02(r10, r3)
            if (r3 == 0) goto L_0x0726
            r4 = 2131889494(0x7f120d56, float:1.9413653E38)
            if (r12 != 0) goto L_0x0229
            r4 = 2131889490(0x7f120d52, float:1.9413645E38)
        L_0x0229:
            java.lang.String r3 = r11.getString(r4)
            r8.setContentDescription(r3)
        L_0x0230:
            boolean r3 = X.C38621r6.A0o(r1)
            if (r3 == 0) goto L_0x0242
            int r3 = r1.A0C
            r4 = 4
            boolean r3 = X.C42881yp.A02(r3, r4)
            if (r3 == 0) goto L_0x0242
            r8.setVisibility(r4)
        L_0x0242:
            r0.A00 = r9
        L_0x0244:
            boolean r3 = r2.A02
            r17 = r3
            r4 = 2
            r3 = 1
            if (r17 != 0) goto L_0x06e8
            X.0rv r8 = r2.A00
            r16 = r8
            boolean r8 = X.C16030sJ.A0L(r16)
            if (r8 == 0) goto L_0x06e8
            X.39r r8 = r0.A0c
            boolean r8 = r8.A04()
            if (r8 == 0) goto L_0x06e8
            boolean r8 = r0.A0S
            if (r8 != 0) goto L_0x06e8
            byte r9 = r1.A10
            r8 = 21
            if (r9 == r8) goto L_0x06e8
            r8 = 22
            if (r9 == r8) goto L_0x06e8
            X.0rv r2 = r1.A0B()
            if (r2 == 0) goto L_0x06d1
            boolean r2 = r1 instanceof X.AnonymousClass1WU
            if (r2 == 0) goto L_0x028c
            java.lang.String r2 = "ConversationRow/message action = "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r2 = r1
            X.1WU r2 = (X.AnonymousClass1WU) r2
            int r2 = r2.A00
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x028c:
            r15 = 2131364800(0x7f0a0bc0, float:1.8349447E38)
            X.0sP r9 = r0.A0d
            X.1Lc r8 = r0.A1V
            X.013 r2 = r0.A0K
            X.1cU r10 = new X.1cU
            r11 = r0
            r12 = r9
            r13 = r2
            r14 = r8
            r10.<init>((android.view.View) r11, (X.C16080sP) r12, (X.AnonymousClass013) r13, (X.C25781Lc) r14, (int) r15)
            X.0sO r2 = r0.A0z
            r9 = r16
            X.0sN r9 = (X.C16060sN) r9
            X.0rv r8 = r1.A0B()
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            X.0us r2 = r2.A07
            X.1cE r2 = r2.A04(r9)
            X.1ck r11 = r2.A05(r8)
            if (r11 == 0) goto L_0x06c4
            android.content.res.Resources r8 = r0.getResources()
            r2 = 2130903058(0x7f030012, float:1.7412923E38)
            int[] r9 = r8.getIntArray(r2)
            int r8 = r11.A00
            int r2 = r9.length
            int r8 = r8 % r2
            r2 = r9[r8]
        L_0x02c7:
            com.obwhatsapp.TextEmojiLabel r8 = r10.A02
            if (r8 == 0) goto L_0x02ce
            r8.setTextColor(r2)
        L_0x02ce:
            float r8 = r0.getNameInGroupTextFontSize()
            com.obwhatsapp.TextEmojiLabel r2 = r10.A02
            r2.setTextSize(r8)
            com.obwhatsapp.yo.Conversation.grparticpantName(r2)
            r0.setGrpAdmin()
            r10.A05()
            X.0sG r8 = r0.A0a
            X.0rv r2 = r1.A0B()
            X.0sH r11 = r8.A0A(r2)
            r12 = 7
            X.0wI r8 = r0.A0b
            r2 = r16
            boolean r2 = r8.A00(r2)
            r8 = 1
            if (r2 == 0) goto L_0x02f7
            r8 = 7
        L_0x02f7:
            X.0sP r2 = r0.A0d
            X.0sQ r9 = r2.A04(r11, r8)
            boolean r2 = r11.A0L()
            r10.A08(r9, r6, r8, r2)
            if (r12 != r8) goto L_0x030d
            X.1uQ r8 = X.C40621uQ.PUSH_NAME
            X.1uQ r2 = r9.A00
            r9 = 1
            if (r8 == r2) goto L_0x030e
        L_0x030d:
            r9 = 0
        L_0x030e:
            X.1Le r12 = r0.A0p
            r2 = 2131366003(0x7f0a1073, float:1.8351887E38)
            android.view.View r10 = r0.findViewById(r2)
            com.obwhatsapp.TextEmojiLabel r10 = (com.obwhatsapp.TextEmojiLabel) r10
            com.obwhatsapp.yo.Conversation.grparticpantName(r10)
            r0.setGrpAdmin()
            X.0wI r2 = r0.A0b
            X.0pd r13 = r2.A01
            r8 = 604(0x25c, float:8.46E-43)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r13.A0E(r2, r8)
            if (r2 == 0) goto L_0x032f
            if (r9 == 0) goto L_0x06c0
        L_0x032f:
            java.lang.String r2 = r11.A09()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x06c0
            if (r9 == 0) goto L_0x06b8
            X.013 r8 = r12.A07
            java.lang.String r2 = X.C24561Gk.A01(r11)
            java.lang.String r2 = r8.A0H(r2)
        L_0x0345:
            r10.A0I(r6, r2)
            r2 = 0
        L_0x0349:
            r10.setVisibility(r2)
            com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r2 = r0.A0l
            if (r2 == 0) goto L_0x0352
            r2.A00 = r9
        L_0x0352:
            int r2 = r0.A01
            if (r2 >= r4) goto L_0x035b
            com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r2 = r0.A0l
            r2.setVisibility(r5)
        L_0x035b:
            X.0wI r2 = r0.A0b
            X.0pd r9 = r2.A01
            r8 = 604(0x25c, float:8.46E-43)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r9.A0E(r2, r8)
            if (r2 == 0) goto L_0x06b2
            X.0sG r8 = r0.A0a
            X.0rv r2 = r1.A0B()
            X.0sH r10 = r8.A0A(r2)
            com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r9 = r0.A0l
            r8 = 25
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r2 = new com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0
            r2.<init>(r0, r8, r10)
        L_0x037c:
            r9.setOnClickListener(r2)
            android.view.View$OnLongClickListener r2 = r0.A1n
            r9.setOnLongClickListener(r2)
            r2 = 2131232418(0x7f0806a2, float:1.8080945E38)
            r9.setBackgroundResource(r2)
        L_0x038a:
            r0.A0y()
            X.2eW r10 = r0.A0n
            boolean r9 = r0.A0S
            X.0tZ r8 = r0.getFMessage()
            boolean r2 = X.C30921dB.A05(r8)
            if (r2 == 0) goto L_0x068e
            if (r9 != 0) goto L_0x068e
            int r8 = r8.A05
            r2 = 127(0x7f, float:1.78E-43)
            if (r8 < r2) goto L_0x0683
            r9 = 2131888404(0x7f120914, float:1.9411442E38)
            r8 = 2131886128(0x7f120030, float:1.9406826E38)
            r2 = 2131231658(0x7f0803aa, float:1.8079403E38)
        L_0x03ac:
            X.4KP r11 = new X.4KP
            r11.<init>(r9, r8, r2)
        L_0x03b1:
            r8 = -2
            if (r11 == 0) goto L_0x0667
            android.widget.TextView r2 = r0.A0G
            if (r2 != 0) goto L_0x0479
            int r2 = r0.getTopAttributeTextAnchorId()
            android.view.View r12 = r0.findViewById(r2)
            if (r12 == 0) goto L_0x0479
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r9 = r2.getResources()
            r2 = 2131165857(0x7f0702a1, float:1.7945943E38)
            int r9 = r9.getDimensionPixelSize(r2)
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r10 = r2.getResources()
            r2 = 2131165856(0x7f0702a0, float:1.794594E38)
            int r14 = r10.getDimensionPixelSize(r2)
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r10 = r2.getResources()
            r2 = 2131165858(0x7f0702a2, float:1.7945945E38)
            int r13 = r10.getDimensionPixelSize(r2)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r7, r8)
            r2 = 3
            r10.gravity = r2
            android.content.Context r7 = r0.getContext()
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r7)
            r0.A0C = r2
            r2.setOrientation(r5)
            android.content.Context r2 = r0.getContext()
            com.obwhatsapp.TextEmojiLabel r7 = new com.obwhatsapp.TextEmojiLabel
            r7.<init>(r2)
            r0.A0G = r7
            r2 = 2131362983(0x7f0a04a7, float:1.8345762E38)
            r7.setId(r2)
            android.widget.TextView r7 = r0.A0G
            android.content.res.Resources r15 = r0.getResources()
            r2 = 2131101578(0x7f06078a, float:1.781557E38)
            int r2 = r15.getColor(r2)
            android.widget.TextView r7 = r0.A0G
            android.graphics.Typeface r2 = r7.getTypeface()
            android.widget.TextView r2 = r0.A0G
            r2.setSingleLine()
            android.widget.TextView r2 = r0.A0G
            r2.setLines(r3)
            android.widget.TextView r7 = r0.A0G
            float r2 = r0.getNameInGroupTextFontSize()
            r7.setTextSize(r2)
            android.widget.TextView r7 = r0.A0G
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r7.setEllipsize(r2)
            android.widget.TextView r2 = r0.A0G
            r2.setCompoundDrawablePadding(r14)
            android.widget.TextView r7 = r0.A0G
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            X.AnonymousClass04h.A04(r2, r7)
            android.widget.TextView r2 = r0.A0G
            X.C004601z.A0d(r2, r4)
            com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r2 = r0.A0l
            if (r2 == 0) goto L_0x0660
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0660
            android.widget.LinearLayout r2 = r0.A0C
            r2.setPadding(r9, r5, r9, r5)
        L_0x0463:
            android.widget.LinearLayout r7 = r0.A0C
            android.widget.TextView r2 = r0.A0G
            r7.addView(r2, r8, r8)
            android.view.ViewParent r9 = r12.getParent()
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r7 = r9.indexOfChild(r12)
            android.widget.LinearLayout r2 = r0.A0C
            r9.addView(r2, r7, r10)
        L_0x0479:
            android.widget.TextView r2 = r0.A0G
            if (r2 == 0) goto L_0x04dd
            int r12 = r11.A02
            int r10 = r11.A01
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r7 = X.AnonymousClass01S.A06
            r9.append(r7)
            android.content.Context r2 = r0.getContext()
            java.lang.String r2 = r2.getString(r12)
            r9.append(r2)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            android.widget.TextView r2 = r0.A0G
            r2.setText(r7)
            android.widget.LinearLayout r9 = r0.A0C
            if (r9 == 0) goto L_0x04b3
            android.content.Context r7 = r9.getContext()
            int r2 = r11.A00
            java.lang.String r2 = r7.getString(r2)
            r9.setContentDescription(r2)
        L_0x04b3:
            X.013 r2 = r0.A0K
            boolean r7 = r2.A0T()
            android.widget.TextView r2 = r0.A0G
            if (r7 == 0) goto L_0x0654
            r2.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r10, r5)
            X.0tZ r1 = r0.getFMessage()
            com.obwhatsapp.yo.Conversation.paintForwarded(r2, r1)
        L_0x04c7:
            android.content.Context r7 = r0.getContext()
            r2 = 2131101577(0x7f060789, float:1.7815568E38)
            int r2 = X.AnonymousClass00T.A00(r7, r2)
            android.widget.TextView r7 = r0.A0G
            if (r2 == 0) goto L_0x0651
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
        L_0x04da:
            X.AnonymousClass04h.A03(r2, r7)
        L_0x04dd:
            X.39r r2 = r0.A0c
            boolean r2 = r2.A07()
            if (r2 == 0) goto L_0x0610
            r0.setClipToPadding(r5)
            r0.setClipChildren(r5)
            android.view.View r2 = r0.A03
            if (r2 != 0) goto L_0x059f
            android.content.Context r2 = r0.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r2)
            r2 = 2131559782(0x7f0d0566, float:1.8744918E38)
            android.view.View r2 = r7.inflate(r2, r6)
            r0.A03 = r2
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.setClipToPadding(r5)
            android.view.View r2 = r0.A03
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.setClipChildren(r5)
            android.view.View r6 = r0.A03
            r2 = 2131366115(0x7f0a10e3, float:1.8352114E38)
            android.view.View r6 = r6.findViewById(r2)
            com.obwhatsapp.TextEmojiLabel r6 = (com.obwhatsapp.TextEmojiLabel) r6
            r0.A0Q = r6
            float r2 = r0.getNameInGroupTextFontSize()
            r6.setTextSize(r2)
            com.obwhatsapp.TextEmojiLabel r2 = r0.A0Q
            X.AnonymousClass1UP.A06(r2)
            android.view.View r6 = r0.A03
            r2 = 2131365680(0x7f0a0f30, float:1.8351232E38)
            android.view.View r6 = r6.findViewById(r2)
            com.obwhatsapp.TextEmojiLabel r6 = (com.obwhatsapp.TextEmojiLabel) r6
            r0.A0P = r6
            float r2 = r0.getNameInGroupTextFontSize()
            r6.setTextSize(r2)
            com.obwhatsapp.TextEmojiLabel r2 = r0.A0P
            X.AnonymousClass1UP.A06(r2)
            android.view.View r6 = r0.A03
            r2 = 2131362349(0x7f0a022d, float:1.8344476E38)
            android.view.View r7 = r6.findViewById(r2)
            android.widget.TextView r7 = (android.widget.TextView) r7
            float r6 = r0.getNameInGroupTextFontSize()
            r2 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r2
            r7.setTextSize(r6)
            X.013 r2 = r0.A0K
            boolean r2 = r2.A0T()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x064c
            java.lang.String r2 = "▶"
        L_0x0560:
            r7.setText(r2)
            android.view.View r6 = r0.A03
            r2 = 2131364702(0x7f0a0b5e, float:1.8349249E38)
            android.view.View r2 = r6.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.A0F = r2
            android.view.View r6 = r0.A03
            r2 = 2131362740(0x7f0a03b4, float:1.834527E38)
            android.view.View r9 = r6.findViewById(r2)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            X.013 r7 = r0.A0K
            android.content.Context r6 = r0.getContext()
            r2 = 2131231077(0x7f080165, float:1.8078225E38)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass00T.A04(r6, r2)
            X.25m r2 = new X.25m
            r2.<init>(r6, r7)
            r9.setImageDrawable(r2)
            android.view.View r7 = r0.A03
            r6 = -1
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r2.<init>(r6, r8)
            r0.addView(r7, r2)
            android.view.View r2 = r0.A03
            r0.A0C = r2
        L_0x059f:
            boolean r2 = X.C16030sJ.A0L(r16)
            r9 = 2
            if (r2 == 0) goto L_0x05a7
            r9 = 1
        L_0x05a7:
            if (r17 == 0) goto L_0x0611
            android.content.Context r6 = r0.getContext()
            r2 = 2131893160(0x7f121ba8, float:1.9421089E38)
            java.lang.String r8 = r6.getString(r2)
            X.0sP r7 = r0.A0d
            X.0sG r6 = r0.A0a
            r2 = r16
            X.0sH r2 = r6.A0A(r2)
            java.lang.String r10 = r7.A08(r2)
        L_0x05c2:
            com.obwhatsapp.TextEmojiLabel r2 = r0.A0Q
            r6 = 0
            r2.A0I(r6, r8)
            com.obwhatsapp.TextEmojiLabel r2 = r0.A0P
            r2.A0I(r6, r10)
            android.view.View r6 = r0.A03
            r2 = 2131366118(0x7f0a10e6, float:1.835212E38)
            android.view.View r9 = X.C004601z.A0E(r6, r2)
            android.content.Context r7 = r9.getContext()
            r6 = 2131891831(0x7f121677, float:1.9418393E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r5] = r8
            r2[r3] = r10
            java.lang.String r2 = r7.getString(r6, r2)
            r9.setContentDescription(r2)
            android.widget.TextView r8 = r0.A0F
            X.0t3 r4 = r0.A0r
            X.013 r2 = r0.A0K
            long r6 = r1.A0I
            long r6 = r4.A02(r6)
            java.lang.String r2 = X.C28961Zl.A0A(r2, r6, r5)
            r8.setText(r2)
            android.widget.TextView r5 = r0.A0F
            X.0t3 r4 = r0.A0r
            X.013 r2 = r0.A0K
            long r0 = r1.A0I
            long r0 = r4.A02(r0)
            java.lang.String r0 = X.C28961Zl.A0A(r2, r0, r3)
            r5.setContentDescription(r0)
        L_0x0610:
            return
        L_0x0611:
            X.0sP r7 = r0.A0d
            X.0sG r6 = r0.A0a
            if (r2 == 0) goto L_0x0635
            X.0rv r2 = r1.A0B()
            X.AnonymousClass00B.A06(r2)
            X.0sH r2 = r6.A0A(r2)
            java.lang.String r8 = r7.A0G(r2, r9, r5)
            X.0sP r7 = r0.A0d
            X.0sG r6 = r0.A0a
            r2 = r16
            X.0sH r2 = r6.A0A(r2)
            java.lang.String r10 = r7.A0G(r2, r9, r5)
            goto L_0x05c2
        L_0x0635:
            r2 = r16
            X.0sH r2 = r6.A0A(r2)
            java.lang.String r8 = r7.A08(r2)
            android.content.Context r6 = r0.getContext()
            r2 = 2131893160(0x7f121ba8, float:1.9421089E38)
            java.lang.String r10 = r6.getString(r2)
            goto L_0x05c2
        L_0x064c:
            java.lang.String r2 = "◀"
            goto L_0x0560
        L_0x0651:
            r2 = 0
            goto L_0x04da
        L_0x0654:
            r2.setCompoundDrawablesWithIntrinsicBounds(r10, r5, r5, r5)
            X.0tZ r1 = r0.getFMessage()
            com.obwhatsapp.yo.Conversation.paintForwarded(r2, r1)
            goto L_0x04c7
        L_0x0660:
            android.widget.LinearLayout r2 = r0.A0C
            r2.setPadding(r9, r13, r9, r5)
            goto L_0x0463
        L_0x0667:
            android.widget.TextView r7 = r0.A0G
            if (r7 == 0) goto L_0x04dd
            android.widget.LinearLayout r2 = r0.A0C
            r2.removeView(r7)
            r0.A0G = r6
            android.widget.LinearLayout r2 = r0.A0C
            android.view.ViewParent r7 = r2.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.widget.LinearLayout r2 = r0.A0C
            r7.removeView(r2)
            r0.A0C = r6
            goto L_0x04dd
        L_0x0683:
            r9 = 2131888405(0x7f120915, float:1.9411444E38)
            r8 = 2131888405(0x7f120915, float:1.9411444E38)
            r2 = 2131231657(0x7f0803a9, float:1.8079401E38)
            goto L_0x03ac
        L_0x068e:
            X.1uH r2 = r8.A0N
            if (r2 == 0) goto L_0x06af
            boolean r2 = r2.A0C
            if (r2 == 0) goto L_0x06af
            X.0pd r9 = r10.A00
            r8 = 1307(0x51b, float:1.831E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r9.A0E(r2, r8)
            if (r2 == 0) goto L_0x06af
            r8 = 2131887658(0x7f12062a, float:1.940993E38)
            r2 = 2131231416(0x7f0802b8, float:1.8078912E38)
            X.4KP r11 = new X.4KP
            r11.<init>(r8, r8, r2)
            goto L_0x03b1
        L_0x06af:
            r11 = 0
            goto L_0x03b1
        L_0x06b2:
            com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r9 = r0.A0l
            android.view.View$OnClickListener r2 = r0.A1l
            goto L_0x037c
        L_0x06b8:
            X.0sP r2 = r12.A04
            java.lang.String r2 = r2.A0F(r11)
            goto L_0x0345
        L_0x06c0:
            r2 = 8
            goto L_0x0349
        L_0x06c4:
            android.content.Context r8 = r0.getContext()
            r2 = 2131101149(0x7f0605dd, float:1.78147E38)
            int r2 = X.AnonymousClass00T.A00(r8, r2)
            goto L_0x02c7
        L_0x06d1:
            java.lang.String r2 = "conversation_row/missing_rmt_src:"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            java.lang.String r2 = X.C38621r6.A0J(r1)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x0352
        L_0x06e8:
            X.0zl r8 = r0.A1A
            X.0rv r2 = r2.A00
            r16 = r2
            boolean r2 = X.C40561uK.A01(r8, r2)
            if (r2 == 0) goto L_0x038a
            boolean r2 = r1 instanceof X.AnonymousClass1WU
            if (r2 != 0) goto L_0x038a
            r2 = 2131364800(0x7f0a0bc0, float:1.8349447E38)
            android.view.View r11 = r0.findViewById(r2)
            com.obwhatsapp.TextEmojiLabel r11 = (com.obwhatsapp.TextEmojiLabel) r11
            if (r11 == 0) goto L_0x038a
            android.content.Context r10 = r0.getContext()
            X.0sP r12 = r0.A0d
            X.013 r13 = r0.A0K
            X.1Lc r14 = r0.A1V
            X.1cU r9 = new X.1cU
            r9.<init>((android.content.Context) r10, (com.obwhatsapp.TextEmojiLabel) r11, (X.C16080sP) r12, (X.AnonymousClass013) r13, (X.C25781Lc) r14)
            X.0sG r8 = r0.A0a
            X.0rv r2 = r1.A0B()
            X.0sH r2 = r8.A0A(r2)
            r9.A0B(r2, r3)
            com.obwhatsapp.TextEmojiLabel r2 = r9.A02
            r2.setVisibility(r5)
            goto L_0x038a
        L_0x0726:
            r3 = 5
            boolean r3 = X.C42881yp.A02(r10, r3)
            r4 = 2131889462(0x7f120d36, float:1.9413588E38)
            if (r3 != 0) goto L_0x0229
            r3 = 4
            r4 = 2131889473(0x7f120d41, float:1.941361E38)
            if (r10 != r3) goto L_0x0229
            r4 = 2131889498(0x7f120d5a, float:1.9413661E38)
            goto L_0x0229
        L_0x073b:
            r8.clearAnimation()
            r8.setImageResource(r9)
            goto L_0x0211
        L_0x0743:
            android.content.Context r3 = r0.getContext()
            android.content.res.ColorStateList r3 = X.AnonymousClass00T.A03(r3, r4)
            goto L_0x01ec
        L_0x074d:
            boolean r3 = r0.A0k()
            if (r3 != 0) goto L_0x079f
            boolean r3 = r2.A02
            if (r3 == 0) goto L_0x079f
            android.graphics.Rect r3 = X.C30031bd.A0i
            int r4 = r3.right
        L_0x075b:
            android.content.Context r3 = r0.getContext()
            int r9 = X.AnonymousClass1UP.A00(r3)
            int r9 = r9 + r4
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131165387(0x7f0700cb, float:1.794499E38)
            int r7 = r4.getDimensionPixelSize(r3)
            android.widget.ImageView r3 = r0.A08
            if (r3 == 0) goto L_0x079d
            X.39r r3 = r0.A0c
            boolean r3 = r3.A04()
            if (r3 == 0) goto L_0x0798
            X.0tZ r3 = r0.getFMessage()
            X.1Vw r3 = r3.A11
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x0798
            int r7 = r7 + r9
        L_0x0786:
            X.39r r4 = r0.A0c
            android.content.Context r3 = r0.getContext()
            int r3 = r4.A00(r3)
            int r9 = r9 + r3
            X.013 r3 = r0.A0K
            X.C45902Bo.A08(r0, r3, r9, r7)
            goto L_0x01ce
        L_0x0798:
            int r7 = r7 + r9
            r3 = r9
            r9 = r7
            r7 = r3
            goto L_0x0786
        L_0x079d:
            r7 = r9
            goto L_0x0786
        L_0x079f:
            android.graphics.Rect r3 = X.C30031bd.A0h
            int r4 = r3.left
            goto L_0x075b
        L_0x07a4:
            android.widget.ImageView r3 = r0.A08
            if (r3 == 0) goto L_0x07ad
            r0.removeView(r3)
            r0.A08 = r6
        L_0x07ad:
            android.widget.ImageView r8 = r0.A0B
            if (r8 == 0) goto L_0x01c5
            r8.setVisibility(r5)
            goto L_0x01c5
        L_0x07b6:
            r9 = 2
            goto L_0x010e
        L_0x07b9:
            android.view.ViewGroup r4 = r0.A05
            if (r4 == 0) goto L_0x014c
            r4.setVisibility(r3)
            goto L_0x014c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30011bb.A1J(boolean):void");
    }

    public boolean A1K() {
        if ((this instanceof AnonymousClass31J) || (this instanceof C601030b) || (this instanceof AnonymousClass30R) || (this instanceof AnonymousClass30U) || (this instanceof AnonymousClass30T) || (this instanceof AnonymousClass2QC) || (this instanceof AnonymousClass30V) || (this instanceof AnonymousClass30S)) {
            return false;
        }
        return this.A1k;
    }

    public boolean A1L(C28381Vw r2) {
        return getFMessage().A11.equals(r2);
    }

    public void A4c(C14810pn r2) {
        this.A1M.A01(r2);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A1M.A00();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return this.A1m.onKey(this, keyEvent.getKeyCode(), keyEvent);
    }

    public void dispatchSetPressed(boolean z2) {
        super.dispatchSetPressed(isPressed());
        for (FrameLayout frameLayout : getInnerFrameLayouts()) {
            if (frameLayout != null) {
                frameLayout.setPressed(isPressed());
                frameLayout.setForeground(getInnerFrameForegroundDrawable());
            }
        }
    }

    public int getBroadcastDrawableId() {
        return R.drawable.broadcast_status_icon;
    }

    public int getBubbleMarginStart() {
        return AnonymousClass1UP.A00(getContext()) + (getFailedMessage() != null ? getResources().getDimensionPixelSize(R.dimen.dimen00cb) : 0) + this.A0c.A00(getContext());
    }

    public AnonymousClass2Ao getContactPhotosLoader() {
        Activity A002 = AnonymousClass22N.A00(getContext());
        if (A002 instanceof C42761yd) {
            return ((C42761yd) A002).AAp();
        }
        return null;
    }

    public TextView getDateView() {
        return this.A0E;
    }

    public ViewGroup getDateWrapper() {
        return this.A04;
    }

    public float getDividerFontSize() {
        return this.A0g.A00(getResources());
    }

    public List getHighlightTerms() {
        AnonymousClass1YG r0 = this.A0b;
        if (r0 == null) {
            return null;
        }
        return r0.AFm();
    }

    public Drawable getInnerFrameForegroundDrawable() {
        Drawable A042;
        int i2;
        boolean isPressed = isPressed();
        boolean z2 = getFMessage().A11.A02;
        if (isPressed) {
            Context context = getContext();
            if (z2) {
                A042 = AnonymousClass00T.A04(context, R.drawable.balloon_outgoing_frame);
                i2 = R.color.color00c9;
            } else {
                A042 = AnonymousClass00T.A04(context, R.drawable.balloon_incoming_frame);
                i2 = R.color.color00c7;
            }
            int A002 = AnonymousClass00T.A00(context, i2);
            AnonymousClass00B.A06(A042);
            return AnonymousClass2SR.A06(A042, A002);
        }
        Context context2 = getContext();
        return z2 ? AnonymousClass4Y4.A01(context2) : AnonymousClass4Y4.A00(context2);
    }

    public Set getInnerFrameLayouts() {
        HashSet hashSet = new HashSet();
        FrameLayout frameLayout = this.A07;
        if (frameLayout != null) {
            hashSet.add(frameLayout);
        }
        View findViewById = findViewById(R.id.link_preview_frame);
        if (findViewById != null) {
            hashSet.add(findViewById);
        }
        return hashSet;
    }

    public Drawable getKeepAnimDrawable() {
        return AnonymousClass2SR.A02(getContext(), R.drawable.message_keep_teal_anim, R.color.color0552);
    }

    public Drawable getKeepDrawable() {
        return AnonymousClass2SR.A02(getContext(), R.drawable.keep, R.color.color0553);
    }

    public int getMessageCount() {
        return 1;
    }

    public AnonymousClass23T getMessageReactions() {
        this.A1S.A02(getFMessage(), (Runnable) null, (byte) 56);
        return getFMessage().A0W;
    }

    public byte getMessageType() {
        return getFMessage().A10;
    }

    public Drawable getPopupDrawable() {
        return AnonymousClass2SR.A02(getContext(), R.drawable.message_star_teal_anim, R.color.color0552);
    }

    public int getSecondaryTextColor() {
        boolean z2 = getFMessage().A11.A02;
        int i2 = R.color.color06c5;
        if (z2) {
            i2 = R.color.color06ca;
        }
        return AnonymousClass00T.A00(getContext(), i2);
    }

    public Drawable getStarDrawable() {
        return AnonymousClass2SR.A02(getContext(), R.drawable.message_star, R.color.color0553);
    }

    public float getTextFontSize() {
        Conversation.setCInPicResize(this);
        C25831Lh r2 = this.A0g;
        return r2.A02(getResources(), r2.A02);
    }

    public int getTopAttributeTextAnchorId() {
        return R.id.quoted_message_holder;
    }

    public boolean isPressed() {
        if (!super.isPressed()) {
            return false;
        }
        C56572nv r0 = this.A0k;
        return r0 == null || !r0.A02;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        View view = this.A0E;
        if (view != null) {
            view.layout(0, 0, getWidth(), getHeight());
        }
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A0l;
        if (conversationRowParticipantHeaderMainView != null && conversationRowParticipantHeaderMainView.getVisibility() == 0) {
            A1A(conversationRowParticipantHeaderMainView, R.id.secondary_name_in_group_tv);
        }
        ConversationRowParticipantHeaderQuotedView conversationRowParticipantHeaderQuotedView = this.A0m;
        if (!(conversationRowParticipantHeaderQuotedView == null || conversationRowParticipantHeaderQuotedView.getVisibility() != 0 || C004601z.A0E(this.A0m, R.id.quoted_bullet_divider).getVisibility() == 0)) {
            A1A(this.A0m, R.id.quoted_subtitle);
        }
        ImageView imageView = this.A08;
        if (imageView != null) {
            int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
            int intrinsicHeight = this.A08.getDrawable().getIntrinsicHeight();
            View view2 = this.A0D;
            int top2 = view2.getTop() + (this.A0S ? getResources().getDimensionPixelSize(R.dimen.dimen0270) : view2.getPaddingTop() + ((((view2.getHeight() - view2.getPaddingTop()) - view2.getPaddingBottom()) - intrinsicHeight) >> 1));
            int A002 = AnonymousClass1UP.A00(getContext()) + getResources().getDimensionPixelSize(R.dimen.dimen0270);
            C616339r r1 = this.A0c;
            AnonymousClass00B.A06(r1);
            boolean A042 = r1.A04();
            boolean A062 = r1.A06();
            if (A042) {
                boolean z3 = A062;
                A062 = false;
                if (z3 == getFMessage().A11.A02) {
                    A062 = true;
                }
            }
            ImageView imageView2 = this.A08;
            if (A062) {
                imageView2.layout((getWidth() - intrinsicWidth) - A002, top2, getWidth() - A002, intrinsicHeight + top2);
            } else {
                imageView2.layout(A002, top2, intrinsicWidth + A002, intrinsicHeight + top2);
                Conversation.setCPic(this, getFMessage(), this.A01);
                return;
            }
        }
        Conversation.setCPic(this, getFMessage(), this.A01);
    }

    public void onMeasure(int i2, int i3) {
        int mode;
        if (this.A01 != 0) {
            int mode2 = View.MeasureSpec.getMode(i3);
            int i4 = this.A01;
            if (mode2 == 0) {
                mode = Integer.MIN_VALUE;
            } else {
                i4 = Math.min(i4, View.MeasureSpec.getSize(i3));
                mode = View.MeasureSpec.getMode(i3);
            }
            i3 = View.MeasureSpec.makeMeasureSpec(i4, mode);
        }
        super.onMeasure(i2, i3);
    }

    public void setCacheInflated(boolean z2) {
        this.A1h = z2;
    }

    public void setForwardButtonAction(Runnable runnable) {
        this.A1f = runnable;
    }

    public void setGrpAdmin() {
        boolean z2 = false;
        String curr_fJid = yo.getCurr_fJid();
        if (yo.isGroupJid(curr_fJid)) {
            C16050sL A042 = C16050sL.A04(curr_fJid);
            UserJid A0C2 = getFMessage().A0C();
            if (A0C2 != null) {
                z2 = this.A0z.A0F(A042, A0C2);
                if (A0C2 != null) {
                }
            }
            Conversation.grpAdmin(this, z2);
        }
    }

    public void setIgnorePressedStateUpdates(boolean z2) {
        this.A1j = z2;
    }

    public void setMaxHeight(int i2) {
        this.A01 = i2;
    }

    public void setMessageText(String str, TextEmojiLabel textEmojiLabel, C16740tZ r9) {
        A19(textEmojiLabel, r9, str, true, true);
    }

    public void setPressed(boolean z2) {
        if (!this.A1j) {
            super.setPressed(z2);
        }
    }

    public void setSearchButtonAction(Runnable runnable) {
        this.A1g = runnable;
    }

    public void setSelectable(boolean z2) {
        this.A1k = z2;
    }

    public void setSelected(boolean z2) {
        C56572nv r0 = this.A0k;
        if (r0 != null) {
            r0.setRowSelected(z2);
        }
    }
}

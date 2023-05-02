package X;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannedString;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape211S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.IDxEListenerShape200S0100000_2_I0;
import com.facebook.redex.IDxIListenerShape444S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.obwhatsapp.mediacomposer.bottombar.recipients.RecipientsView;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.yo.Conversation;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;
import com.whatsapp.util.ViewOnClickCListenerShape2S0200000_I1_1;
import java.util.List;

/* renamed from: X.29F  reason: invalid class name */
public class AnonymousClass29F extends Dialog implements AnonymousClass29G, AnonymousClass1w8, AnonymousClass29H {
    public int A00;
    public AnonymousClass2JH A01;
    public AnonymousClass29I A02;
    public AnonymousClass2X6 A03;
    public C84484Ks A04;
    public C613938s A05;
    public AnonymousClass4UK A06;
    public CharSequence A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C16300so A0C;
    public final C49332Sl A0D;
    public final C14550pN A0E;
    public final AnonymousClass5RN A0F = new IDxCListenerShape203S0100000_2_I0(this, 7);
    public final AnonymousClass01V A0G;
    public final C15860rz A0H;
    public final AnonymousClass013 A0I;
    public final C15810rt A0J;
    public final C206711d A0K;
    public final C17250um A0L;
    public final AnonymousClass1BQ A0M;
    public final C14710pd A0N;
    public final AnonymousClass29P A0O;
    public final C17020u3 A0P;
    public final C23061Ai A0Q;
    public final List A0R;
    public final boolean A0S;

    public AnonymousClass29F(C16300so r3, C49332Sl r4, C14550pN r5, AnonymousClass01V r6, C15860rz r7, AnonymousClass013 r8, C15810rt r9, C206711d r10, C17250um r11, AnonymousClass1BQ r12, C14710pd r13, AnonymousClass29P r14, C17020u3 r15, C23061Ai r16, CharSequence charSequence, List list, int i2, boolean z2, boolean z3) {
        super(r5, R.style.style013f);
        this.A0R = list;
        this.A07 = charSequence;
        this.A00 = i2;
        this.A09 = z2;
        this.A0E = r5;
        this.A0N = r13;
        this.A0Q = r16;
        this.A0C = r3;
        this.A0J = r9;
        this.A0L = r11;
        this.A0K = r10;
        this.A0G = r6;
        this.A0I = r8;
        this.A0M = r12;
        this.A0H = r7;
        this.A0O = r14;
        this.A0P = r15;
        this.A0S = z3;
        this.A0D = r4;
    }

    public /* synthetic */ void AM7() {
    }

    public void AVs(boolean z2) {
        this.A08 = true;
        this.A0B = z2;
        onDismiss();
    }

    public void AZg() {
        AnonymousClass29P r3 = this.A0O;
        int intValue = ((Number) r3.A06.A01()).intValue();
        if (intValue == 2) {
            r3.A06(3);
        } else if (intValue == 3) {
            r3.A06(2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass013 r6 = this.A0I;
        C45902Bo.A0B(getWindow(), r6);
        boolean z2 = this.A0S;
        int i2 = R.layout.layout00f0;
        if (z2) {
            i2 = R.layout.layout0400;
        }
        setContentView(i2);
        View A002 = AnonymousClass0LL.A00(this, R.id.main);
        C15810rt r1 = this.A0J;
        C17250um r29 = this.A0L;
        AnonymousClass01V r24 = this.A0G;
        C17020u3 r0 = this.A0P;
        C17020u3 r26 = r0;
        AnonymousClass2X6 r13 = new AnonymousClass2X6(r24, r1, r29, (CaptionView) C004601z.A0E(A002, R.id.input_container_inner), r0);
        this.A03 = r13;
        CharSequence charSequence = this.A07;
        List list = this.A0R;
        C15830rv r12 = list.size() == 1 ? (C15830rv) list.get(0) : null;
        ViewGroup viewGroup = (ViewGroup) C004601z.A0E(A002, R.id.mention_attach);
        AnonymousClass29P r2 = this.A0O;
        C14550pN r28 = this.A0E;
        CaptionView captionView = r13.A04;
        MentionableEntry mentionableEntry = captionView.A0B;
        mentionableEntry.setScrollBarStyle(16777216);
        mentionableEntry.setImeOptions(6);
        mentionableEntry.setInputType(147457);
        captionView.A07.setVisibility(0);
        captionView.setCaptionEditTextView(charSequence);
        IDxObserverShape115S0100000_2_I0 iDxObserverShape115S0100000_2_I0 = new IDxObserverShape115S0100000_2_I0((Object) r13, 192);
        AnonymousClass027 r14 = r2.A06;
        r14.A0A(r28, iDxObserverShape115S0100000_2_I0);
        r13.A00((Integer) r14.A01());
        if (C16030sJ.A0L(r12) && !r13.A02.A0H(r12)) {
            mentionableEntry.A04 = A002;
            mentionableEntry.A0D(viewGroup, C16050sL.A03(r12), true, false, false);
        }
        LinearLayout linearLayout = captionView.A08;
        linearLayout.setVisibility(0);
        captionView.A05.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(220);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        linearLayout.startAnimation(alphaAnimation);
        mentionableEntry.startAnimation(alphaAnimation);
        this.A03.A04.setCaptionButtonsListener(this);
        AnonymousClass2X6 r10 = this.A03;
        CaptionView captionView2 = r10.A04;
        C17250um r19 = r10.A03;
        C17020u3 r142 = r10.A05;
        MentionableEntry mentionableEntry2 = captionView2.A0B;
        mentionableEntry2.addTextChangedListener(new AnonymousClass35O(mentionableEntry2, (TextView) captionView2.findViewById(R.id.counter), r10.A01, captionView2.A00, r19, r142, 1024, 30, true));
        mentionableEntry2.setOnEditorActionListener(new IDxAListenerShape211S0100000_2_I0(this, 2));
        mentionableEntry2.A00 = new IDxIListenerShape444S0100000_2_I0(this, 0);
        AnonymousClass4UK r122 = new AnonymousClass4UK((WaImageButton) C004601z.A0E(A002, R.id.send), r6);
        this.A06 = r122;
        int i3 = this.A00;
        C14710pd r11 = this.A0N;
        r122.A00(i3);
        AnonymousClass4UK r143 = this.A06;
        r143.A01.setOnClickListener(new ViewOnClickCListenerShape2S0200000_I1_1(r143, 0, this));
        if (z2) {
            this.A05 = this.A0D.A00((RecipientsView) C004601z.A0E(A002, R.id.media_recipients), true);
            View A0E2 = C004601z.A0E(A002, R.id.input_container);
            boolean z3 = this.A09;
            C613938s r02 = this.A05;
            if (z3) {
                r02.A03.setRecipientsListener(this);
            } else {
                RecipientsView recipientsView = r02.A03;
                recipientsView.A04 = false;
                recipientsView.A00 = R.color.color0059;
            }
            this.A05.A00((C35541m6) r2.A04.A01(), list, true);
            boolean z4 = !((List) r2.A01.A01()).isEmpty();
            getContext();
            if (z4) {
                AnonymousClass4Xy.A00(A0E2, r6);
            } else {
                AnonymousClass4Xy.A01(A0E2, r6);
            }
            this.A06.A01(z4);
        }
        getWindow().setLayout(-1, -1);
        if ((r28.getWindow().getAttributes().flags & 1024) != 0) {
            getWindow().setFlags(1024, 1024);
            getWindow().clearFlags(256);
        }
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) A002.findViewById(R.id.main);
        keyboardPopupLayout.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 20));
        C23061Ai r102 = this.A0Q;
        C16300so r9 = this.A0C;
        C206711d r4 = this.A0K;
        AnonymousClass1BQ r8 = this.A0M;
        C15860rz r3 = this.A0H;
        CaptionView captionView3 = this.A03.A04;
        C14550pN r144 = r28;
        AnonymousClass2JH r132 = new AnonymousClass2JH(r144, captionView3.A07, r9, keyboardPopupLayout, captionView3.A0B, r24, r3, r6, r4, r29, r8, r11, r26, r102);
        this.A01 = r132;
        r132.A0E = new RunnableRunnableShape10S0100000_I0_9((Object) this, 45);
        AnonymousClass29I r82 = new AnonymousClass29I(r144, r6, this.A01, r4, r29, (EmojiSearchContainer) A002.findViewById(R.id.emoji_search_container), r26);
        this.A02 = r82;
        r82.A00 = new IDxEListenerShape200S0100000_2_I0(this, 5);
        AnonymousClass2JH r32 = this.A01;
        r32.A0C(this.A0F);
        r32.A00 = Conversation.eswitch();
        r32.A03 = R.drawable.ib_keyboard;
        getWindow().setSoftInputMode(5);
        this.A03.A04.A0B.A04(true);
    }

    public void onDismiss() {
        super.dismiss();
        if (this.A01.isShowing()) {
            this.A01.dismiss();
        }
        CaptionView captionView = this.A03.A04;
        this.A04 = new C84484Ks(new SpannedString(captionView.getCaptionText()), captionView.A0B.getStringText(), captionView.A0B.getMentions());
        this.A03.A04.A0B.A08();
    }
}

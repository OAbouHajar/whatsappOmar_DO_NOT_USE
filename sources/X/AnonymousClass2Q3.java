package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.search.views.itemviews.AudioPlayerView;
import com.obwhatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.2Q3  reason: invalid class name */
public class AnonymousClass2Q3 extends AnonymousClass2Q4 {
    public TextView A00;
    public C52922ef A01;
    public final View.OnClickListener A02 = new ViewOnClickCListenerShape9S0100000_I0_2(this, 36);
    public final ImageView A03;
    public final ImageView A04;
    public final AnonymousClass2Ao A05;
    public final C19610yi A06;
    public final AnonymousClass1RV A07;
    public final C612638f A08;
    public final AudioPlayerView A09;
    public final VoiceNoteProfileAvatarView A0A;
    public final boolean A0B;
    public final boolean A0C;

    public AnonymousClass2Q3(Context context, AnonymousClass2Ao r12, AnonymousClass1YG r13, AnonymousClass1B5 r14, C19610yi r15, AnonymousClass1RV r16, C38701rH r17) {
        super(context, r13, r14, r15, r17);
        this.A05 = r12;
        this.A07 = r16;
        this.A06 = r15;
        this.A0C = C30211bx.A01(this.A0M);
        this.A09 = (AudioPlayerView) C004601z.A0E(this, R.id.conversation_row_audio_player_view);
        VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = (VoiceNoteProfileAvatarView) C004601z.A0E(this, R.id.conversation_row_voice_note_profile_avatar);
        this.A0A = voiceNoteProfileAvatarView;
        this.A04 = voiceNoteProfileAvatarView.A05;
        this.A03 = voiceNoteProfileAvatarView.A03;
        this.A00 = (TextView) findViewById(R.id.description);
        this.A0B = AnonymousClass2JP.A06(this.A0J.A0P());
        C16150sX r1 = this.A01.A00.A03;
        this.A08 = new C612638f((AnonymousClass1B5) r1.AEp.get(), (C15860rz) r1.AQh.get(), voiceNoteProfileAvatarView);
        A1U(false, false);
    }

    public void A0t() {
        super.A0t();
        A1U(false, false);
    }

    public void A0z() {
        C38701rH A022;
        AccessibilityManager A0P;
        if (this.A0M.A0E(C16620tM.A02, 931)) {
            AnonymousClass2DE.A04(this.A04.getRootView(), this.A06, this.A00);
        }
        C38701rH r10 = (C38701rH) ((C16730tY) this.A0O);
        AnonymousClass1YG r3 = this.A0b;
        if (r3 instanceof C42811yi) {
            Conversation conversation = (Conversation) ((C42811yi) r3);
            C42821yj r1 = conversation.A00;
            boolean z2 = true;
            if (!r1.A4g && (A0P = ((C14550pN) r1.A22).A08.A0P()) != null && A0P.isTouchExplorationEnabled()) {
                z2 = false;
            }
            if (this.A01 == null || RequestPermissionActivity.A0X(getContext(), this.A01)) {
                Context context = getContext();
                C1034251i r11 = new C1034251i(this);
                AnonymousClass1PD r12 = this.A0P;
                AnonymousClass00B.A06(r12);
                if (C62053Bl.A04(context, this.A0J, r10, r11, r12, this.A1d)) {
                    if (!(!this.A0C || (A022 = this.A06.A02()) == null || A022.A13 == r10.A13)) {
                        conversation.A00.A0k(A022, 0, false);
                    }
                    AnonymousClass2DT A002 = this.A07.A00(C19980zJ.A00(getContext()), r10, true);
                    A002.A0D(r10);
                    A002.A0L = new C101494xP(this);
                    if (z2) {
                        conversation.A00.A4X = true;
                        A002.A0J = new AnonymousClass3FM(this, A002, r10);
                    } else {
                        A002.A0J = new C101444xK(this, r10);
                    }
                    A002.A0G(true);
                    super.A0t();
                    A1U(true, true);
                    return;
                }
                return;
            }
            return;
        }
        super.A0z();
    }

    public void A1G(C16740tZ r4, boolean z2) {
        boolean z3 = false;
        if (r4 != ((C16730tY) this.A0O)) {
            z3 = true;
        }
        super.A1G(r4, z2);
        if (z2 || z3) {
            A1U(false, false);
        }
    }

    public void A1H(C16740tZ r3, boolean z2) {
        super.A1G(r3, true);
        A1U(false, true);
    }

    public final void A1T(C38701rH r6) {
        AnonymousClass1YG r4 = this.A0b;
        if (r4 instanceof C42811yi) {
            ((Conversation) ((C42811yi) r4)).A00.A0k(r6, (long) this.A0N.A02(C15910s6.A1u), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0125, code lost:
        if (r0 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
        if (X.C16030sJ.A0Q(r2) != false) goto L_0x0141;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1U(boolean r13, boolean r14) {
        /*
            r12 = this;
            X.0tZ r6 = r12.A0O
            X.0tY r6 = (X.C16730tY) r6
            X.1rH r6 = (X.C38701rH) r6
            com.obwhatsapp.search.views.itemviews.AudioPlayerView r5 = r12.A09
            com.obwhatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r4 = r12.A0A
            X.AnonymousClass3Ar.A02(r6, r5, r4)
            X.2Ao r9 = r12.A05
            X.0sK r2 = r12.A0L
            X.0sG r10 = r12.A0a
            X.0pd r1 = r12.A0M
            r0 = 1040(0x410, float:1.457E-42)
            X.0tM r8 = X.C16620tM.A02
            boolean r0 = r1.A0E(r8, r0)
            if (r0 == 0) goto L_0x0114
            boolean r0 = r6.A1A()
            if (r0 == 0) goto L_0x0114
            r0 = 1
            r4.setIsForwardedByNonAuthorPttUi(r0)
        L_0x0029:
            X.1Vw r2 = r6.A11
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0058
            X.0rv r0 = r2.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x0058
            r0 = 2131362973(0x7f0a049d, float:1.8345742E38)
            android.view.View r7 = r12.findViewById(r0)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165839(0x7f07028f, float:1.7945906E38)
            int r3 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165838(0x7f07028e, float:1.7945904E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            r7.setPadding(r0, r3, r0, r1)
        L_0x0058:
            X.0pd r1 = r12.A0M
            r0 = 637(0x27d, float:8.93E-43)
            boolean r0 = r1.A0E(r8, r0)
            if (r0 == 0) goto L_0x0072
            r0 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = r6.A10(r0)
            if (r0 != 0) goto L_0x0103
            r0 = 0
            r5.setTag(r0)
            r5.A00()
        L_0x0072:
            boolean r0 = r12.A0C
            if (r0 == 0) goto L_0x00f8
            android.view.View$OnClickListener r0 = r12.A02
            r4.setOnFastPlaybackButtonClickListener(r0)
            X.0tZ r9 = r12.A0O
            X.0tY r9 = (X.C16730tY) r9
            X.1B5 r0 = r12.A07
            X.0yi r1 = r0.A03
            boolean r0 = r1.A0D(r9)
            if (r0 == 0) goto L_0x0101
            X.2DT r3 = r1.A00()
        L_0x008d:
            X.0yi r0 = r12.A06
            X.1rH r2 = r0.A02()
            X.2DT r1 = r0.A00()
            X.1Vw r0 = r9.A11
            boolean r7 = r0.A02
            X.0rv r0 = r0.A00
            boolean r8 = X.C16030sJ.A0L(r0)
            if (r3 == 0) goto L_0x00a9
            boolean r0 = r3.A0J()
            if (r0 != 0) goto L_0x00bd
        L_0x00a9:
            if (r13 != 0) goto L_0x00bd
            if (r1 == 0) goto L_0x00b3
            boolean r0 = r1.A0J()
            if (r0 != 0) goto L_0x00fc
        L_0x00b3:
            if (r2 == 0) goto L_0x00fc
            long r2 = r2.A13
            long r0 = r9.A13
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x00fc
        L_0x00bd:
            int r1 = X.AnonymousClass2DT.A0x
            r3 = 1
            r0 = 1
            if (r1 == 0) goto L_0x00c9
            r0 = 2
            if (r1 == r3) goto L_0x00c9
            if (r1 != r0) goto L_0x0157
            r0 = 3
        L_0x00c9:
            r4.A01(r0, r14, r7, r8)
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x00f8
            if (r7 == 0) goto L_0x00f8
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x00f8
            r0 = 2131362948(0x7f0a0484, float:1.834569E38)
            android.view.View r2 = r5.findViewById(r0)
            r0 = 2131363664(0x7f0a0750, float:1.8347143E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r2 == 0) goto L_0x00f8
            if (r1 == 0) goto L_0x00f8
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00f8
            com.facebook.redex.IDxDCompatShape3S0200000_2_I0 r0 = new com.facebook.redex.IDxDCompatShape3S0200000_2_I0
            r0.<init>(r2, r3, r12)
            X.C004601z.A0j(r1, r0)
        L_0x00f8:
            r12.A1O(r6)
            return
        L_0x00fc:
            r0 = 0
            r4.A01(r0, r14, r7, r8)
            goto L_0x00f8
        L_0x0101:
            r3 = 0
            goto L_0x008d
        L_0x0103:
            r5.setTag(r2)
            X.1RV r2 = r12.A07
            r1 = 17
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r12, r1, r6)
            r2.A01(r6, r0)
            goto L_0x0072
        L_0x0114:
            r11 = 0
            r4.setIsForwardedByNonAuthorPttUi(r11)
            X.1Vw r1 = r6.A11
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x012c
            android.widget.ImageView r7 = r4.A05
            r2.A0B()
            X.1Zb r0 = r2.A01
            if (r0 == 0) goto L_0x0029
        L_0x0127:
            r9.A06(r7, r0)
            goto L_0x0029
        L_0x012c:
            android.widget.ImageView r3 = r4.A03
            android.widget.ImageView r7 = r4.A05
            X.0rv r2 = r1.A00
            boolean r1 = X.C16030sJ.A0L(r2)
            r0 = 8
            if (r1 == 0) goto L_0x014d
            r3.setVisibility(r11)
            r7.setVisibility(r0)
            r7 = r3
        L_0x0141:
            X.0rv r2 = r6.A0B()
        L_0x0145:
            X.AnonymousClass00B.A06(r2)
            X.0sH r0 = r10.A0A(r2)
            goto L_0x0127
        L_0x014d:
            r3.setVisibility(r0)
            boolean r0 = X.C16030sJ.A0Q(r2)
            if (r0 == 0) goto L_0x0145
            goto L_0x0141
        L_0x0157:
            java.lang.String r0 = "Unsupported FastPlaybackPlayerState "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Q3.A1U(boolean, boolean):void");
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01e3;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01e3;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01e5;
    }

    public void setDuration(String str) {
        TextView textView = this.A00;
        if (textView == null) {
            textView = (TextView) findViewById(R.id.description);
            this.A00 = textView;
        }
        textView.setText(str);
    }
}

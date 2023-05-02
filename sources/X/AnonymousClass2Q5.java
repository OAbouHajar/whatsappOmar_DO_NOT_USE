package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxAProviderShape377S0100000_2_I0;
import com.facebook.redex.IDxDCallbackShape375S0100000_2_I0;
import com.facebook.redex.IDxOCallbackShape376S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.obwhatsapp.conversation.conversationrow.message.IDxDCallbackShape15S0200000_2_I0;
import com.obwhatsapp.search.views.itemviews.AudioPlayerView;
import com.obwhatsapp.search.views.itemviews.IDxObserverShape98S0100000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Q5  reason: invalid class name */
public class AnonymousClass2Q5 extends AnonymousClass2Q6 {
    public AnonymousClass01D A00;
    public AnonymousClass01D A01;
    public AnonymousClass01D A02;
    public final View.OnClickListener A03 = new ViewOnClickCListenerShape9S0100000_I0_2(this, 33);
    public final View A04;
    public final TextView A05;
    public final ConversationRowAudioPreview A06;
    public final AnonymousClass1B5 A07;
    public final C19610yi A08;
    public final AudioPlayerView A09;

    public AnonymousClass2Q5(Context context, AnonymousClass1YG r9, AnonymousClass1B5 r10, C19610yi r11, C38701rH r12) {
        super(context, r9, r12);
        this.A07 = r10;
        this.A08 = r11;
        this.A04 = findViewById(R.id.conversation_row_root);
        AudioPlayerView audioPlayerView = (AudioPlayerView) C004601z.A0E(this, R.id.conversation_row_audio_player_view);
        this.A09 = audioPlayerView;
        this.A06 = (ConversationRowAudioPreview) findViewById(R.id.conversation_row_audio_preview);
        this.A05 = (TextView) C004601z.A0E(this, R.id.description);
        audioPlayerView.setPlaybackListener(new AnonymousClass3DK(r11, audioPlayerView, new IDxAProviderShape377S0100000_2_I0(this, 0), new IDxObserverShape98S0100000_2_I0(this, 0), this.A01));
        View.OnLongClickListener onLongClickListener = this.A1n;
        audioPlayerView.setSeekbarLongClickListener(onLongClickListener);
        audioPlayerView.setOnControlButtonLongClickListener(onLongClickListener);
        A1Q();
        int AFH = ((AnonymousClass1B7) this.A01.get()).AFH(r12.A13);
        if (AFH >= 0) {
            audioPlayerView.setSeekbarProgress(AFH);
        }
    }

    public void A0t() {
        A1J(false);
        A1Q();
    }

    public void A0z() {
        if (this.A0M.A0E(C16620tM.A02, 931)) {
            AnonymousClass2DE.A04(this.A04.getRootView(), this.A08, this.A00);
        }
        if (this.A01 == null || RequestPermissionActivity.A0X(getContext(), this.A01)) {
            C38701rH r3 = (C38701rH) ((C16730tY) this.A0O);
            StringBuilder sb = new StringBuilder("conversationrowvoicenote/viewmessage ");
            sb.append(r3.A11);
            Log.i(sb.toString());
            Context context = getContext();
            C1034251i r4 = new C1034251i(this);
            AnonymousClass1PD r5 = this.A0P;
            AnonymousClass00B.A06(r5);
            if (C62053Bl.A04(context, this.A0J, r3, r4, r5, this.A1d)) {
                AnonymousClass2DT A002 = this.A07.A00(C19980zJ.A00(getContext()), r3, false);
                A002.A0D(r3);
                A002.A0L = new C101494xP(this);
                A002.A0G(false);
                A0t();
            }
        }
    }

    public void A1G(C16740tZ r3, boolean z2) {
        boolean z3 = false;
        if (r3 != this.A0O) {
            z3 = true;
        }
        super.A1G(r3, z2);
        if (z2 || z3) {
            A1Q();
        } else if (C38621r6.A11(getFMessage())) {
            A1R();
        }
    }

    public final void A1Q() {
        C34331k5 r0;
        String A042;
        File file;
        C38701rH r8 = (C38701rH) ((C16730tY) this.A0O);
        C16750ta r2 = r8.A02;
        AnonymousClass00B.A06(r2);
        this.A04.setContentDescription(AnonymousClass3Ar.A01(getContext(), this.A0a, this.A0d, this.A0r, this.A0K, r8));
        TextView textView = this.A05;
        textView.setVisibility(0);
        if (r8.A00 == 0) {
            r8.A00 = C17970vw.A03(r2.A0F);
        }
        C16730tY fMessage = getFMessage();
        if (C38621r6.A10(fMessage)) {
            ConversationRowAudioPreview conversationRowAudioPreview = this.A06;
            if (conversationRowAudioPreview != null) {
                conversationRowAudioPreview.A00();
            }
            textView.setText(AnonymousClass2GQ.A03(this.A0K, r8.A01));
            AudioPlayerView audioPlayerView = this.A09;
            audioPlayerView.setPlayButtonState(4);
            audioPlayerView.setOnControlButtonClickListener(this.A08);
            audioPlayerView.setSeekbarProgress(0);
        } else if (C38621r6.A11(fMessage)) {
            if (AnonymousClass1ZW.A0E(r8.A14()) && (file = r2.A0F) != null) {
                r8.A07 = file.getName();
            }
            if (AnonymousClass1ZW.A0E(r8.A14())) {
                textView.setVisibility(8);
            } else {
                textView.setText(r8.A14());
            }
            AudioPlayerView audioPlayerView2 = this.A09;
            audioPlayerView2.setSeekbarColor(AnonymousClass00T.A00(getContext(), R.color.color0579));
            A1R();
            audioPlayerView2.setOnControlButtonClickListener(this.A03);
            A0x();
            A1O(r8);
        } else {
            ConversationRowAudioPreview conversationRowAudioPreview2 = this.A06;
            if (conversationRowAudioPreview2 != null) {
                conversationRowAudioPreview2.A00();
            }
            textView.setText(AnonymousClass2GQ.A03(this.A0K, r8.A01));
            boolean A0z = C38621r6.A0z(r8);
            AudioPlayerView audioPlayerView3 = this.A09;
            if (!A0z) {
                audioPlayerView3.setPlayButtonState(2);
                r0 = this.A0A;
            } else {
                audioPlayerView3.setPlayButtonState(3);
                r0 = this.A09;
            }
            audioPlayerView3.setOnControlButtonClickListener(r0);
            int i2 = r8.A00;
            if (i2 != 0) {
                A042 = C28961Zl.A04(this.A0K, (long) i2);
                setDuration(A042);
                A0x();
                A1O(r8);
            }
        }
        A042 = AnonymousClass2GQ.A03(this.A0K, r8.A01);
        setDuration(A042);
        A0x();
        A1O(r8);
    }

    public final void A1R() {
        C38701rH r4 = (C38701rH) ((C16730tY) this.A0O);
        C19610yi r1 = this.A08;
        if (!r1.A0D(r4)) {
            A1S(r4);
            return;
        }
        AnonymousClass2DT A002 = r1.A00();
        if (A002 != null) {
            if (!A002.A0J()) {
                A1S(r4);
            } else {
                AudioPlayerView audioPlayerView = this.A09;
                audioPlayerView.setPlayButtonState(1);
                audioPlayerView.setSeekbarMax((int) TimeUnit.SECONDS.toMillis((long) r4.A00));
                audioPlayerView.setSeekbarProgress(A002.A03());
                setDuration(C28961Zl.A04(this.A0K, (long) (A002.A03() / 1000)));
                ConversationRowAudioPreview conversationRowAudioPreview = this.A06;
                if (conversationRowAudioPreview != null) {
                    conversationRowAudioPreview.A03.setVisibility(0);
                    conversationRowAudioPreview.A00.setVisibility(8);
                }
            }
            AudioPlayerView audioPlayerView2 = this.A09;
            audioPlayerView2.setSeekbarContentDescription((long) A002.A03());
            A002.A0L = new C101494xP(this);
            A002.A0K = new IDxDCallbackShape15S0200000_2_I0(this, this.A06, A002, new IDxDCallbackShape375S0100000_2_I0(this, 0), new IDxOCallbackShape376S0100000_2_I0(this, 0), audioPlayerView2);
        }
    }

    public final void A1S(C38701rH r4) {
        Number number = (Number) AnonymousClass2DT.A0y.get(r4.A11);
        int intValue = number == null ? 0 : number.intValue();
        AudioPlayerView audioPlayerView = this.A09;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(r4.A00 * 1000);
        audioPlayerView.setSeekbarProgress(intValue);
        audioPlayerView.setSeekbarContentDescription((long) intValue);
        setDuration(C28961Zl.A04(this.A0K, (long) r4.A00));
        ConversationRowAudioPreview conversationRowAudioPreview = this.A06;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout0174;
    }

    public C38701rH getFMessage() {
        return (C38701rH) ((C16730tY) this.A0O);
    }

    public int getIncomingLayoutId() {
        return R.layout.layout0174;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout0176;
    }

    public void setDuration(String str) {
        ConversationRowAudioPreview conversationRowAudioPreview = this.A06;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.setDuration(str);
        }
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C38701rH);
        super.setFMessage(r2);
    }
}

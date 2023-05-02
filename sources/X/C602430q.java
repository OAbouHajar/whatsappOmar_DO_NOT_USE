package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxIListenerShape29S0000000_2_I1;
import com.facebook.redex.IDxTRendererShape197S0100000_1_I1;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaFrameLayout;
import com.obwhatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.30q  reason: invalid class name and case insensitive filesystem */
public class C602430q extends C602530r {
    public int A00;
    public int A01;
    public long A02 = 0;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ImageView A06;
    public TextView A07;
    public C16180sb A08;
    public TextEmojiLabel A09;
    public ConversationRowVideo$RowVideoView A0A;
    public C33741j5 A0B;
    public C33741j5 A0C;
    public AnonymousClass29C A0D;
    public AnonymousClass1LB A0E;
    public Runnable A0F;
    public Runnable A0G;
    public boolean A0H = false;
    public final C86374Sl A0I;
    public final AnonymousClass25V A0J = new IDxTRendererShape197S0100000_1_I1(this, 1);
    public final C34331k5 A0K = new ViewOnClickCListenerShape5S0100000_I1_1(this, 9);

    public C602430q(Context context, AnonymousClass1YG r6, C38801rR r7) {
        super(context, r6, r7);
        this.A0I = r6 != null ? (C86374Sl) r6.AAy(C86374Sl.class) : null;
        this.A07 = C13680ns.A0M(this, R.id.control_btn);
        this.A0A = (ConversationRowVideo$RowVideoView) findViewById(R.id.thumb);
        this.A0C = new C33741j5(findViewById(R.id.progress_bar));
        this.A0B = new C33741j5(findViewById(R.id.cancel_download));
        this.A03 = findViewById(R.id.control_frame);
        this.A09 = C13680ns.A0R(this, R.id.caption);
        this.A05 = C13690nt.A0K(this, R.id.video_containter);
        this.A04 = findViewById(R.id.text_and_date);
        this.A06 = C13680ns.A0K(this, R.id.gif_attribution);
        TextEmojiLabel textEmojiLabel = this.A09;
        if (textEmojiLabel != null) {
            C30531cW.A02(textEmojiLabel);
        }
        this.A0C.A05(new IDxIListenerShape29S0000000_2_I1(0));
        A0e(true);
    }

    private void A0e(boolean z2) {
        C34331k5 r3;
        boolean z3;
        AnonymousClass01Q r4;
        Drawable A002;
        int i2;
        int i3;
        int i4;
        C16730tY r0 = (C16730tY) this.A0O;
        C28381Vw r5 = r0.A11;
        hashCode();
        C16750ta A003 = C16730tY.A00(r0);
        if (z2) {
            this.A07.setTag(Collections.singletonList(r0));
        }
        TextView textView = this.A07;
        textView.setVisibility(0);
        A1S();
        if (z2) {
            A1T(true);
        }
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0A;
        conversationRowVideo$RowVideoView.setKeepRatio(true);
        C16730tY fMessage = getFMessage();
        if (C38621r6.A10(fMessage)) {
            textView.setVisibility(8);
            View view = this.A03;
            C33741j5 r11 = this.A0C;
            AnonymousClass2Q7.A0c(view, textView, r11, this.A0B, true, !z2, false);
            conversationRowVideo$RowVideoView.setVisibility(0);
            C34331k5 r42 = r5.A02 ? this.A0B : null;
            conversationRowVideo$RowVideoView.setOnClickListener(r42);
            this.A05.setOnClickListener(r42);
            C34331k5 r32 = this.A08;
            textView.setOnClickListener(r32);
            r11.A04(r32);
        } else if (C38621r6.A11(fMessage)) {
            View view2 = this.A03;
            C33741j5 r43 = this.A0C;
            C33741j5 r33 = this.A0B;
            AnonymousClass2Q7.A0c(view2, textView, r43, r33, false, false, false);
            r33.A03(0);
            ((ImageView) r33.A02()).setImageResource(R.drawable.ic_gif_thumb);
            textView.setVisibility(8);
            ViewGroup viewGroup = this.A05;
            viewGroup.setOnClickListener(this.A0B);
            C13680ns.A0t(viewGroup.getContext(), viewGroup, R.string.str19db);
            ViewOnClickCListenerShape5S0200000_I1 viewOnClickCListenerShape5S0200000_I1 = new ViewOnClickCListenerShape5S0200000_I1((Object) this, 45, (Object) r0);
            textView.setOnClickListener(viewOnClickCListenerShape5S0200000_I1);
            conversationRowVideo$RowVideoView.setOnClickListener(viewOnClickCListenerShape5S0200000_I1);
            C13680ns.A0t(conversationRowVideo$RowVideoView.getContext(), conversationRowVideo$RowVideoView, R.string.str12a9);
            C86374Sl r9 = this.A0I;
            if (r9 != null) {
                synchronized (r9) {
                    Map map = r9.A00;
                    z3 = false;
                    if (!(map == null || (r4 = (AnonymousClass01Q) map.get(r5)) == null)) {
                        long longValue = ((Long) r4.A00).longValue();
                        int intValue = ((Integer) r4.A01).intValue();
                        if (longValue < 6000 || intValue < 3) {
                            z3 = true;
                        }
                    }
                }
                if (z3) {
                    A1R();
                }
            }
        } else {
            C33741j5 r7 = this.A0B;
            r7.A03(8);
            if (!C38621r6.A0z(getFMessage())) {
                textView.setText(R.string.str146a);
                C13680ns.A0t(getContext(), textView, R.string.str146a);
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
                textView.setOnClickListener(this.A0A);
                r3 = this.A0B;
            } else {
                A18(textView, Collections.singletonList(r0), r0.A01);
                C13680ns.A0t(textView.getContext(), textView, R.string.str0326);
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                r3 = this.A0K;
                textView.setOnClickListener(r3);
            }
            conversationRowVideo$RowVideoView.setOnClickListener(r3);
            AnonymousClass2Q7.A0c(this.A03, textView, this.A0C, r7, false, !z2, false);
        }
        A0x();
        View.OnLongClickListener onLongClickListener = this.A1n;
        conversationRowVideo$RowVideoView.setOnLongClickListener(onLongClickListener);
        this.A05.setOnLongClickListener(onLongClickListener);
        WaFrameLayout waFrameLayout = (WaFrameLayout) C004601z.A0E(this, R.id.media_container);
        boolean z4 = r5.A02;
        Context context = getContext();
        if (z4) {
            A002 = AnonymousClass4Y4.A01(context);
            i2 = R.color.color00c8;
            i3 = R.color.color00c9;
        } else {
            A002 = AnonymousClass4Y4.A00(context);
            i2 = R.color.color00c6;
            i3 = R.color.color00c7;
        }
        waFrameLayout.A03 = i2;
        waFrameLayout.A02 = i3;
        waFrameLayout.setForeground(A002);
        int A012 = AnonymousClass1UP.A01(getContext());
        int A004 = C25791Ld.A00(r0, A012);
        if (A004 <= 0) {
            A004 = (A012 * 9) >> 4;
        }
        this.A00 = A004;
        this.A01 = A012;
        conversationRowVideo$RowVideoView.A02(A012, A004, true);
        this.A1d.A07(conversationRowVideo$RowVideoView, r0, this.A0J);
        if (r0.A00 == 0) {
            r0.A00 = C17970vw.A03(A003.A0F);
        }
        int i5 = C16730tY.A00((C16730tY) this.A0O).A05;
        ImageView imageView = this.A06;
        if (i5 != 1) {
            i4 = R.drawable.ic_attributes_tenor;
            if (i5 != 2) {
                imageView.setVisibility(8);
            }
            imageView.setImageResource(i4);
            imageView.setVisibility(0);
        } else {
            i4 = R.drawable.ic_attributes_giphy;
            imageView.setImageResource(i4);
            imageView.setVisibility(0);
        }
        A1N(this.A04, this.A09, getFMessage().A13());
        hashCode();
        A1O(r0);
    }

    public int A0q(int i2) {
        if (!C30011bb.A0Z(this)) {
            return super.A0q(i2);
        }
        return 0;
    }

    public void A0t() {
        A0e(false);
        A1J(false);
    }

    public void A0z() {
        C14870pt r1;
        int i2;
        String str;
        if (this.A01 == null || C14570pP.A1W(this)) {
            C16730tY r6 = (C16730tY) this.A0O;
            C16750ta A002 = C16730tY.A00(r6);
            C28381Vw r3 = r6.A11;
            boolean z2 = r3.A02;
            if (z2 || A002.A0P) {
                boolean z3 = true;
                if (z2 && !A002.A0P && !A002.A0O && (str = A002.A0H) != null && C17970vw.A0E(this.A08, str).exists()) {
                    r1 = this.A0J;
                    i2 = R.string.str039c;
                } else if (A002.A07 == 1) {
                    r1 = this.A0J;
                    i2 = R.string.str093a;
                } else {
                    File file = A002.A0F;
                    boolean A0b = file == null ? false : C30011bb.A0b(file);
                    C30011bb.A0V(A002, r6, AnonymousClass000.A0r("viewmessage/ from_me:"), z2);
                    if (!A0b) {
                        A1Q();
                        return;
                    }
                    View findViewById = findViewById(R.id.media_container);
                    C616339r r0 = this.A0c;
                    if (r0 == null || !r0.A08()) {
                        z3 = false;
                    }
                    Intent A003 = C30011bb.A09(this, r3, z3).A00();
                    if (findViewById != null) {
                        C455529g.A07(getContext(), A003, findViewById);
                    }
                    C30011bb.A0F(A003, this, findViewById, r3);
                    return;
                }
                r1.A07(i2, 1);
            }
        }
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A0e(A1a);
        }
    }

    public final void A1Q() {
        Log.w("viewmessage/ no file");
        C16740tZ r1 = this.A0O;
        if (A1P()) {
            return;
        }
        if (this.A0c.A08()) {
            C14550pN A022 = AnonymousClass22N.A02(this);
            if (A022 != null) {
                this.A0P.A01(A022);
                return;
            }
            return;
        }
        Context context = getContext();
        C28381Vw r0 = r1.A11;
        C13690nt.A0u(C14750ph.A0I(context, r0.A00, r0.hashCode()), this);
    }

    public final void A1R() {
        File file = C16730tY.A00((C16730tY) this.A0O).A0F;
        if (file == null || !C30011bb.A0b(file)) {
            A1Q();
        } else if (this.A0G == null && this.A0F == null) {
            RunnableRunnableShape18S0100000_I1_1 runnableRunnableShape18S0100000_I1_1 = new RunnableRunnableShape18S0100000_I1_1((Object) this, 6);
            this.A0G = runnableRunnableShape18S0100000_I1_1;
            this.A0J.A0K(runnableRunnableShape18S0100000_I1_1);
        }
    }

    public final void A1S() {
        Runnable runnable = this.A0G;
        if (runnable != null) {
            this.A0J.A0J(runnable);
        }
        Runnable runnable2 = this.A0F;
        if (runnable2 != null) {
            this.A0J.A0J(runnable2);
        }
        this.A0G = null;
        this.A0F = null;
    }

    public final void A1T(boolean z2) {
        AnonymousClass29C r0 = this.A0D;
        if (r0 != null) {
            r0.hashCode();
            AnonymousClass29C r3 = this.A0D;
            r3.A04 = null;
            r3.A0B = null;
            if (z2) {
                C88394aQ r1 = this.A0E.A00;
                AnonymousClass00B.A01();
                if (r1.A07.remove(r3)) {
                    List list = r1.A06;
                    list.add(r3);
                    r3.hashCode();
                    list.size();
                } else {
                    Log.e(AnonymousClass000.A0l(AnonymousClass000.A0r("ExoPlayerVideoPlayerPoolManager/releaseVideoPlayerInstance/playerNotProvidedByPool videoPlayerId="), r3.hashCode()));
                }
            }
            this.A0D = null;
        }
        this.A0A.setVisibility(0);
        this.A03.setVisibility(0);
    }

    public int getBroadcastDrawableId() {
        return C30011bb.A00(this);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout0191;
    }

    public C38801rR getFMessage() {
        return (C38801rR) ((C16730tY) this.A0O);
    }

    public int getIncomingLayoutId() {
        return R.layout.layout0191;
    }

    public Drawable getKeepDrawable() {
        return C30011bb.A0Z(this) ? C30011bb.A04(this) : super.getKeepDrawable();
    }

    public int getMainChildMaxWidth() {
        int A022 = C31171dd.A02(this);
        int i2 = this.A00;
        int i3 = this.A01;
        return i2 > i3 ? (int) ((((float) A022) / ((float) i2)) * ((float) i3)) : A022;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout0192;
    }

    public int getReactionsViewVerticalOverlap() {
        return C30011bb.A0Z(this) ? getResources().getDimensionPixelOffset(R.dimen.dimen0768) : super.getReactionsViewVerticalOverlap();
    }

    public Drawable getStarDrawable() {
        return C30011bb.A0Z(this) ? AnonymousClass00T.A04(getContext(), R.drawable.message_star_media) : super.getStarDrawable();
    }

    public void onAttachedToWindow() {
        hashCode();
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        C28381Vw r1 = this.A0O.A11;
        hashCode();
        super.onDetachedFromWindow();
        A1S();
        A1T(true);
        C86374Sl r0 = this.A0I;
        if (r0 != null) {
            r0.A01(r1);
        }
    }

    public void onFinishTemporaryDetach() {
        hashCode();
        super.onFinishTemporaryDetach();
    }

    public void onStartTemporaryDetach() {
        C86374Sl r6;
        AnonymousClass01Q r3;
        C16730tY r32 = (C16730tY) this.A0O;
        C28381Vw r7 = r32.A11;
        hashCode();
        super.onStartTemporaryDetach();
        if (this.A0D != null) {
            long j2 = this.A02;
            if (j2 > 0 && (r6 = this.A0I) != null) {
                long currentTimeMillis = System.currentTimeMillis() - j2;
                synchronized (r6) {
                    int i2 = r32.A00;
                    int A082 = (int) (currentTimeMillis / (i2 <= 1 ? 600 : C13690nt.A08(i2)));
                    Map map = r6.A00;
                    if (!(map == null || (r3 = (AnonymousClass01Q) map.get(r7)) == null)) {
                        long longValue = ((Long) r3.A00).longValue() + currentTimeMillis;
                        int intValue = ((Integer) r3.A01).intValue();
                        if (A082 > 0) {
                            intValue += A082;
                        }
                        r6.A00.put(r7, new AnonymousClass01Q(Long.valueOf(longValue), Integer.valueOf(intValue)));
                    }
                }
                this.A02 = 0;
            }
        }
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C38801rR);
        super.setFMessage(r2);
    }
}

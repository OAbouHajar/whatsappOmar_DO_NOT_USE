package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0;
import com.whatsapp.voipcalling.Voip;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2AN  reason: invalid class name */
public class AnonymousClass2AN extends RelativeLayout implements AnonymousClass006 {
    public C17650vQ A00;
    public C51982cd A01;
    public C16000sG A02;
    public C17140ub A03;
    public C16080sP A04;
    public AnonymousClass01V A05;
    public AnonymousClass013 A06;
    public C14710pd A07;
    public C17240ul A08;
    public C15830rv A09;
    public C15830rv A0A;
    public C216014s A0B;
    public AnonymousClass15A A0C;
    public C52662eE A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final TextView A0I;
    public final TextView A0J;
    public final WaImageView A0K;
    public final C33481ie A0L;
    public final C19270y9 A0M;
    public final Runnable A0N;

    public AnonymousClass2AN(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A0E) {
            this.A0E = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A07 = (C14710pd) r1.A05.get();
            this.A0B = (C216014s) r1.AMr.get();
            this.A0C = (AnonymousClass15A) r1.A3J.get();
            this.A00 = C16150sX.A0J(r1);
            this.A02 = (C16000sG) r1.A4x.get();
            this.A05 = (AnonymousClass01V) r1.AOi.get();
            this.A04 = (C16080sP) r1.AQ9.get();
            this.A06 = (AnonymousClass013) r1.AR8.get();
            this.A03 = (C17140ub) r1.A4y.get();
            this.A08 = (C17240ul) r1.ABK.get();
        }
        this.A0N = new RunnableRunnableShape5S0100000_I0_4((Object) this, 13);
        this.A0M = new IDxCObserverShape111S0100000_2_I0(this, 2);
        this.A0L = new IDxCObserverShape68S0100000_2_I0(this, 6);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout05fa, this, true);
        TextView textView = (TextView) C004601z.A0E(inflate, R.id.call_notification_timer);
        this.A0I = textView;
        this.A0J = (TextView) C004601z.A0E(inflate, R.id.call_notification_title);
        this.A0K = (WaImageView) C004601z.A0E(inflate, R.id.call_notification_icon);
        textView.setFocusable(true);
        C004601z.A0j(textView, new IDxDCompatShape22S0100000_2_I0(this, 6));
        setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(context, 11, this));
        AnonymousClass2JP.A02(this);
        setVisibility(this.A00.A00() ? 0 : 8);
        textView.setText("");
        textView.setTag((Object) null);
    }

    public static /* synthetic */ void A00(AnonymousClass2AN r3, Collection collection) {
        C15830rv r0 = r3.A09;
        if (r0 != null && (r0 instanceof GroupJid)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C15830rv r1 = ((C16010sH) it.next()).A0E;
                if (r1 != null && r1.equals(r3.A09)) {
                    r3.A02();
                }
            }
        }
    }

    private void setContainerChatJid(C15830rv r1) {
        this.A0A = r1;
    }

    public final void A01() {
        if (getContext() == null) {
            Log.w("voip/VoipReturnToCallBanner no context when call start");
            return;
        }
        WaImageView waImageView = this.A0K;
        waImageView.setVisibility(0);
        boolean z2 = this.A0G;
        int i2 = R.drawable.ic_groupcall_voice;
        if (z2) {
            i2 = R.drawable.ic_groupcall_video;
        }
        waImageView.setImageResource(i2);
        Context context = getContext();
        boolean z3 = this.A0G;
        int i3 = R.string.str011d;
        if (z3) {
            i3 = R.string.str19b6;
        }
        waImageView.setContentDescription(context.getString(i3));
    }

    public final void A02() {
        GroupJid groupJid;
        String str;
        String str2;
        int i2;
        if (getContext() == null) {
            Log.w("voip/VoipReturnToCallBanner no context when call start");
            return;
        }
        C15830rv r1 = this.A09;
        if (r1 == null || !r1.equals(this.A0A)) {
            C15830rv r5 = this.A09;
            if (r5 == null) {
                groupJid = null;
            } else if (r5 instanceof GroupJid) {
                groupJid = (GroupJid) r5;
            } else {
                str = this.A04.A08(this.A02.A0A(r5));
                C004601z.A0d(this.A0K, 1);
                str2 = str;
            }
            str = C30341cC.A09(this.A02, this.A04, this.A08, groupJid, this.A0B);
            WaImageView waImageView = this.A0K;
            C004601z.A0d(waImageView, 1);
            if (str == null) {
                Context context = getContext();
                if (this.A0F) {
                    i2 = R.string.str1ae5;
                } else {
                    boolean z2 = this.A0G;
                    i2 = R.string.str033a;
                    if (z2) {
                        i2 = R.string.str0339;
                    }
                }
                str = context.getString(i2);
                C004601z.A0d(waImageView, 2);
            }
            str2 = str;
        } else {
            str = getContext().getString(R.string.str1789);
            Context context2 = getContext();
            boolean z3 = this.A0G;
            int i3 = R.string.str0148;
            if (z3) {
                i3 = R.string.str0147;
            }
            str2 = context2.getString(i3);
            C004601z.A0d(this.A0K, 2);
        }
        TextView textView = this.A0J;
        textView.setText(str);
        textView.setContentDescription(str2);
    }

    public final void A03() {
        C15830rv peerJid;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            if (callInfo.isGroupCall) {
                peerJid = callInfo.groupJid;
            } else {
                peerJid = callInfo.getPeerJid();
                AnonymousClass00B.A06(peerJid);
            }
            this.A09 = peerJid;
            this.A0G = callInfo.videoEnabled;
            A02();
            A01();
        }
        this.A0I.setVisibility(8);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0D;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public CallInfo getCallInfo() {
        return Voip.getCallInfo();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0C.A02(this.A0M);
        this.A03.A02(this.A0L);
        C51982cd r1 = this.A01;
        if (r1 != null) {
            r1.AZj(getVisibility());
        }
        A03();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0C.A03(this.A0M);
        this.A03.A03(this.A0L);
    }

    public void setShouldHideBanner(boolean z2) {
        this.A0H = z2;
        int i2 = 8;
        if (this.A00.A00()) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    public void setVisibility(int i2) {
        C51982cd r1;
        removeCallbacks(this.A0N);
        int visibility = getVisibility();
        if (this.A0H) {
            i2 = 8;
        }
        super.setVisibility(i2);
        if (visibility != getVisibility() && (r1 = this.A01) != null) {
            r1.AZj(getVisibility());
        }
    }

    public void setVisibilityChangeListener(C51982cd r1) {
        this.A01 = r1;
    }
}

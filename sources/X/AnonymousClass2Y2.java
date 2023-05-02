package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;

/* renamed from: X.2Y2  reason: invalid class name */
public class AnonymousClass2Y2 extends C30011bb {
    public RunnableRunnableShape5S0200000_I0_3 A00;
    public AnonymousClass1ME A01;
    public C16490t9 A02;
    public AnonymousClass1KS A03;
    public AnonymousClass1TS A04;
    public boolean A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final WaTextView A08;
    public final WaTextView A09;
    public final ThumbnailButton A0A = ((ThumbnailButton) findViewById(R.id.thumb));

    public AnonymousClass2Y2(Context context, AnonymousClass1YG r7, C39021rn r8) {
        super(context, r7, r8);
        A0g();
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        this.A06 = textEmojiLabel;
        textEmojiLabel.A07 = new AnonymousClass3MF();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
        TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) findViewById(R.id.order_message_btn);
        this.A07 = textEmojiLabel2;
        this.A09 = (WaTextView) findViewById(R.id.order_title);
        this.A08 = (WaTextView) findViewById(R.id.order_subtitle);
        Activity A002 = AnonymousClass22N.A00(context);
        if (A002 instanceof C001300o) {
            RunnableRunnableShape5S0200000_I0_3 runnableRunnableShape5S0200000_I0_3 = new RunnableRunnableShape5S0200000_I0_3();
            this.A00 = runnableRunnableShape5S0200000_I0_3;
            ((AnonymousClass028) runnableRunnableShape5S0200000_I0_3.A00).A0A((C001300o) A002, new IDxObserverShape115S0100000_2_I0((Object) this, 150));
        }
        ViewOnClickCListenerShape0S0200000_I0 viewOnClickCListenerShape0S0200000_I0 = new ViewOnClickCListenerShape0S0200000_I0(context, 15, this);
        textEmojiLabel2.setOnClickListener(viewOnClickCListenerShape0S0200000_I0);
        findViewById(R.id.order_message_preview).setOnClickListener(viewOnClickCListenerShape0S0200000_I0);
        A1M();
    }

    private void setThumbnail(C39021rn r3) {
        RunnableRunnableShape5S0200000_I0_3 runnableRunnableShape5S0200000_I0_3;
        C16870tm A0F = r3.A0F();
        if (A0F != null && A0F.A04() && (runnableRunnableShape5S0200000_I0_3 = this.A00) != null) {
            synchronized (runnableRunnableShape5S0200000_I0_3) {
                runnableRunnableShape5S0200000_I0_3.A01 = r3;
            }
            this.A1e.Acl(runnableRunnableShape5S0200000_I0_3);
        }
    }

    public void A0g() {
        if (!this.A05) {
            this.A05 = true;
            C52652eD r2 = (C52652eD) ((C52642eC) generatedComponent());
            C16150sX r1 = r2.A07;
            this.A0M = (C14710pd) r1.A05.get();
            this.A0P = (AnonymousClass1PD) r1.AEP.get();
            this.A0F = (C16300so) r1.A5p.get();
            this.A0N = (AnonymousClass1P7) r1.ADc.get();
            this.A0J = (AnonymousClass01V) r1.AOi.get();
            this.A0K = (AnonymousClass013) r1.AR8.get();
            this.A0Q = C16150sX.A19(r1);
            this.A0L = (C26101Mi) r1.AQU.get();
            this.A0G = (AnonymousClass1L8) r1.A5W.get();
            this.A0r = (C16440t3) r1.AP2.get();
            this.A0J = (C14870pt) r1.AB3.get();
            this.A1D = (C19990zK) r1.AEZ.get();
            this.A1c = (C17110uY) r1.ADT.get();
            this.A1e = (C16320sq) r1.ARB.get();
            this.A0L = (C16040sK) r1.ADr.get();
            this.A0p = (C25801Le) r1.AFa.get();
            this.A0M = (AnonymousClass10X) r1.ALc.get();
            this.A0O = (C17130ua) r1.AN9.get();
            this.A0u = (C15810rt) r1.A43.get();
            this.A19 = (C17250um) r1.A7e.get();
            this.A0N = (C15900s5) r1.ALm.get();
            this.A1a = (C216014s) r1.AMr.get();
            this.A14 = (AnonymousClass11G) r1.ANN.get();
            this.A0R = (C16760tb) r1.APV.get();
            this.A0W = (C204310c) r1.A3O.get();
            C49132Rg r3 = r2.A05;
            this.A1A = r3.A0I();
            this.A0K = (C17090uW) r1.ADM.get();
            this.A1R = (C211613a) r1.A1E.get();
            this.A1C = (C18210wK) r1.AE4.get();
            this.A0I = (C19980zJ) r1.A0P.get();
            this.A0e = (C17200uh) r1.A52.get();
            this.A11 = (C18550ws) r1.ADB.get();
            this.A1F = (C17190ug) r1.AEu.get();
            this.A0a = (C16000sG) r1.A4x.get();
            this.A0U = (C25821Lg) r1.AMI.get();
            this.A0d = (C16080sP) r1.AQ9.get();
            this.A1Z = (C17220uj) r1.A9x.get();
            this.A1T = (C26721Ow) r1.A7o.get();
            this.A12 = (C26081Mg) r1.AIY.get();
            this.A0f = (C23181Au) r1.A53.get();
            this.A0g = (C25831Lh) r1.A5Q.get();
            this.A0w = (C16460t6) r1.A5k.get();
            this.A0V = (AnonymousClass01Y) r1.A1w.get();
            this.A1B = (C17240ul) r1.ABK.get();
            this.A1E = (C222717h) r1.AC3.get();
            this.A1V = new C25781Lc();
            this.A1P = (C27121Qn) r1.A1H.get();
            this.A10 = (AnonymousClass10B) r1.AD5.get();
            this.A1U = r1.A1d();
            this.A1d = (C25791Ld) r1.AFY.get();
            this.A1I = (C26701Ou) r1.AGb.get();
            this.A1S = (AnonymousClass1RU) r1.AEd.get();
            this.A15 = (AnonymousClass119) r1.APO.get();
            this.A0S = (C18640x1) r1.A3X.get();
            this.A16 = (AnonymousClass15G) r1.AEe.get();
            this.A17 = (C16500tA) r1.AMF.get();
            this.A1b = (AnonymousClass135) r1.AP7.get();
            this.A0c = (C17030uP) r1.APp.get();
            this.A0t = (C15860rz) r1.AQh.get();
            this.A0Y = (C17230uk) r1.A4I.get();
            this.A0x = (C27531Sc) r1.A7X.get();
            this.A1H = r1.A1Y();
            this.A1O = (C26141Mm) r1.A10.get();
            this.A0T = (C17170ue) r1.A3W.get();
            this.A1W = (AnonymousClass1MF) r1.ANa.get();
            this.A1J = (C227919h) r1.AH8.get();
            this.A0b = C16150sX.A0O(r1);
            this.A0z = (C16070sO) r1.ABY.get();
            this.A0h = (AnonymousClass2a9) r3.A0F.get();
            this.A13 = (AnonymousClass186) r1.AJI.get();
            this.A1N = (C17020u3) r1.AMG.get();
            this.A1X = (C50772aQ) r3.A02.get();
            this.A0Z = (C18260wP) r1.A4p.get();
            this.A1Q = r3.A0c();
            this.A0v = (C216114t) r1.A5O.get();
            this.A0y = (AnonymousClass188) r1.A8P.get();
            this.A0j = (AnonymousClass1LA) r1.AIg.get();
            this.A1Y = (C27651Sp) r1.ANj.get();
            this.A1G = (AnonymousClass1L9) r1.AFI.get();
            this.A0X = (AnonymousClass1SN) r1.AD0.get();
            this.A0i = (AnonymousClass1MY) r1.AIf.get();
            this.A0s = (C17120uZ) r1.AQT.get();
            this.A0q = C16150sX.A0S(r1);
            this.A1L = (AnonymousClass1DY) r1.A3w.get();
            this.A0n = r2.A02();
            this.A1K = (C18290wS) r1.AIB.get();
            this.A18 = (C18030w2) r1.A6W.get();
            this.A02 = (C16490t9) r1.AQz.get();
            this.A03 = (AnonymousClass1KS) r1.AGl.get();
            this.A01 = (AnonymousClass1ME) r1.AGk.get();
            this.A04 = (AnonymousClass1TS) r1.AGj.get();
        }
    }

    public void A0t() {
        A1M();
        A1J(false);
    }

    public void A1G(C16740tZ r3, boolean z2) {
        boolean z3 = false;
        if (r3 != this.A0O) {
            z3 = true;
        }
        super.A1G(r3, z2);
        if (z2 || z3) {
            A1M();
        }
    }

    public final void A1M() {
        int i2;
        C39021rn r4 = (C39021rn) this.A0O;
        setThumbnail(r4);
        this.A09.setText(C47612Jr.A02(this.A0K, r4), TextView.BufferType.SPANNABLE);
        String A012 = C47612Jr.A01(getContext(), this.A0K, r4);
        boolean isEmpty = TextUtils.isEmpty(A012);
        WaTextView waTextView = this.A08;
        if (isEmpty) {
            i2 = 8;
        } else {
            waTextView.setText(A0r(A012));
            i2 = 0;
        }
        waTextView.setVisibility(i2);
        TextEmojiLabel textEmojiLabel = this.A07;
        boolean z2 = r4.A11.A02;
        Context context = getContext();
        int i3 = R.string.str0d3f;
        if (z2) {
            i3 = R.string.str0d40;
        }
        textEmojiLabel.setText(context.getString(i3));
        String str = r4.A05;
        if (str != null) {
            setMessageText(str, this.A06, r4);
        }
    }

    public int getCenteredLayoutId() {
        return 0;
    }

    public C39021rn getFMessage() {
        return (C39021rn) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01af;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01b3;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C39021rn);
        this.A0O = r2;
    }
}

package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape129S0100000_3_I0;
import com.facebook.redex.IDxObserverShape117S0100000_3_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0;
import com.obwhatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import com.whatsapp.jid.UserJid;

/* renamed from: X.629  reason: invalid class name */
public class AnonymousClass629 implements AnonymousClass69S {
    public long A00;
    public C14530pL A01;
    public AnonymousClass69W A02;
    public C118395uc A03;
    public PaymentCheckoutOrderDetailsViewV2 A04;
    public C110715ei A05;
    public AnonymousClass69T A06;
    public C118965vh A07;
    public C28381Vw A08;
    public String A09 = "WhatsappPay";
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public final C14870pt A0E;
    public final C17030uP A0F;
    public final C16440t3 A0G;
    public final AnonymousClass013 A0H;
    public final C216114t A0I;
    public final C16460t6 A0J;
    public final C19150xq A0K;
    public final C221116r A0L;
    public final C14710pd A0M;
    public final AnonymousClass17Y A0N;
    public final C18090w8 A0O;
    public final C18290wS A0P;
    public final AnonymousClass1MA A0Q;
    public final AnonymousClass2ZJ A0R;
    public final AnonymousClass1N2 A0S;
    public final C218315p A0T;
    public final AnonymousClass1TS A0U;
    public final C17110uY A0V;
    public final C16320sq A0W;

    public AnonymousClass629(C14870pt r2, C17030uP r3, C16440t3 r4, AnonymousClass013 r5, C216114t r6, C16460t6 r7, C19150xq r8, C221116r r9, C14710pd r10, AnonymousClass17Y r11, C18090w8 r12, C18290wS r13, AnonymousClass1MA r14, AnonymousClass2ZJ r15, AnonymousClass1N2 r16, C218315p r17, AnonymousClass1TS r18, C17110uY r19, C16320sq r20) {
        this.A0G = r4;
        this.A0M = r10;
        this.A0E = r2;
        this.A0V = r19;
        this.A0W = r20;
        this.A0T = r17;
        this.A0H = r5;
        this.A0S = r16;
        this.A0P = r13;
        this.A0J = r7;
        this.A0K = r8;
        this.A0F = r3;
        this.A0O = r12;
        this.A0L = r9;
        this.A0Q = r14;
        this.A0I = r6;
        this.A0U = r18;
        this.A0N = r11;
        this.A0R = r15;
    }

    public void A00(C14530pL r26, AnonymousClass69W r27) {
        C14530pL r3 = r26;
        this.A01 = r3;
        AnonymousClass69W r6 = r27;
        this.A02 = r6;
        this.A0C = r3.getIntent().getStringExtra("extra_order_id");
        this.A0A = r3.getIntent().getStringExtra("extra_order_discount_program_name");
        this.A00 = r3.getIntent().getLongExtra("extra_order_expiry_ts_in_sec", 0);
        this.A0D = r3.getIntent().getStringExtra("extra_payment_config_id");
        this.A08 = AnonymousClass1yL.A02(r3.getIntent());
        this.A06 = new AnonymousClass62L(r3, r6, this);
        C16440t3 r10 = this.A0G;
        C14710pd r13 = this.A0M;
        C17110uY r4 = this.A0V;
        C218315p r1 = this.A0T;
        AnonymousClass013 r11 = this.A0H;
        C18290wS r15 = this.A0P;
        C17030uP r9 = this.A0F;
        C18090w8 r14 = this.A0O;
        C118965vh r7 = new C118965vh(r3.getResources(), r9, r10, r11, this.A0I, r13, r14, r15, this.A06, r1, r4);
        this.A07 = r7;
        C16320sq r8 = this.A0W;
        C118395uc r42 = new C118395uc(this.A0L, this, r7, r8);
        this.A03 = r42;
        r3.A06.A00(new PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0(r42));
        C110715ei r0 = (C110715ei) new C006602z((AnonymousClass04o) new AnonymousClass5z5(r9, r10, this.A0K, r13, (UserJid) null, this.A0N, this.A0R, this.A08, r8, false), (C001500q) r3).A01(C110715ei.class);
        this.A05 = r0;
        r0.A05();
        this.A05.A02.A0A(r3, new IDxObserverShape117S0100000_3_I0(this, 0));
        this.A04 = (PaymentCheckoutOrderDetailsViewV2) LayoutInflater.from(r3).inflate(R.layout.layout0100, (ViewGroup) null, false);
    }

    public void A01(C797441c r8, C117735tT r9) {
        if (this.A02.AJV()) {
            this.A0U.A01(r9.A07, this.A09, 12);
        }
        C16320sq r6 = this.A0W;
        C16460t6 r1 = this.A0J;
        AnonymousClass1MA r4 = this.A0Q;
        C62013Bh.A02(this.A0E, r1, this.A0L, new AnonymousClass60C(this, r8, r9), r4, r9.A07, r6);
    }

    public void Ac4() {
        this.A01.Ac1();
    }

    public boolean AfM(int i2) {
        return AnonymousClass000.A1R(i2, 405);
    }

    public void Afk(C15830rv r5, int i2, long j2) {
        C32241fu A002 = C32241fu.A00(this.A01);
        A002.A07(false);
        A002.setTitle(this.A01.getString(R.string.str0ead));
        C110115dX.A0m(this.A01, A002, R.string.str0eac);
        A002.setPositiveButton(R.string.str0e87, new IDxCListenerShape129S0100000_3_I0(this, 0));
        if (this.A0T.A0d(r5)) {
            A002.setNegativeButton(R.string.str03d3, new AnonymousClass5y2(r5, this, j2));
        }
        C13690nt.A1G(A002);
    }

    public void Afu() {
        this.A01.Afq(R.string.str13db);
    }
}

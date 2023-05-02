package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.30b  reason: invalid class name and case insensitive filesystem */
public class C601030b extends C30011bb {
    public TextView A00;
    public AnonymousClass01D A01;
    public boolean A02;
    public final C14550pN A03;
    public final SharePhoneNumberRowViewModel A04;

    public C601030b(Context context, AnonymousClass1YG r9, C39221s7 r10) {
        super(context, r9, r10);
        A0g();
        C14550pN r0 = (C14550pN) C19980zJ.A01(context, C14550pN.class);
        this.A03 = r0;
        this.A04 = (SharePhoneNumberRowViewModel) new C006602z(r0).A01(SharePhoneNumberRowViewModel.class);
        C28381Vw r02 = r10.A11;
        boolean z2 = r02.A02;
        C15830rv r4 = r02.A00;
        setBackground((Drawable) null);
        setLongClickable(false);
        if (r4 != null) {
            if (z2) {
                SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel = this.A04;
                C30801cy A012 = C30801cy.A01();
                C13700nu.A0X(sharePhoneNumberRowViewModel.A04, sharePhoneNumberRowViewModel, r4, A012, 20);
                C13680ns.A1N(this.A03, A012, this, 81);
            } else if (r4 instanceof UserJid) {
                setOnClickListener(new ViewOnClickCListenerShape6S0200000_I1_1(this, 8, r4));
            }
        }
        TextView A0L = C13680ns.A0L(this, R.id.info);
        this.A00 = A0L;
        if (z2) {
            A0L.setText(R.string.str12bf);
            setVisibility(0);
        } else if (r4 != null) {
            setVisibility(8);
            SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel2 = this.A04;
            C30801cy A013 = C30801cy.A01();
            C13700nu.A0X(sharePhoneNumberRowViewModel2.A04, sharePhoneNumberRowViewModel2, r4, A013, 21);
            C13680ns.A1N(this.A03, A013, this, 82);
        }
    }

    public static /* synthetic */ void A0c(C601030b r3, C73873pC r4) {
        r3.getPhoneNumberSharedBridge();
        r3.A03.Afb(AnonymousClass46K.A00(r4.A00, r4.A01), "ConversationRowSharePhoneNumber");
    }

    private AnonymousClass1C7 getPhoneNumberSharedBridge() {
        return (AnonymousClass1C7) ((C19110xm) this.A01.get()).A00(AnonymousClass1C7.class);
    }

    public void A0g() {
        if (!this.A02) {
            this.A02 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
            this.A01 = C17270uo.A00(A05.A0E);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout0558;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout0558;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout0558;
    }
}

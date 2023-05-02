package X;

import android.content.Context;
import com.facebook.redex.IDxCCallbackShape293S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.30c  reason: invalid class name and case insensitive filesystem */
public class C601130c extends C30011bb {
    public AnonymousClass01D A00;
    public boolean A01;
    public final C14550pN A02;
    public final AnonymousClass1ZI A03 = new IDxCCallbackShape293S0100000_2_I1(this, 2);
    public final SharePhoneNumberRowViewModel A04;
    public final C15830rv A05;

    public C601130c(Context context, AnonymousClass1YG r8, C39211s6 r9) {
        super(context, r8, r9);
        A0g();
        setLongClickable(false);
        C14550pN r0 = (C14550pN) C19980zJ.A01(context, C14550pN.class);
        this.A02 = r0;
        this.A04 = (SharePhoneNumberRowViewModel) new C006602z(r0).A01(SharePhoneNumberRowViewModel.class);
        C28381Vw r1 = r9.A11;
        this.A05 = r1.A00;
        setVisibility(8);
        C15830rv r5 = this.A05;
        if (r5 != null) {
            boolean z2 = r1.A02;
            SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel = this.A04;
            C30801cy A012 = C30801cy.A01();
            C13700nu.A0X(sharePhoneNumberRowViewModel.A04, sharePhoneNumberRowViewModel, r5, A012, 21);
            A012.A0A(this.A02, new C62303Da(this, z2));
            if (!z2) {
                setUpShareCta(r5);
            }
        }
    }

    public static /* synthetic */ void A0c(C601130c r3, C15830rv r4) {
        r3.getSharePhoneNumberBridge();
        C18450wi.A0H(r4, 0);
        r3.A02.Afb(AnonymousClass46L.A00(r4, 5), "SharePhoneNumberBottomSheet");
    }

    private AnonymousClass1C6 getSharePhoneNumberBridge() {
        return (AnonymousClass1C6) ((C19110xm) this.A00.get()).A00(AnonymousClass1C6.class);
    }

    private void setUpShareCta(C15830rv r4) {
        C34331k5.A05(C004601z.A0E(getRootView(), R.id.request_phone_button), this, UserJid.of(r4), r4, 8);
    }

    public void A0g() {
        if (!this.A01) {
            this.A01 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A052 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A052, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A052, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A052, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
            this.A00 = C17270uo.A00(A052.A0E);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01c2;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01c2;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01c3;
    }
}

package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import java.util.Arrays;

/* renamed from: X.30Z  reason: invalid class name */
public class AnonymousClass30Z extends C30011bb {
    public boolean A00;
    public final View A01;
    public final View A02 = C004601z.A0E(this, R.id.conversation_row_root);
    public final ViewGroup A03;
    public final ViewGroup A04;
    public final FrameLayout A05;
    public final TextView A06;
    public final TextView A07;
    public final WaTextView A08;
    public final WaTextView A09;
    public final ViewOnceDownloadProgressView A0A;
    public final ViewOnceDownloadProgressView A0B;

    public AnonymousClass30Z(Context context, AnonymousClass1YG r6, C30581cc r7) {
        super(context, r6, r7);
        A0g();
        FrameLayout A082 = C13700nu.A08(this, R.id.view_once_media_container_large);
        this.A05 = A082;
        this.A04 = C13700nu.A07(A082, R.id.date_wrapper);
        this.A07 = C13680ns.A0L(A082, R.id.date);
        this.A09 = C13680ns.A0S(this, R.id.view_once_media_type_large);
        this.A0B = (ViewOnceDownloadProgressView) C004601z.A0E(this, R.id.view_once_download_large);
        this.A01 = C004601z.A0E(this, R.id.view_once_media_container_small);
        this.A03 = C13700nu.A07(A082, R.id.date_wrapper);
        this.A06 = C13680ns.A0L(A082, R.id.date);
        this.A08 = C13680ns.A0S(this, R.id.view_once_media_type_small);
        this.A0A = (ViewOnceDownloadProgressView) C004601z.A0E(this, R.id.view_once_download_small);
        C004601z.A0E(this, R.id.view_once_file_size).setVisibility(8);
        A082.setForeground(getInnerFrameForegroundDrawable());
        A1M();
    }

    public void A0g() {
        if (!this.A00) {
            this.A00 = true;
            C52652eD A072 = C30011bb.A07(this);
            C16150sX A062 = C30011bb.A06(A072, this);
            C49132Rg A052 = C30011bb.A05(A062, A072, this, C30011bb.A0C(A062, this));
            C30011bb.A0S(A062, this, C30011bb.A0B(A052, A062, this));
            C30011bb.A0Q(A062, this);
            C30011bb.A0O(A052, A062, C30011bb.A08(A062, this), this);
            C30011bb.A0M(A052, A062, A072, this, A062.A4p);
            C30011bb.A0R(A062, this);
        }
    }

    public void A0t() {
        A1J(false);
        A1M();
    }

    public void A0z() {
        C30581cc r4 = (C30581cc) this.A0O;
        C39001rl r2 = (C39001rl) r4;
        if (r2.AGz() == 2) {
            C16010sH A092 = C38621r6.A09(this.A0v, (C16740tZ) r2);
            if (A092 != null) {
                C32241fu A002 = C32241fu.A00(getContext());
                A002.A02(R.string.str1a0a);
                C30011bb.A0G(getResources(), A002, this, A092, R.string.str1a09);
                return;
            }
            return;
        }
        Context context = getContext();
        C28381Vw r3 = r4.A11;
        Intent A093 = C13680ns.A09();
        A093.setClassName(context.getPackageName(), "com.obwhatsapp.messaging.ViewOnceViewerActivity");
        AnonymousClass1yL.A00(A093, r3);
        C13690nt.A0u(A093, this);
        postDelayed(new RunnableRunnableShape14S0200000_I1_2(this, 5, r4), 220);
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1M();
        }
    }

    public final void A1M() {
        View view;
        C30581cc r6 = (C30581cc) this.A0O;
        int AGz = ((C39001rl) r6).AGz();
        if (AGz != 0) {
            if (AGz == 1) {
                WaTextView waTextView = this.A08;
                C13690nt.A0s(getContext(), waTextView, R.string.str19f8);
                C13690nt.A0w(getResources(), waTextView, R.color.color07d0);
                Typeface typeface = Typeface.DEFAULT;
                C13680ns.A0t(getContext(), waTextView, getViewStateDescription());
                this.A0A.A00(R.drawable.ic_ephemeral_ring, -1, R.color.color07d0);
                this.A01.setVisibility(0);
                view = this.A05;
                view.setVisibility(8);
            } else if (AGz != 2) {
                return;
            }
        }
        this.A09.setText(C45922Bq.A00(getContext(), getContext().getString(R.string.str1a05)));
        FrameLayout frameLayout = this.A05;
        String valueOf = String.valueOf(frameLayout.getContentDescription());
        String A002 = C47672Jx.A00(this.A0K, this.A0r.A02(r6.A0I));
        AnonymousClass013 r1 = this.A0K;
        String[] strArr = new String[2];
        C13690nt.A1L(valueOf, A002, strArr);
        frameLayout.setContentDescription(C40631uR.A00(r1, Arrays.asList(strArr), false));
        A1C(r6);
        this.A0B.A00(R.drawable.ic_viewonce_one, R.drawable.ic_ephemeral_ring, R.color.color07ce);
        C34331k5.A03(frameLayout, this, 17);
        frameLayout.setVisibility(0);
        view = this.A01;
        view.setVisibility(8);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01e1;
    }

    public TextView getDateView() {
        return ((C39001rl) ((C30581cc) this.A0O)).AGz() == 0 ? this.A07 : this.A06;
    }

    public ViewGroup getDateWrapper() {
        return ((C39001rl) ((C30581cc) this.A0O)).AGz() == 0 ? this.A04 : this.A03;
    }

    public C30581cc getFMessage() {
        return (C30581cc) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01e1;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01e2;
    }

    public int getViewStateDescription() {
        int AGz = ((C39001rl) ((C30581cc) this.A0O)).AGz();
        return AGz != 1 ? AGz != 2 ? R.string.str1a06 : R.string.str1a07 : R.string.str1a08;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C39241s9);
        this.A0O = r2;
    }
}

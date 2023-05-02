package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Set;

/* renamed from: X.31M  reason: invalid class name */
public class AnonymousClass31M extends AnonymousClass314 {
    public final View A00 = C004601z.A0E(this, R.id.conversation_row_root);
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final FrameLayout A03;
    public final TextView A04;
    public final TextView A05;
    public final WaTextView A06 = C13680ns.A0S(this, R.id.view_once_file_size);
    public final WaTextView A07 = C13680ns.A0S(this, R.id.view_once_media_type_large);
    public final ViewOnceDownloadProgressView A08;

    public AnonymousClass31M(Context context, AnonymousClass1YG r7, C16730tY r8) {
        super(context, r7, r8);
        FrameLayout A082 = C13700nu.A08(this, R.id.view_once_media_container_large);
        this.A03 = A082;
        this.A08 = (ViewOnceDownloadProgressView) C004601z.A0E(this, R.id.view_once_download_large);
        this.A01 = C13700nu.A07(A082, R.id.date_wrapper);
        this.A04 = C13680ns.A0L(A082, R.id.date);
        View view = this.A01;
        this.A02 = C13700nu.A07(view, R.id.date_wrapper);
        this.A05 = C13680ns.A0L(view, R.id.date);
        A082.setForeground(getInnerFrameForegroundDrawable());
        A1R();
    }

    private void setTransitionNames(C16730tY r4) {
        C004601z.A0n(this.A0E, C47612Jr.A03(r4));
        ImageView imageView = this.A0B;
        if (imageView != null) {
            StringBuilder sb = new StringBuilder("status-transition-");
            sb.append(r4.A11);
            C004601z.A0n(imageView, sb.toString());
        }
    }

    public void A0z() {
        C14550pN A022;
        C16730tY fMessage = getFMessage();
        C39001rl r2 = (C39001rl) fMessage;
        if (yo.antiVOnceI(r2.AGz()) == 2) {
            C16740tZ r22 = (C16740tZ) r2;
            C16010sH A09 = C38621r6.A09(this.A0v, r22);
            if (A09 != null) {
                boolean z2 = r22 instanceof C38991rk;
                int i2 = R.string.str1a12;
                int i3 = R.string.str1a11;
                if (z2) {
                    i2 = R.string.str19fe;
                    i3 = R.string.str19fd;
                }
                C32241fu A002 = C32241fu.A00(getContext());
                A002.A02(i2);
                C30011bb.A0G(getResources(), A002, this, A09, i3);
            }
        } else if (this.A01 != null && !C14570pP.A1W(this)) {
        } else {
            if (!fMessage.A18()) {
                Log.w("conversation/row/viewOnce/no file");
                if (!A1P() && (A022 = AnonymousClass22N.A02(this)) != null) {
                    this.A0P.A01(A022);
                    return;
                }
                return;
            }
            C54592ho r23 = new C54592ho(getContext());
            r23.A07 = true;
            C28381Vw r1 = fMessage.A11;
            C15830rv r0 = r1.A00;
            AnonymousClass00B.A06(r0);
            r23.A03 = r0;
            r23.A04 = r1;
            r23.A01 = 3;
            C13690nt.A0u(r23.A00(), this);
            postDelayed(new RunnableRunnableShape14S0200000_I1_2(this, 4, fMessage), 220);
        }
    }

    public void A1Q() {
        super.A1Q();
        A1C(getFMessage());
    }

    public void A1R() {
        int AGz = ((C39001rl) getFMessage()).AGz();
        if (AGz == 0) {
            this.A01.setVisibility(8);
            C16730tY fMessage = getFMessage();
            int A062 = C38621r6.A06(fMessage);
            setTransitionNames(fMessage);
            C602830u.A0e(this.A08, fMessage, A062, false);
            A1U(this.A03, A062, false);
            A1V(fMessage, A062);
            A1C(fMessage);
        } else if (AGz == 1) {
            this.A03.setVisibility(8);
            A1Q();
            WaTextView waTextView = this.A02;
            C13690nt.A0s(getContext(), waTextView, R.string.str19f8);
            C13680ns.A0t(getContext(), waTextView, getMediaTypeDescriptionString());
        } else if (AGz == 2) {
            this.A01.setVisibility(8);
            C16730tY fMessage2 = getFMessage();
            setTransitionNames(fMessage2);
            C602830u.A0e(this.A08, fMessage2, 2, false);
            A1U(this.A03, 2, false);
            A1V(fMessage2, 2);
            A1C(fMessage2);
        }
    }

    public void A1U(View view, int i2, boolean z2) {
        super.A1U(view, i2, z2);
        if (i2 == 2) {
            this.A06.setVisibility(8);
            return;
        }
        C16730tY fMessage = getFMessage();
        WaTextView waTextView = this.A06;
        waTextView.setText(C38621r6.A0I(this.A0K, fMessage.A01));
        waTextView.setVisibility(0);
    }

    public final void A1V(C16730tY r9, int i2) {
        String[] A1b;
        FrameLayout frameLayout = this.A03;
        String valueOf = String.valueOf(frameLayout.getContentDescription());
        String A0I = C38621r6.A0I(this.A0K, r9.A01);
        String A002 = C47672Jx.A00(this.A0K, this.A0r.A02(r9.A0I));
        AnonymousClass013 r1 = this.A0K;
        if (i2 == 2) {
            A1b = C13690nt.A1b(valueOf, A002, 2);
        } else {
            A1b = C13690nt.A1b(valueOf, A0I, 3);
            A1b[2] = A002;
        }
        frameLayout.setContentDescription(C40631uR.A00(r1, Arrays.asList(A1b), false));
    }

    public TextView getDateView() {
        return yo.antiVOnceI(((C39001rl) getFMessage()).AGz()) == 0 ? this.A04 : this.A05;
    }

    public ViewGroup getDateWrapper() {
        return yo.antiVOnceI(((C39001rl) getFMessage()).AGz()) == 0 ? this.A01 : this.A02;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A03);
        return innerFrameLayouts;
    }
}

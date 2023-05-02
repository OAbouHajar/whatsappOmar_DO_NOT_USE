package X;

import android.app.Activity;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape1S0201000_I1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.ctwa.icebreaker.ui.IcebreakerBubbleView;
import com.obwhatsapp.text.IDxWAdapterShape103S0100000_2_I1;

/* renamed from: X.39b  reason: invalid class name and case insensitive filesystem */
public class C614739b {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ListView A03;
    public TextView A04;
    public RunnableRunnableShape1S0201000_I1 A05;
    public ShimmerFrameLayout A06;
    public C85174Nk A07;
    public C612138a A08;
    public IcebreakerBubbleView A09;
    public AnonymousClass3T3 A0A;
    public C15830rv A0B;
    public C23061Ai A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final int A0H;
    public final int A0I;
    public final Activity A0J;
    public final TextWatcher A0K = new IDxWAdapterShape103S0100000_2_I1(this, 1);
    public final C14870pt A0L;
    public final C17130ua A0M;
    public final C17230uk A0N;
    public final AnonymousClass2ZO A0O;
    public final C41681wN A0P;
    public final AnonymousClass3BB A0Q;
    public final AnonymousClass1MU A0R;
    public final C25811Lf A0S;
    public final C26021Ma A0T;
    public final boolean A0U;

    public C614739b(Activity activity, C14870pt r5, C17130ua r6, C17230uk r7, AnonymousClass2ZO r8, C41681wN r9, AnonymousClass3BB r10, AnonymousClass1MU r11, C25811Lf r12, C26021Ma r13, C23061Ai r14) {
        this.A0C = r14;
        this.A0J = activity;
        this.A0L = r5;
        this.A0F = false;
        this.A0M = r6;
        this.A0S = r12;
        this.A0Q = r10;
        this.A0R = r11;
        this.A0N = r7;
        this.A0P = r9;
        this.A0H = R.id.icebreaker_container;
        C14710pd r2 = r12.A00;
        C16620tM r1 = C16620tM.A02;
        this.A0U = r2.A0E(r1, 863);
        this.A0I = C13690nt.A00(r2.A0E(r1, 1293) ? 1 : 0);
        this.A0T = r13;
        this.A0O = r8;
    }

    public void A00() {
        if (this.A0F) {
            int i2 = this.A0I;
            if (i2 == 2) {
                AnonymousClass3T3 r1 = this.A0A;
                AnonymousClass00B.A04(r1);
                r1.setVisibility(8);
                this.A07.A05.A01.setVisibility(0);
            } else {
                IcebreakerBubbleView icebreakerBubbleView = this.A09;
                AnonymousClass00B.A04(icebreakerBubbleView);
                icebreakerBubbleView.setVisibility(8);
            }
            if (this.A0F) {
                this.A0F = false;
                if (i2 == 2) {
                    this.A02.removeView(this.A01);
                    this.A02.removeView(this.A0A);
                    this.A04.removeTextChangedListener(this.A0K);
                }
            }
        }
    }

    public boolean A01() {
        if (this.A0F && this.A0I == 2) {
            AnonymousClass3T3 r2 = this.A0A;
            AnonymousClass00B.A04(r2);
            for (int i2 = 0; i2 < this.A02.getChildCount(); i2++) {
                if (this.A02.getChildAt(i2) == r2 && r2.getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.components.RoundCornerProgressBarV2;
import java.util.List;

/* renamed from: X.1VX  reason: invalid class name */
public class AnonymousClass1VX {
    public C39631sn A00;
    public C39171s2 A01;
    public final View A02;
    public final View A03;
    public final CheckBox A04;
    public final TextView A05;
    public final TextView A06;
    public final ConstraintLayout A07;
    public final C16040sK A08;
    public final C16760tb A09;
    public final RoundCornerProgressBarV2 A0A;
    public final C16000sG A0B;
    public final AnonymousClass2Ao A0C;
    public final AnonymousClass01V A0D;
    public final AnonymousClass013 A0E;
    public final C17250um A0F;
    public final C14710pd A0G;
    public final AnonymousClass1N9 A0H;
    public final C17020u3 A0I;
    public final C33741j5 A0J;
    public final C33741j5 A0K;
    public final C33741j5 A0L;
    public final List A0M;
    public final boolean A0N;

    public AnonymousClass1VX(View view, C16040sK r8, C16760tb r9, C16000sG r10, AnonymousClass2Ao r11, AnonymousClass01V r12, AnonymousClass013 r13, C17250um r14, C14710pd r15, AnonymousClass1N9 r16, C17020u3 r17, List list, boolean z2) {
        this.A0G = r15;
        this.A0E = r13;
        this.A08 = r8;
        this.A0F = r14;
        this.A09 = r9;
        this.A0B = r10;
        this.A0D = r12;
        this.A0H = r16;
        this.A0I = r17;
        this.A0C = r11;
        this.A02 = view;
        List list2 = list;
        this.A0M = list2;
        View A0E2 = C004601z.A0E(view, R.id.poll_option_end_wrapper);
        this.A03 = A0E2;
        this.A05 = (TextView) C004601z.A0E(view, R.id.poll_option_name);
        this.A06 = (TextView) C004601z.A0E(view, R.id.poll_option_vote_count);
        this.A0A = (RoundCornerProgressBarV2) C004601z.A0E(view, R.id.poll_vote_ratio);
        CheckBox checkBox = (CheckBox) C004601z.A0E(view, R.id.poll_option_vote_checkbox);
        this.A04 = checkBox;
        this.A0N = z2;
        A0E2.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 21));
        this.A0J = new C33741j5(C004601z.A0E(view, R.id.poll_option_vote_first_profile_circle_view));
        this.A0K = new C33741j5(C004601z.A0E(view, R.id.poll_option_vote_first_profile_image_view));
        this.A0L = new C33741j5(C004601z.A0E(view, R.id.poll_option_vote_second_profile_image_view));
        checkBox.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 43, list2));
        ConstraintLayout constraintLayout = (ConstraintLayout) C004601z.A0E(view, R.id.poll_option_main_layout);
        this.A07 = constraintLayout;
        if (!z2) {
            constraintLayout.setFocusableInTouchMode(false);
            constraintLayout.setFocusable(false);
            constraintLayout.setImportantForAccessibility(2);
        }
    }
}

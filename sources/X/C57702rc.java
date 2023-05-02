package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2rc  reason: invalid class name and case insensitive filesystem */
public class C57702rc extends C005602k {
    public int A00 = R.string.str1793;
    public int A01;
    public UserJid A02;
    public final Context A03;
    public final Resources A04;
    public final FrameLayout A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final TextView A09;
    public final AnonymousClass01F A0A;
    public final C30521cU A0B;
    public final AnonymousClass2Ao A0C;
    public final C1036352d A0D;
    public final AnonymousClass2IH A0E = new AnonymousClass2II();
    public final boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57702rc(Context context, View view, AnonymousClass01F r13, AnonymousClass2Ao r14) {
        super(view);
        View view2 = view;
        this.A03 = context;
        this.A04 = context.getResources();
        this.A0A = r13;
        this.A0D = new C1036352d(context);
        this.A0C = r14;
        boolean A0E2 = r13.A1G().A0E(C16620tM.A02, 2429);
        this.A0F = r13.A1G().A0E(C16620tM.A01, 1875);
        ImageView A0J = C13680ns.A0J(view, R.id.contact_photo);
        ImageView A0J2 = C13680ns.A0J(view, R.id.wdsProfilePicture);
        if (A0E2) {
            A0J.setVisibility(8);
            A0J2.setVisibility(0);
        } else {
            A0J.setVisibility(0);
            A0J2.setVisibility(8);
            A0J2 = A0J;
        }
        this.A08 = A0J2;
        A0J2.setClickable(false);
        A0J2.setImportantForAccessibility(2);
        C004601z.A0E(view, R.id.contact_selector).setClickable(false);
        C16150sX r1 = (C16150sX) r13;
        C30521cU r4 = new C30521cU(view2, C16150sX.A0Q(r1), r13.Ai9(), new C25781Lc(), (int) R.id.contact_name);
        this.A0B = r4;
        others.hContactName(r4.A02);
        TextView A0L = C13680ns.A0L(view, R.id.date_time);
        this.A09 = A0L;
        yo.ChangeSize(A0L, 2);
        this.A05 = C13700nu.A08(view, R.id.action);
        this.A06 = C13680ns.A0J(view, R.id.action_icon);
        this.A07 = C13680ns.A0J(view, R.id.contact_mark);
        r4.A05();
        r1.ART.get();
    }
}

package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.obwhatsapp.R;
import java.util.Set;

/* renamed from: X.2rh  reason: invalid class name and case insensitive filesystem */
public class C57752rh extends C005602k implements View.OnClickListener, View.OnLongClickListener {
    public final int A00;
    public final ColorDrawable A01;
    public final C29251aI A02;
    public final AnonymousClass2OM A03;
    public final C54482hb A04;
    public final Set A05;

    public C57752rh(C29251aI r3, AnonymousClass2OM r4, C54482hb r5, Set set) {
        super(r5);
        this.A04 = r5;
        this.A05 = set;
        this.A03 = r4;
        r5.setOnClickListener(this);
        r5.setOnLongClickListener(this);
        this.A02 = r3;
        int A002 = AnonymousClass00T.A00(r5.getContext(), R.color.color00ef);
        this.A00 = A002;
        this.A01 = new ColorDrawable(A002);
    }

    public void onClick(View view) {
        C54852iN r0;
        C29251aI r2 = this.A02;
        C54482hb r3 = this.A04;
        AnonymousClass2V7 r02 = r2.A0G;
        if (r02 != null && (r0 = r02.A04) != null && r0.A00 != null && !r2.A0X() && r2.A0G.A0B.A0B == 4) {
            if (!(!r2.A0D.A07.isEmpty())) {
                r2.A0Q(r3.A05, r3, false);
            } else {
                r2.A0P(r3.A05);
            }
        }
    }

    public boolean onLongClick(View view) {
        C54852iN r0;
        C29251aI r3 = this.A02;
        C54482hb r2 = this.A04;
        AnonymousClass2V7 r02 = r3.A0G;
        if (r02 == null || (r0 = r02.A04) == null || r0.A00 == null || r3.A0X() || r3.A0G.A0B.A0B != 4) {
            return true;
        }
        r3.A0P(r2.A05);
        return true;
    }
}

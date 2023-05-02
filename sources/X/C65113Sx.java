package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

/* renamed from: X.3Sx  reason: invalid class name and case insensitive filesystem */
public class C65113Sx extends C005602k {
    public boolean A00 = true;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final ViewGroup A07;
    public final AnonymousClass013 A08;

    public C65113Sx(Context context, ViewGroup viewGroup, AnonymousClass013 r5) {
        super(C13680ns.A0H(LayoutInflater.from(context), viewGroup, R.layout.layout0585));
        this.A08 = r5;
        View view = this.A0H;
        this.A01 = view.findViewById(R.id.reactions_bg);
        this.A02 = view.findViewById(R.id.reaction_lol);
        this.A04 = view.findViewById(R.id.reaction_sad);
        this.A03 = view.findViewById(R.id.reaction_love);
        this.A05 = view.findViewById(R.id.reaction_wow);
        this.A07 = (ViewGroup) view.findViewById(R.id.reactions_right);
        this.A06 = (ViewGroup) view.findViewById(R.id.reactions_left);
    }

    public void A07() {
        if (!this.A00) {
            this.A01.setBackgroundResource(0);
            C015807o.A02((ViewGroup) this.A0H, new AnonymousClass0GE());
            this.A05.setVisibility(8);
            this.A02.setVisibility(8);
            this.A04.setVisibility(8);
            this.A03.setSelected(false);
            this.A00 = true;
        }
    }
}

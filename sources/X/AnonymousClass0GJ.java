package X;

import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

/* renamed from: X.0GJ  reason: invalid class name */
public class AnonymousClass0GJ extends C019409a {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ AnonymousClass0GF A03;

    public AnonymousClass0GJ(View view, View view2, ViewGroup viewGroup, AnonymousClass0GF r4) {
        this.A03 = r4;
        this.A02 = viewGroup;
        this.A00 = view;
        this.A01 = view2;
    }

    public void AZC(C015707n r4) {
        this.A01.setTag(R.id.save_overlay_view, (Object) null);
        AnonymousClass0We.A01(this.A02).Abr(this.A00);
        r4.A09(this);
    }

    public void AZD(C015707n r3) {
        AnonymousClass0We.A01(this.A02).Abr(this.A00);
    }

    public void AZE(C015707n r3) {
        View view = this.A00;
        if (view.getParent() == null) {
            AnonymousClass0We.A01(this.A02).A4U(view);
        } else {
            this.A03.A0D();
        }
    }
}

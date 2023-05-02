package X;

import com.obwhatsapp.HomeActivity;

/* renamed from: X.2cY  reason: invalid class name and case insensitive filesystem */
public class C51942cY implements C51952cZ {
    public final /* synthetic */ HomeActivity A00;

    public C51942cY(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public final void A00() {
        HomeActivity homeActivity = this.A00;
        homeActivity.A0i.A0T(false);
        homeActivity.A0i.A0J(0);
        homeActivity.A09.setVisibility(0);
        homeActivity.A0P.A0F(HomeActivity.A02(homeActivity.A01, 200), false);
    }

    public int AE4() {
        return 1;
    }

    public void ANy() {
        A00();
        HomeActivity homeActivity = this.A00;
        homeActivity.getWindow().clearFlags(1024);
        homeActivity.getWindow().addFlags(2048);
    }

    public void AWx() {
        A00();
    }
}

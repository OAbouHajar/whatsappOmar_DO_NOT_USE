package com.obwhatsapp.community;

import X.AnonymousClass00X;
import X.AnonymousClass023;
import X.AnonymousClass11A;
import X.AnonymousClass127;
import X.AnonymousClass13V;
import X.AnonymousClass18R;
import X.AnonymousClass1L3;
import X.AnonymousClass2AG;
import X.AnonymousClass2AH;
import X.AnonymousClass2Ao;
import X.AnonymousClass2c9;
import X.AnonymousClass3FR;
import X.C000900k;
import X.C004601z;
import X.C005502j;
import X.C006602z;
import X.C102484z1;
import X.C14780pk;
import X.C14800pm;
import X.C14810pn;
import X.C14870pt;
import X.C15860rz;
import X.C16050sL;
import X.C16440t3;
import X.C17140ub;
import X.C17200uh;
import X.C19980zJ;
import X.C50682aH;
import X.C50712aK;
import X.C54602hp;
import X.C93944k1;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.photos.ContactPhotos$LoaderLifecycleEventObserver;
import com.obwhatsapp.ui.components.IDxIDecorationShape105S0100000_2_I0;
import com.obwhatsapp.yo.yo;

public class CommunityFragment extends Hilt_CommunityFragment implements C14780pk, C14800pm {
    public C50682aH A00;
    public C50712aK A01;
    public C14870pt A02;
    public AnonymousClass13V A03;
    public AnonymousClass127 A04;
    public AnonymousClass1L3 A05;
    public CommunityTabViewModel A06;
    public C17140ub A07;
    public C17200uh A08;
    public AnonymousClass2AG A09;
    public C16440t3 A0A;
    public C15860rz A0B;
    public AnonymousClass11A A0C;
    public AnonymousClass18R A0D;
    public AnonymousClass2AH A0E;
    public boolean A0F = false;
    public final AnonymousClass023 A0G = new IDxObserverShape115S0100000_2_I0((Object) this, 106);

    private void loadPadding(Object obj, View view) {
        if (yo.Homeac != null) {
            yo.Homeac.paddingView(obj, view);
        }
    }

    public void A0w() {
        A1A(false);
        super.A0w();
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout02a0, viewGroup, false);
        loadPadding(this, inflate);
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(inflate, R.id.community_recycler_view);
        recyclerView.A0h = true;
        inflate.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator((C005502j) null);
        CommunityTabViewModel communityTabViewModel = (CommunityTabViewModel) new C006602z(this).A01(CommunityTabViewModel.class);
        this.A06 = communityTabViewModel;
        communityTabViewModel.A0I.A0A(A0H(), this.A0G);
        this.A06.A0L.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 105));
        AnonymousClass2Ao A042 = this.A08.A04(A0C(), "community-tab");
        this.A0K.A00(new ContactPhotos$LoaderLifecycleEventObserver(A042));
        AnonymousClass3FR A002 = this.A01.A00(A0C(), (Runnable) null, (Runnable) null);
        C54602hp r9 = new C54602hp(A0u());
        AnonymousClass2AH A003 = this.A00.A00(new C93944k1(), (C000900k) C19980zJ.A01(A0u(), C000900k.class), this, r9, A042, A002, this.A06, new C102484z1(), (C16050sL) null, 4);
        this.A0E = A003;
        recyclerView.setAdapter(A003);
        recyclerView.A0m(new IDxIDecorationShape105S0100000_2_I0(AnonymousClass00X.A04((Resources.Theme) null, A03(), R.drawable.community_divider_shadow), this, 0));
        recyclerView.A0m(new IDxIDecorationShape105S0100000_2_I0(AnonymousClass00X.A04((Resources.Theme) null, A03(), R.drawable.subgroup_divider), this, 1));
        AnonymousClass2AH r7 = this.A0E;
        C17140ub r4 = this.A07;
        AnonymousClass2AG r1 = new AnonymousClass2AG(this.A03, this.A04, r4, this.A0C, this.A0D, r7);
        this.A09 = r1;
        r1.A00();
        AnonymousClass2AH r12 = this.A0E;
        r12.A0a.A02(r12.A0Z);
        return inflate;
    }

    public void A13() {
        this.A09.A01();
        AnonymousClass2AH r0 = this.A0E;
        r0.A0a.A03(r0.A0Z);
        super.A13();
    }

    public final void A1A(boolean z2) {
        boolean z3 = this.A0F;
        this.A0F = z2;
        if (z3 != z2) {
            if (z2) {
                C15860rz r5 = this.A0B;
                r5.A0K().putLong("previous_last_seen_community_activity", ((SharedPreferences) r5.A01.get()).getLong("last_seen_community_activity", 0)).apply();
                this.A06.A0J.A08(this.A0G);
            } else {
                this.A06.A0J.A0A(this, this.A0G);
            }
            if (z3 || z2) {
                this.A0B.A0K().putLong("last_seen_community_activity", this.A0A.A00() / 1000).apply();
            }
            this.A0E.A0E();
        }
    }

    public /* synthetic */ void A4c(C14810pn r1) {
        r1.AMG();
    }

    public /* synthetic */ void A57(AnonymousClass2c9 r1) {
    }

    public String ADI() {
        return null;
    }

    public Drawable ADJ() {
        return null;
    }

    public String ADK() {
        return null;
    }

    public String AFo() {
        return null;
    }

    public Drawable AFp() {
        return null;
    }

    public int AGS() {
        return 600;
    }

    public void ATF() {
    }

    public void AWq() {
    }

    public /* synthetic */ void AeZ(boolean z2) {
    }

    public void Aea(boolean z2) {
        A1A(z2);
    }

    public /* synthetic */ boolean AgZ() {
        return false;
    }
}

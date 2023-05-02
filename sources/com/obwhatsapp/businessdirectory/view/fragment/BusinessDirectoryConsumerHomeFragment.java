package com.obwhatsapp.businessdirectory.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass071;
import X.AnonymousClass07M;
import X.AnonymousClass1PX;
import X.AnonymousClass38U;
import X.AnonymousClass3F7;
import X.AnonymousClass3FJ;
import X.AnonymousClass4KG;
import X.AnonymousClass5T5;
import X.C004601z;
import X.C006602z;
import X.C011105i;
import X.C13680ns;
import X.C13690nt;
import X.C17180uf;
import X.C17210ui;
import X.C17570vI;
import X.C18890xQ;
import X.C23061Ai;
import X.C57602rR;
import X.C94884ld;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.util.LocationUpdateListener;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel;

public class BusinessDirectoryConsumerHomeFragment extends Hilt_BusinessDirectoryConsumerHomeFragment implements AnonymousClass5T5 {
    public C011105i A00 = A07(new C94884ld(), new AnonymousClass07M());
    public AnonymousClass38U A01;
    public C18890xQ A02;
    public C17180uf A03;
    public AnonymousClass1PX A04;
    public LocationUpdateListener A05;
    public C17570vI A06;
    public AnonymousClass3FJ A07;
    public BusinessDirectoryConsumerHomeViewModel A08;
    public C23061Ai A09;
    public final AnonymousClass071 A0A = new C57602rR(this);

    public void A0l(Bundle bundle) {
        this.A0V = true;
        this.A07.A01();
    }

    public void A0x(int i2, int i3, Intent intent) {
        C17210ui r1;
        int i4;
        if (i2 == 34) {
            AnonymousClass3FJ r3 = this.A07;
            AnonymousClass5T5 r0 = r3.A07;
            if (i3 == -1) {
                r0.AT4();
                r1 = r3.A03;
                i4 = 5;
            } else {
                r0.AT3();
                r1 = r3.A03;
                i4 = 6;
            }
            r1.A03(i4, 0);
        }
        super.A0x(i2, i3, intent);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0296);
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(A0H, R.id.search_list);
        A0u();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(this.A06);
        recyclerView.A0o(this.A0A);
        this.A0K.A00(this.A05);
        C13680ns.A1N(A0H(), this.A05.A00, this.A07, 23);
        C13680ns.A1N(A0H(), this.A08.A04, this, 22);
        C13690nt.A1J(A0H(), this.A08.A0D, this, 8);
        C13690nt.A1J(A0H(), this.A08.A0B, this.A07, 9);
        C13680ns.A1N(A0H(), this.A08.A0A.A03, this.A07, 24);
        C13680ns.A1N(A0H(), this.A08.A0C, this, 21);
        return A0H;
    }

    public void A12() {
        super.A12();
        this.A04.A01(this.A07);
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A08 = (BusinessDirectoryConsumerHomeViewModel) new C006602z(this).A01(BusinessDirectoryConsumerHomeViewModel.class);
        AnonymousClass3FJ A002 = this.A01.A00(this, this.A05, this);
        this.A07 = A002;
        this.A04.A00(A002);
    }

    public final BusinessDirectoryActivity A1B() {
        if (A0D() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) A0D();
        }
        throw AnonymousClass000.A0V("BusinessDirectorySearchQueryFragment should be attached to BusinessDirectoryActivity");
    }

    public void AT3() {
        AnonymousClass3F7 r1 = this.A08.A0A;
        r1.A06.A01();
        C13680ns.A1O(r1.A03, 2);
    }

    public void AT4() {
        this.A08.A0A.A04();
    }

    public void AT9() {
        this.A08.A0A.A05();
    }

    public void ATB(AnonymousClass4KG r2) {
        this.A08.A0A.A07(r2);
    }

    public void AcR() {
        C13680ns.A1O(this.A08.A0A.A03, 2);
    }

    public void Aha() {
        this.A08.A0A.A06();
    }
}

package X;

import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.3Dq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62463Dq implements C12820l1 {
    public final /* synthetic */ BusinessDirectoryMapViewActivity A00;

    public /* synthetic */ C62463Dq(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        this.A00 = businessDirectoryMapViewActivity;
    }

    public final boolean ATL(AnonymousClass0IS r10) {
        AnonymousClass269 r6 = this.A00.A0M;
        if (r6 == null) {
            throw C18450wi.A03("viewModel");
        }
        Object obj = r10.A0K;
        if (obj != null) {
            C93714je r1 = (C93714je) obj;
            if (r1.A00 == 1) {
                AnonymousClass0YG r8 = r6.A02;
                if (r8 != null) {
                    r6.A05 = r10;
                    C93404j8 r0 = r1.A02;
                    C18450wi.A0F(r0);
                    AnonymousClass020 r7 = new AnonymousClass020(r0.A00, r0.A01);
                    float f2 = 15.5f;
                    if (r6.A0I) {
                        f2 = Math.min(r8.A02 + ((float) 4), 15.5f);
                    }
                    AnonymousClass076 A01 = AnonymousClass0T2.A01(r7, f2);
                    r6.A02 = new AnonymousClass0YG(r7, f2, Float.MIN_VALUE, Float.MIN_VALUE);
                    r6.A0B = "map_view";
                    r6.A0e.A0B(new C49812Vy(A01, 1000));
                    r6.A0A = 1;
                    r6.A0J = true;
                }
                C17210ui r3 = r6.A0U;
                Integer num = r6.A0A;
                C29151a7 r12 = new C29151a7();
                C29151a7.A00(r12, 77);
                r12.A06 = num;
                r12.A08 = 1;
                r3.A06(r12);
            }
            return true;
        }
        throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.businessdirectory.viewmodel.MarkerData");
    }
}

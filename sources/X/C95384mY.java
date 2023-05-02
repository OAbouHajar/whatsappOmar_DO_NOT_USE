package X;

import com.obwhatsapp.search.SearchViewModel;

/* renamed from: X.4mY  reason: invalid class name and case insensitive filesystem */
public class C95384mY implements C13290lm {
    public int A00 = -1;
    public final AnonymousClass01X A01;
    public final /* synthetic */ AnonymousClass2AU A02;

    public C95384mY(AnonymousClass01X r2, AnonymousClass2AU r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public void AOI(Object obj, int i2, int i3) {
        this.A01.A01.A04(obj, i2, i3);
    }

    public void ASG(int i2, int i3) {
        int i4 = this.A00;
        if (i4 == -1 || i4 >= i2) {
            this.A00 = i2;
            if (i2 == 0) {
                SearchViewModel searchViewModel = this.A02.A0u;
                AnonymousClass027 r1 = searchViewModel.A0F;
                if (r1.A01() == null || AnonymousClass000.A0D(r1.A01()) == 0) {
                    C13680ns.A1O(searchViewModel.A0V, 0);
                }
            }
        }
        this.A01.A01.A02(i2, i3);
    }

    public void ATo(int i2, int i3) {
        this.A01.A01.A01(i2, i3);
    }

    public void AW0(int i2, int i3) {
        this.A01.A01.A03(i2, i3);
    }
}

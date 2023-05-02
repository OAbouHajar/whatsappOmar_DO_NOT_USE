package X;

import com.obwhatsapp.search.SearchViewModel;

/* renamed from: X.2kk  reason: invalid class name and case insensitive filesystem */
public class C55972kk implements AnonymousClass2B7 {
    public final /* synthetic */ SearchViewModel A00;

    public C55972kk(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    public C16730tY ADV(int i2) {
        if (i2 == -2) {
            return null;
        }
        SearchViewModel searchViewModel = this.A00;
        if (i2 < searchViewModel.A0L.A01.size()) {
            return (C16730tY) searchViewModel.A0L.A01.get(i2);
        }
        return null;
    }

    public int AF9(C28381Vw r4) {
        int i2 = 0;
        while (true) {
            SearchViewModel searchViewModel = this.A00;
            if (i2 >= searchViewModel.A0L.A01.size()) {
                return -2;
            }
            if (C34901l3.A00(r4, ((C16740tZ) searchViewModel.A0L.A01.get(i2)).A11)) {
                return i2;
            }
            i2++;
        }
    }

    public void ATs() {
        this.A00.A0P(2);
    }

    public void Adq(Runnable runnable) {
        this.A00.A0c = runnable;
    }

    public void Ag5() {
    }

    public void AgL() {
    }

    public void AhQ(int i2) {
        SearchViewModel searchViewModel = this.A00;
        int A08 = searchViewModel.A08((C16730tY) searchViewModel.A0L.A01.get(i2));
        if (A08 >= 0 && A08 <= searchViewModel.A0B().size()) {
            searchViewModel.A0V.A09(Integer.valueOf(A08));
        }
    }

    public void close() {
    }

    public int getCount() {
        return this.A00.A0L.A01.size();
    }
}

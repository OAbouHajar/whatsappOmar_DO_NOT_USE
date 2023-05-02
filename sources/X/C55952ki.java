package X;

import android.view.View;
import com.obwhatsapp.conversationslist.ViewHolder;
import com.obwhatsapp.search.SearchViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2ki  reason: invalid class name and case insensitive filesystem */
public class C55952ki implements AnonymousClass2J6 {
    public final /* synthetic */ SearchViewModel A00;

    public C55952ki(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    public void A6C() {
    }

    public C15830rv ACc() {
        return null;
    }

    public List AF2() {
        return this.A00.A14.A0I.A03();
    }

    public Set AFt() {
        return new HashSet();
    }

    public void AOa(ViewHolder viewHolder, C15830rv r7, int i2) {
        SearchViewModel searchViewModel = this.A00;
        searchViewModel.A0H.A0B(Boolean.FALSE);
        searchViewModel.A0P(1);
        if (r7 != null) {
            searchViewModel.A15.A00(5, searchViewModel.A0a() ? 117 : searchViewModel.A06());
            searchViewModel.A0Q.A0B(r7);
        }
    }

    public void AOb(View view, ViewHolder viewHolder, C15830rv r6, int i2, int i3) {
        SearchViewModel searchViewModel = this.A00;
        searchViewModel.A0H.A0B(Boolean.FALSE);
        if (r6 != null) {
            searchViewModel.A0S.A0B(r6);
        }
    }

    public void AOc(ViewHolder viewHolder, C16740tZ r3) {
        this.A00.A0T(r3);
    }

    public void AOe(AnonymousClass1WP r2) {
        Log.e("SearchViewModel/pending group in search results");
    }

    public void ATE(View view, ViewHolder viewHolder, C15830rv r4, int i2) {
        this.A00.A0R.A0B(r4);
    }

    public boolean Abu(Jid jid) {
        return false;
    }
}

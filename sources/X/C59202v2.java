package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;

/* renamed from: X.2v2  reason: invalid class name and case insensitive filesystem */
public class C59202v2 extends AnonymousClass3TH {
    public final Context A00;
    public final C001300o A01;
    public final C14870pt A02;
    public final C16040sK A03;
    public final C17160ud A04;
    public final C16000sG A05;
    public final C16080sP A06;
    public final AnonymousClass152 A07;
    public final AnonymousClass013 A08;
    public final C55782kM A09;
    public final AnonymousClass1WA A0A;

    public C59202v2(Context context, C001300o r4, C14870pt r5, C16040sK r6, C17160ud r7, C16000sG r8, C16080sP r9, AnonymousClass152 r10, AnonymousClass013 r11, C55782kM r12, AnonymousClass1WA r13) {
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r8;
        this.A0A = r13;
        this.A06 = r9;
        this.A08 = r11;
        this.A07 = r10;
        this.A00 = context;
        this.A01 = r4;
        this.A09 = r12;
        C13680ns.A1N(r4, r12.A05, this, 127);
    }

    public int A01() {
        return C13690nt.A0k(this.A09.A05).size() + 1;
    }

    public CharSequence A04(int i2) {
        if (i2 == 0) {
            AnonymousClass013 r6 = this.A08;
            Context context = this.A00;
            int size = C13690nt.A0k(this.A09.A03.A02).size();
            Resources resources = context.getResources();
            Object[] A1b = C13680ns.A1b();
            A1b[0] = C56092kx.A02(context, r6, size);
            return resources.getQuantityString(R.plurals.plurals0122, size, A1b);
        }
        AnonymousClass2Wv r62 = (AnonymousClass2Wv) C13690nt.A0k(this.A09.A05).get(i2 - 1);
        AnonymousClass013 r1 = this.A08;
        Context context2 = this.A00;
        String A022 = C56092kx.A02(context2, r1, C13690nt.A0k(r62.A02).size());
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = r62.A03;
        return C13680ns.A0d(context2, A022, A1Z, 1, R.string.str1349);
    }

    public /* bridge */ /* synthetic */ int A0F(Object obj) {
        int i2;
        C55782kM r3 = this.A09;
        Object obj2 = ((AnonymousClass01Q) obj).A01;
        AnonymousClass00B.A06(obj2);
        AnonymousClass2Wv r2 = (AnonymousClass2Wv) obj2;
        if (r2.A03.equals(r3.A03.A03)) {
            return 0;
        }
        int indexOf = C13690nt.A0k(r3.A05).indexOf(r2);
        if (indexOf < 0 || (i2 = indexOf + 1) == -1) {
            return -2;
        }
        return i2;
    }

    public /* bridge */ /* synthetic */ Object A0G(ViewGroup viewGroup, int i2) {
        Context context = this.A00;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.reactions_bottom_sheet_tab_recycler_view);
        recyclerView.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.dimen0763), 0, 0);
        recyclerView.setClipToPadding(false);
        C55782kM r11 = this.A09;
        AnonymousClass2Wv r10 = i2 == 0 ? r11.A03 : (AnonymousClass2Wv) C13690nt.A0k(r11.A05).get(i2 - 1);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C14870pt r3 = this.A02;
        C16040sK r4 = this.A03;
        C17160ud r5 = this.A04;
        C16000sG r6 = this.A05;
        AnonymousClass1WA r12 = this.A0A;
        recyclerView.setAdapter(new C49952Wu(this.A01, r3, r4, r5, r6, this.A06, this.A07, this.A08, r10, r11, r12));
        viewGroup.addView(recyclerView);
        return new AnonymousClass01Q(recyclerView, r10);
    }

    public /* bridge */ /* synthetic */ void A0H(ViewGroup viewGroup, Object obj, int i2) {
        viewGroup.removeView((View) ((AnonymousClass01Q) obj).A00);
    }

    public /* bridge */ /* synthetic */ boolean A0J(View view, Object obj) {
        return AnonymousClass000.A1Y(view, ((AnonymousClass01Q) obj).A00);
    }
}

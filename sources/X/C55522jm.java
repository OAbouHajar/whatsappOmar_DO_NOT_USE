package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxIDecorationShape4S0101000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape1S0201000_I0;
import com.obwhatsapp.R;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2jm  reason: invalid class name and case insensitive filesystem */
public class C55522jm extends AnonymousClass01X {
    public List A00;
    public final /* synthetic */ StickerStoreTabFragment A01;

    public C55522jm(StickerStoreTabFragment stickerStoreTabFragment, List list) {
        this.A01 = stickerStoreTabFragment;
        this.A00 = list;
    }

    public int A0C() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void ANf(C005602k r21, int i2) {
        C55512jl r4 = (C55512jl) r21;
        int i3 = i2;
        C37771pi r3 = (C37771pi) this.A00.get(i3);
        r4.A0B.setText(r3.A0J);
        long j2 = r3.A08;
        int i4 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        TextView textView = r4.A0C;
        if (i4 > 0) {
            textView.setText(AnonymousClass2GQ.A03(this.A01.A07, j2));
            textView.setVisibility(0);
            r4.A01.setVisibility(0);
        } else {
            textView.setVisibility(4);
            r4.A01.setVisibility(4);
        }
        r4.A0D.setText(r3.A0H);
        View view = r4.A02;
        view.setClickable(true);
        view.setOnClickListener(new ViewOnClickCListenerShape1S0201000_I0(this, i3, r3, 1));
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        int dimensionPixelSize = stickerStoreTabFragment.A03().getDimensionPixelSize(R.dimen.dimen07ba);
        C55552jq r10 = r4.A00;
        if (r10 == null) {
            C14710pd r11 = stickerStoreTabFragment.A08;
            C38411qk A03 = stickerStoreTabFragment.A0F.A03();
            r10 = new C55552jq(r11, stickerStoreTabFragment.A0B, stickerStoreTabFragment.A0D, (StickerView) null, A03, dimensionPixelSize, 0, false, "sticker_store_my_tab".equals(stickerStoreTabFragment instanceof StickerStoreMyTabFragment ? "sticker_store_my_tab" : "sticker_store_featured_tab"));
            r4.A00 = r10;
        }
        List<C34151jm> list = r3.A04;
        C18450wi.A0B(list);
        ArrayList arrayList = null;
        if (!list.isEmpty()) {
            arrayList = new ArrayList(AnonymousClass1J9.A0M(list, 10));
            for (C34151jm r7 : list) {
                C18450wi.A09(r7);
                arrayList.add(new AnonymousClass4WQ(r7, 14, false));
            }
        }
        C87164Vr r6 = new C87164Vr(r3, arrayList);
        r10.A04 = r6.A00;
        r10.A06 = r6.A01;
        C55552jq r0 = r4.A00;
        int i5 = stickerStoreTabFragment.A00;
        r0.A00 = i5;
        r4.A0F.A1g(i5);
        r4.A00.A01();
        r4.A0G.setAdapter(r4.A00);
        r4.A0E.setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(r3, 29, this));
        boolean z2 = r3.A0P;
        ImageView imageView = r4.A05;
        if (z2) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        View inflate = stickerStoreTabFragment.A01.inflate(R.layout.layout0590, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.sticker_row_recycler);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.A0m(new IDxIDecorationShape4S0101000_2_I0(this, stickerStoreTabFragment.A03().getDimensionPixelSize(R.dimen.dimen07bb), 3));
        int dimensionPixelSize = stickerStoreTabFragment.A03().getDimensionPixelSize(R.dimen.dimen07ba);
        if (stickerStoreTabFragment.A00 == 0) {
            stickerStoreTabFragment.A00 = Math.min(5, Math.max(viewGroup.getWidth() / dimensionPixelSize, 1));
        }
        return new C55512jl(inflate, stickerStoreTabFragment);
    }
}

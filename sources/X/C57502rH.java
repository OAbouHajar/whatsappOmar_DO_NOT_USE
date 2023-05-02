package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.List;
import java.util.Map;

/* renamed from: X.2rH  reason: invalid class name and case insensitive filesystem */
public class C57502rH extends AnonymousClass01X {
    public int A00 = -1;
    public int A01;
    public List A02 = AnonymousClass000.A0u();
    public final /* synthetic */ AnonymousClass2X5 A03;

    public C57502rH(AnonymousClass2X5 r2) {
        this.A03 = r2;
    }

    public int A0C() {
        return this.A02.size();
    }

    public long A0D(int i2) {
        if (!this.A00) {
            return -1;
        }
        AnonymousClass2X5 r6 = this.A03;
        if (r6 instanceof AnonymousClass334) {
            AnonymousClass334 r62 = (AnonymousClass334) r6;
            boolean z2 = r62.A01;
            if (z2 && i2 == 0) {
                return -1;
            }
            List list = r62.A03;
            if (z2) {
                i2--;
            }
            String str = ((C37771pi) list.get(i2)).A0F;
            Map map = r62.A04;
            Number number = (Number) map.get(str);
            if (number == null) {
                long j2 = r62.A00;
                r62.A00 = 1 + j2;
                number = Long.valueOf(j2);
                map.put(str, number);
            }
            return number.longValue();
        }
        throw new UnsupportedOperationException("You must override getStableId");
    }

    public final void A0E() {
        int i2;
        ShapePickerRecyclerView shapePickerRecyclerView = this.A03.A08;
        GridLayoutManager gridLayoutManager = shapePickerRecyclerView.A04;
        if (gridLayoutManager != null) {
            int A18 = gridLayoutManager.A18();
            GridLayoutManager gridLayoutManager2 = shapePickerRecyclerView.A04;
            if (gridLayoutManager2 != null) {
                int A1A = gridLayoutManager2.A1A();
                int i3 = 0;
                if (A18 == 0) {
                    i2 = 0;
                } else if (A1A == shapePickerRecyclerView.getAdapterItemCount() - 1) {
                    i2 = this.A02.size() - 1;
                } else {
                    i2 = -1;
                    int i4 = Integer.MAX_VALUE;
                    while (i3 < this.A02.size()) {
                        int min = Math.min(AnonymousClass000.A09(AnonymousClass000.A0D(this.A02.get(i3)), A18), AnonymousClass000.A09(i3 < this.A02.size() + -1 ? AnonymousClass000.A0D(this.A02.get(i3 + 1)) - 1 : Integer.MAX_VALUE, (A18 + A1A) >> 1));
                        if (min < i4) {
                            i2 = i3;
                            i4 = min;
                        }
                        i3++;
                    }
                }
                A0G(i2);
                return;
            }
        }
        throw AnonymousClass000.A0V("Must set adapter first");
    }

    public final void A0F(int i2) {
        AnonymousClass2X5 r1 = this.A03;
        r1.A02 = false;
        A0G(i2);
        ShapePickerRecyclerView shapePickerRecyclerView = r1.A08;
        int A0D = AnonymousClass000.A0D(this.A02.get(i2));
        GridLayoutManager gridLayoutManager = shapePickerRecyclerView.A04;
        if (gridLayoutManager != null) {
            C05490Rq r0 = shapePickerRecyclerView.A05;
            r0.A00 = A0D;
            gridLayoutManager.A0Q(r0);
            return;
        }
        throw AnonymousClass000.A0V("Must set adapter first");
    }

    public final void A0G(int i2) {
        int i3 = this.A00;
        this.A00 = i2;
        A02(i3);
        A02(this.A00);
        int max = Math.max(this.A00 - (this.A01 >> 1), 0);
        AnonymousClass2X5 r2 = this.A03;
        C05490Rq r1 = r2.A05;
        if (max != r1.A00) {
            r1.A00 = max;
            r2.A03.A0Q(r1);
        }
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r9, int i2) {
        View view;
        String string;
        AnonymousClass3S8 r92 = (AnonymousClass3S8) r9;
        int i3 = 0;
        boolean A1R = AnonymousClass000.A1R(this.A00, i2);
        AnonymousClass2X5 r6 = this.A03;
        if (r6 instanceof AnonymousClass334) {
            AnonymousClass334 r62 = (AnonymousClass334) r6;
            boolean z2 = r62.A01;
            if (!z2 || i2 != 0) {
                List list = r62.A03;
                if (z2) {
                    i2--;
                }
                C37771pi r5 = (C37771pi) list.get(i2);
                String str = r5.A0F;
                ImageView imageView = r92.A01;
                if (!str.equals(imageView.getTag())) {
                    r62.A02.A0D(r5, new AnonymousClass526(imageView, str));
                    view = r92.A0H;
                    string = view.getContext().getString(R.string.str15ef, new Object[]{r5.A0H});
                }
            } else {
                ImageView imageView2 = r92.A01;
                imageView2.setTag((Object) null);
                imageView2.setImageResource(R.drawable.ic_stickers_recents);
                view = r92.A0H;
                string = view.getContext().getString(R.string.str15ec);
            }
            view.setContentDescription(string);
        } else {
            ImageView imageView3 = r92.A01;
            imageView3.setImageResource(AnonymousClass335.A01[i2]);
            float f2 = 0.55f;
            if (A1R) {
                f2 = 1.0f;
            }
            imageView3.setAlpha(f2);
            View view2 = r92.A0H;
            view2.setContentDescription(view2.getContext().getString(AnonymousClass335.A02[i2]));
        }
        View view3 = r92.A00;
        if (!A1R) {
            i3 = 8;
        }
        view3.setVisibility(i3);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        AnonymousClass2X5 r3 = this.A03;
        AnonymousClass3S8 r2 = new AnonymousClass3S8(C13680ns.A0H(C13680ns.A0G(r3.A06), viewGroup, R.layout.layout0554));
        r3.A02(r2, r3.A00);
        C13680ns.A1C(r2.A0H, this, r2, 38);
        return r2;
    }
}

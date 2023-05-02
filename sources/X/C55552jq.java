package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape177S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.facebook.redex.ViewOnClickCListenerShape1S0201000_I0;
import com.obwhatsapp.R;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;
import com.whatsapp.stickers.StickerView;
import java.util.List;

/* renamed from: X.2jq  reason: invalid class name and case insensitive filesystem */
public class C55552jq extends AnonymousClass01X {
    public int A00;
    public int A01;
    public View A02;
    public RecyclerView A03;
    public C37771pi A04;
    public AnonymousClass4FK A05;
    public List A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AnonymousClass071 A0A = new IDxSListenerShape34S0100000_2_I0(this, 16);
    public final C14710pd A0B;
    public final C213013o A0C;
    public final AnonymousClass1MF A0D;
    public final StickerView A0E;
    public final C38411qk A0F;
    public final boolean A0G;
    public final boolean A0H;

    public C55552jq(C14710pd r4, C213013o r5, AnonymousClass1MF r6, StickerView stickerView, C38411qk r8, int i2, int i3, boolean z2, boolean z3) {
        this.A0B = r4;
        this.A0D = r6;
        this.A0F = r8;
        this.A08 = i2;
        this.A07 = i3;
        this.A00 = 0;
        this.A09 = R.drawable.sticker_store_error;
        this.A0G = z2;
        this.A0H = z3;
        this.A0E = stickerView;
        this.A0C = r5;
        if (stickerView != null) {
            stickerView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 15));
            stickerView.setOnLongClickListener(new IDxCListenerShape177S0100000_2_I0(this, 6));
        }
    }

    public void A09(RecyclerView recyclerView) {
        this.A03 = recyclerView;
        recyclerView.A0o(this.A0A);
    }

    public void A0A(RecyclerView recyclerView) {
        recyclerView.A0p(this.A0A);
        this.A03 = null;
    }

    public int A0C() {
        C37771pi r1 = this.A04;
        if (r1 == null) {
            return 0;
        }
        int size = ((r1.A0R || (r1.A0G == null && !r1.A04.isEmpty())) ? this.A04.A04 : this.A04.A03).size();
        int i2 = this.A00;
        return i2 > 0 ? Math.min(size, i2) : size;
    }

    public void A0E() {
        AnonymousClass00B.A04(this.A03);
        StickerView stickerView = this.A0E;
        if (stickerView != null && stickerView.getVisibility() == 0) {
            stickerView.setSelected(false);
            this.A02.setVisibility(0);
            stickerView.setVisibility(4);
            this.A03.setAlpha(1.0f);
            stickerView.A05();
        }
    }

    public final void A0F() {
        RecyclerView recyclerView = this.A03;
        AnonymousClass00B.A04(recyclerView);
        StickerView stickerView = this.A0E;
        if (stickerView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
            int i2 = marginLayoutParams.leftMargin;
            int i3 = marginLayoutParams.rightMargin;
            int width = this.A03.getWidth();
            int height = this.A03.getHeight();
            C005602k A0D2 = this.A03.A0D(this.A01);
            if (A0D2 == null) {
                A0E();
                return;
            }
            View view = A0D2.A0H;
            this.A02 = view;
            float x2 = view.getX() + ((float) i2) + (((float) this.A02.getWidth()) / 2.0f);
            float y2 = this.A02.getY() + (((float) this.A02.getHeight()) / 2.0f);
            float max = Math.max(x2 - (((float) stickerView.getWidth()) / 2.0f), 0.0f);
            float max2 = Math.max(y2 - (((float) stickerView.getHeight()) / 2.0f), 0.0f);
            stickerView.setX(max - Math.max(((((float) stickerView.getWidth()) + max) - ((float) width)) - ((float) i3), 0.0f));
            stickerView.setY(max2 - Math.max((((float) stickerView.getHeight()) + max2) - ((float) height), 0.0f));
        }
    }

    public void A0G(int i2, boolean z2) {
        List list = this.A06;
        if (list != null && i2 >= 0 && i2 < list.size()) {
            ((AnonymousClass4WQ) this.A06.get(i2)).A00 = z2;
            A02(i2);
        }
    }

    public void A0H(C34151jm r11, C37771pi r12, int i2) {
        RecyclerView recyclerView = this.A03;
        AnonymousClass00B.A04(recyclerView);
        C005602k A0D2 = recyclerView.A0D(i2);
        if (A0D2 == null) {
            A0E();
            return;
        }
        View view = A0D2.A0H;
        this.A02 = view;
        ImageView imageView = (ImageView) view.findViewById(R.id.sticker_preview);
        this.A01 = i2;
        A0F();
        StickerView stickerView = this.A0E;
        if (stickerView != null) {
            C34151jm r3 = r11;
            if (r11 == null || r11.A09 == null || (this.A0H ? !r12.A0P : r12.A01() || !r12.A0N)) {
                stickerView.setImageDrawable(imageView.getDrawable());
                stickerView.setSelected(true);
            } else {
                this.A0D.A04(stickerView, r3, new C1035751x(this), 1, stickerView.getWidth(), stickerView.getHeight(), true, false);
            }
            AnonymousClass00B.A04(this.A03);
            this.A02.setVisibility(4);
            stickerView.setVisibility(0);
            this.A03.setAlpha(0.2f);
        }
    }

    public final boolean A0I(int i2) {
        if (this.A06 == null || A0K(i2)) {
            return false;
        }
        return ((AnonymousClass4WQ) this.A06.get(i2)).A00;
    }

    public final boolean A0J(int i2) {
        DialogFragment A022;
        if (this.A05 == null || A0I(i2)) {
            return true;
        }
        StickerView stickerView = this.A0E;
        if (stickerView != null && stickerView.getVisibility() == 0 && this.A01 != i2) {
            return true;
        }
        C37771pi r3 = this.A04;
        AnonymousClass00B.A06(r3);
        if (r3.A04.size() <= i2 || i2 < 0) {
            return false;
        }
        boolean z2 = (this.A06 == null || A0K(i2)) ? false : ((AnonymousClass4WQ) this.A06.get(i2)).A02;
        boolean z3 = !z2;
        if (this.A06 != null && !A0K(i2)) {
            ((AnonymousClass4WQ) this.A06.get(i2)).A02 = z3;
        }
        AnonymousClass4FK r4 = this.A05;
        C34151jm r32 = (C34151jm) r3.A04.get(i2);
        if (z2) {
            A022 = new RemoveStickerFromFavoritesDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("sticker", r32);
            A022.A0T(bundle);
        } else {
            A022 = StarStickerFromPickerDialogFragment.A02(r32, i2);
        }
        r4.A00.Afc(A022);
        return true;
    }

    public final boolean A0K(int i2) {
        List list = this.A06;
        return list == null || i2 < 0 || i2 >= list.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r12, int i2) {
        C34151jm r4;
        AnonymousClass3SA r122 = (AnonymousClass3SA) r12;
        ImageView imageView = r122.A01;
        imageView.setImageResource(this.A09);
        boolean A0I = A0I(i2);
        View view = r122.A00;
        int i3 = 8;
        if (A0I) {
            i3 = 0;
        }
        view.setVisibility(i3);
        float f2 = 1.0f;
        if (A0I) {
            f2 = 0.0f;
        }
        imageView.setAlpha(f2);
        C37771pi r0 = this.A04;
        if (r0 != null) {
            if (r0.A04.size() > i2) {
                r4 = (C34151jm) this.A04.A04.get(i2);
                if (r4 != null) {
                    imageView.setContentDescription(C89674ci.A00(imageView.getContext(), r4));
                }
            } else {
                r4 = null;
            }
            C37771pi r1 = this.A04;
            if (r1.A0R || ((r1.A0G == null && !r1.A04.isEmpty()) || !(r4 == null || r4.A09 == null || (!this.A0H && r1.A01())))) {
                AnonymousClass1MF r2 = this.A0D;
                AnonymousClass00B.A06(r4);
                int i4 = this.A08;
                r2.A04(imageView, r4, new C1035851y(this, i2), 1, i4, i4, false, false);
            } else {
                StringBuilder sb = new StringBuilder("https://static.whatsapp.net/sticker?img=");
                sb.append((String) this.A04.A03.get(r122.A00()));
                String obj = sb.toString();
                if (this.A0B.A0E(C16620tM.A02, 2565)) {
                    obj = this.A0C.A00(obj);
                }
                this.A0F.A00((Drawable) null, (Drawable) null, imageView, new AnonymousClass52K(this, r122), obj);
            }
            if (this.A0G) {
                View view2 = r122.A0H;
                view2.setOnLongClickListener(new C94194kW(this, i2));
                view2.setOnClickListener(new ViewOnClickCListenerShape1S0201000_I0(this, i2, r4, 2));
            }
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        AnonymousClass3SA r5 = new AnonymousClass3SA(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout058f, viewGroup, false));
        ImageView imageView = r5.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i3 = this.A08;
        layoutParams.height = i3;
        layoutParams.width = i3;
        imageView.setLayoutParams(layoutParams);
        int i4 = this.A07;
        imageView.setPadding(i4, i4, i4, i4);
        View view = r5.A00;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.height = i3;
        layoutParams2.width = i3;
        view.setLayoutParams(layoutParams);
        view.setPadding(i4, i4, i4, i4);
        return r5;
    }
}

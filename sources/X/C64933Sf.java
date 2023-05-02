package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape178S0100000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.3Sf  reason: invalid class name and case insensitive filesystem */
public class C64933Sf extends C005602k {
    public View.OnLongClickListener A00;
    public C34151jm A01;
    public boolean A02;
    public boolean A03;
    public final View.OnLongClickListener A04 = new IDxCListenerShape178S0100000_2_I1(this, 11);
    public final AnonymousClass1MF A05;
    public final AnonymousClass5QT A06;
    public final StickerView A07;
    public final Integer A08;

    public C64933Sf(LayoutInflater layoutInflater, ViewGroup viewGroup, AnonymousClass1MF r5, AnonymousClass5QT r6, Integer num) {
        super(C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0584));
        this.A05 = r5;
        this.A06 = r6;
        this.A08 = num;
        StickerView stickerView = (StickerView) this.A0H.findViewById(R.id.sticker_view);
        this.A07 = stickerView;
        stickerView.A03 = true;
    }
}

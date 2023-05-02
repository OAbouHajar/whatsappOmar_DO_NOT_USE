package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;
import com.whatsapp.stickers.store.StickerStoreTabFragment;

/* renamed from: X.2jl  reason: invalid class name and case insensitive filesystem */
public class C55512jl extends C005602k {
    public C55552jq A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final ProgressBar A09;
    public final ProgressBar A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final GridLayoutManager A0F;
    public final RecyclerView A0G;
    public final CircularProgressBar A0H;
    public final /* synthetic */ StickerStoreTabFragment A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55512jl(View view, StickerStoreTabFragment stickerStoreTabFragment) {
        super(view);
        this.A0I = stickerStoreTabFragment;
        this.A02 = view;
        this.A0D = (TextView) view.findViewById(R.id.sticker_pack_title);
        this.A0B = (TextView) view.findViewById(R.id.sticker_pack_author);
        this.A0C = (TextView) view.findViewById(R.id.sticker_pack_filesize);
        this.A06 = (ImageView) view.findViewById(R.id.button_one);
        this.A07 = (ImageView) view.findViewById(R.id.button_two);
        this.A08 = (ImageView) C004601z.A0E(view, R.id.sticker_pack_avatar_info_button);
        this.A09 = (ProgressBar) view.findViewById(R.id.pack_download_progress);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_row_recycler);
        this.A0G = recyclerView;
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(stickerStoreTabFragment.A00);
        this.A0F = gridLayoutManager;
        gridLayoutManager.A1P(1);
        recyclerView.setLayoutManager(gridLayoutManager);
        this.A01 = view.findViewById(R.id.bullet_file_size);
        this.A04 = view.findViewById(R.id.sticker_update_button);
        TextView textView = (TextView) view.findViewById(R.id.sticker_update_text);
        this.A0E = textView;
        this.A0A = (ProgressBar) view.findViewById(R.id.pack_update_progress);
        this.A0H = (CircularProgressBar) view.findViewById(R.id.sticker_row_loading);
        this.A03 = view.findViewById(R.id.new_pack_badge);
        this.A05 = (ImageView) view.findViewById(R.id.sticker_animationlist);
        AnonymousClass1UP.A06(textView);
    }
}

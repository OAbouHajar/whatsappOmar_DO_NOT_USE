package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;

/* renamed from: X.06S  reason: invalid class name */
public class AnonymousClass06S implements AnonymousClass06T {
    public final int[] A00 = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    public final int[] A01 = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
    public final int[] A02 = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    public final int[] A03 = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    public final int[] A04 = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    public final int[] A05 = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    public static final ColorStateList A00(Context context, int i2) {
        int A012 = AnonymousClass08P.A01(context, R.attr.attr00eb);
        int A002 = AnonymousClass08P.A00(context, R.attr.attr00e8);
        return new ColorStateList(new int[][]{AnonymousClass08P.A02, AnonymousClass08P.A05, AnonymousClass08P.A04, AnonymousClass08P.A03}, new int[]{A002, AnonymousClass090.A05(A012, i2), AnonymousClass090.A05(A012, i2), i2});
    }

    public static final void A01(PorterDuff.Mode mode, Drawable drawable, int i2) {
        if (C015307j.A03(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(AnonymousClass06K.A00(mode, i2));
    }

    public static final boolean A02(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }
}

package com.obwhatsapp.youbasha.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class TextBubbleRight extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public View f1131a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1132b = yo.getID("balloon_outgoing_normal", "drawable");

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f1133c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f1134d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f1135e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f1136f;

    public TextBubbleRight(Context context) {
        super(context);
        yo.getID("message_got_read_receipt_from_target", "drawable");
        a();
    }

    public TextBubbleRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        yo.getID("message_got_read_receipt_from_target", "drawable");
        a();
    }

    public final void a() {
        View view = null;
        String str = "۬ۧۢۥۥۢۤ۬ۜۘۛۗۙ۫ۡۛۦۖۚۜۧۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 397) ^ 330700184) {
                case -1924964401:
                    this.f1136f = (TextView) this.f1131a.findViewById(yo.getID("date", "id"));
                    str = "ۖ۟ۖۨۥۗ۟ۥۥۘۤۖۘ۠ۥۨۘ۫ۚۖۛ۟۟ۖ۟ۧ";
                    break;
                case -1303767451:
                    this.f1133c = (ViewGroup) view.findViewById(yo.getID("main_layout", "id"));
                    str = "ۛۡ۠ۡۜۢ۫ۚۜۖۗۜۖۥۜۘ۟ۙۗۜ۠۫۟ۢۜ";
                    break;
                case -415167269:
                    view = LayoutInflater.from(getContext()).inflate(yo.getID("yo_bubbletickpreview_right", "layout"), this);
                    str = "ۡۦۗۦۧۙ۟ۗۡ۫ۛۥۤ۠ۛۜۙۚۨۡۘ";
                    break;
                case -211653854:
                    this.f1135e = (TextView) this.f1131a.findViewById(yo.getID("message_text", "id"));
                    str = "ۖۧۥۘۢۗۛۢۚۜۧۢۘۘۧۢۖ۫۟ۙ۟۠ۢ";
                    break;
                case -35047392:
                    updateBubbleStyle();
                    str = "ۚۥ۬ۤۦۖۨ۫ۚۤۥۘۘۜ۬ۦۤۗۙ";
                    break;
                case 146841728:
                    return;
                case 1163548703:
                    str = "ۧۛۨ۬ۖۗۘۛۡۘ۠ۛ۬ۨۦۘۘۧۙۘۘ";
                    break;
                case 1182575804:
                    this.f1134d = (ImageView) this.f1131a.findViewById(yo.getID("status", "id"));
                    str = "ۧۙۡۚۢۖۘۤۛۢ۬ۚۥۖۡۧ";
                    break;
                case 1784186298:
                    this.f1131a = view;
                    str = "ۚ۬ۜۗۡۡۘۗۜۘۘۚۗۜۘۜۧۥ۬۬ۙۥ۟ۘۘ۟ۙ۬";
                    break;
            }
        }
    }

    public void showDelIcon() {
        String str = "۬ۦۘ۟۫ۘۘۧۧۦۘ۟ۢۜۡۨۙ۬ۖ۟ۦۦۨۦۖۤۡ۠ۛ";
        while (true) {
            switch ((str.hashCode() ^ 275) ^ -1812537705) {
                case -642332506:
                    yo.setDelIcon(this.f1136f, false);
                    str = "ۘۤۖۘۨۜۦۛۗۤۘۧ۫۬ۖۡۥۤۡۘۦۨۧۚۡۢ";
                    break;
                case 436976719:
                    return;
                case 1322992052:
                    str = "ۦ۫ۜۤۙۚۙۙۖۤۛۥۡ۫ۧۜۗ۬۫۠ۘ۫ۦۤۘۡ۫";
                    break;
            }
        }
    }

    public void updateBubbleStyle() {
        Drawable drawable = null;
        int i2 = 0;
        String str = "ۡۙۦۘۚۚۜۘۥۗۜۚۜۖۘۧۚۚۥۥۖۘۧۢۛ";
        while (true) {
            switch ((str.hashCode() ^ 312) ^ -754810958) {
                case -2116848463:
                    drawable = yo.BubbleStyle(getContext(), 1, this.f1132b);
                    str = "ۡ۫ۡۢۦۘۘۥۛۧ۫ۦۦۚۙ۬ۧۘۜ۟ۡۘۜۢۜۘ۬ۤۡ";
                    break;
                case -1928274551:
                    this.f1134d.setImageResource(yo.getBubbleTick("message_got_read_receipt_from_target"));
                    str = "ۥۤۘۙۗ۬ۘۜۙۦۤۧۨۨۜ۠ۢۛۖۜۤۙۢۥۘ";
                    break;
                case -1911118252:
                    return;
                case -1878345314:
                    this.f1135e.setTextColor(others.getColor("ModChatBubbleText", ColorStore.getDefaultChatBubbleTextColor()));
                    str = "ۙۥۡۦۚۥۜۘۥۘۤۤ۠ۗۚۖ";
                    break;
                case -1613678381:
                    this.f1131a.invalidate();
                    str = "ۗۦۚۜ۠ۘۖۗۡۘ۫ۦۛۘۘۙۥۡۘۘۖۖ۠۟ۥۖۘ۫ۦۧۘ";
                    break;
                case -356473196:
                    this.f1135e.setTextSize(2, (float) shp.getPrefInt("text_size_pick", 16));
                    str = "ۤۦۧۘۧۧ۠ۨۧۨۛۚۡۗۢۦۘۖۛۜ۠ۖ";
                    break;
                case -349797138:
                    i2 = others.getColor("ModChatRightBubble", -11);
                    str = "ۡۘۢۘۙۨۨ۫۠ۗۦ۫ۜۡۖۘۤۥۤ۫ۘۘ";
                    break;
                case -22615744:
                    String str2 = "ۥ۟ۧۗۡۥۘۧ۫ۜۤۦۧۘۙۖۘۘۙۖۜۘ۟ۘۗۦ۟ۨ";
                    while (true) {
                        switch (str2.hashCode() ^ -1570116680) {
                            case -1791067071:
                                str2 = "ۧ۠ۚۜۘ۟ۥۗۜۘۧۘۖۜۢۧۡۖۤ";
                                break;
                            case -1403648465:
                                str = "ۦۜۜۘۨۛۡۤۧۡۦۜۘۗۖۖ۠ۥۡ۫۟ۖۘ";
                                continue;
                            case -1312550693:
                                str = "ۗۙ۟۫۫ۡ۟ۜ۠ۥۖ۫ۤ۠۟";
                                continue;
                            case 551732304:
                                if (i2 == -11) {
                                    str2 = "ۜۢۛۛۖ۠۫ۤۦۘۜ۟ۨۘۛ۫ۡۘۛۙۨۘۡ۟ۦۘۗۤۡۘ";
                                    break;
                                } else {
                                    str2 = "ۗ۠ۤۤۥۢ۟۠ۨۘۗۗۢۙۧ";
                                    break;
                                }
                        }
                    }
                    break;
                case 309752288:
                    this.f1136f.setTextColor(others.getColor("date_right_color", ColorStore.getDefaultChatBubbleDateColor()));
                    str = "ۙۥۖۚۙ۬ۨ۬۠ۡ۫ۖۢ۫۟ۚۙۙ۬۠ۛۜۙۙۙۦ";
                    break;
                case 530671377:
                    this.f1133c.setBackground(drawable);
                    str = "ۛۙۛۛۖۢۘۗۧۗۙ۟۠۠ۡۢۡۡۢ۟۠";
                    break;
                case 589024610:
                    drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
                    str = "ۦۜۜۘۨۛۡۤۧۡۦۜۘۗۖۖ۠ۥۡ۫۟ۖۘ";
                    break;
                case 593010357:
                    str = "ۖۦۨ۟ۤ۠ۧۡ۟۬ۜۤ۬ۚۨۢۚۙۖۨ۠ۨۘۙ۠ۗۦ";
                    break;
            }
        }
    }
}

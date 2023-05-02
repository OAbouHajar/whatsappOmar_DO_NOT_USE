package com.obwhatsapp.youbasha.colorPicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.obwhatsapp.youbasha.others;
import j.j;

public class RgbSelectorView extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final int f1027g = 0;

    /* renamed from: a  reason: collision with root package name */
    public SeekBar f1028a;

    /* renamed from: b  reason: collision with root package name */
    public SeekBar f1029b;

    /* renamed from: c  reason: collision with root package name */
    public SeekBar f1030c;

    /* renamed from: d  reason: collision with root package name */
    public SeekBar f1031d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f1032e;

    /* renamed from: f  reason: collision with root package name */
    public OnColorChangedListener f1033f;

    public interface OnColorChangedListener {
        void colorChanged(int i2);
    }

    public RgbSelectorView(Context context) {
        super(context);
        a();
    }

    public RgbSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        String str = "ۨۧ۫۬ۘۖۗۛۖۛۥۡ۟ۧۢۡۡۦۘۛ۟ۙ";
        SeekBar seekBar = null;
        SeekBar seekBar2 = null;
        SeekBar seekBar3 = null;
        SeekBar seekBar4 = null;
        j jVar = null;
        View view = null;
        while (true) {
            switch ((str.hashCode() ^ 592) ^ 1514049585) {
                case -1981508292:
                    this.f1032e = (ImageView) view.findViewById(others.getID("color_rgb_imgpreview", "id"));
                    str = "ۙۤۜ۟ۦۖۘۦ۠۟۠ۚۡۨ۟۠۬ۖۘ";
                    break;
                case -1661356415:
                    seekBar3.setOnSeekBarChangeListener(jVar);
                    str = "ۨۨ۠ۘ۬ۢۚۘۧۡ۟ۜۙۗۘ۬ۛۢۙ۟۫۬ۧ۬ۜۥ۬";
                    break;
                case -1172347539:
                    str = "۬ۙۗ۠ۧۜۢ۬ۨۥۦۤۧ۫ۡۦۖۘۨۖۜۚۖۙ";
                    break;
                case -1154626076:
                    this.f1031d = seekBar;
                    str = "ۙۡۤۦۥۤۛۙۜۚۨۘۘۜۦ۫ۧۙۡۖ۬ۥ";
                    break;
                case -1066229120:
                    setColor(-16777216);
                    str = "۬ۚۨۛۤۜۘۥۧ۟۟ۖۦۘۙۙۘۘ";
                    break;
                case -538666009:
                    jVar = new j(this);
                    str = "ۛۙۧۥۡۤۛۢ۠ۖۤۘۘۚۥۜۢۗۧۨۦۛۤۡۡۘۢ۟ۗ";
                    break;
                case -391677507:
                    str = "ۦ۫ۗۢۡۖۘۤ۠ۢۢۧ۟ۖۛۜۘ";
                    seekBar3 = (SeekBar) view.findViewById(others.getID("color_rgb_seekGreen", "id"));
                    break;
                case -356740361:
                    seekBar4.setOnSeekBarChangeListener(jVar);
                    str = "ۙۜ۬ۤۘۘۘۡۧۤۚۖ۟ۘۜۘۧۙۗۘۡۘۥ۫ۘۘ۠ۚۘ";
                    break;
                case -44278177:
                    seekBar.setOnSeekBarChangeListener(jVar);
                    str = "ۢۙۢۥ۬۬۫۟ۦۘۛ۫ۙۨۥ۬۫ۙۘۦۦۡ";
                    break;
                case -44254069:
                    view = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(others.getID("color_rgbview", "layout"), (ViewGroup) null);
                    str = "ۧۘۡۘۜ۬ۦۘۢ۠ۗۜۢۖۘ۟ۚۦۡۙۨۘۗۛۨ۟ۧۥۘ";
                    break;
                case 392228265:
                    this.f1029b = seekBar3;
                    str = "ۗۧۨۘۤۜ۬ۘۘۡۗۚ۬ۧۙۤۗۧۛۘۢۨۘۖۧ";
                    break;
                case 673805562:
                    str = "۬ۨۧۤۧۘۘۦۢۥۗۜۜۛۥۘۡ۬ۘۘ";
                    seekBar2 = (SeekBar) view.findViewById(others.getID("color_rgb_seekBlue", "id"));
                    break;
                case 720732019:
                    str = "ۛۥۨ۬ۖۚۤ۠ۖۘۡ۬۠ۘۢ۬ۤ۬ۖ۟ۢۡ";
                    seekBar4 = (SeekBar) view.findViewById(others.getID("color_rgb_seekRed", "id"));
                    break;
                case 1157138818:
                    addView(view, new LinearLayout.LayoutParams(-1, -1));
                    str = "ۥ۟ۨۘۥۨۥ۫ۗ۠ۡۜ۟ۥۨۨۧ۫ۥۘۖ۠۬ۛ۫ۤ";
                    break;
                case 1369450628:
                    str = "ۚۖ۬۟ۖۧۘۥ۠ۥۘۛۛ۠۟ۥۧ۬";
                    seekBar = (SeekBar) view.findViewById(others.getID("color_rgb_seekAlpha", "id"));
                    break;
                case 1645676486:
                    return;
                case 1873300108:
                    this.f1028a = seekBar4;
                    str = "ۡۚۤ۫ۚۗۚۗۥۜۧۦۘۜۥۧۘ۟ۨۤۢۘۥ";
                    break;
                case 1957366235:
                    seekBar2.setOnSeekBarChangeListener(jVar);
                    str = "ۛۛۨۘۚۢۨۥ۫ۙۘۥ۠ۗ۬";
                    break;
                case 2031606524:
                    this.f1030c = seekBar2;
                    str = "۬ۜۡ۟ۥۚۢۥۡۘۨ۟ۜۨۢۡۗۛۡۘ";
                    break;
            }
        }
    }

    public int getColor() {
        String str = "ۨۘۢ۫۬ۗ۠ۛۖۛۧۖۘۜ۫ۧۘۛۘۢۢۘۘۨۜۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 460) ^ 1563429831) {
                case 62220680:
                    return Color.argb(this.f1031d.getProgress(), this.f1028a.getProgress(), this.f1029b.getProgress(), this.f1030c.getProgress());
                case 1165007229:
                    str = "ۧۘۖ۠۟ۢۥۗۢۤ۠ۢۚۜۘۘۜۦۛۧ۠ۗ";
                    break;
            }
        }
    }

    public void setColor(int i2) {
        Bitmap bitmap = null;
        String str = "ۜۨۗۜۚۖۗۨۖ۟ۡۧ۠ۨۘۙ۫۫ۡ۫ۜۘۚ۠ۚ۠۠ۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 740) ^ -22354370) {
                case -1568734400:
                    this.f1030c.setProgress(Color.blue(i2));
                    str = "۫ۚۘ۬۬۬ۚۜ۬ۘۥۢۜ۟ۦۢ۠ۨۘ";
                    break;
                case -1498871506:
                    str = "ۨ۠ۦۘۚ۟۬ۥۚۤۖ۠ۢ۟۬ۚۤۤۡۨۗۙ";
                    break;
                case -1122944819:
                    this.f1029b.setProgress(Color.green(i2));
                    str = "۬۬ۗۗۜۘۘۢۖۤ۠ۚۥۘ۬ۗ۟ۤۦۖۥۗۡۘ۫ۘۨۘۥۦۢ";
                    break;
                case -275901846:
                    str = "ۖۜۧۘۥۢۘۘۤۢۢۦۙۤ۟ۙۧ";
                    break;
                case -57277671:
                    bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    str = "ۡۛۚۡۡۗۙ۬ۘۥۥۙۧۛۥۜ۟ۦۘۨۧۢۘۧۛ";
                    break;
                case 70137870:
                    return;
                case 803189950:
                    bitmap.setPixel(0, 0, getColor());
                    str = "ۤ۫ۥ۠ۜۢۡ۫ۨۦۢۨۘۘۥۜۘ";
                    break;
                case 915691030:
                    this.f1031d.setProgress(Color.alpha(i2));
                    str = "ۜ۬۫ۛ۫ۖۙ۟ۨۥۡ۟ۚ۠۫ۚۡۘۨ۠ۤ۫ۤۜۘ";
                    break;
                case 1303480913:
                    this.f1032e.setImageBitmap(bitmap);
                    str = "ۡۦۦۚۛۙۧۨۘۧۜۦۢ۟ۘۘۘۡۜۘۚۘۘۘ۠ۢۧ";
                    break;
                case 1596472691:
                    this.f1028a.setProgress(Color.red(i2));
                    str = "۟ۦۡۜۥ۟ۛ۠ۥۢۘۦۘۢ۟ۙۘ۟";
                    break;
            }
        }
    }

    public void setOnColorChangedListener(OnColorChangedListener onColorChangedListener) {
        String str = "ۖۦ۟۬ۡۙۗۨۚۨۥۜۘ۫ۡۙ۠ۨۥۗۤۗ";
        while (true) {
            switch ((str.hashCode() ^ 934) ^ 1585517207) {
                case -908714869:
                    this.f1033f = onColorChangedListener;
                    str = "۟ۖۦۜۤۖۘۥۥۡۨ۫ۥۘۡۥۙ";
                    break;
                case 1287750022:
                    return;
                case 1700692626:
                    str = "۟ۦۖۨۖۧ۫ۙۗ۫ۧۥۤۨۤۥ";
                    break;
                case 1737510686:
                    str = "ۢۢ۠ۢۨ۫۬ۦۚۨۦۚ۠ۘۤۙ۫ۗ";
                    break;
            }
        }
    }
}

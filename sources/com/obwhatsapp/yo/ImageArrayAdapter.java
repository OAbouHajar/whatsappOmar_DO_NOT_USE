package com.obwhatsapp.yo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.HashMap;

public class ImageArrayAdapter extends ArrayAdapter<CharSequence> {

    /* renamed from: e  reason: collision with root package name */
    public static int f542e;

    /* renamed from: f  reason: collision with root package name */
    public static int f543f;

    /* renamed from: g  reason: collision with root package name */
    public static int f544g;

    /* renamed from: a  reason: collision with root package name */
    public final int f545a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f546b;

    /* renamed from: c  reason: collision with root package name */
    public final LayoutInflater f547c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f548d = new HashMap();

    public ImageArrayAdapter(Context context, int i2, CharSequence[] charSequenceArr, int[] iArr, int i3) {
        super(context, i2, charSequenceArr);
        this.f546b = iArr;
        this.f545a = i3;
        this.f547c = LayoutInflater.from(context);
        f542e = yo.getID("yo_imgpref", "layout");
        f543f = yo.getID("yo_image", "id");
        f544g = yo.getID("yo_check", "id");
    }

    @NonNull
    public View getView(int i2, View view, @NonNull ViewGroup viewGroup) {
        HashMap hashMap = null;
        View view2 = null;
        int i3 = 0;
        View view3 = null;
        ImageView imageView = null;
        CheckedTextView checkedTextView = null;
        View view4 = null;
        View view5 = null;
        String str = "ۧ۬ۖۨ۠ۤۢ۠ۜۤۨۧۘۚۨۚۚۨۧۖۖۦ";
        while (true) {
            switch ((str.hashCode() ^ 861) ^ -1310645559) {
                case -1905988336:
                    imageView.setImageResource(this.f546b[i2]);
                    str = "ۘۘۜۧۚ۫ۦۤۘۢ۬ۚۖۜۡۙ";
                    break;
                case -1850751068:
                    checkedTextView.setText((CharSequence) getItem(i2));
                    str = "ۨۛۘۗ۟ۜۘۧۚۘ۟ۨۗۥۖۧۛۤۨ۬۟ۚ";
                    break;
                case -1682565790:
                    str = "ۦۤۜۤۡۤ۫ۜۘۥ۟ۧ۫۟ۧ";
                    checkedTextView = (CheckedTextView) view3.findViewById(f544g);
                    break;
                case -924532454:
                    str = "ۢۙ۟۫ۚۥۘۡ۬ۨۗۧ۬ۡۖۤ۫۬ۥۨۢۛ";
                    break;
                case -905733951:
                    str = "۫ۖ۟ۧۗ۫ۚۨۨۤ۫ۙۖ۟ۗۗۙ۬ۘۖ۬۟ۘۖۘ";
                    view5 = view2;
                    break;
                case -432561701:
                    view3 = this.f547c.inflate(i3, viewGroup, false);
                    str = "ۡۖۦۘۜۚۜۤ۬ۨۗۦۤۖۡۥۘۙۘ۬ۙ۫۟۬ۖۨ";
                    break;
                case -394881858:
                    hashMap = this.f548d;
                    str = "ۖ۬ۡۤ۬ۦۘۖ۫ۥۨۛۦۘۚ۬ۥۘ۬۠ۦ";
                    break;
                case -350916020:
                    str = "ۡۨۖۘۦۘۘۘۘۧ۟ۢۜ۠ۚۜۜۛ۬۫۠ۘۘ";
                    break;
                case -299981451:
                    str = "ۨۢۘۘۤ۫ۚۨۦۥۘۢ۟۫۟۬ۘ۠ۜۡۨۘۘ۠ۧۘۘۨۥۖ";
                    break;
                case -82840389:
                    checkedTextView.setChecked(true);
                    str = "ۨۜۡۙۙۥۘۛۨۥۘۙۙۖۡۚۘۘۗۨۦ۫۫۬ۜۚۦ";
                    break;
                case -63853808:
                    str = "ۜۘۘۨۢۘۦۦۤۢ۬ۧۤۤۘۖ۠ۚۧۙۨۛۖۘ";
                    view4 = view3;
                    break;
                case 42058678:
                    hashMap.put(Integer.valueOf(i2), view3);
                    str = "ۚ۬ۖۘۢۚۘۘ۠۠ۘۜ۫۬۫ۜۖۘ";
                    break;
                case 242382660:
                    str = "ۘ۬ۨۧۘۘۘ۟۠ۦۘ۬۫ۨۘۦۤۥۢۘ۫";
                    view2 = (View) hashMap.get(Integer.valueOf(i2));
                    break;
                case 258203544:
                    String str2 = "ۚۨۜۛۛ۫ۨۨ۫ۖۧۘۘۨۥۨۘۦۛۨۘۖۖۧۨ۟۠ۗ۬ۚ";
                    while (true) {
                        switch (str2.hashCode() ^ -590456579) {
                            case -1472423766:
                                str = "ۜۙۖۢۙۡۦۥۦۘۚ۟ۛۙۜۥۘۘۛۘۘۙۡۡۧۘۘۘ۟۫ۘ";
                                continue;
                            case 120937807:
                                if (this.f545a != i2) {
                                    str2 = "ۧ۠ۥۘۨ۠ۖۘۢۡۜۘ۬۫ۙ۠ۡۗۚۡۜۘ";
                                    break;
                                } else {
                                    str2 = "۫ۖ۟ۙۨۘۗ۫ۡۘۘ۟ۗۖ۟ۤ۬۟";
                                    break;
                                }
                            case 689584675:
                                str2 = "ۧۧۨۨ۫ۜۘ۟ۧۨۘۛۙۤۥ۬ۚۛۦ";
                                break;
                            case 1468596701:
                                str = "ۨۜۡۙۙۥۘۛۨۥۘۙۙۖۡۚۘۘۗۨۦ۫۫۬ۜۚۦ";
                                continue;
                        }
                    }
                    break;
                case 425545024:
                    str = "ۛ۟ۧۖۦۨۘۛۦۘۤۥۥۘۡۤۖۘ۬ۛۧۦ۟ۥۡ۬ۖۘ۠ۥ۟";
                    imageView = (ImageView) view3.findViewById(f543f);
                    break;
                case 826277435:
                    str = "ۨ۫ۡۛۚۨۡۤۦۘۜۨۨ۫ۢۗۛۚۨۘۦۢۙ";
                    break;
                case 875049321:
                    String str3 = "ۛۥۤۙۢۦ۬۟ۚۡۜۘ۟ۡۘۘۨۢۜۗۡۜ";
                    while (true) {
                        switch (str3.hashCode() ^ 439547143) {
                            case -336376759:
                                str = "ۧۙۢۙۨۘۙۛۡۘۜ۟ۖۘۡ۟ۢۛۙۗۦۙ۠ۨۗ";
                                continue;
                            case 611642892:
                                if (!hashMap.containsKey(Integer.valueOf(i2))) {
                                    str3 = "ۨۛ۠ۤۚۘۘۢۨۚۗۖۖۘ۟ۡ۟";
                                    break;
                                } else {
                                    str3 = "۠ۧۢۡۨ۟۟ۙۡۘۥۧۡۘ۬ۦۜۘۖۛۚ";
                                    break;
                                }
                            case 1752348543:
                                str3 = "۠ۥۗۥ۠ۦۧۦۘ۫ۛۥۧۥۖ۫ۢۨ";
                                break;
                            case 2026232556:
                                str = "ۨۥ۬۬۫ۦۘۦۛۦۜ۠ۨۧۛۛ";
                                continue;
                        }
                    }
                    break;
                case 1101028860:
                    str = "۫۠ۥۘۛۨۥۘ۬۠ۦۧ۫ۥۨۢۜۘۧۡۧۘ";
                    break;
                case 1205511671:
                    return view5;
                case 1455488032:
                    i3 = f542e;
                    str = "ۨۚۖۙۛۜۘۘۧۥۘۡ۠ۢۚ۫ۨۘۚۘۥۘ۠ۢۜۘ";
                    break;
                case 1581450030:
                    str = "ۢۙ۟۫ۚۥۘۡ۬ۨۗۧ۬ۡۖۤ۫۬ۥۨۢۛ";
                    view5 = view4;
                    break;
            }
        }
    }
}

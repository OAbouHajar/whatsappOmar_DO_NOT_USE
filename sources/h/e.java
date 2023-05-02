package h;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.obwhatsapp.yo.dep;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.task.utils;
import java.util.Arrays;

public final class e extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static final int f1750f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f1751a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayMap f1752b;

    /* renamed from: c  reason: collision with root package name */
    public final LayoutInflater f1753c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1754d = others.getID("massmsgr_item", "layout");

    /* renamed from: e  reason: collision with root package name */
    public final Drawable f1755e;

    public e(Activity activity, ArrayMap arrayMap) {
        this.f1751a = activity;
        this.f1753c = LayoutInflater.from(activity);
        this.f1752b = arrayMap;
        this.f1755e = yo.getDrawableByName("avatar_group");
    }

    public final int getCount() {
        String str = "ۢۖۜۘۤۦۖۘۤۥ۟ۧۧ۬ۗۘۡ۟ۖ۫";
        while (true) {
            switch ((str.hashCode() ^ 793) ^ 183085299) {
                case -983681412:
                    str = "ۥۧۦ۬ۘۖۜ۟ۦۘۙۚۥۦۤ۫";
                    break;
                case 280250958:
                    return this.f1752b.size();
            }
        }
    }

    public final Object getItem(int i2) {
        String str = "ۨۖۡۘ۟ۤۤۢۛ۬ۡۨ۠ۜۜ۬ۧ۫۬۫";
        while (true) {
            switch ((str.hashCode() ^ 740) ^ 144425541) {
                case -1572148204:
                    return this.f1752b.valueAt(i2);
                case -647602738:
                    str = "ۥۛۘۘۜۥ۬ۖۘۦۘۙ۫ۚۖۛۖۘ۟۫ۖ۬ۥۘۘۛۤۥ";
                    break;
                case 345938470:
                    str = "ۨۙ۫ۥۗۦۙۖۨۘ۠ۗ۬ۛۥۜ۫ۛۨۤۧ۬";
                    break;
            }
        }
    }

    public final long getItemId(int i2) {
        String str = "ۗ۫۬ۘۦۘۘۦۚ۠ۡۘۤۗۜۖ۟ۤۖ۫ۥ";
        while (true) {
            switch ((str.hashCode() ^ 753) ^ 993295724) {
                case -1254901896:
                    str = "ۚۗۢۜۘۗۛۡۘۙۗ۫۫ۖۜۘۢ۠ۡۘ۫۬ۗ";
                    break;
                case -833163684:
                    str = "ۥ۠ۖۨۨۤۦۢ۫ۡۛۧۢۨۥۚۖۘۡ۠ۖۘ";
                    break;
                case 727202452:
                    return (long) getItem(i2).hashCode();
            }
        }
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2 = null;
        d dVar = null;
        d dVar2 = null;
        d dVar3 = null;
        String str = null;
        String str2 = null;
        String[] strArr = null;
        int i3 = 0;
        String[] strArr2 = null;
        int i4 = 0;
        int i5 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        c cVar = null;
        View view3 = null;
        c cVar2 = null;
        String str6 = "ۧۚۙۚۡۘۘۛۦۘۢۨۘۘۜۢۖ۟ۗۨ";
        while (true) {
            switch ((str6.hashCode() ^ 648) ^ 1416852997) {
                case -2069771678:
                    dVar3.f1746e.setOnClickListener(cVar2);
                    str6 = "ۙ۬ۗ۟ۖۦۘۚۜۥ۠ۚۥۢ۫ۥۙۥۜۘۖۜۢ";
                    break;
                case -1998339084:
                    str6 = "ۢۖۛۗۛۘۘۥ۫۫ۘۥۡۦۛۛۜۧ";
                    str = (String) this.f1752b.keyAt(i2);
                    break;
                case -1803807494:
                    str6 = "ۚۛۘ۟ۛۡۘۖۤۚۜۧۘۘ۫ۘۥ";
                    str2 = (String) this.f1752b.valueAt(i2);
                    break;
                case -1753298190:
                    dVar3.f1745d.setText(str5);
                    str6 = "ۘۤ۫ۡۨۘۛۘۜۘۨۡۡ۟ۖ";
                    break;
                case -1634590872:
                    str6 = "ۚ۫۫ۚ۟ۡۘۗۧ۫۟۬ۜۖۚ۠ۘۤۚ";
                    break;
                case -1614366945:
                    dVar3.f1749h = new String[strArr.length];
                    str6 = "ۥۢۦۙۘۜ۬ۦۥۘ۬ۜ۬ۘۥۡۘۗۢۦ";
                    break;
                case -1513564460:
                    str6 = "ۛۘۗۜۖۥۤۥۙۛۚ۠۬۠ۡۘ۬ۢۡۜۗۢۘۛۦ۫۠ۥ";
                    break;
                case -1451216335:
                    strArr2 = dVar3.f1748g;
                    str6 = "۠ۤ۫ۛۥۖ۠۠ۗ۫ۚۨۘۛۘۜۘ۬ۧۥۦۘۦۘۨۤۜۘۚۛۧ";
                    break;
                case -1289561350:
                    view2 = this.f1753c.inflate(this.f1754d, viewGroup, false);
                    str6 = "۬ۥۧۛۢ۬ۜۡۦۦۢۨۘۨۗۡۚۡۡۘۡۗۢ";
                    break;
                case -1172248633:
                    str6 = "۫ۤۡۘۡ۟ۢۦۡۚۛۗ۫ۜۜۘۤۙۦۘۜۗۛ";
                    break;
                case -811127802:
                    dVar3.f1749h[i5] = dep.getContactName(yo.stripJID(strArr2[i5]));
                    str6 = "ۡۢۖۥۢۤۘۛ۬۬ۦۥۖ۫ۘۘۘۘ۠ۜ۫۟ۤۖۗۧۜۘ";
                    break;
                case -612351797:
                    dVar3.f1744c.setText(str4);
                    str6 = "ۧ۫ۖۘ۫ۥۗ۟۬۟ۗۢۤ۫ۦۧۘۨۖۨۘ۬ۙۨۤۤۦ";
                    break;
                case -459326905:
                    String str7 = "ۚۥۚۡۡۢۚ۫۫ۗۦۖۦۗۡۦۤ۟";
                    while (true) {
                        switch (str7.hashCode() ^ -1024689807) {
                            case -463771680:
                                if (i5 >= strArr2.length) {
                                    str7 = "۫ۚ۟۬ۗۗۖۛۜۢۥۨۥۚۗ";
                                    break;
                                } else {
                                    str7 = "ۛۦۜۖ۟ۛۢۤۗۡۨۦۢۧۜۗۨۥ";
                                    break;
                                }
                            case -116461527:
                                str6 = "ۜۡۡۘۗۜۧۘۤۘۦۨۜۢۥۨۘۥ۟ۤۢۧ۬۫ۜۘ";
                                continue;
                            case 321506457:
                                str7 = "۠ۚۧۚۤۖۘۦۘۙۡۦۖۗۙ۬ۢۧۡ۫۟ۥۙۛۙۜۡۘ";
                                break;
                            case 2140887145:
                                str6 = "ۧۡ۬۫ۚۦ۬ۤ۫ۖۘۥۘ۫ۛۦۘۜۥۙ";
                                continue;
                        }
                    }
                    break;
                case -444910119:
                    cVar = new c(this, dVar3, 0);
                    str6 = "ۙۖۥۘۧۤۥۛ۠ۚۖۦۨۚۤ۠ۦۛۨ";
                    break;
                case -362408032:
                    return view3;
                case -151785077:
                    str6 = "۬ۖۨۙۗ۫ۧۘۙ۟۬ۘ۠ۥ۬۬ۥۧ";
                    break;
                case -31679595:
                    view3 = dVar3.f1742a;
                    str6 = "ۧۘ۬ۦۦۛ۠ۨۥ۫ۨۡۚۤۨۘۖ۬ۗ";
                    break;
                case 36309094:
                    dVar3.f1747f = str;
                    str6 = "ۖ۬ۥۘۖۙ۟ۚۗۜۘۢۘۥۘۖۨ۟ۨۢۧۙ۫۟";
                    break;
                case 55542176:
                    str6 = "ۚ۫۫ۚ۟ۡۘۗۧ۫۟۬ۜۖۚ۠ۘۤۚ";
                    i5 = i3;
                    break;
                case 62652494:
                    str4 = str3.substring(str3.indexOf("_") + 1);
                    str6 = "ۥۚۜۢۥۛ۫ۢۗۗ۟ۜۨۙۦۛۡۨۘ";
                    break;
                case 103022311:
                    str6 = "ۘۨ۠ۥۚۜۘۘ۠ۦ۠ۗۖۘۤۦ۫ۖۧۦۛۡۘۘۤۡ";
                    i5 = i4;
                    break;
                case 432193557:
                    strArr = utils.StringToStringArray(str2);
                    str6 = "ۨ۠ۥۘۥ۠ۢۜۦۦۢ۬ۛ۟۫ۙ۟ۤ۟ۜۡۡۚۖ۟";
                    break;
                case 795120478:
                    view2.setTag(dVar);
                    str6 = "ۧۨۗۥ۫ۖۖ۟ۗ۫ۥۦۗ۠ۜۘۢۦ۠";
                    break;
                case 846647592:
                    String str8 = "ۖۛۨۘۨۡۨۘۦ۠ۤ۟ۦۤ۟ۦۧۗۤۡ";
                    while (true) {
                        switch (str8.hashCode() ^ -135121135) {
                            case -1464338792:
                                str8 = "ۚۦۧۡۨۘۘ۟ۛۢۦۨۘۥۦ۟۫۠ۜ۠ۖۤۚۧ";
                                break;
                            case -586256815:
                                str6 = "ۚ۠۫ۥ۟ۖۜۖۜۘ۫ۜ۟ۡۡۘ";
                                continue;
                            case -393747628:
                                if (view != null) {
                                    str8 = "ۤ۬ۦۘۚۛ۠ۦۢۜۘۧۤۛۖۧۛ۠۬ۢ۬ۦۦۖۤۘۛۖۧۘ";
                                    break;
                                } else {
                                    str8 = "ۢ۟ۚۦۗۥۦ۬ۡۘۘۢۘۧۚ۟ۗۡۥ";
                                    break;
                                }
                            case 1936525158:
                                str6 = "۬ۡۙۗۙۚۙۜۢۚۢۥۖ۫ۙۖۛۖۨۚۡۘۖۦۢ";
                                continue;
                        }
                    }
                    break;
                case 880269763:
                    str6 = "ۘۤۨۧ۟ۖ۟ۧۡۘۤۙۖۘۘ۫۫ۧۨۜۘۘۤۦ۫ۙ۠ۛ۠ۤ";
                    break;
                case 1059393086:
                    cVar2 = new c(this, dVar3, 1);
                    str6 = "ۛۘۚۛ۬ۡۤۧۨۖۜۥۚۦۨ";
                    break;
                case 1096347694:
                    dVar3.f1743b.setImageDrawable(this.f1755e);
                    str6 = "ۙ۟ۛۘۧۘۨۦۦۘۡۦ۟ۖ۟ۖۤۜۡ";
                    break;
                case 1377745361:
                    i3 = 0;
                    str6 = "ۚۜۨۘۛۢۖۛۚۢ۟ۧۧۛۨۛۖۢۢۘۤ";
                    break;
                case 1381132470:
                    str6 = "ۨۥۚۜۨ۟ۙ۬ۚۗۚۖۥۜۘۘ";
                    break;
                case 1397027007:
                    str3 = dVar3.f1747f;
                    str6 = "ۨۜۡ۟ۢۗۛۘۙۨ۫ۖ۫ۥ۠ۨۡۙۦۗ۠ۦ۟ۥۘ";
                    break;
                case 1416550906:
                    i4 = i5 + 1;
                    str6 = "ۨ۟ۖۡۧۘ۠ۚۖۘ۠ۖۨۘۘۢۤۥۘۥۜۨۥۘۥۛۛۤۜۛ";
                    break;
                case 1564447943:
                    str6 = "ۨۥۚۜۨ۟ۙ۬ۚۗۚۖۥۜۘۘ";
                    dVar3 = dVar2;
                    break;
                case 1824497128:
                    dVar3.f1748g = strArr;
                    str6 = "ۦۢۤ۫۠ۨۧ۬ۥۧ۟۟ۦ۠ۚۧۜۧۜۛۨۘۤۖۗ";
                    break;
                case 1847805863:
                    str6 = "ۥۛۜۘ۠ۘۛۜ۟ۦۘۧۗۜۤ۬ۘ";
                    dVar2 = (d) view.getTag();
                    break;
                case 1854386271:
                    dVar = new d(view2);
                    str6 = "۬ۘۙ۠ۜۘۡۜۥۘۤ۬ۜۘ۫۫۠ۗۛۜ۟ۖۨۘۤۦۧۘ";
                    break;
                case 1974589517:
                    view3.setOnClickListener(cVar);
                    str6 = "ۧ۟ۘۘۦ۠ۚۘۥۨۘۚۙۖۗۗۥ";
                    break;
                case 2024661970:
                    str6 = "ۤۜ۫ۚۖۘۘ۟ۖۘۡۛۗۗۨ۠ۚۘ۫۟ۧ۬";
                    dVar3 = dVar;
                    break;
                case 2114510686:
                    str5 = Arrays.toString(dVar3.f1749h);
                    str6 = "ۧۖۥۛۤۡۘۗۘۘۗۧۥ۟ۦ۟ۡۗ۠ۛۨۜ۫ۡ";
                    break;
            }
        }
    }
}

package q;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import c.b;
import com.google.gson.internal.f;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.youbasha.others;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.util.ArrayList;

public final class d extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static final int f2392e = others.getID("singleviewitem", "layout");

    /* renamed from: f  reason: collision with root package name */
    public static final int f2393f = others.getID("temp_img", "drawable");

    /* renamed from: g  reason: collision with root package name */
    public static final int f2394g = others.getID("ic_action_cancel", "drawable");

    /* renamed from: a  reason: collision with root package name */
    public final Context f2395a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f2396b;

    /* renamed from: c  reason: collision with root package name */
    public final f f2397c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2398d;

    static {
        String str = "ۡۖۡۜۘۗ۟ۘ۠ۧۦۘۘۘۦۨۘۤ۠ۘۘۗ۟ۦ";
        while (true) {
            switch ((str.hashCode() ^ 624) ^ 1176652552) {
                case -1745754647:
                    str = "ۦۘۙۚۤۗ۫ۢۘۜۖ۠۟ۧ۫ۛۖۥۛۡۙ۫۟۟ۜۘۡ";
                    break;
                case -1287394539:
                    str = "ۦۢۧ۟ۖۚۤۖۥ۟ۢۧۚۥۚۢۚۛۧۚۥۘۛۚۘ";
                    break;
                case 592239598:
                    str = "ۢ۫ۘۘۦۤۘۘۗ۬ۨۘۗۙۥۘۖۦۧۜۥۦۘ";
                    break;
                case 677297475:
                    return;
            }
        }
    }

    public d(Context context, ArrayList arrayList) {
        this.f2395a = context;
        this.f2396b = arrayList;
        this.f2397c = new f(context);
        this.f2398d = new a(context);
    }

    public final void a(String str, ImageView imageView) {
        File a2 = this.f2398d.a(str);
        String str2 = "ۢۥۤۦۘۥۙۖۨۥۨۛ۠ۗ۠ۗۖۢۨ۠ۨۘۗۥ۬";
        while (true) {
            switch (str2.hashCode() ^ 197059274) {
                case -167086569:
                    if (!a2.exists()) {
                        str2 = "ۧ۬ۢ۬۠۟ۘۚۤۧۨۢۤۙ۬ۜ";
                        break;
                    } else {
                        str2 = "ۗۧۜۥۖۘۧ۠۬ۥ۟ۢ۟ۨ۟ۦۧ۠ۚۚ۠";
                        break;
                    }
                case 608944325:
                    try {
                        imageView.setImageBitmap(BitmapFactory.decodeFile(a2.getPath()));
                        return;
                    } catch (Exception e2) {
                        return;
                    }
                case 898372696:
                    Picasso.get().load(str).networkPolicy(NetworkPolicy.NO_STORE, new NetworkPolicy[0]).placeholder(f2393f).error(f2394g).into(imageView, new f(this, imageView, str, 3));
                    return;
                case 1724256941:
                    str2 = "ۗۚۥۢ۟ۥۘۨۢۘۘ۫۫ۦۘ۟ۢۤۗ۫ۘۘۦۥۥ";
                    break;
            }
        }
    }

    public final int getCount() {
        String str = "ۨۤۘۘۜ۠ۥ۫ۢۡۦۖۧۙۗۛ۬ۚۨۘۧۗۗ";
        while (true) {
            switch ((str.hashCode() ^ 59) ^ -164482080) {
                case -2031466539:
                    return this.f2396b.size();
                case 1339280165:
                    str = "ۡۘ۟۫۟ۖۘۜۢ۟۫ۦۧۗۚۨۘۚۨۧۜۜۜۘۧۧ۟";
                    break;
            }
        }
    }

    public final Object getItem(int i2) {
        String str = "ۦۨۚۥۛۤۜۜۧۘۘۛۢۜۧۛۚۚۥۘ۫ۛۧۗۡۖۥۖۤ";
        while (true) {
            switch ((str.hashCode() ^ 13) ^ -133715479) {
                case -1943388449:
                    str = "ۙۧۙۛۦۦۘۜ۠ۛۖۖۧۤۛۦۘۢ۠۠ۜۗۜۘۢۢۚۢۘۙ";
                    break;
                case 730463365:
                    return (b) this.f2396b.get(i2);
                case 1353702199:
                    str = "ۚۧۛۡۧۥۘ۬ۜۜۧۢۨۘۙۥ۟ۢۦۛۗۧۡۘ";
                    break;
            }
        }
    }

    public final long getItemId(int i2) {
        String str = "ۖ۫ۙ۟ۗۖۘ۟۫ۜۘۢۗۦۧۡۖۘ۠ۚۨۘۡۧۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 174) ^ 69948969) {
                case -2007209250:
                    str = "ۖۥۙۤۤ۟ۗۨۘۘۘۜۤۨۜ۫ۖۗۜۘ۟۟ۤۛ۬ۡ";
                    break;
                case -1273595519:
                    str = "ۘ۬ۚۛ۫ۖۘۖۗۦۥۡ۬ۜۦۧۘۘ۟ۖ۟ۢۡۘ";
                    break;
                case 849218028:
                    return (long) i2;
            }
        }
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        b bVar = null;
        View view2 = null;
        c cVar = null;
        c cVar2 = null;
        c cVar3 = null;
        String str = null;
        b bVar2 = null;
        StringBuilder sb = null;
        b bVar3 = null;
        ImageView imageView = null;
        StringBuilder sb2 = null;
        b bVar4 = null;
        ImageView imageView2 = null;
        String str2 = "ۜۢۤ۫ۜۛ۠ۦۤۘۖۜۘۡۙ۬۟ۧ۬ۚۦۗ";
        while (true) {
            switch ((str2.hashCode() ^ 336) ^ 813663702) {
                case -2081837222:
                    str2 = "ۨۗۙۧۡۨۚۨۡۖ۟ۜۨۡۘ۠ۥۥۘۗۖۨۘۢۤۨ";
                    cVar3 = cVar;
                    break;
                case -2021079566:
                    sb2.append(Deobfuscator$app$Custom.getString(-27670819995073L));
                    str2 = "ۨۙ۬ۙۤۘۛۧۛۤۡ۬ۥۘ۬ۜۙۙ۟ۨۡۘ۬ۜۨۘۢۜۢ";
                    break;
                case -1838467936:
                    imageView = cVar3.f2389d;
                    str2 = "ۚۤ۟۟ۜ۟۫ۡۤ۬ۧۡۚۛۥۦۦ";
                    break;
                case -1808913320:
                    a(bVar.f2384d, imageView2);
                    str2 = "۫ۚۜۥۡۖۘۗ۬ۛۖۢۜ۬۫ۖۘۨ۬ۖۘ۠ۘۧ";
                    break;
                case -1775787605:
                    String str3 = "ۡ۠ۡ۟ۧۜۘ۫۠ۘۥ۠ۦۘۤۗۥۧۥۘۘ۬۠ۡ";
                    while (true) {
                        switch (str3.hashCode() ^ -76600308) {
                            case -2115350744:
                                str2 = "ۙ۠ۡۘۜۖۦۘۗۤۙۛۛۜ۠ۚۨۦۡ۟ۘۛۗ";
                                continue;
                            case -1652135795:
                                str3 = "۫ۙۥۘۢۢ۠۬ۚۥۘ۠ۚۦۡۙۘ۫۬ۚۚۥۛۙۜۙ";
                                break;
                            case -532419413:
                                if (view != null) {
                                    str3 = "۟۟۫ۙۘ۬ۚۨۖۘۢۧۖۤۚۙۖۤۦۘ";
                                    break;
                                } else {
                                    str3 = "ۛۧۦۛۙ۠ۛۗۜۘۖ۟ۖۧۘۡۘۗۜۥۛ۫ۜ";
                                    break;
                                }
                            case 795998919:
                                str2 = "ۤۦۙۜۧۨۧ۟۟ۜۧۘ۬ۘۘۘۙۚۧۡۘۛۖۘۘ";
                                continue;
                        }
                    }
                    break;
                case -1641373575:
                    imageView.setOnClickListener(bVar3);
                    str2 = "ۙۖۥۥ۫ۖۨ۠۬ۘۧۢ۠ۛۗۥ۟ۜ۟ۙۦۘۚۘۜۘ۠۫ۥ";
                    break;
                case -1543984595:
                    imageView2.setOnClickListener(bVar4);
                    str2 = "ۚۗۨۢۜۨۘۗۚۘۚۦۥۘۘۢ۫";
                    break;
                case -1468209128:
                    sb.append(bVar.f2385e);
                    str2 = "ۢ۠ۧۜۖۦۜۡۢۚۛۜۢۚۨۜۦۦۘ۬ۢ۟۟۫ۖ";
                    break;
                case -1347402571:
                    sb2.append(bVar.f2381a);
                    str2 = "ۗۘۡۘۤۙۡۘۦۢ۬ۘۤۛۤ۫ۡۚ۟۬ۘۨۧۘ۫ۜۦ";
                    break;
                case -1299928446:
                    str2 = "ۗۧۜۢ۬ۖۡ۫ۖۗۚۨۡۧۖ";
                    break;
                case -1239518219:
                    sb.append(bVar.f2381a);
                    str2 = "ۚۛۥۘۥۖۖۘۙۢۗۢۛۡۘۤۗۛۢۜۦ";
                    break;
                case -837073707:
                    return cVar3.f2386a;
                case -778703152:
                    str2 = "ۖۜۜ۫ۤۚ۫ۨۥۘ۠۫ۙ۫ۤ۫ۨۜۜۘۜۙۛۗۢۦۘ";
                    break;
                case -735960918:
                    cVar = new c(view2);
                    str2 = "ۥۘۡۘۛ۫ۙۦۜۢۨۘۤۤۜۘ";
                    break;
                case -669242559:
                    sb2 = new StringBuilder();
                    str2 = "ۦۨۦۗۦ۟۟ۜۘۤۤ۫۬ۚۧۦۛۡۚۤۡۘۗۧۧۤۚ۟";
                    break;
                case -424396611:
                    sb.append(Deobfuscator$app$Custom.getString(-27645050191297L));
                    str2 = "ۘ۟ۧۡۧۙۘ۫ۡۘ۫ۖۡۧ۬ۗۥۧ۟ۢۙۙ";
                    break;
                case -327428795:
                    imageView2 = cVar3.f2390e;
                    str2 = "ۛۦۨۘۤۥ۫ۥۧ۬ۧۗۢۜۚ۠";
                    break;
                case -109351468:
                    bVar4 = new b(this, sb2.toString(), 7);
                    str2 = "۟ۢ۠۟ۙۡ۬ۙۦۦۖۜۘۢۡۜۘ۠ۦۧۢۛ۠ۦۡۚ";
                    break;
                case 3387847:
                    str2 = "ۙۚ۟۠ۢۚۥۗۜۘۥ۟ۨ۬۬۟";
                    break;
                case 49203288:
                    bVar3 = new b(this, sb.toString(), 7);
                    str2 = "ۥۧۦۢ۬ۨۘ۠ۥۚ۫ۡۛۨۜۜۙۜ۬ۗۚۡۤۨۙ";
                    break;
                case 106453542:
                    view2 = LayoutInflater.from(this.f2395a).inflate(f2392e, viewGroup, false);
                    str2 = "۠ۗۜۚۘۥۘۜۛ۫ۜۜۘۚ۬ۚۜۘۘ۠ۖ۟ۘ۟ۦۘ";
                    break;
                case 124181663:
                    str2 = "ۗۜۛۥۗۨۚ۫ۧۨ۬ۥۘۙ۟ۛ۬ۡۜ۫۟ۨۘۖۧۖۘ";
                    break;
                case 380597412:
                    a(bVar.f2383c, imageView);
                    str2 = "ۡۤۖۦ۟ۘۘۚۦۖۜۖۖۘۨ۬ۜ";
                    break;
                case 417922471:
                    cVar3.f2391f.setOnClickListener(bVar2);
                    str2 = "ۧۛ۫ۛۚۢۛۤ۟ۘۜۜۘۧۖ۟ۜ۫ۙۧۖۖۘۗۗۙ";
                    break;
                case 545346946:
                    sb2.append(Deobfuscator$app$Custom.getString(-27696589798849L));
                    str2 = "ۘۨۥۘۘۢۥۘۤ۫ۦۘۨۜ۟ۙۢۧ۫ۚۦۖۚۡ";
                    break;
                case 586139594:
                    str2 = "ۥۛۢۢ۫ۢۥۡۦۙۥۖۚۗۨۘۗ۫ۛ";
                    bVar = (b) this.f2396b.get(i2);
                    break;
                case 596946286:
                    str = bVar.f2382b;
                    str2 = "ۡۙۦۘۙۜۜۘۗۚ۟ۨ۬ۡۘ۟ۛ۠ۛۘۖۘۦ۠ۛ۬ۥ۠ۡ۟۠";
                    break;
                case 789176106:
                    sb.append(Deobfuscator$app$Custom.getString(-27619280387521L));
                    str2 = "ۛۦۚۛۘۨۘۡۥۤ۬ۘۘۘۥۨ";
                    break;
                case 1374664322:
                    str2 = "ۦۙۜۘۡۢۡ۠ۡۜۘۧۗ۟ۥۙۜۘۙۧۜۢۤۗۨۘ";
                    cVar2 = (c) view.getTag();
                    break;
                case 1426431743:
                    view2.setTag(cVar);
                    str2 = "ۗۤۡۡۗۘۘۚۛۖۘۦۖۖۨۥۖۡۦۨۗۡۚۨۦۧ";
                    break;
                case 1430355441:
                    cVar3.f2387b.setText(bVar.f2381a);
                    str2 = "ۘۛ۟ۦۜۥۛۡۜۘۨۥ۬ۥۙۡۘۦۘۥۡۛ";
                    break;
                case 1483045026:
                    sb = new StringBuilder();
                    str2 = "ۙۦۦۧ۫ۚۧ۬ۧ۟ۨۨۗۡۘۘ۫ۥۘۖۚۘۘ";
                    break;
                case 1537357934:
                    str2 = "ۗۧۜۢ۬ۖۡ۫ۖۗۚۨۡۧۖ";
                    cVar3 = cVar2;
                    break;
                case 1659650436:
                    sb2.append(bVar.f2385e);
                    str2 = "ۥۢۗۦۘۖۨ۬ۚ۟ۜ۫ۤۜۦۘۤۤۨۘۖۢۢۡۡۡۘ۬۟ۨۘ";
                    break;
                case 1842723681:
                    cVar3.f2388c.setText(str);
                    str2 = "ۘۥۘۡۖۢ۬ۥۗۛۚۜۨۗۡۘ۬۟ۥ";
                    break;
                case 1933351021:
                    bVar2 = new b(this, bVar, 6);
                    str2 = "۟۫ۘۘ۠۬ۙۜۚۨۘۢۢۖ۠ۥۖۘۨۨۥۘ۠۬۠ۡۥۘ";
                    break;
                case 1993173769:
                    str2 = "ۧۨۨۘ۫۟ۗۛۜۧۥۤۢ۫ۜۡ";
                    break;
            }
        }
    }
}

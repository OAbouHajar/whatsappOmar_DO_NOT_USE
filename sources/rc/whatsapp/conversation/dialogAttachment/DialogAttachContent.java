package rc.whatsapp.conversation.dialogAttachment;

import X.C57012pj;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import b0.a;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class DialogAttachContent extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public Conversation f2454a;

    /* renamed from: b  reason: collision with root package name */
    public C57012pj f2455b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2456c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f2457d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f2458e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f2459f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f2460g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f2461h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f2462i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f2463j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f2464k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f2465l;

    /* renamed from: m  reason: collision with root package name */
    public ImageView f2466m;

    /* renamed from: n  reason: collision with root package name */
    public ImageView f2467n;

    /* renamed from: o  reason: collision with root package name */
    public ImageView f2468o;

    /* renamed from: p  reason: collision with root package name */
    public ImageView f2469p;

    /* renamed from: q  reason: collision with root package name */
    public ImageView f2470q;

    /* renamed from: r  reason: collision with root package name */
    public LinearLayout f2471r;

    /* renamed from: s  reason: collision with root package name */
    public LinearLayout f2472s;

    /* renamed from: t  reason: collision with root package name */
    public LinearLayout f2473t;

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f2474u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f2475v;

    /* renamed from: w  reason: collision with root package name */
    public LinearLayout f2476w;

    /* renamed from: x  reason: collision with root package name */
    public LinearLayout f2477x;

    public DialogAttachContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2454a = (Conversation) context;
    }

    public void onFinishInflate() {
        String str = "ۖۖۥۚۧۦۘۚۚۥۘۦۘۦۘۥۚۡۘۢۘۥۘۤۖۨۘۗۧۖۘۛۢۗ";
        while (true) {
            switch ((str.hashCode() ^ 246) ^ -547194579) {
                case -1925951220:
                    this.f2459f.setTextColor(ColorStore.getPrimaryColorAttachText());
                    str = "ۖۡۙۢ۠ۙۨۡۜۘۙۡۦۘ۫ۜۘۜۦۦ";
                    break;
                case -1907456528:
                    this.f2458e.setTextColor(ColorStore.getPrimaryColorAttachText());
                    str = "ۖ۠ۜ۟ۧۢۧۢ۫ۤ۫ۧۙۨۦۘۛۨۡۘۤۥۖۘۦۚۚ۫ۜ";
                    break;
                case -1891812091:
                    this.f2472s = (LinearLayout) findViewById(yo.getID("a_gallery", "id"));
                    str = "۟ۡۢۘ۫ۦ۫ۧۖۘۙۦ۟ۨۜۨۙۦۘۖۘۘۘۦۡۖۘۢۤۜۘ";
                    break;
                case -1842451479:
                    this.f2475v.setOnClickListener(new a(this, 3));
                    str = "ۨۗۥۤ۫ۘۢۤۗۡۥۦۢ۟ۤۤ۬ۥۘ";
                    break;
                case -1785923196:
                    this.f2461h.setTextColor(ColorStore.getPrimaryColorAttachText());
                    str = "۠ۦۦۘۜۙۦۘۡۚۤ۠۬ۨۨۘۖۘ۬ۘۘ۠۫۟";
                    break;
                case -1717537189:
                    this.f2467n = (ImageView) findViewById(yo.getID("i_contact", "id"));
                    str = "ۥۤۢۛۤۘۘۤۖۢ۟ۥۦۤۡۨۦۛۖۦۜۡ۫۬";
                    break;
                case -1714583381:
                    this.f2473t.setBackground(others.alphaDrawable("selector_bg", Color.parseColor("#FF049C53"), PorterDuff.Mode.SRC_ATOP, 18));
                    str = "ۜۗۤۢۚۗۘۖۙۦ۫ۨۘۧۢۙۡۘۢۤۗ۫ۧۛۥۘۧۗ۟";
                    break;
                case -1714254623:
                    this.f2471r.setOnClickListener(new a(this, 4));
                    str = "ۦۦۡۘۤ۫۬ۢۜ۬ۖۨۡۢۛ۬ۢۧ۫";
                    break;
                case -1630160347:
                    this.f2462i.setText(yo.getString("attach_camera"));
                    str = "ۘۖۨ۟ۦۢۨۘۤۥۧۤۙۧۜۘ۠ۧۡۘ";
                    break;
                case -1622760904:
                    this.f2460g = (TextView) findViewById(yo.getID("t_contact", "id"));
                    str = "ۢۙ۟ۧۛۜۘۧۖۡۢ۫ۘۘ۟۬۠ۧۨۛۦۤۥۘ۟۟ۨ";
                    break;
                case -1616029247:
                    this.f2468o = (ImageView) findViewById(yo.getID("i_audio", "id"));
                    str = "ۥۧۨۢۧۛۗۥۧۧۤۧۙۤۥۛۛۜۘ";
                    break;
                case -1482597667:
                    this.f2468o.setColorFilter(Color.parseColor("#FFF68D0D"));
                    str = "ۡۥۡۧۜۚۙۡۖۧۥۡۛۛۚ۠۫ۦ۬ۚ۟۟ۛۖ";
                    break;
                case -1293639938:
                    this.f2466m.setColorFilter(Color.parseColor("#FF049C53"));
                    str = "ۚۙۨۖ۫ۗۚۖۜۘۢ۫۠ۘۖ۫ۗۥۨۘۡۧ۠ۖۢۥ";
                    break;
                case -1243302747:
                    this.f2465l = (ImageView) findViewById(yo.getID("i_gallery", "id"));
                    str = "ۛۗۖۜۘۖۜۦۘۘۢۘ۬ۤۥۜۨ۠ۚ۠ۙۦ";
                    break;
                case -1237301110:
                    this.f2460g.setTextColor(ColorStore.getPrimaryColorAttachText());
                    str = "۟ۘۘۜۤۥۗۙ۬۠ۥۦۦۛ۠۟۠ۚ۫ۡۘ";
                    break;
                case -1199779462:
                    this.f2465l.setColorFilter(Color.parseColor("#FFBE59CF"));
                    str = "ۚۨ۫ۗۧۡۘۤۥ۟ۡۨ۟ۚۛۦۡۨۖۜ۠ۤۥۨ۠";
                    break;
                case -1156571823:
                    this.f2462i = (TextView) findViewById(yo.getID("t_room", "id"));
                    str = "ۤ۟۬۬ۛۖۘۜۙۦۘۡۡۚۛۦۘ۠ۢۡۘ";
                    break;
                case -1151193522:
                    this.f2464k = (ImageView) findViewById(yo.getID("i_document", "id"));
                    str = "ۜۙۙۛ۠۠ۘۤۤۨۚۡۗۚۛ۠ۜ۫ۘۨۜۘۨ۟ۚ";
                    break;
                case -1015792244:
                    super.onFinishInflate();
                    str = "ۘ۬ۧۚۘ۬ۜ۬ۜۜ۫۬ۦۛ۟";
                    break;
                case -764668696:
                    this.f2475v.setBackground(others.alphaDrawable("selector_bg", Color.parseColor("#FFF68D0D"), PorterDuff.Mode.SRC_ATOP, 18));
                    str = "ۥ۠۠ۧ۫ۢۡ۟۫۬ۗۨۢ۫ۥۘۡۥ۬ۜۘۖۙ۫";
                    break;
                case -732983212:
                    this.f2459f = (TextView) findViewById(yo.getID("t_location", "id"));
                    str = "ۡۜ۟ۘۖۗۙۙۨۗۙ۫ۜ۫ۗۖۦۘۗۡۥ۫ۗۦۘ";
                    break;
                case -645581946:
                    this.f2463j = (TextView) findViewById(yo.getID("t_poll", "id"));
                    str = "۠ۥۨۘ۠ۗۥۘۙۧۗ۬ۜۡۘۙۜۦ۫۫۟ۧۥ۫ۥۧ۟ۥۡۗ";
                    break;
                case -620932532:
                    this.f2474u.setOnClickListener(new a(this, 2));
                    str = "ۙ۟ۤ۫۫ۦۙ۟ۜۥۢۡۘۜۤۢ۠ۢۘ۬۟ۡۘۛۗۜ۟ۧۦۘ";
                    break;
                case -509645985:
                    this.f2467n.setColorFilter(Color.parseColor("#FF0EAAF4"));
                    str = "ۦ۠۠ۛۥۡۜۘ۟ۡۖۚ۟ۥۘۥۙۥۘ";
                    break;
                case -486835013:
                    this.f2472s.setOnClickListener(new a(this, 0));
                    str = "ۨۨۘۘۢۦۦۘ۬ۨ۬ۥ۫ۜۚ۟ۡۥۥۥۗۖۘ۫ۧۜۘۧۗۘۘ";
                    break;
                case -360205375:
                    this.f2466m = (ImageView) findViewById(yo.getID("i_location", "id"));
                    str = "ۧۤۜۡ۟ۛ۬ۙۡ۫۟ۥۦۨ۠ۦۡۛۥ۟۟ۦۗۙ";
                    break;
                case -354113907:
                    this.f2477x.setBackground(others.alphaDrawable("selector_bg", Color.parseColor("#FF03A598"), PorterDuff.Mode.SRC_ATOP, 18));
                    str = "۫ۧ۠ۚ۬ۨۥۖ۬ۘۧۚۜ۠ۨۥۡۧ";
                    break;
                case -341278897:
                    this.f2472s.setBackground(others.alphaDrawable("selector_bg", Color.parseColor("#FFBE59CF"), PorterDuff.Mode.SRC_ATOP, 18));
                    str = "۫ۨۚۙۢۥۘۢ۫ۖۘۨۥۘۘۧ۫ۦۨۙۧۨۨ۟ۨۧۙ۟ۦۧ";
                    break;
                case -263503698:
                    this.f2473t = (LinearLayout) findViewById(yo.getID("a_location", "id"));
                    str = "ۘۨۙۗۜۦۨ۟ۡۖۥ۫ۗۛۦۘۡۙۡۤۡۘ۫ۦۥۘ";
                    break;
                case -112557895:
                    this.f2464k.setColorFilter(Color.parseColor("#FF6167BD"));
                    str = "ۘ۫۬۟ۢ۟ۙ۫ۚۚ۬ۗ۠۫ۘۘۚۤۙۡۡۡۢۧ";
                    break;
                case 52820754:
                    this.f2477x.setOnClickListener(new a(this, 6));
                    str = "ۧۡۗۢۢ۟ۡۗ۠ۨۛۥۘ۟ۘۗۘۥۘۢۨۘۘ۬ۘۘ";
                    break;
                case 88126486:
                    this.f2461h = (TextView) findViewById(yo.getID("t_audio", "id"));
                    str = "ۡۥۡ۠ۛۥۘۚۚۨۥۥۘۖ۫ۖۢۖۘۘۤ۫ۜ";
                    break;
                case 190159553:
                    this.f2475v = (LinearLayout) findViewById(yo.getID("a_audio", "id"));
                    str = "۟۫ۖۘۚۛۢۧۗۥۚۢۜۘ۟ۖۙۚۨۧۤۘۘۦ۟۟";
                    break;
                case 211952358:
                    this.f2476w = (LinearLayout) findViewById(yo.getID("a_room", "id"));
                    str = "ۡ۬ۖ۬ۨ۬ۖۨۘۘۦ۫ۘۘۨۢۗ۟ۢ۬";
                    break;
                case 215291044:
                    this.f2471r = (LinearLayout) findViewById(yo.getID("a_document", "id"));
                    str = "۟۟ۙ۟ۛۜۨۥۘۘۢ۟ۥۘۚۤۘۛۙۜ۬ۥۙۗۗۥۘ۠ۜۦۘ";
                    break;
                case 305105866:
                    this.f2470q = (ImageView) findViewById(yo.getID("i_poll", "id"));
                    str = "ۢۧۦۙۛۤۙ۫ۡۧ۬ۚ۠ۗۜۧ۬ۙۖ۟ۧۘۗۧ";
                    break;
                case 399666899:
                    this.f2477x = (LinearLayout) findViewById(yo.getID("a_poll", "id"));
                    str = "ۛۥۥۘۦۦ۠ۥۥۚۚۦۤۛ۬۠ۧۛۚۨۖۡۘ۫۠";
                    break;
                case 410687442:
                    return;
                case 422873225:
                    this.f2458e = (TextView) findViewById(yo.getID("t_gallery", "id"));
                    str = "ۨۖ۟ۡۖۘۘۢۗۘۙۘ۠ۜ۠۬ۜۡ۫ۡۤۛۘۖ۟ۗۤۧ";
                    break;
                case 444334674:
                    this.f2471r.setBackground(others.alphaDrawable("selector_bg", Color.parseColor("#FF6167BD"), PorterDuff.Mode.SRC_ATOP, 18));
                    str = "ۤۧۥۢۨۙۢۡ۠ۨۥۢ۬ۖۚ";
                    break;
                case 522705244:
                    this.f2469p.setColorFilter(Color.parseColor("#FF3F78EB"));
                    str = "۬ۥۦۙ۟ۨۙۡۚۦۥۘۘۛ۠ۢۧۜۜۚۛ۫ۛۨۧۘ";
                    break;
                case 564065420:
                    this.f2474u.setBackground(others.alphaDrawable("selector_bg", Color.parseColor("#FF0EAAF4"), PorterDuff.Mode.SRC_ATOP, 18));
                    str = "ۗ۫ۥ۠ۛۘۘۡۤۜ۬ۢۨۘۜۨۦۦ۫۟";
                    break;
                case 601454249:
                    this.f2462i.setTextColor(ColorStore.getPrimaryColorAttachText());
                    str = "۟ۨۘۘۛۡۡۘۜۛۥۘ۬ۥۢۛۗۛۡ۫ۛۚۤۨ";
                    break;
                case 769317255:
                    this.f2473t.setOnClickListener(new a(this, 1));
                    str = "ۥۜ۟ۨۜۙۚۗۚۦۙۘۘۗ۠ۖ۠ۘۦۘۖۢۨۘ۟ۥ۠۠ۨۙ";
                    break;
                case 770173585:
                    this.f2469p = (ImageView) findViewById(yo.getID("i_room", "id"));
                    str = "۬ۧۜۘ۟ۧۖۘۜ۬ۦۛۚۦۦۦۖۡ۟ۨۘۖ۬ۙ";
                    break;
                case 907144729:
                    this.f2470q.setColorFilter(Color.parseColor("#FF03A598"));
                    str = "ۨۖۜۚۜ۠ۥۖۘۖۘۨۚ۠۠ۘ۫ۥ۟۬";
                    break;
                case 909708265:
                    this.f2463j.setTextColor(ColorStore.getPrimaryColorAttachText());
                    str = "ۧۧۖۛ۬ۖۥۡۦۘۜۘۡۛۦۢ۫ۜۡ";
                    break;
                case 1074855168:
                    this.f2457d = (TextView) findViewById(yo.getID("t_document", "id"));
                    str = "ۨۧۦۧۖۘۘۥ۬۟ۘ۟۠۠ۨۨۖ۟ۜ";
                    break;
                case 1101383003:
                    this.f2474u = (LinearLayout) findViewById(yo.getID("a_contact", "id"));
                    str = "ۡۤۥۘۦ۫ۜۨ۠۬ۥۗۥۖۖۜۘۖۗۗ";
                    break;
                case 1245416256:
                    this.f2476w.setBackground(others.alphaDrawable("selector_bg", Color.parseColor("#FF3F78EB"), PorterDuff.Mode.SRC_ATOP, 18));
                    str = "ۜۚۦۘ۬ۥ۟۫ۘۨۘۘۡۧۨۜۘۢۥۡۛۜۜ";
                    break;
                case 1323652407:
                    str = "۫ۘۡۘۥۜۘۚۡۤۢۤۘۤۨۤۤۜۤۖ۫";
                    break;
                case 1590452672:
                    this.f2457d.setTextColor(ColorStore.getPrimaryColorAttachText());
                    str = "۠۠ۨۚۧ۬ۗۛ۫ۘۧ۬ۗۚۧۢۨۥۧ۟ۦۘ";
                    break;
                case 1944378276:
                    this.f2476w.setOnClickListener(new a(this, 5));
                    str = "ۢ۬ۨۘۛۨۡۘۡۜ۟ۤۖۡۚۗۧۗۧۚ۫ۡۖۘۖ۠ۢۨۧۥۘ";
                    break;
                case 2080888604:
                    this.f2469p.setImageDrawable(yo.getDrawableByName("ic_camera"));
                    str = "ۡۜۘۘۨۦۧۗۜۡۘۧۜۙۜۡۘۘ";
                    break;
            }
        }
    }

    public void setBottomSheetDialog(C57012pj r8) {
        String str = "۠ۛۡۘ۫۟ۜۘۘۤ۫ۧ۠۟ۢۘ۬ۥۤۦۤۖ۬۫ۦۙ";
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            switch ((str.hashCode() ^ 771) ^ -1492634592) {
                case -2097435467:
                    return;
                case -1993359669:
                    String str2 = "۠ۗ۬۠ۡۨۘ۟۫ۥۘۗۢ۬ۘۗۘۘۘۥۡۗۢۘۥ۫ۗ";
                    while (true) {
                        switch (str2.hashCode() ^ 1150193220) {
                            case -1869937968:
                                str = "ۘۤۘۘۜۙۦ۟۫ۥۘۢۤ۟ۦ۫ۡ۟ۚۖۘ۬۬ۡ";
                                continue;
                            case -1605817319:
                                if (r8 == null) {
                                    str2 = "ۖۚۨۘۤۨۙ۟۠ۖۘۤۖ۬ۥۧۤ۬ۛ۟۠ۖۡۘۥۘۥۙ۫۬";
                                    break;
                                } else {
                                    str2 = "۟ۦۦۢۘۜۘۧۚۥۘ۠ۥ۠ۘۛۛۦۦۜۗۧۖۦۘۘۢۦۥ";
                                    break;
                                }
                            case -1453492259:
                                str = "۫ۨۡۘۘۚۨۜ۟ۥۘۜۙۧۡۛۦ۟ۢۦ";
                                continue;
                            case 2040516701:
                                str2 = "ۚ۬ۜۘۢۥۦۘ۟ۧۖ۟ۦۘۘۚ۟ۢ۠ۛۚ";
                                break;
                        }
                    }
                    break;
                case -1849330243:
                    str = "ۤۖۖۘ۠ۥۧۚۙ۫ۙۧۖۘۡۖ۫";
                    break;
                case -1647603270:
                    str = "ۚۜۜۘۖۛۜۢۢ۟ۗ۟ۥۘۢۧۖۘۜۘۜۘۚ۫ۘۘ۫ۤۜۘ";
                    break;
                case -914773525:
                    str = "ۛۖۙۙۡۘۛۨ۟ۘۖۥۧۛۤ۟ۜۜۘۖۦۗ";
                    break;
                case -739520726:
                    str = "ۢۘۦۘۨۢۡۘۥۨ۫ۜۨۖۛ۠ۛ";
                    break;
                case -673901307:
                    str = "ۢۘۦۘۨۢۡۘۥۨ۫ۜۨۖۛ۠ۛ";
                    z2 = false;
                    break;
                case -204851710:
                    str = "۟ۦۨۘ۟ۢۘۛۖۘۛۨۧۘۨۘۖ";
                    z2 = z3;
                    break;
                case -43666490:
                    this.f2455b = r8;
                    str = "ۘۢۘ۠۠ۜۜۧ۟ۧۜۖۘۢۧ۬ۛۨۜۘۡۖ";
                    break;
                case 444103146:
                    z3 = true;
                    str = "ۜ۟ۖۘۥۖ۟ۨۢۛ۟ۜۘ۫ۙۘۘۛ۫ۘۘ";
                    break;
                case 537760504:
                    this.f2456c = z2;
                    str = "ۛ۫ۗۛۡ۫ۤۗۧۖ۠ۡۘ۫ۖۘ";
                    break;
            }
        }
    }
}

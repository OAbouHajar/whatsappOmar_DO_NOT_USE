package com.obwhatsapp.yo;

import X.C005602k;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import c.b;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.TextBubbleLeft;
import java.util.ArrayList;

public class ChatGenSingle extends Activity {

    /* renamed from: i  reason: collision with root package name */
    public static final int f475i = 0;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f476a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f477b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f478c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f479d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f480e;

    /* renamed from: f  reason: collision with root package name */
    public String f481f;

    /* renamed from: g  reason: collision with root package name */
    public String f482g;

    /* renamed from: h  reason: collision with root package name */
    public Toolbar f483h;

    public class SingleUserMessagesAdapter extends RecyclerView.Adapter<f> {

        /* renamed from: c  reason: collision with root package name */
        public static final int f484c = 0;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f485a;

        /* renamed from: b  reason: collision with root package name */
        public final ChatGenSingle f486b;

        public SingleUserMessagesAdapter(ChatGenSingle chatGenSingle, ArrayList arrayList) {
            this.f486b = chatGenSingle;
            this.f485a = arrayList;
        }

        public int A0C() {
            String str = "ۥۛۘۙۤۧۛۘۦۘ۬ۗۛۘۜۜۘۘۙۖۘۦۢ۬۟ۡۨۘ";
            while (true) {
                switch ((str.hashCode() ^ 829) ^ 468620575) {
                    case -1875586278:
                        str = "ۜۥۖۗۙ۟ۖۘۜۥ۫ۦۛۥۘۖۦۘ";
                        break;
                    case -1273945838:
                        return this.f485a.size();
                }
            }
        }

        public /* bridge */ /* synthetic */ void ANf(@NonNull C005602k r5, int i2) {
            String str = "ۡۗۛۧ۟ۜ۫ۙۜۗۥۘۚۨ۟";
            while (true) {
                switch ((str.hashCode() ^ 169) ^ -628282855) {
                    case -2070183093:
                        str = "ۖۢ۬ۘۨۛۧۜۧ۫۟ۜۢۚۡۧ۫ۦۦۡۥۚۡۢۦ۟ۜۘ";
                        break;
                    case -1102628813:
                        ANf((f) r5, i2);
                        str = "ۧ۬ۘۥۢۜ۟ۘۘۛۨۧۨۜۧۘ۟ۘۙ۫۠ۦۙۘۛ";
                        break;
                    case -216429680:
                        str = "ۘۢ۟ۘۥۨۘۨۡۙۧۡۜ۟ۦۜۢۗۜ۬ۜۛ۬ۡۛۜۗ۟";
                        break;
                    case 1012443910:
                        str = "ۗۚۛۡ۫ۗۨۛۨۥ۫۫۫۫ۜۡۖۥۘ۠ۙۡۘۤۙۡۘ";
                        break;
                    case 2103552687:
                        return;
                }
            }
        }

        public void ANf(@NonNull f fVar, int i2) {
            f0 f0Var = (f0) this.f485a.get(i2);
            fVar.f758a.setDate(utils.getDateTimeFromMillis(f0Var.f762c));
            String str = f0Var.f761b;
            TextBubbleLeft textBubbleLeft = fVar.f758a;
            textBubbleLeft.setMessageText(str);
            fVar.f759b.setOnClickListener(new b(this, f0Var, 1));
            String str2 = "۠ۖۖۥۦۢۘۚۨۦۦۦۖ۫ۛۗۛۙ";
            while (true) {
                try {
                    switch (str2.hashCode() ^ -746080115) {
                        case -1750973456:
                            textBubbleLeft.showDelIcon();
                            return;
                        case -1259461859:
                            if (!Conversation.getDeletedMsgList().contains(f0Var.f763d)) {
                                str2 = "ۙ۠ۦۘۦ۬ۖۘۧ۬ۨۘ۬ۡۥۜۘۡۘۡۖۤۤۚۧ۫ۨ۠ۖۘ";
                                break;
                            } else {
                                str2 = "ۗۜۡۘۧۚۥ۠ۘ۟ۖۨۘۜ۠۟ۜۤ";
                                break;
                            }
                        case -1109338493:
                            str2 = "۫ۧۜۗۙۢۜ۟ۘۘۢۦۨۘۧ۟ۚۘ۟۫ۗ۠۟";
                            break;
                        case 1876645947:
                            return;
                    }
                } catch (Exception e2) {
                    return;
                }
            }
        }

        @NonNull
        public f APF(@NonNull ViewGroup viewGroup, int i2) {
            String str = "ۤۘۥۛۡۨ۠ۖۜۥۢۤۖ۬ۡ";
            while (true) {
                switch ((str.hashCode() ^ 860) ^ -1382126236) {
                    case -1348867257:
                        str = "ۤ۠ۛۖۚۛۨ۫۠ۘۛۛۗۥ";
                        break;
                    case -806317735:
                        str = "ۢۛۨۘۤ۬ۨۚۖۡۘۖۥ۟۟ۚۗۢ۠ۨۘۢۡۜۘ";
                        break;
                    case 1077724679:
                        return new f(LayoutInflater.from(viewGroup.getContext()).inflate(yo.getID(Deobfuscator$app$Custom.getString(-230273940929L), Deobfuscator$app$Custom.getString(-307583352257L)), viewGroup, false));
                    case 1156252705:
                        str = "ۧۘۚۧۤۜۘۛۦ۫۟ۚ۟ۤۡۜۘ۟ۖۧۘ۫ۚۤ۬ۘۢۢۡۦ";
                        break;
                }
            }
        }
    }

    public void attachBaseContext(Context context) {
        String str = "ۥۖۤۙۚ۫ۢۚۤۘۤ۠۠۟ۜۥ۟ۧۜ۬۫";
        while (true) {
            switch ((str.hashCode() ^ 712) ^ 1562610433) {
                case 134024901:
                    str = "ۚ۠ۘۥ۠ۡۘۤ۠۠۠۟ۡۘۢۘۡ۫۫ۘۘۚۤ۟ۧۤۡۘ";
                    break;
                case 775170323:
                    return;
                case 1517021146:
                    super.attachBaseContext(yo.getCtx());
                    str = "ۘۦ۫ۧ۫ۧ۟۬ۘۗۧ۬۟ۘۡۘۙۧۡ۠ۛۥۘ";
                    break;
                case 1873373341:
                    str = "ۢۦۨۘۦ۠ۘۘۖۤۡۜ۟۫۬ۘۢ";
                    break;
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        RecyclerView recyclerView = null;
        ImageView imageView = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        int i6 = 0;
        Drawable drawable = null;
        String str2 = "ۥۖۡۘ۫ۤۚ۟ۜۘۘۜۘۥ۠ۖ۟ۚۨۘۜ۟۫۠۫ۨ۬۠۠";
        while (true) {
            switch ((str2.hashCode() ^ 552) ^ 987987383) {
                case -2065505040:
                    str = Deobfuscator$app$Custom.getString(-1162281844161L);
                    str2 = "۬ۙۦۙۘۗ۟ۙ۫ۧۦ۫ۖ۠ۜ۫ۗۗۗ۬ۡۛ۫ۖۘ";
                    break;
                case -1933728125:
                    str2 = "۠ۗۥۘۚۤ۟ۜۨ۫ۛۛۘۘۘۡۚۨ۠ۡۘۛۨ۬ۘ۬ۥ";
                    break;
                case -1861318706:
                    String str3 = "۠۟ۤ۟ۘۧۢۜۖۢۚۚۖۢ۟ۧۛۧۢۡۜۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 1154684738) {
                            case -1072826520:
                                if (drawable == null) {
                                    str3 = "ۤۥۨۘۦ۟ۜۖۙۘۘۙۨۜۘۤۦ";
                                    break;
                                } else {
                                    str3 = "۬ۛ۟ۛۨۥۘۖ۫ۡۘۘۦۚ۟ۧۦۚ۬ۥۘۥۗۥ۠ۘۜۘ";
                                    break;
                                }
                            case 1017158980:
                                str2 = "ۖ۬ۖۧۚۚۤۤ۠ۜۘۛۚۤۡۢۖۧۢ";
                                continue;
                            case 1100972630:
                                str3 = "۠ۛ۬ۨۧۤۨۛۥۘۧۨۤۙ۫ۡ";
                                break;
                            case 1661717536:
                                str2 = "ۧۤۥۗ۬ۙۘۨۢۡۛۘۙۜۛۜۢ";
                                continue;
                        }
                    }
                    break;
                case -1833378051:
                    this.f478c = imageView;
                    str2 = "۟ۡۢۤۦۤۗۥۚ۟ۦۦۦ۫ۨۘۘۖۜۘ۠ۡۗ";
                    break;
                case -1818516772:
                    str2 = "ۨۦۡۘ۫۠ۖۜۖ۫ۗ۠ۙۛۥۗۤۖۘ۠ۛۨۘ۟ۤ۬ۡۨۧ";
                    break;
                case -1659531768:
                    this.f483h.setBackground(new ColorDrawable(i6));
                    str2 = "۫ۢ۫ۘ۫ۘ۠ۢ۬ۜ۟ۢۧۦۨۗ۠ۥۗۚۦۘۢۦۧ۟ۛۥ";
                    break;
                case -1535541402:
                    i2 = yo.getResColor(Deobfuscator$app$Custom.getString(-921763675585L));
                    str2 = "ۨۥۛۙۘ۠ۚۘۘۢۖۤۥ۬ۚ۟ۢۘۘۦ۠ۥۘ";
                    break;
                case -1428752728:
                    setContentView(yo.getID(Deobfuscator$app$Custom.getString(-337648123329L), Deobfuscator$app$Custom.getString(-372007861697L)));
                    str2 = "ۤۙۦۘۡ۫ۙۥۧۨۖۥۘۜۘۢۛۜۘ۟۫۬ۨۢۨۘۗۚۘ";
                    break;
                case -1376028889:
                    this.f479d = (ImageView) findViewById(yo.getID(Deobfuscator$app$Custom.getString(-848749231553L), Deobfuscator$app$Custom.getString(-908878773697L)));
                    str2 = "ۡۥۛۖۡۙ۫ۘ۟۫۬۟ۗۙۦۘۨۖۨۛۥۧۘ۠۟ۜۘ";
                    break;
                case -1375247808:
                    this.f477b.setHasFixedSize(true);
                    str2 = "ۛۜۚۛۦ۠ۜۥۖۘۖ۫ۘۘۡۥۧۘۘۧ۟۠ۜۨۧۡۧ";
                    break;
                case -1369763669:
                    drawable = this.f483h.getNavigationIcon();
                    str2 = "ۥۚۘۘ۫ۡۡۤۡۥۧۡۘۤ۬ۚۤۥۛ۬ۖۡۘۜۗۖۘ۟ۧ۫";
                    break;
                case -1225430222:
                    super.onCreate(bundle);
                    str2 = "ۖۖۧۡۧۖۘۘۛۘۘۤۘۧۖۜۤۖۘۡۘۖۨۖۢۗۚ";
                    break;
                case -1057500448:
                    this.f482g = getIntent().getStringExtra(Deobfuscator$app$Custom.getString(-784324722113L));
                    str2 = "۟ۜ۠ۢۜ۟ۖۗۜ۬۬۟۠ۜۥۘۛ۬ۨۛۜۖۘۘۧۚۚۧۘۘ";
                    break;
                case -1006960924:
                    i6 = others.getColor(str, ColorStore.getPrimaryColor());
                    str2 = "۟ۙۘۘۚۦۧ۬۬ۥ۫ۛۜۚۤۡۤۨۡۘۘۙۢ";
                    break;
                case -625399263:
                    recyclerView.setLayoutManager(new StaggeredGridLayoutManager(this, (AttributeSet) null, 1, 1));
                    str2 = "ۛۨۜۡۙ۟ۨۜ۠ۚۤۥۘۘۡۧۢۛۡۛۦۨۡ";
                    break;
                case -591941886:
                    this.f483h.setNavigationOnClickListener(new c(this, 1));
                    str2 = "۫۫ۨۘۘ۬ۜۡۗۡ۬۠۟ۙۨۛ";
                    break;
                case -453524666:
                    this.f479d.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                    str2 = "ۨۧۚۖ۫ۚۢ۫ۨۨۛۘۦۡۖ۬ۢۥ";
                    break;
                case -326689604:
                    this.f483h.setTitleTextColor(yo.mainpagercolor());
                    str2 = "ۨۥۨۘۤۥۖ۟ۗ۫ۨ۫ۥۘۘۘ۠ۜۤۖ";
                    break;
                case -278585897:
                    str2 = "ۙۧۢ۟۠ۘۗۘ۟ۛۙۦۙۨۤۘۙ۠۠ۘ۬ۥۡۜۘۘۚۤ";
                    break;
                case -264874196:
                    String str4 = "۠ۙ۟ۨ۟ۗۥۛۖۖ۬ۨۚۜۡۖۘۘۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 722406654) {
                            case -1156849621:
                                if (!yo.isNightModeActive()) {
                                    str4 = "ۧۡۢۗۜۡۢۨ۫ۥۘۡۘ۫ۘۚۜۙۜۥۧۜۘ";
                                    break;
                                } else {
                                    str4 = "ۙۤۤۢ۬ۧۧ۟ۤۙ۫ۦ۫ۘۥۚۡۡۡۙۥۗۘۙ";
                                    break;
                                }
                            case -1033286283:
                                str2 = "ۢۧ۬ۡۨۘۜۜۧۨۜۘۘ۬۠ۙۛۨۧۘۡۢۖۛۙۡۘ";
                                continue;
                            case -944775033:
                                str4 = "۠ۖۦۘ۟ۦۘۧۦۗۘ۠۫۠۠ۨۖۧۜۚۗۜۛ۬ۜ۫ۗۦۘ";
                                break;
                            case 1050581663:
                                str2 = "۠ۨۡۘۜۤۚۢۖۡۘۡۙ۠۬ۜۤۜۜۘۛۡ۬ۘۙۥۘۡۙۦۘ";
                                continue;
                        }
                    }
                    break;
                case -43431029:
                    this.f483h.setTitle((CharSequence) yo.getString(Deobfuscator$app$Custom.getString(-1042022759873L), new String[]{dep.getContactName(yo.stripJID(this.f482g))}));
                    str2 = "ۖ۬ۦ۠ۛ۟ۧۡۧۢۛۦۙۖۛۙۗۡۘۤۛۙ";
                    break;
                case -25331690:
                    str2 = "۫ۤۘۘۘۢۘۘۗۖۥۨۚۧۚۧۢۡ۟ۨۘۢۗۢ";
                    i5 = i3;
                    break;
                case 113350197:
                    new e(this).execute(new Void[0]);
                    str2 = "ۦۖۡۘۧۦ۠۬۟ۡۘۥۦ۟ۙۛۗۢۖۦۘۗۤۖ۫ۜۦۥۡ";
                    break;
                case 221779913:
                    i3 = -3355444;
                    str2 = "۬ۢۦۘ۟ۢۘۘ۠ۖ۟۬ۨۙۦۨۥ۫ۖۘ";
                    break;
                case 233728795:
                    others.setStatusNavBar(this);
                    str2 = "ۥ۫ۖۘۜۦ۬ۗۢۧۦۜۜۡۛ۠ۨۧۘ۬ۤۨۖۙۧۙ۠ۥ";
                    break;
                case 391486070:
                    return;
                case 548355242:
                    str2 = "۫ۢ۫ۘ۫ۘ۠ۢ۬ۜ۟ۢۧۦۨۗ۠ۥۗۚۦۘۢۦۧ۟ۛۥ";
                    break;
                case 640290412:
                    str2 = "ۖ۠ۜۘۨ۟ۥۜ۬ۘۘۜۚۥۘۜۥۜۘ۟ۘۦۜۘۦۘۤ۠ۧۤۨ";
                    imageView = (ImageView) findViewById(yo.getID(Deobfuscator$app$Custom.getString(-822979427777L), Deobfuscator$app$Custom.getString(-835864329665L)));
                    break;
                case 890452564:
                    String str5 = "۠ۦ۠ۥۘۥۘۘۦۛۙۗ۟ۘۘۤۚۜ۠ۢۡۜۨ۟ۦ";
                    while (true) {
                        switch (str5.hashCode() ^ -1136217537) {
                            case -1955193758:
                                str2 = "ۡۨ۫ۦۖ۠ۧۥۜ۠ۦ۬ۨۚۡ";
                                continue;
                            case -1379274765:
                                str2 = "ۤۧ۟ۦۨۘ۬ۧ۫ۨ۬ۦۥۜۜۘ";
                                continue;
                            case -802871060:
                                str5 = "ۤۢۢ۬۬ۥۘۗۚۚ۠ۛۦۗ۟ۜۘۚۜۤۤ۟ۚ";
                                break;
                            case 1690897727:
                                if (!shp.getIsGradiet(str)) {
                                    str5 = "ۙ۟۠ۗۢ۟۬ۙ۠۠۬ۨۖۤۜۘۙۙۨۘ";
                                    break;
                                } else {
                                    str5 = "ۧ۬ۜۘ۟ۡۘۘۨ۠ۖۥ۫۫ۧۤۜۤ۠ۨ۠ۜ";
                                    break;
                                }
                        }
                    }
                    break;
                case 964070581:
                    this.f478c.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                    str2 = "۬ۢۖۘۢۤۡۚ۟۫ۦۜۘۨ۫ۡۘۚۚۖ";
                    break;
                case 1043563337:
                    this.f483h.setNavigationIcon(drawable);
                    str2 = "۫ۙۗۤۧ۫ۖ۠ۜۘۨۙۘۜۙۥۖۦ۟ۘۦۡ";
                    break;
                case 1261595333:
                    str2 = "۠ۗۥۘۚۤ۟ۜۨ۫ۛۛۘۘۘۡۚۨ۠ۡۘۛۨ۬ۘ۬ۥ";
                    i5 = i4;
                    break;
                case 1302153260:
                    str2 = "ۦۛۘ۟ۥۥۢۤۥۧۖ۫ۢۦۨ۠ۘۧۘۧۨ۠";
                    recyclerView = (RecyclerView) findViewById(yo.getID(Deobfuscator$app$Custom.getString(-634000866753L), Deobfuscator$app$Custom.getString(-694130408897L)));
                    break;
                case 1304774112:
                    this.f483h.setBackground(shp.getGradientDrawable(str));
                    str2 = "ۗۦۛۥۤۖۘۥۨۖۛۘۥ۫۬ۥۘۖۤۥۘۜۜۜۘۜۜۖۘ";
                    break;
                case 1432456991:
                    this.f480e = (TextView) findViewById(yo.getID(Deobfuscator$app$Custom.getString(-707015310785L), Deobfuscator$app$Custom.getString(-732785114561L)));
                    str2 = "ۘۜۜۛۥ۟ۖۛۘۙۢۥۘ۫ۘ۠";
                    break;
                case 1494144440:
                    this.f477b = recyclerView;
                    str2 = "ۧۦۨۘۨۘۖۖۢۦۨ۠ۥۘۚ۬ۛۦۘۧۘ";
                    break;
                case 1692226143:
                    drawable.setColorFilter(yo.mainpagercolor(), PorterDuff.Mode.SRC_ATOP);
                    str2 = "ۧۤۥۗ۬ۙۘۨۢۡۛۘۙۜۛۜۢ";
                    break;
                case 1777373857:
                    this.f483h.setNavigationIcon(others.coloredDrawable(Deobfuscator$app$Custom.getString(-986188185025L), i5, PorterDuff.Mode.SRC_ATOP));
                    str2 = "ۜۢۚ۬ۨۗۦ۫۠۫ۛۢۙۖۘ";
                    break;
                case 1897260766:
                    this.f481f = getIntent().getStringExtra(Deobfuscator$app$Custom.getString(-745670016449L));
                    str2 = "ۨۗۡۘۛۙۡ۟ۛۙۤۗۧۙۢۨۛۥ۬ۛۚۡۤۚ۠";
                    break;
                case 2084670695:
                    i4 = -12303292;
                    str2 = "۟ۚۡۘ۠ۘۥۛۘ۫ۚ۟ۛۗۖۖ۠ۦۘۗۥۦ";
                    break;
                case 2120190792:
                    ((ViewGroup) findViewById(yo.getID(Deobfuscator$app$Custom.getString(-462202174913L), Deobfuscator$app$Custom.getString(-505151847873L)))).setBackgroundResource(yo.getID(Deobfuscator$app$Custom.getString(-518036749761L), Deobfuscator$app$Custom.getString(-595346161089L)));
                    str2 = "ۨۜۦۛۗۜۘ۫ۚۦۘۢۡۖۘۛۜۘۙۦ۫";
                    break;
                case 2121277549:
                    imageView.setOnClickListener(new c(this, 0));
                    str2 = "ۥۦۘ۟ۢۨۘ۟ۤۥۦۡۥ۬ۙۜۘۢۦۡۘۢۛۨۘۧ۫ۥۘ";
                    break;
                case 2128081336:
                    this.f483h = (Toolbar) findViewById(yo.getID(Deobfuscator$app$Custom.getString(-402072632769L), Deobfuscator$app$Custom.getString(-449317273025L)));
                    str2 = "ۜ۬ۡۘ۬ۗۗۦۦۦۘۚۗ۠۠ۥۨ";
                    break;
            }
        }
    }
}

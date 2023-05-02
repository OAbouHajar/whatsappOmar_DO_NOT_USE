package com.obwhatsapp.yo;

import a.a;
import android.os.AsyncTask;
import com.google.gson.internal.bind.g;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.youbasha.app;
import com.obwhatsapp.youbasha.task.utils;
import java.io.File;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;

public final class z extends AsyncTask {

    /* renamed from: j  reason: collision with root package name */
    public static final int f915j = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f916a;

    /* renamed from: b  reason: collision with root package name */
    public int f917b;

    /* renamed from: c  reason: collision with root package name */
    public int f918c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f919d;

    /* renamed from: e  reason: collision with root package name */
    public String f920e;

    /* renamed from: f  reason: collision with root package name */
    public String f921f;

    /* renamed from: g  reason: collision with root package name */
    public String f922g;

    /* renamed from: h  reason: collision with root package name */
    public final OkHttpClient f923h = new OkHttpClient.Builder().addInterceptor(new app.AddHeaderInterceptor()).build();

    /* renamed from: i  reason: collision with root package name */
    public String f924i;

    public static void a(z zVar) {
        boolean z2;
        zVar.getClass();
        shp.setIntPriv(Deobfuscator$app$Custom.getString(-3829456534977L), zVar.f918c);
        shp.setStringPriv(zVar.f924i + Deobfuscator$app$Custom.getString(-3876701175233L), zVar.f920e);
        shp.setStringPriv(zVar.f924i + Deobfuscator$app$Custom.getString(-3902470979009L), zVar.f921f);
        shp.setStringPriv(zVar.f924i + Deobfuscator$app$Custom.getString(-3923945815489L), zVar.f922g);
        String str = zVar.f921f;
        String substring = str.substring(str.lastIndexOf(Deobfuscator$app$Custom.getString(-3962600521153L)) + 1);
        File file = new File(yo.getCtx().getFilesDir().getAbsolutePath() + File.separator + Deobfuscator$app$Custom.getString(-3971190455745L));
        String str2 = "ۜۙ۟۠ۙۘۘۧۧۥۛۧۢۨۚۥ۫ۨۘۛ۬ۖۘ";
        while (true) {
            switch (str2.hashCode() ^ 1535370213) {
                case -645067358:
                    if (file.exists()) {
                        str2 = "ۘ۬۬ۜۤۡۘۚۦۨۘۛۙۜۘۗۧۖۘۜۛۢ";
                        break;
                    } else {
                        str2 = "ۚۤۘۦۧۘۘۚۚۨۦۦ۟ۙۙۨۘۦۗ۫ۙۦۗ۠ۨۘ";
                        continue;
                    }
                case 217521327:
                    str2 = "ۚۥۘۗۨۧۖۜ۬ۖ۠ۙۨۖۦ۟۫ۜۙۘۡۘۢۗۡۘ";
                    continue;
                case 690049097:
                    file.mkdir();
                    try {
                        File file2 = new File(file.getAbsolutePath(), Deobfuscator$app$Custom.getString(-4357737512385L));
                        String str3 = "ۗ۟ۥۖۢۦۘۗۡۦۜۥۡ۬ۗۡۘۢۗۘ۠ۖۥۘ";
                        while (true) {
                            switch (str3.hashCode() ^ -1636609558) {
                                case -742453890:
                                    str3 = "ۧ۬ۤ۠۫ۡۘ۬ۚۘۘۚ۬ۛۖۥۧ";
                                    continue;
                                case -65984379:
                                    break;
                                case 1338730777:
                                    if (!file2.exists()) {
                                        str3 = "ۗۗۚۖۧۚۡۙۨۘۥۡۖ۟ۚۦۘۡۧۚۘۦۧ۟ۖۖۘۧ۫ۦ";
                                        break;
                                    } else {
                                        str3 = "ۙۦۨۖ۟ۜۘۤ۠ۖۘۘ۬ۚۥۚۦۘ";
                                        continue;
                                    }
                                case 2068315348:
                                    file2.createNewFile();
                                    break;
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        break;
                    }
                    break;
                case 2015430593:
                    break;
            }
        }
        File file3 = new File(file.getAbsolutePath(), substring);
        try {
            Response execute = zVar.f923h.newCall(new Request.Builder().url(zVar.f921f).build()).execute();
            BufferedSink buffer = Okio.buffer(Okio.sink(file3));
            buffer.writeAll(execute.body().source());
            buffer.close();
            z2 = true;
        } catch (Exception e3) {
            z2 = false;
        }
        String str4 = "۬ۘۗۡ۠۠ۙۘۨۘ۠ۗۧۦۜ۠ۚ۟ۚ۬ۙۥۘ۫ۨۖ";
        while (true) {
            switch (str4.hashCode() ^ 48189559) {
                case -518456039:
                    return;
                case -412561356:
                    if (!z2) {
                        str4 = "۬ۙۨۘ۠۠ۗۢۙۧ۠۠۬ۜۨۦۘۡۥۘۙۚۜۘۤۡۚۥۢ۫";
                        break;
                    } else {
                        str4 = "ۘۡۧۘۥۢۛۜ۠ۚۗۢۖۘۛۤۜۘ۬ۥۧ";
                        break;
                    }
                case -3129379:
                    str4 = "ۘۧۡۘۡۥۖۘ۫ۛۙۡۗۙ۬ۨۦۘۖ۟ۛۡۧ۠";
                    break;
                case 485216427:
                    shp.setStringPriv(zVar.f924i + Deobfuscator$app$Custom.getString(-4031319997889L), file3.getAbsolutePath());
                    shp.f875b.putLong(zVar.f924i + Deobfuscator$app$Custom.getString(-4052794834369L), System.currentTimeMillis()).commit();
                    return;
            }
        }
    }

    public static long b(int i2) {
        String str = "ۦۤۦ۬ۡ۫ۖ۬ۘۘۖ۬۠ۢۜۘ۟ۡۥ";
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        while (true) {
            switch ((str.hashCode() ^ 214) ^ 342796568) {
                case -1816783628:
                    str = "ۥۖۡۘ۫ۧۚۦۨۘ۫ۚ۠ۨۗۚ۟ۢۡۘ۠۬ۨ۠ۤۡۘ";
                    sb2 = new StringBuilder();
                    break;
                case -1194019803:
                    str = "ۛۦۡ۟۬ۜۘ۫ۡۘۘۘ۫ۧۥۨ۟۠ۤ۬ۤ۬ۥۗۡۖ";
                    break;
                case -59292979:
                    sb2.append(Deobfuscator$app$Custom.getString(-3782211894721L));
                    str = "ۥۚۚۛۛۦۖۛۘۘۨ۫ۡۘۤ۠ۥۢۢۗۤۨ۫۬۟ۨۘۢۡۘۘ";
                    break;
                case 325994794:
                    sb.append(Deobfuscator$app$Custom.getString(-3803686731201L));
                    str = "ۛۥۜۥۧ۫ۛۡۥۦۚۢۘۜۛۥۚۛۧۨۦ";
                    break;
                case 352394517:
                    sb2.append(i2);
                    str = "ۖ۟ۜۘۨۨۦۘۨۤۖۘۛۙۥۡ۟ۡۘۡ۬ۗۖۘۦۘ";
                    break;
                case 1670464887:
                    sb = a.g(sb2.toString());
                    str = "ۨۜۚ۠۟۫۫۬ۥۙۛۨۢۦۘۘ۫ۚۧۢۥۛۗ۠ۤۧۜ";
                    break;
                case 2014789694:
                    return shp.getLongPriv(sb.toString(), 0);
            }
        }
    }

    public static void c(int i2) {
        long j2 = 0;
        String str = "ۤ۠۬ۚۥۡۘ۬ۦۦۘۙۚۗۤۜۖ";
        String str2 = null;
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        while (true) {
            switch ((str.hashCode() ^ 950) ^ -128966648) {
                case -1619724232:
                    shp.f875b.putLong(str2, j2).commit();
                    str = "۬ۛۜ۠ۢۚۨۡۖ۟۬ۗۨۦ۬۠ۜۚۦۢۥ";
                    break;
                case -803774823:
                    str2 = sb.toString();
                    str = "ۦۢۡۢۡۜ۠ۛۧ۠ۚۨۧۗۡۜۖۘ۬ۗۛۨ۟";
                    break;
                case -532491447:
                    str = "۫ۥۗۘۖۜۡۡۧۗ۬ۡۘ۟ۖۘ۫ۘۥ۫۫ۡۘ";
                    sb = a.g(sb2.toString());
                    break;
                case 12421727:
                    return;
                case 174056158:
                    sb.append(Deobfuscator$app$Custom.getString(-3756442090945L));
                    str = "ۘ۬۬ۛ۠۟ۜۥۖۘۦۖۥۜۛۨۛ۫ۨۘ۠ۥۘ۬ۡۖۜۡۥۘ";
                    break;
                case 328764216:
                    str = "۫۬ۨۡۗۤۗۘۜۨۙۦۘ۫ۙۖۘۜ۫۟ۘۘۥ";
                    break;
                case 718770718:
                    j2 = System.currentTimeMillis();
                    str = "ۖۚۧۜۦۨۘۙۧۜۘۗۛۛۧۚۛۢۜ۫۟۬";
                    break;
                case 978355658:
                    sb2.append(Deobfuscator$app$Custom.getString(-3734967254465L));
                    str = "۠۫ۗۜۢۦۜۗۦۘۜۨۡۘۘۢۛۦۗۜۘۙۡۚۛۖ";
                    break;
                case 1892315042:
                    str = "ۢ۬ۘۘ۠ۜۘۦۤۧۧۚۖۘۗۢ۫ۧۨۨۢۛ۠";
                    sb2 = new StringBuilder();
                    break;
                case 2093316205:
                    sb2.append(i2);
                    str = "۠۟۬ۛۙ۠ۘ۫ۧۧۦۘۨۘۡ";
                    break;
            }
        }
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            String string = Deobfuscator$app$Custom.getString(-4082859605441L);
            this.f923h.newCall(new Request.Builder().url(utils.dbsf(string, 2)).addHeader(string, yo.mpack).build()).enqueue(new g(this));
            return null;
        } catch (Exception e2) {
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = "۟ۢۗ۫ۤۖۘ۟ۙۡۘۗ۫ۖۙۦۜ";
        while (true) {
            switch ((str.hashCode() ^ 518) ^ -1490067229) {
                case -871948545:
                    Void voidR = (Void) obj;
                    str = "۟ۜۘۧۗۥۢۚۧۧۦۜۘۧۥۘۘۢ۬ۙ";
                    break;
                case 657783336:
                    str = "۠ۘۢۥۥۢۡۖۨۘۨۜۗۖۧۜۜۡۥ";
                    break;
                case 930967102:
                    str = "۫ۖۧۛۡۥۙۖۧۘ۠ۚ۬ۚۚۖۘۤۢۛ";
                    break;
                case 1743535140:
                    return;
            }
        }
    }
}

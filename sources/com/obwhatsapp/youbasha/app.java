package com.obwhatsapp.youbasha;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import com.cat.ereza.customactivityoncrash.CustomActivityOnCrash;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.yo.YoFontListPreference;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.activity.RestartAppActivity;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import java.io.File;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public abstract class app extends Application {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f936a;

    /* renamed from: b  reason: collision with root package name */
    public static ConnectivityManager f937b;

    /* renamed from: c  reason: collision with root package name */
    public static OkHttpClient f938c;

    public final class AddHeaderInterceptor implements Interceptor {
        public Response intercept(Interceptor.Chain chain) {
            String str = "ۧ۫ۖ۬ۖۘۘۦۖۢ۠ۗۦۛۨۢۛۜۘۤۡۦ۟ۨۖ";
            while (true) {
                switch ((str.hashCode() ^ 831) ^ 432930694) {
                    case -2085055276:
                        str = "ۢۛۥۜۙۗۢۜۦۘۥۥۜۘۧۥۜۘ۠ۛۨۘۘ۟۬ۡۦ";
                        break;
                    case -1934000186:
                        str = "ۜ۟۟ۜ۬ۦ۟ۤۦۧۗ۬۠ۡۧۨۗۘۢۜۘۢۢۨۘ۟ۦۨۘ";
                        break;
                    case -544877322:
                        return chain.proceed(chain.request().newBuilder().addHeader(Deobfuscator$app$Custom.getString(-17143855152577L), Deobfuscator$app$Custom.getString(-17191099792833L)).build());
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        r0 = "۬ۢۨ۟ۧۦۤۜ۫ۜۛ۟ۖ۬ۡۡۢۧۛۡۘ۟ۨۗ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void checkInternet() {
        /*
            r5 = 0
            r2 = 0
            java.lang.String r0 = "۫ۢ۟۟ۧۥۘۗۧۤۨۘۖۜۜ۫ۢۘۡۘۧۡۥۗۖۨ"
            r1 = r2
            r3 = r2
            r4 = r5
            r6 = r5
        L_0x0008:
            int r5 = r0.hashCode()
            r7 = 16
            r8 = 1286431974(0x4cad64e6, float:9.0908464E7)
            r5 = r5 ^ r7
            r5 = r5 ^ r8
            switch(r5) {
                case -2032302718: goto L_0x007f;
                case -1776661658: goto L_0x0087;
                case -1723545964: goto L_0x008b;
                case -1306533416: goto L_0x009a;
                case -160638998: goto L_0x001d;
                case -3126319: goto L_0x005f;
                case 220537533: goto L_0x0090;
                case 262956493: goto L_0x009e;
                case 1014717815: goto L_0x0017;
                case 1345163116: goto L_0x0043;
                case 1521294971: goto L_0x003c;
                case 1952396398: goto L_0x009e;
                case 2055593517: goto L_0x0083;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0008
        L_0x0017:
            android.net.ConnectivityManager r5 = f937b
            java.lang.String r0 = "۟ۤ۬۟ۨۧۚۨۘۥۗۖۥۥۢۚۧۜۘۛۡۜ"
            r6 = r5
            goto L_0x0008
        L_0x001d:
            r5 = 1427227581(0x5511c3bd, float:1.00168672E13)
            java.lang.String r0 = "ۙۙۖۘۢۚ۠ۤۚۨۘ۫ۙۙۜۨۖ۟ۤۡۘۚۡۙۡۛ۬"
        L_0x0022:
            int r7 = r0.hashCode()
            r7 = r7 ^ r5
            switch(r7) {
                case -567799334: goto L_0x0031;
                case 772692015: goto L_0x002b;
                case 1666615381: goto L_0x0036;
                case 1953046886: goto L_0x0039;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0022
        L_0x002b:
            java.lang.String r0 = "ۚۘۛ۫۟ۨۨۥۡۘۜ۟۬۬ۚۧۧۙ"
            goto L_0x0008
        L_0x002e:
            java.lang.String r0 = "ۥۖۛۧ۬ۥۨۥ۫۠ۚۡۖۨۨۘۡۘۡۡۥۤ۟ۛۦۖۥ"
            goto L_0x0022
        L_0x0031:
            if (r6 != 0) goto L_0x002e
            java.lang.String r0 = "ۨ۠ۖۗۗۖۘۚۧ۫ۛۥۨۘ۫ۛ"
            goto L_0x0022
        L_0x0036:
            java.lang.String r0 = "ۢۦ۟ۚ۬ۗۖۖ۠ۢۛ۠۬ۜۜ"
            goto L_0x0022
        L_0x0039:
            java.lang.String r0 = "۬ۖۨۘۧ۠ۨۜۢۘۘۗۗۖۘ۟ۗۖۢ۬ۜۘۧ۫ۨۘ"
            goto L_0x0008
        L_0x003c:
            android.net.NetworkInfo r4 = r6.getActiveNetworkInfo()
            java.lang.String r0 = "ۖۙ۟ۨۜۚۖۨۧۘۨۢ۫ۤ۫ۧۛۦۗۦۢۦ"
            goto L_0x0008
        L_0x0043:
            r5 = -1197183332(0xffffffffb8a46e9c, float:-7.840732E-5)
            java.lang.String r0 = "۬۬ۤۢۗۗ۫ۥ۟۠۠ۦۘ۫ۦۤۖۨ۬ۤۚۧ۫ۦۖ"
        L_0x0048:
            int r7 = r0.hashCode()
            r7 = r7 ^ r5
            switch(r7) {
                case -1997832472: goto L_0x0057;
                case 701411666: goto L_0x0096;
                case 1299293393: goto L_0x0051;
                case 1952763510: goto L_0x005c;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x0048
        L_0x0051:
            java.lang.String r0 = "ۛۦۜۘۡۜ۬ۗۙۡۘۙۨۧۨۧ۬ۢۧۤ"
            goto L_0x0008
        L_0x0054:
            java.lang.String r0 = "ۡ۫ۘ۬۫ۡۘ۠۠ۚۜۧۗۖۦ۫۟۠ۘۘۤۚۦۘ"
            goto L_0x0048
        L_0x0057:
            if (r4 == 0) goto L_0x0054
            java.lang.String r0 = "۟۟ۦ۠ۥ۫ۧ۠ۚۙۥۡۡ۫۫ۢۡۘۡۘۖۘ۟ۡۥۘۨۥۥۘ"
            goto L_0x0048
        L_0x005c:
            java.lang.String r0 = "ۢۦ۫ۢۗۚۡ۟۟ۖ۫۫ۦ۬ۗ۬ۘ۬۟۠ۢۗۜۘۨ۫ۤ"
            goto L_0x0048
        L_0x005f:
            r5 = 1263944050(0x4b564172, float:1.4041458E7)
            java.lang.String r0 = "ۦ۫ۦۘۚۡۘۗۨ۠ۨ۫ۥ۠۫ۥۘۨ۠ۡۘ"
        L_0x0064:
            int r7 = r0.hashCode()
            r7 = r7 ^ r5
            switch(r7) {
                case -553967851: goto L_0x006d;
                case -86235456: goto L_0x007c;
                case 1008673128: goto L_0x0073;
                case 1820735880: goto L_0x0096;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0064
        L_0x006d:
            java.lang.String r0 = "ۦۖۜۘۥۥۜۘ۫۫ۜۢۤ۠ۦ۫ۘۘۜ۟ۤ"
            goto L_0x0064
        L_0x0070:
            java.lang.String r0 = "ۚۧۤۡۘۙۦۥ۫ۖۙۜۘۗۘۤۢ۬۟۟ۥۧ۠ۘۦۦۡ"
            goto L_0x0064
        L_0x0073:
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "ۜۨۡۥۢۤۥۘ۬ۦۛ۬ۖۨۘ۟ۙۚۤۙۥۦۥۖۘ"
            goto L_0x0064
        L_0x007c:
            java.lang.String r0 = "ۧ۬۬ۦۘۡۘۘۜۧۡۜۨۘ۠ۜۥۘۗ۟ۧ۠ۢۢۤ۟۫ۙ۫ۘۘ"
            goto L_0x0008
        L_0x007f:
            r3 = 1
            java.lang.String r0 = "ۙ۟ۖۘۜۖۡۘۨۥۢۦۨۦۘۢۥۘۦۡ۫"
            goto L_0x0008
        L_0x0083:
            java.lang.String r0 = "ۖۦۨۘۜ۫ۤۙ۬ۙۗۤۤۚۦۘۘۡ۫ۦۘ"
            r1 = r3
            goto L_0x0008
        L_0x0087:
            java.lang.String r0 = "ۚ۬ۖۚۨ۠۫۫ۨۛۤۨۨۜۖۚۦۦۤۧۖۘ"
            goto L_0x0008
        L_0x008b:
            java.lang.String r0 = "۟۫ۖۘۙۦ۬۠ۦۧۧۖۜۦۥۡ۠ۜ۬"
            r1 = r2
            goto L_0x0008
        L_0x0090:
            f936a = r1
            java.lang.String r0 = "ۖۗۛۨۖۢۙ۫ۦۧۖۨۖۨۥۘۙۖۡۘ"
            goto L_0x0008
        L_0x0096:
            java.lang.String r0 = "۬ۢۨ۟ۧۦۤۜ۫ۜۛ۟ۖ۬ۡۡۢۧۛۡۘ۟ۨۗ"
            goto L_0x0008
        L_0x009a:
            java.lang.String r0 = "۟۫ۖۘۙۦ۬۠ۦۧۧۖۜۦۥۡ۠ۜ۬"
            goto L_0x0008
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.app.checkInternet():void");
    }

    public static boolean checkInternetNow() {
        String str = "ۨۘ۫۠ۤۥ۫ۡۧۘۛۘۘۖۛۤۡۧۢ۬ۘۘ۟۫ۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 900) ^ -900914710) {
                case -1724765171:
                    return isInternetActive();
                case -908651250:
                    checkInternet();
                    str = "۬ۛۙۧۧۡۘ۬ۖۚۖۖۤۨۜۨۘۦ۠ۖ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.OkHttpClient getOkHttpClient() {
        /*
            java.lang.String r0 = "۫ۤ۫۬ۢۦۗ۫ۦۢ۫ۧ۬۟ۡۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 339(0x153, float:4.75E-43)
            r3 = 1337623983(0x4fba85af, float:6.2586465E9)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -146295960: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            okhttp3.OkHttpClient r0 = f938c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.app.getOkHttpClient():okhttp3.OkHttpClient");
    }

    public static void initApp(Context context) {
        String str = "ۗۙۖۘۚۖۜۥ۠۟ۧۦۛ۫ۨۙ۟ۨۥۘ";
        Cache cache = null;
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        String str2 = null;
        StringBuilder sb3 = null;
        while (true) {
            switch ((str.hashCode() ^ 443) ^ -110395184) {
                case -2088447828:
                    sb2 = new StringBuilder();
                    str = "ۖۤ۫ۧۦۥۘ۟ۦۗۥۡۛ۬۠ۦۤۗۥۘۙۜۖۘ۬ۤۡۘ۫ۨ";
                    break;
                case -1866580982:
                    str2 = File.separator;
                    str = "ۥ۫ۘۛۥۖۘۤۛۤ۟ۛۤۗ۟ۥۧ۬ۖ۟ۦۘۗۦ۟ۨۙۥۘ";
                    break;
                case -1636343378:
                    sb3 = new StringBuilder();
                    str = "ۡۥۥۚۦۖۡۧۘۜۥۘۘۘۛۢ";
                    break;
                case -1250796856:
                    sb3.append(Deobfuscator$app$Custom.getString(-17285589073345L));
                    str = "ۚۡۥۘ۫۫ۥۢۚۚۥۜۛۙ۫ۥ";
                    break;
                case -1084300314:
                    sb3.append(context.getFilesDir().getAbsolutePath());
                    str = "ۗۤۗۛۦۧۘ۠۫۬ۧۧۜۘ۫ۚۜۘ۠ۥۘ۠ۖۜۙۥۘۘ";
                    break;
                case -1052139795:
                    CustomActivityOnCrash.install(context);
                    str = "ۚۦۧۡ۠۬ۛ۠ۦۘۤ۟۬ۙۥۚ۟۠ۘۖۥۘۘ";
                    break;
                case -433310769:
                    str = "ۙۘ۫ۡۗ۠ۥۛۚۖۛ۫۬ۖۜۘ";
                    break;
                case -423796795:
                    sb2.append(str2);
                    str = "۬۬ۜۢۛۢۗۡۚۤۤۦۘۗ۟ۨ";
                    break;
                case -415937479:
                    checkInternet();
                    str = "ۚ۟۟۟ۨۡۘۚۥۙۛ۟ۛۗۤۘ۬ۦۡۘۡ۬ۧ";
                    break;
                case -179753623:
                    Picasso.setSingletonInstance(new Picasso.Builder(yo.getCtx()).downloader(new OkHttp3Downloader(f938c)).build());
                    str = "ۡۖۥۚۙۘۘ۬ۤۜۦۡۡۧ۟ۘۘ";
                    break;
                case -47921397:
                    CustomActivityOnCrash.setErrorActivityClass(RestartAppActivity.class);
                    str = "۟ۨۙۘۙۘۘ۟ۛۨۨ۠۠۬ۢۙۨ۫ۘۖۘۘۦ۠ۡ";
                    break;
                case -32746656:
                    yo.datafolder = sb2.toString().replace(Deobfuscator$app$Custom.getString(-17332833713601L), Deobfuscator$app$Custom.getString(-17362898484673L));
                    str = "ۧۚۨۤۙۜۘ۠ۡۦۘ۫ۢۜۘۘۡۨۘ۫ۡۨۘ۟ۘ۫";
                    break;
                case 73603522:
                    str = "ۦ۬ۜ۟ۨ۬ۜۘۛ۫ۘۘۚۦ۫ۛۗۤۤۡۢۚۡۤۢۖۘ";
                    break;
                case 200826195:
                    sb.append(str2);
                    str = "ۛۨۖۘۥۜۤۜۡۢ۟ۦۜۖ۠ۘۘ۟ۢۖۚ۟ۦۖۦۘ";
                    break;
                case 277696737:
                    f937b = (ConnectivityManager) context.getSystemService(Deobfuscator$app$Custom.getString(-17367193451969L));
                    str = "ۢۦۘۗۡۜۘۥۜۥ۬ۤۡۘۧۖ۫ۥۨۘۗۚۦۢ۬ۥۘۗۥ";
                    break;
                case 373435613:
                    cache = new Cache(new File(sb.toString()), (long) 10485760);
                    str = "ۗ۫۫۫ۥۨۧۘۛ۬۫۬ۛۡۘۘ۠۫۠";
                    break;
                case 465056928:
                    sb2.append(yo.getCtx().getFilesDir().getAbsolutePath());
                    str = "ۜۖ۫۟ۢ۠ۥ۫ۜۘ۬ۜ۬ۦۨۜۥ۟ۥۢۡ۬";
                    break;
                case 589591473:
                    sb.append(Deobfuscator$app$Custom.getString(-17423028026817L));
                    str = "ۜۖ۟ۡۛۨۗ۫ۨۘۜ۫ۙۜۛۨۥۘۡۘ";
                    break;
                case 1507611998:
                    shp.init((Context) null);
                    str = "ۦ۬ۜ۟ۨ۬ۜۘۛ۫ۘۘۚۦ۫ۛۗۤۤۡۢۚۡۤۢۖۘ";
                    break;
                case 1523976414:
                    f938c = new OkHttpClient.Builder().addInterceptor(new AddHeaderInterceptor()).cache(cache).build();
                    str = "۫۫ۦۘۢۙۦۘۦۦۛ۫ۧۘ۬ۢۚۢۦۖۘۘۙۥۘ";
                    break;
                case 1548699067:
                    sb3.append(str2);
                    str = "۬۟ۥۘۥۧۗۤۡۖۚۢۖۘۛ۠ۙۨۨۦۘ۠ۡۖ";
                    break;
                case 1581383984:
                    sb.append(yo.getCtx().getCacheDir());
                    str = "ۛۢۖ۠ۧۦۘ۫۫ۥۨۨۙۡۘ۫";
                    break;
                case 1646773787:
                    CustomActivityOnCrash.setRestartActivityClass(HomeActivity.class);
                    str = "۠ۖ۬ۦۖۨۘۘ۟ۛۡۦۘۡۤۜۘۗ۫ۡۘ";
                    break;
                case 1797733608:
                    return;
                case 1831388876:
                    sb = new StringBuilder();
                    str = "ۥۛۛۘۖۨۘۦۦۜۘۨۥۘۧۡۡ";
                    break;
                case 1945646423:
                    YoFontListPreference.astm = context.getAssets();
                    str = "ۨۦۙۧۘۡۘ۬ۜۧۘۧۘۨۘۢۧ۟ۧۙۦۘۦۢۨۘ";
                    break;
                case 2090155213:
                    yo.emojifolder = sb3.toString();
                    str = "۠ۧۛۢۤ۫ۚ۬۟۫ۧۨۧۚۥۘۤ۟ۜ";
                    break;
                case 2095432500:
                    String str3 = "ۗۡۛۡۗۛۢۜۘۖۛۛۥ۠ۖۘۗۤ۟۠ۘۧۘ۫ۨ۫";
                    while (true) {
                        switch (str3.hashCode() ^ -407920172) {
                            case -915914552:
                                if (utils.vs() != 107) {
                                    str3 = "ۥۖۘۦ۫ۦۜۦ۫ۚۤۘ۟ۨ۟";
                                    break;
                                } else {
                                    str3 = "ۨ۫ۡۜۚ۫ۨۡۤۦۚۙۨۜۘ";
                                    break;
                                }
                            case -598128363:
                                str = "۬ۛۘ۠ۨۧۜۢ۫ۗۢۦۘۨ۬ۙ";
                                continue;
                            case 175375055:
                                str3 = "۫ۥ۬ۛۛۦۘ۟ۙۢۘۗۢ۠ۚۚۖ۠۫۠ۚۛ";
                                break;
                            case 873699707:
                                str = "ۙۗۨۖۥۜۦۤۧۘۤۜۘۥۢۙۜۘۗۜۡ۠ۡۖۘ";
                                continue;
                        }
                    }
                    break;
                case 2097750114:
                    shp.init(context);
                    str = "ۦۦۘۘ۟ۗۜۘۜۙۛ۫ۖۥۘۤۦۦۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isInternetActive() {
        /*
            java.lang.String r0 = "ۖۥ۟ۤۘۦ۬ۗ۟ۧۦۧۘۧۛۡۘۜۦ۠ۛۤۨۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 619(0x26b, float:8.67E-43)
            r3 = -1801802081(0xffffffff949aae9f, float:-1.5618902E-26)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1522726826: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            boolean r0 = f936a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.app.isInternetActive():boolean");
    }
}

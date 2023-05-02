package l;

import okhttp3.Interceptor;
import okhttp3.Response;

public final class c implements Interceptor {
    public final Response intercept(Interceptor.Chain chain) {
        String str = "ۤۜۘۥۦۘۘۡۘۘۗۨۜۤۙۙۥۚۖۖۡۜ";
        while (true) {
            switch ((str.hashCode() ^ 249) ^ -1188237504) {
                case -1513388960:
                    str = "ۚۥۖۘۜۜۨۘ۫ۡۜۘۤۧۗۤ۠ۥۘۘۗۗۤۡۚ";
                    break;
                case 315772320:
                    return chain.proceed(chain.request().newBuilder().addHeader("User-Agent", "ru.yandex.translate/21.2.1.21271738").build());
                case 1021057328:
                    str = "ۥ۬ۨۧۦ۬۠۫ۛۚۧۨۖۛۦۖۗۖۙۤۘ۟ۖۘۘۛ۟ۖ";
                    break;
            }
        }
    }
}

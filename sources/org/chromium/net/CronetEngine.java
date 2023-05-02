package org.chromium.net;

import X.AnonymousClass000;
import X.C13680ns;
import android.content.Context;
import android.util.Log;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

public abstract class CronetEngine {
    public static final String TAG = "CronetEngine";

    public class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        public final ICronetEngineBuilder mBuilderDelegate;

        public abstract class LibraryLoader {
            public abstract void loadLibrary(String str);
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            this.mBuilderDelegate = iCronetEngineBuilder;
        }

        public static int compareVersions(String str, String str2) {
            int length;
            if (str == null || str2 == null) {
                throw AnonymousClass000.A0T("The input values cannot be null");
            }
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            int i2 = 0;
            while (true) {
                length = split.length;
                if (i2 < length && i2 < split2.length) {
                    try {
                        int parseInt = Integer.parseInt(split[i2]);
                        int parseInt2 = Integer.parseInt(split2[i2]);
                        if (parseInt != parseInt2) {
                            return Integer.signum(parseInt - parseInt2);
                        }
                        i2++;
                    } catch (NumberFormatException e2) {
                        StringBuilder A0r = AnonymousClass000.A0r("Unable to convert version segments into integers: ");
                        A0r.append(split[i2]);
                        A0r.append(" & ");
                        throw new IllegalArgumentException(AnonymousClass000.A0h(split2[i2], A0r), e2);
                    }
                }
            }
            return Integer.signum(length - split2.length);
        }

        public static ICronetEngineBuilder createBuilderDelegate(Context context) {
            ArrayList A0n = C13680ns.A0n(CronetProvider.getAllProviders(context));
            getEnabledCronetProviders(context, A0n);
            CronetProvider cronetProvider = (CronetProvider) A0n.get(0);
            String str = CronetEngine.TAG;
            if (Log.isLoggable(str, 3)) {
                Object[] A1b = C13680ns.A1b();
                A1b[0] = cronetProvider;
                Log.d(str, String.format("Using '%s' provider for creating CronetEngine.Builder.", A1b));
            }
            return cronetProvider.createBuilder().mBuilderDelegate;
        }

        public static List getEnabledCronetProviders(Context context, List list) {
            String str;
            if (list.size() != 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((CronetProvider) it.next()).isEnabled()) {
                        it.remove();
                    }
                }
                if (list.size() != 0) {
                    Collections.sort(list, new Comparator() {
                        public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
                            if (CronetProvider.PROVIDER_NAME_FALLBACK.equals("Google-Play-Services-Cronet-Provider")) {
                                return 1;
                            }
                            return -Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
                        }
                    });
                    return list;
                }
                str = "All available Cronet providers are disabled. A provider should be enabled before it can be used.";
            } else {
                str = "Unable to find any Cronet provider. Have you included all necessary jars?";
            }
            throw AnonymousClass000.A0a(str);
        }

        public Builder addPublicKeyPins(String str, Set set, boolean z2, Date date) {
            throw AnonymousClass000.A0W("addPublicKeyPins");
        }

        public Builder addQuicHint(String str, int i2, int i3) {
            throw AnonymousClass000.A0W("addQuicHint");
        }

        public CronetEngine build() {
            throw AnonymousClass000.A0W("build");
        }

        public Builder enableBrotli(boolean z2) {
            return this;
        }

        public Builder enableHttp2(boolean z2) {
            throw AnonymousClass000.A0W("enableHttp2");
        }

        public Builder enableHttpCache(int i2, long j2) {
            throw AnonymousClass000.A0W("enableHttpCache");
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z2) {
            throw AnonymousClass000.A0W("enablePublicKeyPinningBypassForLocalTrustAnchors");
        }

        public Builder enableQuic(boolean z2) {
            throw AnonymousClass000.A0W("enableQuic");
        }

        @Deprecated
        public Builder enableSdch(boolean z2) {
            return this;
        }

        public String getDefaultUserAgent() {
            throw AnonymousClass000.A0W("getDefaultUserAgent");
        }

        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            throw AnonymousClass000.A0W("setLibraryLoader");
        }

        public Builder setStoragePath(String str) {
            throw AnonymousClass000.A0W("setStoragePath");
        }

        public Builder setUserAgent(String str) {
            throw AnonymousClass000.A0W("setUserAgent");
        }
    }

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public abstract byte[] getGlobalMetricsDeltas();

    public abstract String getVersionString();

    public abstract UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url);

    public abstract void shutdown();

    public abstract void startNetLogToFile(String str, boolean z2);

    public abstract void stopNetLog();
}

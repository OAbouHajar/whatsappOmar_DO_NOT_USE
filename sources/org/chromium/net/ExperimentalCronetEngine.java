package org.chromium.net;

import X.AnonymousClass000;
import android.content.Context;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

public abstract class ExperimentalCronetEngine extends CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;

    public class Builder extends CronetEngine.Builder {
        public Builder(Context context) {
            super(context);
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        public Builder addPublicKeyPins(String str, Set set, boolean z2, Date date) {
            throw AnonymousClass000.A0W("addPublicKeyPins");
        }

        public Builder addQuicHint(String str, int i2, int i3) {
            throw AnonymousClass000.A0W("addQuicHint");
        }

        public ExperimentalCronetEngine build() {
            throw AnonymousClass000.A0W("build");
        }

        public Builder enableHttp2(boolean z2) {
            super.enableHttp2(z2);
            return this;
        }

        public Builder enableHttpCache(int i2, long j2) {
            throw AnonymousClass000.A0W("enableHttpCache");
        }

        public Builder enableNetworkQualityEstimator(boolean z2) {
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z2) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z2);
            return this;
        }

        public Builder enableQuic(boolean z2) {
            super.enableQuic(z2);
            return this;
        }

        public Builder enableSdch(boolean z2) {
            return this;
        }

        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public Builder setExperimentalOptions(String str) {
            throw AnonymousClass000.A0W("setExperimentalOptions");
        }

        public Builder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        public Builder setStoragePath(String str) {
            super.setStoragePath(str);
            return this;
        }

        public Builder setThreadPriority(int i2) {
            return this;
        }

        public Builder setUserAgent(String str) {
            super.setUserAgent(str);
            return this;
        }
    }

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z2, boolean z3, boolean z4) {
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor);

    public abstract ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public URLConnection openConnection(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void startNetLogToDisk(String str, boolean z2, int i2) {
    }
}

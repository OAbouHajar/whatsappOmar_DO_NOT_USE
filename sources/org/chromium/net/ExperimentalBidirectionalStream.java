package org.chromium.net;

import org.chromium.net.BidirectionalStream;

public abstract class ExperimentalBidirectionalStream extends BidirectionalStream {

    public abstract class Builder extends BidirectionalStream.Builder {
        public abstract Builder addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        public abstract ExperimentalBidirectionalStream build();

        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean z2);

        public abstract Builder setHttpMethod(String str);

        public abstract Builder setPriority(int i2);

        public Builder setTrafficStatsTag(int i2) {
            return this;
        }

        public Builder setTrafficStatsUid(int i2) {
            return this;
        }
    }
}

package android.support.v4.net;

import android.os.Build;
import java.net.Socket;
import java.net.SocketException;

public class TrafficStatsCompat {
    private static final TrafficStatsCompatImpl IMPL;

    static class BaseTrafficStatsCompatImpl implements TrafficStatsCompatImpl {
        private ThreadLocal<SocketTags> mThreadSocketTags = new ThreadLocal<SocketTags>() {
            /* access modifiers changed from: protected */
            public SocketTags initialValue() {
                return new SocketTags();
            }
        };

        private static class SocketTags {
            public int statsTag;

            private SocketTags() {
                this.statsTag = -1;
            }
        }

        BaseTrafficStatsCompatImpl() {
        }

        public void clearThreadStatsTag() {
            this.mThreadSocketTags.get().statsTag = -1;
        }

        public int getThreadStatsTag() {
            return this.mThreadSocketTags.get().statsTag;
        }

        public void incrementOperationCount(int i2) {
        }

        public void incrementOperationCount(int i2, int i3) {
        }

        public void setThreadStatsTag(int i2) {
            this.mThreadSocketTags.get().statsTag = i2;
        }

        public void tagSocket(Socket socket) {
        }

        public void untagSocket(Socket socket) {
        }
    }

    static class IcsTrafficStatsCompatImpl implements TrafficStatsCompatImpl {
        IcsTrafficStatsCompatImpl() {
        }

        public void clearThreadStatsTag() {
            TrafficStatsCompatIcs.clearThreadStatsTag();
        }

        public int getThreadStatsTag() {
            return TrafficStatsCompatIcs.getThreadStatsTag();
        }

        public void incrementOperationCount(int i2) {
            TrafficStatsCompatIcs.incrementOperationCount(i2);
        }

        public void incrementOperationCount(int i2, int i3) {
            TrafficStatsCompatIcs.incrementOperationCount(i2, i3);
        }

        public void setThreadStatsTag(int i2) {
            TrafficStatsCompatIcs.setThreadStatsTag(i2);
        }

        public void tagSocket(Socket socket) throws SocketException {
            TrafficStatsCompatIcs.tagSocket(socket);
        }

        public void untagSocket(Socket socket) throws SocketException {
            TrafficStatsCompatIcs.untagSocket(socket);
        }
    }

    interface TrafficStatsCompatImpl {
        void clearThreadStatsTag();

        int getThreadStatsTag();

        void incrementOperationCount(int i2);

        void incrementOperationCount(int i2, int i3);

        void setThreadStatsTag(int i2);

        void tagSocket(Socket socket) throws SocketException;

        void untagSocket(Socket socket) throws SocketException;
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            IMPL = new IcsTrafficStatsCompatImpl();
        } else {
            IMPL = new BaseTrafficStatsCompatImpl();
        }
    }

    public static void clearThreadStatsTag() {
        IMPL.clearThreadStatsTag();
    }

    public static int getThreadStatsTag() {
        return IMPL.getThreadStatsTag();
    }

    public static void incrementOperationCount(int i2) {
        IMPL.incrementOperationCount(i2);
    }

    public static void incrementOperationCount(int i2, int i3) {
        IMPL.incrementOperationCount(i2, i3);
    }

    public static void setThreadStatsTag(int i2) {
        IMPL.setThreadStatsTag(i2);
    }

    public static void tagSocket(Socket socket) throws SocketException {
        IMPL.tagSocket(socket);
    }

    public static void untagSocket(Socket socket) throws SocketException {
        IMPL.untagSocket(socket);
    }
}

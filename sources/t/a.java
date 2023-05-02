package t;

import java.io.IOException;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;

/* compiled from: XFMFile */
public final class a extends RealWebSocket.Streams {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StreamAllocation f2670a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(BufferedSource bufferedSource, BufferedSink bufferedSink, StreamAllocation streamAllocation) {
        super(true, bufferedSource, bufferedSink);
        this.f2670a = streamAllocation;
    }

    public final void close() {
        StreamAllocation streamAllocation = this.f2670a;
        streamAllocation.streamFinished(true, streamAllocation.codec(), -1, (IOException) null);
    }
}

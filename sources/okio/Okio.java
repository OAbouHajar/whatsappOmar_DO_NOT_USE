package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Logger;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import w.q;
import z.a;
import z.b;
import z.f;
import z.g;
import z.h;

/* compiled from: XFMFile */
public final class Okio {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f2354a = Logger.getLogger(Okio.class.getName());

    public static Sink appendingSink(File file) {
        if (file != null) {
            return sink((OutputStream) new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static Sink blackhole() {
        return new f();
    }

    public static BufferedSink buffer(Sink sink) {
        return new g(sink);
    }

    public static BufferedSource buffer(Source source) {
        return new h(source);
    }

    public static Sink sink(File file) {
        if (file != null) {
            return sink((OutputStream) new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static Sink sink(OutputStream outputStream) {
        Timeout timeout = new Timeout();
        if (outputStream != null) {
            return new a(outputStream, timeout);
        }
        throw new IllegalArgumentException("out == null");
    }

    public static Sink sink(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            q qVar = new q(socket, 1);
            OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return qVar.sink(new a(outputStream, (Timeout) qVar));
            }
            throw new IllegalArgumentException("out == null");
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    @IgnoreJRERequirement
    public static Sink sink(Path path, OpenOption... openOptionArr) {
        if (path != null) {
            return sink(Files.newOutputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static Source source(File file) {
        if (file != null) {
            return source((InputStream) new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static Source source(InputStream inputStream) {
        Timeout timeout = new Timeout();
        if (inputStream != null) {
            return new b(inputStream, timeout);
        }
        throw new IllegalArgumentException("in == null");
    }

    public static Source source(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            q qVar = new q(socket, 1);
            InputStream inputStream = socket.getInputStream();
            if (inputStream != null) {
                return qVar.source(new b(inputStream, (Timeout) qVar));
            }
            throw new IllegalArgumentException("in == null");
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    @IgnoreJRERequirement
    public static Source source(Path path, OpenOption... openOptionArr) {
        if (path != null) {
            return source(Files.newInputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }
}

package okhttp3.internal.io;

import e.j;
import java.io.File;
import okio.Sink;
import okio.Source;

/* compiled from: XFMFile */
public interface FileSystem {
    public static final FileSystem SYSTEM = new j();

    Sink appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    Sink sink(File file);

    long size(File file);

    Source source(File file);
}

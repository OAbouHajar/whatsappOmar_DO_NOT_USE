package org.apache.commons.io.input;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class Tailer implements Runnable {
    private static final int DEFAULT_BUFSIZE = 4096;
    private static final int DEFAULT_DELAY_MILLIS = 1000;
    private static final String RAF_MODE = "r";
    private final long delayMillis;
    private final boolean end;
    private final File file;
    private final byte[] inbuf;
    private final TailerListener listener;
    private final boolean reOpen;
    private volatile boolean run;

    public Tailer(File file2, TailerListener tailerListener) {
        this(file2, tailerListener, 1000);
    }

    public Tailer(File file2, TailerListener tailerListener, long j2) {
        this(file2, tailerListener, j2, false);
    }

    public Tailer(File file2, TailerListener tailerListener, long j2, boolean z2) {
        this(file2, tailerListener, j2, z2, 4096);
    }

    public Tailer(File file2, TailerListener tailerListener, long j2, boolean z2, int i2) {
        this(file2, tailerListener, j2, z2, false, i2);
    }

    public Tailer(File file2, TailerListener tailerListener, long j2, boolean z2, boolean z3) {
        this(file2, tailerListener, j2, z2, z3, 4096);
    }

    public Tailer(File file2, TailerListener tailerListener, long j2, boolean z2, boolean z3, int i2) {
        this.run = true;
        this.file = file2;
        this.delayMillis = j2;
        this.end = z2;
        this.inbuf = new byte[i2];
        this.listener = tailerListener;
        tailerListener.init(this);
        this.reOpen = z3;
    }

    public static Tailer create(File file2, TailerListener tailerListener) {
        return create(file2, tailerListener, 1000, false);
    }

    public static Tailer create(File file2, TailerListener tailerListener, long j2) {
        return create(file2, tailerListener, j2, false);
    }

    public static Tailer create(File file2, TailerListener tailerListener, long j2, boolean z2) {
        return create(file2, tailerListener, j2, z2, 4096);
    }

    public static Tailer create(File file2, TailerListener tailerListener, long j2, boolean z2, int i2) {
        Tailer tailer = new Tailer(file2, tailerListener, j2, z2, i2);
        Thread thread = new Thread(tailer);
        thread.setDaemon(true);
        thread.start();
        return tailer;
    }

    public static Tailer create(File file2, TailerListener tailerListener, long j2, boolean z2, boolean z3) {
        return create(file2, tailerListener, j2, z2, z3, 4096);
    }

    public static Tailer create(File file2, TailerListener tailerListener, long j2, boolean z2, boolean z3, int i2) {
        Tailer tailer = new Tailer(file2, tailerListener, j2, z2, z3, i2);
        Thread thread = new Thread(tailer);
        thread.setDaemon(true);
        thread.start();
        return tailer;
    }

    private long readLines(RandomAccessFile randomAccessFile) throws IOException {
        StringBuilder sb = new StringBuilder();
        long filePointer = randomAccessFile.getFilePointer();
        long j2 = filePointer;
        boolean z2 = false;
        while (this.run) {
            int read = randomAccessFile.read(this.inbuf);
            int i2 = read;
            if (read == -1) {
                break;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                byte b2 = this.inbuf[i3];
                if (b2 == 10) {
                    z2 = false;
                    this.listener.handle(sb.toString());
                    sb.setLength(0);
                    j2 = ((long) i3) + filePointer + 1;
                } else if (b2 != 13) {
                    if (z2) {
                        z2 = false;
                        this.listener.handle(sb.toString());
                        sb.setLength(0);
                        j2 = ((long) i3) + filePointer + 1;
                    }
                    sb.append((char) b2);
                } else {
                    if (z2) {
                        sb.append(13);
                    }
                    z2 = true;
                }
            }
            filePointer = randomAccessFile.getFilePointer();
        }
        randomAccessFile.seek(j2);
        return j2;
    }

    public long getDelay() {
        return this.delayMillis;
    }

    public File getFile() {
        return this.file;
    }

    public void run() {
        RandomAccessFile randomAccessFile = null;
        long j2 = 0;
        long j3 = 0;
        while (this.run && randomAccessFile == null) {
            try {
                try {
                    randomAccessFile = new RandomAccessFile(this.file, RAF_MODE);
                } catch (FileNotFoundException e2) {
                    this.listener.fileNotFound();
                }
                if (randomAccessFile == null) {
                    try {
                        Thread.sleep(this.delayMillis);
                    } catch (InterruptedException e3) {
                    }
                } else {
                    j3 = this.end ? this.file.length() : 0;
                    j2 = System.currentTimeMillis();
                    randomAccessFile.seek(j3);
                }
            } catch (Exception e4) {
                this.listener.handle(e4);
            } catch (Throwable th) {
                IOUtils.closeQuietly((Closeable) randomAccessFile);
                throw th;
            }
        }
        while (this.run) {
            boolean isFileNewer = FileUtils.isFileNewer(this.file, j2);
            long length = this.file.length();
            if (length < j3) {
                this.listener.fileRotated();
                RandomAccessFile randomAccessFile2 = randomAccessFile;
                try {
                    randomAccessFile = new RandomAccessFile(this.file, RAF_MODE);
                    j3 = 0;
                    IOUtils.closeQuietly((Closeable) randomAccessFile2);
                } catch (FileNotFoundException e5) {
                    this.listener.fileNotFound();
                }
            } else {
                if (length > j3) {
                    j3 = readLines(randomAccessFile);
                    j2 = System.currentTimeMillis();
                } else if (isFileNewer) {
                    randomAccessFile.seek(0);
                    j3 = readLines(randomAccessFile);
                    j2 = System.currentTimeMillis();
                }
                if (this.reOpen) {
                    IOUtils.closeQuietly((Closeable) randomAccessFile);
                }
                try {
                    Thread.sleep(this.delayMillis);
                } catch (InterruptedException e6) {
                }
                if (this.run && this.reOpen) {
                    randomAccessFile = new RandomAccessFile(this.file, RAF_MODE);
                    randomAccessFile.seek(j3);
                }
            }
        }
        IOUtils.closeQuietly((Closeable) randomAccessFile);
    }

    public void stop() {
        this.run = false;
    }
}

package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class LockableFileWriter extends Writer {
    private static final String LCK = ".lck";
    private final File lockFile;
    private final Writer out;

    public LockableFileWriter(File file) throws IOException {
        this(file, false, (String) null);
    }

    public LockableFileWriter(File file, String str) throws IOException {
        this(file, str, false, (String) null);
    }

    public LockableFileWriter(File file, String str, boolean z2, String str2) throws IOException {
        this(file, Charsets.toCharset(str), z2, str2);
    }

    public LockableFileWriter(File file, Charset charset) throws IOException {
        this(file, charset, false, (String) null);
    }

    public LockableFileWriter(File file, Charset charset, boolean z2, String str) throws IOException {
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.getParentFile() != null) {
            FileUtils.forceMkdir(absoluteFile.getParentFile());
        }
        if (!absoluteFile.isDirectory()) {
            File file2 = new File(str == null ? System.getProperty("java.io.tmpdir") : str);
            FileUtils.forceMkdir(file2);
            testLockDir(file2);
            this.lockFile = new File(file2, absoluteFile.getName() + LCK);
            createLock();
            this.out = initWriter(absoluteFile, charset, z2);
            return;
        }
        throw new IOException("File specified is a directory");
    }

    public LockableFileWriter(File file, boolean z2) throws IOException {
        this(file, z2, (String) null);
    }

    public LockableFileWriter(File file, boolean z2, String str) throws IOException {
        this(file, Charset.defaultCharset(), z2, str);
    }

    public LockableFileWriter(String str) throws IOException {
        this(str, false, (String) null);
    }

    public LockableFileWriter(String str, boolean z2) throws IOException {
        this(str, z2, (String) null);
    }

    public LockableFileWriter(String str, boolean z2, String str2) throws IOException {
        this(new File(str), z2, str2);
    }

    private void createLock() throws IOException {
        synchronized (LockableFileWriter.class) {
            if (this.lockFile.createNewFile()) {
                this.lockFile.deleteOnExit();
            } else {
                throw new IOException("Can't write file, lock " + this.lockFile.getAbsolutePath() + " exists");
            }
        }
    }

    private Writer initWriter(File file, Charset charset, boolean z2) throws IOException {
        boolean exists = file.exists();
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file.getAbsolutePath(), z2);
            return new OutputStreamWriter(fileOutputStream, Charsets.toCharset(charset));
        } catch (IOException e2) {
            IOUtils.closeQuietly((Writer) null);
            IOUtils.closeQuietly((OutputStream) fileOutputStream);
            FileUtils.deleteQuietly(this.lockFile);
            if (!exists) {
                FileUtils.deleteQuietly(file);
            }
            throw e2;
        } catch (RuntimeException e3) {
            IOUtils.closeQuietly((Writer) null);
            IOUtils.closeQuietly((OutputStream) fileOutputStream);
            FileUtils.deleteQuietly(this.lockFile);
            if (!exists) {
                FileUtils.deleteQuietly(file);
            }
            throw e3;
        }
    }

    private void testLockDir(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException("Could not find lockDir: " + file.getAbsolutePath());
        } else if (!file.canWrite()) {
            throw new IOException("Could not write to lockDir: " + file.getAbsolutePath());
        }
    }

    public void close() throws IOException {
        try {
            this.out.close();
        } finally {
            this.lockFile.delete();
        }
    }

    public void flush() throws IOException {
        this.out.flush();
    }

    public void write(int i2) throws IOException {
        this.out.write(i2);
    }

    public void write(String str) throws IOException {
        this.out.write(str);
    }

    public void write(String str, int i2, int i3) throws IOException {
        this.out.write(str, i2, i3);
    }

    public void write(char[] cArr) throws IOException {
        this.out.write(cArr);
    }

    public void write(char[] cArr, int i2, int i3) throws IOException {
        this.out.write(cArr, i2, i3);
    }
}

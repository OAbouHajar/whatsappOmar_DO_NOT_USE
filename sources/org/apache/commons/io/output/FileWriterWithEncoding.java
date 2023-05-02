package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class FileWriterWithEncoding extends Writer {
    private final Writer out;

    public FileWriterWithEncoding(File file, String str) throws IOException {
        this(file, str, false);
    }

    public FileWriterWithEncoding(File file, String str, boolean z2) throws IOException {
        this.out = initWriter(file, str, z2);
    }

    public FileWriterWithEncoding(File file, Charset charset) throws IOException {
        this(file, charset, false);
    }

    public FileWriterWithEncoding(File file, Charset charset, boolean z2) throws IOException {
        this.out = initWriter(file, charset, z2);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder, boolean z2) throws IOException {
        this.out = initWriter(file, charsetEncoder, z2);
    }

    public FileWriterWithEncoding(String str, String str2) throws IOException {
        this(new File(str), str2, false);
    }

    public FileWriterWithEncoding(String str, String str2, boolean z2) throws IOException {
        this(new File(str), str2, z2);
    }

    public FileWriterWithEncoding(String str, Charset charset) throws IOException {
        this(new File(str), charset, false);
    }

    public FileWriterWithEncoding(String str, Charset charset, boolean z2) throws IOException {
        this(new File(str), charset, z2);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder) throws IOException {
        this(new File(str), charsetEncoder, false);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder, boolean z2) throws IOException {
        this(new File(str), charsetEncoder, z2);
    }

    private static Writer initWriter(File file, Object obj, boolean z2) throws IOException {
        if (file == null) {
            throw new NullPointerException("File is missing");
        } else if (obj != null) {
            boolean exists = file.exists();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, z2);
                return obj instanceof Charset ? new OutputStreamWriter(fileOutputStream, (Charset) obj) : obj instanceof CharsetEncoder ? new OutputStreamWriter(fileOutputStream, (CharsetEncoder) obj) : new OutputStreamWriter(fileOutputStream, (String) obj);
            } catch (IOException e2) {
                IOUtils.closeQuietly((Writer) null);
                IOUtils.closeQuietly((OutputStream) null);
                if (!exists) {
                    FileUtils.deleteQuietly(file);
                }
                throw e2;
            } catch (RuntimeException e3) {
                IOUtils.closeQuietly((Writer) null);
                IOUtils.closeQuietly((OutputStream) null);
                if (!exists) {
                    FileUtils.deleteQuietly(file);
                }
                throw e3;
            }
        } else {
            throw new NullPointerException("Encoding is missing");
        }
    }

    public void close() throws IOException {
        this.out.close();
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

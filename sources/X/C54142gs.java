package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.2gs  reason: invalid class name and case insensitive filesystem */
public final class C54142gs extends FilterInputStream {
    public int A00;
    public boolean A01;

    public C54142gs(InputStream inputStream) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException("in may not be null");
        }
    }

    public int available() {
        return 0;
    }

    public synchronized void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        byte[] array = allocate.array();
        while (true) {
            int read = super.read();
            if (read == -1) {
                break;
            }
            if (this.A01) {
                int i2 = this.A00;
                if (i2 > 0) {
                    this.A00 = i2 - 1;
                    return read;
                } else if (allocate.remaining() != 0) {
                    allocate.put((byte) read);
                    if (allocate.position() >= 2 && array[allocate.position() - 1] == 10 && array[allocate.position() - 2] == 13) {
                        if (allocate.position() > 2) {
                            String str = new String(array, 0, allocate.position() - 2, AnonymousClass01S.A08);
                            try {
                                int parseInt = Integer.parseInt(str, 16);
                                this.A00 = parseInt;
                                if (parseInt == 0) {
                                    if (super.read() == -1) {
                                        throw new IOException("stream ended early during parse final chunk");
                                    } else if (super.read() == -1) {
                                        throw new IOException("stream ended early during parse final chunk");
                                    }
                                }
                            } catch (NumberFormatException unused) {
                                StringBuilder sb = new StringBuilder("chunk length ");
                                sb.append(str);
                                sb.append(" failed to parse");
                                throw new IOException(sb.toString());
                            }
                        }
                    }
                } else {
                    throw new IOException("corrupt pseudo http input [max chunk header length exceeded]");
                }
            } else if (allocate.remaining() != 0) {
                allocate.put((byte) read);
                if (allocate.position() >= 2 && array[allocate.position() - 1] == 10 && array[allocate.position() - 2] == 13) {
                    if (allocate.position() == 2) {
                        this.A01 = true;
                    } else {
                        String[] split = new String(array, 0, allocate.position() - 2, AnonymousClass01S.A08).split(":", 2);
                        if (split.length == 2) {
                            String trim = split[0].trim();
                            String trim2 = split[1].trim();
                            if (trim.equalsIgnoreCase("Transfer-Encoding") && !trim2.equalsIgnoreCase("chunked")) {
                                StringBuilder sb2 = new StringBuilder("Unexpect transfer encoding encountered: ");
                                sb2.append(trim2);
                                throw new IOException(sb2.toString());
                            }
                        }
                    }
                }
            } else {
                throw new IOException("corrupt pseudo http input [max http header length exceeded]");
            }
            allocate.clear();
        }
        return -1;
    }

    public int read(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            int read = read();
            if (read != -1) {
                bArr[i2 + i4] = (byte) read;
                i4++;
            } else if (i4 <= 0) {
                return -1;
            } else {
                return i4;
            }
        }
        return i3;
    }

    public synchronized void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j2) {
        for (long j3 = 0; j3 < j2; j3++) {
            if (read() == -1) {
                return j3;
            }
        }
        return j2;
    }
}

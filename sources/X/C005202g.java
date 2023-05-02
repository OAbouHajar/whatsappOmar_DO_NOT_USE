package X;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

/* renamed from: X.02g  reason: invalid class name and case insensitive filesystem */
public class C005202g {
    public char A00;
    public char A01;
    public int A02;
    public int A03 = -1;
    public RandomAccessFile A04;
    public boolean A05 = true;
    public boolean A06 = false;
    public final String A07;
    public final byte[] A08;

    public C005202g(String str) {
        this.A07 = str;
        this.A08 = new byte[512];
    }

    public long A00() {
        long j2 = 1;
        long j3 = 0;
        boolean z2 = true;
        while (true) {
            if (A08()) {
                A05();
                if (!Character.isDigit(this.A00)) {
                    if (!z2) {
                        A06();
                        break;
                    } else if (this.A00 == '-') {
                        j2 = -1;
                    } else {
                        throw new C11110iD("Couldn't read number!");
                    }
                } else {
                    j3 = (j3 * 10) + ((long) (this.A00 - '0'));
                }
                z2 = false;
            } else if (z2) {
                throw new C11110iD("Couldn't read number because the file ended!");
            }
        }
        return j2 * j3;
    }

    public void A01() {
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.A04 = null;
                throw th;
            }
            this.A04 = null;
        }
    }

    public void A02() {
        this.A05 = true;
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0);
            } catch (IOException unused) {
                A01();
            }
        }
        if (this.A04 == null) {
            try {
                this.A04 = new RandomAccessFile(this.A07, "r");
            } catch (IOException unused2) {
                this.A05 = false;
                A01();
            }
        }
        if (this.A05) {
            this.A03 = -1;
            this.A02 = 0;
            this.A00 = 0;
            this.A01 = 0;
            this.A06 = false;
        }
    }

    public void A03() {
        boolean z2 = false;
        while (A08()) {
            A05();
            if (this.A00 == 10) {
                z2 = true;
            } else if (z2) {
                A06();
                return;
            }
        }
    }

    public void A04() {
        boolean z2 = false;
        while (A08()) {
            A05();
            if (this.A00 == ' ') {
                z2 = true;
            } else if (z2) {
                A06();
                return;
            }
        }
    }

    public final void A05() {
        if (A08()) {
            int i2 = this.A03 + 1;
            this.A03 = i2;
            this.A01 = this.A00;
            this.A00 = (char) this.A08[i2];
            this.A06 = false;
            return;
        }
        throw new NoSuchElementException();
    }

    public final void A06() {
        if (!this.A06) {
            this.A03--;
            this.A00 = this.A01;
            this.A06 = true;
            return;
        }
        throw new C11110iD("Can only rewind one step!");
    }

    public void A07(CharBuffer charBuffer) {
        charBuffer.clear();
        boolean z2 = true;
        while (true) {
            if (A08()) {
                A05();
                if (!Character.isWhitespace(this.A00)) {
                    if (!charBuffer.hasRemaining()) {
                        CharBuffer allocate = CharBuffer.allocate(charBuffer.capacity() << 1);
                        charBuffer.flip();
                        allocate.put(charBuffer);
                        charBuffer = allocate;
                    }
                    charBuffer.put(this.A00);
                    z2 = false;
                } else if (!z2) {
                    A06();
                } else {
                    throw new C11110iD("Couldn't read string!");
                }
            } else if (z2) {
                throw new C11110iD("Couldn't read string because file ended!");
            }
        }
        charBuffer.flip();
    }

    public boolean A08() {
        RandomAccessFile randomAccessFile;
        if (this.A05 && (randomAccessFile = this.A04) != null) {
            int i2 = this.A03;
            int i3 = this.A02;
            if (i2 <= i3 - 1) {
                if (i2 < i3 - 1) {
                    return true;
                }
                try {
                    this.A02 = randomAccessFile.read(this.A08);
                    this.A03 = -1;
                } catch (IOException unused) {
                    this.A05 = false;
                    A01();
                }
                return A08();
            }
        }
        return false;
    }

    public void finalize() {
        A01();
    }
}

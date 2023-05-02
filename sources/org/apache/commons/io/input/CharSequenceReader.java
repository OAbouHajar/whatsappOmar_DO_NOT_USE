package org.apache.commons.io.input;

import java.io.Reader;
import java.io.Serializable;

public class CharSequenceReader extends Reader implements Serializable {
    private final CharSequence charSequence;
    private int idx;
    private int mark;

    public CharSequenceReader(CharSequence charSequence2) {
        this.charSequence = charSequence2 != null ? charSequence2 : "";
    }

    public void close() {
        this.idx = 0;
        this.mark = 0;
    }

    public void mark(int i2) {
        this.mark = this.idx;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        if (this.idx >= this.charSequence.length()) {
            return -1;
        }
        CharSequence charSequence2 = this.charSequence;
        int i2 = this.idx;
        this.idx = i2 + 1;
        return charSequence2.charAt(i2);
    }

    public int read(char[] cArr, int i2, int i3) {
        if (this.idx >= this.charSequence.length()) {
            return -1;
        }
        if (cArr == null) {
            throw new NullPointerException("Character array is missing");
        } else if (i3 < 0 || i2 < 0 || i2 + i3 > cArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + cArr.length + ", offset=" + i2 + ", length=" + i3);
        } else {
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int read = read();
                if (read == -1) {
                    return i4;
                }
                cArr[i2 + i5] = (char) read;
                i4++;
            }
            return i4;
        }
    }

    public void reset() {
        this.idx = this.mark;
    }

    public long skip(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("Number of characters to skip is less than zero: " + j2);
        } else if (this.idx >= this.charSequence.length()) {
            return -1;
        } else {
            int min = (int) Math.min((long) this.charSequence.length(), ((long) this.idx) + j2);
            this.idx = min;
            return (long) (min - this.idx);
        }
    }

    public String toString() {
        return this.charSequence.toString();
    }
}

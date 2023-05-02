package X;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.2TV  reason: invalid class name */
public class AnonymousClass2TV implements XmlSerializer {
    public static final String[] A0B = {"&#0;", "&#1;", "&#2;", "&#3;", "&#4;", "&#5;", "&#6;", "&#7;", "&#8;", "&#9;", "&#10;", "&#11;", "&#12;", "&#13;", "&#14;", "&#15;", "&#16;", "&#17;", "&#18;", "&#19;", "&#20;", "&#21;", "&#22;", "&#23;", "&#24;", "&#25;", "&#26;", "&#27;", "&#28;", "&#29;", "&#30;", "&#31;", null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    public int A00;
    public int A01;
    public OutputStream A02;
    public Writer A03;
    public ByteBuffer A04;
    public CharsetEncoder A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final char[] A0A;

    public AnonymousClass2TV() {
        this(32768);
    }

    public AnonymousClass2TV(int i2) {
        this.A07 = false;
        this.A00 = 0;
        this.A08 = true;
        i2 = i2 <= 0 ? 32768 : i2;
        this.A09 = i2;
        this.A0A = new char[i2];
        this.A04 = ByteBuffer.allocate(i2);
    }

    public final void A00(char c2) {
        int i2 = this.A01;
        if (i2 >= this.A09 - 1) {
            flush();
            i2 = this.A01;
        }
        this.A0A[i2] = c2;
        this.A01 = i2 + 1;
    }

    public final void A01(int i2, String str, int i3) {
        int i4 = this.A09;
        if (i3 > i4) {
            int i5 = i3 + i2;
            while (i2 < i5) {
                int i6 = i4;
                int i7 = i2 + i4;
                if (i7 >= i5) {
                    i6 = i5 - i2;
                }
                A01(i2, str, i6);
                i2 = i7;
            }
            return;
        }
        int i8 = this.A01;
        if (i8 + i3 > i4) {
            flush();
            i8 = this.A01;
        }
        str.getChars(i2, i2 + i3, this.A0A, i8);
        this.A01 = i8 + i3;
    }

    public final void A02(String str) {
        A01(0, str, str.length());
    }

    public final void A03(String str) {
        String str2;
        int length = str.length();
        String[] strArr = A0B;
        char length2 = (char) strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i3 < i2) {
                    A01(i3, str, i2 - i3);
                }
                i3 = i2 + 1;
                A02(str2);
            }
            i2++;
        }
        if (i3 < i2) {
            A01(i3, str, i2 - i3);
        }
    }

    public final void A04(char[] cArr, int i2, int i3) {
        int i4 = this.A09;
        if (i3 > i4) {
            int i5 = i3 + i2;
            while (i2 < i5) {
                int i6 = i4;
                int i7 = i2 + i4;
                if (i7 >= i5) {
                    i6 = i5 - i2;
                }
                A04(cArr, i2, i6);
                i2 = i7;
            }
            return;
        }
        int i8 = this.A01;
        if (i8 + i3 > i4) {
            flush();
            i8 = this.A01;
        }
        System.arraycopy(cArr, i2, this.A0A, i8, i3);
        this.A01 = i8 + i3;
    }

    public XmlSerializer attribute(String str, String str2, String str3) {
        A00(' ');
        if (str != null) {
            A02(str);
            A00(':');
        }
        A02(str2);
        A02("=\"");
        A03(str3);
        A00('\"');
        this.A08 = false;
        return this;
    }

    public void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    public void comment(String str) {
        throw new UnsupportedOperationException();
    }

    public void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    public void endDocument() {
        flush();
    }

    public XmlSerializer endTag(String str, String str2) {
        String str3;
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (this.A06) {
            str3 = " />\n";
        } else {
            if (this.A07 && this.A08) {
                int i3 = i2 << 2;
                if (i3 > 62) {
                    i3 = 62;
                }
                A01(0, "                                                              ", i3);
            }
            A02("</");
            if (str != null) {
                A02(str);
                A00(':');
            }
            A02(str2);
            str3 = ">\n";
        }
        A02(str3);
        this.A08 = true;
        this.A06 = false;
        return this;
    }

    public void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    public void flush() {
        int i2 = this.A01;
        if (i2 > 0) {
            if (this.A02 != null) {
                CharBuffer wrap = CharBuffer.wrap(this.A0A, 0, i2);
                CharsetEncoder charsetEncoder = this.A05;
                ByteBuffer byteBuffer = this.A04;
                while (true) {
                    CoderResult encode = charsetEncoder.encode(wrap, byteBuffer, true);
                    if (!encode.isError()) {
                        boolean isOverflow = encode.isOverflow();
                        int position = byteBuffer.position();
                        if (isOverflow) {
                            if (position > 0) {
                                byteBuffer.flip();
                                this.A02.write(byteBuffer.array(), 0, position);
                                byteBuffer.clear();
                            }
                            charsetEncoder = this.A05;
                        } else {
                            if (position > 0) {
                                byteBuffer.flip();
                                this.A02.write(byteBuffer.array(), 0, position);
                                byteBuffer.clear();
                            }
                            this.A02.flush();
                        }
                    } else {
                        throw new IOException(encode.toString());
                    }
                }
            } else {
                this.A03.write(this.A0A, 0, i2);
                this.A03.flush();
            }
            this.A01 = 0;
        }
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    public String getPrefix(String str, boolean z2) {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    public void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    public void setFeature(String str, boolean z2) {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.A07 = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setOutput(OutputStream outputStream, String str) {
        if (outputStream != null) {
            try {
                CharsetEncoder newEncoder = Charset.forName(str).newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                this.A05 = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                this.A02 = outputStream;
            } catch (IllegalCharsetNameException e2) {
                throw new UnsupportedEncodingException(str).initCause(e2);
            } catch (UnsupportedCharsetException e3) {
                throw new UnsupportedEncodingException(str).initCause(e3);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setOutput(Writer writer) {
        this.A03 = writer;
    }

    public void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    public void startDocument(String str, Boolean bool) {
        StringBuilder sb = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        sb.append(bool.booleanValue() ? "yes" : "no");
        sb.append("' ?>\n");
        A02(sb.toString());
        this.A08 = true;
    }

    public XmlSerializer startTag(String str, String str2) {
        if (this.A06) {
            A02(">\n");
        }
        if (this.A07) {
            int i2 = this.A00 << 2;
            if (i2 > 62) {
                i2 = 62;
            }
            A01(0, "                                                              ", i2);
        }
        this.A00++;
        A00('<');
        if (str != null) {
            A02(str);
            A00(':');
        }
        A02(str2);
        this.A06 = true;
        this.A08 = false;
        return this;
    }

    public XmlSerializer text(String str) {
        boolean z2 = false;
        if (this.A06) {
            A02(">");
            this.A06 = false;
        }
        A03(str);
        if (this.A07) {
            int length = str.length();
            if (length > 0 && str.charAt(length - 1) == 10) {
                z2 = true;
            }
            this.A08 = z2;
        }
        return this;
    }

    public XmlSerializer text(char[] cArr, int i2, int i3) {
        String str;
        boolean z2 = false;
        if (this.A06) {
            A02(">");
            this.A06 = false;
        }
        String[] strArr = A0B;
        char length = (char) strArr.length;
        int i4 = i3 + i2;
        int i5 = i2;
        while (i2 < i4) {
            char c2 = cArr[i2];
            if (c2 < length && (str = strArr[c2]) != null) {
                if (i5 < i2) {
                    A04(cArr, i5, i2 - i5);
                }
                i5 = i2 + 1;
                A02(str);
            }
            i2++;
        }
        if (i5 < i2) {
            A04(cArr, i5, i2 - i5);
        }
        if (this.A07) {
            if (cArr[i4 - 1] == 10) {
                z2 = true;
            }
            this.A08 = z2;
        }
        return this;
    }
}

package org.json.simple.parser;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.commons.io.IOUtils;

class Yylex {
    public static final int STRING_BEGIN = 2;
    public static final int YYEOF = -1;
    public static final int YYINITIAL = 0;
    private static final int[] ZZ_ACTION = zzUnpackAction();
    private static final String ZZ_ACTION_PACKED_0 = "\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018";
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();
    private static final String ZZ_ATTRIBUTE_PACKED_0 = "\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t";
    private static final int ZZ_BUFFERSIZE = 16384;
    private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);
    private static final String ZZ_CMAP_PACKED = "\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016ﾂ\u0000";
    private static final String[] ZZ_ERROR_MSG = {"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
    private static final int[] ZZ_LEXSTATE = {0, 0, 1, 1};
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();
    private static final String ZZ_ROWMAP_PACKED_0 = "\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u00006\u0000¢\u0000½\u0000Ø\u00006\u00006\u00006\u00006\u00006\u00006\u0000ó\u0000Ď\u00006\u0000ĩ\u0000ń\u0000ş\u0000ź\u0000ƕ\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000ư\u0000ǋ\u0000Ǧ\u0000Ǧ\u0000ȁ\u0000Ȝ\u0000ȷ\u0000ɒ\u00006\u00006\u0000ɭ\u0000ʈ\u00006";
    private static final int[] ZZ_TRANS = {2, 2, 3, 4, 2, 2, 2, 5, 2, 6, 2, 2, 7, 8, 2, 9, 2, 2, 2, 2, 2, 10, 11, 12, 13, 14, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 18, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, 19, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, 26, 27, 28, 29, 30, 31, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, 39, -1, 39, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, 42, -1, 42, -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, 43, -1, 43, -1, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private StringBuffer sb;
    private int yychar;
    private int yycolumn;
    private int yyline;
    private boolean zzAtBOL;
    private boolean zzAtEOF;
    private char[] zzBuffer;
    private int zzCurrentPos;
    private int zzEndRead;
    private int zzLexicalState;
    private int zzMarkedPos;
    private Reader zzReader;
    private int zzStartRead;
    private int zzState;

    Yylex(InputStream inputStream) {
        this((Reader) new InputStreamReader(inputStream));
    }

    Yylex(Reader reader) {
        this.zzLexicalState = 0;
        this.zzBuffer = new char[16384];
        this.zzAtBOL = true;
        this.sb = new StringBuffer();
        this.zzReader = reader;
    }

    private boolean zzRefill() throws IOException {
        int read;
        int i2 = this.zzStartRead;
        if (i2 > 0) {
            char[] cArr = this.zzBuffer;
            System.arraycopy(cArr, i2, cArr, 0, this.zzEndRead - i2);
            int i3 = this.zzEndRead;
            int i4 = this.zzStartRead;
            this.zzEndRead = i3 - i4;
            this.zzCurrentPos -= i4;
            this.zzMarkedPos -= i4;
            this.zzStartRead = 0;
        }
        int i5 = this.zzCurrentPos;
        char[] cArr2 = this.zzBuffer;
        if (i5 >= cArr2.length) {
            char[] cArr3 = new char[(i5 * 2)];
            System.arraycopy(cArr2, 0, cArr3, 0, cArr2.length);
            this.zzBuffer = cArr3;
        }
        Reader reader = this.zzReader;
        char[] cArr4 = this.zzBuffer;
        int i6 = this.zzEndRead;
        int read2 = reader.read(cArr4, i6, cArr4.length - i6);
        if (read2 > 0) {
            this.zzEndRead += read2;
            return false;
        } else if (read2 != 0 || (read = this.zzReader.read()) == -1) {
            return true;
        } else {
            char[] cArr5 = this.zzBuffer;
            int i7 = this.zzEndRead;
            this.zzEndRead = i7 + 1;
            cArr5[i7] = (char) read;
            return false;
        }
    }

    private void zzScanError(int i2) {
        String str;
        try {
            str = ZZ_ERROR_MSG[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            str = ZZ_ERROR_MSG[0];
        }
        throw new Error(str);
    }

    private static int zzUnpackAction(String str, int i2, int[] iArr) {
        int i3;
        int i4 = 0;
        int i5 = i2;
        int length = str.length();
        while (i4 < length) {
            int i6 = i4 + 1;
            int charAt = str.charAt(i4);
            int i7 = i6 + 1;
            int charAt2 = str.charAt(i6);
            while (true) {
                i3 = i5 + 1;
                iArr[i5] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i5 = i3;
            }
            i4 = i7;
            i5 = i3;
        }
        return i5;
    }

    private static int[] zzUnpackAction() {
        int[] iArr = new int[45];
        int zzUnpackAction = zzUnpackAction(ZZ_ACTION_PACKED_0, 0, iArr);
        return iArr;
    }

    private static int zzUnpackAttribute(String str, int i2, int[] iArr) {
        int i3;
        int i4 = 0;
        int i5 = i2;
        int length = str.length();
        while (i4 < length) {
            int i6 = i4 + 1;
            int charAt = str.charAt(i4);
            int i7 = i6 + 1;
            int charAt2 = str.charAt(i6);
            while (true) {
                i3 = i5 + 1;
                iArr[i5] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i5 = i3;
            }
            i4 = i7;
            i5 = i3;
        }
        return i5;
    }

    private static int[] zzUnpackAttribute() {
        int[] iArr = new int[45];
        int zzUnpackAttribute = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, 0, iArr);
        return iArr;
    }

    private static char[] zzUnpackCMap(String str) {
        int i2;
        char[] cArr = new char[AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 90) {
            int i5 = i3 + 1;
            int charAt = str.charAt(i3);
            int i6 = i5 + 1;
            char charAt2 = str.charAt(i5);
            while (true) {
                i2 = i4 + 1;
                cArr[i4] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i4 = i2;
            }
            i3 = i6;
            i4 = i2;
        }
        return cArr;
    }

    private static int zzUnpackRowMap(String str, int i2, int[] iArr) {
        int i3 = 0;
        int i4 = i2;
        int length = str.length();
        while (i3 < length) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            iArr[i4] = str.charAt(i5) | (str.charAt(i3) << 16);
            i4++;
            i3 = i6;
        }
        return i4;
    }

    private static int[] zzUnpackRowMap() {
        int[] iArr = new int[45];
        int zzUnpackRowMap = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, 0, iArr);
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public int getPosition() {
        return this.yychar;
    }

    public final void yybegin(int i2) {
        this.zzLexicalState = i2;
    }

    public final char yycharat(int i2) {
        return this.zzBuffer[this.zzStartRead + i2];
    }

    public final void yyclose() throws IOException {
        this.zzAtEOF = true;
        this.zzEndRead = this.zzStartRead;
        Reader reader = this.zzReader;
        if (reader != null) {
            reader.close();
        }
    }

    public final int yylength() {
        return this.zzMarkedPos - this.zzStartRead;
    }

    public Yytoken yylex() throws IOException, ParseException {
        char c2;
        int i2;
        int i3 = this.zzEndRead;
        char[] cArr = this.zzBuffer;
        char[] cArr2 = ZZ_CMAP;
        int[] iArr = ZZ_TRANS;
        int[] iArr2 = ZZ_ROWMAP;
        int[] iArr3 = ZZ_ATTRIBUTE;
        while (true) {
            int i4 = this.zzMarkedPos;
            this.yychar += i4 - this.zzStartRead;
            int i5 = -1;
            this.zzStartRead = i4;
            this.zzCurrentPos = i4;
            int i6 = i4;
            this.zzState = ZZ_LEXSTATE[this.zzLexicalState];
            while (true) {
                if (i6 < i3) {
                    c2 = cArr[i6];
                    i6++;
                } else if (this.zzAtEOF) {
                    c2 = 65535;
                    i2 = i3;
                } else {
                    this.zzCurrentPos = i6;
                    this.zzMarkedPos = i4;
                    boolean zzRefill = zzRefill();
                    int i7 = this.zzCurrentPos;
                    i4 = this.zzMarkedPos;
                    cArr = this.zzBuffer;
                    i3 = this.zzEndRead;
                    if (zzRefill) {
                        i2 = i3;
                        c2 = 65535;
                    } else {
                        c2 = cArr[i7];
                        i6 = i7 + 1;
                    }
                }
                int i8 = iArr[iArr2[this.zzState] + cArr2[c2]];
                if (i8 == -1) {
                    i2 = i3;
                } else {
                    this.zzState = i8;
                    int i9 = iArr3[this.zzState];
                    if ((i9 & 1) == 1) {
                        i5 = this.zzState;
                        i4 = i6;
                        if ((i9 & 8) == 8) {
                            i2 = i3;
                        }
                    }
                }
            }
            this.zzMarkedPos = i4;
            switch (i5 < 0 ? i5 : ZZ_ACTION[i5]) {
                case 1:
                    throw new ParseException(this.yychar, 0, new Character(yycharat(0)));
                case 2:
                    return new Yytoken(0, Long.valueOf(yytext()));
                case 3:
                case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                case 30:
                case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                case 32:
                case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                case 47:
                case 48:
                    break;
                case 4:
                    StringBuffer stringBuffer = this.sb;
                    stringBuffer.delete(0, stringBuffer.length());
                    yybegin(2);
                    break;
                case 5:
                    return new Yytoken(1, (Object) null);
                case 6:
                    return new Yytoken(2, (Object) null);
                case 7:
                    return new Yytoken(3, (Object) null);
                case 8:
                    return new Yytoken(4, (Object) null);
                case 9:
                    return new Yytoken(5, (Object) null);
                case 10:
                    return new Yytoken(6, (Object) null);
                case 11:
                    this.sb.append(yytext());
                    break;
                case 12:
                    this.sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    break;
                case 13:
                    yybegin(0);
                    return new Yytoken(0, this.sb.toString());
                case 14:
                    this.sb.append('\"');
                    break;
                case 15:
                    this.sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                    break;
                case 16:
                    this.sb.append(8);
                    break;
                case 17:
                    this.sb.append(12);
                    break;
                case 18:
                    this.sb.append(10);
                    break;
                case 19:
                    this.sb.append(13);
                    break;
                case 20:
                    this.sb.append(9);
                    break;
                case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                    return new Yytoken(0, Double.valueOf(yytext()));
                case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                    return new Yytoken(0, (Object) null);
                case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                    return new Yytoken(0, Boolean.valueOf(yytext()));
                case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                    try {
                        this.sb.append((char) Integer.parseInt(yytext().substring(2), 16));
                        break;
                    } catch (Exception e2) {
                        throw new ParseException(this.yychar, 2, e2);
                    }
                default:
                    if (c2 != 65535 || this.zzStartRead != this.zzCurrentPos) {
                        zzScanError(1);
                        break;
                    } else {
                        this.zzAtEOF = true;
                        return null;
                    }
            }
            i3 = i2;
        }
    }

    public void yypushback(int i2) {
        if (i2 > yylength()) {
            zzScanError(2);
        }
        this.zzMarkedPos -= i2;
    }

    public final void yyreset(Reader reader) {
        this.zzReader = reader;
        this.zzAtBOL = true;
        this.zzAtEOF = false;
        this.zzStartRead = 0;
        this.zzEndRead = 0;
        this.zzMarkedPos = 0;
        this.zzCurrentPos = 0;
        this.yycolumn = 0;
        this.yychar = 0;
        this.yyline = 0;
        this.zzLexicalState = 0;
    }

    public final int yystate() {
        return this.zzLexicalState;
    }

    public final String yytext() {
        char[] cArr = this.zzBuffer;
        int i2 = this.zzStartRead;
        return new String(cArr, i2, this.zzMarkedPos - i2);
    }
}

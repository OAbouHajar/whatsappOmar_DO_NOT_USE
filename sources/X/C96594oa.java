package X;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.io.FileUtils;

/* renamed from: X.4oa  reason: invalid class name and case insensitive filesystem */
public class C96594oa implements C55132it {
    public static final Map A0r;
    public static final UUID A0s = new UUID(72057594037932032L, -9223371306706625679L);
    public static final byte[] A0t = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AnonymousClass4BH.A05);
    public static final byte[] A0u = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] A0v = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F = -9223372036854775807L;
    public long A0G = -1;
    public long A0H = -9223372036854775807L;
    public long A0I = -9223372036854775807L;
    public long A0J;
    public long A0K = -1;
    public long A0L = -1;
    public long A0M;
    public long A0N = -9223372036854775807L;
    public C15060qG A0O;
    public AnonymousClass4SL A0P;
    public AnonymousClass4TJ A0Q;
    public AnonymousClass4TJ A0R;
    public ByteBuffer A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int[] A0c;
    public final SparseArray A0d;
    public final AnonymousClass5LI A0e;
    public final C88694aw A0f;
    public final C90504eH A0g;
    public final C90504eH A0h;
    public final C90504eH A0i;
    public final C90504eH A0j;
    public final C90504eH A0k;
    public final C90504eH A0l;
    public final C90504eH A0m;
    public final C90504eH A0n;
    public final C90504eH A0o;
    public final C90504eH A0p;
    public final boolean A0q;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("htc_video_rotA-000", C13680ns.A0X());
        A0x.put("htc_video_rotA-090", 90);
        A0x.put("htc_video_rotA-180", 180);
        A0x.put("htc_video_rotA-270", 270);
        A0r = Collections.unmodifiableMap(A0x);
    }

    public C96594oa() {
        C96784ot r4 = new C96784ot();
        this.A0e = r4;
        r4.A03 = new C96774os(this);
        this.A0q = true;
        this.A0f = new C88694aw();
        this.A0d = new SparseArray();
        this.A0m = C90504eH.A05(4);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(-1);
        this.A0p = new C90504eH(allocate.array());
        this.A0n = C90504eH.A05(4);
        this.A0k = new C90504eH(C90674eb.A02);
        this.A0j = C90504eH.A05(4);
        this.A0l = new C90504eH();
        this.A0o = new C90504eH();
        this.A0h = C90504eH.A05(8);
        this.A0i = new C90504eH();
        this.A0g = new C90504eH();
        this.A0c = new int[1];
    }

    public static AnonymousClass4SL A00(C96594oa r0, int i2) {
        r0.A06(i2);
        return r0.A0P;
    }

    public static void A01(ByteBuffer byteBuffer, float f2) {
        byteBuffer.putShort((short) ((int) ((f2 * 50000.0f) + 0.5f)));
    }

    public static byte[] A02(String str, long j2, long j3) {
        C90524eJ.A03(AnonymousClass000.A1O((j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1))));
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - (((long) (i2 * 3600)) * SearchActionVerificationClientService.MS_TO_NS);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - (((long) (i3 * 60)) * SearchActionVerificationClientService.MS_TO_NS);
        int i4 = (int) (j5 / SearchActionVerificationClientService.MS_TO_NS);
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        AnonymousClass000.A1M(objArr, i2, 0);
        AnonymousClass000.A1M(objArr, i3, 1);
        AnonymousClass000.A1M(objArr, i4, 2);
        AnonymousClass000.A1M(objArr, (int) ((j5 - (((long) i4) * SearchActionVerificationClientService.MS_TO_NS)) / j3), 3);
        return String.format(locale, str, objArr).getBytes(AnonymousClass4BH.A05);
    }

    public final int A03(C55142iu r18, AnonymousClass4SL r19, int i2) {
        int Acz;
        int Acz2;
        int i3;
        byte[] bArr;
        AnonymousClass4SL r9 = r19;
        int i4 = i2;
        String str = r9.A0e;
        C55142iu r10 = r18;
        if ("S_TEXT/UTF8".equals(str)) {
            bArr = A0v;
        } else if ("S_TEXT/ASS".equals(str)) {
            bArr = A0u;
        } else {
            C32481gS r6 = r9.A0c;
            boolean z2 = true;
            if (!this.A0V) {
                if (r9.A0k) {
                    this.A02 &= -1073741825;
                    int i5 = 128;
                    if (!this.A0Y) {
                        C90504eH r7 = this.A0m;
                        r10.readFully(r7.A02, 0, 1);
                        this.A08++;
                        byte b2 = r7.A02[0];
                        if ((b2 & 128) != 128) {
                            this.A00 = b2;
                            this.A0Y = true;
                        } else {
                            throw AnonymousClass40M.A00("Extension bit is set in signal byte");
                        }
                    }
                    byte b3 = this.A00;
                    if ((b3 & 1) == 1) {
                        boolean A1R = AnonymousClass000.A1R(b3 & 2, 2);
                        this.A02 |= 1073741824;
                        if (!this.A0W) {
                            C90504eH r12 = this.A0h;
                            r10.readFully(r12.A02, 0, 8);
                            this.A08 += 8;
                            this.A0W = true;
                            C90504eH r13 = this.A0m;
                            byte[] bArr2 = r13.A02;
                            if (!A1R) {
                                i5 = 0;
                            }
                            bArr2[0] = (byte) (i5 | 8);
                            r13.A0S(0);
                            r6.Acx(r13, 1, 1);
                            this.A09++;
                            r12.A0S(0);
                            r6.Acx(r12, 8, 1);
                            this.A09 += 8;
                        }
                        if (A1R) {
                            if (!this.A0X) {
                                C90504eH r72 = this.A0m;
                                r10.readFully(r72.A02, 0, 1);
                                this.A08++;
                                r72.A0S(0);
                                this.A0B = r72.A0C();
                                this.A0X = true;
                            }
                            int i6 = this.A0B << 2;
                            C90504eH r14 = this.A0m;
                            r14.A0Q(i6);
                            r10.readFully(r14.A02, 0, i6);
                            this.A08 += i6;
                            short s2 = (short) ((this.A0B / 2) + 1);
                            int i7 = (s2 * 6) + 2;
                            ByteBuffer byteBuffer = this.A0S;
                            if (byteBuffer == null || byteBuffer.capacity() < i7) {
                                this.A0S = ByteBuffer.allocate(i7);
                            }
                            this.A0S.position(0);
                            this.A0S.putShort(s2);
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                i3 = this.A0B;
                                if (i8 >= i3) {
                                    break;
                                }
                                int A0E2 = r14.A0E();
                                int i10 = i8 % 2;
                                ByteBuffer byteBuffer2 = this.A0S;
                                int i11 = A0E2 - i9;
                                if (i10 == 0) {
                                    byteBuffer2.putShort((short) i11);
                                } else {
                                    byteBuffer2.putInt(i11);
                                }
                                i8++;
                                i9 = A0E2;
                            }
                            int i12 = (i2 - this.A08) - i9;
                            int i13 = i3 % 2;
                            ByteBuffer byteBuffer3 = this.A0S;
                            if (i13 == 1) {
                                byteBuffer3.putInt(i12);
                            } else {
                                byteBuffer3.putShort((short) i12);
                                this.A0S.putInt(0);
                            }
                            C90504eH r73 = this.A0i;
                            r73.A0U(this.A0S.array(), i7);
                            r6.Acx(r73, i7, 1);
                            this.A09 += i7;
                        }
                    }
                } else {
                    byte[] bArr3 = r9.A0o;
                    if (bArr3 != null) {
                        this.A0l.A0U(bArr3, bArr3.length);
                    }
                }
                if (r9.A0O > 0) {
                    this.A02 |= 268435456;
                    this.A0g.A0Q(0);
                    C90504eH r11 = this.A0m;
                    r11.A0Q(4);
                    byte[] bArr4 = r11.A02;
                    AnonymousClass3K4.A15(bArr4, i2 >> 24, 0);
                    AnonymousClass3K4.A15(bArr4, i2 >> 16, 1);
                    AnonymousClass3K4.A15(bArr4, i2 >> 8, 2);
                    AnonymousClass3K4.A15(bArr4, i4, 3);
                    r6.Acx(r11, 4, 2);
                    this.A09 += 4;
                }
                this.A0V = true;
            }
            C90504eH r74 = this.A0l;
            int i14 = r74.A00;
            int i15 = i2 + i14;
            String str2 = r9.A0e;
            if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
                AnonymousClass4S1 r2 = r9.A0d;
                if (r2 != null) {
                    if (i14 != 0) {
                        z2 = false;
                    }
                    C90524eJ.A04(z2);
                    if (!r2.A05) {
                        byte[] bArr5 = r2.A06;
                        r10.AaL(bArr5, 0, 10);
                        r10.AcS();
                        boolean z3 = false;
                        if (bArr5[4] == -8 && bArr5[5] == 114 && bArr5[6] == 111) {
                            byte b4 = bArr5[7];
                            if ((b4 & 254) == 186) {
                                if ((b4 & 255) == 187) {
                                    z3 = true;
                                }
                                char c2 = 8;
                                if (z3) {
                                    c2 = 9;
                                }
                                if ((40 << ((bArr5[c2] >> 4) & 7)) != 0) {
                                    r2.A05 = true;
                                }
                            }
                        }
                    }
                }
                while (true) {
                    int i16 = this.A08;
                    if (i16 >= i15) {
                        break;
                    }
                    int i17 = i15 - i16;
                    int A002 = C90504eH.A00(r74);
                    if (A002 > 0) {
                        Acz2 = Math.min(i17, A002);
                        r6.Acw(r74, Acz2);
                    } else {
                        Acz2 = r6.Acz(r10, i17, 0, false);
                    }
                    this.A08 += Acz2;
                    this.A09 += Acz2;
                }
            } else {
                C90504eH r132 = this.A0j;
                byte[] bArr6 = r132.A02;
                bArr6[0] = 0;
                bArr6[1] = 0;
                bArr6[2] = 0;
                int i18 = r9.A0R;
                int i19 = 4 - i18;
                while (this.A08 < i15) {
                    int i20 = this.A0A;
                    int A003 = C90504eH.A00(r74);
                    if (i20 == 0) {
                        int min = Math.min(i18, A003);
                        r10.readFully(bArr6, i19 + min, i18 - min);
                        if (min > 0) {
                            r74.A0V(bArr6, i19, min);
                        }
                        this.A08 += i18;
                        this.A0A = C90504eH.A02(r132, 0);
                        C90504eH r0 = this.A0k;
                        r0.A0S(0);
                        r6.Acw(r0, 4);
                        this.A09 += 4;
                    } else {
                        if (A003 > 0) {
                            Acz = Math.min(i20, A003);
                            r6.Acw(r74, Acz);
                        } else {
                            Acz = r6.Acz(r10, i20, 0, false);
                        }
                        this.A08 += Acz;
                        this.A09 += Acz;
                        this.A0A -= Acz;
                    }
                }
            }
            if ("A_VORBIS".equals(r9.A0e)) {
                C90504eH r02 = this.A0p;
                r02.A0S(0);
                r6.Acw(r02, 4);
                this.A09 += 4;
            }
            int i21 = this.A09;
            this.A08 = 0;
            this.A09 = 0;
            this.A0A = 0;
            this.A0V = false;
            this.A0Y = false;
            this.A0X = false;
            this.A0B = 0;
            this.A00 = 0;
            this.A0W = false;
            this.A0l.A0Q(0);
            return i21;
        }
        int length = bArr.length;
        int i22 = length + i2;
        C90504eH r3 = this.A0o;
        byte[] bArr7 = r3.A02;
        if (bArr7.length < i22) {
            byte[] copyOf = Arrays.copyOf(bArr, i22 + i2);
            r3.A0U(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr7, 0, length);
        }
        r10.readFully(r3.A02, length, i4);
        r3.A0S(0);
        r3.A0R(i22);
        int i212 = this.A09;
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0V = false;
        this.A0Y = false;
        this.A0X = false;
        this.A0B = 0;
        this.A00 = 0;
        this.A0W = false;
        this.A0l.A0Q(0);
        return i212;
    }

    public final long A04(long j2) {
        long j3 = this.A0N;
        if (j3 != -9223372036854775807L) {
            return AnonymousClass3C1.A05(j2, j3, 1000);
        }
        throw AnonymousClass40M.A00("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void A05(int i2) {
        if (this.A0R == null || this.A0Q == null) {
            StringBuilder A0r2 = AnonymousClass000.A0r("Element ");
            A0r2.append(i2);
            throw AnonymousClass40M.A00(AnonymousClass000.A0h(" must be in a Cues", A0r2));
        }
    }

    public final void A06(int i2) {
        if (this.A0P == null) {
            StringBuilder A0r2 = AnonymousClass000.A0r("Element ");
            A0r2.append(i2);
            throw AnonymousClass40M.A00(AnonymousClass000.A0h(" must be in a TrackEntry", A0r2));
        }
    }

    public final void A07(C55142iu r5, int i2) {
        C90504eH r3 = this.A0m;
        if (r3.A00 < i2) {
            int length = r3.A02.length;
            if (length < i2) {
                r3.A0P(Math.max(length << 1, i2));
            }
            byte[] bArr = r3.A02;
            int i3 = r3.A00;
            r5.readFully(bArr, i3, i2 - i3);
            r3.A0R(i2);
        }
    }

    public final void A08(AnonymousClass4SL r18, int i2, int i3, int i4, long j2) {
        byte[] A022;
        int i5;
        String str;
        AnonymousClass4SL r7 = r18;
        int i6 = i3;
        int i7 = i2;
        AnonymousClass4S1 r2 = r7.A0d;
        int i8 = i4;
        long j3 = j2;
        if (r2 == null) {
            String str2 = r7.A0e;
            if ("S_TEXT/UTF8".equals(str2) || "S_TEXT/ASS".equals(str2)) {
                if (this.A03 > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j4 = this.A0D;
                    if (j4 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        C90504eH r8 = this.A0o;
                        byte[] bArr = r8.A02;
                        if (str2.equals("S_TEXT/ASS")) {
                            A022 = A02("%01d:%02d:%02d:%02d", j4, 10000);
                            i5 = 21;
                        } else if (str2.equals("S_TEXT/UTF8")) {
                            A022 = A02("%02d:%02d:%02d,%03d", j4, 1000);
                            i5 = 19;
                        } else {
                            throw AnonymousClass3K3.A0f();
                        }
                        System.arraycopy(A022, 0, bArr, i5, A022.length);
                        int i9 = r8.A01;
                        while (true) {
                            if (i9 >= r8.A00) {
                                break;
                            } else if (r8.A02[i9] == 0) {
                                r8.A0R(i9);
                                break;
                            } else {
                                i9++;
                            }
                        }
                        r7.A0c.Acw(r8, r8.A00);
                        i6 = i3 + r8.A00;
                    }
                }
                Log.w("MatroskaExtractor", str);
            }
            if ((268435456 & i2) != 0) {
                if (this.A03 > 1) {
                    i7 = i2 & -268435457;
                } else {
                    C90504eH r3 = this.A0g;
                    int i10 = r3.A00;
                    r7.A0c.Acx(r3, i10, 2);
                    i6 += i10;
                }
            }
            r7.A0c.Ad0(r7.A0b, i7, i6, i8, j3);
        } else if (r2.A05) {
            int i11 = r2.A02;
            int i12 = i11 + 1;
            r2.A02 = i12;
            if (i11 == 0) {
                r2.A04 = j3;
                r2.A00 = i7;
                r2.A03 = 0;
            }
            r2.A03 += i3;
            r2.A01 = i8;
            if (i12 >= 16) {
                r2.A00(r7);
            }
        }
        this.A0U = true;
    }

    public final void AHx(C15060qG r1) {
        this.A0O = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v109, resolved type: X.1kb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v113, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v114, resolved type: X.1kb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v116, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v117, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v118, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v119, resolved type: X.1kb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v131, resolved type: X.1kb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v537, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v144, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v145, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v156, resolved type: X.1kb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v157, resolved type: X.1kb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v158, resolved type: X.1kb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v160, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v161, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v165, resolved type: X.1kb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v167, resolved type: X.1kb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v169, resolved type: X.1kb} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b9, code lost:
        if (r12.equals(r0) == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01bb, code lost:
        r23 = r24.A0S;
        r1 = 4;
        r10 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c7, code lost:
        switch(r2) {
            case -2095576542: goto L_0x030e;
            case -2095575984: goto L_0x0305;
            case -1985379776: goto L_0x02fc;
            case -1784763192: goto L_0x02f3;
            case -1730367663: goto L_0x02ea;
            case -1482641358: goto L_0x02e1;
            case -1482641357: goto L_0x02d8;
            case -1373388978: goto L_0x02cf;
            case -933872740: goto L_0x02c6;
            case -538363189: goto L_0x02bd;
            case -538363109: goto L_0x02b4;
            case -425012669: goto L_0x02ab;
            case -356037306: goto L_0x02a2;
            case 62923557: goto L_0x0299;
            case 62923603: goto L_0x0290;
            case 62927045: goto L_0x0286;
            case 82318131: goto L_0x027c;
            case 82338133: goto L_0x0272;
            case 82338134: goto L_0x0268;
            case 99146302: goto L_0x025e;
            case 444813526: goto L_0x0254;
            case 542569478: goto L_0x024a;
            case 635596514: goto L_0x0240;
            case 725948237: goto L_0x0236;
            case 725957860: goto L_0x022c;
            case 738597099: goto L_0x0222;
            case 855502857: goto L_0x0218;
            case 1422270023: goto L_0x020e;
            case 1809237540: goto L_0x0204;
            case 1950749482: goto L_0x01fa;
            case 1950789798: goto L_0x01f0;
            case 1951062397: goto L_0x01e6;
            default: goto L_0x01ca;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ca, code lost:
        r18 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cc, code lost:
        r17 = "audio/raw";
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01df, code lost:
        switch(r18) {
            case 0: goto L_0x05c0;
            case 1: goto L_0x05c0;
            case 2: goto L_0x0546;
            case 3: goto L_0x053a;
            case 4: goto L_0x049b;
            case 5: goto L_0x0492;
            case 6: goto L_0x048f;
            case 7: goto L_0x0406;
            case 8: goto L_0x03f3;
            case 9: goto L_0x05c0;
            case 10: goto L_0x03d6;
            case 11: goto L_0x03c8;
            case 12: goto L_0x03c4;
            case 13: goto L_0x039c;
            case 14: goto L_0x0398;
            case 15: goto L_0x0394;
            case 16: goto L_0x0390;
            case 17: goto L_0x038c;
            case 18: goto L_0x0388;
            case 19: goto L_0x0382;
            case 20: goto L_0x037e;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_singleLine :int: goto L_0x0394;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_ellipsize :int: goto L_0x0597;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_maxLines :int: goto L_0x0373;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_size :int: goto L_0x0361;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_style :int: goto L_0x0351;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_customFont :int: goto L_0x0334;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowColor :int: goto L_0x0330;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowRadius :int: goto L_0x032c;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowXOffset :int: goto L_0x0328;
            case 30: goto L_0x031a;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_colorNormal :int: goto L_0x04f7;
            default: goto L_0x01e2;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e2, code lost:
        r0 = "Unrecognized codec identifier.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01e6, code lost:
        r0 = r12.equals("A_OPUS");
        r18 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01f0, code lost:
        r0 = r12.equals("A_FLAC");
        r18 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01fa, code lost:
        r0 = r12.equals("A_EAC3");
        r18 = 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0204, code lost:
        r0 = r12.equals("V_MPEG2");
        r18 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020e, code lost:
        r0 = r12.equals("S_TEXT/UTF8");
        r18 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0218, code lost:
        r0 = r12.equals("V_MPEGH/ISO/HEVC");
        r18 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0222, code lost:
        r0 = r12.equals("S_TEXT/ASS");
        r18 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x022c, code lost:
        r0 = r12.equals("A_PCM/INT/LIT");
        r18 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0236, code lost:
        r0 = r12.equals("A_PCM/INT/BIG");
        r18 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0240, code lost:
        r0 = r12.equals("A_PCM/FLOAT/IEEE");
        r18 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x024a, code lost:
        r0 = r12.equals("A_DTS/EXPRESS");
        r18 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0254, code lost:
        r0 = r12.equals("V_THEORA");
        r18 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x025e, code lost:
        r0 = r12.equals("S_HDMV/PGS");
        r18 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0268, code lost:
        r0 = r12.equals("V_VP9");
        r18 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0272, code lost:
        r0 = r12.equals("V_VP8");
        r18 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x027c, code lost:
        r0 = r12.equals("V_AV1");
        r18 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0286, code lost:
        r0 = r12.equals("A_DTS");
        r18 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0290, code lost:
        r0 = r12.equals("A_AC3");
        r18 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0299, code lost:
        r0 = r12.equals("A_AAC");
        r18 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a2, code lost:
        r0 = r12.equals("A_DTS/LOSSLESS");
        r18 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ab, code lost:
        r0 = r12.equals("S_VOBSUB");
        r18 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b4, code lost:
        r0 = r12.equals("V_MPEG4/ISO/AVC");
        r18 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02bd, code lost:
        r0 = r12.equals("V_MPEG4/ISO/ASP");
        r18 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c6, code lost:
        r0 = r12.equals("S_DVBSUB");
        r18 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02cf, code lost:
        r0 = r12.equals("V_MS/VFW/FOURCC");
        r18 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d8, code lost:
        r0 = r12.equals("A_MPEG/L3");
        r18 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e1, code lost:
        r0 = r12.equals("A_MPEG/L2");
        r18 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ea, code lost:
        r0 = r12.equals("A_VORBIS");
        r18 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f3, code lost:
        r0 = r12.equals("A_TRUEHD");
        r18 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02fc, code lost:
        r0 = r12.equals("A_MS/ACM");
        r18 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0305, code lost:
        r0 = r12.equals("V_MPEG4/ISO/SP");
        r18 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x030e, code lost:
        r0 = r12.equals("V_MPEG4/ISO/AP");
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0316, code lost:
        if (r0 != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x031a, code lost:
        r17 = "audio/flac";
        r2 = java.util.Collections.singletonList(r24.A00(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0328, code lost:
        r17 = "audio/eac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x032c, code lost:
        r17 = "video/mpeg2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0330, code lost:
        r17 = "application/x-subrip";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0334, code lost:
        r11 = X.C88014Zo.A00(new X.C90504eH(r24.A00(r12)));
        r2 = r11.A02;
        r24.A0R = r11.A00;
        r14 = r11.A01;
        r17 = "video/hevc";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0351, code lost:
        r17 = "text/x-ssa";
        r2 = X.C34641kb.of(A0t, r24.A00(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0361, code lost:
        r0 = r24.A0D;
        r1 = X.AnonymousClass3C1.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0369, code lost:
        if (r1 != 0) goto L_0x05ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x036b, code lost:
        r12 = X.AnonymousClass000.A0o();
        r1 = "Unsupported little endian PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0373, code lost:
        r0 = r24.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0377, code lost:
        if (r0 != 8) goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0379, code lost:
        r2 = null;
        r14 = null;
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x037e, code lost:
        r17 = "video/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0382, code lost:
        r2 = null;
        r14 = null;
        r17 = "application/pgs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0388, code lost:
        r17 = "video/x-vnd.on2.vp9";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x038c, code lost:
        r17 = "video/x-vnd.on2.vp8";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0390, code lost:
        r17 = "video/av01";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0394, code lost:
        r17 = "audio/vnd.dts";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0398, code lost:
        r17 = "audio/ac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x039c, code lost:
        r2 = java.util.Collections.singletonList(r24.A00(r12));
        r11 = r24.A0l;
        r11 = X.C89734co.A01(new X.C90204dh(r11, r11.length), false);
        r0 = r24;
        r0.A0U = r11.A01;
        r0.A0F = r11.A00;
        r14 = r11.A02;
        r17 = "audio/mp4a-latm";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03c4, code lost:
        r17 = "audio/vnd.dts.hd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03c8, code lost:
        r17 = "application/vobsub";
        r2 = X.C34641kb.of(r24.A00(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03d6, code lost:
        r11 = X.C88274aE.A00(new X.C90504eH(r24.A00(r12)));
        r2 = r11.A05;
        r24.A0R = r11.A02;
        r14 = r11.A04;
        r17 = "video/avc";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03f3, code lost:
        r2 = new byte[4];
        java.lang.System.arraycopy(r24.A00(r12), 0, r2, 0, 4);
        r17 = "application/dvbsubs";
        r2 = X.C34641kb.of(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0406, code lost:
        r1 = new X.C90504eH(r24.A00(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        r1.A0T(16);
        r14 = r1.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x041d, code lost:
        if (r14 != 1482049860) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x041f, code lost:
        r1 = new android.util.Pair("video/divx", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x042c, code lost:
        if (r14 != 859189832) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x042e, code lost:
        r1 = new android.util.Pair("video/3gpp", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x043b, code lost:
        if (r14 != 826496599) goto L_0x0473;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x043d, code lost:
        r12 = r1.A01 + 20;
        r11 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0443, code lost:
        r2 = r11.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0446, code lost:
        if (r12 >= (r2 - 4)) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x044a, code lost:
        if (r11[r12] != 0) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0450, code lost:
        if (r11[r12 + 1] != 0) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0456, code lost:
        if (r11[r12 + 2] != 1) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x045e, code lost:
        if (r11[r12 + 3] != 15) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0460, code lost:
        r1 = new android.util.Pair("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(r11, r12, r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0470, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0473, code lost:
        android.util.Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        r1 = new android.util.Pair("video/x-unknown", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x047f, code lost:
        r17 = r1.first;
        r2 = (java.util.List) r1.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x048f, code lost:
        r17 = "audio/mpeg";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0492, code lost:
        r17 = "audio/mpeg-L2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0494, code lost:
        r2 = null;
        r14 = null;
        r1 = -1;
        r11 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x049b, code lost:
        r11 = 8192;
        r14 = r24.A00(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04a8, code lost:
        if (r14[0] != 2) goto L_0x1094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04aa, code lost:
        r2 = 1;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04b1, code lost:
        if ((r14[r2] & 255) != 255) goto L_0x04b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04b3, code lost:
        r0 = r0 + android.support.v4.view.MotionEventCompat.ACTION_MASK;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04b8, code lost:
        r15 = r2 + 1;
        r0 = r0 + (r14[r2] & android.support.v4.view.MotionEventCompat.ACTION_MASK);
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04c2, code lost:
        if ((r14[r15] & 255) != 255) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04c4, code lost:
        r1 = r1 + android.support.v4.view.MotionEventCompat.ACTION_MASK;
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04c9, code lost:
        r2 = r15 + 1;
        r1 = r1 + (r14[r15] & android.support.v4.view.MotionEventCompat.ACTION_MASK);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04d1, code lost:
        if (r14[r2] != 1) goto L_0x108f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04d3, code lost:
        r12 = new byte[r0];
        java.lang.System.arraycopy(r14, r2, r12, 0, r0);
        r2 = r2 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04db, code lost:
        if (r14[r2] != 3) goto L_0x108a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04dd, code lost:
        r2 = r2 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04e1, code lost:
        if (r14[r2] != 5) goto L_0x1099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04e3, code lost:
        r1 = r14.length - r2;
        r0 = new byte[r1];
        java.lang.System.arraycopy(r14, r2, r0, 0, r1);
        r2 = X.C13690nt.A0i(2);
        r2.add(r12);
        r2.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04f4, code lost:
        r17 = "audio/vorbis";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04f7, code lost:
        r11 = 5760;
        r2 = X.C13690nt.A0i(3);
        r2.add(r24.A00(r12));
        r0 = java.nio.ByteBuffer.allocate(8);
        r14 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r12 = r0.order(r14);
        r12.putLong(r24.A0Y);
        r2.add(r12.array());
        r12 = java.nio.ByteBuffer.allocate(8).order(r14);
        r12.putLong(r24.A0Z);
        r2.add(r12.array());
        r17 = "audio/opus";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0536, code lost:
        r14 = null;
        r1 = -1;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x053a, code lost:
        r24.A0d = new X.AnonymousClass4S1();
        r17 = "audio/true-hd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0546, code lost:
        r1 = new X.C90504eH(r24.A00(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        r12 = r1.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0555, code lost:
        if (r12 == 1) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x055a, code lost:
        if (r12 != 65534) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x055c, code lost:
        r1.A0S(24);
        r18 = r1.A0H();
        r15 = A0s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x056d, code lost:
        if (r18 != r15.getMostSignificantBits()) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0579, code lost:
        if (r1.A0H() != r15.getLeastSignificantBits()) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x057c, code lost:
        r12 = X.AnonymousClass000.A0r("Non-PCM MS/ACM is unsupported. Setting mimeType to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0583, code lost:
        r0 = r24.A0D;
        r1 = X.AnonymousClass3C1.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x058b, code lost:
        if (r1 != 0) goto L_0x05ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x058d, code lost:
        r12 = X.AnonymousClass000.A0o();
        r1 = "Unsupported PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0593, code lost:
        r12.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0597, code lost:
        r0 = r24.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x059d, code lost:
        if (r0 == 32) goto L_0x05ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x059f, code lost:
        r1 = "Unsupported floating point PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05a1, code lost:
        r12 = X.AnonymousClass000.A0r(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05a5, code lost:
        r12.append(r0);
        r12.append(". Setting mimeType to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x05ab, code lost:
        android.util.Log.w("MatroskaExtractor", X.AnonymousClass000.A0h("audio/x-unknown", r12));
        r17 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05b4, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05b6, code lost:
        if (r0 != 16) goto L_0x05bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05b8, code lost:
        r1 = 268435456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05ba, code lost:
        r2 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05bd, code lost:
        r1 = "Unsupported big endian PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05c0, code lost:
        r0 = r24.A0l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05c4, code lost:
        if (r0 != null) goto L_0x082e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05c6, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05c7, code lost:
        r17 = "video/mp4v-es";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05c9, code lost:
        r14 = null;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05ca, code lost:
        r1 = -1;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05cb, code lost:
        r11 = -1;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05cc, code lost:
        r12 = r24.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05d0, code lost:
        if (r12 == null) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05d2, code lost:
        r0 = X.AnonymousClass4ZI.A00(new X.C90504eH(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05db, code lost:
        if (r0 == null) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05dd, code lost:
        r14 = r0.A00;
        r17 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05e1, code lost:
        r0 = r24;
        r13 = r0.A0h;
        r12 = r0.A0i;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05e8, code lost:
        if (r12 == false) goto L_0x05eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05ea, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05eb, code lost:
        r13 = r13 | r0;
        r12 = X.AnonymousClass3K4.A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05f4, code lost:
        if (X.C90834eu.A03(r17) == false) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05f6, code lost:
        r12.A04 = r24.A0F;
        r12.A0D = r24.A0U;
        r12.A09 = r1;
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0605, code lost:
        r1 = r24.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0609, code lost:
        if (r1 == null) goto L_0x0619;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0611, code lost:
        if (A0r.containsKey(r1) != false) goto L_0x0619;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0613, code lost:
        r12.A0P = r24.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0619, code lost:
        r12.A0O = java.lang.Integer.toString(r23);
        r12.A0R = r17;
        r12.A08 = r11;
        r12.A0Q = r24.A0f;
        r12.A0E = r13;
        r12.A0S = r2;
        r12.A0M = r14;
        r12.A0I = r24.A0a;
        r2 = new X.C32491gT(r12);
        r1 = r25.Ah1(r24.A0S, r10);
        r0 = r24;
        r0.A0c = r1;
        r1.A9D(r2);
        r7.A0d.put(r0.A0S, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x065a, code lost:
        if (X.C90834eu.A05(r17) == false) goto L_0x07fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0660, code lost:
        if (r24.A0L != 0) goto L_0x07f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0662, code lost:
        r0 = r24;
        r1 = r0.A0M;
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0667, code lost:
        if (r1 != -1) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0669, code lost:
        r1 = r0.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x066b, code lost:
        r0.A0M = r1;
        r1 = r0.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x066f, code lost:
        if (r1 != -1) goto L_0x0673;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0671, code lost:
        r1 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0673, code lost:
        r0.A0K = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0675, code lost:
        r8 = -1.0f;
        r0 = r24;
        r6 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x067b, code lost:
        if (r6 == r10) goto L_0x068c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x067d, code lost:
        r1 = r0.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x067f, code lost:
        if (r1 == r10) goto L_0x068c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0681, code lost:
        r8 = ((float) (r0.A0N * r6)) / ((float) (r24.A0X * r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0690, code lost:
        if (r24.A0j == false) goto L_0x076d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x069a, code lost:
        if (r24.A06 == -1.0f) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06a2, code lost:
        if (r24.A07 == -1.0f) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06aa, code lost:
        if (r24.A04 == -1.0f) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06b2, code lost:
        if (r24.A05 == -1.0f) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06ba, code lost:
        if (r24.A02 == -1.0f) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06c2, code lost:
        if (r24.A03 == -1.0f) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06ca, code lost:
        if (r24.A0B == -1.0f) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x06d2, code lost:
        if (r24.A0C == -1.0f) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06da, code lost:
        if (r24.A00 == -1.0f) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x06e2, code lost:
        if (r24.A01 == -1.0f) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06e4, code lost:
        r6 = new byte[25];
        r1 = java.nio.ByteBuffer.wrap(r6).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r1.put((byte) 0);
        r1.putShort((short) ((int) ((r24.A06 * 50000.0f) + 0.5f)));
        A01(r1, r24.A07);
        A01(r1, r24.A04);
        A01(r1, r24.A05);
        A01(r1, r24.A02);
        A01(r1, r24.A03);
        A01(r1, r24.A0B);
        A01(r1, r24.A0C);
        r1.putShort((short) ((int) (r24.A00 + 0.5f)));
        r1.putShort((short) ((int) (r24.A01 + 0.5f)));
        r1.putShort((short) r24.A0P);
        r1.putShort((short) r24.A0Q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x075a, code lost:
        r3 = new X.C93704jd(r24.A0H, r6, r24.A0G, r24.A0I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x076d, code lost:
        r0 = r24.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0771, code lost:
        if (r0 == null) goto L_0x0787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0773, code lost:
        r1 = A0r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0779, code lost:
        if (r1.containsKey(r0) == false) goto L_0x0787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x077b, code lost:
        r10 = X.AnonymousClass000.A0D(r1.get(r24.A0g));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x078b, code lost:
        if (r24.A0T != 0) goto L_0x07f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0796, code lost:
        if (java.lang.Float.compare(r24.A0A, 0.0f) != 0) goto L_0x07f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0798, code lost:
        r1 = r24.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07a0, code lost:
        if (java.lang.Float.compare(r1, 0.0f) != 0) goto L_0x07f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07aa, code lost:
        if (java.lang.Float.compare(r24.A09, 0.0f) == 0) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x07b2, code lost:
        if (java.lang.Float.compare(r1, 90.0f) != 0) goto L_0x07d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07b4, code lost:
        r9 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x07b6, code lost:
        r12.A0G = r24.A0X;
        r12.A07 = r24.A0N;
        r12.A01 = r8;
        r12.A0C = r9;
        r12.A0T = r24.A0n;
        r12.A0F = r24.A0V;
        r12.A0K = r3;
        r10 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07dd, code lost:
        if (java.lang.Float.compare(r1, -180.0f) == 0) goto L_0x07f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07e5, code lost:
        if (java.lang.Float.compare(r1, 180.0f) == 0) goto L_0x07f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x07e7, code lost:
        r9 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x07ef, code lost:
        if (java.lang.Float.compare(r1, -90.0f) == 0) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07f1, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07f3, code lost:
        r9 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07f6, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07f9, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0802, code lost:
        if ("application/x-subrip".equals(r17) != false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x080a, code lost:
        if ("text/x-ssa".equals(r17) != false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0814, code lost:
        if ("application/vobsub".equals(r17) != false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x081e, code lost:
        if ("application/pgs".equals(r17) != false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0828, code lost:
        if ("application/dvbsubs".equals(r17) != false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x082a, code lost:
        r0 = "Unexpected MIME type.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x082e, code lost:
        r2 = java.util.Collections.singletonList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x083a, code lost:
        throw X.AnonymousClass40M.A00("Failed to find FourCC VC1 initialization data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x083b, code lost:
        r0 = "Error parsing FourCC private data";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x083f, code lost:
        r0 = "Error parsing MS/ACM codec private";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x092b, code lost:
        if (r1 == 2) goto L_0x0d2f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x092e, code lost:
        if (r1 == 3) goto L_0x0cb0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0930, code lost:
        if (r1 == 4) goto L_0x0a07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0932, code lost:
        r0 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0938, code lost:
        if (r0 == 4) goto L_0x094a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x093c, code lost:
        if (r0 == 8) goto L_0x094a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x093e, code lost:
        r0 = X.C13680ns.A0j(X.AnonymousClass000.A0r("Invalid float size: "), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x094a, code lost:
        r11 = (int) r0;
        r13 = r7.A06;
        r12 = 0;
        r28.readFully(r13, 0, r11);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0955, code lost:
        if (r12 >= r11) goto L_0x0963;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0957, code lost:
        r0 = (r0 << 8) | ((long) (r13[r12] & 255));
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0963, code lost:
        if (r11 != 4) goto L_0x097f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0965, code lost:
        r0 = (double) java.lang.Float.intBitsToFloat((int) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x096b, code lost:
        r6 = ((X.C96774os) r3).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0971, code lost:
        if (r8 == 181) goto L_0x09fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0975, code lost:
        if (r8 == 17545) goto L_0x09f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0977, code lost:
        switch(r8) {
            case 21969: goto L_0x099f;
            case 21970: goto L_0x09a8;
            case 21971: goto L_0x09b1;
            case 21972: goto L_0x09ba;
            case 21973: goto L_0x09c3;
            case 21974: goto L_0x09cc;
            case 21975: goto L_0x09d5;
            case 21976: goto L_0x09de;
            case 21977: goto L_0x09e7;
            case 21978: goto L_0x09f0;
            default: goto L_0x097a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x097a, code lost:
        switch(r8) {
            case 30323: goto L_0x0984;
            case 30324: goto L_0x098d;
            case 30325: goto L_0x0996;
            default: goto L_0x097d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x097f, code lost:
        r0 = java.lang.Double.longBitsToDouble(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0984, code lost:
        A00(r6, r8).A0A = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x098d, code lost:
        A00(r6, r8).A08 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0996, code lost:
        A00(r6, r8).A09 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x099f, code lost:
        A00(r6, r8).A06 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x09a8, code lost:
        A00(r6, r8).A07 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x09b1, code lost:
        A00(r6, r8).A04 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x09ba, code lost:
        A00(r6, r8).A05 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x09c3, code lost:
        A00(r6, r8).A02 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x09cc, code lost:
        A00(r6, r8).A03 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x09d5, code lost:
        A00(r6, r8).A0B = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x09de, code lost:
        A00(r6, r8).A0C = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x09e7, code lost:
        A00(r6, r8).A00 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x09f0, code lost:
        A00(r6, r8).A01 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x09f9, code lost:
        r6.A0H = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x09fe, code lost:
        A00(r6, 181).A0U = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0a07, code lost:
        r9 = (int) r7.A02;
        r6 = ((X.C96774os) r3).A00;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0a15, code lost:
        if (r8 == 161) goto L_0x0ace;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0a17, code lost:
        if (r8 == 163) goto L_0x0ace;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0a1b, code lost:
        if (r8 == 165) goto L_0x0a6b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0a1f, code lost:
        if (r8 == 16877) goto L_0x0a56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0a23, code lost:
        if (r8 == 16981) goto L_0x0a4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0a27, code lost:
        if (r8 == 18402) goto L_0x0ab3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0a2b, code lost:
        if (r8 == 21419) goto L_0x0a97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0a2f, code lost:
        if (r8 == 25506) goto L_0x0a44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0a33, code lost:
        if (r8 != 30322) goto L_0x0a8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0a35, code lost:
        r1 = new byte[r9];
        A00(r6, r8).A0n = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0a3d, code lost:
        r28.readFully(r1, 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0a44, code lost:
        r1 = new byte[r9];
        A00(r6, r8).A0l = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0a4d, code lost:
        r1 = new byte[r9];
        A00(r6, r8).A0o = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0a56, code lost:
        r2 = A00(r6, 16877);
        r1 = r2.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0a5f, code lost:
        if (r1 == 1685485123) goto L_0x0a66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0a64, code lost:
        if (r1 != 1685480259) goto L_0x0ac7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a66, code lost:
        r1 = new byte[r9];
        r2.A0m = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a6d, code lost:
        if (r6.A05 != 2) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a6f, code lost:
        r1 = (X.AnonymousClass4SL) r6.A0d.get(r6.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0a7b, code lost:
        if (r6.A01 != 4) goto L_0x0ac7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0a85, code lost:
        if ("V_VP9".equals(r1.A0e) == false) goto L_0x0ac7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0a87, code lost:
        r0 = r6.A0g;
        r0.A0Q(r9);
        r1 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0a8f, code lost:
        r0 = X.C13680ns.A0c(r8, "Unexpected id: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0a97, code lost:
        r3 = r6.A0n;
        java.util.Arrays.fill(r3.A02, (byte) 0);
        r28.readFully(r3.A02, 4 - r9, r9);
        r3.A0S(0);
        r6.A0C = (int) r3.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0ab3, code lost:
        r2 = new byte[r9];
        r28.readFully(r2, 0, r9);
        A00(r6, 18402).A0b = new X.C86824Uh(1, r2, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0ac7, code lost:
        r28.Afx(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0ace, code lost:
        r3 = r6.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0ad2, code lost:
        if (r3 != 0) goto L_0x0af4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0ad4, code lost:
        r11 = r6.A0f;
        r6.A06 = (int) r11.A00(r28, 8, false, true);
        r6.A07 = r11.A00;
        r6.A0D = -9223372036854775807L;
        r6.A05 = 1;
        r3 = 1;
        r6.A0m.A0Q(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0af4, code lost:
        r0 = (X.AnonymousClass4SL) r6.A0d.get(r6.A06);
        r18 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0b02, code lost:
        if (r0 != null) goto L_0x0b10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0b04, code lost:
        r28.Afx(r9 - r6.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0b0c, code lost:
        r6.A05 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0b10, code lost:
        if (r3 != 1) goto L_0x0b63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0b12, code lost:
        r6.A07(r28, 3);
        r12 = r6.A0m;
        r14 = (r12.A02[2] & 6) >> 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0b23, code lost:
        if (r14 != 0) goto L_0x0ba2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0b25, code lost:
        r6.A03 = 1;
        r1 = r6.A0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0b29, code lost:
        if (r1 != null) goto L_0x0b98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0b2b, code lost:
        r1 = new int[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0b2d, code lost:
        r6.A0c = r1;
        r1[0] = (r9 - r6.A07) - 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0b35, code lost:
        r9 = r12.A02;
        r6.A0E = r6.A0F + r6.A04((long) ((r9[0] << 8) | (r9[1] & 255)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0b4e, code lost:
        if (r18.A0W == 2) goto L_0x0b5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0b52, code lost:
        if (r8 != 163) goto L_0x0b96;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0b59, code lost:
        if ((r9[2] & 128) != 128) goto L_0x0b96;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0b5b, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0b5c, code lost:
        r6.A02 = r0;
        r6.A05 = 2;
        r6.A04 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0b65, code lost:
        if (r8 != 163) goto L_0x0c89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0b67, code lost:
        r1 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0b6b, code lost:
        if (r1 >= r6.A03) goto L_0x0b0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0b6d, code lost:
        r0 = r18;
        r6.A08(r18, r6.A02, r6.A03(r28, r0, r6.A0c[r1]), 0, ((long) ((r6.A04 * r0.A0J) / 1000)) + r6.A0E);
        r6.A04++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0b96, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0b99, code lost:
        if (r1.length >= 1) goto L_0x0b2d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0b9b, code lost:
        r1 = new int[java.lang.Math.max(0, 1)];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0ba2, code lost:
        r11 = 4;
        r6.A07(r28, 4);
        r3 = (r12.A02[3] & 255) + 1;
        r6.A03 = r3;
        r1 = r6.A0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0bb3, code lost:
        if (r1 != null) goto L_0x0bc6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0bb5, code lost:
        r1 = new int[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0bb7, code lost:
        r6.A0c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0bba, code lost:
        if (r14 != 2) goto L_0x0bd2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0bbc, code lost:
        java.util.Arrays.fill(r1, 0, r3, ((r9 - r6.A07) - 4) / r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0bc6, code lost:
        r0 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0bc7, code lost:
        if (r0 >= r3) goto L_0x0bb7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0bc9, code lost:
        r1 = new int[java.lang.Math.max(r0 << 1, r3)];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0bd2, code lost:
        if (r14 != 1) goto L_0x0bfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0bd4, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0bd5, code lost:
        r2 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0bd9, code lost:
        if (r3 >= (r2 - 1)) goto L_0x0c7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0bdb, code lost:
        r1[r3] = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0bdd, code lost:
        r11 = r11 + 1;
        r6.A07(r28, r11);
        r2 = r12.A02[r11 - 1] & android.support.v4.view.MotionEventCompat.ACTION_MASK;
        r1 = r6.A0c;
        r1[r3] = r1[r3] + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0bf2, code lost:
        if (r2 == 255) goto L_0x0bdd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0bf4, code lost:
        r10 = r10 + r1[r3];
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0bfa, code lost:
        if (r14 != 3) goto L_0x0ca8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0bfc, code lost:
        r14 = 0;
        r17 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0bff, code lost:
        r2 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0c03, code lost:
        if (r14 >= (r2 - 1)) goto L_0x0c77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0c05, code lost:
        r1[r14] = 0;
        r11 = r11 + 1;
        r6.A07(r28, r11);
        r2 = r12.A02;
        r3 = r11 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0c14, code lost:
        if (r2[r3] != 0) goto L_0x0c1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0c16, code lost:
        r0 = "No valid varint length mask found";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0c1a, code lost:
        r1 = 1 << (7 - r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0c21, code lost:
        if ((r2[r3] & r1) == 0) goto L_0x0c42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0c23, code lost:
        r11 = r11 + r10;
        r6.A07(r28, r11);
        r15 = r12.A02;
        r0 = r3 + 1;
        r2 = (long) ((r15[r3] & android.support.v4.view.MotionEventCompat.ACTION_MASK) & (r1 ^ -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0c34, code lost:
        if (r0 >= r11) goto L_0x0c4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0c36, code lost:
        r2 = (r2 << 8) | ((long) (r15[r0] & 255));
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0c42, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0c46, code lost:
        if (r10 < 8) goto L_0x0c1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0c48, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0c4b, code lost:
        if (r14 <= 0) goto L_0x0c57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0c4d, code lost:
        r2 = r2 - ((1 << ((r10 * 7) + 6)) - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0c5c, code lost:
        if (r2 < -2147483648L) goto L_0x0ca4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0c63, code lost:
        if (r2 > 2147483647L) goto L_0x0ca4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0c65, code lost:
        r10 = (int) r2;
        r1 = r6.A0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0c68, code lost:
        if (r14 == 0) goto L_0x0c6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0c6a, code lost:
        r10 = r10 + r1[r14 - 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0c6f, code lost:
        r1[r14] = r10;
        r17 = r17 + r10;
        r14 = r14 + 1;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0c77, code lost:
        r2 = r2 - 1;
        r9 = ((r9 - r6.A07) - r11) - r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0c7f, code lost:
        r2 = r2 - 1;
        r9 = ((r9 - r6.A07) - r11) - r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0c85, code lost:
        r1[r2] = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0c89, code lost:
        r8 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0c8d, code lost:
        if (r8 >= r6.A03) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0c8f, code lost:
        r3 = r6.A0c;
        r3[r8] = r6.A03(r28, r18, r3[r8]);
        r6.A04++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0ca4, code lost:
        r0 = "EBML lacing sample size out of range.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0ca8, code lost:
        r0 = X.C13680ns.A0c(r14, "Unexpected lacing value: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0cb0, code lost:
        r0 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0cb7, code lost:
        if (r0 > 2147483647L) goto L_0x0d23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0cb9, code lost:
        r9 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0cba, code lost:
        if (r9 != 0) goto L_0x0cdb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0cbc, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0cbe, code lost:
        r1 = ((X.C96774os) r3).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0cc4, code lost:
        if (r8 == 134) goto L_0x0d1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0cc8, code lost:
        if (r8 == 17026) goto L_0x0cfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0ccc, code lost:
        if (r8 == 21358) goto L_0x0cf2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0cd1, code lost:
        if (r8 != 2274716) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0cd3, code lost:
        A00(r1, 2274716).A0f = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0cdb, code lost:
        r2 = new byte[r9];
        r28.readFully(r2, 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0ce2, code lost:
        if (r9 <= 0) goto L_0x0cec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0ce4, code lost:
        r1 = r9 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0ce8, code lost:
        if (r2[r1] != 0) goto L_0x0cec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0cea, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0cec, code lost:
        r6 = new java.lang.String(r2, 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0cf2, code lost:
        A00(r1, 21358).A0g = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0d00, code lost:
        if ("webm".equals(r6) != false) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0d08, code lost:
        if ("matroska".equals(r6) != false) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0d0a, code lost:
        r1 = X.AnonymousClass000.A0r("DocType ");
        r1.append(r6);
        r0 = X.AnonymousClass000.A0h(" not supported", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0d1b, code lost:
        A00(r1, 134).A0e = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0d23, code lost:
        r0 = X.C13680ns.A0j(X.AnonymousClass000.A0r("String element size: "), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0d2f, code lost:
        r0 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0d33, code lost:
        if (r0 > 8) goto L_0x0f4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0d35, code lost:
        r11 = (int) r0;
        r13 = r7.A06;
        r12 = 0;
        r28.readFully(r13, 0, r11);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0d40, code lost:
        if (r12 >= r11) goto L_0x0d4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0d42, code lost:
        r0 = (r0 << 8) | ((long) (r13[r12] & 255));
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0d4e, code lost:
        r6 = ((X.C96774os) r3).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0d56, code lost:
        if (r8 == 20529) goto L_0x0f30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0d5c, code lost:
        if (r8 == 20530) goto L_0x0f29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0d5e, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0d61, code lost:
        switch(r8) {
            case 131: goto L_0x0e93;
            case 136: goto L_0x0e9c;
            case 155: goto L_0x0de5;
            case 159: goto L_0x0ea9;
            case org.wawebrtc.MediaCodecVideoEncoder.MIN_ENCODER_WIDTH :int: goto L_0x0eb2;
            case 179: goto L_0x0ded;
            case 186: goto L_0x0ebb;
            case 215: goto L_0x0ec4;
            case 231: goto L_0x0dfb;
            case 238: goto L_0x0e03;
            case 241: goto L_0x0e08;
            case 251: goto L_0x0e18;
            case 16871: goto L_0x0ecd;
            case 16980: goto L_0x0ddb;
            case 17029: goto L_0x0e1c;
            case 17143: goto L_0x0e2c;
            case 18401: goto L_0x0e34;
            case 18408: goto L_0x0f39;
            case 21420: goto L_0x0e3e;
            case 21432: goto L_0x0e45;
            case 21680: goto L_0x0ed6;
            case 21682: goto L_0x0edf;
            case 21690: goto L_0x0ee8;
            case 21930: goto L_0x0ef1;
            case 21998: goto L_0x0efe;
            case 22186: goto L_0x0f07;
            case 22203: goto L_0x0f0f;
            case 25188: goto L_0x0f17;
            case 30321: goto L_0x0e6b;
            case 2352003: goto L_0x0f20;
            case 2807729: goto L_0x0e8f;
            default: goto L_0x0d64;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0d66, code lost:
        switch(r8) {
            case 21945: goto L_0x0d6b;
            case 21946: goto L_0x0d7f;
            case 21947: goto L_0x0da5;
            case 21948: goto L_0x0dc9;
            case 21949: goto L_0x0dd2;
            default: goto L_0x0d69;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0d6b, code lost:
        r6.A06(r8);
        r2 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0d6f, code lost:
        if (r2 == 1) goto L_0x0d79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0d71, code lost:
        if (r2 != 2) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0d73, code lost:
        r6.A0P.A0G = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0d79, code lost:
        r6.A0P.A0G = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0d7f, code lost:
        r6.A06(r8);
        r2 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0d83, code lost:
        if (r2 == 1) goto L_0x0d9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0d87, code lost:
        if (r2 == 16) goto L_0x0d99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0d8b, code lost:
        if (r2 == 18) goto L_0x0d93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0d8d, code lost:
        if (r2 == 6) goto L_0x0d9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0d8f, code lost:
        if (r2 == 7) goto L_0x0d9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0d93, code lost:
        r6.A0P.A0I = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0d99, code lost:
        r6.A0P.A0I = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0d9f, code lost:
        r6.A0P.A0I = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0da5, code lost:
        r8 = A00(r6, r8);
        r8.A0j = true;
        r6 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0dac, code lost:
        if (r6 == 1) goto L_0x0dc5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0db0, code lost:
        if (r6 == 9) goto L_0x0dc1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0db2, code lost:
        if (r6 == 4) goto L_0x0dbd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x0db5, code lost:
        if (r6 == 5) goto L_0x0dbd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x0db7, code lost:
        if (r6 == 6) goto L_0x0dbd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0db9, code lost:
        if (r6 == 7) goto L_0x0dbd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x0dbd, code lost:
        r8.A0H = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x0dc1, code lost:
        r8.A0H = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0dc5, code lost:
        r8.A0H = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0dc9, code lost:
        A00(r6, r8).A0P = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0dd2, code lost:
        A00(r6, r8).A0Q = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x0ddf, code lost:
        if (r0 == 3) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0de1, code lost:
        r2 = "ContentCompAlgo ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0de5, code lost:
        r6.A0D = r6.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0ded, code lost:
        r6.A05(r8);
        r6.A0R.A01(r6.A04(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0dfb, code lost:
        r6.A0F = r6.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0e03, code lost:
        r6.A01 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x0e0a, code lost:
        if (r6.A0a != false) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x0e0c, code lost:
        r6.A05(r8);
        r6.A0Q.A01(r0);
        r6.A0a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x0e18, code lost:
        r6.A0T = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0e1e, code lost:
        if (r0 < 1) goto L_0x0e28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0e24, code lost:
        if (r0 > 2) goto L_0x0e28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0e28, code lost:
        r2 = "DocTypeReadVersion ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0e2e, code lost:
        if (r0 == 1) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x0e30, code lost:
        r2 = "EBMLReadVersion ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0e38, code lost:
        if (r0 == 5) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x0e3a, code lost:
        r2 = "ContentEncAlgo ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x0e3e, code lost:
        r6.A0J = r0 + r6.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x0e45, code lost:
        r2 = (int) r0;
        r6.A06(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x0e49, code lost:
        if (r2 == 0) goto L_0x0e65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x0e4b, code lost:
        if (r2 == 1) goto L_0x0e5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x0e4d, code lost:
        if (r2 == 3) goto L_0x0e59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x0e51, code lost:
        if (r2 != 15) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x0e53, code lost:
        r6.A0P.A0V = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0e59, code lost:
        r6.A0P.A0V = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0e5f, code lost:
        r6.A0P.A0V = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x0e65, code lost:
        r6.A0P.A0V = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x0e6b, code lost:
        r6.A06(r8);
        r2 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x0e6f, code lost:
        if (r2 == 0) goto L_0x0e89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x0e71, code lost:
        if (r2 == 1) goto L_0x0e83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x0e73, code lost:
        if (r2 == 2) goto L_0x0e7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x0e75, code lost:
        if (r2 != 3) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x0e77, code lost:
        r6.A0P.A0T = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x0e7d, code lost:
        r6.A0P.A0T = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x0e83, code lost:
        r6.A0P.A0T = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x0e89, code lost:
        r6.A0P.A0T = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:0x0e8f, code lost:
        r6.A0N = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x0e93, code lost:
        A00(r6, r8).A0W = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0e9c, code lost:
        r3 = A00(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0ea2, code lost:
        if (r0 != 1) goto L_0x0ea5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x0ea4, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0ea5, code lost:
        r3.A0h = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x0ea9, code lost:
        A00(r6, r8).A0F = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x0eb2, code lost:
        A00(r6, r8).A0X = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0ebb, code lost:
        A00(r6, r8).A0N = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x0ec4, code lost:
        A00(r6, r8).A0S = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x0ecd, code lost:
        A00(r6, r8).A0E = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x0ed6, code lost:
        A00(r6, r8).A0M = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x0edf, code lost:
        A00(r6, r8).A0L = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x0ee8, code lost:
        A00(r6, r8).A0K = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x0ef1, code lost:
        r3 = A00(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x0ef7, code lost:
        if (r0 != 1) goto L_0x0efa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x0ef9, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x0efa, code lost:
        r3.A0i = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x0efe, code lost:
        A00(r6, r8).A0O = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x0f07, code lost:
        A00(r6, r8).A0Y = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x0f0f, code lost:
        A00(r6, r8).A0Z = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0f17, code lost:
        A00(r6, r8).A0D = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x0f20, code lost:
        A00(r6, r8).A0J = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:0x0f2b, code lost:
        if (r0 == 1) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x0f2d, code lost:
        r2 = "ContentEncodingScope ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:0x0f34, code lost:
        if (r0 == 0) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x0f36, code lost:
        r2 = "ContentEncodingOrder ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:0x0f3b, code lost:
        if (r0 == 1) goto L_0x0faf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x0f3d, code lost:
        r2 = "AESSettingsCipherMode ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x0f3f, code lost:
        r2 = X.AnonymousClass000.A0r(r2);
        r2.append(r0);
        r0 = X.AnonymousClass000.A0h(" not supported", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x0f4c, code lost:
        r0 = X.C13680ns.A0j(X.AnonymousClass000.A0r("Invalid integer size: "), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x0faf, code lost:
        r7.A01 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x1010, code lost:
        throw X.AnonymousClass40M.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:776:?, code lost:
        r0 = X.AnonymousClass40M.A00("Error parsing vorbis codec private");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x108f, code lost:
        r0 = X.AnonymousClass40M.A00("Error parsing vorbis codec private");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:778:0x1094, code lost:
        r0 = X.AnonymousClass40M.A00("Error parsing vorbis codec private");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x1099, code lost:
        r0 = X.AnonymousClass40M.A00("Error parsing vorbis codec private");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:780:0x109d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:783:0x10a2, code lost:
        throw X.AnonymousClass40M.A00("Error parsing vorbis codec private");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int AbN(X.C55142iu r28, X.AnonymousClass4Bt r29) {
        /*
            r27 = this;
            r5 = 0
            r26 = r27
            r0 = r26
            r0.A0U = r5
            r4 = 1
        L_0x0008:
            r0 = r26
            boolean r0 = r0.A0U
            if (r0 != 0) goto L_0x10bf
            r0 = r26
            X.5LI r7 = r0.A0e
            X.4ot r7 = (X.C96784ot) r7
            X.5LH r0 = r7.A03
            X.C90524eJ.A01(r0)
        L_0x0019:
            java.util.ArrayDeque r6 = r7.A05
            java.lang.Object r0 = r6.peek()
            X.4GA r0 = (X.AnonymousClass4GA) r0
            if (r0 == 0) goto L_0x088d
            long r8 = r28.AF7()
            long r1 = r0.A01
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x088d
            X.5LH r2 = r7.A03
            java.lang.Object r0 = r6.pop()
            X.4GA r0 = (X.AnonymousClass4GA) r0
            int r1 = r0.A00
            X.4os r2 = (X.C96774os) r2
            X.4oa r7 = r2.A00
            X.0qG r0 = r7.A0O
            r25 = r0
            X.C90524eJ.A01(r25)
            r0 = 160(0xa0, float:2.24E-43)
            r9 = 0
            if (r1 == r0) goto L_0x0847
            r0 = 174(0xae, float:2.44E-43)
            r16 = 0
            if (r1 == r0) goto L_0x013e
            r0 = 19899(0x4dbb, float:2.7884E-41)
            r6 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r0) goto L_0x0127
            r0 = 25152(0x6240, float:3.5245E-41)
            if (r1 == r0) goto L_0x00fd
            r0 = 28032(0x6d80, float:3.9281E-41)
            if (r1 == r0) goto L_0x0ffe
            r0 = 357149030(0x1549a966, float:4.072526E-26)
            if (r1 == r0) goto L_0x00df
            r0 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r1 == r0) goto L_0x00ce
            if (r1 != r6) goto L_0x105a
            boolean r0 = r7.A0b
            if (r0 != 0) goto L_0x1054
            X.4TJ r11 = r7.A0R
            X.4TJ r10 = r7.A0Q
            long r0 = r7.A0L
            r12 = -1
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x00c3
            long r0 = r7.A0I
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x00c3
            if (r11 == 0) goto L_0x00c3
            int r12 = r11.A00
            if (r12 == 0) goto L_0x00c3
            if (r10 == 0) goto L_0x00c3
            int r0 = r10.A00
            if (r0 != r12) goto L_0x00c3
            int[] r8 = new int[r12]
            long[] r6 = new long[r12]
            long[] r3 = new long[r12]
            long[] r2 = new long[r12]
            r13 = 0
        L_0x0098:
            if (r13 >= r12) goto L_0x00ac
            long r0 = r11.A00(r13)
            r2[r13] = r0
            long r0 = r7.A0L
            long r14 = r10.A00(r13)
            long r0 = r0 + r14
            r6[r13] = r0
            int r13 = r13 + 1
            goto L_0x0098
        L_0x00ac:
            int r11 = r12 + -1
            if (r9 >= r11) goto L_0x1011
            int r13 = r9 + 1
            r0 = r6[r13]
            r10 = r6[r9]
            long r0 = r0 - r10
            int r10 = (int) r0
            r8[r9] = r10
            r10 = r2[r13]
            r0 = r2[r9]
            long r10 = r10 - r0
            r3[r9] = r10
            r9 = r13
            goto L_0x00ac
        L_0x00c3:
            long r2 = r7.A0I
            r0 = 0
            X.1gC r9 = new X.1gC
            r9.<init>(r2, r0)
            goto L_0x104d
        L_0x00ce:
            android.util.SparseArray r0 = r7.A0d
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00db
            r25.A8W()
            goto L_0x105a
        L_0x00db:
            java.lang.String r0 = "No valid tracks were found"
            goto L_0x100c
        L_0x00df:
            long r1 = r7.A0N
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00ef
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.A0N = r0
        L_0x00ef:
            long r1 = r7.A0H
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x105a
            long r0 = r7.A04(r1)
            r7.A0I = r0
            goto L_0x105a
        L_0x00fd:
            X.4SL r7 = A00(r7, r1)
            boolean r0 = r7.A0k
            if (r0 == 0) goto L_0x105a
            X.4Uh r0 = r7.A0b
            if (r0 == 0) goto L_0x0123
            X.4jV[] r6 = new X.C93624jV[r4]
            java.util.UUID r3 = X.C90604eR.A03
            byte[] r2 = r0.A03
            java.lang.String r1 = "video/webm"
            X.4jV r0 = new X.4jV
            r0.<init>(r1, r3, r2)
            r6[r5] = r0
            X.57J r1 = new X.57J
            r0 = r16
            r1.<init>(r0, r6, r4)
            r7.A0a = r1
            goto L_0x105a
        L_0x0123:
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            goto L_0x100c
        L_0x0127:
            int r3 = r7.A0C
            r0 = -1
            if (r3 == r0) goto L_0x013a
            long r8 = r7.A0J
            r1 = -1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x013a
            if (r3 != r6) goto L_0x105a
            r7.A0G = r8
            goto L_0x105a
        L_0x013a:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            goto L_0x100c
        L_0x013e:
            X.4SL r0 = r7.A0P
            r24 = r0
            X.C90524eJ.A01(r24)
            java.lang.String r12 = r0.A0e
            if (r12 == 0) goto L_0x0843
            int r2 = r12.hashCode()
            switch(r2) {
                case -2095576542: goto L_0x01b3;
                case -2095575984: goto L_0x01b0;
                case -1985379776: goto L_0x01ad;
                case -1784763192: goto L_0x01aa;
                case -1730367663: goto L_0x01a7;
                case -1482641358: goto L_0x01a4;
                case -1482641357: goto L_0x01a1;
                case -1373388978: goto L_0x019e;
                case -933872740: goto L_0x019b;
                case -538363189: goto L_0x0198;
                case -538363109: goto L_0x0195;
                case -425012669: goto L_0x0192;
                case -356037306: goto L_0x018f;
                case 62923557: goto L_0x018c;
                case 62923603: goto L_0x0189;
                case 62927045: goto L_0x0186;
                case 82318131: goto L_0x0183;
                case 82338133: goto L_0x0180;
                case 82338134: goto L_0x017d;
                case 99146302: goto L_0x017a;
                case 444813526: goto L_0x0177;
                case 542569478: goto L_0x0174;
                case 635596514: goto L_0x0171;
                case 725948237: goto L_0x016e;
                case 725957860: goto L_0x016b;
                case 738597099: goto L_0x0168;
                case 855502857: goto L_0x0165;
                case 1422270023: goto L_0x0162;
                case 1809237540: goto L_0x015f;
                case 1950749482: goto L_0x015c;
                case 1950789798: goto L_0x0159;
                case 1951062397: goto L_0x0156;
                default: goto L_0x0150;
            }
        L_0x0150:
            r0 = r16
            r7.A0P = r0
            goto L_0x105a
        L_0x0156:
            java.lang.String r0 = "A_OPUS"
            goto L_0x01b5
        L_0x0159:
            java.lang.String r0 = "A_FLAC"
            goto L_0x01b5
        L_0x015c:
            java.lang.String r0 = "A_EAC3"
            goto L_0x01b5
        L_0x015f:
            java.lang.String r0 = "V_MPEG2"
            goto L_0x01b5
        L_0x0162:
            java.lang.String r0 = "S_TEXT/UTF8"
            goto L_0x01b5
        L_0x0165:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            goto L_0x01b5
        L_0x0168:
            java.lang.String r0 = "S_TEXT/ASS"
            goto L_0x01b5
        L_0x016b:
            java.lang.String r0 = "A_PCM/INT/LIT"
            goto L_0x01b5
        L_0x016e:
            java.lang.String r0 = "A_PCM/INT/BIG"
            goto L_0x01b5
        L_0x0171:
            java.lang.String r0 = "A_PCM/FLOAT/IEEE"
            goto L_0x01b5
        L_0x0174:
            java.lang.String r0 = "A_DTS/EXPRESS"
            goto L_0x01b5
        L_0x0177:
            java.lang.String r0 = "V_THEORA"
            goto L_0x01b5
        L_0x017a:
            java.lang.String r0 = "S_HDMV/PGS"
            goto L_0x01b5
        L_0x017d:
            java.lang.String r0 = "V_VP9"
            goto L_0x01b5
        L_0x0180:
            java.lang.String r0 = "V_VP8"
            goto L_0x01b5
        L_0x0183:
            java.lang.String r0 = "V_AV1"
            goto L_0x01b5
        L_0x0186:
            java.lang.String r0 = "A_DTS"
            goto L_0x01b5
        L_0x0189:
            java.lang.String r0 = "A_AC3"
            goto L_0x01b5
        L_0x018c:
            java.lang.String r0 = "A_AAC"
            goto L_0x01b5
        L_0x018f:
            java.lang.String r0 = "A_DTS/LOSSLESS"
            goto L_0x01b5
        L_0x0192:
            java.lang.String r0 = "S_VOBSUB"
            goto L_0x01b5
        L_0x0195:
            java.lang.String r0 = "V_MPEG4/ISO/AVC"
            goto L_0x01b5
        L_0x0198:
            java.lang.String r0 = "V_MPEG4/ISO/ASP"
            goto L_0x01b5
        L_0x019b:
            java.lang.String r0 = "S_DVBSUB"
            goto L_0x01b5
        L_0x019e:
            java.lang.String r0 = "V_MS/VFW/FOURCC"
            goto L_0x01b5
        L_0x01a1:
            java.lang.String r0 = "A_MPEG/L3"
            goto L_0x01b5
        L_0x01a4:
            java.lang.String r0 = "A_MPEG/L2"
            goto L_0x01b5
        L_0x01a7:
            java.lang.String r0 = "A_VORBIS"
            goto L_0x01b5
        L_0x01aa:
            java.lang.String r0 = "A_TRUEHD"
            goto L_0x01b5
        L_0x01ad:
            java.lang.String r0 = "A_MS/ACM"
            goto L_0x01b5
        L_0x01b0:
            java.lang.String r0 = "V_MPEG4/ISO/SP"
            goto L_0x01b5
        L_0x01b3:
            java.lang.String r0 = "V_MPEG4/ISO/AP"
        L_0x01b5:
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0150
            r0 = r24
            int r0 = r0.A0S
            r23 = r0
            r15 = 16
            r13 = 8
            r1 = 4
            r10 = 3
            switch(r2) {
                case -2095576542: goto L_0x030e;
                case -2095575984: goto L_0x0305;
                case -1985379776: goto L_0x02fc;
                case -1784763192: goto L_0x02f3;
                case -1730367663: goto L_0x02ea;
                case -1482641358: goto L_0x02e1;
                case -1482641357: goto L_0x02d8;
                case -1373388978: goto L_0x02cf;
                case -933872740: goto L_0x02c6;
                case -538363189: goto L_0x02bd;
                case -538363109: goto L_0x02b4;
                case -425012669: goto L_0x02ab;
                case -356037306: goto L_0x02a2;
                case 62923557: goto L_0x0299;
                case 62923603: goto L_0x0290;
                case 62927045: goto L_0x0286;
                case 82318131: goto L_0x027c;
                case 82338133: goto L_0x0272;
                case 82338134: goto L_0x0268;
                case 99146302: goto L_0x025e;
                case 444813526: goto L_0x0254;
                case 542569478: goto L_0x024a;
                case 635596514: goto L_0x0240;
                case 725948237: goto L_0x0236;
                case 725957860: goto L_0x022c;
                case 738597099: goto L_0x0222;
                case 855502857: goto L_0x0218;
                case 1422270023: goto L_0x020e;
                case 1809237540: goto L_0x0204;
                case 1950749482: goto L_0x01fa;
                case 1950789798: goto L_0x01f0;
                case 1951062397: goto L_0x01e6;
                default: goto L_0x01ca;
            }
        L_0x01ca:
            r18 = -1
        L_0x01cc:
            java.lang.String r22 = "application/dvbsubs"
            java.lang.String r21 = "application/pgs"
            java.lang.String r20 = "application/vobsub"
            java.lang.String r8 = "text/x-ssa"
            java.lang.String r6 = "application/x-subrip"
            java.lang.String r14 = ". Setting mimeType to "
            java.lang.String r17 = "audio/raw"
            r3 = 0
            java.lang.String r11 = "MatroskaExtractor"
            java.lang.String r2 = "audio/x-unknown"
            switch(r18) {
                case 0: goto L_0x05c0;
                case 1: goto L_0x05c0;
                case 2: goto L_0x0546;
                case 3: goto L_0x053a;
                case 4: goto L_0x049b;
                case 5: goto L_0x0492;
                case 6: goto L_0x048f;
                case 7: goto L_0x0406;
                case 8: goto L_0x03f3;
                case 9: goto L_0x05c0;
                case 10: goto L_0x03d6;
                case 11: goto L_0x03c8;
                case 12: goto L_0x03c4;
                case 13: goto L_0x039c;
                case 14: goto L_0x0398;
                case 15: goto L_0x0394;
                case 16: goto L_0x0390;
                case 17: goto L_0x038c;
                case 18: goto L_0x0388;
                case 19: goto L_0x0382;
                case 20: goto L_0x037e;
                case 21: goto L_0x0394;
                case 22: goto L_0x0597;
                case 23: goto L_0x0373;
                case 24: goto L_0x0361;
                case 25: goto L_0x0351;
                case 26: goto L_0x0334;
                case 27: goto L_0x0330;
                case 28: goto L_0x032c;
                case 29: goto L_0x0328;
                case 30: goto L_0x031a;
                case 31: goto L_0x04f7;
                default: goto L_0x01e2;
            }
        L_0x01e2:
            java.lang.String r0 = "Unrecognized codec identifier."
            goto L_0x100c
        L_0x01e6:
            java.lang.String r0 = "A_OPUS"
            boolean r0 = r12.equals(r0)
            r18 = 31
            goto L_0x0316
        L_0x01f0:
            java.lang.String r0 = "A_FLAC"
            boolean r0 = r12.equals(r0)
            r18 = 30
            goto L_0x0316
        L_0x01fa:
            java.lang.String r0 = "A_EAC3"
            boolean r0 = r12.equals(r0)
            r18 = 29
            goto L_0x0316
        L_0x0204:
            java.lang.String r0 = "V_MPEG2"
            boolean r0 = r12.equals(r0)
            r18 = 28
            goto L_0x0316
        L_0x020e:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r0 = r12.equals(r0)
            r18 = 27
            goto L_0x0316
        L_0x0218:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            boolean r0 = r12.equals(r0)
            r18 = 26
            goto L_0x0316
        L_0x0222:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r0 = r12.equals(r0)
            r18 = 25
            goto L_0x0316
        L_0x022c:
            java.lang.String r0 = "A_PCM/INT/LIT"
            boolean r0 = r12.equals(r0)
            r18 = 24
            goto L_0x0316
        L_0x0236:
            java.lang.String r0 = "A_PCM/INT/BIG"
            boolean r0 = r12.equals(r0)
            r18 = 23
            goto L_0x0316
        L_0x0240:
            java.lang.String r0 = "A_PCM/FLOAT/IEEE"
            boolean r0 = r12.equals(r0)
            r18 = 22
            goto L_0x0316
        L_0x024a:
            java.lang.String r0 = "A_DTS/EXPRESS"
            boolean r0 = r12.equals(r0)
            r18 = 21
            goto L_0x0316
        L_0x0254:
            java.lang.String r0 = "V_THEORA"
            boolean r0 = r12.equals(r0)
            r18 = 20
            goto L_0x0316
        L_0x025e:
            java.lang.String r0 = "S_HDMV/PGS"
            boolean r0 = r12.equals(r0)
            r18 = 19
            goto L_0x0316
        L_0x0268:
            java.lang.String r0 = "V_VP9"
            boolean r0 = r12.equals(r0)
            r18 = 18
            goto L_0x0316
        L_0x0272:
            java.lang.String r0 = "V_VP8"
            boolean r0 = r12.equals(r0)
            r18 = 17
            goto L_0x0316
        L_0x027c:
            java.lang.String r0 = "V_AV1"
            boolean r0 = r12.equals(r0)
            r18 = 16
            goto L_0x0316
        L_0x0286:
            java.lang.String r0 = "A_DTS"
            boolean r0 = r12.equals(r0)
            r18 = 15
            goto L_0x0316
        L_0x0290:
            java.lang.String r0 = "A_AC3"
            boolean r0 = r12.equals(r0)
            r18 = 14
            goto L_0x0316
        L_0x0299:
            java.lang.String r0 = "A_AAC"
            boolean r0 = r12.equals(r0)
            r18 = 13
            goto L_0x0316
        L_0x02a2:
            java.lang.String r0 = "A_DTS/LOSSLESS"
            boolean r0 = r12.equals(r0)
            r18 = 12
            goto L_0x0316
        L_0x02ab:
            java.lang.String r0 = "S_VOBSUB"
            boolean r0 = r12.equals(r0)
            r18 = 11
            goto L_0x0316
        L_0x02b4:
            java.lang.String r0 = "V_MPEG4/ISO/AVC"
            boolean r0 = r12.equals(r0)
            r18 = 10
            goto L_0x0316
        L_0x02bd:
            java.lang.String r0 = "V_MPEG4/ISO/ASP"
            boolean r0 = r12.equals(r0)
            r18 = 9
            goto L_0x0316
        L_0x02c6:
            java.lang.String r0 = "S_DVBSUB"
            boolean r0 = r12.equals(r0)
            r18 = 8
            goto L_0x0316
        L_0x02cf:
            java.lang.String r0 = "V_MS/VFW/FOURCC"
            boolean r0 = r12.equals(r0)
            r18 = 7
            goto L_0x0316
        L_0x02d8:
            java.lang.String r0 = "A_MPEG/L3"
            boolean r0 = r12.equals(r0)
            r18 = 6
            goto L_0x0316
        L_0x02e1:
            java.lang.String r0 = "A_MPEG/L2"
            boolean r0 = r12.equals(r0)
            r18 = 5
            goto L_0x0316
        L_0x02ea:
            java.lang.String r0 = "A_VORBIS"
            boolean r0 = r12.equals(r0)
            r18 = 4
            goto L_0x0316
        L_0x02f3:
            java.lang.String r0 = "A_TRUEHD"
            boolean r0 = r12.equals(r0)
            r18 = 3
            goto L_0x0316
        L_0x02fc:
            java.lang.String r0 = "A_MS/ACM"
            boolean r0 = r12.equals(r0)
            r18 = 2
            goto L_0x0316
        L_0x0305:
            java.lang.String r0 = "V_MPEG4/ISO/SP"
            boolean r0 = r12.equals(r0)
            r18 = 1
            goto L_0x0316
        L_0x030e:
            java.lang.String r0 = "V_MPEG4/ISO/AP"
            boolean r0 = r12.equals(r0)
            r18 = 0
        L_0x0316:
            if (r0 != 0) goto L_0x01cc
            goto L_0x01ca
        L_0x031a:
            r0 = r24
            byte[] r0 = r0.A00(r12)
            java.util.List r2 = java.util.Collections.singletonList(r0)
            java.lang.String r17 = "audio/flac"
            goto L_0x05c9
        L_0x0328:
            java.lang.String r17 = "audio/eac3"
            goto L_0x05b4
        L_0x032c:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x05b4
        L_0x0330:
            r17 = r6
            goto L_0x05b4
        L_0x0334:
            r0 = r24
            byte[] r1 = r0.A00(r12)
            X.4eH r0 = new X.4eH
            r0.<init>((byte[]) r1)
            X.4Zo r11 = X.C88014Zo.A00(r0)
            java.util.List r2 = r11.A02
            int r1 = r11.A00
            r0 = r24
            r0.A0R = r1
            java.lang.String r14 = r11.A01
            java.lang.String r17 = "video/hevc"
            goto L_0x05ca
        L_0x0351:
            byte[] r1 = A0t
            r0 = r24
            byte[] r0 = r0.A00(r12)
            X.1kb r2 = X.C34641kb.of(r1, r0)
            r17 = r8
            goto L_0x05c9
        L_0x0361:
            r0 = r24
            int r0 = r0.A0D
            int r1 = X.AnonymousClass3C1.A01(r0)
            if (r1 != 0) goto L_0x05ba
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0o()
            java.lang.String r1 = "Unsupported little endian PCM bit depth: "
            goto L_0x0593
        L_0x0373:
            r0 = r24
            int r0 = r0.A0D
            if (r0 != r13) goto L_0x05b6
            r2 = r3
            r14 = r3
            r1 = 3
            goto L_0x05cb
        L_0x037e:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x05b4
        L_0x0382:
            r2 = r3
            r14 = r3
            r17 = r21
            goto L_0x05ca
        L_0x0388:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x05b4
        L_0x038c:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
            goto L_0x05b4
        L_0x0390:
            java.lang.String r17 = "video/av01"
            goto L_0x05b4
        L_0x0394:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x05b4
        L_0x0398:
            java.lang.String r17 = "audio/ac3"
            goto L_0x05b4
        L_0x039c:
            r0 = r24
            byte[] r0 = r0.A00(r12)
            java.util.List r2 = java.util.Collections.singletonList(r0)
            r0 = r24
            byte[] r11 = r0.A0l
            int r1 = r11.length
            X.4dh r0 = new X.4dh
            r0.<init>(r11, r1)
            X.4JS r11 = X.C89734co.A01(r0, r5)
            int r1 = r11.A01
            r0 = r24
            r0.A0U = r1
            int r1 = r11.A00
            r0.A0F = r1
            java.lang.String r14 = r11.A02
            java.lang.String r17 = "audio/mp4a-latm"
            goto L_0x05ca
        L_0x03c4:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x05b4
        L_0x03c8:
            r0 = r24
            byte[] r0 = r0.A00(r12)
            X.1kb r2 = X.C34641kb.of(r0)
            r17 = r20
            goto L_0x05c9
        L_0x03d6:
            r0 = r24
            byte[] r1 = r0.A00(r12)
            X.4eH r0 = new X.4eH
            r0.<init>((byte[]) r1)
            X.4aE r11 = X.C88274aE.A00(r0)
            java.util.List r2 = r11.A05
            int r1 = r11.A02
            r0 = r24
            r0.A0R = r1
            java.lang.String r14 = r11.A04
            java.lang.String r17 = "video/avc"
            goto L_0x05ca
        L_0x03f3:
            byte[] r2 = new byte[r1]
            r0 = r24
            byte[] r0 = r0.A00(r12)
            java.lang.System.arraycopy(r0, r5, r2, r5, r1)
            X.1kb r2 = X.C34641kb.of(r2)
            r17 = r22
            goto L_0x05c9
        L_0x0406:
            r0 = r24
            byte[] r0 = r0.A00(r12)
            X.4eH r1 = new X.4eH
            r1.<init>((byte[]) r0)
            r1.A0T(r15)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            long r14 = r1.A0G()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            r12 = 1482049860(0x58564944, double:7.322299212E-315)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0427
            java.lang.String r2 = "video/divx"
            android.util.Pair r1 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            r1.<init>(r2, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            goto L_0x047f
        L_0x0427:
            r12 = 859189832(0x33363248, double:4.244961792E-315)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0436
            java.lang.String r2 = "video/3gpp"
            android.util.Pair r1 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            r1.<init>(r2, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            goto L_0x047f
        L_0x0436:
            r12 = 826496599(0x31435657, double:4.08343576E-315)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0473
            int r0 = r1.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            int r12 = r0 + 20
            byte[] r11 = r1.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
        L_0x0443:
            int r2 = r11.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            int r0 = r2 + -4
            if (r12 >= r0) goto L_0x0834
            byte r0 = r11[r12]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            if (r0 != 0) goto L_0x0470
            int r0 = r12 + 1
            byte r0 = r11[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            if (r0 != 0) goto L_0x0470
            int r0 = r12 + 2
            byte r0 = r11[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            if (r0 != r4) goto L_0x0470
            int r0 = r12 + 3
            byte r1 = r11[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            r0 = 15
            if (r1 != r0) goto L_0x0470
            byte[] r0 = java.util.Arrays.copyOfRange(r11, r12, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            java.lang.String r2 = "video/wvc1"
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            r1.<init>(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            goto L_0x047f
        L_0x0470:
            int r12 = r12 + 1
            goto L_0x0443
        L_0x0473:
            java.lang.String r0 = "Unknown FourCC. Setting mimeType to video/x-unknown"
            android.util.Log.w(r11, r0)
            java.lang.String r2 = "video/x-unknown"
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r2, r3)
        L_0x047f:
            java.lang.Object r0 = r1.first
            r17 = r0
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r17 = r0
            java.lang.Object r2 = r1.second
            java.util.List r2 = (java.util.List) r2
            goto L_0x05c9
        L_0x048f:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x0494
        L_0x0492:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x0494:
            r2 = r3
            r14 = r3
            r1 = -1
            r11 = 4096(0x1000, float:5.74E-42)
            goto L_0x05cc
        L_0x049b:
            r11 = 8192(0x2000, float:1.14794E-41)
            r0 = r24
            byte[] r14 = r0.A00(r12)
            java.lang.String r17 = "Error parsing vorbis codec private"
            byte r0 = r14[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            r13 = 2
            if (r0 != r13) goto L_0x1094
            r2 = 1
            r0 = 0
        L_0x04ac:
            byte r1 = r14[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            r12 = 255(0xff, float:3.57E-43)
            r1 = r1 & r12
            if (r1 != r12) goto L_0x04b8
            int r0 = r0 + 255
            int r2 = r2 + 1
            goto L_0x04ac
        L_0x04b8:
            int r15 = r2 + 1
            byte r1 = r14[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            r1 = r1 & r12
            int r0 = r0 + r1
            r1 = 0
        L_0x04bf:
            byte r2 = r14[r15]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            r2 = r2 & r12
            if (r2 != r12) goto L_0x04c9
            int r1 = r1 + 255
            int r15 = r15 + 1
            goto L_0x04bf
        L_0x04c9:
            int r2 = r15 + 1
            byte r15 = r14[r15]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            r15 = r15 & r12
            int r1 = r1 + r15
            byte r12 = r14[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            if (r12 != r4) goto L_0x108f
            byte[] r12 = new byte[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            java.lang.System.arraycopy(r14, r2, r12, r5, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            int r2 = r2 + r0
            byte r0 = r14[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            if (r0 != r10) goto L_0x108a
            int r2 = r2 + r1
            byte r1 = r14[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            r0 = 5
            if (r1 != r0) goto L_0x1099
            int r1 = r14.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            int r1 = r1 - r2
            byte[] r0 = new byte[r1]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            java.lang.System.arraycopy(r14, r2, r0, r5, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            java.util.ArrayList r2 = X.C13690nt.A0i(r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            r2.add(r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            r2.add(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            java.lang.String r17 = "audio/vorbis"
            goto L_0x0536
        L_0x04f7:
            r11 = 5760(0x1680, float:8.071E-42)
            java.util.ArrayList r2 = X.C13690nt.A0i(r10)
            r0 = r24
            byte[] r0 = r0.A00(r12)
            r2.add(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r13)
            java.nio.ByteOrder r14 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r12 = r0.order(r14)
            r0 = r24
            long r0 = r0.A0Y
            r12.putLong(r0)
            byte[] r0 = r12.array()
            r2.add(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r13)
            java.nio.ByteBuffer r12 = r0.order(r14)
            r0 = r24
            long r0 = r0.A0Z
            r12.putLong(r0)
            byte[] r0 = r12.array()
            r2.add(r0)
            java.lang.String r17 = "audio/opus"
        L_0x0536:
            r14 = r3
            r1 = -1
            goto L_0x05cc
        L_0x053a:
            X.4S1 r1 = new X.4S1
            r1.<init>()
            r0 = r24
            r0.A0d = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x05b4
        L_0x0546:
            r0 = r24
            byte[] r0 = r0.A00(r12)
            X.4eH r1 = new X.4eH
            r1.<init>((byte[]) r0)
            int r12 = r1.A0A()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083f }
            if (r12 == r4) goto L_0x0583
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r12 != r0) goto L_0x057c
            r0 = 24
            r1.A0S(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083f }
            long r18 = r1.A0H()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083f }
            java.util.UUID r15 = A0s     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083f }
            long r12 = r15.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083f }
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x057c
            long r18 = r1.A0H()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083f }
            long r12 = r15.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083f }
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x057c
            goto L_0x0583
        L_0x057c:
            java.lang.String r0 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0r(r0)
            goto L_0x05ab
        L_0x0583:
            r0 = r24
            int r0 = r0.A0D
            int r1 = X.AnonymousClass3C1.A01(r0)
            if (r1 != 0) goto L_0x05ba
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0o()
            java.lang.String r1 = "Unsupported PCM bit depth: "
        L_0x0593:
            r12.append(r1)
            goto L_0x05a5
        L_0x0597:
            r0 = r24
            int r0 = r0.A0D
            r12 = 32
            if (r0 == r12) goto L_0x05ba
            java.lang.String r1 = "Unsupported floating point PCM bit depth: "
        L_0x05a1:
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0r(r1)
        L_0x05a5:
            r12.append(r0)
            r12.append(r14)
        L_0x05ab:
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r12)
            android.util.Log.w(r11, r0)
            r17 = r2
        L_0x05b4:
            r2 = r3
            goto L_0x05c9
        L_0x05b6:
            if (r0 != r15) goto L_0x05bd
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x05ba:
            r2 = r3
            r14 = r3
            goto L_0x05cb
        L_0x05bd:
            java.lang.String r1 = "Unsupported big endian PCM bit depth: "
            goto L_0x05a1
        L_0x05c0:
            r0 = r24
            byte[] r0 = r0.A0l
            if (r0 != 0) goto L_0x082e
            r2 = r3
        L_0x05c7:
            java.lang.String r17 = "video/mp4v-es"
        L_0x05c9:
            r14 = r3
        L_0x05ca:
            r1 = -1
        L_0x05cb:
            r11 = -1
        L_0x05cc:
            r0 = r24
            byte[] r12 = r0.A0m
            if (r12 == 0) goto L_0x05e1
            X.4eH r0 = new X.4eH
            r0.<init>((byte[]) r12)
            X.4ZI r0 = X.AnonymousClass4ZI.A00(r0)
            if (r0 == 0) goto L_0x05e1
            java.lang.String r14 = r0.A00
            java.lang.String r17 = "video/dolby-vision"
        L_0x05e1:
            r0 = r24
            boolean r13 = r0.A0h
            boolean r12 = r0.A0i
            r0 = 0
            if (r12 == 0) goto L_0x05eb
            r0 = 2
        L_0x05eb:
            r13 = r13 | r0
            X.1gR r12 = X.AnonymousClass3K4.A0N()
            boolean r0 = X.C90834eu.A03(r17)
            if (r0 == 0) goto L_0x0656
            r0 = r24
            int r0 = r0.A0F
            r12.A04 = r0
            r0 = r24
            int r0 = r0.A0U
            r12.A0D = r0
            r12.A09 = r1
            r10 = 1
        L_0x0605:
            r0 = r24
            java.lang.String r1 = r0.A0g
            if (r1 == 0) goto L_0x0619
            java.util.Map r0 = A0r
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0619
            r0 = r24
            java.lang.String r0 = r0.A0g
            r12.A0P = r0
        L_0x0619:
            java.lang.String r0 = java.lang.Integer.toString(r23)
            r12.A0O = r0
            r0 = r17
            r12.A0R = r0
            r12.A08 = r11
            r0 = r24
            java.lang.String r0 = r0.A0f
            r12.A0Q = r0
            r12.A0E = r13
            r12.A0S = r2
            r12.A0M = r14
            r0 = r24
            X.57J r0 = r0.A0a
            r12.A0I = r0
            X.1gT r2 = new X.1gT
            r2.<init>((X.C32471gR) r12)
            r0 = r24
            int r1 = r0.A0S
            r0 = r25
            X.1gS r1 = r0.Ah1(r1, r10)
            r0 = r24
            r0.A0c = r1
            r1.A9D(r2)
            android.util.SparseArray r2 = r7.A0d
            int r1 = r0.A0S
            r2.put(r1, r0)
            goto L_0x0150
        L_0x0656:
            boolean r0 = X.C90834eu.A05(r17)
            if (r0 == 0) goto L_0x07fc
            r0 = r24
            int r0 = r0.A0L
            if (r0 != 0) goto L_0x07f9
            r0 = r24
            int r1 = r0.A0M
            r10 = -1
            if (r1 != r10) goto L_0x066b
            int r1 = r0.A0X
        L_0x066b:
            r0.A0M = r1
            int r1 = r0.A0K
            if (r1 != r10) goto L_0x0673
            int r1 = r0.A0N
        L_0x0673:
            r0.A0K = r1
        L_0x0675:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = r24
            int r6 = r0.A0M
            if (r6 == r10) goto L_0x068c
            int r1 = r0.A0K
            if (r1 == r10) goto L_0x068c
            int r0 = r0.A0N
            int r0 = r0 * r6
            float r8 = (float) r0
            r0 = r24
            int r0 = r0.A0X
            int r0 = r0 * r1
            float r0 = (float) r0
            float r8 = r8 / r0
        L_0x068c:
            r0 = r24
            boolean r0 = r0.A0j
            if (r0 == 0) goto L_0x076d
            r0 = r24
            float r0 = r0.A06
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f6
            r0 = r24
            float r0 = r0.A07
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f6
            r0 = r24
            float r0 = r0.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f6
            r0 = r24
            float r0 = r0.A05
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f6
            r0 = r24
            float r0 = r0.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f6
            r0 = r24
            float r0 = r0.A03
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f6
            r0 = r24
            float r0 = r0.A0B
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f6
            r0 = r24
            float r0 = r0.A0C
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f6
            r0 = r24
            float r0 = r0.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f6
            r0 = r24
            float r0 = r0.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f6
            r0 = 25
            byte[] r6 = new byte[r0]
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r6)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r0)
            r1.put(r5)
            r0 = r24
            float r15 = r0.A06
            r0 = 1195593728(0x47435000, float:50000.0)
            float r15 = r15 * r0
            r3 = 1056964608(0x3f000000, float:0.5)
            float r15 = r15 + r3
            int r0 = (int) r15
            short r0 = (short) r0
            r1.putShort(r0)
            r0 = r24
            float r0 = r0.A07
            A01(r1, r0)
            r0 = r24
            float r0 = r0.A04
            A01(r1, r0)
            r0 = r24
            float r0 = r0.A05
            A01(r1, r0)
            r0 = r24
            float r0 = r0.A02
            A01(r1, r0)
            r0 = r24
            float r0 = r0.A03
            A01(r1, r0)
            r0 = r24
            float r0 = r0.A0B
            A01(r1, r0)
            r0 = r24
            float r0 = r0.A0C
            A01(r1, r0)
            r0 = r24
            float r0 = r0.A00
            float r0 = r0 + r3
            int r0 = (int) r0
            short r0 = (short) r0
            r1.putShort(r0)
            r0 = r24
            float r0 = r0.A01
            float r0 = r0 + r3
            int r0 = (int) r0
            short r0 = (short) r0
            r1.putShort(r0)
            r0 = r24
            int r0 = r0.A0P
            short r0 = (short) r0
            r1.putShort(r0)
            r0 = r24
            int r0 = r0.A0Q
            short r0 = (short) r0
            r1.putShort(r0)
        L_0x075a:
            r0 = r24
            int r0 = r0.A0H
            r15 = r0
            r0 = r24
            int r0 = r0.A0G
            r1 = r0
            r0 = r24
            int r0 = r0.A0I
            X.4jd r3 = new X.4jd
            r3.<init>(r15, r6, r1, r0)
        L_0x076d:
            r0 = r24
            java.lang.String r0 = r0.A0g
            if (r0 == 0) goto L_0x0787
            java.util.Map r1 = A0r
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0787
            r0 = r24
            java.lang.String r0 = r0.A0g
            java.lang.Object r0 = r1.get(r0)
            int r10 = X.AnonymousClass000.A0D(r0)
        L_0x0787:
            r0 = r24
            int r0 = r0.A0T
            if (r0 != 0) goto L_0x07f1
            r0 = r24
            float r0 = r0.A0A
            r6 = 0
            int r0 = java.lang.Float.compare(r0, r6)
            if (r0 != 0) goto L_0x07f1
            r0 = r24
            float r1 = r0.A08
            int r0 = java.lang.Float.compare(r1, r6)
            if (r0 != 0) goto L_0x07f1
            r0 = r24
            float r0 = r0.A09
            int r0 = java.lang.Float.compare(r0, r6)
            if (r0 == 0) goto L_0x07b6
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x07d7
            r9 = 90
        L_0x07b6:
            r0 = r24
            int r0 = r0.A0X
            r12.A0G = r0
            r0 = r24
            int r0 = r0.A0N
            r12.A07 = r0
            r12.A01 = r8
            r12.A0C = r9
            r0 = r24
            byte[] r0 = r0.A0n
            r12.A0T = r0
            r0 = r24
            int r0 = r0.A0V
            r12.A0F = r0
            r12.A0K = r3
            r10 = 2
            goto L_0x0605
        L_0x07d7:
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 == 0) goto L_0x07f3
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 == 0) goto L_0x07f3
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r0 = java.lang.Float.compare(r1, r0)
            r9 = 270(0x10e, float:3.78E-43)
            if (r0 == 0) goto L_0x07b6
        L_0x07f1:
            r9 = r10
            goto L_0x07b6
        L_0x07f3:
            r9 = 180(0xb4, float:2.52E-43)
            goto L_0x07b6
        L_0x07f6:
            r6 = 0
            goto L_0x075a
        L_0x07f9:
            r10 = -1
            goto L_0x0675
        L_0x07fc:
            r0 = r17
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0605
            r0 = r17
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0605
            r1 = r17
            r0 = r20
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0605
            r1 = r21
            r0 = r17
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0605
            r1 = r22
            r0 = r17
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0605
            java.lang.String r0 = "Unexpected MIME type."
            goto L_0x100c
        L_0x082e:
            java.util.List r2 = java.util.Collections.singletonList(r0)
            goto L_0x05c7
        L_0x0834:
            java.lang.String r0 = "Failed to find FourCC VC1 initialization data"
            X.40M r0 = X.AnonymousClass40M.A00(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x083b }
        L_0x083b:
            java.lang.String r0 = "Error parsing FourCC private data"
            goto L_0x100c
        L_0x083f:
            java.lang.String r0 = "Error parsing MS/ACM codec private"
            goto L_0x100c
        L_0x0843:
            java.lang.String r0 = "CodecId is missing in TrackEntry element"
            goto L_0x100c
        L_0x0847:
            int r1 = r7.A05
            r0 = 2
            if (r1 != r0) goto L_0x105a
            r1 = 0
            r11 = 0
        L_0x084e:
            int r0 = r7.A03
            if (r1 >= r0) goto L_0x085a
            int[] r0 = r7.A0c
            r0 = r0[r1]
            int r11 = r11 + r0
            int r1 = r1 + 1
            goto L_0x084e
        L_0x085a:
            android.util.SparseArray r1 = r7.A0d
            int r0 = r7.A06
            java.lang.Object r8 = r1.get(r0)
            X.4SL r8 = (X.AnonymousClass4SL) r8
            r6 = 0
        L_0x0865:
            int r0 = r7.A03
            if (r6 >= r0) goto L_0x0889
            long r2 = r7.A0E
            int r0 = r8.A0J
            int r0 = r0 * r6
            int r0 = r0 / 1000
            long r0 = (long) r0
            long r0 = r0 + r2
            int r3 = r7.A02
            if (r6 != 0) goto L_0x087c
            boolean r2 = r7.A0T
            if (r2 != 0) goto L_0x087c
            r3 = r3 | 1
        L_0x087c:
            int[] r2 = r7.A0c
            r10 = r2[r6]
            int r11 = r11 - r10
            r9 = r3
            r12 = r0
            r7.A08(r8, r9, r10, r11, r12)
            int r6 = r6 + 1
            goto L_0x0865
        L_0x0889:
            r7.A05 = r5
            goto L_0x105a
        L_0x088d:
            int r0 = r7.A01
            r2 = 4
            if (r0 != 0) goto L_0x08fb
            X.4aw r1 = r7.A04
            r0 = r28
            long r0 = r1.A00(r0, r2, r4, r5)
            r8 = -2
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x08ef
            r28.AcS()
        L_0x08a3:
            byte[] r13 = r7.A06
            r0 = r28
            r0.AaL(r13, r5, r2)
            byte r1 = r13[r5]
            r3 = 0
        L_0x08ad:
            long[] r8 = X.C88694aw.A03
            int r0 = r8.length
            if (r3 >= r0) goto L_0x091f
            r14 = r8[r3]
            long r8 = (long) r1
            long r14 = r14 & r8
            r10 = 0
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            int r3 = r3 + 1
            if (r0 == 0) goto L_0x08ad
            r0 = -1
            if (r3 == r0) goto L_0x091f
            if (r3 > r2) goto L_0x091f
            r11 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r11
            r10 = 1
        L_0x08c7:
            if (r10 >= r3) goto L_0x08d4
            r0 = 8
            long r8 = r8 << r0
            byte r0 = r13[r10]
            long r0 = (long) r0
            long r0 = r0 & r11
            long r8 = r8 | r0
            int r10 = r10 + 1
            goto L_0x08c7
        L_0x08d4:
            int r1 = (int) r8
            r0 = 357149030(0x1549a966, float:4.072526E-26)
            if (r1 == r0) goto L_0x08e9
            r0 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r1 == r0) goto L_0x08e9
            r0 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r0) goto L_0x08e9
            r0 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r1 != r0) goto L_0x091f
        L_0x08e9:
            r0 = r28
            r0.Afx(r3)
            long r0 = (long) r1
        L_0x08ef:
            r8 = -1
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x10a3
            int r3 = (int) r0
            r7.A00 = r3
            r7.A01 = r4
            r0 = 1
        L_0x08fb:
            r11 = 2
            if (r0 != r4) goto L_0x090c
            X.4aw r3 = r7.A04
            r1 = 8
            r0 = r28
            long r0 = r3.A00(r0, r1, r5, r4)
            r7.A02 = r0
            r7.A01 = r11
        L_0x090c:
            X.5LH r3 = r7.A03
            int r8 = r7.A00
            switch(r8) {
                case 131: goto L_0x0928;
                case 134: goto L_0x0cb0;
                case 136: goto L_0x0928;
                case 155: goto L_0x0928;
                case 159: goto L_0x0928;
                case 160: goto L_0x0f58;
                case 161: goto L_0x0a07;
                case 163: goto L_0x0a07;
                case 165: goto L_0x0a07;
                case 166: goto L_0x0f58;
                case 174: goto L_0x0f58;
                case 176: goto L_0x0928;
                case 179: goto L_0x0928;
                case 181: goto L_0x0926;
                case 183: goto L_0x0f58;
                case 186: goto L_0x0928;
                case 187: goto L_0x0f58;
                case 215: goto L_0x0928;
                case 224: goto L_0x0f58;
                case 225: goto L_0x0f58;
                case 231: goto L_0x0928;
                case 238: goto L_0x0928;
                case 241: goto L_0x0928;
                case 251: goto L_0x0928;
                case 16868: goto L_0x0f58;
                case 16871: goto L_0x0928;
                case 16877: goto L_0x0a07;
                case 16980: goto L_0x0928;
                case 16981: goto L_0x0a07;
                case 17026: goto L_0x0cb0;
                case 17029: goto L_0x0928;
                case 17143: goto L_0x0928;
                case 17545: goto L_0x0926;
                case 18401: goto L_0x0928;
                case 18402: goto L_0x0a07;
                case 18407: goto L_0x0f58;
                case 18408: goto L_0x0928;
                case 19899: goto L_0x0f58;
                case 20529: goto L_0x0928;
                case 20530: goto L_0x0928;
                case 20532: goto L_0x0f58;
                case 20533: goto L_0x0f58;
                case 21358: goto L_0x0cb0;
                case 21419: goto L_0x0a07;
                case 21420: goto L_0x0928;
                case 21432: goto L_0x0928;
                case 21680: goto L_0x0928;
                case 21682: goto L_0x0928;
                case 21690: goto L_0x0928;
                case 21930: goto L_0x0928;
                case 21936: goto L_0x0f58;
                case 21945: goto L_0x0928;
                case 21946: goto L_0x0928;
                case 21947: goto L_0x0928;
                case 21948: goto L_0x0928;
                case 21949: goto L_0x0928;
                case 21968: goto L_0x0f58;
                case 21969: goto L_0x0926;
                case 21970: goto L_0x0926;
                case 21971: goto L_0x0926;
                case 21972: goto L_0x0926;
                case 21973: goto L_0x0926;
                case 21974: goto L_0x0926;
                case 21975: goto L_0x0926;
                case 21976: goto L_0x0926;
                case 21977: goto L_0x0926;
                case 21978: goto L_0x0926;
                case 21998: goto L_0x0928;
                case 22186: goto L_0x0928;
                case 22203: goto L_0x0928;
                case 25152: goto L_0x0f58;
                case 25188: goto L_0x0928;
                case 25506: goto L_0x0a07;
                case 28032: goto L_0x0f58;
                case 30113: goto L_0x0f58;
                case 30320: goto L_0x0f58;
                case 30321: goto L_0x0928;
                case 30322: goto L_0x0a07;
                case 30323: goto L_0x0926;
                case 30324: goto L_0x0926;
                case 30325: goto L_0x0926;
                case 2274716: goto L_0x0cb0;
                case 2352003: goto L_0x0928;
                case 2807729: goto L_0x0928;
                case 290298740: goto L_0x0f58;
                case 357149030: goto L_0x0f58;
                case 374648427: goto L_0x0f58;
                case 408125543: goto L_0x0f58;
                case 440786851: goto L_0x0f58;
                case 475249515: goto L_0x0f58;
                case 524531317: goto L_0x0f58;
                default: goto L_0x0913;
            }
        L_0x0913:
            long r2 = r7.A02
            int r1 = (int) r2
            r0 = r28
            r0.Afx(r1)
            r7.A01 = r5
            goto L_0x0019
        L_0x091f:
            r0 = r28
            r0.Afx(r4)
            goto L_0x08a3
        L_0x0926:
            r1 = 5
            goto L_0x0929
        L_0x0928:
            r1 = 2
        L_0x0929:
            r12 = 8
            if (r1 == r11) goto L_0x0d2f
            r0 = 3
            if (r1 == r0) goto L_0x0cb0
            if (r1 == r2) goto L_0x0a07
            long r0 = r7.A02
            r9 = 4
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x094a
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x094a
            java.lang.String r2 = "Invalid float size: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r2)
            java.lang.String r0 = X.C13680ns.A0j(r2, r0)
            goto L_0x100c
        L_0x094a:
            int r11 = (int) r0
            byte[] r13 = r7.A06
            r12 = 0
            r0 = r28
            r0.readFully(r13, r5, r11)
            r0 = 0
        L_0x0955:
            if (r12 >= r11) goto L_0x0963
            r6 = 8
            long r0 = r0 << r6
            byte r6 = r13[r12]
            r6 = r6 & 255(0xff, float:3.57E-43)
            long r9 = (long) r6
            long r0 = r0 | r9
            int r12 = r12 + 1
            goto L_0x0955
        L_0x0963:
            if (r11 != r2) goto L_0x097f
            int r2 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r2)
            double r0 = (double) r0
        L_0x096b:
            X.4os r3 = (X.C96774os) r3
            X.4oa r6 = r3.A00
            r2 = 181(0xb5, float:2.54E-43)
            if (r8 == r2) goto L_0x09fe
            r2 = 17545(0x4489, float:2.4586E-41)
            if (r8 == r2) goto L_0x09f9
            switch(r8) {
                case 21969: goto L_0x099f;
                case 21970: goto L_0x09a8;
                case 21971: goto L_0x09b1;
                case 21972: goto L_0x09ba;
                case 21973: goto L_0x09c3;
                case 21974: goto L_0x09cc;
                case 21975: goto L_0x09d5;
                case 21976: goto L_0x09de;
                case 21977: goto L_0x09e7;
                case 21978: goto L_0x09f0;
                default: goto L_0x097a;
            }
        L_0x097a:
            switch(r8) {
                case 30323: goto L_0x0984;
                case 30324: goto L_0x098d;
                case 30325: goto L_0x0996;
                default: goto L_0x097d;
            }
        L_0x097d:
            goto L_0x0faf
        L_0x097f:
            double r0 = java.lang.Double.longBitsToDouble(r0)
            goto L_0x096b
        L_0x0984:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A0A = r2
            goto L_0x0faf
        L_0x098d:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A08 = r2
            goto L_0x0faf
        L_0x0996:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A09 = r2
            goto L_0x0faf
        L_0x099f:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A06 = r2
            goto L_0x0faf
        L_0x09a8:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A07 = r2
            goto L_0x0faf
        L_0x09b1:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A04 = r2
            goto L_0x0faf
        L_0x09ba:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A05 = r2
            goto L_0x0faf
        L_0x09c3:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A02 = r2
            goto L_0x0faf
        L_0x09cc:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A03 = r2
            goto L_0x0faf
        L_0x09d5:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A0B = r2
            goto L_0x0faf
        L_0x09de:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A0C = r2
            goto L_0x0faf
        L_0x09e7:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A00 = r2
            goto L_0x0faf
        L_0x09f0:
            X.4SL r3 = A00(r6, r8)
            float r2 = (float) r0
            r3.A01 = r2
            goto L_0x0faf
        L_0x09f9:
            long r2 = (long) r0
            r6.A0H = r2
            goto L_0x0faf
        L_0x09fe:
            X.4SL r3 = A00(r6, r2)
            int r2 = (int) r0
            r3.A0U = r2
            goto L_0x0faf
        L_0x0a07:
            long r0 = r7.A02
            int r9 = (int) r0
            X.4os r3 = (X.C96774os) r3
            X.4oa r6 = r3.A00
            r1 = 161(0xa1, float:2.26E-43)
            r0 = 163(0xa3, float:2.28E-43)
            r20 = 2
            r10 = 0
            if (r8 == r1) goto L_0x0ace
            if (r8 == r0) goto L_0x0ace
            r0 = 165(0xa5, float:2.31E-43)
            if (r8 == r0) goto L_0x0a6b
            r0 = 16877(0x41ed, float:2.365E-41)
            if (r8 == r0) goto L_0x0a56
            r0 = 16981(0x4255, float:2.3795E-41)
            if (r8 == r0) goto L_0x0a4d
            r1 = 18402(0x47e2, float:2.5787E-41)
            if (r8 == r1) goto L_0x0ab3
            r0 = 21419(0x53ab, float:3.0014E-41)
            if (r8 == r0) goto L_0x0a97
            r0 = 25506(0x63a2, float:3.5742E-41)
            if (r8 == r0) goto L_0x0a44
            r0 = 30322(0x7672, float:4.249E-41)
            if (r8 != r0) goto L_0x0a8f
            X.4SL r0 = A00(r6, r8)
            byte[] r1 = new byte[r9]
            r0.A0n = r1
        L_0x0a3d:
            r0 = r28
            r0.readFully(r1, r5, r9)
            goto L_0x0faf
        L_0x0a44:
            X.4SL r0 = A00(r6, r8)
            byte[] r1 = new byte[r9]
            r0.A0l = r1
            goto L_0x0a3d
        L_0x0a4d:
            X.4SL r0 = A00(r6, r8)
            byte[] r1 = new byte[r9]
            r0.A0o = r1
            goto L_0x0a3d
        L_0x0a56:
            X.4SL r2 = A00(r6, r0)
            int r1 = r2.A0E
            r0 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 == r0) goto L_0x0a66
            r0 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 != r0) goto L_0x0ac7
        L_0x0a66:
            byte[] r1 = new byte[r9]
            r2.A0m = r1
            goto L_0x0a3d
        L_0x0a6b:
            int r0 = r6.A05
            if (r0 != r11) goto L_0x0faf
            android.util.SparseArray r1 = r6.A0d
            int r0 = r6.A06
            java.lang.Object r1 = r1.get(r0)
            X.4SL r1 = (X.AnonymousClass4SL) r1
            int r0 = r6.A01
            if (r0 != r2) goto L_0x0ac7
            java.lang.String r1 = r1.A0e
            java.lang.String r0 = "V_VP9"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0ac7
            X.4eH r0 = r6.A0g
            r0.A0Q(r9)
            byte[] r1 = r0.A02
            goto L_0x0a3d
        L_0x0a8f:
            java.lang.String r0 = "Unexpected id: "
            java.lang.String r0 = X.C13680ns.A0c(r8, r0)
            goto L_0x100c
        L_0x0a97:
            X.4eH r3 = r6.A0n
            byte[] r0 = r3.A02
            java.util.Arrays.fill(r0, r5)
            byte[] r2 = r3.A02
            int r1 = 4 - r9
            r0 = r28
            r0.readFully(r2, r1, r9)
            r3.A0S(r5)
            long r1 = r3.A0I()
            int r0 = (int) r1
            r6.A0C = r0
            goto L_0x0faf
        L_0x0ab3:
            byte[] r2 = new byte[r9]
            r0 = r28
            r0.readFully(r2, r5, r9)
            X.4SL r1 = A00(r6, r1)
            X.4Uh r0 = new X.4Uh
            r0.<init>(r4, r2, r5, r5)
            r1.A0b = r0
            goto L_0x0faf
        L_0x0ac7:
            r0 = r28
            r0.Afx(r9)
            goto L_0x0faf
        L_0x0ace:
            int r3 = r6.A05
            r19 = 8
            if (r3 != 0) goto L_0x0af4
            X.4aw r11 = r6.A0f
            r1 = r28
            r0 = 8
            long r0 = r11.A00(r1, r0, r5, r4)
            int r3 = (int) r0
            r6.A06 = r3
            int r0 = r11.A00
            r6.A07 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.A0D = r0
            r6.A05 = r4
            r3 = 1
            X.4eH r0 = r6.A0m
            r0.A0Q(r5)
        L_0x0af4:
            android.util.SparseArray r1 = r6.A0d
            int r0 = r6.A06
            java.lang.Object r18 = r1.get(r0)
            r0 = r18
            X.4SL r0 = (X.AnonymousClass4SL) r0
            r18 = r0
            if (r0 != 0) goto L_0x0b10
            int r0 = r6.A07
            int r9 = r9 - r0
            r0 = r28
            r0.Afx(r9)
        L_0x0b0c:
            r6.A05 = r5
            goto L_0x0faf
        L_0x0b10:
            if (r3 != r4) goto L_0x0b63
            r15 = 3
            r0 = r28
            r6.A07(r0, r15)
            X.4eH r12 = r6.A0m
            byte[] r0 = r12.A02
            byte r0 = r0[r20]
            r14 = r0 & 6
            int r14 = r14 >> r4
            r13 = 255(0xff, float:3.57E-43)
            if (r14 != 0) goto L_0x0ba2
            r6.A03 = r4
            int[] r1 = r6.A0c
            if (r1 != 0) goto L_0x0b98
            int[] r1 = new int[r4]
        L_0x0b2d:
            r6.A0c = r1
            int r0 = r6.A07
            int r9 = r9 - r0
            int r9 = r9 - r15
            r1[r5] = r9
        L_0x0b35:
            byte[] r9 = r12.A02
            byte r1 = r9[r5]
            int r1 = r1 << r19
            byte r0 = r9[r4]
            r0 = r0 & r13
            r1 = r1 | r0
            long r2 = r6.A0F
            long r0 = (long) r1
            long r0 = r6.A04(r0)
            long r2 = r2 + r0
            r6.A0E = r2
            r0 = r18
            int r1 = r0.A0W
            r0 = 2
            if (r1 == r0) goto L_0x0b5b
            r0 = 163(0xa3, float:2.28E-43)
            if (r8 != r0) goto L_0x0b96
            byte r1 = r9[r20]
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0b96
        L_0x0b5b:
            r0 = 1
        L_0x0b5c:
            r6.A02 = r0
            r0 = 2
            r6.A05 = r0
            r6.A04 = r5
        L_0x0b63:
            r0 = 163(0xa3, float:2.28E-43)
            if (r8 != r0) goto L_0x0c89
        L_0x0b67:
            int r1 = r6.A04
            int r0 = r6.A03
            if (r1 >= r0) goto L_0x0b0c
            int[] r0 = r6.A0c
            r2 = r0[r1]
            r1 = r28
            r0 = r18
            int r11 = r6.A03(r1, r0, r2)
            long r2 = r6.A0E
            int r1 = r6.A04
            int r0 = r0.A0J
            int r1 = r1 * r0
            int r0 = r1 / 1000
            long r0 = (long) r0
            long r0 = r0 + r2
            int r2 = r6.A02
            r12 = 0
            r8 = r6
            r9 = r18
            r10 = r2
            r13 = r0
            r8.A08(r9, r10, r11, r12, r13)
            int r0 = r6.A04
            int r0 = r0 + 1
            r6.A04 = r0
            goto L_0x0b67
        L_0x0b96:
            r0 = 0
            goto L_0x0b5c
        L_0x0b98:
            int r0 = r1.length
            if (r0 >= r4) goto L_0x0b2d
            int r0 = java.lang.Math.max(r5, r4)
            int[] r1 = new int[r0]
            goto L_0x0b2d
        L_0x0ba2:
            r11 = 4
            r0 = r28
            r6.A07(r0, r2)
            byte[] r0 = r12.A02
            byte r0 = r0[r15]
            r0 = r0 & r13
            int r3 = r0 + 1
            r6.A03 = r3
            int[] r1 = r6.A0c
            if (r1 != 0) goto L_0x0bc6
            int[] r1 = new int[r3]
        L_0x0bb7:
            r6.A0c = r1
            r0 = 2
            if (r14 != r0) goto L_0x0bd2
            int r0 = r6.A07
            int r9 = r9 - r0
            int r9 = r9 - r2
            int r9 = r9 / r3
            java.util.Arrays.fill(r1, r5, r3, r9)
            goto L_0x0b35
        L_0x0bc6:
            int r0 = r1.length
            if (r0 >= r3) goto L_0x0bb7
            int r0 = r0 << 1
            int r0 = java.lang.Math.max(r0, r3)
            int[] r1 = new int[r0]
            goto L_0x0bb7
        L_0x0bd2:
            if (r14 != r4) goto L_0x0bfa
            r3 = 0
        L_0x0bd5:
            int r2 = r6.A03
            int r0 = r2 + -1
            if (r3 >= r0) goto L_0x0c7f
            r1[r3] = r5
        L_0x0bdd:
            int r11 = r11 + 1
            r0 = r28
            r6.A07(r0, r11)
            byte[] r1 = r12.A02
            int r0 = r11 + -1
            byte r2 = r1[r0]
            r2 = r2 & r13
            int[] r1 = r6.A0c
            r0 = r1[r3]
            int r0 = r0 + r2
            r1[r3] = r0
            if (r2 == r13) goto L_0x0bdd
            r0 = r1[r3]
            int r10 = r10 + r0
            int r3 = r3 + 1
            goto L_0x0bd5
        L_0x0bfa:
            if (r14 != r15) goto L_0x0ca8
            r14 = 0
            r17 = 0
        L_0x0bff:
            int r2 = r6.A03
            int r0 = r2 + -1
            if (r14 >= r0) goto L_0x0c77
            r1[r14] = r5
            int r11 = r11 + 1
            r0 = r28
            r6.A07(r0, r11)
            byte[] r2 = r12.A02
            int r3 = r11 + -1
            byte r0 = r2[r3]
            if (r0 != 0) goto L_0x0c1a
            java.lang.String r0 = "No valid varint length mask found"
            goto L_0x100c
        L_0x0c1a:
            int r0 = 7 - r10
            int r1 = r4 << r0
            byte r0 = r2[r3]
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0c42
            int r11 = r11 + r10
            r0 = r28
            r6.A07(r0, r11)
            byte[] r15 = r12.A02
            int r0 = r3 + 1
            byte r2 = r15[r3]
            r2 = r2 & r13
            r1 = r1 ^ -1
            r2 = r2 & r1
            long r2 = (long) r2
        L_0x0c34:
            if (r0 >= r11) goto L_0x0c4b
            long r2 = r2 << r19
            int r16 = r0 + 1
            byte r0 = r15[r0]
            r0 = r0 & r13
            long r0 = (long) r0
            long r2 = r2 | r0
            r0 = r16
            goto L_0x0c34
        L_0x0c42:
            int r10 = r10 + 1
            r0 = 8
            if (r10 < r0) goto L_0x0c1a
            r2 = 0
            goto L_0x0c65
        L_0x0c4b:
            if (r14 <= 0) goto L_0x0c57
            int r0 = r10 * 7
            int r0 = r0 + 6
            r15 = 1
            long r0 = r15 << r0
            long r0 = r0 - r15
            long r2 = r2 - r0
        L_0x0c57:
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0ca4
            r15 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x0ca4
        L_0x0c65:
            int r10 = (int) r2
            int[] r1 = r6.A0c
            if (r14 == 0) goto L_0x0c6f
            int r0 = r14 + -1
            r0 = r1[r0]
            int r10 = r10 + r0
        L_0x0c6f:
            r1[r14] = r10
            int r17 = r17 + r10
            int r14 = r14 + 1
            r10 = 0
            goto L_0x0bff
        L_0x0c77:
            int r2 = r2 - r4
            int r0 = r6.A07
            int r9 = r9 - r0
            int r9 = r9 - r11
            int r9 = r9 - r17
            goto L_0x0c85
        L_0x0c7f:
            int r2 = r2 - r4
            int r0 = r6.A07
            int r9 = r9 - r0
            int r9 = r9 - r11
            int r9 = r9 - r10
        L_0x0c85:
            r1[r2] = r9
            goto L_0x0b35
        L_0x0c89:
            int r8 = r6.A04
            int r0 = r6.A03
            if (r8 >= r0) goto L_0x0faf
            int[] r3 = r6.A0c
            r2 = r3[r8]
            r1 = r28
            r0 = r18
            int r0 = r6.A03(r1, r0, r2)
            r3[r8] = r0
            int r0 = r6.A04
            int r0 = r0 + 1
            r6.A04 = r0
            goto L_0x0c89
        L_0x0ca4:
            java.lang.String r0 = "EBML lacing sample size out of range."
            goto L_0x100c
        L_0x0ca8:
            java.lang.String r0 = "Unexpected lacing value: "
            java.lang.String r0 = X.C13680ns.A0c(r14, r0)
            goto L_0x100c
        L_0x0cb0:
            long r0 = r7.A02
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0d23
            int r9 = (int) r0
            if (r9 != 0) goto L_0x0cdb
            java.lang.String r6 = ""
        L_0x0cbe:
            X.4os r3 = (X.C96774os) r3
            X.4oa r1 = r3.A00
            r0 = 134(0x86, float:1.88E-43)
            if (r8 == r0) goto L_0x0d1b
            r0 = 17026(0x4282, float:2.3859E-41)
            if (r8 == r0) goto L_0x0cfa
            r0 = 21358(0x536e, float:2.9929E-41)
            if (r8 == r0) goto L_0x0cf2
            r0 = 2274716(0x22b59c, float:3.187556E-39)
            if (r8 != r0) goto L_0x0faf
            X.4SL r0 = A00(r1, r0)
            r0.A0f = r6
            goto L_0x0faf
        L_0x0cdb:
            byte[] r2 = new byte[r9]
            r0 = r28
            r0.readFully(r2, r5, r9)
        L_0x0ce2:
            if (r9 <= 0) goto L_0x0cec
            int r1 = r9 + -1
            byte r0 = r2[r1]
            if (r0 != 0) goto L_0x0cec
            r9 = r1
            goto L_0x0ce2
        L_0x0cec:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r2, r5, r9)
            goto L_0x0cbe
        L_0x0cf2:
            X.4SL r0 = A00(r1, r0)
            r0.A0g = r6
            goto L_0x0faf
        L_0x0cfa:
            java.lang.String r0 = "webm"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0faf
            java.lang.String r0 = "matroska"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0faf
            java.lang.String r0 = "DocType "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r6)
            java.lang.String r0 = " not supported"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            goto L_0x100c
        L_0x0d1b:
            X.4SL r0 = A00(r1, r0)
            r0.A0e = r6
            goto L_0x0faf
        L_0x0d23:
            java.lang.String r2 = "String element size: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r2)
            java.lang.String r0 = X.C13680ns.A0j(r2, r0)
            goto L_0x100c
        L_0x0d2f:
            long r0 = r7.A02
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 > 0) goto L_0x0f4c
            int r11 = (int) r0
            byte[] r13 = r7.A06
            r12 = 0
            r0 = r28
            r0.readFully(r13, r5, r11)
            r0 = 0
        L_0x0d40:
            if (r12 >= r11) goto L_0x0d4e
            r6 = 8
            long r0 = r0 << r6
            byte r6 = r13[r12]
            r6 = r6 & 255(0xff, float:3.57E-43)
            long r9 = (long) r6
            long r0 = r0 | r9
            int r12 = r12 + 1
            goto L_0x0d40
        L_0x0d4e:
            X.4os r3 = (X.C96774os) r3
            X.4oa r6 = r3.A00
            r9 = 20529(0x5031, float:2.8767E-41)
            java.lang.String r3 = " not supported"
            if (r8 == r9) goto L_0x0f30
            r9 = 20530(0x5032, float:2.8769E-41)
            r12 = 1
            if (r8 == r9) goto L_0x0f29
            r11 = 0
            r10 = 3
            r9 = 2
            switch(r8) {
                case 131: goto L_0x0e93;
                case 136: goto L_0x0e9c;
                case 155: goto L_0x0de5;
                case 159: goto L_0x0ea9;
                case 176: goto L_0x0eb2;
                case 179: goto L_0x0ded;
                case 186: goto L_0x0ebb;
                case 215: goto L_0x0ec4;
                case 231: goto L_0x0dfb;
                case 238: goto L_0x0e03;
                case 241: goto L_0x0e08;
                case 251: goto L_0x0e18;
                case 16871: goto L_0x0ecd;
                case 16980: goto L_0x0ddb;
                case 17029: goto L_0x0e1c;
                case 17143: goto L_0x0e2c;
                case 18401: goto L_0x0e34;
                case 18408: goto L_0x0f39;
                case 21420: goto L_0x0e3e;
                case 21432: goto L_0x0e45;
                case 21680: goto L_0x0ed6;
                case 21682: goto L_0x0edf;
                case 21690: goto L_0x0ee8;
                case 21930: goto L_0x0ef1;
                case 21998: goto L_0x0efe;
                case 22186: goto L_0x0f07;
                case 22203: goto L_0x0f0f;
                case 25188: goto L_0x0f17;
                case 30321: goto L_0x0e6b;
                case 2352003: goto L_0x0f20;
                case 2807729: goto L_0x0e8f;
                default: goto L_0x0d64;
            }
        L_0x0d64:
            r11 = 7
            r3 = 6
            switch(r8) {
                case 21945: goto L_0x0d6b;
                case 21946: goto L_0x0d7f;
                case 21947: goto L_0x0da5;
                case 21948: goto L_0x0dc9;
                case 21949: goto L_0x0dd2;
                default: goto L_0x0d69;
            }
        L_0x0d69:
            goto L_0x0faf
        L_0x0d6b:
            r6.A06(r8)
            int r2 = (int) r0
            if (r2 == r4) goto L_0x0d79
            if (r2 != r9) goto L_0x0faf
            X.4SL r0 = r6.A0P
            r0.A0G = r4
            goto L_0x0faf
        L_0x0d79:
            X.4SL r0 = r6.A0P
            r0.A0G = r9
            goto L_0x0faf
        L_0x0d7f:
            r6.A06(r8)
            int r2 = (int) r0
            if (r2 == r4) goto L_0x0d9f
            r0 = 16
            if (r2 == r0) goto L_0x0d99
            r0 = 18
            if (r2 == r0) goto L_0x0d93
            if (r2 == r3) goto L_0x0d9f
            if (r2 == r11) goto L_0x0d9f
            goto L_0x0faf
        L_0x0d93:
            X.4SL r0 = r6.A0P
            r0.A0I = r11
            goto L_0x0faf
        L_0x0d99:
            X.4SL r0 = r6.A0P
            r0.A0I = r3
            goto L_0x0faf
        L_0x0d9f:
            X.4SL r0 = r6.A0P
            r0.A0I = r10
            goto L_0x0faf
        L_0x0da5:
            X.4SL r8 = A00(r6, r8)
            r8.A0j = r4
            int r6 = (int) r0
            if (r6 == r4) goto L_0x0dc5
            r0 = 9
            if (r6 == r0) goto L_0x0dc1
            if (r6 == r2) goto L_0x0dbd
            r0 = 5
            if (r6 == r0) goto L_0x0dbd
            if (r6 == r3) goto L_0x0dbd
            if (r6 == r11) goto L_0x0dbd
            goto L_0x0faf
        L_0x0dbd:
            r8.A0H = r9
            goto L_0x0faf
        L_0x0dc1:
            r8.A0H = r3
            goto L_0x0faf
        L_0x0dc5:
            r8.A0H = r4
            goto L_0x0faf
        L_0x0dc9:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0P = r2
            goto L_0x0faf
        L_0x0dd2:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0Q = r2
            goto L_0x0faf
        L_0x0ddb:
            r8 = 3
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0faf
            java.lang.String r2 = "ContentCompAlgo "
            goto L_0x0f3f
        L_0x0de5:
            long r0 = r6.A04(r0)
            r6.A0D = r0
            goto L_0x0faf
        L_0x0ded:
            r6.A05(r8)
            X.4TJ r2 = r6.A0R
            long r0 = r6.A04(r0)
            r2.A01(r0)
            goto L_0x0faf
        L_0x0dfb:
            long r0 = r6.A04(r0)
            r6.A0F = r0
            goto L_0x0faf
        L_0x0e03:
            int r2 = (int) r0
            r6.A01 = r2
            goto L_0x0faf
        L_0x0e08:
            boolean r2 = r6.A0a
            if (r2 != 0) goto L_0x0faf
            r6.A05(r8)
            X.4TJ r2 = r6.A0Q
            r2.A01(r0)
            r6.A0a = r4
            goto L_0x0faf
        L_0x0e18:
            r6.A0T = r4
            goto L_0x0faf
        L_0x0e1c:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x0e28
            r8 = 2
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0e28
            goto L_0x0faf
        L_0x0e28:
            java.lang.String r2 = "DocTypeReadVersion "
            goto L_0x0f3f
        L_0x0e2c:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0faf
            java.lang.String r2 = "EBMLReadVersion "
            goto L_0x0f3f
        L_0x0e34:
            r8 = 5
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0faf
            java.lang.String r2 = "ContentEncAlgo "
            goto L_0x0f3f
        L_0x0e3e:
            long r2 = r6.A0L
            long r0 = r0 + r2
            r6.A0J = r0
            goto L_0x0faf
        L_0x0e45:
            int r2 = (int) r0
            r6.A06(r8)
            if (r2 == 0) goto L_0x0e65
            if (r2 == r4) goto L_0x0e5f
            if (r2 == r10) goto L_0x0e59
            r0 = 15
            if (r2 != r0) goto L_0x0faf
            X.4SL r0 = r6.A0P
            r0.A0V = r10
            goto L_0x0faf
        L_0x0e59:
            X.4SL r0 = r6.A0P
            r0.A0V = r4
            goto L_0x0faf
        L_0x0e5f:
            X.4SL r0 = r6.A0P
            r0.A0V = r9
            goto L_0x0faf
        L_0x0e65:
            X.4SL r0 = r6.A0P
            r0.A0V = r5
            goto L_0x0faf
        L_0x0e6b:
            r6.A06(r8)
            int r2 = (int) r0
            if (r2 == 0) goto L_0x0e89
            if (r2 == r4) goto L_0x0e83
            if (r2 == r9) goto L_0x0e7d
            if (r2 != r10) goto L_0x0faf
            X.4SL r0 = r6.A0P
            r0.A0T = r10
            goto L_0x0faf
        L_0x0e7d:
            X.4SL r0 = r6.A0P
            r0.A0T = r9
            goto L_0x0faf
        L_0x0e83:
            X.4SL r0 = r6.A0P
            r0.A0T = r4
            goto L_0x0faf
        L_0x0e89:
            X.4SL r0 = r6.A0P
            r0.A0T = r5
            goto L_0x0faf
        L_0x0e8f:
            r6.A0N = r0
            goto L_0x0faf
        L_0x0e93:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0W = r2
            goto L_0x0faf
        L_0x0e9c:
            X.4SL r3 = A00(r6, r8)
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0ea5
            r11 = 1
        L_0x0ea5:
            r3.A0h = r11
            goto L_0x0faf
        L_0x0ea9:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0F = r2
            goto L_0x0faf
        L_0x0eb2:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0X = r2
            goto L_0x0faf
        L_0x0ebb:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0N = r2
            goto L_0x0faf
        L_0x0ec4:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0S = r2
            goto L_0x0faf
        L_0x0ecd:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0E = r2
            goto L_0x0faf
        L_0x0ed6:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0M = r2
            goto L_0x0faf
        L_0x0edf:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0L = r2
            goto L_0x0faf
        L_0x0ee8:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0K = r2
            goto L_0x0faf
        L_0x0ef1:
            X.4SL r3 = A00(r6, r8)
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0efa
            r11 = 1
        L_0x0efa:
            r3.A0i = r11
            goto L_0x0faf
        L_0x0efe:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0O = r2
            goto L_0x0faf
        L_0x0f07:
            X.4SL r2 = A00(r6, r8)
            r2.A0Y = r0
            goto L_0x0faf
        L_0x0f0f:
            X.4SL r2 = A00(r6, r8)
            r2.A0Z = r0
            goto L_0x0faf
        L_0x0f17:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0D = r2
            goto L_0x0faf
        L_0x0f20:
            X.4SL r3 = A00(r6, r8)
            int r2 = (int) r0
            r3.A0J = r2
            goto L_0x0faf
        L_0x0f29:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0faf
            java.lang.String r2 = "ContentEncodingScope "
            goto L_0x0f3f
        L_0x0f30:
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0faf
            java.lang.String r2 = "ContentEncodingOrder "
            goto L_0x0f3f
        L_0x0f39:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0faf
            java.lang.String r2 = "AESSettingsCipherMode "
        L_0x0f3f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r2)
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r2)
            goto L_0x100c
        L_0x0f4c:
            java.lang.String r2 = "Invalid integer size: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r2)
            java.lang.String r0 = X.C13680ns.A0j(r2, r0)
            goto L_0x100c
        L_0x0f58:
            long r2 = r28.AF7()
            long r0 = r7.A02
            long r0 = r0 + r2
            X.4GA r9 = new X.4GA
            r9.<init>(r8, r0)
            r6.push(r9)
            X.5LH r0 = r7.A03
            int r1 = r7.A00
            long r10 = r7.A02
            X.4os r0 = (X.C96774os) r0
            X.4oa r12 = r0.A00
            X.0qG r6 = r12.A0O
            X.C90524eJ.A01(r6)
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 == r0) goto L_0x0ffb
            r0 = 174(0xae, float:2.44E-43)
            if (r1 == r0) goto L_0x0ff3
            r0 = 187(0xbb, float:2.62E-43)
            if (r1 == r0) goto L_0x0ff0
            r0 = 19899(0x4dbb, float:2.7884E-41)
            r8 = -1
            if (r1 == r0) goto L_0x0fea
            r0 = 20533(0x5035, float:2.8773E-41)
            if (r1 == r0) goto L_0x0fe3
            r0 = 21968(0x55d0, float:3.0784E-41)
            if (r1 == r0) goto L_0x0fdc
            r0 = 408125543(0x18538067, float:2.7335937E-24)
            if (r1 == r0) goto L_0x0fca
            r0 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r0) goto L_0x0fbb
            r0 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r1 != r0) goto L_0x0faf
            boolean r0 = r12.A0b
            if (r0 != 0) goto L_0x0faf
            boolean r0 = r12.A0q
            if (r0 == 0) goto L_0x0fb3
            long r0 = r12.A0G
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0fb3
            r12.A0Z = r4
        L_0x0faf:
            r7.A01 = r5
            goto L_0x105a
        L_0x0fb3:
            long r0 = r12.A0I
            X.AnonymousClass3K2.A15(r6, r0)
            r12.A0b = r4
            goto L_0x0faf
        L_0x0fbb:
            X.4TJ r0 = new X.4TJ
            r0.<init>()
            r12.A0R = r0
            X.4TJ r0 = new X.4TJ
            r0.<init>()
            r12.A0Q = r0
            goto L_0x0faf
        L_0x0fca:
            long r0 = r12.A0L
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0fd7
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0fd7
            java.lang.String r0 = "Multiple Segment elements not supported"
            goto L_0x100c
        L_0x0fd7:
            r12.A0L = r2
            r12.A0M = r10
            goto L_0x0faf
        L_0x0fdc:
            X.4SL r0 = A00(r12, r0)
            r0.A0j = r4
            goto L_0x0faf
        L_0x0fe3:
            X.4SL r0 = A00(r12, r0)
            r0.A0k = r4
            goto L_0x0faf
        L_0x0fea:
            r0 = -1
            r12.A0C = r0
            r12.A0J = r8
            goto L_0x0faf
        L_0x0ff0:
            r12.A0a = r5
            goto L_0x0faf
        L_0x0ff3:
            X.4SL r0 = new X.4SL
            r0.<init>()
            r12.A0P = r0
            goto L_0x0faf
        L_0x0ffb:
            r12.A0T = r5
            goto L_0x0faf
        L_0x0ffe:
            X.4SL r1 = A00(r7, r1)
            boolean r0 = r1.A0k
            if (r0 == 0) goto L_0x105a
            byte[] r0 = r1.A0o
            if (r0 == 0) goto L_0x105a
            java.lang.String r0 = "Combining encryption and compression is not supported"
        L_0x100c:
            X.40M r0 = X.AnonymousClass40M.A00(r0)
            throw r0
        L_0x1011:
            long r0 = r7.A0L
            long r9 = r7.A0M
            long r0 = r0 + r9
            r9 = r6[r11]
            long r0 = r0 - r9
            int r9 = (int) r0
            r8[r11] = r9
            long r0 = r7.A0I
            r9 = r2[r11]
            long r0 = r0 - r9
            r3[r11] = r0
            r12 = 0
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 > 0) goto L_0x1048
            java.lang.String r9 = "Discarding last cue point with unexpected duration: "
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0r(r9)
            java.lang.String r1 = X.C13680ns.A0j(r9, r0)
            java.lang.String r0 = "MatroskaExtractor"
            android.util.Log.w(r0, r1)
            int[] r8 = java.util.Arrays.copyOf(r8, r11)
            long[] r6 = java.util.Arrays.copyOf(r6, r11)
            long[] r3 = java.util.Arrays.copyOf(r3, r11)
            long[] r2 = java.util.Arrays.copyOf(r2, r11)
        L_0x1048:
            X.4oo r9 = new X.4oo
            r9.<init>(r8, r6, r3, r2)
        L_0x104d:
            r0 = r25
            r0.AdD(r9)
            r7.A0b = r4
        L_0x1054:
            r0 = r16
            r7.A0R = r0
            r7.A0Q = r0
        L_0x105a:
            long r1 = r28.AF7()
            r0 = r26
            boolean r0 = r0.A0Z
            r3 = r29
            if (r0 == 0) goto L_0x1073
            r0 = r26
            r0.A0K = r1
            long r0 = r0.A0G
            r3.A00 = r0
            r0 = r26
            r0.A0Z = r5
            return r4
        L_0x1073:
            r0 = r26
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x0008
            r0 = r26
            long r6 = r0.A0K
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0008
            r3.A00 = r6
            r0 = r26
            r0.A0K = r1
            return r4
        L_0x108a:
            X.40M r0 = X.AnonymousClass40M.A00(r17)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            goto L_0x109d
        L_0x108f:
            X.40M r0 = X.AnonymousClass40M.A00(r17)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            goto L_0x109d
        L_0x1094:
            X.40M r0 = X.AnonymousClass40M.A00(r17)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            goto L_0x109d
        L_0x1099:
            X.40M r0 = X.AnonymousClass40M.A00(r17)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
        L_0x109d:
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
        L_0x109e:
            X.40M r0 = X.AnonymousClass40M.A00(r17)
            throw r0
        L_0x10a3:
            r0 = r26
            android.util.SparseArray r1 = r0.A0d
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x10bd
            java.lang.Object r1 = r1.valueAt(r5)
            X.4SL r1 = (X.AnonymousClass4SL) r1
            X.4S1 r0 = r1.A0d
            if (r0 == 0) goto L_0x10ba
            r0.A00(r1)
        L_0x10ba:
            int r5 = r5 + 1
            goto L_0x10a3
        L_0x10bd:
            r0 = -1
            return r0
        L_0x10bf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96594oa.AbN(X.2iu, X.4Bt):int");
    }

    public void AdC(long j2, long j3) {
        this.A0F = -9223372036854775807L;
        int i2 = 0;
        this.A05 = 0;
        C96784ot r1 = (C96784ot) this.A0e;
        r1.A01 = 0;
        r1.A05.clear();
        C88694aw r0 = r1.A04;
        r0.A01 = 0;
        r0.A00 = 0;
        C88694aw r02 = this.A0f;
        r02.A01 = 0;
        r02.A00 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0V = false;
        this.A0Y = false;
        this.A0X = false;
        this.A0B = 0;
        this.A00 = 0;
        this.A0W = false;
        this.A0l.A0Q(0);
        while (true) {
            SparseArray sparseArray = this.A0d;
            if (i2 < sparseArray.size()) {
                AnonymousClass4S1 r12 = ((AnonymousClass4SL) sparseArray.valueAt(i2)).A0d;
                if (r12 != null) {
                    r12.A05 = false;
                    r12.A02 = 0;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final boolean Afz(C55142iu r19) {
        C90504eH A052 = C90504eH.A05(8);
        C55142iu r11 = r19;
        long length = r11.getLength();
        long j2 = FileUtils.ONE_KB;
        if (length != -1 && length <= FileUtils.ONE_KB) {
            j2 = length;
        }
        int i2 = (int) j2;
        r11.AaL(A052.A02, 0, 4);
        int i3 = 4;
        for (long A0I2 = A052.A0I(); A0I2 != 440786851; A0I2 = ((A0I2 << 8) & -256) | ((long) (A052.A02[0] & 255))) {
            i3++;
            if (i3 == i2) {
                return false;
            }
            C90504eH.A06(r11, A052, 1);
        }
        int i4 = 0;
        r11.AaL(A052.A02, 0, 1);
        byte[] bArr = A052.A02;
        byte b2 = bArr[0] & 255;
        if (b2 == 0) {
            return false;
        }
        int i5 = 128;
        int i6 = 0;
        while ((b2 & i5) == 0) {
            i5 >>= 1;
            i6++;
        }
        int i7 = b2 & (i5 ^ -1);
        r11.AaL(bArr, 1, i6);
        while (i4 < i6) {
            i4++;
            i7 = (A052.A02[i4] & 255) + (i7 << 8);
        }
        int i8 = i3 + i6 + 1;
        long j3 = (long) i7;
        long j4 = (long) i8;
        if (j3 == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j4 + j3 >= length) {
            return false;
        }
        while (true) {
            long j5 = (long) i8;
            long j6 = j4 + j3;
            if (j5 >= j6) {
                return j5 == j6;
            }
            int i9 = 0;
            r11.AaL(A052.A02, 0, 1);
            byte[] bArr2 = A052.A02;
            byte b3 = bArr2[0] & 255;
            if (b3 == 0) {
                return false;
            }
            int i10 = 128;
            int i11 = 0;
            while ((b3 & i10) == 0) {
                i10 >>= 1;
                i11++;
            }
            int i12 = b3 & (i10 ^ -1);
            r11.AaL(bArr2, 1, i11);
            while (i9 < i11) {
                i9++;
                i12 = (A052.A02[i9] & 255) + (i12 << 8);
            }
            int i13 = i8 + i11 + 1;
            if (((long) i12) == Long.MIN_VALUE) {
                return false;
            }
            int i14 = 0;
            r11.AaL(A052.A02, 0, 1);
            byte[] bArr3 = A052.A02;
            byte b4 = bArr3[0] & 255;
            if (b4 == 0) {
                return false;
            }
            int i15 = 128;
            int i16 = 0;
            while ((b4 & i15) == 0) {
                i15 >>= 1;
                i16++;
            }
            int i17 = b4 & (i15 ^ -1);
            r11.AaL(bArr3, 1, i16);
            while (i14 < i16) {
                i14++;
                i17 = (A052.A02[i14] & 255) + (i17 << 8);
            }
            i8 = i13 + i16 + 1;
            long j7 = (long) i17;
            if (j7 < 0 || j7 > 2147483647L) {
                return false;
            }
            if (j7 != 0) {
                int i18 = (int) j7;
                r11.A4m(i18);
                i8 += i18;
            }
        }
    }
}

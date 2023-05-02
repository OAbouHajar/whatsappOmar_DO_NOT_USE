package X;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1QQ  reason: invalid class name */
public class AnonymousClass1QQ {
    public static final AnonymousClass00F A04 = new AnonymousClass00F(1, 5, 650);
    public static final AnonymousClass00F A05 = new AnonymousClass00F(1, 50, 1000);
    public Set A00;
    public Set A01;
    public final C14710pd A02;
    public final C16490t9 A03;

    public AnonymousClass1QQ(C14710pd r1, C16490t9 r2) {
        this.A02 = r1;
        this.A03 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0080 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A00(java.io.InputStream r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.available()     // Catch:{ IOException -> 0x0081 }
            com.whatsapp.superpack.WhatsAppObiInputStream r3 = com.whatsapp.superpack.WhatsAppObiInputStream.openStream(r8, r0)     // Catch:{ IOException -> 0x0081 }
            r2 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)     // Catch:{ all -> 0x007c }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x007c }
            java.nio.ByteBuffer r1 = r1.order(r0)     // Catch:{ all -> 0x007c }
            byte[] r0 = r1.array()     // Catch:{ all -> 0x007c }
            int r0 = r3.read(r0)     // Catch:{ all -> 0x007c }
            if (r0 != r2) goto L_0x006c
            int r6 = r1.getInt()     // Catch:{ all -> 0x007c }
            int r5 = r1.getInt()     // Catch:{ all -> 0x007c }
            if (r6 <= 0) goto L_0x0064
            if (r5 <= 0) goto L_0x0064
            r0 = 4096(0x1000, float:5.74E-42)
            if (r6 > r0) goto L_0x005c
            if (r5 > r0) goto L_0x005c
            int r0 = r6 * r5
            int r4 = r0 << 2
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 > r0) goto L_0x0074
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r4)     // Catch:{ all -> 0x007c }
            byte[] r1 = r2.array()     // Catch:{ all -> 0x007c }
            r0 = 0
            int r0 = r3.read(r1, r0, r4)     // Catch:{ all -> 0x007c }
            if (r0 != r4) goto L_0x0054
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x007c }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r6, r5, r0)     // Catch:{ all -> 0x007c }
            r0.copyPixelsFromBuffer(r2)     // Catch:{ all -> 0x007c }
            r3.close()     // Catch:{ IOException -> 0x0081 }
            return r0
        L_0x0054:
            java.lang.String r0 = "Bytes read from stream not equal metadata size in bytes"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x007c }
            r1.<init>(r0)     // Catch:{ all -> 0x007c }
            goto L_0x007b
        L_0x005c:
            java.lang.String r0 = "Metadata height/width bigger than max value"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x007c }
            r1.<init>(r0)     // Catch:{ all -> 0x007c }
            goto L_0x007b
        L_0x0064:
            java.lang.String r0 = "Metadata height/width is zero or less"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x007c }
            r1.<init>(r0)     // Catch:{ all -> 0x007c }
            goto L_0x007b
        L_0x006c:
            java.lang.String r0 = "Dim bytes read not 8"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x007c }
            r1.<init>(r0)     // Catch:{ all -> 0x007c }
            goto L_0x007b
        L_0x0074:
            java.lang.String r0 = "Metadata has more bytes than max allowed"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x007c }
            r1.<init>(r0)     // Catch:{ all -> 0x007c }
        L_0x007b:
            throw r1     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0080 }
        L_0x0080:
            throw r0     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            java.lang.String r3 = r0.toString()
            if (r9 != 0) goto L_0x009c
            X.00F r2 = A04
            java.lang.String r0 = "doodle_emoji"
        L_0x008c:
            X.1iA r1 = new X.1iA
            r1.<init>()
            r1.A01 = r0
            r1.A02 = r3
            X.0t9 r0 = r7.A03
            r0.A0A(r1, r2)
            r0 = 0
            return r0
        L_0x009c:
            X.00F r2 = A05
            java.lang.String r0 = "regular_emoji"
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QQ.A00(java.io.InputStream, int):android.graphics.Bitmap");
    }

    public boolean A01(int i2, int i3) {
        C14710pd r2;
        int i4;
        if (i3 != 0) {
            Set set = this.A01;
            if (set == null) {
                set = new HashSet(Arrays.asList(new Integer[]{2560, 2561, 1608, 525, 2062, 2064, 2068, 411, 1561, 412, 1563, 1562, 1565, 1566, 1567, 1568, 1569, 1570, 1571, 1572, 1573, 1574, 1575, 1576, 1577, 1578, 1579, 1580, 1581, 1582, 1583, 1584, 1585, 1586, 1587, 1588, 1589, 1590, 1591, 1592, 1593, 1594, 1595, 1945, 1597, 1596, 1599, 1600, 1601, 1602, 1090, 1603, 1605, 1606, 1604, 1607, 1609, 1948, 2123, 1612, 1613, 1611, 1615, 1616, 1614, 2130, 1441, 1620, 1618, 1949, 1624, 1625, 1626, 1627, 1628, 1629, 2461, 2462, 636, 1666, 1667, 1668, 649, 657, 2195, 1172, 659, 1686, 665, 676, 677, 1190, 1191, 1193, 682, 683, 684, 1199, 1200, 688, 687, 1203, 1202, 1717, 1716, 692, 690, 1564, 707, 708, 1871, 714, 1740, 720, 1233, 1873, 726, 1240, 732, 738, 744, 1769, 1770, 355, 1772, 750, 1266, 756, 1269, 1270, 1271, 1272, 1273, 762, 1268, 1276, 1277, 1278, 1279, 1280, 1281, 768, 1283, 1284, 1285, 774, 1287, 1288, 775, 1290, 1291, 1292, 1293, 1294, 1295, 1296, 1297, 1298, 1598, 1304, 1305, 2330, 1819, 1307, 1309, 1310, 1308, 1315, 363, 1318, 807, 305, 1282, 313, 1338, 315, 1339, 318, 1895, 319, 1286, 1352, 330, 331, 1356, 334, 1870, 1872, 337, 2384, 1360, 335, 1877, 336, 1875, 1361, 2408, 1874, 1883, 1375, 1376, 1889, 354, 352, 356, 1381, 1382, 2407, 1384, 361, 362, 358, 360, 365, 366, 359, 368, 369, 370, 371, 372, 373, 367, 1399, 376, 377, 1913, 379, 378, 381, 1919, 384, 385, 386, 1409, 388, 1925, 1926, 1927, 1928, 1929, 1930, 1419, 1418, 395, 1426, 405, 1431, 1432, 1944, 1946, 1947, 410, 2459, 1950, 415, 1952, 2465, 2466, 1951, 1444, 1442, 422, 1446, 2984, 425, 426, 427, 1610, 429, 431, 432, 433, 1970, 444, 445, 446, 2501, 2509, 2515, 468, 467, 470, 478, 2019, 484, 485, 2534, 487, 1511, 2539, 491, 2541, 495, 2544, 496, 2546, 1528, 510, 1535}));
                this.A01 = set;
            }
            if (set.contains(Integer.valueOf(i2))) {
                r2 = this.A02;
                i4 = 1884;
            }
        }
        Set set2 = this.A00;
        if (set2 == null) {
            set2 = new HashSet(Arrays.asList(new Integer[]{331, 756, 1563, 2546, 2984}));
            this.A00 = set2;
        }
        if (set2.contains(Integer.valueOf(i2))) {
            r2 = this.A02;
            i4 = 2025;
        }
        return r2.A0E(C16620tM.A02, i4);
    }
}

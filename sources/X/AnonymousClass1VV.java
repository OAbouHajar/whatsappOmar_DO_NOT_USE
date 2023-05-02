package X;

import android.util.ArrayMap;
import com.mod2.fblibs.FacebookFacade;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.1VV  reason: invalid class name */
public class AnonymousClass1VV {
    public static final ArrayMap A00(AnonymousClass1VW r5, XmlPullParser xmlPullParser, String[] strArr) {
        ArrayMap arrayMap = new ArrayMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayMap.put(strArr[0], A01(r5, xmlPullParser, strArr, true));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals("map")) {
                    return arrayMap;
                }
                StringBuilder sb = new StringBuilder("Expected ");
                sb.append("map");
                sb.append(" end tag at: ");
                sb.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sb2 = new StringBuilder("Document ended before ");
        sb2.append("map");
        sb2.append(" end tag");
        throw new XmlPullParserException(sb2.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [boolean[], byte[]], vars: [r4v2 ?, r4v1 ?, r4v3 ?, r4v4 ?, r4v5 ?, r4v6 ?, r4v7 ?, r4v8 ?, r4v9 ?, r4v10 ?, r4v11 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public static final java.lang.Object A01(X.AnonymousClass1VW r14, org.xmlpull.v1.XmlPullParser r15, java.lang.String[] r16, boolean r17) {
        /*
            r1 = 0
            java.lang.String r0 = "name"
            r2 = r15
            java.lang.String r15 = r15.getAttributeValue(r1, r0)
            java.lang.String r4 = r2.getName()
            java.lang.String r0 = "null"
            boolean r0 = r4.equals(r0)
            r9 = 2
            r11 = 4
            r8 = 3
            r7 = 1
            r6 = 0
            r10 = r16
            if (r0 != 0) goto L_0x0716
            java.lang.String r5 = "string"
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L_0x008b
            java.lang.String r3 = ""
        L_0x0026:
            int r0 = r2.next()
            if (r0 == r7) goto L_0x0083
            if (r0 != r8) goto L_0x003b
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x006b
            r16[r6] = r15
            return r3
        L_0x003b:
            if (r0 != r11) goto L_0x0051
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = r2.getText()
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            goto L_0x0026
        L_0x0051:
            if (r0 != r9) goto L_0x0026
            java.lang.String r0 = "Unexpected start tag in <string>: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x006b:
            java.lang.String r0 = "Unexpected end tag in <string>: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0083:
            java.lang.String r1 = "Unexpected end of document in <string>"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x008b:
            java.lang.String r3 = ">"
            java.lang.String r0 = "int"
            boolean r0 = r4.equals(r0)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            java.lang.String r5 = "value"
            r12 = 0
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = r2.getAttributeValue(r1, r5)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            goto L_0x00e9
        L_0x00a6:
            java.lang.String r0 = "long"
            boolean r0 = r4.equals(r0)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = r2.getAttributeValue(r1, r5)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            goto L_0x00e9
        L_0x00b7:
            java.lang.String r0 = "float"
            boolean r0 = r4.equals(r0)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = r2.getAttributeValue(r1, r5)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            java.lang.Float r1 = java.lang.Float.valueOf(r0)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            goto L_0x00e9
        L_0x00c8:
            java.lang.String r0 = "double"
            boolean r0 = r4.equals(r0)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = r2.getAttributeValue(r1, r5)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            goto L_0x00e9
        L_0x00d9:
            java.lang.String r0 = "boolean"
            boolean r0 = r4.equals(r0)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = r2.getAttributeValue(r1, r5)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ NullPointerException -> 0x06ff, NumberFormatException -> 0x06e8 }
        L_0x00e9:
            if (r1 != 0) goto L_0x0716
            java.lang.String r3 = "byte-array"
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = "num"
            java.lang.String r0 = r2.getAttributeValue(r12, r0)     // Catch:{ NullPointerException -> 0x01aa, NumberFormatException -> 0x01a2 }
            int r12 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x01aa, NumberFormatException -> 0x01a2 }
            byte[] r4 = new byte[r12]
            int r0 = r2.getEventType()
        L_0x0103:
            if (r0 != r11) goto L_0x0143
            if (r12 <= 0) goto L_0x016f
            java.lang.String r5 = r2.getText()
            if (r5 == 0) goto L_0x018e
            int r1 = r5.length()
            int r0 = r12 << 1
            if (r1 != r0) goto L_0x018e
            r9 = 0
        L_0x0116:
            if (r9 >= r12) goto L_0x016f
            int r0 = r9 << 1
            char r1 = r5.charAt(r0)
            int r0 = r0 + 1
            char r14 = r5.charAt(r0)
            r13 = 97
            if (r1 <= r13) goto L_0x0140
            int r0 = r1 + -97
            int r1 = r0 + 10
        L_0x012c:
            int r0 = r14 + -48
            if (r14 <= r13) goto L_0x0134
            int r0 = r14 + -97
            int r0 = r0 + 10
        L_0x0134:
            r1 = r1 & 15
            int r1 = r1 << r11
            r0 = r0 & 15
            r0 = r0 | r1
            byte r0 = (byte) r0
            r4[r9] = r0
            int r9 = r9 + 1
            goto L_0x0116
        L_0x0140:
            int r1 = r1 + -48
            goto L_0x012c
        L_0x0143:
            if (r0 != r8) goto L_0x016f
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05a1
            java.lang.String r0 = "Expected "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag at: "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x016f:
            int r0 = r2.next()
            if (r0 != r7) goto L_0x0103
            java.lang.String r0 = "Document ended before "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x018e:
            java.lang.String r1 = "Invalid value found in byte-array: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x01a2:
            java.lang.String r1 = "Not a number in num attribute in byte-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x01aa:
            java.lang.String r1 = "Need num attribute in byte-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x01b2:
            java.lang.String r3 = "int-array"
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L_0x0277
            java.lang.String r0 = "num"
            r11 = 0
            java.lang.String r0 = r2.getAttributeValue(r12, r0)     // Catch:{ NullPointerException -> 0x026f, NumberFormatException -> 0x0267 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x026f, NumberFormatException -> 0x0267 }
            r2.next()
            int[] r4 = new int[r0]
            r12 = 0
            int r0 = r2.getEventType()
        L_0x01cf:
            java.lang.String r1 = "item"
            if (r0 != r9) goto L_0x01e8
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x022f
            java.lang.String r0 = r2.getAttributeValue(r11, r5)     // Catch:{ NullPointerException -> 0x0227, NumberFormatException -> 0x021f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x0227, NumberFormatException -> 0x021f }
            r4[r12] = r0     // Catch:{ NullPointerException -> 0x0227, NumberFormatException -> 0x021f }
            goto L_0x0200
        L_0x01e8:
            if (r0 != r8) goto L_0x0200
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05a1
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0247
            int r12 = r12 + 1
        L_0x0200:
            int r0 = r2.next()
            if (r0 != r7) goto L_0x01cf
            java.lang.String r0 = "Document ended before "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x021f:
            java.lang.String r1 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0227:
            java.lang.String r1 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x022f:
            java.lang.String r0 = "Expected item tag at: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0247:
            java.lang.String r0 = "Expected "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag at: "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0267:
            java.lang.String r1 = "Not a number in num attribute in int-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x026f:
            java.lang.String r1 = "Need num attribute in int-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0277:
            java.lang.String r3 = "long-array"
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L_0x033c
            java.lang.String r0 = "num"
            r1 = 0
            java.lang.String r0 = r2.getAttributeValue(r12, r0)     // Catch:{ NullPointerException -> 0x0334, NumberFormatException -> 0x032c }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x0334, NumberFormatException -> 0x032c }
            r2.next()
            long[] r4 = new long[r0]
            r13 = 0
            int r0 = r2.getEventType()
        L_0x0294:
            java.lang.String r11 = "item"
            if (r0 != r9) goto L_0x02ad
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02f4
            java.lang.String r0 = r2.getAttributeValue(r1, r5)     // Catch:{ NullPointerException -> 0x02ec, NumberFormatException -> 0x02e4 }
            long r11 = java.lang.Long.parseLong(r0)     // Catch:{ NullPointerException -> 0x02ec, NumberFormatException -> 0x02e4 }
            r4[r13] = r11     // Catch:{ NullPointerException -> 0x02ec, NumberFormatException -> 0x02e4 }
            goto L_0x02c5
        L_0x02ad:
            if (r0 != r8) goto L_0x02c5
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05a1
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x030c
            int r13 = r13 + 1
        L_0x02c5:
            int r0 = r2.next()
            if (r0 != r7) goto L_0x0294
            java.lang.String r0 = "Document ended before "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x02e4:
            java.lang.String r1 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x02ec:
            java.lang.String r1 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x02f4:
            java.lang.String r0 = "Expected item tag at: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x030c:
            java.lang.String r0 = "Expected "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag at: "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x032c:
            java.lang.String r1 = "Not a number in num attribute in long-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0334:
            java.lang.String r1 = "Need num attribute in long-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x033c:
            java.lang.String r3 = "double-array"
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L_0x0401
            java.lang.String r0 = "num"
            r1 = 0
            java.lang.String r0 = r2.getAttributeValue(r12, r0)     // Catch:{ NullPointerException -> 0x03f9, NumberFormatException -> 0x03f1 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x03f9, NumberFormatException -> 0x03f1 }
            r2.next()
            double[] r4 = new double[r0]
            r13 = 0
            int r0 = r2.getEventType()
        L_0x0359:
            java.lang.String r11 = "item"
            if (r0 != r9) goto L_0x0372
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x03b9
            java.lang.String r0 = r2.getAttributeValue(r1, r5)     // Catch:{ NullPointerException -> 0x03b1, NumberFormatException -> 0x03a9 }
            double r11 = java.lang.Double.parseDouble(r0)     // Catch:{ NullPointerException -> 0x03b1, NumberFormatException -> 0x03a9 }
            r4[r13] = r11     // Catch:{ NullPointerException -> 0x03b1, NumberFormatException -> 0x03a9 }
            goto L_0x038a
        L_0x0372:
            if (r0 != r8) goto L_0x038a
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05a1
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x03d1
            int r13 = r13 + 1
        L_0x038a:
            int r0 = r2.next()
            if (r0 != r7) goto L_0x0359
            java.lang.String r0 = "Document ended before "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03a9:
            java.lang.String r1 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03b1:
            java.lang.String r1 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03b9:
            java.lang.String r0 = "Expected item tag at: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03d1:
            java.lang.String r0 = "Expected "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag at: "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03f1:
            java.lang.String r1 = "Not a number in num attribute in double-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03f9:
            java.lang.String r1 = "Need num attribute in double-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0401:
            java.lang.String r3 = "string-array"
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L_0x04c3
            java.lang.String r0 = "num"
            r1 = 0
            java.lang.String r0 = r2.getAttributeValue(r12, r0)     // Catch:{ NullPointerException -> 0x04bb, NumberFormatException -> 0x04b3 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x04bb, NumberFormatException -> 0x04b3 }
            r2.next()
            java.lang.String[] r4 = new java.lang.String[r0]
            r12 = 0
            int r0 = r2.getEventType()
        L_0x041f:
            java.lang.String r11 = "item"
            if (r0 != r9) goto L_0x0434
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x047b
            java.lang.String r0 = r2.getAttributeValue(r1, r5)     // Catch:{ NullPointerException -> 0x0473, NumberFormatException -> 0x046b }
            r4[r12] = r0     // Catch:{ NullPointerException -> 0x0473, NumberFormatException -> 0x046b }
            goto L_0x044c
        L_0x0434:
            if (r0 != r8) goto L_0x044c
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05a1
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0493
            int r12 = r12 + 1
        L_0x044c:
            int r0 = r2.next()
            if (r0 != r7) goto L_0x041f
            java.lang.String r0 = "Document ended before "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x046b:
            java.lang.String r1 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0473:
            java.lang.String r1 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x047b:
            java.lang.String r0 = "Expected item tag at: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0493:
            java.lang.String r0 = "Expected "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag at: "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x04b3:
            java.lang.String r1 = "Not a number in num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x04bb:
            java.lang.String r1 = "Need num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x04c3:
            java.lang.String r3 = "boolean-array"
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L_0x0588
            java.lang.String r0 = "num"
            r1 = 0
            java.lang.String r0 = r2.getAttributeValue(r12, r0)     // Catch:{ NullPointerException -> 0x0580, NumberFormatException -> 0x0578 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x0580, NumberFormatException -> 0x0578 }
            r2.next()
            boolean[] r4 = new boolean[r0]
            r12 = 0
            int r0 = r2.getEventType()
        L_0x04e0:
            java.lang.String r11 = "item"
            if (r0 != r9) goto L_0x04f9
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0540
            java.lang.String r0 = r2.getAttributeValue(r1, r5)     // Catch:{ NullPointerException -> 0x0538, NumberFormatException -> 0x0530 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ NullPointerException -> 0x0538, NumberFormatException -> 0x0530 }
            r4[r12] = r0     // Catch:{ NullPointerException -> 0x0538, NumberFormatException -> 0x0530 }
            goto L_0x0511
        L_0x04f9:
            if (r0 != r8) goto L_0x0511
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05a1
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0558
            int r12 = r12 + 1
        L_0x0511:
            int r0 = r2.next()
            if (r0 != r7) goto L_0x04e0
            java.lang.String r0 = "Document ended before "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0530:
            java.lang.String r1 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0538:
            java.lang.String r1 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0540:
            java.lang.String r0 = "Expected item tag at: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0558:
            java.lang.String r0 = "Expected "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag at: "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0578:
            java.lang.String r1 = "Not a number in num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0580:
            java.lang.String r1 = "Need num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0588:
            java.lang.String r3 = "map"
            boolean r0 = r4.equals(r3)
            r1 = r17
            if (r0 == 0) goto L_0x0603
            r2.next()
            if (r17 == 0) goto L_0x05a4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r1 <= r0) goto L_0x05a4
            android.util.ArrayMap r4 = A00(r14, r2, r10)
        L_0x05a1:
            r16[r6] = r15
            return r4
        L_0x05a4:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r0 = r2.getEventType()
        L_0x05ad:
            if (r0 != r9) goto L_0x05d7
            java.lang.Object r1 = A01(r14, r2, r10, r6)
            r0 = r16[r6]
            r4.put(r0, r1)
        L_0x05b8:
            int r0 = r2.next()
            if (r0 != r7) goto L_0x05ad
            java.lang.String r0 = "Document ended before "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x05d7:
            if (r0 != r8) goto L_0x05b8
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05a1
            java.lang.String r0 = "Expected "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag at: "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0603:
            java.lang.String r3 = "list"
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L_0x066b
            r2.next()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r0 = r2.getEventType()
        L_0x0617:
            if (r0 != r9) goto L_0x063f
            java.lang.Object r0 = A01(r14, r2, r10, r1)
            r4.add(r0)
        L_0x0620:
            int r0 = r2.next()
            if (r0 != r7) goto L_0x0617
            java.lang.String r0 = "Document ended before "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x063f:
            if (r0 != r8) goto L_0x0620
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05a1
            java.lang.String r0 = "Expected "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag at: "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x066b:
            java.lang.String r3 = "set"
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L_0x06d4
            r2.next()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            int r0 = r2.getEventType()
        L_0x0680:
            if (r0 != r9) goto L_0x06a8
            java.lang.Object r0 = A01(r14, r2, r10, r1)
            r4.add(r0)
        L_0x0689:
            int r0 = r2.next()
            if (r0 != r7) goto L_0x0680
            java.lang.String r0 = "Document ended before "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x06a8:
            if (r0 != r8) goto L_0x0689
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05a1
            java.lang.String r0 = "Expected "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " end tag at: "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x06d4:
            java.lang.String r1 = "Unknown tag: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x06e8:
            java.lang.String r1 = "Not a number in value attribute in <"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x06ff:
            java.lang.String r1 = "Need value attribute in <"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0716:
            int r0 = r2.next()
            if (r0 == r7) goto L_0x078b
            java.lang.String r3 = ">: "
            if (r0 != r8) goto L_0x072d
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x074f
            r16[r6] = r15
            return r1
        L_0x072d:
            if (r0 == r11) goto L_0x076d
            if (r0 != r9) goto L_0x0716
            java.lang.String r0 = "Unexpected start tag in <"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            r1.append(r3)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x074f:
            java.lang.String r0 = "Unexpected end tag in <"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            r1.append(r3)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x076d:
            java.lang.String r0 = "Unexpected text in <"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            r1.append(r3)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x078b:
            java.lang.String r0 = "Unexpected end of document in <"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = ">"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VV.A01(X.1VW, org.xmlpull.v1.XmlPullParser, java.lang.String[], boolean):java.lang.Object");
    }

    public static final void A02(Object obj, String str, XmlSerializer xmlSerializer) {
        String str2;
        String str3;
        if (obj == null) {
            str2 = "null";
            xmlSerializer.startTag((String) null, str2);
            if (str != null) {
                xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
            }
        } else {
            String str4 = "string";
            if (!(obj instanceof String)) {
                if (obj instanceof Integer) {
                    str4 = "int";
                } else if (obj instanceof Long) {
                    str4 = "long";
                } else if (obj instanceof Float) {
                    str4 = "float";
                } else if (obj instanceof Double) {
                    str4 = "double";
                } else if (obj instanceof Boolean) {
                    str4 = "boolean";
                } else {
                    if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        if (bArr != null) {
                            xmlSerializer.startTag((String) null, "byte-array");
                            if (str != null) {
                                xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
                            }
                            xmlSerializer.attribute((String) null, "num", Integer.toString(r7));
                            StringBuilder sb = new StringBuilder(r7 << 1);
                            for (byte b2 : bArr) {
                                int i2 = (b2 >> 4) & 15;
                                sb.append((char) (i2 >= 10 ? (i2 + 97) - 10 : i2 + 48));
                                byte b3 = b2 & 15;
                                sb.append((char) (b3 >= 10 ? (b3 + 97) - 10 : b3 + 48));
                            }
                            xmlSerializer.text(sb.toString());
                            xmlSerializer.endTag((String) null, "byte-array");
                            return;
                        }
                    } else {
                        if (obj instanceof int[]) {
                            int[] iArr = (int[]) obj;
                            if (iArr != null) {
                                str3 = "int-array";
                                xmlSerializer.startTag((String) null, str3);
                                if (str != null) {
                                    xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
                                }
                                xmlSerializer.attribute((String) null, "num", Integer.toString(r4));
                                for (int num : iArr) {
                                    xmlSerializer.startTag((String) null, "item");
                                    xmlSerializer.attribute((String) null, "value", Integer.toString(num));
                                    xmlSerializer.endTag((String) null, "item");
                                }
                            }
                        } else if (obj instanceof long[]) {
                            long[] jArr = (long[]) obj;
                            if (jArr != null) {
                                str3 = "long-array";
                                xmlSerializer.startTag((String) null, str3);
                                if (str != null) {
                                    xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
                                }
                                xmlSerializer.attribute((String) null, "num", Integer.toString(r4));
                                for (long l2 : jArr) {
                                    xmlSerializer.startTag((String) null, "item");
                                    xmlSerializer.attribute((String) null, "value", Long.toString(l2));
                                    xmlSerializer.endTag((String) null, "item");
                                }
                            }
                        } else if (obj instanceof double[]) {
                            double[] dArr = (double[]) obj;
                            if (dArr != null) {
                                str3 = "double-array";
                                xmlSerializer.startTag((String) null, str3);
                                if (str != null) {
                                    xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
                                }
                                xmlSerializer.attribute((String) null, "num", Integer.toString(r4));
                                for (double d2 : dArr) {
                                    xmlSerializer.startTag((String) null, "item");
                                    xmlSerializer.attribute((String) null, "value", Double.toString(d2));
                                    xmlSerializer.endTag((String) null, "item");
                                }
                            }
                        } else if (obj instanceof String[]) {
                            String[] strArr = (String[]) obj;
                            if (strArr != null) {
                                str3 = "string-array";
                                xmlSerializer.startTag((String) null, str3);
                                if (str != null) {
                                    xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
                                }
                                xmlSerializer.attribute((String) null, "num", Integer.toString(r4));
                                for (String attribute : strArr) {
                                    xmlSerializer.startTag((String) null, "item");
                                    xmlSerializer.attribute((String) null, "value", attribute);
                                    xmlSerializer.endTag((String) null, "item");
                                }
                            }
                        } else if (obj instanceof boolean[]) {
                            boolean[] zArr = (boolean[]) obj;
                            if (zArr != null) {
                                str3 = "boolean-array";
                                xmlSerializer.startTag((String) null, str3);
                                if (str != null) {
                                    xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
                                }
                                xmlSerializer.attribute((String) null, "num", Integer.toString(r4));
                                for (boolean bool : zArr) {
                                    xmlSerializer.startTag((String) null, "item");
                                    xmlSerializer.attribute((String) null, "value", Boolean.toString(bool));
                                    xmlSerializer.endTag((String) null, "item");
                                }
                            }
                        } else if (obj instanceof Map) {
                            A03(str, (Map) obj, xmlSerializer);
                            return;
                        } else if (obj instanceof List) {
                            List list = (List) obj;
                            if (list != null) {
                                xmlSerializer.startTag((String) null, "list");
                                if (str != null) {
                                    xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
                                }
                                int size = list.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    A02(list.get(i3), (String) null, xmlSerializer);
                                }
                                xmlSerializer.endTag((String) null, "list");
                                return;
                            }
                        } else if (obj instanceof Set) {
                            Set<Object> set = (Set) obj;
                            if (set != null) {
                                str4 = "set";
                                xmlSerializer.startTag((String) null, str4);
                                if (str != null) {
                                    xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
                                }
                                for (Object A02 : set) {
                                    A02(A02, (String) null, xmlSerializer);
                                }
                                xmlSerializer.endTag((String) null, str4);
                                return;
                            }
                        } else if (!(obj instanceof CharSequence)) {
                            StringBuilder sb2 = new StringBuilder("writeValueXml: unable to write value ");
                            sb2.append(obj);
                            throw new RuntimeException(sb2.toString());
                        }
                        xmlSerializer.endTag((String) null, str3);
                        return;
                    }
                    str2 = "null";
                    xmlSerializer.startTag((String) null, str2);
                }
                xmlSerializer.startTag((String) null, str4);
                if (str != null) {
                    xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
                }
                xmlSerializer.attribute((String) null, "value", obj.toString());
                xmlSerializer.endTag((String) null, str4);
                return;
            }
            xmlSerializer.startTag((String) null, str4);
            if (str != null) {
                xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag((String) null, str4);
            return;
        }
        xmlSerializer.endTag((String) null, str2);
    }

    public static final void A03(String str, Map map, XmlSerializer xmlSerializer) {
        if (map == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "map");
        if (str != null) {
            xmlSerializer.attribute((String) null, FacebookFacade.RequestParameter.NAME, str);
        }
        for (Map.Entry entry : map.entrySet()) {
            A02(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag((String) null, "map");
    }
}

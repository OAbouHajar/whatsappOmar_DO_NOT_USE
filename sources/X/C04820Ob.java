package X;

import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.0Ob  reason: invalid class name and case insensitive filesystem */
public class C04820Ob {
    public SparseArray A00;
    public SparseArray A01;
    public C03950Kn A02;
    public final ConstraintLayout A03;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0148 in list []
        	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:44)
        	at jadx.core.dex.instructions.SwitchNode.initBlocks(SwitchNode.java:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.lambda$initBlocksInTargetNodes$0(BlockSplitter.java:71)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.initBlocksInTargetNodes(BlockSplitter.java:68)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(BlockSplitter.java:53)
        */
    public C04820Ob(android.content.Context r21, androidx.constraintlayout.widget.ConstraintLayout r22, int r23) {
        /*
            r20 = this;
            r5 = r20
            r5.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r5.A01 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r5.A00 = r0
            r18 = 0
            r0 = r18
            r5.A02 = r0
            r0 = r22
            r5.A03 = r0
            r6 = r21
            android.content.res.Resources r0 = r6.getResources()
            r1 = r23
            android.content.res.XmlResourceParser r4 = r0.getXml(r1)
            r3 = 0
            int r2 = r4.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x002e:
            r1 = 1     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r2 == r1) goto L_0x03b9     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r2 == 0) goto L_0x0037     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r0 = 2     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r2 != r0) goto L_0x0058     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            goto L_0x003b     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x0037:
            r4.getName()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            goto L_0x0058     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x003b:
            java.lang.String r2 = r4.getName()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            int r0 = r2.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            switch(r0) {
                case -1349929691: goto L_0x005d;
                case 80204913: goto L_0x0375;
                case 1382829617: goto L_0x038b;
                case 1657696882: goto L_0x0395;
                case 1901439077: goto L_0x039f;
                default: goto L_0x0046;
            }     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x0046:
            java.lang.String r7 = "ConstraintLayoutStates"     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.lang.String r0 = "unknown tag "     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r1.append(r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            android.util.Log.v(r7, r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x0058:
            int r2 = r4.next()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            goto L_0x002e     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x005d:
            java.lang.String r17 = "ConstraintSet"     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r0 = r17     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            boolean r0 = r2.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r0 == 0) goto L_0x0046     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            X.0Wj r7 = new X.0Wj     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r7.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            int r8 = r4.getAttributeCount()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r2 = 0     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x0071:
            if (r2 >= r8) goto L_0x0058     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.lang.String r0 = r4.getAttributeName(r2)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.lang.String r11 = "id"     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            boolean r0 = r11.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r0 == 0) goto L_0x00b7     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.lang.String r10 = r4.getAttributeValue(r2)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.lang.String r0 = "/"     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            boolean r0 = r10.contains(r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r9 = -1     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r0 == 0) goto L_0x00b5     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r0 = 47     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            int r0 = r10.indexOf(r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            int r0 = r0 + 1     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.lang.String r8 = r10.substring(r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            android.content.res.Resources r2 = r6.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.lang.String r0 = r6.getPackageName()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            int r2 = r2.getIdentifier(r8, r11, r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r2 != r9) goto L_0x00c1     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x00a6:
            int r0 = r10.length()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r0 <= r1) goto L_0x00ba     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.lang.String r0 = r10.substring(r1)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            goto L_0x00c1     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x00b5:
            r2 = -1     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            goto L_0x00a6     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x00b7:
            int r2 = r2 + 1     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            goto L_0x0071     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x00ba:
            java.lang.String r8 = "ConstraintLayoutStates"     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.lang.String r0 = "error in parsing id"     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            android.util.Log.e(r8, r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x00c1:
            int r8 = r4.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r9 = r18     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x00c7:
            if (r8 == r1) goto L_0x036e     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r8 == 0) goto L_0x0302     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.String r11 = "Constraint"
            r10 = 3
            r0 = 2
            if (r8 == r0) goto L_0x00f4
            if (r8 != r10) goto L_0x030f
            java.lang.String r8 = r4.getName()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0 = r17     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            boolean r0 = r0.equals(r8)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r0 != 0) goto L_0x036e     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            boolean r0 = r8.equalsIgnoreCase(r11)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r0 == 0) goto L_0x030f     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.util.HashMap r8 = r7.A00     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r9.A00     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r8.put(r0, r9)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r9 = r18     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x030f     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x00f4:
            java.lang.String r8 = r4.getName()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r8.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            switch(r0) {
                case -2025855158: goto L_0x0100;
                case -1984451626: goto L_0x0108;
                case -1269513683: goto L_0x0110;
                case -1238332596: goto L_0x0119;
                case -71750448: goto L_0x0121;
                case 1331510167: goto L_0x0129;
                case 1791837707: goto L_0x0131;
                case 1803088381: goto L_0x0139;
                default: goto L_0x00ff;
            }     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x00ff:
            goto L_0x0140     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0100:
            java.lang.String r0 = "Layout"     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            boolean r0 = r8.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r10 = 5     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x013e     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0108:
            java.lang.String r0 = "Motion"     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            boolean r0 = r8.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r10 = 6     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x013e     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0110:
            java.lang.String r0 = "PropertySet"     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            boolean r0 = r8.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r0 == 0) goto L_0x0140     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x0141     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0119:
            java.lang.String r0 = "Transform"     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            boolean r0 = r8.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r10 = 4     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x013e     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0121:
            java.lang.String r0 = "Guideline"     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            boolean r0 = r8.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r10 = 1     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x013e     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0129:
            java.lang.String r0 = "Barrier"     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            boolean r0 = r8.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r10 = 2     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x013e     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0131:
            java.lang.String r0 = "CustomAttribute"     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            boolean r0 = r8.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r10 = 7     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x013e     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0139:
            boolean r0 = r8.equals(r11)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r10 = 0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x013e:
            if (r0 != 0) goto L_0x0141     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0140:
            r10 = -1     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0141:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r10) {
                case 0: goto L_0x0148;
                case 1: goto L_0x0152;
                case 2: goto L_0x0162;
                case 3: goto L_0x0170;
                case 4: goto L_0x01c2;
                case 5: goto L_0x01cf;
                case 6: goto L_0x01d3;
                case 7: goto L_0x023f;
                default: goto L_0x0146;
            }     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x0146:
            goto L_0x030f     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x0148:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r4)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.053 r9 = r7.A04(r6, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x030f     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0152:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r4)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.053 r9 = r7.A04(r6, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0Uh r0 = r9.A02     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0.A0y = r1     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0.A0w = r1     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x030f     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0162:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r4)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.053 r9 = r7.A04(r6, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0Uh r0 = r9.A02     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0.A0b = r1     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x030f     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0170:
            if (r9 == 0) goto L_0x0315     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0On r12 = r9.A04     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r4)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int[] r0 = X.AnonymousClass0NK.A05     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r8, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r12.A04 = r1     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r11 = r10.getIndexCount()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r8 = 0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0185:
            if (r8 >= r11) goto L_0x02fe     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r13 = r10.getIndex(r8)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r13 != r1) goto L_0x0196     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            float r0 = r12.A00     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            float r0 = r10.getFloat(r13, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r12.A00 = r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x01bf     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0196:
            r0 = 0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r13 != r0) goto L_0x01a8     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r12.A03     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r13 = r10.getInt(r13, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r12.A03 = r13     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int[] r0 = X.C06500Wj.A03     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0 = r0[r13]     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r12.A03 = r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x01bf     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x01a8:
            r0 = 4     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r13 != r0) goto L_0x01b4     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r12.A02     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r10.getInt(r13, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r12.A02 = r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x01bf     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x01b4:
            r0 = 3     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r13 != r0) goto L_0x01bf     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            float r0 = r12.A01     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            float r0 = r10.getFloat(r13, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r12.A01 = r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x01bf:
            int r8 = r8 + 1     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x0185     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x01c2:
            if (r9 == 0) goto L_0x0326     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0Uf r8 = r9.A05     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r4)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r8.A00(r6, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x030f     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x01cf:
            if (r9 == 0) goto L_0x0337     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x0306     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x01d3:
            if (r9 == 0) goto L_0x0348     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0UD r13 = r9.A03     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r4)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int[] r0 = X.AnonymousClass0NK.A04     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r8, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r13.A06 = r1     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r12 = r10.getIndexCount()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r11 = 0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r8 = 0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x01e9:
            if (r8 >= r12) goto L_0x02fe     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r14 = r10.getIndex(r8)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            android.util.SparseIntArray r0 = X.AnonymousClass0UD.A07     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r0.get(r14)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            switch(r0) {
                case 1: goto L_0x01f9;
                case 2: goto L_0x0202;
                case 3: goto L_0x020b;
                case 4: goto L_0x0224;
                case 5: goto L_0x022b;
                case 6: goto L_0x0234;
                default: goto L_0x01f8;
            }     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x01f8:
            goto L_0x023c     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x01f9:
            float r0 = r13.A01     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            float r0 = r10.getFloat(r14, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r13.A01 = r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x023c     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0202:
            int r0 = r13.A04     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r10.getInt(r14, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r13.A04 = r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x023c     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x020b:
            android.util.TypedValue r0 = r10.peekValue(r14)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r15 = r0.type     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0 = 3     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r15 != r0) goto L_0x021b     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.String r0 = r10.getString(r14)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0218:
            r13.A05 = r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x023c     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x021b:
            java.lang.String[] r15 = X.C04380Mi.A00     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r10.getInteger(r14, r11)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0 = r15[r0]     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x0218     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0224:
            int r0 = r10.getInt(r14, r11)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r13.A03 = r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x023c     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x022b:
            int r0 = r13.A02     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = X.C06500Wj.A00(r10, r14, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r13.A02 = r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x023c     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0234:
            float r0 = r13.A00     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            float r0 = r10.getFloat(r14, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r13.A00 = r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x023c:
            int r8 = r8 + 1     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x01e9     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x023f:
            if (r9 == 0) goto L_0x0359     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.util.HashMap r0 = r9.A01     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r19 = r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r4)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int[] r0 = X.AnonymousClass0NK.A02     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r8, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r16 = r10.getIndexCount()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r12 = 0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r14 = 0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r13 = r12     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r11 = r12     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r8 = 0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0258:
            r0 = r16     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r8 >= r0) goto L_0x02f0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r15 = r10.getIndex(r8)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r15 != r14) goto L_0x0286     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.String r12 = r10.getString(r15)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r12 == 0) goto L_0x02ec     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r12.length()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r0 <= 0) goto L_0x02ec     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0o()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            char r0 = r12.charAt(r14)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            char r0 = java.lang.Character.toUpperCase(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r15.append(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.String r0 = r12.substring(r1)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.String r12 = X.AnonymousClass000.A0h(r0, r15)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x02ec     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0286:
            if (r15 != r1) goto L_0x0293     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            boolean r0 = r10.getBoolean(r15, r14)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0KA r11 = X.AnonymousClass0KA.BOOLEAN_TYPE     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x02ec     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0293:
            r0 = 3     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r15 != r0) goto L_0x0299     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0KA r11 = X.AnonymousClass0KA.COLOR_TYPE     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x02d9     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0299:
            r0 = 2     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r15 != r0) goto L_0x029d     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x02d7     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x029d:
            r0 = 7     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r15 != r0) goto L_0x02b0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0KA r11 = X.AnonymousClass0KA.DIMENSION_TYPE     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0 = 0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            float r13 = r10.getDimension(r15, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0M(r6)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            float r0 = android.util.TypedValue.applyDimension(r1, r13, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x02c7     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02b0:
            r0 = 4     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r15 != r0) goto L_0x02b4     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x02c0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02b4:
            r0 = 5     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r15 != r0) goto L_0x02cc     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0KA r11 = X.AnonymousClass0KA.FLOAT_TYPE     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0 = 2143289344(0x7fc00000, float:NaN)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            float r0 = r10.getFloat(r15, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x02c7     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02c0:
            X.0KA r11 = X.AnonymousClass0KA.DIMENSION_TYPE     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0 = 0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            float r0 = r10.getDimension(r15, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02c7:
            java.lang.Float r13 = java.lang.Float.valueOf(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x02ec     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02cc:
            r0 = 6     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r15 != r0) goto L_0x02e2     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0KA r11 = X.AnonymousClass0KA.INT_TYPE     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0 = -1     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r10.getInteger(r15, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x02dd     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02d7:
            X.0KA r11 = X.AnonymousClass0KA.COLOR_DRAWABLE_TYPE     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02d9:
            int r0 = r10.getColor(r15, r14)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02dd:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x02ec     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02e2:
            r0 = 8     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r15 != r0) goto L_0x02ec     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0KA r11 = X.AnonymousClass0KA.STRING_TYPE     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.String r13 = r10.getString(r15)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02ec:
            int r8 = r8 + 1     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x0258     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02f0:
            if (r12 == 0) goto L_0x02fe     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            if (r13 == 0) goto L_0x02fe     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            X.0Uc r8 = new X.0Uc     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r8.<init>(r11, r13, r12)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0 = r19     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0.put(r12, r8)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x02fe:
            r10.recycle()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x030f     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0302:
            r4.getName()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x030f     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0306:
            X.0Uh r8 = r9.A02     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r4)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r8.A01(r6, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x030f:
            int r8 = r4.next()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x00c7     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0315:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r4.getLineNumber()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x0369     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0326:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r4.getLineNumber()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x0369     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0337:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r4.getLineNumber()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x0369     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0348:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r4.getLineNumber()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            goto L_0x0369     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0359:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            int r0 = r4.getLineNumber()     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ IOException | XmlPullParserException -> 0x036a }
        L_0x0369:
            throw r0     // Catch:{ IOException | XmlPullParserException -> 0x036a }
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x036e:
            android.util.SparseArray r0 = r5.A00     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r0.put(r2, r7)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            goto L_0x0058     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x0375:
            java.lang.String r0 = "State"     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            boolean r0 = r2.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r0 == 0) goto L_0x0046     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            X.0Oa r3 = new X.0Oa     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r3.<init>(r6, r4)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            android.util.SparseArray r1 = r5.A01     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            int r0 = r3.A01     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r1.put(r0, r3)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            goto L_0x0058     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x038b:
            java.lang.String r0 = "StateSet"     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            boolean r0 = r2.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r0 == 0) goto L_0x0046     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            goto L_0x0058     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x0395:
            java.lang.String r0 = "layoutDescription"     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            boolean r0 = r2.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r0 == 0) goto L_0x0046     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            goto L_0x0058     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
        L_0x039f:
            java.lang.String r0 = "Variant"     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            boolean r0 = r2.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r0 == 0) goto L_0x0046     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            X.0Oz r1 = new X.0Oz     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r1.<init>(r6, r4)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            if (r3 == 0) goto L_0x0058     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            java.util.ArrayList r0 = r3.A03     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r0.add(r1)     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            goto L_0x0058     // Catch:{ IOException | XmlPullParserException -> 0x03b5 }
            r0 = move-exception
            r0.printStackTrace()
        L_0x03b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04820Ob.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }
}

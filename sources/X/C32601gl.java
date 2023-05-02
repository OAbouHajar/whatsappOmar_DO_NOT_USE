package X;

import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.1gl  reason: invalid class name and case insensitive filesystem */
public class C32601gl {
    public static VoipStanzaChildNode A00(VoipStanzaChildNode voipStanzaChildNode) {
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if ("destination".equals(voipStanzaChildNode2.tag)) {
                    return voipStanzaChildNode2;
                }
            }
        }
        return null;
    }

    public static VoipStanzaChildNode A01(VoipStanzaChildNode voipStanzaChildNode) {
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if ("enc".equals(voipStanzaChildNode2.tag)) {
                    return voipStanzaChildNode2;
                }
            }
        }
        return null;
    }

    public static VoipStanzaChildNode A02(VoipStanzaChildNode voipStanzaChildNode, VoipStanzaChildNode[] voipStanzaChildNodeArr) {
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(voipStanzaChildNode.tag);
        builder.addAttributes(voipStanzaChildNode.getAttributesCopy());
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if ("destination".equals(voipStanzaChildNode2.tag)) {
                    if (voipStanzaChildNodeArr != null) {
                        VoipStanzaChildNode.Builder builder2 = new VoipStanzaChildNode.Builder("destination");
                        builder2.addChildren(voipStanzaChildNodeArr);
                        voipStanzaChildNode2 = builder2.build();
                    }
                }
                builder.addChild(voipStanzaChildNode2);
            }
        }
        return builder.build();
    }

    public static Byte A03(VoipStanzaChildNode voipStanzaChildNode) {
        C35081lL[] attributesCopy = voipStanzaChildNode.getAttributesCopy();
        byte b2 = 0;
        if (attributesCopy != null) {
            int length = attributesCopy.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                C35081lL r2 = attributesCopy[i2];
                if ("count".equals(r2.A02)) {
                    try {
                        b2 = Byte.parseByte(r2.A03);
                        break;
                    } catch (NumberFormatException unused) {
                        return null;
                    }
                } else {
                    i2++;
                }
            }
        }
        return Byte.valueOf(b2);
    }

    public static boolean A04(C16040sK r2, C14710pd r3) {
        return !r2.A0G() && r3.A03(C16620tM.A02, 1372) >= 1;
    }
}

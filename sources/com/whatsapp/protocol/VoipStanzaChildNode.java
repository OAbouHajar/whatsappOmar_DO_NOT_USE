package com.whatsapp.protocol;

import X.C28371Vv;
import X.C35081lL;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoipStanzaChildNode {
    public final C35081lL[] attributes;
    public final VoipStanzaChildNode[] children;
    public final byte[] data;
    public final String tag;

    public class Builder {
        public Map attributes;
        public List children;
        public byte[] data;
        public final String tag;

        public Builder(String str) {
            this.tag = str;
        }

        private Builder addAttribute(String str, C35081lL r4) {
            Map map = this.attributes;
            if (map == null) {
                map = new HashMap();
                this.attributes = map;
            }
            if (map.put(str, r4) == null) {
                return this;
            }
            throw new IllegalArgumentException("node may not have duplicate attributes");
        }

        public Builder addAttribute(String str, Jid jid) {
            addAttribute(str, new C35081lL(jid, str));
            return this;
        }

        public Builder addAttribute(String str, String str2) {
            addAttribute(str, new C35081lL(str, str2));
            return this;
        }

        public Builder addAttributes(C35081lL[] r5) {
            if (r5 != null) {
                for (C35081lL r0 : r5) {
                    addAttribute(r0.A02, r0.A03);
                }
            }
            return this;
        }

        public Builder addChild(VoipStanzaChildNode voipStanzaChildNode) {
            if (this.data == null) {
                List list = this.children;
                if (list == null) {
                    list = new ArrayList();
                    this.children = list;
                }
                list.add(voipStanzaChildNode);
                return this;
            }
            throw new IllegalArgumentException("node may not have both data and children");
        }

        public Builder addChildren(VoipStanzaChildNode[] voipStanzaChildNodeArr) {
            if (voipStanzaChildNodeArr != null) {
                for (VoipStanzaChildNode addChild : voipStanzaChildNodeArr) {
                    addChild(addChild);
                }
            }
            return this;
        }

        public VoipStanzaChildNode build() {
            C35081lL[] r5;
            int size;
            Map map = this.attributes;
            VoipStanzaChildNode[] voipStanzaChildNodeArr = null;
            if (map == null || (size = map.size()) <= 0) {
                r5 = null;
            } else {
                C35081lL[] r52 = new C35081lL[size];
                int i2 = 0;
                for (Map.Entry value : this.attributes.entrySet()) {
                    r52[i2] = value.getValue();
                    i2++;
                }
                r5 = r52;
            }
            List list = this.children;
            if (list != null) {
                voipStanzaChildNodeArr = (VoipStanzaChildNode[]) list.toArray(new VoipStanzaChildNode[0]);
            }
            return new VoipStanzaChildNode(this.tag, r5, voipStanzaChildNodeArr, this.data);
        }

        public Builder setData(byte[] bArr) {
            if (this.children == null) {
                this.data = bArr;
                return this;
            }
            throw new IllegalArgumentException("node may not have both data and children");
        }
    }

    public VoipStanzaChildNode(String str, C35081lL[] r2, VoipStanzaChildNode[] voipStanzaChildNodeArr, byte[] bArr) {
        this.tag = str;
        this.attributes = r2;
        this.children = voipStanzaChildNodeArr;
        this.data = bArr;
    }

    public static VoipStanzaChildNode fromProtocolTreeNode(C28371Vv r7) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        C28371Vv[] r6 = r7.A03;
        if (r6 != null) {
            int length = r6.length;
            voipStanzaChildNodeArr = new VoipStanzaChildNode[length];
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                voipStanzaChildNodeArr[i3] = fromProtocolTreeNode(r6[i2]);
                i2++;
                i3++;
            }
        } else {
            voipStanzaChildNodeArr = null;
        }
        return new VoipStanzaChildNode(r7.A00, r7.A0Q(), voipStanzaChildNodeArr, r7.A01);
    }

    public C35081lL[] getAttributesCopy() {
        C35081lL[] r1 = this.attributes;
        if (r1 != null) {
            return (C35081lL[]) Arrays.copyOf(r1, r1.length);
        }
        return null;
    }

    public Object[] getAttributesFlattedCopy() {
        C35081lL[] r7 = this.attributes;
        if (r7 == null) {
            return null;
        }
        Object[] objArr = new Object[(r6 << 1)];
        int i2 = 0;
        for (C35081lL r2 : r7) {
            int i3 = i2 + 1;
            objArr[i2] = r2.A02;
            Jid jid = r2.A01;
            i2 = i3 + 1;
            if (jid != null) {
                objArr[i3] = jid;
            } else {
                objArr[i3] = r2.A03;
            }
        }
        return objArr;
    }

    public VoipStanzaChildNode[] getChildrenCopy() {
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr != null) {
            return (VoipStanzaChildNode[]) Arrays.copyOf(voipStanzaChildNodeArr, voipStanzaChildNodeArr.length);
        }
        return null;
    }

    public byte[] getDataCopy() {
        byte[] bArr = this.data;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean hasAttribute(C35081lL r6) {
        C35081lL[] r4 = this.attributes;
        if (r4 != null) {
            for (C35081lL equals : r4) {
                if (equals.equals(r6)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C28371Vv toProtocolTreeNode() {
        int length;
        byte[] bArr = this.data;
        if (bArr != null) {
            return new C28371Vv(this.tag, bArr, this.attributes);
        }
        C28371Vv[] r6 = null;
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr == null || (length = voipStanzaChildNodeArr.length) <= 0) {
            return new C28371Vv(this.tag, this.attributes, r6);
        }
        r6 = new C28371Vv[length];
        int i2 = 0;
        int i3 = 0;
        do {
            r6[i3] = voipStanzaChildNodeArr[i2].toProtocolTreeNode();
            i2++;
            i3++;
        } while (i2 < length);
        return new C28371Vv(this.tag, this.attributes, r6);
    }
}

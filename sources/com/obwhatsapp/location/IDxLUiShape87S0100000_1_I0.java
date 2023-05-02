package com.obwhatsapp.location;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass020;
import X.AnonymousClass074;
import X.AnonymousClass076;
import X.AnonymousClass0IS;
import X.AnonymousClass0T2;
import X.AnonymousClass127;
import X.AnonymousClass152;
import X.AnonymousClass16R;
import X.AnonymousClass18R;
import X.AnonymousClass1P7;
import X.AnonymousClass291;
import X.AnonymousClass29U;
import X.AnonymousClass29W;
import X.AnonymousClass2NT;
import X.AnonymousClass2R8;
import X.AnonymousClass2R9;
import X.AnonymousClass491;
import X.C13680ns;
import X.C14870pt;
import X.C15710ri;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16260sj;
import X.C16440t3;
import X.C16600tK;
import X.C17140ub;
import X.C17160ud;
import X.C17200uh;
import X.C19150xq;
import X.C19430yQ;
import X.C19980zJ;
import X.C204310c;
import X.C27471Rw;
import X.C32451gN;
import X.C39721sx;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;

public class IDxLUiShape87S0100000_1_I0 extends AnonymousClass291 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLUiShape87S0100000_1_I0(C19980zJ r2, AnonymousClass16R r3, C14870pt r4, C16040sK r5, C16600tK r6, C204310c r7, AnonymousClass127 r8, C17160ud r9, C16000sG r10, C17140ub r11, C16080sP r12, C17200uh r13, AnonymousClass152 r14, C16440t3 r15, C16260sj r16, AnonymousClass013 r17, C19150xq r18, AnonymousClass18R r19, C19430yQ r20, AnonymousClass1P7 r21, C27471Rw r22, Object obj, int i2) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        this.A01 = i2;
        this.A00 = obj;
    }

    public AnonymousClass29U A09() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            AnonymousClass2NT r0 = ((GroupChatLiveLocationsActivity2) obj).A06;
            if (r0 != null) {
                return new AnonymousClass29U(r0.A00());
            }
            return null;
        }
        AnonymousClass074 r02 = ((GroupChatLiveLocationsActivity) obj).A05;
        if (r02 != null) {
            return new AnonymousClass29U(r02.A0S);
        }
        return null;
    }

    public void A0B() {
        int i2 = this.A01;
        super.A0B();
        Object obj = this.A00;
        if (i2 != 0) {
            ((GroupChatLiveLocationsActivity2) obj).A36();
        } else {
            ((GroupChatLiveLocationsActivity) obj).A36();
        }
    }

    public void A0J() {
        AnonymousClass074 r3;
        AnonymousClass076 r2;
        LatLng latLng;
        AnonymousClass2NT r32;
        AnonymousClass2R9 A012;
        if (this.A01 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
            if (!(!groupChatLiveLocationsActivity2.A0E) && groupChatLiveLocationsActivity2.A06 != null && !groupChatLiveLocationsActivity2.A0X) {
                AnonymousClass291 r1 = groupChatLiveLocationsActivity2.A0N;
                if (r1.A0o == null || this.A0t) {
                    AnonymousClass29W r0 = r1.A0l;
                    if (r0 != null) {
                        latLng = r0.A00();
                        if (!groupChatLiveLocationsActivity2.A06.A00().A02().A04.A00(latLng)) {
                            AnonymousClass291 r12 = groupChatLiveLocationsActivity2.A0N;
                            if (!r12.A0t) {
                                groupChatLiveLocationsActivity2.A0X = true;
                                r32 = groupChatLiveLocationsActivity2.A06;
                                A012 = AnonymousClass2R8.A01(latLng);
                            } else if (groupChatLiveLocationsActivity2.A39(r12.A0l.A00())) {
                                groupChatLiveLocationsActivity2.A0N.A0B();
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!r1.A0u) {
                        groupChatLiveLocationsActivity2.A38(true);
                        return;
                    } else {
                        return;
                    }
                } else {
                    groupChatLiveLocationsActivity2.A0X = true;
                    C39721sx r33 = groupChatLiveLocationsActivity2.A0N.A0o;
                    latLng = new LatLng(r33.A00, r33.A01);
                    float A02 = GroupChatLiveLocationsActivity2.A02(groupChatLiveLocationsActivity2, r33.A02, -1.0f);
                    if (A02 <= groupChatLiveLocationsActivity2.A06.A02().A02 && A02 != -1.0f) {
                        r32 = groupChatLiveLocationsActivity2.A06;
                        A012 = AnonymousClass2R8.A02(latLng, A02);
                    }
                    r32 = groupChatLiveLocationsActivity2.A06;
                    A012 = AnonymousClass2R8.A01(latLng);
                }
                r32.A0B(A012, groupChatLiveLocationsActivity2.A05);
                return;
            }
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A00;
        if (!(!groupChatLiveLocationsActivity.A0E) && groupChatLiveLocationsActivity.A05 != null) {
            if (groupChatLiveLocationsActivity.A0M.A0o != null && !groupChatLiveLocationsActivity.A0W) {
                groupChatLiveLocationsActivity.A0W = true;
                C39721sx r6 = groupChatLiveLocationsActivity.A0M.A0o;
                AnonymousClass020 r4 = new AnonymousClass020(r6.A00, r6.A01);
                float A022 = GroupChatLiveLocationsActivity.A02(groupChatLiveLocationsActivity, r6.A02, -1.0f);
                if (A022 > groupChatLiveLocationsActivity.A05.A02().A02 || A022 == -1.0f) {
                    r3 = groupChatLiveLocationsActivity.A05;
                    r2 = new AnonymousClass076();
                    r2.A06 = r4;
                } else {
                    r3 = groupChatLiveLocationsActivity.A05;
                    r2 = AnonymousClass0T2.A01(r4, A022);
                }
                r3.A0A(r2, groupChatLiveLocationsActivity.A04, 1500);
            } else if (!groupChatLiveLocationsActivity.A0M.A0u) {
                groupChatLiveLocationsActivity.A39(true);
            }
        }
    }

    public void A0K() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) obj;
            if (!(!groupChatLiveLocationsActivity2.A0E)) {
                groupChatLiveLocationsActivity2.A36();
                A0J();
                if (!groupChatLiveLocationsActivity2.A0N.A0u) {
                    groupChatLiveLocationsActivity2.A0M.setLocationMode(2);
                    return;
                }
                return;
            }
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) obj;
        if (!(!groupChatLiveLocationsActivity.A0E)) {
            groupChatLiveLocationsActivity.A36();
            A0J();
            if (!groupChatLiveLocationsActivity.A0M.A0u) {
                groupChatLiveLocationsActivity.A0L.setLocationMode(2);
            }
        }
    }

    public void A0M(float f2, boolean z2) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) obj;
            int i3 = (int) f2;
            groupChatLiveLocationsActivity2.A01 = i3;
            AnonymousClass2NT r0 = groupChatLiveLocationsActivity2.A06;
            if (r0 != null) {
                r0.A08(0, 0, 0, i3);
            }
        } else {
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) obj;
            int i4 = (int) f2;
            groupChatLiveLocationsActivity.A01 = i4;
            AnonymousClass074 r02 = groupChatLiveLocationsActivity.A05;
            if (r02 != null) {
                r02.A07(0, 0, i4);
            }
        }
        if (z2) {
            A0J();
        }
    }

    public void A0Q(AnonymousClass29W r7) {
        if (this.A01 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
            C32451gN r3 = (C32451gN) groupChatLiveLocationsActivity2.A0T.get(r7.A03);
            if (r3 != null) {
                if (!r3.A0A()) {
                    r3.A09(true);
                }
                r3.A06(r7.A00());
                Object A012 = r3.A01();
                if (A012 instanceof AnonymousClass29W) {
                    AnonymousClass29W r2 = (AnonymousClass29W) A012;
                    if (r2.A00 != r7.A00 || r2.A01 != r7.A01) {
                        r3.A05(AnonymousClass491.A00(groupChatLiveLocationsActivity2.A0N.A05(r7)));
                        r3.A08(groupChatLiveLocationsActivity2.A0N.A0A(r7));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass0IS r5 = (AnonymousClass0IS) ((GroupChatLiveLocationsActivity) this.A00).A0S.get(r7.A03);
        if (r5 != null) {
            if (!r5.A04) {
                r5.A0A(true);
            }
            LatLng A002 = r7.A00();
            r5.A0J(new AnonymousClass020(A002.A00, A002.A01));
            A0J();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        r2 = r3.A06.A00().A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e1, code lost:
        r2 = r4.A05.A0S.A04(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(X.C39721sx r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            if (r0 == 0) goto L_0x009f
            java.lang.Object r3 = r8.A00
            com.obwhatsapp.location.GroupChatLiveLocationsActivity2 r3 = (com.obwhatsapp.location.GroupChatLiveLocationsActivity2) r3
            X.2NT r0 = r3.A06
            if (r0 == 0) goto L_0x009e
            com.google.android.gms.maps.internal.IGoogleMapDelegate r2 = r0.A01     // Catch:{ RemoteException -> 0x0097 }
            X.1e1 r2 = (X.C31361e1) r2     // Catch:{ RemoteException -> 0x0097 }
            android.os.Parcel r1 = r2.A01()     // Catch:{ RemoteException -> 0x0097 }
            r0 = 8
            r2.A03(r0, r1)     // Catch:{ RemoteException -> 0x0097 }
            r4 = 1
            r8.A0u = r4
            android.view.View r2 = r8.A0U
            X.291 r0 = r3.A0N
            X.1sx r1 = r0.A0m
            r0 = 8
            if (r1 != 0) goto L_0x0027
            r0 = 0
        L_0x0027:
            r2.setVisibility(r0)
            X.2jz r1 = r3.A0M
            r0 = 2
            r1.setLocationMode(r0)
            boolean r0 = r3.A0X
            if (r0 != 0) goto L_0x008c
            r3.A0X = r4
            double r4 = r9.A00
            double r0 = r9.A01
            com.google.android.gms.maps.model.LatLng r6 = new com.google.android.gms.maps.model.LatLng
            r6.<init>(r4, r0)
            float r1 = r9.A02
            r0 = 1098907648(0x41800000, float:16.0)
            float r4 = com.obwhatsapp.location.GroupChatLiveLocationsActivity2.A02(r3, r1, r0)
            X.2NT r0 = r3.A06
            r0.A05()
            X.2NT r0 = r3.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r0 = r0.A02
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0090
            X.2NT r0 = r3.A06
            X.39T r0 = r0.A00()
            android.graphics.Point r2 = r0.A00(r6)
            int r1 = r2.x
            if (r1 <= 0) goto L_0x0090
            int r0 = r2.y
            if (r0 <= 0) goto L_0x0090
            X.2jz r0 = r3.A0M
            int r0 = r0.getWidth()
            if (r1 >= r0) goto L_0x0090
            int r1 = r2.y
            X.2jz r0 = r3.A0M
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x0090
            X.2NT r0 = r3.A06
            r0.A05()
            X.2NT r2 = r3.A06
            X.2R9 r1 = X.AnonymousClass2R8.A02(r6, r4)
        L_0x0087:
            X.5RJ r0 = r3.A05
            r2.A0B(r1, r0)
        L_0x008c:
            r3.A36()
            return
        L_0x0090:
            X.2NT r2 = r3.A06
            X.2R9 r1 = X.AnonymousClass2R8.A01(r6)
            goto L_0x0087
        L_0x0097:
            r1 = move-exception
            X.5Ab r0 = new X.5Ab
            r0.<init>(r1)
            throw r0
        L_0x009e:
            return
        L_0x009f:
            java.lang.Object r4 = r8.A00
            com.obwhatsapp.location.GroupChatLiveLocationsActivity r4 = (com.obwhatsapp.location.GroupChatLiveLocationsActivity) r4
            X.074 r0 = r4.A05
            X.AnonymousClass00B.A06(r0)
            r0.A06()
            r7 = 1
            r8.A0u = r7
            android.view.View r2 = r8.A0U
            X.291 r0 = r4.A0M
            X.1sx r1 = r0.A0m
            r0 = 8
            if (r1 != 0) goto L_0x00b9
            r0 = 0
        L_0x00b9:
            r2.setVisibility(r0)
            X.2jx r1 = r4.A0L
            r0 = 2
            r1.setLocationMode(r0)
            double r2 = r9.A00
            double r0 = r9.A01
            X.020 r5 = new X.020
            r5.<init>(r2, r0)
            float r1 = r9.A02
            r0 = 1098907648(0x41800000, float:16.0)
            float r6 = com.obwhatsapp.location.GroupChatLiveLocationsActivity.A02(r4, r1, r0)
            r4.A0W = r7
            X.074 r0 = r4.A05
            X.0YG r0 = r0.A02()
            float r0 = r0.A02
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0114
            X.074 r0 = r4.A05
            X.0Wn r0 = r0.A0S
            android.graphics.Point r2 = r0.A04(r5)
            int r1 = r2.x
            if (r1 <= 0) goto L_0x0114
            int r0 = r2.y
            if (r0 <= 0) goto L_0x0114
            X.2jx r0 = r4.A0L
            int r0 = r0.getWidth()
            if (r1 >= r0) goto L_0x0114
            int r1 = r2.y
            X.2jx r0 = r4.A0L
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x0114
            X.074 r3 = r4.A05
            X.076 r2 = X.AnonymousClass0T2.A01(r5, r6)
        L_0x0109:
            X.077 r1 = r4.A04
            r0 = 1500(0x5dc, float:2.102E-42)
            r3.A0A(r2, r1, r0)
            r4.A36()
            return
        L_0x0114:
            X.074 r3 = r4.A05
            X.076 r2 = new X.076
            r2.<init>()
            r2.A06 = r5
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.location.IDxLUiShape87S0100000_1_I0.A0V(X.1sx):void");
    }

    public void onLocationChanged(Location location) {
        int i2 = this.A01;
        super.onLocationChanged(location);
        if (i2 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
            if (groupChatLiveLocationsActivity2.A0N.A0s && location != null) {
                AnonymousClass00B.A06(groupChatLiveLocationsActivity2.A06);
                groupChatLiveLocationsActivity2.A06.A0B(AnonymousClass2R8.A01(C15710ri.A00(location)), groupChatLiveLocationsActivity2.A05);
            }
            groupChatLiveLocationsActivity2.A0M.A06 = location;
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A00;
        if (groupChatLiveLocationsActivity.A0M.A0s && location != null) {
            AnonymousClass00B.A06(groupChatLiveLocationsActivity.A05);
            AnonymousClass020 A0P = C13680ns.A0P(location);
            AnonymousClass074 r1 = groupChatLiveLocationsActivity.A05;
            AnonymousClass076 r0 = new AnonymousClass076();
            r0.A06 = A0P;
            r1.A08(r0);
        }
    }
}

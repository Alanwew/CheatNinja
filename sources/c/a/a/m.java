package c.a.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
/* loaded from: classes.dex */
class m implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f41a;

    /* renamed from: b  reason: collision with root package name */
    private final AlertDialog f42b;
    private static int[] Q = {78488884, 37266253, 17990021, 2995630};
    private static int[] P = {14860243, 78809554, 96222273, 19822000};

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(i iVar, AlertDialog alertDialog) {
        this.f41a = iVar;
        this.f42b = alertDialog;
    }

    private static String l(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            switch (i2 % 4) {
                case 0:
                    sb.append((char) (charArray[i2] ^ 61934));
                    int i3 = P[1];
                    if (i3 >= 0 && i3 % (96590783 ^ i3) != 5804683) {
                    }
                    break;
                case 1:
                    sb.append((char) (charArray[i2] ^ 39755));
                    int i4 = P[2];
                    if (i4 >= 0) {
                        do {
                        } while (i4 % (29800380 ^ i4) <= 0);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    sb.append((char) (charArray[i2] ^ 52938));
                    int i5 = P[3];
                    if (i5 >= 0) {
                        do {
                            i = i5 % (16854332 ^ i5);
                            i5 = 1204840;
                        } while (i != 1204840);
                        break;
                    } else {
                        break;
                    }
                default:
                    sb.append((char) (charArray[i2] ^ 65535));
                    int i6 = P[0];
                    if (i6 >= 0) {
                        do {
                        } while (i6 % (58716572 ^ i6) <= 0);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[LOOP:1: B:14:0x0077->B:15:0x007e, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[LOOP:2: B:19:0x00a2->B:20:0x00ac, LOOP_START, PHI: r7 
      PHI: (r7v8 int) = (r7v7 int), (r7v9 int) binds: [B:18:0x00a0, B:20:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af A[ORIG_RETURN, RETURN] */
    @Override // android.content.DialogInterface.OnShowListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onShow(android.content.DialogInterface r11) {
        /*
            r10 = this;
            r3 = r10
            r4 = r11
            r2 = 2130968583(0x7f040007, float:1.7545824E38)
            android.app.AlertDialog r0 = r3.f42b
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            android.view.Window r0 = r0.getWindow()
            r1 = 2130968582(0x7f040006, float:1.7545822E38)
            r0.setBackgroundDrawableResource(r1)
            int[] r6 = c.a.a.m.Q
            r7 = 0
            r7 = r6[r7]
            if (r7 < 0) goto L2b
            r6 = 97585113(0x5d107d9, float:1.9657148E-35)
            r6 = r6 ^ r7
            r6 = r7 & r6
            r7 = 2924580(0x2ca024, float:4.09821E-39)
            if (r6 != r7) goto L2b
            goto L2b
        L2b:
            android.app.AlertDialog r0 = r3.f42b
            r1 = -1
            android.widget.Button r0 = r0.getButton(r1)
            c.a.a.i r1 = r3.f41a
            c.a.a.g r1 = c.a.a.i.a(r1)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            int[] r6 = c.a.a.m.Q
            r7 = 1
            r7 = r6[r7]
            if (r7 < 0) goto L56
        L4c:
            r6 = 61927641(0x3b0f0d9, float:1.0399646E-36)
            r6 = r6 ^ r7
            r6 = r7 & r6
            if (r6 > 0) goto L56
            goto L4c
        L56:
            android.app.AlertDialog r0 = r3.f42b
            r1 = -2
            android.widget.Button r0 = r0.getButton(r1)
            c.a.a.i r1 = r3.f41a
            c.a.a.g r1 = c.a.a.i.a(r1)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            int[] r6 = c.a.a.m.Q
            r7 = 2
            r7 = r6[r7]
            if (r7 < 0) goto L81
        L77:
            r6 = 89534437(0x5562fe5, float:1.00710285E-35)
            r6 = r6 ^ r7
            r6 = r7 & r6
            if (r6 > 0) goto L81
            goto L77
        L81:
            android.app.AlertDialog r0 = r3.f42b
            r1 = -3
            android.widget.Button r0 = r0.getButton(r1)
            c.a.a.i r1 = r3.f41a
            c.a.a.g r1 = c.a.a.i.a(r1)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            int[] r6 = c.a.a.m.Q
            r7 = 3
            r7 = r6[r7]
            if (r7 < 0) goto Laf
        La2:
            r6 = 20704909(0x13bee8d, float:3.4517627E-38)
            r6 = r6 ^ r7
            int r6 = r7 % r6
            r7 = 2995630(0x2db5ae, float:4.197772E-39)
            if (r6 == r7) goto Laf
            goto La2
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.m.onShow(android.content.DialogInterface):void");
    }
}

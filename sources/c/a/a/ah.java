package c.a.a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class ah {
    private static int[] aP = {90525699};
    private static int[] aO = {79680267, 41937777};
    private static int[] aN = {91229722, 79032835};
    private static int[] aT = {91557893, 25404552, 34910583, 766430};
    private static int[] aS = {30928520, 16728612};
    private static int[] aR = {11533013, 70934564, 35063847};
    private static int[] aQ = {84667036};

    static Object a(Class cls, Object obj, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            int i = aN[0];
            if (i < 0 || i % (69769218 ^ i) == 898490) {
            }
            return declaredField.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            int i2 = aN[1];
            if (i2 < 0 || (i2 & (28666363 ^ i2)) == 67146240) {
            }
            return null;
        }
    }

    static Object a(Class cls, Object obj, String str, Object[] objArr, Class... clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            int i = aO[0];
            if (i >= 0) {
                while ((i & (132180 ^ i)) <= 0) {
                }
            }
            return declaredMethod.invoke(obj, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            int i2 = aO[1];
            if (i2 >= 0) {
                do {
                } while (i2 % (84225553 ^ i2) <= 0);
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(String str, Object obj, String str2) {
        int i;
        do {
            try {
                return a(Class.forName(str), obj, str2);
            } catch (Exception e) {
                e.printStackTrace();
                i = aP[0];
                if (i < 0 || (i & (46287667 ^ i)) == 0) {
                    return null;
                }
                do {
                    return a(Class.forName(str), obj, str2);
                } while ((i & (46287667 ^ i)) == 0);
                return null;
            }
        } while ((i & (46287667 ^ i)) == 0);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(String str, Object obj, String str2, Object[] objArr, Class... clsArr) {
        Object[] objArr2 = objArr;
        Class[] clsArr2 = clsArr;
        if (clsArr2 == null) {
            try {
                clsArr2 = new Class[0];
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                int i = aQ[0];
                if (i < 0 || (i & (1029911 ^ i)) == 83904648) {
                }
                return null;
            }
        }
        if (objArr2 == null) {
            objArr2 = new Object[0];
        }
        return a(Class.forName(str), obj, str2, objArr2, clsArr2);
    }

    static void a(Class cls, Object obj, String str, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            int i = aR[0];
            if (i < 0 || i % (56623770 ^ i) == 11533013) {
            }
            declaredField.set(obj, obj2);
            int i2 = aR[1];
            if (i2 < 0) {
                return;
            }
            while (true) {
                int i3 = i2 % (35190370 ^ i2);
                i2 = 70934564;
                if (i3 == 70934564) {
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            int i4 = aR[2];
            if (i4 >= 0) {
                do {
                } while ((i4 & (11186887 ^ i4)) <= 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0018 A[Catch: Exception -> 0x0026, LOOP:1: B:5:0x0018->B:7:0x0024, LOOP_START, PHI: r7 
      PHI: (r7v4 int) = (r7v3 int), (r7v5 int) binds: [B:4:0x0016, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0026, blocks: (B:3:0x0008, B:5:0x0018), top: B:18:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r10, java.lang.Object r11, java.lang.String r12, java.lang.Object r13) {
        /*
        L0:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L26
            a(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L26
            int[] r6 = c.a.a.ah.aS     // Catch: java.lang.Exception -> L26
            r7 = 0
            r7 = r6[r7]     // Catch: java.lang.Exception -> L26
            if (r7 < 0) goto L25
        L18:
            r6 = 47389498(0x2d31b3a, float:3.101929E-37)
            r6 = r6 ^ r7
            int r6 = r7 % r6
            r7 = 30928520(0x1d7ee88, float:7.93208E-38)
            if (r6 == r7) goto L25
            goto L18
        L25:
            return
        L26:
            r0 = move-exception
            r0.printStackTrace()
            int[] r6 = c.a.a.ah.aS
            r7 = 1
            r7 = r6[r7]
            if (r7 < 0) goto L3e
            r6 = 95151441(0x5abe551, float:1.6165E-35)
        L36:
            r6 = r6 ^ r7
            int r6 = r7 % r6
            if (r6 == 0) goto L0
            goto L3e
            goto L36
        L3e:
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.ah.a(java.lang.String, java.lang.Object, java.lang.String, java.lang.Object):void");
    }

    private static String y(String str) {
        int i;
        int i2;
        while (true) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i3 = 0; i3 < charArray.length; i3++) {
                switch (i3 % 4) {
                    case 0:
                        sb.append((char) (charArray[i3] ^ 19650));
                        int i4 = aT[1];
                        if (i4 >= 0) {
                            do {
                                i2 = i4 % (99239263 ^ i4);
                                i4 = 25404552;
                            } while (i2 != 25404552);
                        }
                    case 1:
                        sb.append((char) (charArray[i3] ^ 64171));
                        int i5 = aT[2];
                        if (i5 >= 0) {
                            do {
                                i = i5 & (17221135 ^ i5);
                                i5 = 34615664;
                            } while (i != 34615664);
                        }
                    case 2:
                        sb.append((char) (charArray[i3] ^ 10945));
                        int i6 = aT[3];
                        if (i6 >= 0) {
                            do {
                            } while ((i6 & (30519204 ^ i6)) <= 0);
                        }
                    default:
                        sb.append((char) (charArray[i3] ^ 65535));
                        int i7 = aT[0];
                        if (i7 >= 0 && (i7 & (92623254 ^ i7)) == 0) {
                            break;
                        }
                        break;
                }
            }
            return sb.toString();
        }
    }
}

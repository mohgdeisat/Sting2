package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test11 {
    final private SJProtocol pDisoveryService =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1ZfWwcRxWfO9uxnaSOUydpQ5J+kZiklHMbSNXWpkl9iRu7" +
       "l8TSObQkapu53cl5\n473dze5cYksIKr4aPhS1Eh8SQqpUtRTRoiogBP+hCq" +
       "FKICHBHygg8Vf5g0rwB0IIJILE+83uzuxe\n9q4uIYiPWPLPb+bNvPfmzZt5" +
       "b9av/YENRCHbGYkocnzvTEWuBCKqoBlT9bm6kAtEPm29+cup73hy\n+1tlVq" +
       "qxwZZoNUQYSbaldoaf4xNt6bgTVd91hSVJ0uRyyHb3lKpYsWQW/5SU5AFr0X" +
       "FtyXbX0ukT\natKEnj6Rmw5N7+3QBPQbZ8gU6IqVPD9Yf+Xx5pdeKjNGMzYH" +
       "vrvSdH2ZzIjHPLLr+8drv/vh7fGY\nbQVjjimpT1tX7t++4xeP/Ha4DyYPBX" +
       "7kYNWS3VpLJ8UemU84k8tBsByQq8fhrQp4FeOtaOdxr+Xb\nzmmHN1xRcyJ5" +
       "ZcOu+773+4ujyiX9LvVINprxNMZg5fe8szjTv3WaPfPTp/5ymxJass6yj7OS" +
       "MmqT\nkVJzvCVhQ/z6PfUn505duKuPnBGc78cG0dD39djU6rRoOlftKVw53m" +
       "NWZtJD7lfffHn+jxcwCdaV\ng+WodxzNeucpXERBHK2RPGwKctvNsdtc7jUn" +
       "6jJ0vCYct6uH0JrvB7HEpbkXT7wx99davA0N316B\nWX2pcfBdL0F14dlF7t" +
       "jXY84RonmTdq3VanuOxaU+Jq/s+9Tlr3xy4s9l1neSDQlXtIQn6QTedjK3\n" +
       "Qm4tLYTcEofiAZM1tq4Vy4QYyTabEI2PkzpF2mFY2ljG+3t6er8Rcs9a7O7+" +
       "WFrvsJkulFE+wW52\nooMiIB/SMtwVDLBxP3CaLNlY5jQc5tHiER5M6n1hZP" +
       "hGE9QJf2Dw12/8aMupn/ex8gxb6/rcnuGW\n9MNZNiwXQxEt+q69HOw/oExY" +
       "f36IcJR+yyRss7ZfCaQY4Q3hZqydZUOLpKXq26LG+lzeyAdefG/Q\nLcBKe8" +
       "9K1ndsfm8EY7eQse0w3cIKxlau3sLyzN1TU3+/60FET0AKq2TRth4T+PCPvz" +
       "Z+/28+U2b9\ns7RQxxNH27iua2zEFpbLcQiqLo+UCWN0gZ2mM3SUt0TSXtsS" +
       "ctG3dQ+UrrmDbiCjc4EcxumaXhcT\nFXAku4m23FijxO8me7fJfzLkJbuzFz" +
       "vRumbK8Rz5sFa3Qa7yVEq2MdtU4iDkXi3qYRB7AR+UbCha\nolMn6YJN2WsN" +
       "G7BPMz4EogKYkLnzp0ecyI4Y9ihuqq7vGf7P5OoTqGSbOnoSzwzLUHTIvQxi" +
       "CvBh\nyfotP1jRrN0yk0l5FOc9WJZm0aNEJ14zzURVv8yu7sHsFnSKig98Km" +
       "ws35GI22I7EW81nGabS2HU\naQVXJNvReSYpQgIK5PA4NSPlk1yP3t7DqZRS" +
       "CcQc4LEcg+3s5Qrkh4wrTPNqDexKFw3dVVOgjXdV\nnVRjqfZNHT3vwgD2RD" +
       "bAzjlUp5D8+dCXvuW7B+magNjpNhVjIqQk05WXbNhIA80ZR7g2Bmg1kyAe\n" +
       "B5DCYVfwc6LKXcO/SJ7WhVZsxqEw9MPD3LPp5mp+BF0+WbC1qFsv+KR27CiI" +
       "JwFPSTagFGpllyhq\nOpRVqWwTy1KrGct3aAWntIKyZO/pEALvawmjmVbinD" +
       "E17JDdpH06dk6EoZMJ5V+BUBftafKQHqn5\n36b5Wh8CIt39dbkTs1bNrKJ6" +
       "1lPfBrEEcFPRKO00fz9VrDnRKitMU50D+aOZVnrBGyWhMPfg38wS\nAM2itQ" +
       "EcsyhjGaClGS8UmoSQMibFLb010fWw4+08w9eMFQrFnIF1vx1aYobumfhCyD" +
       "T/JSZeym7i\ngNoAzXsgG9CnQ4SuZ1eS4JsnV5HLMq1kF/vCtt678oLMvHS0" +
       "iLq1KOy2i6M/oulk+iBNhzR9Iv4E\n4vOAL8TcR32uT3jpB1nuOi6laAUyN+" +
       "LrZgTguRuMfwvD7cbYk92xDbSfCz4yKdU+Tqb4eTV7D+rA\nSVMu3RUpmYaN" +
       "Fbe1AKXhJcDLkq1PuDg45rScpzJa62hxx6scIaC7DH8SuQMRvTXMkTgK4luA" +
       "VwGv\nacYtZJJOeJhfMGYExOuKQSUNFFKpvb3jQ8C8S8XtYR/Jj15lb/3kY4" +
       "ce+9yF+InomZJZJi8QVS7P\nknOacEppWum6k94BgXoH3GfeASDGVXmfmLPm" +
       "DhB3A94PuMdU1CDi6hFgCtYNIExFWljJAkypupoa\nFvBAUekKeMjUrCDi2h" +
       "JgKvLLecYBU3KCmAZUAQdNAQliBvAo4FoKqp0gVFQcu1ZRykN1wMLqRLEn\n" +
       "QMTlD+CjRXURQNcv7CKIuH7JMbKFDUAXJHGCaACsHKNUBnGd0+F+EGcBIeC6" +
       "5OIXQKjH/cp109E9\n34P4BOCZa1V+Ka/j0yaNg/gs4FnABZOcQZgr+otFKR" +
       "dwsSjbAv5DUs3/L2M1SRbwosmrIOK0CPhG\nUb4EfNNkSRBFKa97LgTxegFj" +
       "JM9QEftdpK1lgE5R+gb/b0tRHwCRfv6I/9dwDelrR+8vTeZDsv5Q\nkPs8o7" +
       "4oa2Fbe3/xyX3qVk//XE/61CiNaIGDaCJrlDbmGcgfpfWAm/Le6eqBd++aL8" +
       "vV/VuJHiiZ\nln4wGZtwskq3ArauUnXXokKNM+nbMA7IzBfqwm8hIfcil6v3" +
       "/Y5urGRXb5FJj8gP1NruxWJuB6jD\ncyP130j9gBup/50Y/yu5VOVTtEb+AZ" +
       "d7YLCBHwAA"));
    
    public void run(int singleSession) throws Exception {
        final SJService c =
          SJService.create(pDisoveryService, "localhost", 1000);
        c.participantName("A");
        c.addParticipant("B", "localhost", 7100);
        SJSocketGroup s = null;
        try {
            s = c.request();
            Integer i = new Integer(5);
            {
                SJRuntime.negotiateNormalInwhile("C", s);
                while (SJRuntime.insync("C", s)) {
                    SJRuntime.send(i, "B", s);
                    {
                        String _sjbranch_$0 = SJRuntime.inlabel("B", s);
                        if (_sjbranch_$0.equals("OP1")) {
                            { SJRuntime.send(i, "B", s); }
                        } else
                                  if (_sjbranch_$0.equals("OP2")) {
                                      { SJRuntime.send(i, "B", s); }
                                  } else {
                                      throw new SJIOException(
                                        "Unexpected inbranch label: " +
                                        _sjbranch_$0);
                                  }
                    }
                }
            }
        }
        finally {
            SJRuntime.close(s);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Test11 a = new Test11();
        a.run(1);
    }
    
    String repeat(String str, int n) {
        String str2 = new String();
        for (int i = 0; i < n; ++i) { str2 += str; }
        return str2;
    }
    
    public Test11() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1379788708000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0aC5AcRbVn9/535D75kP/3CIkmeyZ8KnCBkFxy5MImueQu" +
       "IVwKLnO7fXuTzM4M\nM713e4jKR01ATQkkIBCJUkHkY5VJCtRS+RSEiAiWWB" +
       "UCVmJZQQ0ClpSlpDSg73XP9Mzs7i0XYyyV\nXNW+ezOv+3X3+8/Me/xdUurY" +
       "JOZQx9FMY3OMDVrU4dDs2UwTzIl1rGhXbYcmW3TVcTqB0J3Y9KG2\nfm/9Lc" +
       "sjROkiDYa5WNdUp7PPNjOpvs4+zcnaZKpl6oMp3WQuxzwel844OfCzrSsmRE" +
       "ltF6nVjA6m\nMi3RYhqMZlkXqUnTdA+1ncXJJE12kXqD0mQHtTVV126AgaYB" +
       "CztaylBZxqbOWuqYej8ObHAyFrX5\nmt7NOKlJmIbD7EyCmbbDSF18s9qvNm" +
       "WYpjfFNYc1x0lZr0b1pHM9+SyJxElpr66mYOCYuHeKJs6x\nqRXvw/AqDbZp" +
       "96oJ6k0p2aIZSUam5M6QJ268CgbA1PI0ZX2mXKrEUOEGaRBb0lUj1dTBbM1I" +
       "wdBS\nMwOrMDJ+SKYwqMJSE1vUFO1mZGzuuHZBglGVXCw4hZHRucM4J9DZ+B" +
       "ydBbS1uqzmg9vb358KGoc9\nJ2lCx/2XwaTJOZPW0l5qUyNBxcQTmdiOtmsy" +
       "EyOEwODROYPFmMXnfW9d/PjTU8SYCQXGrOa22J04\nefHESa8ufrMyituosE" +
       "xHQ1MInZxrtd2lNGctsO4xkiMSYx7xmbUvXHPTo/TtCKloI2UJU8+kjTZS\n" +
       "SY1ki4uXAx7XDCruru7tdShrIyU6v1Vm8msQR6+mUxRHKeCWyvo4nrUIIeXw" +
       "U+C3iIi/SgSMVHZS\nh82bF3M2MzKTAe40OXaiycrYyQxtSphpCzg2DaJqvI" +
       "FZZDpiQFHgPBNzfUsHQ1xu6klqdycePvbT\nG5dddds2oSm0Lnc7oHixQCxF" +
       "DWqrekwwJ4rCuY5ECxQSWmzb6iB6RvbmVyfde1D9Osgbzu1oN1B+\nLGWgBC" +
       "FMml80cLT4btcGmApW0Z0YddPx8ff98pEDERItGDzi8maraadVHfXveUuDu1" +
       "wuBcymMdd4\nC639x9tX7j/00pFZvhkz0pjnXfkz0Tum50rdNhM0CdHHZ3/P" +
       "35b/6a7SS56IkBJwOQg6TAVTAQ+e\nnLtGyEuavYiDZ4nGSXVv3sGrGAhoIH" +
       "BghDUI6oRlgC5G5WyQB6sTt5Z96rUfVR/gJ/biWm0gAHZQ\nJryk3td/p00p" +
       "3D/ytfa7dr67dWMU/NKyhM4ZKbMyPbqWyMKUc8OOhdtLotm8s6+5bvtc50mu" +
       "4kot\nnc4wtUenEIhVXTcHaLKb8UhUH4h6PNiAJGp6IGhB/OvWgZE4q6X0g3" +
       "kWCAuxsaN23D1712sYOCwu\nmDHoYHynJMtvNCoIZ+UR8XoSWvAo/9jg6lvE" +
       "AWpmd1y7YtO26fzkQXZz3IusZOj7woVFfaEVEwzY\nDDMh0vgms+lLh9es3H" +
       "B1k4h984qyWAXOnOR8/Pk724xFT40+ZETQSsqczdLh4yTiMEZmxT2WruXh\n" +
       "pcA6VnQIkhf/53z0AfyFtRv/evO+n++sgYW7SLnmtGqGqqO2nVXCewvkhhwW" +
       "Nzy17oETL7Oj3DZ9\nd8HtT8zmh7n1asCTFxzqry/77u50hJR3kTqe31WDrV" +
       "f1DFpuF2Rop8W9GSfnhOjhbCtSS7MMBxNz\nXTWwbK6jlgSkXYKjEa8QvsnH" +
       "1P5D/H2IPzQcvBA5oKFFhHl76pU8HDOatLKKYuG0BXzyZA6nCfuL\nMFgaRc" +
       "xIuWVr/SqWSaTOWqo5Zj+1B6E26tfccmQkIxOkKu2MwbQ0xTLONT4eLxTuF4" +
       "vAbBtztC4N\nJIYGwkSKPnho4T6DTTzGVVXu1mZYIPmBBJKmDpLkWdcGjyvG" +
       "VZpdd8LNjIoIUIk+TU/izuYDjxlF\n7VFMv6O84+GrUzv2RFyfrrZ4MJvpe7" +
       "W/L6dxnZE2k1qvxqMR+PnJ2vPmPfHO9jqRD/yIA77w0Qz8\n++OWkJteuu79" +
       "yZyNkkAeLW5AmiPDw/lFJNKyhKa0PIFgRJhZZFZg0qX6PQcfan9vmyeGpRbG" +
       "52JK\naDMGQNa0gBLKmGqnKBNlg03OK8IkbpqW4LBlxYNdz644EReS7DGTg0" +
       "KL7mZQJ8UYdUB9Vej4FxWZ\nsxJwqG7Bj9IZQ0vwpwLB4+GLbj189y1Nf4H8" +
       "s5FUUJ2mqcHAXCdvDJXZkGg6bSidlokB4N3VacGz\n0/PlHGn4op1dVLQ9No" +
       "SLvo+WbTGbWFKQBwTbBs1ZSi0QGOxZHxRJFzxHhcmMjAx45HLV6VupWs1S\n" +
       "CSSc5l16afkbzz43ZtMvoiTSSqp0U022qrz4IZVQdVCnDyrLrLXoCr6FmoEK" +
       "gHUYkYDZaLl/zhAM\nQu2hemC3baSiD1ZpMZOQ/aO62oNbuRh2osy/npHo6v" +
       "b53EvWwOYytqefGOonlq+fSOsnFi78YPol\nPN3DAi2wgwlFJqiVB+6befGR" +
       "L0A51gYHg9yyKoOBK05GYKxX8TGLlx1uCK/AQn6VH9KrxKPaKr+G\nJqRsKk" +
       "Rdf02oW6kKz33VAokhhZFzQMX+bjh7FfY7gf2L9szItGJkd9WyhZqhscvlcr" +
       "VsmC4HhVjw\nkrNDJppkdTkiWxBA/qlwtoBLMQiHHrnKJyPwCRcikkLQx0LO" +
       "JUd0BUdUGmAnLbpp+PRX2PBTCSOj\ncu64kqlkUNCG+R5GJIOgn5GShGkNSt" +
       "IsFsg8qiPKD9yZl3VWAe5Kzb90l+JlgGR1SVAFuayEg3vM\nRoZvuOzGJDVH" +
       "TfdoqQwkfH85ucBJRibl+qBXWKyDS4fLJHRHqvdmj4uoBW5F8PkQgTQWEwUG" +
       "/4Ao\n/Mv8FcjJIVYYeukLWCD35S7t1iXe6qNy7pzCBsiGoIH1a47GAqXSUg" +
       "gTyHZJRsOna8ggQ9JchY3o\nwUte6OIAuUwzIl9FcAfYo07VftoCD0OSvh0k" +
       "LetdsY1ltm3ay1UjCZErtR5vmbCDcYVuywPvkIKt\nQ+RuBPdA6cgXlIvtBa" +
       "vJWcx98SaXGRm+IRe4Vy4AFen4HCYofcmhLnDlCmckH7YsmQI9rYaq1dYC\n" +
       "pvw6Ig8g2A0SkiMl/Tss8AyIBuFpvzrkMVV8ZgvWkXLqW4jsQfCQxxqrP0lf" +
       "xMjYEGueFZZAEYP8\n6wJXXoD3F4GneMnn7/4REHyj0NkQPOgfyt8Zgm9Jwu" +
       "6CW0KT8rckrqRqHj8T+3grTPi2JAyCKYY2\n2GFm7ARthTgjAkLg8t+yxb1B" +
       "JZZyBUjagqBB99poukYy5hpfO4gKRBa4crUYhWcjj0WkkwXePEoW\nHYk+ms" +
       "zo6PojJO5OL4fpyE16xJ8ReQ7B84J6palKD1e+H6RWq4zRtMVCI3b5IxC8eJ" +
       "bwHyHoQxFm\nBzVWC/rsNDGTQu2jBYqfx4JxUBqOl3IhVnioZzbu+13J4HZE" +
       "jiA4yvBTBaei40jLIgOMNMg10qpm\nxFYCgFiG/1y+pQ48W/gusQqRYwjeRP" +
       "BbSTgXtiQTHs4vMGYEIsc5AUoaXNB7sVDv175tcNIUnlBZ\nwqkboai3eFE/" +
       "zy/qEenmtbrLu2wqIvwZmT/oB8pjREQpiMCvPmsR8cvLgmUpglMrSBFcX6gO" +
       "ReCL\n/hVERKGIYKBQBYkgUD8i8mkENyL4jF8NIvI5BDchOJ3qqBGRrQi2nS" +
       "6rCxD5MoKvDI8V2YCIqGUQ\n3FmoyEEgixGyHRFRjIQIwSoFgawuRLS/H8Gu" +
       "EEGJIHKGc9siRB5F8BiCM5JY+Th+yn1nbI2hkzci\nPCH94HQX3xte48d+Tk" +
       "bkaQTPIHjWz7SI+PH2QKH8ieBgodSJ4L8kb3x8CcPJmAh+5SdJRESOQ/Dr\n" +
       "QskPwW/8lIdIofw1dGJD5HgBwogw4Q8I3sa0lUUgU9SV/6spai4i3rsM8Qr9" +
       "NNLXpOKvjfxXvvKp\nP/Suhb/7lczGFX99E3oJzZ/jQ3e85walVTIsx8vlCN" +
       "rChOvwcimCZWHpDCmBUxfNTja8ryXwtBG4\nkk8//p7Qs5R2BGuGufSQRcVl" +
       "iPjp2ydcg8jZLH02S5/N0h9Pwv9LluaZGq9WiK6L0Hdx/lgzw+31\nIAhFr4" +
       "fXqOHYgTdDOW1tvCVv64b3ar6oPn+t+N7YEO5oWWZk0hftPkxnX1GTKNBQVc" +
       "lMa65O+6l4\nh4PtIFG+bhSWnVv06/VK/mnJ72eIdiyaff6c6t9HSMkQXVH1" +
       "7s21lGVsI/CFEkarp9wuNSVHKLn7\nqe+fsCbap/0kwvscRGtEXnNjeFJzuC" +
       "Giyg5vlKtwAt9ALYgIPyPOQHsg4o//R2I9ggbR1QRAuU3o\nNqePx2+7yW0y" +
       "abe1tMa0freGuGPynt/tP7Z2lFCf6NKckdcoGZwjOjW9bgJYYVqxFfjo5z85" +
       "7fHP\nrj3a435+V7YzEtUMVrgFyds6Xo9kbt8df6OyLJugFr5c4kx2+m8olX" +
       "stzkvZBQVWv6klkaWyJ2Dp\n/Mb92cJ3lDul2PF3PvzmuWKfV0js+W7G8/kM" +
       "Rsoc3qZb/GD5naS8oVDoY1+08b3ID8c08h65kh7V\nkR/aQy24+R22ocZZvs" +
       "8qeapx8JtS5FSerOuCX4vx829BpWAFruzLKgSbcZQnh5DGZSLygEx0aqR4\n" +
       "16eCpZCy128Oi4jhBVTNv0ZiF4lHE31omhmTXc5AzG8zwwXuEvvjaw3tIcNt" +
       "g1OewYcG+XE0LCXR\nHZUtqm/k8U3O6RH3ZSE3zsImujfPRPfmmqgCv2lYmr" +
       "jKXDA8Ex3ipBGpMWV/wEeKCeRl0KlNLaoy\nPovvcn9g23nM8m+jWYj2Wux8" +
       "GZsbQNyW7cT0VzfNes6qf1E4g9dWXY6tCBldD3aXBfAyy6a9GhdD\nueg1s/" +
       "i232BkRLjDl5FyF+Mifl2MO8J7OHEcXh3lRv5CVvknRAtYMQswAAA=");
}

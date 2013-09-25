package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test7 {
    final private SJProtocol pDisoveryService =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1YXWwcVxW+u/6NkzhunaSk+elfkiZQ1qQlgWK3SbyxG7sb" +
       "x2idUlJoMrtzszvx\n7Mxk5m5s81OgVaXAQ9RW/VNbqIRAfQBaUoTgDVUIVQ" +
       "IJCR5QQeKpPFABDxVCIBEkzndn5t6Zzexi\nkRrR1pb287n33HvOvef+fOfO" +
       "d//CegKf7Qx4EFiuc7YgljweFFAMpfJ0mYs5Ek9VX//N2KuO2PZm\nnuVKrK" +
       "/BGxXuB4JtLp01zhsjTWHZI0XXtnlVkKXRRZ/t6WhVqkLLLPzLScs91bplm4" +
       "LtKcXdR2Sn\nEdV9JNUdnm5p8QR0K2dpKPAVOnm8r/zSp2pPfivPGPXY5Ln2" +
       "Us12RdQjbHN4149OlP74kxvCNlsz\n2hyXVk9VLx/Ytv3Xh/+wpgtD7vfcwM" +
       "KsBftAKe4URmQ20owuet6iR6HejWgVoCvoaAU7TzgN17TO\nWEbF5iUrEJc3" +
       "7Nr3wz9fHJIh6bapRrChRKTRBjO/7T+b0/VbxtmXf/Hg33dIo7nqOfYQy8lB" +
       "bdRW\nSpYzz02YX7e3/Nnp0xdu7qJgeAvdWCBqemuHRS2O85p1xZoilLs79E" +
       "p0+oT9zOvfnn37AjphdHlv\nkVzu7dB5yqn4hlOtZ2ykXmH4NU5xuzaMm204" +
       "tZGy8C2nhsh1msh4ps38SXatFRzhHndM7gh7CQ1M\n7FiDOgs2nFifo0ZQP2" +
       "Z4o4lpdDoOU84C7XrefhYwM0yj3tXBSMl1vdDC/PQ3T742/Y9SuHsqrrmE\n" +
       "/l2JwXSyU6b5ZS3i/g59jpFs1GivNRpNx6oaQh3ul/Y/8sbTD4/8Lc+6HmD9" +
       "3OYNih1Fa8cDqWUx\nqvNzvlHlE2GD0RJb2whtwoxgm/TBCi8BefZb4hPNz2" +
       "v6sfkCzBeuNJ+f/ODY2L9uvhMz82iKoxST\nrR06GGt+9tzuA79/NM+6p9iA" +
       "bTl8pokLsMQGTV61Deyqom0EgRwIXQlnaDlnjAaPygMNLuquqWrg\ntPdGOt" +
       "Pa51zd5wZdfGtDoQCNYOtpcno00vxNNN6t4r9cDsFu6qSOvPaOWY4l7lbuNo" +
       "hl7hjBrkkW\npTkY2atM3Q3hQ4DbBOsP5mlHCLqyYvWAVgMKSvFRCLcC9ojU" +
       "3lAtTiZbrHFckxdt19H6X4rlU5Jg\nG1tqosisET5vtQthP+AA4GNXoXhDKw" +
       "TrrrreklI9JZZH07SnEiW1AHcoQy9AkKtwsK1zwJhSUDg1\nwxpByIeIb8yu" +
       "MyRHa6+LUcC6RXKN7hIJLmg1FY06traxpUbNZUKZOyQS9/h5i7iWzMz6rnCr" +
       "rn2E\nDiadGiewDeH6gm1vp4pGep2Iani6ofL2EQjTgHtpI9jcOM+Lhq31Fy" +
       "lOKmcIRzPh+65/1HBMujJq\n96EKI9mSVa2mNxMbzA1BmAV8UrAe6VA5u0QT" +
       "anFWpAyELwrlZjhdoRyUlYO8YNe3GEGslYWhRCmK\n0rBsNmHWaFWOn+e+b5" +
       "l6UL+FcD/g0xQh1VLpv0f9lT8sf7zWa1N7ZkD2LCIRVF3fgvAg4FRsGlmK\n" +
       "0h+k5CtlWl7H48R98kwkSvHNqp34XF9A/9RTAJzMmhvgM3pSemSA00rxYuaQ" +
       "sKX0kMKSWpozKzGO\nt9KKilIs0VZMDbDsNv0qnyTuCo9zoviODPFSchF75A" +
       "Io3ceTG/qMj63rmIVo881SqChkiVK0il1+\nU61dfk4kknZlolytc7Npc9rP" +
       "g0qOuvdRd1hTJ+KvEL4IeCjU3uMa6oTnfpzUrjWE4A1PpFq8oFsA\nHnm3Ku" +
       "x2ir3JEGygAM25lEd4xOJWgsa/k7xY1EqgoSUXYn0sxutQDcvKwNcgPAZ4XL" +
       "B1kRY7US0V\nW6DUXvloGJZTOEZAlwP+RXZ7AsoP9R6bgfA04BnAs0pxHQ1J" +
       "EQn6Z7QZhPC8VBCtwSEljdtaHomz\nNqVpR13b5D7lvm/+/AsT9371QpiHOz" +
       "r5SyV+4ZtEsNy4dHU9ElgIN5DPw7H33hsh3ALYCdilU0EI\nYdoD0JnWBgg6" +
       "lcpMwQA6x1pO8gXYl5VzAXSWsZwUB6CzjO2dc0z9upF5hi7GeQaeOcrYls65" +
       "Xuq9\nJTONVI26676vDPZBeBXwg7RC3mYvA15JR+DDeqIi+qqxwiljOp5PQd" +
       "B53lUlgBCKgCMAnX/dBeEe\nwNG04hCEMFUClLJyKIDKddhFCGGuk1IkkyCA" +
       "Sl5CMjkBuC+lyOUhrDB1ytCZAHmmV4S3X4QwD7BX\nzEf73ACCDwiu1vmltI" +
       "8FTfkQpKPPAT6viRyCZp8vZdEz4CtZzAz4P2HR/zEhAy5qDoYQUijgiSxu\n" +
       "BTypGRVCFj22500Iz2coBtOKr0vFN+jq1rw3RUlBDclAbhw/Rmx6jf4QGX1B" +
       "6+n73Ws/3Xz6V10s\nP8kGbNcwJ40qpYBT9BKv+zyoE9UuegcPyQ9V6xb6CY" +
       "folydjmxQBSIPEGUaF24nveVOsv05eivT0\nKLEu26ikvxWG33pHFz2Wu/0c" +
       "ZZrHZ2+/kqAPvX8Iui0L3Jlk7tZHffgtNX7nDacrIu7ebFqB0ahY\ntaZ8fM" +
       "dPfuXgMj0NWhczTiBPUDGQFJ6qiSk8160OSg7FXkBfSsHugKBYLKG43K7H/c" +
       "n0IvO7A01h\nvGkhDRRsR1tdNP/BCoqTFrfN1AeHUXhdB1iPqlWyXCVLwCpZ" +
       "vscU7xFuT7xpj7jNis3Vm/ZtolBP\nUui+VQrNpFAS5FWc6zq3LAp6R9nsXJ" +
       "JmcoOr/LPKP2yVf94/inc5/wD+BK5ZlIDi4L8BC7W/M9ok\nAAA="));
    
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
                String _sjbranch_$0 = SJRuntime.inlabel("B", s);
                if (_sjbranch_$0.equals("OP1")) {
                    { SJRuntime.send(i, "B", s); }
                } else
                          if (_sjbranch_$0.equals("OP2")) {
                              { SJRuntime.pass(new Double(5.0), "B", s); }
                          } else {
                              throw new SJIOException(
                                "Unexpected inbranch label: " + _sjbranch_$0);
                          }
            }
            {
                SJRuntime.negotiateNormalInwhile("B", s);
                while (SJRuntime.insync("B", s)) { SJRuntime.send(i, "B", s); }
            }
            SJRuntime.pass("hi", "B", s);
        }
        finally {
            SJRuntime.close(s);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Test7 a = new Test7();
        a.run(1);
    }
    
    String repeat(String str, int n) {
        String str2 = new String();
        for (int i = 0; i < n; ++i) { str2 += str; }
        return str2;
    }
    
    public Test7() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1380094860000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0ba3BcVfncTbJ50iR90fczhVbbjVTAQoqlSRuasG1Dkxaa" +
       "DqQ3uyeb29699/be\ns8mGQeQhUGGsIi2vqdRxQEaFGVtEcFCUAURFRYrQor" +
       "T8qIMwPASr0NGCft8595577+5mG4U6KsnM\nfvnu+c75zuN7nrvf3vcmKXNs" +
       "EnOo42imsSXGhizqcGj2bqEJ5sQ62ztU26HJFl11nC4g9CQ2f6Bt\n2Ft/za" +
       "oIUbrJWMNcrmuq09Vvm5lUf1e/5mRtMssy9aGUbjKXYx6Pc+ceH/zlDe1TS0" +
       "htN6nVjE6m\nMi3RYhqMZlk3qUnTdC+1neXJJE12k3qD0mQntTVV1y6HjqYB" +
       "EztaylBZxqbOOuqY+gB2HOtkLGrz\nOb3GOKlJmIbD7EyCmbbDSF18izqgNm" +
       "aYpjfGNYc1xUm0T6N60tlGriSROCnr09UUdJwY93bRyDk2\ntmI7dK/SYJl2" +
       "n5qg3pDSrZqRZGRm7gi544YLoQMMLU9T1m/KqUoNFRrIWLEkXTVSjZ3M1owU" +
       "dC0z\nMzALI1OGZQqdKiw1sVVN0R5GJuX26xAk6FXJjwWHMDIhtxvnBDKbki" +
       "OzgLTWRmvev7HjvVkgcVhz\nkiZ0XH8UBs3IGbSO9lGbGgkqBh7LxHa2bcxM" +
       "ixACnSfkdBZ9ls97aH381R/PFH2mFuizlutiT+L4\n2dOm71/+h8oSXEaFZT" +
       "oaqkJo51yqHS6lKWuBdk+UHJEY84g/WffTjVd9m74eIRVtJJow9UzaaCOV\n" +
       "1Ei2uHg54HHNoKJ1bV+fQ1kbKdV5U9Tkz3AcfZpO8TjKALdU1s/xrEUIKYeP" +
       "Ap9mIv4qETBS0UUd\n9pmYs4WReQxQp9GxE41Wxk5maGPCTFvAsHEIJeP2yy" +
       "LLMYOKAruZlmtZOqjhKlNPUrsnce+RX1yx\n8sIvbhdyQt1yF8PIeME/lqIG" +
       "tVU9xnkTReFMx6H6ieNZbtvqEJpF9ur90+94Sv0aHDZs2tEup3xP\nymApQh" +
       "i0uKjXaPFtrg0wFVSiJzH+qlen3Pnct56MkJKCniMuG1tNO63qKHzPVMa60+" +
       "VSQGcacjW3\n0Nxv3bj6gReePjTf12FGGvJMK38kmsac3EO3zQRNguvx2d/2" +
       "t1Vv31J2zoMRUgr2Bh6HqaAnYL4z\ncucImUiT525wLyVxUt2Xt/EqBgc0GN" +
       "gwwhoEdUIxQBbjcxbIPdWxa6OfOvDD6if5jj2nVhvwfp2U\nCROp9+XfZVMK" +
       "7Ydu77hl15s3bCoBo7QsIXNGolamV9cSWRhyatiqcHlJVJs39jXV7VjkfJ+L" +
       "uFJL\npzNM7dUpeGFV181Bmuxh3A3VB1we9zRwEjW94LHA+fXowEjs1VIGQD" +
       "0L+ITYpPE7b12w+wB6DYsf\nzES0Lr5SkuUNDQrC+XlEfJ6OGjze3zbY+Vax" +
       "gZoFnZe2b94+h+88yG6h+5CVDH1bOLOoLbRidAGd\nYSa4GV9lNt908KLVl1" +
       "zcKBzfGUVZrAFbTnI+/vhdbcayRye8YERQS6LOFmnvcRJxGCPz4x5LV/Pw\n" +
       "UWCd7Z2C5Dn/hSfegD+xdsW7V+97ZlcNTNxNyjWnVTNUHaXtrBHWWyAw5LC4" +
       "/NH1dx37FTvMddM3\nF1z+tGy+l9ugBix5yQsD9dHv7klHSHk3qePBXTXYBl" +
       "XPoOZ2Q3h2WtzGODklRA+HWhFXmqQ7mJZr\nqoFpcw21NHDapdgb8Qphm7xP" +
       "7T/E3wf4QcXBBxEAxrYIJ2/PuoB7Y0aTVlZRLBy2hA+eweFsoX8R\nBlPjET" +
       "NSbtnagIo5EqmzVmiOOUDtIUiMBjQ3FxnHyFQpSjtjMC1NMYdzlY/7C4XbxT" +
       "JQ24YcqUsF\niaGCMBGfn3ph6T6DTTvCRVXuJmaYHfmOBCKmDifJQ64NFleM" +
       "q1S7noQbFhXhoBL9mp7ElS0GHnOL\n6qMYfnN5570Xp3beHXFtutrizuw036" +
       "r9dTkN6420mdT6NO6NwM6P184748E3dtSJeOB7HLCFEzPw\n2yc3k6uevuy9" +
       "GZyNkkAeLa5DWijdw+lFTqSlmaa0vANBj3BakVGBQefqtz11T8c7271jWGGh" +
       "f15Q\nZHCb0WuDTvcXkEKUqXaKMpE2FF94c0Ee4BHGas4KakHKRA2mD4nIAO" +
       "JVYTAj4wJqs0p1+lerVlNg\n2cV0p80YBBWhJ171vCJM4qZpCQ5b27/R/Vj7" +
       "sbhQgF4zOSSUz19MMT6dsL9CQjuryJjVgENCDtaf\nzhhagl9kBI97z7r24K" +
       "3XNP4VouYmUkF1moazg9OasSl0M4Dw2GVDvrdSdACfVJ0WPLs8D5RzGO5m\n" +
       "IPnzeMWQVyyfV6T1E0uXvj/nHB5QMWmFA5haZIBa+eSdp5196DpIeNpIFSbF" +
       "azLoGuJkDHpTFW8x\nPLC7TrIC8+Q1vtOsEjehNX6SSkh0Fvg1f07IDKkK16" +
       "pqgcSQwsgpsDl/NZz9JljvVPZvnj0js4uR\n3VmjSzVDY5+V09WyEaoHpDrB" +
       "R84OmSQkq88iwg+hDy4HzlYQPwOH45GrfDKCfkk4ExHOq5eFFEH2\n6A72qD" +
       "TMJG3RTcOn/5qN3FnDFSKnxT2ZSgYpYw5fREwEPKZt+xCEgz6BkdKEaQ1J0i" +
       "42sgAGOhV4\nkgJIS0a7EeGmMjTs5AgGJGE+C0Qo1RFpCp6vF53WAO7K3n90" +
       "D4ynC5LVeSzg6HNZuav2uI3PaZF7\n+bxktzEo0gEN7rqB8L8CDBNHN2c0vD" +
       "CCfxmW5q51TC8+8uQNO8hpmhD5AoLrQAN0qg7QFkjwJX0H\nHJDM4cQyVtq2" +
       "aa9SjST4itQGbDJhBZMLNct9bfcYKnWI3IjgJkiH+IRysr2MTM+ZzH2TJKcZ" +
       "F26Q\nE3xJTgBZ1pQcJnjIkkNd4Mk9nHG828pkCsSxFjIxW0v6i3oRka8iuA" +
       "VOSPaU9PtZ4F6DcveEXB1S\nlio+sgVzIzn0NURuR3CHxxozGklfxsikEGvu" +
       "h5shwnFjCDx5LtWfBG6mks/f/S0g2Flobwhu9Tfl\nrwzBnZKwp+CSUKX8JY" +
       "knKZqvn4x1vBYm7JaEIVDF0AI7zYydoK0QtIQdBx4/kiXuDQqxjAtA0pYE\n" +
       "FbrPRtU1kjFX+TrgqODIAk+uFEsg3/dYRLpY4FWaZNGZ6KfJjI6mP0bi7vBy" +
       "GI7cpEUcReQhBA8L\n6gWmKi1ceThIrVYZo2mLhXrs9nsg+NEo4T9C0IcjLA" +
       "hKrBbk2WXiRRSyDS2Qbnwn6Ael4ng3VvAV\nHuqpjfvGUjLgTvpZBPsZvnvn" +
       "VDQcqVlkEO7Aco403PxjqwGAL8N/Lt8yuHfbvkmsQeQAAh6UX5SE\nU2FJMu" +
       "Dh+AJ9xiDyEidA+MUJvctyXTDDxZSVEaWZE9dj1ozIRmCwymMVnYXIpQguQ9" +
       "Dj55+IiFwL\ngZ/e1SLi528F8z4EfmI3kowPwdZCiR4CP7UZSV6FwE9tphdP" +
       "bP37E09u/EcvucGLlGQ2uXiCGbrR\n8fQm1CL97NuSYTkif0ZwNEzg0ngLwZ" +
       "/CJ7DI3yhzXzKc5Dw1fJ67EPGTyw+VdSLyOQRXIvCTvvMQ\nuRrBNWHCRkRE" +
       "mobg+kL5GwKZZ5EdiIg8K0QIJmAIZOIkAtmXEXwlRFAiiJzksL0MkbsQ7EFw" +
       "UnIG\nzvkeBN88aXMMn5cgch+C+z/s5HvDc+z10w1EHkDwPQQP+kkEIn4o+U" +
       "Gh1ADBI4WyAgT/JSHx40sY\nSTKA4Bk//iMiwjeC5wrFdQTP+9EckUKhefiY" +
       "jchLBQhjwoTDXpiu98N0GyQkKUxElGb8kPDXV+4r\nxbLy3z32+MTNz5aQSC" +
       "up0k012aryL/VIJeu3qdNv6smstex8/uauZrACYB18IsBsgoxXnCGEOLWX\n" +
       "6oEXnG2koh9maYFbWpyU6CqPuGdnLaIs3gZJ+NqOxfn5w/kfn/xh2CB1TjCx" +
       "yH3RIV4me1fgceEG\nN7WYmNQcNd2rpTIqo/57FTnBcbg15QrPS1bXw6PDM4" +
       "xQi5dhKO3SMPDLESWOYHWIQD6NiAyyAcLx\n4UZcgsho9B2NvqPR9+NJ+D+J" +
       "voFL8goz06tT75KsLIGgZ/Ggd8Zo0CsY9PCUViFo2zaioDEaf8ho\n/BmNP6" +
       "OEj4LwPx5/ACiLMdZkOcC2dlF9F6qP4uVMc92aP4JQ1Px5BXtwqZs+XG0zr8" +
       "u+4ZJ3aq5X\nn7hUVHCMDVc2rjQy6bP2HKQLzq9JFKirrWSmtUinA1R874Fl" +
       "gSV83hKYdlHRKqbVvADCr2sr6Vy2\n4PSF1X+MkNJhqmPr3cZ1lGVsI1DzAb" +
       "3Vf7lsdmbOoeSup35g6kUl/drPIrzeTZTI5VW4hwc1hQvj\nquzwQrkIp/IF" +
       "1MIR4bV7Lnwmu7dr/h+J9QjG8t6oE8rTQrY59Zx++WVusWGHraU1pg2475Fv" +
       "nnH3\nKw8cWTdeiE+U6s/Nq5YPjhHl+nwB1bwUaHaxGXjvJz45+74r1x3udc" +
       "uwlN9AWqQZrHApqrd0fIYE\na5yfYK3MJqiFX8hwJgf8b/WU31ucl3KYkdIB" +
       "U0vyROGVgKbzhkPZwi3Kb+Wx4+d0TIzcYz+z0LHn\nmxkP6HMZiTr8txrFN5" +
       "b/cwJeWC7ksa+k4Z3IIxMbeK10aa/qyNKl0O8w8n9mEfr1BF9nldwVKs/M\n" +
       "E+zq5YICwARR+UtW4Umd8u4wOz9PeBnYv06NFC/zVw4hOOoXBEdE9wJi5fUx" +
       "WDno0UTtsWbG5M9a\ngJhfWowTPC/Wx+ca3hpGWvocIfg1iCzXCaf3oiI2W1" +
       "S2uIQjfDWvu1+mcUUsrI5H89TxaK464i8k\nZmNS6gquaWTqOMxOI77EXg7Y" +
       "Q7EDOQVkalOLqrxm7mXF15SFhZnlN4NalPFfVGAB6qRcX+H+RCcx\nZ//m+Y" +
       "9b9T8Xeu/9jKYca+Myuh4sKA7gUcumfRo/hXIOayy+6imMjAn/poORchfDVU" +
       "Ymi37Tedk+\n9sOnGajjkWhW+SfGcb9A+zUAAA==");
}

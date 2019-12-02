package com.example.topcoder.graph;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 12/2/2019
 */
public class CableDonationTest {

    private CableDonation cableDonation;

    @BeforeMethod
    public void setup() {
        this.cableDonation = new CableDonation();
    }

    @Test
    public void testCable0() {
        //setup
        String[] lengths = new String[] {
                "abc",
                "def",
                "ghi"
        };

        //test
        int cable = this.cableDonation.cable(lengths);

        //verify
        assertEquals(cable, 40);
    }

    @Test
    public void testCable1() {
        //setup
        String[] lengths = new String[] {
                "a0",
                "0b"
        };

        //test
        int cable = this.cableDonation.cable(lengths);

        //verify
        assertEquals(cable, -1);
    }

    @Test
    public void testCable2() {
        //setup
        String[] lengths = new String[] {
                "0X00",
                "00Y0",
                "0000",
                "00Z0"
        };

        //test
        int cable = this.cableDonation.cable(lengths);

        //verify
        assertEquals(cable, 0);
    }

    @Test
    public void testCable3() {
        //setup
        String[] lengths = new String[] {
                "Az",
                "aZ"
        };

        //test
        int cable = this.cableDonation.cable(lengths);

        //verify
        assertEquals(cable, 105);
    }

    @Test
    public void testCable4() {
        //setup
        String[] lengths = new String[] {
                "0top",
                "c0od",
                "er0o",
                "pen0"
        };

        //test
        int cable = this.cableDonation.cable(lengths);

        //verify
        assertEquals(cable, 134);
    }

    @Test
    public void testCable5() {
        //setup
        String[] lengths = new String[] {
                "b"
        };

        //test
        int cable = this.cableDonation.cable(lengths);

        //verify
        assertEquals(cable, 2);
    }

    @Test
    public void testCable6() {
        //setup
        String[] lengths = new String[] {
                "AXwX0MCP", "ZPCjOt0H", "0qw0tGAH", "0plLGaoB", "TiDsX00f", "sA00xggN", "VgKnx0Mb", "GfyqBiRF"
        };

        //test
        int cable = this.cableDonation.cable(lengths);

        //verify
        assertEquals(cable, 1381);
    }

    @Test
    public void testCable7() {
        //setup
        String[] lengths = new String[] {
                "DjldYdPBWBNqAnkIYUNNAOhbt", "QqbXAazzFuDiHtQzuwLhhPXrm", "nlcLneAJDyBICudltBBxHGyfs", "cifdOAonZmkesAmTReshxRMRc", "DHybOeNsjBivYxoTTJJFHiSCd", "SMQiWxtkGwHyoqBVmkuZnufpE", "AtuiaKiqEMrFoNMUZHUNGiJTm", "bhyYkbYbCtMCjaEHNuUzYMzAg", "mypJDcxNaczbNQKXqUrwQpKrd", "VNnSzhCdSmPfnQUtjHUhcmGHD", "lyfbMfPvsoLflbjyUQqpStNwx", "SawbDhTxvyiXwiaOMmcvNeYSn", "NAGOTFyXsUugerZZSzDZRXLDS", "OthoOlIwBBUwgvbJdnginUXRr", "NLCQltxEqpGpCXdBbesKEuUZQ", "pHbiukfwxiPSoWdsczhxStBLF", "saEkkgKgaNHcFjzbFzniFuTsZ", "jmrpTbtWkOgjetzojMAKmHWuK", "oQoGPodHlJWYddKMllABmjkYT", "xemBZGNkuefFthMKffAdJiQld", "hzBRQSNIvTxcerVOZxZDdywuP", "jQXqTokrgEXOYkHQWxOlQwPGQ", "KxINQhXcPNKSUkxCnHZnzFLLA", "VkjWXLaUKCkNHiWqrlcbJkHMT", "iVfpSfXGASgnSwSLGDVCTnPcC"
        };

        //test
        int cable = this.cableDonation.cable(lengths);

        //verify
        assertEquals(cable, 16129);
    }

    @Test
    public void testCable8() {
        //setup
        String[] lengths = new String[] {
                "NoFqrFbtpZmkqIknTHkNKslpfhgjiJiiZYUkfjNLqmbeS", "MgxkuYmTKeQOdTgyUayMWNoVCCNmWxczDmidVAybfEOMm", "TMLoEsZ0yVgjvZ0WlhsZrHysQHLjHfxAivLAtmtTXaXqw", "cdydaOENqnTZfYpNyyPVZwCcwvJxqmSTsLRRoWrUSAzBd", "ZuQoSuVfynFjnYnTEQpfRYFb0TBpIpnEQgQENQGfjgjyc", "pdZRTbJQfrQEpNiPevykxbemJxodLwySpIARejPEtsShO", "bwuifSAgnpDYyRlccmjphqcezLSeKDdkUvNPLJQmiGegW", "EWqFMoDksjfgGEiJhrqZidpPEoeIijoHkfKxgpbPWjoXf", "hykYPfyzzwTGFliGywqDAATHCPMHCkCIRzsFrkjFLIXto", "XkFcFzPmcmiTtECmdgBlhleYpSEUBCYCtsdMgcqwrlZRl", "lzYnhOQtXroQiNlCABnsdcnZodKqzHWAvWSvDzkSSQISm", "lZBQTafNDkWYdUThJnNKqbMWcFCvXdaBNcogOfjPskuNX", "YytjikeRnLfzpvnhaZjEVHTCLYAlSpNgPezvSuavwSuFX", "pge0pQQQyFQeKgFeOHRkuBRepXagaRSl0XIiWEILwsngi", "CNYMmKAfydwBymIIovmTpvHqqxEoEAIisbmPXdhufcQfJ", "RnLoWSJEIUzqWfwTRMCfupyIIDHMusTCRqtuKnuBnDxYw", "gPIFDtcjsPOZpdknXZgjmqFAmgwTgASZiHZmPwVJzflAh", "cbPdxqmaHmmJBqHeIyINwuJNQiCxOpXDHADajMDIkZStw", "FhoHbHpzGVadXgjAcwuBxxCO0fRCYlUdrddXMwraCwUdP", "XZrAgSpuYd0RWhqJsmdRApPTBdVMyVKVMmXtFQGevKMfj", "GjevDzREHqoggxNGqmMwxETGtBpWjbTturGzgeJlUjTIU", "Q0VxCujgjuMLQtkGkPEiYvywOPRDDMHoWUyHffkisrKzD", "IgUovJqhDJiydgftQUZZOQDevOgUNDIgSXOHfQmjQuEnh", "rykWFnnEqUWyMdjDiRJxTvfHKsipLiCBCUozHGSPBIgQH", "eUZiafyOXjPRNXdDUPtmUXRVXoGQVWJCyhouoqKVYCySU", "aNTmwDRuqrpHfiVqAzQEsOLMAnOHrjZtziRfTclTzzPnK", "YgINxSULMFOfblUKlvWcxOMLxPVdyelSenwFUyRApGyxT", "Etyu0YVoaNdkvaFeNCiLgAh0AoTpvlYmfFWbsHHcDogkd", "spWoqmzHzSaTYMzPzLkVtcJEWbngGQJwvdZhBpSpJYSzt", "ciXgsoZiGogPdGxgOernGWoBYqUaoNQwAvpvCIkaNjabr", "zZKgaruFsSkRfmEBgRruXPQKFHRlfNusxAEJlPIgZPqxw", "lBmomzJxQJptVTcmXtGYyOqfyvlObXIEpLyCiYdGkRjBc", "lNdnatZhqpGawXOIrlkvuvvsBwaqL0aEVKJzvIYCZPXUt", "rOjtqMHAasAKOKiMYxvcWZCQIzlSEcjiLPqiSQXjujoeI", "ZGJdthobCjCBVEbGSZIebew0VBKuyKhqkBJLlerWnhorN", "MdMLzPvWdDkxAzrqMvRuYbFvWwKvwpPwTn0CXNjwqYMoO", "ojQcMpONCPTQIZCYSScPAoPRCPdmGLYddWzAbDCn0xqPr", "KeyeMYukVqjIhcGHLrzgUSVo0ZFunhjuOVqigaoybiBya", "MOEzdIUABr0SeMuiKMJznwNecugqIKsJSOJNLmPjbpyrV", "hbBjMPvzbbBlOiJMVNWZkOZflkuozFsfnROFscSvARwVT", "lwisCnColgGpNMxCrbOBVbgHuRVDwKzNrFcGHrCkUxzkH", "LoZgBheuFjFEMaxYJgleqVikfPaJIdOqQcWedbwwYxKRy", "zjPFmEpTClPiJQgRimkAYtHbeWrikuMcvAztEKRyQNaWx", "SSmWZtTXFyyiRGDIcyJOnHdtClwTftLJbHcpNxbgmkyEk", "NLRIGyIInfiLNLEysSmTAWVFynbsYQALotORECVREyUAg"
        };

        //test
        int cable = this.cableDonation.cable(lengths);

        //verify
        assertEquals(cable, 52291);
    }

    @Test
    public void testCable9() {
        //setup
        String[] lengths = new String[] {
                "0000000000000000000000000q000000000r00R00000000000", "0F00000000000000000000000000000000000Y000000000000", "0000000000000000000000000z00w00000000x000000000000", "0t000S0000000000z00v0g0000000000A000000S000N000000", "0000000000000000B00000000000000000000000M000000000", "000000000000000000000p0000J000000000000000000000w0", "00000000000V000m00000000000C0000000000000000000000", "00C000000000000000p0a00000000000000000000000000000", "0000V00j0l0M00000000L0000000000000000000s00N00DY00", "0000X000000000000Jm000000000000000i000000000000000", "00000000000000000000000000000000000000000000000000", "000l000000000000000y000000000000000000000000000000", "000000000000000000000000000000000000000000000000l0", "000000000000M0000000000000000D00000000000000000000", "00000000000000000000N000000000d0000000000000000K00", "000o00000000000000000000v0000000000000000000000000", "0000o00000000000000000000000000C00000z000000000000", "X000000000000000000000000g0000U000000h0P0000Q00000", "0000000000000000000y000000000000000000000000000000", "0000000000000000000000000s000000000000cP0000000O00", "00000I0000000000000000000000000000E000f00000w00000", "000000J000000I00000000000000000000000HB00000000000", "0000dNt00000d0000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000v00000000000000000Z00000000000", "00000000000000000w00000000000000000000000000000000", "000000000000000000000000000t00Y00000f0000000000000", "00g0000000000000000W000000b00000000000000000v00000", "0M00000000000000J000F000000000u0000L00000000000000", "0000000000000Bt000000000000000000000000000D0000oI0", "00000000000000F00000w000X00000000000000000t0000000", "000000000000000000000000000000000000000000l0000000", "000000000000000A00000000000000n0000000000000000000", "F000v000000000000000n00000000000000000000000000000", "00000000r0000000000000000000j000000000000g00000000", "000000W000000000P000000000000000000000000000000000", "0000000v000000000W00000000H00000000000000000000a00", "0000000000000R000000000J00000000000D00000000000000", "0000000000000000000w00U0v00d000000R000000000000000", "c000000000000000u000000000000000000000000U00b00000", "000000000Y0000000000000000000000000000000000000000", "00000000000000000000000000b00000000000000000000000", "00000000000000000000000000000000000000000000000000", "0000000g000Z0G00000H0r0000000000000000000000000000", "000g0000n00000000000S000000000s0000T0000000oa00000", "0000000000000000I00B00000000000000000000m000000000", "000000000e00000000000b0000000000000000000000000000", "000000000000t0r00000000000000000000000000000000000", "00000000000000b00000000000000000000000000000000000", "000000000000000000P0000000000000000000000000000000"
        };

        //test
        int cable = this.cableDonation.cable(lengths);

        //verify
        assertEquals(cable, -1);
    }

    @Test
    public void testCable10() {
        //setup
        String[] lengths = new String[] {
                "ZnBxVrSiBAMuYjcvDcjiIcyFabrllscVKldvDaZLVAxpTBTWEI", "bQgbpjylVrtiufvlXxXwzQHQHgzBhdDSmKULHxypaGNSVYwjXU", "KMNinoAxvFqjjKVZKpzzBLfWJieQoN0zMTmHCxYdZWiIAqWqYx", "qtfrENCwDdqiwasCFxJDJqwIt0dvKeezjliYSXh0dF0rANwdpU", "QLDImRAEFUHvTumoQoujnn0ErhnSTzzUA0rGbzofNAUrsaftSx", "GmaJTztDlOTUkWecXgLwAhvAtikLmJBNNqfwDwRPYLOJcTbpQw", "opwsGaoyUVxMqFlecqUiSVnBXNTwAyjHmMTPVRByvcmKfIpYjS", "ZMCHJfsfNjHdojmxpOXuqHwfXONWvEXHiDyWDDOzEpMiEJahtQ", "VStzFFeecSCCnqSJfrmxAJ0BqdQZotbkgKfJXeaqkBlwKOfkIT", "oqmnQzrimhfXZuIVNFmy0mWAXrh0TFmvPLXTYIKFrAjWuvYsQi", "WeJbQyiaaxmZlPfTjVQfmIHeyZzsLolnwucIYmLoTxJZF0FOdr", "CAPYHUpoAlDvALbTCntfDrXclVFwVGcTBHqHIgxQgFbsIdsyW0", "olOWZfJHhiGtTDNGmkxnwQTvkSVvpPHXcKHlvcgvEgHJfYBixE", "POmEiL0rC0gvZzebwvAPPcMaThKiUGPenaXXSeDWEegjtUVhKW", "XQQmSTxXesXW0mvuuodSatPhlRiONTPSDtKbTubTdKmrqyDCUB", "KaUFYTDLncckmCwQEQYLp0bhfohcBqIsIRWKHyxIceYcvssKAQ", "JtugT0hKEQgZcOPaDIgc0vKOqNrR0vFhDtOPgPjwxdlGDbsDXX", "zpRPsttpvzBWJygbtKerrxzLU0fZIggdPQxIK0EeygmuVfAkfr", "jDyBTxaTElysVSsuJXuSvWRknTQyFBzWFFXbzjwwCuIX0tntsb", "VmwDJw0eUojVxgUivMYzaiBKxjPaFdJjHUKgSNKJHhdsxSuOxz", "PqvMarbMJBzyKvEayjySwMdBKSllcjOKWRzcTSHQvMnQZoI0Ly", "YEDjNyWkndrmLkRehmnNjQbbppWsUfbfwfdYuUiLCOFCmgdqPI", "wJXWMtxXaPifPiQAYpFahDFeLakmAfpIwmEygGgrpmpkNfBREm", "gzvTITfqFHGEVnvFJSrUxKHKljIPLVgeqmSTOdfYcaFgyoQAHp", "fFDsMumWXbcADXjFt0iJBxRkTIYmUIpMKJHVqfRTXQbsXxSzCU", "hXPsaRZLpGnTSqzhQlykNIzXPkgCfiFzbPUnJh0mYTdxtUtZNR", "TAoXemQBekDYPzFUGcvQvtfXPPdsupiNlKKNJxnyrJnvBatUHJ", "q0Gg0nNPQnrixNpZOzxSJKkBubgaltGFAbzLRmdsrjsOrRMDeh", "yCzffEMnXJjnEbqDHMeZibLtvAMwXZvcNWJROyytWEqqGDIhnK", "BsrPzWcsVNwdSIEhAVnTimBxafWNSssRGuIYNyEeaK0VhnGXyV", "ixMqULSiXmeXrKsXAvpcMaciptYAznDiKNDZeIhNXJYwCEcATN", "MpWwaPDVPHzjdirbRTvQQEgNWQNwvTciUXBaUgcNEzXAmWkUgN", "dbvtGydqXqa0wHGpgHgoTuEB0UhHjUKcMJGDkeudRAGdIvARlC", "DBwVMQfjOmMMs00JQcmkARbxnDaByccYVuzeEysUwYHchvKKfl", "EJghUXngQccemkwgFRpbOVjhOIXxdOvKmeuyuzViKWYZVPVZVC", "zeudTZezMKQuhQLXSQnOboi0AzDhvgrkqGtJ0NChhnrWLUWxdD", "JTkPYNVfmsYNjOHIsrkRNllWkiQLNEgLZOmQkHnSfwSnDPWtJg", "B0RRTMKrdDZXKfNV0ESABUpOJQeFaPsEeqAWhuSDmJWrpXJceJ", "TTcXUzYyoCTASC0bDXWZ0tlpMVRxANqqdssTVDCfXahZruSgrH", "bsSyNrTDtEsSrLtFOGDIoPWxqqWDZDmeKPVMnzTbgdDjNSZorm", "OR0AJFBIWlQpEEKGLWZvDbI0VMkHuWVHuRaRMLnARjxmeALDLn", "hmvTvRRHDzyLCDZQNZjeYoRJcaMBVvpSmphTMDCLMAIbfsOSAW", "VeUWEqnNURWrswBYFuEWVitSjWvMlhkFVEKBIIlpUuIqTkYnHq", "dsxufcECGazskYKOJmsJfZbBRZtQEmlGkZYiVYBPBTUDHTJcBG", "UaqSBmpBAlHvUoQNGZvSjhQ0wlHxoMoOWxDvfYRbxHk0YDkYqk", "QyeSbEtLhemSukSXoxbacVzU0MUnKCvsoQEwWctrCRVKlzMtTW", "AGZIgZsQtySmiWpfRYoLPDONwiiPpOrBUzNhUTbUATqWEApCDr", "rNxoMGNXHWorFxaTvrtRUsIdFbeunQDXYKsNUxYVCODXWGjSVS", "LWwrOevUpAuBzkSgjYjmeECQnfMUDykOLnOkTjOwONWqahfpto", "OJhAFHtbphuUcxFlz0PFSHpttPunobnZVXekSxjRRLlOMYRnho"
        };

        //test
        int cable = this.cableDonation.cable(lengths);

        //verify
        assertEquals(cable, 66350);
    }
}
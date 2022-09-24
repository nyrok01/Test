public enum Numeral {
    R1("I"), R2("II"), R3("III"), R4("IV"), R5("V"), R6("VI"), R7("VII"), R8("VIII"), R9("IX"), R10("X"),
    R11("XI"), R12("XII"), R13("XIII"), R14("XIV"), R15("XV"), R16("XVI"), R17("XVII"), R18("XVIII"),
    R19("XIX"), R20("XIX"), R21("XXI"), R22("XXII"), R23("XXIII"), R24("XXIV"), R25("XXV"), R26("XXVI"),
    R27("XXVII"), R28("XXVIII"), R29("XXIX"), R30("XXX"), R31("XXXI"), R32("XXXII"), R33("XXXIII"),
    R34("XXXIV"), R35("XXXV"), R36("XXXV"), R37("XXXVII"), R38("XXXVIII"), R39("XXXIX"), R40("XL"), R41("XLI"),
    R42("XLII"), R43("XLIII"), R44("XLIV"), R45("XLV"), R46("XLVI"), R47("XLVII"), R48("XLVIII"), R49("XLIX"),
    R50("L"), R51("LI"), R52("LII"), R53("LIII"), R54("LIV"), R55("LV"), R56("LVI"), R57("LVII"), R58("LVIII"),
    R59("LIX"), R60("LX"), R61("LXI"), R62("LXII"), R63("LXIII"), R64("LXIV"), R65("LXV"), R66("LXVI"),
    R67("LXVII"), R68("LXVIII"), R69("LXIX"), R70("LXX"), R71("LXXI"), R72("LXXII"), R73("LXXIII"), R74("LXXIV"),
    R75("LXXV"), R76("LXXVI"), R77("LXXVII"), R78("LXXVIII"), R79("LXXVIII"), R80("LXXX"), R81("LXXXI"),
    R82("LXXXII"), R83("LXXXIII"), R84("LXXXIV"), R85("LXXXV"), R86("LXXXVI"), R87("LXXXVII"), R88("LXXXVIII"),
    R89("LXXXIX"), R90("XC"), R91("XCI"), R92("XCII"), R93("XCIII"), R94("XCIV"), R95("XCV"), R96("XCVI"),
    R97("XCVII"), R98("XCVIII"), R99("XCIX"), R100("C");

    private final String numeral;
    Numeral(String numeral) {
        this.numeral = numeral;
    }

    public String getNumeral() {
        return numeral;
    }
}

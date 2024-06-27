// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "HOME-VCS": git@git.HAW-Hamburg.de:SHF/Px/LabExercise/CXZ_Thingy[.git]
package _untouchable_.thingy;


import _untouchable_.thingy.internalProjectSupport.Version;


/**
 * Der enum Color beschreibt die Farbe eines Items.
 *<br />
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public enum Color {
    
    AERO, ALABASTER, AMBER, APRICOT, AQUA, AVOCADO, AZURE,
    BEIGE, BISQUE, BLACK, BLUE, BRONZE, BROWN, BURGUNDY,
    CAMEL, CANARY, CORAL, CYAN,
    DRAB,
    EBONY,
    FLAX, FUCHSIA,
    GOLD, GRAY, GREEN,
    HONEYDEW,
    IVORY,
    JONQUIL,
    KOBE, KOBI,
    LEMON, LINEN,
    MAGENTA, MANDARIN, MANGO, MELON, MINT,
    NICKEL,
    OLIVE, ONYX, ORANGE,
    PINK, PURPLE,
    RED, ROSE, RUST,
    SAND, SILVER,
    TAN, TEAL, TOMATO, TURQUOISE, TUSCAN,
    UMBER,
    VIOLET,
    WHEAT, WHITE,
    XANTHIC,
    YELLOW,
    ZAFFRE, ZOMP;
    
    
    
    // Das Folgende dient nur der Versionierung:
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_003___2022_05_25__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    //
    //Note: Enums are automatically serializable and shall NOT contain serialVersionUID
}//enum

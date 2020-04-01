package dev.rjp.rpg.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    
    public static BufferedImage playButton;
    public static BufferedImage playButtonBright;
    public static BufferedImage playButtonDark;
    
    public static BufferedImage helpButton;
    public static BufferedImage helpButtonBright;
    public static BufferedImage helpButtonDark;
    
    public static BufferedImage quitButton;
    public static BufferedImage quitButtonBright;
    public static BufferedImage quitButtonDark;

    public static BufferedImage JPLogo;
    public static BufferedImage RJLogo;
    public static BufferedImage menu;
    
    public static BufferedImage[] intoTheXLoad;
    
    public static BufferedImage title;
    
    public static BufferedImage[] defaultPlayerHeadDown;
    public static BufferedImage[] defaultPlayerArmDown;
    public static BufferedImage[] defaultPlayerBodyDown;
    public static BufferedImage[] defaultPlayerLegDown;
    
    
    public static void init(){
        
        intoTheXLoad = new BufferedImage[128];
        
        defaultPlayerHeadDown = new BufferedImage[9];
        defaultPlayerArmDown = new BufferedImage[9];
        defaultPlayerBodyDown = new BufferedImage[9];
        defaultPlayerLegDown = new BufferedImage[9];
        
        playButton = Loader.loadImage("/textures/Play_Button.png");
        playButtonBright = Loader.loadImage("/textures/Play_Button_Bright.png");
        playButtonDark = Loader.loadImage("/textures/Play_Button_Dark.png");
              
        quitButton = Loader.loadImage("/textures/Quit_Button.png");
        quitButtonBright = Loader.loadImage("/textures/Quit_Button_Bright.png");
        quitButtonDark = Loader.loadImage("/textures/Quit_Button_Dark.png");
              
        helpButton = Loader.loadImage("/textures/Help_Button.png");
        helpButtonBright = Loader.loadImage("/textures/Help_Button_Bright.png");
        helpButtonDark = Loader.loadImage("/textures/Help_Button_Dark.png");
        
        menu = Loader.loadImage("/textures/Dark_Dungeon.png");
        
        JPLogo = Loader.loadImage("/textures/Logos/IntoTheX.png");
        RJLogo = Loader.loadImage("/textures/loading/RJLogoNew.png");
        
        title = Loader.loadImage("/textures/Title.png");
        
        defaultPlayerHeadDown[0] = Loader.loadImage("/textures/animations/down_head_anim1.png");
        defaultPlayerHeadDown[1] = Loader.loadImage("/textures/animations/down_head_anim2.png");
        defaultPlayerHeadDown[2] = Loader.loadImage("/textures/animations/down_head_anim3.png");
        defaultPlayerHeadDown[3] = Loader.loadImage("/textures/animations/down_head_anim4.png");
        defaultPlayerHeadDown[4] = Loader.loadImage("/textures/animations/down_head_anim5.png");
        defaultPlayerHeadDown[5] = Loader.loadImage("/textures/animations/down_head_anim6.png");
        defaultPlayerHeadDown[6] = Loader.loadImage("/textures/animations/down_head_anim7.png");
        defaultPlayerHeadDown[7] = Loader.loadImage("/textures/animations/down_head_anim8.png");
        defaultPlayerHeadDown[8] = Loader.loadImage("/textures/animations/down_head_anim9.png");
        
        defaultPlayerArmDown[0] = Loader.loadImage("/textures/animations/arm1.png");
        defaultPlayerArmDown[1] = Loader.loadImage("/textures/animations/arm2.png");
        defaultPlayerArmDown[2] = Loader.loadImage("/textures/animations/arm3.png");
        defaultPlayerArmDown[3] = Loader.loadImage("/textures/animations/arm4.png");
        defaultPlayerArmDown[4] = Loader.loadImage("/textures/animations/arm5.png");
        defaultPlayerArmDown[5] = Loader.loadImage("/textures/animations/arm6.png");
        defaultPlayerArmDown[6] = Loader.loadImage("/textures/animations/arm7.png");
        defaultPlayerArmDown[7] = Loader.loadImage("/textures/animations/arm8.png");
        defaultPlayerArmDown[8] = Loader.loadImage("/textures/animations/arm9.png");
        
        defaultPlayerBodyDown[0] = Loader.loadImage("/textures/animations/no_Armor_Anim1.png");
        defaultPlayerBodyDown[1] = Loader.loadImage("/textures/animations/no_Armor_Anim2.png");
        defaultPlayerBodyDown[2] = Loader.loadImage("/textures/animations/no_Armor_Anim3.png");
        defaultPlayerBodyDown[3] = Loader.loadImage("/textures/animations/no_Armor_Anim4.png");
        defaultPlayerBodyDown[4] = Loader.loadImage("/textures/animations/no_Armor_Anim5.png");
        defaultPlayerBodyDown[5] = Loader.loadImage("/textures/animations/no_Armor_Anim6.png");
        defaultPlayerBodyDown[6] = Loader.loadImage("/textures/animations/no_Armor_Anim7.png");
        defaultPlayerBodyDown[7] = Loader.loadImage("/textures/animations/no_Armor_Anim8.png");
        defaultPlayerBodyDown[8] = Loader.loadImage("/textures/animations/no_Armor_Anim9.png");
        
        defaultPlayerLegDown[0] = Loader.loadImage("/textures/animations/leg1.png");
        defaultPlayerLegDown[1] = Loader.loadImage("/textures/animations/leg2.png");
        defaultPlayerLegDown[2] = Loader.loadImage("/textures/animations/leg3.png");
        defaultPlayerLegDown[3] = Loader.loadImage("/textures/animations/leg4.png");
        defaultPlayerLegDown[4] = Loader.loadImage("/textures/animations/leg5.png");
        defaultPlayerLegDown[5] = Loader.loadImage("/textures/animations/leg6.png");
        defaultPlayerLegDown[6] = Loader.loadImage("/textures/animations/leg7.png");
        defaultPlayerLegDown[7] = Loader.loadImage("/textures/animations/leg8.png");
        defaultPlayerLegDown[8] = Loader.loadImage("/textures/animations/leg9.png");
        
        //Loading Screen Images
        
        intoTheXLoad[0] = Loader.loadImage("/textures/loading/LoadPic1.png");
        intoTheXLoad[1] = Loader.loadImage("/textures/loading/LoadPic2.png");
        intoTheXLoad[2] = Loader.loadImage("/textures/loading/LoadPic3.png");
        intoTheXLoad[3] = Loader.loadImage("/textures/loading/LoadPic4.png");
        intoTheXLoad[4] = Loader.loadImage("/textures/loading/LoadPic5.png");
        intoTheXLoad[5] = Loader.loadImage("/textures/loading/LoadPic6.png");
        intoTheXLoad[6] = Loader.loadImage("/textures/loading/LoadPic7.png");
        intoTheXLoad[7] = Loader.loadImage("/textures/loading/LoadPic8.png");
        intoTheXLoad[8] = Loader.loadImage("/textures/loading/LoadPic9.png");
        intoTheXLoad[9] = Loader.loadImage("/textures/loading/LoadPic10.png");
        intoTheXLoad[10] = Loader.loadImage("/textures/loading/LoadPic11.png");
        intoTheXLoad[11] = Loader.loadImage("/textures/loading/LoadPic12.png");
        intoTheXLoad[12] = Loader.loadImage("/textures/loading/LoadPic13.png");
        intoTheXLoad[13] = Loader.loadImage("/textures/loading/LoadPic14.png");
        intoTheXLoad[14] = Loader.loadImage("/textures/loading/LoadPic15.png");
        intoTheXLoad[15] = Loader.loadImage("/textures/loading/LoadPic16.png");
        intoTheXLoad[16] = Loader.loadImage("/textures/loading/LoadPic17.png");
        intoTheXLoad[17] = Loader.loadImage("/textures/loading/LoadPic18.png");
        intoTheXLoad[18] = Loader.loadImage("/textures/loading/LoadPic19.png");
        intoTheXLoad[19] = Loader.loadImage("/textures/loading/LoadPic20.png");
        intoTheXLoad[20] = JPLogo;
        intoTheXLoad[21] = JPLogo;
        intoTheXLoad[22] = JPLogo;
        intoTheXLoad[23] = JPLogo;
        intoTheXLoad[24] = JPLogo;
        intoTheXLoad[25] = JPLogo;
        intoTheXLoad[26] = JPLogo;
        intoTheXLoad[27] = JPLogo;
        intoTheXLoad[28] = JPLogo;
        intoTheXLoad[29] = JPLogo;
        intoTheXLoad[30] = JPLogo;
        intoTheXLoad[31] = JPLogo;
        intoTheXLoad[32] = JPLogo;
        intoTheXLoad[33] = JPLogo;
        intoTheXLoad[34] = JPLogo;
        intoTheXLoad[35] = JPLogo;
        intoTheXLoad[36] = JPLogo;
        intoTheXLoad[37] = JPLogo;
        intoTheXLoad[38] = JPLogo;
        intoTheXLoad[39] = JPLogo;
        intoTheXLoad[40] = JPLogo;
        intoTheXLoad[41] = JPLogo;
        intoTheXLoad[42] = JPLogo;
        intoTheXLoad[43] = JPLogo;
        intoTheXLoad[44] = Loader.loadImage("/textures/loading/LoadPic20.png");
        intoTheXLoad[45] = Loader.loadImage("/textures/loading/LoadPic19.png");
        intoTheXLoad[46] = Loader.loadImage("/textures/loading/LoadPic18.png");
        intoTheXLoad[47] = Loader.loadImage("/textures/loading/LoadPic17.png");
        intoTheXLoad[48] = Loader.loadImage("/textures/loading/LoadPic16.png");
        intoTheXLoad[49] = Loader.loadImage("/textures/loading/LoadPic15.png");
        intoTheXLoad[50] = Loader.loadImage("/textures/loading/LoadPic14.png");
        intoTheXLoad[51] = Loader.loadImage("/textures/loading/LoadPic13.png");
        intoTheXLoad[52] = Loader.loadImage("/textures/loading/LoadPic12.png");
        intoTheXLoad[53] = Loader.loadImage("/textures/loading/LoadPic11.png");
        intoTheXLoad[54] = Loader.loadImage("/textures/loading/LoadPic10.png");
        intoTheXLoad[55] = Loader.loadImage("/textures/loading/LoadPic9.png");
        intoTheXLoad[56] = Loader.loadImage("/textures/loading/LoadPic8.png");
        intoTheXLoad[57] = Loader.loadImage("/textures/loading/LoadPic7.png");
        intoTheXLoad[58] = Loader.loadImage("/textures/loading/LoadPic6.png");
        intoTheXLoad[59] = Loader.loadImage("/textures/loading/LoadPic5.png");
        intoTheXLoad[60] = Loader.loadImage("/textures/loading/LoadPic4.png");
        intoTheXLoad[61] = Loader.loadImage("/textures/loading/LoadPic3.png");
        intoTheXLoad[62] = Loader.loadImage("/textures/loading/LoadPic2.png");
        intoTheXLoad[63] = Loader.loadImage("/textures/loading/LoadPic1.png");
        
        intoTheXLoad[64] = Loader.loadImage("/textures/loading/RJPic1.png");
        intoTheXLoad[65] = Loader.loadImage("/textures/loading/RJPic2.png");
        intoTheXLoad[66] = Loader.loadImage("/textures/loading/RJPic3.png");
        intoTheXLoad[67] = Loader.loadImage("/textures/loading/RJPic4.png");
        intoTheXLoad[68] = Loader.loadImage("/textures/loading/RJPic5.png");
        intoTheXLoad[69] = Loader.loadImage("/textures/loading/RJPic6.png");
        intoTheXLoad[70] = Loader.loadImage("/textures/loading/RJPic7.png");
        intoTheXLoad[71] = Loader.loadImage("/textures/loading/RJPic8.png");
        intoTheXLoad[72] = Loader.loadImage("/textures/loading/RJPic9.png");
        intoTheXLoad[73] = Loader.loadImage("/textures/loading/RJPic10.png");
        intoTheXLoad[74] = Loader.loadImage("/textures/loading/RJPic11.png");
        intoTheXLoad[75] = Loader.loadImage("/textures/loading/RJPic12.png");
        intoTheXLoad[76] = Loader.loadImage("/textures/loading/RJPic13.png");
        intoTheXLoad[77] = Loader.loadImage("/textures/loading/RJPic14.png");
        intoTheXLoad[78] = Loader.loadImage("/textures/loading/RJPic15.png");
        intoTheXLoad[79] = Loader.loadImage("/textures/loading/RJPic16.png");
        intoTheXLoad[80] = Loader.loadImage("/textures/loading/RJPic17.png");
        intoTheXLoad[81] = Loader.loadImage("/textures/loading/RJPic18.png");
        intoTheXLoad[82] = Loader.loadImage("/textures/loading/RJPic19.png");
        intoTheXLoad[83] = Loader.loadImage("/textures/loading/RJPic20.png");
        intoTheXLoad[84] = RJLogo;
        intoTheXLoad[85] = RJLogo;
        intoTheXLoad[86] = RJLogo;
        intoTheXLoad[87] = RJLogo;
        intoTheXLoad[88] = RJLogo;
        intoTheXLoad[89] = RJLogo;
        intoTheXLoad[90] = RJLogo;
        intoTheXLoad[91] = RJLogo;
        intoTheXLoad[92] = RJLogo;
        intoTheXLoad[93] = RJLogo;
        intoTheXLoad[94] = RJLogo;
        intoTheXLoad[95] = RJLogo;
        intoTheXLoad[96] = RJLogo;
        intoTheXLoad[97] = RJLogo;
        intoTheXLoad[98] = RJLogo;
        intoTheXLoad[99] = RJLogo;
        intoTheXLoad[100] = RJLogo;
        intoTheXLoad[101] = RJLogo;
        intoTheXLoad[102] = RJLogo;
        intoTheXLoad[103] = RJLogo;
        intoTheXLoad[104] = RJLogo;
        intoTheXLoad[105] = RJLogo;
        intoTheXLoad[106] = RJLogo;
        intoTheXLoad[107] = RJLogo;
        intoTheXLoad[108] = Loader.loadImage("/textures/loading/RJPic20.png");
        intoTheXLoad[109] = Loader.loadImage("/textures/loading/RJPic19.png");
        intoTheXLoad[110] = Loader.loadImage("/textures/loading/RJPic18.png");
        intoTheXLoad[111] = Loader.loadImage("/textures/loading/RJPic17.png");
        intoTheXLoad[112] = Loader.loadImage("/textures/loading/RJPic16.png");
        intoTheXLoad[113] = Loader.loadImage("/textures/loading/RJPic15.png");
        intoTheXLoad[114] = Loader.loadImage("/textures/loading/RJPic14.png");
        intoTheXLoad[115] = Loader.loadImage("/textures/loading/RJPic13.png");
        intoTheXLoad[116] = Loader.loadImage("/textures/loading/RJPic12.png");
        intoTheXLoad[117] = Loader.loadImage("/textures/loading/RJPic11.png");
        intoTheXLoad[118] = Loader.loadImage("/textures/loading/RJPic10.png");
        intoTheXLoad[119] = Loader.loadImage("/textures/loading/RJPic9.png");
        intoTheXLoad[120] = Loader.loadImage("/textures/loading/RJPic8.png");
        intoTheXLoad[121] = Loader.loadImage("/textures/loading/RJPic7.png");
        
        intoTheXLoad[122] = Loader.loadImage("/textures/loading/RJPic6.png");
        intoTheXLoad[123] = Loader.loadImage("/textures/loading/RJPic5.png");
        intoTheXLoad[124] = Loader.loadImage("/textures/loading/RJPic4.png");
        intoTheXLoad[125] = Loader.loadImage("/textures/loading/RJPic3.png");
        intoTheXLoad[126] = Loader.loadImage("/textures/loading/RJPic2.png");
        intoTheXLoad[127] = Loader.loadImage("/textures/loading/RJPic1.png");

    }
    
}
